package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ExplicitOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final com.google.common.collect.ImmutableMap<T, java.lang.Integer> rankMap;

    ExplicitOrdering(java.util.List<T> valuesInOrder) {
        this(com.google.common.collect.Maps.indexMap(valuesInOrder));
    }

    ExplicitOrdering(com.google.common.collect.ImmutableMap<T, java.lang.Integer> rankMap) {
        this.rankMap = rankMap;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T left, T right) {
        return rank(left) - rank(right);
    }

    private int rank(T value) {
        java.lang.Integer num = this.rankMap.get(value);
        if (num == null) {
            throw new com.google.common.collect.Ordering.IncomparableValueException(value);
        }
        return num.intValue();
    }

    @Override // java.util.Comparator
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object instanceof com.google.common.collect.ExplicitOrdering) {
            return this.rankMap.equals(((com.google.common.collect.ExplicitOrdering) object).rankMap);
        }
        return false;
    }

    public int hashCode() {
        return this.rankMap.hashCode();
    }

    public java.lang.String toString() {
        return "Ordering.explicit(" + this.rankMap.keySet() + ")";
    }
}
