package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable(containerOf = {"N", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST})
@com.google.common.graph.ElementTypesAreNonnullByDefault
public final class ImmutableNetwork<N, E> extends com.google.common.graph.StandardNetwork<N, E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ java.util.Set adjacentNodes(java.lang.Object node) {
        return super.adjacentNodes(node);
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean allowsParallelEdges() {
        return super.allowsParallelEdges();
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
        return super.allowsSelfLoops();
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ com.google.common.graph.ElementOrder edgeOrder() {
        return super.edgeOrder();
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ java.util.Set edges() {
        return super.edges();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ java.util.Set edgesConnecting(java.lang.Object nodeU, java.lang.Object nodeV) {
        return super.edgesConnecting(nodeU, nodeV);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ java.util.Set inEdges(java.lang.Object node) {
        return super.inEdges(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ java.util.Set incidentEdges(java.lang.Object node) {
        return super.incidentEdges(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ com.google.common.graph.EndpointPair incidentNodes(java.lang.Object edge) {
        return super.incidentNodes(edge);
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean isDirected() {
        return super.isDirected();
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ com.google.common.graph.ElementOrder nodeOrder() {
        return super.nodeOrder();
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ java.util.Set nodes() {
        return super.nodes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ java.util.Set outEdges(java.lang.Object node) {
        return super.outEdges(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set predecessors(java.lang.Object node) {
        return super.predecessors(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set successors(java.lang.Object node) {
        return super.successors(node);
    }

    private ImmutableNetwork(com.google.common.graph.Network<N, E> network) {
        super(com.google.common.graph.NetworkBuilder.from(network), getNodeConnections(network), getEdgeToReferenceNode(network));
    }

    public static <N, E> com.google.common.graph.ImmutableNetwork<N, E> copyOf(com.google.common.graph.Network<N, E> network) {
        if (network instanceof com.google.common.graph.ImmutableNetwork) {
            return (com.google.common.graph.ImmutableNetwork) network;
        }
        return new com.google.common.graph.ImmutableNetwork<>(network);
    }

    @java.lang.Deprecated
    public static <N, E> com.google.common.graph.ImmutableNetwork<N, E> copyOf(com.google.common.graph.ImmutableNetwork<N, E> network) {
        return (com.google.common.graph.ImmutableNetwork) com.google.common.base.Preconditions.checkNotNull(network);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public com.google.common.graph.ImmutableGraph<N> asGraph() {
        return new com.google.common.graph.ImmutableGraph<>(super.asGraph());
    }

    private static <N, E> java.util.Map<N, com.google.common.graph.NetworkConnections<N, E>> getNodeConnections(com.google.common.graph.Network<N, E> network) {
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        for (N n : network.nodes()) {
            builder.put(n, connectionsOf(network, n));
        }
        return builder.buildOrThrow();
    }

    private static <N, E> java.util.Map<E, N> getEdgeToReferenceNode(com.google.common.graph.Network<N, E> network) {
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        for (E e : network.edges()) {
            builder.put(e, network.incidentNodes(e).nodeU());
        }
        return builder.buildOrThrow();
    }

    private static <N, E> com.google.common.graph.NetworkConnections<N, E> connectionsOf(com.google.common.graph.Network<N, E> network, N node) {
        if (network.isDirected()) {
            java.util.Map mapAsMap = com.google.common.collect.Maps.asMap(network.inEdges(node), sourceNodeFn(network));
            java.util.Map mapAsMap2 = com.google.common.collect.Maps.asMap(network.outEdges(node), targetNodeFn(network));
            int size = network.edgesConnecting(node, node).size();
            if (network.allowsParallelEdges()) {
                return com.google.common.graph.DirectedMultiNetworkConnections.ofImmutable(mapAsMap, mapAsMap2, size);
            }
            return com.google.common.graph.DirectedNetworkConnections.ofImmutable(mapAsMap, mapAsMap2, size);
        }
        java.util.Map mapAsMap3 = com.google.common.collect.Maps.asMap(network.incidentEdges(node), adjacentNodeFn(network, node));
        if (network.allowsParallelEdges()) {
            return com.google.common.graph.UndirectedMultiNetworkConnections.ofImmutable(mapAsMap3);
        }
        return com.google.common.graph.UndirectedNetworkConnections.ofImmutable(mapAsMap3);
    }

    private static <N, E> com.google.common.base.Function<E, N> sourceNodeFn(final com.google.common.graph.Network<N, E> network) {
        return new com.google.common.base.Function() { // from class: com.google.common.graph.ImmutableNetwork$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return network.incidentNodes(obj).source();
            }
        };
    }

    private static <N, E> com.google.common.base.Function<E, N> targetNodeFn(final com.google.common.graph.Network<N, E> network) {
        return new com.google.common.base.Function() { // from class: com.google.common.graph.ImmutableNetwork$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return network.incidentNodes(obj).target();
            }
        };
    }

    private static <N, E> com.google.common.base.Function<E, N> adjacentNodeFn(final com.google.common.graph.Network<N, E> network, final N node) {
        return new com.google.common.base.Function() { // from class: com.google.common.graph.ImmutableNetwork$$ExternalSyntheticLambda2
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return network.incidentNodes(obj).adjacentNode(node);
            }
        };
    }

    public static class Builder<N, E> {
        private final com.google.common.graph.MutableNetwork<N, E> mutableNetwork;

        Builder(com.google.common.graph.NetworkBuilder<N, E> networkBuilder) {
            this.mutableNetwork = (com.google.common.graph.MutableNetwork<N, E>) networkBuilder.build();
        }

        public com.google.common.graph.ImmutableNetwork.Builder<N, E> addNode(N node) {
            this.mutableNetwork.addNode(node);
            return this;
        }

        public com.google.common.graph.ImmutableNetwork.Builder<N, E> addEdge(N nodeU, N nodeV, E edge) {
            this.mutableNetwork.addEdge(nodeU, nodeV, edge);
            return this;
        }

        public com.google.common.graph.ImmutableNetwork.Builder<N, E> addEdge(com.google.common.graph.EndpointPair<N> endpoints, E edge) {
            this.mutableNetwork.addEdge(endpoints, edge);
            return this;
        }

        public com.google.common.graph.ImmutableNetwork<N, E> build() {
            return com.google.common.graph.ImmutableNetwork.copyOf(this.mutableNetwork);
        }
    }
}
