package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdf extends com.google.android.gms.internal.nearby.zzdl {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdf(com.google.android.gms.internal.nearby.zzdm zzdmVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = str2;
        this.zzc = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.nearby.zzbf) anyClient).zzx(this, this.zza, this.zzb, this.zzc);
    }
}
