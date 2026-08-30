package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class GameEntity extends com.google.android.gms.games.internal.GamesDowngradeableSafeParcel implements com.google.android.gms.games.Game {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.GameEntity> CREATOR = new com.google.android.gms.games.zze();
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final android.net.Uri zzg;
    private final android.net.Uri zzh;
    private final android.net.Uri zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final java.lang.String zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final boolean zzq;
    private final java.lang.String zzr;
    private final java.lang.String zzs;
    private final java.lang.String zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final java.lang.String zzx;
    private final boolean zzy;

    public GameEntity(com.google.android.gms.games.Game game) {
        this.zza = game.getApplicationId();
        this.zzc = game.getPrimaryCategory();
        this.zzd = game.getSecondaryCategory();
        this.zze = game.getDescription();
        this.zzf = game.getDeveloperName();
        this.zzb = game.getDisplayName();
        this.zzg = game.getIconImageUri();
        this.zzr = game.getIconImageUrl();
        this.zzh = game.getHiResImageUri();
        this.zzs = game.getHiResImageUrl();
        this.zzi = game.getFeaturedImageUri();
        this.zzt = game.getFeaturedImageUrl();
        this.zzj = game.zze();
        this.zzk = game.zzc();
        this.zzl = game.zza();
        this.zzm = 1;
        this.zzn = game.getAchievementTotalCount();
        this.zzo = game.getLeaderboardCount();
        this.zzp = game.zzf();
        this.zzq = game.zzg();
        this.zzu = game.zzd();
        this.zzv = game.zzb();
        this.zzw = game.areSnapshotsEnabled();
        this.zzx = game.getThemeColor();
        this.zzy = game.hasGamepadSupport();
    }

    static int zzh(com.google.android.gms.games.Game game) {
        return com.google.android.gms.common.internal.Objects.hashCode(game.getApplicationId(), game.getDisplayName(), game.getPrimaryCategory(), game.getSecondaryCategory(), game.getDescription(), game.getDeveloperName(), game.getIconImageUri(), game.getHiResImageUri(), game.getFeaturedImageUri(), java.lang.Boolean.valueOf(game.zze()), java.lang.Boolean.valueOf(game.zzc()), game.zza(), java.lang.Integer.valueOf(game.getAchievementTotalCount()), java.lang.Integer.valueOf(game.getLeaderboardCount()), java.lang.Boolean.valueOf(game.zzf()), java.lang.Boolean.valueOf(game.zzg()), java.lang.Boolean.valueOf(game.zzd()), java.lang.Boolean.valueOf(game.zzb()), java.lang.Boolean.valueOf(game.areSnapshotsEnabled()), game.getThemeColor(), java.lang.Boolean.valueOf(game.hasGamepadSupport()));
    }

    static java.lang.String zzj(com.google.android.gms.games.Game game) {
        return com.google.android.gms.common.internal.Objects.toStringHelper(game).add("ApplicationId", game.getApplicationId()).add("DisplayName", game.getDisplayName()).add("PrimaryCategory", game.getPrimaryCategory()).add("SecondaryCategory", game.getSecondaryCategory()).add("Description", game.getDescription()).add("DeveloperName", game.getDeveloperName()).add("IconImageUri", game.getIconImageUri()).add("IconImageUrl", game.getIconImageUrl()).add("HiResImageUri", game.getHiResImageUri()).add("HiResImageUrl", game.getHiResImageUrl()).add("FeaturedImageUri", game.getFeaturedImageUri()).add("FeaturedImageUrl", game.getFeaturedImageUrl()).add("PlayEnabledGame", java.lang.Boolean.valueOf(game.zze())).add("InstanceInstalled", java.lang.Boolean.valueOf(game.zzc())).add("InstancePackageName", game.zza()).add("AchievementTotalCount", java.lang.Integer.valueOf(game.getAchievementTotalCount())).add("LeaderboardCount", java.lang.Integer.valueOf(game.getLeaderboardCount())).add("AreSnapshotsEnabled", java.lang.Boolean.valueOf(game.areSnapshotsEnabled())).add("ThemeColor", game.getThemeColor()).add("HasGamepadSupport", java.lang.Boolean.valueOf(game.hasGamepadSupport())).toString();
    }

    static boolean zzm(com.google.android.gms.games.Game game, java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        com.google.android.gms.games.Game game2 = (com.google.android.gms.games.Game) obj;
        return com.google.android.gms.common.internal.Objects.equal(game2.getApplicationId(), game.getApplicationId()) && com.google.android.gms.common.internal.Objects.equal(game2.getDisplayName(), game.getDisplayName()) && com.google.android.gms.common.internal.Objects.equal(game2.getPrimaryCategory(), game.getPrimaryCategory()) && com.google.android.gms.common.internal.Objects.equal(game2.getSecondaryCategory(), game.getSecondaryCategory()) && com.google.android.gms.common.internal.Objects.equal(game2.getDescription(), game.getDescription()) && com.google.android.gms.common.internal.Objects.equal(game2.getDeveloperName(), game.getDeveloperName()) && com.google.android.gms.common.internal.Objects.equal(game2.getIconImageUri(), game.getIconImageUri()) && com.google.android.gms.common.internal.Objects.equal(game2.getHiResImageUri(), game.getHiResImageUri()) && com.google.android.gms.common.internal.Objects.equal(game2.getFeaturedImageUri(), game.getFeaturedImageUri()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(game2.zze()), java.lang.Boolean.valueOf(game.zze())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(game2.zzc()), java.lang.Boolean.valueOf(game.zzc())) && com.google.android.gms.common.internal.Objects.equal(game2.zza(), game.zza()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(game2.getAchievementTotalCount()), java.lang.Integer.valueOf(game.getAchievementTotalCount())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(game2.getLeaderboardCount()), java.lang.Integer.valueOf(game.getLeaderboardCount())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(game2.zzf()), java.lang.Boolean.valueOf(game.zzf())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(game2.zzg()), java.lang.Boolean.valueOf(game.zzg())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(game2.zzd()), java.lang.Boolean.valueOf(game.zzd())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(game2.zzb()), java.lang.Boolean.valueOf(game.zzb())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(game2.areSnapshotsEnabled()), java.lang.Boolean.valueOf(game.areSnapshotsEnabled())) && com.google.android.gms.common.internal.Objects.equal(game2.getThemeColor(), game.getThemeColor()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(game2.hasGamepadSupport()), java.lang.Boolean.valueOf(game.hasGamepadSupport()));
    }

    @Override // com.google.android.gms.games.Game
    public boolean areSnapshotsEnabled() {
        return this.zzw;
    }

    public boolean equals(java.lang.Object obj) {
        return zzm(this, obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public com.google.android.gms.games.Game freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.Game freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.Game
    public int getAchievementTotalCount() {
        return this.zzn;
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getApplicationId() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getDescription() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.Game
    public void getDescription(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zze, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getDeveloperName() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.Game
    public void getDeveloperName(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zzf, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getDisplayName() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.Game
    public void getDisplayName(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zzb, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Game
    public android.net.Uri getFeaturedImageUri() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getFeaturedImageUrl() {
        return this.zzt;
    }

    @Override // com.google.android.gms.games.Game
    public android.net.Uri getHiResImageUri() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getHiResImageUrl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.games.Game
    public android.net.Uri getIconImageUri() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getIconImageUrl() {
        return this.zzr;
    }

    @Override // com.google.android.gms.games.Game
    public int getLeaderboardCount() {
        return this.zzo;
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getPrimaryCategory() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getSecondaryCategory() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getThemeColor() {
        return this.zzx;
    }

    @Override // com.google.android.gms.games.Game
    public boolean hasGamepadSupport() {
        return this.zzy;
    }

    public int hashCode() {
        return zzh(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    public java.lang.String toString() {
        return zzj(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        if (shouldDowngrade()) {
            parcel.writeString(this.zza);
            parcel.writeString(this.zzb);
            parcel.writeString(this.zzc);
            parcel.writeString(this.zzd);
            parcel.writeString(this.zze);
            parcel.writeString(this.zzf);
            android.net.Uri uri = this.zzg;
            parcel.writeString(uri == null ? null : uri.toString());
            android.net.Uri uri2 = this.zzh;
            parcel.writeString(uri2 == null ? null : uri2.toString());
            android.net.Uri uri3 = this.zzi;
            parcel.writeString(uri3 != null ? uri3.toString() : null);
            parcel.writeInt(this.zzj ? 1 : 0);
            parcel.writeInt(this.zzk ? 1 : 0);
            parcel.writeString(this.zzl);
            parcel.writeInt(this.zzm);
            parcel.writeInt(this.zzn);
            parcel.writeInt(this.zzo);
            return;
        }
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getApplicationId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getPrimaryCategory(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getSecondaryCategory(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getDescription(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getDeveloperName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, getIconImageUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, getHiResImageUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, getFeaturedImageUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 11, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, this.zzl, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 13, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 14, getAchievementTotalCount());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 15, getLeaderboardCount());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 16, this.zzp);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 17, this.zzq);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 18, getIconImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 19, getHiResImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 20, getFeaturedImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 21, this.zzu);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 22, this.zzv);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 23, areSnapshotsEnabled());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 24, getThemeColor(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 25, hasGamepadSupport());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String zza() {
        return this.zzl;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzb() {
        return this.zzv;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzc() {
        return this.zzk;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzd() {
        return this.zzu;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zze() {
        return this.zzj;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzf() {
        return this.zzp;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzg() {
        return this.zzq;
    }

    GameEntity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, android.net.Uri uri, android.net.Uri uri2, android.net.Uri uri3, boolean z, boolean z2, java.lang.String str7, int i, int i2, int i3, boolean z3, boolean z4, java.lang.String str8, java.lang.String str9, java.lang.String str10, boolean z5, boolean z6, boolean z7, java.lang.String str11, boolean z8) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = uri;
        this.zzr = str8;
        this.zzh = uri2;
        this.zzs = str9;
        this.zzi = uri3;
        this.zzt = str10;
        this.zzj = z;
        this.zzk = z2;
        this.zzl = str7;
        this.zzm = i;
        this.zzn = i2;
        this.zzo = i3;
        this.zzp = z3;
        this.zzq = z4;
        this.zzu = z5;
        this.zzv = z6;
        this.zzw = z7;
        this.zzx = str11;
        this.zzy = z8;
    }
}
