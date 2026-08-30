package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface GamesSignInClient {
    com.google.android.gms.tasks.Task<com.google.android.gms.games.AuthenticationResult> isAuthenticated();

    com.google.android.gms.tasks.Task<java.lang.String> requestServerSideAccess(java.lang.String str, boolean z);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AuthenticationResult> signIn();
}
