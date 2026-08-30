package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class H0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.UnityPlayer f3868a;

    H0(com.unity3d.player.UnityPlayer unityPlayer) {
        this.f3868a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        android.view.KeyEvent keyEvent = new android.view.KeyEvent(jUptimeMillis, jUptimeMillis, 0, 4, 1, 0, -1, 0, 0, 257);
        android.view.KeyEvent keyEvent2 = new android.view.KeyEvent(jUptimeMillis, jUptimeMillis + 1, 1, 4, 1, 0, -1, 0, 0, 257);
        this.f3868a.mActivity.dispatchKeyEvent(keyEvent);
        this.f3868a.mActivity.dispatchKeyEvent(keyEvent2);
    }
}
