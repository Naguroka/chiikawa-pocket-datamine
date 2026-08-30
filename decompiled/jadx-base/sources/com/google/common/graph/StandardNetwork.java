package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
class StandardNetwork<N, E> extends com.google.common.graph.AbstractNetwork<N, E> {
    private final boolean allowsParallelEdges;
    private final boolean allowsSelfLoops;
    private final com.google.common.graph.ElementOrder<E> edgeOrder;
    final com.google.common.graph.MapIteratorCache<E, N> edgeToReferenceNode;
    private final boolean isDirected;
    final com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> nodeConnections;
    private final com.google.common.graph.ElementOrder<N> nodeOrder;

    StandardNetwork(com.google.common.graph.NetworkBuilder<? super N, ? super E> builder) {
        this(builder, builder.nodeOrder.createMap(builder.expectedNodeCount.or(10).intValue()), builder.edgeOrder.createMap(builder.expectedEdgeCount.or(20).intValue()));
    }

    StandardNetwork(com.google.common.graph.NetworkBuilder<? super N, ? super E> networkBuilder, java.util.Map<N, com.google.common.graph.NetworkConnections<N, E>> map, java.util.Map<E, N> map2) {
        com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> mapIteratorCache;
        this.isDirected = networkBuilder.directed;
        this.allowsParallelEdges = networkBuilder.allowsParallelEdges;
        this.allowsSelfLoops = networkBuilder.allowsSelfLoops;
        this.nodeOrder = (com.google.common.graph.ElementOrder<N>) networkBuilder.nodeOrder.cast();
        this.edgeOrder = (com.google.common.graph.ElementOrder<E>) networkBuilder.edgeOrder.cast();
        if (map instanceof java.util.TreeMap) {
            mapIteratorCache = new com.google.common.graph.MapRetrievalCache<>(map);
        } else {
            mapIteratorCache = new com.google.common.graph.MapIteratorCache<>(map);
        }
        this.nodeConnections = mapIteratorCache;
        this.edgeToReferenceNode = new com.google.common.graph.MapIteratorCache<>(map2);
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<N> nodes() {
        return this.nodeConnections.unmodifiableKeySet();
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> edges() {
        return this.edgeToReferenceNode.unmodifiableKeySet();
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
        return this.isDirected;
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
        return this.allowsParallelEdges;
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
        return this.allowsSelfLoops;
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.ElementOrder<N> nodeOrder() {
        return this.nodeOrder;
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.ElementOrder<E> edgeOrder() {
        return this.edgeOrder;
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> incidentEdges(N node) {
        return checkedConnections(node).incidentEdges();
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.EndpointPair<N> incidentNodes(E edge) {
        N nCheckedReferenceNode = checkedReferenceNode(edge);
        return com.google.common.graph.EndpointPair.of(this, nCheckedReferenceNode, ((com.google.common.graph.NetworkConnections) java.util.Objects.requireNonNull(this.nodeConnections.get(nCheckedReferenceNode))).adjacentNode(edge));
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<N> adjacentNodes(N node) {
        return checkedConnections(node).adjacentNodes();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public java.util.Set<E> edgesConnecting(N nodeU, N nodeV) {
        com.google.common.graph.NetworkConnections<N, E> networkConnectionsCheckedConnections = checkedConnections(nodeU);
        if (!this.allowsSelfLoops && nodeU == nodeV) {
            return com.google.common.collect.ImmutableSet.of();
        }
        com.google.common.base.Preconditions.checkArgument(containsNode(nodeV), "Node %s is not an element of this graph.", nodeV);
        return networkConnectionsCheckedConnections.edgesConnecting(nodeV);
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> inEdges(N node) {
        return checkedConnections(node).inEdges();
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> outEdges(N node) {
        return checkedConnections(node).outEdges();
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public java.util.Set<N> predecessors(N node) {
        return checkedConnections(node).predecessors();
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public java.util.Set<N> successors(N node) {
        return checkedConnections(node).successors();
    }

    final com.google.common.graph.NetworkConnections<N, E> checkedConnections(N node) {
        com.google.common.graph.NetworkConnections<N, E> networkConnections = this.nodeConnections.get(node);
        if (networkConnections != null) {
            return networkConnections;
        }
        com.google.common.base.Preconditions.checkNotNull(node);
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Node %s is not an element of this graph.", node));
    }

    final N checkedReferenceNode(E edge) {
        N n = this.edgeToReferenceNode.get(edge);
        if (n != null) {
            return n;
        }
        com.google.common.base.Preconditions.checkNotNull(edge);
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Edge %s is not an element of this graph.", edge));
    }

    final boolean containsNode(N node) {
        return this.nodeConnections.containsKey(node);
    }

    final boolean containsEdge(E edge) {
        return this.edgeToReferenceNode.containsKey(edge);
    }
}
