package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
interface SortedIterable<T> extends java.lang.Iterable<T> {
    java.util.Comparator<? super T> comparator();

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    java.util.Iterator<T> iterator();
}
