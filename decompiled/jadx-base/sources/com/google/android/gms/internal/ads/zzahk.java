package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzahk {
    public byte[] zzN;
    public com.google.android.gms.internal.ads.zzadu zzT;
    public boolean zzU;
    public com.google.android.gms.internal.ads.zzadt zzW;
    public int zzX;
    private int zzY;
    public java.lang.String zza;
    public java.lang.String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public com.google.android.gms.internal.ads.zzads zzi;
    public byte[] zzj;
    public com.google.android.gms.internal.ads.zzu zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = 0;
    public int zzr = -1;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public byte[] zzv = null;
    public int zzw = -1;
    public boolean zzx = false;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = 1000;
    public int zzC = 200;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public int zzO = 1;
    public int zzP = -1;
    public int zzQ = 8000;
    public long zzR = 0;
    public long zzS = 0;
    public boolean zzV = true;
    private java.lang.String zzZ = "eng";

    protected zzahk() {
    }

    private static android.util.Pair zzf(com.google.android.gms.internal.ads.zzdy zzdyVar) throws com.google.android.gms.internal.ads.zzbc {
        try {
            zzdyVar.zzM(16);
            long jZzs = zzdyVar.zzs();
            if (jZzs == 1482049860) {
                return new android.util.Pair(androidx.media3.common.MimeTypes.VIDEO_DIVX, null);
            }
            if (jZzs == 859189832) {
                return new android.util.Pair(androidx.media3.common.MimeTypes.VIDEO_H263, null);
            }
            if (jZzs != 826496599) {
                com.google.android.gms.internal.ads.zzdo.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new android.util.Pair(androidx.media3.common.MimeTypes.VIDEO_UNKNOWN, null);
            }
            int iZzd = zzdyVar.zzd() + 20;
            byte[] bArrZzN = zzdyVar.zzN();
            while (true) {
                int length = bArrZzN.length;
                if (iZzd >= length - 4) {
                    throw com.google.android.gms.internal.ads.zzbc.zza("Failed to find FourCC VC1 initialization data", null);
                }
                int i = iZzd + 1;
                if (bArrZzN[iZzd] == 0 && bArrZzN[i] == 0 && bArrZzN[iZzd + 2] == 1 && bArrZzN[iZzd + 3] == 15) {
                    return new android.util.Pair(androidx.media3.common.MimeTypes.VIDEO_VC1, java.util.Collections.singletonList(java.util.Arrays.copyOfRange(bArrZzN, iZzd, length)));
                }
                iZzd = i;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw com.google.android.gms.internal.ads.zzbc.zza("Error parsing FourCC private data", null);
        }
    }

    private static java.util.List zzg(byte[] bArr) throws com.google.android.gms.internal.ads.zzbc {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw com.google.android.gms.internal.ads.zzbc.zza("Error parsing vorbis codec private", null);
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                int i5 = bArr[i4];
                i4++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i3 += 255;
            }
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i4];
                i4++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i4] != 1) {
                throw com.google.android.gms.internal.ads.zzbc.zza("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            java.lang.System.arraycopy(bArr, i4, bArr2, 0, i6);
            int i10 = i4 + i6;
            if (bArr[i10] != 3) {
                throw com.google.android.gms.internal.ads.zzbc.zza("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw com.google.android.gms.internal.ads.zzbc.zza("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            java.lang.System.arraycopy(bArr, i11, bArr3, 0, length);
            java.util.ArrayList arrayList = new java.util.ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw com.google.android.gms.internal.ads.zzbc.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(com.google.android.gms.internal.ads.zzdy zzdyVar) throws com.google.android.gms.internal.ads.zzbc {
        try {
            int iZzk = zzdyVar.zzk();
            if (iZzk == 1) {
                return true;
            }
            if (iZzk == 65534) {
                zzdyVar.zzL(24);
                if (zzdyVar.zzt() == com.google.android.gms.internal.ads.zzahm.zze.getMostSignificantBits() && zzdyVar.zzt() == com.google.android.gms.internal.ads.zzahm.zze.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw com.google.android.gms.internal.ads.zzbc.zza("Error parsing MS/ACM codec private", null);
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(java.lang.String str) throws com.google.android.gms.internal.ads.zzbc {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw com.google.android.gms.internal.ads.zzbc.zza("Missing CodecPrivate for codec ".concat(java.lang.String.valueOf(str)), null);
    }

    /* JADX WARN: Code duplicated, block: B:132:0x024f A[PHI: r10
  0x024f: PHI (r10v11 int) = (r10v5 int), (r10v6 int), (r10v7 int), (r10v8 int), (r10v9 int), (r10v10 int), (r10v0 int) binds: [B:136:0x0269, B:130:0x0236, B:127:0x0218, B:125:0x0213, B:123:0x020e, B:121:0x020a, B:116:0x01ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:173:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:178:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:179:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:182:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:183:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:185:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:187:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:192:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:196:0x0400  */
    /* JADX WARN: Code duplicated, block: B:199:0x040e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0413  */
    /* JADX WARN: Code duplicated, block: B:204:0x0419  */
    /* JADX WARN: Code duplicated, block: B:224:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:226:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:229:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:234:0x0518  */
    /* JADX WARN: Code duplicated, block: B:253:0x0564  */
    /* JADX WARN: Code duplicated, block: B:255:0x0584  */
    /* JADX WARN: Code duplicated, block: B:257:0x058a  */
    /* JADX WARN: Code duplicated, block: B:273:0x05be  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
    public final void zze(com.google.android.gms.internal.ads.zzacq zzacqVar, int i) throws com.google.android.gms.internal.ads.zzbc {
        byte b;
        java.util.List listSingletonList;
        java.util.List listZzp;
        java.lang.String str;
        java.lang.String str2;
        int i2;
        java.util.List listZzg;
        int i3;
        java.lang.String str3;
        int i4;
        com.google.android.gms.internal.ads.zzz zzzVar;
        int i5;
        float f;
        com.google.android.gms.internal.ads.zzk zzkVarZzg;
        byte[] bArr;
        int i6;
        int i7;
        int i8;
        com.google.android.gms.internal.ads.zzacj zzacjVarZza;
        java.lang.String str4 = this.zzb;
        int i9 = 1;
        int iZzn = 4;
        int i10 = 0;
        int iIntValue = -1;
        switch (str4) {
            case "V_MPEG4/ISO/AP":
                b = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b = 4;
                break;
            case "A_MS/ACM":
                b = 23;
                break;
            case "A_TRUEHD":
                b = 18;
                break;
            case "A_VORBIS":
                b = 11;
                break;
            case "A_MPEG/L2":
                b = 14;
                break;
            case "A_MPEG/L3":
                b = 15;
                break;
            case "V_MS/VFW/FOURCC":
                b = 9;
                break;
            case "S_DVBSUB":
                b = 32;
                break;
            case "V_MPEG4/ISO/ASP":
                b = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b = 7;
                break;
            case "S_VOBSUB":
                b = 30;
                break;
            case "A_DTS/LOSSLESS":
                b = 21;
                break;
            case "A_AAC":
                b = 13;
                break;
            case "A_AC3":
                b = 16;
                break;
            case "A_DTS":
                b = 19;
                break;
            case "V_AV1":
                b = 2;
                break;
            case "V_VP8":
                b = 0;
                break;
            case "V_VP9":
                b = 1;
                break;
            case "S_HDMV/PGS":
                b = 31;
                break;
            case "V_THEORA":
                b = 10;
                break;
            case "A_DTS/EXPRESS":
                b = 20;
                break;
            case "A_PCM/FLOAT/IEEE":
                b = 26;
                break;
            case "A_PCM/INT/BIG":
                b = 25;
                break;
            case "A_PCM/INT/LIT":
                b = 24;
                break;
            case "S_TEXT/ASS":
                b = 28;
                break;
            case "V_MPEGH/ISO/HEVC":
                b = 8;
                break;
            case "S_TEXT/WEBVTT":
                b = 29;
                break;
            case "S_TEXT/UTF8":
                b = 27;
                break;
            case "V_MPEG2":
                b = 3;
                break;
            case "A_EAC3":
                b = 17;
                break;
            case "A_FLAC":
                b = 22;
                break;
            case "A_OPUS":
                b = 12;
                break;
            default:
                b = -1;
                break;
        }
        java.lang.String str5 = androidx.media3.common.MimeTypes.AUDIO_RAW;
        switch (b) {
            case 0:
                str5 = androidx.media3.common.MimeTypes.VIDEO_VP8;
                i2 = -1;
                iZzn = -1;
                listZzp = null;
                str2 = null;
                if (this.zzN != null && (zzacjVarZza = com.google.android.gms.internal.ads.zzacj.zza(new com.google.android.gms.internal.ads.zzdy(this.zzN))) != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i11 = (z ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                } else if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                    if (this.zzq == 0) {
                        i7 = this.zzo;
                        if (i7 == -1) {
                            i7 = this.zzl;
                        }
                        this.zzo = i7;
                        i8 = this.zzp;
                        if (i8 == -1) {
                            i8 = this.zzm;
                        }
                        this.zzp = i8;
                    }
                    i5 = this.zzo;
                    if (i5 != -1 || (i6 = this.zzp) == -1) {
                        f = -1.0f;
                    } else {
                        f = (this.zzm * i5) / (this.zzl * i6);
                    }
                    if (this.zzx) {
                        if (this.zzD != -1.0f || this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f || this.zzM == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzL + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder.putShort((short) this.zzB);
                            byteBufferOrder.putShort((short) this.zzC);
                        }
                        com.google.android.gms.internal.ads.zzi zziVar = new com.google.android.gms.internal.ads.zzi();
                        zziVar.zzc(this.zzy);
                        zziVar.zzb(this.zzA);
                        zziVar.zzd(this.zzz);
                        zziVar.zze(bArr);
                        zziVar.zzf(this.zzn);
                        zziVar.zza(this.zzn);
                        zzkVarZzg = zziVar.zzg();
                    } else {
                        zzkVarZzg = null;
                    }
                    if (this.zza != null && com.google.android.gms.internal.ads.zzahm.zzf.containsKey(this.zza)) {
                        iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                    }
                    if (this.zzr == 0 || java.lang.Float.compare(this.zzs, 0.0f) != 0 || java.lang.Float.compare(this.zzt, 0.0f) != 0) {
                        i10 = iIntValue;
                    } else if (java.lang.Float.compare(this.zzu, 0.0f) != 0) {
                        if (java.lang.Float.compare(this.zzu, 90.0f) == 0) {
                            i10 = 90;
                        } else if (java.lang.Float.compare(this.zzu, -180.0f) == 0 || java.lang.Float.compare(this.zzu, 180.0f) == 0) {
                            i10 = org.objectweb.asm.Opcodes.GETFIELD;
                        } else if (java.lang.Float.compare(this.zzu, -90.0f) == 0) {
                            i10 = 270;
                        } else {
                            i10 = iIntValue;
                        }
                    }
                    zzzVar.zzaf(this.zzl);
                    zzzVar.zzK(this.zzm);
                    zzzVar.zzW(f);
                    zzzVar.zzZ(i10);
                    zzzVar.zzX(this.zzv);
                    zzzVar.zzad(this.zzw);
                    zzzVar.zzB(zzkVarZzg);
                    i9 = 2;
                } else {
                    if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3) && !androidx.media3.common.MimeTypes.TEXT_SSA.equals(str3) && !androidx.media3.common.MimeTypes.TEXT_VTT.equals(str3) && !androidx.media3.common.MimeTypes.APPLICATION_VOBSUB.equals(str3) && !androidx.media3.common.MimeTypes.APPLICATION_PGS.equals(str3) && !androidx.media3.common.MimeTypes.APPLICATION_DVBSUBS.equals(str3)) {
                        throw com.google.android.gms.internal.ads.zzbc.zza("Unexpected MIME type.", null);
                    }
                    i9 = 3;
                }
                if (this.zza != null && !com.google.android.gms.internal.ads.zzahm.zzf.containsKey(this.zza)) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i11);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw;
                zzadtVarZzw.zzm(zzabVarZzag);
                return;
            case 1:
                str5 = androidx.media3.common.MimeTypes.VIDEO_VP9;
                i2 = -1;
                iZzn = -1;
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z2 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i12 = (z2 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar2 = new com.google.android.gms.internal.ads.zzi();
                            zziVar2.zzc(this.zzy);
                            zziVar2.zzb(this.zzA);
                            zziVar2.zzd(this.zzz);
                            zziVar2.zze(bArr);
                            zziVar2.zzf(this.zzn);
                            zziVar2.zza(this.zzn);
                            zzkVarZzg = zziVar2.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i12);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag2 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw2 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw2;
                zzadtVarZzw2.zzm(zzabVarZzag2);
                return;
            case 2:
                str5 = "video/av01";
                i2 = -1;
                iZzn = -1;
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z3 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i13 = (z3 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar3 = new com.google.android.gms.internal.ads.zzi();
                            zziVar3.zzc(this.zzy);
                            zziVar3.zzb(this.zzA);
                            zziVar3.zzd(this.zzz);
                            zziVar3.zze(bArr);
                            zziVar3.zzf(this.zzn);
                            zziVar3.zza(this.zzn);
                            zzkVarZzg = zziVar3.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i13);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag3 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw3 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw3;
                zzadtVarZzw3.zzm(zzabVarZzag3);
                return;
            case 3:
                str5 = androidx.media3.common.MimeTypes.VIDEO_MPEG2;
                i2 = -1;
                iZzn = -1;
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z4 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i14 = (z4 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar4 = new com.google.android.gms.internal.ads.zzi();
                            zziVar4.zzc(this.zzy);
                            zziVar4.zzb(this.zzA);
                            zziVar4.zzd(this.zzz);
                            zziVar4.zze(bArr);
                            zziVar4.zzf(this.zzn);
                            zziVar4.zza(this.zzn);
                            zzkVarZzg = zziVar4.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i14);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag4 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw4 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw4;
                zzadtVarZzw4.zzm(zzabVarZzag4);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr2 = this.zzj;
                listSingletonList = bArr2 == null ? null : java.util.Collections.singletonList(bArr2);
                str5 = androidx.media3.common.MimeTypes.VIDEO_MP4V;
                listZzp = listSingletonList;
                i2 = -1;
                iZzn = -1;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z5 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i15 = (z5 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar5 = new com.google.android.gms.internal.ads.zzi();
                            zziVar5.zzc(this.zzy);
                            zziVar5.zzb(this.zzA);
                            zziVar5.zzd(this.zzz);
                            zziVar5.zze(bArr);
                            zziVar5.zzf(this.zzn);
                            zziVar5.zza(this.zzn);
                            zzkVarZzg = zziVar5.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i15);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag5 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw5 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw5;
                zzadtVarZzw5.zzm(zzabVarZzag5);
                return;
            case 7:
                com.google.android.gms.internal.ads.zzabr zzabrVarZza = com.google.android.gms.internal.ads.zzabr.zza(new com.google.android.gms.internal.ads.zzdy(zzi(this.zzb)));
                listZzp = zzabrVarZza.zza;
                this.zzX = zzabrVarZza.zzb;
                str = zzabrVarZza.zzl;
                str5 = "video/avc";
                str2 = str;
                i2 = -1;
                iZzn = -1;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z6 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i16 = (z6 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar6 = new com.google.android.gms.internal.ads.zzi();
                            zziVar6.zzc(this.zzy);
                            zziVar6.zzb(this.zzA);
                            zziVar6.zzd(this.zzz);
                            zziVar6.zze(bArr);
                            zziVar6.zzf(this.zzn);
                            zziVar6.zza(this.zzn);
                            zzkVarZzg = zziVar6.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i16);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag6 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw6 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw6;
                zzadtVarZzw6.zzm(zzabVarZzag6);
                return;
            case 8:
                com.google.android.gms.internal.ads.zzadc zzadcVarZza = com.google.android.gms.internal.ads.zzadc.zza(new com.google.android.gms.internal.ads.zzdy(zzi(this.zzb)));
                listZzp = zzadcVarZza.zza;
                this.zzX = zzadcVarZza.zzb;
                str = zzadcVarZza.zzk;
                str5 = "video/hevc";
                str2 = str;
                i2 = -1;
                iZzn = -1;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z7 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i17 = (z7 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar7 = new com.google.android.gms.internal.ads.zzi();
                            zziVar7.zzc(this.zzy);
                            zziVar7.zzb(this.zzA);
                            zziVar7.zzd(this.zzz);
                            zziVar7.zze(bArr);
                            zziVar7.zzf(this.zzn);
                            zziVar7.zza(this.zzn);
                            zzkVarZzg = zziVar7.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i17);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag7 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw7 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw7;
                zzadtVarZzw7.zzm(zzabVarZzag7);
                return;
            case 9:
                android.util.Pair pairZzf = zzf(new com.google.android.gms.internal.ads.zzdy(zzi(this.zzb)));
                str5 = (java.lang.String) pairZzf.first;
                listSingletonList = (java.util.List) pairZzf.second;
                listZzp = listSingletonList;
                i2 = -1;
                iZzn = -1;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z8 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i18 = (z8 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar8 = new com.google.android.gms.internal.ads.zzi();
                            zziVar8.zzc(this.zzy);
                            zziVar8.zzb(this.zzA);
                            zziVar8.zzd(this.zzz);
                            zziVar8.zze(bArr);
                            zziVar8.zzf(this.zzn);
                            zziVar8.zza(this.zzn);
                            zzkVarZzg = zziVar8.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i18);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag8 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw8 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw8;
                zzadtVarZzw8.zzm(zzabVarZzag8);
                return;
            case 10:
                str5 = androidx.media3.common.MimeTypes.VIDEO_UNKNOWN;
                i2 = -1;
                iZzn = -1;
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z9 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i19 = (z9 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar9 = new com.google.android.gms.internal.ads.zzi();
                            zziVar9.zzc(this.zzy);
                            zziVar9.zzb(this.zzA);
                            zziVar9.zzd(this.zzz);
                            zziVar9.zze(bArr);
                            zziVar9.zzf(this.zzn);
                            zziVar9.zza(this.zzn);
                            zzkVarZzg = zziVar9.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i19);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag9 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw9 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw9;
                zzadtVarZzw9.zzm(zzabVarZzag9);
                return;
            case 11:
                listZzg = zzg(zzi(str4));
                i3 = 8192;
                str5 = androidx.media3.common.MimeTypes.AUDIO_VORBIS;
                listZzp = listZzg;
                iZzn = -1;
                i2 = i3;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z10 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i110 = (z10 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar10 = new com.google.android.gms.internal.ads.zzi();
                            zziVar10.zzc(this.zzy);
                            zziVar10.zzb(this.zzA);
                            zziVar10.zzd(this.zzz);
                            zziVar10.zze(bArr);
                            zziVar10.zzf(this.zzn);
                            zziVar10.zza(this.zzn);
                            zzkVarZzg = zziVar10.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i110);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag10 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw10 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw10;
                zzadtVarZzw10.zzm(zzabVarZzag10);
                return;
            case 12:
                listZzg = new java.util.ArrayList(3);
                listZzg.add(zzi(this.zzb));
                listZzg.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(this.zzR).array());
                listZzg.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(this.zzS).array());
                i3 = 5760;
                str5 = androidx.media3.common.MimeTypes.AUDIO_OPUS;
                listZzp = listZzg;
                iZzn = -1;
                i2 = i3;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z11 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i111 = (z11 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar11 = new com.google.android.gms.internal.ads.zzi();
                            zziVar11.zzc(this.zzy);
                            zziVar11.zzb(this.zzA);
                            zziVar11.zzd(this.zzz);
                            zziVar11.zze(bArr);
                            zziVar11.zzf(this.zzn);
                            zziVar11.zza(this.zzn);
                            zzkVarZzg = zziVar11.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i111);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag11 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw11 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw11;
                zzadtVarZzw11.zzm(zzabVarZzag11);
                return;
            case 13:
                java.util.List listSingletonList2 = java.util.Collections.singletonList(zzi(str4));
                com.google.android.gms.internal.ads.zzabi zzabiVarZza = com.google.android.gms.internal.ads.zzabk.zza(this.zzj);
                this.zzQ = zzabiVarZza.zza;
                this.zzO = zzabiVarZza.zzb;
                java.lang.String str6 = zzabiVarZza.zzc;
                str5 = androidx.media3.common.MimeTypes.AUDIO_AAC;
                str2 = str6;
                iZzn = -1;
                listZzp = listSingletonList2;
                i2 = -1;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z12 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i112 = (z12 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar12 = new com.google.android.gms.internal.ads.zzi();
                            zziVar12.zzc(this.zzy);
                            zziVar12.zzb(this.zzA);
                            zziVar12.zzd(this.zzz);
                            zziVar12.zze(bArr);
                            zziVar12.zzf(this.zzn);
                            zziVar12.zza(this.zzn);
                            zzkVarZzg = zziVar12.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i112);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag12 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw12 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw12;
                zzadtVarZzw12.zzm(zzabVarZzag12);
                return;
            case 14:
                str5 = androidx.media3.common.MimeTypes.AUDIO_MPEG_L2;
                iZzn = -1;
                i2 = 4096;
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z13 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i113 = (z13 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar13 = new com.google.android.gms.internal.ads.zzi();
                            zziVar13.zzc(this.zzy);
                            zziVar13.zzb(this.zzA);
                            zziVar13.zzd(this.zzz);
                            zziVar13.zze(bArr);
                            zziVar13.zzf(this.zzn);
                            zziVar13.zza(this.zzn);
                            zzkVarZzg = zziVar13.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i113);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag13 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw13 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw13;
                zzadtVarZzw13.zzm(zzabVarZzag13);
                return;
            case 15:
                str5 = androidx.media3.common.MimeTypes.AUDIO_MPEG;
                iZzn = -1;
                i2 = 4096;
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z14 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i114 = (z14 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar14 = new com.google.android.gms.internal.ads.zzi();
                            zziVar14.zzc(this.zzy);
                            zziVar14.zzb(this.zzA);
                            zziVar14.zzd(this.zzz);
                            zziVar14.zze(bArr);
                            zziVar14.zzf(this.zzn);
                            zziVar14.zza(this.zzn);
                            zzkVarZzg = zziVar14.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i114);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag14 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw14 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw14;
                zzadtVarZzw14.zzm(zzabVarZzag14);
                return;
            case 16:
                str5 = androidx.media3.common.MimeTypes.AUDIO_AC3;
                i2 = -1;
                iZzn = -1;
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z15 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i115 = (z15 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar15 = new com.google.android.gms.internal.ads.zzi();
                            zziVar15.zzc(this.zzy);
                            zziVar15.zzb(this.zzA);
                            zziVar15.zzd(this.zzz);
                            zziVar15.zze(bArr);
                            zziVar15.zzf(this.zzn);
                            zziVar15.zza(this.zzn);
                            zzkVarZzg = zziVar15.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i115);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag15 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw15 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw15;
                zzadtVarZzw15.zzm(zzabVarZzag15);
                return;
            case 17:
                str5 = androidx.media3.common.MimeTypes.AUDIO_E_AC3;
                i2 = -1;
                iZzn = -1;
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z16 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i116 = (z16 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar16 = new com.google.android.gms.internal.ads.zzi();
                            zziVar16.zzc(this.zzy);
                            zziVar16.zzb(this.zzA);
                            zziVar16.zzd(this.zzz);
                            zziVar16.zze(bArr);
                            zziVar16.zzf(this.zzn);
                            zziVar16.zza(this.zzn);
                            zzkVarZzg = zziVar16.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i116);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag16 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw16 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw16;
                zzadtVarZzw16.zzm(zzabVarZzag16);
                return;
            case 18:
                this.zzT = new com.google.android.gms.internal.ads.zzadu();
                str5 = androidx.media3.common.MimeTypes.AUDIO_TRUEHD;
                i2 = -1;
                iZzn = -1;
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z17 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i117 = (z17 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar17 = new com.google.android.gms.internal.ads.zzi();
                            zziVar17.zzc(this.zzy);
                            zziVar17.zzb(this.zzA);
                            zziVar17.zzd(this.zzz);
                            zziVar17.zze(bArr);
                            zziVar17.zzf(this.zzn);
                            zziVar17.zza(this.zzn);
                            zzkVarZzg = zziVar17.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i117);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag17 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw17 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw17;
                zzadtVarZzw17.zzm(zzabVarZzag17);
                return;
            case 19:
            case 20:
                str5 = androidx.media3.common.MimeTypes.AUDIO_DTS;
                i2 = -1;
                iZzn = -1;
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z18 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i118 = (z18 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar18 = new com.google.android.gms.internal.ads.zzi();
                            zziVar18.zzc(this.zzy);
                            zziVar18.zzb(this.zzA);
                            zziVar18.zzd(this.zzz);
                            zziVar18.zze(bArr);
                            zziVar18.zzf(this.zzn);
                            zziVar18.zza(this.zzn);
                            zzkVarZzg = zziVar18.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i118);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag18 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw18 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw18;
                zzadtVarZzw18.zzm(zzabVarZzag18);
                return;
            case 21:
                str5 = androidx.media3.common.MimeTypes.AUDIO_DTS_HD;
                i2 = -1;
                iZzn = -1;
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z19 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i119 = (z19 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar19 = new com.google.android.gms.internal.ads.zzi();
                            zziVar19.zzc(this.zzy);
                            zziVar19.zzb(this.zzA);
                            zziVar19.zzd(this.zzz);
                            zziVar19.zze(bArr);
                            zziVar19.zzf(this.zzn);
                            zziVar19.zza(this.zzn);
                            zzkVarZzg = zziVar19.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i119);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag19 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw19 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw19;
                zzadtVarZzw19.zzm(zzabVarZzag19);
                return;
            case 22:
                listSingletonList = java.util.Collections.singletonList(zzi(str4));
                str5 = androidx.media3.common.MimeTypes.AUDIO_FLAC;
                listZzp = listSingletonList;
                i2 = -1;
                iZzn = -1;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z110 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1110 = (z110 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar110 = new com.google.android.gms.internal.ads.zzi();
                            zziVar110.zzc(this.zzy);
                            zziVar110.zzb(this.zzA);
                            zziVar110.zzd(this.zzz);
                            zziVar110.zze(bArr);
                            zziVar110.zzf(this.zzn);
                            zziVar110.zza(this.zzn);
                            zzkVarZzg = zziVar110.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1110);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag110 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw110 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw110;
                zzadtVarZzw110.zzm(zzabVarZzag110);
                return;
            case 23:
                if (zzh(new com.google.android.gms.internal.ads.zzdy(zzi(this.zzb)))) {
                    iZzn = com.google.android.gms.internal.ads.zzei.zzn(this.zzP);
                    if (iZzn == 0) {
                        com.google.android.gms.internal.ads.zzdo.zzf("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzP + ". Setting mimeType to audio/x-unknown");
                    } else {
                        i2 = -1;
                    }
                    listZzp = null;
                    str2 = null;
                    if (this.zzN != null) {
                        str2 = zzacjVarZza.zza;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z111 = this.zzV;
                    if (true != this.zzU) {
                        i4 = 0;
                    } else {
                        i4 = 2;
                    }
                    int i1111 = (z111 ? 1 : 0) | i4;
                    zzzVar = new com.google.android.gms.internal.ads.zzz();
                    if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                        if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                            if (this.zzq == 0) {
                                i7 = this.zzo;
                                if (i7 == -1) {
                                    i7 = this.zzl;
                                }
                                this.zzo = i7;
                                i8 = this.zzp;
                                if (i8 == -1) {
                                    i8 = this.zzm;
                                }
                                this.zzp = i8;
                            }
                            i5 = this.zzo;
                            if (i5 != -1) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.zzx) {
                                if (this.zzD != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                com.google.android.gms.internal.ads.zzi zziVar111 = new com.google.android.gms.internal.ads.zzi();
                                zziVar111.zzc(this.zzy);
                                zziVar111.zzb(this.zzA);
                                zziVar111.zzd(this.zzz);
                                zziVar111.zze(bArr);
                                zziVar111.zzf(this.zzn);
                                zziVar111.zza(this.zzn);
                                zzkVarZzg = zziVar111.zzg();
                            } else {
                                zzkVarZzg = null;
                            }
                            if (this.zza != null) {
                                iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                            }
                            if (this.zzr == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            zzzVar.zzaf(this.zzl);
                            zzzVar.zzK(this.zzm);
                            zzzVar.zzW(f);
                            zzzVar.zzZ(i10);
                            zzzVar.zzX(this.zzv);
                            zzzVar.zzad(this.zzw);
                            zzzVar.zzB(zzkVarZzg);
                            i9 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i9 = 3;
                        }
                        break;
                    } else {
                        zzzVar.zzz(this.zzO);
                        zzzVar.zzab(this.zzQ);
                        zzzVar.zzU(iZzn);
                    }
                    if (this.zza != null) {
                        zzzVar.zzO(this.zza);
                    }
                    zzzVar.zzL(i);
                    zzzVar.zzaa(str3);
                    zzzVar.zzR(i2);
                    zzzVar.zzQ(this.zzZ);
                    zzzVar.zzac(i1111);
                    zzzVar.zzN(listZzp);
                    zzzVar.zzA(str2);
                    zzzVar.zzF(this.zzk);
                    com.google.android.gms.internal.ads.zzab zzabVarZzag111 = zzzVar.zzag();
                    com.google.android.gms.internal.ads.zzadt zzadtVarZzw111 = zzacqVar.zzw(this.zzc, i9);
                    this.zzW = zzadtVarZzw111;
                    zzadtVarZzw111.zzm(zzabVarZzag111);
                    return;
                }
                com.google.android.gms.internal.ads.zzdo.zzf("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                i2 = -1;
                iZzn = -1;
                str5 = androidx.media3.common.MimeTypes.AUDIO_UNKNOWN;
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z112 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1112 = (z112 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar112 = new com.google.android.gms.internal.ads.zzi();
                            zziVar112.zzc(this.zzy);
                            zziVar112.zzb(this.zzA);
                            zziVar112.zzd(this.zzz);
                            zziVar112.zze(bArr);
                            zziVar112.zzf(this.zzn);
                            zziVar112.zza(this.zzn);
                            zzkVarZzg = zziVar112.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1112);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag112 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw112 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw112;
                zzadtVarZzw112.zzm(zzabVarZzag112);
                return;
            case 24:
                iZzn = com.google.android.gms.internal.ads.zzei.zzn(this.zzP);
                if (iZzn == 0) {
                    com.google.android.gms.internal.ads.zzdo.zzf("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzP + ". Setting mimeType to audio/x-unknown");
                    i2 = -1;
                    iZzn = -1;
                    str5 = androidx.media3.common.MimeTypes.AUDIO_UNKNOWN;
                } else {
                    i2 = -1;
                }
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z113 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1113 = (z113 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar113 = new com.google.android.gms.internal.ads.zzi();
                            zziVar113.zzc(this.zzy);
                            zziVar113.zzb(this.zzA);
                            zziVar113.zzd(this.zzz);
                            zziVar113.zze(bArr);
                            zziVar113.zzf(this.zzn);
                            zziVar113.zza(this.zzn);
                            zzkVarZzg = zziVar113.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1113);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag113 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw113 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw113;
                zzadtVarZzw113.zzm(zzabVarZzag113);
                return;
            case 25:
                int i20 = this.zzP;
                if (i20 == 8) {
                    iZzn = 3;
                } else if (i20 == 16) {
                    iZzn = 268435456;
                } else if (i20 == 24) {
                    iZzn = androidx.media3.common.C.ENCODING_PCM_24BIT_BIG_ENDIAN;
                } else {
                    if (i20 != 32) {
                        com.google.android.gms.internal.ads.zzdo.zzf("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i20 + ". Setting mimeType to audio/x-unknown");
                        i2 = -1;
                        iZzn = -1;
                        str5 = androidx.media3.common.MimeTypes.AUDIO_UNKNOWN;
                        listZzp = null;
                        str2 = null;
                        if (this.zzN != null) {
                            str2 = zzacjVarZza.zza;
                            str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                        }
                        str3 = str5;
                        boolean z114 = this.zzV;
                        if (true != this.zzU) {
                            i4 = 0;
                        } else {
                            i4 = 2;
                        }
                        int i1114 = (z114 ? 1 : 0) | i4;
                        zzzVar = new com.google.android.gms.internal.ads.zzz();
                        if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                            if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                                if (this.zzq == 0) {
                                    i7 = this.zzo;
                                    if (i7 == -1) {
                                        i7 = this.zzl;
                                    }
                                    this.zzo = i7;
                                    i8 = this.zzp;
                                    if (i8 == -1) {
                                        i8 = this.zzm;
                                    }
                                    this.zzp = i8;
                                }
                                i5 = this.zzo;
                                if (i5 != -1) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.zzx) {
                                    if (this.zzD != -1.0f) {
                                        bArr = null;
                                    } else {
                                        bArr = null;
                                    }
                                    com.google.android.gms.internal.ads.zzi zziVar114 = new com.google.android.gms.internal.ads.zzi();
                                    zziVar114.zzc(this.zzy);
                                    zziVar114.zzb(this.zzA);
                                    zziVar114.zzd(this.zzz);
                                    zziVar114.zze(bArr);
                                    zziVar114.zzf(this.zzn);
                                    zziVar114.zza(this.zzn);
                                    zzkVarZzg = zziVar114.zzg();
                                } else {
                                    zzkVarZzg = null;
                                }
                                if (this.zza != null) {
                                    iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                                }
                                if (this.zzr == 0) {
                                    i10 = iIntValue;
                                } else {
                                    i10 = iIntValue;
                                }
                                zzzVar.zzaf(this.zzl);
                                zzzVar.zzK(this.zzm);
                                zzzVar.zzW(f);
                                zzzVar.zzZ(i10);
                                zzzVar.zzX(this.zzv);
                                zzzVar.zzad(this.zzw);
                                zzzVar.zzB(zzkVarZzg);
                                i9 = 2;
                            } else {
                                if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                                }
                                i9 = 3;
                            }
                            break;
                        } else {
                            zzzVar.zzz(this.zzO);
                            zzzVar.zzab(this.zzQ);
                            zzzVar.zzU(iZzn);
                        }
                        if (this.zza != null) {
                            zzzVar.zzO(this.zza);
                        }
                        zzzVar.zzL(i);
                        zzzVar.zzaa(str3);
                        zzzVar.zzR(i2);
                        zzzVar.zzQ(this.zzZ);
                        zzzVar.zzac(i1114);
                        zzzVar.zzN(listZzp);
                        zzzVar.zzA(str2);
                        zzzVar.zzF(this.zzk);
                        com.google.android.gms.internal.ads.zzab zzabVarZzag114 = zzzVar.zzag();
                        com.google.android.gms.internal.ads.zzadt zzadtVarZzw114 = zzacqVar.zzw(this.zzc, i9);
                        this.zzW = zzadtVarZzw114;
                        zzadtVarZzw114.zzm(zzabVarZzag114);
                        return;
                    }
                    iZzn = androidx.media3.common.C.ENCODING_PCM_32BIT_BIG_ENDIAN;
                }
                i2 = -1;
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z115 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1115 = (z115 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar115 = new com.google.android.gms.internal.ads.zzi();
                            zziVar115.zzc(this.zzy);
                            zziVar115.zzb(this.zzA);
                            zziVar115.zzd(this.zzz);
                            zziVar115.zze(bArr);
                            zziVar115.zzf(this.zzn);
                            zziVar115.zza(this.zzn);
                            zzkVarZzg = zziVar115.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1115);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag115 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw115 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw115;
                zzadtVarZzw115.zzm(zzabVarZzag115);
                return;
            case 26:
                int i21 = this.zzP;
                if (i21 == 32) {
                    i2 = -1;
                } else {
                    com.google.android.gms.internal.ads.zzdo.zzf("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i21 + ". Setting mimeType to audio/x-unknown");
                    i2 = -1;
                    iZzn = -1;
                    str5 = androidx.media3.common.MimeTypes.AUDIO_UNKNOWN;
                }
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z116 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1116 = (z116 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar116 = new com.google.android.gms.internal.ads.zzi();
                            zziVar116.zzc(this.zzy);
                            zziVar116.zzb(this.zzA);
                            zziVar116.zzd(this.zzz);
                            zziVar116.zze(bArr);
                            zziVar116.zzf(this.zzn);
                            zziVar116.zza(this.zzn);
                            zzkVarZzg = zziVar116.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1116);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag116 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw116 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw116;
                zzadtVarZzw116.zzm(zzabVarZzag116);
                return;
            case 27:
                i2 = -1;
                iZzn = -1;
                str5 = androidx.media3.common.MimeTypes.APPLICATION_SUBRIP;
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z117 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1117 = (z117 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar117 = new com.google.android.gms.internal.ads.zzi();
                            zziVar117.zzc(this.zzy);
                            zziVar117.zzb(this.zzA);
                            zziVar117.zzd(this.zzz);
                            zziVar117.zze(bArr);
                            zziVar117.zzf(this.zzn);
                            zziVar117.zza(this.zzn);
                            zzkVarZzg = zziVar117.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1117);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag117 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw117 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw117;
                zzadtVarZzw117.zzm(zzabVarZzag117);
                return;
            case 28:
                listZzp = com.google.android.gms.internal.ads.zzfxn.zzp(com.google.android.gms.internal.ads.zzahm.zzb, zzi(this.zzb));
                i2 = -1;
                iZzn = -1;
                str5 = androidx.media3.common.MimeTypes.TEXT_SSA;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z118 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1118 = (z118 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar118 = new com.google.android.gms.internal.ads.zzi();
                            zziVar118.zzc(this.zzy);
                            zziVar118.zzb(this.zzA);
                            zziVar118.zzd(this.zzz);
                            zziVar118.zze(bArr);
                            zziVar118.zzf(this.zzn);
                            zziVar118.zza(this.zzn);
                            zzkVarZzg = zziVar118.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1118);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag118 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw118 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw118;
                zzadtVarZzw118.zzm(zzabVarZzag118);
                return;
            case 29:
                str5 = androidx.media3.common.MimeTypes.TEXT_VTT;
                i2 = -1;
                iZzn = -1;
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z119 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1119 = (z119 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar119 = new com.google.android.gms.internal.ads.zzi();
                            zziVar119.zzc(this.zzy);
                            zziVar119.zzb(this.zzA);
                            zziVar119.zzd(this.zzz);
                            zziVar119.zze(bArr);
                            zziVar119.zzf(this.zzn);
                            zziVar119.zza(this.zzn);
                            zzkVarZzg = zziVar119.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1119);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag119 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw119 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw119;
                zzadtVarZzw119.zzm(zzabVarZzag119);
                return;
            case 30:
                listSingletonList = com.google.android.gms.internal.ads.zzfxn.zzo(zzi(str4));
                str5 = androidx.media3.common.MimeTypes.APPLICATION_VOBSUB;
                listZzp = listSingletonList;
                i2 = -1;
                iZzn = -1;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z1110 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i11110 = (z1110 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar1110 = new com.google.android.gms.internal.ads.zzi();
                            zziVar1110.zzc(this.zzy);
                            zziVar1110.zzb(this.zzA);
                            zziVar1110.zzd(this.zzz);
                            zziVar1110.zze(bArr);
                            zziVar1110.zzf(this.zzn);
                            zziVar1110.zza(this.zzn);
                            zzkVarZzg = zziVar1110.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i11110);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag1110 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw1110 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw1110;
                zzadtVarZzw1110.zzm(zzabVarZzag1110);
                return;
            case 31:
                str5 = androidx.media3.common.MimeTypes.APPLICATION_PGS;
                i2 = -1;
                iZzn = -1;
                listZzp = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z1111 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i11111 = (z1111 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar1111 = new com.google.android.gms.internal.ads.zzi();
                            zziVar1111.zzc(this.zzy);
                            zziVar1111.zzb(this.zzA);
                            zziVar1111.zzd(this.zzz);
                            zziVar1111.zze(bArr);
                            zziVar1111.zzf(this.zzn);
                            zziVar1111.zza(this.zzn);
                            zzkVarZzg = zziVar1111.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i11111);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag1111 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw1111 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw1111;
                zzadtVarZzw1111.zzm(zzabVarZzag1111);
                return;
            case 32:
                byte[] bArr3 = new byte[4];
                java.lang.System.arraycopy(zzi(str4), 0, bArr3, 0, 4);
                listSingletonList = com.google.android.gms.internal.ads.zzfxn.zzo(bArr3);
                str5 = androidx.media3.common.MimeTypes.APPLICATION_DVBSUBS;
                listZzp = listSingletonList;
                i2 = -1;
                iZzn = -1;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                boolean z1112 = this.zzV;
                if (true != this.zzU) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i11112 = (z1112 ? 1 : 0) | i4;
                zzzVar = new com.google.android.gms.internal.ads.zzz();
                if (!com.google.android.gms.internal.ads.zzbb.zzg(str3)) {
                    if (com.google.android.gms.internal.ads.zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        }
                        i5 = this.zzo;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            com.google.android.gms.internal.ads.zzi zziVar1112 = new com.google.android.gms.internal.ads.zzi();
                            zziVar1112.zzc(this.zzy);
                            zziVar1112.zzb(this.zzA);
                            zziVar1112.zzd(this.zzz);
                            zziVar1112.zze(bArr);
                            zziVar1112.zzf(this.zzn);
                            zziVar1112.zza(this.zzn);
                            zzkVarZzg = zziVar1112.zzg();
                        } else {
                            zzkVarZzg = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i10);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i9 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i11112);
                zzzVar.zzN(listZzp);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                com.google.android.gms.internal.ads.zzab zzabVarZzag1112 = zzzVar.zzag();
                com.google.android.gms.internal.ads.zzadt zzadtVarZzw1112 = zzacqVar.zzw(this.zzc, i9);
                this.zzW = zzadtVarZzw1112;
                zzadtVarZzw1112.zzm(zzabVarZzag1112);
                return;
            default:
                throw com.google.android.gms.internal.ads.zzbc.zza("Unrecognized codec identifier.", null);
        }
    }
}
