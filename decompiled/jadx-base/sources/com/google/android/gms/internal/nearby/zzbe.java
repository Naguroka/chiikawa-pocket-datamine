package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbe extends com.google.android.gms.internal.nearby.zzep {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult> zza;

    zzbe(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult> resultHolder) {
        this.zza = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzeq
    public final void zzb(com.google.android.gms.internal.nearby.zzfq zzfqVar) {
        com.google.android.gms.common.api.Status statusZzG = com.google.android.gms.internal.nearby.zzbf.zzG(zzfqVar.zza());
        if (statusZzG.isSuccess()) {
            this.zza.setResult(new com.google.android.gms.internal.nearby.zzbd(statusZzG, zzfqVar.zzb()));
        } else {
            this.zza.setFailedResult(statusZzG);
        }
    }
}
