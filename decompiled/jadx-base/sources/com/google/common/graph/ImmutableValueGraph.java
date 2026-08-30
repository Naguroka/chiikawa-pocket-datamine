package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable(containerOf = {"N", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED})
@com.google.common.graph.ElementTypesAreNonnullByDefault
public final class ImmutableValueGraph<N, V> extends com.google.common.graph.StandardValueGraph<N, V> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set adjacentNodes(java.lang.Object node) {
        return super.adjacentNodes(node);
    }

    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
        return super.allowsSelfLoops();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.ValueGraph
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ java.lang.Object edgeValueOrDefault(com.google.common.graph.EndpointPair endpoints, @javax.annotation.CheckForNull java.lang.Object defaultValue) {
        return super.edgeValueOrDefault(endpoints, defaultValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.ValueGraph
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ java.lang.Object edgeValueOrDefault(java.lang.Object nodeU, java.lang.Object nodeV, @javax.annotation.CheckForNull java.lang.Object defaultValue) {
        return super.edgeValueOrDefault(nodeU, nodeV, defaultValue);
    }

    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(com.google.common.graph.EndpointPair endpoints) {
        return super.hasEdgeConnecting(endpoints);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(java.lang.Object nodeU, java.lang.Object nodeV) {
        return super.hasEdgeConnecting(nodeU, nodeV);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ java.util.Set incidentEdges(java.lang.Object node) {
        return super.incidentEdges(node);
    }

    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean isDirected() {
        return super.isDirected();
    }

    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ com.google.common.graph.ElementOrder nodeOrder() {
        return super.nodeOrder();
    }

    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set nodes() {
        return super.nodes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set predecessors(java.lang.Object node) {
        return super.predecessors(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set successors(java.lang.Object node) {
        return super.successors(node);
    }

    private ImmutableValueGraph(com.google.common.graph.ValueGraph<N, V> graph) {
        super(com.google.common.graph.ValueGraphBuilder.from(graph), getNodeConnections(graph), graph.edges().size());
    }

    public static <N, V> com.google.common.graph.ImmutableValueGraph<N, V> copyOf(com.google.common.graph.ValueGraph<N, V> graph) {
        if (graph instanceof com.google.common.graph.ImmutableValueGraph) {
            return (com.google.common.graph.ImmutableValueGraph) graph;
        }
        return new com.google.common.graph.ImmutableValueGraph<>(graph);
    }

    @java.lang.Deprecated
    public static <N, V> com.google.common.graph.ImmutableValueGraph<N, V> copyOf(com.google.common.graph.ImmutableValueGraph<N, V> graph) {
        return (com.google.common.graph.ImmutableValueGraph) com.google.common.base.Preconditions.checkNotNull(graph);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
        return com.google.common.graph.ElementOrder.stable();
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.ValueGraph
    public com.google.common.graph.ImmutableGraph<N> asGraph() {
        return new com.google.common.graph.ImmutableGraph<>(this);
    }

    private static <N, V> com.google.common.collect.ImmutableMap<N, com.google.common.graph.GraphConnections<N, V>> getNodeConnections(com.google.common.graph.ValueGraph<N, V> graph) {
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        for (N n : graph.nodes()) {
            builder.put(n, connectionsOf(graph, n));
        }
        return builder.buildOrThrow();
    }

    private static <N, V> com.google.common.graph.GraphConnections<N, V> connectionsOf(final com.google.common.graph.ValueGraph<N, V> graph, final N node) {
        com.google.common.base.Function function = new com.google.common.base.Function() { // from class: com.google.common.graph.ImmutableValueGraph$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return java.util.Objects.requireNonNull(graph.edgeValueOrDefault(node, obj, null));
            }
        };
        if (graph.isDirected()) {
            return com.google.common.graph.DirectedGraphConnections.ofImmutable(node, graph.incidentEdges(node), function);
        }
        return com.google.common.graph.UndirectedGraphConnections.ofImmutable(com.google.common.collect.Maps.asMap(graph.adjacentNodes(node), function));
    }

    public static class Builder<N, V> {
        private final com.google.common.graph.MutableValueGraph<N, V> mutableValueGraph;

        Builder(com.google.common.graph.ValueGraphBuilder<N, V> graphBuilder) {
            this.mutableValueGraph = graphBuilder.copy().incidentEdgeOrder(com.google.common.graph.ElementOrder.stable()).build();
        }

        public com.google.common.graph.ImmutableValueGraph.Builder<N, V> addNode(N node) {
            this.mutableValueGraph.addNode(node);
            return this;
        }

        public com.google.common.graph.ImmutableValueGraph.Builder<N, V> putEdgeValue(N nodeU, N nodeV, V value) {
            this.mutableValueGraph.putEdgeValue(nodeU, nodeV, value);
            return this;
        }

        public com.google.common.graph.ImmutableValueGraph.Builder<N, V> putEdgeValue(com.google.common.graph.EndpointPair<N> endpoints, V value) {
            this.mutableValueGraph.putEdgeValue(endpoints, value);
            return this;
        }

        public com.google.common.graph.ImmutableValueGraph<N, V> build() {
            return com.google.common.graph.ImmutableValueGraph.copyOf(this.mutableValueGraph);
        }
    }
}
