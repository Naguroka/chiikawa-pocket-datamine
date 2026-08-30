package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzfvt extends com.google.android.gms.internal.ads.zzfyj {
    final transient java.util.Map zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfwg zzb;

    zzfvt(com.google.android.gms.internal.ads.zzfwg zzfwgVar, java.util.Map map) {
        this.zzb = zzfwgVar;
        this.zza = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        com.google.android.gms.internal.ads.zzfwg zzfwgVar = this.zzb;
        if (this.zza == zzfwgVar.zza) {
            zzfwgVar.zzp();
        } else {
            com.google.android.gms.internal.ads.zzfxx.zzb(new com.google.android.gms.internal.ads.zzfvs(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Map map = this.zza;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public final /* bridge */ /* synthetic */ java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) com.google.android.gms.internal.ads.zzfyk.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzc(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfyj, java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        return this.zzb.zzt();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public final /* bridge */ /* synthetic */ java.lang.Object remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        java.util.Collection collectionZza = this.zzb.zza();
        collectionZza.addAll(collection);
        this.zzb.zzb -= collection.size();
        collection.clear();
        return collectionZza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
        return this.zza.toString();
    }

    final java.util.Map.Entry zza(java.util.Map.Entry entry) {
        java.lang.Object key = entry.getKey();
        return new com.google.android.gms.internal.ads.zzfxj(key, this.zzb.zzc(key, (java.util.Collection) entry.getValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzfyj
    protected final java.util.Set zzb() {
        return new com.google.android.gms.internal.ads.zzfvr(this);
    }
}
