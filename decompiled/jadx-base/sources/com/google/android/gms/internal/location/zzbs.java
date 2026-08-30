package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbs<E> extends com.google.android.gms.internal.location.zzbp<E> implements java.util.List<E>, java.util.RandomAccess {
    private static final com.google.android.gms.internal.location.zzbv<java.lang.Object> zza = new com.google.android.gms.internal.location.zzbq(com.google.android.gms.internal.location.zzbt.zza, 0);

    zzbs() {
    }

    public static <E> com.google.android.gms.internal.location.zzbs<E> zzi() {
        return (com.google.android.gms.internal.location.zzbs<E>) com.google.android.gms.internal.location.zzbt.zza;
    }

    public static <E> com.google.android.gms.internal.location.zzbs<E> zzj(java.util.Collection<? extends E> collection) {
        if (collection instanceof com.google.android.gms.internal.location.zzbp) {
            com.google.android.gms.internal.location.zzbs<E> zzbsVarZze = ((com.google.android.gms.internal.location.zzbp) collection).zze();
            if (!zzbsVarZze.zzf()) {
                return zzbsVarZze;
            }
            java.lang.Object[] array = zzbsVarZze.toArray();
            return zzk(array, array.length);
        }
        java.lang.Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i = 0; i < length; i++) {
            if (array2[i] == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new java.lang.NullPointerException(sb.toString());
            }
        }
        return zzk(array2, length);
    }

    static <E> com.google.android.gms.internal.location.zzbs<E> zzk(java.lang.Object[] objArr, int i) {
        return i == 0 ? (com.google.android.gms.internal.location.zzbs<E>) com.google.android.gms.internal.location.zzbt.zza : new com.google.android.gms.internal.location.zzbt(objArr, i);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int i, E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int i, java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof java.util.RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (com.google.android.gms.internal.location.zzbl.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                java.util.Iterator<E> it = iterator();
                java.util.Iterator<E> it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && com.google.android.gms.internal.location.zzbl.zza(it.next(), it2.next())) {
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

    @Override // java.util.List
    public final int indexOf(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
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

    @Override // com.google.android.gms.internal.location.zzbp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
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
    public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E remove(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E set(int i, E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.location.zzbp
    /* JADX INFO: renamed from: zza */
    public final com.google.android.gms.internal.location.zzbu<E> iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final com.google.android.gms.internal.location.zzbs<E> zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    int zzg(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.location.zzbs<E> subList(int i, int i2) {
        com.google.android.gms.internal.location.zzbm.zzc(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? (com.google.android.gms.internal.location.zzbs<E>) com.google.android.gms.internal.location.zzbt.zza : new com.google.android.gms.internal.location.zzbr(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.location.zzbv<E> listIterator(int i) {
        com.google.android.gms.internal.location.zzbm.zzb(i, size(), com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? (com.google.android.gms.internal.location.zzbv<E>) zza : new com.google.android.gms.internal.location.zzbq(this, i);
    }
}
