package com.google.android.gms.games.achievement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class AchievementRef extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.achievement.Achievement {
    AchievementRef(com.google.android.gms.common.data.DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object obj) {
        return com.google.android.gms.games.achievement.AchievementEntity.zzf(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.achievement.Achievement freeze() {
        return new com.google.android.gms.games.achievement.AchievementEntity(this);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final java.lang.String getAchievementId() {
        return getString("external_achievement_id");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int getCurrentSteps() {
        com.google.android.gms.common.internal.Asserts.checkState(getInteger("type") == 1);
        return getInteger("current_steps");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final java.lang.String getDescription() {
        return getString("description");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final java.lang.String getFormattedCurrentSteps() {
        com.google.android.gms.common.internal.Asserts.checkState(getInteger("type") == 1);
        return getString("formatted_current_steps");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final java.lang.String getFormattedTotalSteps() {
        com.google.android.gms.common.internal.Asserts.checkState(getInteger("type") == 1);
        return getString("formatted_total_steps");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final long getLastUpdatedTimestamp() {
        return getLong("last_updated_timestamp");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final java.lang.String getName() {
        return getString("name");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final com.google.android.gms.games.Player getPlayer() {
        return (com.google.android.gms.games.Player) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzb());
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final android.net.Uri getRevealedImageUri() {
        return parseUri("revealed_icon_image_uri");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getRevealedImageUrl() {
        return getString("revealed_icon_image_url");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int getState() {
        return getInteger("state");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int getTotalSteps() {
        com.google.android.gms.common.internal.Asserts.checkState(getInteger("type") == 1);
        return getInteger("total_steps");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int getType() {
        return getInteger("type");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final android.net.Uri getUnlockedImageUri() {
        return parseUri("unlocked_icon_image_uri");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getUnlockedImageUrl() {
        return getString("unlocked_icon_image_url");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final long getXpValue() {
        return (!hasColumn("instance_xp_value") || hasNull("instance_xp_value")) ? getLong("definition_xp_value") : getLong("instance_xp_value");
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return com.google.android.gms.games.achievement.AchievementEntity.zzd(this);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.games.achievement.AchievementEntity.zze(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        new com.google.android.gms.games.achievement.AchievementEntity(this).writeToParcel(parcel, i);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final float zza() {
        if (!hasColumn("rarity_percent") || hasNull("rarity_percent")) {
            return -1.0f;
        }
        return getFloat("rarity_percent");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final com.google.android.gms.games.Player zzb() {
        if (hasNull("external_player_id")) {
            return null;
        }
        return new com.google.android.gms.games.PlayerRef(this.mDataHolder, this.mDataRow, null);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final java.lang.String zzc() {
        return getString("external_game_id");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final void getDescription(android.database.CharArrayBuffer charArrayBuffer) {
        copyToBuffer("description", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final void getName(android.database.CharArrayBuffer charArrayBuffer) {
        copyToBuffer("name", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final void getFormattedCurrentSteps(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.internal.Asserts.checkState(getInteger("type") == 1);
        copyToBuffer("formatted_current_steps", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final void getFormattedTotalSteps(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.internal.Asserts.checkState(getInteger("type") == 1);
        copyToBuffer("formatted_total_steps", charArrayBuffer);
    }
}
