package com.google.android.gms.games.snapshot;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface SnapshotMetadataChange {
    public static final com.google.android.gms.games.snapshot.SnapshotMetadataChange EMPTY_CHANGE = new com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
    public static final class Builder {
        private java.lang.String zza;
        private java.lang.Long zzb;
        private java.lang.Long zzc;
        private com.google.android.gms.common.data.BitmapTeleporter zzd;
        private android.net.Uri zze;

        public com.google.android.gms.games.snapshot.SnapshotMetadataChange build() {
            return new com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity(this.zza, this.zzb, this.zzd, this.zze, this.zzc);
        }

        public com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder fromMetadata(com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata) {
            this.zza = snapshotMetadata.getDescription();
            this.zzb = java.lang.Long.valueOf(snapshotMetadata.getPlayedTime());
            this.zzc = java.lang.Long.valueOf(snapshotMetadata.getProgressValue());
            if (this.zzb.longValue() == -1) {
                this.zzb = null;
            }
            android.net.Uri coverImageUri = snapshotMetadata.getCoverImageUri();
            this.zze = coverImageUri;
            if (coverImageUri != null) {
                this.zzd = null;
            }
            return this;
        }

        public com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder setCoverImage(android.graphics.Bitmap bitmap) {
            this.zzd = new com.google.android.gms.common.data.BitmapTeleporter(bitmap);
            this.zze = null;
            return this;
        }

        public com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder setDescription(java.lang.String str) {
            this.zza = str;
            return this;
        }

        public com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder setPlayedTimeMillis(long j) {
            this.zzb = java.lang.Long.valueOf(j);
            return this;
        }

        public com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder setProgressValue(long j) {
            this.zzc = java.lang.Long.valueOf(j);
            return this;
        }
    }

    android.graphics.Bitmap getCoverImage();

    java.lang.String getDescription();

    java.lang.Long getPlayedTimeMillis();

    java.lang.Long getProgressValue();

    com.google.android.gms.common.data.BitmapTeleporter zza();
}
