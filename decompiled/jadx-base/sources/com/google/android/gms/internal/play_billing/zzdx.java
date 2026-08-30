package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdx {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i, com.google.android.gms.internal.play_billing.zzdw zzdwVar) throws com.google.android.gms.internal.play_billing.zzfq {
        int iZzi = zzi(bArr, i, zzdwVar);
        int i2 = zzdwVar.zza;
        if (i2 < 0) {
            throw new com.google.android.gms.internal.play_billing.zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iZzi) {
            throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzdwVar.zzc = com.google.android.gms.internal.play_billing.zzei.zzb;
            return iZzi;
        }
        zzdwVar.zzc = com.google.android.gms.internal.play_billing.zzei.zzj(bArr, iZzi, i2);
        return iZzi + i2;
    }

    static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int zzc(com.google.android.gms.internal.play_billing.zzgv zzgvVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.play_billing.zzdw zzdwVar) throws java.io.IOException {
        java.lang.Object objZze = zzgvVar.zze();
        int iZzm = zzm(objZze, zzgvVar, bArr, i, i2, i3, zzdwVar);
        zzgvVar.zzf(objZze);
        zzdwVar.zzc = objZze;
        return iZzm;
    }

    static int zzd(com.google.android.gms.internal.play_billing.zzgv zzgvVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.play_billing.zzdw zzdwVar) throws java.io.IOException {
        java.lang.Object objZze = zzgvVar.zze();
        int iZzn = zzn(objZze, zzgvVar, bArr, i, i2, zzdwVar);
        zzgvVar.zzf(objZze);
        zzdwVar.zzc = objZze;
        return iZzn;
    }

    static int zze(com.google.android.gms.internal.play_billing.zzgv zzgvVar, int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.play_billing.zzfn zzfnVar, com.google.android.gms.internal.play_billing.zzdw zzdwVar) throws java.io.IOException {
        int iZzd = zzd(zzgvVar, bArr, i2, i3, zzdwVar);
        zzfnVar.add(zzdwVar.zzc);
        while (iZzd < i3) {
            int iZzi = zzi(bArr, iZzd, zzdwVar);
            if (i != zzdwVar.zza) {
                break;
            }
            iZzd = zzd(zzgvVar, bArr, iZzi, i3, zzdwVar);
            zzfnVar.add(zzdwVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i, com.google.android.gms.internal.play_billing.zzfn zzfnVar, com.google.android.gms.internal.play_billing.zzdw zzdwVar) throws java.io.IOException {
        com.google.android.gms.internal.play_billing.zzfj zzfjVar = (com.google.android.gms.internal.play_billing.zzfj) zzfnVar;
        int iZzi = zzi(bArr, i, zzdwVar);
        int i2 = zzdwVar.zza + iZzi;
        while (iZzi < i2) {
            iZzi = zzi(bArr, iZzi, zzdwVar);
            zzfjVar.zzg(zzdwVar.zza);
        }
        if (iZzi == i2) {
            return iZzi;
        }
        throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzg(byte[] bArr, int i, com.google.android.gms.internal.play_billing.zzdw zzdwVar) throws com.google.android.gms.internal.play_billing.zzfq {
        int iZzi = zzi(bArr, i, zzdwVar);
        int i2 = zzdwVar.zza;
        if (i2 < 0) {
            throw new com.google.android.gms.internal.play_billing.zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            zzdwVar.zzc = "";
            return iZzi;
        }
        int i3 = com.google.android.gms.internal.play_billing.zzhr.zza;
        int length = bArr.length;
        if ((((length - iZzi) - i2) | iZzi | i2) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(iZzi), java.lang.Integer.valueOf(i2)));
        }
        int i4 = iZzi + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (iZzi < i4) {
            byte b = bArr[iZzi];
            if (!com.google.android.gms.internal.play_billing.zzhp.zzd(b)) {
                break;
            }
            iZzi++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (iZzi < i4) {
            int i6 = iZzi + 1;
            byte b2 = bArr[iZzi];
            if (com.google.android.gms.internal.play_billing.zzhp.zzd(b2)) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b2;
                iZzi = i6;
                while (true) {
                    i5 = i7;
                    if (iZzi >= i4) {
                        break;
                    }
                    byte b3 = bArr[iZzi];
                    if (!com.google.android.gms.internal.play_billing.zzhp.zzd(b3)) {
                        break;
                    }
                    iZzi++;
                    i7 = i5 + 1;
                    cArr[i5] = (char) b3;
                }
            } else if (b2 < -32) {
                if (i6 >= i4) {
                    throw new com.google.android.gms.internal.play_billing.zzfq("Protocol message had invalid UTF-8.");
                }
                com.google.android.gms.internal.play_billing.zzhp.zzc(b2, bArr[i6], cArr, i5);
                i5++;
                iZzi = i6 + 1;
            } else if (b2 < -16) {
                if (i6 >= i4 - 1) {
                    throw new com.google.android.gms.internal.play_billing.zzfq("Protocol message had invalid UTF-8.");
                }
                int i8 = i6 + 1;
                com.google.android.gms.internal.play_billing.zzhp.zzb(b2, bArr[i6], bArr[i8], cArr, i5);
                i5++;
                iZzi = i8 + 1;
            } else {
                if (i6 >= i4 - 2) {
                    throw new com.google.android.gms.internal.play_billing.zzfq("Protocol message had invalid UTF-8.");
                }
                int i9 = i6 + 1;
                byte b4 = bArr[i6];
                int i10 = i9 + 1;
                com.google.android.gms.internal.play_billing.zzhp.zza(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                i5 += 2;
                iZzi = i10 + 1;
            }
        }
        zzdwVar.zzc = new java.lang.String(cArr, 0, i5);
        return i4;
    }

    static int zzi(byte[] bArr, int i, com.google.android.gms.internal.play_billing.zzdw zzdwVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzj(b, bArr, i2, zzdwVar);
        }
        zzdwVar.zza = b;
        return i2;
    }

    static int zzj(int i, byte[] bArr, int i2, com.google.android.gms.internal.play_billing.zzdw zzdwVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzdwVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzdwVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzdwVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzdwVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzdwVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzk(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.play_billing.zzfn zzfnVar, com.google.android.gms.internal.play_billing.zzdw zzdwVar) {
        com.google.android.gms.internal.play_billing.zzfj zzfjVar = (com.google.android.gms.internal.play_billing.zzfj) zzfnVar;
        int iZzi = zzi(bArr, i2, zzdwVar);
        zzfjVar.zzg(zzdwVar.zza);
        while (iZzi < i3) {
            int iZzi2 = zzi(bArr, iZzi, zzdwVar);
            if (i != zzdwVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzdwVar);
            zzfjVar.zzg(zzdwVar.zza);
        }
        return iZzi;
    }

    static int zzl(byte[] bArr, int i, com.google.android.gms.internal.play_billing.zzdw zzdwVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzdwVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            i3 = i5;
            b = b2;
        }
        zzdwVar.zzb = j2;
        return i3;
    }

    static int zzm(java.lang.Object obj, com.google.android.gms.internal.play_billing.zzgv zzgvVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.play_billing.zzdw zzdwVar) throws java.io.IOException {
        com.google.android.gms.internal.play_billing.zzgo zzgoVar = (com.google.android.gms.internal.play_billing.zzgo) zzgvVar;
        int i4 = zzdwVar.zze + 1;
        zzdwVar.zze = i4;
        zzp(i4);
        int iZzc = zzgoVar.zzc(obj, bArr, i, i2, i3, zzdwVar);
        zzdwVar.zze--;
        zzdwVar.zzc = obj;
        return iZzc;
    }

    static int zzn(java.lang.Object obj, com.google.android.gms.internal.play_billing.zzgv zzgvVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.play_billing.zzdw zzdwVar) throws java.io.IOException {
        int iZzj = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzj = zzj(i3, bArr, iZzj, zzdwVar);
            i3 = zzdwVar.zza;
        }
        int i4 = iZzj;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = zzdwVar.zze + 1;
        zzdwVar.zze = i5;
        zzp(i5);
        int i6 = i3 + i4;
        zzgvVar.zzh(obj, bArr, i4, i6, zzdwVar);
        zzdwVar.zze--;
        zzdwVar.zzc = obj;
        return i6;
    }

    static long zzo(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private static void zzp(int i) throws com.google.android.gms.internal.play_billing.zzfq {
        if (i >= zzb) {
            throw new com.google.android.gms.internal.play_billing.zzfq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    static int zzh(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.play_billing.zzhi zzhiVar, com.google.android.gms.internal.play_billing.zzdw zzdwVar) throws com.google.android.gms.internal.play_billing.zzfq {
        if ((i >>> 3) == 0) {
            throw new com.google.android.gms.internal.play_billing.zzfq("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzl = zzl(bArr, i2, zzdwVar);
            zzhiVar.zzj(i, java.lang.Long.valueOf(zzdwVar.zzb));
            return iZzl;
        }
        if (i4 == 1) {
            zzhiVar.zzj(i, java.lang.Long.valueOf(zzo(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZzi = zzi(bArr, i2, zzdwVar);
            int i5 = zzdwVar.zza;
            if (i5 < 0) {
                throw new com.google.android.gms.internal.play_billing.zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iZzi) {
                throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zzhiVar.zzj(i, com.google.android.gms.internal.play_billing.zzei.zzb);
            } else {
                zzhiVar.zzj(i, com.google.android.gms.internal.play_billing.zzei.zzj(bArr, iZzi, i5));
            }
            return iZzi + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new com.google.android.gms.internal.play_billing.zzfq("Protocol message contained an invalid tag (zero).");
            }
            zzhiVar.zzj(i, java.lang.Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        com.google.android.gms.internal.play_billing.zzhi zzhiVarZzf = com.google.android.gms.internal.play_billing.zzhi.zzf();
        int i7 = zzdwVar.zze + 1;
        zzdwVar.zze = i7;
        zzp(i7);
        int i8 = 0;
        while (i2 < i3) {
            int iZzi2 = zzi(bArr, i2, zzdwVar);
            i8 = zzdwVar.zza;
            if (i8 == i6) {
                i2 = iZzi2;
                break;
            }
            i2 = zzh(i8, bArr, iZzi2, i3, zzhiVarZzf, zzdwVar);
        }
        zzdwVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new com.google.android.gms.internal.play_billing.zzfq("Failed to parse the message.");
        }
        zzhiVar.zzj(i, zzhiVarZzf);
        return i2;
    }
}
