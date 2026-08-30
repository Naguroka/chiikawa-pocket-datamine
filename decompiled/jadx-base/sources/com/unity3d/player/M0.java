package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class M0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.UnityPlayer f3879a;

    M0(com.unity3d.player.UnityPlayer unityPlayer) {
        this.f3879a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.UnityPlayer unityPlayer = this.f3879a;
        if (unityPlayer.mMainDisplayOverride) {
            unityPlayer.removeView(unityPlayer.mGlView);
        } else if (unityPlayer.mGlView.getParent() != null) {
            com.unity3d.player.AbstractC1749z.Log(5, "Couldn't add view, because it's already assigned to another parent");
        } else {
            com.unity3d.player.UnityPlayer unityPlayer2 = this.f3879a;
            unityPlayer2.addView(unityPlayer2.mGlView);
        }
    }
}
