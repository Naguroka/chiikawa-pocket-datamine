package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzy extends com.google.android.gms.internal.location.zzah {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> zza;

    public zzy(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) {
        this.zza = resultHolder;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(com.google.android.gms.internal.location.zzaa zzaaVar) {
        this.zza.setResult(zzaaVar.getStatus());
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzc() {
    }
}
