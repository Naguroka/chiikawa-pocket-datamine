package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzng {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzd(byte b) {
        return b >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zze(byte b) {
        return b < -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzf(byte b) {
        return b < -16;
    }

    private static boolean zzg(byte b) {
        return b > -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(byte b, byte b2, char[] cArr, int i) throws com.google.android.gms.internal.drive.zzkq {
        if (b < -62 || zzg(b2)) {
            throw com.google.android.gms.internal.drive.zzkq.zzdn();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & okio.Utf8.REPLACEMENT_BYTE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(byte b, byte b2, byte b3, char[] cArr, int i) throws com.google.android.gms.internal.drive.zzkq {
        if (zzg(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || zzg(b3)))) {
            throw com.google.android.gms.internal.drive.zzkq.zzdn();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & okio.Utf8.REPLACEMENT_BYTE) << 6) | (b3 & okio.Utf8.REPLACEMENT_BYTE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws com.google.android.gms.internal.drive.zzkq {
        if (zzg(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || zzg(b3) || zzg(b4)) {
            throw com.google.android.gms.internal.drive.zzkq.zzdn();
        }
        int i2 = ((b & 7) << 18) | ((b2 & okio.Utf8.REPLACEMENT_BYTE) << 12) | ((b3 & okio.Utf8.REPLACEMENT_BYTE) << 6) | (b4 & okio.Utf8.REPLACEMENT_BYTE);
        cArr[i] = (char) ((i2 >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        cArr[i + 1] = (char) ((i2 & 1023) + okio.Utf8.LOG_SURROGATE_HEADER);
    }
}
