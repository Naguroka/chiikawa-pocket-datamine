package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zztk implements com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzud {
    public final com.google.android.gms.internal.ads.zzue zza;
    long zzb;
    private com.google.android.gms.internal.ads.zzud zzc;
    private com.google.android.gms.internal.ads.zztj[] zzd = new com.google.android.gms.internal.ads.zztj[0];
    private long zze = 0;

    public zztk(com.google.android.gms.internal.ads.zzue zzueVar, boolean z, long j, long j2) {
        this.zza = zzueVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zza(long j, com.google.android.gms.internal.ads.zzlp zzlpVar) {
        if (j == 0) {
            return 0L;
        }
        long jMax = java.lang.Math.max(0L, java.lang.Math.min(zzlpVar.zzc, j));
        long j2 = zzlpVar.zzd;
        long j3 = this.zzb;
        long jMax2 = java.lang.Math.max(0L, java.lang.Math.min(j2, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j));
        if (jMax != zzlpVar.zzc || jMax2 != zzlpVar.zzd) {
            zzlpVar = new com.google.android.gms.internal.ads.zzlp(jMax, jMax2);
        }
        return this.zza.zza(j, zzlpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzb < j) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzc < j) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzd() {
        if (zzq()) {
            long j = this.zze;
            this.zze = androidx.media3.common.C.TIME_UNSET;
            long jZzd = zzd();
            return jZzd != androidx.media3.common.C.TIME_UNSET ? jZzd : j;
        }
        long jZzd2 = this.zza.zzd();
        if (jZzd2 == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        com.google.android.gms.internal.ads.zzcw.zzf(jZzd2 >= 0);
        long j2 = this.zzb;
        com.google.android.gms.internal.ads.zzcw.zzf(j2 == Long.MIN_VALUE || jZzd2 <= j2);
        return jZzd2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    @Override // com.google.android.gms.internal.ads.zzue
    public final long zze(long j) {
        this.zze = androidx.media3.common.C.TIME_UNSET;
        boolean z = false;
        for (com.google.android.gms.internal.ads.zztj zztjVar : this.zzd) {
            if (zztjVar != null) {
                zztjVar.zzc();
            }
        }
        long jZze = this.zza.zze(j);
        if (jZze == j) {
            z = true;
        } else if (jZze >= 0) {
            long j2 = this.zzb;
            if (j2 == Long.MIN_VALUE || jZze <= j2) {
                z = true;
            }
        }
        com.google.android.gms.internal.ads.zzcw.zzf(z);
        return jZze;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzf(com.google.android.gms.internal.ads.zzxv[] zzxvVarArr, boolean[] zArr, com.google.android.gms.internal.ads.zzvy[] zzvyVarArr, boolean[] zArr2, long j) {
        int length = zzvyVarArr.length;
        this.zzd = new com.google.android.gms.internal.ads.zztj[length];
        com.google.android.gms.internal.ads.zzvy[] zzvyVarArr2 = new com.google.android.gms.internal.ads.zzvy[length];
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzvy zzvyVar = null;
            if (i >= zzvyVarArr.length) {
                break;
            }
            com.google.android.gms.internal.ads.zztj[] zztjVarArr = this.zzd;
            com.google.android.gms.internal.ads.zztj zztjVar = (com.google.android.gms.internal.ads.zztj) zzvyVarArr[i];
            zztjVarArr[i] = zztjVar;
            if (zztjVar != null) {
                zzvyVar = zztjVar.zza;
            }
            zzvyVarArr2[i] = zzvyVar;
            i++;
        }
        long jZzf = this.zza.zzf(zzxvVarArr, zArr, zzvyVarArr2, zArr2, j);
        long j2 = (zzq() && j == 0) ? 0L : j;
        this.zze = androidx.media3.common.C.TIME_UNSET;
        boolean z = true;
        if (jZzf != j2) {
            if (jZzf >= 0) {
                long j3 = this.zzb;
                if (j3 != Long.MIN_VALUE && jZzf > j3) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        com.google.android.gms.internal.ads.zzcw.zzf(z);
        for (int i2 = 0; i2 < zzvyVarArr.length; i2++) {
            com.google.android.gms.internal.ads.zzvy zzvyVar2 = zzvyVarArr2[i2];
            if (zzvyVar2 == null) {
                this.zzd[i2] = null;
            } else {
                com.google.android.gms.internal.ads.zztj[] zztjVarArr2 = this.zzd;
                com.google.android.gms.internal.ads.zztj zztjVar2 = zztjVarArr2[i2];
                if (zztjVar2 == null || zztjVar2.zza != zzvyVar2) {
                    zztjVarArr2[i2] = new com.google.android.gms.internal.ads.zztj(this, zzvyVar2);
                }
            }
            zzvyVarArr[i2] = this.zzd[i2];
        }
        return jZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzwa zzwaVar) {
        com.google.android.gms.internal.ads.zzud zzudVar = this.zzc;
        zzudVar.getClass();
        zzudVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final com.google.android.gms.internal.ads.zzwj zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzk() throws java.io.IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzl(com.google.android.gms.internal.ads.zzud zzudVar, long j) {
        this.zzc = zzudVar;
        this.zza.zzl(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    public final void zzn(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzo(com.google.android.gms.internal.ads.zzkj zzkjVar) {
        return this.zza.zzo(zzkjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzp() {
        return this.zza.zzp();
    }

    final boolean zzq() {
        return this.zze != androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzud
    public final void zzi(com.google.android.gms.internal.ads.zzue zzueVar) {
        com.google.android.gms.internal.ads.zzud zzudVar = this.zzc;
        zzudVar.getClass();
        zzudVar.zzi(this);
    }
}
