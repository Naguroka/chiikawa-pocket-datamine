package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgvy {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i, com.google.android.gms.internal.ads.zzgvx zzgvxVar) throws com.google.android.gms.internal.ads.zzgyg {
        int iZzh = zzh(bArr, i, zzgvxVar);
        int i2 = zzgvxVar.zza;
        if (i2 < 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iZzh) {
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzgvxVar.zzc = com.google.android.gms.internal.ads.zzgwj.zzb;
            return iZzh;
        }
        zzgvxVar.zzc = com.google.android.gms.internal.ads.zzgwj.zzv(bArr, iZzh, i2);
        return iZzh + i2;
    }

    static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int zzc(com.google.android.gms.internal.ads.zzgzv zzgzvVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.ads.zzgvx zzgvxVar) throws java.io.IOException {
        java.lang.Object objZze = zzgzvVar.zze();
        int iZzl = zzl(objZze, zzgzvVar, bArr, i, i2, i3, zzgvxVar);
        zzgzvVar.zzf(objZze);
        zzgvxVar.zzc = objZze;
        return iZzl;
    }

    static int zzd(com.google.android.gms.internal.ads.zzgzv zzgzvVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzgvx zzgvxVar) throws java.io.IOException {
        java.lang.Object objZze = zzgzvVar.zze();
        int iZzm = zzm(objZze, zzgzvVar, bArr, i, i2, zzgvxVar);
        zzgzvVar.zzf(objZze);
        zzgvxVar.zzc = objZze;
        return iZzm;
    }

    static int zze(com.google.android.gms.internal.ads.zzgzv zzgzvVar, int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.ads.zzgyd zzgydVar, com.google.android.gms.internal.ads.zzgvx zzgvxVar) throws java.io.IOException {
        int iZzd = zzd(zzgzvVar, bArr, i2, i3, zzgvxVar);
        zzgydVar.add(zzgvxVar.zzc);
        while (iZzd < i3) {
            int iZzh = zzh(bArr, iZzd, zzgvxVar);
            if (i != zzgvxVar.zza) {
                break;
            }
            iZzd = zzd(zzgzvVar, bArr, iZzh, i3, zzgvxVar);
            zzgydVar.add(zzgvxVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i, com.google.android.gms.internal.ads.zzgyd zzgydVar, com.google.android.gms.internal.ads.zzgvx zzgvxVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) zzgydVar;
        int iZzh = zzh(bArr, i, zzgvxVar);
        int i2 = zzgvxVar.zza + iZzh;
        while (iZzh < i2) {
            iZzh = zzh(bArr, iZzh, zzgvxVar);
            zzgxsVar.zzi(zzgvxVar.zza);
        }
        if (iZzh == i2) {
            return iZzh;
        }
        throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzh(byte[] bArr, int i, com.google.android.gms.internal.ads.zzgvx zzgvxVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzi(b, bArr, i2, zzgvxVar);
        }
        zzgvxVar.zza = b;
        return i2;
    }

    static int zzi(int i, byte[] bArr, int i2, com.google.android.gms.internal.ads.zzgvx zzgvxVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzgvxVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzgvxVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzgvxVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzgvxVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzgvxVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzj(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.ads.zzgyd zzgydVar, com.google.android.gms.internal.ads.zzgvx zzgvxVar) {
        com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) zzgydVar;
        int iZzh = zzh(bArr, i2, zzgvxVar);
        zzgxsVar.zzi(zzgvxVar.zza);
        while (iZzh < i3) {
            int iZzh2 = zzh(bArr, iZzh, zzgvxVar);
            if (i != zzgvxVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzgvxVar);
            zzgxsVar.zzi(zzgvxVar.zza);
        }
        return iZzh;
    }

    static int zzk(byte[] bArr, int i, com.google.android.gms.internal.ads.zzgvx zzgvxVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzgvxVar.zzb = j;
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
        zzgvxVar.zzb = j2;
        return i3;
    }

    static int zzl(java.lang.Object obj, com.google.android.gms.internal.ads.zzgzv zzgzvVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.ads.zzgvx zzgvxVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzgzf zzgzfVar = (com.google.android.gms.internal.ads.zzgzf) zzgzvVar;
        int i4 = zzgvxVar.zze + 1;
        zzgvxVar.zze = i4;
        zzo(i4);
        int iZzc = zzgzfVar.zzc(obj, bArr, i, i2, i3, zzgvxVar);
        zzgvxVar.zze--;
        zzgvxVar.zzc = obj;
        return iZzc;
    }

    static int zzm(java.lang.Object obj, com.google.android.gms.internal.ads.zzgzv zzgzvVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzgvx zzgvxVar) throws java.io.IOException {
        int iZzi = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzi = zzi(i3, bArr, iZzi, zzgvxVar);
            i3 = zzgvxVar.zza;
        }
        int i4 = iZzi;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = zzgvxVar.zze + 1;
        zzgvxVar.zze = i5;
        zzo(i5);
        int i6 = i3 + i4;
        zzgzvVar.zzi(obj, bArr, i4, i6, zzgvxVar);
        zzgvxVar.zze--;
        zzgvxVar.zzc = obj;
        return i6;
    }

    static long zzn(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private static void zzo(int i) throws com.google.android.gms.internal.ads.zzgyg {
        if (i >= zzb) {
            throw new com.google.android.gms.internal.ads.zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    static int zzg(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.ads.zzhai zzhaiVar, com.google.android.gms.internal.ads.zzgvx zzgvxVar) throws com.google.android.gms.internal.ads.zzgyg {
        if ((i >>> 3) == 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzk = zzk(bArr, i2, zzgvxVar);
            zzhaiVar.zzj(i, java.lang.Long.valueOf(zzgvxVar.zzb));
            return iZzk;
        }
        if (i4 == 1) {
            zzhaiVar.zzj(i, java.lang.Long.valueOf(zzn(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZzh = zzh(bArr, i2, zzgvxVar);
            int i5 = zzgvxVar.zza;
            if (i5 < 0) {
                throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iZzh) {
                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zzhaiVar.zzj(i, com.google.android.gms.internal.ads.zzgwj.zzb);
            } else {
                zzhaiVar.zzj(i, com.google.android.gms.internal.ads.zzgwj.zzv(bArr, iZzh, i5));
            }
            return iZzh + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new com.google.android.gms.internal.ads.zzgyg("Protocol message contained an invalid tag (zero).");
            }
            zzhaiVar.zzj(i, java.lang.Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        com.google.android.gms.internal.ads.zzhai zzhaiVarZzf = com.google.android.gms.internal.ads.zzhai.zzf();
        int i7 = zzgvxVar.zze + 1;
        zzgvxVar.zze = i7;
        zzo(i7);
        int i8 = 0;
        while (i2 < i3) {
            int iZzh2 = zzh(bArr, i2, zzgvxVar);
            i8 = zzgvxVar.zza;
            if (i8 == i6) {
                i2 = iZzh2;
                break;
            }
            i2 = zzg(i8, bArr, iZzh2, i3, zzhaiVarZzf, zzgvxVar);
        }
        zzgvxVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new com.google.android.gms.internal.ads.zzgyg("Failed to parse the message.");
        }
        zzhaiVar.zzj(i, zzhaiVarZzf);
        return i2;
    }
}
