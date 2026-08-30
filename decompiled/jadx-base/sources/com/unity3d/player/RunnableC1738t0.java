package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class RunnableC1738t0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f3949a;
    final /* synthetic */ com.unity3d.player.UnityPlayer b;

    RunnableC1738t0(com.unity3d.player.UnityPlayer unityPlayer, boolean z) {
        this.b = unityPlayer;
        this.f3949a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.S s = this.b.mSoftInput;
        if (s != null) {
            s.a(this.f3949a);
        }
    }
}
