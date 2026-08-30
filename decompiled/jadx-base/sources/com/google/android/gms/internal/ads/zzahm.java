package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzahm implements com.google.android.gms.internal.ads.zzacn {
    private static final byte[] zza = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final java.util.UUID zze;
    private static final java.util.Map zzf;
    private long zzA;
    private com.google.android.gms.internal.ads.zzahk zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private com.google.android.gms.internal.ads.zzdp zzJ;
    private com.google.android.gms.internal.ads.zzdp zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private com.google.android.gms.internal.ads.zzacq zzai;
    private final com.google.android.gms.internal.ads.zzahh zzaj;
    private final com.google.android.gms.internal.ads.zzaho zzg;
    private final android.util.SparseArray zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final com.google.android.gms.internal.ads.zzakd zzk;
    private final com.google.android.gms.internal.ads.zzdy zzl;
    private final com.google.android.gms.internal.ads.zzdy zzm;
    private final com.google.android.gms.internal.ads.zzdy zzn;
    private final com.google.android.gms.internal.ads.zzdy zzo;
    private final com.google.android.gms.internal.ads.zzdy zzp;
    private final com.google.android.gms.internal.ads.zzdy zzq;
    private final com.google.android.gms.internal.ads.zzdy zzr;
    private final com.google.android.gms.internal.ads.zzdy zzs;
    private final com.google.android.gms.internal.ads.zzdy zzt;
    private final com.google.android.gms.internal.ads.zzdy zzu;
    private java.nio.ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        zzb = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        zzc = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zzd = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zze = new java.util.UUID(72057594037932032L, -9223371306706625679L);
        java.util.HashMap map = new java.util.HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", java.lang.Integer.valueOf(org.objectweb.asm.Opcodes.GETFIELD));
        map.put("htc_video_rotA-270", 270);
        zzf = java.util.Collections.unmodifiableMap(map);
    }

    @java.lang.Deprecated
    public zzahm() {
        this(new com.google.android.gms.internal.ads.zzahh(), 2, com.google.android.gms.internal.ads.zzakd.zza);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#2.output"})
    private final int zzp(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzahk zzahkVar, int i, boolean z) throws java.io.IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzahkVar.zzb)) {
            zzx(zzacoVar, zza, i);
            int i3 = this.zzaa;
            zzw();
            return i3;
        }
        if ("S_TEXT/ASS".equals(zzahkVar.zzb)) {
            zzx(zzacoVar, zzc, i);
            int i4 = this.zzaa;
            zzw();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(zzahkVar.zzb)) {
            zzx(zzacoVar, zzd, i);
            int i5 = this.zzaa;
            zzw();
            return i5;
        }
        com.google.android.gms.internal.ads.zzadt zzadtVar = zzahkVar.zzW;
        if (!this.zzac) {
            if (zzahkVar.zzg) {
                this.zzV &= -1073741825;
                if (!this.zzad) {
                    zzacoVar.zzi(this.zzn.zzN(), 0, 1);
                    this.zzZ++;
                    if ((this.zzn.zzN()[0] & 128) == 128) {
                        throw com.google.android.gms.internal.ads.zzbc.zza("Extension bit is set in signal byte", null);
                    }
                    this.zzag = this.zzn.zzN()[0];
                    this.zzad = true;
                }
                byte b = this.zzag;
                if ((b & 1) == 1) {
                    int i6 = b & 2;
                    this.zzV |= 1073741824;
                    if (!this.zzah) {
                        zzacoVar.zzi(this.zzs.zzN(), 0, 8);
                        this.zzZ += 8;
                        this.zzah = true;
                        this.zzn.zzN()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                        this.zzn.zzL(0);
                        zzadtVar.zzs(this.zzn, 1, 1);
                        this.zzaa++;
                        this.zzs.zzL(0);
                        zzadtVar.zzs(this.zzs, 8, 1);
                        this.zzaa += 8;
                    }
                    if (i6 == 2) {
                        if (!this.zzae) {
                            zzacoVar.zzi(this.zzn.zzN(), 0, 1);
                            this.zzZ++;
                            this.zzn.zzL(0);
                            this.zzaf = this.zzn.zzm();
                            this.zzae = true;
                        }
                        int i7 = this.zzaf * 4;
                        this.zzn.zzI(i7);
                        zzacoVar.zzi(this.zzn.zzN(), 0, i7);
                        this.zzZ += i7;
                        int i8 = (this.zzaf >> 1) + 1;
                        int i9 = (i8 * 6) + 2;
                        java.nio.ByteBuffer byteBuffer = this.zzv;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.zzv = java.nio.ByteBuffer.allocate(i9);
                        }
                        this.zzv.position(0);
                        this.zzv.putShort((short) i8);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i2 = this.zzaf;
                            if (i10 >= i2) {
                                break;
                            }
                            int iZzp = this.zzn.zzp();
                            int i12 = iZzp - i11;
                            if (i10 % 2 == 0) {
                                this.zzv.putShort((short) i12);
                            } else {
                                this.zzv.putInt(i12);
                            }
                            i10++;
                            i11 = iZzp;
                        }
                        int i13 = (i - this.zzZ) - i11;
                        if ((i2 & 1) == 1) {
                            this.zzv.putInt(i13);
                        } else {
                            this.zzv.putShort((short) i13);
                            this.zzv.putInt(0);
                        }
                        this.zzt.zzJ(this.zzv.array(), i9);
                        zzadtVar.zzs(this.zzt, i9, 1);
                        this.zzaa += i9;
                    }
                }
            } else {
                byte[] bArr = zzahkVar.zzh;
                if (bArr != null) {
                    this.zzq.zzJ(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzahkVar.zzb) ? zzahkVar.zzf > 0 : z) {
                this.zzV |= 268435456;
                this.zzu.zzI(0);
                int iZze = (this.zzq.zze() + i) - this.zzZ;
                this.zzn.zzI(4);
                this.zzn.zzN()[0] = (byte) ((iZze >> 24) & 255);
                this.zzn.zzN()[1] = (byte) ((iZze >> 16) & 255);
                this.zzn.zzN()[2] = (byte) ((iZze >> 8) & 255);
                this.zzn.zzN()[3] = (byte) (iZze & 255);
                zzadtVar.zzs(this.zzn, 4, 2);
                this.zzaa += 4;
            }
            this.zzac = true;
        }
        int iZze2 = i + this.zzq.zze();
        if (!"V_MPEG4/ISO/AVC".equals(zzahkVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzahkVar.zzb)) {
            if (zzahkVar.zzT != null) {
                com.google.android.gms.internal.ads.zzcw.zzf(this.zzq.zze() == 0);
                zzahkVar.zzT.zzd(zzacoVar);
            }
            while (true) {
                int i14 = this.zzZ;
                if (i14 >= iZze2) {
                    break;
                }
                int iZzq = zzq(zzacoVar, zzadtVar, iZze2 - i14);
                this.zzZ += iZzq;
                this.zzaa += iZzq;
            }
        } else {
            byte[] bArrZzN = this.zzm.zzN();
            bArrZzN[0] = 0;
            bArrZzN[1] = 0;
            bArrZzN[2] = 0;
            int i15 = zzahkVar.zzX;
            int i16 = 4 - i15;
            while (this.zzZ < iZze2) {
                int i17 = this.zzab;
                if (i17 == 0) {
                    int iMin = java.lang.Math.min(i15, this.zzq.zzb());
                    zzacoVar.zzi(bArrZzN, i16 + iMin, i15 - iMin);
                    if (iMin > 0) {
                        this.zzq.zzH(bArrZzN, i16, iMin);
                    }
                    this.zzZ += i15;
                    this.zzm.zzL(0);
                    this.zzab = this.zzm.zzp();
                    this.zzl.zzL(0);
                    zzadtVar.zzr(this.zzl, 4);
                    this.zzaa += 4;
                } else {
                    int iZzq2 = zzq(zzacoVar, zzadtVar, i17);
                    this.zzZ += iZzq2;
                    this.zzaa += iZzq2;
                    this.zzab -= iZzq2;
                }
            }
        }
        if ("A_VORBIS".equals(zzahkVar.zzb)) {
            this.zzo.zzL(0);
            zzadtVar.zzr(this.zzo, 4);
            this.zzaa += 4;
        }
        int i18 = this.zzaa;
        zzw();
        return i18;
    }

    private final int zzq(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadt zzadtVar, int i) throws java.io.IOException {
        int iZzb = this.zzq.zzb();
        if (iZzb <= 0) {
            return zzadtVar.zzf(zzacoVar, i, false);
        }
        int iMin = java.lang.Math.min(i, iZzb);
        zzadtVar.zzr(this.zzq, iMin);
        return iMin;
    }

    private final long zzr(long j) throws com.google.android.gms.internal.ads.zzbc {
        long j2 = this.zzy;
        if (j2 != androidx.media3.common.C.TIME_UNSET) {
            return com.google.android.gms.internal.ads.zzei.zzu(j, j2, 1000L, java.math.RoundingMode.DOWN);
        }
        throw com.google.android.gms.internal.ads.zzbc.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzs(int i) throws com.google.android.gms.internal.ads.zzbc {
        if (this.zzJ == null || this.zzK == null) {
            throw com.google.android.gms.internal.ads.zzbc.zza("Element " + i + " must be in a Cues", null);
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"currentTrack"})
    private final void zzt(int i) throws com.google.android.gms.internal.ads.zzbc {
        if (this.zzB != null) {
            return;
        }
        throw com.google.android.gms.internal.ads.zzbc.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    private final void zzu(com.google.android.gms.internal.ads.zzahk zzahkVar, long j, int i, int i2, int i3) {
        byte b;
        byte[] bArrZzy;
        int i4;
        int iZze;
        com.google.android.gms.internal.ads.zzadu zzaduVar = zzahkVar.zzT;
        if (zzaduVar != null) {
            zzaduVar.zzc(zzahkVar.zzW, j, i, i2, i3, zzahkVar.zzi);
        } else {
            if ("S_TEXT/UTF8".equals(zzahkVar.zzb) || "S_TEXT/ASS".equals(zzahkVar.zzb) || "S_TEXT/WEBVTT".equals(zzahkVar.zzb)) {
                if (this.zzR > 1) {
                    com.google.android.gms.internal.ads.zzdo.zzf("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.zzP;
                    if (j2 == androidx.media3.common.C.TIME_UNSET) {
                        com.google.android.gms.internal.ads.zzdo.zzf("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        java.lang.String str = zzahkVar.zzb;
                        byte[] bArrZzN = this.zzr.zzN();
                        int iHashCode = str.hashCode();
                        if (iHashCode != 738597099) {
                            if (iHashCode != 1045209816) {
                                if (iHashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                            } else if (str.equals("S_TEXT/WEBVTT")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (str.equals("S_TEXT/ASS")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        if (b == 0) {
                            bArrZzy = zzy(j2, "%02d:%02d:%02d,%03d", 1000L);
                            i4 = 19;
                        } else if (b == 1) {
                            bArrZzy = zzy(j2, "%01d:%02d:%02d:%02d", 10000L);
                            i4 = 21;
                        } else {
                            if (b != 2) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            bArrZzy = zzy(j2, "%02d:%02d:%02d.%03d", 1000L);
                            i4 = 25;
                        }
                        java.lang.System.arraycopy(bArrZzy, 0, bArrZzN, i4, bArrZzy.length);
                        for (int iZzd = this.zzr.zzd(); iZzd < this.zzr.zze(); iZzd++) {
                            if (this.zzr.zzN()[iZzd] == 0) {
                                this.zzr.zzK(iZzd);
                                break;
                            }
                        }
                        com.google.android.gms.internal.ads.zzadt zzadtVar = zzahkVar.zzW;
                        com.google.android.gms.internal.ads.zzdy zzdyVar = this.zzr;
                        zzadtVar.zzr(zzdyVar, zzdyVar.zze());
                        iZze = i2 + this.zzr.zze();
                    }
                }
                iZze = i2;
            } else {
                iZze = i2;
            }
            if ((i & 268435456) != 0) {
                if (this.zzR > 1) {
                    this.zzu.zzI(0);
                } else {
                    int iZze2 = this.zzu.zze();
                    zzahkVar.zzW.zzs(this.zzu, iZze2, 2);
                    iZze += iZze2;
                }
            }
            zzahkVar.zzW.zzt(j, i, iZze, i3, zzahkVar.zzi);
        }
        this.zzM = true;
    }

    private final void zzv(com.google.android.gms.internal.ads.zzaco zzacoVar, int i) throws java.io.IOException {
        if (this.zzn.zze() >= i) {
            return;
        }
        if (this.zzn.zzc() < i) {
            com.google.android.gms.internal.ads.zzdy zzdyVar = this.zzn;
            int iZzc = zzdyVar.zzc();
            zzdyVar.zzF(java.lang.Math.max(iZzc + iZzc, i));
        }
        com.google.android.gms.internal.ads.zzdy zzdyVar2 = this.zzn;
        zzacoVar.zzi(zzdyVar2.zzN(), zzdyVar2.zze(), i - zzdyVar2.zze());
        this.zzn.zzK(i);
    }

    private final void zzw() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzI(0);
    }

    private final void zzx(com.google.android.gms.internal.ads.zzaco zzacoVar, byte[] bArr, int i) throws java.io.IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.zzr.zzc() < i2) {
            com.google.android.gms.internal.ads.zzdy zzdyVar = this.zzr;
            byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, i2 + i);
            zzdyVar.zzJ(bArrCopyOf, bArrCopyOf.length);
        } else {
            java.lang.System.arraycopy(bArr, 0, this.zzr.zzN(), 0, length);
        }
        zzacoVar.zzi(this.zzr.zzN(), length, i);
        this.zzr.zzL(0);
        this.zzr.zzK(i2);
    }

    private static byte[] zzy(long j, java.lang.String str, long j2) {
        com.google.android.gms.internal.ads.zzcw.zzd(j != androidx.media3.common.C.TIME_UNSET);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        java.lang.String str2 = java.lang.String.format(java.util.Locale.US, str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        int i4 = com.google.android.gms.internal.ads.zzei.zza;
        return str2.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    private static int[] zzz(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[java.lang.Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (!this.zzaj.zzc(zzacoVar)) {
                for (int i = 0; i < this.zzh.size(); i++) {
                    com.google.android.gms.internal.ads.zzahk zzahkVar = (com.google.android.gms.internal.ads.zzahk) this.zzh.valueAt(i);
                    zzahkVar.zzW.getClass();
                    com.google.android.gms.internal.ads.zzadu zzaduVar = zzahkVar.zzT;
                    if (zzaduVar != null) {
                        zzaduVar.zza(zzahkVar.zzW, zzahkVar.zzi);
                    }
                }
                return -1;
            }
            long jZzf = zzacoVar.zzf();
            if (this.zzF) {
                this.zzH = jZzf;
                zzadjVar.zza = this.zzG;
                this.zzF = false;
                return 1;
            }
            if (this.zzC) {
                long j = this.zzH;
                if (j != -1) {
                    zzadjVar.zza = j;
                    this.zzH = -1L;
                    return 1;
                }
            }
        }
        return 0;
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
        if (this.zzj) {
            zzacqVar = new com.google.android.gms.internal.ads.zzakg(zzacqVar, this.zzk);
        }
        this.zzai = zzacqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzI = androidx.media3.common.C.TIME_UNSET;
        this.zzN = 0;
        this.zzaj.zzb();
        this.zzg.zze();
        zzw();
        for (int i = 0; i < this.zzh.size(); i++) {
            com.google.android.gms.internal.ads.zzadu zzaduVar = ((com.google.android.gms.internal.ads.zzahk) this.zzh.valueAt(i)).zzT;
            if (zzaduVar != null) {
                zzaduVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        return new com.google.android.gms.internal.ads.zzahn().zza(zzacoVar);
    }

    protected final void zzj(int i) throws com.google.android.gms.internal.ads.zzbc {
        int i2;
        int i3;
        com.google.android.gms.internal.ads.zzadm zzadlVar;
        int i4;
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzai);
        if (i == 160) {
            if (this.zzN == 2) {
                com.google.android.gms.internal.ads.zzahk zzahkVar = (com.google.android.gms.internal.ads.zzahk) this.zzh.get(this.zzT);
                zzahkVar.zzW.getClass();
                if (this.zzY > 0 && "A_OPUS".equals(zzahkVar.zzb)) {
                    com.google.android.gms.internal.ads.zzdy zzdyVar = this.zzu;
                    byte[] bArrArray = java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(this.zzY).array();
                    zzdyVar.zzJ(bArrArray, bArrArray.length);
                }
                int i5 = 0;
                for (int i6 = 0; i6 < this.zzR; i6++) {
                    i5 += this.zzS[i6];
                }
                int i7 = 0;
                while (i7 < this.zzR) {
                    long j = this.zzO + ((long) ((zzahkVar.zze * i7) / 1000));
                    int i8 = this.zzV;
                    if (i7 == 0) {
                        if (!this.zzX) {
                            i8 |= 1;
                        }
                        i3 = i8;
                        i2 = 0;
                    } else {
                        i2 = i7;
                        i3 = i8;
                    }
                    int i9 = this.zzS[i2];
                    int i10 = i5 - i9;
                    zzu(zzahkVar, j, i3, i9, i10);
                    i7 = i2 + 1;
                    i5 = i10;
                }
                this.zzN = 0;
                return;
            }
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i11 = this.zzD;
                if (i11 != -1) {
                    long j2 = this.zzE;
                    if (j2 != -1) {
                        if (i11 == 475249515) {
                            this.zzG = j2;
                            return;
                        }
                        return;
                    }
                }
                throw com.google.android.gms.internal.ads.zzbc.zza("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i == 25152) {
                zzt(i);
                com.google.android.gms.internal.ads.zzahk zzahkVar2 = this.zzB;
                if (zzahkVar2.zzg) {
                    if (zzahkVar2.zzi == null) {
                        throw com.google.android.gms.internal.ads.zzbc.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzahkVar2.zzk = new com.google.android.gms.internal.ads.zzu(null, new com.google.android.gms.internal.ads.zzt(com.google.android.gms.internal.ads.zzh.zza, null, "video/webm", this.zzB.zzi.zzb));
                    return;
                }
                return;
            }
            if (i == 28032) {
                zzt(i);
                com.google.android.gms.internal.ads.zzahk zzahkVar3 = this.zzB;
                if (zzahkVar3.zzg && zzahkVar3.zzh != null) {
                    throw com.google.android.gms.internal.ads.zzbc.zza("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.zzy == androidx.media3.common.C.TIME_UNSET) {
                    this.zzy = 1000000L;
                }
                long j3 = this.zzz;
                if (j3 != androidx.media3.common.C.TIME_UNSET) {
                    this.zzA = zzr(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.zzh.size() == 0) {
                    throw com.google.android.gms.internal.ads.zzbc.zza("No valid tracks were found", null);
                }
                this.zzai.zzD();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.zzC) {
                com.google.android.gms.internal.ads.zzacq zzacqVar = this.zzai;
                com.google.android.gms.internal.ads.zzdp zzdpVar = this.zzJ;
                com.google.android.gms.internal.ads.zzdp zzdpVar2 = this.zzK;
                if (this.zzx == -1 || this.zzA == androidx.media3.common.C.TIME_UNSET || zzdpVar == null || zzdpVar.zza() == 0 || zzdpVar2 == null || zzdpVar2.zza() != zzdpVar.zza()) {
                    zzadlVar = new com.google.android.gms.internal.ads.zzadl(this.zzA, 0L);
                } else {
                    int iZza = zzdpVar.zza();
                    int[] iArrCopyOf = new int[iZza];
                    long[] jArrCopyOf = new long[iZza];
                    long[] jArrCopyOf2 = new long[iZza];
                    long[] jArrCopyOf3 = new long[iZza];
                    for (int i12 = 0; i12 < iZza; i12++) {
                        jArrCopyOf3[i12] = zzdpVar.zzb(i12);
                        jArrCopyOf[i12] = this.zzx + zzdpVar2.zzb(i12);
                    }
                    int i13 = 0;
                    while (true) {
                        i4 = iZza - 1;
                        if (i13 >= i4) {
                            break;
                        }
                        int i14 = i13 + 1;
                        iArrCopyOf[i13] = (int) (jArrCopyOf[i14] - jArrCopyOf[i13]);
                        jArrCopyOf2[i13] = jArrCopyOf3[i14] - jArrCopyOf3[i13];
                        i13 = i14;
                    }
                    iArrCopyOf[i4] = (int) ((this.zzx + this.zzw) - jArrCopyOf[i4]);
                    long j4 = this.zzA - jArrCopyOf3[i4];
                    jArrCopyOf2[i4] = j4;
                    if (j4 <= 0) {
                        com.google.android.gms.internal.ads.zzdo.zzf("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j4);
                        iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, i4);
                        jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i4);
                        jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i4);
                        jArrCopyOf3 = java.util.Arrays.copyOf(jArrCopyOf3, i4);
                    }
                    zzadlVar = new com.google.android.gms.internal.ads.zzaca(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                zzacqVar.zzO(zzadlVar);
                this.zzC = true;
            }
            this.zzJ = null;
            this.zzK = null;
            return;
        }
        com.google.android.gms.internal.ads.zzahk zzahkVar4 = this.zzB;
        com.google.android.gms.internal.ads.zzcw.zzb(zzahkVar4);
        java.lang.String str = zzahkVar4.zzb;
        if (str == null) {
            throw com.google.android.gms.internal.ads.zzbc.zza("CodecId is missing in TrackEntry element", null);
        }
        switch (str) {
            case "V_VP8":
            case "V_VP9":
            case "V_AV1":
            case "V_MPEG2":
            case "V_MPEG4/ISO/SP":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/AVC":
            case "V_MPEGH/ISO/HEVC":
            case "V_MS/VFW/FOURCC":
            case "V_THEORA":
            case "A_OPUS":
            case "A_VORBIS":
            case "A_AAC":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "A_AC3":
            case "A_EAC3":
            case "A_TRUEHD":
            case "A_DTS":
            case "A_DTS/EXPRESS":
            case "A_DTS/LOSSLESS":
            case "A_FLAC":
            case "A_MS/ACM":
            case "A_PCM/INT/LIT":
            case "A_PCM/INT/BIG":
            case "A_PCM/FLOAT/IEEE":
            case "S_TEXT/UTF8":
            case "S_TEXT/ASS":
            case "S_TEXT/WEBVTT":
            case "S_VOBSUB":
            case "S_HDMV/PGS":
            case "S_DVBSUB":
                zzahkVar4.zze(this.zzai, zzahkVar4.zzc);
                this.zzh.put(zzahkVar4.zzc, zzahkVar4);
                break;
        }
        this.zzB = null;
    }

    protected final void zzm(int i, long j, long j2) throws com.google.android.gms.internal.ads.zzbc {
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzai);
        if (i == 160) {
            this.zzX = false;
            this.zzY = 0L;
            return;
        }
        if (i == 174) {
            this.zzB = new com.google.android.gms.internal.ads.zzahk();
            return;
        }
        if (i == 187) {
            this.zzL = false;
            return;
        }
        if (i == 19899) {
            this.zzD = -1;
            this.zzE = -1L;
            return;
        }
        if (i == 20533) {
            zzt(i);
            this.zzB.zzg = true;
            return;
        }
        if (i == 21968) {
            zzt(i);
            this.zzB.zzx = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzx;
            if (j3 != -1 && j3 != j) {
                throw com.google.android.gms.internal.ads.zzbc.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j;
            this.zzw = j2;
            return;
        }
        if (i == 475249515) {
            this.zzJ = new com.google.android.gms.internal.ads.zzdp(32);
            this.zzK = new com.google.android.gms.internal.ads.zzdp(32);
        } else if (i == 524531317 && !this.zzC) {
            if (this.zzi && this.zzG != -1) {
                this.zzF = true;
            } else {
                this.zzai.zzO(new com.google.android.gms.internal.ads.zzadl(this.zzA, 0L));
                this.zzC = true;
            }
        }
    }

    zzahm(com.google.android.gms.internal.ads.zzahh zzahhVar, int i, com.google.android.gms.internal.ads.zzakd zzakdVar) {
        this.zzx = -1L;
        this.zzy = androidx.media3.common.C.TIME_UNSET;
        this.zzz = androidx.media3.common.C.TIME_UNSET;
        this.zzA = androidx.media3.common.C.TIME_UNSET;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = androidx.media3.common.C.TIME_UNSET;
        this.zzaj = zzahhVar;
        zzahhVar.zza(new com.google.android.gms.internal.ads.zzahj(this, null));
        this.zzk = zzakdVar;
        this.zzi = 1 == ((i & 1) ^ 1);
        this.zzj = (i & 2) == 0;
        this.zzg = new com.google.android.gms.internal.ads.zzaho();
        this.zzh = new android.util.SparseArray();
        this.zzn = new com.google.android.gms.internal.ads.zzdy(4);
        this.zzo = new com.google.android.gms.internal.ads.zzdy(java.nio.ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new com.google.android.gms.internal.ads.zzdy(4);
        this.zzl = new com.google.android.gms.internal.ads.zzdy(com.google.android.gms.internal.ads.zzfk.zza);
        this.zzm = new com.google.android.gms.internal.ads.zzdy(4);
        this.zzq = new com.google.android.gms.internal.ads.zzdy();
        this.zzr = new com.google.android.gms.internal.ads.zzdy();
        this.zzs = new com.google.android.gms.internal.ads.zzdy(8);
        this.zzt = new com.google.android.gms.internal.ads.zzdy();
        this.zzu = new com.google.android.gms.internal.ads.zzdy();
        this.zzS = new int[1];
    }

    protected final void zzn(int i, java.lang.String str) throws com.google.android.gms.internal.ads.zzbc {
        if (i == 134) {
            zzt(i);
            this.zzB.zzb = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw com.google.android.gms.internal.ads.zzbc.zza("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            zzt(i);
            this.zzB.zza = str;
        } else {
            if (i != 2274716) {
                return;
            }
            zzt(i);
            this.zzB.zzZ = str;
        }
    }

    protected final void zzh(int i, int i2, com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = 1;
        int i10 = 0;
        if (i8 != 161 && i8 != 163) {
            if (i8 == 165) {
                if (this.zzN != 2) {
                    return;
                }
                com.google.android.gms.internal.ads.zzahk zzahkVar = (com.google.android.gms.internal.ads.zzahk) this.zzh.get(this.zzT);
                if (this.zzW != 4 || !"V_VP9".equals(zzahkVar.zzb)) {
                    zzacoVar.zzk(i2);
                    return;
                } else {
                    this.zzu.zzI(i2);
                    zzacoVar.zzi(this.zzu.zzN(), 0, i2);
                    return;
                }
            }
            if (i8 == 16877) {
                zzt(i);
                com.google.android.gms.internal.ads.zzahk zzahkVar2 = this.zzB;
                if (zzahkVar2.zzY != 1685485123 && zzahkVar2.zzY != 1685480259) {
                    zzacoVar.zzk(i2);
                    return;
                } else {
                    zzahkVar2.zzN = new byte[i2];
                    zzacoVar.zzi(zzahkVar2.zzN, 0, i2);
                    return;
                }
            }
            if (i8 == 16981) {
                zzt(i);
                com.google.android.gms.internal.ads.zzahk zzahkVar3 = this.zzB;
                zzahkVar3.zzh = new byte[i2];
                zzacoVar.zzi(zzahkVar3.zzh, 0, i2);
                return;
            }
            if (i8 == 18402) {
                byte[] bArr = new byte[i2];
                zzacoVar.zzi(bArr, 0, i2);
                zzt(i);
                this.zzB.zzi = new com.google.android.gms.internal.ads.zzads(1, bArr, 0, 0);
                return;
            }
            if (i8 == 21419) {
                java.util.Arrays.fill(this.zzp.zzN(), (byte) 0);
                zzacoVar.zzi(this.zzp.zzN(), 4 - i2, i2);
                this.zzp.zzL(0);
                this.zzD = (int) this.zzp.zzu();
                return;
            }
            if (i8 == 25506) {
                zzt(i);
                com.google.android.gms.internal.ads.zzahk zzahkVar4 = this.zzB;
                zzahkVar4.zzj = new byte[i2];
                zzacoVar.zzi(zzahkVar4.zzj, 0, i2);
                return;
            }
            if (i8 != 30322) {
                throw com.google.android.gms.internal.ads.zzbc.zza("Unexpected id: " + i8, null);
            }
            zzt(i);
            com.google.android.gms.internal.ads.zzahk zzahkVar5 = this.zzB;
            zzahkVar5.zzv = new byte[i2];
            zzacoVar.zzi(zzahkVar5.zzv, 0, i2);
            return;
        }
        int i11 = 8;
        if (this.zzN == 0) {
            this.zzT = (int) this.zzg.zzd(zzacoVar, false, true, 8);
            this.zzU = this.zzg.zza();
            this.zzP = androidx.media3.common.C.TIME_UNSET;
            this.zzN = 1;
            this.zzn.zzI(0);
        }
        com.google.android.gms.internal.ads.zzahk zzahkVar6 = (com.google.android.gms.internal.ads.zzahk) this.zzh.get(this.zzT);
        if (zzahkVar6 == null) {
            zzacoVar.zzk(i2 - this.zzU);
            this.zzN = 0;
            return;
        }
        zzahkVar6.zzW.getClass();
        if (this.zzN == 1) {
            zzv(zzacoVar, 3);
            int i12 = (this.zzn.zzN()[2] & 6) >> 1;
            if (i12 == 0) {
                this.zzR = 1;
                int[] iArrZzz = zzz(this.zzS, 1);
                this.zzS = iArrZzz;
                iArrZzz[0] = (i2 - this.zzU) - 3;
            } else {
                zzv(zzacoVar, 4);
                int i13 = (this.zzn.zzN()[3] & 255) + 1;
                this.zzR = i13;
                int[] iArrZzz2 = zzz(this.zzS, i13);
                this.zzS = iArrZzz2;
                if (i12 == 2) {
                    int i14 = (i2 - this.zzU) - 4;
                    int i15 = this.zzR;
                    java.util.Arrays.fill(iArrZzz2, 0, i15, i14 / i15);
                } else if (i12 == 1) {
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 4;
                    while (true) {
                        i4 = this.zzR - 1;
                        if (i16 >= i4) {
                            break;
                        }
                        this.zzS[i16] = 0;
                        do {
                            i18++;
                            zzv(zzacoVar, i18);
                            i5 = this.zzn.zzN()[i18 - 1] & 255;
                            int[] iArr = this.zzS;
                            i6 = iArr[i16] + i5;
                            iArr[i16] = i6;
                        } while (i5 == 255);
                        i17 += i6;
                        i16++;
                    }
                    this.zzS[i4] = ((i2 - this.zzU) - i18) - i17;
                } else {
                    if (i12 != 3) {
                        throw com.google.android.gms.internal.ads.zzbc.zza("Unexpected lacing value: 2", null);
                    }
                    int i19 = 0;
                    int i20 = 0;
                    int i21 = 4;
                    while (true) {
                        int i22 = this.zzR - 1;
                        if (i19 >= i22) {
                            this.zzS[i22] = ((i2 - this.zzU) - i21) - i20;
                            break;
                        }
                        this.zzS[i19] = i10;
                        i21++;
                        zzv(zzacoVar, i21);
                        int i23 = i21 - 1;
                        if (this.zzn.zzN()[i23] == 0) {
                            throw com.google.android.gms.internal.ads.zzbc.zza("No valid varint length mask found", null);
                        }
                        int i24 = i10;
                        while (true) {
                            if (i24 >= i11) {
                                j = 0;
                                break;
                            }
                            int i25 = i9 << (7 - i24);
                            if ((this.zzn.zzN()[i23] & i25) != 0) {
                                i21 += i24;
                                zzv(zzacoVar, i21);
                                j = (~i25) & this.zzn.zzN()[i23] & 255;
                                int i26 = i23 + 1;
                                while (i26 < i21) {
                                    j = (j << i11) | ((long) (this.zzn.zzN()[i26] & 255));
                                    i26++;
                                    i11 = 8;
                                }
                                if (i19 <= 0) {
                                    break;
                                }
                                j -= (1 << ((i24 * 7) + 6)) - 1;
                                break;
                            }
                            i24++;
                            i9 = 1;
                            i11 = 8;
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            throw com.google.android.gms.internal.ads.zzbc.zza("EBML lacing sample size out of range.", null);
                        }
                        int[] iArr2 = this.zzS;
                        int i27 = (int) j;
                        if (i19 != 0) {
                            i27 += iArr2[i19 - 1];
                        }
                        iArr2[i19] = i27;
                        i20 += i27;
                        i19++;
                        i9 = 1;
                        i10 = 0;
                        i11 = 8;
                    }
                }
            }
            this.zzO = this.zzI + zzr((this.zzn.zzN()[0] << 8) | (this.zzn.zzN()[1] & 255));
            if (zzahkVar6.zzd == 2) {
                i7 = 1;
            } else {
                if (i8 == 163) {
                    if ((this.zzn.zzN()[2] & 128) == 128) {
                        i8 = org.objectweb.asm.Opcodes.IF_ICMPGT;
                        i7 = 1;
                    } else {
                        i8 = org.objectweb.asm.Opcodes.IF_ICMPGT;
                    }
                }
                i7 = 0;
            }
            this.zzV = i7;
            this.zzN = 2;
            this.zzQ = 0;
            i3 = org.objectweb.asm.Opcodes.IF_ICMPGT;
        } else {
            i3 = 163;
        }
        if (i8 == i3) {
            while (true) {
                int i28 = this.zzQ;
                if (i28 >= this.zzR) {
                    this.zzN = 0;
                    return;
                }
                zzu(zzahkVar6, ((long) ((this.zzQ * zzahkVar6.zze) / 1000)) + this.zzO, this.zzV, zzp(zzacoVar, zzahkVar6, this.zzS[i28], false), 0);
                this.zzQ++;
            }
        } else {
            while (true) {
                int i29 = this.zzQ;
                if (i29 >= this.zzR) {
                    return;
                }
                int[] iArr3 = this.zzS;
                iArr3[i29] = zzp(zzacoVar, zzahkVar6, iArr3[i29], true);
                this.zzQ++;
            }
        }
    }

    public zzahm(com.google.android.gms.internal.ads.zzakd zzakdVar, int i) {
        this(new com.google.android.gms.internal.ads.zzahh(), 0, zzakdVar);
    }

    protected final void zzl(int i, long j) throws com.google.android.gms.internal.ads.zzbc {
        boolean z;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw com.google.android.gms.internal.ads.zzbc.zza("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw com.google.android.gms.internal.ads.zzbc.zza("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                zzt(i);
                this.zzB.zzd = (int) j;
                return;
            case 136:
                z = j == 1;
                zzt(i);
                this.zzB.zzV = z;
                return;
            case 155:
                this.zzP = zzr(j);
                return;
            case org.objectweb.asm.Opcodes.IF_ICMPEQ /* 159 */:
                zzt(i);
                this.zzB.zzO = (int) j;
                return;
            case org.objectweb.asm.Opcodes.ARETURN /* 176 */:
                zzt(i);
                this.zzB.zzl = (int) j;
                return;
            case org.objectweb.asm.Opcodes.PUTSTATIC /* 179 */:
                zzs(i);
                this.zzJ.zzc(zzr(j));
                return;
            case org.objectweb.asm.Opcodes.INVOKEDYNAMIC /* 186 */:
                zzt(i);
                this.zzB.zzm = (int) j;
                return;
            case 215:
                zzt(i);
                this.zzB.zzc = (int) j;
                return;
            case 231:
                this.zzI = zzr(j);
                return;
            case 238:
                this.zzW = (int) j;
                return;
            case 241:
                if (this.zzL) {
                    return;
                }
                zzs(i);
                this.zzK.zzc(j);
                this.zzL = true;
                return;
            case 251:
                this.zzX = true;
                return;
            case 16871:
                zzt(i);
                this.zzB.zzY = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw com.google.android.gms.internal.ads.zzbc.zza("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw com.google.android.gms.internal.ads.zzbc.zza("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw com.google.android.gms.internal.ads.zzbc.zza("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw com.google.android.gms.internal.ads.zzbc.zza("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw com.google.android.gms.internal.ads.zzbc.zza("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.zzE = j + this.zzx;
                return;
            case 21432:
                int i2 = (int) j;
                zzt(i);
                if (i2 == 0) {
                    this.zzB.zzw = 0;
                    return;
                }
                if (i2 == 1) {
                    this.zzB.zzw = 2;
                    return;
                } else if (i2 == 3) {
                    this.zzB.zzw = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.zzB.zzw = 3;
                    return;
                }
            case 21680:
                zzt(i);
                this.zzB.zzo = (int) j;
                return;
            case 21682:
                zzt(i);
                this.zzB.zzq = (int) j;
                return;
            case 21690:
                zzt(i);
                this.zzB.zzp = (int) j;
                return;
            case 21930:
                z = j == 1;
                zzt(i);
                this.zzB.zzU = z;
                return;
            case 21938:
                zzt(i);
                com.google.android.gms.internal.ads.zzahk zzahkVar = this.zzB;
                zzahkVar.zzx = true;
                zzahkVar.zzn = (int) j;
                return;
            case 21998:
                zzt(i);
                this.zzB.zzf = (int) j;
                return;
            case 22186:
                zzt(i);
                this.zzB.zzR = j;
                return;
            case 22203:
                zzt(i);
                this.zzB.zzS = j;
                return;
            case 25188:
                zzt(i);
                this.zzB.zzP = (int) j;
                return;
            case 30114:
                this.zzY = j;
                return;
            case 30321:
                int i3 = (int) j;
                zzt(i);
                if (i3 == 0) {
                    this.zzB.zzr = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzB.zzr = 1;
                    return;
                } else if (i3 == 2) {
                    this.zzB.zzr = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.zzB.zzr = 3;
                    return;
                }
            case 2352003:
                zzt(i);
                this.zzB.zze = (int) j;
                return;
            case 2807729:
                this.zzy = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i4 = (int) j;
                        zzt(i);
                        if (i4 == 1) {
                            this.zzB.zzA = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.zzB.zzA = 1;
                            return;
                        }
                    case 21946:
                        zzt(i);
                        int iZzb = com.google.android.gms.internal.ads.zzk.zzb((int) j);
                        if (iZzb != -1) {
                            this.zzB.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21947:
                        zzt(i);
                        this.zzB.zzx = true;
                        int iZza = com.google.android.gms.internal.ads.zzk.zza((int) j);
                        if (iZza != -1) {
                            this.zzB.zzy = iZza;
                            return;
                        }
                        return;
                    case 21948:
                        zzt(i);
                        this.zzB.zzB = (int) j;
                        return;
                    case 21949:
                        zzt(i);
                        this.zzB.zzC = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    protected final void zzk(int i, double d) throws com.google.android.gms.internal.ads.zzbc {
        if (i == 181) {
            zzt(i);
            this.zzB.zzQ = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzz = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzt(i);
                this.zzB.zzD = (float) d;
                break;
            case 21970:
                zzt(i);
                this.zzB.zzE = (float) d;
                break;
            case 21971:
                zzt(i);
                this.zzB.zzF = (float) d;
                break;
            case 21972:
                zzt(i);
                this.zzB.zzG = (float) d;
                break;
            case 21973:
                zzt(i);
                this.zzB.zzH = (float) d;
                break;
            case 21974:
                zzt(i);
                this.zzB.zzI = (float) d;
                break;
            case 21975:
                zzt(i);
                this.zzB.zzJ = (float) d;
                break;
            case 21976:
                zzt(i);
                this.zzB.zzK = (float) d;
                break;
            case 21977:
                zzt(i);
                this.zzB.zzL = (float) d;
                break;
            case 21978:
                zzt(i);
                this.zzB.zzM = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzt(i);
                        this.zzB.zzs = (float) d;
                        break;
                    case 30324:
                        zzt(i);
                        this.zzB.zzt = (float) d;
                        break;
                    case 30325:
                        zzt(i);
                        this.zzB.zzu = (float) d;
                        break;
                }
                break;
        }
    }
}
