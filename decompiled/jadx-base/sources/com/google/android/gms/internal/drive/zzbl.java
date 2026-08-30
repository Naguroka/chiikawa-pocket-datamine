package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzbl implements com.google.android.gms.common.api.ResultCallback<com.google.android.gms.common.api.Status> {
    zzbl(com.google.android.gms.internal.drive.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* synthetic */ void onResult(com.google.android.gms.common.api.Result result) {
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) result;
        if (status.isSuccess()) {
            return;
        }
        com.google.android.gms.internal.drive.zzbi.zzbz.efmt("DriveContentsImpl", "Error discarding contents, status: %s", status);
    }
}
