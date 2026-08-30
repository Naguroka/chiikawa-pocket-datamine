package com.google.firebase.crashlytics.internal.persistence;

/* JADX INFO: loaded from: classes5.dex */
public class CrashlyticsReportPersistence {
    private static final java.lang.String EVENT_COUNTER_FORMAT = "%010d";
    private static final int EVENT_COUNTER_WIDTH = 10;
    private static final java.lang.String EVENT_FILE_NAME_PREFIX = "event";
    private static final int MAX_OPEN_SESSIONS = 8;
    private static final java.lang.String NORMAL_EVENT_SUFFIX = "";
    private static final java.lang.String PRIORITY_EVENT_SUFFIX = "_";
    private static final java.lang.String REPORT_FILE_NAME = "report";
    private static final java.lang.String SESSION_START_TIMESTAMP_FILE_NAME = "start-time";
    private final java.util.concurrent.atomic.AtomicInteger eventCounter = new java.util.concurrent.atomic.AtomicInteger(0);
    private final com.google.firebase.crashlytics.internal.persistence.FileStore fileStore;
    private final com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider;
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING);
    private static final int EVENT_NAME_LENGTH = 15;
    private static final com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform TRANSFORM = new com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform();
    private static final java.util.Comparator<? super java.io.File> LATEST_SESSION_ID_FIRST_COMPARATOR = new java.util.Comparator() { // from class: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda2
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return ((java.io.File) obj2).getName().compareTo(((java.io.File) obj).getName());
        }
    };
    private static final java.io.FilenameFilter EVENT_FILE_FILTER = new java.io.FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda3
        @Override // java.io.FilenameFilter
        public final boolean accept(java.io.File file, java.lang.String str) {
            return str.startsWith("event");
        }
    };

    private static long convertTimestampFromSecondsToMs(long j) {
        return j * 1000;
    }

    public CrashlyticsReportPersistence(com.google.firebase.crashlytics.internal.persistence.FileStore fileStore, com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider, com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        this.fileStore = fileStore;
        this.settingsProvider = settingsProvider;
        this.sessionsSubscriber = crashlyticsAppQualitySessionsSubscriber;
    }

    public void persistReport(com.google.firebase.crashlytics.internal.model.CrashlyticsReport crashlyticsReport) {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session session = crashlyticsReport.getSession();
        if (session == null) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("Could not get session for report");
            return;
        }
        java.lang.String identifier = session.getIdentifier();
        try {
            writeTextFile(this.fileStore.getSessionFile(identifier, REPORT_FILE_NAME), TRANSFORM.reportToJson(crashlyticsReport));
            writeTextFile(this.fileStore.getSessionFile(identifier, SESSION_START_TIMESTAMP_FILE_NAME), "", session.getStartedAt());
        } catch (java.io.IOException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("Could not persist report for session " + identifier, e);
        }
    }

    public void persistEvent(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event event, java.lang.String str) {
        persistEvent(event, str, false);
    }

    public void persistEvent(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event event, java.lang.String str, boolean z) {
        int i = this.settingsProvider.getSettingsSync().sessionData.maxCustomExceptionEvents;
        try {
            writeTextFile(this.fileStore.getSessionFile(str, generateEventFilename(this.eventCounter.getAndIncrement(), z)), TRANSFORM.eventToJson(event));
        } catch (java.io.IOException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Could not persist event for session " + str, e);
        }
        trimEvents(str, i);
    }

    public java.util.SortedSet<java.lang.String> getOpenSessionIds() {
        return new java.util.TreeSet(this.fileStore.getAllOpenSessionIds()).descendingSet();
    }

    public long getStartTimestampMillis(java.lang.String str) {
        return this.fileStore.getSessionFile(str, SESSION_START_TIMESTAMP_FILE_NAME).lastModified();
    }

    public boolean hasFinalizedReports() {
        return (this.fileStore.getReports().isEmpty() && this.fileStore.getPriorityReports().isEmpty() && this.fileStore.getNativeReports().isEmpty()) ? false : true;
    }

    public void deleteAllReports() {
        deleteFiles(this.fileStore.getReports());
        deleteFiles(this.fileStore.getPriorityReports());
        deleteFiles(this.fileStore.getNativeReports());
    }

    private void deleteFiles(java.util.List<java.io.File> list) {
        java.util.Iterator<java.io.File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    public void finalizeReports(java.lang.String str, long j) {
        for (java.lang.String str2 : capAndGetOpenSessions(str)) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("Finalizing report for session " + str2);
            synthesizeReport(str2, j);
            this.fileStore.deleteSessionFiles(str2);
        }
        capFinalizedReports();
    }

    public void finalizeSessionWithNativeEvent(java.lang.String str, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload filesPayload, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        java.io.File sessionFile = this.fileStore.getSessionFile(str, REPORT_FILE_NAME);
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Writing native session report for " + str + " to file: " + sessionFile);
        synthesizeNativeReportFile(sessionFile, filesPayload, str, applicationExitInfo);
    }

    public java.util.List<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> loadFinalizedReports() {
        java.util.List<java.io.File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.io.File file : allFinalizedReportFiles) {
            try {
                arrayList.add(com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId.create(TRANSFORM.reportFromJson(readTextFile(file)), file.getName(), file));
            } catch (java.io.IOException e) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().w("Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        return arrayList;
    }

    private java.util.SortedSet<java.lang.String> capAndGetOpenSessions(java.lang.String str) {
        this.fileStore.cleanupPreviousFileSystems();
        java.util.SortedSet<java.lang.String> openSessionIds = getOpenSessionIds();
        if (str != null) {
            openSessionIds.remove(str);
        }
        if (openSessionIds.size() <= 8) {
            return openSessionIds;
        }
        while (openSessionIds.size() > 8) {
            java.lang.String strLast = openSessionIds.last();
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("Removing session over cap: " + strLast);
            this.fileStore.deleteSessionFiles(strLast);
            openSessionIds.remove(strLast);
        }
        return openSessionIds;
    }

    private void capFinalizedReports() {
        int i = this.settingsProvider.getSettingsSync().sessionData.maxCompleteSessionsCount;
        java.util.List<java.io.File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        int size = allFinalizedReportFiles.size();
        if (size <= i) {
            return;
        }
        java.util.Iterator<java.io.File> it = allFinalizedReportFiles.subList(i, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private java.util.List<java.io.File> getAllFinalizedReportFiles() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.fileStore.getPriorityReports());
        arrayList.addAll(this.fileStore.getNativeReports());
        java.util.Comparator<? super java.io.File> comparator = LATEST_SESSION_ID_FIRST_COMPARATOR;
        java.util.Collections.sort(arrayList, comparator);
        java.util.List<java.io.File> reports = this.fileStore.getReports();
        java.util.Collections.sort(reports, comparator);
        arrayList.addAll(reports);
        return arrayList;
    }

    private void synthesizeReport(java.lang.String str, long j) {
        boolean z;
        java.util.List<java.io.File> sessionFiles = this.fileStore.getSessionFiles(str, EVENT_FILE_FILTER);
        if (sessionFiles.isEmpty()) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("Session " + str + " has no events.");
            return;
        }
        java.util.Collections.sort(sessionFiles);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.io.File> it = sessionFiles.iterator();
        loop0: while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                java.io.File next = it.next();
                try {
                    arrayList.add(TRANSFORM.eventFromJson(readTextFile(next)));
                    if (z || isHighPriorityEventFile(next.getName())) {
                        z = true;
                    }
                } catch (java.io.IOException e) {
                    com.google.firebase.crashlytics.internal.Logger.getLogger().w("Could not add event to report for " + next, e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Could not parse event files for session " + str);
            return;
        }
        synthesizeReportFile(this.fileStore.getSessionFile(str, REPORT_FILE_NAME), arrayList, j, z, com.google.firebase.crashlytics.internal.metadata.UserMetadata.readUserId(str, this.fileStore), this.sessionsSubscriber.getAppQualitySessionId(str));
    }

    private void synthesizeNativeReportFile(java.io.File file, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload filesPayload, java.lang.String str, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        java.lang.String appQualitySessionId = this.sessionsSubscriber.getAppQualitySessionId(str);
        try {
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = TRANSFORM;
            writeTextFile(this.fileStore.getNativeReport(str), crashlyticsReportJsonTransform.reportToJson(crashlyticsReportJsonTransform.reportFromJson(readTextFile(file)).withNdkPayload(filesPayload).withApplicationExitInfo(applicationExitInfo).withAppQualitySessionId(appQualitySessionId)));
        } catch (java.io.IOException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Could not synthesize final native report file for " + file, e);
        }
    }

    private void synthesizeReportFile(java.io.File file, java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> list, long j, boolean z, java.lang.String str, java.lang.String str2) {
        java.io.File report;
        try {
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = TRANSFORM;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport crashlyticsReportWithEvents = crashlyticsReportJsonTransform.reportFromJson(readTextFile(file)).withSessionEndFields(j, z, str).withAppQualitySessionId(str2).withEvents(list);
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session session = crashlyticsReportWithEvents.getSession();
            if (session == null) {
                return;
            }
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("appQualitySessionId: " + str2);
            if (z) {
                report = this.fileStore.getPriorityReport(session.getIdentifier());
            } else {
                report = this.fileStore.getReport(session.getIdentifier());
            }
            writeTextFile(report, crashlyticsReportJsonTransform.reportToJson(crashlyticsReportWithEvents));
        } catch (java.io.IOException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Could not synthesize final report file for " + file, e);
        }
    }

    private static boolean isHighPriorityEventFile(java.lang.String str) {
        return str.startsWith("event") && str.endsWith(PRIORITY_EVENT_SUFFIX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNormalPriorityEventFile(java.io.File file, java.lang.String str) {
        return str.startsWith("event") && !str.endsWith(PRIORITY_EVENT_SUFFIX);
    }

    private static java.lang.String generateEventFilename(int i, boolean z) {
        return "event" + java.lang.String.format(java.util.Locale.US, EVENT_COUNTER_FORMAT, java.lang.Integer.valueOf(i)) + (z ? PRIORITY_EVENT_SUFFIX : "");
    }

    private int trimEvents(java.lang.String str, int i) {
        java.util.List<java.io.File> sessionFiles = this.fileStore.getSessionFiles(str, new java.io.FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda0
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str2) {
                return com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.isNormalPriorityEventFile(file, str2);
            }
        });
        java.util.Collections.sort(sessionFiles, new java.util.Comparator() { // from class: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.oldestEventFileFirst((java.io.File) obj, (java.io.File) obj2);
            }
        });
        return capFilesCount(sessionFiles, i);
    }

    private static java.lang.String getEventNameWithoutPriority(java.lang.String str) {
        return str.substring(0, EVENT_NAME_LENGTH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int oldestEventFileFirst(java.io.File file, java.io.File file2) {
        return getEventNameWithoutPriority(file.getName()).compareTo(getEventNameWithoutPriority(file2.getName()));
    }

    private static void writeTextFile(java.io.File file, java.lang.String str) throws java.io.IOException {
        java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), UTF_8);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (java.lang.Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void writeTextFile(java.io.File file, java.lang.String str, long j) throws java.io.IOException {
        java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), UTF_8);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(convertTimestampFromSecondsToMs(j));
            outputStreamWriter.close();
        } catch (java.lang.Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static java.lang.String readTextFile(java.io.File file) throws java.io.IOException {
        byte[] bArr = new byte[8192];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i > 0) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    java.lang.String str = new java.lang.String(byteArrayOutputStream.toByteArray(), UTF_8);
                    fileInputStream.close();
                    return str;
                }
            } catch (java.lang.Throwable th) {
                try {
                    fileInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private static int capFilesCount(java.util.List<java.io.File> list, int i) {
        int size = list.size();
        for (java.io.File file : list) {
            if (size <= i) {
                return size;
            }
            com.google.firebase.crashlytics.internal.persistence.FileStore.recursiveDelete(file);
            size--;
        }
        return size;
    }
}
