package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzbm extends com.google.android.gms.internal.drive.zzav {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzbi zzev;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbm(com.google.android.gms.internal.drive.zzbi zzbiVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zzev = zzbiVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(new com.google.android.gms.internal.drive.zzo(this.zzev.zzes.getRequestId(), false), new com.google.android.gms.internal.drive.zzgy(this));
    }
}
