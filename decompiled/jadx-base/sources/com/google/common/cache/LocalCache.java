package com.google.common.cache;

/* JADX INFO: loaded from: classes5.dex */
class LocalCache<K, V> extends java.util.AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V> {
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_SEGMENTS = 65536;
    final int concurrencyLevel;

    @javax.annotation.CheckForNull
    final com.google.common.cache.CacheLoader<? super K, V> defaultLoader;
    final com.google.common.cache.LocalCache.EntryFactory entryFactory;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    java.util.Set<java.util.Map.Entry<K, V>> entrySet;
    final long expireAfterAccessNanos;
    final long expireAfterWriteNanos;
    final com.google.common.cache.AbstractCache.StatsCounter globalStatsCounter;
    final com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    java.util.Set<K> keySet;
    final com.google.common.cache.LocalCache.Strength keyStrength;
    final long maxWeight;
    final long refreshNanos;
    final com.google.common.cache.RemovalListener<K, V> removalListener;
    final java.util.Queue<com.google.common.cache.RemovalNotification<K, V>> removalNotificationQueue;
    final int segmentMask;
    final int segmentShift;
    final com.google.common.cache.LocalCache.Segment<K, V>[] segments;
    final com.google.common.base.Ticker ticker;
    final com.google.common.base.Equivalence<java.lang.Object> valueEquivalence;
    final com.google.common.cache.LocalCache.Strength valueStrength;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    java.util.Collection<V> values;
    final com.google.common.cache.Weigher<K, V> weigher;
    static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.common.cache.LocalCache.class.getName());
    static final com.google.common.cache.LocalCache.ValueReference<java.lang.Object, java.lang.Object> UNSET = new com.google.common.cache.LocalCache.ValueReference<java.lang.Object, java.lang.Object>() { // from class: com.google.common.cache.LocalCache.1
        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<java.lang.Object, java.lang.Object> copyFor(java.lang.ref.ReferenceQueue<java.lang.Object> queue, @javax.annotation.CheckForNull java.lang.Object value, com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> entry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        @javax.annotation.CheckForNull
        public java.lang.Object get() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        @javax.annotation.CheckForNull
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 0;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(java.lang.Object newValue) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        @javax.annotation.CheckForNull
        public java.lang.Object waitForValue() {
            return null;
        }
    };
    static final java.util.Queue<?> DISCARDING_QUEUE = new java.util.AbstractQueue<java.lang.Object>() { // from class: com.google.common.cache.LocalCache.2
        @Override // java.util.Queue
        public boolean offer(java.lang.Object o) {
            return true;
        }

        @Override // java.util.Queue
        @javax.annotation.CheckForNull
        public java.lang.Object peek() {
            return null;
        }

        @Override // java.util.Queue
        @javax.annotation.CheckForNull
        public java.lang.Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<java.lang.Object> iterator() {
            return com.google.common.collect.ImmutableSet.of().iterator();
        }
    };

    private enum NullEntry implements com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> {
        INSTANCE;

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            return 0;
        }

        @Override // com.google.common.cache.ReferenceEntry
        @javax.annotation.CheckForNull
        public java.lang.Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        @javax.annotation.CheckForNull
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getNext() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getNextInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getNextInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        @javax.annotation.CheckForNull
        public com.google.common.cache.LocalCache.ValueReference<java.lang.Object, java.lang.Object> getValueReference() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long time) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> next) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> next) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> previous) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> previous) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(com.google.common.cache.LocalCache.ValueReference<java.lang.Object, java.lang.Object> valueReference) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long time) {
        }
    }

    enum Strength {
        STRONG { // from class: com.google.common.cache.LocalCache.Strength.1
            @Override // com.google.common.cache.LocalCache.Strength
            <K, V> com.google.common.cache.LocalCache.ValueReference<K, V> referenceValue(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> entry, V value, int weight) {
                if (weight == 1) {
                    return new com.google.common.cache.LocalCache.StrongValueReference(value);
                }
                return new com.google.common.cache.LocalCache.WeightedStrongValueReference(value, weight);
            }

            @Override // com.google.common.cache.LocalCache.Strength
            com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence() {
                return com.google.common.base.Equivalence.equals();
            }
        },
        SOFT { // from class: com.google.common.cache.LocalCache.Strength.2
            @Override // com.google.common.cache.LocalCache.Strength
            <K, V> com.google.common.cache.LocalCache.ValueReference<K, V> referenceValue(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> entry, V value, int weight) {
                if (weight == 1) {
                    return new com.google.common.cache.LocalCache.SoftValueReference(segment.valueReferenceQueue, value, entry);
                }
                return new com.google.common.cache.LocalCache.WeightedSoftValueReference(segment.valueReferenceQueue, value, entry, weight);
            }

            @Override // com.google.common.cache.LocalCache.Strength
            com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence() {
                return com.google.common.base.Equivalence.identity();
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.Strength.3
            @Override // com.google.common.cache.LocalCache.Strength
            <K, V> com.google.common.cache.LocalCache.ValueReference<K, V> referenceValue(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> entry, V value, int weight) {
                if (weight == 1) {
                    return new com.google.common.cache.LocalCache.WeakValueReference(segment.valueReferenceQueue, value, entry);
                }
                return new com.google.common.cache.LocalCache.WeightedWeakValueReference(segment.valueReferenceQueue, value, entry, weight);
            }

            @Override // com.google.common.cache.LocalCache.Strength
            com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence() {
                return com.google.common.base.Equivalence.identity();
            }
        };

        abstract com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence();

        abstract <K, V> com.google.common.cache.LocalCache.ValueReference<K, V> referenceValue(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> entry, V value, int weight);
    }

    interface ValueReference<K, V> {
        com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> queue, @javax.annotation.CheckForNull V value, com.google.common.cache.ReferenceEntry<K, V> entry);

        @javax.annotation.CheckForNull
        V get();

        @javax.annotation.CheckForNull
        com.google.common.cache.ReferenceEntry<K, V> getEntry();

        int getWeight();

        boolean isActive();

        boolean isLoading();

        void notifyNewValue(@javax.annotation.CheckForNull V newValue);

        V waitForValue() throws java.util.concurrent.ExecutionException;
    }

    static int rehash(int h) {
        int i = h + ((h << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    LocalCache(com.google.common.cache.CacheBuilder<? super K, ? super V> cacheBuilder, @javax.annotation.CheckForNull com.google.common.cache.CacheLoader<? super K, V> cacheLoader) {
        java.util.Queue<com.google.common.cache.RemovalNotification<K, V>> concurrentLinkedQueue;
        this.concurrencyLevel = java.lang.Math.min(cacheBuilder.getConcurrencyLevel(), 65536);
        com.google.common.cache.LocalCache.Strength keyStrength = cacheBuilder.getKeyStrength();
        this.keyStrength = keyStrength;
        this.valueStrength = cacheBuilder.getValueStrength();
        this.keyEquivalence = cacheBuilder.getKeyEquivalence();
        this.valueEquivalence = cacheBuilder.getValueEquivalence();
        long maximumWeight = cacheBuilder.getMaximumWeight();
        this.maxWeight = maximumWeight;
        this.weigher = (com.google.common.cache.Weigher<K, V>) cacheBuilder.getWeigher();
        this.expireAfterAccessNanos = cacheBuilder.getExpireAfterAccessNanos();
        this.expireAfterWriteNanos = cacheBuilder.getExpireAfterWriteNanos();
        this.refreshNanos = cacheBuilder.getRefreshNanos();
        com.google.common.cache.CacheBuilder.NullListener nullListener = (com.google.common.cache.RemovalListener<K, V>) cacheBuilder.getRemovalListener();
        this.removalListener = nullListener;
        if (nullListener == com.google.common.cache.CacheBuilder.NullListener.INSTANCE) {
            concurrentLinkedQueue = discardingQueue();
        } else {
            concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();
        }
        this.removalNotificationQueue = concurrentLinkedQueue;
        this.ticker = cacheBuilder.getTicker(recordsTime());
        this.entryFactory = com.google.common.cache.LocalCache.EntryFactory.getFactory(keyStrength, usesAccessEntries(), usesWriteEntries());
        this.globalStatsCounter = cacheBuilder.getStatsCounterSupplier().get();
        this.defaultLoader = cacheLoader;
        int iMin = java.lang.Math.min(cacheBuilder.getInitialCapacity(), 1073741824);
        if (evictsBySize() && !customWeigher()) {
            iMin = (int) java.lang.Math.min(iMin, maximumWeight);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.concurrencyLevel && (!evictsBySize() || ((long) i4) * 20 <= this.maxWeight)) {
            i3++;
            i4 <<= 1;
        }
        this.segmentShift = 32 - i3;
        this.segmentMask = i4 - 1;
        this.segments = newSegmentArray(i4);
        int i5 = iMin / i4;
        while (i2 < (i5 * i4 < iMin ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        if (evictsBySize()) {
            long j = this.maxWeight;
            long j2 = i4;
            long j3 = (j / j2) + 1;
            long j4 = j % j2;
            while (true) {
                com.google.common.cache.LocalCache.Segment<K, V>[] segmentArr = this.segments;
                if (i >= segmentArr.length) {
                    return;
                }
                if (i == j4) {
                    j3--;
                }
                segmentArr[i] = createSegment(i2, j3, cacheBuilder.getStatsCounterSupplier().get());
                i++;
            }
        } else {
            while (true) {
                com.google.common.cache.LocalCache.Segment<K, V>[] segmentArr2 = this.segments;
                if (i >= segmentArr2.length) {
                    return;
                }
                segmentArr2[i] = createSegment(i2, -1L, cacheBuilder.getStatsCounterSupplier().get());
                i++;
            }
        }
    }

    boolean evictsBySize() {
        return this.maxWeight >= 0;
    }

    boolean customWeigher() {
        return this.weigher != com.google.common.cache.CacheBuilder.OneWeigher.INSTANCE;
    }

    boolean expires() {
        return expiresAfterWrite() || expiresAfterAccess();
    }

    boolean expiresAfterWrite() {
        return this.expireAfterWriteNanos > 0;
    }

    boolean expiresAfterAccess() {
        return this.expireAfterAccessNanos > 0;
    }

    boolean refreshes() {
        return this.refreshNanos > 0;
    }

    boolean usesAccessQueue() {
        return expiresAfterAccess() || evictsBySize();
    }

    boolean usesWriteQueue() {
        return expiresAfterWrite();
    }

    boolean recordsWrite() {
        return expiresAfterWrite() || refreshes();
    }

    boolean recordsAccess() {
        return expiresAfterAccess();
    }

    boolean recordsTime() {
        return recordsWrite() || recordsAccess();
    }

    boolean usesWriteEntries() {
        return usesWriteQueue() || recordsWrite();
    }

    boolean usesAccessEntries() {
        return usesAccessQueue() || recordsAccess();
    }

    boolean usesKeyReferences() {
        return this.keyStrength != com.google.common.cache.LocalCache.Strength.STRONG;
    }

    boolean usesValueReferences() {
        return this.valueStrength != com.google.common.cache.LocalCache.Strength.STRONG;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.common.cache.LocalCache$EntryFactory, still in use, count: 1, list:
  (r0v0 com.google.common.cache.LocalCache$EntryFactory) from 0x0058: FILLED_NEW_ARRAY 
  (r0v0 com.google.common.cache.LocalCache$EntryFactory)
  (r1v1 com.google.common.cache.LocalCache$EntryFactory)
  (r3v1 com.google.common.cache.LocalCache$EntryFactory)
  (r5v1 com.google.common.cache.LocalCache$EntryFactory)
  (r7v1 com.google.common.cache.LocalCache$EntryFactory)
  (r9v1 com.google.common.cache.LocalCache$EntryFactory)
  (r11v1 com.google.common.cache.LocalCache$EntryFactory)
  (r13v1 com.google.common.cache.LocalCache$EntryFactory)
 A[WRAPPED] elemType: com.google.common.cache.LocalCache$EntryFactory
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static abstract class EntryFactory {
        STRONG { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
                return new com.google.common.cache.LocalCache.StrongEntry(key, hash, next);
            }
        },
        STRONG_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
                return new com.google.common.cache.LocalCache.StrongAccessEntry(key, hash, next);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newNext, K key) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, original, newNext, key);
                copyAccessEntry(original, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        },
        STRONG_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
                return new com.google.common.cache.LocalCache.StrongWriteEntry(key, hash, next);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newNext, K key) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, original, newNext, key);
                copyWriteEntry(original, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        },
        STRONG_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
                return new com.google.common.cache.LocalCache.StrongAccessWriteEntry(key, hash, next);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newNext, K key) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, original, newNext, key);
                copyAccessEntry(original, referenceEntryCopyEntry);
                copyWriteEntry(original, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
                return new com.google.common.cache.LocalCache.WeakEntry(segment.keyReferenceQueue, key, hash, next);
            }
        },
        WEAK_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
                return new com.google.common.cache.LocalCache.WeakAccessEntry(segment.keyReferenceQueue, key, hash, next);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newNext, K key) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, original, newNext, key);
                copyAccessEntry(original, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        },
        WEAK_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
                return new com.google.common.cache.LocalCache.WeakWriteEntry(segment.keyReferenceQueue, key, hash, next);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newNext, K key) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, original, newNext, key);
                copyWriteEntry(original, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        },
        WEAK_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
                return new com.google.common.cache.LocalCache.WeakAccessWriteEntry(segment.keyReferenceQueue, key, hash, next);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newNext, K key) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, original, newNext, key);
                copyAccessEntry(original, referenceEntryCopyEntry);
                copyWriteEntry(original, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        };

        static final int ACCESS_MASK = 1;
        static final int WEAK_MASK = 4;
        static final int WRITE_MASK = 2;
        static final com.google.common.cache.LocalCache.EntryFactory[] factories = {new com.google.common.cache.LocalCache.EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
                return new com.google.common.cache.LocalCache.StrongEntry(key, hash, next);
            }
        }, new com.google.common.cache.LocalCache.EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
                return new com.google.common.cache.LocalCache.StrongAccessEntry(key, hash, next);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newNext, K key) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, original, newNext, key);
                copyAccessEntry(original, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }, new com.google.common.cache.LocalCache.EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
                return new com.google.common.cache.LocalCache.StrongWriteEntry(key, hash, next);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newNext, K key) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, original, newNext, key);
                copyWriteEntry(original, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }, new com.google.common.cache.LocalCache.EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
                return new com.google.common.cache.LocalCache.StrongAccessWriteEntry(key, hash, next);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newNext, K key) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, original, newNext, key);
                copyAccessEntry(original, referenceEntryCopyEntry);
                copyWriteEntry(original, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }, new com.google.common.cache.LocalCache.EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
                return new com.google.common.cache.LocalCache.WeakEntry(segment.keyReferenceQueue, key, hash, next);
            }
        }, new com.google.common.cache.LocalCache.EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
                return new com.google.common.cache.LocalCache.WeakAccessEntry(segment.keyReferenceQueue, key, hash, next);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newNext, K key) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, original, newNext, key);
                copyAccessEntry(original, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }, new com.google.common.cache.LocalCache.EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
                return new com.google.common.cache.LocalCache.WeakWriteEntry(segment.keyReferenceQueue, key, hash, next);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newNext, K key) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, original, newNext, key);
                copyWriteEntry(original, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }, new com.google.common.cache.LocalCache.EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
                return new com.google.common.cache.LocalCache.WeakAccessWriteEntry(segment.keyReferenceQueue, key, hash, next);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newNext, K key) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(segment, original, newNext, key);
                copyAccessEntry(original, referenceEntryCopyEntry);
                copyWriteEntry(original, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }};

        abstract <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next);

        private EntryFactory(java.lang.String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        public static com.google.common.cache.LocalCache.EntryFactory valueOf(java.lang.String name) {
            return (com.google.common.cache.LocalCache.EntryFactory) java.lang.Enum.valueOf(com.google.common.cache.LocalCache.EntryFactory.class, name);
        }

        public static com.google.common.cache.LocalCache.EntryFactory[] values() {
            return (com.google.common.cache.LocalCache.EntryFactory[]) $VALUES.clone();
        }

        static {
        }

        /* JADX WARN: Multi-variable type inference failed */
        static com.google.common.cache.LocalCache.EntryFactory getFactory(com.google.common.cache.LocalCache.Strength strength, boolean z, boolean z2) {
            return factories[((strength == com.google.common.cache.LocalCache.Strength.WEAK ? (char) 4 : (char) 0) | (z ? 1 : 0) ? 1 : 0) | (z2 ? 2 : 0)];
        }

        <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> segment, com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newNext, K key) {
            return newEntry(segment, key, original.getHash(), newNext);
        }

        <K, V> void copyAccessEntry(com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newEntry) {
            newEntry.setAccessTime(original.getAccessTime());
            com.google.common.cache.LocalCache.connectAccessOrder(original.getPreviousInAccessQueue(), newEntry);
            com.google.common.cache.LocalCache.connectAccessOrder(newEntry, original.getNextInAccessQueue());
            com.google.common.cache.LocalCache.nullifyAccessOrder(original);
        }

        <K, V> void copyWriteEntry(com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newEntry) {
            newEntry.setWriteTime(original.getWriteTime());
            com.google.common.cache.LocalCache.connectWriteOrder(original.getPreviousInWriteQueue(), newEntry);
            com.google.common.cache.LocalCache.connectWriteOrder(newEntry, original.getNextInWriteQueue());
            com.google.common.cache.LocalCache.nullifyWriteOrder(original);
        }
    }

    static <K, V> com.google.common.cache.LocalCache.ValueReference<K, V> unset() {
        return (com.google.common.cache.LocalCache.ValueReference<K, V>) UNSET;
    }

    static abstract class AbstractReferenceEntry<K, V> implements com.google.common.cache.ReferenceEntry<K, V> {
        AbstractReferenceEntry() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.LocalCache.ValueReference<K, V> getValueReference() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> valueReference) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNext() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long time) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> next) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> previous) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long time) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> next) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> previous) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    static <K, V> com.google.common.cache.ReferenceEntry<K, V> nullEntry() {
        return com.google.common.cache.LocalCache.NullEntry.INSTANCE;
    }

    static <E> java.util.Queue<E> discardingQueue() {
        return (java.util.Queue<E>) DISCARDING_QUEUE;
    }

    static class StrongEntry<K, V> extends com.google.common.cache.LocalCache.AbstractReferenceEntry<K, V> {
        final int hash;
        final K key;

        @javax.annotation.CheckForNull
        final com.google.common.cache.ReferenceEntry<K, V> next;
        volatile com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = com.google.common.cache.LocalCache.unset();

        StrongEntry(K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
            this.key = key;
            this.hash = hash;
            this.next = next;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.LocalCache.ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> valueReference) {
            this.valueReference = valueReference;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public int getHash() {
            return this.hash;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNext() {
            return this.next;
        }
    }

    static final class StrongAccessEntry<K, V> extends com.google.common.cache.LocalCache.StrongEntry<K, V> {
        volatile long accessTime;
        com.google.common.cache.ReferenceEntry<K, V> nextAccess;
        com.google.common.cache.ReferenceEntry<K, V> previousAccess;

        StrongAccessEntry(K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
            super(key, hash, next);
            this.accessTime = Long.MAX_VALUE;
            this.nextAccess = com.google.common.cache.LocalCache.nullEntry();
            this.previousAccess = com.google.common.cache.LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long time) {
            this.accessTime = time;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> next) {
            this.nextAccess = next;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> previous) {
            this.previousAccess = previous;
        }
    }

    static final class StrongWriteEntry<K, V> extends com.google.common.cache.LocalCache.StrongEntry<K, V> {
        com.google.common.cache.ReferenceEntry<K, V> nextWrite;
        com.google.common.cache.ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        StrongWriteEntry(K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
            super(key, hash, next);
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = com.google.common.cache.LocalCache.nullEntry();
            this.previousWrite = com.google.common.cache.LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long time) {
            this.writeTime = time;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> next) {
            this.nextWrite = next;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> previous) {
            this.previousWrite = previous;
        }
    }

    static final class StrongAccessWriteEntry<K, V> extends com.google.common.cache.LocalCache.StrongEntry<K, V> {
        volatile long accessTime;
        com.google.common.cache.ReferenceEntry<K, V> nextAccess;
        com.google.common.cache.ReferenceEntry<K, V> nextWrite;
        com.google.common.cache.ReferenceEntry<K, V> previousAccess;
        com.google.common.cache.ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        StrongAccessWriteEntry(K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
            super(key, hash, next);
            this.accessTime = Long.MAX_VALUE;
            this.nextAccess = com.google.common.cache.LocalCache.nullEntry();
            this.previousAccess = com.google.common.cache.LocalCache.nullEntry();
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = com.google.common.cache.LocalCache.nullEntry();
            this.previousWrite = com.google.common.cache.LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long time) {
            this.accessTime = time;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> next) {
            this.nextAccess = next;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> previous) {
            this.previousAccess = previous;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long time) {
            this.writeTime = time;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> next) {
            this.nextWrite = next;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> previous) {
            this.previousWrite = previous;
        }
    }

    static class WeakEntry<K, V> extends java.lang.ref.WeakReference<K> implements com.google.common.cache.ReferenceEntry<K, V> {
        final int hash;

        @javax.annotation.CheckForNull
        final com.google.common.cache.ReferenceEntry<K, V> next;
        volatile com.google.common.cache.LocalCache.ValueReference<K, V> valueReference;

        WeakEntry(java.lang.ref.ReferenceQueue<K> queue, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
            super(key, queue);
            this.valueReference = com.google.common.cache.LocalCache.unset();
            this.hash = hash;
            this.next = next;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            return (K) get();
        }

        public long getAccessTime() {
            throw new java.lang.UnsupportedOperationException();
        }

        public void setAccessTime(long time) {
            throw new java.lang.UnsupportedOperationException();
        }

        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new java.lang.UnsupportedOperationException();
        }

        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> next) {
            throw new java.lang.UnsupportedOperationException();
        }

        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new java.lang.UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> previous) {
            throw new java.lang.UnsupportedOperationException();
        }

        public long getWriteTime() {
            throw new java.lang.UnsupportedOperationException();
        }

        public void setWriteTime(long time) {
            throw new java.lang.UnsupportedOperationException();
        }

        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new java.lang.UnsupportedOperationException();
        }

        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> next) {
            throw new java.lang.UnsupportedOperationException();
        }

        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new java.lang.UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> previous) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.LocalCache.ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> valueReference) {
            this.valueReference = valueReference;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            return this.hash;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNext() {
            return this.next;
        }
    }

    static final class WeakAccessEntry<K, V> extends com.google.common.cache.LocalCache.WeakEntry<K, V> {
        volatile long accessTime;
        com.google.common.cache.ReferenceEntry<K, V> nextAccess;
        com.google.common.cache.ReferenceEntry<K, V> previousAccess;

        WeakAccessEntry(java.lang.ref.ReferenceQueue<K> queue, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
            super(queue, key, hash, next);
            this.accessTime = Long.MAX_VALUE;
            this.nextAccess = com.google.common.cache.LocalCache.nullEntry();
            this.previousAccess = com.google.common.cache.LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long time) {
            this.accessTime = time;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> next) {
            this.nextAccess = next;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> previous) {
            this.previousAccess = previous;
        }
    }

    static final class WeakWriteEntry<K, V> extends com.google.common.cache.LocalCache.WeakEntry<K, V> {
        com.google.common.cache.ReferenceEntry<K, V> nextWrite;
        com.google.common.cache.ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        WeakWriteEntry(java.lang.ref.ReferenceQueue<K> queue, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
            super(queue, key, hash, next);
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = com.google.common.cache.LocalCache.nullEntry();
            this.previousWrite = com.google.common.cache.LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long time) {
            this.writeTime = time;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> next) {
            this.nextWrite = next;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> previous) {
            this.previousWrite = previous;
        }
    }

    static final class WeakAccessWriteEntry<K, V> extends com.google.common.cache.LocalCache.WeakEntry<K, V> {
        volatile long accessTime;
        com.google.common.cache.ReferenceEntry<K, V> nextAccess;
        com.google.common.cache.ReferenceEntry<K, V> nextWrite;
        com.google.common.cache.ReferenceEntry<K, V> previousAccess;
        com.google.common.cache.ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        WeakAccessWriteEntry(java.lang.ref.ReferenceQueue<K> queue, K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
            super(queue, key, hash, next);
            this.accessTime = Long.MAX_VALUE;
            this.nextAccess = com.google.common.cache.LocalCache.nullEntry();
            this.previousAccess = com.google.common.cache.LocalCache.nullEntry();
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = com.google.common.cache.LocalCache.nullEntry();
            this.previousWrite = com.google.common.cache.LocalCache.nullEntry();
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long time) {
            this.accessTime = time;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> next) {
            this.nextAccess = next;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> previous) {
            this.previousAccess = previous;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long time) {
            this.writeTime = time;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> next) {
            this.nextWrite = next;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> previous) {
            this.previousWrite = previous;
        }
    }

    static class WeakValueReference<K, V> extends java.lang.ref.WeakReference<V> implements com.google.common.cache.LocalCache.ValueReference<K, V> {
        final com.google.common.cache.ReferenceEntry<K, V> entry;

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V newValue) {
        }

        WeakValueReference(java.lang.ref.ReferenceQueue<V> queue, V referent, com.google.common.cache.ReferenceEntry<K, V> entry) {
            super(referent, queue);
            this.entry = entry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<K, V> getEntry() {
            return this.entry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> queue, V value, com.google.common.cache.ReferenceEntry<K, V> entry) {
            return new com.google.common.cache.LocalCache.WeakValueReference(queue, value, entry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }
    }

    static class SoftValueReference<K, V> extends java.lang.ref.SoftReference<V> implements com.google.common.cache.LocalCache.ValueReference<K, V> {
        final com.google.common.cache.ReferenceEntry<K, V> entry;

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V newValue) {
        }

        SoftValueReference(java.lang.ref.ReferenceQueue<V> queue, V referent, com.google.common.cache.ReferenceEntry<K, V> entry) {
            super(referent, queue);
            this.entry = entry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<K, V> getEntry() {
            return this.entry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> queue, V value, com.google.common.cache.ReferenceEntry<K, V> entry) {
            return new com.google.common.cache.LocalCache.SoftValueReference(queue, value, entry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }
    }

    static class StrongValueReference<K, V> implements com.google.common.cache.LocalCache.ValueReference<K, V> {
        final V referent;

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> queue, V value, com.google.common.cache.ReferenceEntry<K, V> entry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<K, V> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V newValue) {
        }

        StrongValueReference(V referent) {
            this.referent = referent;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return this.referent;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }
    }

    static final class WeightedWeakValueReference<K, V> extends com.google.common.cache.LocalCache.WeakValueReference<K, V> {
        final int weight;

        WeightedWeakValueReference(java.lang.ref.ReferenceQueue<V> queue, V referent, com.google.common.cache.ReferenceEntry<K, V> entry, int weight) {
            super(queue, referent, entry);
            this.weight = weight;
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.weight;
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> queue, V value, com.google.common.cache.ReferenceEntry<K, V> entry) {
            return new com.google.common.cache.LocalCache.WeightedWeakValueReference(queue, value, entry, this.weight);
        }
    }

    static final class WeightedSoftValueReference<K, V> extends com.google.common.cache.LocalCache.SoftValueReference<K, V> {
        final int weight;

        WeightedSoftValueReference(java.lang.ref.ReferenceQueue<V> queue, V referent, com.google.common.cache.ReferenceEntry<K, V> entry, int weight) {
            super(queue, referent, entry);
            this.weight = weight;
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.weight;
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> queue, V value, com.google.common.cache.ReferenceEntry<K, V> entry) {
            return new com.google.common.cache.LocalCache.WeightedSoftValueReference(queue, value, entry, this.weight);
        }
    }

    static final class WeightedStrongValueReference<K, V> extends com.google.common.cache.LocalCache.StrongValueReference<K, V> {
        final int weight;

        WeightedStrongValueReference(V referent, int weight) {
            super(referent);
            this.weight = weight;
        }

        @Override // com.google.common.cache.LocalCache.StrongValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.weight;
        }
    }

    com.google.common.cache.ReferenceEntry<K, V> newEntry(K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
        com.google.common.cache.LocalCache.Segment<K, V> segmentSegmentFor = segmentFor(hash);
        segmentSegmentFor.lock();
        try {
            return segmentSegmentFor.newEntry(key, hash, next);
        } finally {
            segmentSegmentFor.unlock();
        }
    }

    com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newNext) {
        return segmentFor(original.getHash()).copyEntry(original, newNext);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    com.google.common.cache.LocalCache.ValueReference<K, V> newValueReference(com.google.common.cache.ReferenceEntry<K, V> entry, V value, int weight) {
        return this.valueStrength.referenceValue(segmentFor(entry.getHash()), entry, com.google.common.base.Preconditions.checkNotNull(value), weight);
    }

    int hash(@javax.annotation.CheckForNull java.lang.Object key) {
        return rehash(this.keyEquivalence.hash(key));
    }

    void reclaimValue(com.google.common.cache.LocalCache.ValueReference<K, V> valueReference) {
        com.google.common.cache.ReferenceEntry<K, V> entry = valueReference.getEntry();
        int hash = entry.getHash();
        segmentFor(hash).reclaimValue(entry.getKey(), hash, valueReference);
    }

    void reclaimKey(com.google.common.cache.ReferenceEntry<K, V> entry) {
        int hash = entry.getHash();
        segmentFor(hash).reclaimKey(entry, hash);
    }

    boolean isLive(com.google.common.cache.ReferenceEntry<K, V> entry, long now) {
        return segmentFor(entry.getHash()).getLiveValue(entry, now) != null;
    }

    com.google.common.cache.LocalCache.Segment<K, V> segmentFor(int hash) {
        return this.segments[(hash >>> this.segmentShift) & this.segmentMask];
    }

    com.google.common.cache.LocalCache.Segment<K, V> createSegment(int initialCapacity, long maxSegmentWeight, com.google.common.cache.AbstractCache.StatsCounter statsCounter) {
        return new com.google.common.cache.LocalCache.Segment<>(this, initialCapacity, maxSegmentWeight, statsCounter);
    }

    @javax.annotation.CheckForNull
    V getLiveValue(com.google.common.cache.ReferenceEntry<K, V> entry, long now) {
        V v;
        if (entry.getKey() == null || (v = entry.getValueReference().get()) == null || isExpired(entry, now)) {
            return null;
        }
        return v;
    }

    boolean isExpired(com.google.common.cache.ReferenceEntry<K, V> entry, long now) {
        com.google.common.base.Preconditions.checkNotNull(entry);
        if (!expiresAfterAccess() || now - entry.getAccessTime() < this.expireAfterAccessNanos) {
            return expiresAfterWrite() && now - entry.getWriteTime() >= this.expireAfterWriteNanos;
        }
        return true;
    }

    static <K, V> void connectAccessOrder(com.google.common.cache.ReferenceEntry<K, V> previous, com.google.common.cache.ReferenceEntry<K, V> next) {
        previous.setNextInAccessQueue(next);
        next.setPreviousInAccessQueue(previous);
    }

    static <K, V> void nullifyAccessOrder(com.google.common.cache.ReferenceEntry<K, V> nulled) {
        com.google.common.cache.ReferenceEntry<K, V> referenceEntryNullEntry = nullEntry();
        nulled.setNextInAccessQueue(referenceEntryNullEntry);
        nulled.setPreviousInAccessQueue(referenceEntryNullEntry);
    }

    static <K, V> void connectWriteOrder(com.google.common.cache.ReferenceEntry<K, V> previous, com.google.common.cache.ReferenceEntry<K, V> next) {
        previous.setNextInWriteQueue(next);
        next.setPreviousInWriteQueue(previous);
    }

    static <K, V> void nullifyWriteOrder(com.google.common.cache.ReferenceEntry<K, V> nulled) {
        com.google.common.cache.ReferenceEntry<K, V> referenceEntryNullEntry = nullEntry();
        nulled.setNextInWriteQueue(referenceEntryNullEntry);
        nulled.setPreviousInWriteQueue(referenceEntryNullEntry);
    }

    void processPendingNotifications() {
        while (true) {
            com.google.common.cache.RemovalNotification<K, V> removalNotificationPoll = this.removalNotificationQueue.poll();
            if (removalNotificationPoll == null) {
                return;
            }
            try {
                this.removalListener.onRemoval(removalNotificationPoll);
            } catch (java.lang.Throwable th) {
                logger.log(java.util.logging.Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }

    final com.google.common.cache.LocalCache.Segment<K, V>[] newSegmentArray(int ssize) {
        return new com.google.common.cache.LocalCache.Segment[ssize];
    }

    static class Segment<K, V> extends java.util.concurrent.locks.ReentrantLock {
        final java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> accessQueue;
        volatile int count;

        @javax.annotation.CheckForNull
        final java.lang.ref.ReferenceQueue<K> keyReferenceQueue;
        final com.google.common.cache.LocalCache<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final java.util.concurrent.atomic.AtomicInteger readCount = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> recencyQueue;
        final com.google.common.cache.AbstractCache.StatsCounter statsCounter;

        @javax.annotation.CheckForNull
        volatile java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> table;
        int threshold;
        long totalWeight;

        @javax.annotation.CheckForNull
        final java.lang.ref.ReferenceQueue<V> valueReferenceQueue;
        final java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> writeQueue;

        Segment(com.google.common.cache.LocalCache<K, V> map, int initialCapacity, long maxSegmentWeight, com.google.common.cache.AbstractCache.StatsCounter statsCounter) {
            this.map = map;
            this.maxSegmentWeight = maxSegmentWeight;
            this.statsCounter = (com.google.common.cache.AbstractCache.StatsCounter) com.google.common.base.Preconditions.checkNotNull(statsCounter);
            initTable(newEntryArray(initialCapacity));
            this.keyReferenceQueue = map.usesKeyReferences() ? new java.lang.ref.ReferenceQueue<>() : null;
            this.valueReferenceQueue = map.usesValueReferences() ? new java.lang.ref.ReferenceQueue<>() : null;
            this.recencyQueue = map.usesAccessQueue() ? new java.util.concurrent.ConcurrentLinkedQueue<>() : com.google.common.cache.LocalCache.discardingQueue();
            this.writeQueue = map.usesWriteQueue() ? new com.google.common.cache.LocalCache.WriteQueue<>() : com.google.common.cache.LocalCache.discardingQueue();
            this.accessQueue = map.usesAccessQueue() ? new com.google.common.cache.LocalCache.AccessQueue<>() : com.google.common.cache.LocalCache.discardingQueue();
        }

        java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> newEntryArray(int size) {
            return new java.util.concurrent.atomic.AtomicReferenceArray<>(size);
        }

        void initTable(java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> newTable) {
            this.threshold = (newTable.length() * 3) / 4;
            if (!this.map.customWeigher()) {
                int i = this.threshold;
                if (i == this.maxSegmentWeight) {
                    this.threshold = i + 1;
                }
            }
            this.table = newTable;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        com.google.common.cache.ReferenceEntry<K, V> newEntry(K key, int hash, @javax.annotation.CheckForNull com.google.common.cache.ReferenceEntry<K, V> next) {
            return this.map.entryFactory.newEntry(this, com.google.common.base.Preconditions.checkNotNull(key), hash, next);
        }

        @javax.annotation.CheckForNull
        com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.ReferenceEntry<K, V> original, com.google.common.cache.ReferenceEntry<K, V> newNext) {
            K key = original.getKey();
            if (key == null) {
                return null;
            }
            com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = original.getValueReference();
            V v = valueReference.get();
            if (v == null && valueReference.isActive()) {
                return null;
            }
            com.google.common.cache.ReferenceEntry<K, V> referenceEntryCopyEntry = this.map.entryFactory.copyEntry(this, original, newNext, key);
            referenceEntryCopyEntry.setValueReference(valueReference.copyFor(this.valueReferenceQueue, v, referenceEntryCopyEntry));
            return referenceEntryCopyEntry;
        }

        void setValue(com.google.common.cache.ReferenceEntry<K, V> entry, K key, V value, long now) {
            com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = entry.getValueReference();
            int iWeigh = this.map.weigher.weigh(key, value);
            com.google.common.base.Preconditions.checkState(iWeigh >= 0, "Weights must be non-negative");
            entry.setValueReference(this.map.valueStrength.referenceValue(this, entry, value, iWeigh));
            recordWrite(entry, iWeigh, now);
            valueReference.notifyNewValue(value);
        }

        V get(K key, int hash, com.google.common.cache.CacheLoader<? super K, V> loader) throws java.util.concurrent.ExecutionException {
            com.google.common.cache.ReferenceEntry<K, V> entry;
            com.google.common.base.Preconditions.checkNotNull(key);
            com.google.common.base.Preconditions.checkNotNull(loader);
            try {
                try {
                    if (this.count != 0 && (entry = getEntry(key, hash)) != null) {
                        long j = this.map.ticker.read();
                        V liveValue = getLiveValue(entry, j);
                        if (liveValue != null) {
                            recordRead(entry, j);
                            this.statsCounter.recordHits(1);
                            V vScheduleRefresh = scheduleRefresh(entry, key, hash, liveValue, j, loader);
                            postReadCleanup();
                            return vScheduleRefresh;
                        }
                        com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = entry.getValueReference();
                        if (valueReference.isLoading()) {
                            V vWaitForLoadingValue = waitForLoadingValue(entry, key, valueReference);
                            postReadCleanup();
                            return vWaitForLoadingValue;
                        }
                    }
                    V vLockedGetOrLoad = lockedGetOrLoad(key, hash, loader);
                    postReadCleanup();
                    return vLockedGetOrLoad;
                } catch (java.util.concurrent.ExecutionException e) {
                    java.lang.Throwable cause = e.getCause();
                    if (cause instanceof java.lang.Error) {
                        throw new com.google.common.util.concurrent.ExecutionError((java.lang.Error) cause);
                    }
                    if (cause instanceof java.lang.RuntimeException) {
                        throw new com.google.common.util.concurrent.UncheckedExecutionException(cause);
                    }
                    throw e;
                }
            } catch (java.lang.Throwable th) {
                postReadCleanup();
                throw th;
            }
        }

        @javax.annotation.CheckForNull
        V get(java.lang.Object key, int hash) {
            try {
                if (this.count != 0) {
                    long j = this.map.ticker.read();
                    com.google.common.cache.ReferenceEntry<K, V> liveEntry = getLiveEntry(key, hash, j);
                    if (liveEntry == null) {
                        return null;
                    }
                    V v = liveEntry.getValueReference().get();
                    if (v != null) {
                        recordRead(liveEntry, j);
                        return scheduleRefresh(liveEntry, liveEntry.getKey(), hash, v, j, this.map.defaultLoader);
                    }
                    tryDrainReferenceQueues();
                }
                return null;
            } finally {
                postReadCleanup();
            }
        }

        V lockedGetOrLoad(K key, int hash, com.google.common.cache.CacheLoader<? super K, V> loader) throws java.util.concurrent.ExecutionException {
            com.google.common.cache.LocalCache.LoadingValueReference<K, V> loadingValueReference;
            boolean z;
            com.google.common.cache.LocalCache.ValueReference<K, V> valueReference;
            lock();
            try {
                long j = this.map.ticker.read();
                preWriteCleanup(j);
                int i = this.count - 1;
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = hash & (atomicReferenceArray.length() - 1);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryNewEntry = referenceEntry;
                while (true) {
                    loadingValueReference = null;
                    if (referenceEntryNewEntry == null) {
                        z = true;
                        valueReference = null;
                        break;
                    }
                    K key2 = referenceEntryNewEntry.getKey();
                    if (referenceEntryNewEntry.getHash() != hash || key2 == null || !this.map.keyEquivalence.equivalent(key, key2)) {
                        referenceEntryNewEntry = referenceEntryNewEntry.getNext();
                    } else {
                        com.google.common.cache.LocalCache.ValueReference<K, V> valueReference2 = referenceEntryNewEntry.getValueReference();
                        if (valueReference2.isLoading()) {
                            z = false;
                        } else {
                            V v = valueReference2.get();
                            if (v == null) {
                                enqueueNotification(key2, hash, v, valueReference2.getWeight(), com.google.common.cache.RemovalCause.COLLECTED);
                            } else if (this.map.isExpired(referenceEntryNewEntry, j)) {
                                enqueueNotification(key2, hash, v, valueReference2.getWeight(), com.google.common.cache.RemovalCause.EXPIRED);
                            } else {
                                recordLockedRead(referenceEntryNewEntry, j);
                                this.statsCounter.recordHits(1);
                                unlock();
                                postWriteCleanup();
                                return v;
                            }
                            this.writeQueue.remove(referenceEntryNewEntry);
                            this.accessQueue.remove(referenceEntryNewEntry);
                            this.count = i;
                            z = true;
                        }
                        valueReference = valueReference2;
                        break;
                    }
                }
                if (z) {
                    loadingValueReference = new com.google.common.cache.LocalCache.LoadingValueReference<>();
                    if (referenceEntryNewEntry == null) {
                        referenceEntryNewEntry = newEntry(key, hash, referenceEntry);
                        referenceEntryNewEntry.setValueReference(loadingValueReference);
                        atomicReferenceArray.set(length, referenceEntryNewEntry);
                    } else {
                        referenceEntryNewEntry.setValueReference(loadingValueReference);
                    }
                }
                unlock();
                postWriteCleanup();
                if (z) {
                    try {
                        return loadSync(key, hash, loadingValueReference, loader);
                    } finally {
                        this.statsCounter.recordMisses(1);
                    }
                }
                return waitForLoadingValue(referenceEntryNewEntry, key, valueReference);
            } catch (java.lang.Throwable th) {
                unlock();
                postWriteCleanup();
                throw th;
            }
        }

        V waitForLoadingValue(com.google.common.cache.ReferenceEntry<K, V> e, K key, com.google.common.cache.LocalCache.ValueReference<K, V> valueReference) throws java.util.concurrent.ExecutionException {
            if (!valueReference.isLoading()) {
                throw new java.lang.AssertionError();
            }
            if (valueReference instanceof com.google.common.cache.LocalCache.LoadingValueReference) {
                com.google.common.base.Preconditions.checkState(((com.google.common.cache.LocalCache.LoadingValueReference) valueReference).getLoadingThread() != java.lang.Thread.currentThread(), "Recursive load of: %s", key);
            }
            try {
                V vWaitForValue = valueReference.waitForValue();
                if (vWaitForValue == null) {
                    throw new com.google.common.cache.CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + key + ".");
                }
                recordRead(e, this.map.ticker.read());
                this.statsCounter.recordMisses(1);
                return vWaitForValue;
            } catch (java.lang.Throwable th) {
                this.statsCounter.recordMisses(1);
                throw th;
            }
        }

        V loadSync(K key, int hash, com.google.common.cache.LocalCache.LoadingValueReference<K, V> loadingValueReference, com.google.common.cache.CacheLoader<? super K, V> loader) throws java.util.concurrent.ExecutionException {
            return getAndRecordStats(key, hash, loadingValueReference, loadingValueReference.loadFuture(key, loader));
        }

        com.google.common.util.concurrent.ListenableFuture<V> loadAsync(final K key, final int hash, final com.google.common.cache.LocalCache.LoadingValueReference<K, V> loadingValueReference, com.google.common.cache.CacheLoader<? super K, V> loader) {
            final com.google.common.util.concurrent.ListenableFuture<V> listenableFutureLoadFuture = loadingValueReference.loadFuture(key, loader);
            listenableFutureLoadFuture.addListener(new java.lang.Runnable() { // from class: com.google.common.cache.LocalCache$Segment$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m792lambda$loadAsync$0$comgooglecommoncacheLocalCache$Segment(key, hash, loadingValueReference, listenableFutureLoadFuture);
                }
            }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
            return listenableFutureLoadFuture;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: lambda$loadAsync$0$com-google-common-cache-LocalCache$Segment, reason: not valid java name */
        /* synthetic */ void m792lambda$loadAsync$0$comgooglecommoncacheLocalCache$Segment(java.lang.Object obj, int i, com.google.common.cache.LocalCache.LoadingValueReference loadingValueReference, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
            try {
                getAndRecordStats(obj, i, loadingValueReference, listenableFuture);
            } catch (java.lang.Throwable th) {
                com.google.common.cache.LocalCache.logger.log(java.util.logging.Level.WARNING, "Exception thrown during refresh", th);
                loadingValueReference.setException(th);
            }
        }

        V getAndRecordStats(K k, int i, com.google.common.cache.LocalCache.LoadingValueReference<K, V> loadingValueReference, com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) throws java.lang.Throwable {
            V v;
            try {
                v = (V) com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(listenableFuture);
                try {
                    if (v == null) {
                        throw new com.google.common.cache.CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + k + ".");
                    }
                    this.statsCounter.recordLoadSuccess(loadingValueReference.elapsedNanos());
                    storeLoadedValue(k, i, loadingValueReference, v);
                    if (v == null) {
                        this.statsCounter.recordLoadException(loadingValueReference.elapsedNanos());
                        removeLoadingValue(k, i, loadingValueReference);
                    }
                    return v;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (v == null) {
                        this.statsCounter.recordLoadException(loadingValueReference.elapsedNanos());
                        removeLoadingValue(k, i, loadingValueReference);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                v = null;
            }
        }

        V scheduleRefresh(com.google.common.cache.ReferenceEntry<K, V> entry, K key, int hash, V oldValue, long now, com.google.common.cache.CacheLoader<? super K, V> loader) {
            V vRefresh;
            return (!this.map.refreshes() || now - entry.getWriteTime() <= this.map.refreshNanos || entry.getValueReference().isLoading() || (vRefresh = refresh(key, hash, loader, true)) == null) ? oldValue : vRefresh;
        }

        @javax.annotation.CheckForNull
        V refresh(K k, int i, com.google.common.cache.CacheLoader<? super K, V> cacheLoader, boolean z) {
            com.google.common.cache.LocalCache.LoadingValueReference<K, V> loadingValueReferenceInsertLoadingValueReference = insertLoadingValueReference(k, i, z);
            if (loadingValueReferenceInsertLoadingValueReference == null) {
                return null;
            }
            com.google.common.util.concurrent.ListenableFuture<V> listenableFutureLoadAsync = loadAsync(k, i, loadingValueReferenceInsertLoadingValueReference, cacheLoader);
            if (listenableFutureLoadAsync.isDone()) {
                try {
                    return (V) com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(listenableFutureLoadAsync);
                } catch (java.lang.Throwable unused) {
                }
            }
            return null;
        }

        @javax.annotation.CheckForNull
        com.google.common.cache.LocalCache.LoadingValueReference<K, V> insertLoadingValueReference(K k, int i, boolean z) {
            lock();
            try {
                long j = this.map.ticker.read();
                preWriteCleanup(j);
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = (com.google.common.cache.ReferenceEntry) atomicReferenceArray.get(length);
                for (com.google.common.cache.ReferenceEntry next = referenceEntry; next != null; next = next.getNext()) {
                    java.lang.Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = next.getValueReference();
                        if (!valueReference.isLoading() && (!z || j - next.getWriteTime() >= this.map.refreshNanos)) {
                            this.modCount++;
                            com.google.common.cache.LocalCache.LoadingValueReference<K, V> loadingValueReference = new com.google.common.cache.LocalCache.LoadingValueReference<>(valueReference);
                            next.setValueReference(loadingValueReference);
                            return loadingValueReference;
                        }
                        return null;
                    }
                }
                this.modCount++;
                com.google.common.cache.LocalCache.LoadingValueReference<K, V> loadingValueReference2 = new com.google.common.cache.LocalCache.LoadingValueReference<>();
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryNewEntry = newEntry(k, i, referenceEntry);
                referenceEntryNewEntry.setValueReference(loadingValueReference2);
                atomicReferenceArray.set(length, referenceEntryNewEntry);
                return loadingValueReference2;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        void drainReferenceQueues() {
            if (this.map.usesKeyReferences()) {
                drainKeyReferenceQueue();
            }
            if (this.map.usesValueReferences()) {
                drainValueReferenceQueue();
            }
        }

        void drainKeyReferenceQueue() {
            int i = 0;
            do {
                java.lang.ref.Reference<? extends K> referencePoll = this.keyReferenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimKey((com.google.common.cache.ReferenceEntry) referencePoll);
                i++;
            } while (i != 16);
        }

        void drainValueReferenceQueue() {
            int i = 0;
            do {
                java.lang.ref.Reference<? extends V> referencePoll = this.valueReferenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimValue((com.google.common.cache.LocalCache.ValueReference) referencePoll);
                i++;
            } while (i != 16);
        }

        void clearReferenceQueues() {
            if (this.map.usesKeyReferences()) {
                clearKeyReferenceQueue();
            }
            if (this.map.usesValueReferences()) {
                clearValueReferenceQueue();
            }
        }

        void clearKeyReferenceQueue() {
            while (this.keyReferenceQueue.poll() != null) {
            }
        }

        void clearValueReferenceQueue() {
            while (this.valueReferenceQueue.poll() != null) {
            }
        }

        void recordRead(com.google.common.cache.ReferenceEntry<K, V> entry, long now) {
            if (this.map.recordsAccess()) {
                entry.setAccessTime(now);
            }
            this.recencyQueue.add(entry);
        }

        void recordLockedRead(com.google.common.cache.ReferenceEntry<K, V> entry, long now) {
            if (this.map.recordsAccess()) {
                entry.setAccessTime(now);
            }
            this.accessQueue.add(entry);
        }

        void recordWrite(com.google.common.cache.ReferenceEntry<K, V> entry, int weight, long now) {
            drainRecencyQueue();
            this.totalWeight += (long) weight;
            if (this.map.recordsAccess()) {
                entry.setAccessTime(now);
            }
            if (this.map.recordsWrite()) {
                entry.setWriteTime(now);
            }
            this.accessQueue.add(entry);
            this.writeQueue.add(entry);
        }

        void drainRecencyQueue() {
            while (true) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryPoll = this.recencyQueue.poll();
                if (referenceEntryPoll == null) {
                    return;
                }
                if (this.accessQueue.contains(referenceEntryPoll)) {
                    this.accessQueue.add(referenceEntryPoll);
                }
            }
        }

        void tryExpireEntries(long now) {
            if (tryLock()) {
                try {
                    expireEntries(now);
                } finally {
                    unlock();
                }
            }
        }

        void expireEntries(long now) {
            com.google.common.cache.ReferenceEntry<K, V> referenceEntryPeek;
            com.google.common.cache.ReferenceEntry<K, V> referenceEntryPeek2;
            drainRecencyQueue();
            do {
                referenceEntryPeek = this.writeQueue.peek();
                if (referenceEntryPeek == null || !this.map.isExpired(referenceEntryPeek, now)) {
                    do {
                        referenceEntryPeek2 = this.accessQueue.peek();
                        if (referenceEntryPeek2 == null || !this.map.isExpired(referenceEntryPeek2, now)) {
                            return;
                        }
                    } while (removeEntry(referenceEntryPeek2, referenceEntryPeek2.getHash(), com.google.common.cache.RemovalCause.EXPIRED));
                    throw new java.lang.AssertionError();
                }
            } while (removeEntry(referenceEntryPeek, referenceEntryPeek.getHash(), com.google.common.cache.RemovalCause.EXPIRED));
            throw new java.lang.AssertionError();
        }

        void enqueueNotification(@javax.annotation.CheckForNull K key, int hash, @javax.annotation.CheckForNull V value, int weight, com.google.common.cache.RemovalCause cause) {
            this.totalWeight -= (long) weight;
            if (cause.wasEvicted()) {
                this.statsCounter.recordEviction();
            }
            if (this.map.removalNotificationQueue != com.google.common.cache.LocalCache.DISCARDING_QUEUE) {
                this.map.removalNotificationQueue.offer(com.google.common.cache.RemovalNotification.create(key, value, cause));
            }
        }

        void evictEntries(com.google.common.cache.ReferenceEntry<K, V> newest) {
            if (this.map.evictsBySize()) {
                drainRecencyQueue();
                if (newest.getValueReference().getWeight() > this.maxSegmentWeight && !removeEntry(newest, newest.getHash(), com.google.common.cache.RemovalCause.SIZE)) {
                    throw new java.lang.AssertionError();
                }
                while (this.totalWeight > this.maxSegmentWeight) {
                    com.google.common.cache.ReferenceEntry<K, V> nextEvictable = getNextEvictable();
                    if (!removeEntry(nextEvictable, nextEvictable.getHash(), com.google.common.cache.RemovalCause.SIZE)) {
                        throw new java.lang.AssertionError();
                    }
                }
            }
        }

        com.google.common.cache.ReferenceEntry<K, V> getNextEvictable() {
            for (com.google.common.cache.ReferenceEntry<K, V> referenceEntry : this.accessQueue) {
                if (referenceEntry.getValueReference().getWeight() > 0) {
                    return referenceEntry;
                }
            }
            throw new java.lang.AssertionError();
        }

        com.google.common.cache.ReferenceEntry<K, V> getFirst(int hash) {
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            return atomicReferenceArray.get(hash & (atomicReferenceArray.length() - 1));
        }

        @javax.annotation.CheckForNull
        com.google.common.cache.ReferenceEntry<K, V> getEntry(java.lang.Object key, int hash) {
            for (com.google.common.cache.ReferenceEntry<K, V> first = getFirst(hash); first != null; first = first.getNext()) {
                if (first.getHash() == hash) {
                    K key2 = first.getKey();
                    if (key2 == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.keyEquivalence.equivalent(key, key2)) {
                        return first;
                    }
                }
            }
            return null;
        }

        @javax.annotation.CheckForNull
        com.google.common.cache.ReferenceEntry<K, V> getLiveEntry(java.lang.Object key, int hash, long now) {
            com.google.common.cache.ReferenceEntry<K, V> entry = getEntry(key, hash);
            if (entry == null) {
                return null;
            }
            if (!this.map.isExpired(entry, now)) {
                return entry;
            }
            tryExpireEntries(now);
            return null;
        }

        V getLiveValue(com.google.common.cache.ReferenceEntry<K, V> entry, long now) {
            if (entry.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v = entry.getValueReference().get();
            if (v == null) {
                tryDrainReferenceQueues();
                return null;
            }
            if (!this.map.isExpired(entry, now)) {
                return v;
            }
            tryExpireEntries(now);
            return null;
        }

        boolean containsKey(java.lang.Object key, int hash) {
            try {
                if (this.count == 0) {
                    return false;
                }
                com.google.common.cache.ReferenceEntry<K, V> liveEntry = getLiveEntry(key, hash, this.map.ticker.read());
                if (liveEntry == null) {
                    return false;
                }
                return liveEntry.getValueReference().get() != null;
            } finally {
                postReadCleanup();
            }
        }

        boolean containsValue(java.lang.Object value) {
            try {
                if (this.count != 0) {
                    long j = this.map.ticker.read();
                    java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (com.google.common.cache.ReferenceEntry<K, V> next = atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            V liveValue = getLiveValue(next, j);
                            if (liveValue != null && this.map.valueEquivalence.equivalent(value, liveValue)) {
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
        V put(K key, int hash, V value, boolean onlyIfAbsent) {
            int i;
            lock();
            try {
                long j = this.map.ticker.read();
                preWriteCleanup(j);
                if (this.count + 1 > this.threshold) {
                    expand();
                }
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = hash & (atomicReferenceArray.length() - 1);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (com.google.common.cache.ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key2 = next.getKey();
                    if (next.getHash() == hash && key2 != null && this.map.keyEquivalence.equivalent(key, key2)) {
                        com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = next.getValueReference();
                        V v = valueReference.get();
                        if (v != null) {
                            if (onlyIfAbsent) {
                                recordLockedRead(next, j);
                            } else {
                                this.modCount++;
                                enqueueNotification(key, hash, v, valueReference.getWeight(), com.google.common.cache.RemovalCause.REPLACED);
                                setValue(next, key, value, j);
                                evictEntries(next);
                            }
                            return v;
                        }
                        this.modCount++;
                        if (valueReference.isActive()) {
                            enqueueNotification(key, hash, v, valueReference.getWeight(), com.google.common.cache.RemovalCause.COLLECTED);
                            setValue(next, key, value, j);
                            i = this.count;
                        } else {
                            setValue(next, key, value, j);
                            i = this.count + 1;
                        }
                        this.count = i;
                        evictEntries(next);
                        return null;
                    }
                }
                this.modCount++;
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryNewEntry = newEntry(key, hash, referenceEntry);
                setValue(referenceEntryNewEntry, key, value, j);
                atomicReferenceArray.set(length, referenceEntryNewEntry);
                this.count++;
                evictEntries(referenceEntryNewEntry);
                return null;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        void expand() {
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.count;
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArrayNewEntryArray = newEntryArray(length << 1);
            this.threshold = (atomicReferenceArrayNewEntryArray.length() * 3) / 4;
            int length2 = atomicReferenceArrayNewEntryArray.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                com.google.common.cache.ReferenceEntry<K, V> next = atomicReferenceArray.get(i2);
                if (next != null) {
                    com.google.common.cache.ReferenceEntry<K, V> next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayNewEntryArray.set(hash, next);
                    } else {
                        com.google.common.cache.ReferenceEntry<K, V> referenceEntry = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                referenceEntry = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayNewEntryArray.set(hash, referenceEntry);
                        while (next != referenceEntry) {
                            int hash3 = next.getHash() & length2;
                            com.google.common.cache.ReferenceEntry<K, V> referenceEntryCopyEntry = copyEntry(next, atomicReferenceArrayNewEntryArray.get(hash3));
                            if (referenceEntryCopyEntry != null) {
                                atomicReferenceArrayNewEntryArray.set(hash3, referenceEntryCopyEntry);
                            } else {
                                removeCollectedEntry(next);
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

        boolean replace(K key, int hash, V oldValue, V newValue) {
            lock();
            try {
                long j = this.map.ticker.read();
                preWriteCleanup(j);
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = hash & (atomicReferenceArray.length() - 1);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (com.google.common.cache.ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key2 = next.getKey();
                    if (next.getHash() == hash && key2 != null) {
                        if (this.map.keyEquivalence.equivalent(key, key2)) {
                            com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = next.getValueReference();
                            V v = valueReference.get();
                            if (v == null) {
                                if (!valueReference.isActive()) {
                                    break;
                                }
                                this.modCount++;
                                com.google.common.cache.ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, next, key2, hash, v, valueReference, com.google.common.cache.RemovalCause.COLLECTED);
                                int i = this.count - 1;
                                atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                                this.count = i;
                                break;
                            }
                            if (this.map.valueEquivalence.equivalent(oldValue, v)) {
                                this.modCount++;
                                enqueueNotification(key, hash, v, valueReference.getWeight(), com.google.common.cache.RemovalCause.REPLACED);
                                setValue(next, key, newValue, j);
                                evictEntries(next);
                                return true;
                            }
                            recordLockedRead(next, j);
                            break;
                        }
                    }
                }
                return false;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        @javax.annotation.CheckForNull
        V replace(K key, int hash, V newValue) {
            lock();
            try {
                long j = this.map.ticker.read();
                preWriteCleanup(j);
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = hash & (atomicReferenceArray.length() - 1);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (com.google.common.cache.ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key2 = next.getKey();
                    if (next.getHash() == hash && key2 != null) {
                        if (this.map.keyEquivalence.equivalent(key, key2)) {
                            com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = next.getValueReference();
                            V v = valueReference.get();
                            if (v == null) {
                                if (!valueReference.isActive()) {
                                    break;
                                }
                                this.modCount++;
                                com.google.common.cache.ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, next, key2, hash, v, valueReference, com.google.common.cache.RemovalCause.COLLECTED);
                                int i = this.count - 1;
                                atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                                this.count = i;
                                break;
                            }
                            this.modCount++;
                            enqueueNotification(key, hash, v, valueReference.getWeight(), com.google.common.cache.RemovalCause.REPLACED);
                            setValue(next, key, newValue, j);
                            evictEntries(next);
                            return v;
                        }
                    }
                }
                return null;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        @javax.annotation.CheckForNull
        V remove(java.lang.Object key, int hash) {
            com.google.common.cache.RemovalCause removalCause;
            lock();
            try {
                preWriteCleanup(this.map.ticker.read());
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & hash;
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (com.google.common.cache.ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key2 = next.getKey();
                    if (next.getHash() == hash && key2 != null && this.map.keyEquivalence.equivalent(key, key2)) {
                        com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = next.getValueReference();
                        V v = valueReference.get();
                        if (v != null) {
                            removalCause = com.google.common.cache.RemovalCause.EXPLICIT;
                        } else {
                            if (!valueReference.isActive()) {
                                break;
                            }
                            removalCause = com.google.common.cache.RemovalCause.COLLECTED;
                        }
                        com.google.common.cache.RemovalCause removalCause2 = removalCause;
                        this.modCount++;
                        com.google.common.cache.ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, next, key2, hash, v, valueReference, removalCause2);
                        int i = this.count - 1;
                        atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                        this.count = i;
                        return v;
                    }
                }
                return null;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        boolean remove(java.lang.Object key, int hash, java.lang.Object value) {
            com.google.common.cache.RemovalCause removalCause;
            lock();
            try {
                preWriteCleanup(this.map.ticker.read());
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & hash;
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (com.google.common.cache.ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key2 = next.getKey();
                    if (next.getHash() == hash && key2 != null && this.map.keyEquivalence.equivalent(key, key2)) {
                        com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = next.getValueReference();
                        V v = valueReference.get();
                        if (this.map.valueEquivalence.equivalent(value, v)) {
                            removalCause = com.google.common.cache.RemovalCause.EXPLICIT;
                        } else {
                            if (v != null || !valueReference.isActive()) {
                                break;
                                break;
                            }
                            removalCause = com.google.common.cache.RemovalCause.COLLECTED;
                        }
                        this.modCount++;
                        com.google.common.cache.ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, next, key2, hash, v, valueReference, removalCause);
                        int i = this.count - 1;
                        atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                        this.count = i;
                        return removalCause == com.google.common.cache.RemovalCause.EXPLICIT;
                    }
                }
                return false;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        boolean storeLoadedValue(K key, int hash, com.google.common.cache.LocalCache.LoadingValueReference<K, V> oldValueReference, V newValue) {
            lock();
            try {
                long j = this.map.ticker.read();
                preWriteCleanup(j);
                int i = this.count + 1;
                if (i > this.threshold) {
                    expand();
                    i = this.count + 1;
                }
                int i2 = i;
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = hash & (atomicReferenceArray.length() - 1);
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (com.google.common.cache.ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key2 = next.getKey();
                    if (next.getHash() == hash && key2 != null && this.map.keyEquivalence.equivalent(key, key2)) {
                        com.google.common.cache.LocalCache.ValueReference<K, V> valueReference = next.getValueReference();
                        V v = valueReference.get();
                        if (oldValueReference != valueReference && (v != null || valueReference == com.google.common.cache.LocalCache.UNSET)) {
                            enqueueNotification(key, hash, newValue, 0, com.google.common.cache.RemovalCause.REPLACED);
                            return false;
                        }
                        this.modCount++;
                        if (oldValueReference.isActive()) {
                            enqueueNotification(key, hash, v, oldValueReference.getWeight(), v == null ? com.google.common.cache.RemovalCause.COLLECTED : com.google.common.cache.RemovalCause.REPLACED);
                            i2--;
                        }
                        setValue(next, key, newValue, j);
                        this.count = i2;
                        evictEntries(next);
                        return true;
                    }
                }
                this.modCount++;
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryNewEntry = newEntry(key, hash, referenceEntry);
                setValue(referenceEntryNewEntry, key, newValue, j);
                atomicReferenceArray.set(length, referenceEntryNewEntry);
                this.count = i2;
                evictEntries(referenceEntryNewEntry);
                return true;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        void clear() {
            if (this.count != 0) {
                lock();
                try {
                    preWriteCleanup(this.map.ticker.read());
                    java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (com.google.common.cache.ReferenceEntry<K, V> next = atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            if (next.getValueReference().isActive()) {
                                K key = next.getKey();
                                V v = next.getValueReference().get();
                                enqueueNotification(key, next.getHash(), v, next.getValueReference().getWeight(), (key == null || v == null) ? com.google.common.cache.RemovalCause.COLLECTED : com.google.common.cache.RemovalCause.EXPLICIT);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    clearReferenceQueues();
                    this.writeQueue.clear();
                    this.accessQueue.clear();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                    postWriteCleanup();
                }
            }
        }

        @javax.annotation.CheckForNull
        com.google.common.cache.ReferenceEntry<K, V> removeValueFromChain(com.google.common.cache.ReferenceEntry<K, V> first, com.google.common.cache.ReferenceEntry<K, V> entry, @javax.annotation.CheckForNull K key, int hash, V value, com.google.common.cache.LocalCache.ValueReference<K, V> valueReference, com.google.common.cache.RemovalCause cause) {
            enqueueNotification(key, hash, value, valueReference.getWeight(), cause);
            this.writeQueue.remove(entry);
            this.accessQueue.remove(entry);
            if (valueReference.isLoading()) {
                valueReference.notifyNewValue(null);
                return first;
            }
            return removeEntryFromChain(first, entry);
        }

        @javax.annotation.CheckForNull
        com.google.common.cache.ReferenceEntry<K, V> removeEntryFromChain(com.google.common.cache.ReferenceEntry<K, V> first, com.google.common.cache.ReferenceEntry<K, V> entry) {
            int i = this.count;
            com.google.common.cache.ReferenceEntry<K, V> next = entry.getNext();
            while (first != entry) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntryCopyEntry = copyEntry(first, next);
                if (referenceEntryCopyEntry != null) {
                    next = referenceEntryCopyEntry;
                } else {
                    removeCollectedEntry(first);
                    i--;
                }
                first = first.getNext();
            }
            this.count = i;
            return next;
        }

        void removeCollectedEntry(com.google.common.cache.ReferenceEntry<K, V> entry) {
            enqueueNotification(entry.getKey(), entry.getHash(), entry.getValueReference().get(), entry.getValueReference().getWeight(), com.google.common.cache.RemovalCause.COLLECTED);
            this.writeQueue.remove(entry);
            this.accessQueue.remove(entry);
        }

        boolean reclaimKey(com.google.common.cache.ReferenceEntry<K, V> entry, int hash) {
            lock();
            try {
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & hash;
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (com.google.common.cache.ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    if (next == entry) {
                        this.modCount++;
                        com.google.common.cache.ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, next, next.getKey(), hash, next.getValueReference().get(), next.getValueReference(), com.google.common.cache.RemovalCause.COLLECTED);
                        int i = this.count - 1;
                        atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                        this.count = i;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        boolean reclaimValue(K key, int hash, com.google.common.cache.LocalCache.ValueReference<K, V> valueReference) {
            lock();
            try {
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & hash;
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (com.google.common.cache.ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key2 = next.getKey();
                    if (next.getHash() == hash && key2 != null && this.map.keyEquivalence.equivalent(key, key2)) {
                        if (next.getValueReference() != valueReference) {
                            return false;
                        }
                        this.modCount++;
                        com.google.common.cache.ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, next, key2, hash, valueReference.get(), valueReference, com.google.common.cache.RemovalCause.COLLECTED);
                        int i = this.count - 1;
                        atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                        this.count = i;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    postWriteCleanup();
                }
            }
        }

        boolean removeLoadingValue(K key, int hash, com.google.common.cache.LocalCache.LoadingValueReference<K, V> valueReference) {
            lock();
            try {
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & hash;
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (com.google.common.cache.ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key2 = next.getKey();
                    if (next.getHash() == hash && key2 != null && this.map.keyEquivalence.equivalent(key, key2)) {
                        if (next.getValueReference() != valueReference) {
                            break;
                        }
                        if (valueReference.isActive()) {
                            next.setValueReference(valueReference.getOldValue());
                        } else {
                            atomicReferenceArray.set(length, removeEntryFromChain(referenceEntry, next));
                        }
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        boolean removeEntry(com.google.common.cache.ReferenceEntry<K, V> entry, int hash, com.google.common.cache.RemovalCause cause) {
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & hash;
            com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
            for (com.google.common.cache.ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                if (next == entry) {
                    this.modCount++;
                    com.google.common.cache.ReferenceEntry<K, V> referenceEntryRemoveValueFromChain = removeValueFromChain(referenceEntry, next, next.getKey(), hash, next.getValueReference().get(), next.getValueReference(), cause);
                    int i = this.count - 1;
                    atomicReferenceArray.set(length, referenceEntryRemoveValueFromChain);
                    this.count = i;
                    return true;
                }
            }
            return false;
        }

        void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                cleanUp();
            }
        }

        void preWriteCleanup(long now) {
            runLockedCleanup(now);
        }

        void postWriteCleanup() {
            runUnlockedCleanup();
        }

        void cleanUp() {
            runLockedCleanup(this.map.ticker.read());
            runUnlockedCleanup();
        }

        void runLockedCleanup(long now) {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                    expireEntries(now);
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        void runUnlockedCleanup() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.map.processPendingNotifications();
        }
    }

    static class LoadingValueReference<K, V> implements com.google.common.cache.LocalCache.ValueReference<K, V> {
        final com.google.common.util.concurrent.SettableFuture<V> futureValue;
        final java.lang.Thread loadingThread;
        volatile com.google.common.cache.LocalCache.ValueReference<K, V> oldValue;
        final com.google.common.base.Stopwatch stopwatch;

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> queue, @javax.annotation.CheckForNull V value, com.google.common.cache.ReferenceEntry<K, V> entry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<K, V> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return true;
        }

        public LoadingValueReference() {
            this(com.google.common.cache.LocalCache.unset());
        }

        public LoadingValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> oldValue) {
            this.futureValue = com.google.common.util.concurrent.SettableFuture.create();
            this.stopwatch = com.google.common.base.Stopwatch.createUnstarted();
            this.oldValue = oldValue;
            this.loadingThread = java.lang.Thread.currentThread();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return this.oldValue.isActive();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.oldValue.getWeight();
        }

        public boolean set(@javax.annotation.CheckForNull V newValue) {
            return this.futureValue.set(newValue);
        }

        public boolean setException(java.lang.Throwable t) {
            return this.futureValue.setException(t);
        }

        private com.google.common.util.concurrent.ListenableFuture<V> fullyFailedFuture(java.lang.Throwable t) {
            return com.google.common.util.concurrent.Futures.immediateFailedFuture(t);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(@javax.annotation.CheckForNull V newValue) {
            if (newValue != null) {
                set(newValue);
            } else {
                this.oldValue = com.google.common.cache.LocalCache.unset();
            }
        }

        public com.google.common.util.concurrent.ListenableFuture<V> loadFuture(K key, com.google.common.cache.CacheLoader<? super K, V> loader) {
            try {
                this.stopwatch.start();
                V v = this.oldValue.get();
                if (v == null) {
                    V vLoad = loader.load(key);
                    return set(vLoad) ? this.futureValue : com.google.common.util.concurrent.Futures.immediateFuture(vLoad);
                }
                com.google.common.util.concurrent.ListenableFuture<V> listenableFutureReload = loader.reload(key, v);
                if (listenableFutureReload == null) {
                    return com.google.common.util.concurrent.Futures.immediateFuture(null);
                }
                return com.google.common.util.concurrent.Futures.transform(listenableFutureReload, new com.google.common.base.Function() { // from class: com.google.common.cache.LocalCache$LoadingValueReference$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return this.f$0.m791x59597480(obj);
                    }
                }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
            } catch (java.lang.Throwable th) {
                com.google.common.util.concurrent.ListenableFuture<V> listenableFutureFullyFailedFuture = setException(th) ? this.futureValue : fullyFailedFuture(th);
                if (th instanceof java.lang.InterruptedException) {
                    java.lang.Thread.currentThread().interrupt();
                }
                return listenableFutureFullyFailedFuture;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: lambda$loadFuture$0$com-google-common-cache-LocalCache$LoadingValueReference, reason: not valid java name */
        /* synthetic */ java.lang.Object m791x59597480(java.lang.Object obj) {
            set(obj);
            return obj;
        }

        public long elapsedNanos() {
            return this.stopwatch.elapsed(java.util.concurrent.TimeUnit.NANOSECONDS);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() throws java.util.concurrent.ExecutionException {
            return (V) com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(this.futureValue);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return this.oldValue.get();
        }

        public com.google.common.cache.LocalCache.ValueReference<K, V> getOldValue() {
            return this.oldValue;
        }

        java.lang.Thread getLoadingThread() {
            return this.loadingThread;
        }
    }

    static final class WriteQueue<K, V> extends java.util.AbstractQueue<com.google.common.cache.ReferenceEntry<K, V>> {
        final com.google.common.cache.ReferenceEntry<K, V> head = new com.google.common.cache.LocalCache.AbstractReferenceEntry<K, V>(this) { // from class: com.google.common.cache.LocalCache.WriteQueue.1
            com.google.common.cache.ReferenceEntry<K, V> nextWrite = this;
            com.google.common.cache.ReferenceEntry<K, V> previousWrite = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setWriteTime(long time) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
                return this.nextWrite;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> next) {
                this.nextWrite = next;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
                return this.previousWrite;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> previous) {
                this.previousWrite = previous;
            }
        };

        WriteQueue() {
        }

        @Override // java.util.Queue
        public boolean offer(com.google.common.cache.ReferenceEntry<K, V> entry) {
            com.google.common.cache.LocalCache.connectWriteOrder(entry.getPreviousInWriteQueue(), entry.getNextInWriteQueue());
            com.google.common.cache.LocalCache.connectWriteOrder(this.head.getPreviousInWriteQueue(), entry);
            com.google.common.cache.LocalCache.connectWriteOrder(entry, this.head);
            return true;
        }

        @Override // java.util.Queue
        @javax.annotation.CheckForNull
        public com.google.common.cache.ReferenceEntry<K, V> peek() {
            com.google.common.cache.ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue();
            if (nextInWriteQueue == this.head) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.Queue
        @javax.annotation.CheckForNull
        public com.google.common.cache.ReferenceEntry<K, V> poll() {
            com.google.common.cache.ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue();
            if (nextInWriteQueue == this.head) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object o) {
            com.google.common.cache.ReferenceEntry referenceEntry = (com.google.common.cache.ReferenceEntry) o;
            com.google.common.cache.ReferenceEntry<K, V> previousInWriteQueue = referenceEntry.getPreviousInWriteQueue();
            com.google.common.cache.ReferenceEntry<K, V> nextInWriteQueue = referenceEntry.getNextInWriteQueue();
            com.google.common.cache.LocalCache.connectWriteOrder(previousInWriteQueue, nextInWriteQueue);
            com.google.common.cache.LocalCache.nullifyWriteOrder(referenceEntry);
            return nextInWriteQueue != com.google.common.cache.LocalCache.NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object o) {
            return ((com.google.common.cache.ReferenceEntry) o).getNextInWriteQueue() != com.google.common.cache.LocalCache.NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.head.getNextInWriteQueue() == this.head;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (com.google.common.cache.ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue(); nextInWriteQueue != this.head; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i++;
            }
            return i;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue();
            while (true) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = this.head;
                if (nextInWriteQueue != referenceEntry) {
                    com.google.common.cache.ReferenceEntry<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    com.google.common.cache.LocalCache.nullifyWriteOrder(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                } else {
                    referenceEntry.setNextInWriteQueue(referenceEntry);
                    com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = this.head;
                    referenceEntry2.setPreviousInWriteQueue(referenceEntry2);
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<com.google.common.cache.ReferenceEntry<K, V>> iterator() {
            return new com.google.common.collect.AbstractSequentialIterator<com.google.common.cache.ReferenceEntry<K, V>>(peek()) { // from class: com.google.common.cache.LocalCache.WriteQueue.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractSequentialIterator
                @javax.annotation.CheckForNull
                public com.google.common.cache.ReferenceEntry<K, V> computeNext(com.google.common.cache.ReferenceEntry<K, V> previous) {
                    com.google.common.cache.ReferenceEntry<K, V> nextInWriteQueue = previous.getNextInWriteQueue();
                    if (nextInWriteQueue == com.google.common.cache.LocalCache.WriteQueue.this.head) {
                        return null;
                    }
                    return nextInWriteQueue;
                }
            };
        }
    }

    static final class AccessQueue<K, V> extends java.util.AbstractQueue<com.google.common.cache.ReferenceEntry<K, V>> {
        final com.google.common.cache.ReferenceEntry<K, V> head = new com.google.common.cache.LocalCache.AbstractReferenceEntry<K, V>(this) { // from class: com.google.common.cache.LocalCache.AccessQueue.1
            com.google.common.cache.ReferenceEntry<K, V> nextAccess = this;
            com.google.common.cache.ReferenceEntry<K, V> previousAccess = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setAccessTime(long time) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
                return this.nextAccess;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> next) {
                this.nextAccess = next;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
                return this.previousAccess;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> previous) {
                this.previousAccess = previous;
            }
        };

        AccessQueue() {
        }

        @Override // java.util.Queue
        public boolean offer(com.google.common.cache.ReferenceEntry<K, V> entry) {
            com.google.common.cache.LocalCache.connectAccessOrder(entry.getPreviousInAccessQueue(), entry.getNextInAccessQueue());
            com.google.common.cache.LocalCache.connectAccessOrder(this.head.getPreviousInAccessQueue(), entry);
            com.google.common.cache.LocalCache.connectAccessOrder(entry, this.head);
            return true;
        }

        @Override // java.util.Queue
        @javax.annotation.CheckForNull
        public com.google.common.cache.ReferenceEntry<K, V> peek() {
            com.google.common.cache.ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue();
            if (nextInAccessQueue == this.head) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.Queue
        @javax.annotation.CheckForNull
        public com.google.common.cache.ReferenceEntry<K, V> poll() {
            com.google.common.cache.ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue();
            if (nextInAccessQueue == this.head) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object o) {
            com.google.common.cache.ReferenceEntry referenceEntry = (com.google.common.cache.ReferenceEntry) o;
            com.google.common.cache.ReferenceEntry<K, V> previousInAccessQueue = referenceEntry.getPreviousInAccessQueue();
            com.google.common.cache.ReferenceEntry<K, V> nextInAccessQueue = referenceEntry.getNextInAccessQueue();
            com.google.common.cache.LocalCache.connectAccessOrder(previousInAccessQueue, nextInAccessQueue);
            com.google.common.cache.LocalCache.nullifyAccessOrder(referenceEntry);
            return nextInAccessQueue != com.google.common.cache.LocalCache.NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object o) {
            return ((com.google.common.cache.ReferenceEntry) o).getNextInAccessQueue() != com.google.common.cache.LocalCache.NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.head.getNextInAccessQueue() == this.head;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (com.google.common.cache.ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue(); nextInAccessQueue != this.head; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i++;
            }
            return i;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue();
            while (true) {
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = this.head;
                if (nextInAccessQueue != referenceEntry) {
                    com.google.common.cache.ReferenceEntry<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    com.google.common.cache.LocalCache.nullifyAccessOrder(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                } else {
                    referenceEntry.setNextInAccessQueue(referenceEntry);
                    com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = this.head;
                    referenceEntry2.setPreviousInAccessQueue(referenceEntry2);
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<com.google.common.cache.ReferenceEntry<K, V>> iterator() {
            return new com.google.common.collect.AbstractSequentialIterator<com.google.common.cache.ReferenceEntry<K, V>>(peek()) { // from class: com.google.common.cache.LocalCache.AccessQueue.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractSequentialIterator
                @javax.annotation.CheckForNull
                public com.google.common.cache.ReferenceEntry<K, V> computeNext(com.google.common.cache.ReferenceEntry<K, V> previous) {
                    com.google.common.cache.ReferenceEntry<K, V> nextInAccessQueue = previous.getNextInAccessQueue();
                    if (nextInAccessQueue == com.google.common.cache.LocalCache.AccessQueue.this.head) {
                        return null;
                    }
                    return nextInAccessQueue;
                }
            };
        }
    }

    public void cleanUp() {
        for (com.google.common.cache.LocalCache.Segment<K, V> segment : this.segments) {
            segment.cleanUp();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        com.google.common.cache.LocalCache.Segment<K, V>[] segmentArr = this.segments;
        long j = 0;
        for (com.google.common.cache.LocalCache.Segment<K, V> segment : segmentArr) {
            if (segment.count != 0) {
                return false;
            }
            j += (long) segment.modCount;
        }
        if (j == 0) {
            return true;
        }
        for (com.google.common.cache.LocalCache.Segment<K, V> segment2 : segmentArr) {
            if (segment2.count != 0) {
                return false;
            }
            j -= (long) segment2.modCount;
        }
        return j == 0;
    }

    long longSize() {
        long jMax = 0;
        for (com.google.common.cache.LocalCache.Segment<K, V> segment : this.segments) {
            jMax += (long) java.lang.Math.max(0, segment.count);
        }
        return jMax;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return com.google.common.primitives.Ints.saturatedCast(longSize());
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

    V get(K key, com.google.common.cache.CacheLoader<? super K, V> loader) throws java.util.concurrent.ExecutionException {
        int iHash = hash(com.google.common.base.Preconditions.checkNotNull(key));
        return segmentFor(iHash).get(key, iHash, loader);
    }

    @javax.annotation.CheckForNull
    public V getIfPresent(java.lang.Object key) {
        int iHash = hash(com.google.common.base.Preconditions.checkNotNull(key));
        V v = segmentFor(iHash).get(key, iHash);
        if (v == null) {
            this.globalStatsCounter.recordMisses(1);
        } else {
            this.globalStatsCounter.recordHits(1);
        }
        return v;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @javax.annotation.CheckForNull
    public V getOrDefault(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull V defaultValue) {
        V v = get(key);
        return v != null ? v : defaultValue;
    }

    V getOrLoad(K key) throws java.util.concurrent.ExecutionException {
        return get(key, this.defaultLoader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<?> keys) {
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        int i = 0;
        int i2 = 0;
        for (java.lang.Object obj : keys) {
            V v = get(obj);
            if (v == null) {
                i2++;
            } else {
                builder.put(obj, v);
                i++;
            }
        }
        this.globalStatsCounter.recordHits(i);
        this.globalStatsCounter.recordMisses(i2);
        return builder.buildKeepingLast();
    }

    /* JADX WARN: Multi-variable type inference failed */
    com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> keys) throws java.util.concurrent.ExecutionException {
        java.util.LinkedHashMap linkedHashMapNewLinkedHashMap = com.google.common.collect.Maps.newLinkedHashMap();
        java.util.LinkedHashSet linkedHashSetNewLinkedHashSet = com.google.common.collect.Sets.newLinkedHashSet();
        int i = 0;
        int i2 = 0;
        for (K k : keys) {
            java.lang.Object obj = get(k);
            if (!linkedHashMapNewLinkedHashMap.containsKey(k)) {
                linkedHashMapNewLinkedHashMap.put(k, obj);
                if (obj == null) {
                    i2++;
                    linkedHashSetNewLinkedHashSet.add(k);
                } else {
                    i++;
                }
            }
        }
        try {
            if (!linkedHashSetNewLinkedHashSet.isEmpty()) {
                try {
                    java.util.Map mapLoadAll = loadAll(java.util.Collections.unmodifiableSet(linkedHashSetNewLinkedHashSet), this.defaultLoader);
                    for (java.lang.Object obj2 : linkedHashSetNewLinkedHashSet) {
                        java.lang.Object obj3 = mapLoadAll.get(obj2);
                        if (obj3 == null) {
                            throw new com.google.common.cache.CacheLoader.InvalidCacheLoadException("loadAll failed to return a value for " + obj2);
                        }
                        linkedHashMapNewLinkedHashMap.put(obj2, obj3);
                    }
                } catch (com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException unused) {
                    for (java.lang.Object obj4 : linkedHashSetNewLinkedHashSet) {
                        i2--;
                        linkedHashMapNewLinkedHashMap.put(obj4, get(obj4, this.defaultLoader));
                    }
                }
            }
            com.google.common.collect.ImmutableMap<K, V> immutableMapCopyOf = com.google.common.collect.ImmutableMap.copyOf((java.util.Map) linkedHashMapNewLinkedHashMap);
            this.globalStatsCounter.recordHits(i);
            this.globalStatsCounter.recordMisses(i2);
            return immutableMapCopyOf;
        } catch (java.lang.Throwable th) {
            this.globalStatsCounter.recordHits(i);
            this.globalStatsCounter.recordMisses(i2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    @javax.annotation.CheckForNull
    java.util.Map<K, V> loadAll(java.util.Set<? extends K> set, com.google.common.cache.CacheLoader<? super K, V> cacheLoader) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(cacheLoader);
        com.google.common.base.Preconditions.checkNotNull(set);
        com.google.common.base.Stopwatch stopwatchCreateStarted = com.google.common.base.Stopwatch.createStarted();
        boolean z = true;
        boolean z2 = false;
        try {
            try {
                try {
                    try {
                        try {
                            java.util.Map<? super K, V> mapLoadAll = cacheLoader.loadAll(set);
                            if (mapLoadAll == null) {
                                this.globalStatsCounter.recordLoadException(stopwatchCreateStarted.elapsed(java.util.concurrent.TimeUnit.NANOSECONDS));
                                throw new com.google.common.cache.CacheLoader.InvalidCacheLoadException(cacheLoader + " returned null map from loadAll");
                            }
                            stopwatchCreateStarted.stop();
                            for (java.util.Map.Entry<K, V> entry : mapLoadAll.entrySet()) {
                                K key = entry.getKey();
                                V value = entry.getValue();
                                if (key == null || value == null) {
                                    z2 = true;
                                } else {
                                    put(key, value);
                                }
                            }
                            if (z2) {
                                this.globalStatsCounter.recordLoadException(stopwatchCreateStarted.elapsed(java.util.concurrent.TimeUnit.NANOSECONDS));
                                throw new com.google.common.cache.CacheLoader.InvalidCacheLoadException(cacheLoader + " returned null keys or values from loadAll");
                            }
                            this.globalStatsCounter.recordLoadSuccess(stopwatchCreateStarted.elapsed(java.util.concurrent.TimeUnit.NANOSECONDS));
                            return mapLoadAll;
                        } catch (java.lang.RuntimeException e) {
                            throw new com.google.common.util.concurrent.UncheckedExecutionException(e);
                        }
                    } catch (java.lang.InterruptedException e2) {
                        java.lang.Thread.currentThread().interrupt();
                        throw new java.util.concurrent.ExecutionException(e2);
                    }
                } catch (java.lang.Error e3) {
                    throw new com.google.common.util.concurrent.ExecutionError(e3);
                }
            } catch (com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException e4) {
                try {
                    throw e4;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (!z) {
                        this.globalStatsCounter.recordLoadException(stopwatchCreateStarted.elapsed(java.util.concurrent.TimeUnit.NANOSECONDS));
                    }
                    throw th;
                }
            } catch (java.lang.Exception e5) {
                throw new java.util.concurrent.ExecutionException(e5);
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            z = false;
            if (!z) {
                this.globalStatsCounter.recordLoadException(stopwatchCreateStarted.elapsed(java.util.concurrent.TimeUnit.NANOSECONDS));
            }
            throw th;
        }
    }

    @javax.annotation.CheckForNull
    com.google.common.cache.ReferenceEntry<K, V> getEntry(@javax.annotation.CheckForNull java.lang.Object key) {
        if (key == null) {
            return null;
        }
        int iHash = hash(key);
        return segmentFor(iHash).getEntry(key, iHash);
    }

    void refresh(K key) {
        int iHash = hash(com.google.common.base.Preconditions.checkNotNull(key));
        segmentFor(iHash).refresh(key, iHash, this.defaultLoader, false);
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
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        long j = this.ticker.read();
        com.google.common.cache.LocalCache.Segment<K, V>[] segmentArr = this.segments;
        long j2 = -1;
        int i = 0;
        while (i < 3) {
            int length = segmentArr.length;
            long j3 = 0;
            for (?? r12 = z; r12 < length; r12++) {
                com.google.common.cache.LocalCache.Segment<K, V> segment = segmentArr[r12];
                int i2 = segment.count;
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = segment.table;
                for (?? r15 = z; r15 < atomicReferenceArray.length(); r15++) {
                    com.google.common.cache.ReferenceEntry<K, V> next = atomicReferenceArray.get(r15);
                    while (next != null) {
                        com.google.common.cache.LocalCache.Segment<K, V>[] segmentArr2 = segmentArr;
                        V liveValue = segment.getLiveValue(next, j);
                        long j4 = j;
                        if (liveValue != null && this.valueEquivalence.equivalent(obj, liveValue)) {
                            return true;
                        }
                        next = next.getNext();
                        segmentArr = segmentArr2;
                        j = j4;
                    }
                }
                j3 += (long) segment.modCount;
                j = j;
                z = false;
            }
            long j5 = j;
            com.google.common.cache.LocalCache.Segment<K, V>[] segmentArr3 = segmentArr;
            if (j3 == j2) {
                return false;
            }
            i++;
            j2 = j3;
            segmentArr = segmentArr3;
            j = j5;
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
        for (com.google.common.cache.LocalCache.Segment<K, V> segment : this.segments) {
            segment.clear();
        }
    }

    void invalidateAll(java.lang.Iterable<?> keys) {
        java.util.Iterator<?> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
        java.util.Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        com.google.common.cache.LocalCache.KeySet keySet = new com.google.common.cache.LocalCache.KeySet();
        this.keySet = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<V> values() {
        java.util.Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        com.google.common.cache.LocalCache.Values values = new com.google.common.cache.LocalCache.Values();
        this.values = values;
        return values;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        java.util.Set<java.util.Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        com.google.common.cache.LocalCache.EntrySet entrySet = new com.google.common.cache.LocalCache.EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    abstract class HashIterator<T> implements java.util.Iterator<T> {

        @javax.annotation.CheckForNull
        com.google.common.cache.LocalCache.Segment<K, V> currentSegment;

        @javax.annotation.CheckForNull
        java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> currentTable;

        @javax.annotation.CheckForNull
        com.google.common.cache.LocalCache<K, V>.WriteThroughEntry lastReturned;

        @javax.annotation.CheckForNull
        com.google.common.cache.ReferenceEntry<K, V> nextEntry;

        @javax.annotation.CheckForNull
        com.google.common.cache.LocalCache<K, V>.WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex = -1;

        @Override // java.util.Iterator
        public abstract T next();

        HashIterator() {
            this.nextSegmentIndex = com.google.common.cache.LocalCache.this.segments.length - 1;
            advance();
        }

        final void advance() {
            this.nextExternal = null;
            if (nextInChain() || nextInTable()) {
                return;
            }
            while (this.nextSegmentIndex >= 0) {
                com.google.common.cache.LocalCache.Segment<K, V>[] segmentArr = com.google.common.cache.LocalCache.this.segments;
                int i = this.nextSegmentIndex;
                this.nextSegmentIndex = i - 1;
                com.google.common.cache.LocalCache.Segment<K, V> segment = segmentArr[i];
                this.currentSegment = segment;
                if (segment.count != 0) {
                    java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.currentSegment.table;
                    this.currentTable = atomicReferenceArray;
                    this.nextTableIndex = atomicReferenceArray.length() - 1;
                    if (nextInTable()) {
                        return;
                    }
                }
            }
        }

        boolean nextInChain() {
            com.google.common.cache.ReferenceEntry<K, V> referenceEntry = this.nextEntry;
            if (referenceEntry == null) {
                return false;
            }
            while (true) {
                this.nextEntry = referenceEntry.getNext();
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry2 = this.nextEntry;
                if (referenceEntry2 == null) {
                    return false;
                }
                if (advanceTo(referenceEntry2)) {
                    return true;
                }
                referenceEntry = this.nextEntry;
            }
        }

        boolean nextInTable() {
            while (true) {
                int i = this.nextTableIndex;
                if (i < 0) {
                    return false;
                }
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> atomicReferenceArray = this.currentTable;
                this.nextTableIndex = i - 1;
                com.google.common.cache.ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i);
                this.nextEntry = referenceEntry;
                if (referenceEntry != null && (advanceTo(referenceEntry) || nextInChain())) {
                    return true;
                }
            }
        }

        boolean advanceTo(com.google.common.cache.ReferenceEntry<K, V> entry) {
            com.google.common.cache.LocalCache.Segment<K, V> segment;
            try {
                long j = com.google.common.cache.LocalCache.this.ticker.read();
                K key = entry.getKey();
                java.lang.Object liveValue = com.google.common.cache.LocalCache.this.getLiveValue(entry, j);
                if (liveValue == null) {
                    return false;
                }
                this.nextExternal = new com.google.common.cache.LocalCache.WriteThroughEntry(key, liveValue);
                return true;
            } finally {
                this.currentSegment.postReadCleanup();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextExternal != null;
        }

        com.google.common.cache.LocalCache<K, V>.WriteThroughEntry nextEntry() {
            com.google.common.cache.LocalCache<K, V>.WriteThroughEntry writeThroughEntry = this.nextExternal;
            if (writeThroughEntry == null) {
                throw new java.util.NoSuchElementException();
            }
            this.lastReturned = writeThroughEntry;
            advance();
            return this.lastReturned;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.Preconditions.checkState(this.lastReturned != null);
            com.google.common.cache.LocalCache.this.remove(this.lastReturned.getKey());
            this.lastReturned = null;
        }
    }

    final class KeyIterator extends com.google.common.cache.LocalCache<K, V>.HashIterator<K> {
        KeyIterator(final com.google.common.cache.LocalCache this$0) {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public K next() {
            return nextEntry().getKey();
        }
    }

    final class ValueIterator extends com.google.common.cache.LocalCache<K, V>.HashIterator<V> {
        ValueIterator(final com.google.common.cache.LocalCache this$0) {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public V next() {
            return nextEntry().getValue();
        }
    }

    final class WriteThroughEntry implements java.util.Map.Entry<K, V> {
        final K key;
        V value;

        WriteThroughEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (!(object instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) object;
            return this.key.equals(entry.getKey()) && this.value.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.key.hashCode() ^ this.value.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) com.google.common.cache.LocalCache.this.put(this.key, v);
            this.value = v;
            return v2;
        }

        public java.lang.String toString() {
            return getKey() + com.ironsource.y8.i.b + getValue();
        }
    }

    final class EntryIterator extends com.google.common.cache.LocalCache<K, V>.HashIterator<java.util.Map.Entry<K, V>> {
        EntryIterator(final com.google.common.cache.LocalCache this$0) {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
            return nextEntry();
        }
    }

    abstract class AbstractCacheSet<T> extends java.util.AbstractSet<T> {
        AbstractCacheSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.cache.LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return com.google.common.cache.LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.google.common.cache.LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
            return com.google.common.cache.LocalCache.toArrayList(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) com.google.common.cache.LocalCache.toArrayList(this).toArray(eArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.ArrayList<E> toArrayList(java.util.Collection<E> c) {
        java.util.ArrayList<E> arrayList = new java.util.ArrayList<>(c.size());
        com.google.common.collect.Iterators.addAll(arrayList, c.iterator());
        return arrayList;
    }

    final class KeySet extends com.google.common.cache.LocalCache<K, V>.AbstractCacheSet<K> {
        KeySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
            return new com.google.common.cache.LocalCache.KeyIterator(com.google.common.cache.LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object o) {
            return com.google.common.cache.LocalCache.this.containsKey(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object o) {
            return com.google.common.cache.LocalCache.this.remove(o) != null;
        }
    }

    final class Values extends java.util.AbstractCollection<V> {
        Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return com.google.common.cache.LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return com.google.common.cache.LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
            return new com.google.common.cache.LocalCache.ValueIterator(com.google.common.cache.LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object o) {
            return com.google.common.cache.LocalCache.this.containsValue(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public java.lang.Object[] toArray() {
            return com.google.common.cache.LocalCache.toArrayList(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] eArr) {
            return (E[]) com.google.common.cache.LocalCache.toArrayList(this).toArray(eArr);
        }
    }

    final class EntrySet extends com.google.common.cache.LocalCache<K, V>.AbstractCacheSet<java.util.Map.Entry<K, V>> {
        EntrySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new com.google.common.cache.LocalCache.EntryIterator(com.google.common.cache.LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object o) {
            java.util.Map.Entry entry;
            java.lang.Object key;
            java.lang.Object obj;
            return (o instanceof java.util.Map.Entry) && (key = (entry = (java.util.Map.Entry) o).getKey()) != null && (obj = com.google.common.cache.LocalCache.this.get(key)) != null && com.google.common.cache.LocalCache.this.valueEquivalence.equivalent(entry.getValue(), obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object o) {
            java.util.Map.Entry entry;
            java.lang.Object key;
            return (o instanceof java.util.Map.Entry) && (key = (entry = (java.util.Map.Entry) o).getKey()) != null && com.google.common.cache.LocalCache.this.remove(key, entry.getValue());
        }
    }

    static class ManualSerializationProxy<K, V> extends com.google.common.cache.ForwardingCache<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 1;
        final int concurrencyLevel;

        @javax.annotation.CheckForNull
        transient com.google.common.cache.Cache<K, V> delegate;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;
        final com.google.common.cache.LocalCache.Strength keyStrength;
        final com.google.common.cache.CacheLoader<? super K, V> loader;
        final long maxWeight;
        final com.google.common.cache.RemovalListener<? super K, ? super V> removalListener;

        @javax.annotation.CheckForNull
        final com.google.common.base.Ticker ticker;
        final com.google.common.base.Equivalence<java.lang.Object> valueEquivalence;
        final com.google.common.cache.LocalCache.Strength valueStrength;
        final com.google.common.cache.Weigher<K, V> weigher;

        ManualSerializationProxy(com.google.common.cache.LocalCache<K, V> cache) {
            this(cache.keyStrength, cache.valueStrength, cache.keyEquivalence, cache.valueEquivalence, cache.expireAfterWriteNanos, cache.expireAfterAccessNanos, cache.maxWeight, cache.weigher, cache.concurrencyLevel, cache.removalListener, cache.ticker, cache.defaultLoader);
        }

        private ManualSerializationProxy(com.google.common.cache.LocalCache.Strength keyStrength, com.google.common.cache.LocalCache.Strength valueStrength, com.google.common.base.Equivalence<java.lang.Object> keyEquivalence, com.google.common.base.Equivalence<java.lang.Object> valueEquivalence, long expireAfterWriteNanos, long expireAfterAccessNanos, long maxWeight, com.google.common.cache.Weigher<K, V> weigher, int concurrencyLevel, com.google.common.cache.RemovalListener<? super K, ? super V> removalListener, com.google.common.base.Ticker ticker, com.google.common.cache.CacheLoader<? super K, V> loader) {
            this.keyStrength = keyStrength;
            this.valueStrength = valueStrength;
            this.keyEquivalence = keyEquivalence;
            this.valueEquivalence = valueEquivalence;
            this.expireAfterWriteNanos = expireAfterWriteNanos;
            this.expireAfterAccessNanos = expireAfterAccessNanos;
            this.maxWeight = maxWeight;
            this.weigher = weigher;
            this.concurrencyLevel = concurrencyLevel;
            this.removalListener = removalListener;
            this.ticker = (ticker == com.google.common.base.Ticker.systemTicker() || ticker == com.google.common.cache.CacheBuilder.NULL_TICKER) ? null : ticker;
            this.loader = loader;
        }

        com.google.common.cache.CacheBuilder<K, V> recreateCacheBuilder() {
            com.google.common.cache.CacheBuilder<K, V> cacheBuilder = (com.google.common.cache.CacheBuilder<K, V>) com.google.common.cache.CacheBuilder.newBuilder().setKeyStrength(this.keyStrength).setValueStrength(this.valueStrength).keyEquivalence(this.keyEquivalence).valueEquivalence(this.valueEquivalence).concurrencyLevel(this.concurrencyLevel).removalListener(this.removalListener);
            cacheBuilder.strictParsing = false;
            long j = this.expireAfterWriteNanos;
            if (j > 0) {
                cacheBuilder.expireAfterWrite(j, java.util.concurrent.TimeUnit.NANOSECONDS);
            }
            long j2 = this.expireAfterAccessNanos;
            if (j2 > 0) {
                cacheBuilder.expireAfterAccess(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
            }
            if (this.weigher != com.google.common.cache.CacheBuilder.OneWeigher.INSTANCE) {
                cacheBuilder.weigher(this.weigher);
                long j3 = this.maxWeight;
                if (j3 != -1) {
                    cacheBuilder.maximumWeight(j3);
                }
            } else {
                long j4 = this.maxWeight;
                if (j4 != -1) {
                    cacheBuilder.maximumSize(j4);
                }
            }
            com.google.common.base.Ticker ticker = this.ticker;
            if (ticker != null) {
                cacheBuilder.ticker(ticker);
            }
            return cacheBuilder;
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
            objectInputStream.defaultReadObject();
            this.delegate = (com.google.common.cache.Cache<K, V>) recreateCacheBuilder().build();
        }

        private java.lang.Object readResolve() {
            return this.delegate;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public com.google.common.cache.Cache<K, V> delegate() {
            return this.delegate;
        }
    }

    static final class LoadingSerializationProxy<K, V> extends com.google.common.cache.LocalCache.ManualSerializationProxy<K, V> implements com.google.common.cache.LoadingCache<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 1;

        @javax.annotation.CheckForNull
        transient com.google.common.cache.LoadingCache<K, V> autoDelegate;

        LoadingSerializationProxy(com.google.common.cache.LocalCache<K, V> cache) {
            super(cache);
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
            objectInputStream.defaultReadObject();
            this.autoDelegate = (com.google.common.cache.LoadingCache<K, V>) recreateCacheBuilder().build(this.loader);
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K key) throws java.util.concurrent.ExecutionException {
            return this.autoDelegate.get(key);
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K key) {
            return this.autoDelegate.getUnchecked(key);
        }

        @Override // com.google.common.cache.LoadingCache
        public com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> keys) throws java.util.concurrent.ExecutionException {
            return this.autoDelegate.getAll(keys);
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public V apply(K key) {
            return this.autoDelegate.apply(key);
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K key) {
            this.autoDelegate.refresh(key);
        }

        private java.lang.Object readResolve() {
            return this.autoDelegate;
        }
    }

    static class LocalManualCache<K, V> implements com.google.common.cache.Cache<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 1;
        final com.google.common.cache.LocalCache<K, V> localCache;

        LocalManualCache(com.google.common.cache.CacheBuilder<? super K, ? super V> builder) {
            this(new com.google.common.cache.LocalCache(builder, null));
        }

        private LocalManualCache(com.google.common.cache.LocalCache<K, V> localCache) {
            this.localCache = localCache;
        }

        @Override // com.google.common.cache.Cache
        @javax.annotation.CheckForNull
        public V getIfPresent(java.lang.Object key) {
            return this.localCache.getIfPresent(key);
        }

        @Override // com.google.common.cache.Cache
        public V get(K key, final java.util.concurrent.Callable<? extends V> valueLoader) throws java.util.concurrent.ExecutionException {
            com.google.common.base.Preconditions.checkNotNull(valueLoader);
            return this.localCache.get(key, new com.google.common.cache.CacheLoader<java.lang.Object, V>(this) { // from class: com.google.common.cache.LocalCache.LocalManualCache.1
                @Override // com.google.common.cache.CacheLoader
                public V load(java.lang.Object obj) throws java.lang.Exception {
                    return (V) valueLoader.call();
                }
            });
        }

        @Override // com.google.common.cache.Cache
        public com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<?> keys) {
            return this.localCache.getAllPresent(keys);
        }

        @Override // com.google.common.cache.Cache
        public void put(K key, V value) {
            this.localCache.put(key, value);
        }

        @Override // com.google.common.cache.Cache
        public void putAll(java.util.Map<? extends K, ? extends V> m) {
            this.localCache.putAll(m);
        }

        @Override // com.google.common.cache.Cache
        public void invalidate(java.lang.Object key) {
            com.google.common.base.Preconditions.checkNotNull(key);
            this.localCache.remove(key);
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll(java.lang.Iterable<?> keys) {
            this.localCache.invalidateAll(keys);
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll() {
            this.localCache.clear();
        }

        @Override // com.google.common.cache.Cache
        public long size() {
            return this.localCache.longSize();
        }

        @Override // com.google.common.cache.Cache
        public java.util.concurrent.ConcurrentMap<K, V> asMap() {
            return this.localCache;
        }

        @Override // com.google.common.cache.Cache
        public com.google.common.cache.CacheStats stats() {
            com.google.common.cache.AbstractCache.SimpleStatsCounter simpleStatsCounter = new com.google.common.cache.AbstractCache.SimpleStatsCounter();
            simpleStatsCounter.incrementBy(this.localCache.globalStatsCounter);
            for (com.google.common.cache.LocalCache.Segment<K, V> segment : this.localCache.segments) {
                simpleStatsCounter.incrementBy(segment.statsCounter);
            }
            return simpleStatsCounter.snapshot();
        }

        @Override // com.google.common.cache.Cache
        public void cleanUp() {
            this.localCache.cleanUp();
        }

        java.lang.Object writeReplace() {
            return new com.google.common.cache.LocalCache.ManualSerializationProxy(this.localCache);
        }

        private void readObject(java.io.ObjectInputStream in) throws java.io.InvalidObjectException {
            throw new java.io.InvalidObjectException("Use ManualSerializationProxy");
        }
    }

    static class LocalLoadingCache<K, V> extends com.google.common.cache.LocalCache.LocalManualCache<K, V> implements com.google.common.cache.LoadingCache<K, V> {
        private static final long serialVersionUID = 1;

        LocalLoadingCache(com.google.common.cache.CacheBuilder<? super K, ? super V> builder, com.google.common.cache.CacheLoader<? super K, V> loader) {
            super();
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K key) throws java.util.concurrent.ExecutionException {
            return this.localCache.getOrLoad(key);
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K key) {
            try {
                return get(key);
            } catch (java.util.concurrent.ExecutionException e) {
                throw new com.google.common.util.concurrent.UncheckedExecutionException(e.getCause());
            }
        }

        @Override // com.google.common.cache.LoadingCache
        public com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> keys) throws java.util.concurrent.ExecutionException {
            return this.localCache.getAll(keys);
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K key) {
            this.localCache.refresh(key);
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K key) {
            return getUnchecked(key);
        }

        @Override // com.google.common.cache.LocalCache.LocalManualCache
        java.lang.Object writeReplace() {
            return new com.google.common.cache.LocalCache.LoadingSerializationProxy(this.localCache);
        }

        private void readObject(java.io.ObjectInputStream in) throws java.io.InvalidObjectException {
            throw new java.io.InvalidObjectException("Use LoadingSerializationProxy");
        }
    }
}
