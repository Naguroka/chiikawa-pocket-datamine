package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbi implements com.google.android.gms.drive.DriveContents {
    private static final com.google.android.gms.common.internal.GmsLogger zzbz = new com.google.android.gms.common.internal.GmsLogger("DriveContentsImpl", "");
    private final com.google.android.gms.drive.Contents zzes;
    private boolean closed = false;
    private boolean zzet = false;
    private boolean zzeu = false;

    public zzbi(com.google.android.gms.drive.Contents contents) {
        this.zzes = (com.google.android.gms.drive.Contents) com.google.android.gms.common.internal.Preconditions.checkNotNull(contents);
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final com.google.android.gms.drive.DriveId getDriveId() {
        return this.zzes.getDriveId();
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final int getMode() {
        return this.zzes.getMode();
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final android.os.ParcelFileDescriptor getParcelFileDescriptor() {
        if (this.closed) {
            throw new java.lang.IllegalStateException("Contents have been closed, cannot access the output stream.");
        }
        return this.zzes.getParcelFileDescriptor();
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final java.io.InputStream getInputStream() {
        if (this.closed) {
            throw new java.lang.IllegalStateException("Contents have been closed, cannot access the input stream.");
        }
        if (this.zzes.getMode() != 268435456) {
            throw new java.lang.IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
        }
        if (this.zzet) {
            throw new java.lang.IllegalStateException("getInputStream() can only be called once per Contents instance.");
        }
        this.zzet = true;
        return this.zzes.getInputStream();
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final java.io.OutputStream getOutputStream() {
        if (this.closed) {
            throw new java.lang.IllegalStateException("Contents have been closed, cannot access the output stream.");
        }
        if (this.zzes.getMode() != 536870912) {
            throw new java.lang.IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        }
        if (this.zzeu) {
            throw new java.lang.IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        }
        this.zzeu = true;
        return this.zzes.getOutputStream();
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.DriveContentsResult> reopenForWrite(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        if (this.closed) {
            throw new java.lang.IllegalStateException("DriveContents already closed.");
        }
        if (this.zzes.getMode() != 268435456) {
            throw new java.lang.IllegalStateException("reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY.");
        }
        zzj();
        return googleApiClient.enqueue(new com.google.android.gms.internal.drive.zzbj(this, googleApiClient));
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> commit(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet) {
        return zza(googleApiClient, metadataChangeSet, null);
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> commit(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.ExecutionOptions executionOptions) {
        return zza(googleApiClient, metadataChangeSet, executionOptions == null ? null : com.google.android.gms.drive.zzn.zza(executionOptions));
    }

    private final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.zzn zznVar) {
        if (zznVar == null) {
            zznVar = (com.google.android.gms.drive.zzn) new com.google.android.gms.drive.zzp().build();
        }
        if (this.zzes.getMode() == 268435456) {
            throw new java.lang.IllegalStateException("Cannot commit contents opened with MODE_READ_ONLY");
        }
        if (com.google.android.gms.drive.ExecutionOptions.zza(zznVar.zzn()) && !this.zzes.zzb()) {
            throw new java.lang.IllegalStateException("DriveContents must be valid for conflict detection.");
        }
        zznVar.zza(googleApiClient);
        if (this.closed) {
            throw new java.lang.IllegalStateException("DriveContents already closed.");
        }
        if (getDriveId() == null) {
            throw new java.lang.IllegalStateException("Only DriveContents obtained through DriveFile.open can be committed.");
        }
        if (metadataChangeSet == null) {
            metadataChangeSet = com.google.android.gms.drive.MetadataChangeSet.zzax;
        }
        zzj();
        return googleApiClient.execute(new com.google.android.gms.internal.drive.zzbk(this, googleApiClient, metadataChangeSet, zznVar));
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final void discard(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        if (this.closed) {
            throw new java.lang.IllegalStateException("DriveContents already closed.");
        }
        zzj();
        ((com.google.android.gms.internal.drive.zzbm) googleApiClient.execute(new com.google.android.gms.internal.drive.zzbm(this, googleApiClient))).setResultCallback(new com.google.android.gms.internal.drive.zzbl(this));
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final com.google.android.gms.drive.Contents zzi() {
        return this.zzes;
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final void zzj() {
        com.google.android.gms.common.util.IOUtils.closeQuietly(this.zzes.getParcelFileDescriptor());
        this.closed = true;
    }

    @Override // com.google.android.gms.drive.DriveContents
    public final boolean zzk() {
        return this.closed;
    }
}
