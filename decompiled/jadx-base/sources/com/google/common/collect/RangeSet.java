package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use ImmutableRangeSet or TreeRangeSet")
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface RangeSet<C extends java.lang.Comparable> {
    void add(com.google.common.collect.Range<C> range);

    void addAll(com.google.common.collect.RangeSet<C> other);

    void addAll(java.lang.Iterable<com.google.common.collect.Range<C>> ranges);

    java.util.Set<com.google.common.collect.Range<C>> asDescendingSetOfRanges();

    java.util.Set<com.google.common.collect.Range<C>> asRanges();

    void clear();

    com.google.common.collect.RangeSet<C> complement();

    boolean contains(C value);

    boolean encloses(com.google.common.collect.Range<C> otherRange);

    boolean enclosesAll(com.google.common.collect.RangeSet<C> other);

    boolean enclosesAll(java.lang.Iterable<com.google.common.collect.Range<C>> other);

    boolean equals(@javax.annotation.CheckForNull java.lang.Object obj);

    int hashCode();

    boolean intersects(com.google.common.collect.Range<C> otherRange);

    boolean isEmpty();

    @javax.annotation.CheckForNull
    com.google.common.collect.Range<C> rangeContaining(C value);

    void remove(com.google.common.collect.Range<C> range);

    void removeAll(com.google.common.collect.RangeSet<C> other);

    void removeAll(java.lang.Iterable<com.google.common.collect.Range<C>> ranges);

    com.google.common.collect.Range<C> span();

    com.google.common.collect.RangeSet<C> subRangeSet(com.google.common.collect.Range<C> view);

    java.lang.String toString();
}
