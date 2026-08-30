package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzon extends java.lang.IllegalArgumentException {
    zzon(int i, int i2) {
        super("Unpaired surrogate at index " + i + " of " + i2);
    }
}
