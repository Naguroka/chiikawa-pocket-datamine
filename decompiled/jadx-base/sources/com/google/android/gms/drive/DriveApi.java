package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public interface DriveApi {

    @java.lang.Deprecated
    public interface DriveContentsResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.drive.DriveContents getDriveContents();
    }

    @java.lang.Deprecated
    public interface DriveIdResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.drive.DriveId getDriveId();
    }

    @java.lang.Deprecated
    public interface MetadataBufferResult extends com.google.android.gms.common.api.Releasable, com.google.android.gms.common.api.Result {
        com.google.android.gms.drive.MetadataBuffer getMetadataBuffer();
    }

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.DriveIdResult> fetchDriveId(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str);

    @java.lang.Deprecated
    com.google.android.gms.drive.DriveFolder getAppFolder(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    @java.lang.Deprecated
    com.google.android.gms.drive.DriveFolder getRootFolder(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    @java.lang.Deprecated
    com.google.android.gms.drive.CreateFileActivityBuilder newCreateFileActivityBuilder();

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.DriveContentsResult> newDriveContents(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    @java.lang.Deprecated
    com.google.android.gms.drive.OpenFileActivityBuilder newOpenFileActivityBuilder();

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.MetadataBufferResult> query(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.query.Query query);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestSync(com.google.android.gms.common.api.GoogleApiClient googleApiClient);
}
