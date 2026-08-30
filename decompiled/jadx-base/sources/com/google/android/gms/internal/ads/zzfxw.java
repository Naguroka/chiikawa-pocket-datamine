package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfxw extends com.google.android.gms.internal.ads.zzfzt {
    private final java.lang.Object zza;
    private boolean zzb;

    zzfxw(java.lang.Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.zzb) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }
}
