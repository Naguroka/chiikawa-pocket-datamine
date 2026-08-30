package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class StandardMutableGraph<N> extends com.google.common.graph.ForwardingGraph<N> implements com.google.common.graph.MutableGraph<N> {
    private final com.google.common.graph.MutableValueGraph<N, com.google.common.graph.GraphConstants.Presence> backingValueGraph;

    StandardMutableGraph(com.google.common.graph.AbstractGraphBuilder<? super N> builder) {
        this.backingValueGraph = new com.google.common.graph.StandardMutableValueGraph(builder);
    }

    @Override // com.google.common.graph.ForwardingGraph
    com.google.common.graph.BaseGraph<N> delegate() {
        return this.backingValueGraph;
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean addNode(N node) {
        return this.backingValueGraph.addNode(node);
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean putEdge(N nodeU, N nodeV) {
        return this.backingValueGraph.putEdgeValue(nodeU, nodeV, com.google.common.graph.GraphConstants.Presence.EDGE_EXISTS) == null;
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean putEdge(com.google.common.graph.EndpointPair<N> endpoints) {
        validateEndpoints(endpoints);
        return putEdge(endpoints.nodeU(), endpoints.nodeV());
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeNode(N node) {
        return this.backingValueGraph.removeNode(node);
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeEdge(N nodeU, N nodeV) {
        return this.backingValueGraph.removeEdge(nodeU, nodeV) != null;
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeEdge(com.google.common.graph.EndpointPair<N> endpoints) {
        validateEndpoints(endpoints);
        return removeEdge(endpoints.nodeU(), endpoints.nodeV());
    }
}
