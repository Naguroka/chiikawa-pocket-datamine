package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbc extends com.google.android.gms.internal.nearby.zzem {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> zza;

    zzbc(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) {
        this.zza = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzen
    public final void zzb(int i) {
        com.google.android.gms.common.api.Status statusZzG = com.google.android.gms.internal.nearby.zzbf.zzG(i);
        if (statusZzG.isSuccess()) {
            this.zza.setResult(statusZzG);
        } else {
            this.zza.setFailedResult(statusZzG);
        }
    }
}
