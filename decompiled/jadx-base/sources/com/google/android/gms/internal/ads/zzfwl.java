package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzfwl extends java.util.AbstractCollection {
    final java.util.Collection zza;
    final com.google.android.gms.internal.ads.zzfuo zzb;

    zzfwl(java.util.Collection collection, com.google.android.gms.internal.ads.zzfuo zzfuoVar) {
        this.zza = collection;
        this.zzb = zzfuoVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfun.zze(this.zzb.zza(obj));
        return this.zza.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzfun.zze(this.zzb.zza(it.next()));
        }
        return this.zza.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        com.google.android.gms.internal.ads.zzfxt.zzb(this.zza, this.zzb);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (com.google.android.gms.internal.ads.zzfwm.zza(this.zza, obj)) {
            return this.zzb.zza(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        com.google.android.gms.internal.ads.zzfuo zzfuoVar = this.zzb;
        java.util.Iterator it = this.zza.iterator();
        com.google.android.gms.internal.ads.zzfun.zzc(zzfuoVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (zzfuoVar.zza(it.next())) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.util.Iterator it = this.zza.iterator();
        it.getClass();
        com.google.android.gms.internal.ads.zzfuo zzfuoVar = this.zzb;
        zzfuoVar.getClass();
        return new com.google.android.gms.internal.ads.zzfxu(it, zzfuoVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        return contains(obj) && this.zza.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        java.util.Iterator it = this.zza.iterator();
        boolean z = false;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (this.zzb.zza(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        java.util.Iterator it = this.zza.iterator();
        boolean z = false;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (this.zzb.zza(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        java.util.Iterator it = this.zza.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.zzb.zza(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        java.util.Iterator it = iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.gms.internal.ads.zzfxx.zzc(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        java.util.Iterator it = iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.gms.internal.ads.zzfxx.zzc(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
