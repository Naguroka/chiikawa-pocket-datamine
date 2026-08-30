package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzay extends com.google.android.gms.internal.drive.zzav {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzee zzel;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzgs zzem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzay(com.google.android.gms.internal.drive.zzaw zzawVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.internal.drive.zzgs zzgsVar, com.google.android.gms.internal.drive.zzee zzeeVar) {
        super(googleApiClient);
        this.zzem = zzgsVar;
        this.zzel = zzeeVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(this.zzem, this.zzel, (java.lang.String) null, new com.google.android.gms.internal.drive.zzgy(this));
    }
}
