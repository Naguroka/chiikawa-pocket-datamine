package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class RegularImmutableSet<E> extends com.google.common.collect.ImmutableSet<E> {
    static final com.google.common.collect.RegularImmutableSet<java.lang.Object> EMPTY;
    private static final java.lang.Object[] EMPTY_ARRAY;
    final transient java.lang.Object[] elements;
    private final transient int hashCode;
    private final transient int mask;
    private final transient int size;
    final transient java.lang.Object[] table;

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayStart() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableSet
    boolean isHashCodeFast() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return false;
    }

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        EMPTY_ARRAY = objArr;
        EMPTY = new com.google.common.collect.RegularImmutableSet<>(objArr, 0, objArr, 0, 0);
    }

    RegularImmutableSet(java.lang.Object[] elements, int hashCode, java.lang.Object[] table, int mask, int size) {
        this.elements = elements;
        this.hashCode = hashCode;
        this.table = table;
        this.mask = mask;
        this.size = size;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object target) {
        java.lang.Object[] objArr = this.table;
        if (target == null || objArr.length == 0) {
            return false;
        }
        int iSmearedHash = com.google.common.collect.Hashing.smearedHash(target);
        while (true) {
            int i = iSmearedHash & this.mask;
            java.lang.Object obj = objArr[i];
            if (obj == null) {
                return false;
            }
            if (obj.equals(target)) {
                return true;
            }
            iSmearedHash = i + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
        return asList().iterator();
    }

    @Override // com.google.common.collect.ImmutableCollection
    java.lang.Object[] internalArray() {
        return this.elements;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayEnd() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] dst, int offset) {
        java.lang.System.arraycopy(this.elements, 0, dst, offset, this.size);
        return offset + this.size;
    }

    @Override // com.google.common.collect.ImmutableSet
    com.google.common.collect.ImmutableList<E> createAsList() {
        return com.google.common.collect.ImmutableList.asImmutableList(this.elements, this.size);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.hashCode;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
