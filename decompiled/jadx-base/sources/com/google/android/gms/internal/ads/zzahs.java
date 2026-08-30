package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzahs implements com.google.android.gms.internal.ads.zzacn {
    private final com.google.android.gms.internal.ads.zzdy zza;
    private final com.google.android.gms.internal.ads.zzadf zzb;
    private final com.google.android.gms.internal.ads.zzadb zzc;
    private final com.google.android.gms.internal.ads.zzadd zzd;
    private final com.google.android.gms.internal.ads.zzadt zze;
    private com.google.android.gms.internal.ads.zzacq zzf;
    private com.google.android.gms.internal.ads.zzadt zzg;
    private com.google.android.gms.internal.ads.zzadt zzh;
    private int zzi;
    private com.google.android.gms.internal.ads.zzay zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private com.google.android.gms.internal.ads.zzahu zzp;
    private boolean zzq;

    public zzahs() {
        throw null;
    }

    public zzahs(int i) {
        this.zza = new com.google.android.gms.internal.ads.zzdy(10);
        this.zzb = new com.google.android.gms.internal.ads.zzadf();
        this.zzc = new com.google.android.gms.internal.ads.zzadb();
        this.zzk = androidx.media3.common.C.TIME_UNSET;
        this.zzd = new com.google.android.gms.internal.ads.zzadd();
        com.google.android.gms.internal.ads.zzaci zzaciVar = new com.google.android.gms.internal.ads.zzaci();
        this.zze = zzaciVar;
        this.zzh = zzaciVar;
        this.zzn = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02da  */
    /* JADX WARN: Code duplicated, block: B:123:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111  */
    /* JADX WARN: Code duplicated, block: B:58:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    /* JADX WARN: Code duplicated, block: B:62:0x0126  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00d1, please report this as an issue */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private final int zzg(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        int iZzf;
        int i;
        int iZzg;
        com.google.android.gms.internal.ads.zzahw zzahwVarZzb;
        com.google.android.gms.internal.ads.zzadb zzadbVar;
        long jZzf;
        long jZzd;
        long jZza;
        long j;
        int i2;
        com.google.android.gms.internal.ads.zzahu zzahpVar;
        long j2;
        long j3;
        int i3;
        int i4;
        com.google.android.gms.internal.ads.zzahr zzahrVarZzb;
        long jZzs;
        if (this.zzi == 0) {
            try {
                zzm(zzacoVar, false);
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        if (this.zzp == null) {
            com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy(this.zzb.zzc);
            zzacoVar.zzh(zzdyVar.zzN(), 0, this.zzb.zzc);
            com.google.android.gms.internal.ads.zzadf zzadfVar = this.zzb;
            int i5 = 21;
            if ((zzadfVar.zza & 1) != 0) {
                if (zzadfVar.zze != 1) {
                    i5 = 36;
                }
            } else if (zzadfVar.zze == 1) {
                i5 = 13;
            }
            if (zzdyVar.zze() >= i5 + 4) {
                zzdyVar.zzL(i5);
                iZzg = zzdyVar.zzg();
                if (iZzg != 1483304551) {
                    if (iZzg == 1231971951) {
                        iZzg = 1231971951;
                    } else if (zzdyVar.zze() >= 40) {
                        zzdyVar.zzL(36);
                        if (zzdyVar.zzg() == 1447187017) {
                            iZzg = 1447187017;
                        } else {
                            iZzg = 0;
                        }
                    } else {
                        iZzg = 0;
                    }
                }
            } else if (zzdyVar.zze() >= 40) {
                zzdyVar.zzL(36);
                if (zzdyVar.zzg() == 1447187017) {
                    iZzg = 1447187017;
                } else {
                    iZzg = 0;
                }
            } else {
                iZzg = 0;
            }
            if (iZzg == 1231971951) {
                zzahwVarZzb = com.google.android.gms.internal.ads.zzahw.zzb(this.zzb, zzdyVar);
                zzadbVar = this.zzc;
                if (!zzadbVar.zza() && (i3 = zzahwVarZzb.zzd) != -1 && (i4 = zzahwVarZzb.zze) != -1) {
                    zzadbVar.zza = i3;
                    zzadbVar.zzb = i4;
                }
                jZzf = zzacoVar.zzf();
                if (zzacoVar.zzd() != -1) {
                    j2 = zzahwVarZzb.zzc;
                    if (j2 != -1) {
                        j3 = j2 + jZzf;
                        if (zzacoVar.zzd() != j3) {
                            com.google.android.gms.internal.ads.zzdo.zze("Mp3Extractor", "Data size mismatch between stream (" + zzacoVar.zzd() + ") and Xing frame (" + j3 + "), using Xing value.");
                        }
                    }
                }
                zzacoVar.zzk(this.zzb.zzc);
                if (iZzg == 1483304551) {
                    zzahpVar = com.google.android.gms.internal.ads.zzahx.zzb(zzahwVarZzb, jZzf);
                } else {
                    jZzd = zzacoVar.zzd();
                    jZza = zzahwVarZzb.zza();
                    if (jZza != androidx.media3.common.C.TIME_UNSET) {
                        zzahpVar = null;
                    } else {
                        j = zzahwVarZzb.zzc;
                        if (j != -1) {
                            jZzd = jZzf + j;
                            i2 = zzahwVarZzb.zza.zzc;
                        } else if (jZzd != -1) {
                            j = jZzd - jZzf;
                            i2 = zzahwVarZzb.zza.zzc;
                        } else {
                            zzahpVar = null;
                        }
                        long j4 = j - ((long) i2);
                        zzahpVar = new com.google.android.gms.internal.ads.zzahp(jZzd, jZzf + ((long) zzahwVarZzb.zza.zzc), com.google.android.gms.internal.ads.zzgaq.zzb(com.google.android.gms.internal.ads.zzei.zzu(j4, 8000000L, jZza, java.math.RoundingMode.HALF_UP)), com.google.android.gms.internal.ads.zzgaq.zzb(com.google.android.gms.internal.ads.zzgal.zzb(j4, zzahwVarZzb.zzb, java.math.RoundingMode.HALF_UP)), false);
                    }
                }
            } else if (iZzg != 1447187017) {
                if (iZzg != 1483304551) {
                    zzacoVar.zzj();
                } else {
                    zzahwVarZzb = com.google.android.gms.internal.ads.zzahw.zzb(this.zzb, zzdyVar);
                    zzadbVar = this.zzc;
                    if (!zzadbVar.zza()) {
                        zzadbVar.zza = i3;
                        zzadbVar.zzb = i4;
                    }
                    jZzf = zzacoVar.zzf();
                    if (zzacoVar.zzd() != -1) {
                        j2 = zzahwVarZzb.zzc;
                        if (j2 != -1) {
                            j3 = j2 + jZzf;
                            if (zzacoVar.zzd() != j3) {
                                com.google.android.gms.internal.ads.zzdo.zze("Mp3Extractor", "Data size mismatch between stream (" + zzacoVar.zzd() + ") and Xing frame (" + j3 + "), using Xing value.");
                            }
                        }
                    }
                    zzacoVar.zzk(this.zzb.zzc);
                    if (iZzg == 1483304551) {
                        zzahpVar = com.google.android.gms.internal.ads.zzahx.zzb(zzahwVarZzb, jZzf);
                    } else {
                        jZzd = zzacoVar.zzd();
                        jZza = zzahwVarZzb.zza();
                        if (jZza != androidx.media3.common.C.TIME_UNSET) {
                            j = zzahwVarZzb.zzc;
                            if (j != -1) {
                                jZzd = jZzf + j;
                                i2 = zzahwVarZzb.zza.zzc;
                            } else if (jZzd != -1) {
                                j = jZzd - jZzf;
                                i2 = zzahwVarZzb.zza.zzc;
                            }
                            long j5 = j - ((long) i2);
                            zzahpVar = new com.google.android.gms.internal.ads.zzahp(jZzd, jZzf + ((long) zzahwVarZzb.zza.zzc), com.google.android.gms.internal.ads.zzgaq.zzb(com.google.android.gms.internal.ads.zzei.zzu(j5, 8000000L, jZza, java.math.RoundingMode.HALF_UP)), com.google.android.gms.internal.ads.zzgaq.zzb(com.google.android.gms.internal.ads.zzgal.zzb(j5, zzahwVarZzb.zzb, java.math.RoundingMode.HALF_UP)), false);
                        }
                    }
                }
                zzahpVar = null;
            } else {
                zzahpVar = com.google.android.gms.internal.ads.zzahv.zzb(zzacoVar.zzd(), zzacoVar.zzf(), this.zzb, zzdyVar);
                zzacoVar.zzk(this.zzb.zzc);
            }
            com.google.android.gms.internal.ads.zzay zzayVar = this.zzj;
            long jZzf2 = zzacoVar.zzf();
            if (zzayVar == null) {
                zzahrVarZzb = null;
                break;
            }
            int iZza = zzayVar.zza();
            int i6 = 0;
            while (true) {
                if (i6 >= iZza) {
                    zzahrVarZzb = null;
                    break;
                }
                com.google.android.gms.internal.ads.zzax zzaxVarZzb = zzayVar.zzb(i6);
                if (zzaxVarZzb instanceof com.google.android.gms.internal.ads.zzagm) {
                    com.google.android.gms.internal.ads.zzagm zzagmVar = (com.google.android.gms.internal.ads.zzagm) zzaxVarZzb;
                    int iZza2 = zzayVar.zza();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= iZza2) {
                            jZzs = -9223372036854775807L;
                            break;
                        }
                        com.google.android.gms.internal.ads.zzax zzaxVarZzb2 = zzayVar.zzb(i7);
                        if (zzaxVarZzb2 instanceof com.google.android.gms.internal.ads.zzagq) {
                            com.google.android.gms.internal.ads.zzagq zzagqVar = (com.google.android.gms.internal.ads.zzagq) zzaxVarZzb2;
                            if (zzagqVar.zzf.equals("TLEN")) {
                                jZzs = com.google.android.gms.internal.ads.zzei.zzs(java.lang.Long.parseLong((java.lang.String) zzagqVar.zzb.get(0)));
                                break;
                            }
                        }
                        i7++;
                    }
                    zzahrVarZzb = com.google.android.gms.internal.ads.zzahr.zzb(jZzf2, zzagmVar, jZzs);
                    break;
                }
                i6++;
            }
            if (this.zzq) {
                zzahpVar = new com.google.android.gms.internal.ads.zzaht();
            } else {
                if (zzahrVarZzb != null) {
                    zzahpVar = zzahrVarZzb;
                } else if (zzahpVar == null) {
                    zzahpVar = null;
                }
                if (zzahpVar != null) {
                    zzahpVar.zzh();
                } else {
                    zzacoVar.zzh(this.zza.zzN(), 0, 4);
                    this.zza.zzL(0);
                    this.zzb.zza(this.zza.zzg());
                    long jZzd2 = zzacoVar.zzd();
                    long jZzf3 = zzacoVar.zzf();
                    com.google.android.gms.internal.ads.zzadf zzadfVar2 = this.zzb;
                    zzahpVar = new com.google.android.gms.internal.ads.zzahp(jZzd2, jZzf3, zzadfVar2.zzf, zzadfVar2.zzc, false);
                }
            }
            this.zzp = zzahpVar;
            this.zzf.zzO(zzahpVar);
            com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
            zzzVar.zzaa(this.zzb.zzb);
            zzzVar.zzR(4096);
            zzzVar.zzz(this.zzb.zze);
            zzzVar.zzab(this.zzb.zzd);
            zzzVar.zzG(this.zzc.zza);
            zzzVar.zzH(this.zzc.zzb);
            zzzVar.zzT(this.zzj);
            if (this.zzp.zzc() != -2147483647) {
                zzzVar.zzy(this.zzp.zzc());
            }
            this.zzh.zzm(zzzVar.zzag());
            this.zzm = zzacoVar.zzf();
        } else {
            long j6 = this.zzm;
            if (j6 != 0) {
                long jZzf4 = zzacoVar.zzf();
                if (jZzf4 < j6) {
                    zzacoVar.zzk((int) (j6 - jZzf4));
                }
            }
        }
        int i8 = this.zzo;
        if (i8 == 0) {
            zzacoVar.zzj();
            if (zzl(zzacoVar)) {
                return -1;
            }
            this.zza.zzL(0);
            int iZzg2 = this.zza.zzg();
            if (!zzk(iZzg2, this.zzi) || com.google.android.gms.internal.ads.zzadg.zzb(iZzg2) == -1) {
                zzacoVar.zzk(1);
                this.zzi = 0;
            } else {
                this.zzb.zza(iZzg2);
                if (this.zzk == androidx.media3.common.C.TIME_UNSET) {
                    this.zzk = this.zzp.zze(zzacoVar.zzf());
                }
                com.google.android.gms.internal.ads.zzadf zzadfVar3 = this.zzb;
                int i9 = zzadfVar3.zzc;
                this.zzo = i9;
                this.zzn = zzacoVar.zzf() + ((long) i9);
                com.google.android.gms.internal.ads.zzahu zzahuVar = this.zzp;
                if (zzahuVar instanceof com.google.android.gms.internal.ads.zzahq) {
                    zzh(this.zzl + ((long) zzadfVar3.zzg));
                    throw null;
                }
                i8 = i9;
                iZzf = this.zzh.zzf(zzacoVar, i8, true);
                if (iZzf == -1) {
                    return -1;
                }
                i = this.zzo - iZzf;
                this.zzo = i;
                if (i <= 0) {
                    this.zzh.zzt(zzh(this.zzl), 1, this.zzb.zzc, 0, null);
                    this.zzl += (long) this.zzb.zzg;
                    this.zzo = 0;
                    return 0;
                }
            }
        } else {
            iZzf = this.zzh.zzf(zzacoVar, i8, true);
            if (iZzf == -1) {
                return -1;
            }
            i = this.zzo - iZzf;
            this.zzo = i;
            if (i <= 0) {
                this.zzh.zzt(zzh(this.zzl), 1, this.zzb.zzc, 0, null);
                this.zzl += (long) this.zzb.zzg;
                this.zzo = 0;
                return 0;
            }
        }
        return 0;
    }

    private final long zzh(long j) {
        return this.zzk + ((j * 1000000) / ((long) this.zzb.zzd));
    }

    private final void zzj() {
        com.google.android.gms.internal.ads.zzahu zzahuVar = this.zzp;
        if ((zzahuVar instanceof com.google.android.gms.internal.ads.zzahp) && zzahuVar.zzh()) {
            long j = this.zzn;
            if (j == -1 || j == this.zzp.zzd()) {
                return;
            }
            com.google.android.gms.internal.ads.zzahp zzahpVarZzf = ((com.google.android.gms.internal.ads.zzahp) this.zzp).zzf(this.zzn);
            this.zzp = zzahpVarZzf;
            com.google.android.gms.internal.ads.zzacq zzacqVar = this.zzf;
            zzacqVar.getClass();
            zzacqVar.zzO(zzahpVarZzf);
        }
    }

    private static boolean zzk(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzl(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzahu zzahuVar = this.zzp;
        if (zzahuVar != null) {
            long jZzd = zzahuVar.zzd();
            if (jZzd != -1 && zzacoVar.zze() > jZzd - 4) {
                return true;
            }
        }
        try {
            return !zzacoVar.zzm(this.zza.zzN(), 0, 4, true);
        } catch (java.io.EOFException unused) {
            return true;
        }
    }

    private final boolean zzm(com.google.android.gms.internal.ads.zzaco zzacoVar, boolean z) throws java.io.IOException {
        int iZze;
        int i;
        int iZzb;
        zzacoVar.zzj();
        if (zzacoVar.zzf() == 0) {
            com.google.android.gms.internal.ads.zzay zzayVarZza = this.zzd.zza(zzacoVar, null);
            this.zzj = zzayVarZza;
            if (zzayVarZza != null) {
                this.zzc.zzb(zzayVarZza);
            }
            iZze = (int) zzacoVar.zze();
            if (!z) {
                zzacoVar.zzk(iZze);
            }
            i = 0;
        } else {
            iZze = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (zzl(zzacoVar)) {
                if (i2 > 0) {
                    break;
                }
                zzj();
                throw new java.io.EOFException();
            }
            this.zza.zzL(0);
            int iZzg = this.zza.zzg();
            if ((i == 0 || zzk(iZzg, i)) && (iZzb = com.google.android.gms.internal.ads.zzadg.zzb(iZzg)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    this.zzb.zza(iZzg);
                    i = iZzg;
                }
                zzacoVar.zzg(iZzb - 4);
            } else {
                int i4 = i3 + 1;
                if (i3 == (true != z ? 131072 : 32768)) {
                    if (z) {
                        return false;
                    }
                    zzj();
                    throw new java.io.EOFException();
                }
                if (z) {
                    zzacoVar.zzj();
                    zzacoVar.zzg(iZze + i4);
                } else {
                    zzacoVar.zzk(1);
                }
                i = 0;
                i3 = i4;
                i2 = 0;
            }
        }
        if (z) {
            zzacoVar.zzk(iZze + i3);
        } else {
            zzacoVar.zzj();
        }
        this.zzi = i;
        return true;
    }

    public final void zza() {
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzg);
        int i = com.google.android.gms.internal.ads.zzei.zza;
        int iZzg = zzg(zzacoVar);
        if (iZzg == -1 && (this.zzp instanceof com.google.android.gms.internal.ads.zzahq)) {
            if (this.zzp.zza() != zzh(this.zzl)) {
                throw null;
            }
        }
        return iZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ com.google.android.gms.internal.ads.zzacn zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ java.util.List zzd() {
        return com.google.android.gms.internal.ads.zzfxn.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zze(com.google.android.gms.internal.ads.zzacq zzacqVar) {
        this.zzf = zzacqVar;
        com.google.android.gms.internal.ads.zzadt zzadtVarZzw = zzacqVar.zzw(0, 1);
        this.zzg = zzadtVarZzw;
        this.zzh = zzadtVarZzw;
        this.zzf.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzi = 0;
        this.zzk = androidx.media3.common.C.TIME_UNSET;
        this.zzl = 0L;
        this.zzo = 0;
        com.google.android.gms.internal.ads.zzahu zzahuVar = this.zzp;
        if (zzahuVar instanceof com.google.android.gms.internal.ads.zzahq) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        return zzm(zzacoVar, true);
    }
}
