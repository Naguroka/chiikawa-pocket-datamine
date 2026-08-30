package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Maps {

    private enum EntryFunction implements com.google.common.base.Function<java.util.Map.Entry<?, ?>, java.lang.Object> {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.base.Function
            @javax.annotation.CheckForNull
            public java.lang.Object apply(java.util.Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.base.Function
            @javax.annotation.CheckForNull
            public java.lang.Object apply(java.util.Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    public interface EntryTransformer<K, V1, V2> {
        @com.google.common.collect.ParametricNullness
        V2 transformEntry(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V1 value);
    }

    private Maps() {
    }

    static <K> com.google.common.base.Function<java.util.Map.Entry<K, ?>, K> keyFunction() {
        return com.google.common.collect.Maps.EntryFunction.KEY;
    }

    static <V> com.google.common.base.Function<java.util.Map.Entry<?, V>, V> valueFunction() {
        return com.google.common.collect.Maps.EntryFunction.VALUE;
    }

    static <K, V> java.util.Iterator<K> keyIterator(java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator) {
        return new com.google.common.collect.TransformedIterator<java.util.Map.Entry<K, V>, K>(entryIterator) { // from class: com.google.common.collect.Maps.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            @com.google.common.collect.ParametricNullness
            public K transform(java.util.Map.Entry<K, V> entry) {
                return entry.getKey();
            }
        };
    }

    static <K, V> java.util.Iterator<V> valueIterator(java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator) {
        return new com.google.common.collect.TransformedIterator<java.util.Map.Entry<K, V>, V>(entryIterator) { // from class: com.google.common.collect.Maps.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            @com.google.common.collect.ParametricNullness
            public V transform(java.util.Map.Entry<K, V> entry) {
                return entry.getValue();
            }
        };
    }

    public static <K extends java.lang.Enum<K>, V> com.google.common.collect.ImmutableMap<K, V> immutableEnumMap(java.util.Map<K, ? extends V> map) {
        if (map instanceof com.google.common.collect.ImmutableEnumMap) {
            return (com.google.common.collect.ImmutableEnumMap) map;
        }
        java.util.Iterator<java.util.Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return com.google.common.collect.ImmutableMap.of();
        }
        java.util.Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(key, value);
        java.util.EnumMap enumMap = new java.util.EnumMap(java.util.Collections.singletonMap(key, value));
        while (it.hasNext()) {
            java.util.Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(key2, value2);
            enumMap.put((java.lang.Enum) key2, (java.lang.Object) value2);
        }
        return com.google.common.collect.ImmutableEnumMap.asImmutable(enumMap);
    }

    static <T, K extends java.lang.Enum<K>, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableEnumMap(java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends V> valueFunction) {
        return com.google.common.collect.CollectCollectors.toImmutableEnumMap(keyFunction, valueFunction);
    }

    static <T, K extends java.lang.Enum<K>, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableEnumMap(java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction) {
        return com.google.common.collect.CollectCollectors.toImmutableEnumMap(keyFunction, valueFunction, mergeFunction);
    }

    public static <K, V> java.util.HashMap<K, V> newHashMap() {
        return new java.util.HashMap<>();
    }

    public static <K, V> java.util.HashMap<K, V> newHashMap(java.util.Map<? extends K, ? extends V> map) {
        return new java.util.HashMap<>(map);
    }

    public static <K, V> java.util.HashMap<K, V> newHashMapWithExpectedSize(int expectedSize) {
        return new java.util.HashMap<>(capacity(expectedSize));
    }

    static int capacity(int expectedSize) {
        if (expectedSize < 3) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(expectedSize, "expectedSize");
            return expectedSize + 1;
        }
        if (expectedSize < 1073741824) {
            return (int) java.lang.Math.ceil(((double) expectedSize) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMap() {
        return new java.util.LinkedHashMap<>();
    }

    public static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMap(java.util.Map<? extends K, ? extends V> map) {
        return new java.util.LinkedHashMap<>(map);
    }

    public static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int expectedSize) {
        return new java.util.LinkedHashMap<>(capacity(expectedSize));
    }

    public static <K, V> java.util.concurrent.ConcurrentMap<K, V> newConcurrentMap() {
        return new java.util.concurrent.ConcurrentHashMap();
    }

    public static <K extends java.lang.Comparable, V> java.util.TreeMap<K, V> newTreeMap() {
        return new java.util.TreeMap<>();
    }

    public static <K, V> java.util.TreeMap<K, V> newTreeMap(java.util.SortedMap<K, ? extends V> map) {
        return new java.util.TreeMap<>((java.util.SortedMap) map);
    }

    public static <C, K extends C, V> java.util.TreeMap<K, V> newTreeMap(@javax.annotation.CheckForNull java.util.Comparator<C> comparator) {
        return new java.util.TreeMap<>(comparator);
    }

    public static <K extends java.lang.Enum<K>, V> java.util.EnumMap<K, V> newEnumMap(java.lang.Class<K> type) {
        return new java.util.EnumMap<>((java.lang.Class) com.google.common.base.Preconditions.checkNotNull(type));
    }

    public static <K extends java.lang.Enum<K>, V> java.util.EnumMap<K, V> newEnumMap(java.util.Map<K, ? extends V> map) {
        return new java.util.EnumMap<>(map);
    }

    public static <K, V> java.util.IdentityHashMap<K, V> newIdentityHashMap() {
        return new java.util.IdentityHashMap<>();
    }

    public static <K, V> com.google.common.collect.MapDifference<K, V> difference(java.util.Map<? extends K, ? extends V> left, java.util.Map<? extends K, ? extends V> right) {
        if (left instanceof java.util.SortedMap) {
            return difference((java.util.SortedMap) left, (java.util.Map) right);
        }
        return difference(left, right, com.google.common.base.Equivalence.equals());
    }

    public static <K, V> com.google.common.collect.MapDifference<K, V> difference(java.util.Map<? extends K, ? extends V> left, java.util.Map<? extends K, ? extends V> right, com.google.common.base.Equivalence<? super V> valueEquivalence) {
        com.google.common.base.Preconditions.checkNotNull(valueEquivalence);
        java.util.LinkedHashMap linkedHashMapNewLinkedHashMap = newLinkedHashMap();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(right);
        java.util.LinkedHashMap linkedHashMapNewLinkedHashMap2 = newLinkedHashMap();
        java.util.LinkedHashMap linkedHashMapNewLinkedHashMap3 = newLinkedHashMap();
        doDifference(left, right, valueEquivalence, linkedHashMapNewLinkedHashMap, linkedHashMap, linkedHashMapNewLinkedHashMap2, linkedHashMapNewLinkedHashMap3);
        return new com.google.common.collect.Maps.MapDifferenceImpl(linkedHashMapNewLinkedHashMap, linkedHashMap, linkedHashMapNewLinkedHashMap2, linkedHashMapNewLinkedHashMap3);
    }

    public static <K, V> com.google.common.collect.SortedMapDifference<K, V> difference(java.util.SortedMap<K, ? extends V> left, java.util.Map<? extends K, ? extends V> right) {
        com.google.common.base.Preconditions.checkNotNull(left);
        com.google.common.base.Preconditions.checkNotNull(right);
        java.util.Comparator comparatorOrNaturalOrder = orNaturalOrder(left.comparator());
        java.util.TreeMap treeMapNewTreeMap = newTreeMap(comparatorOrNaturalOrder);
        java.util.TreeMap treeMapNewTreeMap2 = newTreeMap(comparatorOrNaturalOrder);
        treeMapNewTreeMap2.putAll(right);
        java.util.TreeMap treeMapNewTreeMap3 = newTreeMap(comparatorOrNaturalOrder);
        java.util.TreeMap treeMapNewTreeMap4 = newTreeMap(comparatorOrNaturalOrder);
        doDifference(left, right, com.google.common.base.Equivalence.equals(), treeMapNewTreeMap, treeMapNewTreeMap2, treeMapNewTreeMap3, treeMapNewTreeMap4);
        return new com.google.common.collect.Maps.SortedMapDifferenceImpl(treeMapNewTreeMap, treeMapNewTreeMap2, treeMapNewTreeMap3, treeMapNewTreeMap4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <K, V> void doDifference(java.util.Map<? extends K, ? extends V> map, java.util.Map<? extends K, ? extends V> map2, com.google.common.base.Equivalence<? super V> equivalence, java.util.Map<K, V> map3, java.util.Map<K, V> map4, java.util.Map<K, V> map5, java.util.Map<K, com.google.common.collect.MapDifference.ValueDifference<V>> map6) {
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (map2.containsKey(key)) {
                android.Manifest.permission_group permission_groupVar = (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(map4.remove(key));
                if (equivalence.equivalent(value, permission_groupVar)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, com.google.common.collect.Maps.ValueDifferenceImpl.create(value, permission_groupVar));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> java.util.Map<K, V> unmodifiableMap(java.util.Map<K, ? extends V> map) {
        if (map instanceof java.util.SortedMap) {
            return java.util.Collections.unmodifiableSortedMap((java.util.SortedMap) map);
        }
        return java.util.Collections.unmodifiableMap(map);
    }

    static class MapDifferenceImpl<K, V> implements com.google.common.collect.MapDifference<K, V> {
        final java.util.Map<K, com.google.common.collect.MapDifference.ValueDifference<V>> differences;
        final java.util.Map<K, V> onBoth;
        final java.util.Map<K, V> onlyOnLeft;
        final java.util.Map<K, V> onlyOnRight;

        MapDifferenceImpl(java.util.Map<K, V> onlyOnLeft, java.util.Map<K, V> onlyOnRight, java.util.Map<K, V> onBoth, java.util.Map<K, com.google.common.collect.MapDifference.ValueDifference<V>> differences) {
            this.onlyOnLeft = com.google.common.collect.Maps.unmodifiableMap(onlyOnLeft);
            this.onlyOnRight = com.google.common.collect.Maps.unmodifiableMap(onlyOnRight);
            this.onBoth = com.google.common.collect.Maps.unmodifiableMap(onBoth);
            this.differences = com.google.common.collect.Maps.unmodifiableMap(differences);
        }

        @Override // com.google.common.collect.MapDifference
        public boolean areEqual() {
            return this.onlyOnLeft.isEmpty() && this.onlyOnRight.isEmpty() && this.differences.isEmpty();
        }

        @Override // com.google.common.collect.MapDifference
        public java.util.Map<K, V> entriesOnlyOnLeft() {
            return this.onlyOnLeft;
        }

        @Override // com.google.common.collect.MapDifference
        public java.util.Map<K, V> entriesOnlyOnRight() {
            return this.onlyOnRight;
        }

        @Override // com.google.common.collect.MapDifference
        public java.util.Map<K, V> entriesInCommon() {
            return this.onBoth;
        }

        @Override // com.google.common.collect.MapDifference
        public java.util.Map<K, com.google.common.collect.MapDifference.ValueDifference<V>> entriesDiffering() {
            return this.differences;
        }

        @Override // com.google.common.collect.MapDifference
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof com.google.common.collect.MapDifference)) {
                return false;
            }
            com.google.common.collect.MapDifference mapDifference = (com.google.common.collect.MapDifference) object;
            return entriesOnlyOnLeft().equals(mapDifference.entriesOnlyOnLeft()) && entriesOnlyOnRight().equals(mapDifference.entriesOnlyOnRight()) && entriesInCommon().equals(mapDifference.entriesInCommon()) && entriesDiffering().equals(mapDifference.entriesDiffering());
        }

        @Override // com.google.common.collect.MapDifference
        public int hashCode() {
            return com.google.common.base.Objects.hashCode(entriesOnlyOnLeft(), entriesOnlyOnRight(), entriesInCommon(), entriesDiffering());
        }

        public java.lang.String toString() {
            if (areEqual()) {
                return "equal";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("not equal");
            if (!this.onlyOnLeft.isEmpty()) {
                sb.append(": only on left=").append(this.onlyOnLeft);
            }
            if (!this.onlyOnRight.isEmpty()) {
                sb.append(": only on right=").append(this.onlyOnRight);
            }
            if (!this.differences.isEmpty()) {
                sb.append(": value differences=").append(this.differences);
            }
            return sb.toString();
        }
    }

    static class ValueDifferenceImpl<V> implements com.google.common.collect.MapDifference.ValueDifference<V> {

        @com.google.common.collect.ParametricNullness
        private final V left;

        @com.google.common.collect.ParametricNullness
        private final V right;

        static <V> com.google.common.collect.MapDifference.ValueDifference<V> create(@com.google.common.collect.ParametricNullness V left, @com.google.common.collect.ParametricNullness V right) {
            return new com.google.common.collect.Maps.ValueDifferenceImpl(left, right);
        }

        private ValueDifferenceImpl(@com.google.common.collect.ParametricNullness V left, @com.google.common.collect.ParametricNullness V right) {
            this.left = left;
            this.right = right;
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        @com.google.common.collect.ParametricNullness
        public V leftValue() {
            return this.left;
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        @com.google.common.collect.ParametricNullness
        public V rightValue() {
            return this.right;
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (!(object instanceof com.google.common.collect.MapDifference.ValueDifference)) {
                return false;
            }
            com.google.common.collect.MapDifference.ValueDifference valueDifference = (com.google.common.collect.MapDifference.ValueDifference) object;
            return com.google.common.base.Objects.equal(this.left, valueDifference.leftValue()) && com.google.common.base.Objects.equal(this.right, valueDifference.rightValue());
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public int hashCode() {
            return com.google.common.base.Objects.hashCode(this.left, this.right);
        }

        public java.lang.String toString() {
            return "(" + this.left + ", " + this.right + ")";
        }
    }

    static class SortedMapDifferenceImpl<K, V> extends com.google.common.collect.Maps.MapDifferenceImpl<K, V> implements com.google.common.collect.SortedMapDifference<K, V> {
        SortedMapDifferenceImpl(java.util.SortedMap<K, V> onlyOnLeft, java.util.SortedMap<K, V> onlyOnRight, java.util.SortedMap<K, V> onBoth, java.util.SortedMap<K, com.google.common.collect.MapDifference.ValueDifference<V>> differences) {
            super(onlyOnLeft, onlyOnRight, onBoth, differences);
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public java.util.SortedMap<K, com.google.common.collect.MapDifference.ValueDifference<V>> entriesDiffering() {
            return (java.util.SortedMap) super.entriesDiffering();
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public java.util.SortedMap<K, V> entriesInCommon() {
            return (java.util.SortedMap) super.entriesInCommon();
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public java.util.SortedMap<K, V> entriesOnlyOnLeft() {
            return (java.util.SortedMap) super.entriesOnlyOnLeft();
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public java.util.SortedMap<K, V> entriesOnlyOnRight() {
            return (java.util.SortedMap) super.entriesOnlyOnRight();
        }
    }

    static <E> java.util.Comparator<? super E> orNaturalOrder(@javax.annotation.CheckForNull java.util.Comparator<? super E> comparator) {
        return comparator != null ? comparator : com.google.common.collect.Ordering.natural();
    }

    public static <K, V> java.util.Map<K, V> asMap(java.util.Set<K> set, com.google.common.base.Function<? super K, V> function) {
        return new com.google.common.collect.Maps.AsMapView(set, function);
    }

    public static <K, V> java.util.SortedMap<K, V> asMap(java.util.SortedSet<K> set, com.google.common.base.Function<? super K, V> function) {
        return new com.google.common.collect.Maps.SortedAsMapView(set, function);
    }

    public static <K, V> java.util.NavigableMap<K, V> asMap(java.util.NavigableSet<K> set, com.google.common.base.Function<? super K, V> function) {
        return new com.google.common.collect.Maps.NavigableAsMapView(set, function);
    }

    private static class AsMapView<K, V> extends com.google.common.collect.Maps.ViewCachingAbstractMap<K, V> {
        final com.google.common.base.Function<? super K, V> function;
        private final java.util.Set<K> set;

        java.util.Set<K> backingSet() {
            return this.set;
        }

        AsMapView(java.util.Set<K> set, com.google.common.base.Function<? super K, V> function) {
            this.set = (java.util.Set) com.google.common.base.Preconditions.checkNotNull(set);
            this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public java.util.Set<K> createKeySet() {
            return com.google.common.collect.Maps.removeOnlySet(backingSet());
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        java.util.Collection<V> createValues() {
            return com.google.common.collect.Collections2.transform(this.set, this.function);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return backingSet().size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return backingSet().contains(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object key) {
            if (com.google.common.collect.Collections2.safeContains(backingSet(), key)) {
                return this.function.apply(key);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V remove(@javax.annotation.CheckForNull java.lang.Object key) {
            if (backingSet().remove(key)) {
                return this.function.apply(key);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            backingSet().clear();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected java.util.Set<java.util.Map.Entry<K, V>> createEntrySet() {
            return new com.google.common.collect.Maps.EntrySet<K, V>() { // from class: com.google.common.collect.Maps.AsMapView.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                java.util.Map<K, V> map() {
                    return com.google.common.collect.Maps.AsMapView.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                    return com.google.common.collect.Maps.asMapEntryIterator(com.google.common.collect.Maps.AsMapView.this.backingSet(), com.google.common.collect.Maps.AsMapView.this.function);
                }
            };
        }
    }

    static <K, V> java.util.Iterator<java.util.Map.Entry<K, V>> asMapEntryIterator(java.util.Set<K> set, final com.google.common.base.Function<? super K, V> function) {
        return new com.google.common.collect.TransformedIterator<K, java.util.Map.Entry<K, V>>(set.iterator()) { // from class: com.google.common.collect.Maps.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            public java.util.Map.Entry<K, V> transform(@com.google.common.collect.ParametricNullness final K key) {
                return com.google.common.collect.Maps.immutableEntry(key, function.apply(key));
            }
        };
    }

    private static class SortedAsMapView<K, V> extends com.google.common.collect.Maps.AsMapView<K, V> implements java.util.SortedMap<K, V> {
        SortedAsMapView(java.util.SortedSet<K> set, com.google.common.base.Function<? super K, V> function) {
            super(set, function);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.AsMapView
        public java.util.SortedSet<K> backingSet() {
            return (java.util.SortedSet) super.backingSet();
        }

        @Override // java.util.SortedMap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
            return backingSet().comparator();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
            return com.google.common.collect.Maps.removeOnlySortedSet(backingSet());
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<K, V> subMap(@com.google.common.collect.ParametricNullness K fromKey, @com.google.common.collect.ParametricNullness K toKey) {
            return com.google.common.collect.Maps.asMap((java.util.SortedSet) backingSet().subSet(fromKey, toKey), (com.google.common.base.Function) this.function);
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<K, V> headMap(@com.google.common.collect.ParametricNullness K toKey) {
            return com.google.common.collect.Maps.asMap((java.util.SortedSet) backingSet().headSet(toKey), (com.google.common.base.Function) this.function);
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K fromKey) {
            return com.google.common.collect.Maps.asMap((java.util.SortedSet) backingSet().tailSet(fromKey), (com.google.common.base.Function) this.function);
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K firstKey() {
            return backingSet().first();
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K lastKey() {
            return backingSet().last();
        }
    }

    private static final class NavigableAsMapView<K, V> extends com.google.common.collect.AbstractNavigableMap<K, V> {
        private final com.google.common.base.Function<? super K, V> function;
        private final java.util.NavigableSet<K> set;

        NavigableAsMapView(java.util.NavigableSet<K> ks, com.google.common.base.Function<? super K, V> vFunction) {
            this.set = (java.util.NavigableSet) com.google.common.base.Preconditions.checkNotNull(ks);
            this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(vFunction);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> subMap(@com.google.common.collect.ParametricNullness K fromKey, boolean fromInclusive, @com.google.common.collect.ParametricNullness K toKey, boolean toInclusive) {
            return com.google.common.collect.Maps.asMap((java.util.NavigableSet) this.set.subSet(fromKey, fromInclusive, toKey, toInclusive), (com.google.common.base.Function) this.function);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> headMap(@com.google.common.collect.ParametricNullness K toKey, boolean inclusive) {
            return com.google.common.collect.Maps.asMap((java.util.NavigableSet) this.set.headSet(toKey, inclusive), (com.google.common.base.Function) this.function);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K fromKey, boolean inclusive) {
            return com.google.common.collect.Maps.asMap((java.util.NavigableSet) this.set.tailSet(fromKey, inclusive), (com.google.common.base.Function) this.function);
        }

        @Override // java.util.SortedMap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
            return this.set.comparator();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object key) {
            if (com.google.common.collect.Collections2.safeContains(this.set, key)) {
                return this.function.apply(key);
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.set.clear();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            return com.google.common.collect.Maps.asMapEntryIterator(this.set, this.function);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        java.util.Iterator<java.util.Map.Entry<K, V>> descendingEntryIterator() {
            return descendingMap().entrySet().iterator();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public java.util.NavigableSet<K> navigableKeySet() {
            return com.google.common.collect.Maps.removeOnlyNavigableSet(this.set);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.set.size();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public java.util.NavigableMap<K, V> descendingMap() {
            return com.google.common.collect.Maps.asMap((java.util.NavigableSet) this.set.descendingSet(), (com.google.common.base.Function) this.function);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.Set<E> removeOnlySet(final java.util.Set<E> set) {
        return new com.google.common.collect.ForwardingSet<E>() { // from class: com.google.common.collect.Maps.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public java.util.Set<E> delegate() {
                return set;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
            public boolean add(@com.google.common.collect.ParametricNullness E element) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean addAll(java.util.Collection<? extends E> es) {
                throw new java.lang.UnsupportedOperationException();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.SortedSet<E> removeOnlySortedSet(final java.util.SortedSet<E> set) {
        return new com.google.common.collect.ForwardingSortedSet<E>() { // from class: com.google.common.collect.Maps.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public java.util.SortedSet<E> delegate() {
                return set;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
            public boolean add(@com.google.common.collect.ParametricNullness E element) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean addAll(java.util.Collection<? extends E> es) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public java.util.SortedSet<E> headSet(@com.google.common.collect.ParametricNullness E toElement) {
                return com.google.common.collect.Maps.removeOnlySortedSet(super.headSet(toElement));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public java.util.SortedSet<E> subSet(@com.google.common.collect.ParametricNullness E fromElement, @com.google.common.collect.ParametricNullness E toElement) {
                return com.google.common.collect.Maps.removeOnlySortedSet(super.subSet(fromElement, toElement));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public java.util.SortedSet<E> tailSet(@com.google.common.collect.ParametricNullness E fromElement) {
                return com.google.common.collect.Maps.removeOnlySortedSet(super.tailSet(fromElement));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.NavigableSet<E> removeOnlyNavigableSet(final java.util.NavigableSet<E> set) {
        return new com.google.common.collect.ForwardingNavigableSet<E>() { // from class: com.google.common.collect.Maps.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public java.util.NavigableSet<E> delegate() {
                return set;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
            public boolean add(@com.google.common.collect.ParametricNullness E element) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean addAll(java.util.Collection<? extends E> es) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public java.util.SortedSet<E> headSet(@com.google.common.collect.ParametricNullness E toElement) {
                return com.google.common.collect.Maps.removeOnlySortedSet(super.headSet(toElement));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public java.util.NavigableSet<E> headSet(@com.google.common.collect.ParametricNullness E toElement, boolean inclusive) {
                return com.google.common.collect.Maps.removeOnlyNavigableSet(super.headSet(toElement, inclusive));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public java.util.SortedSet<E> subSet(@com.google.common.collect.ParametricNullness E fromElement, @com.google.common.collect.ParametricNullness E toElement) {
                return com.google.common.collect.Maps.removeOnlySortedSet(super.subSet(fromElement, toElement));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public java.util.NavigableSet<E> subSet(@com.google.common.collect.ParametricNullness E fromElement, boolean fromInclusive, @com.google.common.collect.ParametricNullness E toElement, boolean toInclusive) {
                return com.google.common.collect.Maps.removeOnlyNavigableSet(super.subSet(fromElement, fromInclusive, toElement, toInclusive));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public java.util.SortedSet<E> tailSet(@com.google.common.collect.ParametricNullness E fromElement) {
                return com.google.common.collect.Maps.removeOnlySortedSet(super.tailSet(fromElement));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public java.util.NavigableSet<E> tailSet(@com.google.common.collect.ParametricNullness E fromElement, boolean inclusive) {
                return com.google.common.collect.Maps.removeOnlyNavigableSet(super.tailSet(fromElement, inclusive));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public java.util.NavigableSet<E> descendingSet() {
                return com.google.common.collect.Maps.removeOnlyNavigableSet(super.descendingSet());
            }
        };
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> toMap(java.lang.Iterable<K> keys, com.google.common.base.Function<? super K, V> valueFunction) {
        return toMap(keys.iterator(), valueFunction);
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> toMap(java.util.Iterator<K> keys, com.google.common.base.Function<? super K, V> valueFunction) {
        com.google.common.base.Preconditions.checkNotNull(valueFunction);
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        while (keys.hasNext()) {
            K next = keys.next();
            builder.put(next, valueFunction.apply(next));
        }
        return builder.buildKeepingLast();
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> uniqueIndex(java.lang.Iterable<V> values, com.google.common.base.Function<? super V, K> keyFunction) {
        if (values instanceof java.util.Collection) {
            return uniqueIndex(values.iterator(), keyFunction, com.google.common.collect.ImmutableMap.builderWithExpectedSize(((java.util.Collection) values).size()));
        }
        return uniqueIndex(values.iterator(), keyFunction);
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> uniqueIndex(java.util.Iterator<V> values, com.google.common.base.Function<? super V, K> keyFunction) {
        return uniqueIndex(values, keyFunction, com.google.common.collect.ImmutableMap.builder());
    }

    private static <K, V> com.google.common.collect.ImmutableMap<K, V> uniqueIndex(java.util.Iterator<V> values, com.google.common.base.Function<? super V, K> keyFunction, com.google.common.collect.ImmutableMap.Builder<K, V> builder) {
        com.google.common.base.Preconditions.checkNotNull(keyFunction);
        while (values.hasNext()) {
            V next = values.next();
            builder.put(keyFunction.apply(next), next);
        }
        try {
            return builder.buildOrThrow();
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.lang.IllegalArgumentException(e.getMessage() + ". To index multiple values under a key, use Multimaps.index.");
        }
    }

    public static com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> fromProperties(java.util.Properties properties) {
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        java.util.Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        while (enumerationPropertyNames.hasMoreElements()) {
            java.lang.String str = (java.lang.String) java.util.Objects.requireNonNull(enumerationPropertyNames.nextElement());
            builder.put(str, (java.lang.String) java.util.Objects.requireNonNull(properties.getProperty(str)));
        }
        return builder.buildOrThrow();
    }

    public static <K, V> java.util.Map.Entry<K, V> immutableEntry(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        return new com.google.common.collect.ImmutableEntry(key, value);
    }

    static <K, V> java.util.Set<java.util.Map.Entry<K, V>> unmodifiableEntrySet(java.util.Set<java.util.Map.Entry<K, V>> entrySet) {
        return new com.google.common.collect.Maps.UnmodifiableEntrySet(java.util.Collections.unmodifiableSet(entrySet));
    }

    static <K, V> java.util.Map.Entry<K, V> unmodifiableEntry(final java.util.Map.Entry<? extends K, ? extends V> entry) {
        com.google.common.base.Preconditions.checkNotNull(entry);
        return new com.google.common.collect.AbstractMapEntry<K, V>() { // from class: com.google.common.collect.Maps.7
            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            @com.google.common.collect.ParametricNullness
            public K getKey() {
                return (K) entry.getKey();
            }

            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            @com.google.common.collect.ParametricNullness
            public V getValue() {
                return (V) entry.getValue();
            }
        };
    }

    static <K, V> com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> unmodifiableEntryIterator(final java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator) {
        return new com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.Maps.8
            @Override // java.util.Iterator
            public boolean hasNext() {
                return entryIterator.hasNext();
            }

            @Override // java.util.Iterator
            public java.util.Map.Entry<K, V> next() {
                return com.google.common.collect.Maps.unmodifiableEntry((java.util.Map.Entry) entryIterator.next());
            }
        };
    }

    static class UnmodifiableEntries<K, V> extends com.google.common.collect.ForwardingCollection<java.util.Map.Entry<K, V>> {
        private final java.util.Collection<java.util.Map.Entry<K, V>> entries;

        UnmodifiableEntries(java.util.Collection<java.util.Map.Entry<K, V>> entries) {
            this.entries = entries;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.Collection<java.util.Map.Entry<K, V>> delegate() {
            return this.entries;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return com.google.common.collect.Maps.unmodifiableEntryIterator(this.entries.iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }
    }

    static class UnmodifiableEntrySet<K, V> extends com.google.common.collect.Maps.UnmodifiableEntries<K, V> implements java.util.Set<java.util.Map.Entry<K, V>> {
        UnmodifiableEntrySet(java.util.Set<java.util.Map.Entry<K, V>> entries) {
            super(entries);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            return com.google.common.collect.Sets.equalsImpl(this, object);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return com.google.common.collect.Sets.hashCodeImpl(this);
        }
    }

    public static <A, B> com.google.common.base.Converter<A, B> asConverter(final com.google.common.collect.BiMap<A, B> bimap) {
        return new com.google.common.collect.Maps.BiMapConverter(bimap);
    }

    private static final class BiMapConverter<A, B> extends com.google.common.base.Converter<A, B> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.BiMap<A, B> bimap;

        BiMapConverter(com.google.common.collect.BiMap<A, B> bimap) {
            this.bimap = (com.google.common.collect.BiMap) com.google.common.base.Preconditions.checkNotNull(bimap);
        }

        @Override // com.google.common.base.Converter
        protected B doForward(A a2) {
            return (B) convert(this.bimap, a2);
        }

        @Override // com.google.common.base.Converter
        protected A doBackward(B b) {
            return (A) convert(this.bimap.inverse(), b);
        }

        private static <X, Y> Y convert(com.google.common.collect.BiMap<X, Y> bimap, X input) {
            Y y = bimap.get(input);
            com.google.common.base.Preconditions.checkArgument(y != null, "No non-null mapping present for input: %s", input);
            return y;
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object instanceof com.google.common.collect.Maps.BiMapConverter) {
                return this.bimap.equals(((com.google.common.collect.Maps.BiMapConverter) object).bimap);
            }
            return false;
        }

        public int hashCode() {
            return this.bimap.hashCode();
        }

        public java.lang.String toString() {
            return "Maps.asConverter(" + this.bimap + ")";
        }
    }

    public static <K, V> com.google.common.collect.BiMap<K, V> synchronizedBiMap(com.google.common.collect.BiMap<K, V> bimap) {
        return com.google.common.collect.Synchronized.biMap(bimap, null);
    }

    public static <K, V> com.google.common.collect.BiMap<K, V> unmodifiableBiMap(com.google.common.collect.BiMap<? extends K, ? extends V> bimap) {
        return new com.google.common.collect.Maps.UnmodifiableBiMap(bimap, null);
    }

    private static class UnmodifiableBiMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements com.google.common.collect.BiMap<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.BiMap<? extends K, ? extends V> delegate;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        com.google.common.collect.BiMap<V, K> inverse;
        final java.util.Map<K, V> unmodifiableMap;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        transient java.util.Set<V> values;

        UnmodifiableBiMap(com.google.common.collect.BiMap<? extends K, ? extends V> delegate, @javax.annotation.CheckForNull com.google.common.collect.BiMap<V, K> inverse) {
            this.unmodifiableMap = java.util.Collections.unmodifiableMap(delegate);
            this.delegate = delegate;
            this.inverse = inverse;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public java.util.Map<K, V> delegate() {
            return this.unmodifiableMap;
        }

        @Override // com.google.common.collect.BiMap
        @javax.annotation.CheckForNull
        public V forcePut(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.BiMap
        public com.google.common.collect.BiMap<V, K> inverse() {
            com.google.common.collect.BiMap<V, K> biMap = this.inverse;
            if (biMap != null) {
                return biMap;
            }
            com.google.common.collect.Maps.UnmodifiableBiMap unmodifiableBiMap = new com.google.common.collect.Maps.UnmodifiableBiMap(this.delegate.inverse(), this);
            this.inverse = unmodifiableBiMap;
            return unmodifiableBiMap;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public java.util.Set<V> values() {
            java.util.Set<V> set = this.values;
            if (set != null) {
                return set;
            }
            java.util.Set<V> setUnmodifiableSet = java.util.Collections.unmodifiableSet(this.delegate.values());
            this.values = setUnmodifiableSet;
            return setUnmodifiableSet;
        }
    }

    public static <K, V1, V2> java.util.Map<K, V2> transformValues(java.util.Map<K, V1> fromMap, com.google.common.base.Function<? super V1, V2> function) {
        return transformEntries(fromMap, asEntryTransformer(function));
    }

    public static <K, V1, V2> java.util.SortedMap<K, V2> transformValues(java.util.SortedMap<K, V1> fromMap, com.google.common.base.Function<? super V1, V2> function) {
        return transformEntries((java.util.SortedMap) fromMap, asEntryTransformer(function));
    }

    public static <K, V1, V2> java.util.NavigableMap<K, V2> transformValues(java.util.NavigableMap<K, V1> fromMap, com.google.common.base.Function<? super V1, V2> function) {
        return transformEntries((java.util.NavigableMap) fromMap, asEntryTransformer(function));
    }

    public static <K, V1, V2> java.util.Map<K, V2> transformEntries(java.util.Map<K, V1> fromMap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer) {
        return new com.google.common.collect.Maps.TransformedEntriesMap(fromMap, transformer);
    }

    public static <K, V1, V2> java.util.SortedMap<K, V2> transformEntries(java.util.SortedMap<K, V1> fromMap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer) {
        return new com.google.common.collect.Maps.TransformedEntriesSortedMap(fromMap, transformer);
    }

    public static <K, V1, V2> java.util.NavigableMap<K, V2> transformEntries(java.util.NavigableMap<K, V1> fromMap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer) {
        return new com.google.common.collect.Maps.TransformedEntriesNavigableMap(fromMap, transformer);
    }

    static <K, V1, V2> com.google.common.collect.Maps.EntryTransformer<K, V1, V2> asEntryTransformer(final com.google.common.base.Function<? super V1, V2> function) {
        com.google.common.base.Preconditions.checkNotNull(function);
        return new com.google.common.collect.Maps.EntryTransformer<K, V1, V2>() { // from class: com.google.common.collect.Maps.9
            @Override // com.google.common.collect.Maps.EntryTransformer
            @com.google.common.collect.ParametricNullness
            public V2 transformEntry(@com.google.common.collect.ParametricNullness K k, @com.google.common.collect.ParametricNullness V1 v1) {
                return (V2) function.apply(v1);
            }
        };
    }

    static <K, V1, V2> com.google.common.base.Function<V1, V2> asValueToValueFunction(final com.google.common.collect.Maps.EntryTransformer<? super K, V1, V2> transformer, @com.google.common.collect.ParametricNullness final K key) {
        com.google.common.base.Preconditions.checkNotNull(transformer);
        return new com.google.common.base.Function<V1, V2>() { // from class: com.google.common.collect.Maps.10
            @Override // com.google.common.base.Function
            @com.google.common.collect.ParametricNullness
            public V2 apply(@com.google.common.collect.ParametricNullness V1 v1) {
                return (V2) transformer.transformEntry(key, v1);
            }
        };
    }

    static <K, V1, V2> com.google.common.base.Function<java.util.Map.Entry<K, V1>, V2> asEntryToValueFunction(final com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer) {
        com.google.common.base.Preconditions.checkNotNull(transformer);
        return new com.google.common.base.Function<java.util.Map.Entry<K, V1>, V2>() { // from class: com.google.common.collect.Maps.11
            @Override // com.google.common.base.Function
            @com.google.common.collect.ParametricNullness
            public V2 apply(java.util.Map.Entry<K, V1> entry) {
                return (V2) transformer.transformEntry(entry.getKey(), entry.getValue());
            }
        };
    }

    static <V2, K, V1> java.util.Map.Entry<K, V2> transformEntry(final com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer, final java.util.Map.Entry<K, V1> entry) {
        com.google.common.base.Preconditions.checkNotNull(transformer);
        com.google.common.base.Preconditions.checkNotNull(entry);
        return new com.google.common.collect.AbstractMapEntry<K, V2>() { // from class: com.google.common.collect.Maps.12
            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            @com.google.common.collect.ParametricNullness
            public K getKey() {
                return (K) entry.getKey();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            @com.google.common.collect.ParametricNullness
            public V2 getValue() {
                return (V2) transformer.transformEntry(entry.getKey(), entry.getValue());
            }
        };
    }

    static <K, V1, V2> com.google.common.base.Function<java.util.Map.Entry<K, V1>, java.util.Map.Entry<K, V2>> asEntryToEntryFunction(final com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer) {
        com.google.common.base.Preconditions.checkNotNull(transformer);
        return new com.google.common.base.Function<java.util.Map.Entry<K, V1>, java.util.Map.Entry<K, V2>>() { // from class: com.google.common.collect.Maps.13
            @Override // com.google.common.base.Function
            public java.util.Map.Entry<K, V2> apply(final java.util.Map.Entry<K, V1> entry) {
                return com.google.common.collect.Maps.transformEntry(transformer, entry);
            }
        };
    }

    static class TransformedEntriesMap<K, V1, V2> extends com.google.common.collect.Maps.IteratorBasedAbstractMap<K, V2> {
        final java.util.Map<K, V1> fromMap;
        final com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer;

        TransformedEntriesMap(java.util.Map<K, V1> fromMap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer) {
            this.fromMap = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(fromMap);
            this.transformer = (com.google.common.collect.Maps.EntryTransformer) com.google.common.base.Preconditions.checkNotNull(transformer);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.fromMap.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return this.fromMap.containsKey(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V2 get(@javax.annotation.CheckForNull java.lang.Object obj) {
            V1 v1 = this.fromMap.get(obj);
            if (v1 != null || this.fromMap.containsKey(obj)) {
                return this.transformer.transformEntry(obj, (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(v1));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V2 remove(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (this.fromMap.containsKey(obj)) {
                return this.transformer.transformEntry(obj, (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.fromMap.remove(obj)));
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.fromMap.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
            return this.fromMap.keySet();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        java.util.Iterator<java.util.Map.Entry<K, V2>> entryIterator() {
            return com.google.common.collect.Iterators.transform(this.fromMap.entrySet().iterator(), com.google.common.collect.Maps.asEntryToEntryFunction(this.transformer));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Collection<V2> values() {
            return new com.google.common.collect.Maps.Values(this);
        }
    }

    static class TransformedEntriesSortedMap<K, V1, V2> extends com.google.common.collect.Maps.TransformedEntriesMap<K, V1, V2> implements java.util.SortedMap<K, V2> {
        protected java.util.SortedMap<K, V1> fromMap() {
            return (java.util.SortedMap) this.fromMap;
        }

        TransformedEntriesSortedMap(java.util.SortedMap<K, V1> fromMap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer) {
            super(fromMap, transformer);
        }

        @Override // java.util.SortedMap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
            return fromMap().comparator();
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K firstKey() {
            return fromMap().firstKey();
        }

        public java.util.SortedMap<K, V2> headMap(@com.google.common.collect.ParametricNullness K toKey) {
            return com.google.common.collect.Maps.transformEntries((java.util.SortedMap) fromMap().headMap(toKey), (com.google.common.collect.Maps.EntryTransformer) this.transformer);
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K lastKey() {
            return fromMap().lastKey();
        }

        public java.util.SortedMap<K, V2> subMap(@com.google.common.collect.ParametricNullness K fromKey, @com.google.common.collect.ParametricNullness K toKey) {
            return com.google.common.collect.Maps.transformEntries((java.util.SortedMap) fromMap().subMap(fromKey, toKey), (com.google.common.collect.Maps.EntryTransformer) this.transformer);
        }

        public java.util.SortedMap<K, V2> tailMap(@com.google.common.collect.ParametricNullness K fromKey) {
            return com.google.common.collect.Maps.transformEntries((java.util.SortedMap) fromMap().tailMap(fromKey), (com.google.common.collect.Maps.EntryTransformer) this.transformer);
        }
    }

    private static class TransformedEntriesNavigableMap<K, V1, V2> extends com.google.common.collect.Maps.TransformedEntriesSortedMap<K, V1, V2> implements java.util.NavigableMap<K, V2> {
        TransformedEntriesNavigableMap(java.util.NavigableMap<K, V1> fromMap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer) {
            super(fromMap, transformer);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V2> ceilingEntry(@com.google.common.collect.ParametricNullness K key) {
            return transformEntry(fromMap().ceilingEntry(key));
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K ceilingKey(@com.google.common.collect.ParametricNullness K key) {
            return fromMap().ceilingKey(key);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> descendingKeySet() {
            return fromMap().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V2> descendingMap() {
            return com.google.common.collect.Maps.transformEntries((java.util.NavigableMap) fromMap().descendingMap(), (com.google.common.collect.Maps.EntryTransformer) this.transformer);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V2> firstEntry() {
            return transformEntry(fromMap().firstEntry());
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V2> floorEntry(@com.google.common.collect.ParametricNullness K key) {
            return transformEntry(fromMap().floorEntry(key));
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K floorKey(@com.google.common.collect.ParametricNullness K key) {
            return fromMap().floorKey(key);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.NavigableMap<K, V2> headMap(@com.google.common.collect.ParametricNullness K toKey) {
            return headMap(toKey, false);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V2> headMap(@com.google.common.collect.ParametricNullness K toKey, boolean inclusive) {
            return com.google.common.collect.Maps.transformEntries((java.util.NavigableMap) fromMap().headMap(toKey, inclusive), (com.google.common.collect.Maps.EntryTransformer) this.transformer);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V2> higherEntry(@com.google.common.collect.ParametricNullness K key) {
            return transformEntry(fromMap().higherEntry(key));
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K higherKey(@com.google.common.collect.ParametricNullness K key) {
            return fromMap().higherKey(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V2> lastEntry() {
            return transformEntry(fromMap().lastEntry());
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V2> lowerEntry(@com.google.common.collect.ParametricNullness K key) {
            return transformEntry(fromMap().lowerEntry(key));
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K lowerKey(@com.google.common.collect.ParametricNullness K key) {
            return fromMap().lowerKey(key);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> navigableKeySet() {
            return fromMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V2> pollFirstEntry() {
            return transformEntry(fromMap().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V2> pollLastEntry() {
            return transformEntry(fromMap().pollLastEntry());
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V2> subMap(@com.google.common.collect.ParametricNullness K fromKey, boolean fromInclusive, @com.google.common.collect.ParametricNullness K toKey, boolean toInclusive) {
            return com.google.common.collect.Maps.transformEntries((java.util.NavigableMap) fromMap().subMap(fromKey, fromInclusive, toKey, toInclusive), (com.google.common.collect.Maps.EntryTransformer) this.transformer);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.NavigableMap<K, V2> subMap(@com.google.common.collect.ParametricNullness K fromKey, @com.google.common.collect.ParametricNullness K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.NavigableMap<K, V2> tailMap(@com.google.common.collect.ParametricNullness K fromKey) {
            return tailMap(fromKey, true);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V2> tailMap(@com.google.common.collect.ParametricNullness K fromKey, boolean inclusive) {
            return com.google.common.collect.Maps.transformEntries((java.util.NavigableMap) fromMap().tailMap(fromKey, inclusive), (com.google.common.collect.Maps.EntryTransformer) this.transformer);
        }

        @javax.annotation.CheckForNull
        private java.util.Map.Entry<K, V2> transformEntry(@javax.annotation.CheckForNull java.util.Map.Entry<K, V1> entry) {
            if (entry == null) {
                return null;
            }
            return com.google.common.collect.Maps.transformEntry(this.transformer, entry);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap
        public java.util.NavigableMap<K, V1> fromMap() {
            return (java.util.NavigableMap) super.fromMap();
        }
    }

    static <K> com.google.common.base.Predicate<java.util.Map.Entry<K, ?>> keyPredicateOnEntries(com.google.common.base.Predicate<? super K> keyPredicate) {
        return com.google.common.base.Predicates.compose(keyPredicate, keyFunction());
    }

    static <V> com.google.common.base.Predicate<java.util.Map.Entry<?, V>> valuePredicateOnEntries(com.google.common.base.Predicate<? super V> valuePredicate) {
        return com.google.common.base.Predicates.compose(valuePredicate, valueFunction());
    }

    public static <K, V> java.util.Map<K, V> filterKeys(java.util.Map<K, V> unfiltered, final com.google.common.base.Predicate<? super K> keyPredicate) {
        com.google.common.base.Preconditions.checkNotNull(keyPredicate);
        com.google.common.base.Predicate predicateKeyPredicateOnEntries = keyPredicateOnEntries(keyPredicate);
        if (unfiltered instanceof com.google.common.collect.Maps.AbstractFilteredMap) {
            return filterFiltered((com.google.common.collect.Maps.AbstractFilteredMap) unfiltered, predicateKeyPredicateOnEntries);
        }
        return new com.google.common.collect.Maps.FilteredKeyMap((java.util.Map) com.google.common.base.Preconditions.checkNotNull(unfiltered), keyPredicate, predicateKeyPredicateOnEntries);
    }

    public static <K, V> java.util.SortedMap<K, V> filterKeys(java.util.SortedMap<K, V> unfiltered, final com.google.common.base.Predicate<? super K> keyPredicate) {
        return filterEntries((java.util.SortedMap) unfiltered, keyPredicateOnEntries(keyPredicate));
    }

    public static <K, V> java.util.NavigableMap<K, V> filterKeys(java.util.NavigableMap<K, V> unfiltered, final com.google.common.base.Predicate<? super K> keyPredicate) {
        return filterEntries((java.util.NavigableMap) unfiltered, keyPredicateOnEntries(keyPredicate));
    }

    public static <K, V> com.google.common.collect.BiMap<K, V> filterKeys(com.google.common.collect.BiMap<K, V> unfiltered, final com.google.common.base.Predicate<? super K> keyPredicate) {
        com.google.common.base.Preconditions.checkNotNull(keyPredicate);
        return filterEntries((com.google.common.collect.BiMap) unfiltered, keyPredicateOnEntries(keyPredicate));
    }

    public static <K, V> java.util.Map<K, V> filterValues(java.util.Map<K, V> unfiltered, final com.google.common.base.Predicate<? super V> valuePredicate) {
        return filterEntries(unfiltered, valuePredicateOnEntries(valuePredicate));
    }

    public static <K, V> java.util.SortedMap<K, V> filterValues(java.util.SortedMap<K, V> unfiltered, final com.google.common.base.Predicate<? super V> valuePredicate) {
        return filterEntries((java.util.SortedMap) unfiltered, valuePredicateOnEntries(valuePredicate));
    }

    public static <K, V> java.util.NavigableMap<K, V> filterValues(java.util.NavigableMap<K, V> unfiltered, final com.google.common.base.Predicate<? super V> valuePredicate) {
        return filterEntries((java.util.NavigableMap) unfiltered, valuePredicateOnEntries(valuePredicate));
    }

    public static <K, V> com.google.common.collect.BiMap<K, V> filterValues(com.google.common.collect.BiMap<K, V> unfiltered, final com.google.common.base.Predicate<? super V> valuePredicate) {
        return filterEntries((com.google.common.collect.BiMap) unfiltered, valuePredicateOnEntries(valuePredicate));
    }

    public static <K, V> java.util.Map<K, V> filterEntries(java.util.Map<K, V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate) {
        com.google.common.base.Preconditions.checkNotNull(entryPredicate);
        if (unfiltered instanceof com.google.common.collect.Maps.AbstractFilteredMap) {
            return filterFiltered((com.google.common.collect.Maps.AbstractFilteredMap) unfiltered, entryPredicate);
        }
        return new com.google.common.collect.Maps.FilteredEntryMap((java.util.Map) com.google.common.base.Preconditions.checkNotNull(unfiltered), entryPredicate);
    }

    public static <K, V> java.util.SortedMap<K, V> filterEntries(java.util.SortedMap<K, V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate) {
        com.google.common.base.Preconditions.checkNotNull(entryPredicate);
        if (unfiltered instanceof com.google.common.collect.Maps.FilteredEntrySortedMap) {
            return filterFiltered((com.google.common.collect.Maps.FilteredEntrySortedMap) unfiltered, (com.google.common.base.Predicate) entryPredicate);
        }
        return new com.google.common.collect.Maps.FilteredEntrySortedMap((java.util.SortedMap) com.google.common.base.Preconditions.checkNotNull(unfiltered), entryPredicate);
    }

    public static <K, V> java.util.NavigableMap<K, V> filterEntries(java.util.NavigableMap<K, V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate) {
        com.google.common.base.Preconditions.checkNotNull(entryPredicate);
        if (unfiltered instanceof com.google.common.collect.Maps.FilteredEntryNavigableMap) {
            return filterFiltered((com.google.common.collect.Maps.FilteredEntryNavigableMap) unfiltered, entryPredicate);
        }
        return new com.google.common.collect.Maps.FilteredEntryNavigableMap((java.util.NavigableMap) com.google.common.base.Preconditions.checkNotNull(unfiltered), entryPredicate);
    }

    public static <K, V> com.google.common.collect.BiMap<K, V> filterEntries(com.google.common.collect.BiMap<K, V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate) {
        com.google.common.base.Preconditions.checkNotNull(unfiltered);
        com.google.common.base.Preconditions.checkNotNull(entryPredicate);
        if (unfiltered instanceof com.google.common.collect.Maps.FilteredEntryBiMap) {
            return filterFiltered((com.google.common.collect.Maps.FilteredEntryBiMap) unfiltered, (com.google.common.base.Predicate) entryPredicate);
        }
        return new com.google.common.collect.Maps.FilteredEntryBiMap(unfiltered, entryPredicate);
    }

    private static <K, V> java.util.Map<K, V> filterFiltered(com.google.common.collect.Maps.AbstractFilteredMap<K, V> map, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate) {
        return new com.google.common.collect.Maps.FilteredEntryMap(map.unfiltered, com.google.common.base.Predicates.and(map.predicate, entryPredicate));
    }

    private static <K, V> java.util.SortedMap<K, V> filterFiltered(com.google.common.collect.Maps.FilteredEntrySortedMap<K, V> map, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate) {
        return new com.google.common.collect.Maps.FilteredEntrySortedMap(map.sortedMap(), com.google.common.base.Predicates.and(map.predicate, entryPredicate));
    }

    private static <K, V> java.util.NavigableMap<K, V> filterFiltered(com.google.common.collect.Maps.FilteredEntryNavigableMap<K, V> map, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate) {
        return new com.google.common.collect.Maps.FilteredEntryNavigableMap(((com.google.common.collect.Maps.FilteredEntryNavigableMap) map).unfiltered, com.google.common.base.Predicates.and(((com.google.common.collect.Maps.FilteredEntryNavigableMap) map).entryPredicate, entryPredicate));
    }

    private static <K, V> com.google.common.collect.BiMap<K, V> filterFiltered(com.google.common.collect.Maps.FilteredEntryBiMap<K, V> map, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate) {
        return new com.google.common.collect.Maps.FilteredEntryBiMap(map.unfiltered(), com.google.common.base.Predicates.and(map.predicate, entryPredicate));
    }

    private static abstract class AbstractFilteredMap<K, V> extends com.google.common.collect.Maps.ViewCachingAbstractMap<K, V> {
        final com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate;
        final java.util.Map<K, V> unfiltered;

        AbstractFilteredMap(java.util.Map<K, V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
            this.unfiltered = unfiltered;
            this.predicate = predicate;
        }

        boolean apply(@javax.annotation.CheckForNull java.lang.Object key, @com.google.common.collect.ParametricNullness V value) {
            return this.predicate.apply(com.google.common.collect.Maps.immutableEntry(key, value));
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
            com.google.common.base.Preconditions.checkArgument(apply(key, value));
            return this.unfiltered.put(key, value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(java.util.Map<? extends K, ? extends V> map) {
            for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                com.google.common.base.Preconditions.checkArgument(apply(entry.getKey(), entry.getValue()));
            }
            this.unfiltered.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return this.unfiltered.containsKey(key) && apply(key, this.unfiltered.get(key));
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object key) {
            V v = this.unfiltered.get(key);
            if (v == null || !apply(key, v)) {
                return null;
            }
            return v;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V remove(@javax.annotation.CheckForNull java.lang.Object key) {
            if (containsKey(key)) {
                return this.unfiltered.remove(key);
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        java.util.Collection<V> createValues() {
            return new com.google.common.collect.Maps.FilteredMapValues(this, this.unfiltered, this.predicate);
        }
    }

    private static final class FilteredMapValues<K, V> extends com.google.common.collect.Maps.Values<K, V> {
        final com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate;
        final java.util.Map<K, V> unfiltered;

        FilteredMapValues(java.util.Map<K, V> filteredMap, java.util.Map<K, V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
            super(filteredMap);
            this.unfiltered = unfiltered;
            this.predicate = predicate;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = this.unfiltered.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry<K, V> next = it.next();
                if (this.predicate.apply(next) && com.google.common.base.Objects.equal(next.getValue(), o)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(java.util.Collection<?> collection) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = this.unfiltered.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                java.util.Map.Entry<K, V> next = it.next();
                if (this.predicate.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(java.util.Collection<?> collection) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = this.unfiltered.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                java.util.Map.Entry<K, V> next = it.next();
                if (this.predicate.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public java.lang.Object[] toArray() {
            return com.google.common.collect.Lists.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) com.google.common.collect.Lists.newArrayList(iterator()).toArray(tArr);
        }
    }

    private static class FilteredKeyMap<K, V> extends com.google.common.collect.Maps.AbstractFilteredMap<K, V> {
        final com.google.common.base.Predicate<? super K> keyPredicate;

        FilteredKeyMap(java.util.Map<K, V> unfiltered, com.google.common.base.Predicate<? super K> keyPredicate, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate) {
            super(unfiltered, entryPredicate);
            this.keyPredicate = keyPredicate;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected java.util.Set<java.util.Map.Entry<K, V>> createEntrySet() {
            return com.google.common.collect.Sets.filter(this.unfiltered.entrySet(), this.predicate);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        java.util.Set<K> createKeySet() {
            return com.google.common.collect.Sets.filter(this.unfiltered.keySet(), this.keyPredicate);
        }

        @Override // com.google.common.collect.Maps.AbstractFilteredMap, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return this.unfiltered.containsKey(key) && this.keyPredicate.apply(key);
        }
    }

    static class FilteredEntryMap<K, V> extends com.google.common.collect.Maps.AbstractFilteredMap<K, V> {
        final java.util.Set<java.util.Map.Entry<K, V>> filteredEntrySet;

        FilteredEntryMap(java.util.Map<K, V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate) {
            super(unfiltered, entryPredicate);
            this.filteredEntrySet = com.google.common.collect.Sets.filter(unfiltered.entrySet(), this.predicate);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected java.util.Set<java.util.Map.Entry<K, V>> createEntrySet() {
            return new com.google.common.collect.Maps.FilteredEntryMap.EntrySet();
        }

        private class EntrySet extends com.google.common.collect.ForwardingSet<java.util.Map.Entry<K, V>> {
            private EntrySet() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public java.util.Set<java.util.Map.Entry<K, V>> delegate() {
                return com.google.common.collect.Maps.FilteredEntryMap.this.filteredEntrySet;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                return new com.google.common.collect.TransformedIterator<java.util.Map.Entry<K, V>, java.util.Map.Entry<K, V>>(com.google.common.collect.Maps.FilteredEntryMap.this.filteredEntrySet.iterator()) { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    @Override // com.google.common.collect.TransformedIterator
                    public java.util.Map.Entry<K, V> transform(final java.util.Map.Entry<K, V> entry) {
                        return new com.google.common.collect.ForwardingMapEntry<K, V>() { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1.1
                            /* JADX INFO: Access modifiers changed from: protected */
                            @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                            public java.util.Map.Entry<K, V> delegate() {
                                return entry;
                            }

                            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                            @com.google.common.collect.ParametricNullness
                            public V setValue(@com.google.common.collect.ParametricNullness V v) {
                                com.google.common.base.Preconditions.checkArgument(com.google.common.collect.Maps.FilteredEntryMap.this.apply(getKey(), v));
                                return (V) super.setValue(v);
                            }
                        };
                    }
                };
            }
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        java.util.Set<K> createKeySet() {
            return new com.google.common.collect.Maps.FilteredEntryMap.KeySet();
        }

        static <K, V> boolean removeAllKeys(java.util.Map<K, V> map, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate, java.util.Collection<?> keyCollection) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                java.util.Map.Entry<K, V> next = it.next();
                if (entryPredicate.apply(next) && keyCollection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        static <K, V> boolean retainAllKeys(java.util.Map<K, V> map, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate, java.util.Collection<?> keyCollection) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                java.util.Map.Entry<K, V> next = it.next();
                if (entryPredicate.apply(next) && !keyCollection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        class KeySet extends com.google.common.collect.Maps.KeySet<K, V> {
            KeySet() {
                super(com.google.common.collect.Maps.FilteredEntryMap.this);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
                if (!com.google.common.collect.Maps.FilteredEntryMap.this.containsKey(o)) {
                    return false;
                }
                com.google.common.collect.Maps.FilteredEntryMap.this.unfiltered.remove(o);
                return true;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(java.util.Collection<?> collection) {
                return com.google.common.collect.Maps.FilteredEntryMap.removeAllKeys(com.google.common.collect.Maps.FilteredEntryMap.this.unfiltered, com.google.common.collect.Maps.FilteredEntryMap.this.predicate, collection);
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(java.util.Collection<?> collection) {
                return com.google.common.collect.Maps.FilteredEntryMap.retainAllKeys(com.google.common.collect.Maps.FilteredEntryMap.this.unfiltered, com.google.common.collect.Maps.FilteredEntryMap.this.predicate, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public java.lang.Object[] toArray() {
                return com.google.common.collect.Lists.newArrayList(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) com.google.common.collect.Lists.newArrayList(iterator()).toArray(tArr);
            }
        }
    }

    private static class FilteredEntrySortedMap<K, V> extends com.google.common.collect.Maps.FilteredEntryMap<K, V> implements java.util.SortedMap<K, V> {
        FilteredEntrySortedMap(java.util.SortedMap<K, V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate) {
            super(unfiltered, entryPredicate);
        }

        java.util.SortedMap<K, V> sortedMap() {
            return (java.util.SortedMap) this.unfiltered;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public java.util.SortedSet<K> keySet() {
            return (java.util.SortedSet) super.keySet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.FilteredEntryMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public java.util.SortedSet<K> createKeySet() {
            return new com.google.common.collect.Maps.FilteredEntrySortedMap.SortedKeySet();
        }

        class SortedKeySet extends com.google.common.collect.Maps.FilteredEntryMap<K, V>.KeySet implements java.util.SortedSet<K> {
            SortedKeySet() {
                super();
            }

            @Override // java.util.SortedSet
            @javax.annotation.CheckForNull
            public java.util.Comparator<? super K> comparator() {
                return com.google.common.collect.Maps.FilteredEntrySortedMap.this.sortedMap().comparator();
            }

            @Override // java.util.SortedSet
            public java.util.SortedSet<K> subSet(@com.google.common.collect.ParametricNullness K fromElement, @com.google.common.collect.ParametricNullness K toElement) {
                return (java.util.SortedSet) com.google.common.collect.Maps.FilteredEntrySortedMap.this.subMap(fromElement, toElement).keySet();
            }

            @Override // java.util.SortedSet
            public java.util.SortedSet<K> headSet(@com.google.common.collect.ParametricNullness K toElement) {
                return (java.util.SortedSet) com.google.common.collect.Maps.FilteredEntrySortedMap.this.headMap(toElement).keySet();
            }

            @Override // java.util.SortedSet
            public java.util.SortedSet<K> tailSet(@com.google.common.collect.ParametricNullness K fromElement) {
                return (java.util.SortedSet) com.google.common.collect.Maps.FilteredEntrySortedMap.this.tailMap(fromElement).keySet();
            }

            @Override // java.util.SortedSet
            @com.google.common.collect.ParametricNullness
            public K first() {
                return (K) com.google.common.collect.Maps.FilteredEntrySortedMap.this.firstKey();
            }

            @Override // java.util.SortedSet
            @com.google.common.collect.ParametricNullness
            public K last() {
                return (K) com.google.common.collect.Maps.FilteredEntrySortedMap.this.lastKey();
            }
        }

        @Override // java.util.SortedMap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
            return sortedMap().comparator();
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K firstKey() {
            return keySet().iterator().next();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K lastKey() {
            java.util.SortedMap<K, V> sortedMap = sortedMap();
            while (true) {
                K kLastKey = sortedMap.lastKey();
                if (apply(kLastKey, com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.unfiltered.get(kLastKey)))) {
                    return kLastKey;
                }
                sortedMap = sortedMap().headMap(kLastKey);
            }
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<K, V> headMap(@com.google.common.collect.ParametricNullness K toKey) {
            return new com.google.common.collect.Maps.FilteredEntrySortedMap(sortedMap().headMap(toKey), this.predicate);
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<K, V> subMap(@com.google.common.collect.ParametricNullness K fromKey, @com.google.common.collect.ParametricNullness K toKey) {
            return new com.google.common.collect.Maps.FilteredEntrySortedMap(sortedMap().subMap(fromKey, toKey), this.predicate);
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K fromKey) {
            return new com.google.common.collect.Maps.FilteredEntrySortedMap(sortedMap().tailMap(fromKey), this.predicate);
        }
    }

    private static class FilteredEntryNavigableMap<K, V> extends com.google.common.collect.AbstractNavigableMap<K, V> {
        private final com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate;
        private final java.util.Map<K, V> filteredDelegate;
        private final java.util.NavigableMap<K, V> unfiltered;

        FilteredEntryNavigableMap(java.util.NavigableMap<K, V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate) {
            this.unfiltered = (java.util.NavigableMap) com.google.common.base.Preconditions.checkNotNull(unfiltered);
            this.entryPredicate = entryPredicate;
            this.filteredDelegate = new com.google.common.collect.Maps.FilteredEntryMap(unfiltered, entryPredicate);
        }

        @Override // java.util.SortedMap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
            return this.unfiltered.comparator();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public java.util.NavigableSet<K> navigableKeySet() {
            return new com.google.common.collect.Maps.NavigableKeySet<K, V>(this) { // from class: com.google.common.collect.Maps.FilteredEntryNavigableMap.1
                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean removeAll(java.util.Collection<?> collection) {
                    return com.google.common.collect.Maps.FilteredEntryMap.removeAllKeys(com.google.common.collect.Maps.FilteredEntryNavigableMap.this.unfiltered, com.google.common.collect.Maps.FilteredEntryNavigableMap.this.entryPredicate, collection);
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(java.util.Collection<?> collection) {
                    return com.google.common.collect.Maps.FilteredEntryMap.retainAllKeys(com.google.common.collect.Maps.FilteredEntryNavigableMap.this.unfiltered, com.google.common.collect.Maps.FilteredEntryNavigableMap.this.entryPredicate, collection);
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public java.util.Collection<V> values() {
            return new com.google.common.collect.Maps.FilteredMapValues(this, this.unfiltered, this.entryPredicate);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            return com.google.common.collect.Iterators.filter(this.unfiltered.entrySet().iterator(), this.entryPredicate);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        java.util.Iterator<java.util.Map.Entry<K, V>> descendingEntryIterator() {
            return com.google.common.collect.Iterators.filter(this.unfiltered.descendingMap().entrySet().iterator(), this.entryPredicate);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.filteredDelegate.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return !com.google.common.collect.Iterables.any(this.unfiltered.entrySet(), this.entryPredicate);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object key) {
            return this.filteredDelegate.get(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return this.filteredDelegate.containsKey(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
            return this.filteredDelegate.put(key, value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V remove(@javax.annotation.CheckForNull java.lang.Object key) {
            return this.filteredDelegate.remove(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(java.util.Map<? extends K, ? extends V> m) {
            this.filteredDelegate.putAll(m);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.filteredDelegate.clear();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            return this.filteredDelegate.entrySet();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> pollFirstEntry() {
            return (java.util.Map.Entry) com.google.common.collect.Iterables.removeFirstMatching(this.unfiltered.entrySet(), this.entryPredicate);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> pollLastEntry() {
            return (java.util.Map.Entry) com.google.common.collect.Iterables.removeFirstMatching(this.unfiltered.descendingMap().entrySet(), this.entryPredicate);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public java.util.NavigableMap<K, V> descendingMap() {
            return com.google.common.collect.Maps.filterEntries((java.util.NavigableMap) this.unfiltered.descendingMap(), (com.google.common.base.Predicate) this.entryPredicate);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> subMap(@com.google.common.collect.ParametricNullness K fromKey, boolean fromInclusive, @com.google.common.collect.ParametricNullness K toKey, boolean toInclusive) {
            return com.google.common.collect.Maps.filterEntries((java.util.NavigableMap) this.unfiltered.subMap(fromKey, fromInclusive, toKey, toInclusive), (com.google.common.base.Predicate) this.entryPredicate);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> headMap(@com.google.common.collect.ParametricNullness K toKey, boolean inclusive) {
            return com.google.common.collect.Maps.filterEntries((java.util.NavigableMap) this.unfiltered.headMap(toKey, inclusive), (com.google.common.base.Predicate) this.entryPredicate);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K fromKey, boolean inclusive) {
            return com.google.common.collect.Maps.filterEntries((java.util.NavigableMap) this.unfiltered.tailMap(fromKey, inclusive), (com.google.common.base.Predicate) this.entryPredicate);
        }
    }

    static final class FilteredEntryBiMap<K, V> extends com.google.common.collect.Maps.FilteredEntryMap<K, V> implements com.google.common.collect.BiMap<K, V> {
        private final com.google.common.collect.BiMap<V, K> inverse;

        private static <K, V> com.google.common.base.Predicate<java.util.Map.Entry<V, K>> inversePredicate(final com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> forwardPredicate) {
            return new com.google.common.base.Predicate<java.util.Map.Entry<V, K>>() { // from class: com.google.common.collect.Maps.FilteredEntryBiMap.1
                @Override // com.google.common.base.Predicate
                public boolean apply(java.util.Map.Entry<V, K> input) {
                    return forwardPredicate.apply(com.google.common.collect.Maps.immutableEntry(input.getValue(), input.getKey()));
                }
            };
        }

        FilteredEntryBiMap(com.google.common.collect.BiMap<K, V> delegate, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate) {
            super(delegate, predicate);
            this.inverse = new com.google.common.collect.Maps.FilteredEntryBiMap(delegate.inverse(), inversePredicate(predicate), this);
        }

        private FilteredEntryBiMap(com.google.common.collect.BiMap<K, V> delegate, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> predicate, com.google.common.collect.BiMap<V, K> inverse) {
            super(delegate, predicate);
            this.inverse = inverse;
        }

        com.google.common.collect.BiMap<K, V> unfiltered() {
            return (com.google.common.collect.BiMap) this.unfiltered;
        }

        @Override // com.google.common.collect.BiMap
        @javax.annotation.CheckForNull
        public V forcePut(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
            com.google.common.base.Preconditions.checkArgument(apply(key, value));
            return unfiltered().forcePut(key, value);
        }

        @Override // com.google.common.collect.BiMap
        public com.google.common.collect.BiMap<V, K> inverse() {
            return this.inverse;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public java.util.Set<V> values() {
            return this.inverse.keySet();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> java.util.NavigableMap<K, V> unmodifiableNavigableMap(java.util.NavigableMap<K, ? extends V> map) {
        com.google.common.base.Preconditions.checkNotNull(map);
        return map instanceof com.google.common.collect.Maps.UnmodifiableNavigableMap ? map : new com.google.common.collect.Maps.UnmodifiableNavigableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @javax.annotation.CheckForNull
    public static <K, V> java.util.Map.Entry<K, V> unmodifiableOrNull(@javax.annotation.CheckForNull java.util.Map.Entry<K, ? extends V> entry) {
        if (entry == null) {
            return null;
        }
        return unmodifiableEntry(entry);
    }

    static class UnmodifiableNavigableMap<K, V> extends com.google.common.collect.ForwardingSortedMap<K, V> implements java.util.NavigableMap<K, V>, java.io.Serializable {
        private final java.util.NavigableMap<K, ? extends V> delegate;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient com.google.common.collect.Maps.UnmodifiableNavigableMap<K, V> descendingMap;

        UnmodifiableNavigableMap(java.util.NavigableMap<K, ? extends V> delegate) {
            this.delegate = delegate;
        }

        UnmodifiableNavigableMap(java.util.NavigableMap<K, ? extends V> delegate, com.google.common.collect.Maps.UnmodifiableNavigableMap<K, V> descendingMap) {
            this.delegate = delegate;
            this.descendingMap = descendingMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public java.util.SortedMap<K, V> delegate() {
            return java.util.Collections.unmodifiableSortedMap(this.delegate);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> lowerEntry(@com.google.common.collect.ParametricNullness K key) {
            return com.google.common.collect.Maps.unmodifiableOrNull(this.delegate.lowerEntry(key));
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K lowerKey(@com.google.common.collect.ParametricNullness K key) {
            return this.delegate.lowerKey(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> floorEntry(@com.google.common.collect.ParametricNullness K key) {
            return com.google.common.collect.Maps.unmodifiableOrNull(this.delegate.floorEntry(key));
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K floorKey(@com.google.common.collect.ParametricNullness K key) {
            return this.delegate.floorKey(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> ceilingEntry(@com.google.common.collect.ParametricNullness K key) {
            return com.google.common.collect.Maps.unmodifiableOrNull(this.delegate.ceilingEntry(key));
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K ceilingKey(@com.google.common.collect.ParametricNullness K key) {
            return this.delegate.ceilingKey(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> higherEntry(@com.google.common.collect.ParametricNullness K key) {
            return com.google.common.collect.Maps.unmodifiableOrNull(this.delegate.higherEntry(key));
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K higherKey(@com.google.common.collect.ParametricNullness K key) {
            return this.delegate.higherKey(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> firstEntry() {
            return com.google.common.collect.Maps.unmodifiableOrNull(this.delegate.firstEntry());
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> lastEntry() {
            return com.google.common.collect.Maps.unmodifiableOrNull(this.delegate.lastEntry());
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public final java.util.Map.Entry<K, V> pollFirstEntry() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public final java.util.Map.Entry<K, V> pollLastEntry() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> descendingMap() {
            com.google.common.collect.Maps.UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap = this.descendingMap;
            if (unmodifiableNavigableMap != null) {
                return unmodifiableNavigableMap;
            }
            com.google.common.collect.Maps.UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap2 = new com.google.common.collect.Maps.UnmodifiableNavigableMap<>(this.delegate.descendingMap(), this);
            this.descendingMap = unmodifiableNavigableMap2;
            return unmodifiableNavigableMap2;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public java.util.Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> navigableKeySet() {
            return com.google.common.collect.Sets.unmodifiableNavigableSet(this.delegate.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> descendingKeySet() {
            return com.google.common.collect.Sets.unmodifiableNavigableSet(this.delegate.descendingKeySet());
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public java.util.SortedMap<K, V> subMap(@com.google.common.collect.ParametricNullness K fromKey, @com.google.common.collect.ParametricNullness K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> subMap(@com.google.common.collect.ParametricNullness K fromKey, boolean fromInclusive, @com.google.common.collect.ParametricNullness K toKey, boolean toInclusive) {
            return com.google.common.collect.Maps.unmodifiableNavigableMap(this.delegate.subMap(fromKey, fromInclusive, toKey, toInclusive));
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public java.util.SortedMap<K, V> headMap(@com.google.common.collect.ParametricNullness K toKey) {
            return headMap(toKey, false);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> headMap(@com.google.common.collect.ParametricNullness K toKey, boolean inclusive) {
            return com.google.common.collect.Maps.unmodifiableNavigableMap(this.delegate.headMap(toKey, inclusive));
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public java.util.SortedMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K fromKey) {
            return tailMap(fromKey, true);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K fromKey, boolean inclusive) {
            return com.google.common.collect.Maps.unmodifiableNavigableMap(this.delegate.tailMap(fromKey, inclusive));
        }
    }

    public static <K, V> java.util.NavigableMap<K, V> synchronizedNavigableMap(java.util.NavigableMap<K, V> navigableMap) {
        return com.google.common.collect.Synchronized.navigableMap(navigableMap);
    }

    static abstract class ViewCachingAbstractMap<K, V> extends java.util.AbstractMap<K, V> {

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient java.util.Set<K> keySet;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient java.util.Collection<V> values;

        abstract java.util.Set<java.util.Map.Entry<K, V>> createEntrySet();

        ViewCachingAbstractMap() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            java.util.Set<java.util.Map.Entry<K, V>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            java.util.Set<java.util.Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
            this.entrySet = setCreateEntrySet;
            return setCreateEntrySet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
            java.util.Set<K> set = this.keySet;
            if (set != null) {
                return set;
            }
            java.util.Set<K> setCreateKeySet = createKeySet();
            this.keySet = setCreateKeySet;
            return setCreateKeySet;
        }

        java.util.Set<K> createKeySet() {
            return new com.google.common.collect.Maps.KeySet(this);
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public java.util.Collection<V> values() {
            java.util.Collection<V> collection = this.values;
            if (collection != null) {
                return collection;
            }
            java.util.Collection<V> collectionCreateValues = createValues();
            this.values = collectionCreateValues;
            return collectionCreateValues;
        }

        java.util.Collection<V> createValues() {
            return new com.google.common.collect.Maps.Values(this);
        }
    }

    static abstract class IteratorBasedAbstractMap<K, V> extends java.util.AbstractMap<K, V> {
        abstract java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator();

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();

        IteratorBasedAbstractMap() {
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            return new com.google.common.collect.Maps.EntrySet<K, V>() { // from class: com.google.common.collect.Maps.IteratorBasedAbstractMap.1
                @Override // com.google.common.collect.Maps.EntrySet
                java.util.Map<K, V> map() {
                    return com.google.common.collect.Maps.IteratorBasedAbstractMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                    return com.google.common.collect.Maps.IteratorBasedAbstractMap.this.entryIterator();
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            com.google.common.collect.Iterators.clear(entryIterator());
        }
    }

    @javax.annotation.CheckForNull
    static <V> V safeGet(java.util.Map<?, V> map, @javax.annotation.CheckForNull java.lang.Object key) {
        com.google.common.base.Preconditions.checkNotNull(map);
        try {
            return map.get(key);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return null;
        }
    }

    static boolean safeContainsKey(java.util.Map<?, ?> map, @javax.annotation.CheckForNull java.lang.Object key) {
        com.google.common.base.Preconditions.checkNotNull(map);
        try {
            return map.containsKey(key);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @javax.annotation.CheckForNull
    static <V> V safeRemove(java.util.Map<?, V> map, @javax.annotation.CheckForNull java.lang.Object key) {
        com.google.common.base.Preconditions.checkNotNull(map);
        try {
            return map.remove(key);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return null;
        }
    }

    static boolean containsKeyImpl(java.util.Map<?, ?> map, @javax.annotation.CheckForNull java.lang.Object key) {
        return com.google.common.collect.Iterators.contains(keyIterator(map.entrySet().iterator()), key);
    }

    static boolean containsValueImpl(java.util.Map<?, ?> map, @javax.annotation.CheckForNull java.lang.Object value) {
        return com.google.common.collect.Iterators.contains(valueIterator(map.entrySet().iterator()), value);
    }

    static <K, V> boolean containsEntryImpl(java.util.Collection<java.util.Map.Entry<K, V>> c, @javax.annotation.CheckForNull java.lang.Object o) {
        if (o instanceof java.util.Map.Entry) {
            return c.contains(unmodifiableEntry((java.util.Map.Entry) o));
        }
        return false;
    }

    static <K, V> boolean removeEntryImpl(java.util.Collection<java.util.Map.Entry<K, V>> c, @javax.annotation.CheckForNull java.lang.Object o) {
        if (o instanceof java.util.Map.Entry) {
            return c.remove(unmodifiableEntry((java.util.Map.Entry) o));
        }
        return false;
    }

    static boolean equalsImpl(java.util.Map<?, ?> map, @javax.annotation.CheckForNull java.lang.Object object) {
        if (map == object) {
            return true;
        }
        if (object instanceof java.util.Map) {
            return map.entrySet().equals(((java.util.Map) object).entrySet());
        }
        return false;
    }

    static java.lang.String toStringImpl(java.util.Map<?, ?> map) {
        java.lang.StringBuilder sbAppend = com.google.common.collect.Collections2.newStringBuilderForCollection(map.size()).append('{');
        boolean z = true;
        for (java.util.Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                sbAppend.append(", ");
            }
            sbAppend.append(entry.getKey()).append('=').append(entry.getValue());
            z = false;
        }
        return sbAppend.append('}').toString();
    }

    static <K, V> void putAllImpl(java.util.Map<K, V> self, java.util.Map<? extends K, ? extends V> map) {
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            self.put(entry.getKey(), entry.getValue());
        }
    }

    static class KeySet<K, V> extends com.google.common.collect.Sets.ImprovedAbstractSet<K> {
        final java.util.Map<K, V> map;

        KeySet(java.util.Map<K, V> map) {
            this.map = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map);
        }

        java.util.Map<K, V> map() {
            return this.map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
            return com.google.common.collect.Maps.keyIterator(map().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return map().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return map().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            return map().containsKey(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            if (!contains(o)) {
                return false;
            }
            map().remove(o);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            map().clear();
        }
    }

    @javax.annotation.CheckForNull
    static <K> K keyOrNull(@javax.annotation.CheckForNull java.util.Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    @javax.annotation.CheckForNull
    static <V> V valueOrNull(@javax.annotation.CheckForNull java.util.Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    static class SortedKeySet<K, V> extends com.google.common.collect.Maps.KeySet<K, V> implements java.util.SortedSet<K> {
        SortedKeySet(java.util.SortedMap<K, V> map) {
            super(map);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.KeySet
        public java.util.SortedMap<K, V> map() {
            return (java.util.SortedMap) super.map();
        }

        @Override // java.util.SortedSet
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
            return map().comparator();
        }

        public java.util.SortedSet<K> subSet(@com.google.common.collect.ParametricNullness K fromElement, @com.google.common.collect.ParametricNullness K toElement) {
            return new com.google.common.collect.Maps.SortedKeySet(map().subMap(fromElement, toElement));
        }

        public java.util.SortedSet<K> headSet(@com.google.common.collect.ParametricNullness K toElement) {
            return new com.google.common.collect.Maps.SortedKeySet(map().headMap(toElement));
        }

        public java.util.SortedSet<K> tailSet(@com.google.common.collect.ParametricNullness K fromElement) {
            return new com.google.common.collect.Maps.SortedKeySet(map().tailMap(fromElement));
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public K first() {
            return map().firstKey();
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public K last() {
            return map().lastKey();
        }
    }

    static class NavigableKeySet<K, V> extends com.google.common.collect.Maps.SortedKeySet<K, V> implements java.util.NavigableSet<K> {
        NavigableKeySet(java.util.NavigableMap<K, V> map) {
            super(map);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.SortedKeySet, com.google.common.collect.Maps.KeySet
        public java.util.NavigableMap<K, V> map() {
            return (java.util.NavigableMap) this.map;
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K lower(@com.google.common.collect.ParametricNullness K e) {
            return map().lowerKey(e);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K floor(@com.google.common.collect.ParametricNullness K e) {
            return map().floorKey(e);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K ceiling(@com.google.common.collect.ParametricNullness K e) {
            return map().ceilingKey(e);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K higher(@com.google.common.collect.ParametricNullness K e) {
            return map().higherKey(e);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K pollFirst() {
            return (K) com.google.common.collect.Maps.keyOrNull(map().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K pollLast() {
            return (K) com.google.common.collect.Maps.keyOrNull(map().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> descendingSet() {
            return map().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> subSet(@com.google.common.collect.ParametricNullness K fromElement, boolean fromInclusive, @com.google.common.collect.ParametricNullness K toElement, boolean toInclusive) {
            return map().subMap(fromElement, fromInclusive, toElement, toInclusive).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet<K> subSet(@com.google.common.collect.ParametricNullness K fromElement, @com.google.common.collect.ParametricNullness K toElement) {
            return subSet(fromElement, true, toElement, false);
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> headSet(@com.google.common.collect.ParametricNullness K toElement, boolean inclusive) {
            return map().headMap(toElement, inclusive).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet<K> headSet(@com.google.common.collect.ParametricNullness K toElement) {
            return headSet(toElement, false);
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> tailSet(@com.google.common.collect.ParametricNullness K fromElement, boolean inclusive) {
            return map().tailMap(fromElement, inclusive).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet<K> tailSet(@com.google.common.collect.ParametricNullness K fromElement) {
            return tailSet(fromElement, true);
        }
    }

    static class Values<K, V> extends java.util.AbstractCollection<V> {
        final java.util.Map<K, V> map;

        Values(java.util.Map<K, V> map) {
            this.map = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map);
        }

        final java.util.Map<K, V> map() {
            return this.map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
            return com.google.common.collect.Maps.valueIterator(map().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            try {
                return super.remove(o);
            } catch (java.lang.UnsupportedOperationException unused) {
                for (java.util.Map.Entry<K, V> entry : map().entrySet()) {
                    if (com.google.common.base.Objects.equal(o, entry.getValue())) {
                        map().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(java.util.Collection<?> c) {
            try {
                return super.removeAll((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(c));
            } catch (java.lang.UnsupportedOperationException unused) {
                java.util.HashSet hashSetNewHashSet = com.google.common.collect.Sets.newHashSet();
                for (java.util.Map.Entry<K, V> entry : map().entrySet()) {
                    if (c.contains(entry.getValue())) {
                        hashSetNewHashSet.add(entry.getKey());
                    }
                }
                return map().keySet().removeAll(hashSetNewHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(java.util.Collection<?> c) {
            try {
                return super.retainAll((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(c));
            } catch (java.lang.UnsupportedOperationException unused) {
                java.util.HashSet hashSetNewHashSet = com.google.common.collect.Sets.newHashSet();
                for (java.util.Map.Entry<K, V> entry : map().entrySet()) {
                    if (c.contains(entry.getValue())) {
                        hashSetNewHashSet.add(entry.getKey());
                    }
                }
                return map().keySet().retainAll(hashSetNewHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return map().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return map().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            return map().containsValue(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            map().clear();
        }
    }

    static abstract class EntrySet<K, V> extends com.google.common.collect.Sets.ImprovedAbstractSet<java.util.Map.Entry<K, V>> {
        abstract java.util.Map<K, V> map();

        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return map().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            map().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            if (!(o instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) o;
            java.lang.Object key = entry.getKey();
            java.lang.Object objSafeGet = com.google.common.collect.Maps.safeGet(map(), key);
            if (com.google.common.base.Objects.equal(objSafeGet, entry.getValue())) {
                return objSafeGet != null || map().containsKey(key);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return map().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            if (contains(o) && (o instanceof java.util.Map.Entry)) {
                return map().keySet().remove(((java.util.Map.Entry) o).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> c) {
            try {
                return super.removeAll((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(c));
            } catch (java.lang.UnsupportedOperationException unused) {
                return com.google.common.collect.Sets.removeAllImpl(this, c.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> c) {
            try {
                return super.retainAll((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(c));
            } catch (java.lang.UnsupportedOperationException unused) {
                java.util.HashSet hashSetNewHashSetWithExpectedSize = com.google.common.collect.Sets.newHashSetWithExpectedSize(c.size());
                for (java.lang.Object obj : c) {
                    if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
                        hashSetNewHashSetWithExpectedSize.add(((java.util.Map.Entry) obj).getKey());
                    }
                }
                return map().keySet().retainAll(hashSetNewHashSetWithExpectedSize);
            }
        }
    }

    static abstract class DescendingMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements java.util.NavigableMap<K, V> {

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient java.util.Comparator<? super K> comparator;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient java.util.NavigableSet<K> navigableKeySet;

        abstract java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator();

        abstract java.util.NavigableMap<K, V> forward();

        DescendingMap() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final java.util.Map<K, V> delegate() {
            return forward();
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super K> comparator() {
            java.util.Comparator<? super K> comparator = this.comparator;
            if (comparator != null) {
                return comparator;
            }
            java.util.Comparator<? super K> comparator2 = forward().comparator();
            if (comparator2 == null) {
                comparator2 = com.google.common.collect.Ordering.natural();
            }
            com.google.common.collect.Ordering orderingReverse = reverse(comparator2);
            this.comparator = orderingReverse;
            return orderingReverse;
        }

        private static <T> com.google.common.collect.Ordering<T> reverse(java.util.Comparator<T> forward) {
            return com.google.common.collect.Ordering.from(forward).reverse();
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K firstKey() {
            return forward().lastKey();
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K lastKey() {
            return forward().firstKey();
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> lowerEntry(@com.google.common.collect.ParametricNullness K key) {
            return forward().higherEntry(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K lowerKey(@com.google.common.collect.ParametricNullness K key) {
            return forward().higherKey(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> floorEntry(@com.google.common.collect.ParametricNullness K key) {
            return forward().ceilingEntry(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K floorKey(@com.google.common.collect.ParametricNullness K key) {
            return forward().ceilingKey(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> ceilingEntry(@com.google.common.collect.ParametricNullness K key) {
            return forward().floorEntry(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K ceilingKey(@com.google.common.collect.ParametricNullness K key) {
            return forward().floorKey(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> higherEntry(@com.google.common.collect.ParametricNullness K key) {
            return forward().lowerEntry(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K higherKey(@com.google.common.collect.ParametricNullness K key) {
            return forward().lowerKey(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> firstEntry() {
            return forward().lastEntry();
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> lastEntry() {
            return forward().firstEntry();
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> pollFirstEntry() {
            return forward().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> pollLastEntry() {
            return forward().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> descendingMap() {
            return forward();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            java.util.Set<java.util.Map.Entry<K, V>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            java.util.Set<java.util.Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
            this.entrySet = setCreateEntrySet;
            return setCreateEntrySet;
        }

        java.util.Set<java.util.Map.Entry<K, V>> createEntrySet() {
            return new com.google.common.collect.Maps.EntrySet<K, V>() { // from class: com.google.common.collect.Maps.DescendingMap.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                java.util.Map<K, V> map() {
                    return com.google.common.collect.Maps.DescendingMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                    return com.google.common.collect.Maps.DescendingMap.this.entryIterator();
                }
            };
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public java.util.Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> navigableKeySet() {
            java.util.NavigableSet<K> navigableSet = this.navigableKeySet;
            if (navigableSet != null) {
                return navigableSet;
            }
            com.google.common.collect.Maps.NavigableKeySet navigableKeySet = new com.google.common.collect.Maps.NavigableKeySet(this);
            this.navigableKeySet = navigableKeySet;
            return navigableKeySet;
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> descendingKeySet() {
            return forward().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> subMap(@com.google.common.collect.ParametricNullness K fromKey, boolean fromInclusive, @com.google.common.collect.ParametricNullness K toKey, boolean toInclusive) {
            return forward().subMap(toKey, toInclusive, fromKey, fromInclusive).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public java.util.SortedMap<K, V> subMap(@com.google.common.collect.ParametricNullness K fromKey, @com.google.common.collect.ParametricNullness K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> headMap(@com.google.common.collect.ParametricNullness K toKey, boolean inclusive) {
            return forward().tailMap(toKey, inclusive).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public java.util.SortedMap<K, V> headMap(@com.google.common.collect.ParametricNullness K toKey) {
            return headMap(toKey, false);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K fromKey, boolean inclusive) {
            return forward().headMap(fromKey, inclusive).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public java.util.SortedMap<K, V> tailMap(@com.google.common.collect.ParametricNullness K fromKey) {
            return tailMap(fromKey, true);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public java.util.Collection<V> values() {
            return new com.google.common.collect.Maps.Values(this);
        }

        @Override // com.google.common.collect.ForwardingObject
        public java.lang.String toString() {
            return standardToString();
        }
    }

    static <E> com.google.common.collect.ImmutableMap<E, java.lang.Integer> indexMap(java.util.Collection<E> list) {
        com.google.common.collect.ImmutableMap.Builder builder = new com.google.common.collect.ImmutableMap.Builder(list.size());
        java.util.Iterator<E> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            builder.put(it.next(), java.lang.Integer.valueOf(i));
            i++;
        }
        return builder.buildOrThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K extends java.lang.Comparable<? super K>, V> java.util.NavigableMap<K, V> subMap(java.util.NavigableMap<K, V> map, com.google.common.collect.Range<K> range) {
        if (map.comparator() != null && map.comparator() != com.google.common.collect.Ordering.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            com.google.common.base.Preconditions.checkArgument(map.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0, "map is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            return map.subMap(range.lowerEndpoint(), range.lowerBoundType() == com.google.common.collect.BoundType.CLOSED, range.upperEndpoint(), range.upperBoundType() == com.google.common.collect.BoundType.CLOSED);
        }
        if (range.hasLowerBound()) {
            return map.tailMap(range.lowerEndpoint(), range.lowerBoundType() == com.google.common.collect.BoundType.CLOSED);
        }
        if (range.hasUpperBound()) {
            return map.headMap(range.upperEndpoint(), range.upperBoundType() == com.google.common.collect.BoundType.CLOSED);
        }
        return (java.util.NavigableMap) com.google.common.base.Preconditions.checkNotNull(map);
    }
}
