package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbn extends com.google.android.gms.internal.drive.zzdp implements com.google.android.gms.drive.DriveFile {
    public zzbn(com.google.android.gms.drive.DriveId driveId) {
        super(driveId);
    }

    @Override // com.google.android.gms.drive.DriveFile
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.DriveContentsResult> open(com.google.android.gms.common.api.GoogleApiClient googleApiClient, int i, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadProgressListener) {
        if (i != 268435456 && i != 536870912 && i != 805306368) {
            throw new java.lang.IllegalArgumentException("Invalid mode provided.");
        }
        return googleApiClient.enqueue(new com.google.android.gms.internal.drive.zzbo(this, googleApiClient, i, downloadProgressListener == null ? null : new com.google.android.gms.internal.drive.zzbp(googleApiClient.registerListener(downloadProgressListener))));
    }
}
