package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class IndexedImmutableSet<E> extends com.google.common.collect.ImmutableSet<E> {
    abstract E get(int index);

    IndexedImmutableSet() {
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
        return asList().iterator();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] dst, int offset) {
        return asList().copyIntoArray(dst, offset);
    }

    @Override // com.google.common.collect.ImmutableSet
    com.google.common.collect.ImmutableList<E> createAsList() {
        return new com.google.common.collect.ImmutableList<E>() { // from class: com.google.common.collect.IndexedImmutableSet.1
            @Override // java.util.List
            public E get(int i) {
                return (E) com.google.common.collect.IndexedImmutableSet.this.get(i);
            }

            @Override // com.google.common.collect.ImmutableCollection
            boolean isPartialView() {
                return com.google.common.collect.IndexedImmutableSet.this.isPartialView();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return com.google.common.collect.IndexedImmutableSet.this.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            java.lang.Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
