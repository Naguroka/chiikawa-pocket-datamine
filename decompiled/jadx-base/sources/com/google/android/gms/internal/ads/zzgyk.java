package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgyk implements java.util.Iterator {
    private final java.util.Iterator zza;

    public zzgyk(java.util.Iterator it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.zza.next();
        return entry.getValue() instanceof com.google.android.gms.internal.ads.zzgym ? new com.google.android.gms.internal.ads.zzgyj(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }
}
