package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzak extends com.google.android.gms.location.zzap {
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zza;
    final /* synthetic */ com.google.android.gms.location.FusedLocationProviderClient zzb;

    zzak(com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        this.zzb = fusedLocationProviderClient;
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* bridge */ /* synthetic */ void accept(com.google.android.gms.internal.location.zzaz zzazVar, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.internal.location.zzaz zzazVar2 = zzazVar;
        com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource2 = taskCompletionSource;
        if (zza()) {
            com.google.android.gms.location.zzal zzalVar = new com.google.android.gms.location.zzal(this.zzb, taskCompletionSource2);
            try {
                com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.location.LocationCallback> listenerKey = this.zza.getListenerKey();
                if (listenerKey != null) {
                    zzazVar2.zzH(listenerKey, zzalVar);
                }
            } catch (java.lang.RuntimeException e) {
                taskCompletionSource2.trySetException(e);
            }
        }
    }
}
