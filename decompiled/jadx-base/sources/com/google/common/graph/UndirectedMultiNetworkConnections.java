package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class UndirectedMultiNetworkConnections<N, E> extends com.google.common.graph.AbstractUndirectedNetworkConnections<N, E> {

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.lang.ref.Reference<com.google.common.collect.Multiset<N>> adjacentNodesReference;

    private UndirectedMultiNetworkConnections(java.util.Map<E, N> incidentEdges) {
        super(incidentEdges);
    }

    static <N, E> com.google.common.graph.UndirectedMultiNetworkConnections<N, E> of() {
        return new com.google.common.graph.UndirectedMultiNetworkConnections<>(new java.util.HashMap(2, 1.0f));
    }

    static <N, E> com.google.common.graph.UndirectedMultiNetworkConnections<N, E> ofImmutable(java.util.Map<E, N> incidentEdges) {
        return new com.google.common.graph.UndirectedMultiNetworkConnections<>(com.google.common.collect.ImmutableMap.copyOf((java.util.Map) incidentEdges));
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> adjacentNodes() {
        return java.util.Collections.unmodifiableSet(adjacentNodesMultiset().elementSet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.Multiset<N> adjacentNodesMultiset() {
        com.google.common.collect.Multiset<N> multiset = (com.google.common.collect.Multiset) getReference(this.adjacentNodesReference);
        if (multiset != null) {
            return multiset;
        }
        com.google.common.collect.HashMultiset hashMultisetCreate = com.google.common.collect.HashMultiset.create(this.incidentEdgeMap.values());
        this.adjacentNodesReference = new java.lang.ref.SoftReference(hashMultisetCreate);
        return hashMultisetCreate;
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> edgesConnecting(final N node) {
        return new com.google.common.graph.MultiEdgesConnecting<E>(this.incidentEdgeMap, node) { // from class: com.google.common.graph.UndirectedMultiNetworkConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.graph.UndirectedMultiNetworkConnections.this.adjacentNodesMultiset().count(node);
            }
        };
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    @javax.annotation.CheckForNull
    public N removeInEdge(E edge, boolean isSelfLoop) {
        if (isSelfLoop) {
            return null;
        }
        return removeOutEdge(edge);
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e) {
        N n = (N) super.removeOutEdge(e);
        com.google.common.collect.Multiset multiset = (com.google.common.collect.Multiset) getReference(this.adjacentNodesReference);
        if (multiset != null) {
            com.google.common.base.Preconditions.checkState(multiset.remove(n));
        }
        return n;
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addInEdge(E edge, N node, boolean isSelfLoop) {
        if (isSelfLoop) {
            return;
        }
        addOutEdge(edge, node);
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addOutEdge(E edge, N node) {
        super.addOutEdge(edge, node);
        com.google.common.collect.Multiset multiset = (com.google.common.collect.Multiset) getReference(this.adjacentNodesReference);
        if (multiset != null) {
            com.google.common.base.Preconditions.checkState(multiset.add(node));
        }
    }

    @javax.annotation.CheckForNull
    private static <T> T getReference(@javax.annotation.CheckForNull java.lang.ref.Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }
}
