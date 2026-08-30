package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzct extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.DriveContents> {
    private final /* synthetic */ com.google.android.gms.drive.DriveFile zzfs;
    private final /* synthetic */ int zzft;

    zzct(com.google.android.gms.internal.drive.zzch zzchVar, com.google.android.gms.drive.DriveFile driveFile, int i) {
        this.zzfs = driveFile;
        this.zzft = i;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.DriveContents> taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(new com.google.android.gms.internal.drive.zzgj(this.zzfs.getDriveId(), this.zzft, 0), new com.google.android.gms.internal.drive.zzhi(taskCompletionSource));
    }
}
