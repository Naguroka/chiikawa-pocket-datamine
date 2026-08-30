package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingMultiset<E> extends com.google.common.collect.ForwardingCollection<E> implements com.google.common.collect.Multiset<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract com.google.common.collect.Multiset<E> delegate();

    protected ForwardingMultiset() {
    }

    @Override // com.google.common.collect.Multiset
    public int count(@javax.annotation.CheckForNull java.lang.Object element) {
        return delegate().count(element);
    }

    @Override // com.google.common.collect.Multiset
    public int add(@com.google.common.collect.ParametricNullness E element, int occurrences) {
        return delegate().add(element, occurrences);
    }

    @Override // com.google.common.collect.Multiset
    public int remove(@javax.annotation.CheckForNull java.lang.Object element, int occurrences) {
        return delegate().remove(element, occurrences);
    }

    public java.util.Set<E> elementSet() {
        return delegate().elementSet();
    }

    public java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return object == this || delegate().equals(object);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // com.google.common.collect.Multiset
    public int setCount(@com.google.common.collect.ParametricNullness E element, int count) {
        return delegate().setCount(element, count);
    }

    @Override // com.google.common.collect.Multiset
    public boolean setCount(@com.google.common.collect.ParametricNullness E element, int oldCount, int newCount) {
        return delegate().setCount(element, oldCount, newCount);
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardContains(@javax.annotation.CheckForNull java.lang.Object object) {
        return count(object) > 0;
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected void standardClear() {
        com.google.common.collect.Iterators.clear(entrySet().iterator());
    }

    protected int standardCount(@javax.annotation.CheckForNull java.lang.Object object) {
        for (com.google.common.collect.Multiset.Entry<E> entry : entrySet()) {
            if (com.google.common.base.Objects.equal(entry.getElement(), object)) {
                return entry.getCount();
            }
        }
        return 0;
    }

    protected boolean standardAdd(@com.google.common.collect.ParametricNullness E element) {
        add(element, 1);
        return true;
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardAddAll(java.util.Collection<? extends E> elementsToAdd) {
        return com.google.common.collect.Multisets.addAllImpl(this, elementsToAdd);
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRemove(@javax.annotation.CheckForNull java.lang.Object element) {
        return remove(element, 1) > 0;
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRemoveAll(java.util.Collection<?> elementsToRemove) {
        return com.google.common.collect.Multisets.removeAllImpl(this, elementsToRemove);
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRetainAll(java.util.Collection<?> elementsToRetain) {
        return com.google.common.collect.Multisets.retainAllImpl(this, elementsToRetain);
    }

    protected int standardSetCount(@com.google.common.collect.ParametricNullness E element, int count) {
        return com.google.common.collect.Multisets.setCountImpl(this, element, count);
    }

    protected boolean standardSetCount(@com.google.common.collect.ParametricNullness E element, int oldCount, int newCount) {
        return com.google.common.collect.Multisets.setCountImpl(this, element, oldCount, newCount);
    }

    protected class StandardElementSet extends com.google.common.collect.Multisets.ElementSet<E> {
        public StandardElementSet() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        com.google.common.collect.Multiset<E> multiset() {
            return com.google.common.collect.ForwardingMultiset.this;
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
            return com.google.common.collect.Multisets.elementIterator(multiset().entrySet().iterator());
        }
    }

    protected java.util.Iterator<E> standardIterator() {
        return com.google.common.collect.Multisets.iteratorImpl(this);
    }

    protected int standardSize() {
        return com.google.common.collect.Multisets.linearTimeSizeImpl(this);
    }

    protected boolean standardEquals(@javax.annotation.CheckForNull java.lang.Object object) {
        return com.google.common.collect.Multisets.equalsImpl(this, object);
    }

    protected int standardHashCode() {
        return entrySet().hashCode();
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected java.lang.String standardToString() {
        return entrySet().toString();
    }
}
