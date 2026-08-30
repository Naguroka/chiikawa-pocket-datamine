package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class RunnableC1715i implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.unity3d.player.IAssetPackManagerMobileDataConfirmationCallback f3926a;
    private boolean b;

    RunnableC1715i(com.unity3d.player.IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback, boolean z) {
        this.f3926a = iAssetPackManagerMobileDataConfirmationCallback;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3926a.onMobileDataConfirmationResult(this.b);
    }
}
