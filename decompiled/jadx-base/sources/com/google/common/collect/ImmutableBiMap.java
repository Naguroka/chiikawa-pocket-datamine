package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableBiMap<K, V> extends com.google.common.collect.ImmutableMap<K, V> implements com.google.common.collect.BiMap<K, V> {
    private static final long serialVersionUID = 912559;

    @Override // com.google.common.collect.BiMap
    public abstract com.google.common.collect.ImmutableBiMap<V, K> inverse();

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableBiMap<K, V>> toImmutableBiMap(java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends V> valueFunction) {
        return com.google.common.collect.CollectCollectors.toImmutableBiMap(keyFunction, valueFunction);
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of() {
        return com.google.common.collect.RegularImmutableBiMap.EMPTY;
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K k1, V v1) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        return new com.google.common.collect.RegularImmutableBiMap(new java.lang.Object[]{k1, v1}, 1);
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K k1, V v1, K k2, V v2) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        return new com.google.common.collect.RegularImmutableBiMap(new java.lang.Object[]{k1, v1, k2, v2}, 2);
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        return new com.google.common.collect.RegularImmutableBiMap(new java.lang.Object[]{k1, v1, k2, v2, k3, v3}, 3);
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        return new com.google.common.collect.RegularImmutableBiMap(new java.lang.Object[]{k1, v1, k2, v2, k3, v3, k4, v4}, 4);
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        return new com.google.common.collect.RegularImmutableBiMap(new java.lang.Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5}, 5);
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k6, v6);
        return new com.google.common.collect.RegularImmutableBiMap(new java.lang.Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6}, 6);
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k6, v6);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k7, v7);
        return new com.google.common.collect.RegularImmutableBiMap(new java.lang.Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7}, 7);
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k6, v6);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k7, v7);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k8, v8);
        return new com.google.common.collect.RegularImmutableBiMap(new java.lang.Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8}, 8);
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k6, v6);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k7, v7);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k8, v8);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k9, v9);
        return new com.google.common.collect.RegularImmutableBiMap(new java.lang.Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9}, 9);
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k6, v6);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k7, v7);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k8, v8);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k9, v9);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k10, v10);
        return new com.google.common.collect.RegularImmutableBiMap(new java.lang.Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10}, 10);
    }

    @java.lang.SafeVarargs
    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> ofEntries(java.util.Map.Entry<? extends K, ? extends V>... entries) {
        return copyOf((java.lang.Iterable) java.util.Arrays.asList(entries));
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap.Builder<K, V> builder() {
        return new com.google.common.collect.ImmutableBiMap.Builder<>();
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap.Builder<K, V> builderWithExpectedSize(int expectedSize) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(expectedSize, "expectedSize");
        return new com.google.common.collect.ImmutableBiMap.Builder<>(expectedSize);
    }

    public static final class Builder<K, V> extends com.google.common.collect.ImmutableMap.Builder<K, V> {
        public Builder() {
        }

        Builder(int size) {
            super(size);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableBiMap.Builder<K, V> put(K key, V value) {
            super.put((java.lang.Object) key, (java.lang.Object) value);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableBiMap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> entry) {
            super.put((java.util.Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableBiMap.Builder<K, V> putAll(java.util.Map<? extends K, ? extends V> map) {
            super.putAll((java.util.Map) map);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableBiMap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> entries) {
            super.putAll((java.lang.Iterable) entries);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableBiMap.Builder<K, V> orderEntriesByValue(java.util.Comparator<? super V> valueComparator) {
            super.orderEntriesByValue((java.util.Comparator) valueComparator);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableBiMap.Builder<K, V> combine(com.google.common.collect.ImmutableMap.Builder<K, V> builder) {
            super.combine((com.google.common.collect.ImmutableMap.Builder) builder);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableBiMap<K, V> build() {
            return buildOrThrow();
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableBiMap<K, V> buildOrThrow() {
            if (this.size == 0) {
                return com.google.common.collect.ImmutableBiMap.of();
            }
            if (this.valueComparator != null) {
                if (this.entriesUsed) {
                    this.alternatingKeysAndValues = java.util.Arrays.copyOf(this.alternatingKeysAndValues, this.size * 2);
                }
                sortEntries(this.alternatingKeysAndValues, this.size, this.valueComparator);
            }
            this.entriesUsed = true;
            return new com.google.common.collect.RegularImmutableBiMap(this.alternatingKeysAndValues, this.size);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @java.lang.Deprecated
        public com.google.common.collect.ImmutableBiMap<K, V> buildKeepingLast() {
            throw new java.lang.UnsupportedOperationException("Not supported for bimaps");
        }
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> map) {
        if (map instanceof com.google.common.collect.ImmutableBiMap) {
            com.google.common.collect.ImmutableBiMap<K, V> immutableBiMap = (com.google.common.collect.ImmutableBiMap) map;
            if (!immutableBiMap.isPartialView()) {
                return immutableBiMap;
            }
        }
        return copyOf((java.lang.Iterable) map.entrySet());
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> entries) {
        return new com.google.common.collect.ImmutableBiMap.Builder(entries instanceof java.util.Collection ? ((java.util.Collection) entries).size() : 4).putAll((java.lang.Iterable) entries).build();
    }

    ImmutableBiMap() {
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public com.google.common.collect.ImmutableSet<V> values() {
        return inverse().keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableMap
    public final com.google.common.collect.ImmutableSet<V> createValues() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.BiMap
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final V forcePut(K key, V value) {
        throw new java.lang.UnsupportedOperationException();
    }

    private static class SerializedForm<K, V> extends com.google.common.collect.ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        SerializedForm(com.google.common.collect.ImmutableBiMap<K, V> bimap) {
            super(bimap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public com.google.common.collect.ImmutableBiMap.Builder<K, V> makeBuilder(int size) {
            return new com.google.common.collect.ImmutableBiMap.Builder<>(size);
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableBiMap.SerializedForm(this);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @java.lang.Deprecated
    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableMap(java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends V> valueFunction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableMap(java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction) {
        throw new java.lang.UnsupportedOperationException();
    }
}
