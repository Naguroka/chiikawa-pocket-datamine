package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzao implements com.google.android.gms.drive.DriveApi.DriveIdResult {
    private final com.google.android.gms.common.api.Status zzdy;
    private final com.google.android.gms.drive.DriveId zzk;

    public zzao(com.google.android.gms.common.api.Status status, com.google.android.gms.drive.DriveId driveId) {
        this.zzdy = status;
        this.zzk = driveId;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzdy;
    }

    @Override // com.google.android.gms.drive.DriveApi.DriveIdResult
    public final com.google.android.gms.drive.DriveId getDriveId() {
        return this.zzk;
    }
}
