package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbyb {
    private android.content.Context zza;
    private com.google.android.gms.common.util.Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private com.google.android.gms.internal.ads.zzbyi zzd;

    private zzbyb() {
        throw null;
    }

    /* synthetic */ zzbyb(com.google.android.gms.internal.ads.zzbyd zzbydVar) {
    }

    public final com.google.android.gms.internal.ads.zzbyb zza(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzbyb zzd(com.google.android.gms.internal.ads.zzbyi zzbyiVar) {
        this.zzd = zzbyiVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzbyj zze() {
        com.google.android.gms.internal.ads.zzhez.zzc(this.zza, android.content.Context.class);
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzb, com.google.android.gms.common.util.Clock.class);
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzd, com.google.android.gms.internal.ads.zzbyi.class);
        return new com.google.android.gms.internal.ads.zzbyc(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    public final com.google.android.gms.internal.ads.zzbyb zzb(android.content.Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzbyb zzc(com.google.android.gms.common.util.Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }
}
