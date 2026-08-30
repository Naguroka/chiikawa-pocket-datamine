package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzia implements com.google.android.gms.internal.ads.zzkk {
    private final com.google.android.gms.internal.ads.zzls zza;
    private final com.google.android.gms.internal.ads.zzhz zzb;
    private com.google.android.gms.internal.ads.zzlj zzc;
    private com.google.android.gms.internal.ads.zzkk zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzia(com.google.android.gms.internal.ads.zzhz zzhzVar, com.google.android.gms.internal.ads.zzcx zzcxVar) {
        this.zzb = zzhzVar;
        this.zza = new com.google.android.gms.internal.ads.zzls(zzcxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final long zza() {
        if (this.zze) {
            return this.zza.zza();
        }
        com.google.android.gms.internal.ads.zzkk zzkkVar = this.zzd;
        zzkkVar.getClass();
        return zzkkVar.zza();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    public final long zzb(boolean z) {
        com.google.android.gms.internal.ads.zzbe zzbeVarZzc;
        com.google.android.gms.internal.ads.zzlj zzljVar = this.zzc;
        if (zzljVar == null || zzljVar.zzW() || ((z && this.zzc.zzcT() != 2) || (!this.zzc.zzX() && (z || this.zzc.zzQ())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            com.google.android.gms.internal.ads.zzkk zzkkVar = this.zzd;
            zzkkVar.getClass();
            long jZza = zzkkVar.zza();
            if (!this.zze) {
                this.zza.zzb(jZza);
                zzbeVarZzc = zzkkVar.zzc();
                if (!zzbeVarZzc.equals(this.zza.zzc())) {
                    this.zza.zzg(zzbeVarZzc);
                    this.zzb.zza(zzbeVarZzc);
                }
            } else if (jZza < this.zza.zza()) {
                this.zza.zze();
            } else {
                this.zze = false;
                if (this.zzf) {
                    this.zza.zzd();
                }
                this.zza.zzb(jZza);
                zzbeVarZzc = zzkkVar.zzc();
                if (!zzbeVarZzc.equals(this.zza.zzc())) {
                    this.zza.zzg(zzbeVarZzc);
                    this.zzb.zza(zzbeVarZzc);
                }
            }
        }
        return zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final com.google.android.gms.internal.ads.zzbe zzc() {
        com.google.android.gms.internal.ads.zzkk zzkkVar = this.zzd;
        return zzkkVar != null ? zzkkVar.zzc() : this.zza.zzc();
    }

    public final void zzd(com.google.android.gms.internal.ads.zzlj zzljVar) {
        if (zzljVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(com.google.android.gms.internal.ads.zzlj zzljVar) throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzkk zzkkVar;
        com.google.android.gms.internal.ads.zzkk zzkkVarZzl = zzljVar.zzl();
        if (zzkkVarZzl == null || zzkkVarZzl == (zzkkVar = this.zzd)) {
            return;
        }
        if (zzkkVar != null) {
            throw com.google.android.gms.internal.ads.zzib.zzd(new java.lang.IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzkkVarZzl;
        this.zzc = zzljVar;
        zzkkVarZzl.zzg(this.zza.zzc());
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzg(com.google.android.gms.internal.ads.zzbe zzbeVar) {
        com.google.android.gms.internal.ads.zzkk zzkkVar = this.zzd;
        if (zzkkVar != null) {
            zzkkVar.zzg(zzbeVar);
            zzbeVar = this.zzd.zzc();
        }
        this.zza.zzg(zzbeVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final boolean zzj() {
        if (this.zze) {
            return false;
        }
        com.google.android.gms.internal.ads.zzkk zzkkVar = this.zzd;
        zzkkVar.getClass();
        return zzkkVar.zzj();
    }
}
