package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzbw extends com.google.android.gms.internal.drive.zzl {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveFolder.DriveFolderResult> zzdx;

    public zzbw(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveFolder.DriveFolderResult> resultHolder) {
        this.zzdx = resultHolder;
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfn zzfnVar) throws android.os.RemoteException {
        this.zzdx.setResult(new com.google.android.gms.internal.drive.zzbz(com.google.android.gms.common.api.Status.RESULT_SUCCESS, new com.google.android.gms.internal.drive.zzbs(zzfnVar.zzdd)));
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        this.zzdx.setResult(new com.google.android.gms.internal.drive.zzbz(status, null));
    }
}
