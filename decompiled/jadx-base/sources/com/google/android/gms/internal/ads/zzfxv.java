package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
enum zzfxv implements java.util.Iterator {
    INSTANCE;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.google.android.gms.internal.ads.zzfun.zzm(false, "no calls to next() since the last call to remove()");
    }
}
