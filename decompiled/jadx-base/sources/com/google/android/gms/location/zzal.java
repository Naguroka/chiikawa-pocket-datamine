package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzal extends com.google.android.gms.internal.location.zzah {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzal(com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(com.google.android.gms.internal.location.zzaa zzaaVar) throws android.os.RemoteException {
        com.google.android.gms.common.api.Status status = zzaaVar.getStatus();
        if (status == null) {
            this.zza.trySetException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(8, "Got null status from location service")));
        } else if (status.getStatusCode() == 0) {
            this.zza.setResult(true);
        } else {
            this.zza.trySetException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status));
        }
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzc() {
    }
}
