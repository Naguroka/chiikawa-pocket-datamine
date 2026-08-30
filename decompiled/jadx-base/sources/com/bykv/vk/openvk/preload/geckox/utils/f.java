package com.bykv.vk.openvk.preload.geckox.utils;

/* JADX INFO: compiled from: PiecemealSerialExecutor.java */
/* JADX INFO: loaded from: classes3.dex */
public class f implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile com.bykv.vk.openvk.preload.geckox.utils.f f1757a;

    public static com.bykv.vk.openvk.preload.geckox.utils.f a() {
        if (f1757a == null) {
            synchronized (com.bykv.vk.openvk.preload.geckox.utils.f.class) {
                if (f1757a == null) {
                    f1757a = new com.bykv.vk.openvk.preload.geckox.utils.f();
                }
            }
        }
        return f1757a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.p().execute(runnable);
    }
}
