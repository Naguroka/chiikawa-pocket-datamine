package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public interface DriveFolder extends com.google.android.gms.drive.DriveResource {
    public static final java.lang.String MIME_TYPE = "application/vnd.google-apps.folder";

    @java.lang.Deprecated
    public interface DriveFileResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.drive.DriveFile getDriveFile();
    }

    @java.lang.Deprecated
    public interface DriveFolderResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.drive.DriveFolder getDriveFolder();
    }

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveFolder.DriveFileResult> createFile(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.DriveContents driveContents);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveFolder.DriveFileResult> createFile(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.DriveContents driveContents, com.google.android.gms.drive.ExecutionOptions executionOptions);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveFolder.DriveFolderResult> createFolder(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.MetadataBufferResult> listChildren(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.MetadataBufferResult> queryChildren(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.query.Query query);
}
