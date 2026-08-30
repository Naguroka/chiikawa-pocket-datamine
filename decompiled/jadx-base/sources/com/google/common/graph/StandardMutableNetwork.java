package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class StandardMutableNetwork<N, E> extends com.google.common.graph.StandardNetwork<N, E> implements com.google.common.graph.MutableNetwork<N, E> {
    StandardMutableNetwork(com.google.common.graph.NetworkBuilder<? super N, ? super E> builder) {
        super(builder);
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean addNode(N node) {
        com.google.common.base.Preconditions.checkNotNull(node, "node");
        if (containsNode(node)) {
            return false;
        }
        addNodeInternal(node);
        return true;
    }

    private com.google.common.graph.NetworkConnections<N, E> addNodeInternal(N node) {
        com.google.common.graph.NetworkConnections<N, E> networkConnectionsNewConnections = newConnections();
        com.google.common.base.Preconditions.checkState(this.nodeConnections.put(node, networkConnectionsNewConnections) == null);
        return networkConnectionsNewConnections;
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean addEdge(N nodeU, N nodeV, E edge) {
        com.google.common.base.Preconditions.checkNotNull(nodeU, "nodeU");
        com.google.common.base.Preconditions.checkNotNull(nodeV, "nodeV");
        com.google.common.base.Preconditions.checkNotNull(edge, "edge");
        if (containsEdge(edge)) {
            com.google.common.graph.EndpointPair<N> endpointPairIncidentNodes = incidentNodes(edge);
            com.google.common.graph.EndpointPair endpointPairOf = com.google.common.graph.EndpointPair.of(this, nodeU, nodeV);
            com.google.common.base.Preconditions.checkArgument(endpointPairIncidentNodes.equals(endpointPairOf), "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.", edge, endpointPairIncidentNodes, endpointPairOf);
            return false;
        }
        com.google.common.graph.NetworkConnections<N, E> networkConnectionsAddNodeInternal = this.nodeConnections.get(nodeU);
        if (!allowsParallelEdges()) {
            com.google.common.base.Preconditions.checkArgument(networkConnectionsAddNodeInternal == null || !networkConnectionsAddNodeInternal.successors().contains(nodeV), "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.", nodeU, nodeV);
        }
        boolean zEquals = nodeU.equals(nodeV);
        if (!allowsSelfLoops()) {
            com.google.common.base.Preconditions.checkArgument(!zEquals, "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", nodeU);
        }
        if (networkConnectionsAddNodeInternal == null) {
            networkConnectionsAddNodeInternal = addNodeInternal(nodeU);
        }
        networkConnectionsAddNodeInternal.addOutEdge(edge, nodeV);
        com.google.common.graph.NetworkConnections<N, E> networkConnectionsAddNodeInternal2 = this.nodeConnections.get(nodeV);
        if (networkConnectionsAddNodeInternal2 == null) {
            networkConnectionsAddNodeInternal2 = addNodeInternal(nodeV);
        }
        networkConnectionsAddNodeInternal2.addInEdge(edge, nodeU, zEquals);
        this.edgeToReferenceNode.put(edge, nodeU);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean addEdge(com.google.common.graph.EndpointPair<N> endpoints, E edge) {
        validateEndpoints(endpoints);
        return addEdge(endpoints.nodeU(), endpoints.nodeV(), edge);
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean removeNode(N node) {
        com.google.common.base.Preconditions.checkNotNull(node, "node");
        com.google.common.graph.NetworkConnections<N, E> networkConnections = this.nodeConnections.get(node);
        if (networkConnections == null) {
            return false;
        }
        com.google.common.collect.UnmodifiableIterator<E> it = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) networkConnections.incidentEdges()).iterator();
        while (it.hasNext()) {
            removeEdge(it.next());
        }
        this.nodeConnections.remove(node);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean removeEdge(E edge) {
        com.google.common.base.Preconditions.checkNotNull(edge, "edge");
        N n = this.edgeToReferenceNode.get(edge);
        boolean z = false;
        if (n == null) {
            return false;
        }
        com.google.common.graph.NetworkConnections networkConnections = (com.google.common.graph.NetworkConnections) java.util.Objects.requireNonNull(this.nodeConnections.get(n));
        java.lang.Object objAdjacentNode = networkConnections.adjacentNode(edge);
        com.google.common.graph.NetworkConnections networkConnections2 = (com.google.common.graph.NetworkConnections) java.util.Objects.requireNonNull(this.nodeConnections.get(objAdjacentNode));
        networkConnections.removeOutEdge(edge);
        if (allowsSelfLoops() && n.equals(objAdjacentNode)) {
            z = true;
        }
        networkConnections2.removeInEdge(edge, z);
        this.edgeToReferenceNode.remove(edge);
        return true;
    }

    private com.google.common.graph.NetworkConnections<N, E> newConnections() {
        if (isDirected()) {
            if (allowsParallelEdges()) {
                return com.google.common.graph.DirectedMultiNetworkConnections.of();
            }
            return com.google.common.graph.DirectedNetworkConnections.of();
        }
        if (allowsParallelEdges()) {
            return com.google.common.graph.UndirectedMultiNetworkConnections.of();
        }
        return com.google.common.graph.UndirectedNetworkConnections.of();
    }
}
