package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
class MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>> extends java.util.AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V>, java.io.Serializable {
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_SEGMENTS = 65536;
    static final com.google.common.collect.MapMakerInternalMap.WeakValueReference<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap.DummyInternalEntry> UNSET_WEAK_VALUE_REFERENCE = new com.google.common.collect.MapMakerInternalMap.WeakValueReference<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap.DummyInternalEntry>() { // from class: com.google.common.collect.MapMakerInternalMap.1
        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public void clear() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap.DummyInternalEntry> copyFor(java.lang.ref.ReferenceQueue<java.lang.Object> queue, com.google.common.collect.MapMakerInternalMap.DummyInternalEntry entry) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        @javax.annotation.CheckForNull
        public java.lang.Object get() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        @javax.annotation.CheckForNull
        public com.google.common.collect.MapMakerInternalMap.DummyInternalEntry getEntry() {
            return null;
        }
    };
    private static final long serialVersionUID = 5;
    final int concurrencyLevel;
    final transient com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, E, S> entryHelper;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;
    final com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    transient java.util.Set<K> keySet;
    final transient int segmentMask;
    final transient int segmentShift;
    final transient com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>[] segments;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    transient java.util.Collection<V> values;

    interface InternalEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    interface InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>> {
        E copy(S segment, E entry, @javax.annotation.CheckForNull E newNext);

        com.google.common.collect.MapMakerInternalMap.Strength keyStrength();

        E newEntry(S segment, K key, int hash, @javax.annotation.CheckForNull E next);

        S newSegment(com.google.common.collect.MapMakerInternalMap<K, V, E, S> map, int initialCapacity);

        void setValue(S segment, E entry, V value);

        com.google.common.collect.MapMakerInternalMap.Strength valueStrength();
    }

    enum Strength {
        STRONG { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence() {
                return com.google.common.base.Equivalence.equals();
            }
        },
        WEAK { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence() {
                return com.google.common.base.Equivalence.identity();
            }
        };

        abstract com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence();
    }

    interface StrongValueEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E> {
    }

    interface WeakValueEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E> {
        com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> getValueReference();
    }

    interface WeakValueReference<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> {
        void clear();

        com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> copyFor(java.lang.ref.ReferenceQueue<V> queue, E entry);

        @javax.annotation.CheckForNull
        V get();

        E getEntry();
    }

