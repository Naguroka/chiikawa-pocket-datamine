package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzkw<K> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {
    private java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> zztg;

    public zzkw(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> it) {
        this.zztg = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zztg.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zztg.remove();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry<K, java.lang.Object> next = this.zztg.next();
        return next.getValue() instanceof com.google.android.gms.internal.drive.zzkt ? new com.google.android.gms.internal.drive.zzkv(next) : next;
    }
}
