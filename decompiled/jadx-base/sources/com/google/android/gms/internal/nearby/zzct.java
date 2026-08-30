package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzct extends com.google.android.gms.internal.nearby.zzdk {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzct(com.google.android.gms.internal.nearby.zzdm zzdmVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, long j, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
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
        com.google.android.gms.nearby.connection.AdvertisingOptions.Builder builder = new com.google.android.gms.nearby.connection.AdvertisingOptions.Builder();
        builder.setStrategy(com.google.android.gms.nearby.connection.Strategy.P2P_CLUSTER);
        com.google.android.gms.nearby.connection.AdvertisingOptions advertisingOptionsBuild = builder.build();
        com.google.android.gms.internal.nearby.zzeh zzehVar = (com.google.android.gms.internal.nearby.zzeh) ((com.google.android.gms.internal.nearby.zzbf) anyClient).getService();
        com.google.android.gms.internal.nearby.zzgt zzgtVar = new com.google.android.gms.internal.nearby.zzgt();
        zzgtVar.zza(new com.google.android.gms.internal.nearby.zzbe(this));
        zzgtVar.zzc(str);
        zzgtVar.zzd("__LEGACY_SERVICE_ID__");
        zzgtVar.zze(j);
        zzgtVar.zzb(new com.google.android.gms.internal.nearby.zzai(listenerHolder));
        zzgtVar.zzf(advertisingOptionsBuild);
        zzehVar.zzd(zzgtVar.zzi());
    }
}
