package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractRangeSet<C extends java.lang.Comparable> implements com.google.common.collect.RangeSet<C> {
    @Override // com.google.common.collect.RangeSet
    public abstract boolean encloses(com.google.common.collect.Range<C> otherRange);

    @Override // com.google.common.collect.RangeSet
    @javax.annotation.CheckForNull
    public abstract com.google.common.collect.Range<C> rangeContaining(C value);

    AbstractRangeSet() {
    }

    @Override // com.google.common.collect.RangeSet
    public boolean contains(C value) {
        return rangeContaining(value) != null;
    }

    @Override // com.google.common.collect.RangeSet
    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    @Override // com.google.common.collect.RangeSet
    public void add(com.google.common.collect.Range<C> range) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeSet
    public void remove(com.google.common.collect.Range<C> range) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeSet
    public void clear() {
        remove(com.google.common.collect.Range.all());
    }

    @Override // com.google.common.collect.RangeSet
    public boolean enclosesAll(com.google.common.collect.RangeSet<C> other) {
        return enclosesAll(other.asRanges());
    }

    @Override // com.google.common.collect.RangeSet
    public boolean enclosesAll(java.lang.Iterable<com.google.common.collect.Range<C>> ranges) {
        java.util.Iterator<com.google.common.collect.Range<C>> it = ranges.iterator();
        while (it.hasNext()) {
            if (!encloses(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.collect.RangeSet
    public void addAll(com.google.common.collect.RangeSet<C> other) {
        addAll(other.asRanges());
    }

    @Override // com.google.common.collect.RangeSet
    public void addAll(java.lang.Iterable<com.google.common.collect.Range<C>> ranges) {
        java.util.Iterator<com.google.common.collect.Range<C>> it = ranges.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // com.google.common.collect.RangeSet
    public void removeAll(com.google.common.collect.RangeSet<C> other) {
        removeAll(other.asRanges());
    }

    @Override // com.google.common.collect.RangeSet
    public void removeAll(java.lang.Iterable<com.google.common.collect.Range<C>> ranges) {
        java.util.Iterator<com.google.common.collect.Range<C>> it = ranges.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // com.google.common.collect.RangeSet
    public boolean intersects(com.google.common.collect.Range<C> otherRange) {
        return !subRangeSet(otherRange).isEmpty();
    }

    @Override // com.google.common.collect.RangeSet
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.common.collect.RangeSet) {
            return asRanges().equals(((com.google.common.collect.RangeSet) obj).asRanges());
        }
        return false;
    }

    @Override // com.google.common.collect.RangeSet
    public final int hashCode() {
        return asRanges().hashCode();
    }

    @Override // com.google.common.collect.RangeSet
    public final java.lang.String toString() {
        return asRanges().toString();
    }
}
