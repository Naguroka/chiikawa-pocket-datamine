package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbxz {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzbxx zzb;

    zzbxz(com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzbxx zzbxxVar) {
        this.zza = clock;
        this.zzb = zzbxxVar;
    }

    public static com.google.android.gms.internal.ads.zzbxz zza(android.content.Context context) {
        return com.google.android.gms.internal.ads.zzbyj.zzd(context).zzb();
    }

    public final void zzb(int i, long j) {
        this.zzb.zza(i, j);
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfv zzfvVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }
}
