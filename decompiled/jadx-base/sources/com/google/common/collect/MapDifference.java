package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use Maps.difference")
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface MapDifference<K, V> {

    @com.google.errorprone.annotations.DoNotMock("Use Maps.difference")
    public interface ValueDifference<V> {
        boolean equals(@javax.annotation.CheckForNull java.lang.Object other);

        int hashCode();

        @com.google.common.collect.ParametricNullness
        V leftValue();

        @com.google.common.collect.ParametricNullness
        V rightValue();
    }

    boolean areEqual();

    java.util.Map<K, com.google.common.collect.MapDifference.ValueDifference<V>> entriesDiffering();

    java.util.Map<K, V> entriesInCommon();

    java.util.Map<K, V> entriesOnlyOnLeft();

    java.util.Map<K, V> entriesOnlyOnRight();

    boolean equals(@javax.annotation.CheckForNull java.lang.Object object);

    int hashCode();
}
