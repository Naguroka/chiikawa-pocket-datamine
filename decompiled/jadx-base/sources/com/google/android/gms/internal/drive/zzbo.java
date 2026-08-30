package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzbo extends com.google.android.gms.internal.drive.zzam {
    private final /* synthetic */ int zzdv;
    private final /* synthetic */ com.google.android.gms.drive.DriveFile.DownloadProgressListener zzey;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzbn zzez;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbo(com.google.android.gms.internal.drive.zzbn zzbnVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, int i, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadProgressListener) {
        super(googleApiClient);
        this.zzez = zzbnVar;
        this.zzdv = i;
        this.zzey = downloadProgressListener;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        setCancelToken(com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(new com.google.android.gms.internal.drive.zzgj(this.zzez.getDriveId(), this.zzdv, 0), new com.google.android.gms.internal.drive.zzgl(this, this.zzey)).zzgs));
    }
}
