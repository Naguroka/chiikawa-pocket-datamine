package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfjg {
    private final long zza;
    private final long zzb;
    private long zze;
    private long zzd = 5;
    private final java.util.Random zzf = new java.util.Random();
    private long zzc = 0;

    public zzfjg(long j, double d, long j2, double d2) {
        this.zza = j;
        this.zzb = j2;
        zzc();
    }

    public final long zza() {
        double d = this.zze;
        double d2 = 0.2d * d;
        long j = (long) (d + d2);
        long j2 = (long) (d - d2);
        return j2 + ((long) (this.zzf.nextDouble() * ((j - j2) + 1)));
    }

    public final void zzb() {
        double d = this.zze;
        this.zze = java.lang.Math.min((long) (d + d), this.zzb);
        this.zzc++;
    }

    public final void zzc() {
        this.zze = this.zza;
        this.zzc = 0L;
    }

    public final synchronized void zzd(int i) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0);
        this.zzd = i;
    }

    public final boolean zze() {
        return this.zzc > java.lang.Math.max(this.zzd, (long) ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzz)).intValue()) && this.zze >= this.zzb;
    }
}
