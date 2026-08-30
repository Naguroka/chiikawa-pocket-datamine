package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaji implements com.google.android.gms.internal.ads.zzajo {
    private final com.google.android.gms.internal.ads.zzajn zza;
    private final long zzb;
    private final long zzc;
    private final com.google.android.gms.internal.ads.zzajt zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaji(com.google.android.gms.internal.ads.zzajt zzajtVar, long j, long j2, long j3, long j4, boolean z) {
        com.google.android.gms.internal.ads.zzcw.zzd(j >= 0 && j2 > j);
        this.zzd = zzajtVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new com.google.android.gms.internal.ads.zzajn();
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzadm zze() {
        com.google.android.gms.internal.ads.zzajh zzajhVar = null;
        if (this.zzf != 0) {
            return new com.google.android.gms.internal.ads.zzajg(this, zzajhVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final void zzg(long j) {
        this.zzh = java.lang.Math.max(0L, java.lang.Math.min(j, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    @Override // com.google.android.gms.internal.ads.zzajo
    public final long zzd(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        long jMax;
        int i = this.zze;
        if (i == 0) {
            long jZzf = zzacoVar.zzf();
            this.zzg = jZzf;
            this.zze = 1;
            long j = this.zzc - 65307;
            if (j > jZzf) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j2 = this.zzi;
                long j3 = this.zzj;
                if (j2 == j3) {
                    jMax = -1;
                } else {
                    long jZzf2 = zzacoVar.zzf();
                    if (this.zza.zzc(zzacoVar, j3)) {
                        this.zza.zzb(zzacoVar, false);
                        zzacoVar.zzj();
                        long j4 = this.zzh;
                        com.google.android.gms.internal.ads.zzajn zzajnVar = this.zza;
                        long j5 = zzajnVar.zzb;
                        long j6 = j4 - j5;
                        int i2 = zzajnVar.zzd + zzajnVar.zze;
                        if (j6 < 0 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.zzj = jZzf2;
                                this.zzl = j5;
                            } else {
                                this.zzi = ((long) i2) + zzacoVar.zzf();
                                this.zzk = j5;
                            }
                            long j7 = this.zzj;
                            long j8 = this.zzi;
                            long j9 = j7 - j8;
                            if (j9 < androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                this.zzj = j8;
                                jMax = j8;
                            } else {
                                jMax = java.lang.Math.max(j8, java.lang.Math.min((zzacoVar.zzf() - (((long) i2) * (j6 <= 0 ? 2L : 1L))) + ((j6 * j9) / (this.zzl - this.zzk)), j7 - 1));
                            }
                        } else {
                            jMax = -1;
                        }
                    } else {
                        jMax = this.zzi;
                        if (jMax == jZzf2) {
                            throw new java.io.IOException("No ogg page can be found.");
                        }
                    }
                }
                if (jMax != -1) {
                    return jMax;
                }
                this.zze = 3;
            } else if (i != 3) {
                return -1L;
            }
            while (true) {
                this.zza.zzc(zzacoVar, -1L);
                this.zza.zzb(zzacoVar, false);
                com.google.android.gms.internal.ads.zzajn zzajnVar2 = this.zza;
                if (zzajnVar2.zzb > this.zzh) {
                    zzacoVar.zzj();
                    this.zze = 4;
                    return -(this.zzk + 2);
                }
                zzacoVar.zzk(zzajnVar2.zzd + zzajnVar2.zze);
                this.zzi = zzacoVar.zzf();
                this.zzk = this.zza.zzb;
            }
        }
        this.zza.zza();
        if (!this.zza.zzc(zzacoVar, -1L)) {
            throw new java.io.EOFException();
        }
        this.zza.zzb(zzacoVar, false);
        com.google.android.gms.internal.ads.zzajn zzajnVar3 = this.zza;
        zzacoVar.zzk(zzajnVar3.zzd + zzajnVar3.zze);
        long j10 = this.zza.zzb;
        while (true) {
            com.google.android.gms.internal.ads.zzajn zzajnVar4 = this.zza;
            if ((zzajnVar4.zza & 4) == 4 || !zzajnVar4.zzc(zzacoVar, -1L) || zzacoVar.zzf() >= this.zzc || !this.zza.zzb(zzacoVar, true)) {
                break;
            }
            com.google.android.gms.internal.ads.zzajn zzajnVar5 = this.zza;
            if (!com.google.android.gms.internal.ads.zzacr.zze(zzacoVar, zzajnVar5.zzd + zzajnVar5.zze)) {
                break;
            }
            j10 = this.zza.zzb;
        }
        this.zzf = j10;
        this.zze = 4;
        return this.zzg;
    }
}
