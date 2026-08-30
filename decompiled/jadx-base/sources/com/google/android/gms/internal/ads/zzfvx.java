package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfvx extends com.google.android.gms.internal.ads.zzfwa implements java.util.NavigableMap {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfwg zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfvx(com.google.android.gms.internal.ads.zzfwg zzfwgVar, java.util.NavigableMap navigableMap) {
        super(zzfwgVar, navigableMap);
        this.zzc = zzfwgVar;
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry ceilingEntry(java.lang.Object obj) {
        java.util.Map.Entry entryCeilingEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return zza(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.lang.Object ceilingKey(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableSet descendingKeySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap descendingMap() {
        return new com.google.android.gms.internal.ads.zzfvx(this.zzc, ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).descendingMap());
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry firstEntry() {
        java.util.Map.Entry entryFirstEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return zza(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry floorEntry(java.lang.Object obj) {
        java.util.Map.Entry entryFloorEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return zza(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.lang.Object floorKey(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwa, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ java.util.SortedMap headMap(java.lang.Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry higherEntry(java.lang.Object obj) {
        java.util.Map.Entry entryHigherEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return zza(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.lang.Object higherKey(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwa, com.google.android.gms.internal.ads.zzfvt, com.google.android.gms.internal.ads.zzfyj, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ java.util.Set keySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry lastEntry() {
        java.util.Map.Entry entryLastEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return zza(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry lowerEntry(java.lang.Object obj) {
        java.util.Map.Entry entryLowerEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return zza(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.lang.Object lowerKey(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableSet navigableKeySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry pollFirstEntry() {
        return zzc(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry pollLastEntry() {
        return zzc(descendingMap().entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzfwa, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzfwa, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ java.util.SortedMap tailMap(java.lang.Object obj) {
        return tailMap(obj, true);
    }

    @javax.annotation.CheckForNull
    final java.util.Map.Entry zzc(java.util.Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        java.util.Collection collectionZza = this.zzc.zza();
        collectionZza.addAll((java.util.Collection) entry.getValue());
        it.remove();
        return new com.google.android.gms.internal.ads.zzfxj(entry.getKey(), this.zzc.zzb(collectionZza));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfwa
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final java.util.NavigableSet zzg() {
        return new com.google.android.gms.internal.ads.zzfvy(this.zzc, (java.util.NavigableMap) ((java.util.SortedMap) this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfwa
    final /* synthetic */ java.util.SortedMap zzf() {
        return (java.util.NavigableMap) ((java.util.SortedMap) this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfwa
    /* JADX INFO: renamed from: zzh */
    public final /* synthetic */ java.util.SortedSet keySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap headMap(java.lang.Object obj, boolean z) {
        return new com.google.android.gms.internal.ads.zzfvx(this.zzc, ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap subMap(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
        return new com.google.android.gms.internal.ads.zzfvx(this.zzc, ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap tailMap(java.lang.Object obj, boolean z) {
        return new com.google.android.gms.internal.ads.zzfvx(this.zzc, ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).tailMap(obj, z));
    }
}
