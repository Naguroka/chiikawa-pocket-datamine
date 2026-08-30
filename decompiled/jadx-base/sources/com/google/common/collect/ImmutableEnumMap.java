package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ImmutableEnumMap<K extends java.lang.Enum<K>, V> extends com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap<K, V> {
    private final transient java.util.EnumMap<K, V> delegate;

    @Override // com.google.common.collect.ImmutableMap
    boolean isPartialView() {
        return false;
    }

    static <K extends java.lang.Enum<K>, V> com.google.common.collect.ImmutableMap<K, V> asImmutable(java.util.EnumMap<K, V> map) {
        int size = map.size();
        if (size == 0) {
            return com.google.common.collect.ImmutableMap.of();
        }
        if (size == 1) {
            java.util.Map.Entry entry = (java.util.Map.Entry) com.google.common.collect.Iterables.getOnlyElement(map.entrySet());
            return com.google.common.collect.ImmutableMap.of((java.lang.Enum) entry.getKey(), entry.getValue());
        }
        return new com.google.common.collect.ImmutableEnumMap(map);
    }

    private ImmutableEnumMap(java.util.EnumMap<K, V> delegate) {
        this.delegate = delegate;
        com.google.common.base.Preconditions.checkArgument(!delegate.isEmpty());
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.UnmodifiableIterator<K> keyIterator() {
        return com.google.common.collect.Iterators.unmodifiableIterator(this.delegate.keySet().iterator());
    }

    @Override // java.util.Map
    public int size() {
        return this.delegate.size();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return this.delegate.containsKey(key);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object key) {
        return this.delegate.get(key);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof com.google.common.collect.ImmutableEnumMap) {
            object = ((com.google.common.collect.ImmutableEnumMap) object).delegate;
        }
        return this.delegate.equals(object);
    }

    @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
    com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> entryIterator() {
        return com.google.common.collect.Maps.unmodifiableEntryIterator(this.delegate.entrySet().iterator());
    }

    @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableEnumMap.EnumSerializedForm(this.delegate);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use EnumSerializedForm");
    }

    private static class EnumSerializedForm<K extends java.lang.Enum<K>, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.EnumMap<K, V> delegate;

        EnumSerializedForm(java.util.EnumMap<K, V> delegate) {
            this.delegate = delegate;
        }

        java.lang.Object readResolve() {
            return new com.google.common.collect.ImmutableEnumMap(this.delegate);
        }
    }
}
