package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcp extends com.google.android.gms.internal.nearby.zzdl {
    final /* synthetic */ java.util.List zza;
    final /* synthetic */ com.google.android.gms.nearby.connection.Payload zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcp(com.google.android.gms.internal.nearby.zzdm zzdmVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.util.List list, com.google.android.gms.nearby.connection.Payload payload) {
        super(googleApiClient, null);
        this.zza = list;
        this.zzb = payload;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.nearby.zzbf) anyClient).zzA(this, (java.lang.String[]) this.zza.toArray(new java.lang.String[0]), this.zzb, false);
    }
}
