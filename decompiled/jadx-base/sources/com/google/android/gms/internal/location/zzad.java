package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzad extends com.google.android.gms.internal.location.zzae {
    final /* synthetic */ com.google.android.gms.location.zzbq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzad(com.google.android.gms.internal.location.zzaf zzafVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.zzbq zzbqVar) {
        super(googleApiClient);
        this.zza = zzbqVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzaz) anyClient).zzw(this.zza, this);
    }
}
