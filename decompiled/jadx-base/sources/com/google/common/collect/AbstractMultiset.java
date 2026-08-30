package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractMultiset<E> extends java.util.AbstractCollection<E> implements com.google.common.collect.Multiset<E> {

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<E> elementSet;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet;

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    abstract int distinctElements();

    abstract java.util.Iterator<E> elementIterator();

    abstract java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator();

    AbstractMultiset() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object element) {
        return count(element) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean add(@com.google.common.collect.ParametricNullness E element) {
        add(element, 1);
        return true;
    }

    public int add(@com.google.common.collect.ParametricNullness E element, int occurrences) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object element) {
        return remove(element, 1) > 0;
    }

    public int remove(@javax.annotation.CheckForNull java.lang.Object element, int occurrences) {
        throw new java.lang.UnsupportedOperationException();
    }

    public int setCount(@com.google.common.collect.ParametricNullness E element, int count) {
        return com.google.common.collect.Multisets.setCountImpl(this, element, count);
    }

    public boolean setCount(@com.google.common.collect.ParametricNullness E element, int oldCount, int newCount) {
        return com.google.common.collect.Multisets.setCountImpl(this, element, oldCount, newCount);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends E> elementsToAdd) {
        return com.google.common.collect.Multisets.addAllImpl(this, elementsToAdd);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean removeAll(java.util.Collection<?> elementsToRemove) {
        return com.google.common.collect.Multisets.removeAllImpl(this, elementsToRemove);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean retainAll(java.util.Collection<?> elementsToRetain) {
        return com.google.common.collect.Multisets.retainAllImpl(this, elementsToRetain);
    }

    @Override // com.google.common.collect.Multiset
    public java.util.Set<E> elementSet() {
        java.util.Set<E> set = this.elementSet;
        if (set != null) {
            return set;
        }
        java.util.Set<E> setCreateElementSet = createElementSet();
        this.elementSet = setCreateElementSet;
        return setCreateElementSet;
    }

    java.util.Set<E> createElementSet() {
        return new com.google.common.collect.AbstractMultiset.ElementSet();
    }

    class ElementSet extends com.google.common.collect.Multisets.ElementSet<E> {
        ElementSet() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        com.google.common.collect.Multiset<E> multiset() {
            return com.google.common.collect.AbstractMultiset.this;
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
            return com.google.common.collect.AbstractMultiset.this.elementIterator();
        }
    }

    @Override // com.google.common.collect.Multiset
    public java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet() {
        java.util.Set<com.google.common.collect.Multiset.Entry<E>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        java.util.Set<com.google.common.collect.Multiset.Entry<E>> setCreateEntrySet = createEntrySet();
        this.entrySet = setCreateEntrySet;
        return setCreateEntrySet;
    }

    class EntrySet extends com.google.common.collect.Multisets.EntrySet<E> {
        EntrySet() {
        }

        @Override // com.google.common.collect.Multisets.EntrySet
        com.google.common.collect.Multiset<E> multiset() {
            return com.google.common.collect.AbstractMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> iterator() {
            return com.google.common.collect.AbstractMultiset.this.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.collect.AbstractMultiset.this.distinctElements();
        }
    }

    java.util.Set<com.google.common.collect.Multiset.Entry<E>> createEntrySet() {
        return new com.google.common.collect.AbstractMultiset.EntrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return com.google.common.collect.Multisets.equalsImpl(this, object);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public final java.lang.String toString() {
        return entrySet().toString();
    }
}
