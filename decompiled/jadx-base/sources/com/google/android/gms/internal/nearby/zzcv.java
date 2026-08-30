package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcv extends com.google.android.gms.internal.nearby.zzdl {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ byte[] zzc;
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zzd;
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcv(com.google.android.gms.internal.nearby.zzdm zzdmVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2, byte[] bArr, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder2) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
        this.zzd = listenerHolder;
        this.zze = listenerHolder2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.internal.nearby.zzbf zzbfVar = (com.google.android.gms.internal.nearby.zzbf) anyClient;
        java.lang.String str = this.zza;
        java.lang.String str2 = this.zzb;
        byte[] bArr = this.zzc;
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolder = this.zzd;
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolder2 = this.zze;
        com.google.android.gms.internal.nearby.zzeh zzehVar = (com.google.android.gms.internal.nearby.zzeh) zzbfVar.getService();
        com.google.android.gms.internal.nearby.zzgl zzglVar = new com.google.android.gms.internal.nearby.zzgl();
        zzglVar.zza(new com.google.android.gms.internal.nearby.zzbc(this));
        zzglVar.zzd(str);
        zzglVar.zze(str2);
        zzglVar.zzf(bArr);
        zzglVar.zzb(new com.google.android.gms.internal.nearby.zzav(zzbfVar.getContext(), listenerHolder2));
        zzglVar.zzc(new com.google.android.gms.internal.nearby.zzak(listenerHolder));
        zzehVar.zzh(zzglVar.zzj());
    }
}
