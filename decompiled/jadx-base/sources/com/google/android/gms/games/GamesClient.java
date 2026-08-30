package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface GamesClient {
    com.google.android.gms.tasks.Task<android.os.Bundle> getActivationHint();

    com.google.android.gms.tasks.Task<java.lang.String> getAppId();

    com.google.android.gms.tasks.Task<java.lang.String> getCurrentAccountName();

    com.google.android.gms.tasks.Task<android.content.Intent> getSettingsIntent();

    com.google.android.gms.tasks.Task<java.lang.Void> setGravityForPopups(int i);

    com.google.android.gms.tasks.Task<java.lang.Void> setViewForPopups(android.view.View view);
}
