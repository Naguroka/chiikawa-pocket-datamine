package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable(containerOf = {"N"})
@com.google.common.graph.ElementTypesAreNonnullByDefault
public class ImmutableGraph<N> extends com.google.common.graph.ForwardingGraph<N> {
    private final com.google.common.graph.BaseGraph<N> backingGraph;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set adjacentNodes(java.lang.Object node) {
        return super.adjacentNodes(node);
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
        return super.allowsSelfLoops();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int degree(java.lang.Object node) {
        return super.degree(node);
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(com.google.common.graph.EndpointPair endpoints) {
        return super.hasEdgeConnecting(endpoints);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(java.lang.Object nodeU, java.lang.Object nodeV) {
        return super.hasEdgeConnecting(nodeU, nodeV);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int inDegree(java.lang.Object node) {
        return super.inDegree(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ java.util.Set incidentEdges(java.lang.Object node) {
        return super.incidentEdges(node);
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean isDirected() {
        return super.isDirected();
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ com.google.common.graph.ElementOrder nodeOrder() {
        return super.nodeOrder();
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set nodes() {
        return super.nodes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int outDegree(java.lang.Object node) {
        return super.outDegree(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set predecessors(java.lang.Object node) {
        return super.predecessors(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set successors(java.lang.Object node) {
        return super.successors(node);
    }

    ImmutableGraph(com.google.common.graph.BaseGraph<N> backingGraph) {
        this.backingGraph = backingGraph;
    }

    public static <N> com.google.common.graph.ImmutableGraph<N> copyOf(com.google.common.graph.Graph<N> graph) {
        if (graph instanceof com.google.common.graph.ImmutableGraph) {
            return (com.google.common.graph.ImmutableGraph) graph;
        }
        return new com.google.common.graph.ImmutableGraph<>(new com.google.common.graph.StandardValueGraph(com.google.common.graph.GraphBuilder.from(graph), getNodeConnections(graph), graph.edges().size()));
    }

    @java.lang.Deprecated
    public static <N> com.google.common.graph.ImmutableGraph<N> copyOf(com.google.common.graph.ImmutableGraph<N> graph) {
        return (com.google.common.graph.ImmutableGraph) com.google.common.base.Preconditions.checkNotNull(graph);
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
        return com.google.common.graph.ElementOrder.stable();
    }

    private static <N> com.google.common.collect.ImmutableMap<N, com.google.common.graph.GraphConnections<N, com.google.common.graph.GraphConstants.Presence>> getNodeConnections(com.google.common.graph.Graph<N> graph) {
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        for (N n : graph.nodes()) {
            builder.put(n, connectionsOf(graph, n));
        }
        return builder.buildOrThrow();
    }

    private static <N> com.google.common.graph.GraphConnections<N, com.google.common.graph.GraphConstants.Presence> connectionsOf(com.google.common.graph.Graph<N> graph, N node) {
        com.google.common.base.Function functionConstant = com.google.common.base.Functions.constant(com.google.common.graph.GraphConstants.Presence.EDGE_EXISTS);
        if (graph.isDirected()) {
            return com.google.common.graph.DirectedGraphConnections.ofImmutable(node, graph.incidentEdges(node), functionConstant);
        }
        return com.google.common.graph.UndirectedGraphConnections.ofImmutable(com.google.common.collect.Maps.asMap(graph.adjacentNodes(node), functionConstant));
    }

    @Override // com.google.common.graph.ForwardingGraph
    com.google.common.graph.BaseGraph<N> delegate() {
        return this.backingGraph;
    }

    public static class Builder<N> {
        private final com.google.common.graph.MutableGraph<N> mutableGraph;

        Builder(com.google.common.graph.GraphBuilder<N> graphBuilder) {
            this.mutableGraph = graphBuilder.copy().incidentEdgeOrder(com.google.common.graph.ElementOrder.stable()).build();
        }

        public com.google.common.graph.ImmutableGraph.Builder<N> addNode(N node) {
            this.mutableGraph.addNode(node);
            return this;
        }

        public com.google.common.graph.ImmutableGraph.Builder<N> putEdge(N nodeU, N nodeV) {
            this.mutableGraph.putEdge(nodeU, nodeV);
            return this;
        }

        public com.google.common.graph.ImmutableGraph.Builder<N> putEdge(com.google.common.graph.EndpointPair<N> endpoints) {
            this.mutableGraph.putEdge(endpoints);
            return this;
        }

        public com.google.common.graph.ImmutableGraph<N> build() {
            return com.google.common.graph.ImmutableGraph.copyOf(this.mutableGraph);
        }
    }
}
