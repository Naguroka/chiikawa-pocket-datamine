package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcnu {
    private final com.google.android.gms.internal.ads.zzdrw zza;
    private final com.google.android.gms.internal.ads.zzfca zzb;

    zzcnu(com.google.android.gms.internal.ads.zzdrw zzdrwVar, com.google.android.gms.internal.ads.zzfca zzfcaVar) {
        this.zza = zzdrwVar;
        this.zzb = zzfcaVar;
    }

    public final void zza(long j, int i) {
        java.lang.String str;
        com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = this.zza.zza();
        zzdrvVarZza.zzd(this.zzb.zzb.zzb);
        zzdrvVarZza.zzb("action", "ad_closed");
        zzdrvVarZza.zzb("show_time", java.lang.String.valueOf(j));
        zzdrvVarZza.zzb(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        int i2 = i - 1;
        if (i2 == 0) {
            str = androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS;
        } else if (i2 == 1) {
            str = "bb";
        } else if (i2 == 2) {
            str = "cc";
        } else if (i2 != 3) {
            str = i2 != 4 ? "u" : "ac";
        } else {
            str = "cb";
        }
        zzdrvVarZza.zzb("acr", str);
        zzdrvVarZza.zzg();
    }
}
