package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzal extends com.google.android.gms.internal.common.zzag implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.common.zzap zza = new com.google.android.gms.internal.common.zzai(com.google.android.gms.internal.common.zzan.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzal() {
    }

    static com.google.android.gms.internal.common.zzal zzj(java.lang.Object[] objArr, int i) {
        return i == 0 ? com.google.android.gms.internal.common.zzan.zza : new com.google.android.gms.internal.common.zzan(objArr, i);
    }

    public static com.google.android.gms.internal.common.zzal zzl(java.util.Collection collection) {
        if (!(collection instanceof com.google.android.gms.internal.common.zzag)) {
            java.lang.Object[] array = collection.toArray();
            int length = array.length;
            com.google.android.gms.internal.common.zzam.zza(array, length);
            return zzj(array, length);
        }
        com.google.android.gms.internal.common.zzal zzalVarZzd = ((com.google.android.gms.internal.common.zzag) collection).zzd();
        if (!zzalVarZzd.zzf()) {
            return zzalVarZzd;
        }
        java.lang.Object[] array2 = zzalVarZzd.toArray();
        return zzj(array2, array2.length);
    }

    public static com.google.android.gms.internal.common.zzal zzm() {
        return com.google.android.gms.internal.common.zzan.zza;
    }

    public static com.google.android.gms.internal.common.zzal zzn(java.lang.Object obj) {
        java.lang.Object[] objArr = {obj};
        com.google.android.gms.internal.common.zzam.zza(objArr, 1);
        return zzj(objArr, 1);
    }

    public static com.google.android.gms.internal.common.zzal zzo(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object[] objArr = {obj, obj2, obj3};
        com.google.android.gms.internal.common.zzam.zza(objArr, 3);
        return zzj(objArr, 3);
    }

    public static com.google.android.gms.internal.common.zzal zzp(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        java.lang.Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        com.google.android.gms.internal.common.zzam.zza(objArr, 6);
        return zzj(objArr, 6);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof java.util.RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (com.google.android.gms.internal.common.zzu.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                java.util.Iterator it = iterator();
                java.util.Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && com.google.android.gms.internal.common.zzu.zza(it.next(), it2.next())) {
                    }
                }
                if (!it2.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.common.zzag
    int zza(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.common.zzag
    @java.lang.Deprecated
    public final com.google.android.gms.internal.common.zzal zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.common.zzag
    /* JADX INFO: renamed from: zze */
    public final com.google.android.gms.internal.common.zzao iterator() {
        return listIterator(0);
    }

    public com.google.android.gms.internal.common.zzal zzh() {
        return size() <= 1 ? this : new com.google.android.gms.internal.common.zzaj(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.common.zzal subList(int i, int i2) {
        com.google.android.gms.internal.common.zzv.zzc(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? com.google.android.gms.internal.common.zzan.zza : new com.google.android.gms.internal.common.zzak(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.common.zzap listIterator(int i) {
        com.google.android.gms.internal.common.zzv.zzb(i, size(), com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new com.google.android.gms.internal.common.zzai(this, i);
    }

    public static com.google.android.gms.internal.common.zzal zzk(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof java.util.Collection) {
            return zzl((java.util.Collection) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return com.google.android.gms.internal.common.zzan.zza;
        }
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            return zzn(next);
        }
        com.google.android.gms.internal.common.zzah zzahVar = new com.google.android.gms.internal.common.zzah(4);
        zzahVar.zzb(next);
        zzahVar.zzc(it);
        return zzahVar.zzd();
    }
}
