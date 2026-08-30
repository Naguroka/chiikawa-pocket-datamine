package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public interface DriveFile extends com.google.android.gms.drive.DriveResource {
    public static final int MODE_READ_ONLY = 268435456;
    public static final int MODE_READ_WRITE = 805306368;
    public static final int MODE_WRITE_ONLY = 536870912;

    @java.lang.Deprecated
    public interface DownloadProgressListener {
        void onProgress(long j, long j2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface OpenMode {
    }

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.DriveContentsResult> open(com.google.android.gms.common.api.GoogleApiClient googleApiClient, int i, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadProgressListener);
}
