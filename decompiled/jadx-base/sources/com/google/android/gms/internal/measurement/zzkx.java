package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzkx implements com.google.android.gms.internal.measurement.zzkz {
    zzkx() {
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return java.lang.Byte.valueOf(zza());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
