package com.google.android.gms.games.achievement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface Achievement extends com.google.android.gms.common.data.Freezable<com.google.android.gms.games.achievement.Achievement>, android.os.Parcelable {
    public static final int STATE_HIDDEN = 2;
    public static final int STATE_REVEALED = 1;
    public static final int STATE_UNLOCKED = 0;
    public static final int TYPE_INCREMENTAL = 1;
    public static final int TYPE_STANDARD = 0;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AchievementState {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AchievementType {
    }

    java.lang.String getAchievementId();

    int getCurrentSteps();

    java.lang.String getDescription();

    void getDescription(android.database.CharArrayBuffer charArrayBuffer);

    java.lang.String getFormattedCurrentSteps();

    void getFormattedCurrentSteps(android.database.CharArrayBuffer charArrayBuffer);

    java.lang.String getFormattedTotalSteps();

    void getFormattedTotalSteps(android.database.CharArrayBuffer charArrayBuffer);

    long getLastUpdatedTimestamp();

    java.lang.String getName();

    void getName(android.database.CharArrayBuffer charArrayBuffer);

    com.google.android.gms.games.Player getPlayer();

    android.net.Uri getRevealedImageUri();

    @java.lang.Deprecated
    java.lang.String getRevealedImageUrl();

    int getState();

    int getTotalSteps();

    int getType();

    android.net.Uri getUnlockedImageUri();

    @java.lang.Deprecated
    java.lang.String getUnlockedImageUrl();

    long getXpValue();

    float zza();

    com.google.android.gms.games.Player zzb();

    java.lang.String zzc();
}
