package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class SortedIterables {
    private SortedIterables() {
    }

    public static boolean hasSameComparator(java.util.Comparator<?> comparator, java.lang.Iterable<?> elements) {
        java.util.Comparator comparator2;
        com.google.common.base.Preconditions.checkNotNull(comparator);
        com.google.common.base.Preconditions.checkNotNull(elements);
        if (elements instanceof java.util.SortedSet) {
            comparator2 = comparator((java.util.SortedSet) elements);
        } else {
            if (!(elements instanceof com.google.common.collect.SortedIterable)) {
                return false;
            }
            comparator2 = ((com.google.common.collect.SortedIterable) elements).comparator();
        }
        return comparator.equals(comparator2);
    }

    public static <E> java.util.Comparator<? super E> comparator(java.util.SortedSet<E> sortedSet) {
        java.util.Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? com.google.common.collect.Ordering.natural() : comparator;
    }
}
