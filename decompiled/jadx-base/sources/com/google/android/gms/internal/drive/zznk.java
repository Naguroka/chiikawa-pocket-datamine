package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zznk extends com.google.android.gms.internal.drive.zznh {
    zznk() {
    }

    @Override // com.google.android.gms.internal.drive.zznh
    final int zzb(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if ((i2 | i3 | (bArr.length - i3)) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("Array length=%d, index=%d, limit=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
        }
        long j = i2;
        int i5 = (int) (((long) i3) - j);
        if (i5 >= 16) {
            i4 = 0;
            long j2 = j;
            while (true) {
                if (i4 >= i5) {
                    i4 = i5;
                    break;
                }
                long j3 = j2 + 1;
                if (com.google.android.gms.internal.drive.zznd.zza(bArr, j2) < 0) {
                    break;
                }
                i4++;
                j2 = j3;
            }
        } else {
            i4 = 0;
        }
        int i6 = i5 - i4;
        long j4 = j + ((long) i4);
        while (true) {
            byte b = 0;
            while (i6 > 0) {
                long j5 = j4 + 1;
                byte bZza = com.google.android.gms.internal.drive.zznd.zza(bArr, j4);
                if (bZza < 0) {
                    b = bZza;
                    j4 = j5;
                    break;
                }
                i6--;
                b = bZza;
                j4 = j5;
            }
            if (i6 == 0) {
                return 0;
            }
            int i7 = i6 - 1;
            if (b < -32) {
                if (i7 == 0) {
                    return b;
                }
                i6 = i7 - 1;
                if (b >= -62) {
                    long j6 = j4 + 1;
                    if (com.google.android.gms.internal.drive.zznd.zza(bArr, j4) <= -65) {
                        j4 = j6;
                    }
                }
                return -1;
            }
            if (b >= -16) {
                if (i7 < 3) {
                    return zza(bArr, b, j4, i7);
                }
                i6 = i7 - 3;
                long j7 = j4 + 1;
                byte bZza2 = com.google.android.gms.internal.drive.zznd.zza(bArr, j4);
                if (bZza2 <= -65 && (((b << 28) + (bZza2 + 112)) >> 30) == 0) {
                    long j8 = j7 + 1;
                    if (com.google.android.gms.internal.drive.zznd.zza(bArr, j7) <= -65) {
                        j4 = j8 + 1;
                        if (com.google.android.gms.internal.drive.zznd.zza(bArr, j8) > -65) {
                        }
                    }
                }
                return -1;
            }
            if (i7 < 2) {
                return zza(bArr, b, j4, i7);
            }
            i6 = i7 - 2;
            long j9 = j4 + 1;
            byte bZza3 = com.google.android.gms.internal.drive.zznd.zza(bArr, j4);
            if (bZza3 <= -65 && ((b != -32 || bZza3 >= -96) && (b != -19 || bZza3 < -96))) {
                j4 = j9 + 1;
                if (com.google.android.gms.internal.drive.zznd.zza(bArr, j9) > -65) {
                }
            }
            return -1;
        }
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
            byte bZza = com.google.android.gms.internal.drive.zznd.zza(bArr, i);
            if (!com.google.android.gms.internal.drive.zzng.zzd(bZza)) {
                break;
            }
            i++;
            com.google.android.gms.internal.drive.zzng.zza(bZza, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte bZza2 = com.google.android.gms.internal.drive.zznd.zza(bArr, i);
            if (com.google.android.gms.internal.drive.zzng.zzd(bZza2)) {
                int i7 = i5 + 1;
                com.google.android.gms.internal.drive.zzng.zza(bZza2, cArr, i5);
                while (i6 < i3) {
                    byte bZza3 = com.google.android.gms.internal.drive.zznd.zza(bArr, i6);
                    if (!com.google.android.gms.internal.drive.zzng.zzd(bZza3)) {
                        break;
                    }
                    i6++;
                    com.google.android.gms.internal.drive.zzng.zza(bZza3, cArr, i7);
                    i7++;
                }
                i = i6;
                i5 = i7;
            } else if (com.google.android.gms.internal.drive.zzng.zze(bZza2)) {
                if (i6 < i3) {
                    com.google.android.gms.internal.drive.zzng.zza(bZza2, com.google.android.gms.internal.drive.zznd.zza(bArr, i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else {
                    throw com.google.android.gms.internal.drive.zzkq.zzdn();
                }
            } else if (com.google.android.gms.internal.drive.zzng.zzf(bZza2)) {
                if (i6 < i3 - 1) {
                    int i8 = i6 + 1;
                    com.google.android.gms.internal.drive.zzng.zza(bZza2, com.google.android.gms.internal.drive.zznd.zza(bArr, i6), com.google.android.gms.internal.drive.zznd.zza(bArr, i8), cArr, i5);
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
                byte bZza4 = com.google.android.gms.internal.drive.zznd.zza(bArr, i6);
                int i10 = i9 + 1;
                com.google.android.gms.internal.drive.zzng.zza(bZza2, bZza4, com.google.android.gms.internal.drive.zznd.zza(bArr, i9), com.google.android.gms.internal.drive.zznd.zza(bArr, i10), cArr, i5);
                i = i10 + 1;
                i5 = i5 + 1 + 1;
            }
        }
        return new java.lang.String(cArr, 0, i5);
    }

    @Override // com.google.android.gms.internal.drive.zznh
    final int zzb(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int i3;
        char cCharAt;
        long j4 = i;
        long j5 = ((long) i2) + j4;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            throw new java.lang.ArrayIndexOutOfBoundsException(new java.lang.StringBuilder(37).append("Failed writing ").append(charSequence.charAt(length - 1)).append(" at index ").append(i + i2).toString());
        }
        int i4 = 0;
        while (true) {
            c = 128;
            j = 1;
            if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            com.google.android.gms.internal.drive.zznd.zza(bArr, j4, (byte) cCharAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char cCharAt2 = charSequence.charAt(i4);
            if (cCharAt2 < c && j4 < j5) {
                long j6 = j4 + j;
                com.google.android.gms.internal.drive.zznd.zza(bArr, j4, (byte) cCharAt2);
                j3 = j;
                j2 = j6;
                c2 = c;
            } else if (cCharAt2 < 2048 && j4 <= j5 - 2) {
                long j7 = j4 + j;
                com.google.android.gms.internal.drive.zznd.zza(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                long j8 = j7 + j;
                com.google.android.gms.internal.drive.zznd.zza(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                long j9 = j;
                c2 = 128;
                j2 = j8;
                j3 = j9;
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                    if (j4 <= j5 - 4) {
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt3 = charSequence.charAt(i5);
                            if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                                long j10 = j4 + 1;
                                com.google.android.gms.internal.drive.zznd.zza(bArr, j4, (byte) ((codePoint >>> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK));
                                long j11 = j10 + 1;
                                c2 = 128;
                                com.google.android.gms.internal.drive.zznd.zza(bArr, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j12 = j11 + 1;
                                com.google.android.gms.internal.drive.zznd.zza(bArr, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 = 1;
                                j2 = j12 + 1;
                                com.google.android.gms.internal.drive.zznd.zza(bArr, j12, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new com.google.android.gms.internal.drive.zznj(i4 - 1, length);
                    }
                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !java.lang.Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                        throw new com.google.android.gms.internal.drive.zznj(i4, length);
                    }
                    throw new java.lang.ArrayIndexOutOfBoundsException(new java.lang.StringBuilder(46).append("Failed writing ").append(cCharAt2).append(" at index ").append(j4).toString());
                }
                long j13 = j4 + j;
                com.google.android.gms.internal.drive.zznd.zza(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                long j14 = j13 + j;
                com.google.android.gms.internal.drive.zznd.zza(bArr, j13, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                com.google.android.gms.internal.drive.zznd.zza(bArr, j14, (byte) ((cCharAt2 & '?') | 128));
                j2 = j14 + 1;
                j3 = 1;
                c2 = 128;
            }
            i4++;
            c = c2;
            long j15 = j3;
            j4 = j2;
            j = j15;
        }
        return (int) j4;
    }

    private static int zza(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return com.google.android.gms.internal.drive.zznf.zzay(i);
        }
        if (i2 == 1) {
            return com.google.android.gms.internal.drive.zznf.zzr(i, com.google.android.gms.internal.drive.zznd.zza(bArr, j));
        }
        if (i2 == 2) {
            return com.google.android.gms.internal.drive.zznf.zzc(i, com.google.android.gms.internal.drive.zznd.zza(bArr, j), com.google.android.gms.internal.drive.zznd.zza(bArr, j + 1));
        }
        throw new java.lang.AssertionError();
    }
}
