package com.google.android.gms.games.leaderboard;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class LeaderboardScoreRef extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.leaderboard.LeaderboardScore {
    private final com.google.android.gms.games.PlayerRef zza;

    public LeaderboardScoreRef(com.google.android.gms.common.data.DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.zza = new com.google.android.gms.games.PlayerRef(dataHolder, i, null);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object obj) {
        return com.google.android.gms.games.leaderboard.LeaderboardScoreEntity.zzc(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.leaderboard.LeaderboardScore freeze() {
        return new com.google.android.gms.games.leaderboard.LeaderboardScoreEntity(this);
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final java.lang.String getDisplayRank() {
        return getString("display_rank");
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final java.lang.String getDisplayScore() {
        return getString("display_score");
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final long getRank() {
        return getLong("rank");
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final long getRawScore() {
        return getLong("raw_score");
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final com.google.android.gms.games.Player getScoreHolder() {
        if (hasNull("external_player_id")) {
            return null;
        }
        return this.zza;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final java.lang.String getScoreHolderDisplayName() {
        return hasNull("external_player_id") ? getString("default_display_name") : this.zza.getDisplayName();
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final android.net.Uri getScoreHolderHiResImageUri() {
        if (hasNull("external_player_id")) {
            return null;
        }
        return this.zza.getHiResImageUri();
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public java.lang.String getScoreHolderHiResImageUrl() {
        if (hasNull("external_player_id")) {
            return null;
        }
        return this.zza.getHiResImageUrl();
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final android.net.Uri getScoreHolderIconImageUri() {
        return hasNull("external_player_id") ? parseUri("default_display_image_uri") : this.zza.getIconImageUri();
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public java.lang.String getScoreHolderIconImageUrl() {
        return hasNull("external_player_id") ? getString("default_display_image_url") : this.zza.getIconImageUrl();
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final java.lang.String getScoreTag() {
        return getString("score_tag");
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final long getTimestampMillis() {
        return getLong("achieved_timestamp");
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return com.google.android.gms.games.leaderboard.LeaderboardScoreEntity.zza(this);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.games.leaderboard.LeaderboardScoreEntity.zzb(this);
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final void getDisplayRank(android.database.CharArrayBuffer charArrayBuffer) {
        copyToBuffer("display_rank", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final void getDisplayScore(android.database.CharArrayBuffer charArrayBuffer) {
        copyToBuffer("display_score", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final void getScoreHolderDisplayName(android.database.CharArrayBuffer charArrayBuffer) {
        if (hasNull("external_player_id")) {
            copyToBuffer("default_display_name", charArrayBuffer);
        } else {
            this.zza.getDisplayName(charArrayBuffer);
        }
    }
}
