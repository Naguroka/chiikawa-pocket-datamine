package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhl extends com.google.android.gms.internal.drive.zzhh<com.google.android.gms.drive.DriveId> {
    public zzhl(com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.DriveId> taskCompletionSource) {
        super(taskCompletionSource);
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfn zzfnVar) throws android.os.RemoteException {
        zzay().setResult(zzfnVar.getDriveId());
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfy zzfyVar) throws android.os.RemoteException {
        zzay().setResult(new com.google.android.gms.internal.drive.zzaa(zzfyVar.zzaw()).getDriveId());
    }
}
