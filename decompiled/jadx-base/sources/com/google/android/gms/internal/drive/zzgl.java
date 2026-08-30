package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzgl extends com.google.android.gms.internal.drive.zzl {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveApi.DriveContentsResult> zzdx;
    private final com.google.android.gms.drive.DriveFile.DownloadProgressListener zziq;

    zzgl(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveApi.DriveContentsResult> resultHolder, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadProgressListener) {
        this.zzdx = resultHolder;
        this.zziq = downloadProgressListener;
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfh zzfhVar) throws android.os.RemoteException {
        com.google.android.gms.common.api.Status status;
        if (zzfhVar.zzhv) {
            status = new com.google.android.gms.common.api.Status(-1);
        } else {
            status = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
        this.zzdx.setResult(new com.google.android.gms.internal.drive.zzal(status, new com.google.android.gms.internal.drive.zzbi(zzfhVar.zzes)));
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfl zzflVar) throws android.os.RemoteException {
        com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadProgressListener = this.zziq;
        if (downloadProgressListener != null) {
            downloadProgressListener.onProgress(zzflVar.zzhy, zzflVar.zzhz);
        }
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        this.zzdx.setResult(new com.google.android.gms.internal.drive.zzal(status, null));
    }
}
