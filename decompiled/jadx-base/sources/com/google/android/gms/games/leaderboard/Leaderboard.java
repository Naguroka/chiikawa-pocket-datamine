package com.google.android.gms.games.leaderboard;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface Leaderboard extends com.google.android.gms.common.data.Freezable<com.google.android.gms.games.leaderboard.Leaderboard> {
    public static final int SCORE_ORDER_LARGER_IS_BETTER = 1;
    public static final int SCORE_ORDER_SMALLER_IS_BETTER = 0;

    java.lang.String getDisplayName();

    void getDisplayName(android.database.CharArrayBuffer charArrayBuffer);

    android.net.Uri getIconImageUri();

    @java.lang.Deprecated
    java.lang.String getIconImageUrl();

    java.lang.String getLeaderboardId();

    int getScoreOrder();

    java.util.ArrayList<com.google.android.gms.games.leaderboard.LeaderboardVariant> getVariants();

    com.google.android.gms.games.Game zza();
}
