package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingCollection<E> extends com.google.common.collect.ForwardingObject implements java.util.Collection<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract java.util.Collection<E> delegate();

    protected ForwardingCollection() {
    }

    public java.util.Iterator<E> iterator() {
        return delegate().iterator();
    }

    @Override // java.util.Collection
    public int size() {
        return delegate().size();
    }

    public boolean removeAll(java.util.Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
        return delegate().contains(object);
    }

    public boolean add(@com.google.common.collect.ParametricNullness E element) {
        return delegate().add(element);
    }

    public boolean remove(@javax.annotation.CheckForNull java.lang.Object object) {
        return delegate().remove(object);
    }

    public boolean containsAll(java.util.Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    public boolean addAll(java.util.Collection<? extends E> collection) {
        return delegate().addAll(collection);
    }

    public boolean retainAll(java.util.Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    public void clear() {
        delegate().clear();
    }

    public java.lang.Object[] toArray() {
        return delegate().toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return (T[]) delegate().toArray(tArr);
    }

    protected boolean standardContains(@javax.annotation.CheckForNull java.lang.Object object) {
        return com.google.common.collect.Iterators.contains(iterator(), object);
    }

    protected boolean standardContainsAll(java.util.Collection<?> collection) {
        return com.google.common.collect.Collections2.containsAllImpl(this, collection);
    }

    protected boolean standardAddAll(java.util.Collection<? extends E> collection) {
        return com.google.common.collect.Iterators.addAll(this, collection.iterator());
    }

    protected boolean standardRemove(@javax.annotation.CheckForNull java.lang.Object object) {
        java.util.Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (com.google.common.base.Objects.equal(it.next(), object)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    protected boolean standardRemoveAll(java.util.Collection<?> collection) {
        return com.google.common.collect.Iterators.removeAll(iterator(), collection);
    }

    protected boolean standardRetainAll(java.util.Collection<?> collection) {
        return com.google.common.collect.Iterators.retainAll(iterator(), collection);
    }

    protected void standardClear() {
        com.google.common.collect.Iterators.clear(iterator());
    }

    protected boolean standardIsEmpty() {
        return !iterator().hasNext();
    }

    protected java.lang.String standardToString() {
        return com.google.common.collect.Collections2.toStringImpl(this);
    }

    protected java.lang.Object[] standardToArray() {
        return toArray(new java.lang.Object[size()]);
    }

    protected <T> T[] standardToArray(T[] tArr) {
        return (T[]) com.google.common.collect.ObjectArrays.toArrayImpl(this, tArr);
    }
}
