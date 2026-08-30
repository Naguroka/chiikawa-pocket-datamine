package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzen extends java.io.IOException {
    zzen() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzen(long j, long j2, int i, java.lang.Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(java.lang.String.valueOf(java.lang.String.format(java.util.Locale.US, "Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), java.lang.Integer.valueOf(i)))), th);
    }

    zzen(java.lang.Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
