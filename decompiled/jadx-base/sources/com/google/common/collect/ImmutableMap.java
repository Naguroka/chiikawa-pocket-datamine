package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use ImmutableMap.of or another implementation")
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableMap<K, V> implements java.util.Map<K, V>, java.io.Serializable {
    static final java.util.Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new java.util.Map.Entry[0];
    private static final long serialVersionUID = 912559;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entrySet;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSet<K> keySet;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSetMultimap<K, V> multimapView;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableCollection<V> values;

    abstract com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet();

    abstract com.google.common.collect.ImmutableSet<K> createKeySet();

    abstract com.google.common.collect.ImmutableCollection<V> createValues();

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public abstract V get(@javax.annotation.CheckForNull java.lang.Object key);

    boolean isHashCodeFast() {
        return false;
    }

    abstract boolean isPartialView();

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableMap(java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends V> valueFunction) {
        return com.google.common.collect.CollectCollectors.toImmutableMap(keyFunction, valueFunction);
    }

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableMap(java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction) {
        return com.google.common.collect.CollectCollectors.toImmutableMap(keyFunction, valueFunction, mergeFunction);
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of() {
        return (com.google.common.collect.ImmutableMap<K, V>) com.google.common.collect.RegularImmutableMap.EMPTY;
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k1, V v1) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        return com.google.common.collect.RegularImmutableMap.create(1, new java.lang.Object[]{k1, v1});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k1, V v1, K k2, V v2) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        return com.google.common.collect.RegularImmutableMap.create(2, new java.lang.Object[]{k1, v1, k2, v2});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        return com.google.common.collect.RegularImmutableMap.create(3, new java.lang.Object[]{k1, v1, k2, v2, k3, v3});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        return com.google.common.collect.RegularImmutableMap.create(4, new java.lang.Object[]{k1, v1, k2, v2, k3, v3, k4, v4});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        return com.google.common.collect.RegularImmutableMap.create(5, new java.lang.Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k6, v6);
        return com.google.common.collect.RegularImmutableMap.create(6, new java.lang.Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k6, v6);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k7, v7);
        return com.google.common.collect.RegularImmutableMap.create(7, new java.lang.Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k6, v6);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k7, v7);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k8, v8);
        return com.google.common.collect.RegularImmutableMap.create(8, new java.lang.Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k1, v1);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k2, v2);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k3, v3);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k4, v4);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k5, v5);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k6, v6);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k7, v7);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k8, v8);
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(k9, v9);
        return com.google.common.collect.RegularImmutableMap.create(9, new java.lang.Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9});
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
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
        return com.google.common.collect.RegularImmutableMap.create(10, new java.lang.Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10});
    }

    @java.lang.SafeVarargs
    public static <K, V> com.google.common.collect.ImmutableMap<K, V> ofEntries(java.util.Map.Entry<? extends K, ? extends V>... entries) {
        return copyOf(java.util.Arrays.asList(entries));
    }

    static <K, V> java.util.Map.Entry<K, V> entryOf(K key, V value) {
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(key, value);
        return new java.util.AbstractMap.SimpleImmutableEntry(key, value);
    }

    public static <K, V> com.google.common.collect.ImmutableMap.Builder<K, V> builder() {
        return new com.google.common.collect.ImmutableMap.Builder<>();
    }

    public static <K, V> com.google.common.collect.ImmutableMap.Builder<K, V> builderWithExpectedSize(int expectedSize) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(expectedSize, "expectedSize");
        return new com.google.common.collect.ImmutableMap.Builder<>(expectedSize);
    }

    static void checkNoConflict(boolean safe, java.lang.String conflictDescription, java.lang.Object entry1, java.lang.Object entry2) {
        if (!safe) {
            throw conflictException(conflictDescription, entry1, entry2);
        }
    }

    static java.lang.IllegalArgumentException conflictException(java.lang.String conflictDescription, java.lang.Object entry1, java.lang.Object entry2) {
        return new java.lang.IllegalArgumentException("Multiple entries with same " + conflictDescription + ": " + entry1 + " and " + entry2);
    }

    @com.google.errorprone.annotations.DoNotMock
    public static class Builder<K, V> {
        java.lang.Object[] alternatingKeysAndValues;
        com.google.common.collect.ImmutableMap.Builder.DuplicateKey duplicateKey;
        boolean entriesUsed;
        int size;

        @javax.annotation.CheckForNull
        java.util.Comparator<? super V> valueComparator;

        public Builder() {
            this(4);
        }

        Builder(int initialCapacity) {
            this.alternatingKeysAndValues = new java.lang.Object[initialCapacity * 2];
            this.size = 0;
            this.entriesUsed = false;
        }

        private void ensureCapacity(int minCapacity) {
            int i = minCapacity * 2;
            java.lang.Object[] objArr = this.alternatingKeysAndValues;
            if (i > objArr.length) {
                this.alternatingKeysAndValues = java.util.Arrays.copyOf(objArr, com.google.common.collect.ImmutableCollection.Builder.expandedCapacity(objArr.length, i));
                this.entriesUsed = false;
            }
        }

        public com.google.common.collect.ImmutableMap.Builder<K, V> put(K key, V value) {
            ensureCapacity(this.size + 1);
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(key, value);
            java.lang.Object[] objArr = this.alternatingKeysAndValues;
            int i = this.size;
            objArr[i * 2] = key;
            objArr[(i * 2) + 1] = value;
            this.size = i + 1;
            return this;
        }

        public com.google.common.collect.ImmutableMap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }

        public com.google.common.collect.ImmutableMap.Builder<K, V> putAll(java.util.Map<? extends K, ? extends V> map) {
            return putAll(map.entrySet());
        }

        public com.google.common.collect.ImmutableMap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> entries) {
            if (entries instanceof java.util.Collection) {
                ensureCapacity(this.size + ((java.util.Collection) entries).size());
            }
            java.util.Iterator<? extends java.util.Map.Entry<? extends K, ? extends V>> it = entries.iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        public com.google.common.collect.ImmutableMap.Builder<K, V> orderEntriesByValue(java.util.Comparator<? super V> valueComparator) {
            com.google.common.base.Preconditions.checkState(this.valueComparator == null, "valueComparator was already set");
            this.valueComparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(valueComparator, "valueComparator");
            return this;
        }

        com.google.common.collect.ImmutableMap.Builder<K, V> combine(com.google.common.collect.ImmutableMap.Builder<K, V> other) {
            com.google.common.base.Preconditions.checkNotNull(other);
            ensureCapacity(this.size + other.size);
            java.lang.System.arraycopy(other.alternatingKeysAndValues, 0, this.alternatingKeysAndValues, this.size * 2, other.size * 2);
            this.size += other.size;
            return this;
        }

        private com.google.common.collect.ImmutableMap<K, V> build(boolean throwIfDuplicateKeys) {
            java.lang.Object[] objArrLastEntryForEachKey;
            com.google.common.collect.ImmutableMap.Builder.DuplicateKey duplicateKey;
            com.google.common.collect.ImmutableMap.Builder.DuplicateKey duplicateKey2;
            if (throwIfDuplicateKeys && (duplicateKey2 = this.duplicateKey) != null) {
                throw duplicateKey2.exception();
            }
            int length = this.size;
            if (this.valueComparator == null) {
                objArrLastEntryForEachKey = this.alternatingKeysAndValues;
            } else {
                if (this.entriesUsed) {
                    this.alternatingKeysAndValues = java.util.Arrays.copyOf(this.alternatingKeysAndValues, length * 2);
                }
                objArrLastEntryForEachKey = this.alternatingKeysAndValues;
                if (!throwIfDuplicateKeys) {
                    objArrLastEntryForEachKey = lastEntryForEachKey(objArrLastEntryForEachKey, this.size);
                    if (objArrLastEntryForEachKey.length < this.alternatingKeysAndValues.length) {
                        length = objArrLastEntryForEachKey.length >>> 1;
                    }
                }
                sortEntries(objArrLastEntryForEachKey, length, this.valueComparator);
            }
            this.entriesUsed = true;
            com.google.common.collect.RegularImmutableMap regularImmutableMapCreate = com.google.common.collect.RegularImmutableMap.create(length, objArrLastEntryForEachKey, this);
            if (!throwIfDuplicateKeys || (duplicateKey = this.duplicateKey) == null) {
                return regularImmutableMapCreate;
            }
            throw duplicateKey.exception();
        }

        public com.google.common.collect.ImmutableMap<K, V> build() {
            return buildOrThrow();
        }

        public com.google.common.collect.ImmutableMap<K, V> buildOrThrow() {
            return build(true);
        }

        public com.google.common.collect.ImmutableMap<K, V> buildKeepingLast() {
            return build(false);
        }

        static <V> void sortEntries(java.lang.Object[] alternatingKeysAndValues, int size, java.util.Comparator<? super V> valueComparator) {
            java.util.Map.Entry[] entryArr = new java.util.Map.Entry[size];
            for (int i = 0; i < size; i++) {
                int i2 = i * 2;
                entryArr[i] = new java.util.AbstractMap.SimpleImmutableEntry(java.util.Objects.requireNonNull(alternatingKeysAndValues[i2]), java.util.Objects.requireNonNull(alternatingKeysAndValues[i2 + 1]));
            }
            java.util.Arrays.sort(entryArr, 0, size, com.google.common.collect.Ordering.from(valueComparator).onResultOf(com.google.common.collect.Maps.valueFunction()));
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = i3 * 2;
                alternatingKeysAndValues[i4] = entryArr[i3].getKey();
                alternatingKeysAndValues[i4 + 1] = entryArr[i3].getValue();
            }
        }

        private java.lang.Object[] lastEntryForEachKey(java.lang.Object[] localAlternatingKeysAndValues, int size) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.BitSet bitSet = new java.util.BitSet();
            for (int i = size - 1; i >= 0; i--) {
                if (!hashSet.add(java.util.Objects.requireNonNull(localAlternatingKeysAndValues[i * 2]))) {
                    bitSet.set(i);
                }
            }
            if (bitSet.isEmpty()) {
                return localAlternatingKeysAndValues;
            }
            java.lang.Object[] objArr = new java.lang.Object[(size - bitSet.cardinality()) * 2];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size * 2) {
                if (bitSet.get(i2 >>> 1)) {
                    i2 += 2;
                } else {
                    int i4 = i3 + 1;
                    int i5 = i2 + 1;
                    objArr[i3] = java.util.Objects.requireNonNull(localAlternatingKeysAndValues[i2]);
                    i3 = i4 + 1;
                    i2 = i5 + 1;
                    objArr[i4] = java.util.Objects.requireNonNull(localAlternatingKeysAndValues[i5]);
                }
            }
            return objArr;
        }

        static final class DuplicateKey {
            private final java.lang.Object key;
            private final java.lang.Object value1;
            private final java.lang.Object value2;

            DuplicateKey(java.lang.Object key, java.lang.Object value1, java.lang.Object value2) {
                this.key = key;
                this.value1 = value1;
                this.value2 = value2;
            }

            java.lang.IllegalArgumentException exception() {
                return new java.lang.IllegalArgumentException("Multiple entries with same key: " + this.key + com.ironsource.y8.i.b + this.value1 + " and " + this.key + com.ironsource.y8.i.b + this.value2);
            }
        }
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> map) {
        if ((map instanceof com.google.common.collect.ImmutableMap) && !(map instanceof java.util.SortedMap)) {
            com.google.common.collect.ImmutableMap<K, V> immutableMap = (com.google.common.collect.ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> entries) {
        com.google.common.collect.ImmutableMap.Builder builder = new com.google.common.collect.ImmutableMap.Builder(entries instanceof java.util.Collection ? ((java.util.Collection) entries).size() : 4);
        builder.putAll(entries);
        return builder.build();
    }

    static abstract class IteratorBasedImmutableMap<K, V> extends com.google.common.collect.ImmutableMap<K, V> {
        abstract com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> entryIterator();

        IteratorBasedImmutableMap() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ java.util.Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ java.util.Set keySet() {
            return super.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ java.util.Collection values() {
            return super.values();
        }

        @Override // com.google.common.collect.ImmutableMap
        com.google.common.collect.ImmutableSet<K> createKeySet() {
            return new com.google.common.collect.ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
            return new com.google.common.collect.ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                @Override // com.google.common.collect.ImmutableMapEntrySet
                com.google.common.collect.ImmutableMap<K, V> map() {
                    return com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.this;
                }

                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
                public com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
                    return com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.this.entryIterator();
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
                java.lang.Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap
        com.google.common.collect.ImmutableCollection<V> createValues() {
            return new com.google.common.collect.ImmutableMapValues(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    ImmutableMap() {
    }

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final V put(K k, V v) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final V remove(@javax.annotation.CheckForNull java.lang.Object o) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return get(key) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return values().contains(value);
    }

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public final V getOrDefault(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull V defaultValue) {
        V v = get(key);
        return v != null ? v : defaultValue;
    }

    @Override // java.util.Map
    public com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entrySet() {
        com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> immutableSetCreateEntrySet = createEntrySet();
        this.entrySet = immutableSetCreateEntrySet;
        return immutableSetCreateEntrySet;
    }

    @Override // java.util.Map
    public com.google.common.collect.ImmutableSet<K> keySet() {
        com.google.common.collect.ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        com.google.common.collect.ImmutableSet<K> immutableSetCreateKeySet = createKeySet();
        this.keySet = immutableSetCreateKeySet;
        return immutableSetCreateKeySet;
    }

    com.google.common.collect.UnmodifiableIterator<K> keyIterator() {
        final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> it = entrySet().iterator();
        return new com.google.common.collect.UnmodifiableIterator<K>(this) { // from class: com.google.common.collect.ImmutableMap.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return (K) ((java.util.Map.Entry) it.next()).getKey();
            }
        };
    }

    @Override // java.util.Map, com.google.common.collect.BiMap
    public com.google.common.collect.ImmutableCollection<V> values() {
        com.google.common.collect.ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        com.google.common.collect.ImmutableCollection<V> immutableCollectionCreateValues = createValues();
        this.values = immutableCollectionCreateValues;
        return immutableCollectionCreateValues;
    }

    public com.google.common.collect.ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return com.google.common.collect.ImmutableSetMultimap.of();
        }
        com.google.common.collect.ImmutableSetMultimap<K, V> immutableSetMultimap = this.multimapView;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        com.google.common.collect.ImmutableSetMultimap<K, V> immutableSetMultimap2 = new com.google.common.collect.ImmutableSetMultimap<>(new com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets(), size(), null);
        this.multimapView = immutableSetMultimap2;
        return immutableSetMultimap2;
    }

    private final class MapViewOfValuesAsSingletonSets extends com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap<K, com.google.common.collect.ImmutableSet<V>> {
        private MapViewOfValuesAsSingletonSets() {
        }

        @Override // java.util.Map
        public int size() {
            return com.google.common.collect.ImmutableMap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        com.google.common.collect.ImmutableSet<K> createKeySet() {
            return com.google.common.collect.ImmutableMap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return com.google.common.collect.ImmutableMap.this.containsKey(key);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        @javax.annotation.CheckForNull
        public com.google.common.collect.ImmutableSet<V> get(@javax.annotation.CheckForNull java.lang.Object key) {
            java.lang.Object obj = com.google.common.collect.ImmutableMap.this.get(key);
            if (obj == null) {
                return null;
            }
            return com.google.common.collect.ImmutableSet.of(obj);
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean isPartialView() {
            return com.google.common.collect.ImmutableMap.this.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
            return com.google.common.collect.ImmutableMap.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean isHashCodeFast() {
            return com.google.common.collect.ImmutableMap.this.isHashCodeFast();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, com.google.common.collect.ImmutableSet<V>>> entryIterator() {
            final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> it = com.google.common.collect.ImmutableMap.this.entrySet().iterator();
            return new com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, com.google.common.collect.ImmutableSet<V>>>(this) { // from class: com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1
                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public java.util.Map.Entry<K, com.google.common.collect.ImmutableSet<V>> next() {
                    final java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    return new com.google.common.collect.AbstractMapEntry<K, com.google.common.collect.ImmutableSet<V>>(this) { // from class: com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1.1
                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public K getKey() {
                            return (K) entry.getKey();
                        }

                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public com.google.common.collect.ImmutableSet<V> getValue() {
                            return com.google.common.collect.ImmutableSet.of(entry.getValue());
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // java.util.Map
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return com.google.common.collect.Maps.equalsImpl(this, object);
    }

    @Override // java.util.Map
    public int hashCode() {
        return com.google.common.collect.Sets.hashCodeImpl(entrySet());
    }

    public java.lang.String toString() {
        return com.google.common.collect.Maps.toStringImpl(this);
    }

    static class SerializedForm<K, V> implements java.io.Serializable {
        private static final boolean USE_LEGACY_SERIALIZATION = true;
        private static final long serialVersionUID = 0;
        private final java.lang.Object keys;
        private final java.lang.Object values;

        SerializedForm(com.google.common.collect.ImmutableMap<K, V> map) {
            java.lang.Object[] objArr = new java.lang.Object[map.size()];
            java.lang.Object[] objArr2 = new java.lang.Object[map.size()];
            com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                java.util.Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        final java.lang.Object readResolve() {
            java.lang.Object obj = this.keys;
            if (!(obj instanceof com.google.common.collect.ImmutableSet)) {
                return legacyReadResolve();
            }
            com.google.common.collect.ImmutableSet immutableSet = (com.google.common.collect.ImmutableSet) obj;
            com.google.common.collect.ImmutableCollection immutableCollection = (com.google.common.collect.ImmutableCollection) this.values;
            com.google.common.collect.ImmutableMap.Builder<K, V> builderMakeBuilder = makeBuilder(immutableSet.size());
            com.google.common.collect.UnmodifiableIterator it = immutableSet.iterator();
            com.google.common.collect.UnmodifiableIterator it2 = immutableCollection.iterator();
            while (it.hasNext()) {
                builderMakeBuilder.put(it.next(), it2.next());
            }
            return builderMakeBuilder.buildOrThrow();
        }

        /* JADX WARN: Multi-variable type inference failed */
        final java.lang.Object legacyReadResolve() {
            java.lang.Object[] objArr = (java.lang.Object[]) this.keys;
            java.lang.Object[] objArr2 = (java.lang.Object[]) this.values;
            com.google.common.collect.ImmutableMap.Builder<K, V> builderMakeBuilder = makeBuilder(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                builderMakeBuilder.put(objArr[i], objArr2[i]);
            }
            return builderMakeBuilder.buildOrThrow();
        }

        com.google.common.collect.ImmutableMap.Builder<K, V> makeBuilder(int size) {
            return new com.google.common.collect.ImmutableMap.Builder<>(size);
        }
    }

    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableMap.SerializedForm(this);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }
}
