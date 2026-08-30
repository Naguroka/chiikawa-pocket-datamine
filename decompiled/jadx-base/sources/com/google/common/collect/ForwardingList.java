package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingList<E> extends com.google.common.collect.ForwardingCollection<E> implements java.util.List<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.List<E> delegate();

    protected ForwardingList() {
    }

    public void add(int index, @com.google.common.collect.ParametricNullness E element) {
        delegate().add(index, element);
    }

    public boolean addAll(int index, java.util.Collection<? extends E> elements) {
        return delegate().addAll(index, elements);
    }

    @Override // java.util.List
    @com.google.common.collect.ParametricNullness
    public E get(int index) {
        return delegate().get(index);
    }

    @Override // java.util.List
    public int indexOf(@javax.annotation.CheckForNull java.lang.Object element) {
        return delegate().indexOf(element);
    }

    @Override // java.util.List
    public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object element) {
        return delegate().lastIndexOf(element);
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator() {
        return delegate().listIterator();
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator(int index) {
        return delegate().listIterator(index);
    }

    @Override // java.util.List
    @com.google.common.collect.ParametricNullness
    public E remove(int index) {
        return delegate().remove(index);
    }

    @Override // java.util.List
    @com.google.common.collect.ParametricNullness
    public E set(int index, @com.google.common.collect.ParametricNullness E element) {
        return delegate().set(index, element);
    }

    @Override // java.util.List
    public java.util.List<E> subList(int fromIndex, int toIndex) {
        return delegate().subList(fromIndex, toIndex);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return object == this || delegate().equals(object);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return delegate().hashCode();
    }

    protected boolean standardAdd(@com.google.common.collect.ParametricNullness E element) {
        add(size(), element);
        return true;
    }

    protected boolean standardAddAll(int index, java.lang.Iterable<? extends E> elements) {
        return com.google.common.collect.Lists.addAllImpl(this, index, elements);
    }

    protected int standardIndexOf(@javax.annotation.CheckForNull java.lang.Object element) {
        return com.google.common.collect.Lists.indexOfImpl(this, element);
    }

    protected int standardLastIndexOf(@javax.annotation.CheckForNull java.lang.Object element) {
        return com.google.common.collect.Lists.lastIndexOfImpl(this, element);
    }

    protected java.util.Iterator<E> standardIterator() {
        return listIterator();
    }

    protected java.util.ListIterator<E> standardListIterator() {
        return listIterator(0);
    }

    protected java.util.ListIterator<E> standardListIterator(int start) {
        return com.google.common.collect.Lists.listIteratorImpl(this, start);
    }

    protected java.util.List<E> standardSubList(int fromIndex, int toIndex) {
        return com.google.common.collect.Lists.subListImpl(this, fromIndex, toIndex);
    }

    protected boolean standardEquals(@javax.annotation.CheckForNull java.lang.Object object) {
        return com.google.common.collect.Lists.equalsImpl(this, object);
    }

    protected int standardHashCode() {
        return com.google.common.collect.Lists.hashCodeImpl(this);
    }
}
