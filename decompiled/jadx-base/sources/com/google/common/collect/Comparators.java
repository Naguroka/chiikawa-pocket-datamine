package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Comparators {
    private Comparators() {
    }

    public static <T, S extends T> java.util.Comparator<java.lang.Iterable<S>> lexicographical(java.util.Comparator<T> comparator) {
        return new com.google.common.collect.LexicographicalOrdering((java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator));
    }

    public static <T> boolean isInOrder(java.lang.Iterable<? extends T> iterable, java.util.Comparator<T> comparator) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        java.util.Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public static <T> boolean isInStrictOrder(java.lang.Iterable<? extends T> iterable, java.util.Comparator<T> comparator) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        java.util.Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    static <T> java.util.stream.Collector<T, ?, java.util.List<T>> least(final int k, final java.util.Comparator<? super T> comparator) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(k, "k");
        com.google.common.base.Preconditions.checkNotNull(comparator);
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.Comparators$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.google.common.collect.TopKSelector.least(k, comparator);
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.Comparators$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.TopKSelector) obj).offer(obj2);
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.Comparators$$ExternalSyntheticLambda2
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.common.collect.TopKSelector) obj).combine((com.google.common.collect.TopKSelector) obj2);
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.Comparators$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.common.collect.TopKSelector) obj).topK();
            }
        }, java.util.stream.Collector.Characteristics.UNORDERED);
    }

    static <T> java.util.stream.Collector<T, ?, java.util.List<T>> greatest(int k, java.util.Comparator<? super T> comparator) {
        return least(k, comparator.reversed());
    }

    public static <T extends java.lang.Comparable<? super T>> T min(T a2, T b) {
        return a2.compareTo(b) <= 0 ? a2 : b;
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T min(@com.google.common.collect.ParametricNullness T a2, @com.google.common.collect.ParametricNullness T b, java.util.Comparator<T> comparator) {
        return comparator.compare(a2, b) <= 0 ? a2 : b;
    }

    public static <T extends java.lang.Comparable<? super T>> T max(T a2, T b) {
        return a2.compareTo(b) >= 0 ? a2 : b;
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T max(@com.google.common.collect.ParametricNullness T a2, @com.google.common.collect.ParametricNullness T b, java.util.Comparator<T> comparator) {
        return comparator.compare(a2, b) >= 0 ? a2 : b;
    }
}
