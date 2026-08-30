package com.google.android.gms.games.snapshot;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class SnapshotMetadataEntity extends com.google.android.gms.games.internal.zzh implements com.google.android.gms.games.snapshot.SnapshotMetadata {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.snapshot.SnapshotMetadataEntity> CREATOR = new com.google.android.gms.games.snapshot.zzd();
    private final com.google.android.gms.games.GameEntity zza;
    private final com.google.android.gms.games.PlayerEntity zzb;
    private final java.lang.String zzc;
    private final android.net.Uri zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final java.lang.String zzg;
    private final long zzh;
    private final long zzi;
    private final float zzj;
    private final java.lang.String zzk;
    private final boolean zzl;
    private final long zzm;
    private final java.lang.String zzn;

    SnapshotMetadataEntity(com.google.android.gms.games.GameEntity gameEntity, com.google.android.gms.games.PlayerEntity playerEntity, java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, long j2, float f, java.lang.String str5, boolean z, long j3, java.lang.String str6) {
        this.zza = gameEntity;
        this.zzb = playerEntity;
        this.zzc = str;
        this.zzd = uri;
        this.zze = str2;
        this.zzj = f;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = j;
        this.zzi = j2;
        this.zzk = str5;
        this.zzl = z;
        this.zzm = j3;
        this.zzn = str6;
    }

    static int zzb(com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata) {
        return com.google.android.gms.common.internal.Objects.hashCode(snapshotMetadata.getGame(), snapshotMetadata.getOwner(), snapshotMetadata.getSnapshotId(), snapshotMetadata.getCoverImageUri(), java.lang.Float.valueOf(snapshotMetadata.getCoverImageAspectRatio()), snapshotMetadata.zza(), snapshotMetadata.getDescription(), java.lang.Long.valueOf(snapshotMetadata.getLastModifiedTimestamp()), java.lang.Long.valueOf(snapshotMetadata.getPlayedTime()), snapshotMetadata.getUniqueName(), java.lang.Boolean.valueOf(snapshotMetadata.hasChangePending()), java.lang.Long.valueOf(snapshotMetadata.getProgressValue()), snapshotMetadata.getDeviceName());
    }

    static java.lang.String zzc(com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata) {
        return com.google.android.gms.common.internal.Objects.toStringHelper(snapshotMetadata).add("Game", snapshotMetadata.getGame()).add("Owner", snapshotMetadata.getOwner()).add("SnapshotId", snapshotMetadata.getSnapshotId()).add("CoverImageUri", snapshotMetadata.getCoverImageUri()).add("CoverImageUrl", snapshotMetadata.getCoverImageUrl()).add("CoverImageAspectRatio", java.lang.Float.valueOf(snapshotMetadata.getCoverImageAspectRatio())).add("Description", snapshotMetadata.getDescription()).add("LastModifiedTimestamp", java.lang.Long.valueOf(snapshotMetadata.getLastModifiedTimestamp())).add("PlayedTime", java.lang.Long.valueOf(snapshotMetadata.getPlayedTime())).add("UniqueName", snapshotMetadata.getUniqueName()).add("ChangePending", java.lang.Boolean.valueOf(snapshotMetadata.hasChangePending())).add("ProgressValue", java.lang.Long.valueOf(snapshotMetadata.getProgressValue())).add("DeviceName", snapshotMetadata.getDeviceName()).toString();
    }

    static boolean zzd(com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata, java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.snapshot.SnapshotMetadata)) {
            return false;
        }
        if (snapshotMetadata == obj) {
            return true;
        }
        com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata2 = (com.google.android.gms.games.snapshot.SnapshotMetadata) obj;
        return com.google.android.gms.common.internal.Objects.equal(snapshotMetadata2.getGame(), snapshotMetadata.getGame()) && com.google.android.gms.common.internal.Objects.equal(snapshotMetadata2.getOwner(), snapshotMetadata.getOwner()) && com.google.android.gms.common.internal.Objects.equal(snapshotMetadata2.getSnapshotId(), snapshotMetadata.getSnapshotId()) && com.google.android.gms.common.internal.Objects.equal(snapshotMetadata2.getCoverImageUri(), snapshotMetadata.getCoverImageUri()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Float.valueOf(snapshotMetadata2.getCoverImageAspectRatio()), java.lang.Float.valueOf(snapshotMetadata.getCoverImageAspectRatio())) && com.google.android.gms.common.internal.Objects.equal(snapshotMetadata2.zza(), snapshotMetadata.zza()) && com.google.android.gms.common.internal.Objects.equal(snapshotMetadata2.getDescription(), snapshotMetadata.getDescription()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(snapshotMetadata2.getLastModifiedTimestamp()), java.lang.Long.valueOf(snapshotMetadata.getLastModifiedTimestamp())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(snapshotMetadata2.getPlayedTime()), java.lang.Long.valueOf(snapshotMetadata.getPlayedTime())) && com.google.android.gms.common.internal.Objects.equal(snapshotMetadata2.getUniqueName(), snapshotMetadata.getUniqueName()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(snapshotMetadata2.hasChangePending()), java.lang.Boolean.valueOf(snapshotMetadata.hasChangePending())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(snapshotMetadata2.getProgressValue()), java.lang.Long.valueOf(snapshotMetadata.getProgressValue())) && com.google.android.gms.common.internal.Objects.equal(snapshotMetadata2.getDeviceName(), snapshotMetadata.getDeviceName());
    }

    public boolean equals(java.lang.Object obj) {
        return zzd(this, obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public com.google.android.gms.games.snapshot.SnapshotMetadata freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.snapshot.SnapshotMetadata freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public float getCoverImageAspectRatio() {
        return this.zzj;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public android.net.Uri getCoverImageUri() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public java.lang.String getCoverImageUrl() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public java.lang.String getDescription() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public void getDescription(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zzg, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public java.lang.String getDeviceName() {
        return this.zzn;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public com.google.android.gms.games.Game getGame() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long getLastModifiedTimestamp() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public com.google.android.gms.games.Player getOwner() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long getPlayedTime() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long getProgressValue() {
        return this.zzm;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public java.lang.String getSnapshotId() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public java.lang.String getUniqueName() {
        return this.zzk;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public boolean hasChangePending() {
        return this.zzl;
    }

    public int hashCode() {
        return zzb(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    public java.lang.String toString() {
        return zzc(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getGame(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getOwner(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getSnapshotId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, getCoverImageUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getCoverImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, getDescription(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 9, getLastModifiedTimestamp());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 10, getPlayedTime());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 11, getCoverImageAspectRatio());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, getUniqueName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 13, hasChangePending());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 14, getProgressValue());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 15, getDeviceName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final java.lang.String zza() {
        return this.zzf;
    }

    public SnapshotMetadataEntity(com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata) {
        com.google.android.gms.games.PlayerEntity playerEntity = new com.google.android.gms.games.PlayerEntity(snapshotMetadata.getOwner());
        this.zza = new com.google.android.gms.games.GameEntity(snapshotMetadata.getGame());
        this.zzb = playerEntity;
        this.zzc = snapshotMetadata.getSnapshotId();
        this.zzd = snapshotMetadata.getCoverImageUri();
        this.zze = snapshotMetadata.getCoverImageUrl();
        this.zzj = snapshotMetadata.getCoverImageAspectRatio();
        this.zzf = snapshotMetadata.zza();
        this.zzg = snapshotMetadata.getDescription();
        this.zzh = snapshotMetadata.getLastModifiedTimestamp();
        this.zzi = snapshotMetadata.getPlayedTime();
        this.zzk = snapshotMetadata.getUniqueName();
        this.zzl = snapshotMetadata.hasChangePending();
        this.zzm = snapshotMetadata.getProgressValue();
        this.zzn = snapshotMetadata.getDeviceName();
    }
}
