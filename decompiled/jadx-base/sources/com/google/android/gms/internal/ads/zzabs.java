package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzabs implements com.google.android.gms.internal.ads.zzadm {
    private final com.google.android.gms.internal.ads.zzabv zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzabs(com.google.android.gms.internal.ads.zzabv zzabvVar, long j, long j2, long j3, long j4, long j5, long j6) {
        this.zza = zzabvVar;
        this.zzb = j;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
        this.zzf = j6;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzb;
    }

    public final long zzf(long j) {
        return this.zza.zza(j);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final com.google.android.gms.internal.ads.zzadk zzg(long j) {
        com.google.android.gms.internal.ads.zzadn zzadnVar = new com.google.android.gms.internal.ads.zzadn(j, com.google.android.gms.internal.ads.zzabu.zzf(this.zza.zza(j), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new com.google.android.gms.internal.ads.zzadk(zzadnVar, zzadnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
