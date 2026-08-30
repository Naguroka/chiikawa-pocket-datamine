package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzas extends com.google.android.gms.internal.drive.zzl {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveApi.MetadataBufferResult> zzdx;

    zzas(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DriveApi.MetadataBufferResult> resultHolder) {
        this.zzdx = resultHolder;
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzft zzftVar) throws android.os.RemoteException {
        this.zzdx.setResult(new com.google.android.gms.internal.drive.zzaq(com.google.android.gms.common.api.Status.RESULT_SUCCESS, new com.google.android.gms.drive.MetadataBuffer(zzftVar.zzii), zzftVar.zzea));
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        this.zzdx.setResult(new com.google.android.gms.internal.drive.zzaq(status, null, false));
    }
}
