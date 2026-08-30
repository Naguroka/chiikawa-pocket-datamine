package com.bykv.vk.openvk.preload.geckox.utils;

/* JADX INFO: loaded from: classes3.dex */
public class FileLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map<java.lang.String, java.lang.Integer> f1752a = new java.util.HashMap();
    private final int b;
    private final java.lang.String c;

    private static native int nGetFD(java.lang.String str) throws java.lang.Exception;

    private static native void nLockFile(int i) throws java.lang.Exception;

    private static native void nLockFileSegment(int i, int i2) throws java.lang.Exception;

    private static native void nRelease(int i) throws java.lang.Exception;

    private static native boolean nTryLock(int i) throws java.lang.Exception;

    private static native void nUnlockFile(int i) throws java.lang.Exception;

    static {
        java.lang.System.loadLibrary("file_lock");
    }

    private FileLock(java.lang.String str, int i) {
        this.c = str;
        this.b = i;
    }

    public static com.bykv.vk.openvk.preload.geckox.utils.FileLock a(java.lang.String str) {
        try {
            int iD = d(str);
            nLockFile(iD);
            return new com.bykv.vk.openvk.preload.geckox.utils.FileLock(str, iD);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("lock failed, file:" + str + ", pid:" + android.os.Process.myPid() + " caused by:" + e.getMessage());
        }
    }

    public static com.bykv.vk.openvk.preload.geckox.utils.FileLock b(java.lang.String str) {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new com.bykv.vk.openvk.preload.geckox.utils.FileLock(str, iD);
            }
            return null;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("try lock failed, file:" + str + " caused by:" + e.getMessage());
        }
    }

    public static com.bykv.vk.openvk.preload.geckox.utils.FileLock c(java.lang.String str) throws java.lang.Exception {
        try {
            int iD = d(str);
            if (!nTryLock(iD)) {
                new com.bykv.vk.openvk.preload.geckox.utils.FileLock(str, iD).b();
                return null;
            }
            return new com.bykv.vk.openvk.preload.geckox.utils.FileLock(str, iD);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("try lock failed, file:" + str + " caused by:" + e.getMessage());
        }
    }

    public static com.bykv.vk.openvk.preload.geckox.utils.FileLock a(java.lang.String str, int i) {
        try {
            int iD = d(str);
            nLockFileSegment(iD, i);
            return new com.bykv.vk.openvk.preload.geckox.utils.FileLock(str, iD);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("lock segment failed, file:" + str + " caused by:" + e.getMessage());
        }
    }

    private static int d(java.lang.String str) throws java.lang.Exception {
        java.lang.Integer numValueOf;
        java.util.Map<java.lang.String, java.lang.Integer> map = f1752a;
        synchronized (map) {
            numValueOf = map.get(str);
            if (numValueOf == null) {
                new java.io.File(str).getParentFile().mkdirs();
                numValueOf = java.lang.Integer.valueOf(nGetFD(str));
                map.put(str, numValueOf);
            }
        }
        return numValueOf.intValue();
    }

    public final void a() {
        try {
            nUnlockFile(this.b);
        } catch (java.lang.Exception unused) {
            throw new java.lang.RuntimeException("release lock failed，path:" + this.c);
        }
    }

    public final void b() {
        java.lang.Integer numRemove;
        java.util.Map<java.lang.String, java.lang.Integer> map = f1752a;
        synchronized (map) {
            numRemove = map.remove(this.c);
        }
        try {
            nRelease(numRemove.intValue());
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("release lock failed, file:" + this.c + " caused by:" + e.getMessage());
        }
    }
}
