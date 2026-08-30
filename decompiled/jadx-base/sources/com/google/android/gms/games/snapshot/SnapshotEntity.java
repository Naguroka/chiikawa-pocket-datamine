package com.google.android.gms.games.snapshot;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class SnapshotEntity extends com.google.android.gms.games.internal.zzh implements com.google.android.gms.games.snapshot.Snapshot {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.snapshot.SnapshotEntity> CREATOR = new com.google.android.gms.games.snapshot.zzb();
    private final com.google.android.gms.games.snapshot.SnapshotMetadataEntity zza;
    private final com.google.android.gms.games.snapshot.SnapshotContentsEntity zzb;

    public SnapshotEntity(com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata, com.google.android.gms.games.snapshot.SnapshotContentsEntity snapshotContentsEntity) {
        this.zza = new com.google.android.gms.games.snapshot.SnapshotMetadataEntity(snapshotMetadata);
        this.zzb = snapshotContentsEntity;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.snapshot.Snapshot)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        com.google.android.gms.games.snapshot.Snapshot snapshot = (com.google.android.gms.games.snapshot.Snapshot) obj;
        return com.google.android.gms.common.internal.Objects.equal(snapshot.getMetadata(), getMetadata()) && com.google.android.gms.common.internal.Objects.equal(snapshot.getSnapshotContents(), getSnapshotContents());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public com.google.android.gms.games.snapshot.Snapshot freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.snapshot.Snapshot freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.snapshot.Snapshot
    public com.google.android.gms.games.snapshot.SnapshotMetadata getMetadata() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.snapshot.Snapshot
    public com.google.android.gms.games.snapshot.SnapshotContents getSnapshotContents() {
        if (this.zzb.isClosed()) {
            return null;
        }
        return this.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(getMetadata(), getSnapshotContents());
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("Metadata", getMetadata()).add("HasContents", java.lang.Boolean.valueOf(getSnapshotContents() != null)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getMetadata(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getSnapshotContents(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
