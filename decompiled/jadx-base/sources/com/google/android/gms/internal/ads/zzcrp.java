package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcrp {
    private final com.google.android.gms.internal.ads.zzfca zza;
    private final com.google.android.gms.internal.ads.zzfbo zzb;
    private final java.lang.String zzc;

    public zzcrp(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, java.lang.String str) {
        this.zza = zzfcaVar;
        this.zzb = zzfboVar;
        this.zzc = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public final com.google.android.gms.internal.ads.zzfbo zza() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzfbr zzb() {
        return this.zza.zzb.zzb;
    }

    public final com.google.android.gms.internal.ads.zzfca zzc() {
        return this.zza;
    }

    public final java.lang.String zzd() {
        return this.zzc;
    }
}
