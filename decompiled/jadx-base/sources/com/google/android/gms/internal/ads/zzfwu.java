package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfwu extends java.util.AbstractCollection {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfww zza;

    zzfwu(com.google.android.gms.internal.ads.zzfww zzfwwVar) {
        this.zza = zzfwwVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        com.google.android.gms.internal.ads.zzfww zzfwwVar = this.zza;
        java.util.Map mapZzl = zzfwwVar.zzl();
        return mapZzl != null ? mapZzl.values().iterator() : new com.google.android.gms.internal.ads.zzfwp(zzfwwVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
