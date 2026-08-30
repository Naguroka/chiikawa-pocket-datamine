package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgwt extends java.io.IOException {
    zzgwt() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzgwt(long j, long j2, int i, java.lang.Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(java.lang.String.valueOf(java.lang.String.format(java.util.Locale.US, "Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), java.lang.Integer.valueOf(i)))), th);
    }

    zzgwt(java.lang.Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
