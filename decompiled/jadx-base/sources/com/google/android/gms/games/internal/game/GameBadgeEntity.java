package com.google.android.gms.games.internal.game;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class GameBadgeEntity extends com.google.android.gms.games.internal.GamesDowngradeableSafeParcel implements com.google.android.gms.games.internal.game.zza {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.internal.game.GameBadgeEntity> CREATOR = new com.google.android.gms.games.internal.game.zzb();
    private int zza;
    private java.lang.String zzb;
    private java.lang.String zzc;
    private android.net.Uri zzd;

    GameBadgeEntity(int i, java.lang.String str, java.lang.String str2, android.net.Uri uri) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = uri;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.internal.game.zza)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        com.google.android.gms.games.internal.game.zza zzaVar = (com.google.android.gms.games.internal.game.zza) obj;
        return com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(zzaVar.zza()), this.zzb) && com.google.android.gms.common.internal.Objects.equal(zzaVar.zzb(), this.zzd);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ java.lang.Object freeze() {
        return this;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("Type", java.lang.Integer.valueOf(this.zza)).add("Title", this.zzb).add("Description", this.zzc).add("IconImageUri", this.zzd).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (shouldDowngrade()) {
            parcel.writeInt(this.zza);
            parcel.writeString(this.zzb);
            parcel.writeString(this.zzc);
            android.net.Uri uri = this.zzd;
            parcel.writeString(uri == null ? null : uri.toString());
            return;
        }
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.games.internal.game.zza
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.internal.game.zza
    public final java.lang.String zzb() {
        return this.zzc;
    }
}
