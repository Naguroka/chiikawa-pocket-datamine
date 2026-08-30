package com.google.android.gms.games.internal.player;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class StockProfileImageEntity extends com.google.android.gms.games.internal.zzh implements com.google.android.gms.games.internal.player.StockProfileImage {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.internal.player.StockProfileImageEntity> CREATOR = new com.google.android.gms.games.internal.player.zzf();
    private final java.lang.String zza;
    private final android.net.Uri zzb;

    public StockProfileImageEntity(java.lang.String str, android.net.Uri uri) {
        this.zza = str;
        this.zzb = uri;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.internal.player.StockProfileImage)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.google.android.gms.games.internal.player.StockProfileImage stockProfileImage = (com.google.android.gms.games.internal.player.StockProfileImage) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, stockProfileImage.getImageUrl()) && com.google.android.gms.common.internal.Objects.equal(this.zzb, stockProfileImage.zza());
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.internal.player.StockProfileImage freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    public java.lang.String getImageUrl() {
        return this.zza;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("ImageId", this.zza).add("ImageUri", this.zzb).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    public final android.net.Uri zza() {
        return this.zzb;
    }
}
