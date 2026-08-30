package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzni extends com.google.android.gms.internal.drive.zznh {
    zzni() {
    }

    @Override // com.google.android.gms.internal.drive.zznh
    final int zzb(int i, byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b < 0) {
                if (b < -32) {
                    if (i4 >= i3) {
                        return b;
                    }
                    if (b >= -62) {
                        i2 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i4 < i3 - 2) {
                        int i5 = i4 + 1;
                        byte b2 = bArr[i4];
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                            int i6 = i5 + 1;
                            if (bArr[i5] <= -65) {
                                i4 = i6 + 1;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    return com.google.android.gms.internal.drive.zznf.zzf(bArr, i4, i3);
                }
                if (i4 < i3 - 1) {
                    int i7 = i4 + 1;
                    byte b3 = bArr[i4];
                    if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                        i2 = i7 + 1;
                        if (bArr[i7] > -65) {
                        }
                    }
                    return -1;
                }
                return com.google.android.gms.internal.drive.zznf.zzf(bArr, i4, i3);
            }
            i2 = i4;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.drive.zznh
    final java.lang.String zzg(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.drive.zzkq {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!com.google.android.gms.internal.drive.zzng.zzd(b)) {
                break;
            }
            i++;
            com.google.android.gms.internal.drive.zzng.zza(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (com.google.android.gms.internal.drive.zzng.zzd(b2)) {
                int i7 = i5 + 1;
                com.google.android.gms.internal.drive.zzng.zza(b2, cArr, i5);
                while (i6 < i3) {
                    byte b3 = bArr[i6];
                    if (!com.google.android.gms.internal.drive.zzng.zzd(b3)) {
                        break;
                    }
                    i6++;
                    com.google.android.gms.internal.drive.zzng.zza(b3, cArr, i7);
                    i7++;
                }
                i = i6;
                i5 = i7;
            } else if (com.google.android.gms.internal.drive.zzng.zze(b2)) {
                if (i6 < i3) {
                    com.google.android.gms.internal.drive.zzng.zza(b2, bArr[i6], cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else {
                    throw com.google.android.gms.internal.drive.zzkq.zzdn();
                }
            } else if (com.google.android.gms.internal.drive.zzng.zzf(b2)) {
                if (i6 < i3 - 1) {
                    int i8 = i6 + 1;
                    com.google.android.gms.internal.drive.zzng.zza(b2, bArr[i6], bArr[i8], cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else {
                    throw com.google.android.gms.internal.drive.zzkq.zzdn();
                }
            } else {
                if (i6 >= i3 - 2) {
                    throw com.google.android.gms.internal.drive.zzkq.zzdn();
                }
                int i9 = i6 + 1;
                byte b4 = bArr[i6];
                int i10 = i9 + 1;
                com.google.android.gms.internal.drive.zzng.zza(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                i = i10 + 1;
                i5 = i5 + 1 + 1;
            }
        }
        return new java.lang.String(cArr, 0, i5);
    }

    @Override // com.google.android.gms.internal.drive.zznh
    final int zzb(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char cCharAt;
        int length = charSequence.length();
        int i6 = i2 + i;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i) < i6 && (cCharAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) cCharAt;
            i7++;
        }
        if (i7 == length) {
            return i + length;
        }
        int i8 = i + i7;
        while (i7 < length) {
            char cCharAt2 = charSequence.charAt(i7);
            if (cCharAt2 >= 128 || i8 >= i6) {
                if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i8 > i6 - 3) {
                        if (i8 <= i6 - 4) {
                            int i10 = i7 + 1;
                            if (i10 != charSequence.length()) {
                                char cCharAt3 = charSequence.charAt(i10);
                                if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i11 = i8 + 1;
                                    bArr[i8] = (byte) ((codePoint >>> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
                                    int i12 = i11 + 1;
                                    bArr[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i13 = i12 + 1;
                                    bArr[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i8 = i13 + 1;
                                    bArr[i13] = (byte) ((codePoint & 63) | 128);
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new com.google.android.gms.internal.drive.zznj(i7 - 1, length);
                        }
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !java.lang.Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                            throw new com.google.android.gms.internal.drive.zznj(i7, length);
                        }
                        throw new java.lang.ArrayIndexOutOfBoundsException(new java.lang.StringBuilder(37).append("Failed writing ").append(cCharAt2).append(" at index ").append(i8).toString());
                    }
                    int i14 = i8 + 1;
                    bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i3 = i15 + 1;
                    bArr[i15] = (byte) ((cCharAt2 & '?') | 128);
                }
                i7++;
            } else {
                i3 = i8 + 1;
                bArr[i8] = (byte) cCharAt2;
            }
            i8 = i3;
            i7++;
        }
        return i8;
    }
}
