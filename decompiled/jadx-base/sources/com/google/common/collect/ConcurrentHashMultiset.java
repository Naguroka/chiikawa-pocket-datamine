package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class ConcurrentHashMultiset<E> extends com.google.common.collect.AbstractMultiset<E> implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final transient java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> countMap;

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@javax.annotation.CheckForNull java.lang.Object element) {
        return super.contains(element);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
        return super.entrySet();
    }

    private static class FieldSettersHolder {
        static final com.google.common.collect.Serialization.FieldSetter<com.google.common.collect.ConcurrentHashMultiset> COUNT_MAP_FIELD_SETTER = com.google.common.collect.Serialization.getFieldSetter(com.google.common.collect.ConcurrentHashMultiset.class, "countMap");

        private FieldSettersHolder() {
        }
    }

    public static <E> com.google.common.collect.ConcurrentHashMultiset<E> create() {
        return new com.google.common.collect.ConcurrentHashMultiset<>(new java.util.concurrent.ConcurrentHashMap());
    }

    public static <E> com.google.common.collect.ConcurrentHashMultiset<E> create(java.lang.Iterable<? extends E> elements) {
        com.google.common.collect.ConcurrentHashMultiset<E> concurrentHashMultisetCreate = create();
        com.google.common.collect.Iterables.addAll(concurrentHashMultisetCreate, elements);
        return concurrentHashMultisetCreate;
    }

    public static <E> com.google.common.collect.ConcurrentHashMultiset<E> create(java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> countMap) {
        return new com.google.common.collect.ConcurrentHashMultiset<>(countMap);
    }

    ConcurrentHashMultiset(java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> countMap) {
        com.google.common.base.Preconditions.checkArgument(countMap.isEmpty(), "the backing map (%s) must be empty", countMap);
        this.countMap = countMap;
    }

    @Override // com.google.common.collect.Multiset
    public int count(@javax.annotation.CheckForNull java.lang.Object element) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) com.google.common.collect.Maps.safeGet(this.countMap, element);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        java.util.Iterator<java.util.concurrent.atomic.AtomicInteger> it = this.countMap.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += (long) it.next().get();
        }
        return com.google.common.primitives.Ints.saturatedCast(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public java.lang.Object[] toArray() {
        return snapshot().toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) snapshot().toArray(tArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.util.List<E> snapshot() {
        java.util.ArrayList arrayListNewArrayListWithExpectedSize = com.google.common.collect.Lists.newArrayListWithExpectedSize(size());
        for (com.google.common.collect.Multiset.Entry entry : entrySet()) {
            java.lang.Object element = entry.getElement();
            for (int count = entry.getCount(); count > 0; count--) {
                arrayListNewArrayListWithExpectedSize.add(element);
            }
        }
        return arrayListNewArrayListWithExpectedSize;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int add(E element, int occurrences) {
        java.util.concurrent.atomic.AtomicInteger atomicIntegerPutIfAbsent;
        int i;
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        com.google.common.base.Preconditions.checkNotNull(element);
        if (occurrences == 0) {
            return count(element);
        }
        com.google.common.collect.CollectPreconditions.checkPositive(occurrences, "occurrences");
        do {
            atomicIntegerPutIfAbsent = (java.util.concurrent.atomic.AtomicInteger) com.google.common.collect.Maps.safeGet(this.countMap, element);
            if (atomicIntegerPutIfAbsent == null && (atomicIntegerPutIfAbsent = this.countMap.putIfAbsent(element, new java.util.concurrent.atomic.AtomicInteger(occurrences))) == null) {
                return 0;
            }
            do {
                i = atomicIntegerPutIfAbsent.get();
                if (i != 0) {
                    try {
                    } catch (java.lang.ArithmeticException unused) {
                        throw new java.lang.IllegalArgumentException("Overflow adding " + occurrences + " occurrences to a count of " + i);
                    }
                } else {
                    atomicInteger = new java.util.concurrent.atomic.AtomicInteger(occurrences);
                    if (this.countMap.putIfAbsent(element, atomicInteger) == null) {
                        break;
                    }
                }
            } while (!atomicIntegerPutIfAbsent.compareAndSet(i, com.google.common.math.IntMath.checkedAdd(i, occurrences)));
            return i;
        } while (!this.countMap.replace(element, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int remove(@javax.annotation.CheckForNull java.lang.Object element, int occurrences) {
        int i;
        int iMax;
        if (occurrences == 0) {
            return count(element);
        }
        com.google.common.collect.CollectPreconditions.checkPositive(occurrences, "occurrences");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) com.google.common.collect.Maps.safeGet(this.countMap, element);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i = atomicInteger.get();
            if (i == 0) {
                return 0;
            }
            iMax = java.lang.Math.max(0, i - occurrences);
        } while (!atomicInteger.compareAndSet(i, iMax));
        if (iMax == 0) {
            this.countMap.remove(element, atomicInteger);
        }
        return i;
    }

    public boolean removeExactly(@javax.annotation.CheckForNull java.lang.Object element, int occurrences) {
        int i;
        int i2;
        if (occurrences == 0) {
            return true;
        }
        com.google.common.collect.CollectPreconditions.checkPositive(occurrences, "occurrences");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) com.google.common.collect.Maps.safeGet(this.countMap, element);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i = atomicInteger.get();
            if (i < occurrences) {
                return false;
            }
            i2 = i - occurrences;
        } while (!atomicInteger.compareAndSet(i, i2));
        if (i2 == 0) {
            this.countMap.remove(element, atomicInteger);
        }
        return true;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int setCount(E element, int count) {
        java.util.concurrent.atomic.AtomicInteger atomicIntegerPutIfAbsent;
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        com.google.common.base.Preconditions.checkNotNull(element);
        com.google.common.collect.CollectPreconditions.checkNonnegative(count, "count");
        do {
            atomicIntegerPutIfAbsent = (java.util.concurrent.atomic.AtomicInteger) com.google.common.collect.Maps.safeGet(this.countMap, element);
            if (atomicIntegerPutIfAbsent != null || (count != 0 && (atomicIntegerPutIfAbsent = this.countMap.putIfAbsent(element, new java.util.concurrent.atomic.AtomicInteger(count))) != null)) {
                while (true) {
                    int i = atomicIntegerPutIfAbsent.get();
                    if (i == 0) {
                        break;
                    }
                    if (atomicIntegerPutIfAbsent.compareAndSet(i, count)) {
                        if (count == 0) {
                            this.countMap.remove(element, atomicIntegerPutIfAbsent);
                        }
                        return i;
                    }
                }
                if (count != 0) {
                    atomicInteger = new java.util.concurrent.atomic.AtomicInteger(count);
                    if (this.countMap.putIfAbsent(element, atomicInteger) == null) {
                        break;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } while (!this.countMap.replace(element, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public boolean setCount(E element, int expectedOldCount, int newCount) {
        com.google.common.base.Preconditions.checkNotNull(element);
        com.google.common.collect.CollectPreconditions.checkNonnegative(expectedOldCount, "oldCount");
        com.google.common.collect.CollectPreconditions.checkNonnegative(newCount, "newCount");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) com.google.common.collect.Maps.safeGet(this.countMap, element);
        if (atomicInteger == null) {
            if (expectedOldCount != 0) {
                return false;
            }
            return newCount == 0 || this.countMap.putIfAbsent(element, new java.util.concurrent.atomic.AtomicInteger(newCount)) == null;
        }
        int i = atomicInteger.get();
        if (i == expectedOldCount) {
            if (i == 0) {
                if (newCount == 0) {
                    this.countMap.remove(element, atomicInteger);
                    return true;
                }
                java.util.concurrent.atomic.AtomicInteger atomicInteger2 = new java.util.concurrent.atomic.AtomicInteger(newCount);
                return this.countMap.putIfAbsent(element, atomicInteger2) == null || this.countMap.replace(element, atomicInteger, atomicInteger2);
            }
            if (atomicInteger.compareAndSet(i, newCount)) {
                if (newCount == 0) {
                    this.countMap.remove(element, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractMultiset
    java.util.Set<E> createElementSet() {
        final java.util.Set<E> setKeySet = this.countMap.keySet();
        return new com.google.common.collect.ForwardingSet<E>(this) { // from class: com.google.common.collect.ConcurrentHashMultiset.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public java.util.Set<E> delegate() {
                return setKeySet;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
                return object != null && com.google.common.collect.Collections2.safeContains(setKeySet, object);
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean containsAll(java.util.Collection<?> collection) {
                return standardContainsAll(collection);
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object object) {
                return object != null && com.google.common.collect.Collections2.safeRemove(setKeySet, object);
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean removeAll(java.util.Collection<?> c) {
                return standardRemoveAll(c);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    java.util.Iterator<E> elementIterator() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultiset
    @java.lang.Deprecated
    public java.util.Set<com.google.common.collect.Multiset.Entry<E>> createEntrySet() {
        return new com.google.common.collect.ConcurrentHashMultiset.EntrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset
    int distinctElements() {
        return this.countMap.size();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.countMap.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMultiset
    java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
        final com.google.common.collect.AbstractIterator<com.google.common.collect.Multiset.Entry<E>> abstractIterator = new com.google.common.collect.AbstractIterator<com.google.common.collect.Multiset.Entry<E>>() { // from class: com.google.common.collect.ConcurrentHashMultiset.2
            private final java.util.Iterator<java.util.Map.Entry<E, java.util.concurrent.atomic.AtomicInteger>> mapEntries;

            {
                this.mapEntries = com.google.common.collect.ConcurrentHashMultiset.this.countMap.entrySet().iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @javax.annotation.CheckForNull
            public com.google.common.collect.Multiset.Entry<E> computeNext() {
                while (this.mapEntries.hasNext()) {
                    java.util.Map.Entry<E, java.util.concurrent.atomic.AtomicInteger> next = this.mapEntries.next();
                    int i = next.getValue().get();
                    if (i != 0) {
                        return com.google.common.collect.Multisets.immutableEntry(next.getKey(), i);
                    }
                }
                return endOfData();
            }
        };
        return new com.google.common.collect.ForwardingIterator<com.google.common.collect.Multiset.Entry<E>>() { // from class: com.google.common.collect.ConcurrentHashMultiset.3

            @javax.annotation.CheckForNull
            private com.google.common.collect.Multiset.Entry<E> last;

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
            public java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> delegate() {
                return abstractIterator;
            }

            @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
            public com.google.common.collect.Multiset.Entry<E> next() {
                com.google.common.collect.Multiset.Entry<E> entry = (com.google.common.collect.Multiset.Entry) super.next();
                this.last = entry;
                return entry;
            }

            @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
            public void remove() {
                com.google.common.base.Preconditions.checkState(this.last != null, "no calls to next() since the last call to remove()");
                com.google.common.collect.ConcurrentHashMultiset.this.setCount(this.last.getElement(), 0);
                this.last = null;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public java.util.Iterator<E> iterator() {
        return com.google.common.collect.Multisets.iteratorImpl(this);
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.countMap.clear();
    }

    private class EntrySet extends com.google.common.collect.AbstractMultiset<E>.EntrySet {
        private EntrySet() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMultiset.EntrySet, com.google.common.collect.Multisets.EntrySet
        public com.google.common.collect.ConcurrentHashMultiset<E> multiset() {
            return com.google.common.collect.ConcurrentHashMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
            return snapshot().toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) snapshot().toArray(tArr);
        }

        private java.util.List<com.google.common.collect.Multiset.Entry<E>> snapshot() {
            java.util.ArrayList arrayListNewArrayListWithExpectedSize = com.google.common.collect.Lists.newArrayListWithExpectedSize(size());
            com.google.common.collect.Iterators.addAll(arrayListNewArrayListWithExpectedSize, iterator());
            return arrayListNewArrayListWithExpectedSize;
        }
    }

    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.countMap);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.lang.ClassNotFoundException, java.io.IOException {
        stream.defaultReadObject();
        com.google.common.collect.ConcurrentHashMultiset.FieldSettersHolder.COUNT_MAP_FIELD_SETTER.set(this, (java.util.concurrent.ConcurrentMap) java.util.Objects.requireNonNull(stream.readObject()));
    }
}
