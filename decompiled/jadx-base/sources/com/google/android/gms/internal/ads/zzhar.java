package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzhar extends com.google.android.gms.internal.ads.zzhaq {
    zzhar() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzhaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zza(int i, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b = (byte) i;
            if (b < -32) {
                if (b >= -62) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            int i6 = ~(i >> 8);
            if (b < -16) {
                byte b2 = (byte) i6;
                if (b2 == 0) {
                    int i7 = i2 + 1;
                    byte b3 = bArr[i2];
                    if (i7 >= i3) {
                        return com.google.android.gms.internal.ads.zzhat.zzj(b, b3);
                    }
                    i2 = i7;
                    b2 = b3;
                }
                if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            byte b4 = (byte) i6;
            if (b4 == 0) {
                int i8 = i2 + 1;
                b4 = bArr[i2];
                if (i8 >= i3) {
                    return com.google.android.gms.internal.ads.zzhat.zzj(b, b4);
                }
                i2 = i8;
                i4 = 0;
            } else {
                i4 = i >> 16;
            }
            if (i4 == 0) {
                int i9 = i2 + 1;
                byte b5 = bArr[i2];
                if (i9 >= i3) {
                    return com.google.android.gms.internal.ads.zzhat.zzk(b, b4, b5);
                }
                i2 = i9;
                i4 = b5;
            }
            if (b4 <= -65 && (((b << 28) + (b4 + 112)) >> 30) == 0 && i4 <= -65) {
                i5 = i2 + 1;
            }
            return -1;
            i2 = i5;
        }
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i10 = i2 + 1;
            byte b6 = bArr[i2];
            if (b6 < 0) {
                if (b6 < -32) {
                    if (i10 >= i3) {
                        return b6;
                    }
                    if (b6 >= -62) {
                        i2 = i10 + 1;
                        if (bArr[i10] > -65) {
                        }
                    }
                    return -1;
                }
                if (b6 >= -16) {
                    if (i10 >= i3 - 2) {
                        return com.google.android.gms.internal.ads.zzhat.zzc(bArr, i10, i3);
                    }
                    int i11 = i10 + 1;
                    byte b7 = bArr[i10];
                    if (b7 <= -65 && (((b6 << 28) + (b7 + 112)) >> 30) == 0) {
                        int i12 = i11 + 1;
                        if (bArr[i11] <= -65) {
                            i2 = i12 + 1;
                            if (bArr[i12] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i10 >= i3 - 1) {
                    return com.google.android.gms.internal.ads.zzhat.zzc(bArr, i10, i3);
                }
                int i13 = i10 + 1;
                byte b8 = bArr[i10];
                if (b8 <= -65 && ((b6 != -32 || b8 >= -96) && (b6 != -19 || b8 < -96))) {
                    i2 = i13 + 1;
                    if (bArr[i13] > -65) {
                    }
                }
                return -1;
            }
            i2 = i10;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    final java.lang.String zzb(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzgyg {
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!com.google.android.gms.internal.ads.zzhap.zzd(b)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (com.google.android.gms.internal.ads.zzhap.zzd(b2)) {
                int i6 = i4 + 1;
                cArr[i4] = (char) b2;
                i = i5;
                while (true) {
                    i4 = i6;
                    if (i >= i3) {
                        break;
                    }
                    byte b3 = bArr[i];
                    if (!com.google.android.gms.internal.ads.zzhap.zzd(b3)) {
                        break;
                    }
                    i++;
                    i6 = i4 + 1;
                    cArr[i4] = (char) b3;
                }
            } else if (com.google.android.gms.internal.ads.zzhap.zzf(b2)) {
                if (i5 >= i3) {
                    throw new com.google.android.gms.internal.ads.zzgyg("Protocol message had invalid UTF-8.");
                }
                com.google.android.gms.internal.ads.zzhap.zzc(b2, bArr[i5], cArr, i4);
                i4++;
                i = i5 + 1;
            } else if (com.google.android.gms.internal.ads.zzhap.zze(b2)) {
                if (i5 >= i3 - 1) {
                    throw new com.google.android.gms.internal.ads.zzgyg("Protocol message had invalid UTF-8.");
                }
                int i7 = i5 + 1;
                com.google.android.gms.internal.ads.zzhap.zzb(b2, bArr[i5], bArr[i7], cArr, i4);
                i4++;
                i = i7 + 1;
            } else {
                if (i5 >= i3 - 2) {
                    throw new com.google.android.gms.internal.ads.zzgyg("Protocol message had invalid UTF-8.");
                }
                int i8 = i5 + 1;
                byte b4 = bArr[i5];
                int i9 = i8 + 1;
                com.google.android.gms.internal.ads.zzhap.zza(b2, b4, bArr[i8], bArr[i9], cArr, i4);
                i4 += 2;
                i = i9 + 1;
            }
        }
        return new java.lang.String(cArr, 0, i4);
    }
}
