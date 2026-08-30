package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public final class AtomicLongMap<K> implements java.io.Serializable {

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Map<K, java.lang.Long> asMap;
    private final java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> map;

    private AtomicLongMap(java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> map) {
        this.map = (java.util.concurrent.ConcurrentHashMap) com.google.common.base.Preconditions.checkNotNull(map);
    }

    public static <K> com.google.common.util.concurrent.AtomicLongMap<K> create() {
        return new com.google.common.util.concurrent.AtomicLongMap<>(new java.util.concurrent.ConcurrentHashMap());
    }

    public static <K> com.google.common.util.concurrent.AtomicLongMap<K> create(java.util.Map<? extends K, ? extends java.lang.Long> m) {
        com.google.common.util.concurrent.AtomicLongMap<K> atomicLongMapCreate = create();
        atomicLongMapCreate.putAll(m);
        return atomicLongMapCreate;
    }

    public long get(K key) {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.map.get(key);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    public long incrementAndGet(K key) {
        return addAndGet(key, 1L);
    }

    public long decrementAndGet(K key) {
        return addAndGet(key, -1L);
    }

    public long addAndGet(K key, long delta) {
        java.util.concurrent.atomic.AtomicLong atomicLongPutIfAbsent;
        long j;
        long j2;
        do {
            atomicLongPutIfAbsent = this.map.get(key);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(key, new java.util.concurrent.atomic.AtomicLong(delta))) == null) {
                return delta;
            }
            do {
                j = atomicLongPutIfAbsent.get();
                if (j != 0) {
                    j2 = j + delta;
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j, j2));
            return j2;
        } while (!this.map.replace(key, atomicLongPutIfAbsent, new java.util.concurrent.atomic.AtomicLong(delta)));
        return delta;
    }

    public long getAndIncrement(K key) {
        return getAndAdd(key, 1L);
    }

    public long getAndDecrement(K key) {
        return getAndAdd(key, -1L);
    }

    public long getAndAdd(K key, long delta) {
        java.util.concurrent.atomic.AtomicLong atomicLongPutIfAbsent;
        long j;
        do {
            atomicLongPutIfAbsent = this.map.get(key);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(key, new java.util.concurrent.atomic.AtomicLong(delta))) == null) {
                return 0L;
            }
            do {
                j = atomicLongPutIfAbsent.get();
                if (j == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j, j + delta));
            return j;
        } while (!this.map.replace(key, atomicLongPutIfAbsent, new java.util.concurrent.atomic.AtomicLong(delta)));
        return 0L;
    }

    public long put(K key, long newValue) {
        java.util.concurrent.atomic.AtomicLong atomicLongPutIfAbsent;
        long j;
        do {
            atomicLongPutIfAbsent = this.map.get(key);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(key, new java.util.concurrent.atomic.AtomicLong(newValue))) == null) {
                return 0L;
            }
            do {
                j = atomicLongPutIfAbsent.get();
                if (j == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j, newValue));
            return j;
        } while (!this.map.replace(key, atomicLongPutIfAbsent, new java.util.concurrent.atomic.AtomicLong(newValue)));
        return 0L;
    }

    public void putAll(java.util.Map<? extends K, ? extends java.lang.Long> m) {
        for (java.util.Map.Entry<? extends K, ? extends java.lang.Long> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue().longValue());
        }
    }

    public long remove(K key) {
        long j;
        java.util.concurrent.atomic.AtomicLong atomicLong = this.map.get(key);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j = atomicLong.get();
            if (j == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j, 0L));
        this.map.remove(key, atomicLong);
        return j;
    }

    boolean remove(K key, long value) {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.map.get(key);
        if (atomicLong == null) {
            return false;
        }
        long j = atomicLong.get();
        if (j != value) {
            return false;
        }
        if (j != 0 && !atomicLong.compareAndSet(j, 0L)) {
            return false;
        }
        this.map.remove(key, atomicLong);
        return true;
    }

    public boolean removeIfZero(K key) {
        return remove(key, 0L);
    }

    public void removeAllZeros() {
        java.util.Iterator<java.util.Map.Entry<K, java.util.concurrent.atomic.AtomicLong>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.concurrent.atomic.AtomicLong value = it.next().getValue();
            if (value != null && value.get() == 0) {
                it.remove();
            }
        }
    }

    public long sum() {
        java.util.Iterator<java.util.concurrent.atomic.AtomicLong> it = this.map.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().get();
        }
        return j;
    }

    public java.util.Map<K, java.lang.Long> asMap() {
        java.util.Map<K, java.lang.Long> map = this.asMap;
        if (map != null) {
            return map;
        }
        java.util.Map<K, java.lang.Long> mapCreateAsMap = createAsMap();
        this.asMap = mapCreateAsMap;
        return mapCreateAsMap;
    }

    private java.util.Map<K, java.lang.Long> createAsMap() {
        return java.util.Collections.unmodifiableMap(com.google.common.collect.Maps.transformValues(this.map, new com.google.common.base.Function<java.util.concurrent.atomic.AtomicLong, java.lang.Long>(this) { // from class: com.google.common.util.concurrent.AtomicLongMap.1
            @Override // com.google.common.base.Function
            public java.lang.Long apply(java.util.concurrent.atomic.AtomicLong atomic) {
                return java.lang.Long.valueOf(atomic.get());
            }
        }));
    }

    public boolean containsKey(java.lang.Object key) {
        return this.map.containsKey(key);
    }

    public int size() {
        return this.map.size();
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public void clear() {
        this.map.clear();
    }

    public java.lang.String toString() {
        return this.map.toString();
    }

    long putIfAbsent(K key, long newValue) {
        java.util.concurrent.atomic.AtomicLong atomicLongPutIfAbsent;
        do {
            atomicLongPutIfAbsent = this.map.get(key);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(key, new java.util.concurrent.atomic.AtomicLong(newValue))) == null) {
                return 0L;
            }
            long j = atomicLongPutIfAbsent.get();
            if (j != 0) {
                return j;
            }
        } while (!this.map.replace(key, atomicLongPutIfAbsent, new java.util.concurrent.atomic.AtomicLong(newValue)));
        return 0L;
    }

    boolean replace(K key, long expectedOldValue, long newValue) {
        if (expectedOldValue == 0) {
            return putIfAbsent(key, newValue) == 0;
        }
        java.util.concurrent.atomic.AtomicLong atomicLong = this.map.get(key);
        if (atomicLong == null) {
            return false;
        }
        return atomicLong.compareAndSet(expectedOldValue, newValue);
    }
}
