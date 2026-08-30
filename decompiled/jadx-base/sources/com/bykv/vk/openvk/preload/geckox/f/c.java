package com.bykv.vk.openvk.preload.geckox.f;

/* JADX INFO: compiled from: UsingLock.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map<java.lang.String, android.util.Pair<com.bykv.vk.openvk.preload.geckox.utils.FileLock, java.util.concurrent.atomic.AtomicLong>> f1737a = new java.util.HashMap();

    public static void a(java.lang.String str) throws java.lang.Exception {
        java.util.Map<java.lang.String, android.util.Pair<com.bykv.vk.openvk.preload.geckox.utils.FileLock, java.util.concurrent.atomic.AtomicLong>> map = f1737a;
        synchronized (map) {
            android.util.Pair<com.bykv.vk.openvk.preload.geckox.utils.FileLock, java.util.concurrent.atomic.AtomicLong> pair = map.get(str);
            if (pair == null) {
                android.util.Pair<com.bykv.vk.openvk.preload.geckox.utils.FileLock, java.util.concurrent.atomic.AtomicLong> pair2 = new android.util.Pair<>(com.bykv.vk.openvk.preload.geckox.utils.FileLock.a(str, android.os.Process.myPid()), new java.util.concurrent.atomic.AtomicLong(0L));
                map.put(str, pair2);
                pair = pair2;
            }
            ((java.util.concurrent.atomic.AtomicLong) pair.second).incrementAndGet();
        }
    }

    public static void b(java.lang.String str) throws java.lang.Exception {
        java.util.Map<java.lang.String, android.util.Pair<com.bykv.vk.openvk.preload.geckox.utils.FileLock, java.util.concurrent.atomic.AtomicLong>> map = f1737a;
        synchronized (map) {
            android.util.Pair<com.bykv.vk.openvk.preload.geckox.utils.FileLock, java.util.concurrent.atomic.AtomicLong> pair = map.get(str);
            if (pair == null) {
                throw new java.lang.RuntimeException("using.lock illegal state");
            }
            long jDecrementAndGet = ((java.util.concurrent.atomic.AtomicLong) pair.second).decrementAndGet();
            if (jDecrementAndGet < 0) {
                throw new java.lang.RuntimeException("using.lock count illegal");
            }
            if (jDecrementAndGet == 0) {
                ((com.bykv.vk.openvk.preload.geckox.utils.FileLock) pair.first).a();
                map.remove(str);
            }
        }
    }

    public static void c(java.lang.String str) throws java.lang.Exception {
        java.util.Map<java.lang.String, android.util.Pair<com.bykv.vk.openvk.preload.geckox.utils.FileLock, java.util.concurrent.atomic.AtomicLong>> map = f1737a;
        synchronized (map) {
            com.bykv.vk.openvk.preload.geckox.utils.FileLock fileLockB = com.bykv.vk.openvk.preload.geckox.utils.FileLock.b(str);
            if (fileLockB == null) {
                return;
            }
            android.util.Pair<com.bykv.vk.openvk.preload.geckox.utils.FileLock, java.util.concurrent.atomic.AtomicLong> pair = map.get(str);
            if (pair != null && ((java.util.concurrent.atomic.AtomicLong) pair.second).get() != 0) {
                fileLockB.a();
                com.bykv.vk.openvk.preload.geckox.utils.FileLock.a(str, android.os.Process.myPid());
                return;
            }
            java.io.File parentFile = new java.io.File(str).getParentFile();
            final java.io.File file = new java.io.File(parentFile.getAbsolutePath() + "--pending-delete");
            if (parentFile.renameTo(file)) {
                fileLockB.a();
                fileLockB.b();
                com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.f.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bykv.vk.openvk.preload.geckox.utils.b.a(file);
                    }
                });
            }
        }
    }
}
