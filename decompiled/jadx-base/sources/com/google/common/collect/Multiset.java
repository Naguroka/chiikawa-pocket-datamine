package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface Multiset<E> extends java.util.Collection<E> {

    public interface Entry<E> {
        boolean equals(@javax.annotation.CheckForNull java.lang.Object o);

        int getCount();

        @com.google.common.collect.ParametricNullness
        E getElement();

        int hashCode();

        java.lang.String toString();
    }

    int add(@com.google.common.collect.ParametricNullness E element, int occurrences);

    boolean add(@com.google.common.collect.ParametricNullness E element);

    boolean contains(@javax.annotation.CheckForNull java.lang.Object element);

    @Override // java.util.Collection
    boolean containsAll(java.util.Collection<?> elements);

    int count(@javax.annotation.CheckForNull java.lang.Object element);

    java.util.Set<E> elementSet();

    java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet();

    boolean equals(@javax.annotation.CheckForNull java.lang.Object object);

    int hashCode();

    java.util.Iterator<E> iterator();

    int remove(@javax.annotation.CheckForNull java.lang.Object element, int occurrences);

    boolean remove(@javax.annotation.CheckForNull java.lang.Object element);

    boolean removeAll(java.util.Collection<?> c);

    boolean retainAll(java.util.Collection<?> c);

    int setCount(@com.google.common.collect.ParametricNullness E element, int count);

    boolean setCount(@com.google.common.collect.ParametricNullness E element, int oldCount, int newCount);

    int size();

    java.lang.String toString();
}
