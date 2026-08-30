package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingSet<E> extends com.google.common.collect.ForwardingCollection<E> implements java.util.Set<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.Set<E> delegate();

    protected ForwardingSet() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return object == this || delegate().equals(object);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRemoveAll(java.util.Collection<?> collection) {
        return com.google.common.collect.Sets.removeAllImpl(this, (java.util.Collection<?>) com.google.common.base.Preconditions.checkNotNull(collection));
    }

    protected boolean standardEquals(@javax.annotation.CheckForNull java.lang.Object object) {
        return com.google.common.collect.Sets.equalsImpl(this, object);
    }

    protected int standardHashCode() {
        return com.google.common.collect.Sets.hashCodeImpl(this);
    }
}
