package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public interface DriveContents {
    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> commit(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> commit(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.ExecutionOptions executionOptions);

    @java.lang.Deprecated
    void discard(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    com.google.android.gms.drive.DriveId getDriveId();

    java.io.InputStream getInputStream();

    int getMode();

    java.io.OutputStream getOutputStream();

    android.os.ParcelFileDescriptor getParcelFileDescriptor();

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.DriveContentsResult> reopenForWrite(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    com.google.android.gms.drive.Contents zzi();

    void zzj();

    boolean zzk();
}
