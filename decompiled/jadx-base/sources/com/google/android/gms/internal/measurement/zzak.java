package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzak implements java.util.Iterator {
    final /* synthetic */ java.util.Iterator zza;

    zzak(java.util.Iterator it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return new com.google.android.gms.internal.measurement.zzat((java.lang.String) this.zza.next());
    }
}
