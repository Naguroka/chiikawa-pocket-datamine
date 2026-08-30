package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgah {
    static long zza(double d) {
        com.google.android.gms.internal.ads.zzfun.zzf(zzb(d), "not a normal value");
        int exponent = java.lang.Math.getExponent(d);
        long jDoubleToRawLongBits = java.lang.Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean zzb(double d) {
        return java.lang.Math.getExponent(d) <= 1023;
    }
}
