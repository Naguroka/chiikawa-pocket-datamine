package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcx extends java.util.AbstractCollection implements java.io.Serializable {
    private static final java.lang.Object[] zza = new java.lang.Object[0];

    zzcx() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Spliterator spliterator() {
        return java.util.Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return toArray(zza);
    }

    int zza(java.lang.Object[] objArr, int i) {
        throw null;
    }

    int zzb() {
        throw new java.lang.UnsupportedOperationException();
    }

    int zzc() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public abstract com.google.android.gms.internal.consent_sdk.zzdg iterator();

    @javax.annotation.CheckForNull
    java.lang.Object[] zze() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            java.lang.Object[] objArrZze = zze();
            if (objArrZze != null) {
                return java.util.Arrays.copyOfRange(objArrZze, zzc(), zzb(), objArr.getClass());
            }
            if (length != 0) {
                objArr = java.util.Arrays.copyOf(objArr, 0);
            }
            objArr = java.util.Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        zza(objArr, 0);
        return objArr;
    }
}
