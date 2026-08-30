package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface GamesMetadataClient {
    com.google.android.gms.tasks.Task<com.google.android.gms.games.Game> getCurrentGame();

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.Game>> loadGame();
}
