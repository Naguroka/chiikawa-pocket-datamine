package com.google.android.gms.games.leaderboard;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzb extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.leaderboard.LeaderboardVariant {
    zzb(com.google.android.gms.common.data.DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object obj) {
        return com.google.android.gms.games.leaderboard.LeaderboardVariantEntity.zzf(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.leaderboard.LeaderboardVariant freeze() {
        return new com.google.android.gms.games.leaderboard.LeaderboardVariantEntity(this);
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final int getCollection() {
        return getInteger("collection");
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String getDisplayPlayerRank() {
        return getString("player_display_rank");
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String getDisplayPlayerScore() {
        return getString("player_display_score");
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getNumScores() {
        if (hasNull("total_scores")) {
            return -1L;
        }
        return getLong("total_scores");
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getPlayerRank() {
        if (hasNull("player_rank")) {
            return -1L;
        }
        return getLong("player_rank");
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String getPlayerScoreTag() {
        return getString("player_score_tag");
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getRawPlayerScore() {
        if (hasNull("player_raw_score")) {
            return -1L;
        }
        return getLong("player_raw_score");
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final int getTimeSpan() {
        return getInteger("timespan");
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final boolean hasPlayerInfo() {
        return !hasNull("player_raw_score");
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return com.google.android.gms.games.leaderboard.LeaderboardVariantEntity.zzd(this);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.games.leaderboard.LeaderboardVariantEntity.zze(this);
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String zza() {
        return getString("top_page_token_next");
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String zzb() {
        return getString("window_page_token_next");
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String zzc() {
        return getString("window_page_token_prev");
    }
}
