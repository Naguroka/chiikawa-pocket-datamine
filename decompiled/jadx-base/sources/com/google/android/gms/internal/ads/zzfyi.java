package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfyi extends java.util.AbstractCollection {
    final java.util.Map zza;

    zzfyi(java.util.Map map) {
        this.zza = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this.zza.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.zzfyf(this.zza.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        try {
            return super.remove(obj);
        } catch (java.lang.UnsupportedOperationException unused) {
            for (java.util.Map.Entry entry : this.zza.entrySet()) {
                if (com.google.android.gms.internal.ads.zzfuk.zza(obj, entry.getValue())) {
                    this.zza.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        try {
            return super.removeAll(collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (java.util.Map.Entry entry : this.zza.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.zza.keySet().removeAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (java.util.Map.Entry entry : this.zza.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.zza.keySet().retainAll(hashSet);
        }
    }
}
