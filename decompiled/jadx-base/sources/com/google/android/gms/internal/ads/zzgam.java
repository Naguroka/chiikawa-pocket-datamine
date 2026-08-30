package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgam {
    static long zza(java.lang.String str, long j) {
        if (j >= 0) {
            return j;
        }
        throw new java.lang.IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    static void zzb(boolean z) {
        if (!z) {
            throw new java.lang.ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
