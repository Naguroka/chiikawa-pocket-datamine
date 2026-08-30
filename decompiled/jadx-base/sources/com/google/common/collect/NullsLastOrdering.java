package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class NullsLastOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final com.google.common.collect.Ordering<? super T> ordering;

    @Override // com.google.common.collect.Ordering
    public <S extends T> com.google.common.collect.Ordering<S> nullsLast() {
        return this;
    }

    NullsLastOrdering(com.google.common.collect.Ordering<? super T> ordering) {
        this.ordering = ordering;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@javax.annotation.CheckForNull T left, @javax.annotation.CheckForNull T right) {
        if (left == right) {
            return 0;
        }
        if (left == null) {
            return 1;
        }
        if (right == null) {
            return -1;
        }
        return this.ordering.compare(left, right);
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> com.google.common.collect.Ordering<S> reverse() {
        return this.ordering.reverse().nullsFirst();
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> com.google.common.collect.Ordering<S> nullsFirst() {
        return this.ordering.nullsFirst();
    }

    @Override // java.util.Comparator
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof com.google.common.collect.NullsLastOrdering) {
            return this.ordering.equals(((com.google.common.collect.NullsLastOrdering) object).ordering);
        }
        return false;
    }

    public int hashCode() {
        return this.ordering.hashCode() ^ (-921210296);
    }

    public java.lang.String toString() {
        return this.ordering + ".nullsLast()";
    }
}
