package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbe implements java.util.Iterator {
    final java.util.Iterator zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbf zzb;

    zzbe(com.google.android.gms.measurement.internal.zzbf zzbfVar) {
        this.zzb = zzbfVar;
        this.zza = zzbfVar.zza.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Remove not supported");
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final java.lang.String next() {
        return (java.lang.String) this.zza.next();
    }
}
