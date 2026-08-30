package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class k extends android.os.ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource f2259a;
    final /* synthetic */ com.google.android.play.core.assetpacks.l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(com.google.android.play.core.assetpacks.l lVar, android.os.Handler handler, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.b = lVar;
        this.f2259a = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, android.os.Bundle bundle) {
        if (i == 1) {
            this.f2259a.trySetResult(-1);
            this.b.g.b(null);
        } else if (i != 2) {
            this.f2259a.trySetException(new com.google.android.play.core.assetpacks.AssetPackException(-100));
        } else {
            this.f2259a.trySetResult(0);
        }
    }
}
