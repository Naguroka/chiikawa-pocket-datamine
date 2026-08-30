package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ReverseNaturalOrdering extends com.google.common.collect.Ordering<java.lang.Comparable<?>> implements java.io.Serializable {
    static final com.google.common.collect.ReverseNaturalOrdering INSTANCE = new com.google.common.collect.ReverseNaturalOrdering();
    private static final long serialVersionUID = 0;

    public java.lang.String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(java.lang.Comparable<?> left, java.lang.Comparable<?> right) {
        com.google.common.base.Preconditions.checkNotNull(left);
        if (left == right) {
            return 0;
        }
        return right.compareTo(left);
    }

    @Override // com.google.common.collect.Ordering
    public <S extends java.lang.Comparable<?>> com.google.common.collect.Ordering<S> reverse() {
        return com.google.common.collect.Ordering.natural();
    }

    @Override // com.google.common.collect.Ordering
    public <E extends java.lang.Comparable<?>> E min(E a2, E b) {
        return (E) com.google.common.collect.NaturalOrdering.INSTANCE.max(a2, b);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends java.lang.Comparable<?>> E min(E a2, E b, E c, E... rest) {
        return (E) com.google.common.collect.NaturalOrdering.INSTANCE.max(a2, b, c, rest);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends java.lang.Comparable<?>> E min(java.util.Iterator<E> iterator) {
        return (E) com.google.common.collect.NaturalOrdering.INSTANCE.max(iterator);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends java.lang.Comparable<?>> E min(java.lang.Iterable<E> iterable) {
        return (E) com.google.common.collect.NaturalOrdering.INSTANCE.max(iterable);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends java.lang.Comparable<?>> E max(E a2, E b) {
        return (E) com.google.common.collect.NaturalOrdering.INSTANCE.min(a2, b);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends java.lang.Comparable<?>> E max(E a2, E b, E c, E... rest) {
        return (E) com.google.common.collect.NaturalOrdering.INSTANCE.min(a2, b, c, rest);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends java.lang.Comparable<?>> E max(java.util.Iterator<E> iterator) {
        return (E) com.google.common.collect.NaturalOrdering.INSTANCE.min(iterator);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends java.lang.Comparable<?>> E max(java.lang.Iterable<E> iterable) {
        return (E) com.google.common.collect.NaturalOrdering.INSTANCE.min(iterable);
    }

    private java.lang.Object readResolve() {
        return INSTANCE;
    }

    private ReverseNaturalOrdering() {
    }
}
