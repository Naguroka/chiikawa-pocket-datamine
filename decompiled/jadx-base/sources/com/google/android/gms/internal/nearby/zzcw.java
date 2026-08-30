package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcw extends com.google.android.gms.internal.nearby.zzdl {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ byte[] zzb;
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcw(com.google.android.gms.internal.nearby.zzdm zzdmVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, byte[] bArr, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = bArr;
        this.zzc = listenerHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.internal.nearby.zzbf zzbfVar = (com.google.android.gms.internal.nearby.zzbf) anyClient;
        java.lang.String str = this.zza;
        byte[] bArr = this.zzb;
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolder = this.zzc;
        com.google.android.gms.internal.nearby.zzeh zzehVar = (com.google.android.gms.internal.nearby.zzeh) zzbfVar.getService();
        com.google.android.gms.internal.nearby.zzq zzqVar = new com.google.android.gms.internal.nearby.zzq();
        zzqVar.zza(new com.google.android.gms.internal.nearby.zzbc(this));
        zzqVar.zzc(str);
        zzqVar.zzd(bArr);
        zzqVar.zzb(new com.google.android.gms.internal.nearby.zzav(zzbfVar.getContext(), listenerHolder));
        zzehVar.zzi(zzqVar.zzf());
    }
}
