package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingTable<R, C, V> extends com.google.common.collect.ForwardingObject implements com.google.common.collect.Table<R, C, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract com.google.common.collect.Table<R, C, V> delegate();

    protected ForwardingTable() {
    }

    @Override // com.google.common.collect.Table
    public java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
        return delegate().cellSet();
    }

    @Override // com.google.common.collect.Table
    public void clear() {
        delegate().clear();
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<R, V> column(@com.google.common.collect.ParametricNullness C columnKey) {
        return delegate().column(columnKey);
    }

    @Override // com.google.common.collect.Table
    public java.util.Set<C> columnKeySet() {
        return delegate().columnKeySet();
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<C, java.util.Map<R, V>> columnMap() {
        return delegate().columnMap();
    }

    @Override // com.google.common.collect.Table
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
        return delegate().contains(rowKey, columnKey);
    }

    @Override // com.google.common.collect.Table
    public boolean containsColumn(@javax.annotation.CheckForNull java.lang.Object columnKey) {
        return delegate().containsColumn(columnKey);
    }

    @Override // com.google.common.collect.Table
    public boolean containsRow(@javax.annotation.CheckForNull java.lang.Object rowKey) {
        return delegate().containsRow(rowKey);
    }

    @Override // com.google.common.collect.Table
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return delegate().containsValue(value);
    }

    @Override // com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
        return delegate().get(rowKey, columnKey);
    }

    @Override // com.google.common.collect.Table
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V put(@com.google.common.collect.ParametricNullness R rowKey, @com.google.common.collect.ParametricNullness C columnKey, @com.google.common.collect.ParametricNullness V value) {
        return delegate().put(rowKey, columnKey, value);
    }

    @Override // com.google.common.collect.Table
    public void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
        delegate().putAll(table);
    }

    @Override // com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V remove(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
        return delegate().remove(rowKey, columnKey);
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<C, V> row(@com.google.common.collect.ParametricNullness R rowKey) {
        return delegate().row(rowKey);
    }

    @Override // com.google.common.collect.Table
    public java.util.Set<R> rowKeySet() {
        return delegate().rowKeySet();
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<R, java.util.Map<C, V>> rowMap() {
        return delegate().rowMap();
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return delegate().size();
    }

    @Override // com.google.common.collect.Table
    public java.util.Collection<V> values() {
        return delegate().values();
    }

    @Override // com.google.common.collect.Table
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // com.google.common.collect.Table
    public int hashCode() {
        return delegate().hashCode();
    }
}
