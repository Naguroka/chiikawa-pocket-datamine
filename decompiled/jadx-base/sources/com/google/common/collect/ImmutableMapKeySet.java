package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ImmutableMapKeySet<K, V> extends com.google.common.collect.IndexedImmutableSet<K> {
    private final com.google.common.collect.ImmutableMap<K, V> map;

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return true;
    }

    ImmutableMapKeySet(com.google.common.collect.ImmutableMap<K, V> map) {
        this.map = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.map.size();
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<K> iterator() {
        return this.map.keyIterator();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
        return this.map.containsKey(object);
    }

    @Override // com.google.common.collect.IndexedImmutableSet
    K get(int index) {
        return this.map.entrySet().asList().get(index).getKey();
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableMapKeySet.KeySetSerializedForm(this.map);
    }

    private static class KeySetSerializedForm<K> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.ImmutableMap<K, ?> map;

        KeySetSerializedForm(com.google.common.collect.ImmutableMap<K, ?> map) {
            this.map = map;
        }

        java.lang.Object readResolve() {
            return this.map.keySet();
        }
    }
}
