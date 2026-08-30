package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzfwb extends com.google.android.gms.internal.ads.zzfvw implements java.util.SortedSet {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfwg zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfwb(com.google.android.gms.internal.ads.zzfwg zzfwgVar, java.util.SortedMap sortedMap) {
        super(zzfwgVar, sortedMap);
        this.zzc = zzfwgVar;
    }

    @Override // java.util.SortedSet
    @javax.annotation.CheckForNull
    public final java.util.Comparator comparator() {
        return zza().comparator();
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        return zza().firstKey();
    }

    public java.util.SortedSet headSet(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.zzfwb(this.zzc, zza().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        return zza().lastKey();
    }

    public java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return new com.google.android.gms.internal.ads.zzfwb(this.zzc, zza().subMap(obj, obj2));
    }

    public java.util.SortedSet tailSet(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.zzfwb(this.zzc, zza().tailMap(obj));
    }

    java.util.SortedMap zza() {
        return (java.util.SortedMap) this.zzd;
    }
}
