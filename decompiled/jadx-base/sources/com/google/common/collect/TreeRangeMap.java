package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class TreeRangeMap<K extends java.lang.Comparable, V> implements com.google.common.collect.RangeMap<K, V> {
    private static final com.google.common.collect.RangeMap<java.lang.Comparable<?>, java.lang.Object> EMPTY_SUB_RANGE_MAP = new com.google.common.collect.RangeMap<java.lang.Comparable<?>, java.lang.Object>() { // from class: com.google.common.collect.TreeRangeMap.1
        @Override // com.google.common.collect.RangeMap
        public void clear() {
        }

        @Override // com.google.common.collect.RangeMap
        @javax.annotation.CheckForNull
        public java.lang.Object get(java.lang.Comparable<?> key) {
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<com.google.common.collect.Range<java.lang.Comparable<?>>, java.lang.Object> getEntry(java.lang.Comparable<?> key) {
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public com.google.common.collect.Range<java.lang.Comparable<?>> span() {
            throw new java.util.NoSuchElementException();
        }

        @Override // com.google.common.collect.RangeMap
        public void put(com.google.common.collect.Range<java.lang.Comparable<?>> range, java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(range);
            throw new java.lang.IllegalArgumentException("Cannot insert range " + range + " into an empty subRangeMap");
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(com.google.common.collect.Range<java.lang.Comparable<?>> range, java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(range);
            throw new java.lang.IllegalArgumentException("Cannot insert range " + range + " into an empty subRangeMap");
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(com.google.common.collect.RangeMap<java.lang.Comparable<?>, ? extends java.lang.Object> rangeMap) {
            if (!rangeMap.asMapOfRanges().isEmpty()) {
                throw new java.lang.IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
            }
        }

        @Override // com.google.common.collect.RangeMap
        public void remove(com.google.common.collect.Range<java.lang.Comparable<?>> range) {
            com.google.common.base.Preconditions.checkNotNull(range);
        }

        @Override // com.google.common.collect.RangeMap
        public java.util.Map<com.google.common.collect.Range<java.lang.Comparable<?>>, java.lang.Object> asMapOfRanges() {
            return java.util.Collections.emptyMap();
        }

        @Override // com.google.common.collect.RangeMap
        public java.util.Map<com.google.common.collect.Range<java.lang.Comparable<?>>, java.lang.Object> asDescendingMapOfRanges() {
            return java.util.Collections.emptyMap();
        }

        @Override // com.google.common.collect.RangeMap
        public com.google.common.collect.RangeMap<java.lang.Comparable<?>, java.lang.Object> subRangeMap(com.google.common.collect.Range<java.lang.Comparable<?>> range) {
            com.google.common.base.Preconditions.checkNotNull(range);
            return this;
        }
    };
    private final java.util.NavigableMap<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> entriesByLowerBound = com.google.common.collect.Maps.newTreeMap();

    public static <K extends java.lang.Comparable, V> com.google.common.collect.TreeRangeMap<K, V> create() {
        return new com.google.common.collect.TreeRangeMap<>();
    }

    private TreeRangeMap() {
    }

    private static final class RangeMapEntry<K extends java.lang.Comparable, V> extends com.google.common.collect.AbstractMapEntry<com.google.common.collect.Range<K>, V> {
        private final com.google.common.collect.Range<K> range;
        private final V value;

        RangeMapEntry(com.google.common.collect.Cut<K> lowerBound, com.google.common.collect.Cut<K> upperBound, V value) {
            this(com.google.common.collect.Range.create(lowerBound, upperBound), value);
        }

        RangeMapEntry(com.google.common.collect.Range<K> range, V value) {
            this.range = range;
            this.value = value;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public com.google.common.collect.Range<K> getKey() {
            return this.range;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        public boolean contains(K value) {
            return this.range.contains(value);
        }

        com.google.common.collect.Cut<K> getLowerBound() {
            return (com.google.common.collect.Cut<K>) this.range.lowerBound;
        }

        com.google.common.collect.Cut<K> getUpperBound() {
            return (com.google.common.collect.Cut<K>) this.range.upperBound;
        }
    }

    @Override // com.google.common.collect.RangeMap
    @javax.annotation.CheckForNull
    public V get(K key) {
        java.util.Map.Entry<com.google.common.collect.Range<K>, V> entry = getEntry(key);
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    @Override // com.google.common.collect.RangeMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<com.google.common.collect.Range<K>, V> getEntry(K key) {
        java.util.Map.Entry<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> entryFloorEntry = this.entriesByLowerBound.floorEntry(com.google.common.collect.Cut.belowValue(key));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().contains(key)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    @Override // com.google.common.collect.RangeMap
    public void put(com.google.common.collect.Range<K> range, V value) {
        if (range.isEmpty()) {
            return;
        }
        com.google.common.base.Preconditions.checkNotNull(value);
        remove(range);
        this.entriesByLowerBound.put(range.lowerBound, new com.google.common.collect.TreeRangeMap.RangeMapEntry(range, value));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.RangeMap
    public void putCoalescing(com.google.common.collect.Range<K> range, V value) {
        if (this.entriesByLowerBound.isEmpty()) {
            put(range, value);
        } else {
            put(coalescedRange(range, com.google.common.base.Preconditions.checkNotNull(value)), value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public com.google.common.collect.Range<K> coalescedRange(com.google.common.collect.Range<K> range, V v) {
        return coalesce(coalesce(range, v, this.entriesByLowerBound.lowerEntry((com.google.common.collect.Cut<K>) range.lowerBound)), v, this.entriesByLowerBound.floorEntry((com.google.common.collect.Cut<K>) range.upperBound));
    }

    private static <K extends java.lang.Comparable, V> com.google.common.collect.Range<K> coalesce(com.google.common.collect.Range<K> range, V v, @javax.annotation.CheckForNull java.util.Map.Entry<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> entry) {
        return (entry != null && entry.getValue().getKey().isConnected(range) && entry.getValue().getValue().equals(v)) ? (com.google.common.collect.Range<K>) range.span(entry.getValue().getKey()) : range;
    }

    @Override // com.google.common.collect.RangeMap
    public void putAll(com.google.common.collect.RangeMap<K, ? extends V> rangeMap) {
        for (java.util.Map.Entry<com.google.common.collect.Range<K>, ? extends V> entry : rangeMap.asMapOfRanges().entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.RangeMap
    public void clear() {
        this.entriesByLowerBound.clear();
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.Range<K> span() {
        java.util.Map.Entry<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> entryFirstEntry = this.entriesByLowerBound.firstEntry();
        java.util.Map.Entry<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> entryLastEntry = this.entriesByLowerBound.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new java.util.NoSuchElementException();
        }
        return com.google.common.collect.Range.create(entryFirstEntry.getValue().getKey().lowerBound, entryLastEntry.getValue().getKey().upperBound);
    }

    private void putRangeMapEntry(com.google.common.collect.Cut<K> lowerBound, com.google.common.collect.Cut<K> upperBound, V value) {
        this.entriesByLowerBound.put(lowerBound, new com.google.common.collect.TreeRangeMap.RangeMapEntry(lowerBound, upperBound, value));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.common.collect.RangeMap
    public void remove(com.google.common.collect.Range<K> range) {
        if (range.isEmpty()) {
            return;
        }
        java.util.Map.Entry<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> entryLowerEntry = this.entriesByLowerBound.lowerEntry((com.google.common.collect.Cut<K>) range.lowerBound);
        if (entryLowerEntry != null) {
            com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V> value = entryLowerEntry.getValue();
            if (value.getUpperBound().compareTo((com.google.common.collect.Cut) range.lowerBound) > 0) {
                if (value.getUpperBound().compareTo((com.google.common.collect.Cut) range.upperBound) > 0) {
                    putRangeMapEntry(range.upperBound, value.getUpperBound(), entryLowerEntry.getValue().getValue());
                }
                putRangeMapEntry(value.getLowerBound(), range.lowerBound, entryLowerEntry.getValue().getValue());
            }
        }
        java.util.Map.Entry<com.google.common.collect.Cut<K>, com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> entryLowerEntry2 = this.entriesByLowerBound.lowerEntry((com.google.common.collect.Cut<K>) range.upperBound);
        if (entryLowerEntry2 != null) {
            com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V> value2 = entryLowerEntry2.getValue();
            if (value2.getUpperBound().compareTo((com.google.common.collect.Cut) range.upperBound) > 0) {
                putRangeMapEntry(range.upperBound, value2.getUpperBound(), entryLowerEntry2.getValue().getValue());
            }
        }
        this.entriesByLowerBound.subMap((com.google.common.collect.Cut<K>) range.lowerBound, (com.google.common.collect.Cut<K>) range.upperBound).clear();
    }

    @Override // com.google.common.collect.RangeMap
    public java.util.Map<com.google.common.collect.Range<K>, V> asMapOfRanges() {
        return new com.google.common.collect.TreeRangeMap.AsMapOfRanges(this.entriesByLowerBound.values());
    }

    @Override // com.google.common.collect.RangeMap
    public java.util.Map<com.google.common.collect.Range<K>, V> asDescendingMapOfRanges() {
        return new com.google.common.collect.TreeRangeMap.AsMapOfRanges(this.entriesByLowerBound.descendingMap().values());
    }

    private final class AsMapOfRanges extends com.google.common.collect.Maps.IteratorBasedAbstractMap<com.google.common.collect.Range<K>, V> {
        final java.lang.Iterable<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entryIterable;

        AsMapOfRanges(java.lang.Iterable<com.google.common.collect.TreeRangeMap.RangeMapEntry<K, V>> entryIterable) {
            this.entryIterable = entryIterable;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return get(key) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (!(obj instanceof com.google.common.collect.Range)) {
                return null;
            }
            com.google.common.collect.Range range = (com.google.common.collect.Range) obj;
            com.google.common.collect.TreeRangeMap.RangeMapEntry rangeMapEntry = (com.google.common.collect.TreeRangeMap.RangeMapEntry) com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.get(range.lowerBound);
            if (rangeMapEntry == null || !rangeMapEntry.getKey().equals(range)) {
                return null;
            }
            return (V) rangeMapEntry.getValue();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.size();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entryIterator() {
            return this.entryIterable.iterator();
        }
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.RangeMap<K, V> subRangeMap(com.google.common.collect.Range<K> subRange) {
        return subRange.equals(com.google.common.collect.Range.all()) ? this : new com.google.common.collect.TreeRangeMap.SubRangeMap(subRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.RangeMap<K, V> emptySubRangeMap() {
        return EMPTY_SUB_RANGE_MAP;
    }

    private class SubRangeMap implements com.google.common.collect.RangeMap<K, V> {
        private final com.google.common.collect.Range<K> subRange;

        SubRangeMap(com.google.common.collect.Range<K> subRange) {
            this.subRange = subRange;
        }

        @Override // com.google.common.collect.RangeMap
        @javax.annotation.CheckForNull
        public V get(K k) {
            if (this.subRange.contains(k)) {
                return (V) com.google.common.collect.TreeRangeMap.this.get(k);
            }
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<com.google.common.collect.Range<K>, V> getEntry(K k) {
            java.util.Map.Entry<com.google.common.collect.Range<K>, V> entry;
            if (!this.subRange.contains(k) || (entry = com.google.common.collect.TreeRangeMap.this.getEntry(k)) == null) {
                return null;
            }
            return com.google.common.collect.Maps.immutableEntry(entry.getKey().intersection(this.subRange), entry.getValue());
        }

        @Override // com.google.common.collect.RangeMap
        public com.google.common.collect.Range<K> span() {
            com.google.common.collect.Cut cut;
            com.google.common.collect.Cut upperBound;
            java.util.Map.Entry entryFloorEntry = com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.floorEntry(this.subRange.lowerBound);
            if (entryFloorEntry == null || ((com.google.common.collect.TreeRangeMap.RangeMapEntry) entryFloorEntry.getValue()).getUpperBound().compareTo((com.google.common.collect.Cut) this.subRange.lowerBound) <= 0) {
                cut = (com.google.common.collect.Cut) com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.ceilingKey(this.subRange.lowerBound);
                if (cut == null || cut.compareTo((com.google.common.collect.Cut) this.subRange.upperBound) >= 0) {
                    throw new java.util.NoSuchElementException();
                }
            } else {
                cut = this.subRange.lowerBound;
            }
            java.util.Map.Entry entryLowerEntry = com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.lowerEntry(this.subRange.upperBound);
            if (entryLowerEntry == null) {
                throw new java.util.NoSuchElementException();
            }
            if (((com.google.common.collect.TreeRangeMap.RangeMapEntry) entryLowerEntry.getValue()).getUpperBound().compareTo((com.google.common.collect.Cut) this.subRange.upperBound) >= 0) {
                upperBound = this.subRange.upperBound;
            } else {
                upperBound = ((com.google.common.collect.TreeRangeMap.RangeMapEntry) entryLowerEntry.getValue()).getUpperBound();
            }
            return com.google.common.collect.Range.create(cut, upperBound);
        }

        @Override // com.google.common.collect.RangeMap
        public void put(com.google.common.collect.Range<K> range, V value) {
            com.google.common.base.Preconditions.checkArgument(this.subRange.encloses(range), "Cannot put range %s into a subRangeMap(%s)", range, this.subRange);
            com.google.common.collect.TreeRangeMap.this.put(range, value);
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(com.google.common.collect.Range<K> range, V value) {
            if (com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.isEmpty() || !this.subRange.encloses(range)) {
                put(range, value);
            } else {
                put(com.google.common.collect.TreeRangeMap.this.coalescedRange(range, com.google.common.base.Preconditions.checkNotNull(value)).intersection(this.subRange), value);
            }
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(com.google.common.collect.RangeMap<K, ? extends V> rangeMap) {
            if (rangeMap.asMapOfRanges().isEmpty()) {
                return;
            }
            com.google.common.collect.Range<K> rangeSpan = rangeMap.span();
            com.google.common.base.Preconditions.checkArgument(this.subRange.encloses(rangeSpan), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", rangeSpan, this.subRange);
            com.google.common.collect.TreeRangeMap.this.putAll(rangeMap);
        }

        @Override // com.google.common.collect.RangeMap
        public void clear() {
            com.google.common.collect.TreeRangeMap.this.remove(this.subRange);
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
        @Override // com.google.common.collect.RangeMap
        public void remove(com.google.common.collect.Range<K> range) {
            if (range.isConnected(this.subRange)) {
                com.google.common.collect.TreeRangeMap.this.remove(range.intersection(this.subRange));
            }
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
        @Override // com.google.common.collect.RangeMap
        public com.google.common.collect.RangeMap<K, V> subRangeMap(com.google.common.collect.Range<K> range) {
            if (!range.isConnected(this.subRange)) {
                return com.google.common.collect.TreeRangeMap.this.emptySubRangeMap();
            }
            return com.google.common.collect.TreeRangeMap.this.subRangeMap(range.intersection(this.subRange));
        }

        @Override // com.google.common.collect.RangeMap
        public java.util.Map<com.google.common.collect.Range<K>, V> asMapOfRanges() {
            return new com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap();
        }

        @Override // com.google.common.collect.RangeMap
        public java.util.Map<com.google.common.collect.Range<K>, V> asDescendingMapOfRanges() {
            return new com.google.common.collect.TreeRangeMap<K, V>.SubRangeMap.SubRangeMapAsMap() { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.1
                @Override // com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap
                java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entryIterator() {
                    if (com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.isEmpty()) {
                        return com.google.common.collect.Iterators.emptyIterator();
                    }
                    final java.util.Iterator<V> it = com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.headMap(com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.upperBound, false).descendingMap().values().iterator();
                    return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<com.google.common.collect.Range<K>, V>>() { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.1.1
                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // com.google.common.collect.AbstractIterator
                        @javax.annotation.CheckForNull
                        public java.util.Map.Entry<com.google.common.collect.Range<K>, V> computeNext() {
                            if (it.hasNext()) {
                                com.google.common.collect.TreeRangeMap.RangeMapEntry rangeMapEntry = (com.google.common.collect.TreeRangeMap.RangeMapEntry) it.next();
                                if (rangeMapEntry.getUpperBound().compareTo((com.google.common.collect.Cut) com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.lowerBound) > 0) {
                                    return com.google.common.collect.Maps.immutableEntry(rangeMapEntry.getKey().intersection(com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange), rangeMapEntry.getValue());
                                }
                                return (java.util.Map.Entry) endOfData();
                            }
                            return (java.util.Map.Entry) endOfData();
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.RangeMap
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
            if (o instanceof com.google.common.collect.RangeMap) {
                return asMapOfRanges().equals(((com.google.common.collect.RangeMap) o).asMapOfRanges());
            }
            return false;
        }

        @Override // com.google.common.collect.RangeMap
        public int hashCode() {
            return asMapOfRanges().hashCode();
        }

        @Override // com.google.common.collect.RangeMap
        public java.lang.String toString() {
            return asMapOfRanges().toString();
        }

        class SubRangeMapAsMap extends java.util.AbstractMap<com.google.common.collect.Range<K>, V> {
            SubRangeMapAsMap() {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
                return get(key) != null;
            }

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
            @Override // java.util.AbstractMap, java.util.Map
            @javax.annotation.CheckForNull
            public V get(@javax.annotation.CheckForNull java.lang.Object obj) {
                com.google.common.collect.TreeRangeMap.RangeMapEntry rangeMapEntry;
                try {
                    if (obj instanceof com.google.common.collect.Range) {
                        com.google.common.collect.Range range = (com.google.common.collect.Range) obj;
                        if (com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.encloses(range) && !range.isEmpty()) {
                            if (range.lowerBound.compareTo((com.google.common.collect.Cut) com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.lowerBound) == 0) {
                                java.util.Map.Entry entryFloorEntry = com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.floorEntry(range.lowerBound);
                                rangeMapEntry = entryFloorEntry != null ? (com.google.common.collect.TreeRangeMap.RangeMapEntry) entryFloorEntry.getValue() : null;
                            } else {
                                rangeMapEntry = (com.google.common.collect.TreeRangeMap.RangeMapEntry) com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.get(range.lowerBound);
                            }
                            if (rangeMapEntry != null && rangeMapEntry.getKey().isConnected(com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange) && rangeMapEntry.getKey().intersection(com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange).equals(range)) {
                                return (V) rangeMapEntry.getValue();
                            }
                        }
                    }
                } catch (java.lang.ClassCastException unused) {
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            @javax.annotation.CheckForNull
            public V remove(@javax.annotation.CheckForNull java.lang.Object obj) {
                V v = (V) get(obj);
                if (v == null) {
                    return null;
                }
                com.google.common.collect.TreeRangeMap.this.remove((com.google.common.collect.Range) java.util.Objects.requireNonNull(obj));
                return v;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
                com.google.common.collect.TreeRangeMap.SubRangeMap.this.clear();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean removeEntryIf(com.google.common.base.Predicate<? super java.util.Map.Entry<com.google.common.collect.Range<K>, V>> predicate) {
                java.util.ArrayList arrayListNewArrayList = com.google.common.collect.Lists.newArrayList();
                for (java.util.Map.Entry<com.google.common.collect.Range<K>, V> entry : entrySet()) {
                    if (predicate.apply(entry)) {
                        arrayListNewArrayList.add(entry.getKey());
                    }
                }
                java.util.Iterator it = arrayListNewArrayList.iterator();
                while (it.hasNext()) {
                    com.google.common.collect.TreeRangeMap.this.remove((com.google.common.collect.Range) it.next());
                }
                return !arrayListNewArrayList.isEmpty();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public java.util.Set<com.google.common.collect.Range<K>> keySet() {
                return new com.google.common.collect.Maps.KeySet<com.google.common.collect.Range<K>, V>(this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.1
                    @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
                        return com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.this.remove(o) != null;
                    }

                    @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean retainAll(java.util.Collection<?> c) {
                        return com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.this.removeEntryIf(com.google.common.base.Predicates.compose(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(c)), com.google.common.collect.Maps.keyFunction()));
                    }
                };
            }

            @Override // java.util.AbstractMap, java.util.Map
            public java.util.Set<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entrySet() {
                return new com.google.common.collect.Maps.EntrySet<com.google.common.collect.Range<K>, V>() { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.2
                    @Override // com.google.common.collect.Maps.EntrySet
                    java.util.Map<com.google.common.collect.Range<K>, V> map() {
                        return com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.this;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                    public java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> iterator() {
                        return com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.this.entryIterator();
                    }

                    @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean retainAll(java.util.Collection<?> c) {
                        return com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.this.removeEntryIf(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(c)));
                    }

                    @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public int size() {
                        return com.google.common.collect.Iterators.size(iterator());
                    }

                    @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean isEmpty() {
                        return !iterator().hasNext();
                    }
                };
            }

            java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entryIterator() {
                if (com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.isEmpty()) {
                    return com.google.common.collect.Iterators.emptyIterator();
                }
                final java.util.Iterator<V> it = com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.tailMap((com.google.common.collect.Cut) com.google.common.base.MoreObjects.firstNonNull((com.google.common.collect.Cut) com.google.common.collect.TreeRangeMap.this.entriesByLowerBound.floorKey(com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.lowerBound), com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.lowerBound), true).values().iterator();
                return new com.google.common.collect.AbstractIterator<java.util.Map.Entry<com.google.common.collect.Range<K>, V>>() { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.3
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    @javax.annotation.CheckForNull
                    public java.util.Map.Entry<com.google.common.collect.Range<K>, V> computeNext() {
                        while (it.hasNext()) {
                            com.google.common.collect.TreeRangeMap.RangeMapEntry rangeMapEntry = (com.google.common.collect.TreeRangeMap.RangeMapEntry) it.next();
                            if (rangeMapEntry.getLowerBound().compareTo((com.google.common.collect.Cut) com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.upperBound) < 0) {
                                if (rangeMapEntry.getUpperBound().compareTo((com.google.common.collect.Cut) com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange.lowerBound) > 0) {
                                    return com.google.common.collect.Maps.immutableEntry(rangeMapEntry.getKey().intersection(com.google.common.collect.TreeRangeMap.SubRangeMap.this.subRange), rangeMapEntry.getValue());
                                }
                            } else {
                                return (java.util.Map.Entry) endOfData();
                            }
                        }
                        return (java.util.Map.Entry) endOfData();
                    }
                };
            }

            @Override // java.util.AbstractMap, java.util.Map
            public java.util.Collection<V> values() {
                return new com.google.common.collect.Maps.Values<com.google.common.collect.Range<K>, V>(this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.4
                    @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                    public boolean removeAll(java.util.Collection<?> c) {
                        return com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.this.removeEntryIf(com.google.common.base.Predicates.compose(com.google.common.base.Predicates.in(c), com.google.common.collect.Maps.valueFunction()));
                    }

                    @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                    public boolean retainAll(java.util.Collection<?> c) {
                        return com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.this.removeEntryIf(com.google.common.base.Predicates.compose(com.google.common.base.Predicates.not(com.google.common.base.Predicates.in(c)), com.google.common.collect.Maps.valueFunction()));
                    }
                };
            }
        }
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
        if (o instanceof com.google.common.collect.RangeMap) {
            return asMapOfRanges().equals(((com.google.common.collect.RangeMap) o).asMapOfRanges());
        }
        return false;
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Override // com.google.common.collect.RangeMap
    public java.lang.String toString() {
        return this.entriesByLowerBound.values().toString();
    }
}
