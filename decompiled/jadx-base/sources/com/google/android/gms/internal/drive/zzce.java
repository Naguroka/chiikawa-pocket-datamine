package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzce extends com.google.android.gms.internal.drive.zzl {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult> zzdx;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzcb zzfk;

    private zzce(com.google.android.gms.internal.drive.zzcb zzcbVar, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult> resultHolder) {
        this.zzfk = zzcbVar;
        this.zzdx = resultHolder;
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfj zzfjVar) throws android.os.RemoteException {
        this.zzdx.setResult(new com.google.android.gms.internal.drive.zzcf(this.zzfk, com.google.android.gms.common.api.Status.RESULT_SUCCESS, zzfjVar.zzhw, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        this.zzdx.setResult(new com.google.android.gms.internal.drive.zzcf(this.zzfk, status, null, 0 == true ? 1 : 0));
    }

    /* synthetic */ zzce(com.google.android.gms.internal.drive.zzcb zzcbVar, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder, com.google.android.gms.internal.drive.zzcc zzccVar) {
        this(zzcbVar, resultHolder);
    }
}
