package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface AchievementsClient {
    com.google.android.gms.tasks.Task<android.content.Intent> getAchievementsIntent();

    void increment(java.lang.String str, int i);

    com.google.android.gms.tasks.Task<java.lang.Boolean> incrementImmediate(java.lang.String str, int i);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.achievement.AchievementBuffer>> load(boolean z);

    void reveal(java.lang.String str);

    com.google.android.gms.tasks.Task<java.lang.Void> revealImmediate(java.lang.String str);

    void setSteps(java.lang.String str, int i);

    com.google.android.gms.tasks.Task<java.lang.Boolean> setStepsImmediate(java.lang.String str, int i);

    void unlock(java.lang.String str);

    com.google.android.gms.tasks.Task<java.lang.Void> unlockImmediate(java.lang.String str);
}
