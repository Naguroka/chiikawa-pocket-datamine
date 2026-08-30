package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class L0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3877a;
    final /* synthetic */ android.view.Surface b;
    final /* synthetic */ java.util.concurrent.Semaphore c;
    final /* synthetic */ com.unity3d.player.UnityPlayer d;

    L0(com.unity3d.player.UnityPlayer unityPlayer, int i, android.view.Surface surface, java.util.concurrent.Semaphore semaphore) {
        this.d = unityPlayer;
        this.f3877a = i;
        this.b = surface;
        this.c = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.nativeRecreateGfxState(this.f3877a, this.b);
        this.c.release();
    }
}
