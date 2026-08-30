package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface PlayersClient {
    public static final java.lang.String EXTRA_PLAYER_SEARCH_RESULTS = "player_search_results";

    com.google.android.gms.tasks.Task<android.content.Intent> getCompareProfileIntent(com.google.android.gms.games.Player player);

    com.google.android.gms.tasks.Task<android.content.Intent> getCompareProfileIntent(java.lang.String str);

    com.google.android.gms.tasks.Task<android.content.Intent> getCompareProfileIntentWithAlternativeNameHints(java.lang.String str, java.lang.String str2, java.lang.String str3);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.Player> getCurrentPlayer();

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.Player>> getCurrentPlayer(boolean z);

    com.google.android.gms.tasks.Task<java.lang.String> getCurrentPlayerId();

    com.google.android.gms.tasks.Task<android.content.Intent> getPlayerSearchIntent();

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.PlayerBuffer>> loadFriends(int i, boolean z);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.PlayerBuffer>> loadMoreFriends(int i);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.PlayerBuffer>> loadMoreRecentlyPlayedWithPlayers(int i);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.Player>> loadPlayer(java.lang.String str);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.Player>> loadPlayer(java.lang.String str, boolean z);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.PlayerBuffer>> loadRecentlyPlayedWithPlayers(int i, boolean z);
}
