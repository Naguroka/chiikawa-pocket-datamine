package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzcc extends com.google.android.gms.internal.drive.zzcg {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzcb zzfk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcc(com.google.android.gms.internal.drive.zzcb zzcbVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(zzcbVar, googleApiClient);
        this.zzfk = zzcbVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zzb(new com.google.android.gms.internal.drive.zzce(this.zzfk, this, null));
    }
}
