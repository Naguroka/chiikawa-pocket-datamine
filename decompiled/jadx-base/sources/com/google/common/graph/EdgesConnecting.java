package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class EdgesConnecting<E> extends java.util.AbstractSet<E> {
    private final java.util.Map<?, E> nodeToOutEdge;
    private final java.lang.Object targetNode;

    EdgesConnecting(java.util.Map<?, E> nodeToEdgeMap, java.lang.Object targetNode) {
        this.nodeToOutEdge = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(nodeToEdgeMap);
        this.targetNode = com.google.common.base.Preconditions.checkNotNull(targetNode);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
        E connectingEdge = getConnectingEdge();
        if (connectingEdge == null) {
            return com.google.common.collect.ImmutableSet.of().iterator();
        }
        return com.google.common.collect.Iterators.singletonIterator(connectingEdge);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return getConnectingEdge() == null ? 0 : 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object edge) {
        E connectingEdge = getConnectingEdge();
        return connectingEdge != null && connectingEdge.equals(edge);
    }

    @javax.annotation.CheckForNull
    private E getConnectingEdge() {
        return this.nodeToOutEdge.get(this.targetNode);
    }
}
