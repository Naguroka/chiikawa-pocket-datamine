package com.google.android.gms.games.leaderboard;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface LeaderboardScore extends com.google.android.gms.common.data.Freezable<com.google.android.gms.games.leaderboard.LeaderboardScore> {
    public static final int LEADERBOARD_RANK_UNKNOWN = -1;

    java.lang.String getDisplayRank();

    void getDisplayRank(android.database.CharArrayBuffer charArrayBuffer);

    java.lang.String getDisplayScore();

    void getDisplayScore(android.database.CharArrayBuffer charArrayBuffer);

    long getRank();

    long getRawScore();

    com.google.android.gms.games.Player getScoreHolder();

    java.lang.String getScoreHolderDisplayName();

    void getScoreHolderDisplayName(android.database.CharArrayBuffer charArrayBuffer);

    android.net.Uri getScoreHolderHiResImageUri();

    @java.lang.Deprecated
    java.lang.String getScoreHolderHiResImageUrl();

    android.net.Uri getScoreHolderIconImageUri();

    @java.lang.Deprecated
    java.lang.String getScoreHolderIconImageUrl();

    java.lang.String getScoreTag();

    long getTimestampMillis();
}
