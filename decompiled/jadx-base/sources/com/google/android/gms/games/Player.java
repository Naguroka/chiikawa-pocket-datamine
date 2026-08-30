package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface Player extends com.google.android.gms.common.data.Freezable<com.google.android.gms.games.Player>, android.os.Parcelable {
    public static final long CURRENT_XP_UNKNOWN = -1;
    public static final long TIMESTAMP_UNKNOWN = -1;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FriendsListVisibilityStatus {
        public static final int FEATURE_UNAVAILABLE = 3;
        public static final int REQUEST_REQUIRED = 2;
        public static final int UNKNOWN = 0;
        public static final int VISIBLE = 1;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PlayerFriendStatus {
        public static final int FRIEND = 4;
        public static final int NO_RELATIONSHIP = 0;
        public static final int UNKNOWN = -1;
    }

    android.net.Uri getBannerImageLandscapeUri();

    @java.lang.Deprecated
    java.lang.String getBannerImageLandscapeUrl();

    android.net.Uri getBannerImagePortraitUri();

    @java.lang.Deprecated
    java.lang.String getBannerImagePortraitUrl();

    com.google.android.gms.games.CurrentPlayerInfo getCurrentPlayerInfo();

    java.lang.String getDisplayName();

    void getDisplayName(android.database.CharArrayBuffer charArrayBuffer);

    android.net.Uri getHiResImageUri();

    @java.lang.Deprecated
    java.lang.String getHiResImageUrl();

    android.net.Uri getIconImageUri();

    @java.lang.Deprecated
    java.lang.String getIconImageUrl();

    @java.lang.Deprecated
    long getLastPlayedWithTimestamp();

    com.google.android.gms.games.PlayerLevelInfo getLevelInfo();

    java.lang.String getPlayerId();

    com.google.android.gms.games.PlayerRelationshipInfo getRelationshipInfo();

    long getRetrievedTimestamp();

    java.lang.String getTitle();

    void getTitle(android.database.CharArrayBuffer charArrayBuffer);

    boolean hasHiResImage();

    boolean hasIconImage();

    @java.lang.Deprecated
    int zza();

    long zzb();

    com.google.android.gms.games.internal.player.zza zzc();

    java.lang.String zzd();

    java.lang.String zze();

    boolean zzf();

    boolean zzg();

    boolean zzh();
}
