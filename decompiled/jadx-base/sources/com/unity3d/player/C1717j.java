package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1717j implements com.google.android.gms.tasks.OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.unity3d.player.IAssetPackManagerMobileDataConfirmationCallback f3929a;
    private android.os.Looper b = android.os.Looper.myLooper();

    public C1717j(com.unity3d.player.IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.f3929a = iAssetPackManagerMobileDataConfirmationCallback;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (this.f3929a != null) {
            new android.os.Handler(this.b).post(new com.unity3d.player.RunnableC1715i(this.f3929a, num.intValue() == -1));
        }
    }
}
