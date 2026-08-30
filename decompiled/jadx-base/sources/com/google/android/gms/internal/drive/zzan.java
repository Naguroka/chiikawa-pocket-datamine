package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzan extends com.google.android.gms.internal.drive.zzl {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveApi.DriveIdResult> zzdx;

    public zzan(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveApi.DriveIdResult> resultHolder) {
        this.zzdx = resultHolder;
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfy zzfyVar) throws android.os.RemoteException {
        this.zzdx.setResult(new com.google.android.gms.internal.drive.zzao(com.google.android.gms.common.api.Status.RESULT_SUCCESS, new com.google.android.gms.internal.drive.zzaa(zzfyVar.zzdn).getDriveId()));
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfn zzfnVar) throws android.os.RemoteException {
        this.zzdx.setResult(new com.google.android.gms.internal.drive.zzao(com.google.android.gms.common.api.Status.RESULT_SUCCESS, zzfnVar.zzdd));
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        this.zzdx.setResult(new com.google.android.gms.internal.drive.zzao(status, null));
    }
}
