package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
abstract class zziw<E> extends java.util.AbstractList<E> implements com.google.android.gms.internal.drive.zzkp<E> {
    private boolean zznh = true;

    zziw() {
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        if (!(obj instanceof java.util.RandomAccess)) {
            return super.equals(obj);
        }
        java.util.List list = (java.util.List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        zzbq();
        return super.add(e);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        zzbq();
        super.add(i, e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends E> collection) {
        zzbq();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, java.util.Collection<? extends E> collection) {
        zzbq();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        zzbq();
        super.clear();
    }

    @Override // com.google.android.gms.internal.drive.zzkp
    public boolean zzbo() {
        return this.zznh;
    }

    @Override // com.google.android.gms.internal.drive.zzkp
    public final void zzbp() {
        this.zznh = false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        zzbq();
        return (E) super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        zzbq();
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection<?> collection) {
        zzbq();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection<?> collection) {
        zzbq();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        zzbq();
        return (E) super.set(i, e);
    }

    protected final void zzbq() {
        if (!this.zznh) {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}
