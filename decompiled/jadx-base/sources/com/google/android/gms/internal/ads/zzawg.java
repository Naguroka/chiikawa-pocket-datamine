package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzawg {
    public static final /* synthetic */ int zza = 0;
    private static final char[] zzb = "0123456789abcdef".toCharArray();

    public static long zza(double d, int i, android.util.DisplayMetrics displayMetrics) {
        return java.lang.Math.round(d / ((double) displayMetrics.density));
    }

    public static java.lang.String zzb(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            char[] cArr2 = zzb;
            int i3 = i + i;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new java.lang.String(cArr);
    }

    public static boolean zzc() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    public static boolean zzd(java.lang.String str) {
        return str == null || str.isEmpty();
    }

    public static boolean zze(android.util.DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static byte[] zzf(java.lang.String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new java.lang.IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((java.lang.Character.digit(str.charAt(i), 16) << 4) + java.lang.Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
