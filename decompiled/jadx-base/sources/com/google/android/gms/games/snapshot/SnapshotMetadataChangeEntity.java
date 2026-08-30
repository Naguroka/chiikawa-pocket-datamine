package com.google.android.gms.games.snapshot;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class SnapshotMetadataChangeEntity extends com.google.android.gms.games.internal.zzh implements com.google.android.gms.games.snapshot.SnapshotMetadataChange {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity> CREATOR = new com.google.android.gms.games.snapshot.zzc();
    private final java.lang.String zza;
    private final java.lang.Long zzb;
    private final android.net.Uri zzc;
    private com.google.android.gms.common.data.BitmapTeleporter zzd;
    private final java.lang.Long zze;

    SnapshotMetadataChangeEntity() {
        this(null, null, null, null, null);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final android.graphics.Bitmap getCoverImage() {
        com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter = this.zzd;
        if (bitmapTeleporter == null) {
            return null;
        }
        return bitmapTeleporter.get();
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final java.lang.String getDescription() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final java.lang.Long getPlayedTimeMillis() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final java.lang.Long getProgressValue() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(parcel, 6, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final com.google.android.gms.common.data.BitmapTeleporter zza() {
        return this.zzd;
    }

    SnapshotMetadataChangeEntity(java.lang.String str, java.lang.Long l, com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter, android.net.Uri uri, java.lang.Long l2) {
        this.zza = str;
        this.zzb = l;
        this.zzd = bitmapTeleporter;
        this.zzc = uri;
        this.zze = l2;
        boolean z = true;
        if (bitmapTeleporter != null && uri != null) {
            z = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(z, "Cannot set both a URI and an image");
    }
}
