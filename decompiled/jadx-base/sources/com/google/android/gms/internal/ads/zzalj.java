package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzalj implements com.google.android.gms.internal.ads.zzaka {
    private final com.google.android.gms.internal.ads.zzalc zza;
    private final long[] zzb;
    private final java.util.Map zzc;
    private final java.util.Map zzd;
    private final java.util.Map zze;

    public zzalj(com.google.android.gms.internal.ads.zzalc zzalcVar, java.util.Map map, java.util.Map map2, java.util.Map map3) {
        this.zza = zzalcVar;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = java.util.Collections.unmodifiableMap(map);
        this.zzb = zzalcVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final long zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final java.util.List zzc(long j) {
        return this.zza.zze(j, this.zzc, this.zzd, this.zze);
    }
}
