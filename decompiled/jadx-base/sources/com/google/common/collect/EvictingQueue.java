package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class EvictingQueue<E> extends com.google.common.collect.ForwardingQueue<E> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final java.util.Queue<E> delegate;
    final int maxSize;

    private EvictingQueue(int maxSize) {
        com.google.common.base.Preconditions.checkArgument(maxSize >= 0, "maxSize (%s) must >= 0", maxSize);
        this.delegate = new java.util.ArrayDeque(maxSize);
        this.maxSize = maxSize;
    }

    public static <E> com.google.common.collect.EvictingQueue<E> create(int maxSize) {
        return new com.google.common.collect.EvictingQueue<>(maxSize);
    }

    public int remainingCapacity() {
        return this.maxSize - size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public java.util.Queue<E> delegate() {
        return this.delegate;
    }

    @Override // com.google.common.collect.ForwardingQueue, java.util.Queue
    public boolean offer(E e) {
        return add(e);
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        com.google.common.base.Preconditions.checkNotNull(e);
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.delegate.remove();
        }
        this.delegate.add(e);
        return true;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
    public boolean addAll(java.util.Collection<? extends E> collection) {
        int size = collection.size();
        if (size >= this.maxSize) {
            clear();
            return com.google.common.collect.Iterables.addAll(this, com.google.common.collect.Iterables.skip(collection, size - this.maxSize));
        }
        return standardAddAll(collection);
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
        return super.toArray();
    }
}
