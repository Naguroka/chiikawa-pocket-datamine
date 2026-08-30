package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzak extends com.google.android.gms.internal.drive.zzl {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveApi.DriveContentsResult> zzdx;

    zzak(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveApi.DriveContentsResult> resultHolder) {
        this.zzdx = resultHolder;
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfh zzfhVar) throws android.os.RemoteException {
        this.zzdx.setResult(new com.google.android.gms.internal.drive.zzal(com.google.android.gms.common.api.Status.RESULT_SUCCESS, new com.google.android.gms.internal.drive.zzbi(zzfhVar.zzes)));
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        this.zzdx.setResult(new com.google.android.gms.internal.drive.zzal(status, null));
    }
}
