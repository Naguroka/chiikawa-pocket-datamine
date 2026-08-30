package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzhat {
    private static final com.google.android.gms.internal.ads.zzhaq zza;

    static {
        if (com.google.android.gms.internal.ads.zzhao.zzA() && com.google.android.gms.internal.ads.zzhao.zzB()) {
            int i = com.google.android.gms.internal.ads.zzgvw.zza;
        }
        zza = new com.google.android.gms.internal.ads.zzhar();
    }

    static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return zzj(b, bArr[i]);
        }
        if (i3 == 2) {
            return zzk(b, bArr[i], bArr[i + 1]);
        }
        throw new java.lang.AssertionError();
    }

    static int zzd(java.lang.String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char cCharAt;
        int length = str.length();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= length || (i5 = i6 + i) >= i3 || (cCharAt = str.charAt(i6)) >= 128) {
                break;
            }
            bArr[i5] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 128 && i7 < i3) {
                bArr[i7] = (byte) cCharAt2;
                i7++;
            } else if (cCharAt2 < 2048 && i7 <= i3 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
                i7 = i8 + 1;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i7 > i3 - 3) {
                    if (i7 > i3 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i4 = i6 + 1) == str.length() || !java.lang.Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
                            throw new com.google.android.gms.internal.ads.zzhas(i6, length);
                        }
                        throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i7);
                    }
                    int i9 = i6 + 1;
                    if (i9 != str.length()) {
                        char cCharAt3 = str.charAt(i9);
                        if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i10 = i7 + 1;
                            int i11 = i10 + 1;
                            int i12 = i11 + 1;
                            int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
                            bArr[i10] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i11] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 = i12 + 1;
                            bArr[i12] = (byte) ((codePoint & 63) | 128);
                            i6 = i9;
                        } else {
                            i6 = i9;
                        }
                    }
                    throw new com.google.android.gms.internal.ads.zzhas(i6 - 1, length);
                }
                int i13 = i7 + 1;
                int i14 = i13 + 1;
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i13] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i14] = (byte) ((cCharAt2 & '?') | 128);
                i7 = i14 + 1;
            }
            i6++;
        }
        return i7;
    }

    static int zze(java.lang.String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(str, i2) < 65536) {
                                throw new com.google.android.gms.internal.ads.zzhas(i2, length2);
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
        throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    static int zzf(int i, byte[] bArr, int i2, int i3) {
        return zza.zza(i, bArr, i2, i3);
    }

    static java.lang.String zzg(java.nio.ByteBuffer byteBuffer, int i, int i2) throws com.google.android.gms.internal.ads.zzgyg {
        com.google.android.gms.internal.ads.zzhaq zzhaqVar = zza;
        if (byteBuffer.hasArray()) {
            return zzhaqVar.zzb(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        return byteBuffer.isDirect() ? com.google.android.gms.internal.ads.zzhar.zzc(byteBuffer, i, i2) : com.google.android.gms.internal.ads.zzhaq.zzc(byteBuffer, i, i2);
    }

    static java.lang.String zzh(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzgyg {
        return zza.zzb(bArr, i, i2);
    }

    static boolean zzi(byte[] bArr, int i, int i2) {
        return zza.zza(0, bArr, i, i2) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
