package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfvy extends com.google.android.gms.internal.ads.zzfwb implements java.util.NavigableSet {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfwg zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfvy(com.google.android.gms.internal.ads.zzfwg zzfwgVar, java.util.NavigableMap navigableMap) {
        super(zzfwgVar, navigableMap);
        this.zzb = zzfwgVar;
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public final java.lang.Object ceiling(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.zzd)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.util.Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet descendingSet() {
        return new com.google.android.gms.internal.ads.zzfvy(this.zzb, ((java.util.NavigableMap) ((java.util.SortedMap) this.zzd)).descendingMap());
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public final java.lang.Object floor(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.zzd)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwb, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ java.util.SortedSet headSet(java.lang.Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public final java.lang.Object higher(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.zzd)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public final java.lang.Object lower(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.zzd)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public final java.lang.Object pollFirst() {
        return com.google.android.gms.internal.ads.zzfxx.zza(iterator());
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public final java.lang.Object pollLast() {
        return com.google.android.gms.internal.ads.zzfxx.zza(descendingIterator());
    }

    @Override // com.google.android.gms.internal.ads.zzfwb, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzfwb, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ java.util.SortedSet tailSet(java.lang.Object obj) {
        return tailSet(obj, true);
    }

    @Override // com.google.android.gms.internal.ads.zzfwb
    final /* synthetic */ java.util.SortedMap zza() {
        return (java.util.NavigableMap) ((java.util.SortedMap) this.zzd);
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet headSet(java.lang.Object obj, boolean z) {
        return new com.google.android.gms.internal.ads.zzfvy(this.zzb, ((java.util.NavigableMap) ((java.util.SortedMap) this.zzd)).headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet subSet(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
        return new com.google.android.gms.internal.ads.zzfvy(this.zzb, ((java.util.NavigableMap) ((java.util.SortedMap) this.zzd)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet tailSet(java.lang.Object obj, boolean z) {
        return new com.google.android.gms.internal.ads.zzfvy(this.zzb, ((java.util.NavigableMap) ((java.util.SortedMap) this.zzd)).tailMap(obj, z));
    }
}
