package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class Synchronized {
    private Synchronized() {
    }

    static class SynchronizedObject implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.lang.Object delegate;
        final java.lang.Object mutex;

        SynchronizedObject(java.lang.Object delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
            this.mutex = mutex == null ? this : mutex;
        }

        java.lang.Object delegate() {
            return this.delegate;
        }

        public java.lang.String toString() {
            java.lang.String string;
            synchronized (this.mutex) {
                string = this.delegate.toString();
            }
            return string;
        }

        private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
            synchronized (this.mutex) {
                stream.defaultWriteObject();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.Collection<E> collection(java.util.Collection<E> collection, @javax.annotation.CheckForNull java.lang.Object mutex) {
        return new com.google.common.collect.Synchronized.SynchronizedCollection(collection, mutex);
    }

    static class SynchronizedCollection<E> extends com.google.common.collect.Synchronized.SynchronizedObject implements java.util.Collection<E> {
        private static final long serialVersionUID = 0;

        private SynchronizedCollection(java.util.Collection<E> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.Collection<E> delegate() {
            return (java.util.Collection) super.delegate();
        }

        @Override // java.util.Collection
        public boolean add(E e) {
            boolean zAdd;
            synchronized (this.mutex) {
                zAdd = delegate().add(e);
            }
            return zAdd;
        }

        @Override // java.util.Collection
        public boolean addAll(java.util.Collection<? extends E> c) {
            boolean zAddAll;
            synchronized (this.mutex) {
                zAddAll = delegate().addAll(c);
            }
            return zAddAll;
        }

        @Override // java.util.Collection
        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            boolean zContains;
            synchronized (this.mutex) {
                zContains = delegate().contains(o);
            }
            return zContains;
        }

        public boolean containsAll(java.util.Collection<?> c) {
            boolean zContainsAll;
            synchronized (this.mutex) {
                zContainsAll = delegate().containsAll(c);
            }
            return zContainsAll;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.mutex) {
                zIsEmpty = delegate().isEmpty();
            }
            return zIsEmpty;
        }

        public java.util.Iterator<E> iterator() {
            return delegate().iterator();
        }

        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            boolean zRemove;
            synchronized (this.mutex) {
                zRemove = delegate().remove(o);
            }
            return zRemove;
        }

        public boolean removeAll(java.util.Collection<?> c) {
            boolean zRemoveAll;
            synchronized (this.mutex) {
                zRemoveAll = delegate().removeAll(c);
            }
            return zRemoveAll;
        }

        public boolean retainAll(java.util.Collection<?> c) {
            boolean zRetainAll;
            synchronized (this.mutex) {
                zRetainAll = delegate().retainAll(c);
            }
            return zRetainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        public java.lang.Object[] toArray() {
            java.lang.Object[] array;
            synchronized (this.mutex) {
                array = delegate().toArray();
            }
            return array;
        }

        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.mutex) {
                tArr2 = (T[]) delegate().toArray(tArr);
            }
            return tArr2;
        }
    }

    static <E> java.util.Set<E> set(java.util.Set<E> set, @javax.annotation.CheckForNull java.lang.Object mutex) {
        return new com.google.common.collect.Synchronized.SynchronizedSet(set, mutex);
    }

    static class SynchronizedSet<E> extends com.google.common.collect.Synchronized.SynchronizedCollection<E> implements java.util.Set<E> {
        private static final long serialVersionUID = 0;

        SynchronizedSet(java.util.Set<E> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.Set<E> delegate() {
            return (java.util.Set) super.delegate();
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
            boolean zEquals;
            if (o == this) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(o);
            }
            return zEquals;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.SortedSet<E> sortedSet(java.util.SortedSet<E> set, @javax.annotation.CheckForNull java.lang.Object mutex) {
        return new com.google.common.collect.Synchronized.SynchronizedSortedSet(set, mutex);
    }

    static class SynchronizedSortedSet<E> extends com.google.common.collect.Synchronized.SynchronizedSet<E> implements java.util.SortedSet<E> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedSet(java.util.SortedSet<E> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.SortedSet<E> delegate() {
            return (java.util.SortedSet) super.delegate();
        }

        @Override // java.util.SortedSet
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super E> comparator() {
            java.util.Comparator<? super E> comparator;
            synchronized (this.mutex) {
                comparator = delegate().comparator();
            }
            return comparator;
        }

        public java.util.SortedSet<E> subSet(E fromElement, E toElement) {
            java.util.SortedSet<E> sortedSet;
            synchronized (this.mutex) {
                sortedSet = com.google.common.collect.Synchronized.sortedSet(delegate().subSet(fromElement, toElement), this.mutex);
            }
            return sortedSet;
        }

        public java.util.SortedSet<E> headSet(E toElement) {
            java.util.SortedSet<E> sortedSet;
            synchronized (this.mutex) {
                sortedSet = com.google.common.collect.Synchronized.sortedSet(delegate().headSet(toElement), this.mutex);
            }
            return sortedSet;
        }

        public java.util.SortedSet<E> tailSet(E fromElement) {
            java.util.SortedSet<E> sortedSet;
            synchronized (this.mutex) {
                sortedSet = com.google.common.collect.Synchronized.sortedSet(delegate().tailSet(fromElement), this.mutex);
            }
            return sortedSet;
        }

        @Override // java.util.SortedSet
        public E first() {
            E eFirst;
            synchronized (this.mutex) {
                eFirst = delegate().first();
            }
            return eFirst;
        }

        @Override // java.util.SortedSet
        public E last() {
            E eLast;
            synchronized (this.mutex) {
                eLast = delegate().last();
            }
            return eLast;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.List<E> list(java.util.List<E> list, @javax.annotation.CheckForNull java.lang.Object mutex) {
        if (list instanceof java.util.RandomAccess) {
            return new com.google.common.collect.Synchronized.SynchronizedRandomAccessList(list, mutex);
        }
        return new com.google.common.collect.Synchronized.SynchronizedList(list, mutex);
    }

    static class SynchronizedList<E> extends com.google.common.collect.Synchronized.SynchronizedCollection<E> implements java.util.List<E> {
        private static final long serialVersionUID = 0;

        SynchronizedList(java.util.List<E> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.List<E> delegate() {
            return (java.util.List) super.delegate();
        }

        @Override // java.util.List
        public void add(int index, E element) {
            synchronized (this.mutex) {
                delegate().add(index, element);
            }
        }

        @Override // java.util.List
        public boolean addAll(int index, java.util.Collection<? extends E> c) {
            boolean zAddAll;
            synchronized (this.mutex) {
                zAddAll = delegate().addAll(index, c);
            }
            return zAddAll;
        }

        @Override // java.util.List
        public E get(int index) {
            E e;
            synchronized (this.mutex) {
                e = delegate().get(index);
            }
            return e;
        }

        @Override // java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object o) {
            int iIndexOf;
            synchronized (this.mutex) {
                iIndexOf = delegate().indexOf(o);
            }
            return iIndexOf;
        }

        @Override // java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object o) {
            int iLastIndexOf;
            synchronized (this.mutex) {
                iLastIndexOf = delegate().lastIndexOf(o);
            }
            return iLastIndexOf;
        }

        @Override // java.util.List
        public java.util.ListIterator<E> listIterator() {
            return delegate().listIterator();
        }

        @Override // java.util.List
        public java.util.ListIterator<E> listIterator(int index) {
            return delegate().listIterator(index);
        }

        @Override // java.util.List
        public E remove(int index) {
            E eRemove;
            synchronized (this.mutex) {
                eRemove = delegate().remove(index);
            }
            return eRemove;
        }

        @Override // java.util.List
        public E set(int index, E element) {
            E e;
            synchronized (this.mutex) {
                e = delegate().set(index, element);
            }
            return e;
        }

        @Override // java.util.List
        public java.util.List<E> subList(int fromIndex, int toIndex) {
            java.util.List<E> list;
            synchronized (this.mutex) {
                list = com.google.common.collect.Synchronized.list(delegate().subList(fromIndex, toIndex), this.mutex);
            }
            return list;
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
            boolean zEquals;
            if (o == this) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(o);
            }
            return zEquals;
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }
    }

    static final class SynchronizedRandomAccessList<E> extends com.google.common.collect.Synchronized.SynchronizedList<E> implements java.util.RandomAccess {
        private static final long serialVersionUID = 0;

        SynchronizedRandomAccessList(java.util.List<E> list, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(list, mutex);
        }
    }

    static <E> com.google.common.collect.Multiset<E> multiset(com.google.common.collect.Multiset<E> multiset, @javax.annotation.CheckForNull java.lang.Object mutex) {
        return ((multiset instanceof com.google.common.collect.Synchronized.SynchronizedMultiset) || (multiset instanceof com.google.common.collect.ImmutableMultiset)) ? multiset : new com.google.common.collect.Synchronized.SynchronizedMultiset(multiset, mutex);
    }

    static final class SynchronizedMultiset<E> extends com.google.common.collect.Synchronized.SynchronizedCollection<E> implements com.google.common.collect.Multiset<E> {
        private static final long serialVersionUID = 0;

        @javax.annotation.CheckForNull
        transient java.util.Set<E> elementSet;

        @javax.annotation.CheckForNull
        transient java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet;

        SynchronizedMultiset(com.google.common.collect.Multiset<E> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public com.google.common.collect.Multiset<E> delegate() {
            return (com.google.common.collect.Multiset) super.delegate();
        }

        @Override // com.google.common.collect.Multiset
        public int count(@javax.annotation.CheckForNull java.lang.Object o) {
            int iCount;
            synchronized (this.mutex) {
                iCount = delegate().count(o);
            }
            return iCount;
        }

        @Override // com.google.common.collect.Multiset
        public int add(@com.google.common.collect.ParametricNullness E e, int n) {
            int iAdd;
            synchronized (this.mutex) {
                iAdd = delegate().add(e, n);
            }
            return iAdd;
        }

        @Override // com.google.common.collect.Multiset
        public int remove(@javax.annotation.CheckForNull java.lang.Object o, int n) {
            int iRemove;
            synchronized (this.mutex) {
                iRemove = delegate().remove(o, n);
            }
            return iRemove;
        }

        @Override // com.google.common.collect.Multiset
        public int setCount(@com.google.common.collect.ParametricNullness E element, int count) {
            int count2;
            synchronized (this.mutex) {
                count2 = delegate().setCount(element, count);
            }
            return count2;
        }

        @Override // com.google.common.collect.Multiset
        public boolean setCount(@com.google.common.collect.ParametricNullness E element, int oldCount, int newCount) {
            boolean count;
            synchronized (this.mutex) {
                count = delegate().setCount(element, oldCount, newCount);
            }
            return count;
        }

        @Override // com.google.common.collect.Multiset
        public java.util.Set<E> elementSet() {
            java.util.Set<E> set;
            synchronized (this.mutex) {
                if (this.elementSet == null) {
                    this.elementSet = com.google.common.collect.Synchronized.typePreservingSet(delegate().elementSet(), this.mutex);
                }
                set = this.elementSet;
            }
            return set;
        }

        @Override // com.google.common.collect.Multiset
        public java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet() {
            java.util.Set<com.google.common.collect.Multiset.Entry<E>> set;
            synchronized (this.mutex) {
                if (this.entrySet == null) {
                    this.entrySet = com.google.common.collect.Synchronized.typePreservingSet(delegate().entrySet(), this.mutex);
                }
                set = this.entrySet;
            }
            return set;
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
            boolean zEquals;
            if (o == this) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(o);
            }
            return zEquals;
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }
    }

    static <K, V> com.google.common.collect.Multimap<K, V> multimap(com.google.common.collect.Multimap<K, V> multimap, @javax.annotation.CheckForNull java.lang.Object mutex) {
        return ((multimap instanceof com.google.common.collect.Synchronized.SynchronizedMultimap) || (multimap instanceof com.google.common.collect.BaseImmutableMultimap)) ? multimap : new com.google.common.collect.Synchronized.SynchronizedMultimap(multimap, mutex);
    }

    static class SynchronizedMultimap<K, V> extends com.google.common.collect.Synchronized.SynchronizedObject implements com.google.common.collect.Multimap<K, V> {
        private static final long serialVersionUID = 0;

        @javax.annotation.CheckForNull
        transient java.util.Map<K, java.util.Collection<V>> asMap;

        @javax.annotation.CheckForNull
        transient java.util.Collection<java.util.Map.Entry<K, V>> entries;

        @javax.annotation.CheckForNull
        transient java.util.Set<K> keySet;

        @javax.annotation.CheckForNull
        transient com.google.common.collect.Multiset<K> keys;

        @javax.annotation.CheckForNull
        transient java.util.Collection<V> valuesCollection;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public com.google.common.collect.Multimap<K, V> delegate() {
            return (com.google.common.collect.Multimap) super.delegate();
        }

        SynchronizedMultimap(com.google.common.collect.Multimap<K, V> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        @Override // com.google.common.collect.Multimap
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.mutex) {
                zIsEmpty = delegate().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            boolean zContainsKey;
            synchronized (this.mutex) {
                zContainsKey = delegate().containsKey(key);
            }
            return zContainsKey;
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
            boolean zContainsValue;
            synchronized (this.mutex) {
                zContainsValue = delegate().containsValue(value);
            }
            return zContainsValue;
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsEntry(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
            boolean zContainsEntry;
            synchronized (this.mutex) {
                zContainsEntry = delegate().containsEntry(key, value);
            }
            return zContainsEntry;
        }

        public java.util.Collection<V> get(@com.google.common.collect.ParametricNullness K key) {
            java.util.Collection<V> collectionTypePreservingCollection;
            synchronized (this.mutex) {
                collectionTypePreservingCollection = com.google.common.collect.Synchronized.typePreservingCollection(delegate().get(key), this.mutex);
            }
            return collectionTypePreservingCollection;
        }

        @Override // com.google.common.collect.Multimap
        public boolean put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
            boolean zPut;
            synchronized (this.mutex) {
                zPut = delegate().put(key, value);
            }
            return zPut;
        }

        @Override // com.google.common.collect.Multimap
        public boolean putAll(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
            boolean zPutAll;
            synchronized (this.mutex) {
                zPutAll = delegate().putAll(key, values);
            }
            return zPutAll;
        }

        @Override // com.google.common.collect.Multimap
        public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
            boolean zPutAll;
            synchronized (this.mutex) {
                zPutAll = delegate().putAll(multimap);
            }
            return zPutAll;
        }

        public java.util.Collection<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
            java.util.Collection<V> collectionReplaceValues;
            synchronized (this.mutex) {
                collectionReplaceValues = delegate().replaceValues(key, values);
            }
            return collectionReplaceValues;
        }

        @Override // com.google.common.collect.Multimap
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
            boolean zRemove;
            synchronized (this.mutex) {
                zRemove = delegate().remove(key, value);
            }
            return zRemove;
        }

        public java.util.Collection<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
            java.util.Collection<V> collectionRemoveAll;
            synchronized (this.mutex) {
                collectionRemoveAll = delegate().removeAll(key);
            }
            return collectionRemoveAll;
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        @Override // com.google.common.collect.Multimap
        public java.util.Set<K> keySet() {
            java.util.Set<K> set;
            synchronized (this.mutex) {
                if (this.keySet == null) {
                    this.keySet = com.google.common.collect.Synchronized.typePreservingSet(delegate().keySet(), this.mutex);
                }
                set = this.keySet;
            }
            return set;
        }

        @Override // com.google.common.collect.Multimap
        public java.util.Collection<V> values() {
            java.util.Collection<V> collection;
            synchronized (this.mutex) {
                if (this.valuesCollection == null) {
                    this.valuesCollection = com.google.common.collect.Synchronized.collection(delegate().values(), this.mutex);
                }
                collection = this.valuesCollection;
            }
            return collection;
        }

        @Override // com.google.common.collect.Multimap
        public java.util.Collection<java.util.Map.Entry<K, V>> entries() {
            java.util.Collection<java.util.Map.Entry<K, V>> collection;
            synchronized (this.mutex) {
                if (this.entries == null) {
                    this.entries = com.google.common.collect.Synchronized.typePreservingCollection(delegate().entries(), this.mutex);
                }
                collection = this.entries;
            }
            return collection;
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Map<K, java.util.Collection<V>> asMap() {
            java.util.Map<K, java.util.Collection<V>> map;
            synchronized (this.mutex) {
                if (this.asMap == null) {
                    this.asMap = new com.google.common.collect.Synchronized.SynchronizedAsMap(delegate().asMap(), this.mutex);
                }
                map = this.asMap;
            }
            return map;
        }

        @Override // com.google.common.collect.Multimap
        public com.google.common.collect.Multiset<K> keys() {
            com.google.common.collect.Multiset<K> multiset;
            synchronized (this.mutex) {
                if (this.keys == null) {
                    this.keys = com.google.common.collect.Synchronized.multiset(delegate().keys(), this.mutex);
                }
                multiset = this.keys;
            }
            return multiset;
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
            boolean zEquals;
            if (o == this) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(o);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.Multimap
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }
    }

    static <K, V> com.google.common.collect.ListMultimap<K, V> listMultimap(com.google.common.collect.ListMultimap<K, V> multimap, @javax.annotation.CheckForNull java.lang.Object mutex) {
        return ((multimap instanceof com.google.common.collect.Synchronized.SynchronizedListMultimap) || (multimap instanceof com.google.common.collect.BaseImmutableMultimap)) ? multimap : new com.google.common.collect.Synchronized.SynchronizedListMultimap(multimap, mutex);
    }

    static final class SynchronizedListMultimap<K, V> extends com.google.common.collect.Synchronized.SynchronizedMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedListMultimap(com.google.common.collect.ListMultimap<K, V> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public com.google.common.collect.ListMultimap<K, V> delegate() {
            return (com.google.common.collect.ListMultimap) super.delegate();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.List<V> get(K key) {
            java.util.List<V> list;
            synchronized (this.mutex) {
                list = com.google.common.collect.Synchronized.list(delegate().get((java.lang.Object) key), this.mutex);
            }
            return list;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.List<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
            java.util.List<V> listRemoveAll;
            synchronized (this.mutex) {
                listRemoveAll = delegate().removeAll(key);
            }
            return listRemoveAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.List<V> replaceValues(K key, java.lang.Iterable<? extends V> values) {
            java.util.List<V> listReplaceValues;
            synchronized (this.mutex) {
                listReplaceValues = delegate().replaceValues((java.lang.Object) key, (java.lang.Iterable) values);
            }
            return listReplaceValues;
        }
    }

    static <K, V> com.google.common.collect.SetMultimap<K, V> setMultimap(com.google.common.collect.SetMultimap<K, V> multimap, @javax.annotation.CheckForNull java.lang.Object mutex) {
        return ((multimap instanceof com.google.common.collect.Synchronized.SynchronizedSetMultimap) || (multimap instanceof com.google.common.collect.BaseImmutableMultimap)) ? multimap : new com.google.common.collect.Synchronized.SynchronizedSetMultimap(multimap, mutex);
    }

    static class SynchronizedSetMultimap<K, V> extends com.google.common.collect.Synchronized.SynchronizedMultimap<K, V> implements com.google.common.collect.SetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        @javax.annotation.CheckForNull
        transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;

        SynchronizedSetMultimap(com.google.common.collect.SetMultimap<K, V> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public com.google.common.collect.SetMultimap<K, V> delegate() {
            return (com.google.common.collect.SetMultimap) super.delegate();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> get(K key) {
            java.util.Set<V> set;
            synchronized (this.mutex) {
                set = com.google.common.collect.Synchronized.set(delegate().get((java.lang.Object) key), this.mutex);
            }
            return set;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
            java.util.Set<V> setRemoveAll;
            synchronized (this.mutex) {
                setRemoveAll = delegate().removeAll(key);
            }
            return setRemoveAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> replaceValues(K key, java.lang.Iterable<? extends V> values) {
            java.util.Set<V> setReplaceValues;
            synchronized (this.mutex) {
                setReplaceValues = delegate().replaceValues((java.lang.Object) key, (java.lang.Iterable) values);
            }
            return setReplaceValues;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public java.util.Set<java.util.Map.Entry<K, V>> entries() {
            java.util.Set<java.util.Map.Entry<K, V>> set;
            synchronized (this.mutex) {
                if (this.entrySet == null) {
                    this.entrySet = com.google.common.collect.Synchronized.set(delegate().entries(), this.mutex);
                }
                set = this.entrySet;
            }
            return set;
        }
    }

    static <K, V> com.google.common.collect.SortedSetMultimap<K, V> sortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> multimap, @javax.annotation.CheckForNull java.lang.Object mutex) {
        return multimap instanceof com.google.common.collect.Synchronized.SynchronizedSortedSetMultimap ? multimap : new com.google.common.collect.Synchronized.SynchronizedSortedSetMultimap(multimap, mutex);
    }

    static final class SynchronizedSortedSetMultimap<K, V> extends com.google.common.collect.Synchronized.SynchronizedSetMultimap<K, V> implements com.google.common.collect.SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public com.google.common.collect.SortedSetMultimap<K, V> delegate() {
            return (com.google.common.collect.SortedSetMultimap) super.delegate();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.SortedSet<V> get(K key) {
            java.util.SortedSet<V> sortedSet;
            synchronized (this.mutex) {
                sortedSet = com.google.common.collect.Synchronized.sortedSet(delegate().get((java.lang.Object) key), this.mutex);
            }
            return sortedSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.SortedSet<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
            java.util.SortedSet<V> sortedSetRemoveAll;
            synchronized (this.mutex) {
                sortedSetRemoveAll = delegate().removeAll(key);
            }
            return sortedSetRemoveAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.SortedSet<V> replaceValues(K key, java.lang.Iterable<? extends V> values) {
            java.util.SortedSet<V> sortedSetReplaceValues;
            synchronized (this.mutex) {
                sortedSetReplaceValues = delegate().replaceValues((java.lang.Object) key, (java.lang.Iterable) values);
            }
            return sortedSetReplaceValues;
        }

        @Override // com.google.common.collect.SortedSetMultimap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super V> valueComparator() {
            java.util.Comparator<? super V> comparatorValueComparator;
            synchronized (this.mutex) {
                comparatorValueComparator = delegate().valueComparator();
            }
            return comparatorValueComparator;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.Collection<E> typePreservingCollection(java.util.Collection<E> collection, @javax.annotation.CheckForNull java.lang.Object mutex) {
        if (collection instanceof java.util.SortedSet) {
            return sortedSet((java.util.SortedSet) collection, mutex);
        }
        if (collection instanceof java.util.Set) {
            return set((java.util.Set) collection, mutex);
        }
        if (collection instanceof java.util.List) {
            return list((java.util.List) collection, mutex);
        }
        return collection(collection, mutex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.Set<E> typePreservingSet(java.util.Set<E> set, @javax.annotation.CheckForNull java.lang.Object mutex) {
        if (set instanceof java.util.SortedSet) {
            return sortedSet((java.util.SortedSet) set, mutex);
        }
        return set(set, mutex);
    }

    static final class SynchronizedAsMapEntries<K, V> extends com.google.common.collect.Synchronized.SynchronizedSet<java.util.Map.Entry<K, java.util.Collection<V>>> {
        private static final long serialVersionUID = 0;

        SynchronizedAsMapEntries(java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> iterator() {
            return new com.google.common.collect.TransformedIterator<java.util.Map.Entry<K, java.util.Collection<V>>, java.util.Map.Entry<K, java.util.Collection<V>>>(super.iterator()) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapEntries.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.TransformedIterator
                public java.util.Map.Entry<K, java.util.Collection<V>> transform(final java.util.Map.Entry<K, java.util.Collection<V>> entry) {
                    return new com.google.common.collect.ForwardingMapEntry<K, java.util.Collection<V>>() { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapEntries.1.1
                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                        public java.util.Map.Entry<K, java.util.Collection<V>> delegate() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public java.util.Collection<V> getValue() {
                            return com.google.common.collect.Synchronized.typePreservingCollection((java.util.Collection) entry.getValue(), com.google.common.collect.Synchronized.SynchronizedAsMapEntries.this.mutex);
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
            java.lang.Object[] arrayImpl;
            synchronized (this.mutex) {
                arrayImpl = com.google.common.collect.ObjectArrays.toArrayImpl(delegate());
            }
            return arrayImpl;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.mutex) {
                tArr2 = (T[]) com.google.common.collect.ObjectArrays.toArrayImpl(delegate(), tArr);
            }
            return tArr2;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            boolean zContainsEntryImpl;
            synchronized (this.mutex) {
                zContainsEntryImpl = com.google.common.collect.Maps.containsEntryImpl(delegate(), o);
            }
            return zContainsEntryImpl;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean containsAll(java.util.Collection<?> c) {
            boolean zContainsAllImpl;
            synchronized (this.mutex) {
                zContainsAllImpl = com.google.common.collect.Collections2.containsAllImpl(delegate(), c);
            }
            return zContainsAllImpl;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, java.util.Collection, java.util.Set
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
            boolean zEqualsImpl;
            if (o == this) {
                return true;
            }
            synchronized (this.mutex) {
                zEqualsImpl = com.google.common.collect.Sets.equalsImpl(delegate(), o);
            }
            return zEqualsImpl;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            boolean zRemoveEntryImpl;
            synchronized (this.mutex) {
                zRemoveEntryImpl = com.google.common.collect.Maps.removeEntryImpl(delegate(), o);
            }
            return zRemoveEntryImpl;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> c) {
            boolean zRemoveAll;
            synchronized (this.mutex) {
                zRemoveAll = com.google.common.collect.Iterators.removeAll(delegate().iterator(), c);
            }
            return zRemoveAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> c) {
            boolean zRetainAll;
            synchronized (this.mutex) {
                zRetainAll = com.google.common.collect.Iterators.retainAll(delegate().iterator(), c);
            }
            return zRetainAll;
        }
    }

    static <K, V> java.util.Map<K, V> map(java.util.Map<K, V> map, @javax.annotation.CheckForNull java.lang.Object mutex) {
        return new com.google.common.collect.Synchronized.SynchronizedMap(map, mutex);
    }

    static class SynchronizedMap<K, V> extends com.google.common.collect.Synchronized.SynchronizedObject implements java.util.Map<K, V> {
        private static final long serialVersionUID = 0;

        @javax.annotation.CheckForNull
        transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;

        @javax.annotation.CheckForNull
        transient java.util.Set<K> keySet;

        @javax.annotation.CheckForNull
        transient java.util.Collection<V> values;

        SynchronizedMap(java.util.Map<K, V> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.Map<K, V> delegate() {
            return (java.util.Map) super.delegate();
        }

        @Override // java.util.Map
        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        @Override // java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            boolean zContainsKey;
            synchronized (this.mutex) {
                zContainsKey = delegate().containsKey(key);
            }
            return zContainsKey;
        }

        public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
            boolean zContainsValue;
            synchronized (this.mutex) {
                zContainsValue = delegate().containsValue(value);
            }
            return zContainsValue;
        }

        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            java.util.Set<java.util.Map.Entry<K, V>> set;
            synchronized (this.mutex) {
                if (this.entrySet == null) {
                    this.entrySet = com.google.common.collect.Synchronized.set(delegate().entrySet(), this.mutex);
                }
                set = this.entrySet;
            }
            return set;
        }

        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object key) {
            V v;
            synchronized (this.mutex) {
                v = delegate().get(key);
            }
            return v;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.mutex) {
                zIsEmpty = delegate().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // java.util.Map
        public java.util.Set<K> keySet() {
            java.util.Set<K> set;
            synchronized (this.mutex) {
                if (this.keySet == null) {
                    this.keySet = com.google.common.collect.Synchronized.set(delegate().keySet(), this.mutex);
                }
                set = this.keySet;
            }
            return set;
        }

        @Override // java.util.Map
        @javax.annotation.CheckForNull
        public V put(K key, V value) {
            V vPut;
            synchronized (this.mutex) {
                vPut = delegate().put(key, value);
            }
            return vPut;
        }

        @Override // java.util.Map
        public void putAll(java.util.Map<? extends K, ? extends V> map) {
            synchronized (this.mutex) {
                delegate().putAll(map);
            }
        }

        @Override // java.util.Map
        @javax.annotation.CheckForNull
        public V remove(@javax.annotation.CheckForNull java.lang.Object key) {
            V vRemove;
            synchronized (this.mutex) {
                vRemove = delegate().remove(key);
            }
            return vRemove;
        }

        @Override // java.util.Map
        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        public java.util.Collection<V> values() {
            java.util.Collection<V> collection;
            synchronized (this.mutex) {
                if (this.values == null) {
                    this.values = com.google.common.collect.Synchronized.collection(delegate().values(), this.mutex);
                }
                collection = this.values;
            }
            return collection;
        }

        @Override // java.util.Map
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
            boolean zEquals;
            if (o == this) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(o);
            }
            return zEquals;
        }

        @Override // java.util.Map
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }
    }

    static <K, V> java.util.SortedMap<K, V> sortedMap(java.util.SortedMap<K, V> sortedMap, @javax.annotation.CheckForNull java.lang.Object mutex) {
        return new com.google.common.collect.Synchronized.SynchronizedSortedMap(sortedMap, mutex);
    }

    static class SynchronizedSortedMap<K, V> extends com.google.common.collect.Synchronized.SynchronizedMap<K, V> implements java.util.SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedMap(java.util.SortedMap<K, V> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.SortedMap<K, V> delegate() {
            return (java.util.SortedMap) super.delegate();
        }

        @Override // java.util.SortedMap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
            java.util.Comparator<? super K> comparator;
            synchronized (this.mutex) {
                comparator = delegate().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            K kFirstKey;
            synchronized (this.mutex) {
                kFirstKey = delegate().firstKey();
            }
            return kFirstKey;
        }

        public java.util.SortedMap<K, V> headMap(K toKey) {
            java.util.SortedMap<K, V> sortedMap;
            synchronized (this.mutex) {
                sortedMap = com.google.common.collect.Synchronized.sortedMap(delegate().headMap(toKey), this.mutex);
            }
            return sortedMap;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            K kLastKey;
            synchronized (this.mutex) {
                kLastKey = delegate().lastKey();
            }
            return kLastKey;
        }

        public java.util.SortedMap<K, V> subMap(K fromKey, K toKey) {
            java.util.SortedMap<K, V> sortedMap;
            synchronized (this.mutex) {
                sortedMap = com.google.common.collect.Synchronized.sortedMap(delegate().subMap(fromKey, toKey), this.mutex);
            }
            return sortedMap;
        }

        public java.util.SortedMap<K, V> tailMap(K fromKey) {
            java.util.SortedMap<K, V> sortedMap;
            synchronized (this.mutex) {
                sortedMap = com.google.common.collect.Synchronized.sortedMap(delegate().tailMap(fromKey), this.mutex);
            }
            return sortedMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> com.google.common.collect.BiMap<K, V> biMap(com.google.common.collect.BiMap<K, V> biMap, @javax.annotation.CheckForNull java.lang.Object obj) {
        if ((biMap instanceof com.google.common.collect.Synchronized.SynchronizedBiMap) || (biMap instanceof com.google.common.collect.ImmutableBiMap)) {
            return biMap;
        }
        return new com.google.common.collect.Synchronized.SynchronizedBiMap(biMap, obj, null);
    }

    static final class SynchronizedBiMap<K, V> extends com.google.common.collect.Synchronized.SynchronizedMap<K, V> implements com.google.common.collect.BiMap<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 0;

        @javax.annotation.CheckForNull
        private transient com.google.common.collect.BiMap<V, K> inverse;

        @javax.annotation.CheckForNull
        private transient java.util.Set<V> valueSet;

        private SynchronizedBiMap(com.google.common.collect.BiMap<K, V> delegate, @javax.annotation.CheckForNull java.lang.Object mutex, @javax.annotation.CheckForNull com.google.common.collect.BiMap<V, K> inverse) {
            super(delegate, mutex);
            this.inverse = inverse;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public com.google.common.collect.BiMap<K, V> delegate() {
            return (com.google.common.collect.BiMap) super.delegate();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public java.util.Set<V> values() {
            java.util.Set<V> set;
            synchronized (this.mutex) {
                if (this.valueSet == null) {
                    this.valueSet = com.google.common.collect.Synchronized.set(delegate().values(), this.mutex);
                }
                set = this.valueSet;
            }
            return set;
        }

        @Override // com.google.common.collect.BiMap
        @javax.annotation.CheckForNull
        public V forcePut(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
            V vForcePut;
            synchronized (this.mutex) {
                vForcePut = delegate().forcePut(key, value);
            }
            return vForcePut;
        }

        @Override // com.google.common.collect.BiMap
        public com.google.common.collect.BiMap<V, K> inverse() {
            com.google.common.collect.BiMap<V, K> biMap;
            synchronized (this.mutex) {
                if (this.inverse == null) {
                    this.inverse = new com.google.common.collect.Synchronized.SynchronizedBiMap(delegate().inverse(), this.mutex, this);
                }
                biMap = this.inverse;
            }
            return biMap;
        }
    }

    static final class SynchronizedAsMap<K, V> extends com.google.common.collect.Synchronized.SynchronizedMap<K, java.util.Collection<V>> {
        private static final long serialVersionUID = 0;

        @javax.annotation.CheckForNull
        transient java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> asMapEntrySet;

        @javax.annotation.CheckForNull
        transient java.util.Collection<java.util.Collection<V>> asMapValues;

        SynchronizedAsMap(java.util.Map<K, java.util.Collection<V>> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Collection<V> get(@javax.annotation.CheckForNull java.lang.Object key) {
            java.util.Collection<V> collectionTypePreservingCollection;
            synchronized (this.mutex) {
                java.util.Collection collection = (java.util.Collection) super.get(key);
                collectionTypePreservingCollection = collection == null ? null : com.google.common.collect.Synchronized.typePreservingCollection(collection, this.mutex);
            }
            return collectionTypePreservingCollection;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> entrySet() {
            java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> set;
            synchronized (this.mutex) {
                if (this.asMapEntrySet == null) {
                    this.asMapEntrySet = new com.google.common.collect.Synchronized.SynchronizedAsMapEntries(delegate().entrySet(), this.mutex);
                }
                set = this.asMapEntrySet;
            }
            return set;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public java.util.Collection<java.util.Collection<V>> values() {
            java.util.Collection<java.util.Collection<V>> collection;
            synchronized (this.mutex) {
                if (this.asMapValues == null) {
                    this.asMapValues = new com.google.common.collect.Synchronized.SynchronizedAsMapValues(delegate().values(), this.mutex);
                }
                collection = this.asMapValues;
            }
            return collection;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object o) {
            return values().contains(o);
        }
    }

    static final class SynchronizedAsMapValues<V> extends com.google.common.collect.Synchronized.SynchronizedCollection<java.util.Collection<V>> {
        private static final long serialVersionUID = 0;

        SynchronizedAsMapValues(java.util.Collection<java.util.Collection<V>> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Collection<V>> iterator() {
            return new com.google.common.collect.TransformedIterator<java.util.Collection<V>, java.util.Collection<V>>(super.iterator()) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapValues.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.TransformedIterator
                public java.util.Collection<V> transform(java.util.Collection<V> from) {
                    return com.google.common.collect.Synchronized.typePreservingCollection(from, com.google.common.collect.Synchronized.SynchronizedAsMapValues.this.mutex);
                }
            };
        }
    }

    static final class SynchronizedNavigableSet<E> extends com.google.common.collect.Synchronized.SynchronizedSortedSet<E> implements java.util.NavigableSet<E> {
        private static final long serialVersionUID = 0;

        @javax.annotation.CheckForNull
        transient java.util.NavigableSet<E> descendingSet;

        SynchronizedNavigableSet(java.util.NavigableSet<E> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.NavigableSet<E> delegate() {
            return (java.util.NavigableSet) super.delegate();
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E ceiling(E e) {
            E eCeiling;
            synchronized (this.mutex) {
                eCeiling = delegate().ceiling(e);
            }
            return eCeiling;
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<E> descendingIterator() {
            return delegate().descendingIterator();
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> descendingSet() {
            synchronized (this.mutex) {
                java.util.NavigableSet<E> navigableSet = this.descendingSet;
                if (navigableSet != null) {
                    return navigableSet;
                }
                java.util.NavigableSet<E> navigableSet2 = com.google.common.collect.Synchronized.navigableSet(delegate().descendingSet(), this.mutex);
                this.descendingSet = navigableSet2;
                return navigableSet2;
            }
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E floor(E e) {
            E eFloor;
            synchronized (this.mutex) {
                eFloor = delegate().floor(e);
            }
            return eFloor;
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> headSet(E toElement, boolean inclusive) {
            java.util.NavigableSet<E> navigableSet;
            synchronized (this.mutex) {
                navigableSet = com.google.common.collect.Synchronized.navigableSet(delegate().headSet(toElement, inclusive), this.mutex);
            }
            return navigableSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet<E> headSet(E toElement) {
            return headSet(toElement, false);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E higher(E e) {
            E eHigher;
            synchronized (this.mutex) {
                eHigher = delegate().higher(e);
            }
            return eHigher;
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E lower(E e) {
            E eLower;
            synchronized (this.mutex) {
                eLower = delegate().lower(e);
            }
            return eLower;
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollFirst() {
            E ePollFirst;
            synchronized (this.mutex) {
                ePollFirst = delegate().pollFirst();
            }
            return ePollFirst;
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollLast() {
            E ePollLast;
            synchronized (this.mutex) {
                ePollLast = delegate().pollLast();
            }
            return ePollLast;
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
            java.util.NavigableSet<E> navigableSet;
            synchronized (this.mutex) {
                navigableSet = com.google.common.collect.Synchronized.navigableSet(delegate().subSet(fromElement, fromInclusive, toElement, toInclusive), this.mutex);
            }
            return navigableSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet<E> subSet(E fromElement, E toElement) {
            return subSet(fromElement, true, toElement, false);
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
            java.util.NavigableSet<E> navigableSet;
            synchronized (this.mutex) {
                navigableSet = com.google.common.collect.Synchronized.navigableSet(delegate().tailSet(fromElement, inclusive), this.mutex);
            }
            return navigableSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet<E> tailSet(E fromElement) {
            return tailSet(fromElement, true);
        }
    }

    static <E> java.util.NavigableSet<E> navigableSet(java.util.NavigableSet<E> navigableSet, @javax.annotation.CheckForNull java.lang.Object mutex) {
        return new com.google.common.collect.Synchronized.SynchronizedNavigableSet(navigableSet, mutex);
    }

    static <E> java.util.NavigableSet<E> navigableSet(java.util.NavigableSet<E> navigableSet) {
        return navigableSet(navigableSet, null);
    }

    static <K, V> java.util.NavigableMap<K, V> navigableMap(java.util.NavigableMap<K, V> navigableMap) {
        return navigableMap(navigableMap, null);
    }

    static <K, V> java.util.NavigableMap<K, V> navigableMap(java.util.NavigableMap<K, V> navigableMap, @javax.annotation.CheckForNull java.lang.Object mutex) {
        return new com.google.common.collect.Synchronized.SynchronizedNavigableMap(navigableMap, mutex);
    }

    static final class SynchronizedNavigableMap<K, V> extends com.google.common.collect.Synchronized.SynchronizedSortedMap<K, V> implements java.util.NavigableMap<K, V> {
        private static final long serialVersionUID = 0;

        @javax.annotation.CheckForNull
        transient java.util.NavigableSet<K> descendingKeySet;

        @javax.annotation.CheckForNull
        transient java.util.NavigableMap<K, V> descendingMap;

        @javax.annotation.CheckForNull
        transient java.util.NavigableSet<K> navigableKeySet;

        SynchronizedNavigableMap(java.util.NavigableMap<K, V> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.NavigableMap<K, V> delegate() {
            return (java.util.NavigableMap) super.delegate();
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> ceilingEntry(K key) {
            java.util.Map.Entry<K, V> entryNullableSynchronizedEntry;
            synchronized (this.mutex) {
                entryNullableSynchronizedEntry = com.google.common.collect.Synchronized.nullableSynchronizedEntry(delegate().ceilingEntry(key), this.mutex);
            }
            return entryNullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K ceilingKey(K key) {
            K kCeilingKey;
            synchronized (this.mutex) {
                kCeilingKey = delegate().ceilingKey(key);
            }
            return kCeilingKey;
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> descendingKeySet() {
            synchronized (this.mutex) {
                java.util.NavigableSet<K> navigableSet = this.descendingKeySet;
                if (navigableSet != null) {
                    return navigableSet;
                }
                java.util.NavigableSet<K> navigableSet2 = com.google.common.collect.Synchronized.navigableSet(delegate().descendingKeySet(), this.mutex);
                this.descendingKeySet = navigableSet2;
                return navigableSet2;
            }
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> descendingMap() {
            synchronized (this.mutex) {
                java.util.NavigableMap<K, V> navigableMap = this.descendingMap;
                if (navigableMap != null) {
                    return navigableMap;
                }
                java.util.NavigableMap<K, V> navigableMap2 = com.google.common.collect.Synchronized.navigableMap(delegate().descendingMap(), this.mutex);
                this.descendingMap = navigableMap2;
                return navigableMap2;
            }
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> firstEntry() {
            java.util.Map.Entry<K, V> entryNullableSynchronizedEntry;
            synchronized (this.mutex) {
                entryNullableSynchronizedEntry = com.google.common.collect.Synchronized.nullableSynchronizedEntry(delegate().firstEntry(), this.mutex);
            }
            return entryNullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> floorEntry(K key) {
            java.util.Map.Entry<K, V> entryNullableSynchronizedEntry;
            synchronized (this.mutex) {
                entryNullableSynchronizedEntry = com.google.common.collect.Synchronized.nullableSynchronizedEntry(delegate().floorEntry(key), this.mutex);
            }
            return entryNullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K floorKey(K key) {
            K kFloorKey;
            synchronized (this.mutex) {
                kFloorKey = delegate().floorKey(key);
            }
            return kFloorKey;
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> headMap(K toKey, boolean inclusive) {
            java.util.NavigableMap<K, V> navigableMap;
            synchronized (this.mutex) {
                navigableMap = com.google.common.collect.Synchronized.navigableMap(delegate().headMap(toKey, inclusive), this.mutex);
            }
            return navigableMap;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.SortedMap<K, V> headMap(K toKey) {
            return headMap(toKey, false);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> higherEntry(K key) {
            java.util.Map.Entry<K, V> entryNullableSynchronizedEntry;
            synchronized (this.mutex) {
                entryNullableSynchronizedEntry = com.google.common.collect.Synchronized.nullableSynchronizedEntry(delegate().higherEntry(key), this.mutex);
            }
            return entryNullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K higherKey(K key) {
            K kHigherKey;
            synchronized (this.mutex) {
                kHigherKey = delegate().higherKey(key);
            }
            return kHigherKey;
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> lastEntry() {
            java.util.Map.Entry<K, V> entryNullableSynchronizedEntry;
            synchronized (this.mutex) {
                entryNullableSynchronizedEntry = com.google.common.collect.Synchronized.nullableSynchronizedEntry(delegate().lastEntry(), this.mutex);
            }
            return entryNullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> lowerEntry(K key) {
            java.util.Map.Entry<K, V> entryNullableSynchronizedEntry;
            synchronized (this.mutex) {
                entryNullableSynchronizedEntry = com.google.common.collect.Synchronized.nullableSynchronizedEntry(delegate().lowerEntry(key), this.mutex);
            }
            return entryNullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K lowerKey(K key) {
            K kLowerKey;
            synchronized (this.mutex) {
                kLowerKey = delegate().lowerKey(key);
            }
            return kLowerKey;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public java.util.Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> navigableKeySet() {
            synchronized (this.mutex) {
                java.util.NavigableSet<K> navigableSet = this.navigableKeySet;
                if (navigableSet != null) {
                    return navigableSet;
                }
                java.util.NavigableSet<K> navigableSet2 = com.google.common.collect.Synchronized.navigableSet(delegate().navigableKeySet(), this.mutex);
                this.navigableKeySet = navigableSet2;
                return navigableSet2;
            }
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> pollFirstEntry() {
            java.util.Map.Entry<K, V> entryNullableSynchronizedEntry;
            synchronized (this.mutex) {
                entryNullableSynchronizedEntry = com.google.common.collect.Synchronized.nullableSynchronizedEntry(delegate().pollFirstEntry(), this.mutex);
            }
            return entryNullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, V> pollLastEntry() {
            java.util.Map.Entry<K, V> entryNullableSynchronizedEntry;
            synchronized (this.mutex) {
                entryNullableSynchronizedEntry = com.google.common.collect.Synchronized.nullableSynchronizedEntry(delegate().pollLastEntry(), this.mutex);
            }
            return entryNullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) {
            java.util.NavigableMap<K, V> navigableMap;
            synchronized (this.mutex) {
                navigableMap = com.google.common.collect.Synchronized.navigableMap(delegate().subMap(fromKey, fromInclusive, toKey, toInclusive), this.mutex);
            }
            return navigableMap;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.SortedMap<K, V> subMap(K fromKey, K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> tailMap(K fromKey, boolean inclusive) {
            java.util.NavigableMap<K, V> navigableMap;
            synchronized (this.mutex) {
                navigableMap = com.google.common.collect.Synchronized.navigableMap(delegate().tailMap(fromKey, inclusive), this.mutex);
            }
            return navigableMap;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.SortedMap<K, V> tailMap(K fromKey) {
            return tailMap(fromKey, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @javax.annotation.CheckForNull
    public static <K, V> java.util.Map.Entry<K, V> nullableSynchronizedEntry(@javax.annotation.CheckForNull java.util.Map.Entry<K, V> entry, @javax.annotation.CheckForNull java.lang.Object mutex) {
        if (entry == null) {
            return null;
        }
        return new com.google.common.collect.Synchronized.SynchronizedEntry(entry, mutex);
    }

    static final class SynchronizedEntry<K, V> extends com.google.common.collect.Synchronized.SynchronizedObject implements java.util.Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedEntry(java.util.Map.Entry<K, V> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.Map.Entry<K, V> delegate() {
            return (java.util.Map.Entry) super.delegate();
        }

        @Override // java.util.Map.Entry
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            boolean zEquals;
            synchronized (this.mutex) {
                zEquals = delegate().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            K key;
            synchronized (this.mutex) {
                key = delegate().getKey();
            }
            return key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            V value;
            synchronized (this.mutex) {
                value = delegate().getValue();
            }
            return value;
        }

        @Override // java.util.Map.Entry
        public V setValue(V value) {
            V value2;
            synchronized (this.mutex) {
                value2 = delegate().setValue(value);
            }
            return value2;
        }
    }

    static <E> java.util.Queue<E> queue(java.util.Queue<E> queue, @javax.annotation.CheckForNull java.lang.Object mutex) {
        return queue instanceof com.google.common.collect.Synchronized.SynchronizedQueue ? queue : new com.google.common.collect.Synchronized.SynchronizedQueue(queue, mutex);
    }

    static class SynchronizedQueue<E> extends com.google.common.collect.Synchronized.SynchronizedCollection<E> implements java.util.Queue<E> {
        private static final long serialVersionUID = 0;

        SynchronizedQueue(java.util.Queue<E> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.Queue<E> delegate() {
            return (java.util.Queue) super.delegate();
        }

        @Override // java.util.Queue
        public E element() {
            E eElement;
            synchronized (this.mutex) {
                eElement = delegate().element();
            }
            return eElement;
        }

        @Override // java.util.Queue
        public boolean offer(E e) {
            boolean zOffer;
            synchronized (this.mutex) {
                zOffer = delegate().offer(e);
            }
            return zOffer;
        }

        @Override // java.util.Queue
        @javax.annotation.CheckForNull
        public E peek() {
            E ePeek;
            synchronized (this.mutex) {
                ePeek = delegate().peek();
            }
            return ePeek;
        }

        @Override // java.util.Queue
        @javax.annotation.CheckForNull
        public E poll() {
            E ePoll;
            synchronized (this.mutex) {
                ePoll = delegate().poll();
            }
            return ePoll;
        }

        @Override // java.util.Queue
        public E remove() {
            E eRemove;
            synchronized (this.mutex) {
                eRemove = delegate().remove();
            }
            return eRemove;
        }
    }

    static <E> java.util.Deque<E> deque(java.util.Deque<E> deque, @javax.annotation.CheckForNull java.lang.Object mutex) {
        return new com.google.common.collect.Synchronized.SynchronizedDeque(deque, mutex);
    }

    static final class SynchronizedDeque<E> extends com.google.common.collect.Synchronized.SynchronizedQueue<E> implements java.util.Deque<E> {
        private static final long serialVersionUID = 0;

        SynchronizedDeque(java.util.Deque<E> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.Deque<E> delegate() {
            return (java.util.Deque) super.delegate();
        }

        @Override // java.util.Deque
        public void addFirst(E e) {
            synchronized (this.mutex) {
                delegate().addFirst(e);
            }
        }

        @Override // java.util.Deque
        public void addLast(E e) {
            synchronized (this.mutex) {
                delegate().addLast(e);
            }
        }

        @Override // java.util.Deque
        public boolean offerFirst(E e) {
            boolean zOfferFirst;
            synchronized (this.mutex) {
                zOfferFirst = delegate().offerFirst(e);
            }
            return zOfferFirst;
        }

        @Override // java.util.Deque
        public boolean offerLast(E e) {
            boolean zOfferLast;
            synchronized (this.mutex) {
                zOfferLast = delegate().offerLast(e);
            }
            return zOfferLast;
        }

        @Override // java.util.Deque
        public E removeFirst() {
            E eRemoveFirst;
            synchronized (this.mutex) {
                eRemoveFirst = delegate().removeFirst();
            }
            return eRemoveFirst;
        }

        @Override // java.util.Deque
        public E removeLast() {
            E eRemoveLast;
            synchronized (this.mutex) {
                eRemoveLast = delegate().removeLast();
            }
            return eRemoveLast;
        }

        @Override // java.util.Deque
        @javax.annotation.CheckForNull
        public E pollFirst() {
            E ePollFirst;
            synchronized (this.mutex) {
                ePollFirst = delegate().pollFirst();
            }
            return ePollFirst;
        }

        @Override // java.util.Deque
        @javax.annotation.CheckForNull
        public E pollLast() {
            E ePollLast;
            synchronized (this.mutex) {
                ePollLast = delegate().pollLast();
            }
            return ePollLast;
        }

        @Override // java.util.Deque
        public E getFirst() {
            E first;
            synchronized (this.mutex) {
                first = delegate().getFirst();
            }
            return first;
        }

        @Override // java.util.Deque
        public E getLast() {
            E last;
            synchronized (this.mutex) {
                last = delegate().getLast();
            }
            return last;
        }

        @Override // java.util.Deque
        @javax.annotation.CheckForNull
        public E peekFirst() {
            E ePeekFirst;
            synchronized (this.mutex) {
                ePeekFirst = delegate().peekFirst();
            }
            return ePeekFirst;
        }

        @Override // java.util.Deque
        @javax.annotation.CheckForNull
        public E peekLast() {
            E ePeekLast;
            synchronized (this.mutex) {
                ePeekLast = delegate().peekLast();
            }
            return ePeekLast;
        }

        @Override // java.util.Deque
        public boolean removeFirstOccurrence(@javax.annotation.CheckForNull java.lang.Object o) {
            boolean zRemoveFirstOccurrence;
            synchronized (this.mutex) {
                zRemoveFirstOccurrence = delegate().removeFirstOccurrence(o);
            }
            return zRemoveFirstOccurrence;
        }

        @Override // java.util.Deque
        public boolean removeLastOccurrence(@javax.annotation.CheckForNull java.lang.Object o) {
            boolean zRemoveLastOccurrence;
            synchronized (this.mutex) {
                zRemoveLastOccurrence = delegate().removeLastOccurrence(o);
            }
            return zRemoveLastOccurrence;
        }

        @Override // java.util.Deque
        public void push(E e) {
            synchronized (this.mutex) {
                delegate().push(e);
            }
        }

        @Override // java.util.Deque
        public E pop() {
            E ePop;
            synchronized (this.mutex) {
                ePop = delegate().pop();
            }
            return ePop;
        }

        @Override // java.util.Deque
        public java.util.Iterator<E> descendingIterator() {
            java.util.Iterator<E> itDescendingIterator;
            synchronized (this.mutex) {
                itDescendingIterator = delegate().descendingIterator();
            }
            return itDescendingIterator;
        }
    }

    static <R, C, V> com.google.common.collect.Table<R, C, V> table(com.google.common.collect.Table<R, C, V> table, @javax.annotation.CheckForNull java.lang.Object mutex) {
        return new com.google.common.collect.Synchronized.SynchronizedTable(table, mutex);
    }

    static final class SynchronizedTable<R, C, V> extends com.google.common.collect.Synchronized.SynchronizedObject implements com.google.common.collect.Table<R, C, V> {
        SynchronizedTable(com.google.common.collect.Table<R, C, V> delegate, @javax.annotation.CheckForNull java.lang.Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public com.google.common.collect.Table<R, C, V> delegate() {
            return (com.google.common.collect.Table) super.delegate();
        }

        @Override // com.google.common.collect.Table
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
            boolean zContains;
            synchronized (this.mutex) {
                zContains = delegate().contains(rowKey, columnKey);
            }
            return zContains;
        }

        @Override // com.google.common.collect.Table
        public boolean containsRow(@javax.annotation.CheckForNull java.lang.Object rowKey) {
            boolean zContainsRow;
            synchronized (this.mutex) {
                zContainsRow = delegate().containsRow(rowKey);
            }
            return zContainsRow;
        }

        @Override // com.google.common.collect.Table
        public boolean containsColumn(@javax.annotation.CheckForNull java.lang.Object columnKey) {
            boolean zContainsColumn;
            synchronized (this.mutex) {
                zContainsColumn = delegate().containsColumn(columnKey);
            }
            return zContainsColumn;
        }

        @Override // com.google.common.collect.Table
        public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
            boolean zContainsValue;
            synchronized (this.mutex) {
                zContainsValue = delegate().containsValue(value);
            }
            return zContainsValue;
        }

        @Override // com.google.common.collect.Table
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
            V v;
            synchronized (this.mutex) {
                v = delegate().get(rowKey, columnKey);
            }
            return v;
        }

        @Override // com.google.common.collect.Table
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.mutex) {
                zIsEmpty = delegate().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // com.google.common.collect.Table
        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        @Override // com.google.common.collect.Table
        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        @Override // com.google.common.collect.Table
        @javax.annotation.CheckForNull
        public V put(@com.google.common.collect.ParametricNullness R rowKey, @com.google.common.collect.ParametricNullness C columnKey, @com.google.common.collect.ParametricNullness V value) {
            V vPut;
            synchronized (this.mutex) {
                vPut = delegate().put(rowKey, columnKey, value);
            }
            return vPut;
        }

        @Override // com.google.common.collect.Table
        public void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
            synchronized (this.mutex) {
                delegate().putAll(table);
            }
        }

        @Override // com.google.common.collect.Table
        @javax.annotation.CheckForNull
        public V remove(@javax.annotation.CheckForNull java.lang.Object rowKey, @javax.annotation.CheckForNull java.lang.Object columnKey) {
            V vRemove;
            synchronized (this.mutex) {
                vRemove = delegate().remove(rowKey, columnKey);
            }
            return vRemove;
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<C, V> row(@com.google.common.collect.ParametricNullness R rowKey) {
            java.util.Map<C, V> map;
            synchronized (this.mutex) {
                map = com.google.common.collect.Synchronized.map(delegate().row(rowKey), this.mutex);
            }
            return map;
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<R, V> column(@com.google.common.collect.ParametricNullness C columnKey) {
            java.util.Map<R, V> map;
            synchronized (this.mutex) {
                map = com.google.common.collect.Synchronized.map(delegate().column(columnKey), this.mutex);
            }
            return map;
        }

        @Override // com.google.common.collect.Table
        public java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
            java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> set;
            synchronized (this.mutex) {
                set = com.google.common.collect.Synchronized.set(delegate().cellSet(), this.mutex);
            }
            return set;
        }

        @Override // com.google.common.collect.Table
        public java.util.Set<R> rowKeySet() {
            java.util.Set<R> set;
            synchronized (this.mutex) {
                set = com.google.common.collect.Synchronized.set(delegate().rowKeySet(), this.mutex);
            }
            return set;
        }

        @Override // com.google.common.collect.Table
        public java.util.Set<C> columnKeySet() {
            java.util.Set<C> set;
            synchronized (this.mutex) {
                set = com.google.common.collect.Synchronized.set(delegate().columnKeySet(), this.mutex);
            }
            return set;
        }

        @Override // com.google.common.collect.Table
        public java.util.Collection<V> values() {
            java.util.Collection<V> collection;
            synchronized (this.mutex) {
                collection = com.google.common.collect.Synchronized.collection(delegate().values(), this.mutex);
            }
            return collection;
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<R, java.util.Map<C, V>> rowMap() {
            java.util.Map<R, java.util.Map<C, V>> map;
            synchronized (this.mutex) {
                map = com.google.common.collect.Synchronized.map(com.google.common.collect.Maps.transformValues(delegate().rowMap(), new com.google.common.base.Function<java.util.Map<C, V>, java.util.Map<C, V>>() { // from class: com.google.common.collect.Synchronized.SynchronizedTable.1
                    @Override // com.google.common.base.Function
                    public java.util.Map<C, V> apply(java.util.Map<C, V> t) {
                        return com.google.common.collect.Synchronized.map(t, com.google.common.collect.Synchronized.SynchronizedTable.this.mutex);
                    }
                }), this.mutex);
            }
            return map;
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<C, java.util.Map<R, V>> columnMap() {
            java.util.Map<C, java.util.Map<R, V>> map;
            synchronized (this.mutex) {
                map = com.google.common.collect.Synchronized.map(com.google.common.collect.Maps.transformValues(delegate().columnMap(), new com.google.common.base.Function<java.util.Map<R, V>, java.util.Map<R, V>>() { // from class: com.google.common.collect.Synchronized.SynchronizedTable.2
                    @Override // com.google.common.base.Function
                    public java.util.Map<R, V> apply(java.util.Map<R, V> t) {
                        return com.google.common.collect.Synchronized.map(t, com.google.common.collect.Synchronized.SynchronizedTable.this.mutex);
                    }
                }), this.mutex);
            }
            return map;
        }

        @Override // com.google.common.collect.Table
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.Table
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            boolean zEquals;
            if (this == obj) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(obj);
            }
            return zEquals;
        }
    }
}
