package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ug implements java.util.Set, java.util.RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList f1404a = new java.util.ArrayList();
    private final java.util.HashSet b = new java.util.HashSet();

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f1404a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f1404a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return this.f1404a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        return this.f1404a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(java.lang.Comparable comparable) {
        if (contains(comparable)) {
            return false;
        }
        if (!isEmpty() && comparable.compareTo(a()) <= 0) {
            this.f1404a.add(b(comparable), comparable);
        } else {
            this.f1404a.add(comparable);
        }
        return this.b.add(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        int iD = d((java.lang.Comparable) obj);
        if (iD == -1) {
            return false;
        }
        this.f1404a.remove(iD);
        return this.b.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        return this.b.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (add((java.lang.Comparable) it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            java.lang.Comparable comparable = (java.lang.Comparable) this.f1404a.get(size);
            if (!collection.contains(comparable)) {
                this.f1404a.remove(size);
                this.b.remove(comparable);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        while (true) {
            boolean z = false;
            for (java.lang.Object obj : collection) {
                if (z || remove(obj)) {
                    z = true;
                }
            }
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return this.f1404a.toArray(objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f1404a.clear();
        this.b.clear();
    }

    public int d(java.lang.Comparable comparable) {
        if (comparable == null || !contains(comparable)) {
            return -1;
        }
        return b(comparable);
    }

    public int b(java.lang.Comparable comparable) {
        int iBinarySearch = java.util.Collections.binarySearch(this.f1404a, comparable);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        java.lang.Comparable comparableA = a(iBinarySearch);
        while (iBinarySearch >= 0 && comparableA == a(iBinarySearch)) {
            iBinarySearch--;
        }
        return iBinarySearch + 1;
    }

    public int c(java.lang.Comparable comparable) {
        int iBinarySearch = java.util.Collections.binarySearch(this.f1404a, comparable);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        java.lang.Comparable comparableA = a(iBinarySearch);
        while (iBinarySearch < size() && comparableA == a(iBinarySearch)) {
            iBinarySearch++;
        }
        return iBinarySearch;
    }

    public java.lang.Comparable a(int i) {
        return (java.lang.Comparable) this.f1404a.get(i);
    }

    public java.lang.Comparable b(int i) {
        java.lang.Comparable comparable = (java.lang.Comparable) this.f1404a.remove(i);
        this.b.remove(comparable);
        return comparable;
    }

    public java.lang.Comparable a() {
        return (java.lang.Comparable) this.f1404a.get(size() - 1);
    }

    public void a(int i, java.lang.Comparable comparable) {
        this.b.remove((java.lang.Comparable) this.f1404a.get(i));
        this.f1404a.set(i, comparable);
        this.b.add(comparable);
    }
}
