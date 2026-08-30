package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class GameRef extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.Game {
    public GameRef(com.google.android.gms.common.data.DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.games.Game
    public final boolean areSnapshotsEnabled() {
        return getInteger("snapshots_enabled") > 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object obj) {
        return com.google.android.gms.games.GameEntity.zzm(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.Game freeze() {
        return new com.google.android.gms.games.GameEntity(this);
    }

    @Override // com.google.android.gms.games.Game
    public final int getAchievementTotalCount() {
        return getInteger("achievement_total_count");
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String getApplicationId() {
        return getString("external_game_id");
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String getDescription() {
        return getString("game_description");
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String getDeveloperName() {
        return getString("developer_name");
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String getDisplayName() {
        return getString("display_name");
    }

    @Override // com.google.android.gms.games.Game
    public final android.net.Uri getFeaturedImageUri() {
        return parseUri("featured_image_uri");
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getFeaturedImageUrl() {
        return getString("featured_image_url");
    }

    @Override // com.google.android.gms.games.Game
    public final android.net.Uri getHiResImageUri() {
        return parseUri("game_hi_res_image_uri");
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getHiResImageUrl() {
        return getString("game_hi_res_image_url");
    }

    @Override // com.google.android.gms.games.Game
    public final android.net.Uri getIconImageUri() {
        return parseUri("game_icon_image_uri");
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getIconImageUrl() {
        return getString("game_icon_image_url");
    }

    @Override // com.google.android.gms.games.Game
    public final int getLeaderboardCount() {
        return getInteger("leaderboard_count");
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String getPrimaryCategory() {
        return getString("primary_category");
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String getSecondaryCategory() {
        return getString("secondary_category");
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String getThemeColor() {
        return getString("theme_color");
    }

    @Override // com.google.android.gms.games.Game
    public final boolean hasGamepadSupport() {
        return getInteger("gamepad_support") > 0;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return com.google.android.gms.games.GameEntity.zzh(this);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.games.GameEntity.zzj(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        new com.google.android.gms.games.GameEntity(this).writeToParcel(parcel, i);
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String zza() {
        return getString(com.ironsource.y8.h.V);
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzb() {
        return getBoolean("identity_sharing_confirmed");
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzc() {
        return getInteger("installed") > 0;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzd() {
        return getBoolean("muted");
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zze() {
        return getBoolean("play_enabled_game");
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzf() {
        return getInteger("real_time_support") > 0;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzg() {
        return getInteger("turn_based_support") > 0;
    }

    @Override // com.google.android.gms.games.Game
    public final void getDescription(android.database.CharArrayBuffer charArrayBuffer) {
        copyToBuffer("game_description", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Game
    public final void getDeveloperName(android.database.CharArrayBuffer charArrayBuffer) {
        copyToBuffer("developer_name", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Game
    public final void getDisplayName(android.database.CharArrayBuffer charArrayBuffer) {
        copyToBuffer("display_name", charArrayBuffer);
    }
}
