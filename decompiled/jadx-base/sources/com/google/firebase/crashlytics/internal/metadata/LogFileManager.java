package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: loaded from: classes5.dex */
public class LogFileManager {
    private static final java.lang.String LOGFILE_NAME = "userlog";
    static final int MAX_LOG_SIZE = 65536;
    private static final com.google.firebase.crashlytics.internal.metadata.LogFileManager.NoopLogStore NOOP_LOG_STORE = new com.google.firebase.crashlytics.internal.metadata.LogFileManager.NoopLogStore();
    private com.google.firebase.crashlytics.internal.metadata.FileLogStore currentLog;
    private final com.google.firebase.crashlytics.internal.persistence.FileStore fileStore;

    public LogFileManager(com.google.firebase.crashlytics.internal.persistence.FileStore fileStore) {
        this.fileStore = fileStore;
        this.currentLog = NOOP_LOG_STORE;
    }

    public LogFileManager(com.google.firebase.crashlytics.internal.persistence.FileStore fileStore, java.lang.String str) {
        this(fileStore);
        setCurrentSession(str);
    }

    public final void setCurrentSession(java.lang.String str) {
        this.currentLog.closeLogFile();
        this.currentLog = NOOP_LOG_STORE;
        if (str == null) {
            return;
        }
        setLogFile(getWorkingFileForSession(str), 65536);
    }

    public void writeToLog(long j, java.lang.String str) {
        this.currentLog.writeToLog(j, str);
    }

    public byte[] getBytesForLog() {
        return this.currentLog.getLogAsBytes();
    }

    public java.lang.String getLogString() {
        return this.currentLog.getLogAsString();
    }

    public void clearLog() {
        this.currentLog.deleteLogFile();
    }

    void setLogFile(java.io.File file, int i) {
        this.currentLog = new com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore(file, i);
    }

    private java.io.File getWorkingFileForSession(java.lang.String str) {
        return this.fileStore.getSessionFile(str, LOGFILE_NAME);
    }

    private static final class NoopLogStore implements com.google.firebase.crashlytics.internal.metadata.FileLogStore {
        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public void closeLogFile() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public void deleteLogFile() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public byte[] getLogAsBytes() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public java.lang.String getLogAsString() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public void writeToLog(long j, java.lang.String str) {
        }

        private NoopLogStore() {
        }
    }
}
