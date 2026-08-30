package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbce {
    public static final android.content.SharedPreferences zza(android.content.Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (java.lang.IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
            return null;
        }
    }
}
