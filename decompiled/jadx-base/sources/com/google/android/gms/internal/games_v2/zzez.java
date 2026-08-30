package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzez {
    private static final com.google.android.gms.common.internal.GmsLogger zza = new com.google.android.gms.common.internal.GmsLogger("Games");

    public static void zza(java.lang.String str, java.lang.String str2) {
        zza.d(zzi(str), str2);
    }

    public static void zzb(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        zza.d(zzi("GamesApiManager"), "Authentication task failed", th);
    }

    public static void zzc(java.lang.String str, java.lang.String str2) {
        zza.e(zzi(str), str2);
    }

    public static void zzd(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        zza.e(zzi(str), str2, th);
    }

    public static void zze(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        zza.i(zzi("SnapshotContentsEntity"), "Failed to write snapshot data", th);
    }

    public static void zzf(java.lang.String str, java.lang.String str2) {
        zza.v(zzi(str), str2);
    }

    public static void zzg(java.lang.String str, java.lang.String str2) {
        zza.w(zzi(str), str2);
    }

    public static void zzh(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        zza.w(zzi(str), str2, th);
    }

    private static java.lang.String zzi(java.lang.String str) {
        return java.lang.String.format("%s[%s]", "PlayGamesServices", str);
    }
}
