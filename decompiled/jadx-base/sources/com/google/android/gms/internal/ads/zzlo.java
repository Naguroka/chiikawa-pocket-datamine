package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzlo {
    private final com.google.android.gms.internal.ads.zzlj zza;
    private final int zzb;
    private boolean zzc = false;

    public zzlo(com.google.android.gms.internal.ads.zzlj zzljVar, int i) {
        this.zza = zzljVar;
        this.zzb = i;
    }

    private static final void zzA(com.google.android.gms.internal.ads.zzlj zzljVar) {
        if (zzljVar.zzcT() == 2) {
            zzljVar.zzP();
        }
    }

    private static boolean zzz(com.google.android.gms.internal.ads.zzlj zzljVar) {
        return zzljVar.zzcT() != 0;
    }

    public final int zza() {
        return zzz(this.zza) ? 1 : 0;
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final long zzc(com.google.android.gms.internal.ads.zzkl zzklVar) {
        com.google.android.gms.internal.ads.zzcw.zzf(zzy(zzklVar));
        return this.zza.zzcV();
    }

    public final void zzd(com.google.android.gms.internal.ads.zzia zziaVar) {
        com.google.android.gms.internal.ads.zzlj zzljVar = this.zza;
        if (zzz(zzljVar)) {
            zziaVar.zzd(zzljVar);
            zzA(zzljVar);
            zzljVar.zzr();
        }
    }

    public final void zze(com.google.android.gms.internal.ads.zzln zzlnVar, com.google.android.gms.internal.ads.zzab[] zzabVarArr, com.google.android.gms.internal.ads.zzvy zzvyVar, long j, boolean z, boolean z2, long j2, long j3, com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zzia zziaVar) throws com.google.android.gms.internal.ads.zzib {
        this.zzc = true;
        this.zza.zzs(zzlnVar, zzabVarArr, zzvyVar, j, z, z2, j2, j3, zzugVar);
        zziaVar.zze(this.zza);
    }

    public final void zzf() {
        if (zzz(this.zza)) {
            this.zza.zzt();
        }
    }

    public final void zzg(int i, java.lang.Object obj) throws com.google.android.gms.internal.ads.zzib {
        this.zza.zzu(11, obj);
    }

    public final void zzh() throws java.io.IOException {
        this.zza.zzw();
    }

    public final void zzi() {
        this.zza.zzG();
        this.zzc = false;
    }

    public final void zzj(long j, long j2) throws com.google.android.gms.internal.ads.zzib {
        if (zzz(this.zza)) {
            this.zza.zzV(j, j2);
        }
    }

    public final void zzk(com.google.android.gms.internal.ads.zzab[] zzabVarArr, com.google.android.gms.internal.ads.zzvy zzvyVar, long j, long j2, com.google.android.gms.internal.ads.zzug zzugVar) throws com.google.android.gms.internal.ads.zzib {
        this.zza.zzH(zzabVarArr, zzvyVar, j, j2, zzugVar);
    }

    public final void zzl() {
        if (this.zzc) {
            this.zza.zzI();
            this.zzc = false;
        }
    }

    public final void zzm(long j) throws com.google.android.gms.internal.ads.zzib {
        if (zzz(this.zza)) {
            this.zza.zzJ(j);
        }
    }

    public final void zzn(long j) {
        com.google.android.gms.internal.ads.zzlj zzljVar = this.zza;
        zzljVar.zzK();
        if (zzljVar instanceof com.google.android.gms.internal.ads.zzwn) {
            throw null;
        }
    }

    public final void zzo(float f, float f2) throws com.google.android.gms.internal.ads.zzib {
        this.zza.zzM(f, f2);
    }

    public final void zzp(com.google.android.gms.internal.ads.zzbq zzbqVar) {
        this.zza.zzN(zzbqVar);
    }

    public final void zzq(java.lang.Object obj) throws com.google.android.gms.internal.ads.zzib {
        if (this.zza.zzb() == 2) {
            this.zza.zzu(1, obj);
        }
    }

    public final void zzr() throws com.google.android.gms.internal.ads.zzib {
        if (this.zza.zzcT() == 1) {
            this.zza.zzO();
        }
    }

    public final void zzs() {
        if (zzz(this.zza)) {
            zzA(this.zza);
        }
    }

    public final boolean zzt(com.google.android.gms.internal.ads.zzkl zzklVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzvy zzvyVar = zzklVar.zzc[this.zzb];
        com.google.android.gms.internal.ads.zzlj zzljVar = this.zza;
        boolean z = zzvyVar != zzljVar.zzp();
        return z || (!z && zzljVar.zzQ()) || zzljVar.zzX() || zzljVar.zzW();
    }

    public final boolean zzu(com.google.android.gms.internal.ads.zzkl zzklVar) {
        com.google.android.gms.internal.ads.zzvy zzvyVar = zzklVar.zzc[this.zzb];
        if (this.zza.zzp() != zzvyVar) {
            return false;
        }
        if (zzvyVar == null || this.zza.zzQ()) {
            return true;
        }
        zzklVar.zzg();
        boolean z = zzklVar.zzg.zzf;
        return false;
    }

    public final boolean zzv() {
        return this.zza.zzQ();
    }

    public final boolean zzw() {
        return this.zza.zzR();
    }

    public final boolean zzx() {
        return this.zza.zzW();
    }

    public final boolean zzy(com.google.android.gms.internal.ads.zzkl zzklVar) {
        com.google.android.gms.internal.ads.zzlj zzljVar = null;
        if (zzklVar != null) {
            int i = this.zzb;
            com.google.android.gms.internal.ads.zzvy[] zzvyVarArr = zzklVar.zzc;
            if (zzvyVarArr[i] != null && this.zza.zzp() == zzvyVarArr[i]) {
                zzljVar = this.zza;
            }
        }
        return zzljVar != null;
    }
}
