package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public class ImmutableRangeMap<K extends java.lang.Comparable<?>, V> implements com.google.common.collect.RangeMap<K, V>, java.io.Serializable {
    private static final com.google.common.collect.ImmutableRangeMap<java.lang.Comparable<?>, java.lang.Object> EMPTY = new com.google.common.collect.ImmutableRangeMap<>(com.google.common.collect.ImmutableList.of(), com.google.common.collect.ImmutableList.of());
    private static final long serialVersionUID = 0;
    private final transient com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>> ranges;
    private final transient com.google.common.collect.ImmutableList<V> values;

    static <T, K extends java.lang.Comparable<? super K>, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableRangeMap<K, V>> toImmutableRangeMap(java.util.function.Function<? super T, com.google.common.collect.Range<K>> keyFunction, java.util.function.Function<? super T, ? extends V> valueFunction) {
        return com.google.common.collect.CollectCollectors.toImmutableRangeMap(keyFunction, valueFunction);
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableRangeMap<K, V> of() {
        return (com.google.common.collect.ImmutableRangeMap<K, V>) EMPTY;
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableRangeMap<K, V> of(com.google.common.collect.Range<K> range, V value) {
        return new com.google.common.collect.ImmutableRangeMap<>(com.google.common.collect.ImmutableList.of(range), com.google.common.collect.ImmutableList.of(value));
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableRangeMap<K, V> copyOf(com.google.common.collect.RangeMap<K, ? extends V> rangeMap) {
        if (rangeMap instanceof com.google.common.collect.ImmutableRangeMap) {
            return (com.google.common.collect.ImmutableRangeMap) rangeMap;
        }
        java.util.Map<com.google.common.collect.Range<K>, ? extends V> mapAsMapOfRanges = rangeMap.asMapOfRanges();
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(mapAsMapOfRanges.size());
        com.google.common.collect.ImmutableList.Builder builder2 = new com.google.common.collect.ImmutableList.Builder(mapAsMapOfRanges.size());
        for (java.util.Map.Entry entry : mapAsMapOfRanges.entrySet()) {
            builder.add((com.google.common.collect.Range) entry.getKey());
            builder2.add(entry.getValue());
        }
        return new com.google.common.collect.ImmutableRangeMap<>(builder.build(), builder2.build());
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableRangeMap.Builder<K, V> builder() {
        return new com.google.common.collect.ImmutableRangeMap.Builder<>();
    }

    @com.google.errorprone.annotations.DoNotMock
    public static final class Builder<K extends java.lang.Comparable<?>, V> {
        private final java.util.List<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entries = com.google.common.collect.Lists.newArrayList();

        public com.google.common.collect.ImmutableRangeMap.Builder<K, V> put(com.google.common.collect.Range<K> range, V value) {
            com.google.common.base.Preconditions.checkNotNull(range);
            com.google.common.base.Preconditions.checkNotNull(value);
            com.google.common.base.Preconditions.checkArgument(!range.isEmpty(), "Range must not be empty, but was %s", range);
            this.entries.add(com.google.common.collect.Maps.immutableEntry(range, value));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public com.google.common.collect.ImmutableRangeMap.Builder<K, V> putAll(com.google.common.collect.RangeMap<K, ? extends V> rangeMap) {
            for (java.util.Map.Entry entry : rangeMap.asMapOfRanges().entrySet()) {
                put((com.google.common.collect.Range) entry.getKey(), entry.getValue());
            }
            return this;
        }

        com.google.common.collect.ImmutableRangeMap.Builder<K, V> combine(com.google.common.collect.ImmutableRangeMap.Builder<K, V> builder) {
            this.entries.addAll(builder.entries);
            return this;
        }

        public com.google.common.collect.ImmutableRangeMap<K, V> build() {
            java.util.Collections.sort(this.entries, com.google.common.collect.Range.rangeLexOrdering().onKeys());
            com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(this.entries.size());
            com.google.common.collect.ImmutableList.Builder builder2 = new com.google.common.collect.ImmutableList.Builder(this.entries.size());
            for (int i = 0; i < this.entries.size(); i++) {
                com.google.common.collect.Range<K> key = this.entries.get(i).getKey();
                if (i > 0) {
                    com.google.common.collect.Range<K> key2 = this.entries.get(i - 1).getKey();
                    if (key.isConnected(key2) && !key.intersection(key2).isEmpty()) {
                        throw new java.lang.IllegalArgumentException("Overlapping ranges: range " + key2 + " overlaps with entry " + key);
                    }
                }
                builder.add(key);
                builder2.add(this.entries.get(i).getValue());
            }
            return new com.google.common.collect.ImmutableRangeMap<>(builder.build(), builder2.build());
        }
    }

    ImmutableRangeMap(com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>> ranges, com.google.common.collect.ImmutableList<V> values) {
        this.ranges = ranges;
        this.values = values;
    }

    @Override // com.google.common.collect.RangeMap
    @javax.annotation.CheckForNull
    public V get(K key) {
        int iBinarySearch = com.google.common.collect.SortedLists.binarySearch(this.ranges, (com.google.common.base.Function<? super E, com.google.common.collect.Cut>) com.google.common.collect.Range.lowerBoundFn(), com.google.common.collect.Cut.belowValue(key), com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iBinarySearch != -1 && this.ranges.get(iBinarySearch).contains(key)) {
            return this.values.get(iBinarySearch);
        }
        return null;
    }

    @Override // com.google.common.collect.RangeMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<com.google.common.collect.Range<K>, V> getEntry(K key) {
        int iBinarySearch = com.google.common.collect.SortedLists.binarySearch(this.ranges, (com.google.common.base.Function<? super E, com.google.common.collect.Cut>) com.google.common.collect.Range.lowerBoundFn(), com.google.common.collect.Cut.belowValue(key), com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iBinarySearch == -1) {
            return null;
        }
        com.google.common.collect.Range<K> range = this.ranges.get(iBinarySearch);
        if (range.contains(key)) {
            return com.google.common.collect.Maps.immutableEntry(range, this.values.get(iBinarySearch));
        }
        return null;
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.Range<K> span() {
        if (this.ranges.isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        com.google.common.collect.Range<K> range = this.ranges.get(0);
        com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>> immutableList = this.ranges;
        return com.google.common.collect.Range.create(range.lowerBound, immutableList.get(immutableList.size() - 1).upperBound);
    }

    @Override // com.google.common.collect.RangeMap
    @java.lang.Deprecated
    public final void put(com.google.common.collect.Range<K> range, V value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @java.lang.Deprecated
    public final void putCoalescing(com.google.common.collect.Range<K> range, V value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @java.lang.Deprecated
    public final void putAll(com.google.common.collect.RangeMap<K, ? extends V> rangeMap) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @java.lang.Deprecated
    public final void remove(com.google.common.collect.Range<K> range) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>, V> asMapOfRanges() {
        if (this.ranges.isEmpty()) {
            return com.google.common.collect.ImmutableMap.of();
        }
        return new com.google.common.collect.ImmutableSortedMap(new com.google.common.collect.RegularImmutableSortedSet(this.ranges, com.google.common.collect.Range.rangeLexOrdering()), this.values);
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>, V> asDescendingMapOfRanges() {
        if (this.ranges.isEmpty()) {
            return com.google.common.collect.ImmutableMap.of();
        }
        return new com.google.common.collect.ImmutableSortedMap(new com.google.common.collect.RegularImmutableSortedSet(this.ranges.reverse(), com.google.common.collect.Range.rangeLexOrdering().reverse()), this.values.reverse());
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.ImmutableRangeMap<K, V> subRangeMap(final com.google.common.collect.Range<K> range) {
        if (((com.google.common.collect.Range) com.google.common.base.Preconditions.checkNotNull(range)).isEmpty()) {
            return of();
        }
        if (this.ranges.isEmpty() || range.encloses(span())) {
            return this;
        }
        final int iBinarySearch = com.google.common.collect.SortedLists.binarySearch(this.ranges, (com.google.common.base.Function<? super E, java.lang.Comparable>) com.google.common.collect.Range.upperBoundFn(), range.lowerBound, com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_AFTER, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        int iBinarySearch2 = com.google.common.collect.SortedLists.binarySearch(this.ranges, (com.google.common.base.Function<? super E, java.lang.Comparable>) com.google.common.collect.Range.lowerBoundFn(), range.upperBound, com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        if (iBinarySearch >= iBinarySearch2) {
            return of();
        }
        final int i = iBinarySearch2 - iBinarySearch;
        return (com.google.common.collect.ImmutableRangeMap<K, V>) new com.google.common.collect.ImmutableRangeMap<K, V>(this, new com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>>() { // from class: com.google.common.collect.ImmutableRangeMap.1
            @Override // com.google.common.collect.ImmutableCollection
            boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            public com.google.common.collect.Range<K> get(int index) {
                com.google.common.base.Preconditions.checkElementIndex(index, i);
                return (index == 0 || index == i + (-1)) ? ((com.google.common.collect.Range) com.google.common.collect.ImmutableRangeMap.this.ranges.get(index + iBinarySearch)).intersection(range) : (com.google.common.collect.Range) com.google.common.collect.ImmutableRangeMap.this.ranges.get(index + iBinarySearch);
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            java.lang.Object writeReplace() {
                return super.writeReplace();
            }
        }, this.values.subList(iBinarySearch, iBinarySearch2)) { // from class: com.google.common.collect.ImmutableRangeMap.2
            @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
            public /* bridge */ /* synthetic */ java.util.Map asDescendingMapOfRanges() {
                return super.asDescendingMapOfRanges();
            }

            @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
            public /* bridge */ /* synthetic */ java.util.Map asMapOfRanges() {
                return super.asMapOfRanges();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
            public com.google.common.collect.ImmutableRangeMap<K, V> subRangeMap(com.google.common.collect.Range<K> subRange) {
                if (range.isConnected(subRange)) {
                    return this.subRangeMap((com.google.common.collect.Range) subRange.intersection(range));
                }
                return com.google.common.collect.ImmutableRangeMap.of();
            }

            @Override // com.google.common.collect.ImmutableRangeMap
            java.lang.Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
        if (o instanceof com.google.common.collect.RangeMap) {
            return asMapOfRanges().equals(((com.google.common.collect.RangeMap) o).asMapOfRanges());
        }
        return false;
    }

    @Override // com.google.common.collect.RangeMap
    public java.lang.String toString() {
        return asMapOfRanges().toString();
    }

    private static class SerializedForm<K extends java.lang.Comparable<?>, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>, V> mapOfRanges;

        SerializedForm(com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>, V> mapOfRanges) {
            this.mapOfRanges = mapOfRanges;
        }

        java.lang.Object readResolve() {
            if (this.mapOfRanges.isEmpty()) {
                return com.google.common.collect.ImmutableRangeMap.of();
            }
            return createRangeMap();
        }

        java.lang.Object createRangeMap() {
            com.google.common.collect.ImmutableRangeMap.Builder builder = new com.google.common.collect.ImmutableRangeMap.Builder();
            com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> it = this.mapOfRanges.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry<com.google.common.collect.Range<K>, V> next = it.next();
                builder.put(next.getKey(), next.getValue());
            }
            return builder.build();
        }
    }

    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableRangeMap.SerializedForm(asMapOfRanges());
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }
}
