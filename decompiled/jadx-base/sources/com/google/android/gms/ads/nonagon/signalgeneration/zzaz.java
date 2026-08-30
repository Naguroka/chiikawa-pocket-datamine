package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaz {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.ads.zzbyy zzc;

    /* synthetic */ zzaz(com.google.android.gms.ads.nonagon.signalgeneration.zzax zzaxVar, com.google.android.gms.ads.nonagon.signalgeneration.zzay zzayVar) {
        this.zza = zzaxVar.zza;
        this.zzb = zzaxVar.zzb;
        this.zzc = zzaxVar.zzc;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    public final com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza zza() {
        byte b;
        switch (this.zza) {
            case "NATIVE":
                b = 2;
                break;
            case "INTERSTITIAL":
                b = 1;
                break;
            case "REWARDED":
                b = 3;
                break;
            case "BANNER":
                b = 0;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza.BANNER;
        }
        if (b == 1) {
            return com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza.INTERSTITIAL;
        }
        if (b != 2) {
            return b != 3 ? com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza.AD_INITIATER_UNSPECIFIED : com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza.REWARD_BASED_VIDEO_AD;
        }
        return com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza.AD_LOADER;
    }

    final com.google.android.gms.internal.ads.zzbyy zzb() {
        return this.zzc;
    }

    public final java.lang.String zzc() {
        return this.zza.toLowerCase(java.util.Locale.ROOT);
    }

    final java.lang.String zzd() {
        return this.zzb;
    }

    public final java.util.Set zze() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(this.zza.toLowerCase(java.util.Locale.ROOT));
        return hashSet;
    }
}
