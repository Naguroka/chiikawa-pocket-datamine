package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzkl {
    public final com.google.android.gms.internal.ads.zzue zza;
    public final java.lang.Object zzb;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public com.google.android.gms.internal.ads.zzkm zzg;
    public boolean zzh;
    private final com.google.android.gms.internal.ads.zzlm[] zzj;
    private final com.google.android.gms.internal.ads.zzyb zzk;
    private final com.google.android.gms.internal.ads.zzla zzl;
    private com.google.android.gms.internal.ads.zzkl zzm;
    private com.google.android.gms.internal.ads.zzyc zzo;
    private long zzp;
    private com.google.android.gms.internal.ads.zzwj zzn = com.google.android.gms.internal.ads.zzwj.zza;
    public final com.google.android.gms.internal.ads.zzvy[] zzc = new com.google.android.gms.internal.ads.zzvy[2];
    private final boolean[] zzi = new boolean[2];

    public zzkl(com.google.android.gms.internal.ads.zzlm[] zzlmVarArr, long j, com.google.android.gms.internal.ads.zzyb zzybVar, com.google.android.gms.internal.ads.zzyk zzykVar, com.google.android.gms.internal.ads.zzla zzlaVar, com.google.android.gms.internal.ads.zzkm zzkmVar, com.google.android.gms.internal.ads.zzyc zzycVar, long j2) {
        this.zzj = zzlmVarArr;
        this.zzp = j;
        this.zzk = zzybVar;
        this.zzl = zzlaVar;
        this.zzb = zzkmVar.zza.zza;
        this.zzg = zzkmVar;
        this.zzo = zzycVar;
        com.google.android.gms.internal.ads.zzug zzugVar = zzkmVar.zza;
        long j3 = zzkmVar.zzb;
        long j4 = zzkmVar.zzd;
        com.google.android.gms.internal.ads.zzue zzueVarZzp = zzlaVar.zzp(zzugVar, zzykVar, j3);
        this.zza = j4 != androidx.media3.common.C.TIME_UNSET ? new com.google.android.gms.internal.ads.zztk(zzueVarZzp, true, 0L, j4) : zzueVarZzp;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzyc zzycVar = this.zzo;
            if (i >= zzycVar.zza) {
                return;
            }
            zzycVar.zzb(i);
            com.google.android.gms.internal.ads.zzxv zzxvVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzyc zzycVar = this.zzo;
            if (i >= zzycVar.zza) {
                return;
            }
            zzycVar.zzb(i);
            com.google.android.gms.internal.ads.zzxv zzxvVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza(com.google.android.gms.internal.ads.zzyc zzycVar, long j, boolean z) {
        return zzb(zzycVar, j, false, new boolean[2]);
    }

    public final long zzb(com.google.android.gms.internal.ads.zzyc zzycVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzycVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z || !zzycVar.zza(this.zzo, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzlm[] zzlmVarArr = this.zzj;
            if (i2 >= 2) {
                break;
            }
            zzlmVarArr[i2].zzb();
            i2++;
        }
        zzu();
        this.zzo = zzycVar;
        zzv();
        long jZzf = this.zza.zzf(zzycVar.zzc, this.zzi, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzlm[] zzlmVarArr2 = this.zzj;
            if (i3 >= 2) {
                break;
            }
            zzlmVarArr2[i3].zzb();
            i3++;
        }
        this.zzf = false;
        int i4 = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzvy[] zzvyVarArr = this.zzc;
            if (i4 >= 2) {
                return jZzf;
            }
            if (zzvyVarArr[i4] != null) {
                com.google.android.gms.internal.ads.zzcw.zzf(zzycVar.zzb(i4));
                this.zzj[i4].zzb();
                this.zzf = true;
            } else {
                com.google.android.gms.internal.ads.zzcw.zzf(zzycVar.zzc[i4] == null);
            }
            i4++;
        }
    }

    public final long zzc() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long jZzb = this.zzf ? this.zza.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.zzg.zze : jZzb;
    }

    public final long zzd() {
        if (this.zze) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzp;
    }

    public final long zzf() {
        return this.zzg.zzb + this.zzp;
    }

    public final com.google.android.gms.internal.ads.zzkl zzg() {
        return this.zzm;
    }

    public final com.google.android.gms.internal.ads.zzwj zzh() {
        return this.zzn;
    }

    public final com.google.android.gms.internal.ads.zzyc zzi() {
        return this.zzo;
    }

    public final com.google.android.gms.internal.ads.zzyc zzj(float f, com.google.android.gms.internal.ads.zzbq zzbqVar, boolean z) throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzyc zzycVarZzo = this.zzk.zzo(this.zzj, this.zzn, this.zzg.zza, zzbqVar);
        for (int i = 0; i < zzycVarZzo.zza; i++) {
            boolean z2 = true;
            if (zzycVarZzo.zzb(i)) {
                if (zzycVarZzo.zzc[i] == null) {
                    this.zzj[i].zzb();
                    z2 = false;
                }
                com.google.android.gms.internal.ads.zzcw.zzf(z2);
            } else {
                com.google.android.gms.internal.ads.zzcw.zzf(zzycVarZzo.zzc[i] == null);
            }
        }
        for (com.google.android.gms.internal.ads.zzxv zzxvVar : zzycVarZzo.zzc) {
        }
        return zzycVarZzo;
    }

    public final void zzk(com.google.android.gms.internal.ads.zzkj zzkjVar) {
        com.google.android.gms.internal.ads.zzcw.zzf(zzw());
        this.zza.zzo(zzkjVar);
    }

    public final void zzl(float f, com.google.android.gms.internal.ads.zzbq zzbqVar, boolean z) throws com.google.android.gms.internal.ads.zzib {
        this.zze = true;
        this.zzn = this.zza.zzh();
        com.google.android.gms.internal.ads.zzyc zzycVarZzj = zzj(f, zzbqVar, z);
        com.google.android.gms.internal.ads.zzkm zzkmVar = this.zzg;
        long jMax = zzkmVar.zzb;
        long j = zzkmVar.zze;
        if (j != androidx.media3.common.C.TIME_UNSET && jMax >= j) {
            jMax = java.lang.Math.max(0L, j - 1);
        }
        long jZza = zza(zzycVarZzj, jMax, false);
        long j2 = this.zzp;
        com.google.android.gms.internal.ads.zzkm zzkmVar2 = this.zzg;
        this.zzp = j2 + (zzkmVar2.zzb - jZza);
        this.zzg = zzkmVar2.zzb(jZza);
    }

    public final void zzm(com.google.android.gms.internal.ads.zzud zzudVar, long j) {
        this.zzd = true;
        this.zza.zzl(zzudVar, j);
    }

    public final void zzn(long j) {
        com.google.android.gms.internal.ads.zzcw.zzf(zzw());
        if (this.zze) {
            this.zza.zzm(j - this.zzp);
        }
    }

    public final void zzo() {
        zzu();
        com.google.android.gms.internal.ads.zzue zzueVar = this.zza;
        try {
            boolean z = zzueVar instanceof com.google.android.gms.internal.ads.zztk;
            com.google.android.gms.internal.ads.zzla zzlaVar = this.zzl;
            if (z) {
                zzlaVar.zzi(((com.google.android.gms.internal.ads.zztk) zzueVar).zza);
            } else {
                zzlaVar.zzi(zzueVar);
            }
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.internal.ads.zzdo.zzd("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzp(com.google.android.gms.internal.ads.zzkl zzklVar) {
        if (zzklVar == this.zzm) {
            return;
        }
        zzu();
        this.zzm = zzklVar;
        zzv();
    }

    public final void zzq(long j) {
        this.zzp = j;
    }

    public final void zzr() {
        com.google.android.gms.internal.ads.zzue zzueVar = this.zza;
        if (zzueVar instanceof com.google.android.gms.internal.ads.zztk) {
            long j = this.zzg.zzd;
            if (j == androidx.media3.common.C.TIME_UNSET) {
                j = Long.MIN_VALUE;
            }
            ((com.google.android.gms.internal.ads.zztk) zzueVar).zzn(0L, j);
        }
    }

    public final boolean zzs() {
        if (this.zze) {
            return !this.zzf || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zzt() {
        if (this.zze) {
            return zzs() || zzc() - this.zzg.zzb >= androidx.media3.common.C.TIME_UNSET;
        }
        return false;
    }
}
