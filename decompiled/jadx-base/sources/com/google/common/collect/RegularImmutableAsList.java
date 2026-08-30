package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
class RegularImmutableAsList<E> extends com.google.common.collect.ImmutableAsList<E> {
    private final com.google.common.collect.ImmutableCollection<E> delegate;
    private final com.google.common.collect.ImmutableList<? extends E> delegateList;

    RegularImmutableAsList(com.google.common.collect.ImmutableCollection<E> delegate, com.google.common.collect.ImmutableList<? extends E> delegateList) {
        this.delegate = delegate;
        this.delegateList = delegateList;
    }

    RegularImmutableAsList(com.google.common.collect.ImmutableCollection<E> delegate, java.lang.Object[] array) {
        this(delegate, com.google.common.collect.ImmutableList.asImmutableList(array));
    }

    RegularImmutableAsList(com.google.common.collect.ImmutableCollection<E> delegate, java.lang.Object[] array, int size) {
        this(delegate, com.google.common.collect.ImmutableList.asImmutableList(array, size));
    }

    @Override // com.google.common.collect.ImmutableAsList
    com.google.common.collect.ImmutableCollection<E> delegateCollection() {
        return this.delegate;
    }

    com.google.common.collect.ImmutableList<? extends E> delegateList() {
        return this.delegateList;
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public com.google.common.collect.UnmodifiableListIterator<E> listIterator(int i) {
        return this.delegateList.listIterator(i);
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] dst, int offset) {
        return this.delegateList.copyIntoArray(dst, offset);
    }

    @Override // com.google.common.collect.ImmutableCollection
    @javax.annotation.CheckForNull
    java.lang.Object[] internalArray() {
        return this.delegateList.internalArray();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayStart() {
        return this.delegateList.internalArrayStart();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayEnd() {
        return this.delegateList.internalArrayEnd();
    }

    @Override // java.util.List
    public E get(int index) {
        return this.delegateList.get(index);
    }

    @Override // com.google.common.collect.ImmutableAsList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
