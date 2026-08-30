package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfws extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfww zza;

    zzfws(com.google.android.gms.internal.ads.zzfww zzfwwVar) {
        this.zza = zzfwwVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        com.google.android.gms.internal.ads.zzfww zzfwwVar = this.zza;
        java.util.Map mapZzl = zzfwwVar.zzl();
        return mapZzl != null ? mapZzl.keySet().iterator() : new com.google.android.gms.internal.ads.zzfwn(zzfwwVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.keySet().remove(obj);
        }
        return this.zza.zzy(obj) != com.google.android.gms.internal.ads.zzfww.zzd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
