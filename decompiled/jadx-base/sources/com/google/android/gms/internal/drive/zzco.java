package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzco extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.DriveFolder> {
    zzco(com.google.android.gms.internal.drive.zzch zzchVar) {
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.DriveFolder> taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.internal.drive.zzaw zzawVar = (com.google.android.gms.internal.drive.zzaw) anyClient;
        if (zzawVar.zzaf() == null) {
            taskCompletionSource.setException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(10, "Drive#SCOPE_APPFOLDER must be requested")));
        } else {
            taskCompletionSource.setResult(new com.google.android.gms.internal.drive.zzbs(zzawVar.zzaf()));
        }
    }
}
