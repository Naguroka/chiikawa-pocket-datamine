package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaiv implements com.google.android.gms.internal.ads.zzacn, com.google.android.gms.internal.ads.zzadm {
    private int zzA;
    private com.google.android.gms.internal.ads.zzagv zzB;
    private final com.google.android.gms.internal.ads.zzakd zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzdy zzc;
    private final com.google.android.gms.internal.ads.zzdy zzd;
    private final com.google.android.gms.internal.ads.zzdy zze;
    private final com.google.android.gms.internal.ads.zzdy zzf;
    private final java.util.ArrayDeque zzg;
    private final com.google.android.gms.internal.ads.zzaiz zzh;
    private final java.util.List zzi;
    private com.google.android.gms.internal.ads.zzfxn zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;
    private com.google.android.gms.internal.ads.zzdy zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private com.google.android.gms.internal.ads.zzacq zzv;
    private com.google.android.gms.internal.ads.zzaiu[] zzw;
    private long[][] zzx;
    private int zzy;
    private long zzz;

    @java.lang.Deprecated
    public zzaiv() {
        this(com.google.android.gms.internal.ads.zzakd.zza, 16);
    }

    private static int zzj(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzk(com.google.android.gms.internal.ads.zzaje zzajeVar, long j) {
        int iZza = zzajeVar.zza(j);
        return iZza == -1 ? zzajeVar.zzb(j) : iZza;
    }

    private static long zzl(com.google.android.gms.internal.ads.zzaje zzajeVar, long j, long j2) {
        int iZzk = zzk(zzajeVar, j);
        return iZzk == -1 ? j2 : java.lang.Math.min(zzajeVar.zzc[iZzk], j2);
    }

    private final void zzm() {
        this.zzk = 0;
        this.zzn = 0;
    }

    private final void zzn(long j) throws com.google.android.gms.internal.ads.zzbc {
        com.google.android.gms.internal.ads.zzay zzayVar;
        long j2;
        com.google.android.gms.internal.ads.zzay zzayVar2;
        int i;
        java.util.ArrayList arrayList;
        int i2;
        while (!this.zzg.isEmpty() && ((com.google.android.gms.internal.ads.zzen) this.zzg.peek()).zza == j) {
            com.google.android.gms.internal.ads.zzen zzenVar = (com.google.android.gms.internal.ads.zzen) this.zzg.pop();
            if (zzenVar.zzd == 1836019574) {
                com.google.android.gms.internal.ads.zzen zzenVarZza = zzenVar.zza(androidx.media3.extractor.mp4.Atom.TYPE_meta);
                new java.util.ArrayList();
                com.google.android.gms.internal.ads.zzay zzayVarZzb = zzenVarZza != null ? com.google.android.gms.internal.ads.zzaik.zzb(zzenVarZza) : null;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                boolean z = this.zzA == 1;
                com.google.android.gms.internal.ads.zzadb zzadbVar = new com.google.android.gms.internal.ads.zzadb();
                com.google.android.gms.internal.ads.zzeo zzeoVarZzb = zzenVar.zzb(androidx.media3.extractor.mp4.Atom.TYPE_udta);
                if (zzeoVarZzb != null) {
                    com.google.android.gms.internal.ads.zzay zzayVarZzc = com.google.android.gms.internal.ads.zzaik.zzc(zzeoVarZzb);
                    zzadbVar.zzb(zzayVarZzc);
                    zzayVar = zzayVarZzc;
                } else {
                    zzayVar = null;
                }
                com.google.android.gms.internal.ads.zzeo zzeoVarZzb2 = zzenVar.zzb(androidx.media3.extractor.mp4.Atom.TYPE_mvhd);
                zzeoVarZzb2.getClass();
                com.google.android.gms.internal.ads.zzay zzayVar3 = new com.google.android.gms.internal.ads.zzay(androidx.media3.common.C.TIME_UNSET, com.google.android.gms.internal.ads.zzaik.zzd(zzeoVarZzb2.zza));
                java.util.ArrayList arrayList3 = arrayList2;
                long j3 = -9223372036854775807L;
                java.util.List listZzf = com.google.android.gms.internal.ads.zzaik.zzf(zzenVar, zzadbVar, androidx.media3.common.C.TIME_UNSET, null, 1 == (this.zzb & 1), z, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzait
                    @Override // com.google.android.gms.internal.ads.zzfuc
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return (com.google.android.gms.internal.ads.zzajb) obj;
                    }
                });
                long jMax = -9223372036854775807L;
                int i3 = 0;
                int i4 = 0;
                int size = -1;
                while (true) {
                    j2 = 0;
                    if (i3 >= listZzf.size()) {
                        break;
                    }
                    com.google.android.gms.internal.ads.zzaje zzajeVar = (com.google.android.gms.internal.ads.zzaje) listZzf.get(i3);
                    if (zzajeVar.zzb == 0) {
                        arrayList = arrayList3;
                    } else {
                        com.google.android.gms.internal.ads.zzajb zzajbVar = zzajeVar.zza;
                        int i5 = i4 + 1;
                        com.google.android.gms.internal.ads.zzaiu zzaiuVar = new com.google.android.gms.internal.ads.zzaiu(zzajbVar, zzajeVar, this.zzv.zzw(i4, zzajbVar.zzb));
                        long j4 = zzajbVar.zze;
                        if (j4 == j3) {
                            j4 = zzajeVar.zzh;
                        }
                        zzaiuVar.zzc.zzl(j4);
                        jMax = java.lang.Math.max(jMax, j4);
                        int i6 = androidx.media3.common.MimeTypes.AUDIO_TRUEHD.equals(zzajbVar.zzg.zzo) ? zzajeVar.zze * 16 : zzajeVar.zze + 30;
                        com.google.android.gms.internal.ads.zzz zzzVarZzb = zzajbVar.zzg.zzb();
                        zzzVarZzb.zzR(i6);
                        if (zzajbVar.zzb == 2) {
                            com.google.android.gms.internal.ads.zzab zzabVar = zzajbVar.zzg;
                            int i7 = this.zzb;
                            int i8 = zzabVar.zzf;
                            if ((i7 & 8) != 0) {
                                i8 |= size == -1 ? 1 : 2;
                            }
                            if (zzabVar.zzx == -1.0f && j4 > 0 && (i2 = zzajeVar.zzb) > 0) {
                                zzzVarZzb.zzI(i2 / (j4 / 1000000.0f));
                            }
                            zzzVarZzb.zzY(i8);
                        }
                        if (zzajbVar.zzb == 1 && zzadbVar.zza()) {
                            zzzVarZzb.zzG(zzadbVar.zza);
                            zzzVarZzb.zzH(zzadbVar.zzb);
                        }
                        int i9 = zzajbVar.zzb;
                        com.google.android.gms.internal.ads.zzay[] zzayVarArr = new com.google.android.gms.internal.ads.zzay[3];
                        if (this.zzi.isEmpty()) {
                            i = 0;
                            zzayVar2 = null;
                        } else {
                            zzayVar2 = new com.google.android.gms.internal.ads.zzay(this.zzi);
                            i = 0;
                        }
                        zzayVarArr[i] = zzayVar2;
                        zzayVarArr[1] = zzayVar;
                        zzayVarArr[2] = zzayVar3;
                        com.google.android.gms.internal.ads.zzay zzayVar4 = new com.google.android.gms.internal.ads.zzay(androidx.media3.common.C.TIME_UNSET, new com.google.android.gms.internal.ads.zzax[i]);
                        if (zzayVarZzb != null) {
                            for (int i10 = 0; i10 < zzayVarZzb.zza(); i10++) {
                                com.google.android.gms.internal.ads.zzax zzaxVarZzb = zzayVarZzb.zzb(i10);
                                if (zzaxVarZzb instanceof com.google.android.gms.internal.ads.zzem) {
                                    com.google.android.gms.internal.ads.zzem zzemVar = (com.google.android.gms.internal.ads.zzem) zzaxVarZzb;
                                    if (!zzemVar.zza.equals(androidx.media3.container.MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                                        zzayVar4 = zzayVar4.zzc(zzemVar);
                                    } else if (i9 == 2) {
                                        zzayVar4 = zzayVar4.zzc(zzemVar);
                                    }
                                }
                            }
                        }
                        for (int i11 = 0; i11 < 3; i11++) {
                            zzayVar4 = zzayVar4.zzd(zzayVarArr[i11]);
                        }
                        if (zzayVar4.zza() > 0) {
                            zzzVarZzb.zzT(zzayVar4);
                        }
                        zzaiuVar.zzc.zzm(zzzVarZzb.zzag());
                        if (zzajbVar.zzb == 2 && size == -1) {
                            size = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzaiuVar);
                        i4 = i5;
                    }
                    i3++;
                    arrayList3 = arrayList;
                    listZzf = listZzf;
                    j3 = androidx.media3.common.C.TIME_UNSET;
                }
                this.zzy = size;
                this.zzz = jMax;
                com.google.android.gms.internal.ads.zzaiu[] zzaiuVarArr = (com.google.android.gms.internal.ads.zzaiu[]) arrayList3.toArray(new com.google.android.gms.internal.ads.zzaiu[0]);
                this.zzw = zzaiuVarArr;
                int length = zzaiuVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i12 = 0; i12 < zzaiuVarArr.length; i12++) {
                    jArr[i12] = new long[zzaiuVarArr[i12].zzb.zzb];
                    jArr2[i12] = zzaiuVarArr[i12].zzb.zzf[0];
                }
                int i13 = 0;
                while (i13 < zzaiuVarArr.length) {
                    long j5 = Long.MAX_VALUE;
                    int i14 = -1;
                    for (int i15 = 0; i15 < zzaiuVarArr.length; i15++) {
                        if (!zArr[i15]) {
                            long j6 = jArr2[i15];
                            if (j6 <= j5) {
                                i14 = i15;
                                j5 = j6;
                            }
                        }
                    }
                    int i16 = iArr[i14];
                    long[] jArr3 = jArr[i14];
                    jArr3[i16] = j2;
                    com.google.android.gms.internal.ads.zzaje zzajeVar2 = zzaiuVarArr[i14].zzb;
                    j2 += (long) zzajeVar2.zzd[i16];
                    int i17 = i16 + 1;
                    iArr[i14] = i17;
                    if (i17 < jArr3.length) {
                        jArr2[i14] = zzajeVar2.zzf[i17];
                    } else {
                        zArr[i14] = true;
                        i13++;
                    }
                }
                this.zzx = jArr;
                this.zzv.zzD();
                this.zzv.zzO(this);
                this.zzg.clear();
                this.zzk = 2;
            } else if (!this.zzg.isEmpty()) {
                ((com.google.android.gms.internal.ads.zzen) this.zzg.peek()).zzc(zzenVar);
            }
        }
        if (this.zzk != 2) {
            zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ com.google.android.gms.internal.ads.zzacn zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ java.util.List zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zze(com.google.android.gms.internal.ads.zzacq zzacqVar) {
        if ((this.zzb & 16) == 0) {
            zzacqVar = new com.google.android.gms.internal.ads.zzakg(zzacqVar, this.zza);
        }
        this.zzv = zzacqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzg.clear();
        this.zzn = 0;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = true;
        if (j == 0) {
            if (this.zzk != 3) {
                zzm();
                return;
            } else {
                this.zzh.zzb();
                this.zzi.clear();
                return;
            }
        }
        for (com.google.android.gms.internal.ads.zzaiu zzaiuVar : this.zzw) {
            com.google.android.gms.internal.ads.zzaje zzajeVar = zzaiuVar.zzb;
            int iZza = zzajeVar.zza(j2);
            if (iZza == -1) {
                iZza = zzajeVar.zzb(j2);
            }
            zzaiuVar.zze = iZza;
            com.google.android.gms.internal.ads.zzadu zzaduVar = zzaiuVar.zzd;
            if (zzaduVar != null) {
                zzaduVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final com.google.android.gms.internal.ads.zzadk zzg(long j) {
        long j2;
        long j3;
        int iZzb;
        com.google.android.gms.internal.ads.zzaiu[] zzaiuVarArr = this.zzw;
        if (zzaiuVarArr.length == 0) {
            com.google.android.gms.internal.ads.zzadn zzadnVar = com.google.android.gms.internal.ads.zzadn.zza;
            return new com.google.android.gms.internal.ads.zzadk(zzadnVar, zzadnVar);
        }
        int i = this.zzy;
        long jZzl = -1;
        if (i != -1) {
            com.google.android.gms.internal.ads.zzaje zzajeVar = zzaiuVarArr[i].zzb;
            int iZzk = zzk(zzajeVar, j);
            if (iZzk == -1) {
                com.google.android.gms.internal.ads.zzadn zzadnVar2 = com.google.android.gms.internal.ads.zzadn.zza;
                return new com.google.android.gms.internal.ads.zzadk(zzadnVar2, zzadnVar2);
            }
            long j4 = zzajeVar.zzf[iZzk];
            j2 = zzajeVar.zzc[iZzk];
            if (j4 >= j || iZzk >= zzajeVar.zzb - 1 || (iZzb = zzajeVar.zzb(j)) == -1 || iZzb == iZzk) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzajeVar.zzf[iZzb];
                jZzl = zzajeVar.zzc[iZzb];
            }
            j = j4;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzaiu[] zzaiuVarArr2 = this.zzw;
            if (i2 >= zzaiuVarArr2.length) {
                break;
            }
            if (i2 != this.zzy) {
                com.google.android.gms.internal.ads.zzaje zzajeVar2 = zzaiuVarArr2[i2].zzb;
                long jZzl2 = zzl(zzajeVar2, j, j2);
                if (j3 != androidx.media3.common.C.TIME_UNSET) {
                    jZzl = zzl(zzajeVar2, j3, jZzl);
                }
                j2 = jZzl2;
            }
            i2++;
        }
        com.google.android.gms.internal.ads.zzadn zzadnVar3 = new com.google.android.gms.internal.ads.zzadn(j, j2);
        return j3 == androidx.media3.common.C.TIME_UNSET ? new com.google.android.gms.internal.ads.zzadk(zzadnVar3, zzadnVar3) : new com.google.android.gms.internal.ads.zzadk(zzadnVar3, new com.google.android.gms.internal.ads.zzadn(j3, jZzl));
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzadq zzadqVarZzb = com.google.android.gms.internal.ads.zzaja.zzb(zzacoVar, (this.zzb & 2) != 0);
        this.zzj = zzadqVarZzb != null ? com.google.android.gms.internal.ads.zzfxn.zzo(zzadqVarZzb) : com.google.android.gms.internal.ads.zzfxn.zzn();
        return zzadqVarZzb == null;
    }

    public zzaiv(com.google.android.gms.internal.ads.zzakd zzakdVar, int i) {
        this.zza = zzakdVar;
        this.zzb = i;
        this.zzj = com.google.android.gms.internal.ads.zzfxn.zzn();
        this.zzk = (i & 4) != 0 ? 3 : 0;
        this.zzh = new com.google.android.gms.internal.ads.zzaiz();
        this.zzi = new java.util.ArrayList();
        this.zzf = new com.google.android.gms.internal.ads.zzdy(16);
        this.zzg = new java.util.ArrayDeque();
        this.zzc = new com.google.android.gms.internal.ads.zzdy(com.google.android.gms.internal.ads.zzfk.zza);
        this.zzd = new com.google.android.gms.internal.ads.zzdy(5);
        this.zze = new com.google.android.gms.internal.ads.zzdy();
        this.zzp = -1;
        this.zzv = com.google.android.gms.internal.ads.zzacq.zza;
        this.zzw = new com.google.android.gms.internal.ads.zzaiu[0];
        this.zzt = true;
    }

    /* JADX WARN: Code duplicated, block: B:291:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0082  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        char c;
        boolean z;
        boolean z2;
        while (true) {
            int i = this.zzk;
            if (i == 0) {
                if (this.zzn == 0) {
                    if (!zzacoVar.zzn(this.zzf.zzN(), 0, 8, true)) {
                        if (this.zzA != 2 || (this.zzb & 2) == 0) {
                            return -1;
                        }
                        com.google.android.gms.internal.ads.zzadt zzadtVarZzw = this.zzv.zzw(0, 4);
                        com.google.android.gms.internal.ads.zzagv zzagvVar = this.zzB;
                        com.google.android.gms.internal.ads.zzay zzayVar = zzagvVar == null ? null : new com.google.android.gms.internal.ads.zzay(androidx.media3.common.C.TIME_UNSET, zzagvVar);
                        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                        zzzVar.zzT(zzayVar);
                        zzadtVarZzw.zzm(zzzVar.zzag());
                        this.zzv.zzD();
                        this.zzv.zzO(new com.google.android.gms.internal.ads.zzadl(androidx.media3.common.C.TIME_UNSET, 0L));
                        return -1;
                    }
                    this.zzn = 8;
                    this.zzf.zzL(0);
                    this.zzm = this.zzf.zzu();
                    this.zzl = this.zzf.zzg();
                }
                long j = this.zzm;
                if (j == 1) {
                    zzacoVar.zzi(this.zzf.zzN(), 8, 8);
                    this.zzn += 8;
                    this.zzm = this.zzf.zzw();
                } else if (j == 0) {
                    long jZzd = zzacoVar.zzd();
                    if (jZzd == -1) {
                        com.google.android.gms.internal.ads.zzen zzenVar = (com.google.android.gms.internal.ads.zzen) this.zzg.peek();
                        jZzd = zzenVar != null ? zzenVar.zza : -1L;
                    }
                    if (jZzd != -1) {
                        this.zzm = (jZzd - zzacoVar.zzf()) + ((long) this.zzn);
                    }
                }
                long j2 = this.zzm;
                int i2 = this.zzn;
                if (j2 < i2) {
                    throw com.google.android.gms.internal.ads.zzbc.zzc("Atom size less than header length (unsupported).");
                }
                int i3 = this.zzl;
                if (i3 == 1836019574 || i3 == 1953653099 || i3 == 1835297121 || i3 == 1835626086 || i3 == 1937007212 || i3 == 1701082227 || i3 == 1835365473 || i3 == 1701082724) {
                    long jZzf = zzacoVar.zzf();
                    long j3 = this.zzm;
                    long j4 = jZzf + j3;
                    long j5 = this.zzn;
                    if (j3 != j5 && this.zzl == 1835365473) {
                        this.zze.zzI(8);
                        zzacoVar.zzh(this.zze.zzN(), 0, 8);
                        com.google.android.gms.internal.ads.zzaik.zzg(this.zze);
                        zzacoVar.zzk(this.zze.zzd());
                        zzacoVar.zzj();
                    }
                    long j6 = j4 - j5;
                    this.zzg.push(new com.google.android.gms.internal.ads.zzen(this.zzl, j6));
                    if (this.zzm == this.zzn) {
                        zzn(j6);
                    } else {
                        zzm();
                    }
                } else if (i3 == 1835296868 || i3 == 1836476516 || i3 == 1751411826 || i3 == 1937011556 || i3 == 1937011827 || i3 == 1937011571 || i3 == 1668576371 || i3 == 1701606260 || i3 == 1937011555 || i3 == 1937011578 || i3 == 1937013298 || i3 == 1937007471 || i3 == 1668232756 || i3 == 1953196132 || i3 == 1718909296 || i3 == 1969517665 || i3 == 1801812339 || i3 == 1768715124) {
                    com.google.android.gms.internal.ads.zzcw.zzf(i2 == 8);
                    com.google.android.gms.internal.ads.zzcw.zzf(this.zzm <= 2147483647L);
                    com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy((int) this.zzm);
                    java.lang.System.arraycopy(this.zzf.zzN(), 0, zzdyVar.zzN(), 0, 8);
                    this.zzo = zzdyVar;
                    this.zzk = 1;
                } else {
                    long jZzf2 = zzacoVar.zzf();
                    long j7 = this.zzn;
                    long j8 = jZzf2 - j7;
                    if (this.zzl == 1836086884) {
                        this.zzB = new com.google.android.gms.internal.ads.zzagv(0L, j8, androidx.media3.common.C.TIME_UNSET, j8 + j7, this.zzm - j7);
                    }
                    this.zzo = null;
                    this.zzk = 1;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        this.zzh.zza(zzacoVar, zzadjVar, this.zzi);
                        if (zzadjVar.zza == 0) {
                            zzm();
                        }
                        return 1;
                    }
                    long jZzf3 = zzacoVar.zzf();
                    int i4 = this.zzp;
                    if (i4 == -1) {
                        int i5 = -1;
                        int i6 = -1;
                        boolean z3 = true;
                        boolean z4 = true;
                        long j9 = Long.MAX_VALUE;
                        long j10 = Long.MAX_VALUE;
                        long j11 = Long.MAX_VALUE;
                        int i7 = 0;
                        while (true) {
                            com.google.android.gms.internal.ads.zzaiu[] zzaiuVarArr = this.zzw;
                            if (i7 >= zzaiuVarArr.length) {
                                break;
                            }
                            com.google.android.gms.internal.ads.zzaiu zzaiuVar = zzaiuVarArr[i7];
                            int i8 = zzaiuVar.zze;
                            com.google.android.gms.internal.ads.zzaje zzajeVar = zzaiuVar.zzb;
                            if (i8 != zzajeVar.zzb) {
                                long j12 = zzajeVar.zzc[i8];
                                long[][] jArr = this.zzx;
                                int i9 = com.google.android.gms.internal.ads.zzei.zza;
                                long j13 = jArr[i7][i8];
                                long j14 = j12 - jZzf3;
                                boolean z5 = j14 < 0 || j14 >= 262144;
                                if (z5) {
                                    z = z4;
                                } else {
                                    if (z4) {
                                        z4 = z5;
                                        i6 = i7;
                                        j11 = j14;
                                        j10 = j13;
                                    } else {
                                        z = false;
                                    }
                                    if (j13 < j9) {
                                        z3 = z5;
                                        i5 = i7;
                                        j9 = j13;
                                    }
                                }
                                if (z5 != z || j14 >= j11) {
                                    z4 = z;
                                } else {
                                    z4 = z5;
                                    i6 = i7;
                                    j11 = j14;
                                    j10 = j13;
                                }
                                if (j13 < j9) {
                                    z3 = z5;
                                    i5 = i7;
                                    j9 = j13;
                                }
                            }
                            i7++;
                        }
                        i4 = (j9 == Long.MAX_VALUE || !z3 || j10 < j9 + 10485760) ? i6 : i5;
                        this.zzp = i4;
                        if (i4 == -1) {
                            return -1;
                        }
                    }
                    com.google.android.gms.internal.ads.zzaiu zzaiuVar2 = this.zzw[i4];
                    com.google.android.gms.internal.ads.zzadt zzadtVar = zzaiuVar2.zzc;
                    int i10 = zzaiuVar2.zze;
                    com.google.android.gms.internal.ads.zzaje zzajeVar2 = zzaiuVar2.zzb;
                    long j15 = zzajeVar2.zzc[i10];
                    int i11 = zzajeVar2.zzd[i10];
                    com.google.android.gms.internal.ads.zzadu zzaduVar = zzaiuVar2.zzd;
                    long j16 = (j15 - jZzf3) + ((long) this.zzq);
                    if (j16 < 0 || j16 >= 262144) {
                        zzadjVar.zza = j15;
                        return 1;
                    }
                    if (zzaiuVar2.zza.zzh == 1) {
                        j16 += 8;
                        i11 -= 8;
                    }
                    zzacoVar.zzk((int) j16);
                    if (java.util.Objects.equals(zzaiuVar2.zza.zzg.zzo, "video/avc")) {
                        c = 1;
                    } else {
                        c = 1;
                        this.zzt = true;
                    }
                    com.google.android.gms.internal.ads.zzajb zzajbVar = zzaiuVar2.zza;
                    int i12 = zzajbVar.zzk;
                    if (i12 == 0) {
                        if (androidx.media3.common.MimeTypes.AUDIO_AC4.equals(zzajbVar.zzg.zzo)) {
                            if (this.zzr == 0) {
                                com.google.android.gms.internal.ads.zzabq.zzb(i11, this.zze);
                                zzadtVar.zzr(this.zze, 7);
                                this.zzr += 7;
                            }
                            i11 += 7;
                        } else if (zzaduVar != null) {
                            zzaduVar.zzd(zzacoVar);
                        }
                        while (true) {
                            int i13 = this.zzr;
                            if (i13 >= i11) {
                                break;
                            }
                            int iZzf = zzadtVar.zzf(zzacoVar, i11 - i13, false);
                            this.zzq += iZzf;
                            this.zzr += iZzf;
                            this.zzs -= iZzf;
                        }
                    } else {
                        byte[] bArrZzN = this.zzd.zzN();
                        bArrZzN[0] = 0;
                        bArrZzN[c] = 0;
                        bArrZzN[2] = 0;
                        int i14 = i12 + 1;
                        int i15 = 4 - i12;
                        while (this.zzr < i11) {
                            int i16 = this.zzs;
                            if (i16 == 0) {
                                zzacoVar.zzi(bArrZzN, i15, i14);
                                this.zzq += i14;
                                this.zzd.zzL(0);
                                int iZzg = this.zzd.zzg();
                                if (iZzg <= 0) {
                                    throw com.google.android.gms.internal.ads.zzbc.zza("Invalid NAL length", null);
                                }
                                this.zzs = iZzg - 1;
                                this.zzc.zzL(0);
                                zzadtVar.zzr(this.zzc, 4);
                                zzadtVar.zzr(this.zzd, 1);
                                this.zzr += 5;
                                i11 += i15;
                                if (!this.zzt && com.google.android.gms.internal.ads.zzfk.zzi(bArrZzN[4])) {
                                    this.zzt = true;
                                }
                            } else {
                                int iZzf2 = zzadtVar.zzf(zzacoVar, i16, false);
                                this.zzq += iZzf2;
                                this.zzr += iZzf2;
                                this.zzs -= iZzf2;
                            }
                        }
                    }
                    com.google.android.gms.internal.ads.zzaje zzajeVar3 = zzaiuVar2.zzb;
                    long j17 = zzajeVar3.zzf[i10];
                    int i17 = zzajeVar3.zzg[i10];
                    if (!this.zzt) {
                        i17 |= 67108864;
                    }
                    if (zzaduVar != null) {
                        zzaduVar.zzc(zzadtVar, j17, i17, i11, 0, null);
                        if (i10 + 1 == zzaiuVar2.zzb.zzb) {
                            zzaduVar.zza(zzadtVar, null);
                        }
                    } else {
                        zzadtVar.zzt(j17, i17, i11, 0, null);
                    }
                    zzaiuVar2.zze++;
                    this.zzp = -1;
                    this.zzq = 0;
                    this.zzr = 0;
                    this.zzs = 0;
                    this.zzt = true;
                    return 0;
                }
                long j18 = this.zzm - ((long) this.zzn);
                long jZzf4 = zzacoVar.zzf() + j18;
                com.google.android.gms.internal.ads.zzdy zzdyVar2 = this.zzo;
                if (zzdyVar2 != null) {
                    zzacoVar.zzi(zzdyVar2.zzN(), this.zzn, (int) j18);
                    if (this.zzl == 1718909296) {
                        this.zzu = true;
                        zzdyVar2.zzL(8);
                        int iZzj = zzj(zzdyVar2.zzg());
                        if (iZzj == 0) {
                            zzdyVar2.zzM(4);
                            do {
                                if (zzdyVar2.zzb() <= 0) {
                                    iZzj = 0;
                                    break;
                                }
                                iZzj = zzj(zzdyVar2.zzg());
                            } while (iZzj == 0);
                        }
                        this.zzA = iZzj;
                    } else if (!this.zzg.isEmpty()) {
                        ((com.google.android.gms.internal.ads.zzen) this.zzg.peek()).zzd(new com.google.android.gms.internal.ads.zzeo(this.zzl, zzdyVar2));
                    }
                } else {
                    if (!this.zzu && this.zzl == 1835295092) {
                        this.zzA = 1;
                    }
                    if (j18 < 262144) {
                        zzacoVar.zzk((int) j18);
                    } else {
                        zzadjVar.zza = zzacoVar.zzf() + j18;
                        z2 = true;
                    }
                    zzn(jZzf4);
                    if (z2 && this.zzk != 2) {
                        return 1;
                    }
                }
                z2 = false;
                zzn(jZzf4);
                if (z2) {
                    continue;
                }
            }
        }
    }
}
