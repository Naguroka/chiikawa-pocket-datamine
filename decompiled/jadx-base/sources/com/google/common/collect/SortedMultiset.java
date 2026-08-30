package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface SortedMultiset<E> extends com.google.common.collect.SortedMultisetBridge<E>, com.google.common.collect.SortedIterable<E> {
    java.util.Comparator<? super E> comparator();

    com.google.common.collect.SortedMultiset<E> descendingMultiset();

    @Override // com.google.common.collect.SortedMultisetBridge, com.google.common.collect.Multiset
    java.util.NavigableSet<E> elementSet();

    @Override // com.google.common.collect.Multiset
    java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet();

    @javax.annotation.CheckForNull
    com.google.common.collect.Multiset.Entry<E> firstEntry();

    com.google.common.collect.SortedMultiset<E> headMultiset(@com.google.common.collect.ParametricNullness E upperBound, com.google.common.collect.BoundType boundType);

    @Override // com.google.common.collect.Multiset, java.util.Collection, java.lang.Iterable
    java.util.Iterator<E> iterator();

    @javax.annotation.CheckForNull
    com.google.common.collect.Multiset.Entry<E> lastEntry();

    @javax.annotation.CheckForNull
    com.google.common.collect.Multiset.Entry<E> pollFirstEntry();

    @javax.annotation.CheckForNull
    com.google.common.collect.Multiset.Entry<E> pollLastEntry();

    com.google.common.collect.SortedMultiset<E> subMultiset(@com.google.common.collect.ParametricNullness E lowerBound, com.google.common.collect.BoundType lowerBoundType, @com.google.common.collect.ParametricNullness E upperBound, com.google.common.collect.BoundType upperBoundType);

    com.google.common.collect.SortedMultiset<E> tailMultiset(@com.google.common.collect.ParametricNullness E lowerBound, com.google.common.collect.BoundType boundType);
}
