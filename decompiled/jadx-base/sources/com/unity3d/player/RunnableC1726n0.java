package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class RunnableC1726n0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.UnityPlayer f3938a;

    RunnableC1726n0(com.unity3d.player.UnityPlayer unityPlayer) {
        this.f3938a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.C1716i0 c1716i0 = this.f3938a.mGlView;
        if (c1716i0 != null) {
            c1716i0.b();
        }
    }
}
