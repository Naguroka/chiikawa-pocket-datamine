package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkt {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i, com.google.android.gms.internal.measurement.zzks zzksVar) throws com.google.android.gms.internal.measurement.zzmm {
        int iZzh = zzh(bArr, i, zzksVar);
        int i2 = zzksVar.zza;
        if (i2 < 0) {
            throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iZzh) {
            throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzksVar.zzc = com.google.android.gms.internal.measurement.zzld.zzb;
            return iZzh;
        }
        zzksVar.zzc = com.google.android.gms.internal.measurement.zzld.zzj(bArr, iZzh, i2);
        return iZzh + i2;
    }

    static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int zzc(com.google.android.gms.internal.measurement.zzns zznsVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.measurement.zzks zzksVar) throws java.io.IOException {
        java.lang.Object objZze = zznsVar.zze();
        int iZzl = zzl(objZze, zznsVar, bArr, i, i2, i3, zzksVar);
        zznsVar.zzf(objZze);
        zzksVar.zzc = objZze;
        return iZzl;
    }

    static int zzd(com.google.android.gms.internal.measurement.zzns zznsVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzks zzksVar) throws java.io.IOException {
        java.lang.Object objZze = zznsVar.zze();
        int iZzm = zzm(objZze, zznsVar, bArr, i, i2, zzksVar);
        zznsVar.zzf(objZze);
        zzksVar.zzc = objZze;
        return iZzm;
    }

    static int zze(com.google.android.gms.internal.measurement.zzns zznsVar, int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.measurement.zzmj zzmjVar, com.google.android.gms.internal.measurement.zzks zzksVar) throws java.io.IOException {
        int iZzd = zzd(zznsVar, bArr, i2, i3, zzksVar);
        zzmjVar.add(zzksVar.zzc);
        while (iZzd < i3) {
            int iZzh = zzh(bArr, iZzd, zzksVar);
            if (i != zzksVar.zza) {
                break;
            }
            iZzd = zzd(zznsVar, bArr, iZzh, i3, zzksVar);
            zzmjVar.add(zzksVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i, com.google.android.gms.internal.measurement.zzmj zzmjVar, com.google.android.gms.internal.measurement.zzks zzksVar) throws java.io.IOException {
        com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) zzmjVar;
        int iZzh = zzh(bArr, i, zzksVar);
        int i2 = zzksVar.zza + iZzh;
        while (iZzh < i2) {
            iZzh = zzh(bArr, iZzh, zzksVar);
            zzmeVar.zzh(zzksVar.zza);
        }
        if (iZzh == i2) {
            return iZzh;
        }
        throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzh(byte[] bArr, int i, com.google.android.gms.internal.measurement.zzks zzksVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzi(b, bArr, i2, zzksVar);
        }
        zzksVar.zza = b;
        return i2;
    }

    static int zzi(int i, byte[] bArr, int i2, com.google.android.gms.internal.measurement.zzks zzksVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzksVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzksVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzksVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzksVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzksVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzj(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.measurement.zzmj zzmjVar, com.google.android.gms.internal.measurement.zzks zzksVar) {
        com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) zzmjVar;
        int iZzh = zzh(bArr, i2, zzksVar);
        zzmeVar.zzh(zzksVar.zza);
        while (iZzh < i3) {
            int iZzh2 = zzh(bArr, iZzh, zzksVar);
            if (i != zzksVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzksVar);
            zzmeVar.zzh(zzksVar.zza);
        }
        return iZzh;
    }

    static int zzk(byte[] bArr, int i, com.google.android.gms.internal.measurement.zzks zzksVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzksVar.zzb = j;
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
        zzksVar.zzb = j2;
        return i3;
    }

    static int zzl(java.lang.Object obj, com.google.android.gms.internal.measurement.zzns zznsVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.measurement.zzks zzksVar) throws java.io.IOException {
        com.google.android.gms.internal.measurement.zznk zznkVar = (com.google.android.gms.internal.measurement.zznk) zznsVar;
        int i4 = zzksVar.zze + 1;
        zzksVar.zze = i4;
        zzo(i4);
        int iZzc = zznkVar.zzc(obj, bArr, i, i2, i3, zzksVar);
        zzksVar.zze--;
        zzksVar.zzc = obj;
        return iZzc;
    }

    static int zzm(java.lang.Object obj, com.google.android.gms.internal.measurement.zzns zznsVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzks zzksVar) throws java.io.IOException {
        int iZzi = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzi = zzi(i3, bArr, iZzi, zzksVar);
            i3 = zzksVar.zza;
        }
        int i4 = iZzi;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = zzksVar.zze + 1;
        zzksVar.zze = i5;
        zzo(i5);
        int i6 = i3 + i4;
        zznsVar.zzh(obj, bArr, i4, i6, zzksVar);
        zzksVar.zze--;
        zzksVar.zzc = obj;
        return i6;
    }

    static long zzn(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private static void zzo(int i) throws com.google.android.gms.internal.measurement.zzmm {
        if (i >= zzb) {
            throw new com.google.android.gms.internal.measurement.zzmm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    static int zzg(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.measurement.zzof zzofVar, com.google.android.gms.internal.measurement.zzks zzksVar) throws com.google.android.gms.internal.measurement.zzmm {
        if ((i >>> 3) == 0) {
            throw new com.google.android.gms.internal.measurement.zzmm("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzk = zzk(bArr, i2, zzksVar);
            zzofVar.zzj(i, java.lang.Long.valueOf(zzksVar.zzb));
            return iZzk;
        }
        if (i4 == 1) {
            zzofVar.zzj(i, java.lang.Long.valueOf(zzn(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZzh = zzh(bArr, i2, zzksVar);
            int i5 = zzksVar.zza;
            if (i5 < 0) {
                throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iZzh) {
                throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zzofVar.zzj(i, com.google.android.gms.internal.measurement.zzld.zzb);
            } else {
                zzofVar.zzj(i, com.google.android.gms.internal.measurement.zzld.zzj(bArr, iZzh, i5));
            }
            return iZzh + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new com.google.android.gms.internal.measurement.zzmm("Protocol message contained an invalid tag (zero).");
            }
            zzofVar.zzj(i, java.lang.Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        com.google.android.gms.internal.measurement.zzof zzofVarZzf = com.google.android.gms.internal.measurement.zzof.zzf();
        int i7 = zzksVar.zze + 1;
        zzksVar.zze = i7;
        zzo(i7);
        int i8 = 0;
        while (i2 < i3) {
            int iZzh2 = zzh(bArr, i2, zzksVar);
            i8 = zzksVar.zza;
            if (i8 == i6) {
                i2 = iZzh2;
                break;
            }
            i2 = zzg(i8, bArr, iZzh2, i3, zzofVarZzf, zzksVar);
        }
        zzksVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new com.google.android.gms.internal.measurement.zzmm("Failed to parse the message.");
        }
        zzofVar.zzj(i, zzofVarZzf);
        return i2;
    }
}
