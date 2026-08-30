package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: loaded from: classes5.dex */
class QueueFileLogStore implements com.google.firebase.crashlytics.internal.metadata.FileLogStore {
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING);
    private com.google.firebase.crashlytics.internal.metadata.QueueFile logFile;
    private final int maxLogSize;
    private final java.io.File workingFile;

    private static class LogBytes {
        public final byte[] bytes;
        public final int offset;

        LogBytes(byte[] bArr, int i) {
            this.bytes = bArr;
            this.offset = i;
        }
    }

    QueueFileLogStore(java.io.File file, int i) {
        this.workingFile = file;
        this.maxLogSize = i;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void writeToLog(long j, java.lang.String str) {
        openLogFile();
        doWriteToLog(j, str);
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public byte[] getLogAsBytes() {
        com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore.LogBytes logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        byte[] bArr = new byte[logBytes.offset];
        java.lang.System.arraycopy(logBytes.bytes, 0, bArr, 0, logBytes.offset);
        return bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public java.lang.String getLogAsString() {
        byte[] logAsBytes = getLogAsBytes();
        if (logAsBytes != null) {
            return new java.lang.String(logAsBytes, UTF_8);
        }
        return null;
    }

    private com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore.LogBytes getLogBytes() {
        if (!this.workingFile.exists()) {
            return null;
        }
        openLogFile();
        com.google.firebase.crashlytics.internal.metadata.QueueFile queueFile = this.logFile;
        if (queueFile == null) {
            return null;
        }
        final int[] iArr = {0};
        final byte[] bArr = new byte[queueFile.usedBytes()];
        try {
            this.logFile.forEach(new com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore.1
                @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                public void read(java.io.InputStream inputStream, int i) throws java.io.IOException {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr2 = iArr;
                        iArr2[0] = iArr2[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (java.io.IOException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore.LogBytes(bArr, iArr[0]);
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void closeLogFile() {
        com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(this.logFile, "There was a problem closing the Crashlytics log file.");
        this.logFile = null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void deleteLogFile() {
        closeLogFile();
        this.workingFile.delete();
    }

    private void openLogFile() {
        if (this.logFile == null) {
            try {
                this.logFile = new com.google.firebase.crashlytics.internal.metadata.QueueFile(this.workingFile);
            } catch (java.io.IOException e) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().e("Could not open log file: " + this.workingFile, e);
            }
        }
    }

    private void doWriteToLog(long j, java.lang.String str) {
        if (this.logFile == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i = this.maxLogSize / 4;
            if (str.length() > i) {
                str = "..." + str.substring(str.length() - i);
            }
            this.logFile.add(java.lang.String.format(java.util.Locale.US, "%d %s%n", java.lang.Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(UTF_8));
            while (!this.logFile.isEmpty() && this.logFile.usedBytes() > this.maxLogSize) {
                this.logFile.remove();
            }
        } catch (java.io.IOException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("There was a problem writing to the Crashlytics log.", e);
        }
    }
}
