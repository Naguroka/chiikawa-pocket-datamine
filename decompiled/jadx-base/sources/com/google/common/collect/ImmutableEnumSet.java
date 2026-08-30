package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ImmutableEnumSet<E extends java.lang.Enum<E>> extends com.google.common.collect.ImmutableSet<E> {
    private final transient java.util.EnumSet<E> delegate;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient int hashCode;

    @Override // com.google.common.collect.ImmutableSet
    boolean isHashCodeFast() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return false;
    }

    static <E extends java.lang.Enum<E>> com.google.common.collect.ImmutableSet<E> asImmutable(java.util.EnumSet<E> set) {
        int size = set.size();
        if (size == 0) {
            return com.google.common.collect.ImmutableSet.of();
        }
        if (size == 1) {
            return com.google.common.collect.ImmutableSet.of((java.lang.Enum) com.google.common.collect.Iterables.getOnlyElement(set));
        }
        return new com.google.common.collect.ImmutableEnumSet(set);
    }

    private ImmutableEnumSet(java.util.EnumSet<E> delegate) {
        this.delegate = delegate;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
        return com.google.common.collect.Iterators.unmodifiableIterator(this.delegate.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.delegate.size();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
        return this.delegate.contains(object);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<?> collection) {
        if (collection instanceof com.google.common.collect.ImmutableEnumSet) {
            collection = ((com.google.common.collect.ImmutableEnumSet) collection).delegate;
        }
        return this.delegate.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof com.google.common.collect.ImmutableEnumSet) {
            object = ((com.google.common.collect.ImmutableEnumSet) object).delegate;
        }
        return this.delegate.equals(object);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.delegate.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        return this.delegate.toString();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableEnumSet.EnumSerializedForm(this.delegate);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    private static class EnumSerializedForm<E extends java.lang.Enum<E>> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.EnumSet<E> delegate;

        EnumSerializedForm(java.util.EnumSet<E> delegate) {
            this.delegate = delegate;
        }

        java.lang.Object readResolve() {
            return new com.google.common.collect.ImmutableEnumSet(this.delegate.clone());
        }
    }
}
