package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class ImmutableSortedMap<K, V> extends com.google.common.collect.ImmutableMap<K, V> implements java.util.NavigableMap<K, V> {
    private static final long serialVersionUID = 0;

    @javax.annotation.CheckForNull
    private transient com.google.common.collect.ImmutableSortedMap<K, V> descendingMap;
    private final transient com.google.common.collect.RegularImmutableSortedSet<K> keySet;
    private final transient com.google.common.collect.ImmutableList<V> valueList;
    private static final java.util.Comparator<java.lang.Comparable> NATURAL_ORDER = com.google.common.collect.Ordering.natural();
    private static final com.google.common.collect.ImmutableSortedMap<java.lang.Comparable, java.lang.Object> NATURAL_EMPTY_MAP = new com.google.common.collect.ImmutableSortedMap<>(com.google.common.collect.ImmutableSortedSet.emptySet(com.google.common.collect.Ordering.natural()), com.google.common.collect.ImmutableList.of());

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSortedMap<K, V>> toImmutableSortedMap(java.util.Comparator<? super K> comparator, java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends V> valueFunction) {
        return com.google.common.collect.CollectCollectors.toImmutableSortedMap(comparator, keyFunction, valueFunction);
    }

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSortedMap<K, V>> toImmutableSortedMap(java.util.Comparator<? super K> comparator, java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction) {
        return com.google.common.collect.CollectCollectors.toImmutableSortedMap(comparator, keyFunction, valueFunction, mergeFunction);
    }

    static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> emptyMap(java.util.Comparator<? super K> comparator) {
        if (com.google.common.collect.Ordering.natural().equals(comparator)) {
            return of();
        }
        return new com.google.common.collect.ImmutableSortedMap<>(com.google.common.collect.ImmutableSortedSet.emptySet(comparator), com.google.common.collect.ImmutableList.of());
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of() {
        return (com.google.common.collect.ImmutableSortedMap<K, V>) NATURAL_EMPTY_MAP;
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable k1, java.lang.Object v1) {
        return of(com.google.common.collect.Ordering.natural(), k1, v1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(java.util.Comparator<? super K> comparator, K k1, V v1) {
        return new com.google.common.collect.ImmutableSortedMap<>(new com.google.common.collect.RegularImmutableSortedSet(com.google.common.collect.ImmutableList.of(k1), (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator)), com.google.common.collect.ImmutableList.of(v1));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable k1, java.lang.Object v1, java.lang.Comparable k2, java.lang.Object v2) {
        return fromEntries(entryOf(k1, v1), entryOf(k2, v2));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable k1, java.lang.Object v1, java.lang.Comparable k2, java.lang.Object v2, java.lang.Comparable k3, java.lang.Object v3) {
        return fromEntries(entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable k1, java.lang.Object v1, java.lang.Comparable k2, java.lang.Object v2, java.lang.Comparable k3, java.lang.Object v3, java.lang.Comparable k4, java.lang.Object v4) {
        return fromEntries(entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable k1, java.lang.Object v1, java.lang.Comparable k2, java.lang.Object v2, java.lang.Comparable k3, java.lang.Object v3, java.lang.Comparable k4, java.lang.Object v4, java.lang.Comparable k5, java.lang.Object v5) {
        return fromEntries(entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable k1, java.lang.Object v1, java.lang.Comparable k2, java.lang.Object v2, java.lang.Comparable k3, java.lang.Object v3, java.lang.Comparable k4, java.lang.Object v4, java.lang.Comparable k5, java.lang.Object v5, java.lang.Comparable k6, java.lang.Object v6) {
        return fromEntries(entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5), entryOf(k6, v6));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable k1, java.lang.Object v1, java.lang.Comparable k2, java.lang.Object v2, java.lang.Comparable k3, java.lang.Object v3, java.lang.Comparable k4, java.lang.Object v4, java.lang.Comparable k5, java.lang.Object v5, java.lang.Comparable k6, java.lang.Object v6, java.lang.Comparable k7, java.lang.Object v7) {
        return fromEntries(entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5), entryOf(k6, v6), entryOf(k7, v7));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable k1, java.lang.Object v1, java.lang.Comparable k2, java.lang.Object v2, java.lang.Comparable k3, java.lang.Object v3, java.lang.Comparable k4, java.lang.Object v4, java.lang.Comparable k5, java.lang.Object v5, java.lang.Comparable k6, java.lang.Object v6, java.lang.Comparable k7, java.lang.Object v7, java.lang.Comparable k8, java.lang.Object v8) {
        return fromEntries(entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5), entryOf(k6, v6), entryOf(k7, v7), entryOf(k8, v8));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable k1, java.lang.Object v1, java.lang.Comparable k2, java.lang.Object v2, java.lang.Comparable k3, java.lang.Object v3, java.lang.Comparable k4, java.lang.Object v4, java.lang.Comparable k5, java.lang.Object v5, java.lang.Comparable k6, java.lang.Object v6, java.lang.Comparable k7, java.lang.Object v7, java.lang.Comparable k8, java.lang.Object v8, java.lang.Comparable k9, java.lang.Object v9) {
        return fromEntries(entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5), entryOf(k6, v6), entryOf(k7, v7), entryOf(k8, v8), entryOf(k9, v9));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable k1, java.lang.Object v1, java.lang.Comparable k2, java.lang.Object v2, java.lang.Comparable k3, java.lang.Object v3, java.lang.Comparable k4, java.lang.Object v4, java.lang.Comparable k5, java.lang.Object v5, java.lang.Comparable k6, java.lang.Object v6, java.lang.Comparable k7, java.lang.Object v7, java.lang.Comparable k8, java.lang.Object v8, java.lang.Comparable k9, java.lang.Object v9, java.lang.Comparable k10, java.lang.Object v10) {
        return fromEntries(entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5), entryOf(k6, v6), entryOf(k7, v7), entryOf(k8, v8), entryOf(k9, v9), entryOf(k10, v10));
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> map) {
        return copyOfInternal(map, (com.google.common.collect.Ordering) NATURAL_ORDER);
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> map, java.util.Comparator<? super K> comparator) {
        return copyOfInternal(map, (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator));
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> entries) {
        return copyOf(entries, (com.google.common.collect.Ordering) NATURAL_ORDER);
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> entries, java.util.Comparator<? super K> comparator) {
        return fromEntries((java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator), false, entries);
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOfSorted(java.util.SortedMap<K, ? extends V> map) {
        java.util.Comparator<? super K> comparator = map.comparator();
        if (comparator == null) {
            comparator = NATURAL_ORDER;
        }
        if (map instanceof com.google.common.collect.ImmutableSortedMap) {
            com.google.common.collect.ImmutableSortedMap<K, V> immutableSortedMap = (com.google.common.collect.ImmutableSortedMap) map;
            if (!immutableSortedMap.isPartialView()) {
                return immutableSortedMap;
            }
        }
        return fromEntries(comparator, true, map.entrySet());
    }

    private static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOfInternal(java.util.Map<? extends K, ? extends V> map, java.util.Comparator<? super K> comparator) {
        boolean zEquals;
        boolean z = false;
        if (map instanceof java.util.SortedMap) {
            java.util.Comparator<? super K> comparator2 = ((java.util.SortedMap) map).comparator();
            if (comparator2 != null) {
                zEquals = comparator.equals(comparator2);
            } else if (comparator == NATURAL_ORDER) {
                zEquals = true;
            }
            z = zEquals;
        }
        if (z && (map instanceof com.google.common.collect.ImmutableSortedMap)) {
            com.google.common.collect.ImmutableSortedMap<K, V> immutableSortedMap = (com.google.common.collect.ImmutableSortedMap) map;
            if (!immutableSortedMap.isPartialView()) {
                return immutableSortedMap;
            }
        }
        return fromEntries(comparator, z, map.entrySet());
    }

    private static <K extends java.lang.Comparable<? super K>, V> com.google.common.collect.ImmutableSortedMap<K, V> fromEntries(java.util.Map.Entry<K, V>... entries) {
        return fromEntries(com.google.common.collect.Ordering.natural(), false, entries, entries.length);
    }

    private static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> fromEntries(java.util.Comparator<? super K> comparator, boolean sameComparator, java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> entries) {
        java.util.Map.Entry[] entryArr = (java.util.Map.Entry[]) com.google.common.collect.Iterables.toArray(entries, EMPTY_ENTRY_ARRAY);
        return fromEntries(comparator, sameComparator, entryArr, entryArr.length);
    }

    private static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> fromEntries(final java.util.Comparator<? super K> comparator, boolean sameComparator, java.util.Map.Entry<K, V>[] entryArray, int size) {
        if (size == 0) {
            return emptyMap(comparator);
        }
        if (size == 1) {
            java.util.Map.Entry entry = (java.util.Map.Entry) java.util.Objects.requireNonNull(entryArray[0]);
            return of(comparator, entry.getKey(), entry.getValue());
        }
        java.lang.Object[] objArr = new java.lang.Object[size];
        java.lang.Object[] objArr2 = new java.lang.Object[size];
        if (sameComparator) {
            for (int i = 0; i < size; i++) {
                java.util.Map.Entry entry2 = (java.util.Map.Entry) java.util.Objects.requireNonNull(entryArray[i]);
                java.lang.Object key = entry2.getKey();
                java.lang.Object value = entry2.getValue();
                com.google.common.collect.CollectPreconditions.checkEntryNotNull(key, value);
                objArr[i] = key;
                objArr2[i] = value;
            }
        } else {
            java.util.Arrays.sort(entryArray, 0, size, new java.util.Comparator() { // from class: com.google.common.collect.ImmutableSortedMap$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return com.google.common.collect.ImmutableSortedMap.lambda$fromEntries$0(comparator, (java.util.Map.Entry) obj, (java.util.Map.Entry) obj2);
                }
            });
            java.util.Map.Entry entry3 = (java.util.Map.Entry) java.util.Objects.requireNonNull(entryArray[0]);
            java.lang.Object key2 = entry3.getKey();
            objArr[0] = key2;
            java.lang.Object value2 = entry3.getValue();
            objArr2[0] = value2;
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(objArr[0], value2);
            int i2 = 1;
            while (i2 < size) {
                java.util.Map.Entry entry4 = (java.util.Map.Entry) java.util.Objects.requireNonNull(entryArray[i2 - 1]);
                java.util.Map.Entry entry5 = (java.util.Map.Entry) java.util.Objects.requireNonNull(entryArray[i2]);
                java.lang.Object key3 = entry5.getKey();
                java.lang.Object value3 = entry5.getValue();
                com.google.common.collect.CollectPreconditions.checkEntryNotNull(key3, value3);
                objArr[i2] = key3;
                objArr2[i2] = value3;
                checkNoConflict(comparator.compare(key2, key3) != 0, com.ironsource.y8.h.W, entry4, entry5);
                i2++;
                key2 = key3;
            }
        }
        return new com.google.common.collect.ImmutableSortedMap<>(new com.google.common.collect.RegularImmutableSortedSet(com.google.common.collect.ImmutableList.asImmutableList(objArr), comparator), com.google.common.collect.ImmutableList.asImmutableList(objArr2));
    }

    static /* synthetic */ int lambda$fromEntries$0(java.util.Comparator comparator, java.util.Map.Entry entry, java.util.Map.Entry entry2) {
        java.util.Objects.requireNonNull(entry);
        java.util.Objects.requireNonNull(entry2);
        return comparator.compare(entry.getKey(), entry2.getKey());
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableSortedMap.Builder<K, V> naturalOrder() {
        return new com.google.common.collect.ImmutableSortedMap.Builder<>(com.google.common.collect.Ordering.natural());
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap.Builder<K, V> orderedBy(java.util.Comparator<K> comparator) {
        return new com.google.common.collect.ImmutableSortedMap.Builder<>(comparator);
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableSortedMap.Builder<K, V> reverseOrder() {
        return new com.google.common.collect.ImmutableSortedMap.Builder<>(com.google.common.collect.Ordering.natural().reverse());
    }

    public static class Builder<K, V> extends com.google.common.collect.ImmutableMap.Builder<K, V> {
        private final java.util.Comparator<? super K> comparator;
        private transient java.lang.Object[] keys;
        private transient java.lang.Object[] values;

        public Builder(java.util.Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        private Builder(java.util.Comparator<? super K> comparator, int initialCapacity) {
            this.comparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator);
            this.keys = new java.lang.Object[initialCapacity];
            this.values = new java.lang.Object[initialCapacity];
        }

        private void ensureCapacity(int minCapacity) {
            java.lang.Object[] objArr = this.keys;
            if (minCapacity > objArr.length) {
                int iExpandedCapacity = com.google.common.collect.ImmutableCollection.Builder.expandedCapacity(objArr.length, minCapacity);
                this.keys = java.util.Arrays.copyOf(this.keys, iExpandedCapacity);
                this.values = java.util.Arrays.copyOf(this.values, iExpandedCapacity);
            }
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> put(K key, V value) {
            ensureCapacity(this.size + 1);
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(key, value);
            this.keys[this.size] = key;
            this.values[this.size] = value;
            this.size++;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> entry) {
            super.put((java.util.Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> putAll(java.util.Map<? extends K, ? extends V> map) {
            super.putAll((java.util.Map) map);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> entries) {
            super.putAll((java.lang.Iterable) entries);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @java.lang.Deprecated
        public final com.google.common.collect.ImmutableSortedMap.Builder<K, V> orderEntriesByValue(java.util.Comparator<? super V> valueComparator) {
            throw new java.lang.UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
        }

        com.google.common.collect.ImmutableSortedMap.Builder<K, V> combine(com.google.common.collect.ImmutableSortedMap.Builder<K, V> other) {
            ensureCapacity(this.size + other.size);
            java.lang.System.arraycopy(other.keys, 0, this.keys, this.size, other.size);
            java.lang.System.arraycopy(other.values, 0, this.values, this.size, other.size);
            this.size += other.size;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableSortedMap<K, V> build() {
            return buildOrThrow();
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableSortedMap<K, V> buildOrThrow() {
            int i = this.size;
            if (i == 0) {
                return com.google.common.collect.ImmutableSortedMap.emptyMap(this.comparator);
            }
            if (i == 1) {
                return com.google.common.collect.ImmutableSortedMap.of(this.comparator, java.util.Objects.requireNonNull(this.keys[0]), java.util.Objects.requireNonNull(this.values[0]));
            }
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.keys, this.size);
            java.util.Arrays.sort(objArrCopyOf, this.comparator);
            java.lang.Object[] objArr = new java.lang.Object[this.size];
            for (int i2 = 0; i2 < this.size; i2++) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (this.comparator.compare(objArrCopyOf[i3], objArrCopyOf[i2]) == 0) {
                        throw new java.lang.IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i3] + " and " + objArrCopyOf[i2]);
                    }
                }
                objArr[java.util.Arrays.binarySearch(objArrCopyOf, java.util.Objects.requireNonNull(this.keys[i2]), this.comparator)] = java.util.Objects.requireNonNull(this.values[i2]);
            }
            return new com.google.common.collect.ImmutableSortedMap<>(new com.google.common.collect.RegularImmutableSortedSet(com.google.common.collect.ImmutableList.asImmutableList(objArrCopyOf), this.comparator), com.google.common.collect.ImmutableList.asImmutableList(objArr));
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @java.lang.Deprecated
        public final com.google.common.collect.ImmutableSortedMap<K, V> buildKeepingLast() {
            throw new java.lang.UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }
    }

    ImmutableSortedMap(com.google.common.collect.RegularImmutableSortedSet<K> keySet, com.google.common.collect.ImmutableList<V> valueList) {
        this(keySet, valueList, null);
    }

    ImmutableSortedMap(com.google.common.collect.RegularImmutableSortedSet<K> keySet, com.google.common.collect.ImmutableList<V> valueList, @javax.annotation.CheckForNull com.google.common.collect.ImmutableSortedMap<K, V> descendingMap) {
        this.keySet = keySet;
        this.valueList = valueList;
        this.descendingMap = descendingMap;
    }

    @Override // java.util.Map
    public int size() {
        return this.valueList.size();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object key) {
        int iIndexOf = this.keySet.indexOf(key);
        if (iIndexOf == -1) {
            return null;
        }
        return this.valueList.get(iIndexOf);
    }

    @Override // com.google.common.collect.ImmutableMap
    boolean isPartialView() {
        return this.keySet.isPartialView() || this.valueList.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
        return isEmpty() ? com.google.common.collect.ImmutableSet.of() : new com.google.common.collect.ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet
            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
            public com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
                return asList().iterator();
            }

            @Override // com.google.common.collect.ImmutableSet
            com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> createAsList() {
                return new com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                    @Override // com.google.common.collect.ImmutableCollection
                    boolean isPartialView() {
                        return true;
                    }

                    @Override // java.util.List
                    public java.util.Map.Entry<K, V> get(int index) {
                        return new java.util.AbstractMap.SimpleImmutableEntry(com.google.common.collect.ImmutableSortedMap.this.keySet.asList().get(index), com.google.common.collect.ImmutableSortedMap.this.valueList.get(index));
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return com.google.common.collect.ImmutableSortedMap.this.size();
                    }

                    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                    java.lang.Object writeReplace() {
                        return super.writeReplace();
                    }
                };
            }

            @Override // com.google.common.collect.ImmutableMapEntrySet
            com.google.common.collect.ImmutableMap<K, V> map() {
                return com.google.common.collect.ImmutableSortedMap.this;
            }

            @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
            java.lang.Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public com.google.common.collect.ImmutableSortedSet<K> keySet() {
        return this.keySet;
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableSet<K> createKeySet() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public com.google.common.collect.ImmutableCollection<V> values() {
        return this.valueList;
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableCollection<V> createValues() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // java.util.SortedMap
    public java.util.Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return keySet().first();
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return keySet().last();
    }

    private com.google.common.collect.ImmutableSortedMap<K, V> getSubMap(int fromIndex, int toIndex) {
        if (fromIndex == 0 && toIndex == size()) {
            return this;
        }
        if (fromIndex == toIndex) {
            return emptyMap(comparator());
        }
        return new com.google.common.collect.ImmutableSortedMap<>(this.keySet.getSubSet(fromIndex, toIndex), this.valueList.subList(fromIndex, toIndex));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public com.google.common.collect.ImmutableSortedMap<K, V> headMap(K toKey) {
        return headMap((java.lang.Object) toKey, false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedMap<K, V> headMap(K k, boolean z) {
        return getSubMap(0, this.keySet.headIndex((K) com.google.common.base.Preconditions.checkNotNull(k), z));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public com.google.common.collect.ImmutableSortedMap<K, V> subMap(K fromKey, K toKey) {
        return subMap((java.lang.Object) fromKey, true, (java.lang.Object) toKey, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) {
        com.google.common.base.Preconditions.checkNotNull(fromKey);
        com.google.common.base.Preconditions.checkNotNull(toKey);
        com.google.common.base.Preconditions.checkArgument(comparator().compare(fromKey, toKey) <= 0, "expected fromKey <= toKey but %s > %s", fromKey, toKey);
        return headMap((java.lang.Object) toKey, toInclusive).tailMap((java.lang.Object) fromKey, fromInclusive);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public com.google.common.collect.ImmutableSortedMap<K, V> tailMap(K fromKey) {
        return tailMap((java.lang.Object) fromKey, true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedMap<K, V> tailMap(K k, boolean z) {
        return getSubMap(this.keySet.tailIndex((K) com.google.common.base.Preconditions.checkNotNull(k), z), size());
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> lowerEntry(K key) {
        return headMap((java.lang.Object) key, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K lowerKey(K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> floorEntry(K key) {
        return headMap((java.lang.Object) key, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K floorKey(K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(floorEntry(k));
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> ceilingEntry(K key) {
        return tailMap((java.lang.Object) key, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K ceilingKey(K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(ceilingEntry(k));
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> higherEntry(K key) {
        return tailMap((java.lang.Object) key, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K higherKey(K k) {
        return (K) com.google.common.collect.Maps.keyOrNull(higherEntry(k));
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(0);
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(size() - 1);
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final java.util.Map.Entry<K, V> pollFirstEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final java.util.Map.Entry<K, V> pollLastEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedMap<K, V> descendingMap() {
        com.google.common.collect.ImmutableSortedMap<K, V> immutableSortedMap = this.descendingMap;
        if (immutableSortedMap != null) {
            return immutableSortedMap;
        }
        if (isEmpty()) {
            return emptyMap(com.google.common.collect.Ordering.from(comparator()).reverse());
        }
        return new com.google.common.collect.ImmutableSortedMap<>((com.google.common.collect.RegularImmutableSortedSet) this.keySet.descendingSet(), this.valueList.reverse(), this);
    }

    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedSet<K> navigableKeySet() {
        return this.keySet;
    }

    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedSet<K> descendingKeySet() {
        return this.keySet.descendingSet();
    }

    private static class SerializedForm<K, V> extends com.google.common.collect.ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;
        private final java.util.Comparator<? super K> comparator;

        SerializedForm(com.google.common.collect.ImmutableSortedMap<K, V> sortedMap) {
            super(sortedMap);
            this.comparator = sortedMap.comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> makeBuilder(int size) {
            return new com.google.common.collect.ImmutableSortedMap.Builder<>(this.comparator);
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableSortedMap.SerializedForm(this);
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

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap.Builder<K, V> builder() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap.Builder<K, V> builderWithExpectedSize(int expectedSize) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k1, V v1) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k1, V v1, K k2, V v2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> ofEntries(java.util.Map.Entry<? extends K, ? extends V>... entries) {
        throw new java.lang.UnsupportedOperationException();
    }
}
