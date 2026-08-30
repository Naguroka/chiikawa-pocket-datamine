package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzbz implements com.google.android.gms.drive.DriveFolder.DriveFolderResult {
    private final com.google.android.gms.common.api.Status zzdy;
    private final com.google.android.gms.drive.DriveFolder zzfj;

    public zzbz(com.google.android.gms.common.api.Status status, com.google.android.gms.drive.DriveFolder driveFolder) {
        this.zzdy = status;
        this.zzfj = driveFolder;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzdy;
    }

    @Override // com.google.android.gms.drive.DriveFolder.DriveFolderResult
    public final com.google.android.gms.drive.DriveFolder getDriveFolder() {
        return this.zzfj;
    }
}
