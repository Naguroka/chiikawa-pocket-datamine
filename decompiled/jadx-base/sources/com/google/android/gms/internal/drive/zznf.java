package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zznf {
    private static final com.google.android.gms.internal.drive.zznh zzwt;

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzay(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzc(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean zzd(byte[] bArr) {
        return zzwt.zze(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzr(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static boolean zze(byte[] bArr, int i, int i2) {
        return zzwt.zze(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzf(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return zzay(b);
        }
        if (i3 == 1) {
            return zzr(b, bArr[i]);
        }
        if (i3 == 2) {
            return zzc(b, bArr[i], bArr[i + 1]);
        }
        throw new java.lang.AssertionError();
    }

    static int zza(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char cCharAt2 = charSequence.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(charSequence, i2) < 65536) {
                                throw new com.google.android.gms.internal.drive.zznj(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
                break;
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(54).append("UTF-8 length does not fit in int: ").append(((long) i3) + 4294967296L).toString());
    }

    static int zza(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2) {
        return zzwt.zzb(charSequence, bArr, i, i2);
    }

    static java.lang.String zzg(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.drive.zzkq {
        return zzwt.zzg(bArr, i, i2);
    }

    static {
        com.google.android.gms.internal.drive.zznh zzniVar;
        if ((com.google.android.gms.internal.drive.zznd.zzfd() && com.google.android.gms.internal.drive.zznd.zzfe()) && !com.google.android.gms.internal.drive.zzix.zzbr()) {
            zzniVar = new com.google.android.gms.internal.drive.zznk();
        } else {
            zzniVar = new com.google.android.gms.internal.drive.zzni();
        }
        zzwt = zzniVar;
    }
}
