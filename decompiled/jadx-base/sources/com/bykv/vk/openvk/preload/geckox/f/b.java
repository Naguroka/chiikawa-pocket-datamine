package com.bykv.vk.openvk.preload.geckox.f;

/* JADX INFO: compiled from: SelectChannelVersionLock.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map<java.lang.String, java.util.concurrent.locks.Lock> f1736a = new java.util.HashMap();
    private static java.util.concurrent.locks.ReentrantLock b = new java.util.concurrent.locks.ReentrantLock();
    private java.lang.String c;
    private com.bykv.vk.openvk.preload.geckox.utils.FileLock d;

    private b(java.lang.String str, com.bykv.vk.openvk.preload.geckox.utils.FileLock fileLock) {
        this.c = str;
        this.d = fileLock;
    }

    public static com.bykv.vk.openvk.preload.geckox.f.b a(java.lang.String str) throws java.lang.Exception {
        b.lock();
        try {
            com.bykv.vk.openvk.preload.geckox.utils.FileLock fileLockA = com.bykv.vk.openvk.preload.geckox.utils.FileLock.a(str);
            java.util.Map<java.lang.String, java.util.concurrent.locks.Lock> map = f1736a;
            java.util.concurrent.locks.Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new java.util.concurrent.locks.ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new com.bykv.vk.openvk.preload.geckox.f.b(str, fileLockA);
        } catch (java.lang.Exception e) {
            b.unlock();
            throw e;
        }
    }

    public final void a() {
        try {
            this.d.a();
            this.d.b();
            java.util.concurrent.locks.Lock lock = f1736a.get(this.c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            b.unlock();
        }
    }
}
