package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zar {
    final /* synthetic */ com.google.android.gms.common.api.internal.BasePendingResult zaa;

    /* synthetic */ zar(com.google.android.gms.common.api.internal.BasePendingResult basePendingResult, com.google.android.gms.common.api.internal.zas zasVar) {
        this.zaa = basePendingResult;
    }

    protected final void finalize() throws java.lang.Throwable {
        com.google.android.gms.common.api.internal.BasePendingResult.zal(this.zaa.zaj);
        super.finalize();
    }
}
