package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class LexicographicalOrdering<T> extends com.google.common.collect.Ordering<java.lang.Iterable<T>> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.util.Comparator<? super T> elementOrder;

    LexicographicalOrdering(java.util.Comparator<? super T> elementOrder) {
        this.elementOrder = elementOrder;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(java.lang.Iterable<T> leftIterable, java.lang.Iterable<T> rightIterable) {
        java.util.Iterator<T> it = leftIterable.iterator();
        java.util.Iterator<T> it2 = rightIterable.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompare = this.elementOrder.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }

    @Override // java.util.Comparator
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof com.google.common.collect.LexicographicalOrdering) {
            return this.elementOrder.equals(((com.google.common.collect.LexicographicalOrdering) object).elementOrder);
        }
        return false;
    }

    public int hashCode() {
        return this.elementOrder.hashCode() ^ 2075626741;
    }

    public java.lang.String toString() {
        return this.elementOrder + ".lexicographical()";
    }
}
