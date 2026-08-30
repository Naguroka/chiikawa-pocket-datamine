package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class G0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3866a;
    final /* synthetic */ com.unity3d.player.UnityPlayer b;

    G0(com.unity3d.player.UnityPlayer unityPlayer, int i) {
        this.b = unityPlayer;
        this.f3866a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.unity3d.player.UnityPlayer unityPlayer = this.b;
            com.unity3d.player.AbstractC1703c.a(unityPlayer.mActivity, unityPlayer, this.f3866a);
        } catch (java.lang.Exception e) {
            com.unity3d.player.AbstractC1749z.Log(6, "Exception when opening Activity Indicator " + e);
        }
    }
}
