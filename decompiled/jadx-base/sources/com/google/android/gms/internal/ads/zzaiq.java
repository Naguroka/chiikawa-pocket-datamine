package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaiq implements com.google.android.gms.internal.ads.zzacn {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final com.google.android.gms.internal.ads.zzab zzb;
    private long zzA;
    private com.google.android.gms.internal.ads.zzaip zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private com.google.android.gms.internal.ads.zzacq zzH;
    private com.google.android.gms.internal.ads.zzadt[] zzI;
    private com.google.android.gms.internal.ads.zzadt[] zzJ;
    private boolean zzK;
    private final com.google.android.gms.internal.ads.zzakd zzc;
    private final int zzd;
    private final java.util.List zze;
    private final android.util.SparseArray zzf;
    private final com.google.android.gms.internal.ads.zzdy zzg;
    private final com.google.android.gms.internal.ads.zzdy zzh;
    private final com.google.android.gms.internal.ads.zzdy zzi;
    private final byte[] zzj;
    private final com.google.android.gms.internal.ads.zzdy zzk;
    private final com.google.android.gms.internal.ads.zzafl zzl;
    private final com.google.android.gms.internal.ads.zzdy zzm;
    private final java.util.ArrayDeque zzn;
    private final java.util.ArrayDeque zzo;
    private final com.google.android.gms.internal.ads.zzfo zzp;
    private com.google.android.gms.internal.ads.zzfxn zzq;
    private int zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private com.google.android.gms.internal.ads.zzdy zzv;
    private long zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    static {
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
        zzzVar.zzaa(androidx.media3.common.MimeTypes.APPLICATION_EMSG);
        zzb = zzzVar.zzag();
    }

    @java.lang.Deprecated
    public zzaiq() {
        this(com.google.android.gms.internal.ads.zzakd.zza, 32, null, null, com.google.android.gms.internal.ads.zzfxn.zzn(), null);
    }

    private static int zzg(int i) throws com.google.android.gms.internal.ads.zzbc {
        if (i >= 0) {
            return i;
        }
        throw com.google.android.gms.internal.ads.zzbc.zza("Unexpected negative value: " + i, null);
    }

    private static com.google.android.gms.internal.ads.zzu zzh(java.util.List list) {
        int i;
        java.util.ArrayList arrayList;
        java.util.UUID[] uuidArr;
        com.google.android.gms.internal.ads.zzaix zzaixVar;
        int size = list.size();
        int i2 = 0;
        java.util.ArrayList arrayList2 = null;
        while (i2 < size) {
            com.google.android.gms.internal.ads.zzeo zzeoVar = (com.google.android.gms.internal.ads.zzeo) list.get(i2);
            if (zzeoVar.zzd == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                byte[] bArrZzN = zzeoVar.zza.zzN();
                com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy(bArrZzN);
                if (zzdyVar.zze() < 32) {
                    i = i2;
                    arrayList = arrayList2;
                    zzaixVar = null;
                } else {
                    zzdyVar.zzL(0);
                    int iZzb = zzdyVar.zzb();
                    int iZzg = zzdyVar.zzg();
                    if (iZzg != iZzb) {
                        com.google.android.gms.internal.ads.zzdo.zzf("PsshAtomUtil", "Advertised atom size (" + iZzg + ") does not match buffer size: " + iZzb);
                    } else {
                        int iZzg2 = zzdyVar.zzg();
                        if (iZzg2 != 1886614376) {
                            com.google.android.gms.internal.ads.zzdo.zzf("PsshAtomUtil", "Atom type is not pssh: " + iZzg2);
                        } else {
                            int iZza = com.google.android.gms.internal.ads.zzaik.zza(zzdyVar.zzg());
                            if (iZza > 1) {
                                com.google.android.gms.internal.ads.zzdo.zzf("PsshAtomUtil", "Unsupported pssh version: " + iZza);
                            } else {
                                java.util.UUID uuid = new java.util.UUID(zzdyVar.zzt(), zzdyVar.zzt());
                                if (iZza == 1) {
                                    int iZzp = zzdyVar.zzp();
                                    uuidArr = new java.util.UUID[iZzp];
                                    int i3 = 0;
                                    while (i3 < iZzp) {
                                        uuidArr[i3] = new java.util.UUID(zzdyVar.zzt(), zzdyVar.zzt());
                                        i3++;
                                        i2 = i2;
                                        arrayList2 = arrayList2;
                                    }
                                    i = i2;
                                    arrayList = arrayList2;
                                } else {
                                    i = i2;
                                    arrayList = arrayList2;
                                    uuidArr = null;
                                }
                                int iZzp2 = zzdyVar.zzp();
                                int iZzb2 = zzdyVar.zzb();
                                if (iZzp2 != iZzb2) {
                                    com.google.android.gms.internal.ads.zzdo.zzf("PsshAtomUtil", "Atom data size (" + iZzp2 + ") does not match the bytes left: " + iZzb2);
                                    zzaixVar = null;
                                } else {
                                    byte[] bArr = new byte[iZzp2];
                                    zzdyVar.zzH(bArr, 0, iZzp2);
                                    zzaixVar = new com.google.android.gms.internal.ads.zzaix(uuid, iZza, bArr, uuidArr);
                                }
                            }
                        }
                    }
                    i = i2;
                    arrayList = arrayList2;
                    zzaixVar = null;
                }
                java.util.UUID uuid2 = zzaixVar == null ? null : zzaixVar.zza;
                if (uuid2 == null) {
                    com.google.android.gms.internal.ads.zzdo.zzf("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                    arrayList2 = arrayList;
                } else {
                    arrayList2 = arrayList;
                    arrayList2.add(new com.google.android.gms.internal.ads.zzt(uuid2, null, androidx.media3.common.MimeTypes.VIDEO_MP4, bArrZzN));
                }
                i2 = i + 1;
            } else {
                i = i2;
            }
            i2 = i + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzu(arrayList2);
    }

    private final void zzj() {
        this.zzr = 0;
        this.zzu = 0;
    }

    private static void zzk(com.google.android.gms.internal.ads.zzdy zzdyVar, int i, com.google.android.gms.internal.ads.zzajd zzajdVar) throws com.google.android.gms.internal.ads.zzbc {
        zzdyVar.zzL(i + 8);
        int iZzg = zzdyVar.zzg();
        int i2 = com.google.android.gms.internal.ads.zzaik.zza;
        int i3 = iZzg & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
        if ((i3 & 1) != 0) {
            throw com.google.android.gms.internal.ads.zzbc.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (i3 & 2) != 0;
        int iZzp = zzdyVar.zzp();
        if (iZzp == 0) {
            java.util.Arrays.fill(zzajdVar.zzl, 0, zzajdVar.zze, false);
            return;
        }
        int i4 = zzajdVar.zze;
        if (iZzp != i4) {
            throw com.google.android.gms.internal.ads.zzbc.zza("Senc sample count " + iZzp + " is different from fragment sample count" + i4, null);
        }
        java.util.Arrays.fill(zzajdVar.zzl, 0, iZzp, z);
        zzajdVar.zza(zzdyVar.zzb());
        com.google.android.gms.internal.ads.zzdy zzdyVar2 = zzajdVar.zzn;
        zzdyVar.zzH(zzdyVar2.zzN(), 0, zzdyVar2.zze());
        zzajdVar.zzn.zzL(0);
        zzajdVar.zzo = false;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x040a  */
    /* JADX WARN: Code duplicated, block: B:269:0x067c  */
    private final void zzl(long j) throws com.google.android.gms.internal.ads.zzbc {
        com.google.android.gms.internal.ads.zzaiq zzaiqVar;
        android.util.SparseArray sparseArray;
        com.google.android.gms.internal.ads.zzen zzenVar;
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        byte[] bArr2;
        byte[] bArr3;
        int i6;
        boolean z;
        byte[] bArr4;
        int i7;
        int i8;
        boolean z2;
        int iZzg;
        boolean z3;
        final com.google.android.gms.internal.ads.zzaiq zzaiqVar2 = this;
        while (!zzaiqVar2.zzn.isEmpty() && ((com.google.android.gms.internal.ads.zzen) zzaiqVar2.zzn.peek()).zza == j) {
            com.google.android.gms.internal.ads.zzen zzenVar2 = (com.google.android.gms.internal.ads.zzen) zzaiqVar2.zzn.pop();
            int i9 = zzenVar2.zzd;
            int i10 = 12;
            int i11 = 8;
            if (i9 == 1836019574) {
                com.google.android.gms.internal.ads.zzu zzuVarZzh = zzh(zzenVar2.zzb);
                com.google.android.gms.internal.ads.zzen zzenVarZza = zzenVar2.zza(androidx.media3.extractor.mp4.Atom.TYPE_mvex);
                zzenVarZza.getClass();
                android.util.SparseArray sparseArray2 = new android.util.SparseArray();
                int size = zzenVarZza.zzb.size();
                long jZzu = androidx.media3.common.C.TIME_UNSET;
                int i12 = 0;
                while (i12 < size) {
                    com.google.android.gms.internal.ads.zzeo zzeoVar = (com.google.android.gms.internal.ads.zzeo) zzenVarZza.zzb.get(i12);
                    int i13 = zzeoVar.zzd;
                    if (i13 == 1953654136) {
                        com.google.android.gms.internal.ads.zzdy zzdyVar = zzeoVar.zza;
                        zzdyVar.zzL(i10);
                        android.util.Pair pairCreate = android.util.Pair.create(java.lang.Integer.valueOf(zzdyVar.zzg()), new com.google.android.gms.internal.ads.zzail(zzdyVar.zzg() - 1, zzdyVar.zzg(), zzdyVar.zzg(), zzdyVar.zzg()));
                        sparseArray2.put(((java.lang.Integer) pairCreate.first).intValue(), (com.google.android.gms.internal.ads.zzail) pairCreate.second);
                    } else if (i13 == 1835362404) {
                        com.google.android.gms.internal.ads.zzdy zzdyVar2 = zzeoVar.zza;
                        zzdyVar2.zzL(8);
                        jZzu = com.google.android.gms.internal.ads.zzaik.zza(zzdyVar2.zzg()) == 0 ? zzdyVar2.zzu() : zzdyVar2.zzw();
                    }
                    i12++;
                    i10 = 12;
                }
                java.util.List listZzf = com.google.android.gms.internal.ads.zzaik.zzf(zzenVar2, new com.google.android.gms.internal.ads.zzadb(), jZzu, zzuVarZzh, (zzaiqVar2.zzd & 16) != 0, false, new com.google.android.gms.internal.ads.zzfuc(zzaiqVar2) { // from class: com.google.android.gms.internal.ads.zzaim
                    @Override // com.google.android.gms.internal.ads.zzfuc
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return (com.google.android.gms.internal.ads.zzajb) obj;
                    }
                });
                int size2 = listZzf.size();
                if (zzaiqVar2.zzf.size() == 0) {
                    for (int i14 = 0; i14 < size2; i14++) {
                        com.google.android.gms.internal.ads.zzaje zzajeVar = (com.google.android.gms.internal.ads.zzaje) listZzf.get(i14);
                        com.google.android.gms.internal.ads.zzajb zzajbVar = zzajeVar.zza;
                        com.google.android.gms.internal.ads.zzadt zzadtVarZzw = zzaiqVar2.zzH.zzw(i14, zzajbVar.zzb);
                        zzadtVarZzw.zzl(zzajbVar.zze);
                        zzaiqVar2.zzf.put(zzajbVar.zza, new com.google.android.gms.internal.ads.zzaip(zzadtVarZzw, zzajeVar, zzm(sparseArray2, zzajbVar.zza)));
                        zzaiqVar2.zzz = java.lang.Math.max(zzaiqVar2.zzz, zzajbVar.zze);
                    }
                    zzaiqVar2.zzH.zzD();
                } else {
                    com.google.android.gms.internal.ads.zzcw.zzf(zzaiqVar2.zzf.size() == size2);
                    for (int i15 = 0; i15 < size2; i15++) {
                        com.google.android.gms.internal.ads.zzaje zzajeVar2 = (com.google.android.gms.internal.ads.zzaje) listZzf.get(i15);
                        com.google.android.gms.internal.ads.zzajb zzajbVar2 = zzajeVar2.zza;
                        ((com.google.android.gms.internal.ads.zzaip) zzaiqVar2.zzf.get(zzajbVar2.zza)).zzh(zzajeVar2, zzm(sparseArray2, zzajbVar2.zza));
                    }
                }
            } else {
                if (i9 == 1836019558) {
                    android.util.SparseArray sparseArray3 = zzaiqVar2.zzf;
                    int i16 = zzaiqVar2.zzd;
                    byte[] bArr5 = zzaiqVar2.zzj;
                    int size3 = zzenVar2.zzc.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        com.google.android.gms.internal.ads.zzen zzenVar3 = (com.google.android.gms.internal.ads.zzen) zzenVar2.zzc.get(i17);
                        if (zzenVar3.zzd == 1953653094) {
                            com.google.android.gms.internal.ads.zzeo zzeoVarZzb = zzenVar3.zzb(androidx.media3.extractor.mp4.Atom.TYPE_tfhd);
                            zzeoVarZzb.getClass();
                            com.google.android.gms.internal.ads.zzdy zzdyVar3 = zzeoVarZzb.zza;
                            zzdyVar3.zzL(i11);
                            int iZzg2 = zzdyVar3.zzg() & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
                            int i18 = com.google.android.gms.internal.ads.zzaik.zza;
                            com.google.android.gms.internal.ads.zzaip zzaipVar = (com.google.android.gms.internal.ads.zzaip) sparseArray3.get(zzdyVar3.zzg());
                            if (zzaipVar == null) {
                                zzaipVar = null;
                            } else {
                                if ((iZzg2 & 1) != 0) {
                                    long jZzw = zzdyVar3.zzw();
                                    com.google.android.gms.internal.ads.zzajd zzajdVar = zzaipVar.zzb;
                                    zzajdVar.zzb = jZzw;
                                    zzajdVar.zzc = jZzw;
                                }
                                com.google.android.gms.internal.ads.zzail zzailVar = zzaipVar.zze;
                                zzaipVar.zzb.zza = new com.google.android.gms.internal.ads.zzail((iZzg2 & 2) != 0 ? zzdyVar3.zzg() - 1 : zzailVar.zza, (iZzg2 & 8) != 0 ? zzdyVar3.zzg() : zzailVar.zzb, (iZzg2 & 16) != 0 ? zzdyVar3.zzg() : zzailVar.zzc, (iZzg2 & 32) != 0 ? zzdyVar3.zzg() : zzailVar.zzd);
                            }
                            if (zzaipVar == null) {
                                sparseArray = sparseArray3;
                                zzenVar = zzenVar2;
                                i = i16;
                                i2 = size3;
                                i3 = i11;
                                i4 = i17;
                                bArr = bArr5;
                            } else {
                                com.google.android.gms.internal.ads.zzajd zzajdVar2 = zzaipVar.zzb;
                                long j2 = zzajdVar2.zzp;
                                boolean z4 = zzajdVar2.zzq;
                                zzaipVar.zzi();
                                zzaipVar.zzl = true;
                                com.google.android.gms.internal.ads.zzeo zzeoVarZzb2 = zzenVar3.zzb(androidx.media3.extractor.mp4.Atom.TYPE_tfdt);
                                if (zzeoVarZzb2 == null || (i16 & 2) != 0) {
                                    zzajdVar2.zzp = j2;
                                    zzajdVar2.zzq = z4;
                                } else {
                                    com.google.android.gms.internal.ads.zzdy zzdyVar4 = zzeoVarZzb2.zza;
                                    zzdyVar4.zzL(i11);
                                    zzajdVar2.zzp = com.google.android.gms.internal.ads.zzaik.zza(zzdyVar4.zzg()) == 1 ? zzdyVar4.zzw() : zzdyVar4.zzu();
                                    zzajdVar2.zzq = true;
                                }
                                java.util.List list = zzenVar3.zzb;
                                int size4 = list.size();
                                int i19 = 0;
                                int i20 = 0;
                                int i21 = 0;
                                while (true) {
                                    i5 = androidx.media3.extractor.mp4.Atom.TYPE_trun;
                                    if (i19 >= size4) {
                                        break;
                                    }
                                    android.util.SparseArray sparseArray4 = sparseArray3;
                                    com.google.android.gms.internal.ads.zzeo zzeoVar2 = (com.google.android.gms.internal.ads.zzeo) list.get(i19);
                                    int i22 = size3;
                                    if (zzeoVar2.zzd == 1953658222) {
                                        com.google.android.gms.internal.ads.zzdy zzdyVar5 = zzeoVar2.zza;
                                        zzdyVar5.zzL(12);
                                        int iZzp = zzdyVar5.zzp();
                                        if (iZzp > 0) {
                                            i21 += iZzp;
                                            i20++;
                                        }
                                    }
                                    i19++;
                                    size3 = i22;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                i2 = size3;
                                zzaipVar.zzh = 0;
                                zzaipVar.zzg = 0;
                                zzaipVar.zzf = 0;
                                com.google.android.gms.internal.ads.zzajd zzajdVar3 = zzaipVar.zzb;
                                zzajdVar3.zzd = i20;
                                zzajdVar3.zze = i21;
                                if (zzajdVar3.zzg.length < i20) {
                                    zzajdVar3.zzf = new long[i20];
                                    zzajdVar3.zzg = new int[i20];
                                }
                                if (zzajdVar3.zzh.length < i21) {
                                    int i23 = (i21 * 125) / 100;
                                    zzajdVar3.zzh = new int[i23];
                                    zzajdVar3.zzi = new long[i23];
                                    zzajdVar3.zzj = new boolean[i23];
                                    zzajdVar3.zzl = new boolean[i23];
                                }
                                int i24 = 0;
                                int i25 = 0;
                                int i26 = 0;
                                while (true) {
                                    long j3 = 0;
                                    if (i24 >= size4) {
                                        break;
                                    }
                                    com.google.android.gms.internal.ads.zzeo zzeoVar3 = (com.google.android.gms.internal.ads.zzeo) list.get(i24);
                                    if (zzeoVar3.zzd == i5) {
                                        int i27 = i25 + 1;
                                        com.google.android.gms.internal.ads.zzdy zzdyVar6 = zzeoVar3.zza;
                                        zzdyVar6.zzL(8);
                                        int iZzg3 = zzdyVar6.zzg() & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
                                        com.google.android.gms.internal.ads.zzajb zzajbVar3 = zzaipVar.zzd.zza;
                                        com.google.android.gms.internal.ads.zzajd zzajdVar4 = zzaipVar.zzb;
                                        com.google.android.gms.internal.ads.zzail zzailVar2 = zzajdVar4.zza;
                                        int i28 = com.google.android.gms.internal.ads.zzei.zza;
                                        zzajdVar4.zzg[i25] = zzdyVar6.zzp();
                                        long[] jArr = zzajdVar4.zzf;
                                        long j4 = zzajdVar4.zzb;
                                        jArr[i25] = j4;
                                        if ((iZzg3 & 1) != 0) {
                                            jArr[i25] = j4 + ((long) zzdyVar6.zzg());
                                        }
                                        boolean z5 = (iZzg3 & 4) != 0;
                                        int iZzg4 = zzailVar2.zzd;
                                        if (z5) {
                                            iZzg4 = zzdyVar6.zzg();
                                        }
                                        int i29 = iZzg3 & 256;
                                        int i30 = iZzg3 & 512;
                                        int i31 = iZzg3 & 1024;
                                        int i32 = iZzg3 & 2048;
                                        long[] jArr2 = zzajbVar3.zzi;
                                        if (jArr2 != null) {
                                            i7 = iZzg4;
                                            bArr4 = bArr5;
                                            if (jArr2.length != 1 || zzajbVar3.zzj == null) {
                                                z2 = z5;
                                                i8 = i31;
                                            } else {
                                                long j5 = jArr2[0];
                                                if (j5 == 0) {
                                                    z2 = z5;
                                                    i8 = i31;
                                                } else {
                                                    z2 = z5;
                                                    i8 = i31;
                                                    if (com.google.android.gms.internal.ads.zzei.zzu(j5, 1000000L, zzajbVar3.zzd, java.math.RoundingMode.DOWN) + com.google.android.gms.internal.ads.zzei.zzu(zzajbVar3.zzj[0], 1000000L, zzajbVar3.zzc, java.math.RoundingMode.DOWN) >= zzajbVar3.zze) {
                                                    }
                                                }
                                                j3 = zzajbVar3.zzj[0];
                                            }
                                        } else {
                                            i7 = iZzg4;
                                            bArr4 = bArr5;
                                            i8 = i31;
                                            z2 = z5;
                                        }
                                        int[] iArr = zzajdVar4.zzh;
                                        long[] jArr3 = zzajdVar4.zzi;
                                        boolean[] zArr = zzajdVar4.zzj;
                                        boolean z6 = zzajbVar3.zzb == 2 && (i16 & 1) != 0;
                                        i26 += zzajdVar4.zzg[i25];
                                        boolean z7 = z6;
                                        long j6 = zzajbVar3.zzc;
                                        long j7 = zzajdVar4.zzp;
                                        int i33 = i26;
                                        while (i33 < i26) {
                                            int iZzg5 = i29 != 0 ? zzdyVar6.zzg() : zzailVar2.zzb;
                                            zzg(iZzg5);
                                            int iZzg6 = i30 != 0 ? zzdyVar6.zzg() : zzailVar2.zzc;
                                            zzg(iZzg6);
                                            if (i8 != 0) {
                                                iZzg = zzdyVar6.zzg();
                                            } else if (i33 != 0) {
                                                iZzg = zzailVar2.zzd;
                                            } else if (z2) {
                                                iZzg = i7;
                                                i33 = 0;
                                            } else {
                                                i33 = 0;
                                                iZzg = zzailVar2.zzd;
                                            }
                                            long jZzu2 = com.google.android.gms.internal.ads.zzei.zzu((((long) (i32 != 0 ? zzdyVar6.zzg() : 0)) + j7) - j3, 1000000L, j6, java.math.RoundingMode.DOWN);
                                            jArr3[i33] = jZzu2;
                                            if (!zzajdVar4.zzq) {
                                                jArr3[i33] = jZzu2 + zzaipVar.zzd.zzh;
                                            }
                                            iArr[i33] = iZzg6;
                                            if (((iZzg >> 16) & 1) != 0) {
                                                z3 = false;
                                            } else if (!z7) {
                                                z3 = true;
                                            } else if (i33 == 0) {
                                                z3 = true;
                                                i33 = 0;
                                            } else {
                                                z3 = false;
                                            }
                                            zArr[i33] = z3;
                                            j7 += (long) iZzg5;
                                            i33++;
                                            i29 = i29;
                                            i30 = i30;
                                            z2 = z2;
                                            zzailVar2 = zzailVar2;
                                            j6 = j6;
                                            i26 = i26;
                                        }
                                        zzajdVar4.zzp = j7;
                                        i25 = i27;
                                    } else {
                                        bArr4 = bArr5;
                                        i17 = i17;
                                        zzenVar3 = zzenVar3;
                                    }
                                    i24++;
                                    list = list;
                                    size4 = size4;
                                    zzenVar2 = zzenVar2;
                                    i17 = i17;
                                    zzenVar3 = zzenVar3;
                                    bArr5 = bArr4;
                                    zzajdVar2 = zzajdVar2;
                                    i16 = i16;
                                    i5 = androidx.media3.extractor.mp4.Atom.TYPE_trun;
                                }
                                zzenVar = zzenVar2;
                                i = i16;
                                com.google.android.gms.internal.ads.zzajd zzajdVar5 = zzajdVar2;
                                byte[] bArr6 = bArr5;
                                i4 = i17;
                                com.google.android.gms.internal.ads.zzen zzenVar4 = zzenVar3;
                                com.google.android.gms.internal.ads.zzajb zzajbVar4 = zzaipVar.zzd.zza;
                                com.google.android.gms.internal.ads.zzail zzailVar3 = zzajdVar5.zza;
                                zzailVar3.getClass();
                                com.google.android.gms.internal.ads.zzajc zzajcVarZzb = zzajbVar4.zzb(zzailVar3.zza);
                                com.google.android.gms.internal.ads.zzeo zzeoVarZzb3 = zzenVar4.zzb(androidx.media3.extractor.mp4.Atom.TYPE_saiz);
                                if (zzeoVarZzb3 != null) {
                                    zzajcVarZzb.getClass();
                                    int i34 = zzajcVarZzb.zzd;
                                    com.google.android.gms.internal.ads.zzdy zzdyVar7 = zzeoVarZzb3.zza;
                                    zzdyVar7.zzL(8);
                                    if ((zzdyVar7.zzg() & 1) == 1) {
                                        zzdyVar7.zzM(8);
                                    }
                                    int iZzm = zzdyVar7.zzm();
                                    int iZzp2 = zzdyVar7.zzp();
                                    int i35 = zzajdVar5.zze;
                                    if (iZzp2 > i35) {
                                        throw com.google.android.gms.internal.ads.zzbc.zza("Saiz sample count " + iZzp2 + " is greater than fragment sample count" + i35, null);
                                    }
                                    if (iZzm == 0) {
                                        boolean[] zArr2 = zzajdVar5.zzl;
                                        i6 = 0;
                                        for (int i36 = 0; i36 < iZzp2; i36++) {
                                            int iZzm2 = zzdyVar7.zzm();
                                            i6 += iZzm2;
                                            zArr2[i36] = iZzm2 > i34;
                                        }
                                        z = false;
                                    } else {
                                        boolean z8 = iZzm > i34;
                                        i6 = iZzm * iZzp2;
                                        z = false;
                                        java.util.Arrays.fill(zzajdVar5.zzl, 0, iZzp2, z8);
                                    }
                                    java.util.Arrays.fill(zzajdVar5.zzl, iZzp2, zzajdVar5.zze, z);
                                    if (i6 > 0) {
                                        zzajdVar5.zza(i6);
                                    }
                                }
                                com.google.android.gms.internal.ads.zzeo zzeoVarZzb4 = zzenVar4.zzb(androidx.media3.extractor.mp4.Atom.TYPE_saio);
                                if (zzeoVarZzb4 != null) {
                                    com.google.android.gms.internal.ads.zzdy zzdyVar8 = zzeoVarZzb4.zza;
                                    zzdyVar8.zzL(8);
                                    int iZzg7 = zzdyVar8.zzg();
                                    if ((iZzg7 & 1) == 1) {
                                        zzdyVar8.zzM(8);
                                    }
                                    int iZzp3 = zzdyVar8.zzp();
                                    if (iZzp3 != 1) {
                                        throw com.google.android.gms.internal.ads.zzbc.zza("Unexpected saio entry count: " + iZzp3, null);
                                    }
                                    zzajdVar5.zzc += com.google.android.gms.internal.ads.zzaik.zza(iZzg7) == 0 ? zzdyVar8.zzu() : zzdyVar8.zzw();
                                }
                                com.google.android.gms.internal.ads.zzeo zzeoVarZzb5 = zzenVar4.zzb(androidx.media3.extractor.mp4.Atom.TYPE_senc);
                                if (zzeoVarZzb5 != null) {
                                    zzk(zzeoVarZzb5.zza, 0, zzajdVar5);
                                }
                                java.lang.String str = zzajcVarZzb != null ? zzajcVarZzb.zzb : null;
                                com.google.android.gms.internal.ads.zzdy zzdyVar9 = null;
                                com.google.android.gms.internal.ads.zzdy zzdyVar10 = null;
                                for (int i37 = 0; i37 < zzenVar4.zzb.size(); i37++) {
                                    com.google.android.gms.internal.ads.zzeo zzeoVar4 = (com.google.android.gms.internal.ads.zzeo) zzenVar4.zzb.get(i37);
                                    com.google.android.gms.internal.ads.zzdy zzdyVar11 = zzeoVar4.zza;
                                    int i38 = zzeoVar4.zzd;
                                    if (i38 == 1935828848) {
                                        zzdyVar11.zzL(12);
                                        if (zzdyVar11.zzg() == 1936025959) {
                                            zzdyVar9 = zzdyVar11;
                                        }
                                    } else if (i38 == 1936158820) {
                                        zzdyVar11.zzL(12);
                                        if (zzdyVar11.zzg() == 1936025959) {
                                            zzdyVar10 = zzdyVar11;
                                        }
                                    }
                                }
                                if (zzdyVar9 != null && zzdyVar10 != null) {
                                    zzdyVar9.zzL(8);
                                    int iZza = com.google.android.gms.internal.ads.zzaik.zza(zzdyVar9.zzg());
                                    zzdyVar9.zzM(4);
                                    if (iZza == 1) {
                                        zzdyVar9.zzM(4);
                                    }
                                    if (zzdyVar9.zzg() != 1) {
                                        throw com.google.android.gms.internal.ads.zzbc.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzdyVar10.zzL(8);
                                    int iZza2 = com.google.android.gms.internal.ads.zzaik.zza(zzdyVar10.zzg());
                                    zzdyVar10.zzM(4);
                                    if (iZza2 == 1) {
                                        if (zzdyVar10.zzu() == 0) {
                                            throw com.google.android.gms.internal.ads.zzbc.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (iZza2 >= 2) {
                                        zzdyVar10.zzM(4);
                                    }
                                    if (zzdyVar10.zzu() != 1) {
                                        throw com.google.android.gms.internal.ads.zzbc.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzdyVar10.zzM(1);
                                    int iZzm3 = zzdyVar10.zzm();
                                    int i39 = (iZzm3 & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                    int i40 = iZzm3 & 15;
                                    if (zzdyVar10.zzm() == 1) {
                                        int iZzm4 = zzdyVar10.zzm();
                                        byte[] bArr7 = new byte[16];
                                        zzdyVar10.zzH(bArr7, 0, 16);
                                        if (iZzm4 == 0) {
                                            int iZzm5 = zzdyVar10.zzm();
                                            byte[] bArr8 = new byte[iZzm5];
                                            zzdyVar10.zzH(bArr8, 0, iZzm5);
                                            bArr3 = bArr8;
                                        } else {
                                            bArr3 = null;
                                        }
                                        zzajdVar5.zzk = true;
                                        zzajdVar5.zzm = new com.google.android.gms.internal.ads.zzajc(true, str, iZzm4, bArr7, i39, i40, bArr3);
                                    }
                                }
                                int size5 = zzenVar4.zzb.size();
                                int i41 = 0;
                                while (i41 < size5) {
                                    com.google.android.gms.internal.ads.zzeo zzeoVar5 = (com.google.android.gms.internal.ads.zzeo) zzenVar4.zzb.get(i41);
                                    if (zzeoVar5.zzd == 1970628964) {
                                        com.google.android.gms.internal.ads.zzdy zzdyVar12 = zzeoVar5.zza;
                                        zzdyVar12.zzL(8);
                                        bArr2 = bArr6;
                                        zzdyVar12.zzH(bArr2, 0, 16);
                                        if (java.util.Arrays.equals(bArr2, zza)) {
                                            zzk(zzdyVar12, 16, zzajdVar5);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i41++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                i3 = 8;
                            }
                        } else {
                            sparseArray = sparseArray3;
                            zzenVar = zzenVar2;
                            i = i16;
                            i2 = size3;
                            i3 = i11;
                            i4 = i17;
                            bArr = bArr5;
                        }
                        i17 = i4 + 1;
                        i11 = i3;
                        bArr5 = bArr;
                        size3 = i2;
                        sparseArray3 = sparseArray;
                        zzenVar2 = zzenVar;
                        i16 = i;
                    }
                    com.google.android.gms.internal.ads.zzu zzuVarZzh2 = zzh(zzenVar2.zzb);
                    zzaiqVar = this;
                    if (zzuVarZzh2 != null) {
                        int size6 = zzaiqVar.zzf.size();
                        for (int i42 = 0; i42 < size6; i42++) {
                            com.google.android.gms.internal.ads.zzaip zzaipVar2 = (com.google.android.gms.internal.ads.zzaip) zzaiqVar.zzf.valueAt(i42);
                            com.google.android.gms.internal.ads.zzajb zzajbVar5 = zzaipVar2.zzd.zza;
                            com.google.android.gms.internal.ads.zzail zzailVar4 = zzaipVar2.zzb.zza;
                            int i43 = com.google.android.gms.internal.ads.zzei.zza;
                            com.google.android.gms.internal.ads.zzajc zzajcVarZzb2 = zzajbVar5.zzb(zzailVar4.zza);
                            com.google.android.gms.internal.ads.zzu zzuVarZzb = zzuVarZzh2.zzb(zzajcVarZzb2 != null ? zzajcVarZzb2.zzb : null);
                            com.google.android.gms.internal.ads.zzz zzzVarZzb = zzaipVar2.zzd.zza.zzg.zzb();
                            zzzVarZzb.zzF(zzuVarZzb);
                            zzaipVar2.zza.zzm(zzzVarZzb.zzag());
                        }
                    }
                    if (zzaiqVar.zzy != androidx.media3.common.C.TIME_UNSET) {
                        int size7 = zzaiqVar.zzf.size();
                        for (int i44 = 0; i44 < size7; i44++) {
                            com.google.android.gms.internal.ads.zzaip zzaipVar3 = (com.google.android.gms.internal.ads.zzaip) zzaiqVar.zzf.valueAt(i44);
                            long j8 = zzaiqVar.zzy;
                            int i45 = zzaipVar3.zzf;
                            while (true) {
                                com.google.android.gms.internal.ads.zzajd zzajdVar6 = zzaipVar3.zzb;
                                if (i45 >= zzajdVar6.zze || zzajdVar6.zzi[i45] > j8) {
                                    break;
                                }
                                if (zzajdVar6.zzj[i45]) {
                                    zzaipVar3.zzi = i45;
                                }
                                i45++;
                            }
                        }
                        zzaiqVar.zzy = androidx.media3.common.C.TIME_UNSET;
                    }
                } else {
                    zzaiqVar = zzaiqVar2;
                    if (!zzaiqVar.zzn.isEmpty()) {
                        ((com.google.android.gms.internal.ads.zzen) zzaiqVar.zzn.peek()).zzc(zzenVar2);
                    }
                }
                zzaiqVar2 = zzaiqVar;
            }
        }
        zzj();
    }

    private static final com.google.android.gms.internal.ads.zzail zzm(android.util.SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (com.google.android.gms.internal.ads.zzail) sparseArray.valueAt(0);
        }
        com.google.android.gms.internal.ads.zzail zzailVar = (com.google.android.gms.internal.ads.zzail) sparseArray.get(i);
        zzailVar.getClass();
        return zzailVar;
    }

    final /* synthetic */ void zza(long j, com.google.android.gms.internal.ads.zzdy zzdyVar) {
        com.google.android.gms.internal.ads.zzabz.zza(j, zzdyVar, this.zzJ);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x024d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0253  */
    /* JADX WARN: Code duplicated, block: B:111:0x0272  */
    /* JADX WARN: Code duplicated, block: B:112:0x0277  */
    /* JADX WARN: Code duplicated, block: B:116:0x028e  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:121:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:404:0x0268 A[EDGE_INSN: B:404:0x0268->B:109:0x0268 BREAK  A[LOOP:7: B:63:0x0136->B:65:0x013c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0136 A[LOOP:7: B:63:0x0136->B:65:0x013c, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:65:0x013c A[LOOP:7: B:63:0x0136->B:65:0x013c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0147  */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0165  */
    /* JADX WARN: Code duplicated, block: B:73:0x0175  */
    /* JADX WARN: Code duplicated, block: B:75:0x0190  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ec  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        int i;
        com.google.android.gms.internal.ads.zzaip zzaipVar;
        com.google.android.gms.internal.ads.zzajb zzajbVar;
        com.google.android.gms.internal.ads.zzadt zzadtVar;
        long jZze;
        int i2;
        byte[] bArrZzN;
        int i3;
        int i4;
        int i5;
        int iZzf;
        int i6;
        int iZzg;
        boolean z;
        java.lang.String str;
        com.google.android.gms.internal.ads.zzajc zzajcVarZzf;
        com.google.android.gms.internal.ads.zzads zzadsVar;
        int i7;
        com.google.android.gms.internal.ads.zzaio zzaioVar;
        long j;
        int i8;
        int i9;
        int i10;
        int iZzc;
        long jZzu;
        long jZzu2;
        java.lang.String str2;
        java.lang.String str3;
        long jZzu3;
        long j2;
        long jZzw;
        long jZzw2;
        while (true) {
            int i11 = this.zzr;
            i = 0;
            if (i11 == 0) {
                if (this.zzu == 0) {
                    if (!zzacoVar.zzn(this.zzm.zzN(), 0, 8, true)) {
                        this.zzp.zzc();
                        return -1;
                    }
                    this.zzu = 8;
                    this.zzm.zzL(0);
                    this.zzt = this.zzm.zzu();
                    this.zzs = this.zzm.zzg();
                }
                long j3 = this.zzt;
                if (j3 == 1) {
                    zzacoVar.zzi(this.zzm.zzN(), 8, 8);
                    this.zzu += 8;
                    this.zzt = this.zzm.zzw();
                } else if (j3 == 0) {
                    long jZzd = zzacoVar.zzd();
                    if (jZzd == -1) {
                        jZzd = !this.zzn.isEmpty() ? ((com.google.android.gms.internal.ads.zzen) this.zzn.peek()).zza : -1L;
                    }
                    if (jZzd != -1) {
                        this.zzt = (jZzd - zzacoVar.zzf()) + ((long) this.zzu);
                    }
                }
                long j4 = this.zzt;
                long j5 = this.zzu;
                if (j4 < j5) {
                    throw com.google.android.gms.internal.ads.zzbc.zzc("Atom size less than header length (unsupported).");
                }
                long jZzf = zzacoVar.zzf() - j5;
                int i12 = this.zzs;
                if ((i12 == 1836019558 || i12 == 1835295092) && !this.zzK) {
                    this.zzH.zzO(new com.google.android.gms.internal.ads.zzadl(this.zzz, jZzf));
                    this.zzK = true;
                }
                if (this.zzs == 1836019558) {
                    int size = this.zzf.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        com.google.android.gms.internal.ads.zzajd zzajdVar = ((com.google.android.gms.internal.ads.zzaip) this.zzf.valueAt(i13)).zzb;
                        zzajdVar.zzc = jZzf;
                        zzajdVar.zzb = jZzf;
                    }
                }
                int i14 = this.zzs;
                if (i14 == 1835295092) {
                    this.zzB = null;
                    this.zzw = jZzf + this.zzt;
                    this.zzr = 2;
                } else if (i14 == 1836019574 || i14 == 1953653099 || i14 == 1835297121 || i14 == 1835626086 || i14 == 1937007212 || i14 == 1836019558 || i14 == 1953653094 || i14 == 1836475768 || i14 == 1701082227) {
                    long jZzf2 = (zzacoVar.zzf() + this.zzt) - 8;
                    this.zzn.push(new com.google.android.gms.internal.ads.zzen(i14, jZzf2));
                    if (this.zzt == this.zzu) {
                        zzl(jZzf2);
                    } else {
                        zzj();
                    }
                } else if (i14 == 1751411826 || i14 == 1835296868 || i14 == 1836476516 || i14 == 1936286840 || i14 == 1937011556 || i14 == 1937011827 || i14 == 1668576371 || i14 == 1937011555 || i14 == 1937011578 || i14 == 1937013298 || i14 == 1937007471 || i14 == 1668232756 || i14 == 1937011571 || i14 == 1952867444 || i14 == 1952868452 || i14 == 1953196132 || i14 == 1953654136 || i14 == 1953658222 || i14 == 1886614376 || i14 == 1935763834 || i14 == 1935763823 || i14 == 1936027235 || i14 == 1970628964 || i14 == 1935828848 || i14 == 1936158820 || i14 == 1701606260 || i14 == 1835362404 || i14 == 1701671783) {
                    if (this.zzu != 8) {
                        throw com.google.android.gms.internal.ads.zzbc.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.zzt > 2147483647L) {
                        throw com.google.android.gms.internal.ads.zzbc.zzc("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy((int) this.zzt);
                    java.lang.System.arraycopy(this.zzm.zzN(), 0, zzdyVar.zzN(), 0, 8);
                    this.zzv = zzdyVar;
                    this.zzr = 1;
                } else {
                    if (this.zzt > 2147483647L) {
                        throw com.google.android.gms.internal.ads.zzbc.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.zzv = null;
                    this.zzr = 1;
                }
            } else if (i11 != 1) {
                long j6 = Long.MAX_VALUE;
                if (i11 != 2) {
                    zzaipVar = this.zzB;
                    if (zzaipVar != null) {
                        break;
                    }
                    android.util.SparseArray sparseArray = this.zzf;
                    int size2 = sparseArray.size();
                    long j7 = Long.MAX_VALUE;
                    com.google.android.gms.internal.ads.zzaip zzaipVar2 = null;
                    for (int i15 = 0; i15 < size2; i15++) {
                        com.google.android.gms.internal.ads.zzaip zzaipVar3 = (com.google.android.gms.internal.ads.zzaip) sparseArray.valueAt(i15);
                        if ((zzaipVar3.zzl || zzaipVar3.zzf != zzaipVar3.zzd.zzb) && (!zzaipVar3.zzl || zzaipVar3.zzh != zzaipVar3.zzb.zzd)) {
                            long jZzd2 = zzaipVar3.zzd();
                            if (jZzd2 < j7) {
                                zzaipVar2 = zzaipVar3;
                                j7 = jZzd2;
                            }
                        }
                    }
                    if (zzaipVar2 != null) {
                        int iZzd = (int) (zzaipVar2.zzd() - zzacoVar.zzf());
                        if (iZzd < 0) {
                            com.google.android.gms.internal.ads.zzdo.zzf("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iZzd = 0;
                        }
                        zzacoVar.zzk(iZzd);
                        this.zzB = zzaipVar2;
                        zzaipVar = zzaipVar2;
                        break;
                    }
                    int iZzf2 = (int) (this.zzw - zzacoVar.zzf());
                    if (iZzf2 < 0) {
                        throw com.google.android.gms.internal.ads.zzbc.zza("Offset to end of mdat was negative.", null);
                    }
                    zzacoVar.zzk(iZzf2);
                    zzj();
                } else {
                    int size3 = this.zzf.size();
                    com.google.android.gms.internal.ads.zzaip zzaipVar4 = null;
                    for (int i16 = 0; i16 < size3; i16++) {
                        com.google.android.gms.internal.ads.zzajd zzajdVar2 = ((com.google.android.gms.internal.ads.zzaip) this.zzf.valueAt(i16)).zzb;
                        if (zzajdVar2.zzo) {
                            long j8 = zzajdVar2.zzc;
                            if (j8 < j6) {
                                zzaipVar4 = (com.google.android.gms.internal.ads.zzaip) this.zzf.valueAt(i16);
                                j6 = j8;
                            }
                        }
                    }
                    if (zzaipVar4 == null) {
                        this.zzr = 3;
                    } else {
                        int iZzf3 = (int) (j6 - zzacoVar.zzf());
                        if (iZzf3 < 0) {
                            throw com.google.android.gms.internal.ads.zzbc.zza("Offset to encryption data was negative.", null);
                        }
                        zzacoVar.zzk(iZzf3);
                        com.google.android.gms.internal.ads.zzajd zzajdVar3 = zzaipVar4.zzb;
                        com.google.android.gms.internal.ads.zzdy zzdyVar2 = zzajdVar3.zzn;
                        zzacoVar.zzi(zzdyVar2.zzN(), 0, zzdyVar2.zze());
                        zzajdVar3.zzn.zzL(0);
                        zzajdVar3.zzo = false;
                    }
                }
            } else {
                int i17 = ((int) this.zzt) - this.zzu;
                com.google.android.gms.internal.ads.zzdy zzdyVar3 = this.zzv;
                if (zzdyVar3 != null) {
                    zzacoVar.zzi(zzdyVar3.zzN(), 8, i17);
                    com.google.android.gms.internal.ads.zzeo zzeoVar = new com.google.android.gms.internal.ads.zzeo(this.zzs, zzdyVar3);
                    long jZzf3 = zzacoVar.zzf();
                    if (this.zzn.isEmpty()) {
                        int i18 = zzeoVar.zzd;
                        if (i18 == 1936286840) {
                            com.google.android.gms.internal.ads.zzdy zzdyVar4 = zzeoVar.zza;
                            zzdyVar4.zzL(8);
                            int iZza = com.google.android.gms.internal.ads.zzaik.zza(zzdyVar4.zzg());
                            zzdyVar4.zzM(4);
                            long jZzu4 = zzdyVar4.zzu();
                            if (iZza == 0) {
                                jZzw = zzdyVar4.zzu();
                                jZzw2 = zzdyVar4.zzu();
                            } else {
                                jZzw = zzdyVar4.zzw();
                                jZzw2 = zzdyVar4.zzw();
                            }
                            long j9 = jZzf3 + jZzw2;
                            long jZzu5 = com.google.android.gms.internal.ads.zzei.zzu(jZzw, 1000000L, jZzu4, java.math.RoundingMode.DOWN);
                            zzdyVar4.zzM(2);
                            int iZzq = zzdyVar4.zzq();
                            int[] iArr = new int[iZzq];
                            long[] jArr = new long[iZzq];
                            long[] jArr2 = new long[iZzq];
                            long[] jArr3 = new long[iZzq];
                            long j10 = jZzu5;
                            int i19 = 0;
                            while (i19 < iZzq) {
                                int iZzg2 = zzdyVar4.zzg();
                                if ((iZzg2 & Integer.MIN_VALUE) != 0) {
                                    throw com.google.android.gms.internal.ads.zzbc.zza("Unhandled indirect reference", null);
                                }
                                long jZzu6 = zzdyVar4.zzu();
                                iArr[i19] = iZzg2 & Integer.MAX_VALUE;
                                jArr[i19] = j9;
                                jArr3[i19] = j10;
                                long j11 = jZzw + jZzu6;
                                long[] jArr4 = jArr3;
                                int i20 = i19;
                                long[] jArr5 = jArr2;
                                int[] iArr2 = iArr;
                                long jZzu7 = com.google.android.gms.internal.ads.zzei.zzu(j11, 1000000L, jZzu4, java.math.RoundingMode.DOWN);
                                jArr5[i20] = jZzu7 - jArr4[i20];
                                zzdyVar4.zzM(4);
                                j9 += (long) iArr2[i20];
                                jArr = jArr;
                                iArr = iArr2;
                                jArr2 = jArr5;
                                jZzw = j11;
                                jArr3 = jArr4;
                                i19 = i20 + 1;
                                iZzq = iZzq;
                                j10 = jZzu7;
                            }
                            android.util.Pair pairCreate = android.util.Pair.create(java.lang.Long.valueOf(jZzu5), new com.google.android.gms.internal.ads.zzaca(iArr, jArr, jArr2, jArr3));
                            this.zzA = ((java.lang.Long) pairCreate.first).longValue();
                            this.zzH.zzO((com.google.android.gms.internal.ads.zzadm) pairCreate.second);
                            this.zzK = true;
                        } else if (i18 == 1701671783) {
                            com.google.android.gms.internal.ads.zzdy zzdyVar5 = zzeoVar.zza;
                            if (this.zzI.length != 0) {
                                zzdyVar5.zzL(8);
                                int iZza2 = com.google.android.gms.internal.ads.zzaik.zza(zzdyVar5.zzg());
                                if (iZza2 == 0) {
                                    java.lang.String strZzy = zzdyVar5.zzy((char) 0);
                                    strZzy.getClass();
                                    java.lang.String strZzy2 = zzdyVar5.zzy((char) 0);
                                    strZzy2.getClass();
                                    long jZzu8 = zzdyVar5.zzu();
                                    jZzu = com.google.android.gms.internal.ads.zzei.zzu(zzdyVar5.zzu(), 1000000L, jZzu8, java.math.RoundingMode.DOWN);
                                    long j12 = this.zzA;
                                    long j13 = j12 != androidx.media3.common.C.TIME_UNSET ? j12 + jZzu : -9223372036854775807L;
                                    jZzu2 = com.google.android.gms.internal.ads.zzei.zzu(zzdyVar5.zzu(), 1000L, jZzu8, java.math.RoundingMode.DOWN);
                                    str2 = strZzy;
                                    str3 = strZzy2;
                                    jZzu3 = zzdyVar5.zzu();
                                    j2 = j13;
                                } else if (iZza2 != 1) {
                                    com.google.android.gms.internal.ads.zzdo.zzf("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iZza2);
                                } else {
                                    long jZzu9 = zzdyVar5.zzu();
                                    long jZzu10 = com.google.android.gms.internal.ads.zzei.zzu(zzdyVar5.zzw(), 1000000L, jZzu9, java.math.RoundingMode.DOWN);
                                    long jZzu11 = com.google.android.gms.internal.ads.zzei.zzu(zzdyVar5.zzu(), 1000L, jZzu9, java.math.RoundingMode.DOWN);
                                    long jZzu12 = zzdyVar5.zzu();
                                    java.lang.String strZzy3 = zzdyVar5.zzy((char) 0);
                                    strZzy3.getClass();
                                    java.lang.String strZzy4 = zzdyVar5.zzy((char) 0);
                                    strZzy4.getClass();
                                    jZzu2 = jZzu11;
                                    jZzu3 = jZzu12;
                                    str2 = strZzy3;
                                    str3 = strZzy4;
                                    j2 = jZzu10;
                                    jZzu = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzdyVar5.zzb()];
                                zzdyVar5.zzH(bArr, 0, zzdyVar5.zzb());
                                com.google.android.gms.internal.ads.zzdy zzdyVar6 = new com.google.android.gms.internal.ads.zzdy(this.zzl.zza(new com.google.android.gms.internal.ads.zzafk(str2, str3, jZzu2, jZzu3, bArr)));
                                int iZzb = zzdyVar6.zzb();
                                for (com.google.android.gms.internal.ads.zzadt zzadtVar2 : this.zzI) {
                                    zzdyVar6.zzL(0);
                                    zzadtVar2.zzr(zzdyVar6, iZzb);
                                }
                                if (j2 == androidx.media3.common.C.TIME_UNSET) {
                                    this.zzo.addLast(new com.google.android.gms.internal.ads.zzaio(jZzu, true, iZzb));
                                    this.zzx += iZzb;
                                } else if (this.zzo.isEmpty()) {
                                    for (com.google.android.gms.internal.ads.zzadt zzadtVar3 : this.zzI) {
                                        zzadtVar3.zzt(j2, 1, iZzb, 0, null);
                                    }
                                } else {
                                    this.zzo.addLast(new com.google.android.gms.internal.ads.zzaio(j2, false, iZzb));
                                    this.zzx += iZzb;
                                }
                            }
                        }
                    } else {
                        ((com.google.android.gms.internal.ads.zzen) this.zzn.peek()).zzd(zzeoVar);
                    }
                } else {
                    zzacoVar.zzk(i17);
                }
                zzl(zzacoVar.zzf());
            }
        }
        char c = 6;
        if (this.zzr == 3) {
            int iZzb2 = zzaipVar.zzb();
            this.zzC = iZzb2;
            this.zzF = true;
            if (zzaipVar.zzf < zzaipVar.zzi) {
                zzacoVar.zzk(iZzb2);
                com.google.android.gms.internal.ads.zzajc zzajcVarZzf2 = zzaipVar.zzf();
                if (zzajcVarZzf2 != null) {
                    com.google.android.gms.internal.ads.zzdy zzdyVar7 = zzaipVar.zzb.zzn;
                    int i21 = zzajcVarZzf2.zzd;
                    if (i21 != 0) {
                        zzdyVar7.zzM(i21);
                    }
                    if (zzaipVar.zzb.zzb(zzaipVar.zzf)) {
                        zzdyVar7.zzM(zzdyVar7.zzq() * 6);
                    }
                }
                if (!zzaipVar.zzk()) {
                    this.zzB = null;
                }
                i7 = 3;
            } else {
                if (zzaipVar.zzd.zza.zzh == 1) {
                    this.zzC = iZzb2 - 8;
                    zzacoVar.zzk(8);
                }
                if (androidx.media3.common.MimeTypes.AUDIO_AC4.equals(zzaipVar.zzd.zza.zzg.zzo)) {
                    this.zzD = zzaipVar.zzc(this.zzC, 7);
                    com.google.android.gms.internal.ads.zzabq.zzb(this.zzC, this.zzk);
                    zzaipVar.zza.zzr(this.zzk, 7);
                    iZzc = this.zzD + 7;
                    this.zzD = iZzc;
                } else {
                    iZzc = zzaipVar.zzc(this.zzC, 0);
                    this.zzD = iZzc;
                }
                this.zzC += iZzc;
                this.zzr = 4;
                this.zzE = 0;
                zzajbVar = zzaipVar.zzd.zza;
                zzadtVar = zzaipVar.zza;
                jZze = zzaipVar.zze();
                i2 = zzajbVar.zzk;
                if (i2 == 0) {
                    while (true) {
                        i9 = this.zzD;
                        i10 = this.zzC;
                        if (i9 < i10) {
                            break;
                        }
                        this.zzD += zzadtVar.zzf(zzacoVar, i10 - i9, false);
                    }
                } else {
                    bArrZzN = this.zzh.zzN();
                    bArrZzN[0] = 0;
                    bArrZzN[1] = 0;
                    bArrZzN[2] = 0;
                    i3 = i2 + 1;
                    i4 = 4 - i2;
                    while (this.zzD < this.zzC) {
                        i5 = this.zzE;
                        if (i5 == 0) {
                            zzacoVar.zzi(bArrZzN, i4, i3);
                            this.zzh.zzL(i);
                            iZzg = this.zzh.zzg();
                            if (iZzg > 0) {
                                throw com.google.android.gms.internal.ads.zzbc.zza("Invalid NAL length", null);
                            }
                            this.zzE = iZzg - 1;
                            this.zzg.zzL(i);
                            zzadtVar.zzr(this.zzg, 4);
                            zzadtVar.zzr(this.zzh, 1);
                            if (this.zzJ.length > 0) {
                                com.google.android.gms.internal.ads.zzab zzabVar = zzajbVar.zzg;
                                byte b = bArrZzN[4];
                                byte[] bArr2 = com.google.android.gms.internal.ads.zzfk.zza;
                                str = zzabVar.zzo;
                                if (("video/avc".equals(str) || (b & 31) != c) && !("video/hevc".equals(str) && ((b & 126) >> 1) == 39)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                            this.zzG = z;
                            this.zzD += 5;
                            this.zzC += i4;
                            if (this.zzF && java.util.Objects.equals(zzaipVar.zzd.zza.zzg.zzo, "video/avc") && com.google.android.gms.internal.ads.zzfk.zzi(bArrZzN[4])) {
                                this.zzF = true;
                            }
                        } else {
                            if (this.zzG) {
                                this.zzi.zzI(i5);
                                zzacoVar.zzi(this.zzi.zzN(), 0, this.zzE);
                                zzadtVar.zzr(this.zzi, this.zzE);
                                iZzf = this.zzE;
                                com.google.android.gms.internal.ads.zzdy zzdyVar8 = this.zzi;
                                int iZzb3 = com.google.android.gms.internal.ads.zzfk.zzb(zzdyVar8.zzN(), zzdyVar8.zze());
                                this.zzi.zzL("video/hevc".equals(zzajbVar.zzg.zzo) ? 1 : 0);
                                this.zzi.zzK(iZzb3);
                                i6 = zzajbVar.zzg.zzq;
                                if (i6 != -1 && i6 != this.zzp.zza()) {
                                    this.zzp.zzd(zzajbVar.zzg.zzq);
                                }
                                this.zzp.zzb(jZze, this.zzi);
                                if ((zzaipVar.zza() & 5) != 0) {
                                    this.zzp.zzc();
                                }
                            } else {
                                iZzf = zzadtVar.zzf(zzacoVar, i5, false);
                            }
                            this.zzD += iZzf;
                            this.zzE -= iZzf;
                            c = 6;
                        }
                        i = 0;
                    }
                }
                int iZza3 = zzaipVar.zza();
                zzajcVarZzf = zzaipVar.zzf();
                if (zzajcVarZzf != null) {
                    zzadsVar = zzajcVarZzf.zzc;
                } else {
                    zzadsVar = null;
                }
                zzadtVar.zzt(jZze, iZza3, this.zzC, 0, zzadsVar);
                while (!this.zzo.isEmpty()) {
                    zzaioVar = (com.google.android.gms.internal.ads.zzaio) this.zzo.removeFirst();
                    this.zzx -= zzaioVar.zzc;
                    j = zzaioVar.zza;
                    if (zzaioVar.zzb) {
                        j += jZze;
                    }
                    for (com.google.android.gms.internal.ads.zzadt zzadtVar4 : this.zzI) {
                        zzadtVar4.zzt(j, 1, zzaioVar.zzc, this.zzx, null);
                    }
                }
                if (!zzaipVar.zzk()) {
                    this.zzB = null;
                }
                i7 = 3;
            }
        } else {
            zzajbVar = zzaipVar.zzd.zza;
            zzadtVar = zzaipVar.zza;
            jZze = zzaipVar.zze();
            i2 = zzajbVar.zzk;
            if (i2 == 0) {
                while (true) {
                    i9 = this.zzD;
                    i10 = this.zzC;
                    if (i9 < i10) {
                        break;
                        break;
                    }
                    this.zzD += zzadtVar.zzf(zzacoVar, i10 - i9, false);
                }
            } else {
                bArrZzN = this.zzh.zzN();
                bArrZzN[0] = 0;
                bArrZzN[1] = 0;
                bArrZzN[2] = 0;
                i3 = i2 + 1;
                i4 = 4 - i2;
                while (this.zzD < this.zzC) {
                    i5 = this.zzE;
                    if (i5 == 0) {
                        zzacoVar.zzi(bArrZzN, i4, i3);
                        this.zzh.zzL(i);
                        iZzg = this.zzh.zzg();
                        if (iZzg > 0) {
                            throw com.google.android.gms.internal.ads.zzbc.zza("Invalid NAL length", null);
                        }
                        this.zzE = iZzg - 1;
                        this.zzg.zzL(i);
                        zzadtVar.zzr(this.zzg, 4);
                        zzadtVar.zzr(this.zzh, 1);
                        if (this.zzJ.length > 0) {
                            com.google.android.gms.internal.ads.zzab zzabVar2 = zzajbVar.zzg;
                            byte b2 = bArrZzN[4];
                            byte[] bArr3 = com.google.android.gms.internal.ads.zzfk.zza;
                            str = zzabVar2.zzo;
                            if ("video/avc".equals(str)) {
                                z = false;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        this.zzG = z;
                        this.zzD += 5;
                        this.zzC += i4;
                        if (this.zzF) {
                        }
                    } else {
                        if (this.zzG) {
                            this.zzi.zzI(i5);
                            zzacoVar.zzi(this.zzi.zzN(), 0, this.zzE);
                            zzadtVar.zzr(this.zzi, this.zzE);
                            iZzf = this.zzE;
                            com.google.android.gms.internal.ads.zzdy zzdyVar9 = this.zzi;
                            int iZzb4 = com.google.android.gms.internal.ads.zzfk.zzb(zzdyVar9.zzN(), zzdyVar9.zze());
                            this.zzi.zzL("video/hevc".equals(zzajbVar.zzg.zzo) ? 1 : 0);
                            this.zzi.zzK(iZzb4);
                            i6 = zzajbVar.zzg.zzq;
                            if (i6 != -1) {
                                this.zzp.zzd(zzajbVar.zzg.zzq);
                            }
                            this.zzp.zzb(jZze, this.zzi);
                            if ((zzaipVar.zza() & 5) != 0) {
                                this.zzp.zzc();
                            }
                        } else {
                            iZzf = zzadtVar.zzf(zzacoVar, i5, false);
                        }
                        this.zzD += iZzf;
                        this.zzE -= iZzf;
                        c = 6;
                    }
                    i = 0;
                }
            }
            int iZza4 = zzaipVar.zza();
            zzajcVarZzf = zzaipVar.zzf();
            if (zzajcVarZzf != null) {
                zzadsVar = zzajcVarZzf.zzc;
            } else {
                zzadsVar = null;
            }
            zzadtVar.zzt(jZze, iZza4, this.zzC, 0, zzadsVar);
            while (!this.zzo.isEmpty()) {
                zzaioVar = (com.google.android.gms.internal.ads.zzaio) this.zzo.removeFirst();
                this.zzx -= zzaioVar.zzc;
                j = zzaioVar.zza;
                if (zzaioVar.zzb) {
                    j += jZze;
                }
                while (i8 < r15) {
                    zzadtVar4.zzt(j, 1, zzaioVar.zzc, this.zzx, null);
                }
            }
            if (!zzaipVar.zzk()) {
                this.zzB = null;
            }
            i7 = 3;
        }
        this.zzr = i7;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ com.google.android.gms.internal.ads.zzacn zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ java.util.List zzd() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zze(com.google.android.gms.internal.ads.zzacq zzacqVar) {
        int i;
        if ((this.zzd & 32) == 0) {
            zzacqVar = new com.google.android.gms.internal.ads.zzakg(zzacqVar, this.zzc);
        }
        this.zzH = zzacqVar;
        zzj();
        com.google.android.gms.internal.ads.zzadt[] zzadtVarArr = new com.google.android.gms.internal.ads.zzadt[2];
        this.zzI = zzadtVarArr;
        int i2 = 100;
        int i3 = 0;
        if ((this.zzd & 4) != 0) {
            zzadtVarArr[0] = this.zzH.zzw(100, 5);
            i = 1;
            i2 = 101;
        } else {
            i = 0;
        }
        com.google.android.gms.internal.ads.zzadt[] zzadtVarArr2 = (com.google.android.gms.internal.ads.zzadt[]) com.google.android.gms.internal.ads.zzei.zzN(this.zzI, i);
        this.zzI = zzadtVarArr2;
        for (com.google.android.gms.internal.ads.zzadt zzadtVar : zzadtVarArr2) {
            zzadtVar.zzm(zzb);
        }
        this.zzJ = new com.google.android.gms.internal.ads.zzadt[this.zze.size()];
        while (i3 < this.zzJ.length) {
            com.google.android.gms.internal.ads.zzadt zzadtVarZzw = this.zzH.zzw(i2, 3);
            zzadtVarZzw.zzm((com.google.android.gms.internal.ads.zzab) this.zze.get(i3));
            this.zzJ[i3] = zzadtVarZzw;
            i3++;
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        int size = this.zzf.size();
        for (int i = 0; i < size; i++) {
            ((com.google.android.gms.internal.ads.zzaip) this.zzf.valueAt(i)).zzi();
        }
        this.zzo.clear();
        this.zzx = 0;
        this.zzp.zzc();
        this.zzy = j2;
        this.zzn.clear();
        zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzadq zzadqVarZza = com.google.android.gms.internal.ads.zzaja.zza(zzacoVar);
        this.zzq = zzadqVarZza != null ? com.google.android.gms.internal.ads.zzfxn.zzo(zzadqVarZza) : com.google.android.gms.internal.ads.zzfxn.zzn();
        return zzadqVarZza == null;
    }

    public zzaiq(com.google.android.gms.internal.ads.zzakd zzakdVar, int i, com.google.android.gms.internal.ads.zzef zzefVar, com.google.android.gms.internal.ads.zzajb zzajbVar, java.util.List list, com.google.android.gms.internal.ads.zzadt zzadtVar) {
        this.zzc = zzakdVar;
        this.zzd = i;
        this.zze = java.util.Collections.unmodifiableList(list);
        this.zzl = new com.google.android.gms.internal.ads.zzafl();
        this.zzm = new com.google.android.gms.internal.ads.zzdy(16);
        this.zzg = new com.google.android.gms.internal.ads.zzdy(com.google.android.gms.internal.ads.zzfk.zza);
        this.zzh = new com.google.android.gms.internal.ads.zzdy(5);
        this.zzi = new com.google.android.gms.internal.ads.zzdy();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new com.google.android.gms.internal.ads.zzdy(bArr);
        this.zzn = new java.util.ArrayDeque();
        this.zzo = new java.util.ArrayDeque();
        this.zzf = new android.util.SparseArray();
        this.zzq = com.google.android.gms.internal.ads.zzfxn.zzn();
        this.zzz = androidx.media3.common.C.TIME_UNSET;
        this.zzy = androidx.media3.common.C.TIME_UNSET;
        this.zzA = androidx.media3.common.C.TIME_UNSET;
        this.zzH = com.google.android.gms.internal.ads.zzacq.zza;
        this.zzI = new com.google.android.gms.internal.ads.zzadt[0];
        this.zzJ = new com.google.android.gms.internal.ads.zzadt[0];
        this.zzp = new com.google.android.gms.internal.ads.zzfo(new com.google.android.gms.internal.ads.zzfm() { // from class: com.google.android.gms.internal.ads.zzain
            @Override // com.google.android.gms.internal.ads.zzfm
            public final void zza(long j, com.google.android.gms.internal.ads.zzdy zzdyVar) {
                this.zza.zza(j, zzdyVar);
            }
        });
    }
}
