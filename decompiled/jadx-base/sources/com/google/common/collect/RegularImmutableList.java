package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
class RegularImmutableList<E> extends com.google.common.collect.ImmutableList<E> {
    static final com.google.common.collect.ImmutableList<java.lang.Object> EMPTY = new com.google.common.collect.RegularImmutableList(new java.lang.Object[0], 0);
    final transient java.lang.Object[] array;
    private final transient int size;

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayStart() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return false;
    }

    RegularImmutableList(java.lang.Object[] array, int size) {
        this.array = array;
        this.size = size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableCollection
    java.lang.Object[] internalArray() {
        return this.array;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayEnd() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] dst, int dstOff) {
        java.lang.System.arraycopy(this.array, 0, dst, dstOff, this.size);
        return dstOff + this.size;
    }

    @Override // java.util.List
    public E get(int i) {
        com.google.common.base.Preconditions.checkElementIndex(i, this.size);
        return (E) java.util.Objects.requireNonNull(this.array[i]);
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
