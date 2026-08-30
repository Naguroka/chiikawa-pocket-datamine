package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use ImmutableTable, HashBasedTable, or another implementation")
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface Table<R, C, V> {

    public interface Cell<R, C, V> {
        boolean equals(@javax.annotation.CheckForNull java.lang.Object obj);

        @com.google.common.collect.ParametricNullness
        C getColumnKey();

        @com.google.common.collect.ParametricNullness
        R getRowKey();

        @com.google.common.collect.ParametricNullness
        V getValue();

        int hashCode();
    }

    java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet();

    void clear();

    java.util.Map<R, V> column(@com.google.common.collect.ParametricNullness C columnKey);

    java.util.Set<C> columnKeySet();

    java.util.Map<C, java.util.Map<R, V>> columnMap();

    boolean contains(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey);

    boolean containsColumn(@javax.annotation.CheckForNull java.lang.Object columnKey);

    boolean containsRow(@javax.annotation.CheckForNull java.lang.Object rowKey);

    boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value);

    boolean equals(@javax.annotation.CheckForNull java.lang.Object obj);

    @javax.annotation.CheckForNull
    V get(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey);

    int hashCode();

    boolean isEmpty();

    @javax.annotation.CheckForNull
    V put(@com.google.common.collect.ParametricNullness R rowKey, @com.google.common.collect.ParametricNullness C columnKey, @com.google.common.collect.ParametricNullness V value);

    void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table);

    @javax.annotation.CheckForNull
    V remove(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey);

    java.util.Map<C, V> row(@com.google.common.collect.ParametricNullness R rowKey);

    java.util.Set<R> rowKeySet();

    java.util.Map<R, java.util.Map<C, V>> rowMap();

    int size();

    java.util.Collection<V> values();
}
