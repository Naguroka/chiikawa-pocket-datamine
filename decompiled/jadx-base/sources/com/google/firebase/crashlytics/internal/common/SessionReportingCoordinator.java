package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public class SessionReportingCoordinator {
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    private static final int EVENT_THREAD_IMPORTANCE = 4;
    private static final java.lang.String EVENT_TYPE_CRASH = "crash";
    private static final java.lang.String EVENT_TYPE_LOGGED = "error";
    private static final int MAX_CHAINED_EXCEPTION_DEPTH = 8;
    private final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers;
    private final com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture dataCapture;
    private final com.google.firebase.crashlytics.internal.common.IdManager idManager;
    private final com.google.firebase.crashlytics.internal.metadata.LogFileManager logFileManager;
    private final com.google.firebase.crashlytics.internal.metadata.UserMetadata reportMetadata;
    private final com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence reportPersistence;
    private final com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender reportsSender;

    public static com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator create(android.content.Context context, com.google.firebase.crashlytics.internal.common.IdManager idManager, com.google.firebase.crashlytics.internal.persistence.FileStore fileStore, com.google.firebase.crashlytics.internal.common.AppData appData, com.google.firebase.crashlytics.internal.metadata.LogFileManager logFileManager, com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata, com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy stackTraceTrimmingStrategy, com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider, com.google.firebase.crashlytics.internal.common.OnDemandCounter onDemandCounter, com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers) {
        return new com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator(new com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture(context, idManager, appData, stackTraceTrimmingStrategy, settingsProvider), new com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence(fileStore, settingsProvider, crashlyticsAppQualitySessionsSubscriber), com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender.create(context, settingsProvider, onDemandCounter), logFileManager, userMetadata, idManager, crashlyticsWorkers);
    }

    SessionReportingCoordinator(com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture crashlyticsReportDataCapture, com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence crashlyticsReportPersistence, com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, com.google.firebase.crashlytics.internal.metadata.LogFileManager logFileManager, com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata, com.google.firebase.crashlytics.internal.common.IdManager idManager, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers) {
        this.dataCapture = crashlyticsReportDataCapture;
        this.reportPersistence = crashlyticsReportPersistence;
        this.reportsSender = dataTransportCrashlyticsReportSender;
        this.logFileManager = logFileManager;
        this.reportMetadata = userMetadata;
        this.idManager = idManager;
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    public void onBeginSession(java.lang.String str, long j) {
        this.reportPersistence.persistReport(this.dataCapture.captureReportData(str, j));
    }

    public void persistFatalEvent(java.lang.Throwable th, java.lang.Thread thread, java.lang.String str, long j) {
        com.google.firebase.crashlytics.internal.Logger.getLogger().v("Persisting fatal event for session " + str);
        persistEvent(th, thread, "crash", new com.google.firebase.crashlytics.internal.metadata.EventMetadata(str, j), true);
    }

    public void persistNonFatalEvent(java.lang.Throwable th, java.lang.Thread thread, com.google.firebase.crashlytics.internal.metadata.EventMetadata eventMetadata) {
        com.google.firebase.crashlytics.internal.Logger.getLogger().v("Persisting non-fatal event for session " + eventMetadata.getSessionId());
        persistEvent(th, thread, "error", eventMetadata, false);
    }

    public void persistRelevantAppExitInfoEvent(java.lang.String str, java.util.List<android.app.ApplicationExitInfo> list, com.google.firebase.crashlytics.internal.metadata.LogFileManager logFileManager, com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata) {
        android.app.ApplicationExitInfo applicationExitInfoFindRelevantApplicationExitInfo = findRelevantApplicationExitInfo(str, list);
        if (applicationExitInfoFindRelevantApplicationExitInfo == null) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event eventCaptureAnrEventData = this.dataCapture.captureAnrEventData(convertApplicationExitInfo(applicationExitInfoFindRelevantApplicationExitInfo));
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Persisting anr for session " + str);
        this.reportPersistence.persistEvent(addRolloutsStateToEvent(addLogsAndCustomKeysToEvent(eventCaptureAnrEventData, logFileManager, userMetadata), userMetadata), str, true);
    }

    public void finalizeSessionWithNativeEvent(java.lang.String str, java.util.List<com.google.firebase.crashlytics.internal.common.NativeSessionFile> list, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.google.firebase.crashlytics.internal.common.NativeSessionFile> it = list.iterator();
        while (it.hasNext()) {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File fileAsFilePayload = it.next().asFilePayload();
            if (fileAsFilePayload != null) {
                arrayList.add(fileAsFilePayload);
            }
        }
        this.reportPersistence.finalizeSessionWithNativeEvent(str, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.builder().setFiles(java.util.Collections.unmodifiableList(arrayList)).build(), applicationExitInfo);
    }

    public void finalizeSessions(long j, java.lang.String str) {
        this.reportPersistence.finalizeReports(str, j);
    }

    public java.util.SortedSet<java.lang.String> listSortedOpenSessionIds() {
        return this.reportPersistence.getOpenSessionIds();
    }

    public boolean hasReportsToSend() {
        return this.reportPersistence.hasFinalizedReports();
    }

    public void removeAllReports() {
        this.reportPersistence.deleteAllReports();
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> sendReports(java.util.concurrent.Executor executor) {
        return sendReports(executor, null);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> sendReports(java.util.concurrent.Executor executor, java.lang.String str) {
        java.util.List<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> listLoadFinalizedReports = this.reportPersistence.loadFinalizedReports();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId crashlyticsReportWithSessionId : listLoadFinalizedReports) {
            if (str == null || str.equals(crashlyticsReportWithSessionId.getSessionId())) {
                arrayList.add(this.reportsSender.enqueueReport(ensureHasFid(crashlyticsReportWithSessionId), str != null).continueWith(executor, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator$$ExternalSyntheticLambda1
                    @Override // com.google.android.gms.tasks.Continuation
                    public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                        return java.lang.Boolean.valueOf(this.f$0.onReportSendComplete(task));
                    }
                }));
            }
        }
        return com.google.android.gms.tasks.Tasks.whenAll(arrayList);
    }

    private com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId ensureHasFid(com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        if (crashlyticsReportWithSessionId.getReport().getFirebaseInstallationId() != null && crashlyticsReportWithSessionId.getReport().getFirebaseAuthenticationToken() != null) {
            return crashlyticsReportWithSessionId;
        }
        com.google.firebase.crashlytics.internal.common.FirebaseInstallationId firebaseInstallationIdFetchTrueFid = this.idManager.fetchTrueFid(true);
        return com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId.create(crashlyticsReportWithSessionId.getReport().withFirebaseInstallationId(firebaseInstallationIdFetchTrueFid.getFid()).withFirebaseAuthenticationToken(firebaseInstallationIdFetchTrueFid.getAuthToken()), crashlyticsReportWithSessionId.getSessionId(), crashlyticsReportWithSessionId.getReportFile());
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event addMetaDataToEvent(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event event, java.util.Map<java.lang.String, java.lang.String> map) {
        return addRolloutsStateToEvent(addLogsCustomKeysAndEventKeysToEvent(event, this.logFileManager, this.reportMetadata, map), this.reportMetadata);
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event addLogsCustomKeysAndEventKeysToEvent(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event event, com.google.firebase.crashlytics.internal.metadata.LogFileManager logFileManager, com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata, java.util.Map<java.lang.String, java.lang.String> map) {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder builder = event.toBuilder();
        java.lang.String logString = logFileManager.getLogString();
        if (logString != null) {
            builder.setLog(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.builder().setContent(logString).build());
        } else {
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("No log data to include with this event.");
        }
        java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> sortedCustomAttributes = getSortedCustomAttributes(userMetadata.getCustomKeys(map));
        java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> sortedCustomAttributes2 = getSortedCustomAttributes(userMetadata.getInternalKeys());
        if (!sortedCustomAttributes.isEmpty() || !sortedCustomAttributes2.isEmpty()) {
            builder.setApp(event.getApp().toBuilder().setCustomAttributes(sortedCustomAttributes).setInternalKeys(sortedCustomAttributes2).build());
        }
        return builder.build();
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event addLogsAndCustomKeysToEvent(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event event, com.google.firebase.crashlytics.internal.metadata.LogFileManager logFileManager, com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata) {
        return addLogsCustomKeysAndEventKeysToEvent(event, logFileManager, userMetadata, java.util.Collections.emptyMap());
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event addRolloutsStateToEvent(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event event, com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata) {
        java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> rolloutsState = userMetadata.getRolloutsState();
        if (rolloutsState.isEmpty()) {
            return event;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder builder = event.toBuilder();
        builder.setRollouts(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.builder().setRolloutAssignments(rolloutsState).build());
        return builder.build();
    }

    private void persistEvent(java.lang.Throwable th, java.lang.Thread thread, java.lang.String str, final com.google.firebase.crashlytics.internal.metadata.EventMetadata eventMetadata, boolean z) {
        final boolean zEquals = str.equals("crash");
        final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event eventAddMetaDataToEvent = addMetaDataToEvent(this.dataCapture.captureEventData(th, thread, str, eventMetadata.getTimestamp(), 4, 8, z), eventMetadata.getAdditionalCustomKeys());
        if (!z) {
            this.crashlyticsWorkers.diskWrite.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m845x631b9fbf(eventAddMetaDataToEvent, eventMetadata, zEquals);
                }
            });
        } else {
            this.reportPersistence.persistEvent(eventAddMetaDataToEvent, eventMetadata.getSessionId(), zEquals);
        }
    }

    /* JADX INFO: renamed from: lambda$persistEvent$0$com-google-firebase-crashlytics-internal-common-SessionReportingCoordinator, reason: not valid java name */
    /* synthetic */ void m845x631b9fbf(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event event, com.google.firebase.crashlytics.internal.metadata.EventMetadata eventMetadata, boolean z) {
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("disk worker: log non-fatal event to persistence");
        this.reportPersistence.persistEvent(event, eventMetadata.getSessionId(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onReportSendComplete(com.google.android.gms.tasks.Task<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> task) {
        if (task.isSuccessful()) {
            com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId result = task.getResult();
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("Crashlytics report successfully enqueued to DataTransport: " + result.getSessionId());
            java.io.File reportFile = result.getReportFile();
            if (reportFile.delete()) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().d("Deleted report file: " + reportFile.getPath());
                return true;
            }
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Crashlytics could not delete report file: " + reportFile.getPath());
            return true;
        }
        com.google.firebase.crashlytics.internal.Logger.getLogger().w("Crashlytics report could not be enqueued to DataTransport", task.getException());
        return false;
    }

    private static java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> getSortedCustomAttributes(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.ensureCapacity(map.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            arrayList.add(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.builder().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
        java.util.Collections.sort(arrayList, new java.util.Comparator() { // from class: com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute) obj).getKey().compareTo(((com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute) obj2).getKey());
            }
        });
        return java.util.Collections.unmodifiableList(arrayList);
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo convertApplicationExitInfo(android.app.ApplicationExitInfo applicationExitInfo) {
        java.lang.String strConvertInputStreamToString = null;
        try {
            java.io.InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strConvertInputStreamToString = convertInputStreamToString(traceInputStream);
            }
        } catch (java.io.IOException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.builder().setImportance(applicationExitInfo.getImportance()).setProcessName(applicationExitInfo.getProcessName()).setReasonCode(applicationExitInfo.getReason()).setTimestamp(applicationExitInfo.getTimestamp()).setPid(applicationExitInfo.getPid()).setPss(applicationExitInfo.getPss()).setRss(applicationExitInfo.getRss()).setTraceFile(strConvertInputStreamToString).build();
    }

    public static java.lang.String convertInputStreamToString(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toString(java.nio.charset.StandardCharsets.UTF_8.name());
            }
        }
    }

    private android.app.ApplicationExitInfo findRelevantApplicationExitInfo(java.lang.String str, java.util.List<android.app.ApplicationExitInfo> list) {
        long startTimestampMillis = this.reportPersistence.getStartTimestampMillis(str);
        for (android.app.ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getTimestamp() < startTimestampMillis) {
                return null;
            }
            if (applicationExitInfo.getReason() == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }
}
