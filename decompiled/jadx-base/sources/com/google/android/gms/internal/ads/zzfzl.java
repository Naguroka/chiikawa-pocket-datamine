package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfzl extends com.google.android.gms.internal.ads.zzfzk implements java.util.SortedSet {
    zzfzl(java.util.SortedSet sortedSet, com.google.android.gms.internal.ads.zzfuo zzfuoVar) {
        super(sortedSet, zzfuoVar);
    }

    @Override // java.util.SortedSet
    @javax.annotation.CheckForNull
    public final java.util.Comparator comparator() {
        return ((java.util.SortedSet) this.zza).comparator();
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        java.util.Iterator it = this.zza.iterator();
        it.getClass();
        com.google.android.gms.internal.ads.zzfuo zzfuoVar = this.zzb;
        zzfuoVar.getClass();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (zzfuoVar.zza(next)) {
                return next;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.zzfzl(((java.util.SortedSet) this.zza).headSet(obj), this.zzb);
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        java.util.SortedSet sortedSetHeadSet = (java.util.SortedSet) this.zza;
        while (true) {
            com.google.android.gms.internal.ads.zzfuo zzfuoVar = this.zzb;
            java.lang.Object objLast = sortedSetHeadSet.last();
            if (zzfuoVar.zza(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return new com.google.android.gms.internal.ads.zzfzl(((java.util.SortedSet) this.zza).subSet(obj, obj2), this.zzb);
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.zzfzl(((java.util.SortedSet) this.zza).tailSet(obj), this.zzb);
    }
}
