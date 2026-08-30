package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcu extends com.google.android.gms.internal.nearby.zzdl {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcu(com.google.android.gms.internal.nearby.zzdm zzdmVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, long j, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = j;
        this.zzc = listenerHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        java.lang.String str = this.zza;
        long j = this.zzb;
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolder = this.zzc;
        com.google.android.gms.nearby.connection.DiscoveryOptions.Builder builder = new com.google.android.gms.nearby.connection.DiscoveryOptions.Builder();
        builder.setStrategy(com.google.android.gms.nearby.connection.Strategy.P2P_CLUSTER);
        com.google.android.gms.nearby.connection.DiscoveryOptions discoveryOptionsBuild = builder.build();
        com.google.android.gms.internal.nearby.zzeh zzehVar = (com.google.android.gms.internal.nearby.zzeh) ((com.google.android.gms.internal.nearby.zzbf) anyClient).getService();
        com.google.android.gms.internal.nearby.zzgx zzgxVar = new com.google.android.gms.internal.nearby.zzgx();
        zzgxVar.zza(new com.google.android.gms.internal.nearby.zzbc(this));
        zzgxVar.zzb(str);
        zzgxVar.zzc(j);
        zzgxVar.zze(new com.google.android.gms.internal.nearby.zzas(listenerHolder));
        zzgxVar.zzd(discoveryOptionsBuild);
        zzehVar.zzf(zzgxVar.zzf());
    }
}
