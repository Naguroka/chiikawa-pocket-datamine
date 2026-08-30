package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class ImmutableMapEntrySet<K, V> extends com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> {
    abstract com.google.common.collect.ImmutableMap<K, V> map();

    static final class RegularEntrySet<K, V> extends com.google.common.collect.ImmutableMapEntrySet<K, V> {
        private final transient com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> entries;
        private final transient com.google.common.collect.ImmutableMap<K, V> map;

        RegularEntrySet(com.google.common.collect.ImmutableMap<K, V> map, java.util.Map.Entry<K, V>[] entries) {
            this(map, com.google.common.collect.ImmutableList.asImmutableList(entries));
        }

        RegularEntrySet(com.google.common.collect.ImmutableMap<K, V> map, com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> entries) {
            this.map = map;
            this.entries = entries;
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet
        com.google.common.collect.ImmutableMap<K, V> map() {
            return this.map;
        }

        @Override // com.google.common.collect.ImmutableCollection
        int copyIntoArray(java.lang.Object[] dst, int offset) {
            return this.entries.copyIntoArray(dst, offset);
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
            return this.entries.iterator();
        }

        @Override // com.google.common.collect.ImmutableSet
        com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> createAsList() {
            return this.entries;
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    ImmutableMapEntrySet() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return map().size();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
        if (!(object instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) object;
        V v = map().get(entry.getKey());
        return v != null && v.equals(entry.getValue());
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return map().isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSet
    boolean isHashCodeFast() {
        return map().isHashCodeFast();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return map().hashCode();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableMapEntrySet.EntrySetSerializedForm(map());
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use EntrySetSerializedForm");
    }

    private static class EntrySetSerializedForm<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.ImmutableMap<K, V> map;

        EntrySetSerializedForm(com.google.common.collect.ImmutableMap<K, V> map) {
            this.map = map;
        }

        java.lang.Object readResolve() {
            return this.map.entrySet();
        }
    }
}
