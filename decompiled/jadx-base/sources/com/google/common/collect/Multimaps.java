package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Multimaps {
    private Multimaps() {
    }

    static <T, K, V, M extends com.google.common.collect.Multimap<K, V>> java.util.stream.Collector<T, ?, M> toMultimap(java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends V> valueFunction, java.util.function.Supplier<M> multimapSupplier) {
        return com.google.common.collect.CollectCollectors.toMultimap(keyFunction, valueFunction, multimapSupplier);
    }

    static <T, K, V, M extends com.google.common.collect.Multimap<K, V>> java.util.stream.Collector<T, ?, M> flatteningToMultimap(java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>> valueFunction, java.util.function.Supplier<M> multimapSupplier) {
        return com.google.common.collect.CollectCollectors.flatteningToMultimap(keyFunction, valueFunction, multimapSupplier);
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> newMultimap(java.util.Map<K, java.util.Collection<V>> map, final com.google.common.base.Supplier<? extends java.util.Collection<V>> factory) {
        return new com.google.common.collect.Multimaps.CustomMultimap(map, factory);
    }

    private static class CustomMultimap<K, V> extends com.google.common.collect.AbstractMapBasedMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient com.google.common.base.Supplier<? extends java.util.Collection<V>> factory;

        CustomMultimap(java.util.Map<K, java.util.Collection<V>> map, com.google.common.base.Supplier<? extends java.util.Collection<V>> factory) {
            super(map);
            this.factory = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(factory);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        java.util.Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        java.util.Map<K, java.util.Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        protected java.util.Collection<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        <E> java.util.Collection<E> unmodifiableCollectionSubclass(java.util.Collection<E> collection) {
            if (collection instanceof java.util.NavigableSet) {
                return com.google.common.collect.Sets.unmodifiableNavigableSet((java.util.NavigableSet) collection);
            }
            if (collection instanceof java.util.SortedSet) {
                return java.util.Collections.unmodifiableSortedSet((java.util.SortedSet) collection);
            }
            if (collection instanceof java.util.Set) {
                return java.util.Collections.unmodifiableSet((java.util.Set) collection);
            }
            if (collection instanceof java.util.List) {
                return java.util.Collections.unmodifiableList((java.util.List) collection);
            }
            return java.util.Collections.unmodifiableCollection(collection);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        java.util.Collection<V> wrapCollection(@com.google.common.collect.ParametricNullness K key, java.util.Collection<V> collection) {
            if (collection instanceof java.util.List) {
                return wrapList(key, (java.util.List) collection, null);
            }
            if (collection instanceof java.util.NavigableSet) {
                return new com.google.common.collect.AbstractMapBasedMultimap.WrappedNavigableSet(key, (java.util.NavigableSet) collection, null);
            }
            if (collection instanceof java.util.SortedSet) {
                return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet(key, (java.util.SortedSet) collection, null);
            }
            if (collection instanceof java.util.Set) {
                return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSet(key, (java.util.Set) collection);
            }
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection(key, collection, null);
        }

        private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
            stream.defaultWriteObject();
            stream.writeObject(this.factory);
            stream.writeObject(backingMap());
        }

        private void readObject(java.io.ObjectInputStream stream) throws java.lang.ClassNotFoundException, java.io.IOException {
            stream.defaultReadObject();
            this.factory = (com.google.common.base.Supplier) java.util.Objects.requireNonNull(stream.readObject());
            setMap((java.util.Map) java.util.Objects.requireNonNull(stream.readObject()));
        }
    }

    public static <K, V> com.google.common.collect.ListMultimap<K, V> newListMultimap(java.util.Map<K, java.util.Collection<V>> map, final com.google.common.base.Supplier<? extends java.util.List<V>> factory) {
        return new com.google.common.collect.Multimaps.CustomListMultimap(map, factory);
    }

    private static class CustomListMultimap<K, V> extends com.google.common.collect.AbstractListMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient com.google.common.base.Supplier<? extends java.util.List<V>> factory;

        CustomListMultimap(java.util.Map<K, java.util.Collection<V>> map, com.google.common.base.Supplier<? extends java.util.List<V>> factory) {
            super(map);
            this.factory = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(factory);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        java.util.Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        java.util.Map<K, java.util.Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public java.util.List<V> createCollection() {
            return this.factory.get();
        }

        private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
            stream.defaultWriteObject();
            stream.writeObject(this.factory);
            stream.writeObject(backingMap());
        }

        private void readObject(java.io.ObjectInputStream stream) throws java.lang.ClassNotFoundException, java.io.IOException {
            stream.defaultReadObject();
            this.factory = (com.google.common.base.Supplier) java.util.Objects.requireNonNull(stream.readObject());
            setMap((java.util.Map) java.util.Objects.requireNonNull(stream.readObject()));
        }
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> newSetMultimap(java.util.Map<K, java.util.Collection<V>> map, final com.google.common.base.Supplier<? extends java.util.Set<V>> factory) {
        return new com.google.common.collect.Multimaps.CustomSetMultimap(map, factory);
    }

    private static class CustomSetMultimap<K, V> extends com.google.common.collect.AbstractSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient com.google.common.base.Supplier<? extends java.util.Set<V>> factory;

        CustomSetMultimap(java.util.Map<K, java.util.Collection<V>> map, com.google.common.base.Supplier<? extends java.util.Set<V>> factory) {
            super(map);
            this.factory = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(factory);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        java.util.Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        java.util.Map<K, java.util.Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public java.util.Set<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        <E> java.util.Collection<E> unmodifiableCollectionSubclass(java.util.Collection<E> collection) {
            if (collection instanceof java.util.NavigableSet) {
                return com.google.common.collect.Sets.unmodifiableNavigableSet((java.util.NavigableSet) collection);
            }
            if (collection instanceof java.util.SortedSet) {
                return java.util.Collections.unmodifiableSortedSet((java.util.SortedSet) collection);
            }
            return java.util.Collections.unmodifiableSet((java.util.Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        java.util.Collection<V> wrapCollection(@com.google.common.collect.ParametricNullness K key, java.util.Collection<V> collection) {
            if (collection instanceof java.util.NavigableSet) {
                return new com.google.common.collect.AbstractMapBasedMultimap.WrappedNavigableSet(key, (java.util.NavigableSet) collection, null);
            }
            if (collection instanceof java.util.SortedSet) {
                return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet(key, (java.util.SortedSet) collection, null);
            }
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSet(key, (java.util.Set) collection);
        }

        private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
            stream.defaultWriteObject();
            stream.writeObject(this.factory);
            stream.writeObject(backingMap());
        }

        private void readObject(java.io.ObjectInputStream stream) throws java.lang.ClassNotFoundException, java.io.IOException {
            stream.defaultReadObject();
            this.factory = (com.google.common.base.Supplier) java.util.Objects.requireNonNull(stream.readObject());
            setMap((java.util.Map) java.util.Objects.requireNonNull(stream.readObject()));
        }
    }

    public static <K, V> com.google.common.collect.SortedSetMultimap<K, V> newSortedSetMultimap(java.util.Map<K, java.util.Collection<V>> map, final com.google.common.base.Supplier<? extends java.util.SortedSet<V>> factory) {
        return new com.google.common.collect.Multimaps.CustomSortedSetMultimap(map, factory);
    }

    private static class CustomSortedSetMultimap<K, V> extends com.google.common.collect.AbstractSortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient com.google.common.base.Supplier<? extends java.util.SortedSet<V>> factory;

        @javax.annotation.CheckForNull
        transient java.util.Comparator<? super V> valueComparator;

        CustomSortedSetMultimap(java.util.Map<K, java.util.Collection<V>> map, com.google.common.base.Supplier<? extends java.util.SortedSet<V>> factory) {
            super(map);
            this.factory = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(factory);
            this.valueComparator = factory.get().comparator();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        java.util.Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        java.util.Map<K, java.util.Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public java.util.SortedSet<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.SortedSetMultimap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super V> valueComparator() {
            return this.valueComparator;
        }

        private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
            stream.defaultWriteObject();
            stream.writeObject(this.factory);
            stream.writeObject(backingMap());
        }

        private void readObject(java.io.ObjectInputStream stream) throws java.lang.ClassNotFoundException, java.io.IOException {
            stream.defaultReadObject();
            com.google.common.base.Supplier<? extends java.util.SortedSet<V>> supplier = (com.google.common.base.Supplier) java.util.Objects.requireNonNull(stream.readObject());
            this.factory = supplier;
            this.valueComparator = supplier.get().comparator();
            setMap((java.util.Map) java.util.Objects.requireNonNull(stream.readObject()));
        }
    }

    public static <K, V, M extends com.google.common.collect.Multimap<K, V>> M invertFrom(com.google.common.collect.Multimap<? extends V, ? extends K> source, M dest) {
        com.google.common.base.Preconditions.checkNotNull(dest);
        for (java.util.Map.Entry<? extends V, ? extends K> entry : source.entries()) {
            dest.put(entry.getValue(), entry.getKey());
        }
        return dest;
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> synchronizedMultimap(com.google.common.collect.Multimap<K, V> multimap) {
        return com.google.common.collect.Synchronized.multimap(multimap, null);
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> unmodifiableMultimap(com.google.common.collect.Multimap<K, V> delegate) {
        return ((delegate instanceof com.google.common.collect.Multimaps.UnmodifiableMultimap) || (delegate instanceof com.google.common.collect.ImmutableMultimap)) ? delegate : new com.google.common.collect.Multimaps.UnmodifiableMultimap(delegate);
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.Multimap<K, V> unmodifiableMultimap(com.google.common.collect.ImmutableMultimap<K, V> delegate) {
        return (com.google.common.collect.Multimap) com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class UnmodifiableMultimap<K, V> extends com.google.common.collect.ForwardingMultimap<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.Multimap<K, V> delegate;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        transient java.util.Collection<java.util.Map.Entry<K, V>> entries;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        transient java.util.Set<K> keySet;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        transient com.google.common.collect.Multiset<K> keys;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        transient java.util.Map<K, java.util.Collection<V>> map;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        transient java.util.Collection<V> values;

        UnmodifiableMultimap(final com.google.common.collect.Multimap<K, V> delegate) {
            this.delegate = (com.google.common.collect.Multimap) com.google.common.base.Preconditions.checkNotNull(delegate);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public com.google.common.collect.Multimap<K, V> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public void clear() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Map<K, java.util.Collection<V>> asMap() {
            java.util.Map<K, java.util.Collection<V>> map = this.map;
            if (map != null) {
                return map;
            }
            java.util.Map<K, java.util.Collection<V>> mapUnmodifiableMap = java.util.Collections.unmodifiableMap(com.google.common.collect.Maps.transformValues(this.delegate.asMap(), new com.google.common.base.Function() { // from class: com.google.common.collect.Multimaps$UnmodifiableMultimap$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.collect.Multimaps.unmodifiableValueCollection((java.util.Collection) obj);
                }
            }));
            this.map = mapUnmodifiableMap;
            return mapUnmodifiableMap;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public java.util.Collection<java.util.Map.Entry<K, V>> entries() {
            java.util.Collection<java.util.Map.Entry<K, V>> collection = this.entries;
            if (collection != null) {
                return collection;
            }
            java.util.Collection<java.util.Map.Entry<K, V>> collectionUnmodifiableEntries = com.google.common.collect.Multimaps.unmodifiableEntries(this.delegate.entries());
            this.entries = collectionUnmodifiableEntries;
            return collectionUnmodifiableEntries;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V> get(@com.google.common.collect.ParametricNullness K key) {
            return com.google.common.collect.Multimaps.unmodifiableValueCollection(this.delegate.get(key));
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public com.google.common.collect.Multiset<K> keys() {
            com.google.common.collect.Multiset<K> multiset = this.keys;
            if (multiset != null) {
                return multiset;
            }
            com.google.common.collect.Multiset<K> multisetUnmodifiableMultiset = com.google.common.collect.Multisets.unmodifiableMultiset(this.delegate.keys());
            this.keys = multisetUnmodifiableMultiset;
            return multisetUnmodifiableMultiset;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public java.util.Set<K> keySet() {
            java.util.Set<K> set = this.keySet;
            if (set != null) {
                return set;
            }
            java.util.Set<K> setUnmodifiableSet = java.util.Collections.unmodifiableSet(this.delegate.keySet());
            this.keySet = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean putAll(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public java.util.Collection<V> values() {
            java.util.Collection<V> collection = this.values;
            if (collection != null) {
                return collection;
            }
            java.util.Collection<V> collectionUnmodifiableCollection = java.util.Collections.unmodifiableCollection(this.delegate.values());
            this.values = collectionUnmodifiableCollection;
            return collectionUnmodifiableCollection;
        }
    }

    private static class UnmodifiableListMultimap<K, V> extends com.google.common.collect.Multimaps.UnmodifiableMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        UnmodifiableListMultimap(com.google.common.collect.ListMultimap<K, V> delegate) {
            super(delegate);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public com.google.common.collect.ListMultimap<K, V> delegate() {
            return (com.google.common.collect.ListMultimap) super.delegate();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.List<V> get(@com.google.common.collect.ParametricNullness K key) {
            return java.util.Collections.unmodifiableList(delegate().get((java.lang.Object) key));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.List<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.List<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private static class UnmodifiableSetMultimap<K, V> extends com.google.common.collect.Multimaps.UnmodifiableMultimap<K, V> implements com.google.common.collect.SetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        UnmodifiableSetMultimap(com.google.common.collect.SetMultimap<K, V> delegate) {
            super(delegate);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public com.google.common.collect.SetMultimap<K, V> delegate() {
            return (com.google.common.collect.SetMultimap) super.delegate();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> get(@com.google.common.collect.ParametricNullness K key) {
            return java.util.Collections.unmodifiableSet(delegate().get((java.lang.Object) key));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public java.util.Set<java.util.Map.Entry<K, V>> entries() {
            return com.google.common.collect.Maps.unmodifiableEntrySet(delegate().entries());
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private static class UnmodifiableSortedSetMultimap<K, V> extends com.google.common.collect.Multimaps.UnmodifiableSetMultimap<K, V> implements com.google.common.collect.SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        UnmodifiableSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> delegate) {
            super(delegate);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public com.google.common.collect.SortedSetMultimap<K, V> delegate() {
            return (com.google.common.collect.SortedSetMultimap) super.delegate();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.SortedSet<V> get(@com.google.common.collect.ParametricNullness K key) {
            return java.util.Collections.unmodifiableSortedSet(delegate().get((java.lang.Object) key));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.SortedSet<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.SortedSet<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.SortedSetMultimap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super V> valueComparator() {
            return delegate().valueComparator();
        }
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> synchronizedSetMultimap(com.google.common.collect.SetMultimap<K, V> multimap) {
        return com.google.common.collect.Synchronized.setMultimap(multimap, null);
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> unmodifiableSetMultimap(com.google.common.collect.SetMultimap<K, V> delegate) {
        return ((delegate instanceof com.google.common.collect.Multimaps.UnmodifiableSetMultimap) || (delegate instanceof com.google.common.collect.ImmutableSetMultimap)) ? delegate : new com.google.common.collect.Multimaps.UnmodifiableSetMultimap(delegate);
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.SetMultimap<K, V> unmodifiableSetMultimap(com.google.common.collect.ImmutableSetMultimap<K, V> delegate) {
        return (com.google.common.collect.SetMultimap) com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    public static <K, V> com.google.common.collect.SortedSetMultimap<K, V> synchronizedSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> multimap) {
        return com.google.common.collect.Synchronized.sortedSetMultimap(multimap, null);
    }

    public static <K, V> com.google.common.collect.SortedSetMultimap<K, V> unmodifiableSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> delegate) {
        return delegate instanceof com.google.common.collect.Multimaps.UnmodifiableSortedSetMultimap ? delegate : new com.google.common.collect.Multimaps.UnmodifiableSortedSetMultimap(delegate);
    }

    public static <K, V> com.google.common.collect.ListMultimap<K, V> synchronizedListMultimap(com.google.common.collect.ListMultimap<K, V> multimap) {
        return com.google.common.collect.Synchronized.listMultimap(multimap, null);
    }

    public static <K, V> com.google.common.collect.ListMultimap<K, V> unmodifiableListMultimap(com.google.common.collect.ListMultimap<K, V> delegate) {
        return ((delegate instanceof com.google.common.collect.Multimaps.UnmodifiableListMultimap) || (delegate instanceof com.google.common.collect.ImmutableListMultimap)) ? delegate : new com.google.common.collect.Multimaps.UnmodifiableListMultimap(delegate);
    }

    @java.lang.Deprecated
    public static <K, V> com.google.common.collect.ListMultimap<K, V> unmodifiableListMultimap(com.google.common.collect.ImmutableListMultimap<K, V> delegate) {
        return (com.google.common.collect.ListMultimap) com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <V> java.util.Collection<V> unmodifiableValueCollection(java.util.Collection<V> collection) {
        if (collection instanceof java.util.SortedSet) {
            return java.util.Collections.unmodifiableSortedSet((java.util.SortedSet) collection);
        }
        if (collection instanceof java.util.Set) {
            return java.util.Collections.unmodifiableSet((java.util.Set) collection);
        }
        if (collection instanceof java.util.List) {
            return java.util.Collections.unmodifiableList((java.util.List) collection);
        }
        return java.util.Collections.unmodifiableCollection(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> java.util.Collection<java.util.Map.Entry<K, V>> unmodifiableEntries(java.util.Collection<java.util.Map.Entry<K, V>> entries) {
        if (entries instanceof java.util.Set) {
            return com.google.common.collect.Maps.unmodifiableEntrySet((java.util.Set) entries);
        }
        return new com.google.common.collect.Maps.UnmodifiableEntries(java.util.Collections.unmodifiableCollection(entries));
    }

    public static <K, V> java.util.Map<K, java.util.List<V>> asMap(com.google.common.collect.ListMultimap<K, V> listMultimap) {
        return listMultimap.asMap();
    }

    public static <K, V> java.util.Map<K, java.util.Set<V>> asMap(com.google.common.collect.SetMultimap<K, V> setMultimap) {
        return setMultimap.asMap();
    }

    public static <K, V> java.util.Map<K, java.util.SortedSet<V>> asMap(com.google.common.collect.SortedSetMultimap<K, V> sortedSetMultimap) {
        return sortedSetMultimap.asMap();
    }

    public static <K, V> java.util.Map<K, java.util.Collection<V>> asMap(com.google.common.collect.Multimap<K, V> multimap) {
        return multimap.asMap();
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> forMap(java.util.Map<K, V> map) {
        return new com.google.common.collect.Multimaps.MapMultimap(map);
    }

    private static class MapMultimap<K, V> extends com.google.common.collect.AbstractMultimap<K, V> implements com.google.common.collect.SetMultimap<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 7845222491160860175L;
        final java.util.Map<K, V> map;

        MapMultimap(java.util.Map<K, V> map) {
            this.map = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map);
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
            return this.map.size();
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return this.map.containsKey(key);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
            return this.map.containsValue(value);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean containsEntry(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
            return this.map.entrySet().contains(com.google.common.collect.Maps.immutableEntry(key, value));
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> get(@com.google.common.collect.ParametricNullness final K key) {
            return new com.google.common.collect.Sets.ImprovedAbstractSet<V>() { // from class: com.google.common.collect.Multimaps.MapMultimap.1
                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public java.util.Iterator<V> iterator() {
                    return new java.util.Iterator<V>() { // from class: com.google.common.collect.Multimaps.MapMultimap.1.1
                        int i;

                        @Override // java.util.Iterator
                        public boolean hasNext() {
                            return this.i == 0 && com.google.common.collect.Multimaps.MapMultimap.this.map.containsKey(key);
                        }

                        @Override // java.util.Iterator
                        @com.google.common.collect.ParametricNullness
                        public V next() {
                            if (!hasNext()) {
                                throw new java.util.NoSuchElementException();
                            }
                            this.i++;
                            return (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(com.google.common.collect.Multimaps.MapMultimap.this.map.get(key));
                        }

                        @Override // java.util.Iterator
                        public void remove() {
                            com.google.common.collect.CollectPreconditions.checkRemove(this.i == 1);
                            this.i = -1;
                            com.google.common.collect.Multimaps.MapMultimap.this.map.remove(key);
                        }
                    };
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return com.google.common.collect.Multimaps.MapMultimap.this.map.containsKey(key) ? 1 : 0;
                }
            };
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
            return this.map.entrySet().remove(com.google.common.collect.Maps.immutableEntry(key, value));
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
            java.util.HashSet hashSet = new java.util.HashSet(2);
            if (!this.map.containsKey(key)) {
                return hashSet;
            }
            hashSet.add(this.map.remove(key));
            return hashSet;
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
            this.map.clear();
        }

        @Override // com.google.common.collect.AbstractMultimap
        java.util.Set<K> createKeySet() {
            return this.map.keySet();
        }

        @Override // com.google.common.collect.AbstractMultimap
        java.util.Collection<V> createValues() {
            return this.map.values();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public java.util.Set<java.util.Map.Entry<K, V>> entries() {
            return this.map.entrySet();
        }

        @Override // com.google.common.collect.AbstractMultimap
        java.util.Collection<java.util.Map.Entry<K, V>> createEntries() {
            throw new java.lang.AssertionError("unreachable");
        }

        @Override // com.google.common.collect.AbstractMultimap
        com.google.common.collect.Multiset<K> createKeys() {
            return new com.google.common.collect.Multimaps.Keys(this);
        }

        @Override // com.google.common.collect.AbstractMultimap
        java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            return this.map.entrySet().iterator();
        }

        @Override // com.google.common.collect.AbstractMultimap
        java.util.Map<K, java.util.Collection<V>> createAsMap() {
            return new com.google.common.collect.Multimaps.AsMap(this);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public int hashCode() {
            return this.map.hashCode();
        }
    }

    public static <K, V1, V2> com.google.common.collect.Multimap<K, V2> transformValues(com.google.common.collect.Multimap<K, V1> fromMultimap, final com.google.common.base.Function<? super V1, V2> function) {
        com.google.common.base.Preconditions.checkNotNull(function);
        return transformEntries(fromMultimap, com.google.common.collect.Maps.asEntryTransformer(function));
    }

    public static <K, V1, V2> com.google.common.collect.ListMultimap<K, V2> transformValues(com.google.common.collect.ListMultimap<K, V1> fromMultimap, final com.google.common.base.Function<? super V1, V2> function) {
        com.google.common.base.Preconditions.checkNotNull(function);
        return transformEntries((com.google.common.collect.ListMultimap) fromMultimap, com.google.common.collect.Maps.asEntryTransformer(function));
    }

    public static <K, V1, V2> com.google.common.collect.Multimap<K, V2> transformEntries(com.google.common.collect.Multimap<K, V1> fromMap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer) {
        return new com.google.common.collect.Multimaps.TransformedEntriesMultimap(fromMap, transformer);
    }

    public static <K, V1, V2> com.google.common.collect.ListMultimap<K, V2> transformEntries(com.google.common.collect.ListMultimap<K, V1> fromMap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer) {
        return new com.google.common.collect.Multimaps.TransformedEntriesListMultimap(fromMap, transformer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class TransformedEntriesMultimap<K, V1, V2> extends com.google.common.collect.AbstractMultimap<K, V2> {
        final com.google.common.collect.Multimap<K, V1> fromMultimap;
        final com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer;

        TransformedEntriesMultimap(com.google.common.collect.Multimap<K, V1> fromMultimap, final com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer) {
            this.fromMultimap = (com.google.common.collect.Multimap) com.google.common.base.Preconditions.checkNotNull(fromMultimap);
            this.transformer = (com.google.common.collect.Maps.EntryTransformer) com.google.common.base.Preconditions.checkNotNull(transformer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: transform, reason: merged with bridge method [inline-methods] */
        public java.util.Collection<V2> m794x893217c0(@com.google.common.collect.ParametricNullness K key, java.util.Collection<V1> values) {
            com.google.common.base.Function functionAsValueToValueFunction = com.google.common.collect.Maps.asValueToValueFunction(this.transformer, key);
            if (values instanceof java.util.List) {
                return com.google.common.collect.Lists.transform((java.util.List) values, functionAsValueToValueFunction);
            }
            return com.google.common.collect.Collections2.transform(values, functionAsValueToValueFunction);
        }

        @Override // com.google.common.collect.AbstractMultimap
        java.util.Map<K, java.util.Collection<V2>> createAsMap() {
            return com.google.common.collect.Maps.transformEntries(this.fromMultimap.asMap(), new com.google.common.collect.Maps.EntryTransformer() { // from class: com.google.common.collect.Multimaps$TransformedEntriesMultimap$$ExternalSyntheticLambda0
                @Override // com.google.common.collect.Maps.EntryTransformer
                public final java.lang.Object transformEntry(java.lang.Object obj, java.lang.Object obj2) {
                    return this.f$0.m794x893217c0(obj, (java.util.Collection) obj2);
                }
            });
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
            this.fromMultimap.clear();
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return this.fromMultimap.containsKey(key);
        }

        @Override // com.google.common.collect.AbstractMultimap
        java.util.Collection<java.util.Map.Entry<K, V2>> createEntries() {
            return new com.google.common.collect.AbstractMultimap.Entries();
        }

        @Override // com.google.common.collect.AbstractMultimap
        java.util.Iterator<java.util.Map.Entry<K, V2>> entryIterator() {
            return com.google.common.collect.Iterators.transform(this.fromMultimap.entries().iterator(), com.google.common.collect.Maps.asEntryToEntryFunction(this.transformer));
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V2> get(@com.google.common.collect.ParametricNullness final K key) {
            return m794x893217c0(key, this.fromMultimap.get(key));
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean isEmpty() {
            return this.fromMultimap.isEmpty();
        }

        @Override // com.google.common.collect.AbstractMultimap
        java.util.Set<K> createKeySet() {
            return this.fromMultimap.keySet();
        }

        @Override // com.google.common.collect.AbstractMultimap
        com.google.common.collect.Multiset<K> createKeys() {
            return this.fromMultimap.keys();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V2 value) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V2> values) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V2> multimap) {
            throw new java.lang.UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
            return get(key).remove(value);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V2> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
            return m794x893217c0(key, this.fromMultimap.removeAll(key));
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Collection<V2> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V2> values) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
            return this.fromMultimap.size();
        }

        @Override // com.google.common.collect.AbstractMultimap
        java.util.Collection<V2> createValues() {
            return com.google.common.collect.Collections2.transform(this.fromMultimap.entries(), com.google.common.collect.Maps.asEntryToValueFunction(this.transformer));
        }
    }

    private static final class TransformedEntriesListMultimap<K, V1, V2> extends com.google.common.collect.Multimaps.TransformedEntriesMultimap<K, V1, V2> implements com.google.common.collect.ListMultimap<K, V2> {
        TransformedEntriesListMultimap(com.google.common.collect.ListMultimap<K, V1> fromMultimap, com.google.common.collect.Maps.EntryTransformer<? super K, ? super V1, V2> transformer) {
            super(fromMultimap, transformer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap
        /* JADX INFO: renamed from: transform */
        public java.util.List<V2> m794x893217c0(@com.google.common.collect.ParametricNullness K key, java.util.Collection<V1> values) {
            return com.google.common.collect.Lists.transform((java.util.List) values, com.google.common.collect.Maps.asValueToValueFunction(this.transformer, key));
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.List<V2> get(@com.google.common.collect.ParametricNullness K key) {
            return m794x893217c0((java.lang.Object) key, (java.util.Collection) this.fromMultimap.get(key));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.List<V2> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
            return m794x893217c0(key, (java.util.Collection) this.fromMultimap.removeAll(key));
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.List<V2> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V2> values) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> index(java.lang.Iterable<V> values, com.google.common.base.Function<? super V, K> keyFunction) {
        return index(values.iterator(), keyFunction);
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> index(java.util.Iterator<V> values, com.google.common.base.Function<? super V, K> keyFunction) {
        com.google.common.base.Preconditions.checkNotNull(keyFunction);
        com.google.common.collect.ImmutableListMultimap.Builder builder = com.google.common.collect.ImmutableListMultimap.builder();
        while (values.hasNext()) {
            V next = values.next();
            com.google.common.base.Preconditions.checkNotNull(next, values);
            builder.put((java.lang.Object) keyFunction.apply(next), (java.lang.Object) next);
        }
        return builder.build();
    }

    static class Keys<K, V> extends com.google.common.collect.AbstractMultiset<K> {
        final com.google.common.collect.Multimap<K, V> multimap;

        Keys(com.google.common.collect.Multimap<K, V> multimap) {
            this.multimap = multimap;
        }

        @Override // com.google.common.collect.AbstractMultiset
        java.util.Iterator<com.google.common.collect.Multiset.Entry<K>> entryIterator() {
            return new com.google.common.collect.TransformedIterator<java.util.Map.Entry<K, java.util.Collection<V>>, com.google.common.collect.Multiset.Entry<K>>(this, this.multimap.asMap().entrySet().iterator()) { // from class: com.google.common.collect.Multimaps.Keys.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.TransformedIterator
                public com.google.common.collect.Multiset.Entry<K> transform(final java.util.Map.Entry<K, java.util.Collection<V>> backingEntry) {
                    return new com.google.common.collect.Multisets.AbstractEntry<K>(this) { // from class: com.google.common.collect.Multimaps.Keys.1.1
                        @Override // com.google.common.collect.Multiset.Entry
                        @com.google.common.collect.ParametricNullness
                        public K getElement() {
                            return (K) backingEntry.getKey();
                        }

                        @Override // com.google.common.collect.Multiset.Entry
                        public int getCount() {
                            return ((java.util.Collection) backingEntry.getValue()).size();
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.AbstractMultiset
        int distinctElements() {
            return this.multimap.asMap().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return this.multimap.size();
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object element) {
            return this.multimap.containsKey(element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public java.util.Iterator<K> iterator() {
            return com.google.common.collect.Maps.keyIterator(this.multimap.entries().iterator());
        }

        @Override // com.google.common.collect.Multiset
        public int count(@javax.annotation.CheckForNull java.lang.Object element) {
            java.util.Collection collection = (java.util.Collection) com.google.common.collect.Maps.safeGet(this.multimap.asMap(), element);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(@javax.annotation.CheckForNull java.lang.Object element, int occurrences) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(occurrences, "occurrences");
            if (occurrences == 0) {
                return count(element);
            }
            java.util.Collection collection = (java.util.Collection) com.google.common.collect.Maps.safeGet(this.multimap.asMap(), element);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (occurrences >= size) {
                collection.clear();
            } else {
                java.util.Iterator it = collection.iterator();
                for (int i = 0; i < occurrences; i++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.multimap.clear();
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public java.util.Set<K> elementSet() {
            return this.multimap.keySet();
        }

        @Override // com.google.common.collect.AbstractMultiset
        java.util.Iterator<K> elementIterator() {
            throw new java.lang.AssertionError("should never be called");
        }
    }

    static abstract class Entries<K, V> extends java.util.AbstractCollection<java.util.Map.Entry<K, V>> {
        abstract com.google.common.collect.Multimap<K, V> multimap();

        Entries() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return multimap().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            if (!(o instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) o;
            return multimap().containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            if (!(o instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) o;
            return multimap().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            multimap().clear();
        }
    }

    static final class AsMap<K, V> extends com.google.common.collect.Maps.ViewCachingAbstractMap<K, java.util.Collection<V>> {
        private final com.google.common.collect.Multimap<K, V> multimap;

        AsMap(com.google.common.collect.Multimap<K, V> multimap) {
            this.multimap = (com.google.common.collect.Multimap) com.google.common.base.Preconditions.checkNotNull(multimap);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.multimap.keySet().size();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> createEntrySet() {
            return new com.google.common.collect.Multimaps.AsMap.EntrySet();
        }

        void removeValuesForKey(@javax.annotation.CheckForNull java.lang.Object key) {
            this.multimap.keySet().remove(key);
        }

        class EntrySet extends com.google.common.collect.Maps.EntrySet<K, java.util.Collection<V>> {
            EntrySet() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            java.util.Map<K, java.util.Collection<V>> map() {
                return com.google.common.collect.Multimaps.AsMap.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> iterator() {
                return com.google.common.collect.Maps.asMapEntryIterator(com.google.common.collect.Multimaps.AsMap.this.multimap.keySet(), new com.google.common.base.Function() { // from class: com.google.common.collect.Multimaps$AsMap$EntrySet$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return this.f$0.m793xda360ac8(obj);
                    }
                });
            }

            /* JADX INFO: renamed from: lambda$iterator$0$com-google-common-collect-Multimaps$AsMap$EntrySet, reason: not valid java name */
            /* synthetic */ java.util.Collection m793xda360ac8(java.lang.Object obj) {
                return com.google.common.collect.Multimaps.AsMap.this.multimap.get(obj);
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
                if (!contains(o)) {
                    return false;
                }
                com.google.common.collect.Multimaps.AsMap.this.removeValuesForKey(((java.util.Map.Entry) java.util.Objects.requireNonNull((java.util.Map.Entry) o)).getKey());
                return true;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Collection<V> get(@javax.annotation.CheckForNull java.lang.Object key) {
            if (containsKey(key)) {
                return this.multimap.get(key);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Collection<V> remove(@javax.annotation.CheckForNull java.lang.Object key) {
            if (containsKey(key)) {
                return this.multimap.removeAll(key);
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
            return this.multimap.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.multimap.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return this.multimap.containsKey(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.multimap.clear();
        }
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> filterKeys(com.google.common.collect.Multimap<K, V> unfiltered, final com.google.common.base.Predicate<? super K> keyPredicate) {
        if (unfiltered instanceof com.google.common.collect.SetMultimap) {
            return filterKeys((com.google.common.collect.SetMultimap) unfiltered, (com.google.common.base.Predicate) keyPredicate);
        }
        if (unfiltered instanceof com.google.common.collect.ListMultimap) {
            return filterKeys((com.google.common.collect.ListMultimap) unfiltered, (com.google.common.base.Predicate) keyPredicate);
        }
        if (unfiltered instanceof com.google.common.collect.FilteredKeyMultimap) {
            com.google.common.collect.FilteredKeyMultimap filteredKeyMultimap = (com.google.common.collect.FilteredKeyMultimap) unfiltered;
            return new com.google.common.collect.FilteredKeyMultimap(filteredKeyMultimap.unfiltered, com.google.common.base.Predicates.and(filteredKeyMultimap.keyPredicate, keyPredicate));
        }
        if (unfiltered instanceof com.google.common.collect.FilteredMultimap) {
            return filterFiltered((com.google.common.collect.FilteredMultimap) unfiltered, com.google.common.collect.Maps.keyPredicateOnEntries(keyPredicate));
        }
        return new com.google.common.collect.FilteredKeyMultimap(unfiltered, keyPredicate);
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> filterKeys(com.google.common.collect.SetMultimap<K, V> unfiltered, final com.google.common.base.Predicate<? super K> keyPredicate) {
        if (unfiltered instanceof com.google.common.collect.FilteredKeySetMultimap) {
            com.google.common.collect.FilteredKeySetMultimap filteredKeySetMultimap = (com.google.common.collect.FilteredKeySetMultimap) unfiltered;
            return new com.google.common.collect.FilteredKeySetMultimap(filteredKeySetMultimap.unfiltered(), com.google.common.base.Predicates.and(filteredKeySetMultimap.keyPredicate, keyPredicate));
        }
        if (unfiltered instanceof com.google.common.collect.FilteredSetMultimap) {
            return filterFiltered((com.google.common.collect.FilteredSetMultimap) unfiltered, com.google.common.collect.Maps.keyPredicateOnEntries(keyPredicate));
        }
        return new com.google.common.collect.FilteredKeySetMultimap(unfiltered, keyPredicate);
    }

    public static <K, V> com.google.common.collect.ListMultimap<K, V> filterKeys(com.google.common.collect.ListMultimap<K, V> unfiltered, final com.google.common.base.Predicate<? super K> keyPredicate) {
        if (unfiltered instanceof com.google.common.collect.FilteredKeyListMultimap) {
            com.google.common.collect.FilteredKeyListMultimap filteredKeyListMultimap = (com.google.common.collect.FilteredKeyListMultimap) unfiltered;
            return new com.google.common.collect.FilteredKeyListMultimap(filteredKeyListMultimap.unfiltered(), com.google.common.base.Predicates.and(filteredKeyListMultimap.keyPredicate, keyPredicate));
        }
        return new com.google.common.collect.FilteredKeyListMultimap(unfiltered, keyPredicate);
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> filterValues(com.google.common.collect.Multimap<K, V> unfiltered, final com.google.common.base.Predicate<? super V> valuePredicate) {
        return filterEntries(unfiltered, com.google.common.collect.Maps.valuePredicateOnEntries(valuePredicate));
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> filterValues(com.google.common.collect.SetMultimap<K, V> unfiltered, final com.google.common.base.Predicate<? super V> valuePredicate) {
        return filterEntries((com.google.common.collect.SetMultimap) unfiltered, com.google.common.collect.Maps.valuePredicateOnEntries(valuePredicate));
    }

    public static <K, V> com.google.common.collect.Multimap<K, V> filterEntries(com.google.common.collect.Multimap<K, V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate) {
        com.google.common.base.Preconditions.checkNotNull(entryPredicate);
        if (unfiltered instanceof com.google.common.collect.SetMultimap) {
            return filterEntries((com.google.common.collect.SetMultimap) unfiltered, (com.google.common.base.Predicate) entryPredicate);
        }
        if (unfiltered instanceof com.google.common.collect.FilteredMultimap) {
            return filterFiltered((com.google.common.collect.FilteredMultimap) unfiltered, entryPredicate);
        }
        return new com.google.common.collect.FilteredEntryMultimap((com.google.common.collect.Multimap) com.google.common.base.Preconditions.checkNotNull(unfiltered), entryPredicate);
    }

    public static <K, V> com.google.common.collect.SetMultimap<K, V> filterEntries(com.google.common.collect.SetMultimap<K, V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate) {
        com.google.common.base.Preconditions.checkNotNull(entryPredicate);
        if (unfiltered instanceof com.google.common.collect.FilteredSetMultimap) {
            return filterFiltered((com.google.common.collect.FilteredSetMultimap) unfiltered, (com.google.common.base.Predicate) entryPredicate);
        }
        return new com.google.common.collect.FilteredEntrySetMultimap((com.google.common.collect.SetMultimap) com.google.common.base.Preconditions.checkNotNull(unfiltered), entryPredicate);
    }

    private static <K, V> com.google.common.collect.Multimap<K, V> filterFiltered(com.google.common.collect.FilteredMultimap<K, V> multimap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate) {
        return new com.google.common.collect.FilteredEntryMultimap(multimap.unfiltered(), com.google.common.base.Predicates.and(multimap.entryPredicate(), entryPredicate));
    }

    private static <K, V> com.google.common.collect.SetMultimap<K, V> filterFiltered(com.google.common.collect.FilteredSetMultimap<K, V> multimap, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate) {
        return new com.google.common.collect.FilteredEntrySetMultimap(multimap.unfiltered(), com.google.common.base.Predicates.and(multimap.entryPredicate(), entryPredicate));
    }

    static boolean equalsImpl(com.google.common.collect.Multimap<?, ?> multimap, @javax.annotation.CheckForNull java.lang.Object object) {
        if (object == multimap) {
            return true;
        }
        if (object instanceof com.google.common.collect.Multimap) {
            return multimap.asMap().equals(((com.google.common.collect.Multimap) object).asMap());
        }
        return false;
    }
}
