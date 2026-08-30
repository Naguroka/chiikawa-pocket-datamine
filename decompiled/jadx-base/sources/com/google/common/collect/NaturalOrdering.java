package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class NaturalOrdering extends com.google.common.collect.Ordering<java.lang.Comparable<?>> implements java.io.Serializable {
    static final com.google.common.collect.NaturalOrdering INSTANCE = new com.google.common.collect.NaturalOrdering();
    private static final long serialVersionUID = 0;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.Ordering<java.lang.Comparable<?>> nullsFirst;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.Ordering<java.lang.Comparable<?>> nullsLast;

    public java.lang.String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(java.lang.Comparable<?> left, java.lang.Comparable<?> right) {
        com.google.common.base.Preconditions.checkNotNull(left);
        com.google.common.base.Preconditions.checkNotNull(right);
        return left.compareTo(right);
    }

    @Override // com.google.common.collect.Ordering
    public <S extends java.lang.Comparable<?>> com.google.common.collect.Ordering<S> nullsFirst() {
        com.google.common.collect.Ordering<S> ordering = (com.google.common.collect.Ordering<S>) this.nullsFirst;
        if (ordering != null) {
            return ordering;
        }
        com.google.common.collect.Ordering<S> orderingNullsFirst = super.nullsFirst();
        this.nullsFirst = orderingNullsFirst;
        return orderingNullsFirst;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends java.lang.Comparable<?>> com.google.common.collect.Ordering<S> nullsLast() {
        com.google.common.collect.Ordering<S> ordering = (com.google.common.collect.Ordering<S>) this.nullsLast;
        if (ordering != null) {
            return ordering;
        }
        com.google.common.collect.Ordering<S> orderingNullsLast = super.nullsLast();
        this.nullsLast = orderingNullsLast;
        return orderingNullsLast;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends java.lang.Comparable<?>> com.google.common.collect.Ordering<S> reverse() {
        return com.google.common.collect.ReverseNaturalOrdering.INSTANCE;
    }

    private java.lang.Object readResolve() {
        return INSTANCE;
    }

    private NaturalOrdering() {
    }
}
