package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaal {
    private final com.google.android.gms.internal.ads.zzaak zza;
    private final com.google.android.gms.internal.ads.zzaap zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private int zzd = 0;
    private long zze = androidx.media3.common.C.TIME_UNSET;
    private long zzg = androidx.media3.common.C.TIME_UNSET;
    private long zzh = androidx.media3.common.C.TIME_UNSET;
    private float zzj = 1.0f;
    private com.google.android.gms.internal.ads.zzcx zzk = com.google.android.gms.internal.ads.zzcx.zza;

    public zzaal(android.content.Context context, com.google.android.gms.internal.ads.zzaak zzaakVar, long j) {
        this.zza = zzaakVar;
        this.zzb = new com.google.android.gms.internal.ads.zzaap(context);
    }

    private final void zzq(int i) {
        this.zzd = java.lang.Math.min(this.zzd, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r15 > androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r20 >= r24) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        if (r17.zzc != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(long j, long j2, long j3, long j4, boolean z, com.google.android.gms.internal.ads.zzaaj zzaajVar) throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzaaj.zzg(zzaajVar);
        if (this.zze == androidx.media3.common.C.TIME_UNSET) {
            this.zze = j2;
        }
        if (this.zzg != j) {
            this.zzb.zzd(j);
            this.zzg = j;
        }
        long jZzs = (long) ((j - j2) / ((double) this.zzj));
        if (this.zzc) {
            jZzs -= com.google.android.gms.internal.ads.zzei.zzs(this.zzk.zzb()) - j3;
        }
        zzaajVar.zza = jZzs;
        long j5 = zzaajVar.zza;
        boolean z2 = false;
        if (this.zzh == androidx.media3.common.C.TIME_UNSET || this.zzi) {
            int i = this.zzd;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException();
                        }
                        long jZzs2 = com.google.android.gms.internal.ads.zzei.zzs(this.zzk.zzb()) - this.zzf;
                        if (this.zzc) {
                            if (j5 < -30000) {
                            }
                        }
                    }
                }
                return 0;
            }
        }
        if (!this.zzc || j2 == this.zze) {
            return 5;
        }
        long jZzc = this.zzk.zzc();
        zzaajVar.zzb = this.zzb.zza((zzaajVar.zza * 1000) + jZzc);
        zzaajVar.zza = (zzaajVar.zzb - jZzc) / 1000;
        if (this.zzh != androidx.media3.common.C.TIME_UNSET && !this.zzi) {
            z2 = true;
        }
        com.google.android.gms.internal.ads.zzaak zzaakVar = this.zza;
        if (zzaajVar.zza < -500000 && !z && ((com.google.android.gms.internal.ads.zzzp) zzaakVar).zzaT(j2, z2)) {
            return 4;
        }
        if (zzaajVar.zza >= -30000 || z) {
            return zzaajVar.zza > 50000 ? 5 : 1;
        }
        return z2 ? 3 : 2;
    }

    public final void zzb() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc(boolean z) {
        this.zzi = z;
        this.zzh = androidx.media3.common.C.TIME_UNSET;
    }

    public final void zzd() {
        zzq(0);
    }

    public final void zze(boolean z) {
        this.zzd = z ? 1 : 0;
    }

    public final void zzf() {
        zzq(2);
    }

    public final void zzg() {
        this.zzc = true;
        this.zzf = com.google.android.gms.internal.ads.zzei.zzs(this.zzk.zzb());
        this.zzb.zzg();
    }

    public final void zzh() {
        this.zzc = false;
        this.zzh = androidx.media3.common.C.TIME_UNSET;
        this.zzb.zzh();
    }

    public final void zzi() {
        this.zzb.zzf();
        this.zzg = androidx.media3.common.C.TIME_UNSET;
        this.zze = androidx.media3.common.C.TIME_UNSET;
        zzq(1);
        this.zzh = androidx.media3.common.C.TIME_UNSET;
    }

    public final void zzj(int i) {
        this.zzb.zzj(i);
    }

    public final void zzk(com.google.android.gms.internal.ads.zzcx zzcxVar) {
        this.zzk = zzcxVar;
    }

    public final void zzl(float f) {
        this.zzb.zzc(f);
    }

    public final void zzm(android.view.Surface surface) {
        this.zzb.zzi(surface);
        zzq(1);
    }

    public final void zzn(float f) {
        com.google.android.gms.internal.ads.zzcw.zzd(f > 0.0f);
        if (f == this.zzj) {
            return;
        }
        this.zzj = f;
        this.zzb.zze(f);
    }

    public final boolean zzo(boolean z) {
        boolean z2 = true;
        if (z && this.zzd == 3) {
            this.zzh = androidx.media3.common.C.TIME_UNSET;
        } else {
            if (this.zzh == androidx.media3.common.C.TIME_UNSET) {
                return false;
            }
            if (this.zzk.zzb() >= this.zzh) {
                z2 = false;
                this.zzh = androidx.media3.common.C.TIME_UNSET;
            }
        }
        return z2;
    }

    public final boolean zzp() {
        int i = this.zzd;
        this.zzd = 3;
        this.zzf = com.google.android.gms.internal.ads.zzei.zzs(this.zzk.zzb());
        return i != 3;
    }
}
