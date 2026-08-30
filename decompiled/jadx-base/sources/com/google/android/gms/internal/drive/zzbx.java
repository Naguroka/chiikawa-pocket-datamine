package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzbx implements com.google.android.gms.drive.DriveFolder.DriveFileResult {
    private final com.google.android.gms.common.api.Status zzdy;
    private final com.google.android.gms.drive.DriveFile zzfi;

    public zzbx(com.google.android.gms.common.api.Status status, com.google.android.gms.drive.DriveFile driveFile) {
        this.zzdy = status;
        this.zzfi = driveFile;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzdy;
    }

    @Override // com.google.android.gms.drive.DriveFolder.DriveFileResult
    public final com.google.android.gms.drive.DriveFile getDriveFile() {
        return this.zzfi;
    }
}
