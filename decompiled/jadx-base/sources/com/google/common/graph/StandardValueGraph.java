package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
class StandardValueGraph<N, V> extends com.google.common.graph.AbstractValueGraph<N, V> {
    private final boolean allowsSelfLoops;
    long edgeCount;
    private final boolean isDirected;
    final com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> nodeConnections;
    private final com.google.common.graph.ElementOrder<N> nodeOrder;

    StandardValueGraph(com.google.common.graph.AbstractGraphBuilder<? super N> builder) {
        this(builder, builder.nodeOrder.createMap(builder.expectedNodeCount.or(10).intValue()), 0L);
    }

    StandardValueGraph(com.google.common.graph.AbstractGraphBuilder<? super N> abstractGraphBuilder, java.util.Map<N, com.google.common.graph.GraphConnections<N, V>> map, long j) {
        com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> mapIteratorCache;
        this.isDirected = abstractGraphBuilder.directed;
        this.allowsSelfLoops = abstractGraphBuilder.allowsSelfLoops;
        this.nodeOrder = (com.google.common.graph.ElementOrder<N>) abstractGraphBuilder.nodeOrder.cast();
        if (map instanceof java.util.TreeMap) {
            mapIteratorCache = new com.google.common.graph.MapRetrievalCache<>(map);
        } else {
            mapIteratorCache = new com.google.common.graph.MapIteratorCache<>(map);
        }
        this.nodeConnections = mapIteratorCache;
        this.edgeCount = com.google.common.graph.Graphs.checkNonNegative(j);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public java.util.Set<N> nodes() {
        return this.nodeConnections.unmodifiableKeySet();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean isDirected() {
        return this.isDirected;
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return this.allowsSelfLoops;
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public com.google.common.graph.ElementOrder<N> nodeOrder() {
        return this.nodeOrder;
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public java.util.Set<N> adjacentNodes(N node) {
        return checkedConnections(node).adjacentNodes();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public java.util.Set<N> predecessors(N node) {
        return checkedConnections(node).predecessors();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public java.util.Set<N> successors(N node) {
        return checkedConnections(node).successors();
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N node) {
        final com.google.common.graph.GraphConnections<N, V> graphConnectionsCheckedConnections = checkedConnections(node);
        return new com.google.common.graph.IncidentEdgeSet<N>(this, this, node) { // from class: com.google.common.graph.StandardValueGraph.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<com.google.common.graph.EndpointPair<N>> iterator() {
                return graphConnectionsCheckedConnections.incidentEdgeIterator(this.node);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N nodeU, N nodeV) {
        return hasEdgeConnectingInternal(com.google.common.base.Preconditions.checkNotNull(nodeU), com.google.common.base.Preconditions.checkNotNull(nodeV));
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpoints) {
        com.google.common.base.Preconditions.checkNotNull(endpoints);
        return isOrderingCompatible(endpoints) && hasEdgeConnectingInternal(endpoints.nodeU(), endpoints.nodeV());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @javax.annotation.CheckForNull
    public V edgeValueOrDefault(N n, N n2, @javax.annotation.CheckForNull V v) {
        return (V) edgeValueOrDefaultInternal(com.google.common.base.Preconditions.checkNotNull(n), com.google.common.base.Preconditions.checkNotNull(n2), v);
    }

    @javax.annotation.CheckForNull
    public V edgeValueOrDefault(com.google.common.graph.EndpointPair<N> endpoints, @javax.annotation.CheckForNull V defaultValue) {
        validateEndpoints(endpoints);
        return edgeValueOrDefaultInternal(endpoints.nodeU(), endpoints.nodeV(), defaultValue);
    }

    @Override // com.google.common.graph.AbstractBaseGraph
    protected long edgeCount() {
        return this.edgeCount;
    }

    private final com.google.common.graph.GraphConnections<N, V> checkedConnections(N node) {
        com.google.common.graph.GraphConnections<N, V> graphConnections = this.nodeConnections.get(node);
        if (graphConnections != null) {
            return graphConnections;
        }
        com.google.common.base.Preconditions.checkNotNull(node);
        throw new java.lang.IllegalArgumentException("Node " + node + " is not an element of this graph.");
    }

    final boolean containsNode(@javax.annotation.CheckForNull N node) {
        return this.nodeConnections.containsKey(node);
    }

    private final boolean hasEdgeConnectingInternal(N nodeU, N nodeV) {
        com.google.common.graph.GraphConnections<N, V> graphConnections = this.nodeConnections.get(nodeU);
        return graphConnections != null && graphConnections.successors().contains(nodeV);
    }

    @javax.annotation.CheckForNull
    private final V edgeValueOrDefaultInternal(N nodeU, N nodeV, @javax.annotation.CheckForNull V defaultValue) {
        com.google.common.graph.GraphConnections<N, V> graphConnections = this.nodeConnections.get(nodeU);
        V vValue = graphConnections == null ? null : graphConnections.value(nodeV);
        return vValue == null ? defaultValue : vValue;
    }
}
