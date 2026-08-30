package com.bykv.vk.openvk.preload.geckox.utils;

/* JADX INFO: compiled from: IOSerialExecutor.java */
/* JADX INFO: loaded from: classes3.dex */
public class c implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile com.bykv.vk.openvk.preload.geckox.utils.c f1755a;

    public static com.bykv.vk.openvk.preload.geckox.utils.c a() {
        if (f1755a == null) {
            synchronized (com.bykv.vk.openvk.preload.geckox.utils.c.class) {
                if (f1755a == null) {
                    f1755a = new com.bykv.vk.openvk.preload.geckox.utils.c();
                }
            }
        }
        return f1755a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.p().execute(runnable);
    }
}
