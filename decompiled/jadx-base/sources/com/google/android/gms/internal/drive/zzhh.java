package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public class zzhh<T> extends com.google.android.gms.internal.drive.zzl {
    private com.google.android.gms.tasks.TaskCompletionSource<T> zziv;

    zzhh(com.google.android.gms.tasks.TaskCompletionSource<T> taskCompletionSource) {
        this.zziv = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        this.zziv.setException(new com.google.android.gms.common.api.ApiException(status));
    }

    public final com.google.android.gms.tasks.TaskCompletionSource<T> zzay() {
        return this.zziv;
    }
}
