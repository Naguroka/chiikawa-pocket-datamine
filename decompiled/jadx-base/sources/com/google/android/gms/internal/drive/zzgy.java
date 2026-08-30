package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgy extends com.google.android.gms.internal.drive.zzl {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> zzdx;

    public zzgy(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) {
        this.zzdx = resultHolder;
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void onSuccess() throws android.os.RemoteException {
        this.zzdx.setResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        this.zzdx.setResult(status);
    }
}
