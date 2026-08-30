package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class P0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.util.concurrent.Semaphore f3887a;
    final /* synthetic */ com.unity3d.player.UnityPlayer b;

    P0(com.unity3d.player.UnityPlayer unityPlayer, java.util.concurrent.Semaphore semaphore) {
        this.b = unityPlayer;
        this.f3887a = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.nativePause()) {
            com.unity3d.player.UnityPlayer unityPlayer = this.b;
            unityPlayer.mQuitting = true;
            unityPlayer.shutdown();
            this.b.queueDestroy();
        }
        this.f3887a.release();
    }
}
