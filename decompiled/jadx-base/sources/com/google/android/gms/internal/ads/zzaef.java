package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaef implements com.google.android.gms.internal.ads.zzacn {
    private final com.google.android.gms.internal.ads.zzdy zza;
    private final com.google.android.gms.internal.ads.zzaed zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.ads.zzakd zzd;
    private int zze;
    private com.google.android.gms.internal.ads.zzacq zzf;
    private com.google.android.gms.internal.ads.zzaeg zzg;
    private long zzh;
    private com.google.android.gms.internal.ads.zzaei[] zzi;
    private long zzj;
    private com.google.android.gms.internal.ads.zzaei zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @java.lang.Deprecated
    public zzaef() {
        this(1, com.google.android.gms.internal.ads.zzakd.zza);
    }

    private final com.google.android.gms.internal.ads.zzaei zzg(int i) {
        for (com.google.android.gms.internal.ads.zzaei zzaeiVar : this.zzi) {
            if (zzaeiVar.zzf(i)) {
                return zzaeiVar;
            }
        }
        return null;
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
        this.zze = 0;
        if (this.zzc) {
            zzacqVar = new com.google.android.gms.internal.ads.zzakg(zzacqVar, this.zzd);
        }
        this.zzf = zzacqVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzj = -1L;
        this.zzk = null;
        for (com.google.android.gms.internal.ads.zzaei zzaeiVar : this.zzi) {
            zzaeiVar.zze(j);
        }
        if (j == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        zzacoVar.zzh(this.zza.zzN(), 0, 12);
        this.zza.zzL(0);
        if (this.zza.zzi() != 1179011410) {
            return false;
        }
        this.zza.zzM(4);
        return this.zza.zzi() == 541677121;
    }

    public zzaef(int i, com.google.android.gms.internal.ads.zzakd zzakdVar) {
        this.zzd = zzakdVar;
        this.zzc = 1 == (i ^ 1);
        this.zza = new com.google.android.gms.internal.ads.zzdy(12);
        this.zzb = new com.google.android.gms.internal.ads.zzaed(null);
        this.zzf = new com.google.android.gms.internal.ads.zzadh();
        this.zzi = new com.google.android.gms.internal.ads.zzaei[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = androidx.media3.common.C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0303  */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        boolean z;
        int i;
        int i2;
        com.google.android.gms.internal.ads.zzaei zzaeiVar;
        long j;
        long j2 = this.zzj;
        int i3 = 0;
        if (j2 != -1) {
            long jZzf = zzacoVar.zzf();
            if (j2 < jZzf || j2 > 262144 + jZzf) {
                zzadjVar.zza = j2;
                z = true;
            } else {
                zzacoVar.zzk((int) (j2 - jZzf));
                z = false;
            }
        } else {
            z = false;
        }
        this.zzj = -1L;
        if (z) {
            return 1;
        }
        int i4 = this.zze;
        com.google.android.gms.internal.ads.zzaei zzaeiVar2 = null;
        if (i4 == 0) {
            if (!zzi(zzacoVar)) {
                throw com.google.android.gms.internal.ads.zzbc.zza("AVI Header List not found", null);
            }
            zzacoVar.zzk(12);
            this.zze = 1;
            return 0;
        }
        if (i4 == 1) {
            zzacoVar.zzi(this.zza.zzN(), 0, 12);
            this.zza.zzL(0);
            com.google.android.gms.internal.ads.zzaed zzaedVar = this.zzb;
            com.google.android.gms.internal.ads.zzdy zzdyVar = this.zza;
            zzaedVar.zza(zzdyVar);
            int i5 = zzaedVar.zza;
            if (i5 != 1414744396) {
                throw com.google.android.gms.internal.ads.zzbc.zza("LIST expected, found: " + i5, null);
            }
            zzaedVar.zzc = zzdyVar.zzi();
            com.google.android.gms.internal.ads.zzaed zzaedVar2 = this.zzb;
            int i6 = zzaedVar2.zzc;
            if (i6 == 1819436136) {
                this.zzl = zzaedVar2.zzb;
                this.zze = 2;
                return 0;
            }
            throw com.google.android.gms.internal.ads.zzbc.zza("hdrl expected, found: " + i6, null);
        }
        if (i4 == 2) {
            int i7 = this.zzl - 4;
            com.google.android.gms.internal.ads.zzdy zzdyVar2 = new com.google.android.gms.internal.ads.zzdy(i7);
            zzacoVar.zzi(zzdyVar2.zzN(), 0, i7);
            com.google.android.gms.internal.ads.zzaej zzaejVarZzc = com.google.android.gms.internal.ads.zzaej.zzc(androidx.media3.extractor.avi.AviExtractor.FOURCC_hdrl, zzdyVar2);
            if (zzaejVarZzc.zza() != 1819436136) {
                throw com.google.android.gms.internal.ads.zzbc.zza("Unexpected header list type " + zzaejVarZzc.zza(), null);
            }
            com.google.android.gms.internal.ads.zzaeg zzaegVar = (com.google.android.gms.internal.ads.zzaeg) zzaejVarZzc.zzb(com.google.android.gms.internal.ads.zzaeg.class);
            if (zzaegVar == null) {
                throw com.google.android.gms.internal.ads.zzbc.zza("AviHeader not found", null);
            }
            this.zzg = zzaegVar;
            this.zzh = ((long) zzaegVar.zzc) * ((long) zzaegVar.zza);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.google.android.gms.internal.ads.zzfxn zzfxnVar = zzaejVarZzc.zza;
            int size = zzfxnVar.size();
            int i8 = 0;
            int i9 = 0;
            while (i8 < size) {
                com.google.android.gms.internal.ads.zzaeb zzaebVar = (com.google.android.gms.internal.ads.zzaeb) zzfxnVar.get(i8);
                if (zzaebVar.zza() == 1819440243) {
                    com.google.android.gms.internal.ads.zzaej zzaejVar = (com.google.android.gms.internal.ads.zzaej) zzaebVar;
                    int i10 = i9 + 1;
                    com.google.android.gms.internal.ads.zzaeh zzaehVar = (com.google.android.gms.internal.ads.zzaeh) zzaejVar.zzb(com.google.android.gms.internal.ads.zzaeh.class);
                    com.google.android.gms.internal.ads.zzaek zzaekVar = (com.google.android.gms.internal.ads.zzaek) zzaejVar.zzb(com.google.android.gms.internal.ads.zzaek.class);
                    if (zzaehVar == null) {
                        com.google.android.gms.internal.ads.zzdo.zzf("AviExtractor", "Missing Stream Header");
                    } else {
                        if (zzaekVar == null) {
                            com.google.android.gms.internal.ads.zzdo.zzf("AviExtractor", "Missing Stream Format");
                        } else {
                            int i11 = zzaehVar.zzd;
                            int i12 = zzaehVar.zzb;
                            int i13 = zzaehVar.zzc;
                            com.google.android.gms.internal.ads.zzab zzabVar = zzaekVar.zza;
                            i = i10;
                            long jZzu = com.google.android.gms.internal.ads.zzei.zzu(i11, ((long) i12) * 1000000, i13, java.math.RoundingMode.DOWN);
                            com.google.android.gms.internal.ads.zzz zzzVarZzb = zzabVar.zzb();
                            zzzVarZzb.zzL(i9);
                            int i14 = zzaehVar.zze;
                            if (i14 != 0) {
                                zzzVarZzb.zzR(i14);
                            }
                            com.google.android.gms.internal.ads.zzael zzaelVar = (com.google.android.gms.internal.ads.zzael) zzaejVar.zzb(com.google.android.gms.internal.ads.zzael.class);
                            if (zzaelVar != null) {
                                zzzVarZzb.zzO(zzaelVar.zza);
                            }
                            int iZzb = com.google.android.gms.internal.ads.zzbb.zzb(zzabVar.zzo);
                            if (iZzb == 1) {
                                i2 = iZzb;
                            } else if (iZzb == 2) {
                                i2 = 2;
                            } else {
                                zzaeiVar = null;
                            }
                            com.google.android.gms.internal.ads.zzadt zzadtVarZzw = this.zzf.zzw(i9, i2);
                            zzadtVarZzw.zzm(zzzVarZzb.zzag());
                            zzaeiVar = new com.google.android.gms.internal.ads.zzaei(i9, i2, jZzu, zzaehVar.zzd, zzadtVarZzw);
                            this.zzh = java.lang.Math.max(this.zzh, jZzu);
                        }
                        if (zzaeiVar != null) {
                            arrayList.add(zzaeiVar);
                        }
                        i9 = i;
                    }
                    zzaeiVar = zzaeiVar2;
                    i = i10;
                    if (zzaeiVar != null) {
                        arrayList.add(zzaeiVar);
                    }
                    i9 = i;
                }
                i8++;
                zzaeiVar2 = null;
                i3 = 0;
            }
            int i15 = i3;
            this.zzi = (com.google.android.gms.internal.ads.zzaei[]) arrayList.toArray(new com.google.android.gms.internal.ads.zzaei[i15]);
            this.zzf.zzD();
            this.zze = 3;
            return i15;
        }
        if (i4 == 3) {
            long j3 = this.zzm;
            if (j3 != -1 && zzacoVar.zzf() != j3) {
                this.zzj = j3;
                return 0;
            }
            zzacoVar.zzh(this.zza.zzN(), 0, 12);
            zzacoVar.zzj();
            this.zza.zzL(0);
            this.zzb.zza(this.zza);
            com.google.android.gms.internal.ads.zzdy zzdyVar3 = this.zza;
            com.google.android.gms.internal.ads.zzaed zzaedVar3 = this.zzb;
            int iZzi = zzdyVar3.zzi();
            int i16 = zzaedVar3.zza;
            if (i16 == 1179011410) {
                zzacoVar.zzk(12);
                return 0;
            }
            if (i16 != 1414744396 || iZzi != 1769369453) {
                this.zzj = zzacoVar.zzf() + ((long) this.zzb.zzb) + 8;
                return 0;
            }
            long jZzf2 = zzacoVar.zzf();
            this.zzm = jZzf2;
            long j4 = jZzf2 + ((long) this.zzb.zzb) + 8;
            this.zzn = j4;
            if (!this.zzp) {
                com.google.android.gms.internal.ads.zzaeg zzaegVar2 = this.zzg;
                zzaegVar2.getClass();
                if ((zzaegVar2.zzb & 16) == 16) {
                    this.zze = 4;
                    this.zzj = j4;
                    return 0;
                }
                this.zzf.zzO(new com.google.android.gms.internal.ads.zzadl(this.zzh, 0L));
                this.zzp = true;
            }
            this.zzj = zzacoVar.zzf() + 12;
            this.zze = 6;
            return 0;
        }
        if (i4 == 4) {
            zzacoVar.zzi(this.zza.zzN(), 0, 8);
            this.zza.zzL(0);
            com.google.android.gms.internal.ads.zzdy zzdyVar4 = this.zza;
            int iZzi2 = zzdyVar4.zzi();
            int iZzi3 = zzdyVar4.zzi();
            if (iZzi2 == 829973609) {
                this.zze = 5;
                this.zzo = iZzi3;
            } else {
                this.zzj = zzacoVar.zzf() + ((long) iZzi3);
            }
            return 0;
        }
        if (i4 == 5) {
            com.google.android.gms.internal.ads.zzdy zzdyVar5 = new com.google.android.gms.internal.ads.zzdy(this.zzo);
            zzacoVar.zzi(zzdyVar5.zzN(), 0, this.zzo);
            if (zzdyVar5.zzb() < 16) {
                j = 0;
            } else {
                int iZzd = zzdyVar5.zzd();
                zzdyVar5.zzM(8);
                long jZzi = zzdyVar5.zzi();
                long j5 = this.zzm;
                j = jZzi > j5 ? 0L : j5 + 8;
                zzdyVar5.zzL(iZzd);
            }
            while (zzdyVar5.zzb() >= 16) {
                int iZzi4 = zzdyVar5.zzi();
                int iZzi5 = zzdyVar5.zzi();
                long jZzi2 = ((long) zzdyVar5.zzi()) + j;
                zzdyVar5.zzi();
                com.google.android.gms.internal.ads.zzaei zzaeiVarZzg = zzg(iZzi4);
                if (zzaeiVarZzg != null) {
                    zzaeiVarZzg.zzb(jZzi2, (iZzi5 & 16) == 16);
                }
            }
            for (com.google.android.gms.internal.ads.zzaei zzaeiVar3 : this.zzi) {
                zzaeiVar3.zzc();
            }
            this.zzp = true;
            this.zzf.zzO(new com.google.android.gms.internal.ads.zzaec(this, this.zzh));
            this.zze = 6;
            this.zzj = this.zzm;
            return 0;
        }
        if (zzacoVar.zzf() >= this.zzn) {
            return -1;
        }
        com.google.android.gms.internal.ads.zzaei zzaeiVar4 = this.zzk;
        if (zzaeiVar4 != null) {
            if (!zzaeiVar4.zzg(zzacoVar)) {
                return 0;
            }
            this.zzk = null;
            return 0;
        }
        if ((zzacoVar.zzf() & 1) == 1) {
            zzacoVar.zzk(1);
        }
        zzacoVar.zzh(this.zza.zzN(), 0, 12);
        this.zza.zzL(0);
        int iZzi6 = this.zza.zzi();
        if (iZzi6 == 1414744396) {
            this.zza.zzL(8);
            zzacoVar.zzk(this.zza.zzi() != 1769369453 ? 8 : 12);
            zzacoVar.zzj();
            return 0;
        }
        int iZzi7 = this.zza.zzi();
        if (iZzi6 == 1263424842) {
            this.zzj = zzacoVar.zzf() + ((long) iZzi7) + 8;
            return 0;
        }
        zzacoVar.zzk(8);
        zzacoVar.zzj();
        com.google.android.gms.internal.ads.zzaei zzaeiVarZzg2 = zzg(iZzi6);
        if (zzaeiVarZzg2 == null) {
            this.zzj = zzacoVar.zzf() + ((long) iZzi7);
            return 0;
        }
        zzaeiVarZzg2.zzd(iZzi7);
        this.zzk = zzaeiVarZzg2;
        return 0;
    }
}
