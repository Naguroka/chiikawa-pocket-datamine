package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzfwg extends com.google.android.gms.internal.ads.zzfwj implements java.io.Serializable {
    private final transient java.util.Map zza;
    private transient int zzb;

    protected zzfwg(java.util.Map map) {
        com.google.android.gms.internal.ads.zzfun.zze(map.isEmpty());
        this.zza = map;
    }

    static /* bridge */ /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzfwg zzfwgVar, java.lang.Object obj) {
        java.lang.Object objRemove;
        try {
            objRemove = zzfwgVar.zza.remove(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            objRemove = null;
        }
        java.util.Collection collection = (java.util.Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfwgVar.zzb -= size;
        }
    }

    abstract java.util.Collection zza();

    java.util.Collection zzb(java.util.Collection collection) {
        throw null;
    }

    java.util.Collection zzc(java.lang.Object obj, java.util.Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    final java.util.Collection zzf() {
        return new com.google.android.gms.internal.ads.zzfwi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    final java.util.Iterator zzg() {
        return new com.google.android.gms.internal.ads.zzfvq(this);
    }

    final java.util.List zzh(java.lang.Object obj, java.util.List list, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzfwd zzfwdVar) {
        return list instanceof java.util.RandomAccess ? new com.google.android.gms.internal.ads.zzfvz(this, obj, list, zzfwdVar) : new com.google.android.gms.internal.ads.zzfwf(this, obj, list, zzfwdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    java.util.Map zzj() {
        throw null;
    }

    final java.util.Map zzk() {
        java.util.Map map = this.zza;
        if (map instanceof java.util.NavigableMap) {
            return new com.google.android.gms.internal.ads.zzfvx(this, (java.util.NavigableMap) map);
        }
        return map instanceof java.util.SortedMap ? new com.google.android.gms.internal.ads.zzfwa(this, (java.util.SortedMap) map) : new com.google.android.gms.internal.ads.zzfvt(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    java.util.Set zzl() {
        throw null;
    }

    final java.util.Set zzm() {
        java.util.Map map = this.zza;
        if (map instanceof java.util.NavigableMap) {
            return new com.google.android.gms.internal.ads.zzfvy(this, (java.util.NavigableMap) map);
        }
        return map instanceof java.util.SortedMap ? new com.google.android.gms.internal.ads.zzfwb(this, (java.util.SortedMap) map) : new com.google.android.gms.internal.ads.zzfvw(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    public final void zzp() {
        java.util.Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((java.util.Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfwj, com.google.android.gms.internal.ads.zzfyl
    public final boolean zzq(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Collection collection = (java.util.Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        java.util.Collection collectionZza = zza();
        if (!collectionZza.add(obj2)) {
            throw new java.lang.AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(obj, collectionZza);
        return true;
    }
}
