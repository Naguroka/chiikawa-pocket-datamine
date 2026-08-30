package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzajb {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final com.google.android.gms.internal.ads.zzab zzg;
    public final int zzh;
    public final long[] zzi;
    public final long[] zzj;
    public final int zzk;
    private final com.google.android.gms.internal.ads.zzajc[] zzl;

    public zzajb(int i, int i2, long j, long j2, long j3, long j4, com.google.android.gms.internal.ads.zzab zzabVar, int i3, com.google.android.gms.internal.ads.zzajc[] zzajcVarArr, int i4, long[] jArr, long[] jArr2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = zzabVar;
        this.zzh = i3;
        this.zzl = zzajcVarArr;
        this.zzk = i4;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    public final com.google.android.gms.internal.ads.zzajb zza(com.google.android.gms.internal.ads.zzab zzabVar) {
        return new com.google.android.gms.internal.ads.zzajb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzabVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }

    public final com.google.android.gms.internal.ads.zzajc zzb(int i) {
        return this.zzl[i];
    }
}
