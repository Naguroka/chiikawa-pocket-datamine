package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class CompoundOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.util.Comparator<? super T>[] comparators;

    CompoundOrdering(java.util.Comparator<? super T> primary, java.util.Comparator<? super T> secondary) {
        this.comparators = new java.util.Comparator[]{primary, secondary};
    }

    CompoundOrdering(java.lang.Iterable<? extends java.util.Comparator<? super T>> comparators) {
        this.comparators = (java.util.Comparator[]) com.google.common.collect.Iterables.toArray(comparators, new java.util.Comparator[0]);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@com.google.common.collect.ParametricNullness T left, @com.google.common.collect.ParametricNullness T right) {
        int i = 0;
        while (true) {
            java.util.Comparator<? super T>[] comparatorArr = this.comparators;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(left, right);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof com.google.common.collect.CompoundOrdering) {
            return java.util.Arrays.equals(this.comparators, ((com.google.common.collect.CompoundOrdering) object).comparators);
        }
        return false;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.comparators);
    }

    public java.lang.String toString() {
        return "Ordering.compound(" + java.util.Arrays.toString(this.comparators) + ")";
    }
}
