package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
abstract class V0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.UnityPlayer f3899a;

    private V0(com.unity3d.player.UnityPlayer unityPlayer) {
        this.f3899a = unityPlayer;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3899a.isFinishing()) {
            return;
        }
        a();
    }
}
