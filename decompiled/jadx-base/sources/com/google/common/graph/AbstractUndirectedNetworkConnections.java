package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
abstract class AbstractUndirectedNetworkConnections<N, E> implements com.google.common.graph.NetworkConnections<N, E> {
    final java.util.Map<E, N> incidentEdgeMap;

    AbstractUndirectedNetworkConnections(java.util.Map<E, N> incidentEdgeMap) {
        this.incidentEdgeMap = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(incidentEdgeMap);
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> predecessors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> successors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> incidentEdges() {
        return java.util.Collections.unmodifiableSet(this.incidentEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> inEdges() {
        return incidentEdges();
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> outEdges() {
        return incidentEdges();
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e) {
        return (N) java.util.Objects.requireNonNull(this.incidentEdgeMap.get(e));
    }

    @Override // com.google.common.graph.NetworkConnections
    @javax.annotation.CheckForNull
    public N removeInEdge(E edge, boolean isSelfLoop) {
        if (isSelfLoop) {
            return null;
        }
        return removeOutEdge(edge);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e) {
        return (N) java.util.Objects.requireNonNull(this.incidentEdgeMap.remove(e));
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E edge, N node, boolean isSelfLoop) {
        if (isSelfLoop) {
            return;
        }
        addOutEdge(edge, node);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E edge, N node) {
        com.google.common.base.Preconditions.checkState(this.incidentEdgeMap.put(edge, node) == null);
    }
}
