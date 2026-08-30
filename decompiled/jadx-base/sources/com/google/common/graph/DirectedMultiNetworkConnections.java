package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class DirectedMultiNetworkConnections<N, E> extends com.google.common.graph.AbstractDirectedNetworkConnections<N, E> {

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.lang.ref.Reference<com.google.common.collect.Multiset<N>> predecessorsReference;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.lang.ref.Reference<com.google.common.collect.Multiset<N>> successorsReference;

    private DirectedMultiNetworkConnections(java.util.Map<E, N> inEdges, java.util.Map<E, N> outEdges, int selfLoopCount) {
        super(inEdges, outEdges, selfLoopCount);
    }

    static <N, E> com.google.common.graph.DirectedMultiNetworkConnections<N, E> of() {
        return new com.google.common.graph.DirectedMultiNetworkConnections<>(new java.util.HashMap(2, 1.0f), new java.util.HashMap(2, 1.0f), 0);
    }

    static <N, E> com.google.common.graph.DirectedMultiNetworkConnections<N, E> ofImmutable(java.util.Map<E, N> inEdges, java.util.Map<E, N> outEdges, int selfLoopCount) {
        return new com.google.common.graph.DirectedMultiNetworkConnections<>(com.google.common.collect.ImmutableMap.copyOf((java.util.Map) inEdges), com.google.common.collect.ImmutableMap.copyOf((java.util.Map) outEdges), selfLoopCount);
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> predecessors() {
        return java.util.Collections.unmodifiableSet(predecessorsMultiset().elementSet());
    }

    private com.google.common.collect.Multiset<N> predecessorsMultiset() {
        com.google.common.collect.Multiset<N> multiset = (com.google.common.collect.Multiset) getReference(this.predecessorsReference);
        if (multiset != null) {
            return multiset;
        }
        com.google.common.collect.HashMultiset hashMultisetCreate = com.google.common.collect.HashMultiset.create(this.inEdgeMap.values());
        this.predecessorsReference = new java.lang.ref.SoftReference(hashMultisetCreate);
        return hashMultisetCreate;
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> successors() {
        return java.util.Collections.unmodifiableSet(successorsMultiset().elementSet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.Multiset<N> successorsMultiset() {
        com.google.common.collect.Multiset<N> multiset = (com.google.common.collect.Multiset) getReference(this.successorsReference);
        if (multiset != null) {
            return multiset;
        }
        com.google.common.collect.HashMultiset hashMultisetCreate = com.google.common.collect.HashMultiset.create(this.outEdgeMap.values());
        this.successorsReference = new java.lang.ref.SoftReference(hashMultisetCreate);
        return hashMultisetCreate;
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> edgesConnecting(final N node) {
        return new com.google.common.graph.MultiEdgesConnecting<E>(this.outEdgeMap, node) { // from class: com.google.common.graph.DirectedMultiNetworkConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.graph.DirectedMultiNetworkConnections.this.successorsMultiset().count(node);
            }
        };
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeInEdge(E e, boolean z) {
        N n = (N) super.removeInEdge(e, z);
        com.google.common.collect.Multiset multiset = (com.google.common.collect.Multiset) getReference(this.predecessorsReference);
        if (multiset != null) {
            com.google.common.base.Preconditions.checkState(multiset.remove(n));
        }
        return n;
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e) {
        N n = (N) super.removeOutEdge(e);
        com.google.common.collect.Multiset multiset = (com.google.common.collect.Multiset) getReference(this.successorsReference);
        if (multiset != null) {
            com.google.common.base.Preconditions.checkState(multiset.remove(n));
        }
        return n;
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addInEdge(E edge, N node, boolean isSelfLoop) {
        super.addInEdge(edge, node, isSelfLoop);
        com.google.common.collect.Multiset multiset = (com.google.common.collect.Multiset) getReference(this.predecessorsReference);
        if (multiset != null) {
            com.google.common.base.Preconditions.checkState(multiset.add(node));
        }
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addOutEdge(E edge, N node) {
        super.addOutEdge(edge, node);
        com.google.common.collect.Multiset multiset = (com.google.common.collect.Multiset) getReference(this.successorsReference);
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
