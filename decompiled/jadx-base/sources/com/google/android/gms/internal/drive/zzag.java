package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzag extends com.google.android.gms.internal.drive.zzar {
    private final /* synthetic */ com.google.android.gms.drive.query.Query zzdu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzag(com.google.android.gms.internal.drive.zzaf zzafVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.query.Query query) {
        super(googleApiClient);
        this.zzdu = query;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(new com.google.android.gms.internal.drive.zzgq(this.zzdu), new com.google.android.gms.internal.drive.zzas(this));
    }
}
