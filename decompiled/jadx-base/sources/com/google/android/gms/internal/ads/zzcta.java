package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcta implements com.google.android.gms.internal.ads.zzdbg, com.google.android.gms.internal.ads.zzcxh {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzctc zzb;
    private final com.google.android.gms.internal.ads.zzfcj zzc;
    private final java.lang.String zzd;

    zzcta(com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzctc zzctcVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, java.lang.String str) {
        this.zza = clock;
        this.zzb = zzctcVar;
        this.zzc = zzfcjVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zza() {
        this.zzb.zze(this.zzd, this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        com.google.android.gms.common.util.Clock clock = this.zza;
        this.zzb.zzd(this.zzc.zzf, this.zzd, clock.elapsedRealtime());
    }
}
