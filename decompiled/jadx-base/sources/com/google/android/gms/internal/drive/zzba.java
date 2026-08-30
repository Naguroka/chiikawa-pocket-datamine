package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzba extends com.google.android.gms.internal.drive.zzav {
    private final /* synthetic */ com.google.android.gms.drive.DriveId zzen;
    private final /* synthetic */ int zzeo = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzba(com.google.android.gms.internal.drive.zzaw zzawVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.DriveId driveId, int i) {
        super(googleApiClient);
        this.zzen = driveId;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(new com.google.android.gms.internal.drive.zzgs(this.zzen, this.zzeo), (com.google.android.gms.internal.drive.zzes) null, (java.lang.String) null, new com.google.android.gms.internal.drive.zzgy(this));
    }
}
