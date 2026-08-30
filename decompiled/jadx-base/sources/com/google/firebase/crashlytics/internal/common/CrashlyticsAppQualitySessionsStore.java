package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
class CrashlyticsAppQualitySessionsStore {
    private static final java.lang.String AQS_SESSION_ID_FILENAME_PREFIX = "aqs.";
    private static final java.io.FilenameFilter AQS_SESSION_ID_FILE_FILTER = new java.io.FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore$$ExternalSyntheticLambda0
        @Override // java.io.FilenameFilter
        public final boolean accept(java.io.File file, java.lang.String str) {
            return str.startsWith(com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore.AQS_SESSION_ID_FILENAME_PREFIX);
        }
    };
    private static final java.util.Comparator<java.io.File> FILE_RECENCY_COMPARATOR = new java.util.Comparator() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return java.lang.Long.compare(((java.io.File) obj2).lastModified(), ((java.io.File) obj).lastModified());
        }
    };
    private final com.google.firebase.crashlytics.internal.persistence.FileStore fileStore;
    private java.lang.String sessionId = null;
    private java.lang.String appQualitySessionId = null;

    CrashlyticsAppQualitySessionsStore(com.google.firebase.crashlytics.internal.persistence.FileStore fileStore) {
        this.fileStore = fileStore;
    }

    public synchronized java.lang.String getAppQualitySessionId(java.lang.String str) {
        if (java.util.Objects.equals(this.sessionId, str)) {
            return this.appQualitySessionId;
        }
        return readAqsSessionIdFile(this.fileStore, str);
    }

    public synchronized void rotateAppQualitySessionId(java.lang.String str) {
        if (!java.util.Objects.equals(this.appQualitySessionId, str)) {
            persist(this.fileStore, this.sessionId, str);
            this.appQualitySessionId = str;
        }
    }

    public synchronized void rotateSessionId(java.lang.String str) {
        if (!java.util.Objects.equals(this.sessionId, str)) {
            persist(this.fileStore, str, this.appQualitySessionId);
            this.sessionId = str;
        }
    }

    private static void persist(com.google.firebase.crashlytics.internal.persistence.FileStore fileStore, java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            fileStore.getSessionFile(str, AQS_SESSION_ID_FILENAME_PREFIX + str2).createNewFile();
        } catch (java.io.IOException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Failed to persist App Quality Sessions session id.", e);
        }
    }

    static java.lang.String readAqsSessionIdFile(com.google.firebase.crashlytics.internal.persistence.FileStore fileStore, java.lang.String str) {
        java.util.List<java.io.File> sessionFiles = fileStore.getSessionFiles(str, AQS_SESSION_ID_FILE_FILTER);
        if (sessionFiles.isEmpty()) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Unable to read App Quality Sessions session id.");
            return null;
        }
        return ((java.io.File) java.util.Collections.min(sessionFiles, FILE_RECENCY_COMPARATOR)).getName().substring(4);
    }
}
