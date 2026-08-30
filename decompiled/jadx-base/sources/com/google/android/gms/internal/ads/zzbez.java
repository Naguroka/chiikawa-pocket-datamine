package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbez {
    public static final com.google.android.gms.internal.ads.zzbdv zza = com.google.android.gms.internal.ads.zzbdv.zzd("gads:trustless_token_for_decagon:enabled", true);
    public static final com.google.android.gms.internal.ads.zzbdv zzb;

    static {
        com.google.android.gms.internal.ads.zzbdv.zzd("gads:invalidate_token_at_refresh_start", true);
        com.google.android.gms.internal.ads.zzbdv.zzd("gms:expose_token_for_gma:enabled", true);
        com.google.android.gms.internal.ads.zzbdv.zzd("gads:referesh_rate_limit", false);
        zzb = com.google.android.gms.internal.ads.zzbdv.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        com.google.android.gms.internal.ads.zzbdv.zzd("gads:token_anonymization:enabled", true);
        com.google.android.gms.internal.ads.zzbdv.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}
