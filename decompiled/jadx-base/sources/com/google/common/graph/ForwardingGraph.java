package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
abstract class ForwardingGraph<N> extends com.google.common.graph.AbstractGraph<N> {
    abstract com.google.common.graph.BaseGraph<N> delegate();

    ForwardingGraph() {
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public java.util.Set<N> nodes() {
        return delegate().nodes();
    }

    @Override // com.google.common.graph.AbstractBaseGraph
    protected long edgeCount() {
        return delegate().edges().size();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean isDirected() {
        return delegate().isDirected();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return delegate().allowsSelfLoops();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public com.google.common.graph.ElementOrder<N> nodeOrder() {
        return delegate().nodeOrder();
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
        return delegate().incidentEdgeOrder();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public java.util.Set<N> adjacentNodes(N node) {
        return delegate().adjacentNodes(node);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public java.util.Set<N> predecessors(N node) {
        return delegate().predecessors((java.lang.Object) node);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public java.util.Set<N> successors(N node) {
        return delegate().successors((java.lang.Object) node);
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N node) {
        return delegate().incidentEdges(node);
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int degree(N node) {
        return delegate().degree(node);
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int inDegree(N node) {
        return delegate().inDegree(node);
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int outDegree(N node) {
        return delegate().outDegree(node);
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N nodeU, N nodeV) {
        return delegate().hasEdgeConnecting(nodeU, nodeV);
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpoints) {
        return delegate().hasEdgeConnecting(endpoints);
    }
}
