package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzac implements java.util.Iterator {
    final /* synthetic */ java.util.Iterator zza;
    final /* synthetic */ java.util.Iterator zzb;

    zzac(com.google.android.gms.internal.measurement.zzae zzaeVar, java.util.Iterator it, java.util.Iterator it2) {
        this.zza = it;
        this.zzb = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza.hasNext()) {
            return true;
        }
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        java.util.Iterator it = this.zza;
        if (it.hasNext()) {
            return new com.google.android.gms.internal.measurement.zzat(((java.lang.Integer) it.next()).toString());
        }
        java.util.Iterator it2 = this.zzb;
        if (it2.hasNext()) {
            return new com.google.android.gms.internal.measurement.zzat((java.lang.String) it2.next());
        }
        throw new java.util.NoSuchElementException();
    }
}
