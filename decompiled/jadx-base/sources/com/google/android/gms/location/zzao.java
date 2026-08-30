package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
class zzao extends com.google.android.gms.internal.location.zzah {
    private final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> zza;

    public zzao(com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(com.google.android.gms.internal.location.zzaa zzaaVar) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(zzaaVar.getStatus(), this.zza);
    }

    public void zzc() {
    }
}
