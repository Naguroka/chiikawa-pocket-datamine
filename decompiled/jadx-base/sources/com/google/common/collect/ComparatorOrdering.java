package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ComparatorOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.util.Comparator<T> comparator;

    ComparatorOrdering(java.util.Comparator<T> comparator) {
        this.comparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@com.google.common.collect.ParametricNullness T a2, @com.google.common.collect.ParametricNullness T b) {
        return this.comparator.compare(a2, b);
    }

    @Override // java.util.Comparator
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof com.google.common.collect.ComparatorOrdering) {
            return this.comparator.equals(((com.google.common.collect.ComparatorOrdering) object).comparator);
        }
        return false;
    }

    public int hashCode() {
        return this.comparator.hashCode();
    }

    public java.lang.String toString() {
        return this.comparator.toString();
    }
}
