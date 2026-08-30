package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzey implements com.google.android.gms.games.SnapshotsClient {
    private final com.google.android.gms.internal.games_v2.zzar zza;

    public zzey(com.google.android.gms.internal.games_v2.zzar zzarVar) {
        this.zza = zzarVar;
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.snapshot.SnapshotMetadata> commitAndClose(final com.google.android.gms.games.snapshot.Snapshot snapshot, final com.google.android.gms.games.snapshot.SnapshotMetadataChange snapshotMetadataChange) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzeh
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final com.google.android.gms.games.snapshot.Snapshot snapshot2 = snapshot;
                final com.google.android.gms.games.snapshot.SnapshotMetadataChange snapshotMetadataChange2 = snapshotMetadataChange;
                return googleApi.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzep
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        ((com.google.android.gms.games.internal.zzak) obj).zzt((com.google.android.gms.tasks.TaskCompletionSource) obj2, snapshot2, snapshotMetadataChange2);
                    }
                }).setMethodKey(6722).build());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<java.lang.String> delete(final com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzei
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata2 = snapshotMetadata;
                return googleApi.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzeq
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        ((com.google.android.gms.games.internal.zzak) obj).zzu((com.google.android.gms.tasks.TaskCompletionSource) obj2, snapshotMetadata2.getSnapshotId());
                    }
                }).setMethodKey(6724).build());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> discardAndClose(final com.google.android.gms.games.snapshot.Snapshot snapshot) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzex
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final com.google.android.gms.games.snapshot.Snapshot snapshot2 = snapshot;
                return googleApi.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzeg
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        com.google.android.gms.games.snapshot.SnapshotContents snapshotContents = snapshot2.getSnapshotContents();
                        com.google.android.gms.common.internal.Preconditions.checkState(!snapshotContents.isClosed(), "Snapshot already closed");
                        com.google.android.gms.drive.Contents contentsZza = snapshotContents.zza();
                        snapshotContents.zzb();
                        ((com.google.android.gms.games.internal.zzap) ((com.google.android.gms.games.internal.zzak) obj).getService()).zzt(contentsZza);
                        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(null);
                    }
                }).setMethodKey(6723).build());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<java.lang.Integer> getMaxCoverImageSize() {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzen
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzev
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(java.lang.Integer.valueOf(((com.google.android.gms.games.internal.zzap) ((com.google.android.gms.games.internal.zzak) obj).getService()).zzd()));
                    }
                }).setMethodKey(6718).build());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<java.lang.Integer> getMaxDataSize() {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzeo
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzew
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(java.lang.Integer.valueOf(((com.google.android.gms.games.internal.zzap) ((com.google.android.gms.games.internal.zzak) obj).getService()).zze()));
                    }
                }).setMethodKey(6717).build());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getSelectSnapshotIntent(final java.lang.String str, final boolean z, final boolean z2, final int i) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzel
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final java.lang.String str2 = str;
                final boolean z3 = z;
                final boolean z4 = z2;
                final int i2 = i;
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzet
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzap) ((com.google.android.gms.games.internal.zzak) obj).getService()).zzm(str2, z3, z4, i2));
                    }
                }).setMethodKey(6719).build());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.snapshot.SnapshotMetadataBuffer>> load(final boolean z) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzem
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final boolean z2 = z;
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzeu
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        ((com.google.android.gms.games.internal.zzak) obj).zzJ((com.google.android.gms.tasks.TaskCompletionSource) obj2, z2);
                    }
                }).setMethodKey(6720).build());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata) {
        return open(snapshotMetadata.getUniqueName(), false, -1);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> resolveConflict(java.lang.String str, com.google.android.gms.games.snapshot.Snapshot snapshot) {
        com.google.android.gms.games.snapshot.SnapshotMetadata metadata = snapshot.getMetadata();
        com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder builder = new com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder();
        builder.fromMetadata(metadata);
        com.google.android.gms.games.snapshot.SnapshotMetadataChange snapshotMetadataChangeBuild = builder.build();
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzej(str, metadata.getSnapshotId(), snapshotMetadataChangeBuild, snapshot.getSnapshotContents()));
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata, int i) {
        return open(snapshotMetadata.getUniqueName(), false, i);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(java.lang.String str, boolean z) {
        return open(str, z, -1);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(final java.lang.String str, final boolean z, final int i) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzek
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final java.lang.String str2 = str;
                final boolean z2 = z;
                final int i2 = i;
                return googleApi.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzes
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        ((com.google.android.gms.games.internal.zzak) obj).zzL((com.google.android.gms.tasks.TaskCompletionSource) obj2, str2, z2, i2);
                    }
                }).setMethodKey(6721).build());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> resolveConflict(java.lang.String str, java.lang.String str2, com.google.android.gms.games.snapshot.SnapshotMetadataChange snapshotMetadataChange, com.google.android.gms.games.snapshot.SnapshotContents snapshotContents) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzej(str, str2, snapshotMetadataChange, snapshotContents));
    }
}
