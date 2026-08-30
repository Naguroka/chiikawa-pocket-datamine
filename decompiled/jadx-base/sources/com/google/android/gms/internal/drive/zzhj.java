package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhj extends com.google.android.gms.internal.drive.zzhh<com.google.android.gms.drive.DriveFile> {
    public zzhj(com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.DriveFile> taskCompletionSource) {
        super(taskCompletionSource);
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfn zzfnVar) throws android.os.RemoteException {
        zzay().setResult(zzfnVar.getDriveId().asDriveFile());
    }
}
