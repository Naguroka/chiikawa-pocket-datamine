package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzhaq {
    zzhaq() {
    }

    static final java.lang.String zzc(java.nio.ByteBuffer byteBuffer, int i, int i2) throws com.google.android.gms.internal.ads.zzgyg {
        if ((((byteBuffer.limit() - i) - i2) | i | i2) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!com.google.android.gms.internal.ads.zzhap.zzd(b)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (com.google.android.gms.internal.ads.zzhap.zzd(b2)) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b2;
                i = i6;
                while (true) {
                    i5 = i7;
                    if (i >= i3) {
                        break;
                    }
                    byte b3 = byteBuffer.get(i);
                    if (!com.google.android.gms.internal.ads.zzhap.zzd(b3)) {
                        break;
                    }
                    i++;
                    i7 = i5 + 1;
                    cArr[i5] = (char) b3;
                }
            } else if (com.google.android.gms.internal.ads.zzhap.zzf(b2)) {
                if (i6 >= i3) {
                    throw new com.google.android.gms.internal.ads.zzgyg("Protocol message had invalid UTF-8.");
                }
                com.google.android.gms.internal.ads.zzhap.zzc(b2, byteBuffer.get(i6), cArr, i5);
                i5++;
                i = i6 + 1;
            } else if (com.google.android.gms.internal.ads.zzhap.zze(b2)) {
                if (i6 >= i3 - 1) {
                    throw new com.google.android.gms.internal.ads.zzgyg("Protocol message had invalid UTF-8.");
                }
                int i8 = i6 + 1;
                com.google.android.gms.internal.ads.zzhap.zzb(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                i5++;
                i = i8 + 1;
            } else {
                if (i6 >= i3 - 2) {
                    throw new com.google.android.gms.internal.ads.zzgyg("Protocol message had invalid UTF-8.");
                }
                int i9 = i6 + 1;
                byte b4 = byteBuffer.get(i6);
                int i10 = i9 + 1;
                com.google.android.gms.internal.ads.zzhap.zza(b2, b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                i5 += 2;
                i = i10 + 1;
            }
        }
        return new java.lang.String(cArr, 0, i5);
    }

    abstract int zza(int i, byte[] bArr, int i2, int i3);

    abstract java.lang.String zzb(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzgyg;
}
