package com.google.firebase.installations;

/* JADX INFO: loaded from: classes5.dex */
class CrossProcessLock {
    private static final java.lang.String TAG = "CrossProcessLock";
    private final java.nio.channels.FileChannel channel;
    private final java.nio.channels.FileLock lock;

    private CrossProcessLock(java.nio.channels.FileChannel fileChannel, java.nio.channels.FileLock fileLock) {
        this.channel = fileChannel;
        this.lock = fileLock;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static com.google.firebase.installations.CrossProcessLock acquire(android.content.Context context, java.lang.String str) {
        java.nio.channels.FileChannel channel;
        java.nio.channels.FileLock fileLockLock;
        try {
            channel = new java.io.RandomAccessFile(new java.io.File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new com.google.firebase.installations.CrossProcessLock(channel, fileLockLock);
                } catch (java.io.IOException e) {
                    e = e;
                    android.util.Log.e(TAG, "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (java.io.IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                    return null;
                } catch (java.lang.Error e2) {
                    e = e2;
                    android.util.Log.e(TAG, "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (java.nio.channels.OverlappingFileLockException e3) {
                    e = e3;
                    android.util.Log.e(TAG, "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (java.io.IOException | java.lang.Error | java.nio.channels.OverlappingFileLockException e4) {
                e = e4;
                fileLockLock = null;
            }
        } catch (java.io.IOException | java.lang.Error | java.nio.channels.OverlappingFileLockException e5) {
            e = e5;
            channel = null;
            fileLockLock = null;
        }
    }

    void releaseAndClose() {
        try {
            this.lock.release();
            this.channel.close();
        } catch (java.io.IOException e) {
            android.util.Log.e(TAG, "encountered error while releasing, ignoring", e);
        }
    }
}
