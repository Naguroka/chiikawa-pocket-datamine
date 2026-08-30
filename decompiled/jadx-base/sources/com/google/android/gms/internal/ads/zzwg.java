package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzwg implements com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzud {
    private final com.google.android.gms.internal.ads.zzue zza;
    private final long zzb;
    private com.google.android.gms.internal.ads.zzud zzc;

    public zzwg(com.google.android.gms.internal.ads.zzue zzueVar, long j) {
        this.zza = zzueVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zza(long j, com.google.android.gms.internal.ads.zzlp zzlpVar) {
        long j2 = this.zzb;
        return this.zza.zza(j - j2, zzlpVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzd() {
        long jZzd = this.zza.zzd();
        return jZzd == androidx.media3.common.C.TIME_UNSET ? androidx.media3.common.C.TIME_UNSET : jZzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zze(long j) {
        long j2 = this.zzb;
        return this.zza.zze(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzf(com.google.android.gms.internal.ads.zzxv[] zzxvVarArr, boolean[] zArr, com.google.android.gms.internal.ads.zzvy[] zzvyVarArr, boolean[] zArr2, long j) {
        com.google.android.gms.internal.ads.zzvy[] zzvyVarArr2 = new com.google.android.gms.internal.ads.zzvy[zzvyVarArr.length];
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzvy zzvyVarZzc = null;
            if (i >= zzvyVarArr.length) {
                break;
            }
            com.google.android.gms.internal.ads.zzwf zzwfVar = (com.google.android.gms.internal.ads.zzwf) zzvyVarArr[i];
            if (zzwfVar != null) {
                zzvyVarZzc = zzwfVar.zzc();
            }
            zzvyVarArr2[i] = zzvyVarZzc;
            i++;
        }
        long jZzf = this.zza.zzf(zzxvVarArr, zArr, zzvyVarArr2, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zzvyVarArr.length; i2++) {
            com.google.android.gms.internal.ads.zzvy zzvyVar = zzvyVarArr2[i2];
            if (zzvyVar == null) {
                zzvyVarArr[i2] = null;
            } else {
                com.google.android.gms.internal.ads.zzvy zzvyVar2 = zzvyVarArr[i2];
                if (zzvyVar2 == null || ((com.google.android.gms.internal.ads.zzwf) zzvyVar2).zzc() != zzvyVar) {
                    zzvyVarArr[i2] = new com.google.android.gms.internal.ads.zzwf(zzvyVar, this.zzb);
                }
            }
        }
        return jZzf + this.zzb;
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
        this.zza.zzj(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzk() throws java.io.IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzl(com.google.android.gms.internal.ads.zzud zzudVar, long j) {
        this.zzc = zzudVar;
        this.zza.zzl(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    public final com.google.android.gms.internal.ads.zzue zzn() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzo(com.google.android.gms.internal.ads.zzkj zzkjVar) {
        long j = zzkjVar.zza;
        long j2 = this.zzb;
        com.google.android.gms.internal.ads.zzkh zzkhVarZza = zzkjVar.zza();
        zzkhVarZza.zze(j - j2);
        return this.zza.zzo(zzkhVarZza.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzud
    public final void zzi(com.google.android.gms.internal.ads.zzue zzueVar) {
        com.google.android.gms.internal.ads.zzud zzudVar = this.zzc;
        zzudVar.getClass();
        zzudVar.zzi(this);
    }
}
