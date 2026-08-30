package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzal implements com.google.android.gms.common.api.Releasable, com.google.android.gms.drive.DriveApi.DriveContentsResult {
    private final com.google.android.gms.common.api.Status zzdy;
    private final com.google.android.gms.drive.DriveContents zzo;

    public zzal(com.google.android.gms.common.api.Status status, com.google.android.gms.drive.DriveContents driveContents) {
        this.zzdy = status;
        this.zzo = driveContents;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzdy;
    }

    @Override // com.google.android.gms.drive.DriveApi.DriveContentsResult
    public final com.google.android.gms.drive.DriveContents getDriveContents() {
        return this.zzo;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
        com.google.android.gms.drive.DriveContents driveContents = this.zzo;
        if (driveContents != null) {
            driveContents.zzj();
        }
    }
}
