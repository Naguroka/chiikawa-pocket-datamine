package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzdh extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.DriveFile> {
    private final com.google.android.gms.drive.DriveFolder zzfj;
    private final com.google.android.gms.drive.MetadataChangeSet zzgc;
    private com.google.android.gms.drive.ExecutionOptions zzgd;
    private java.lang.String zzge = null;
    private com.google.android.gms.drive.metadata.internal.zzk zzgf;
    private final com.google.android.gms.drive.DriveContents zzo;

    zzdh(com.google.android.gms.drive.DriveFolder driveFolder, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.DriveContents driveContents, com.google.android.gms.drive.ExecutionOptions executionOptions, java.lang.String str) {
        this.zzfj = driveFolder;
        this.zzgc = metadataChangeSet;
        this.zzo = driveContents;
        this.zzgd = executionOptions;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(driveFolder, "DriveFolder must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(driveFolder.getDriveId(), "Folder's DriveId must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(metadataChangeSet, "MetadataChangeSet must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(executionOptions, "ExecutionOptions must not be null");
        com.google.android.gms.drive.metadata.internal.zzk zzkVarZzg = com.google.android.gms.drive.metadata.internal.zzk.zzg(metadataChangeSet.getMimeType());
        this.zzgf = zzkVarZzg;
        if (zzkVarZzg != null && zzkVarZzg.isFolder()) {
            throw new java.lang.IllegalArgumentException("May not create folders using this method. Use DriveFolderManagerClient#createFolder() instead of mime type application/vnd.google-apps.folder");
        }
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
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.DriveFile> taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.internal.drive.zzaw zzawVar = (com.google.android.gms.internal.drive.zzaw) anyClient;
        this.zzgd.zza(zzawVar);
        com.google.android.gms.drive.MetadataChangeSet metadataChangeSet = this.zzgc;
        metadataChangeSet.zzq().zza(zzawVar.getContext());
        int iZza = com.google.android.gms.internal.drive.zzbs.zza(this.zzo, this.zzgf);
        com.google.android.gms.drive.metadata.internal.zzk zzkVar = this.zzgf;
        ((com.google.android.gms.internal.drive.zzeo) zzawVar.getService()).zza(new com.google.android.gms.internal.drive.zzw(this.zzfj.getDriveId(), metadataChangeSet.zzq(), iZza, (zzkVar == null || !zzkVar.zzbh()) ? 0 : 1, this.zzgd), new com.google.android.gms.internal.drive.zzhj(taskCompletionSource));
    }
}
