package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zziy {
    static int zza(byte[] bArr, int i, com.google.android.gms.internal.drive.zziz zzizVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zza(b, bArr, i2, zzizVar);
        }
        zzizVar.zznk = b;
        return i2;
    }

    static int zza(int i, byte[] bArr, int i2, com.google.android.gms.internal.drive.zziz zzizVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzizVar.zznk = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzizVar.zznk = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzizVar.zznk = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzizVar.zznk = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzizVar.zznk = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzb(byte[] bArr, int i, com.google.android.gms.internal.drive.zziz zzizVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzizVar.zznl = j;
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
            b = b2;
            i3 = i5;
        }
        zzizVar.zznl = j2;
        return i3;
    }

    static int zza(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static long zzb(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static double zzc(byte[] bArr, int i) {
        return java.lang.Double.longBitsToDouble(zzb(bArr, i));
    }

    static float zzd(byte[] bArr, int i) {
        return java.lang.Float.intBitsToFloat(zza(bArr, i));
    }

    static int zzc(byte[] bArr, int i, com.google.android.gms.internal.drive.zziz zzizVar) throws com.google.android.gms.internal.drive.zzkq {
        int iZza = zza(bArr, i, zzizVar);
        int i2 = zzizVar.zznk;
        if (i2 < 0) {
            throw com.google.android.gms.internal.drive.zzkq.zzdj();
        }
        if (i2 == 0) {
            zzizVar.zznm = "";
            return iZza;
        }
        zzizVar.zznm = new java.lang.String(bArr, iZza, i2, com.google.android.gms.internal.drive.zzkm.UTF_8);
        return iZza + i2;
    }

    static int zzd(byte[] bArr, int i, com.google.android.gms.internal.drive.zziz zzizVar) throws com.google.android.gms.internal.drive.zzkq {
        int iZza = zza(bArr, i, zzizVar);
        int i2 = zzizVar.zznk;
        if (i2 < 0) {
            throw com.google.android.gms.internal.drive.zzkq.zzdj();
        }
        if (i2 == 0) {
            zzizVar.zznm = "";
            return iZza;
        }
        zzizVar.zznm = com.google.android.gms.internal.drive.zznf.zzg(bArr, iZza, i2);
        return iZza + i2;
    }

    static int zze(byte[] bArr, int i, com.google.android.gms.internal.drive.zziz zzizVar) throws com.google.android.gms.internal.drive.zzkq {
        int iZza = zza(bArr, i, zzizVar);
        int i2 = zzizVar.zznk;
        if (i2 < 0) {
            throw com.google.android.gms.internal.drive.zzkq.zzdj();
        }
        if (i2 > bArr.length - iZza) {
            throw com.google.android.gms.internal.drive.zzkq.zzdi();
        }
        if (i2 == 0) {
            zzizVar.zznm = com.google.android.gms.internal.drive.zzjc.zznq;
            return iZza;
        }
        zzizVar.zznm = com.google.android.gms.internal.drive.zzjc.zzb(bArr, iZza, i2);
        return iZza + i2;
    }

    static int zza(com.google.android.gms.internal.drive.zzmf zzmfVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        int iZza = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZza = zza(i3, bArr, iZza, zzizVar);
            i3 = zzizVar.zznk;
        }
        int i4 = iZza;
        if (i3 < 0 || i3 > i2 - i4) {
            throw com.google.android.gms.internal.drive.zzkq.zzdi();
        }
        java.lang.Object objNewInstance = zzmfVar.newInstance();
        int i5 = i3 + i4;
        zzmfVar.zza(objNewInstance, bArr, i4, i5, zzizVar);
        zzmfVar.zzd(objNewInstance);
        zzizVar.zznm = objNewInstance;
        return i5;
    }

    static int zza(com.google.android.gms.internal.drive.zzmf zzmfVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        com.google.android.gms.internal.drive.zzlu zzluVar = (com.google.android.gms.internal.drive.zzlu) zzmfVar;
        java.lang.Object objNewInstance = zzluVar.newInstance();
        int iZza = zzluVar.zza(objNewInstance, bArr, i, i2, i3, zzizVar);
        zzluVar.zzd(objNewInstance);
        zzizVar.zznm = objNewInstance;
        return iZza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.drive.zzkp<?> zzkpVar, com.google.android.gms.internal.drive.zziz zzizVar) {
        com.google.android.gms.internal.drive.zzkl zzklVar = (com.google.android.gms.internal.drive.zzkl) zzkpVar;
        int iZza = zza(bArr, i2, zzizVar);
        zzklVar.zzam(zzizVar.zznk);
        while (iZza < i3) {
            int iZza2 = zza(bArr, iZza, zzizVar);
            if (i != zzizVar.zznk) {
                break;
            }
            iZza = zza(bArr, iZza2, zzizVar);
            zzklVar.zzam(zzizVar.zznk);
        }
        return iZza;
    }

    static int zza(byte[] bArr, int i, com.google.android.gms.internal.drive.zzkp<?> zzkpVar, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        com.google.android.gms.internal.drive.zzkl zzklVar = (com.google.android.gms.internal.drive.zzkl) zzkpVar;
        int iZza = zza(bArr, i, zzizVar);
        int i2 = zzizVar.zznk + iZza;
        while (iZza < i2) {
            iZza = zza(bArr, iZza, zzizVar);
            zzklVar.zzam(zzizVar.zznk);
        }
        if (iZza == i2) {
            return iZza;
        }
        throw com.google.android.gms.internal.drive.zzkq.zzdi();
    }

    static int zza(com.google.android.gms.internal.drive.zzmf<?> zzmfVar, int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.drive.zzkp<?> zzkpVar, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        int iZza = zza(zzmfVar, bArr, i2, i3, zzizVar);
        zzkpVar.add(zzizVar.zznm);
        while (iZza < i3) {
            int iZza2 = zza(bArr, iZza, zzizVar);
            if (i != zzizVar.zznk) {
                break;
            }
            iZza = zza(zzmfVar, bArr, iZza2, i3, zzizVar);
            zzkpVar.add(zzizVar.zznm);
        }
        return iZza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.drive.zzmy zzmyVar, com.google.android.gms.internal.drive.zziz zzizVar) throws com.google.android.gms.internal.drive.zzkq {
        if ((i >>> 3) == 0) {
            throw com.google.android.gms.internal.drive.zzkq.zzdk();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzb = zzb(bArr, i2, zzizVar);
            zzmyVar.zzb(i, java.lang.Long.valueOf(zzizVar.zznl));
            return iZzb;
        }
        if (i4 == 1) {
            zzmyVar.zzb(i, java.lang.Long.valueOf(zzb(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZza = zza(bArr, i2, zzizVar);
            int i5 = zzizVar.zznk;
            if (i5 < 0) {
                throw com.google.android.gms.internal.drive.zzkq.zzdj();
            }
            if (i5 > bArr.length - iZza) {
                throw com.google.android.gms.internal.drive.zzkq.zzdi();
            }
            if (i5 == 0) {
                zzmyVar.zzb(i, com.google.android.gms.internal.drive.zzjc.zznq);
            } else {
                zzmyVar.zzb(i, com.google.android.gms.internal.drive.zzjc.zzb(bArr, iZza, i5));
            }
            return iZza + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                zzmyVar.zzb(i, java.lang.Integer.valueOf(zza(bArr, i2)));
                return i2 + 4;
            }
            throw com.google.android.gms.internal.drive.zzkq.zzdk();
        }
        com.google.android.gms.internal.drive.zzmy zzmyVarZzfb = com.google.android.gms.internal.drive.zzmy.zzfb();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (i2 < i3) {
            int iZza2 = zza(bArr, i2, zzizVar);
            int i8 = zzizVar.zznk;
            i7 = i8;
            if (i8 == i6) {
                i2 = iZza2;
                break;
            }
            int iZza3 = zza(i7, bArr, iZza2, i3, zzmyVarZzfb, zzizVar);
            i7 = i8;
            i2 = iZza3;
        }
        if (i2 > i3 || i7 != i6) {
            throw com.google.android.gms.internal.drive.zzkq.zzdm();
        }
        zzmyVar.zzb(i, zzmyVarZzfb);
        return i2;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.drive.zziz zzizVar) throws com.google.android.gms.internal.drive.zzkq {
        if ((i >>> 3) == 0) {
            throw com.google.android.gms.internal.drive.zzkq.zzdk();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzb(bArr, i2, zzizVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zza(bArr, i2, zzizVar) + zzizVar.zznk;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw com.google.android.gms.internal.drive.zzkq.zzdk();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zza(bArr, i2, zzizVar);
            i6 = zzizVar.zznk;
            if (i6 == i5) {
                break;
            }
            i2 = zza(i6, bArr, i2, i3, zzizVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw com.google.android.gms.internal.drive.zzkq.zzdm();
        }
        return i2;
    }
}
