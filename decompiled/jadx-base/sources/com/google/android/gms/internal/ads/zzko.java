package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzko {
    private final com.google.android.gms.internal.ads.zzlt zzc;
    private final com.google.android.gms.internal.ads.zzdh zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private com.google.android.gms.internal.ads.zzil zzh;
    private com.google.android.gms.internal.ads.zzkl zzi;
    private com.google.android.gms.internal.ads.zzkl zzj;
    private com.google.android.gms.internal.ads.zzkl zzk;
    private com.google.android.gms.internal.ads.zzkl zzl;
    private int zzm;
    private java.lang.Object zzn;
    private long zzo;
    private final com.google.android.gms.internal.ads.zzjs zzq;
    private final com.google.android.gms.internal.ads.zzbo zza = new com.google.android.gms.internal.ads.zzbo();
    private final com.google.android.gms.internal.ads.zzbp zzb = new com.google.android.gms.internal.ads.zzbp();
    private java.util.List zzp = new java.util.ArrayList();

    public zzko(com.google.android.gms.internal.ads.zzlt zzltVar, com.google.android.gms.internal.ads.zzdh zzdhVar, com.google.android.gms.internal.ads.zzjs zzjsVar, com.google.android.gms.internal.ads.zzil zzilVar) {
        this.zzc = zzltVar;
        this.zzd = zzdhVar;
        this.zzq = zzjsVar;
        this.zzh = zzilVar;
    }

    private final long zzA(java.lang.Object obj) {
        for (int i = 0; i < this.zzp.size(); i++) {
            com.google.android.gms.internal.ads.zzkl zzklVar = (com.google.android.gms.internal.ads.zzkl) this.zzp.get(i);
            if (zzklVar.zzb.equals(obj)) {
                return zzklVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final com.google.android.gms.internal.ads.zzkm zzB(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzkl zzklVar, long j) {
        long j2;
        com.google.android.gms.internal.ads.zzkm zzkmVar = zzklVar.zzg;
        long jZze = (zzklVar.zze() + zzkmVar.zze) - j;
        if (zzkmVar.zzg) {
            long j3 = 0;
            int iZzi = zzbqVar.zzi(zzbqVar.zza(zzkmVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (iZzi != -1) {
                int i = zzbqVar.zzd(iZzi, this.zza, true).zzc;
                java.lang.Object obj = this.zza.zzb;
                obj.getClass();
                long jZzA = zzkmVar.zza.zzd;
                if (zzbqVar.zze(i, this.zzb, 0L).zzn == iZzi) {
                    android.util.Pair pairZzm = zzbqVar.zzm(this.zzb, this.zza, i, androidx.media3.common.C.TIME_UNSET, java.lang.Math.max(0L, jZze));
                    if (pairZzm != null) {
                        obj = pairZzm.first;
                        long jLongValue = ((java.lang.Long) pairZzm.second).longValue();
                        com.google.android.gms.internal.ads.zzkl zzklVarZzg = zzklVar.zzg();
                        if (zzklVarZzg == null || !zzklVarZzg.zzb.equals(obj)) {
                            jZzA = zzA(obj);
                            if (jZzA == -1) {
                                jZzA = this.zze;
                                this.zze = 1 + jZzA;
                            }
                        } else {
                            jZzA = zzklVarZzg.zzg.zza.zzd;
                        }
                        j2 = jLongValue;
                        j3 = androidx.media3.common.C.TIME_UNSET;
                    }
                } else {
                    j2 = 0;
                }
                com.google.android.gms.internal.ads.zzug zzugVarZzF = zzF(zzbqVar, obj, j2, jZzA, this.zzb, this.zza);
                if (j3 != androidx.media3.common.C.TIME_UNSET && zzkmVar.zzc != androidx.media3.common.C.TIME_UNSET) {
                    zzbqVar.zzn(zzkmVar.zza.zza, this.zza).zzb();
                    int i2 = this.zza.zzg.zzd;
                }
                return zzC(zzbqVar, zzugVarZzF, j3, j2);
            }
        } else {
            com.google.android.gms.internal.ads.zzug zzugVar = zzkmVar.zza;
            zzbqVar.zzn(zzugVar.zza, this.zza);
            if (!zzugVar.zzb()) {
                int i3 = zzugVar.zze;
                if (i3 != -1) {
                    this.zza.zzj(i3);
                }
                com.google.android.gms.internal.ads.zzbo zzboVar = this.zza;
                int i4 = zzugVar.zze;
                int iZze = zzboVar.zze(i4);
                zzboVar.zzk(i4);
                if (iZze != this.zza.zza(zzugVar.zze)) {
                    return zzD(zzbqVar, zzugVar.zza, zzugVar.zze, iZze, zzkmVar.zze, zzugVar.zzd);
                }
                zzz(zzbqVar, zzugVar.zza, zzugVar.zze);
                return zzE(zzbqVar, zzugVar.zza, 0L, zzkmVar.zze, zzugVar.zzd);
            }
            int i5 = zzugVar.zzb;
            if (this.zza.zza(i5) != -1) {
                int iZza = this.zza.zzg.zza(i5).zza(zzugVar.zzc);
                if (iZza < 0) {
                    return zzD(zzbqVar, zzugVar.zza, i5, iZza, zzkmVar.zzc, zzugVar.zzd);
                }
                long jLongValue2 = zzkmVar.zzc;
                if (jLongValue2 == androidx.media3.common.C.TIME_UNSET) {
                    com.google.android.gms.internal.ads.zzbp zzbpVar = this.zzb;
                    com.google.android.gms.internal.ads.zzbo zzboVar2 = this.zza;
                    android.util.Pair pairZzm2 = zzbqVar.zzm(zzbpVar, zzboVar2, zzboVar2.zzc, androidx.media3.common.C.TIME_UNSET, java.lang.Math.max(0L, jZze));
                    if (pairZzm2 != null) {
                        jLongValue2 = ((java.lang.Long) pairZzm2.second).longValue();
                    }
                }
                zzz(zzbqVar, zzugVar.zza, zzugVar.zzb);
                return zzE(zzbqVar, zzugVar.zza, java.lang.Math.max(0L, jLongValue2), zzkmVar.zzc, zzugVar.zzd);
            }
        }
        return null;
    }

    private final com.google.android.gms.internal.ads.zzkm zzC(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzug zzugVar, long j, long j2) {
        zzbqVar.zzn(zzugVar.zza, this.zza);
        return zzugVar.zzb() ? zzD(zzbqVar, zzugVar.zza, zzugVar.zzb, zzugVar.zzc, j, zzugVar.zzd) : zzE(zzbqVar, zzugVar.zza, j2, j, zzugVar.zzd);
    }

    private final com.google.android.gms.internal.ads.zzkm zzD(com.google.android.gms.internal.ads.zzbq zzbqVar, java.lang.Object obj, int i, int i2, long j, long j2) {
        com.google.android.gms.internal.ads.zzug zzugVar = new com.google.android.gms.internal.ads.zzug(obj, i, i2, j2);
        long jZzf = zzbqVar.zzn(zzugVar.zza, this.zza).zzf(zzugVar.zzb, zzugVar.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzh();
        }
        this.zza.zzk(zzugVar.zzb);
        return new com.google.android.gms.internal.ads.zzkm(zzugVar, (jZzf == androidx.media3.common.C.TIME_UNSET || jZzf > 0) ? 0L : java.lang.Math.max(0L, (-1) + jZzf), j, androidx.media3.common.C.TIME_UNSET, jZzf, false, false, false, false);
    }

    private final com.google.android.gms.internal.ads.zzkm zzE(com.google.android.gms.internal.ads.zzbq zzbqVar, java.lang.Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long jMax = j;
        zzbqVar.zzn(obj, this.zza);
        int iZzc = this.zza.zzc(jMax);
        if (iZzc != -1) {
            this.zza.zzj(iZzc);
        }
        if (iZzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzk(iZzc);
        }
        com.google.android.gms.internal.ads.zzug zzugVar = new com.google.android.gms.internal.ads.zzug(obj, j3, iZzc);
        boolean zZzK = zzK(zzugVar);
        boolean zZzI = zzI(zzbqVar, zzugVar);
        boolean zZzH = zzH(zzbqVar, zzugVar, zZzK);
        if (iZzc != -1) {
            this.zza.zzk(iZzc);
        }
        if (iZzc != -1) {
            this.zza.zzg(iZzc);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != androidx.media3.common.C.TIME_UNSET) {
            j5 = 0;
            j6 = 0;
        } else {
            j5 = j4;
            j6 = this.zza.zzd;
        }
        if (j6 != androidx.media3.common.C.TIME_UNSET && jMax >= j6) {
            jMax = java.lang.Math.max(0L, j6 - 1);
        }
        return new com.google.android.gms.internal.ads.zzkm(zzugVar, jMax, j2, j5, j6, false, zZzK, zZzI, zZzH);
    }

    private static com.google.android.gms.internal.ads.zzug zzF(com.google.android.gms.internal.ads.zzbq zzbqVar, java.lang.Object obj, long j, long j2, com.google.android.gms.internal.ads.zzbp zzbpVar, com.google.android.gms.internal.ads.zzbo zzboVar) {
        zzbqVar.zzn(obj, zzboVar);
        zzbqVar.zze(zzboVar.zzc, zzbpVar, 0L);
        zzbqVar.zza(obj);
        zzboVar.zzb();
        zzbqVar.zzn(obj, zzboVar);
        int iZzd = zzboVar.zzd(j);
        return iZzd == -1 ? new com.google.android.gms.internal.ads.zzug(obj, j2, zzboVar.zzc(j)) : new com.google.android.gms.internal.ads.zzug(obj, iZzd, zzboVar.zze(iZzd), j2);
    }

    private final void zzG() {
        final com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
        for (com.google.android.gms.internal.ads.zzkl zzklVarZzg = this.zzi; zzklVarZzg != null; zzklVarZzg = zzklVarZzg.zzg()) {
            zzfxkVar.zzf(zzklVarZzg.zzg.zza);
        }
        com.google.android.gms.internal.ads.zzkl zzklVar = this.zzj;
        final com.google.android.gms.internal.ads.zzug zzugVar = zzklVar == null ? null : zzklVar.zzg.zza;
        this.zzd.zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzkn
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzm(zzfxkVar, zzugVar);
            }
        });
    }

    private final boolean zzH(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzug zzugVar, boolean z) {
        int iZza = zzbqVar.zza(zzugVar.zza);
        return !zzbqVar.zze(zzbqVar.zzd(iZza, this.zza, false).zzc, this.zzb, 0L).zzi && zzbqVar.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }

    private final boolean zzI(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzug zzugVar) {
        if (zzK(zzugVar)) {
            return zzbqVar.zze(zzbqVar.zzn(zzugVar.zza, this.zza).zzc, this.zzb, 0L).zzo == zzbqVar.zza(zzugVar.zza);
        }
        return false;
    }

    private final boolean zzJ(com.google.android.gms.internal.ads.zzbq zzbqVar) {
        com.google.android.gms.internal.ads.zzkl zzklVarZzg = this.zzi;
        if (zzklVarZzg == null) {
            return true;
        }
        int iZza = zzbqVar.zza(zzklVarZzg.zzb);
        while (true) {
            iZza = zzbqVar.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzklVarZzg.getClass();
                if (zzklVarZzg.zzg() == null || zzklVarZzg.zzg.zzg) {
                    break;
                }
                zzklVarZzg = zzklVarZzg.zzg();
            }
            com.google.android.gms.internal.ads.zzkl zzklVarZzg2 = zzklVarZzg.zzg();
            if (iZza == -1 || zzklVarZzg2 == null || zzbqVar.zza(zzklVarZzg2.zzb) != iZza) {
                break;
            }
            zzklVarZzg = zzklVarZzg2;
        }
        boolean zZzu = zzu(zzklVarZzg);
        zzklVarZzg.zzg = zzj(zzbqVar, zzklVarZzg.zzg);
        return !zZzu;
    }

    private static final boolean zzK(com.google.android.gms.internal.ads.zzug zzugVar) {
        return !zzugVar.zzb() && zzugVar.zze == -1;
    }

    static boolean zzr(long j, long j2) {
        return j == androidx.media3.common.C.TIME_UNSET || j == j2;
    }

    private final long zzz(com.google.android.gms.internal.ads.zzbq zzbqVar, java.lang.Object obj, int i) {
        zzbqVar.zzn(obj, this.zza);
        this.zza.zzg(i);
        long j = this.zza.zzg.zza(i).zzg;
        return 0L;
    }

    public final com.google.android.gms.internal.ads.zzkl zza() {
        com.google.android.gms.internal.ads.zzkl zzklVar = this.zzi;
        if (zzklVar == null) {
            return null;
        }
        if (zzklVar == this.zzj) {
            this.zzj = zzklVar.zzg();
        }
        zzklVar.zzo();
        int i = this.zzm - 1;
        this.zzm = i;
        if (i == 0) {
            this.zzk = null;
            com.google.android.gms.internal.ads.zzkl zzklVar2 = this.zzi;
            this.zzn = zzklVar2.zzb;
            this.zzo = zzklVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzg();
        zzG();
        return this.zzi;
    }

    public final com.google.android.gms.internal.ads.zzkl zzb() {
        com.google.android.gms.internal.ads.zzkl zzklVar = this.zzj;
        com.google.android.gms.internal.ads.zzcw.zzb(zzklVar);
        this.zzj = zzklVar.zzg();
        zzG();
        com.google.android.gms.internal.ads.zzkl zzklVar2 = this.zzj;
        com.google.android.gms.internal.ads.zzcw.zzb(zzklVar2);
        return zzklVar2;
    }

    public final com.google.android.gms.internal.ads.zzkl zzd() {
        return this.zzk;
    }

    public final com.google.android.gms.internal.ads.zzkl zze() {
        return this.zzi;
    }

    public final com.google.android.gms.internal.ads.zzkl zzf(com.google.android.gms.internal.ads.zzue zzueVar) {
        for (int i = 0; i < this.zzp.size(); i++) {
            com.google.android.gms.internal.ads.zzkl zzklVar = (com.google.android.gms.internal.ads.zzkl) this.zzp.get(i);
            if (zzklVar.zza == zzueVar) {
                return zzklVar;
            }
        }
        return null;
    }

    public final com.google.android.gms.internal.ads.zzkl zzg() {
        return this.zzl;
    }

    public final com.google.android.gms.internal.ads.zzkl zzh() {
        return this.zzj;
    }

    public final com.google.android.gms.internal.ads.zzkm zzi(long j, com.google.android.gms.internal.ads.zzlb zzlbVar) {
        com.google.android.gms.internal.ads.zzkl zzklVar = this.zzk;
        return zzklVar == null ? zzC(zzlbVar.zza, zzlbVar.zzb, zzlbVar.zzc, zzlbVar.zzs) : zzB(zzlbVar.zza, zzklVar, j);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final com.google.android.gms.internal.ads.zzkm zzj(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzkm zzkmVar) {
        long j;
        long jZzf;
        long j2;
        long j3;
        int i;
        int i2;
        com.google.android.gms.internal.ads.zzug zzugVar = zzkmVar.zza;
        boolean zZzK = zzK(zzugVar);
        boolean zZzI = zzI(zzbqVar, zzugVar);
        boolean zZzH = zzH(zzbqVar, zzugVar, zZzK);
        zzbqVar.zzn(zzkmVar.zza.zza, this.zza);
        if (zzugVar.zzb() || (i2 = zzugVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            this.zza.zzg(i2);
            j = 0;
        }
        if (!zzugVar.zzb()) {
            if (j != androidx.media3.common.C.TIME_UNSET) {
                j2 = 0;
                j3 = 0;
            } else {
                jZzf = this.zza.zzd;
            }
            if (zzugVar.zzb()) {
                this.zza.zzk(zzugVar.zzb);
            } else {
                i = zzugVar.zze;
                if (i != -1) {
                    this.zza.zzk(i);
                }
            }
            return new com.google.android.gms.internal.ads.zzkm(zzugVar, zzkmVar.zzb, zzkmVar.zzc, j2, j3, false, zZzK, zZzI, zZzH);
        }
        jZzf = this.zza.zzf(zzugVar.zzb, zzugVar.zzc);
        j2 = j;
        j3 = jZzf;
        if (zzugVar.zzb()) {
            this.zza.zzk(zzugVar.zzb);
        } else {
            i = zzugVar.zze;
            if (i != -1) {
                this.zza.zzk(i);
            }
        }
        return new com.google.android.gms.internal.ads.zzkm(zzugVar, zzkmVar.zzb, zzkmVar.zzc, j2, j3, false, zZzK, zZzI, zZzH);
    }

    public final com.google.android.gms.internal.ads.zzug zzk(com.google.android.gms.internal.ads.zzbq zzbqVar, java.lang.Object obj, long j) {
        long jZzA;
        int iZza;
        int i = zzbqVar.zzn(obj, this.zza).zzc;
        java.lang.Object obj2 = this.zzn;
        if (obj2 == null || (iZza = zzbqVar.zza(obj2)) == -1 || zzbqVar.zzd(iZza, this.zza, false).zzc != i) {
            com.google.android.gms.internal.ads.zzkl zzklVarZzg = this.zzi;
            while (true) {
                if (zzklVarZzg == null) {
                    com.google.android.gms.internal.ads.zzkl zzklVarZzg2 = this.zzi;
                    while (true) {
                        if (zzklVarZzg2 != null) {
                            int iZza2 = zzbqVar.zza(zzklVarZzg2.zzb);
                            if (iZza2 != -1 && zzbqVar.zzd(iZza2, this.zza, false).zzc == i) {
                                jZzA = zzklVarZzg2.zzg.zza.zzd;
                                break;
                            }
                            zzklVarZzg2 = zzklVarZzg2.zzg();
                        } else {
                            jZzA = zzA(obj);
                            if (jZzA != -1) {
                                break;
                            }
                            jZzA = this.zze;
                            this.zze = 1 + jZzA;
                            if (this.zzi != null) {
                                break;
                            }
                            this.zzn = obj;
                            this.zzo = jZzA;
                            break;
                        }
                    }
                } else {
                    if (zzklVarZzg.zzb.equals(obj)) {
                        jZzA = zzklVarZzg.zzg.zza.zzd;
                        break;
                    }
                    zzklVarZzg = zzklVarZzg.zzg();
                }
            }
        } else {
            jZzA = this.zzo;
        }
        long j2 = jZzA;
        zzbqVar.zzn(obj, this.zza);
        zzbqVar.zze(this.zza.zzc, this.zzb, 0L);
        int iZza3 = zzbqVar.zza(obj);
        java.lang.Object obj3 = obj;
        while (true) {
            com.google.android.gms.internal.ads.zzbp zzbpVar = this.zzb;
            if (iZza3 < zzbpVar.zzn) {
                return zzF(zzbqVar, obj3, j, j2, zzbpVar, this.zza);
            }
            zzbqVar.zzd(iZza3, this.zza, true);
            this.zza.zzb();
            com.google.android.gms.internal.ads.zzbo zzboVar = this.zza;
            if (zzboVar.zzd(zzboVar.zzd) != -1) {
                obj3 = this.zza.zzb;
                obj3.getClass();
            }
            iZza3--;
        }
    }

    public final void zzl() {
        if (this.zzm == 0) {
            return;
        }
        com.google.android.gms.internal.ads.zzkl zzklVarZzg = this.zzi;
        com.google.android.gms.internal.ads.zzcw.zzb(zzklVarZzg);
        this.zzn = zzklVarZzg.zzb;
        this.zzo = zzklVarZzg.zzg.zza.zzd;
        while (zzklVarZzg != null) {
            zzklVarZzg.zzo();
            zzklVarZzg = zzklVarZzg.zzg();
        }
        this.zzi = null;
        this.zzk = null;
        this.zzj = null;
        this.zzm = 0;
        zzG();
    }

    final /* synthetic */ void zzm(com.google.android.gms.internal.ads.zzfxk zzfxkVar, com.google.android.gms.internal.ads.zzug zzugVar) {
        this.zzc.zzT(zzfxkVar.zzi(), zzugVar);
    }

    public final void zzn() {
        com.google.android.gms.internal.ads.zzkl zzklVar = this.zzl;
        if (zzklVar == null || zzklVar.zzt()) {
            this.zzl = null;
            for (int i = 0; i < this.zzp.size(); i++) {
                com.google.android.gms.internal.ads.zzkl zzklVar2 = (com.google.android.gms.internal.ads.zzkl) this.zzp.get(i);
                if (!zzklVar2.zzt()) {
                    this.zzl = zzklVar2;
                    return;
                }
            }
        }
    }

    public final void zzo(long j) {
        com.google.android.gms.internal.ads.zzkl zzklVar = this.zzk;
        if (zzklVar != null) {
            zzklVar.zzn(j);
        }
    }

    public final void zzp() {
        if (this.zzp.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.zzp.size(); i++) {
            ((com.google.android.gms.internal.ads.zzkl) this.zzp.get(i)).zzo();
        }
        this.zzp = arrayList;
        this.zzl = null;
        zzn();
    }

    public final void zzq(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzil zzilVar) {
        this.zzh = zzilVar;
        long j = zzilVar.zzb;
        zzp();
    }

    public final boolean zzs(com.google.android.gms.internal.ads.zzue zzueVar) {
        com.google.android.gms.internal.ads.zzkl zzklVar = this.zzk;
        return zzklVar != null && zzklVar.zza == zzueVar;
    }

    public final boolean zzt(com.google.android.gms.internal.ads.zzue zzueVar) {
        com.google.android.gms.internal.ads.zzkl zzklVar = this.zzl;
        return zzklVar != null && zzklVar.zza == zzueVar;
    }

    public final boolean zzu(com.google.android.gms.internal.ads.zzkl zzklVar) {
        com.google.android.gms.internal.ads.zzcw.zzb(zzklVar);
        boolean z = false;
        if (zzklVar.equals(this.zzk)) {
            return false;
        }
        this.zzk = zzklVar;
        while (zzklVar.zzg() != null) {
            zzklVar = zzklVar.zzg();
            zzklVar.getClass();
            if (zzklVar == this.zzj) {
                this.zzj = this.zzi;
                z = true;
            }
            zzklVar.zzo();
            this.zzm--;
        }
        com.google.android.gms.internal.ads.zzkl zzklVar2 = this.zzk;
        zzklVar2.getClass();
        zzklVar2.zzp(null);
        zzG();
        return z;
    }

    public final boolean zzv() {
        com.google.android.gms.internal.ads.zzkl zzklVar = this.zzk;
        if (zzklVar == null) {
            return true;
        }
        if (zzklVar.zzg.zzi || !zzklVar.zzs() || this.zzk.zzg.zze == androidx.media3.common.C.TIME_UNSET) {
            return false;
        }
        return this.zzm < 100;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    public final boolean zzw(com.google.android.gms.internal.ads.zzbq zzbqVar, long j, long j2) {
        com.google.android.gms.internal.ads.zzkm zzkmVarZzj;
        boolean z;
        com.google.android.gms.internal.ads.zzkl zzklVar = null;
        for (com.google.android.gms.internal.ads.zzkl zzklVarZzg = this.zzi; zzklVarZzg != null; zzklVarZzg = zzklVarZzg.zzg()) {
            com.google.android.gms.internal.ads.zzkm zzkmVar = zzklVarZzg.zzg;
            if (zzklVar == null) {
                zzkmVarZzj = zzj(zzbqVar, zzkmVar);
            } else {
                com.google.android.gms.internal.ads.zzkm zzkmVarZzB = zzB(zzbqVar, zzklVar, j);
                if (zzkmVarZzB == null) {
                    return !zzu(zzklVar);
                }
                if (zzkmVar.zzb != zzkmVarZzB.zzb || !zzkmVar.zza.equals(zzkmVarZzB.zza)) {
                    return !zzu(zzklVar);
                }
                zzkmVarZzj = zzkmVarZzB;
            }
            zzklVarZzg.zzg = zzkmVarZzj.zza(zzkmVar.zzc);
            if (!zzr(zzkmVar.zze, zzkmVarZzj.zze)) {
                zzklVarZzg.zzr();
                long j3 = zzkmVarZzj.zze;
                long jZze = j3 == androidx.media3.common.C.TIME_UNSET ? Long.MAX_VALUE : j3 + zzklVarZzg.zze();
                if (zzklVarZzg == this.zzj) {
                    boolean z2 = zzklVarZzg.zzg.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= jZze) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return (zzu(zzklVarZzg) || z) ? false : true;
            }
            zzklVar = zzklVarZzg;
        }
        return true;
    }

    public final boolean zzx(com.google.android.gms.internal.ads.zzbq zzbqVar, int i) {
        this.zzf = i;
        return zzJ(zzbqVar);
    }

    public final boolean zzy(com.google.android.gms.internal.ads.zzbq zzbqVar, boolean z) {
        this.zzg = z;
        return zzJ(zzbqVar);
    }

    public final com.google.android.gms.internal.ads.zzkl zzc(com.google.android.gms.internal.ads.zzkm zzkmVar) {
        com.google.android.gms.internal.ads.zzkl zzklVarZzd;
        com.google.android.gms.internal.ads.zzkl zzklVar = this.zzk;
        long jZze = zzklVar == null ? androidx.media3.exoplayer.MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : (zzklVar.zze() + zzklVar.zzg.zze) - zzkmVar.zzb;
        int i = 0;
        while (true) {
            if (i >= this.zzp.size()) {
                zzklVarZzd = null;
                break;
            }
            com.google.android.gms.internal.ads.zzkm zzkmVar2 = ((com.google.android.gms.internal.ads.zzkl) this.zzp.get(i)).zzg;
            if (zzr(zzkmVar2.zze, zzkmVar.zze) && zzkmVar2.zzb == zzkmVar.zzb && zzkmVar2.zza.equals(zzkmVar.zza)) {
                zzklVarZzd = (com.google.android.gms.internal.ads.zzkl) this.zzp.remove(i);
                break;
            }
            i++;
        }
        if (zzklVarZzd == null) {
            zzklVarZzd = com.google.android.gms.internal.ads.zzkc.zzd(this.zzq.zza, zzkmVar, jZze);
        } else {
            zzklVarZzd.zzg = zzkmVar;
            zzklVarZzd.zzq(jZze);
        }
        com.google.android.gms.internal.ads.zzkl zzklVar2 = this.zzk;
        if (zzklVar2 != null) {
            zzklVar2.zzp(zzklVarZzd);
        } else {
            this.zzi = zzklVarZzd;
            this.zzj = zzklVarZzd;
        }
        this.zzn = null;
        this.zzk = zzklVarZzd;
        this.zzm++;
        zzG();
        return zzklVarZzd;
    }
}
