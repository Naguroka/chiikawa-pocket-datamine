package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class PlayerRef extends com.google.android.gms.games.zzo implements com.google.android.gms.games.Player {
    private final com.google.android.gms.games.internal.player.zzd zza;
    private final com.google.android.gms.games.PlayerLevelInfo zzb;
    private final com.google.android.gms.games.internal.player.zzc zzc;
    private final com.google.android.gms.games.zzv zzd;
    private final com.google.android.gms.games.zzc zze;

    public PlayerRef(com.google.android.gms.common.data.DataHolder dataHolder, int i, java.lang.String str) {
        super(dataHolder, i);
        com.google.android.gms.games.internal.player.zzd zzdVar = new com.google.android.gms.games.internal.player.zzd(null);
        this.zza = zzdVar;
        this.zzc = new com.google.android.gms.games.internal.player.zzc(dataHolder, i, zzdVar);
        this.zzd = new com.google.android.gms.games.zzv(dataHolder, i, zzdVar);
        this.zze = new com.google.android.gms.games.zzc(dataHolder, i, zzdVar);
        if (hasNull(zzdVar.zzj) || getLong(zzdVar.zzj) == -1) {
            this.zzb = null;
            return;
        }
        int integer = getInteger(zzdVar.zzk);
        int integer2 = getInteger(zzdVar.zzn);
        com.google.android.gms.games.PlayerLevel playerLevel = new com.google.android.gms.games.PlayerLevel(integer, getLong(zzdVar.zzl), getLong(zzdVar.zzm));
        this.zzb = new com.google.android.gms.games.PlayerLevelInfo(getLong(zzdVar.zzj), getLong(zzdVar.zzp), playerLevel, integer != integer2 ? new com.google.android.gms.games.PlayerLevel(integer2, getLong(zzdVar.zzm), getLong(zzdVar.zzo)) : playerLevel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object obj) {
        return com.google.android.gms.games.PlayerEntity.zzn(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.Player freeze() {
        return new com.google.android.gms.games.PlayerEntity(this);
    }

    @Override // com.google.android.gms.games.Player
    public final android.net.Uri getBannerImageLandscapeUri() {
        return parseUri(this.zza.zzB);
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getBannerImageLandscapeUrl() {
        return getString(this.zza.zzC);
    }

    @Override // com.google.android.gms.games.Player
    public final android.net.Uri getBannerImagePortraitUri() {
        return parseUri(this.zza.zzD);
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getBannerImagePortraitUrl() {
        return getString(this.zza.zzE);
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.CurrentPlayerInfo getCurrentPlayerInfo() {
        if (this.zze.zza()) {
            return this.zze;
        }
        return null;
    }

    @Override // com.google.android.gms.games.Player
    public final java.lang.String getDisplayName() {
        return getString(this.zza.zzb);
    }

    @Override // com.google.android.gms.games.Player
    public final android.net.Uri getHiResImageUri() {
        return parseUri(this.zza.zze);
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getHiResImageUrl() {
        return getString(this.zza.zzf);
    }

    @Override // com.google.android.gms.games.Player
    public final android.net.Uri getIconImageUri() {
        return parseUri(this.zza.zzc);
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getIconImageUrl() {
        return getString(this.zza.zzd);
    }

    @Override // com.google.android.gms.games.Player
    public final long getLastPlayedWithTimestamp() {
        if (!hasColumn(this.zza.zzi) || hasNull(this.zza.zzi)) {
            return -1L;
        }
        return getLong(this.zza.zzi);
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.PlayerLevelInfo getLevelInfo() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.Player
    public final java.lang.String getPlayerId() {
        return getString(this.zza.zza);
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.PlayerRelationshipInfo getRelationshipInfo() {
        com.google.android.gms.games.zzv zzvVar = this.zzd;
        if (zzvVar.getFriendStatus() == -1 && zzvVar.zzb() == null && zzvVar.zza() == null) {
            return null;
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.games.Player
    public final long getRetrievedTimestamp() {
        return getLong(this.zza.zzg);
    }

    @Override // com.google.android.gms.games.Player
    public final java.lang.String getTitle() {
        return getString(this.zza.zzq);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean hasHiResImage() {
        return getHiResImageUri() != null;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean hasIconImage() {
        return getIconImageUri() != null;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return com.google.android.gms.games.PlayerEntity.zzi(this);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.games.PlayerEntity.zzk(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        new com.google.android.gms.games.PlayerEntity(this).writeToParcel(parcel, i);
    }

    @Override // com.google.android.gms.games.Player
    public final int zza() {
        return getInteger(this.zza.zzh);
    }

    @Override // com.google.android.gms.games.Player
    public final long zzb() {
        java.lang.String str = this.zza.zzF;
        if (!hasColumn(str) || hasNull(str)) {
            return -1L;
        }
        return getLong(str);
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzc() {
        if (hasNull(this.zza.zzs)) {
            return null;
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.games.Player
    public final java.lang.String zzd() {
        return getString(this.zza.zzz);
    }

    @Override // com.google.android.gms.games.Player
    public final java.lang.String zze() {
        return getString(this.zza.zzA);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzf() {
        return getBoolean(this.zza.zzy);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzg() {
        return hasColumn(this.zza.zzL) && getBoolean(this.zza.zzL);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzh() {
        return getBoolean(this.zza.zzr);
    }

    @Override // com.google.android.gms.games.Player
    public final void getDisplayName(android.database.CharArrayBuffer charArrayBuffer) {
        copyToBuffer(this.zza.zzb, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Player
    public final void getTitle(android.database.CharArrayBuffer charArrayBuffer) {
        copyToBuffer(this.zza.zzq, charArrayBuffer);
    }
}
