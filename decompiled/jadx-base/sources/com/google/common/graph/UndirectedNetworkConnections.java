package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class UndirectedNetworkConnections<N, E> extends com.google.common.graph.AbstractUndirectedNetworkConnections<N, E> {
    UndirectedNetworkConnections(java.util.Map<E, N> incidentEdgeMap) {
        super(incidentEdgeMap);
    }

    static <N, E> com.google.common.graph.UndirectedNetworkConnections<N, E> of() {
        return new com.google.common.graph.UndirectedNetworkConnections<>(com.google.common.collect.HashBiMap.create(2));
    }

    static <N, E> com.google.common.graph.UndirectedNetworkConnections<N, E> ofImmutable(java.util.Map<E, N> incidentEdges) {
        return new com.google.common.graph.UndirectedNetworkConnections<>(com.google.common.collect.ImmutableBiMap.copyOf((java.util.Map) incidentEdges));
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> adjacentNodes() {
        return java.util.Collections.unmodifiableSet(((com.google.common.collect.BiMap) this.incidentEdgeMap).values());
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> edgesConnecting(N node) {
        return new com.google.common.graph.EdgesConnecting(((com.google.common.collect.BiMap) this.incidentEdgeMap).inverse(), node);
    }
}
