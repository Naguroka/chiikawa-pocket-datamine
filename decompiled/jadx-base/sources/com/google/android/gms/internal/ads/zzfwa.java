package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzfwa extends com.google.android.gms.internal.ads.zzfvt implements java.util.SortedMap {

    @javax.annotation.CheckForNull
    java.util.SortedSet zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfwg zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfwa(com.google.android.gms.internal.ads.zzfwg zzfwgVar, java.util.SortedMap sortedMap) {
        super(zzfwgVar, sortedMap);
        this.zze = zzfwgVar;
    }

    @Override // java.util.SortedMap
    @javax.annotation.CheckForNull
    public final java.util.Comparator comparator() {
        return zzf().comparator();
    }

    @Override // java.util.SortedMap
    public final java.lang.Object firstKey() {
        return zzf().firstKey();
    }

    public java.util.SortedMap headMap(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.zzfwa(this.zze, zzf().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final java.lang.Object lastKey() {
        return zzf().lastKey();
    }

    public java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return new com.google.android.gms.internal.ads.zzfwa(this.zze, zzf().subMap(obj, obj2));
    }

    public java.util.SortedMap tailMap(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.zzfwa(this.zze, zzf().tailMap(obj));
    }

    java.util.SortedMap zzf() {
        return (java.util.SortedMap) this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfyj
    public java.util.SortedSet zzg() {
        return new com.google.android.gms.internal.ads.zzfwb(this.zze, zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzfvt, com.google.android.gms.internal.ads.zzfyj, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public java.util.SortedSet keySet() {
        java.util.SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        java.util.SortedSet sortedSetZzg = zzg();
        this.zzd = sortedSetZzg;
        return sortedSetZzg;
    }
}
