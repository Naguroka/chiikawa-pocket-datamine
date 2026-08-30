package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcx extends com.google.android.gms.internal.nearby.zzdl {
    final /* synthetic */ java.lang.String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcx(com.google.android.gms.internal.nearby.zzdm zzdmVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        super(googleApiClient, null);
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.nearby.zzbf) anyClient).zzz(this, this.zza);
    }
}
