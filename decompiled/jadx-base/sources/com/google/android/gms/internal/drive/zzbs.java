package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbs extends com.google.android.gms.internal.drive.zzdp implements com.google.android.gms.drive.DriveFolder {
    public zzbs(com.google.android.gms.drive.DriveId driveId) {
        super(driveId);
    }

    @Override // com.google.android.gms.drive.DriveFolder
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.MetadataBufferResult> listChildren(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return queryChildren(googleApiClient, null);
    }

    @Override // com.google.android.gms.drive.DriveFolder
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.MetadataBufferResult> queryChildren(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.query.Query query) {
        return new com.google.android.gms.internal.drive.zzaf().query(googleApiClient, zza(query, getDriveId()));
    }

    static com.google.android.gms.drive.query.Query zza(com.google.android.gms.drive.query.Query query, com.google.android.gms.drive.DriveId driveId) {
        com.google.android.gms.drive.query.Query.Builder builderAddFilter = new com.google.android.gms.drive.query.Query.Builder().addFilter(com.google.android.gms.drive.query.Filters.in(com.google.android.gms.drive.query.SearchableField.PARENTS, driveId));
        if (query != null) {
            if (query.getFilter() != null) {
                builderAddFilter.addFilter(query.getFilter());
            }
            builderAddFilter.setPageToken(query.getPageToken());
            builderAddFilter.setSortOrder(query.getSortOrder());
        }
        return builderAddFilter.build();
    }

    @Override // com.google.android.gms.drive.DriveFolder
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveFolder.DriveFileResult> createFile(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.DriveContents driveContents) {
        return createFile(googleApiClient, metadataChangeSet, driveContents, null);
    }

    @Override // com.google.android.gms.drive.DriveFolder
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveFolder.DriveFileResult> createFile(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.DriveContents driveContents, com.google.android.gms.drive.ExecutionOptions executionOptions) {
        if (executionOptions == null) {
            executionOptions = new com.google.android.gms.drive.ExecutionOptions.Builder().build();
        }
        com.google.android.gms.drive.ExecutionOptions executionOptions2 = executionOptions;
        if (executionOptions2.zzn() != 0) {
            throw new java.lang.IllegalStateException("May not set a conflict strategy for new file creation.");
        }
        if (metadataChangeSet == null) {
            throw new java.lang.IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        com.google.android.gms.drive.metadata.internal.zzk zzkVarZzg = com.google.android.gms.drive.metadata.internal.zzk.zzg(metadataChangeSet.getMimeType());
        if (zzkVarZzg != null && zzkVarZzg.isFolder()) {
            throw new java.lang.IllegalArgumentException("May not create folders using this method. Use DriveFolder.createFolder() instead of mime type application/vnd.google-apps.folder");
        }
        if (executionOptions2 == null) {
            throw new java.lang.IllegalArgumentException("ExecutionOptions must be provided");
        }
        executionOptions2.zza(googleApiClient);
        if (driveContents != null) {
            if (!(driveContents instanceof com.google.android.gms.internal.drive.zzbi)) {
                throw new java.lang.IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
            }
            if (driveContents.getDriveId() != null) {
                throw new java.lang.IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
            }
            if (driveContents.zzk()) {
                throw new java.lang.IllegalArgumentException("DriveContents are already closed.");
            }
        }
        zzb(metadataChangeSet);
        int iZza = zza(driveContents, com.google.android.gms.drive.metadata.internal.zzk.zzg(metadataChangeSet.getMimeType()));
        com.google.android.gms.drive.metadata.internal.zzk zzkVarZzg2 = com.google.android.gms.drive.metadata.internal.zzk.zzg(metadataChangeSet.getMimeType());
        return googleApiClient.execute(new com.google.android.gms.internal.drive.zzbt(this, googleApiClient, metadataChangeSet, iZza, (zzkVarZzg2 == null || !zzkVarZzg2.zzbh()) ? 0 : 1, executionOptions2));
    }

    static void zzb(com.google.android.gms.drive.MetadataChangeSet metadataChangeSet) {
        if (metadataChangeSet == null) {
            throw new java.lang.IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        com.google.android.gms.drive.metadata.internal.zzk zzkVarZzg = com.google.android.gms.drive.metadata.internal.zzk.zzg(metadataChangeSet.getMimeType());
        if (zzkVarZzg != null) {
            if (!((zzkVarZzg.zzbh() || zzkVarZzg.isFolder()) ? false : true)) {
                throw new java.lang.IllegalArgumentException("May not create shortcut files using this method. Use DriveFolder.createShortcutFile() instead.");
            }
        }
    }

    static int zza(com.google.android.gms.drive.DriveContents driveContents, com.google.android.gms.drive.metadata.internal.zzk zzkVar) {
        if (driveContents == null) {
            return (zzkVar == null || !zzkVar.zzbh()) ? 1 : 0;
        }
        int requestId = driveContents.zzi().getRequestId();
        driveContents.zzj();
        return requestId;
    }

    @Override // com.google.android.gms.drive.DriveFolder
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveFolder.DriveFolderResult> createFolder(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet) {
        if (metadataChangeSet == null) {
            throw new java.lang.IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        if (metadataChangeSet.getMimeType() != null && !metadataChangeSet.getMimeType().equals(com.google.android.gms.drive.DriveFolder.MIME_TYPE)) {
            throw new java.lang.IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
        }
        return googleApiClient.execute(new com.google.android.gms.internal.drive.zzbu(this, googleApiClient, metadataChangeSet));
    }
}
