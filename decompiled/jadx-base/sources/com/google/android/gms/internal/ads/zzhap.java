package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzhap {
    static /* bridge */ /* synthetic */ void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws com.google.android.gms.internal.ads.zzgyg {
        if (zzg(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || zzg(b3) || zzg(b4)) {
            throw new com.google.android.gms.internal.ads.zzgyg("Protocol message had invalid UTF-8.");
        }
        int i2 = ((b & 7) << 18) | ((b2 & okio.Utf8.REPLACEMENT_BYTE) << 12) | ((b3 & okio.Utf8.REPLACEMENT_BYTE) << 6) | (b4 & okio.Utf8.REPLACEMENT_BYTE);
        cArr[i] = (char) ((i2 >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        cArr[i + 1] = (char) ((i2 & 1023) + okio.Utf8.LOG_SURROGATE_HEADER);
    }

    static /* bridge */ /* synthetic */ void zzc(byte b, byte b2, char[] cArr, int i) throws com.google.android.gms.internal.ads.zzgyg {
        if (b < -62 || zzg(b2)) {
            throw new com.google.android.gms.internal.ads.zzgyg("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & okio.Utf8.REPLACEMENT_BYTE));
    }

    static /* bridge */ /* synthetic */ boolean zzd(byte b) {
        return b >= 0;
    }

    static /* bridge */ /* synthetic */ boolean zze(byte b) {
        return b < -16;
    }

    static /* bridge */ /* synthetic */ boolean zzf(byte b) {
        return b < -32;
    }

    private static boolean zzg(byte b) {
        return b > -65;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    static /* bridge */ /* synthetic */ void zzb(byte b, byte b2, byte b3, char[] cArr, int i) throws com.google.android.gms.internal.ads.zzgyg {
        if (!zzg(b2)) {
            if (b != -32) {
                if (b != -19) {
                    if (!zzg(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & okio.Utf8.REPLACEMENT_BYTE) << 6) | (b3 & okio.Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!zzg(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & okio.Utf8.REPLACEMENT_BYTE) << 6) | (b3 & okio.Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                }
            } else if (b2 >= -96) {
                b = -32;
                if (b != -19) {
                    if (!zzg(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & okio.Utf8.REPLACEMENT_BYTE) << 6) | (b3 & okio.Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!zzg(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & okio.Utf8.REPLACEMENT_BYTE) << 6) | (b3 & okio.Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                }
            }
        }
        throw new com.google.android.gms.internal.ads.zzgyg("Protocol message had invalid UTF-8.");
    }
}
