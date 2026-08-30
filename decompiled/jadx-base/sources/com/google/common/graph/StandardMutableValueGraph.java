package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class StandardMutableValueGraph<N, V> extends com.google.common.graph.StandardValueGraph<N, V> implements com.google.common.graph.MutableValueGraph<N, V> {
    private final com.google.common.graph.ElementOrder<N> incidentEdgeOrder;

    StandardMutableValueGraph(com.google.common.graph.AbstractGraphBuilder<? super N> abstractGraphBuilder) {
        super(abstractGraphBuilder);
        this.incidentEdgeOrder = (com.google.common.graph.ElementOrder<N>) abstractGraphBuilder.incidentEdgeOrder.cast();
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
        return this.incidentEdgeOrder;
    }

    @Override // com.google.common.graph.MutableValueGraph
    public boolean addNode(N node) {
        com.google.common.base.Preconditions.checkNotNull(node, "node");
        if (containsNode(node)) {
            return false;
        }
        addNodeInternal(node);
        return true;
    }

    private com.google.common.graph.GraphConnections<N, V> addNodeInternal(N node) {
        com.google.common.graph.GraphConnections<N, V> graphConnectionsNewConnections = newConnections();
        com.google.common.base.Preconditions.checkState(this.nodeConnections.put(node, graphConnectionsNewConnections) == null);
        return graphConnectionsNewConnections;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @javax.annotation.CheckForNull
    public V putEdgeValue(N nodeU, N nodeV, V value) {
        com.google.common.base.Preconditions.checkNotNull(nodeU, "nodeU");
        com.google.common.base.Preconditions.checkNotNull(nodeV, "nodeV");
        com.google.common.base.Preconditions.checkNotNull(value, "value");
        if (!allowsSelfLoops()) {
            com.google.common.base.Preconditions.checkArgument(!nodeU.equals(nodeV), "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", nodeU);
        }
        com.google.common.graph.GraphConnections<N, V> graphConnectionsAddNodeInternal = this.nodeConnections.get(nodeU);
        if (graphConnectionsAddNodeInternal == null) {
            graphConnectionsAddNodeInternal = addNodeInternal(nodeU);
        }
        V vAddSuccessor = graphConnectionsAddNodeInternal.addSuccessor(nodeV, value);
        com.google.common.graph.GraphConnections<N, V> graphConnectionsAddNodeInternal2 = this.nodeConnections.get(nodeV);
        if (graphConnectionsAddNodeInternal2 == null) {
            graphConnectionsAddNodeInternal2 = addNodeInternal(nodeV);
        }
        graphConnectionsAddNodeInternal2.addPredecessor(nodeU, value);
        if (vAddSuccessor == null) {
            long j = this.edgeCount + 1;
            this.edgeCount = j;
            com.google.common.graph.Graphs.checkPositive(j);
        }
        return vAddSuccessor;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @javax.annotation.CheckForNull
    public V putEdgeValue(com.google.common.graph.EndpointPair<N> endpoints, V value) {
        validateEndpoints(endpoints);
        return putEdgeValue(endpoints.nodeU(), endpoints.nodeV(), value);
    }

    @Override // com.google.common.graph.MutableValueGraph
    public boolean removeNode(N n) {
        com.google.common.base.Preconditions.checkNotNull(n, "node");
        com.google.common.graph.GraphConnections graphConnections = (com.google.common.graph.GraphConnections<N, V>) this.nodeConnections.get(n);
        if (graphConnections == null) {
            return false;
        }
        if (allowsSelfLoops() && graphConnections.removeSuccessor(n) != null) {
            graphConnections.removePredecessor(n);
            this.edgeCount--;
        }
        com.google.common.collect.UnmodifiableIterator it = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) graphConnections.successors()).iterator();
        while (it.hasNext()) {
            E next = it.next();
            ((com.google.common.graph.GraphConnections) java.util.Objects.requireNonNull(this.nodeConnections.getWithoutCaching(next))).removePredecessor(n);
            java.util.Objects.requireNonNull(graphConnections.removeSuccessor(next));
            this.edgeCount--;
        }
        if (isDirected()) {
            com.google.common.collect.UnmodifiableIterator it2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) graphConnections.predecessors()).iterator();
            while (it2.hasNext()) {
                E next2 = it2.next();
                com.google.common.base.Preconditions.checkState(((com.google.common.graph.GraphConnections) java.util.Objects.requireNonNull(this.nodeConnections.getWithoutCaching(next2))).removeSuccessor(n) != null);
                graphConnections.removePredecessor(next2);
                this.edgeCount--;
            }
        }
        this.nodeConnections.remove(n);
        com.google.common.graph.Graphs.checkNonNegative(this.edgeCount);
        return true;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @javax.annotation.CheckForNull
    public V removeEdge(N nodeU, N nodeV) {
        com.google.common.base.Preconditions.checkNotNull(nodeU, "nodeU");
        com.google.common.base.Preconditions.checkNotNull(nodeV, "nodeV");
        com.google.common.graph.GraphConnections<N, V> graphConnections = this.nodeConnections.get(nodeU);
        com.google.common.graph.GraphConnections<N, V> graphConnections2 = this.nodeConnections.get(nodeV);
        if (graphConnections == null || graphConnections2 == null) {
            return null;
        }
        V vRemoveSuccessor = graphConnections.removeSuccessor(nodeV);
        if (vRemoveSuccessor != null) {
            graphConnections2.removePredecessor(nodeU);
            long j = this.edgeCount - 1;
            this.edgeCount = j;
            com.google.common.graph.Graphs.checkNonNegative(j);
        }
        return vRemoveSuccessor;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @javax.annotation.CheckForNull
    public V removeEdge(com.google.common.graph.EndpointPair<N> endpoints) {
        validateEndpoints(endpoints);
        return removeEdge(endpoints.nodeU(), endpoints.nodeV());
    }

    private com.google.common.graph.GraphConnections<N, V> newConnections() {
        if (isDirected()) {
            return com.google.common.graph.DirectedGraphConnections.of(this.incidentEdgeOrder);
        }
        return com.google.common.graph.UndirectedGraphConnections.of(this.incidentEdgeOrder);
    }
}
