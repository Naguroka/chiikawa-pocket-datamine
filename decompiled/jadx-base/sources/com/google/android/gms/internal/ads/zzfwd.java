package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzfwd extends java.util.AbstractCollection {
    final java.lang.Object zza;
    java.util.Collection zzb;

    @javax.annotation.CheckForNull
    final com.google.android.gms.internal.ads.zzfwd zzc;

    @javax.annotation.CheckForNull
    final java.util.Collection zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfwg zze;

    zzfwd(com.google.android.gms.internal.ads.zzfwg zzfwgVar, java.lang.Object obj, @javax.annotation.CheckForNull java.util.Collection collection, com.google.android.gms.internal.ads.zzfwd zzfwdVar) {
        this.zze = zzfwgVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfwdVar;
        this.zzd = zzfwdVar == null ? null : zzfwdVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        zzb();
        boolean zIsEmpty = this.zzb.isEmpty();
        boolean zAdd = this.zzb.add(obj);
        if (zAdd) {
            this.zze.zzb++;
            if (zIsEmpty) {
                zza();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.zzb.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        this.zze.zzb += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        zza();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        this.zze.zzb -= size;
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        zzb();
        return new com.google.android.gms.internal.ads.zzfwc(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        zzb();
        boolean zRemove = this.zzb.remove(obj);
        if (zRemove) {
            this.zze.zzb--;
            zzc();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.zzb.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.zzb.size();
            this.zze.zzb += size2 - size;
            zzc();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        zzb();
        return this.zzb.toString();
    }

    final void zza() {
        com.google.android.gms.internal.ads.zzfwd zzfwdVar = this.zzc;
        if (zzfwdVar != null) {
            zzfwdVar.zza();
            return;
        }
        com.google.android.gms.internal.ads.zzfwg zzfwgVar = this.zze;
        zzfwgVar.zza.put(this.zza, this.zzb);
    }

    final void zzb() {
        com.google.android.gms.internal.ads.zzfwd zzfwdVar = this.zzc;
        if (zzfwdVar != null) {
            zzfwdVar.zzb();
            com.google.android.gms.internal.ads.zzfwd zzfwdVar2 = this.zzc;
            if (zzfwdVar2.zzb != this.zzd) {
                throw new java.util.ConcurrentModificationException();
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            com.google.android.gms.internal.ads.zzfwg zzfwgVar = this.zze;
            java.util.Collection collection = (java.util.Collection) zzfwgVar.zza.get(this.zza);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    final void zzc() {
        com.google.android.gms.internal.ads.zzfwd zzfwdVar = this.zzc;
        if (zzfwdVar != null) {
            zzfwdVar.zzc();
        } else if (this.zzb.isEmpty()) {
            com.google.android.gms.internal.ads.zzfwg zzfwgVar = this.zze;
            zzfwgVar.zza.remove(this.zza);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.zzb.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.zzb.size();
            this.zze.zzb += size2 - size;
            zzc();
        }
        return zRetainAll;
    }
}
