package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzty implements com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzud {
    public final com.google.android.gms.internal.ads.zzug zza;
    private final long zzb;
    private com.google.android.gms.internal.ads.zzui zzc;
    private com.google.android.gms.internal.ads.zzue zzd;
    private com.google.android.gms.internal.ads.zzud zze;
    private long zzf = androidx.media3.common.C.TIME_UNSET;
    private final com.google.android.gms.internal.ads.zzyk zzg;

    public zzty(com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zzyk zzykVar, long j) {
        this.zza = zzugVar;
        this.zzg = zzykVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != androidx.media3.common.C.TIME_UNSET ? j2 : j;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zza(long j, com.google.android.gms.internal.ads.zzlp zzlpVar) {
        com.google.android.gms.internal.ads.zzue zzueVar = this.zzd;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        return zzueVar.zza(j, zzlpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        com.google.android.gms.internal.ads.zzue zzueVar = this.zzd;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        return zzueVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzc() {
        com.google.android.gms.internal.ads.zzue zzueVar = this.zzd;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        return zzueVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzd() {
        com.google.android.gms.internal.ads.zzue zzueVar = this.zzd;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        return zzueVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zze(long j) {
        com.google.android.gms.internal.ads.zzue zzueVar = this.zzd;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        return zzueVar.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzf(com.google.android.gms.internal.ads.zzxv[] zzxvVarArr, boolean[] zArr, com.google.android.gms.internal.ads.zzvy[] zzvyVarArr, boolean[] zArr2, long j) {
        long j2 = this.zzf;
        long j3 = (j2 == androidx.media3.common.C.TIME_UNSET || j != this.zzb) ? j : j2;
        this.zzf = androidx.media3.common.C.TIME_UNSET;
        com.google.android.gms.internal.ads.zzue zzueVar = this.zzd;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        return zzueVar.zzf(zzxvVarArr, zArr, zzvyVarArr, zArr2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzwa zzwaVar) {
        com.google.android.gms.internal.ads.zzud zzudVar = this.zze;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        zzudVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final com.google.android.gms.internal.ads.zzwj zzh() {
        com.google.android.gms.internal.ads.zzue zzueVar = this.zzd;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        return zzueVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzud
    public final void zzi(com.google.android.gms.internal.ads.zzue zzueVar) {
        com.google.android.gms.internal.ads.zzud zzudVar = this.zze;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        zzudVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzj(long j, boolean z) {
        com.google.android.gms.internal.ads.zzue zzueVar = this.zzd;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        zzueVar.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzk() throws java.io.IOException {
        try {
            com.google.android.gms.internal.ads.zzue zzueVar = this.zzd;
            if (zzueVar != null) {
                zzueVar.zzk();
                return;
            }
            com.google.android.gms.internal.ads.zzui zzuiVar = this.zzc;
            if (zzuiVar != null) {
                zzuiVar.zzz();
            }
        } catch (java.io.IOException e) {
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzl(com.google.android.gms.internal.ads.zzud zzudVar, long j) {
        this.zze = zzudVar;
        com.google.android.gms.internal.ads.zzue zzueVar = this.zzd;
        if (zzueVar != null) {
            zzueVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final void zzm(long j) {
        com.google.android.gms.internal.ads.zzue zzueVar = this.zzd;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        zzueVar.zzm(j);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzo(com.google.android.gms.internal.ads.zzkj zzkjVar) {
        com.google.android.gms.internal.ads.zzue zzueVar = this.zzd;
        return zzueVar != null && zzueVar.zzo(zzkjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzp() {
        com.google.android.gms.internal.ads.zzue zzueVar = this.zzd;
        return zzueVar != null && zzueVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(com.google.android.gms.internal.ads.zzug zzugVar) {
        long jZzv = zzv(this.zzb);
        com.google.android.gms.internal.ads.zzui zzuiVar = this.zzc;
        zzuiVar.getClass();
        com.google.android.gms.internal.ads.zzue zzueVarZzI = zzuiVar.zzI(zzugVar, this.zzg, jZzv);
        this.zzd = zzueVarZzI;
        if (this.zze != null) {
            zzueVarZzI.zzl(this, jZzv);
        }
    }

    public final void zzs(long j) {
        this.zzf = j;
    }

    public final void zzu(com.google.android.gms.internal.ads.zzui zzuiVar) {
        com.google.android.gms.internal.ads.zzcw.zzf(this.zzc == null);
        this.zzc = zzuiVar;
    }

    public final void zzt() {
        com.google.android.gms.internal.ads.zzue zzueVar = this.zzd;
        if (zzueVar != null) {
            com.google.android.gms.internal.ads.zzui zzuiVar = this.zzc;
            zzuiVar.getClass();
            zzuiVar.zzG(zzueVar);
        }
    }
}
