package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class B0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.UnityPlayer f3859a;

    B0(com.unity3d.player.UnityPlayer unityPlayer) {
        this.f3859a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.UnityPlayer unityPlayer;
        android.app.Activity activity;
        if (!this.f3859a.nativeIsAutorotationOn() || (activity = (unityPlayer = this.f3859a).mActivity) == null) {
            return;
        }
        activity.setRequestedOrientation(unityPlayer.mInitialScreenOrientation);
    }
}
