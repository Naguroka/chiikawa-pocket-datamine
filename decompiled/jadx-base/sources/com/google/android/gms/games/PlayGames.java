package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class PlayGames {
    private PlayGames() {
    }

    public static com.google.android.gms.games.AchievementsClient getAchievementsClient(android.app.Activity activity) {
        com.google.android.gms.internal.games_v2.zzbr.zzb();
        return new com.google.android.gms.internal.games_v2.zzce(com.google.android.gms.internal.games_v2.zzar.zza(com.google.android.gms.internal.games_v2.zzbr.zza()));
    }

    public static com.google.android.gms.games.EventsClient getEventsClient(android.app.Activity activity) {
        com.google.android.gms.internal.games_v2.zzbr.zzb();
        return new com.google.android.gms.internal.games_v2.zzcl(com.google.android.gms.internal.games_v2.zzar.zza(com.google.android.gms.internal.games_v2.zzbr.zza()));
    }

    public static com.google.android.gms.games.GamesSignInClient getGamesSignInClient(android.app.Activity activity) {
        com.google.android.gms.internal.games_v2.zzbr.zzb();
        return new com.google.android.gms.internal.games_v2.zzco(com.google.android.gms.internal.games_v2.zzax.zza(com.google.android.gms.internal.games_v2.zzbr.zza()), com.google.android.gms.internal.games_v2.zzar.zza(com.google.android.gms.internal.games_v2.zzbr.zza()));
    }

    public static com.google.android.gms.games.LeaderboardsClient getLeaderboardsClient(android.app.Activity activity) {
        com.google.android.gms.internal.games_v2.zzbr.zzb();
        return new com.google.android.gms.internal.games_v2.zzdj(com.google.android.gms.internal.games_v2.zzar.zza(com.google.android.gms.internal.games_v2.zzbr.zza()));
    }

    public static com.google.android.gms.games.PlayerStatsClient getPlayerStatsClient(android.app.Activity activity) {
        com.google.android.gms.internal.games_v2.zzbr.zzb();
        return new com.google.android.gms.internal.games_v2.zzdm(com.google.android.gms.internal.games_v2.zzar.zza(com.google.android.gms.internal.games_v2.zzbr.zza()));
    }

    public static com.google.android.gms.games.PlayersClient getPlayersClient(android.app.Activity activity) {
        com.google.android.gms.internal.games_v2.zzbr.zzb();
        return new com.google.android.gms.internal.games_v2.zzef(com.google.android.gms.internal.games_v2.zzar.zza(com.google.android.gms.internal.games_v2.zzbr.zza()));
    }

    public static com.google.android.gms.games.SnapshotsClient getSnapshotsClient(android.app.Activity activity) {
        com.google.android.gms.internal.games_v2.zzbr.zzb();
        return new com.google.android.gms.internal.games_v2.zzey(com.google.android.gms.internal.games_v2.zzar.zza(com.google.android.gms.internal.games_v2.zzbr.zza()));
    }
}
