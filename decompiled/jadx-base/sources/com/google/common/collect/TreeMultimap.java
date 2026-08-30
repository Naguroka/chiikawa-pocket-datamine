package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public class TreeMultimap<K, V> extends com.google.common.collect.AbstractSortedKeySortedSetMultimap<K, V> {
    private static final long serialVersionUID = 0;
    private transient java.util.Comparator<? super K> keyComparator;
    private transient java.util.Comparator<? super V> valueComparator;

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
        return super.containsEntry(key, value);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return super.containsKey(key);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return super.containsValue(value);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return super.equals(object);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean put(@com.google.common.collect.ParametricNullness java.lang.Object key, @com.google.common.collect.ParametricNullness java.lang.Object value) {
        return super.put(key, value);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean putAll(com.google.common.collect.Multimap multimap) {
        return super.putAll(multimap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean putAll(@com.google.common.collect.ParametricNullness java.lang.Object key, java.lang.Iterable values) {
        return super.putAll(key, values);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean remove(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
        return super.remove(key, value);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.SortedSet removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        return super.removeAll(key);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.SortedSet replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object key, java.lang.Iterable values) {
        return super.replaceValues(key, values);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection values() {
        return super.values();
    }

    public static <K extends java.lang.Comparable, V extends java.lang.Comparable> com.google.common.collect.TreeMultimap<K, V> create() {
        return new com.google.common.collect.TreeMultimap<>(com.google.common.collect.Ordering.natural(), com.google.common.collect.Ordering.natural());
    }

    public static <K, V> com.google.common.collect.TreeMultimap<K, V> create(java.util.Comparator<? super K> keyComparator, java.util.Comparator<? super V> valueComparator) {
        return new com.google.common.collect.TreeMultimap<>((java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(keyComparator), (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(valueComparator));
    }

    public static <K extends java.lang.Comparable, V extends java.lang.Comparable> com.google.common.collect.TreeMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        return new com.google.common.collect.TreeMultimap<>(com.google.common.collect.Ordering.natural(), com.google.common.collect.Ordering.natural(), multimap);
    }

    TreeMultimap(java.util.Comparator<? super K> keyComparator, java.util.Comparator<? super V> valueComparator) {
        super(new java.util.TreeMap(keyComparator));
        this.keyComparator = keyComparator;
        this.valueComparator = valueComparator;
    }

    private TreeMultimap(java.util.Comparator<? super K> keyComparator, java.util.Comparator<? super V> valueComparator, com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        this(keyComparator, valueComparator);
        putAll(multimap);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    java.util.Map<K, java.util.Collection<V>> createAsMap() {
        return createMaybeNavigableAsMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public java.util.SortedSet<V> createCollection() {
        return new java.util.TreeSet(this.valueComparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    java.util.Collection<V> createCollection(@com.google.common.collect.ParametricNullness K key) {
        if (key == 0) {
            keyComparator().compare(key, key);
        }
        return super.createCollection(key);
    }

    @java.lang.Deprecated
    public java.util.Comparator<? super K> keyComparator() {
        return this.keyComparator;
    }

    @Override // com.google.common.collect.SortedSetMultimap
    public java.util.Comparator<? super V> valueComparator() {
        return this.valueComparator;
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.NavigableSet<V> get(@com.google.common.collect.ParametricNullness K key) {
        return (java.util.NavigableSet) super.get((java.lang.Object) key);
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.NavigableSet<K> keySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.NavigableMap<K, java.util.Collection<V>> asMap() {
        return (java.util.NavigableMap) super.asMap();
    }

    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.defaultWriteObject();
        stream.writeObject(keyComparator());
        stream.writeObject(valueComparator());
        com.google.common.collect.Serialization.writeMultimap(this, stream);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.lang.ClassNotFoundException, java.io.IOException {
        stream.defaultReadObject();
        this.keyComparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull((java.util.Comparator) stream.readObject());
        this.valueComparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull((java.util.Comparator) stream.readObject());
        setMap(new java.util.TreeMap(this.keyComparator));
        com.google.common.collect.Serialization.populateMultimap(this, stream);
    }
}
