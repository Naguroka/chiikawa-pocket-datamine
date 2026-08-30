package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzfyg extends com.google.android.gms.internal.ads.zzfzm {
    zzfyg() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zza().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Object objZza = com.google.android.gms.internal.ads.zzfyk.zza(zza(), key);
        if (com.google.android.gms.internal.ads.zzfuk.zza(objZza, entry.getValue())) {
            return objZza != null || zza().containsKey(key);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return zza().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
            return zza().keySet().remove(((java.util.Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zza().size();
    }

    abstract java.util.Map zza();

    @Override // com.google.android.gms.internal.ads.zzfzm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        int iCeil;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                com.google.android.gms.internal.ads.zzfwk.zza(size, "expectedSize");
                iCeil = size + 1;
            } else {
                iCeil = size < 1073741824 ? (int) java.lang.Math.ceil(((double) size) / 0.75d) : Integer.MAX_VALUE;
            }
            java.util.HashSet hashSet = new java.util.HashSet(iCeil);
            for (java.lang.Object obj : collection) {
                if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
                    hashSet.add(((java.util.Map.Entry) obj).getKey());
                }
            }
            return zza().keySet().retainAll(hashSet);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzm, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        try {
            return com.google.android.gms.internal.ads.zzfzp.zze(this, collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            return com.google.android.gms.internal.ads.zzfzp.zzf(this, collection.iterator());
        }
    }
}
