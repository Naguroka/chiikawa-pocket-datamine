package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class DirectedNetworkConnections<N, E> extends com.google.common.graph.AbstractDirectedNetworkConnections<N, E> {
    DirectedNetworkConnections(java.util.Map<E, N> inEdgeMap, java.util.Map<E, N> outEdgeMap, int selfLoopCount) {
        super(inEdgeMap, outEdgeMap, selfLoopCount);
    }

    static <N, E> com.google.common.graph.DirectedNetworkConnections<N, E> of() {
        return new com.google.common.graph.DirectedNetworkConnections<>(com.google.common.collect.HashBiMap.create(2), com.google.common.collect.HashBiMap.create(2), 0);
    }

    static <N, E> com.google.common.graph.DirectedNetworkConnections<N, E> ofImmutable(java.util.Map<E, N> inEdges, java.util.Map<E, N> outEdges, int selfLoopCount) {
        return new com.google.common.graph.DirectedNetworkConnections<>(com.google.common.collect.ImmutableBiMap.copyOf((java.util.Map) inEdges), com.google.common.collect.ImmutableBiMap.copyOf((java.util.Map) outEdges), selfLoopCount);
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> predecessors() {
        return java.util.Collections.unmodifiableSet(((com.google.common.collect.BiMap) this.inEdgeMap).values());
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> successors() {
        return java.util.Collections.unmodifiableSet(((com.google.common.collect.BiMap) this.outEdgeMap).values());
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> edgesConnecting(N node) {
        return new com.google.common.graph.EdgesConnecting(((com.google.common.collect.BiMap) this.outEdgeMap).inverse(), node);
    }
}
