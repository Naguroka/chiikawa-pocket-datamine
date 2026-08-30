package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfjp {
    private final com.google.android.gms.internal.ads.zzdrw zza;

    zzfjp(com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = zzdrwVar;
    }

    private final void zzg(com.google.android.gms.ads.AdFormat adFormat, java.util.Optional optional, java.lang.String str, long j, java.util.Optional optional2) {
        final com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = this.zza.zza();
        zzdrvVarZza.zzb(str, java.lang.Long.toString(j));
        zzdrvVarZza.zzb(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, adFormat == null ? "unknown" : adFormat.name());
        optional.ifPresent(new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.zzfjn
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                zzdrvVarZza.zzb("action", (java.lang.String) obj);
            }
        });
        optional2.ifPresent(new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.zzfjo
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                zzdrvVarZza.zzb("gqi", (java.lang.String) obj);
            }
        });
        zzdrvVarZza.zzg();
    }

    public final void zza(com.google.android.gms.ads.AdFormat adFormat, long j, java.util.Optional optional, java.util.Optional optional2) {
        final com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = this.zza.zza();
        zzdrvVarZza.zzb("plaac_ts", java.lang.Long.toString(j));
        zzdrvVarZza.zzb(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, adFormat.name());
        zzdrvVarZza.zzb("action", "is_ad_available");
        optional.ifPresent(new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.zzfjl
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                zzdrvVarZza.zzb("plaay_ts", java.lang.Long.toString(((java.lang.Long) obj).longValue()));
            }
        });
        optional2.ifPresent(new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.zzfjm
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                zzdrvVarZza.zzb("gqi", (java.lang.String) obj);
            }
        });
        zzdrvVarZza.zzg();
    }

    public final void zzb(com.google.android.gms.ads.AdFormat adFormat, long j, java.util.Optional optional) {
        zzg(adFormat, java.util.Optional.empty(), "pano_ts", j, optional);
    }

    public final void zzc(com.google.android.gms.ads.AdFormat adFormat, long j) {
        zzg(adFormat, java.util.Optional.empty(), "paeo_ts", j, java.util.Optional.empty());
    }

    public final void zzd(com.google.android.gms.ads.AdFormat adFormat, long j) {
        zzg(adFormat, java.util.Optional.of("poll_ad"), "ppac_ts", j, java.util.Optional.empty());
    }

    public final void zze(com.google.android.gms.ads.AdFormat adFormat, long j, java.util.Optional optional) {
        zzg(adFormat, java.util.Optional.of("poll_ad"), "ppla_ts", j, optional);
    }

    public final void zzf(java.util.Map map, long j) {
        com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = this.zza.zza();
        zzdrvVarZza.zzb("action", "start_preload");
        zzdrvVarZza.zzb("sp_ts", java.lang.Long.toString(j));
        for (com.google.android.gms.ads.AdFormat adFormat : map.keySet()) {
            java.lang.String strValueOf = java.lang.String.valueOf(adFormat.name().toLowerCase(java.util.Locale.ENGLISH));
            zzdrvVarZza.zzb(strValueOf.concat("_count"), java.lang.Integer.toString(((java.lang.Integer) map.get(adFormat)).intValue()));
        }
        zzdrvVarZza.zzg();
    }
}
