package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public class zzdp implements com.google.android.gms.drive.DriveResource {
    protected final com.google.android.gms.drive.DriveId zzk;

    public zzdp(com.google.android.gms.drive.DriveId driveId) {
        this.zzk = driveId;
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.drive.DriveId getDriveId() {
        return this.zzk;
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveResource.MetadataResult> getMetadata(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.drive.zzdq(this, googleApiClient, false));
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.MetadataBufferResult> listParents(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.drive.zzdr(this, googleApiClient));
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> setParents(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.util.Set<com.google.android.gms.drive.DriveId> set) {
        if (set == null) {
            throw new java.lang.IllegalArgumentException("ParentIds must be provided.");
        }
        return googleApiClient.execute(new com.google.android.gms.internal.drive.zzds(this, googleApiClient, new java.util.ArrayList(set)));
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveResource.MetadataResult> updateMetadata(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet) {
        if (metadataChangeSet == null) {
            throw new java.lang.IllegalArgumentException("ChangeSet must be provided.");
        }
        return googleApiClient.execute(new com.google.android.gms.internal.drive.zzdt(this, googleApiClient, metadataChangeSet));
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> delete(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new com.google.android.gms.internal.drive.zzdu(this, googleApiClient));
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addChangeListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.events.ChangeListener changeListener) {
        return ((com.google.android.gms.internal.drive.zzaw) googleApiClient.getClient(com.google.android.gms.drive.Drive.CLIENT_KEY)).zza(googleApiClient, this.zzk, changeListener);
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeChangeListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.events.ChangeListener changeListener) {
        return ((com.google.android.gms.internal.drive.zzaw) googleApiClient.getClient(com.google.android.gms.drive.Drive.CLIENT_KEY)).zzb(googleApiClient, this.zzk, changeListener);
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addChangeSubscription(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.internal.drive.zzaw zzawVar = (com.google.android.gms.internal.drive.zzaw) googleApiClient.getClient(com.google.android.gms.drive.Drive.CLIENT_KEY);
        com.google.android.gms.internal.drive.zzj zzjVar = new com.google.android.gms.internal.drive.zzj(1, this.zzk);
        com.google.android.gms.common.internal.Preconditions.checkArgument(com.google.android.gms.drive.events.zzj.zza(zzjVar.zzda, zzjVar.zzk));
        com.google.android.gms.common.internal.Preconditions.checkState(zzawVar.isConnected(), "Client must be connected");
        if (!zzawVar.zzec) {
            throw new java.lang.IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
        }
        return googleApiClient.execute(new com.google.android.gms.internal.drive.zzaz(zzawVar, googleApiClient, zzjVar));
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeChangeSubscription(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.internal.drive.zzaw zzawVar = (com.google.android.gms.internal.drive.zzaw) googleApiClient.getClient(com.google.android.gms.drive.Drive.CLIENT_KEY);
        com.google.android.gms.drive.DriveId driveId = this.zzk;
        com.google.android.gms.common.internal.Preconditions.checkArgument(com.google.android.gms.drive.events.zzj.zza(1, driveId));
        com.google.android.gms.common.internal.Preconditions.checkState(zzawVar.isConnected(), "Client must be connected");
        return googleApiClient.execute(new com.google.android.gms.internal.drive.zzba(zzawVar, googleApiClient, driveId, 1));
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> trash(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new com.google.android.gms.internal.drive.zzdv(this, googleApiClient));
    }

    @Override // com.google.android.gms.drive.DriveResource
    public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> untrash(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new com.google.android.gms.internal.drive.zzdw(this, googleApiClient));
    }
}
