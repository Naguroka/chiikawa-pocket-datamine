package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzahh {
    private final byte[] zza = new byte[8];
    private final java.util.ArrayDeque zzb = new java.util.ArrayDeque();
    private final com.google.android.gms.internal.ads.zzaho zzc = new com.google.android.gms.internal.ads.zzaho();
    private com.google.android.gms.internal.ads.zzahi zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(com.google.android.gms.internal.ads.zzaco zzacoVar, int i) throws java.io.IOException {
        zzacoVar.zzi(this.zza, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.zza[i2] & 255));
        }
        return j;
    }

    public final void zza(com.google.android.gms.internal.ads.zzahi zzahiVar) {
        this.zzd = zzahiVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00af A[LOOP:0: B:3:0x0005->B:37:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x012e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Code duplicated, block: B:64:0x013b A[LOOP:2: B:61:0x0133->B:64:0x013b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x014a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0163  */
    /* JADX WARN: Code duplicated, block: B:74:0x0170  */
    /* JADX WARN: Code duplicated, block: B:78:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x013d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x014a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x0170, please report this as an issue */
    public final boolean zzc(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        int i;
        com.google.android.gms.internal.ads.zzahj zzahjVar;
        com.google.android.gms.internal.ads.zzahm zzahmVar;
        long j;
        long j2;
        int i2;
        byte[] bArr;
        java.lang.String str;
        int i3;
        long j3;
        int i4;
        long jZzd;
        double dLongBitsToDouble;
        int iZzb;
        int iZzc;
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzd);
        while (true) {
            com.google.android.gms.internal.ads.zzahf zzahfVar = (com.google.android.gms.internal.ads.zzahf) this.zzb.peek();
            if (zzahfVar != null && zzacoVar.zzf() >= zzahfVar.zzb) {
                ((com.google.android.gms.internal.ads.zzahj) this.zzd).zza.zzj(((com.google.android.gms.internal.ads.zzahf) this.zzb.pop()).zza);
                return true;
            }
            int i5 = this.zze;
            if (i5 != 0) {
                if (i5 == 1) {
                }
                com.google.android.gms.internal.ads.zzahi zzahiVar = this.zzd;
                i = this.zzf;
                zzahjVar = (com.google.android.gms.internal.ads.zzahj) zzahiVar;
                zzahmVar = zzahjVar.zza;
                switch (i) {
                    case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                    case 136:
                    case 155:
                    case org.objectweb.asm.Opcodes.IF_ICMPEQ /* 159 */:
                    case org.objectweb.asm.Opcodes.ARETURN /* 176 */:
                    case org.objectweb.asm.Opcodes.PUTSTATIC /* 179 */:
                    case org.objectweb.asm.Opcodes.INVOKEDYNAMIC /* 186 */:
                    case 215:
                    case 231:
                    case 238:
                    case 241:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21938:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        j = this.zzg;
                        if (j <= 8) {
                            throw com.google.android.gms.internal.ads.zzbc.zza("Invalid integer size: " + j, null);
                        }
                        zzahjVar.zza.zzl(i, zzd(zzacoVar, (int) j));
                        this.zze = 0;
                        return true;
                    case 134:
                    case com.google.firebase.FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                    case 21358:
                    case 2274716:
                        j2 = this.zzg;
                        if (j2 <= 2147483647L) {
                            throw com.google.android.gms.internal.ads.zzbc.zza("String element size: " + j2, null);
                        }
                        i2 = (int) j2;
                        if (i2 == 0) {
                            str = "";
                        } else {
                            bArr = new byte[i2];
                            zzacoVar.zzi(bArr, 0, i2);
                            while (i2 > 0) {
                                i3 = i2 - 1;
                                if (bArr[i3] == 0) {
                                    i2 = i3;
                                } else {
                                    str = new java.lang.String(bArr, 0, i2);
                                }
                            }
                            str = new java.lang.String(bArr, 0, i2);
                        }
                        zzahjVar.zza.zzn(i, str);
                        this.zze = 0;
                        return true;
                    case org.objectweb.asm.Opcodes.IF_ICMPNE /* 160 */:
                    case org.objectweb.asm.Opcodes.IF_ACMPNE /* 166 */:
                    case org.objectweb.asm.Opcodes.FRETURN /* 174 */:
                    case org.objectweb.asm.Opcodes.INVOKESPECIAL /* 183 */:
                    case org.objectweb.asm.Opcodes.NEW /* 187 */:
                    case 224:
                    case 225:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        long jZzf = zzacoVar.zzf();
                        this.zzb.push(new com.google.android.gms.internal.ads.zzahf(i, this.zzg + jZzf, null));
                        ((com.google.android.gms.internal.ads.zzahj) this.zzd).zza.zzm(this.zzf, jZzf, this.zzg);
                        this.zze = 0;
                        return true;
                    case org.objectweb.asm.Opcodes.IF_ICMPLT /* 161 */:
                    case org.objectweb.asm.Opcodes.IF_ICMPGT /* 163 */:
                    case org.objectweb.asm.Opcodes.IF_ACMPEQ /* 165 */:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        zzahmVar.zzh(i, (int) this.zzg, zzacoVar);
                        this.zze = 0;
                        return true;
                    case org.objectweb.asm.Opcodes.PUTFIELD /* 181 */:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        j3 = this.zzg;
                        if (j3 == 4 && j3 != 8) {
                            throw com.google.android.gms.internal.ads.zzbc.zza("Invalid float size: " + j3, null);
                        }
                        i4 = (int) j3;
                        jZzd = zzd(zzacoVar, i4);
                        if (i4 == 4) {
                            dLongBitsToDouble = java.lang.Float.intBitsToFloat((int) jZzd);
                        } else {
                            dLongBitsToDouble = java.lang.Double.longBitsToDouble(jZzd);
                        }
                        zzahjVar.zza.zzk(i, dLongBitsToDouble);
                        this.zze = 0;
                        return true;
                    default:
                        zzacoVar.zzk((int) this.zzg);
                        this.zze = 0;
                        break;
                }
            } else {
                long jZzd2 = this.zzc.zzd(zzacoVar, true, false, 4);
                if (jZzd2 == -2) {
                    zzacoVar.zzj();
                    while (true) {
                        zzacoVar.zzh(this.zza, 0, 4);
                        iZzb = com.google.android.gms.internal.ads.zzaho.zzb(this.zza[0]);
                        if (iZzb != -1 && iZzb <= 4) {
                            iZzc = (int) com.google.android.gms.internal.ads.zzaho.zzc(this.zza, iZzb, false);
                            com.google.android.gms.internal.ads.zzahm zzahmVar2 = ((com.google.android.gms.internal.ads.zzahj) this.zzd).zza;
                            if (iZzc != 357149030 && iZzc != 524531317 && iZzc != 475249515) {
                                if (iZzc == 374648427) {
                                    iZzc = 374648427;
                                }
                            }
                        }
                        zzacoVar.zzk(1);
                    }
                    zzacoVar.zzk(iZzb);
                    jZzd2 = iZzc;
                }
                if (jZzd2 == -1) {
                    return false;
                }
                this.zzf = (int) jZzd2;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzd(zzacoVar, false, true, 8);
            this.zze = 2;
            com.google.android.gms.internal.ads.zzahi zzahiVar2 = this.zzd;
            i = this.zzf;
            zzahjVar = (com.google.android.gms.internal.ads.zzahj) zzahiVar2;
            zzahmVar = zzahjVar.zza;
            switch (i) {
                case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                case 136:
                case 155:
                case org.objectweb.asm.Opcodes.IF_ICMPEQ /* 159 */:
                case org.objectweb.asm.Opcodes.ARETURN /* 176 */:
                case org.objectweb.asm.Opcodes.PUTSTATIC /* 179 */:
                case org.objectweb.asm.Opcodes.INVOKEDYNAMIC /* 186 */:
                case 215:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    j = this.zzg;
                    if (j <= 8) {
                        throw com.google.android.gms.internal.ads.zzbc.zza("Invalid integer size: " + j, null);
                    }
                    zzahjVar.zza.zzl(i, zzd(zzacoVar, (int) j));
                    this.zze = 0;
                    return true;
                case 134:
                case com.google.firebase.FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                case 21358:
                case 2274716:
                    j2 = this.zzg;
                    if (j2 <= 2147483647L) {
                        throw com.google.android.gms.internal.ads.zzbc.zza("String element size: " + j2, null);
                    }
                    i2 = (int) j2;
                    if (i2 == 0) {
                        str = "";
                    } else {
                        bArr = new byte[i2];
                        zzacoVar.zzi(bArr, 0, i2);
                        while (i2 > 0) {
                            i3 = i2 - 1;
                            if (bArr[i3] == 0) {
                                i2 = i3;
                            } else {
                                str = new java.lang.String(bArr, 0, i2);
                            }
                        }
                        str = new java.lang.String(bArr, 0, i2);
                    }
                    zzahjVar.zza.zzn(i, str);
                    this.zze = 0;
                    return true;
                case org.objectweb.asm.Opcodes.IF_ICMPNE /* 160 */:
                case org.objectweb.asm.Opcodes.IF_ACMPNE /* 166 */:
                case org.objectweb.asm.Opcodes.FRETURN /* 174 */:
                case org.objectweb.asm.Opcodes.INVOKESPECIAL /* 183 */:
                case org.objectweb.asm.Opcodes.NEW /* 187 */:
                case 224:
                case 225:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    long jZzf2 = zzacoVar.zzf();
                    this.zzb.push(new com.google.android.gms.internal.ads.zzahf(i, this.zzg + jZzf2, null));
                    ((com.google.android.gms.internal.ads.zzahj) this.zzd).zza.zzm(this.zzf, jZzf2, this.zzg);
                    this.zze = 0;
                    return true;
                case org.objectweb.asm.Opcodes.IF_ICMPLT /* 161 */:
                case org.objectweb.asm.Opcodes.IF_ICMPGT /* 163 */:
                case org.objectweb.asm.Opcodes.IF_ACMPEQ /* 165 */:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    zzahmVar.zzh(i, (int) this.zzg, zzacoVar);
                    this.zze = 0;
                    return true;
                case org.objectweb.asm.Opcodes.PUTFIELD /* 181 */:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    j3 = this.zzg;
                    if (j3 == 4) {
                        break;
                    }
                    i4 = (int) j3;
                    jZzd = zzd(zzacoVar, i4);
                    if (i4 == 4) {
                        dLongBitsToDouble = java.lang.Float.intBitsToFloat((int) jZzd);
                    } else {
                        dLongBitsToDouble = java.lang.Double.longBitsToDouble(jZzd);
                    }
                    zzahjVar.zza.zzk(i, dLongBitsToDouble);
                    this.zze = 0;
                    return true;
                default:
                    zzacoVar.zzk((int) this.zzg);
                    this.zze = 0;
                    break;
            }
        }
    }
}
