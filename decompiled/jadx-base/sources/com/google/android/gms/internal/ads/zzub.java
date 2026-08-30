package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzub extends com.google.android.gms.internal.ads.zzwl {
    private final boolean zzb;
    private final com.google.android.gms.internal.ads.zzbp zzc;
    private final com.google.android.gms.internal.ads.zzbo zzd;
    private com.google.android.gms.internal.ads.zztz zze;
    private com.google.android.gms.internal.ads.zzty zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzub(com.google.android.gms.internal.ads.zzui zzuiVar, boolean z) {
        boolean z2;
        super(zzuiVar);
        if (z) {
            zzuiVar.zzv();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new com.google.android.gms.internal.ads.zzbp();
        this.zzd = new com.google.android.gms.internal.ads.zzbo();
        zzuiVar.zzM();
        this.zze = com.google.android.gms.internal.ads.zztz.zzq(zzuiVar.zzJ());
    }

    private final java.lang.Object zzK(java.lang.Object obj) {
        return (this.zze.zze == null || !obj.equals(com.google.android.gms.internal.ads.zztz.zzc)) ? obj : this.zze.zze;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final boolean zzL(long j) {
        com.google.android.gms.internal.ads.zzty zztyVar = this.zzf;
        int iZza = this.zze.zza(zztyVar.zza.zza);
        if (iZza == -1) {
            return false;
        }
        com.google.android.gms.internal.ads.zztz zztzVar = this.zze;
        com.google.android.gms.internal.ads.zzbo zzboVar = this.zzd;
        zztzVar.zzd(iZza, zzboVar, false);
        long j2 = zzboVar.zzd;
        if (j2 != androidx.media3.common.C.TIME_UNSET && j >= j2) {
            j = java.lang.Math.max(0L, j2 - 1);
        }
        zztyVar.zzs(j);
        return true;
    }

    public final com.google.android.gms.internal.ads.zzbq zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    protected final com.google.android.gms.internal.ads.zzug zzD(com.google.android.gms.internal.ads.zzug zzugVar) {
        java.lang.Object obj = this.zze.zze;
        java.lang.Object obj2 = zzugVar.zza;
        if (obj != null && this.zze.zze.equals(obj2)) {
            obj2 = com.google.android.gms.internal.ads.zztz.zzc;
        }
        return zzugVar.zza(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    @Override // com.google.android.gms.internal.ads.zzwl
    protected final void zzE(com.google.android.gms.internal.ads.zzbq zzbqVar) {
        long j;
        com.google.android.gms.internal.ads.zzug zzugVarZza = null;
        if (this.zzh) {
            this.zze = this.zze.zzp(zzbqVar);
            com.google.android.gms.internal.ads.zzty zztyVar = this.zzf;
            if (zztyVar != null) {
                zzL(zztyVar.zzn());
            }
        } else if (zzbqVar.zzo()) {
            this.zze = this.zzi ? this.zze.zzp(zzbqVar) : com.google.android.gms.internal.ads.zztz.zzr(zzbqVar, com.google.android.gms.internal.ads.zzbp.zza, com.google.android.gms.internal.ads.zztz.zzc);
        } else {
            zzbqVar.zze(0, this.zzc, 0L);
            java.lang.Object obj = this.zzc.zzb;
            com.google.android.gms.internal.ads.zzty zztyVar2 = this.zzf;
            if (zztyVar2 != null) {
                long jZzq = zztyVar2.zzq();
                this.zze.zzn(zztyVar2.zza.zza, this.zzd);
                this.zze.zze(0, this.zzc, 0L);
                if (jZzq != 0) {
                    j = jZzq;
                } else {
                    j = 0;
                }
            } else {
                j = 0;
            }
            android.util.Pair pairZzl = zzbqVar.zzl(this.zzc, this.zzd, 0, j);
            java.lang.Object obj2 = pairZzl.first;
            long jLongValue = ((java.lang.Long) pairZzl.second).longValue();
            this.zze = this.zzi ? this.zze.zzp(zzbqVar) : com.google.android.gms.internal.ads.zztz.zzr(zzbqVar, obj, obj2);
            com.google.android.gms.internal.ads.zzty zztyVar3 = this.zzf;
            if (zztyVar3 != null && zzL(jLongValue)) {
                com.google.android.gms.internal.ads.zzug zzugVar = zztyVar3.zza;
                zzugVarZza = zzugVar.zza(zzK(zzugVar.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zzo(this.zze);
        if (zzugVarZza != null) {
            com.google.android.gms.internal.ads.zzty zztyVar4 = this.zzf;
            zztyVar4.getClass();
            zztyVar4.zzr(zzugVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void zzF() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzB(null, ((com.google.android.gms.internal.ads.zzwl) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzwl, com.google.android.gms.internal.ads.zzui
    public final void zzG(com.google.android.gms.internal.ads.zzue zzueVar) {
        ((com.google.android.gms.internal.ads.zzty) zzueVar).zzt();
        if (zzueVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwl, com.google.android.gms.internal.ads.zzui
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzty zzI(com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zzyk zzykVar, long j) {
        com.google.android.gms.internal.ads.zzty zztyVar = new com.google.android.gms.internal.ads.zzty(zzugVar, zzykVar, j);
        zztyVar.zzu(this.zza);
        if (this.zzh) {
            zztyVar.zzr(zzugVar.zza(zzK(zzugVar.zza)));
        } else {
            this.zzf = zztyVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((com.google.android.gms.internal.ads.zzwl) this).zza);
            }
        }
        return zztyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zztf
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zztf, com.google.android.gms.internal.ads.zzui
    public final void zzt(com.google.android.gms.internal.ads.zzar zzarVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new com.google.android.gms.internal.ads.zzwh(this.zze.zzb, zzarVar));
        } else {
            this.zze = com.google.android.gms.internal.ads.zztz.zzq(zzarVar);
        }
        this.zza.zzt(zzarVar);
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzui
    public final void zzz() {
    }
}
