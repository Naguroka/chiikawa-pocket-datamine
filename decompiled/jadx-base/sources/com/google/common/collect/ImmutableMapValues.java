package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ImmutableMapValues<K, V> extends com.google.common.collect.ImmutableCollection<V> {
    private final com.google.common.collect.ImmutableMap<K, V> map;

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return true;
    }

    ImmutableMapValues(com.google.common.collect.ImmutableMap<K, V> map) {
        this.map = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.map.size();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<V> iterator() {
        return new com.google.common.collect.UnmodifiableIterator<V>() { // from class: com.google.common.collect.ImmutableMapValues.1
            final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> entryItr;

            {
                this.entryItr = com.google.common.collect.ImmutableMapValues.this.map.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.entryItr.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.entryItr.next().getValue();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
        return object != null && com.google.common.collect.Iterators.contains(iterator(), object);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public com.google.common.collect.ImmutableList<V> asList() {
        final com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> immutableListAsList = this.map.entrySet().asList();
        return new com.google.common.collect.ImmutableList<V>(this) { // from class: com.google.common.collect.ImmutableMapValues.2
            @Override // com.google.common.collect.ImmutableCollection
            boolean isPartialView() {
                return true;
            }

            @Override // java.util.List
            public V get(int i) {
                return (V) ((java.util.Map.Entry) immutableListAsList.get(i)).getValue();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return immutableListAsList.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            java.lang.Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableMapValues.SerializedForm(this.map);
    }

    private static class SerializedForm<V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.ImmutableMap<?, V> map;

        SerializedForm(com.google.common.collect.ImmutableMap<?, V> map) {
            this.map = map;
        }

        java.lang.Object readResolve() {
            return this.map.values();
        }
    }
}
