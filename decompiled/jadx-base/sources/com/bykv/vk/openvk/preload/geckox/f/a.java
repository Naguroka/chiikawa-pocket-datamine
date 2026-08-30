package com.bykv.vk.openvk.preload.geckox.f;

/* JADX INFO: compiled from: ChannelUpdateLock.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map<java.lang.String, java.util.concurrent.locks.Lock> f1735a = new java.util.HashMap();
    private com.bykv.vk.openvk.preload.geckox.utils.FileLock b;
    private java.lang.String c;

    private a(java.lang.String str, com.bykv.vk.openvk.preload.geckox.utils.FileLock fileLock) {
        this.c = str;
        this.b = fileLock;
    }

    public static com.bykv.vk.openvk.preload.geckox.f.a a(java.lang.String str) throws java.lang.Exception {
        java.util.Map<java.lang.String, java.util.concurrent.locks.Lock> map = f1735a;
        synchronized (map) {
            java.util.concurrent.locks.Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new java.util.concurrent.locks.ReentrantLock();
                map.put(str, reentrantLock);
            }
            if (!reentrantLock.tryLock()) {
                return null;
            }
            try {
                com.bykv.vk.openvk.preload.geckox.utils.FileLock fileLockC = com.bykv.vk.openvk.preload.geckox.utils.FileLock.c(str);
                if (fileLockC == null) {
                    reentrantLock.unlock();
                    return null;
                }
                return new com.bykv.vk.openvk.preload.geckox.f.a(str, fileLockC);
            } catch (java.lang.Exception e) {
                reentrantLock.lock();
                com.bykv.vk.openvk.preload.geckox.utils.a.a(new java.lang.RuntimeException(e));
                return null;
            }
        }
    }

    public final void a() {
        java.util.Map<java.lang.String, java.util.concurrent.locks.Lock> map = f1735a;
        synchronized (map) {
            try {
                this.b.a();
                this.b.b();
                map.get(this.c).unlock();
            } catch (java.lang.Throwable th) {
                f1735a.get(this.c).unlock();
                throw th;
            }
        }
    }
}
