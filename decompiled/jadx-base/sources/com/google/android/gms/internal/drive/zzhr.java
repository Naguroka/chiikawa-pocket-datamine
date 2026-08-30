package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhr extends com.google.android.gms.internal.drive.zzhh<java.lang.Void> {
    public zzhr(com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) {
        super(taskCompletionSource);
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void onSuccess() throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(com.google.android.gms.common.api.Status.RESULT_SUCCESS, zzay());
    }
}
