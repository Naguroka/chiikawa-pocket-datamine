package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaaa implements com.google.android.gms.common.api.PendingResult.StatusListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.BasePendingResult zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zaac zab;

    zaaa(com.google.android.gms.common.api.internal.zaac zaacVar, com.google.android.gms.common.api.internal.BasePendingResult basePendingResult) {
        this.zaa = basePendingResult;
        this.zab = zaacVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(com.google.android.gms.common.api.Status status) {
        this.zab.zaa.remove(this.zaa);
    }
}
