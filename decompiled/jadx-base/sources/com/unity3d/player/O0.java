package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class O0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.util.concurrent.Semaphore f3884a;
    final /* synthetic */ com.unity3d.player.UnityPlayer b;

    O0(com.unity3d.player.UnityPlayer unityPlayer, java.util.concurrent.Semaphore semaphore) {
        this.b = unityPlayer;
        this.f3884a = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.shutdown();
        this.f3884a.release();
    }
}
