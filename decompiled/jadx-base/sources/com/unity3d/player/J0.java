package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class J0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.UnityPlayer f3873a;

    J0(com.unity3d.player.UnityPlayer unityPlayer) {
        this.f3873a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.UnityPlayer unityPlayer = this.f3873a;
        unityPlayer.removeView(unityPlayer.m_SplashScreen);
        this.f3873a.m_SplashScreen = null;
    }
}
