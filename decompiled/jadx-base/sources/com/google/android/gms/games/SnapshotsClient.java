package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface SnapshotsClient {
    public static final int DISPLAY_LIMIT_NONE = -1;
    public static final java.lang.String EXTRA_SNAPSHOT_METADATA = "com.google.android.gms.games.SNAPSHOT_METADATA";
    public static final java.lang.String EXTRA_SNAPSHOT_NEW = "com.google.android.gms.games.SNAPSHOT_NEW";
    public static final int RESOLUTION_POLICY_HIGHEST_PROGRESS = 4;
    public static final int RESOLUTION_POLICY_LAST_KNOWN_GOOD = 2;
    public static final int RESOLUTION_POLICY_LONGEST_PLAYTIME = 1;
    public static final int RESOLUTION_POLICY_MANUAL = -1;
    public static final int RESOLUTION_POLICY_MOST_RECENTLY_MODIFIED = 3;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
    public static final class DataOrConflict<T> {
        private final java.lang.Object zza;
        private final com.google.android.gms.games.SnapshotsClient.SnapshotConflict zzb;

        public DataOrConflict(java.lang.Object obj, com.google.android.gms.games.SnapshotsClient.SnapshotConflict snapshotConflict) {
            this.zza = obj;
            this.zzb = snapshotConflict;
        }

        public com.google.android.gms.games.SnapshotsClient.SnapshotConflict getConflict() {
            if (isConflict()) {
                return this.zzb;
            }
            throw new java.lang.IllegalStateException("getConflict called when there is no conflict.");
        }

        public T getData() {
            if (isConflict()) {
                throw new java.lang.IllegalStateException("getData called when there is a conflict.");
            }
            return (T) this.zza;
        }

        public boolean isConflict() {
            return this.zzb != null;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ResolutionPolicy {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
    public static final class SnapshotConflict {
        private final com.google.android.gms.games.snapshot.Snapshot zza;
        private final java.lang.String zzb;
        private final com.google.android.gms.games.snapshot.Snapshot zzc;
        private final com.google.android.gms.games.snapshot.SnapshotContents zzd;

        public SnapshotConflict(com.google.android.gms.games.snapshot.Snapshot snapshot, java.lang.String str, com.google.android.gms.games.snapshot.Snapshot snapshot2, com.google.android.gms.games.snapshot.SnapshotContents snapshotContents) {
            this.zza = snapshot;
            this.zzb = str;
            this.zzc = snapshot2;
            this.zzd = snapshotContents;
        }

        public java.lang.String getConflictId() {
            return this.zzb;
        }

        public com.google.android.gms.games.snapshot.Snapshot getConflictingSnapshot() {
            return this.zzc;
        }

        public com.google.android.gms.games.snapshot.SnapshotContents getResolutionSnapshotContents() {
            return this.zzd;
        }

        public com.google.android.gms.games.snapshot.Snapshot getSnapshot() {
            return this.zza;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
    public static final class SnapshotContentUnavailableApiException extends com.google.android.gms.common.api.ApiException {
        protected final com.google.android.gms.games.snapshot.SnapshotMetadata metadata;

        public SnapshotContentUnavailableApiException(com.google.android.gms.common.api.Status status, com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata) {
            super(status);
            this.metadata = snapshotMetadata;
        }

        public com.google.android.gms.games.snapshot.SnapshotMetadata getSnapshotMetadata() {
            return this.metadata;
        }
    }

    com.google.android.gms.tasks.Task<com.google.android.gms.games.snapshot.SnapshotMetadata> commitAndClose(com.google.android.gms.games.snapshot.Snapshot snapshot, com.google.android.gms.games.snapshot.SnapshotMetadataChange snapshotMetadataChange);

    com.google.android.gms.tasks.Task<java.lang.String> delete(com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata);

    com.google.android.gms.tasks.Task<java.lang.Void> discardAndClose(com.google.android.gms.games.snapshot.Snapshot snapshot);

    com.google.android.gms.tasks.Task<java.lang.Integer> getMaxCoverImageSize();

    com.google.android.gms.tasks.Task<java.lang.Integer> getMaxDataSize();

    com.google.android.gms.tasks.Task<android.content.Intent> getSelectSnapshotIntent(java.lang.String str, boolean z, boolean z2, int i);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.snapshot.SnapshotMetadataBuffer>> load(boolean z);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata, int i);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(java.lang.String str, boolean z);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(java.lang.String str, boolean z, int i);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> resolveConflict(java.lang.String str, com.google.android.gms.games.snapshot.Snapshot snapshot);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> resolveConflict(java.lang.String str, java.lang.String str2, com.google.android.gms.games.snapshot.SnapshotMetadataChange snapshotMetadataChange, com.google.android.gms.games.snapshot.SnapshotContents snapshotContents);
}
