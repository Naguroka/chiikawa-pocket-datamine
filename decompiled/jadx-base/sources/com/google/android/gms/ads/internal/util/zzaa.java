package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzaa {
    /* synthetic */ zzaa(com.google.android.gms.ads.internal.util.zzz zzzVar) {
    }

    public android.webkit.CookieManager zza(android.content.Context context) {
        throw null;
    }

    public android.webkit.WebResourceResponse zzb(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.util.Map map, java.io.InputStream inputStream) {
        throw null;
    }

    public com.google.android.gms.internal.ads.zzcff zzc(com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzbbj zzbbjVar, boolean z, com.google.android.gms.internal.ads.zzebv zzebvVar) {
        throw null;
    }

    public boolean zzd(android.app.Activity activity, android.content.res.Configuration configuration) {
        return false;
    }

    public android.content.Intent zzf(android.app.Activity activity) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public com.google.android.gms.internal.ads.zzbbq.zzq zzg(android.content.Context context, android.telephony.TelephonyManager telephonyManager) {
        return com.google.android.gms.internal.ads.zzbbq.zzq.ENUM_UNKNOWN;
    }

    public void zzh(android.content.Context context, java.lang.String str, java.lang.String str2) {
    }

    public boolean zzi(android.content.Context context, java.lang.String str) {
        return false;
    }

    public int zzj(android.media.AudioManager audioManager) {
        return 0;
    }

    public void zzk(android.app.Activity activity) {
    }

    public int zzm(android.content.Context context) {
        return ((android.telephony.TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
