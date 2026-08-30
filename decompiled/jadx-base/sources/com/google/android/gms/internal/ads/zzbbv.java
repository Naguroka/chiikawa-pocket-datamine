package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbbv {
    public static int zza(android.content.Context context) {
        return zzf(context, "crash_without_write");
    }

    public static int zzb(android.content.Context context) {
        return zzf(context, "init_without_write");
    }

    public static void zzc(android.content.Context context) {
        zzg(context, "crash_without_write");
    }

    public static void zzd(android.content.Context context) {
        zzg(context, "init_without_write");
    }

    public static void zze(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.applovin.sdk.AppLovinMediationProvider.ADMOB, 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    private static int zzf(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.applovin.sdk.AppLovinMediationProvider.ADMOB, 0);
        if (sharedPreferences == null) {
            return 0;
        }
        try {
            return sharedPreferences.getInt(str, 0);
        } catch (java.lang.ClassCastException unused) {
            return 0;
        }
    }

    private static void zzg(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.applovin.sdk.AppLovinMediationProvider.ADMOB, 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt(str, zzf(context, str) + 1).commit();
    }
}
