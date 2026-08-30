package com.google.android.gms.internal.p000authapi;

/* JADX INFO: loaded from: classes4.dex */
final class zzo extends com.google.android.gms.internal.p000authapi.zzg {
    private com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> zzap;

    zzo(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) {
        this.zzap = resultHolder;
    }

    @Override // com.google.android.gms.internal.p000authapi.zzg, com.google.android.gms.internal.p000authapi.zzu
    public final void zzc(com.google.android.gms.common.api.Status status) {
        this.zzap.setResult(status);
    }
}
