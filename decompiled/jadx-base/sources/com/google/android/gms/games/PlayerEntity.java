package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class PlayerEntity extends com.google.android.gms.games.internal.GamesDowngradeableSafeParcel implements com.google.android.gms.games.Player {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.PlayerEntity> CREATOR = new com.google.android.gms.games.zzp();
    private java.lang.String zza;
    private java.lang.String zzb;
    private final android.net.Uri zzc;
    private final android.net.Uri zzd;
    private final long zze;
    private final int zzf;
    private final long zzg;
    private final java.lang.String zzh;
    private final java.lang.String zzi;
    private final java.lang.String zzj;
    private final com.google.android.gms.games.internal.player.MostRecentGameInfoEntity zzk;
    private final com.google.android.gms.games.PlayerLevelInfo zzl;
    private final boolean zzm;
    private final boolean zzn;
    private final java.lang.String zzo;
    private final java.lang.String zzp;
    private final android.net.Uri zzq;
    private final java.lang.String zzr;
    private final android.net.Uri zzs;
    private final java.lang.String zzt;
    private long zzu;
    private final com.google.android.gms.games.zzt zzv;
    private final com.google.android.gms.games.zza zzw;
    private boolean zzx;

    public PlayerEntity(com.google.android.gms.games.Player player) {
        this.zza = player.getPlayerId();
        this.zzb = player.getDisplayName();
        this.zzc = player.getIconImageUri();
        this.zzh = player.getIconImageUrl();
        this.zzd = player.getHiResImageUri();
        this.zzi = player.getHiResImageUrl();
        long retrievedTimestamp = player.getRetrievedTimestamp();
        this.zze = retrievedTimestamp;
        this.zzf = player.zza();
        this.zzg = player.getLastPlayedWithTimestamp();
        this.zzj = player.getTitle();
        this.zzm = player.zzh();
        com.google.android.gms.games.internal.player.zza zzaVarZzc = player.zzc();
        this.zzk = zzaVarZzc == null ? null : new com.google.android.gms.games.internal.player.MostRecentGameInfoEntity(zzaVarZzc);
        this.zzl = player.getLevelInfo();
        this.zzn = player.zzf();
        this.zzo = player.zzd();
        this.zzp = player.zze();
        this.zzq = player.getBannerImageLandscapeUri();
        this.zzr = player.getBannerImageLandscapeUrl();
        this.zzs = player.getBannerImagePortraitUri();
        this.zzt = player.getBannerImagePortraitUrl();
        this.zzu = player.zzb();
        com.google.android.gms.games.PlayerRelationshipInfo relationshipInfo = player.getRelationshipInfo();
        this.zzv = relationshipInfo == null ? null : new com.google.android.gms.games.zzt(relationshipInfo.freeze());
        com.google.android.gms.games.CurrentPlayerInfo currentPlayerInfo = player.getCurrentPlayerInfo();
        this.zzw = (com.google.android.gms.games.zza) (currentPlayerInfo != null ? currentPlayerInfo.freeze() : null);
        this.zzx = player.zzg();
        com.google.android.gms.common.internal.Asserts.checkNotNull(this.zza);
        com.google.android.gms.common.internal.Asserts.checkNotNull(this.zzb);
        com.google.android.gms.common.internal.Asserts.checkState(retrievedTimestamp > 0);
    }

    static int zzi(com.google.android.gms.games.Player player) {
        return com.google.android.gms.common.internal.Objects.hashCode(player.getPlayerId(), player.getDisplayName(), java.lang.Boolean.valueOf(player.zzf()), player.getIconImageUri(), player.getHiResImageUri(), java.lang.Long.valueOf(player.getRetrievedTimestamp()), player.getTitle(), player.getLevelInfo(), player.zzd(), player.zze(), player.getBannerImageLandscapeUri(), player.getBannerImagePortraitUri(), java.lang.Long.valueOf(player.zzb()), player.getRelationshipInfo(), player.getCurrentPlayerInfo(), java.lang.Boolean.valueOf(player.zzg()));
    }

    static java.lang.String zzk(com.google.android.gms.games.Player player) {
        com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelperAdd = com.google.android.gms.common.internal.Objects.toStringHelper(player).add("PlayerId", player.getPlayerId()).add("DisplayName", player.getDisplayName()).add("HasDebugAccess", java.lang.Boolean.valueOf(player.zzf())).add("IconImageUri", player.getIconImageUri()).add("IconImageUrl", player.getIconImageUrl()).add("HiResImageUri", player.getHiResImageUri()).add("HiResImageUrl", player.getHiResImageUrl()).add("RetrievedTimestamp", java.lang.Long.valueOf(player.getRetrievedTimestamp())).add("Title", player.getTitle()).add("LevelInfo", player.getLevelInfo()).add("GamerTag", player.zzd()).add("Name", player.zze()).add("BannerImageLandscapeUri", player.getBannerImageLandscapeUri()).add("BannerImageLandscapeUrl", player.getBannerImageLandscapeUrl()).add("BannerImagePortraitUri", player.getBannerImagePortraitUri()).add("BannerImagePortraitUrl", player.getBannerImagePortraitUrl()).add("CurrentPlayerInfo", player.getCurrentPlayerInfo()).add("TotalUnlockedAchievement", java.lang.Long.valueOf(player.zzb()));
        if (player.zzg()) {
            toStringHelperAdd.add("AlwaysAutoSignIn", java.lang.Boolean.valueOf(player.zzg()));
        }
        if (player.getRelationshipInfo() != null) {
            toStringHelperAdd.add("RelationshipInfo", player.getRelationshipInfo());
        }
        return toStringHelperAdd.toString();
    }

    static boolean zzn(com.google.android.gms.games.Player player, java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        com.google.android.gms.games.Player player2 = (com.google.android.gms.games.Player) obj;
        return com.google.android.gms.common.internal.Objects.equal(player2.getPlayerId(), player.getPlayerId()) && com.google.android.gms.common.internal.Objects.equal(player2.getDisplayName(), player.getDisplayName()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(player2.zzf()), java.lang.Boolean.valueOf(player.zzf())) && com.google.android.gms.common.internal.Objects.equal(player2.getIconImageUri(), player.getIconImageUri()) && com.google.android.gms.common.internal.Objects.equal(player2.getHiResImageUri(), player.getHiResImageUri()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(player2.getRetrievedTimestamp()), java.lang.Long.valueOf(player.getRetrievedTimestamp())) && com.google.android.gms.common.internal.Objects.equal(player2.getTitle(), player.getTitle()) && com.google.android.gms.common.internal.Objects.equal(player2.getLevelInfo(), player.getLevelInfo()) && com.google.android.gms.common.internal.Objects.equal(player2.zzd(), player.zzd()) && com.google.android.gms.common.internal.Objects.equal(player2.zze(), player.zze()) && com.google.android.gms.common.internal.Objects.equal(player2.getBannerImageLandscapeUri(), player.getBannerImageLandscapeUri()) && com.google.android.gms.common.internal.Objects.equal(player2.getBannerImagePortraitUri(), player.getBannerImagePortraitUri()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(player2.zzb()), java.lang.Long.valueOf(player.zzb())) && com.google.android.gms.common.internal.Objects.equal(player2.getCurrentPlayerInfo(), player.getCurrentPlayerInfo()) && com.google.android.gms.common.internal.Objects.equal(player2.getRelationshipInfo(), player.getRelationshipInfo()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(player2.zzg()), java.lang.Boolean.valueOf(player.zzg()));
    }

    public boolean equals(java.lang.Object obj) {
        return zzn(this, obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public com.google.android.gms.games.Player freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.Player freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.Player
    public android.net.Uri getBannerImageLandscapeUri() {
        return this.zzq;
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getBannerImageLandscapeUrl() {
        return this.zzr;
    }

    @Override // com.google.android.gms.games.Player
    public android.net.Uri getBannerImagePortraitUri() {
        return this.zzs;
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getBannerImagePortraitUrl() {
        return this.zzt;
    }

    @Override // com.google.android.gms.games.Player
    public com.google.android.gms.games.CurrentPlayerInfo getCurrentPlayerInfo() {
        return this.zzw;
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getDisplayName() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.Player
    public void getDisplayName(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zzb, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Player
    public android.net.Uri getHiResImageUri() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getHiResImageUrl() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.Player
    public android.net.Uri getIconImageUri() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getIconImageUrl() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.Player
    public long getLastPlayedWithTimestamp() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.Player
    public com.google.android.gms.games.PlayerLevelInfo getLevelInfo() {
        return this.zzl;
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getPlayerId() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.Player
    public com.google.android.gms.games.PlayerRelationshipInfo getRelationshipInfo() {
        return this.zzv;
    }

    @Override // com.google.android.gms.games.Player
    public long getRetrievedTimestamp() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getTitle() {
        return this.zzj;
    }

    @Override // com.google.android.gms.games.Player
    public void getTitle(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zzj, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Player
    public boolean hasHiResImage() {
        return getHiResImageUri() != null;
    }

    @Override // com.google.android.gms.games.Player
    public boolean hasIconImage() {
        return getIconImageUri() != null;
    }

    public int hashCode() {
        return zzi(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    public java.lang.String toString() {
        return zzk(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        if (shouldDowngrade()) {
            parcel.writeString(this.zza);
            parcel.writeString(this.zzb);
            android.net.Uri uri = this.zzc;
            parcel.writeString(uri == null ? null : uri.toString());
            android.net.Uri uri2 = this.zzd;
            parcel.writeString(uri2 != null ? uri2.toString() : null);
            parcel.writeLong(this.zze);
            return;
        }
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getPlayerId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getIconImageUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getHiResImageUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, getRetrievedTimestamp());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 7, getLastPlayedWithTimestamp());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, getIconImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, getHiResImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 14, getTitle(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 15, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 16, getLevelInfo(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 18, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 19, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 20, this.zzo, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 21, this.zzp, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 22, getBannerImageLandscapeUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 23, getBannerImageLandscapeUrl(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 24, getBannerImagePortraitUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 25, getBannerImagePortraitUrl(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 29, this.zzu);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 33, getRelationshipInfo(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 35, getCurrentPlayerInfo(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 36, this.zzx);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.games.Player
    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.Player
    public final long zzb() {
        return this.zzu;
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzc() {
        return this.zzk;
    }

    @Override // com.google.android.gms.games.Player
    public final java.lang.String zzd() {
        return this.zzo;
    }

    @Override // com.google.android.gms.games.Player
    public final java.lang.String zze() {
        return this.zzp;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzf() {
        return this.zzn;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzg() {
        return this.zzx;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzh() {
        return this.zzm;
    }

    PlayerEntity(java.lang.String str, java.lang.String str2, android.net.Uri uri, android.net.Uri uri2, long j, int i, long j2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.google.android.gms.games.internal.player.MostRecentGameInfoEntity mostRecentGameInfoEntity, com.google.android.gms.games.PlayerLevelInfo playerLevelInfo, boolean z, boolean z2, java.lang.String str6, java.lang.String str7, android.net.Uri uri3, java.lang.String str8, android.net.Uri uri4, java.lang.String str9, long j3, com.google.android.gms.games.zzt zztVar, com.google.android.gms.games.zza zzaVar, boolean z3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = uri;
        this.zzh = str3;
        this.zzd = uri2;
        this.zzi = str4;
        this.zze = j;
        this.zzf = i;
        this.zzg = j2;
        this.zzj = str5;
        this.zzm = z;
        this.zzk = mostRecentGameInfoEntity;
        this.zzl = playerLevelInfo;
        this.zzn = z2;
        this.zzo = str6;
        this.zzp = str7;
        this.zzq = uri3;
        this.zzr = str8;
        this.zzs = uri4;
        this.zzt = str9;
        this.zzu = j3;
        this.zzv = zztVar;
        this.zzw = zzaVar;
        this.zzx = z3;
    }
}
