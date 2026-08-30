package com.google.android.gms.games.snapshot;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class SnapshotMetadataRef extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.snapshot.SnapshotMetadata {
    private final com.google.android.gms.games.Game zza;
    private final com.google.android.gms.games.Player zzb;

    public SnapshotMetadataRef(com.google.android.gms.common.data.DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.zza = new com.google.android.gms.games.GameRef(dataHolder, i);
        this.zzb = new com.google.android.gms.games.PlayerRef(dataHolder, i, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object obj) {
        return com.google.android.gms.games.snapshot.SnapshotMetadataEntity.zzd(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.snapshot.SnapshotMetadata freeze() {
        return new com.google.android.gms.games.snapshot.SnapshotMetadataEntity(this);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final float getCoverImageAspectRatio() {
        float f = getFloat("cover_icon_image_height");
        float f2 = getFloat("cover_icon_image_width");
        if (f == 0.0f) {
            return 0.0f;
        }
        return f2 / f;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final android.net.Uri getCoverImageUri() {
        return parseUri("cover_icon_image_uri");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public java.lang.String getCoverImageUrl() {
        return getString("cover_icon_image_url");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final java.lang.String getDescription() {
        return getString("description");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final java.lang.String getDeviceName() {
        return getString("device_name");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final com.google.android.gms.games.Game getGame() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final long getLastModifiedTimestamp() {
        return getLong("last_modified_timestamp");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final com.google.android.gms.games.Player getOwner() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final long getPlayedTime() {
        return getLong("duration");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final long getProgressValue() {
        return getLong("progress_value");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final java.lang.String getSnapshotId() {
        return getString("external_snapshot_id");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final java.lang.String getUniqueName() {
        return getString("unique_name");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final boolean hasChangePending() {
        return getInteger("pending_change_count") > 0;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return com.google.android.gms.games.snapshot.SnapshotMetadataEntity.zzb(this);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.games.snapshot.SnapshotMetadataEntity.zzc(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        new com.google.android.gms.games.snapshot.SnapshotMetadataEntity(this).writeToParcel(parcel, i);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final java.lang.String zza() {
        return getString(com.ironsource.y8.h.D0);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final void getDescription(android.database.CharArrayBuffer charArrayBuffer) {
        copyToBuffer("description", charArrayBuffer);
    }
}
