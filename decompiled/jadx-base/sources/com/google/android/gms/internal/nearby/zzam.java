package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzam extends com.google.android.gms.internal.nearby.zzaw<com.google.android.gms.nearby.connection.EndpointDiscoveryCallback> {
    final /* synthetic */ com.google.android.gms.internal.nearby.zzfi zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzam(com.google.android.gms.internal.nearby.zzap zzapVar, com.google.android.gms.internal.nearby.zzfi zzfiVar) {
        super(null);
        this.zza = zzfiVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        com.google.android.gms.nearby.connection.EndpointDiscoveryCallback endpointDiscoveryCallback = (com.google.android.gms.nearby.connection.EndpointDiscoveryCallback) obj;
        if (com.google.android.gms.internal.nearby.zzap.zzg(this.zza)) {
            com.google.android.gms.nearby.connection.zzn zznVar = new com.google.android.gms.nearby.connection.zzn();
            zznVar.zza(this.zza.zzb());
            zznVar.zzc(this.zza.zzd());
            endpointDiscoveryCallback.onEndpointFound("__UNRECOGNIZED_BLUETOOTH_DEVICE__", zznVar.zze());
            return;
        }
        java.lang.String strZza = this.zza.zza();
        com.google.android.gms.nearby.connection.zzn zznVar2 = new com.google.android.gms.nearby.connection.zzn();
        zznVar2.zza(this.zza.zzb());
        zznVar2.zzb(this.zza.zzc());
        zznVar2.zzd(this.zza.zze());
        endpointDiscoveryCallback.onEndpointFound(strZza, zznVar2.zze());
    }
}
