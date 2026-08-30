package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzch extends com.google.android.gms.drive.DriveResourceClient {
    private static final java.util.concurrent.atomic.AtomicInteger zzfn = new java.util.concurrent.atomic.AtomicInteger();

    public zzch(android.content.Context context, com.google.android.gms.drive.Drive.zza zzaVar) {
        super(context, zzaVar);
    }

    public zzch(android.app.Activity activity, com.google.android.gms.drive.Drive.zza zzaVar) {
        super(activity, zzaVar);
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFolder> getRootFolder() {
        return doRead(new com.google.android.gms.internal.drive.zzck(this));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFolder> getAppFolder() {
        return doRead(new com.google.android.gms.internal.drive.zzco(this));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.MetadataBuffer> query(com.google.android.gms.drive.query.Query query) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(query, "query cannot be null.");
        return doRead(new com.google.android.gms.internal.drive.zzcz(this, query));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.Metadata> getMetadata(com.google.android.gms.drive.DriveResource driveResource) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(driveResource, "DriveResource must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(driveResource.getDriveId(), "Resource's DriveId must not be null");
        return doRead(new com.google.android.gms.internal.drive.zzdc(this, driveResource, false));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.Metadata> updateMetadata(com.google.android.gms.drive.DriveResource driveResource, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(driveResource.getDriveId());
        com.google.android.gms.common.internal.Preconditions.checkNotNull(metadataChangeSet);
        return doWrite(new com.google.android.gms.internal.drive.zzdd(this, metadataChangeSet, driveResource));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.MetadataBuffer> listParents(com.google.android.gms.drive.DriveResource driveResource) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(driveResource.getDriveId());
        return doRead(new com.google.android.gms.internal.drive.zzde(this, driveResource));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> setParents(com.google.android.gms.drive.DriveResource driveResource, java.util.Set<com.google.android.gms.drive.DriveId> set) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(driveResource.getDriveId());
        com.google.android.gms.common.internal.Preconditions.checkNotNull(set);
        return doWrite(new com.google.android.gms.internal.drive.zzdf(this, driveResource, new java.util.ArrayList(set)));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> delete(com.google.android.gms.drive.DriveResource driveResource) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(driveResource.getDriveId());
        return doWrite(new com.google.android.gms.internal.drive.zzcl(this, driveResource));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> trash(com.google.android.gms.drive.DriveResource driveResource) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(driveResource.getDriveId());
        return doWrite(new com.google.android.gms.internal.drive.zzcm(this, driveResource));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> untrash(com.google.android.gms.drive.DriveResource driveResource) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(driveResource.getDriveId());
        return doWrite(new com.google.android.gms.internal.drive.zzcn(this, driveResource));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.events.ListenerToken> addChangeListener(com.google.android.gms.drive.DriveResource driveResource, com.google.android.gms.drive.events.OnChangeListener onChangeListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(driveResource.getDriveId());
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onChangeListener, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.google.android.gms.internal.drive.zzdi zzdiVar = new com.google.android.gms.internal.drive.zzdi(this, onChangeListener, driveResource.getDriveId());
        final com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolderRegisterListener = registerListener(zzdiVar, new java.lang.StringBuilder(27).append("OnChangeListener").append(zzfn.incrementAndGet()).toString());
        return doRegisterEventListener(new com.google.android.gms.internal.drive.zzcp(this, listenerHolderRegisterListener, driveResource, zzdiVar), new com.google.android.gms.internal.drive.zzcq(this, listenerHolderRegisterListener.getListenerKey(), driveResource, zzdiVar)).continueWith(new com.google.android.gms.tasks.Continuation(listenerHolderRegisterListener) { // from class: com.google.android.gms.internal.drive.zzci
            private final com.google.android.gms.common.api.internal.ListenerHolder zzfo;

            {
                this.zzfo = listenerHolderRegisterListener;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.android.gms.internal.drive.zzch.zza(this.zzfo, task);
            }
        });
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> removeChangeListener(com.google.android.gms.drive.events.ListenerToken listenerToken) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerToken, "Token is required to unregister listener.");
        if (listenerToken instanceof com.google.android.gms.internal.drive.zzg) {
            return doUnregisterEventListener(((com.google.android.gms.internal.drive.zzg) listenerToken).zzad());
        }
        throw new java.lang.IllegalStateException("Could not recover key from ListenerToken");
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> addChangeSubscription(com.google.android.gms.drive.DriveResource driveResource) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(driveResource.getDriveId());
        com.google.android.gms.common.internal.Preconditions.checkArgument(com.google.android.gms.drive.events.zzj.zza(1, driveResource.getDriveId()));
        return doWrite(new com.google.android.gms.internal.drive.zzcr(this, driveResource));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> removeChangeSubscription(com.google.android.gms.drive.DriveResource driveResource) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(driveResource.getDriveId());
        com.google.android.gms.common.internal.Preconditions.checkArgument(com.google.android.gms.drive.events.zzj.zza(1, driveResource.getDriveId()));
        return doWrite(new com.google.android.gms.internal.drive.zzcs(this, driveResource));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveContents> openFile(com.google.android.gms.drive.DriveFile driveFile, int i) {
        zze(i);
        return doRead(new com.google.android.gms.internal.drive.zzct(this, driveFile, i));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.events.ListenerToken> openFile(com.google.android.gms.drive.DriveFile driveFile, int i, com.google.android.gms.drive.events.OpenFileCallback openFileCallback) {
        zze(i);
        com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolderRegisterListener = registerListener(openFileCallback, new java.lang.StringBuilder(27).append("OpenFileCallback").append(zzfn.incrementAndGet()).toString());
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = listenerHolderRegisterListener.getListenerKey();
        final com.google.android.gms.internal.drive.zzg zzgVar = new com.google.android.gms.internal.drive.zzg(listenerKey);
        return doRegisterEventListener(new com.google.android.gms.internal.drive.zzcu(this, listenerHolderRegisterListener, driveFile, i, zzgVar, listenerHolderRegisterListener), new com.google.android.gms.internal.drive.zzcv(this, listenerKey, zzgVar)).continueWith(new com.google.android.gms.tasks.Continuation(zzgVar) { // from class: com.google.android.gms.internal.drive.zzcj
            private final com.google.android.gms.internal.drive.zzg zzfp;

            {
                this.zzfp = zzgVar;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.android.gms.internal.drive.zzch.zza(this.zzfp, task);
            }
        });
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> cancelOpenFileCallback(com.google.android.gms.drive.events.ListenerToken listenerToken) {
        if (!(listenerToken instanceof com.google.android.gms.internal.drive.zzg)) {
            throw new java.lang.IllegalArgumentException("Unrecognized ListenerToken");
        }
        return doUnregisterEventListener(((com.google.android.gms.internal.drive.zzg) listenerToken).zzad());
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveContents> createContents() {
        com.google.android.gms.common.internal.Preconditions.checkArgument(true, "Contents can only be created in MODE_WRITE_ONLY or MODE_READ_WRITE.");
        return doWrite(new com.google.android.gms.internal.drive.zzcw(this, 536870912));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveContents> reopenContentsForWrite(com.google.android.gms.drive.DriveContents driveContents) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(!driveContents.zzk(), "DriveContents is already closed");
        com.google.android.gms.common.internal.Preconditions.checkArgument(driveContents.getMode() == 268435456, "This method can only be called on contents that are currently opened in MODE_READ_ONLY.");
        driveContents.zzj();
        return doRead(new com.google.android.gms.internal.drive.zzcx(this, driveContents));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> commitContents(com.google.android.gms.drive.DriveContents driveContents, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet) {
        return commitContents(driveContents, metadataChangeSet, (com.google.android.gms.drive.zzn) new com.google.android.gms.drive.zzp().build());
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> commitContents(com.google.android.gms.drive.DriveContents driveContents, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.ExecutionOptions executionOptions) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(executionOptions, "Execution options cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(!driveContents.zzk(), "DriveContents is already closed");
        com.google.android.gms.common.internal.Preconditions.checkArgument(driveContents.getMode() != 268435456, "Cannot commit contents opened in MODE_READ_ONLY.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(driveContents.getDriveId(), "Only DriveContents obtained through DriveFile.open can be committed.");
        com.google.android.gms.drive.zzn zznVarZza = com.google.android.gms.drive.zzn.zza(executionOptions);
        if (com.google.android.gms.drive.ExecutionOptions.zza(zznVarZza.zzn()) && !driveContents.zzi().zzb()) {
            throw new java.lang.IllegalStateException("DriveContents must be valid for conflict detection.");
        }
        if (metadataChangeSet == null) {
            metadataChangeSet = com.google.android.gms.drive.MetadataChangeSet.zzax;
        }
        return doWrite(new com.google.android.gms.internal.drive.zzcy(this, zznVarZza, driveContents, metadataChangeSet));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> discardContents(com.google.android.gms.drive.DriveContents driveContents) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(!driveContents.zzk(), "DriveContents is already closed");
        driveContents.zzj();
        return doWrite(new com.google.android.gms.internal.drive.zzda(this, driveContents));
    }

    private static void zze(int i) {
        if (i != 268435456 && i != 536870912 && i != 805306368) {
            throw new java.lang.IllegalArgumentException("Invalid openMode provided");
        }
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.MetadataBuffer> listChildren(com.google.android.gms.drive.DriveFolder driveFolder) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(driveFolder, "folder cannot be null.");
        return query(com.google.android.gms.internal.drive.zzbs.zza((com.google.android.gms.drive.query.Query) null, driveFolder.getDriveId()));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.MetadataBuffer> queryChildren(com.google.android.gms.drive.DriveFolder driveFolder, com.google.android.gms.drive.query.Query query) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(driveFolder, "folder cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(query, "query cannot be null.");
        return query(com.google.android.gms.internal.drive.zzbs.zza(query, driveFolder.getDriveId()));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFile> createFile(com.google.android.gms.drive.DriveFolder driveFolder, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.DriveContents driveContents) {
        return createFile(driveFolder, metadataChangeSet, driveContents, new com.google.android.gms.drive.ExecutionOptions.Builder().build());
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFile> createFile(com.google.android.gms.drive.DriveFolder driveFolder, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.DriveContents driveContents, com.google.android.gms.drive.ExecutionOptions executionOptions) {
        com.google.android.gms.internal.drive.zzbs.zzb(metadataChangeSet);
        return doWrite(new com.google.android.gms.internal.drive.zzdh(driveFolder, metadataChangeSet, driveContents, executionOptions, null));
    }

    @Override // com.google.android.gms.drive.DriveResourceClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFolder> createFolder(com.google.android.gms.drive.DriveFolder driveFolder, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(metadataChangeSet, "MetadataChangeSet must be provided.");
        if (metadataChangeSet.getMimeType() != null && !metadataChangeSet.getMimeType().equals(com.google.android.gms.drive.DriveFolder.MIME_TYPE)) {
            throw new java.lang.IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
        }
        return doWrite(new com.google.android.gms.internal.drive.zzdb(this, metadataChangeSet, driveFolder));
    }

    static final /* synthetic */ com.google.android.gms.drive.events.ListenerToken zza(com.google.android.gms.internal.drive.zzg zzgVar, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        if (task.isSuccessful()) {
            return zzgVar;
        }
        throw task.getException();
    }

    static final /* synthetic */ com.google.android.gms.drive.events.ListenerToken zza(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        if (task.isSuccessful()) {
            return new com.google.android.gms.internal.drive.zzg(listenerHolder.getListenerKey());
        }
        throw task.getException();
    }
}
