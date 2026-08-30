package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class RunnableC1732q0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f3943a = false;
    boolean b = false;
    final /* synthetic */ java.util.concurrent.Semaphore c;
    final /* synthetic */ com.unity3d.player.UnityPlayer d;
    final /* synthetic */ com.unity3d.player.UnityPlayer e;

    RunnableC1732q0(com.unity3d.player.UnityPlayer unityPlayer, java.util.concurrent.Semaphore semaphore, com.unity3d.player.UnityPlayer unityPlayer2) {
        this.e = unityPlayer;
        this.c = semaphore;
        this.d = unityPlayer2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.reportSoftInputArea(new android.graphics.Rect());
        this.e.reportSoftInputIsVisible(false);
        if (this.e.mSoftInput != null) {
            this.d.setOnHandleFocusListener(new com.unity3d.player.C1728o0(this));
            com.unity3d.player.UnityPlayer unityPlayer = this.e;
            unityPlayer.mSoftInput.g = new com.unity3d.player.C1730p0(this);
            unityPlayer.dismissSoftInput();
        }
    }
}
