package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhq extends com.google.android.gms.internal.drive.zzhh<java.lang.Boolean> {
    public zzhq(com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource) {
        super(taskCompletionSource);
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void onSuccess() throws android.os.RemoteException {
        zzay().setResult(true);
    }
}
