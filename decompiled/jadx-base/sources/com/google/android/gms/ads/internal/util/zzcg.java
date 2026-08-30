package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcg {
    private static com.google.android.gms.ads.internal.util.zzcg zzb;
    java.lang.String zza;

    private zzcg() {
    }

    public static com.google.android.gms.ads.internal.util.zzcg zza() {
        if (zzb == null) {
            zzb = new com.google.android.gms.ads.internal.util.zzcg();
        }
        return zzb;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    public final void zzb(android.content.Context context) {
        android.content.SharedPreferences.Editor editorPutString;
        com.google.android.gms.ads.internal.util.zze.zza("Updating user agent.");
        java.lang.String defaultUserAgent = android.webkit.WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.zza)) {
            android.content.Context remoteContext = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(context);
            if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                editorPutString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", android.webkit.WebSettings.getDefaultUserAgent(context));
                if (remoteContext == null) {
                    editorPutString.apply();
                } else {
                    com.google.android.gms.common.util.SharedPreferencesUtils.publishWorldReadableSharedPreferences(context, editorPutString, "admob_user_agent");
                }
            } else if (remoteContext == null) {
                remoteContext = null;
                editorPutString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", android.webkit.WebSettings.getDefaultUserAgent(context));
                if (remoteContext == null) {
                    editorPutString.apply();
                } else {
                    com.google.android.gms.common.util.SharedPreferencesUtils.publishWorldReadableSharedPreferences(context, editorPutString, "admob_user_agent");
                }
            }
            this.zza = defaultUserAgent;
        }
        com.google.android.gms.ads.internal.util.zze.zza("User agent is updated.");
    }
}
