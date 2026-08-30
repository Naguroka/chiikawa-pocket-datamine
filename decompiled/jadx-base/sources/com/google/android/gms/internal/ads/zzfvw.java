package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzfvw extends com.google.android.gms.internal.ads.zzfyh {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfwg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfvw(com.google.android.gms.internal.ads.zzfwg zzfwgVar, java.util.Map map) {
        super(map);
        this.zza = zzfwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        com.google.android.gms.internal.ads.zzfxx.zzb(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.zzfvv(this, this.zzd.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.zzd.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.zza.zzb -= size;
        return size > 0;
    }
}