    static int rehash(int h) {
        int i = h + ((h << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    private MapMakerInternalMap(com.google.common.collect.MapMaker builder, com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, E, S> entryHelper) {
        this.concurrencyLevel = java.lang.Math.min(builder.getConcurrencyLevel(), 65536);
        this.keyEquivalence = builder.getKeyEquivalence();
        this.entryHelper = entryHelper;
        int iMin = java.lang.Math.min(builder.getInitialCapacity(), 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.concurrencyLevel) {
            i3++;
            i4 <<= 1;
        }
        this.segmentShift = 32 - i3;
        this.segmentMask = i4 - 1;
        this.segments = newSegmentArray(i4);
        int i5 = iMin / i4;
        while (i2 < (i4 * i5 < iMin ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        while (true) {
            com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>[] segmentArr = this.segments;
            if (i >= segmentArr.length) {
                return;
            }
            segmentArr[i] = createSegment(i2);
            i++;
        }
    }

    static <K, V> com.google.common.collect.MapMakerInternalMap<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>, ?> create(com.google.common.collect.MapMaker builder) {
        if (builder.getKeyStrength() == com.google.common.collect.MapMakerInternalMap.Strength.STRONG && builder.getValueStrength() == com.google.common.collect.MapMakerInternalMap.Strength.STRONG) {
            return new com.google.common.collect.MapMakerInternalMap<>(builder, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper.instance());
        }
        if (builder.getKeyStrength() == com.google.common.collect.MapMakerInternalMap.Strength.STRONG && builder.getValueStrength() == com.google.common.collect.MapMakerInternalMap.Strength.WEAK) {
            return new com.google.common.collect.MapMakerInternalMap<>(builder, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper.instance());
        }
        if (builder.getKeyStrength() == com.google.common.collect.MapMakerInternalMap.Strength.WEAK && builder.getValueStrength() == com.google.common.collect.MapMakerInternalMap.Strength.STRONG) {
            return new com.google.common.collect.MapMakerInternalMap<>(builder, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper.instance());
        }
        if (builder.getKeyStrength() == com.google.common.collect.MapMakerInternalMap.Strength.WEAK && builder.getValueStrength() == com.google.common.collect.MapMakerInternalMap.Strength.WEAK) {
            return new com.google.common.collect.MapMakerInternalMap<>(builder, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper.instance());
        }
        throw new java.lang.AssertionError();
    }

    static <K> com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, com.google.common.collect.MapMaker.Dummy, ?>, ?> createWithDummyValues(com.google.common.collect.MapMaker builder) {
        if (builder.getKeyStrength() == com.google.common.collect.MapMakerInternalMap.Strength.STRONG && builder.getValueStrength() == com.google.common.collect.MapMakerInternalMap.Strength.STRONG) {
            return new com.google.common.collect.MapMakerInternalMap<>(builder, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper.instance());
        }
        if (builder.getKeyStrength() == com.google.common.collect.MapMakerInternalMap.Strength.WEAK && builder.getValueStrength() == com.google.common.collect.MapMakerInternalMap.Strength.STRONG) {
            return new com.google.common.collect.MapMakerInternalMap<>(builder, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper.instance());
        }
        if (builder.getValueStrength() == com.google.common.collect.MapMakerInternalMap.Strength.WEAK) {
            throw new java.lang.IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new java.lang.AssertionError();
    }

    static abstract class AbstractStrongKeyEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> implements com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E> {
        final int hash;
        final K key;

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @javax.annotation.CheckForNull
        public E getNext() {
            return null;
        }

        AbstractStrongKeyEntry(K key, int hash) {
            this.key = key;
            this.hash = hash;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int getHash() {
            return this.hash;
        }
    }

    static <K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> unsetWeakValueReference() {
        return (com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E>) UNSET_WEAK_VALUE_REFERENCE;
    }

    static class StrongKeyStrongValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>> implements com.google.common.collect.MapMakerInternalMap.StrongValueEntry<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>> {

        @javax.annotation.CheckForNull
        private volatile V value;

        private StrongKeyStrongValueEntry(K key, int hash) {
            super(key, hash);
            this.value = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @javax.annotation.CheckForNull
        public final V getValue() {
            return this.value;
        }

        private static final class LinkedStrongKeyStrongValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> {
            private final com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> next;

            LinkedStrongKeyStrongValueEntry(K key, int hash, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> next) {
                super(key, hash);
                this.next = next;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> getNext() {
                return this.next;
            }
        }

        static final class Helper<K, V> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> {
            private static final com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper<?, ?> INSTANCE = new com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper<>();

            Helper() {
            }

            static <K, V> com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper<K, V> instance() {
                return (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> newSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> map, int initialCapacity) {
                return new com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> segment, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> entry, @javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> newNext) {
                com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntryNewEntry = newEntry((com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment) segment, (java.lang.Object) entry.key, entry.hash, (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) newNext);
                ((com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) strongKeyStrongValueEntryNewEntry).value = ((com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) entry).value;
                return strongKeyStrongValueEntryNewEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public void setValue(com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> segment, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> entry, V value) {
                ((com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) entry).value = value;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> newEntry(com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> next) {
                if (next == null) {
                    return new com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<>(key, hash);
                }
                return new com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.LinkedStrongKeyStrongValueEntry(key, hash, next);
            }
        }
    }

    static class StrongKeyWeakValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> implements com.google.common.collect.MapMakerInternalMap.WeakValueEntry<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> {
        private volatile com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> valueReference;

        private StrongKeyWeakValueEntry(K key, int hash) {
            super(key, hash);
            this.valueReference = com.google.common.collect.MapMakerInternalMap.unsetWeakValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @javax.annotation.CheckForNull
        public final V getValue() {
            return this.valueReference.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public final com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> getValueReference() {
            return this.valueReference;
        }

        private static final class LinkedStrongKeyWeakValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> {
            private final com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> next;

            LinkedStrongKeyWeakValueEntry(K key, int hash, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> next) {
                super(key, hash);
                this.next = next;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> getNext() {
                return this.next;
            }
        }

        static final class Helper<K, V> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> {
            private static final com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper<?, ?> INSTANCE = new com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper<>();

            Helper() {
            }

            static <K, V> com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper<K, V> instance() {
                return (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> newSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> map, int initialCapacity) {
                return new com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            @javax.annotation.CheckForNull
            public com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> segment, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> entry, @javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> newNext) {
                if (com.google.common.collect.MapMakerInternalMap.Segment.isCollected(entry)) {
                    return null;
                }
                com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntryNewEntry = newEntry((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment) segment, (java.lang.Object) entry.key, entry.hash, (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) newNext);
                ((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) strongKeyWeakValueEntryNewEntry).valueReference = ((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) entry).valueReference.copyFor(((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment) segment).queueForValues, strongKeyWeakValueEntryNewEntry);
                return strongKeyWeakValueEntryNewEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public void setValue(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> segment, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> entry, V value) {
                com.google.common.collect.MapMakerInternalMap.WeakValueReference weakValueReference = ((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) entry).valueReference;
                ((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) entry).valueReference = new com.google.common.collect.MapMakerInternalMap.WeakValueReferenceImpl(((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment) segment).queueForValues, value, entry);
                weakValueReference.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> newEntry(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> next) {
                if (next == null) {
                    return new com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<>(key, hash);
                }
                return new com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.LinkedStrongKeyWeakValueEntry(key, hash, next);
            }
        }
    }

    static class StrongKeyDummyValueEntry<K> extends com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>> implements com.google.common.collect.MapMakerInternalMap.StrongValueEntry<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>> {
        private StrongKeyDummyValueEntry(K key, int hash) {
            super(key, hash);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final com.google.common.collect.MapMaker.Dummy getValue() {
            return com.google.common.collect.MapMaker.Dummy.VALUE;
        }

        private static final class LinkedStrongKeyDummyValueEntry<K> extends com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> {
            private final com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> next;

            @Override // com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public /* bridge */ /* synthetic */ java.lang.Object getValue() {
                return super.getValue();
            }

            LinkedStrongKeyDummyValueEntry(K key, int hash, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> next) {
                super(key, hash);
                this.next = next;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> getNext() {
                return this.next;
            }
        }

        static final class Helper<K> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>> {
            private static final com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper<?> INSTANCE = new com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper<>();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public void setValue(com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> segment, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> entry, com.google.common.collect.MapMaker.Dummy value) {
            }

            Helper() {
            }

            static <K> com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper<K> instance() {
                return (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper<K>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> newSegment(com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>> map, int initialCapacity) {
                return new com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> copy(com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> segment, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> entry, @javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> newNext) {
                return newEntry((com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment) segment, (java.lang.Object) entry.key, entry.hash, (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry) newNext);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> newEntry(com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> next) {
                if (next == null) {
                    return new com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<>(key, hash);
                }
                return new com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.LinkedStrongKeyDummyValueEntry(key, hash, next);
            }
        }
    }

    static abstract class AbstractWeakKeyEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> extends java.lang.ref.WeakReference<K> implements com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E> {
        final int hash;

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @javax.annotation.CheckForNull
        public E getNext() {
            return null;
        }

        AbstractWeakKeyEntry(java.lang.ref.ReferenceQueue<K> queue, K key, int hash) {
            super(key, queue);
            this.hash = hash;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final K getKey() {
            return (K) get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int getHash() {
            return this.hash;
        }
    }

    static class WeakKeyDummyValueEntry<K> extends com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>> implements com.google.common.collect.MapMakerInternalMap.StrongValueEntry<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>> {
        private WeakKeyDummyValueEntry(java.lang.ref.ReferenceQueue<K> queue, K key, int hash) {
            super(queue, key, hash);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final com.google.common.collect.MapMaker.Dummy getValue() {
            return com.google.common.collect.MapMaker.Dummy.VALUE;
        }

        private static final class LinkedWeakKeyDummyValueEntry<K> extends com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> {
            private final com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> next;

            @Override // com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public /* bridge */ /* synthetic */ java.lang.Object getValue() {
                return super.getValue();
            }

            private LinkedWeakKeyDummyValueEntry(java.lang.ref.ReferenceQueue<K> queue, K key, int hash, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> next) {
                super(queue, key, hash);
                this.next = next;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> getNext() {
                return this.next;
            }
        }

        static final class Helper<K> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>> {
            private static final com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper<?> INSTANCE = new com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper<>();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public void setValue(com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> segment, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> entry, com.google.common.collect.MapMaker.Dummy value) {
            }

            Helper() {
            }

            static <K> com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper<K> instance() {
                return (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper<K>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> newSegment(com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>> map, int initialCapacity) {
                return new com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            @javax.annotation.CheckForNull
            public com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> copy(com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> segment, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> entry, @javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> newNext) {
                K key = entry.getKey();
                if (key == null) {
                    return null;
                }
                return newEntry((com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment) segment, (java.lang.Object) key, entry.hash, (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry) newNext);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> newEntry(com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> next) {
                if (next == null) {
                    return new com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<>(((com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment) segment).queueForKeys, key, hash);
                }
                return new com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.LinkedWeakKeyDummyValueEntry(((com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment) segment).queueForKeys, key, hash, next);
            }
        }
    }

    static class WeakKeyStrongValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>> implements com.google.common.collect.MapMakerInternalMap.StrongValueEntry<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>> {

        @javax.annotation.CheckForNull
        private volatile V value;

        private WeakKeyStrongValueEntry(java.lang.ref.ReferenceQueue<K> queue, K key, int hash) {
            super(queue, key, hash);
            this.value = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @javax.annotation.CheckForNull
        public final V getValue() {
            return this.value;
        }

        private static final class LinkedWeakKeyStrongValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> {
            private final com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> next;

            private LinkedWeakKeyStrongValueEntry(java.lang.ref.ReferenceQueue<K> queue, K key, int hash, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> next) {
                super(queue, key, hash);
                this.next = next;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> getNext() {
                return this.next;
            }
        }

        static final class Helper<K, V> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> {
            private static final com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper<?, ?> INSTANCE = new com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper<>();

            Helper() {
            }

            static <K, V> com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper<K, V> instance() {
                return (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> newSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> map, int initialCapacity) {
                return new com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            @javax.annotation.CheckForNull
            public com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> segment, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> entry, @javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> newNext) {
                K key = entry.getKey();
                if (key == null) {
                    return null;
                }
                com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntryNewEntry = newEntry((com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment) segment, (java.lang.Object) key, entry.hash, (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) newNext);
                ((com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) weakKeyStrongValueEntryNewEntry).value = ((com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) entry).value;
                return weakKeyStrongValueEntryNewEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public void setValue(com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> segment, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> entry, V value) {
                ((com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) entry).value = value;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> newEntry(com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> next) {
                if (next == null) {
                    return new com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<>(((com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment) segment).queueForKeys, key, hash);
                }
                return new com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.LinkedWeakKeyStrongValueEntry(((com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment) segment).queueForKeys, key, hash, next);
            }
        }
    }

    static class WeakKeyWeakValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> implements com.google.common.collect.MapMakerInternalMap.WeakValueEntry<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> {
        private volatile com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> valueReference;

        WeakKeyWeakValueEntry(java.lang.ref.ReferenceQueue<K> queue, K key, int hash) {
            super(queue, key, hash);
            this.valueReference = com.google.common.collect.MapMakerInternalMap.unsetWeakValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final V getValue() {
            return this.valueReference.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public final com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> getValueReference() {
            return this.valueReference;
        }

        private static final class LinkedWeakKeyWeakValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> {
            private final com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> next;

            LinkedWeakKeyWeakValueEntry(java.lang.ref.ReferenceQueue<K> queue, K key, int hash, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> next) {
                super(queue, key, hash);
                this.next = next;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> getNext() {
                return this.next;
            }
        }

        static final class Helper<K, V> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> {
            private static final com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper<?, ?> INSTANCE = new com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper<>();

            Helper() {
            }

            static <K, V> com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper<K, V> instance() {
                return (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                return com.google.common.collect.MapMakerInternalMap.Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> newSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> map, int initialCapacity) {
                return new com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            @javax.annotation.CheckForNull
            public com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> segment, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> entry, @javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> newNext) {
                K key = entry.getKey();
                if (key == null || com.google.common.collect.MapMakerInternalMap.Segment.isCollected(entry)) {
                    return null;
                }
                com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntryNewEntry = newEntry((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment) segment, (java.lang.Object) key, entry.hash, (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) newNext);
                ((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) weakKeyWeakValueEntryNewEntry).valueReference = ((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) entry).valueReference.copyFor(((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment) segment).queueForValues, weakKeyWeakValueEntryNewEntry);
                return weakKeyWeakValueEntryNewEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public void setValue(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> segment, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> entry, V value) {
                com.google.common.collect.MapMakerInternalMap.WeakValueReference weakValueReference = ((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) entry).valueReference;
                ((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) entry).valueReference = new com.google.common.collect.MapMakerInternalMap.WeakValueReferenceImpl(((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment) segment).queueForValues, value, entry);
                weakValueReference.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> newEntry(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> next) {
                if (next == null) {
                    return new com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<>(((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment) segment).queueForKeys, key, hash);
                }
                return new com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.LinkedWeakKeyWeakValueEntry(((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment) segment).queueForKeys, key, hash, next);
            }
        }
    }

    static final class DummyInternalEntry implements com.google.common.collect.MapMakerInternalMap.InternalEntry<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap.DummyInternalEntry> {
        private DummyInternalEntry() {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public com.google.common.collect.MapMakerInternalMap.DummyInternalEntry getNext() {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public int getHash() {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public java.lang.Object getKey() {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public java.lang.Object getValue() {
            throw new java.lang.AssertionError();
        }
    }

    static final class WeakValueReferenceImpl<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> extends java.lang.ref.WeakReference<V> implements com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> {
        final E entry;

        WeakValueReferenceImpl(java.lang.ref.ReferenceQueue<V> queue, V referent, E entry) {
            super(referent, queue);
            this.entry = entry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public E getEntry() {
            return this.entry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> copyFor(java.lang.ref.ReferenceQueue<V> queue, E entry) {
            return new com.google.common.collect.MapMakerInternalMap.WeakValueReferenceImpl(queue, get(), entry);
        }
    }

    E copyEntry(E e, E e2) {
        return (E) segmentFor(e.getHash()).copyEntry(e, e2);
    }

    int hash(java.lang.Object key) {
        return rehash(this.keyEquivalence.hash(key));
    }

    /* JADX WARN: Multi-variable type inference failed */
    void reclaimValue(com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> weakValueReference) {
        com.google.common.collect.MapMakerInternalMap.InternalEntry entry = weakValueReference.getEntry();
        int hash = entry.getHash();
        segmentFor(hash).reclaimValue(entry.getKey(), hash, weakValueReference);
    }

    void reclaimKey(E entry) {
        int hash = entry.getHash();
        segmentFor(hash).reclaimKey(entry, hash);
    }

    boolean isLiveForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> entry) {
        return segmentFor(entry.getHash()).getLiveValueForTesting(entry) != null;
    }

    com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> segmentFor(int hash) {
        return this.segments[(hash >>> this.segmentShift) & this.segmentMask];
    }

    com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> createSegment(int initialCapacity) {
        return this.entryHelper.newSegment(this, initialCapacity);
    }

    @javax.annotation.CheckForNull
    V getLiveValue(E e) {
        if (e.getKey() == null) {
            return null;
        }
        return (V) e.getValue();
    }

    final com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>[] newSegmentArray(int ssize) {
        return new com.google.common.collect.MapMakerInternalMap.Segment[ssize];
    }

    static abstract class Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>> extends java.util.concurrent.locks.ReentrantLock {
        volatile int count;
        final com.google.common.collect.MapMakerInternalMap<K, V, E, S> map;
        int modCount;
        final java.util.concurrent.atomic.AtomicInteger readCount = new java.util.concurrent.atomic.AtomicInteger();

        @javax.annotation.CheckForNull
        volatile java.util.concurrent.atomic.AtomicReferenceArray<E> table;
        int threshold;

        abstract E castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> entry);

        void maybeClearReferenceQueues() {
        }

        void maybeDrainReferenceQueues() {
        }

        abstract S self();

        Segment(com.google.common.collect.MapMakerInternalMap<K, V, E, S> map, int initialCapacity) {
            this.map = map;
            initTable(newEntryArray(initialCapacity));
        }

        void setValue(E entry, V value) {
            this.map.entryHelper.setValue(self(), entry, value);
        }

        @javax.annotation.CheckForNull
        E copyEntry(E e, E e2) {
            return (E) this.map.entryHelper.copy(self(), e, e2);
        }

        java.util.concurrent.atomic.AtomicReferenceArray<E> newEntryArray(int size) {
            return new java.util.concurrent.atomic.AtomicReferenceArray<>(size);
        }

        void initTable(java.util.concurrent.atomic.AtomicReferenceArray<E> newTable) {
            this.threshold = (newTable.length() * 3) / 4;
            this.table = newTable;
        }

        java.lang.ref.ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            throw new java.lang.AssertionError();
        }

        java.lang.ref.ReferenceQueue<V> getValueReferenceQueueForTesting() {
            throw new java.lang.AssertionError();
        }

        com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> getWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> entry) {
            throw new java.lang.AssertionError();
        }

        com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> newWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> entry, V value) {
            throw new java.lang.AssertionError();
        }

        void setWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> entry, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>> valueReference) {
            throw new java.lang.AssertionError();
        }

        void setTableEntryForTesting(int i, com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry) {
            this.table.set(i, (E) castForTesting(internalEntry));
        }

        E copyForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry, @javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry2) {
            return (E) this.map.entryHelper.copy(self(), castForTesting(internalEntry), castForTesting(internalEntry2));
        }

        void setValueForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> entry, V value) {
            this.map.entryHelper.setValue(self(), castForTesting(entry), value);
        }

        E newEntryForTesting(K k, int i, @javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry) {
            return (E) this.map.entryHelper.newEntry(self(), k, i, castForTesting(internalEntry));
        }

        boolean removeTableEntryForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> entry) {
            return removeEntryForTesting(castForTesting(entry));
        }

        @javax.annotation.CheckForNull
        E removeFromChainForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> internalEntry2) {
            return (E) removeFromChain(castForTesting(internalEntry), castForTesting(internalEntry2));
        }

        @javax.annotation.CheckForNull
        V getLiveValueForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> entry) {
            return getLiveValue(castForTesting(entry));
        }

        void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        void drainKeyReferenceQueue(java.lang.ref.ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                java.lang.ref.Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimKey((com.google.common.collect.MapMakerInternalMap.InternalEntry) referencePoll);
                i++;
            } while (i != 16);
        }

        void drainValueReferenceQueue(java.lang.ref.ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                java.lang.ref.Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimValue((com.google.common.collect.MapMakerInternalMap.WeakValueReference) referencePoll);
                i++;
            } while (i != 16);
        }

        <T> void clearReferenceQueue(java.lang.ref.ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        @javax.annotation.CheckForNull
        E getFirst(int hash) {
            java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
            return atomicReferenceArray.get(hash & (atomicReferenceArray.length() - 1));
        }

        @javax.annotation.CheckForNull
        E getEntry(java.lang.Object obj, int i) {
            if (this.count == 0) {
                return null;
            }
            for (E e = (E) getFirst(i); e != null; e = (E) e.getNext()) {
                if (e.getHash() == i) {
                    java.lang.Object key = e.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                        return e;
                    }
                }
            }
            return null;
        }

        @javax.annotation.CheckForNull
        E getLiveEntry(java.lang.Object obj, int i) {
            return (E) getEntry(obj, i);
        }

        @javax.annotation.CheckForNull
        V get(java.lang.Object obj, int i) {
            try {
                com.google.common.collect.MapMakerInternalMap.InternalEntry liveEntry = getLiveEntry(obj, i);
                if (liveEntry != null) {
                    V v = (V) liveEntry.getValue();
                    if (v == null) {
                        tryDrainReferenceQueues();
                    }
                    return v;
                }
                return null;
            } finally {
                postReadCleanup();
            }
        }

        boolean containsKey(java.lang.Object key, int hash) {
            try {
                boolean z = false;
                if (this.count == 0) {
                    return false;
                }
                com.google.common.collect.MapMakerInternalMap.InternalEntry liveEntry = getLiveEntry(key, hash);
                if (liveEntry != null && liveEntry.getValue() != null) {
                    z = true;
                }
                return z;
            } finally {
                postReadCleanup();
            }
        }

        boolean containsValue(java.lang.Object value) {
            try {
                if (this.count != 0) {
                    java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (E next = atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            V liveValue = getLiveValue(next);
                            if (liveValue != null && this.map.valueEquivalence().equivalent(value, liveValue)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                postReadCleanup();
            }
        }

        @javax.annotation.CheckForNull
        V put(K k, int i, V v, boolean z) {
            lock();
            try {
                preWriteCleanup();
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    expand();
                    i2 = this.count + 1;
                }
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (com.google.common.collect.MapMakerInternalMap.InternalEntry next = e; next != null; next = next.getNext()) {
                    java.lang.Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        V v2 = (V) next.getValue();
                        if (v2 == null) {
                            this.modCount++;
                            setValue(next, v);
                            this.count = this.count;
                            return null;
                        }
                        if (z) {
                            return v2;
                        }
                        this.modCount++;
                        setValue(next, v);
                        return v2;
                    }
                }
                this.modCount++;
                com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntryNewEntry = this.map.entryHelper.newEntry(self(), k, i, e);
                setValue(internalEntryNewEntry, v);
                atomicReferenceArray.set(length, (E) internalEntryNewEntry);
                this.count = i2;
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void expand() {
            java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.count;
            java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArrayNewEntryArray = newEntryArray(length << 1);
            this.threshold = (atomicReferenceArrayNewEntryArray.length() * 3) / 4;
            int length2 = atomicReferenceArrayNewEntryArray.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E next = atomicReferenceArray.get(i2);
                if (next != null) {
                    com.google.common.collect.MapMakerInternalMap.InternalEntry next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayNewEntryArray.set(hash, next);
                    } else {
                        com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntry = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                internalEntry = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayNewEntryArray.set(hash, internalEntry);
                        while (next != internalEntry) {
                            int hash3 = next.getHash() & length2;
                            com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntryCopyEntry = copyEntry(next, (com.google.common.collect.MapMakerInternalMap.InternalEntry) atomicReferenceArrayNewEntryArray.get(hash3));
                            if (internalEntryCopyEntry != null) {
                                atomicReferenceArrayNewEntryArray.set(hash3, internalEntryCopyEntry);
                            } else {
                                i--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.table = atomicReferenceArrayNewEntryArray;
            this.count = i;
        }

        boolean replace(K k, int i, V v, V v2) {
            lock();
            try {
                preWriteCleanup();
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (com.google.common.collect.MapMakerInternalMap.InternalEntry next = e; next != null; next = next.getNext()) {
                    java.lang.Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        java.lang.Object value = next.getValue();
                        if (value == null) {
                            if (isCollected(next)) {
                                this.modCount++;
                                com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntryRemoveFromChain = removeFromChain(e, next);
                                int i2 = this.count - 1;
                                atomicReferenceArray.set(length, (E) internalEntryRemoveFromChain);
                                this.count = i2;
                            }
                            return false;
                        }
                        if (!this.map.valueEquivalence().equivalent(v, value)) {
                            return false;
                        }
                        this.modCount++;
                        setValue(next, v2);
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        @javax.annotation.CheckForNull
        V replace(K k, int i, V v) {
            lock();
            try {
                preWriteCleanup();
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (com.google.common.collect.MapMakerInternalMap.InternalEntry next = e; next != null; next = next.getNext()) {
                    java.lang.Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        V v2 = (V) next.getValue();
                        if (v2 == null) {
                            if (isCollected(next)) {
                                this.modCount++;
                                com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntryRemoveFromChain = removeFromChain(e, next);
                                int i2 = this.count - 1;
                                atomicReferenceArray.set(length, (E) internalEntryRemoveFromChain);
                                this.count = i2;
                            }
                            return null;
                        }
                        this.modCount++;
                        setValue(next, v);
                        return v2;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        @javax.annotation.CheckForNull
        V remove(java.lang.Object obj, int i) {
            lock();
            try {
                preWriteCleanup();
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (com.google.common.collect.MapMakerInternalMap.InternalEntry next = e; next != null; next = next.getNext()) {
                    java.lang.Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                        V v = (V) next.getValue();
                        if (v == null && !isCollected(next)) {
                            return null;
                        }
                        this.modCount++;
                        com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntryRemoveFromChain = removeFromChain(e, next);
                        int i2 = this.count - 1;
                        atomicReferenceArray.set(length, (E) internalEntryRemoveFromChain);
                        this.count = i2;
                        return v;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        boolean remove(java.lang.Object obj, int i, java.lang.Object obj2) {
            lock();
            try {
                preWriteCleanup();
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                com.google.common.collect.MapMakerInternalMap.InternalEntry next = e;
                while (true) {
                    boolean z = false;
                    if (next == null) {
                        return false;
                    }
                    java.lang.Object key = next.getKey();
                    if (next.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(obj, key)) {
                        next = next.getNext();
                    } else {
                        if (this.map.valueEquivalence().equivalent(obj2, next.getValue())) {
                            z = true;
                        } else if (!isCollected(next)) {
                            return false;
                        }
                        this.modCount++;
                        com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntryRemoveFromChain = removeFromChain(e, next);
                        int i2 = this.count - 1;
                        atomicReferenceArray.set(length, (E) internalEntryRemoveFromChain);
                        this.count = i2;
                        return z;
                    }
                }
            } finally {
                unlock();
            }
        }

        void clear() {
            if (this.count != 0) {
                lock();
                try {
                    java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    maybeClearReferenceQueues();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                }
            }
        }

        @javax.annotation.CheckForNull
        E removeFromChain(E e, E e2) {
            int i = this.count;
            E e3 = (E) e2.getNext();
            while (e != e2) {
                com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntryCopyEntry = copyEntry(e, e3);
                if (internalEntryCopyEntry != null) {
                    e3 = (E) internalEntryCopyEntry;
                } else {
                    i--;
                }
                e = (E) e.getNext();
            }
            this.count = i;
            return e3;
        }

        boolean reclaimKey(E e, int i) {
            lock();
            try {
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = atomicReferenceArray.get(length);
                for (com.google.common.collect.MapMakerInternalMap.InternalEntry next = e2; next != null; next = next.getNext()) {
                    if (next == e) {
                        this.modCount++;
                        com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntryRemoveFromChain = removeFromChain(e2, next);
                        int i2 = this.count - 1;
                        atomicReferenceArray.set(length, (E) internalEntryRemoveFromChain);
                        this.count = i2;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        boolean reclaimValue(K k, int i, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> weakValueReference) {
            lock();
            try {
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (com.google.common.collect.MapMakerInternalMap.InternalEntry next = e; next != null; next = next.getNext()) {
                    java.lang.Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        if (((com.google.common.collect.MapMakerInternalMap.WeakValueEntry) next).getValueReference() != weakValueReference) {
                            return false;
                        }
                        this.modCount++;
                        com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntryRemoveFromChain = removeFromChain(e, next);
                        int i2 = this.count - 1;
                        atomicReferenceArray.set(length, (E) internalEntryRemoveFromChain);
                        this.count = i2;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        boolean clearValueForTesting(K k, int i, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>> weakValueReference) {
            lock();
            try {
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (com.google.common.collect.MapMakerInternalMap.InternalEntry next = e; next != null; next = next.getNext()) {
                    java.lang.Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        if (((com.google.common.collect.MapMakerInternalMap.WeakValueEntry) next).getValueReference() != weakValueReference) {
                            return false;
                        }
                        atomicReferenceArray.set(length, (E) removeFromChain(e, next));
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        boolean removeEntryForTesting(E e) {
            int hash = e.getHash();
            java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = hash & (atomicReferenceArray.length() - 1);
            E e2 = atomicReferenceArray.get(length);
            for (com.google.common.collect.MapMakerInternalMap.InternalEntry next = e2; next != null; next = next.getNext()) {
                if (next == e) {
                    this.modCount++;
                    com.google.common.collect.MapMakerInternalMap.InternalEntry internalEntryRemoveFromChain = removeFromChain(e2, next);
                    int i = this.count - 1;
                    atomicReferenceArray.set(length, (E) internalEntryRemoveFromChain);
                    this.count = i;
                    return true;
                }
            }
            return false;
        }

        static <K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> boolean isCollected(E entry) {
            return entry.getValue() == null;
        }

        @javax.annotation.CheckForNull
        V getLiveValue(E e) {
            if (e.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v = (V) e.getValue();
            if (v != null) {
                return v;
            }
            tryDrainReferenceQueues();
            return null;
        }

        void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                runCleanup();
            }
        }

        void preWriteCleanup() {
            runLockedCleanup();
        }

        void runCleanup() {
            runLockedCleanup();
        }

        void runLockedCleanup() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }
    }

    static final class StrongKeyStrongValueSegment<K, V> extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> self() {
            return this;
        }

        StrongKeyStrongValueSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        @javax.annotation.CheckForNull
        public com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> castForTesting(@javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> entry) {
            return (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) entry;
        }
    }

    static final class StrongKeyWeakValueSegment<K, V> extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> {
        private final java.lang.ref.ReferenceQueue<V> queueForValues;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> self() {
            return this;
        }

        StrongKeyWeakValueSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.queueForValues = new java.lang.ref.ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        java.lang.ref.ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        @javax.annotation.CheckForNull
        public com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> castForTesting(@javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> entry) {
            return (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) entry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> getWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> e) {
            return castForTesting((com.google.common.collect.MapMakerInternalMap.InternalEntry) e).getValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> e, V value) {
            return new com.google.common.collect.MapMakerInternalMap.WeakValueReferenceImpl(this.queueForValues, value, castForTesting((com.google.common.collect.MapMakerInternalMap.InternalEntry) e));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> e, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>> valueReference) {
            com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntryCastForTesting = castForTesting((com.google.common.collect.MapMakerInternalMap.InternalEntry) e);
            com.google.common.collect.MapMakerInternalMap.WeakValueReference weakValueReference = ((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) strongKeyWeakValueEntryCastForTesting).valueReference;
            ((com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) strongKeyWeakValueEntryCastForTesting).valueReference = valueReference;
            weakValueReference.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeDrainReferenceQueues() {
            drainValueReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForValues);
        }
    }

    static final class StrongKeyDummyValueSegment<K> extends com.google.common.collect.MapMakerInternalMap.Segment<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> self() {
            return this;
        }

        StrongKeyDummyValueSegment(com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>> map, int initialCapacity) {
            super(map, initialCapacity);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, com.google.common.collect.MapMaker.Dummy, ?> entry) {
            return (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry) entry;
        }
    }

    static final class WeakKeyStrongValueSegment<K, V> extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> {
        private final java.lang.ref.ReferenceQueue<K> queueForKeys;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> self() {
            return this;
        }

        WeakKeyStrongValueSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.queueForKeys = new java.lang.ref.ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        java.lang.ref.ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> entry) {
            return (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) entry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }
    }

    static final class WeakKeyWeakValueSegment<K, V> extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> {
        private final java.lang.ref.ReferenceQueue<K> queueForKeys;
        private final java.lang.ref.ReferenceQueue<V> queueForValues;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> self() {
            return this;
        }

        WeakKeyWeakValueSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.queueForKeys = new java.lang.ref.ReferenceQueue<>();
            this.queueForValues = new java.lang.ref.ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        java.lang.ref.ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        java.lang.ref.ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        @javax.annotation.CheckForNull
        public com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> castForTesting(@javax.annotation.CheckForNull com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> entry) {
            return (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) entry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> getWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> e) {
            return castForTesting((com.google.common.collect.MapMakerInternalMap.InternalEntry) e).getValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> e, V value) {
            return new com.google.common.collect.MapMakerInternalMap.WeakValueReferenceImpl(this.queueForValues, value, castForTesting((com.google.common.collect.MapMakerInternalMap.InternalEntry) e));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> e, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>> valueReference) {
            com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntryCastForTesting = castForTesting((com.google.common.collect.MapMakerInternalMap.InternalEntry) e);
            com.google.common.collect.MapMakerInternalMap.WeakValueReference weakValueReference = ((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) weakKeyWeakValueEntryCastForTesting).valueReference;
            ((com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) weakKeyWeakValueEntryCastForTesting).valueReference = valueReference;
            weakValueReference.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
            drainValueReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }
    }

    static final class WeakKeyDummyValueSegment<K> extends com.google.common.collect.MapMakerInternalMap.Segment<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>> {
        private final java.lang.ref.ReferenceQueue<K> queueForKeys;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> self() {
            return this;
        }

        WeakKeyDummyValueSegment(com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.queueForKeys = new java.lang.ref.ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        java.lang.ref.ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, com.google.common.collect.MapMaker.Dummy, ?> entry) {
            return (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry) entry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }
    }

    static final class CleanupMapTask implements java.lang.Runnable {
        final java.lang.ref.WeakReference<com.google.common.collect.MapMakerInternalMap<?, ?, ?, ?>> mapReference;

        public CleanupMapTask(com.google.common.collect.MapMakerInternalMap<?, ?, ?, ?> map) {
            this.mapReference = new java.lang.ref.WeakReference<>(map);
        }

        @Override // java.lang.Runnable
        public void run() {
            com.google.common.collect.MapMakerInternalMap<?, ?, ?, ?> mapMakerInternalMap = this.mapReference.get();
            if (mapMakerInternalMap == null) {
                throw new java.util.concurrent.CancellationException();
            }
            for (com.google.common.collect.MapMakerInternalMap.Segment<?, ?, E, S> segment : mapMakerInternalMap.segments) {
                segment.runCleanup();
            }
        }
    }

    com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
        return this.entryHelper.keyStrength();
    }

    com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
        return this.entryHelper.valueStrength();
    }

    com.google.common.base.Equivalence<java.lang.Object> valueEquivalence() {
        return this.entryHelper.valueStrength().defaultEquivalence();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>[] segmentArr = this.segments;
        long j = 0;
        for (int i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].count != 0) {
                return false;
            }
            j += (long) segmentArr[i].modCount;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].count != 0) {
                return false;
            }
            j -= (long) segmentArr[i2].modCount;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j = 0;
        for (com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> segment : this.segments) {
            j += (long) segment.count;
        }
        return com.google.common.primitives.Ints.saturatedCast(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object key) {
        if (key == null) {
            return null;
        }
        int iHash = hash(key);
        return segmentFor(iHash).get(key, iHash);
    }

    @javax.annotation.CheckForNull
    E getEntry(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return (E) segmentFor(iHash).getEntry(obj, iHash);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        if (key == null) {
            return false;
        }
        int iHash = hash(key);
        return segmentFor(iHash).containsKey(key, iHash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>[] segmentArr = this.segments;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = segmentArr.length;
            long j2 = 0;
            for (?? r10 = z; r10 < length; r10++) {
                com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> segment = segmentArr[r10];
                int i2 = segment.count;
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = segment.table;
                for (?? r13 = z; r13 < atomicReferenceArray.length(); r13++) {
                    for (E next = atomicReferenceArray.get(r13); next != null; next = next.getNext()) {
                        V liveValue = segment.getLiveValue(next);
                        if (liveValue != null && valueEquivalence().equivalent(obj, liveValue)) {
                            return true;
                        }
                    }
                }
                j2 += (long) segment.modCount;
                z = false;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            z = false;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public V put(K key, V value) {
        com.google.common.base.Preconditions.checkNotNull(key);
        com.google.common.base.Preconditions.checkNotNull(value);
        int iHash = hash(key);
        return segmentFor(iHash).put(key, iHash, value, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @javax.annotation.CheckForNull
    public V putIfAbsent(K key, V value) {
        com.google.common.base.Preconditions.checkNotNull(key);
        com.google.common.base.Preconditions.checkNotNull(value);
        int iHash = hash(key);
        return segmentFor(iHash).put(key, iHash, value, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> m) {
        for (java.util.Map.Entry<? extends K, ? extends V> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public V remove(@javax.annotation.CheckForNull java.lang.Object key) {
        if (key == null) {
            return null;
        }
        int iHash = hash(key);
        return segmentFor(iHash).remove(key, iHash);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
        if (key == null || value == null) {
            return false;
        }
        int iHash = hash(key);
        return segmentFor(iHash).remove(key, iHash, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K key, @javax.annotation.CheckForNull V oldValue, V newValue) {
        com.google.common.base.Preconditions.checkNotNull(key);
        com.google.common.base.Preconditions.checkNotNull(newValue);
        if (oldValue == null) {
            return false;
        }
        int iHash = hash(key);
        return segmentFor(iHash).replace(key, iHash, oldValue, newValue);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @javax.annotation.CheckForNull
    public V replace(K key, V value) {
        com.google.common.base.Preconditions.checkNotNull(key);
        com.google.common.base.Preconditions.checkNotNull(value);
        int iHash = hash(key);
        return segmentFor(iHash).replace(key, iHash, value);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> segment : this.segments) {
            segment.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
        java.util.Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.MapMakerInternalMap.KeySet keySet = new com.google.common.collect.MapMakerInternalMap.KeySet();
        this.keySet = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<V> values() {
        java.util.Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        com.google.common.collect.MapMakerInternalMap.Values values = new com.google.common.collect.MapMakerInternalMap.Values();
        this.values = values;
        return values;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        java.util.Set<java.util.Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.MapMakerInternalMap.EntrySet entrySet = new com.google.common.collect.MapMakerInternalMap.EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    abstract class HashIterator<T> implements java.util.Iterator<T> {

        @javax.annotation.CheckForNull
        com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> currentSegment;

        @javax.annotation.CheckForNull
        java.util.concurrent.atomic.AtomicReferenceArray<E> currentTable;

        @javax.annotation.CheckForNull
        com.google.common.collect.MapMakerInternalMap<K, V, E, S>.WriteThroughEntry lastReturned;

        @javax.annotation.CheckForNull
        E nextEntry;

        @javax.annotation.CheckForNull
        com.google.common.collect.MapMakerInternalMap<K, V, E, S>.WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex = -1;

        @Override // java.util.Iterator
        public abstract T next();

        HashIterator() {
            this.nextSegmentIndex = com.google.common.collect.MapMakerInternalMap.this.segments.length - 1;
            advance();
        }

        final void advance() {
            this.nextExternal = null;
            if (nextInChain() || nextInTable()) {
                return;
            }
            while (this.nextSegmentIndex >= 0) {
                com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>[] segmentArr = com.google.common.collect.MapMakerInternalMap.this.segments;
                int i = this.nextSegmentIndex;
                this.nextSegmentIndex = i - 1;
                com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> segment = segmentArr[i];
                this.currentSegment = segment;
                if (segment.count != 0) {
                    java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.currentSegment.table;
                    this.currentTable = atomicReferenceArray;
                    this.nextTableIndex = atomicReferenceArray.length() - 1;
                    if (nextInTable()) {
                        return;
                    }
                }
            }
        }

        boolean nextInChain() {
            E e = this.nextEntry;
            if (e == null) {
                return false;
            }
            while (true) {
                this.nextEntry = (E) e.getNext();
                E e2 = this.nextEntry;
                if (e2 == null) {
                    return false;
                }
                if (advanceTo(e2)) {
                    return true;
                }
                e = this.nextEntry;
            }
        }

        boolean nextInTable() {
            while (true) {
                int i = this.nextTableIndex;
                if (i < 0) {
                    return false;
                }
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.currentTable;
                this.nextTableIndex = i - 1;
                E e = atomicReferenceArray.get(i);
                this.nextEntry = e;
                if (e != null && (advanceTo(e) || nextInChain())) {
                    return true;
                }
            }
        }

        boolean advanceTo(E entry) {
            com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> segment;
            try {
                java.lang.Object key = entry.getKey();
                java.lang.Object liveValue = com.google.common.collect.MapMakerInternalMap.this.getLiveValue(entry);
                if (liveValue == null) {
                    return false;
                }
                this.nextExternal = new com.google.common.collect.MapMakerInternalMap.WriteThroughEntry(key, liveValue);
                return true;
            } finally {
                this.currentSegment.postReadCleanup();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextExternal != null;
        }

        com.google.common.collect.MapMakerInternalMap<K, V, E, S>.WriteThroughEntry nextEntry() {
            com.google.common.collect.MapMakerInternalMap<K, V, E, S>.WriteThroughEntry writeThroughEntry = this.nextExternal;
            if (writeThroughEntry == null) {
                throw new java.util.NoSuchElementException();
            }
            this.lastReturned = writeThroughEntry;
            advance();
            return this.lastReturned;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.collect.CollectPreconditions.checkRemove(this.lastReturned != null);
            com.google.common.collect.MapMakerInternalMap.this.remove(this.lastReturned.getKey());
            this.lastReturned = null;
        }
    }

    final class KeyIterator extends com.google.common.collect.MapMakerInternalMap<K, V, E, S>.HashIterator<K> {
        KeyIterator(final com.google.common.collect.MapMakerInternalMap this$0) {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public K next() {
            return nextEntry().getKey();
        }
    }

    final class ValueIterator extends com.google.common.collect.MapMakerInternalMap<K, V, E, S>.HashIterator<V> {
        ValueIterator(final com.google.common.collect.MapMakerInternalMap this$0) {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public V next() {
            return nextEntry().getValue();
        }
    }

    final class WriteThroughEntry extends com.google.common.collect.AbstractMapEntry<K, V> {
        final K key;
        V value;

        WriteThroughEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (!(object instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) object;
            return this.key.equals(entry.getKey()) && this.value.equals(entry.getValue());
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public int hashCode() {
            return this.key.hashCode() ^ this.value.hashCode();
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) com.google.common.collect.MapMakerInternalMap.this.put(this.key, v);
            this.value = v;
            return v2;
        }
    }

    final class EntryIterator extends com.google.common.collect.MapMakerInternalMap<K, V, E, S>.HashIterator<java.util.Map.Entry<K, V>> {
        EntryIterator(final com.google.common.collect.MapMakerInternalMap this$0) {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
            return nextEntry();
        }
    }

    final class KeySet extends com.google.common.collect.MapMakerInternalMap.SafeToArraySet<K> {
        KeySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
            return new com.google.common.collect.MapMakerInternalMap.KeyIterator(com.google.common.collect.MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.collect.MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return com.google.common.collect.MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object o) {
            return com.google.common.collect.MapMakerInternalMap.this.containsKey(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object o) {
            return com.google.common.collect.MapMakerInternalMap.this.remove(o) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.google.common.collect.MapMakerInternalMap.this.clear();
        }
    }

    final class Values extends java.util.AbstractCollection<V> {
        Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
            return new com.google.common.collect.MapMakerInternalMap.ValueIterator(com.google.common.collect.MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return com.google.common.collect.MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return com.google.common.collect.MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object o) {
            return com.google.common.collect.MapMakerInternalMap.this.containsValue(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.collect.MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public java.lang.Object[] toArray() {
            return com.google.common.collect.MapMakerInternalMap.toArrayList(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) com.google.common.collect.MapMakerInternalMap.toArrayList(this).toArray(tArr);
        }
    }

    final class EntrySet extends com.google.common.collect.MapMakerInternalMap.SafeToArraySet<java.util.Map.Entry<K, V>> {
        EntrySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new com.google.common.collect.MapMakerInternalMap.EntryIterator(com.google.common.collect.MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object o) {
            java.util.Map.Entry entry;
            java.lang.Object key;
            java.lang.Object obj;
            return (o instanceof java.util.Map.Entry) && (key = (entry = (java.util.Map.Entry) o).getKey()) != null && (obj = com.google.common.collect.MapMakerInternalMap.this.get(key)) != null && com.google.common.collect.MapMakerInternalMap.this.valueEquivalence().equivalent(entry.getValue(), obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object o) {
            java.util.Map.Entry entry;
            java.lang.Object key;
            return (o instanceof java.util.Map.Entry) && (key = (entry = (java.util.Map.Entry) o).getKey()) != null && com.google.common.collect.MapMakerInternalMap.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.collect.MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return com.google.common.collect.MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.google.common.collect.MapMakerInternalMap.this.clear();
        }
    }

    private static abstract class SafeToArraySet<E> extends java.util.AbstractSet<E> {
        private SafeToArraySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
            return com.google.common.collect.MapMakerInternalMap.toArrayList(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) com.google.common.collect.MapMakerInternalMap.toArrayList(this).toArray(tArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.ArrayList<E> toArrayList(java.util.Collection<E> c) {
        java.util.ArrayList<E> arrayList = new java.util.ArrayList<>(c.size());
        com.google.common.collect.Iterators.addAll(arrayList, c.iterator());
        return arrayList;
    }

    java.lang.Object writeReplace() {
        return new com.google.common.collect.MapMakerInternalMap.SerializationProxy(this.entryHelper.keyStrength(), this.entryHelper.valueStrength(), this.keyEquivalence, this.entryHelper.valueStrength().defaultEquivalence(), this.concurrencyLevel, this);
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializationProxy");
    }

    static abstract class AbstractSerializationProxy<K, V> extends com.google.common.collect.ForwardingConcurrentMap<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 3;
        final int concurrencyLevel;
        transient java.util.concurrent.ConcurrentMap<K, V> delegate;
        final com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;
        final com.google.common.collect.MapMakerInternalMap.Strength keyStrength;
        final com.google.common.base.Equivalence<java.lang.Object> valueEquivalence;
        final com.google.common.collect.MapMakerInternalMap.Strength valueStrength;

        AbstractSerializationProxy(com.google.common.collect.MapMakerInternalMap.Strength keyStrength, com.google.common.collect.MapMakerInternalMap.Strength valueStrength, com.google.common.base.Equivalence<java.lang.Object> keyEquivalence, com.google.common.base.Equivalence<java.lang.Object> valueEquivalence, int concurrencyLevel, java.util.concurrent.ConcurrentMap<K, V> delegate) {
            this.keyStrength = keyStrength;
            this.valueStrength = valueStrength;
            this.keyEquivalence = keyEquivalence;
            this.valueEquivalence = valueEquivalence;
            this.concurrencyLevel = concurrencyLevel;
            this.delegate = delegate;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public java.util.concurrent.ConcurrentMap<K, V> delegate() {
            return this.delegate;
        }

        void writeMapTo(java.io.ObjectOutputStream out) throws java.io.IOException {
            out.writeInt(this.delegate.size());
            for (java.util.Map.Entry<K, V> entry : this.delegate.entrySet()) {
                out.writeObject(entry.getKey());
                out.writeObject(entry.getValue());
            }
            out.writeObject(null);
        }

        com.google.common.collect.MapMaker readMapMaker(java.io.ObjectInputStream in) throws java.io.IOException {
            return new com.google.common.collect.MapMaker().initialCapacity(in.readInt()).setKeyStrength(this.keyStrength).setValueStrength(this.valueStrength).keyEquivalence(this.keyEquivalence).concurrencyLevel(this.concurrencyLevel);
        }

        void readEntries(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
            while (true) {
                java.lang.Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                }
                this.delegate.put((K) object, (V) objectInputStream.readObject());
            }
        }
    }

    private static final class SerializationProxy<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        SerializationProxy(com.google.common.collect.MapMakerInternalMap.Strength keyStrength, com.google.common.collect.MapMakerInternalMap.Strength valueStrength, com.google.common.base.Equivalence<java.lang.Object> keyEquivalence, com.google.common.base.Equivalence<java.lang.Object> valueEquivalence, int concurrencyLevel, java.util.concurrent.ConcurrentMap<K, V> delegate) {
            super(keyStrength, valueStrength, keyEquivalence, valueEquivalence, concurrencyLevel, delegate);
        }

        private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
            out.defaultWriteObject();
            writeMapTo(out);
        }

        private void readObject(java.io.ObjectInputStream in) throws java.lang.ClassNotFoundException, java.io.IOException {
            in.defaultReadObject();
            this.delegate = readMapMaker(in).makeMap();
            readEntries(in);
        }

        private java.lang.Object readResolve() {
            return this.delegate;
        }
    }
}
