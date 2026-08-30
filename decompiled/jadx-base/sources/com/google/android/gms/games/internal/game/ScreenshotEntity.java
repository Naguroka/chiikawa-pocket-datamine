package com.google.android.gms.games.internal.game;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ScreenshotEntity extends com.google.android.gms.games.internal.zzh implements com.google.android.gms.common.data.Freezable, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.internal.game.ScreenshotEntity> CREATOR = new com.google.android.gms.games.internal.game.zzd();
    private final android.net.Uri zza;
    private final int zzb;
    private final int zzc;

    public ScreenshotEntity(android.net.Uri uri, int i, int i2) {
        this.zza = uri;
        this.zzb = i;
        this.zzc = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.internal.game.ScreenshotEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        com.google.android.gms.games.internal.game.ScreenshotEntity screenshotEntity = (com.google.android.gms.games.internal.game.ScreenshotEntity) obj;
        return com.google.android.gms.common.internal.Objects.equal(screenshotEntity.zza, this.zza) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(screenshotEntity.zzb), java.lang.Integer.valueOf(this.zzb)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(screenshotEntity.zzc), java.lang.Integer.valueOf(this.zzc));
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ java.lang.Object freeze() {
        return this;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc));
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("Uri", this.zza).add(com.google.common.net.HttpHeaders.WIDTH, java.lang.Integer.valueOf(this.zzb)).add("Height", java.lang.Integer.valueOf(this.zzc)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
