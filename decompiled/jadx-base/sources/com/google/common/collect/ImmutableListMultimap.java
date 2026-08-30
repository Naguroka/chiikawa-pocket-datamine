package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public class ImmutableListMultimap<K, V> extends com.google.common.collect.ImmutableMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {
    private static final long serialVersionUID = 0;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableListMultimap<V, K> inverse;

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableListMultimap<K, V>> toImmutableListMultimap(java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends V> valueFunction) {
        return com.google.common.collect.CollectCollectors.toImmutableListMultimap(keyFunction, valueFunction);
    }

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableListMultimap<K, V>> flatteningToImmutableListMultimap(java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>> valuesFunction) {
        return com.google.common.collect.CollectCollectors.flatteningToImmutableListMultimap(keyFunction, valuesFunction);
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of() {
        return com.google.common.collect.EmptyImmutableListMultimap.INSTANCE;
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K k1, V v1) {
        com.google.common.collect.ImmutableListMultimap.Builder builder = builder();
        builder.put((java.lang.Object) k1, (java.lang.Object) v1);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K k1, V v1, K k2, V v2) {
        com.google.common.collect.ImmutableListMultimap.Builder builder = builder();
        builder.put((java.lang.Object) k1, (java.lang.Object) v1);
        builder.put((java.lang.Object) k2, (java.lang.Object) v2);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) {
        com.google.common.collect.ImmutableListMultimap.Builder builder = builder();
        builder.put((java.lang.Object) k1, (java.lang.Object) v1);
        builder.put((java.lang.Object) k2, (java.lang.Object) v2);
        builder.put((java.lang.Object) k3, (java.lang.Object) v3);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        com.google.common.collect.ImmutableListMultimap.Builder builder = builder();
        builder.put((java.lang.Object) k1, (java.lang.Object) v1);
        builder.put((java.lang.Object) k2, (java.lang.Object) v2);
        builder.put((java.lang.Object) k3, (java.lang.Object) v3);
        builder.put((java.lang.Object) k4, (java.lang.Object) v4);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        com.google.common.collect.ImmutableListMultimap.Builder builder = builder();
        builder.put((java.lang.Object) k1, (java.lang.Object) v1);
        builder.put((java.lang.Object) k2, (java.lang.Object) v2);
        builder.put((java.lang.Object) k3, (java.lang.Object) v3);
        builder.put((java.lang.Object) k4, (java.lang.Object) v4);
        builder.put((java.lang.Object) k5, (java.lang.Object) v5);
        return builder.build();
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap.Builder<K, V> builder() {
        return new com.google.common.collect.ImmutableListMultimap.Builder<>();
    }

    public static final class Builder<K, V> extends com.google.common.collect.ImmutableMultimap.Builder<K, V> {
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> put(K key, V value) {
            super.put((java.lang.Object) key, (java.lang.Object) value);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> entry) {
            super.put((java.util.Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> entries) {
            super.putAll((java.lang.Iterable) entries);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> putAll(K key, java.lang.Iterable<? extends V> values) {
            super.putAll((java.lang.Object) key, (java.lang.Iterable) values);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> putAll(K key, V... values) {
            super.putAll((java.lang.Object) key, (java.lang.Object[]) values);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
            super.putAll((com.google.common.collect.Multimap) multimap);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> combine(com.google.common.collect.ImmutableMultimap.Builder<K, V> other) {
            super.combine((com.google.common.collect.ImmutableMultimap.Builder) other);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> orderKeysBy(java.util.Comparator<? super K> keyComparator) {
            super.orderKeysBy((java.util.Comparator) keyComparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> orderValuesBy(java.util.Comparator<? super V> valueComparator) {
            super.orderValuesBy((java.util.Comparator) valueComparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableListMultimap<K, V> build() {
            return (com.google.common.collect.ImmutableListMultimap) super.build();
        }
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        if (multimap.isEmpty()) {
            return of();
        }
        if (multimap instanceof com.google.common.collect.ImmutableListMultimap) {
            com.google.common.collect.ImmutableListMultimap<K, V> immutableListMultimap = (com.google.common.collect.ImmutableListMultimap) multimap;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(multimap.asMap().entrySet(), null);
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> entries) {
        return new com.google.common.collect.ImmutableListMultimap.Builder().putAll((java.lang.Iterable) entries).build();
    }

    static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> fromMapEntries(java.util.Collection<? extends java.util.Map.Entry<? extends K, ? extends java.util.Collection<? extends V>>> mapEntries, @javax.annotation.CheckForNull java.util.Comparator<? super V> valueComparator) {
        com.google.common.collect.ImmutableList immutableListSortedCopyOf;
        if (mapEntries.isEmpty()) {
            return of();
        }
        com.google.common.collect.ImmutableMap.Builder builder = new com.google.common.collect.ImmutableMap.Builder(mapEntries.size());
        int size = 0;
        for (java.util.Map.Entry<? extends K, ? extends java.util.Collection<? extends V>> entry : mapEntries) {
            K key = entry.getKey();
            java.util.Collection<? extends V> value = entry.getValue();
            if (valueComparator == null) {
                immutableListSortedCopyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) value);
            } else {
                immutableListSortedCopyOf = com.google.common.collect.ImmutableList.sortedCopyOf(valueComparator, value);
            }
            if (!immutableListSortedCopyOf.isEmpty()) {
                builder.put(key, immutableListSortedCopyOf);
                size += immutableListSortedCopyOf.size();
            }
        }
        return new com.google.common.collect.ImmutableListMultimap<>(builder.buildOrThrow(), size);
    }

    ImmutableListMultimap(com.google.common.collect.ImmutableMap<K, com.google.common.collect.ImmutableList<V>> map, int size) {
        super(map, size);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public com.google.common.collect.ImmutableList<V> get(K key) {
        com.google.common.collect.ImmutableList<V> immutableList = (com.google.common.collect.ImmutableList) this.map.get(key);
        return immutableList == null ? com.google.common.collect.ImmutableList.of() : immutableList;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public com.google.common.collect.ImmutableListMultimap<V, K> inverse() {
        com.google.common.collect.ImmutableListMultimap<V, K> immutableListMultimap = this.inverse;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        com.google.common.collect.ImmutableListMultimap<V, K> immutableListMultimapInvert = invert();
        this.inverse = immutableListMultimapInvert;
        return immutableListMultimapInvert;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.google.common.collect.ImmutableListMultimap<V, K> invert() {
        com.google.common.collect.ImmutableListMultimap.Builder builder = builder();
        com.google.common.collect.UnmodifiableIterator it = entries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            builder.put(entry.getValue(), entry.getKey());
        }
        com.google.common.collect.ImmutableListMultimap<V, K> immutableListMultimapBuild = builder.build();
        immutableListMultimapBuild.inverse = this;
        return immutableListMultimapBuild;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public final com.google.common.collect.ImmutableList<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @java.lang.Deprecated
    public final com.google.common.collect.ImmutableList<V> replaceValues(K key, java.lang.Iterable<? extends V> values) {
        throw new java.lang.UnsupportedOperationException();
    }

    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.defaultWriteObject();
        com.google.common.collect.Serialization.writeMultimap(this, stream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(java.io.ObjectInputStream stream) throws java.lang.ClassNotFoundException, java.io.IOException {
        stream.defaultReadObject();
        int i = stream.readInt();
        if (i < 0) {
            throw new java.io.InvalidObjectException("Invalid key count " + i);
        }
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object objRequireNonNull = java.util.Objects.requireNonNull(stream.readObject());
            int i4 = stream.readInt();
            if (i4 <= 0) {
                throw new java.io.InvalidObjectException("Invalid value count " + i4);
            }
            com.google.common.collect.ImmutableList.Builder builder2 = com.google.common.collect.ImmutableList.builder();
            for (int i5 = 0; i5 < i4; i5++) {
                builder2.add(java.util.Objects.requireNonNull(stream.readObject()));
            }
            builder.put(objRequireNonNull, builder2.build());
            i2 += i4;
        }
        try {
            com.google.common.collect.ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER.set(this, builder.buildOrThrow());
            com.google.common.collect.ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER.set(this, i2);
        } catch (java.lang.IllegalArgumentException e) {
            throw ((java.io.InvalidObjectException) new java.io.InvalidObjectException(e.getMessage()).initCause(e));
        }
    }
}
