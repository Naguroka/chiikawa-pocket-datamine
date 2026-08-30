package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
public final class Graphs {

    private enum NodeVisitState {
        PENDING,
        COMPLETE
    }

    private Graphs() {
    }

    public static <N> boolean hasCycle(com.google.common.graph.Graph<N> graph) {
        int size = graph.edges().size();
        if (size == 0) {
            return false;
        }
        if (!graph.isDirected() && size >= graph.nodes().size()) {
            return true;
        }
        java.util.HashMap mapNewHashMapWithExpectedSize = com.google.common.collect.Maps.newHashMapWithExpectedSize(graph.nodes().size());
        java.util.Iterator<N> it = graph.nodes().iterator();
        while (it.hasNext()) {
            if (subgraphHasCycle(graph, mapNewHashMapWithExpectedSize, it.next(), null)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasCycle(com.google.common.graph.Network<?, ?> network) {
        if (network.isDirected() || !network.allowsParallelEdges() || network.edges().size() <= network.asGraph().edges().size()) {
            return hasCycle(network.asGraph());
        }
        return true;
    }

    private static <N> boolean subgraphHasCycle(com.google.common.graph.Graph<N> graph, java.util.Map<java.lang.Object, com.google.common.graph.Graphs.NodeVisitState> visitedNodes, N node, @javax.annotation.CheckForNull N previousNode) {
        com.google.common.graph.Graphs.NodeVisitState nodeVisitState = visitedNodes.get(node);
        if (nodeVisitState == com.google.common.graph.Graphs.NodeVisitState.COMPLETE) {
            return false;
        }
        if (nodeVisitState == com.google.common.graph.Graphs.NodeVisitState.PENDING) {
            return true;
        }
        visitedNodes.put(node, com.google.common.graph.Graphs.NodeVisitState.PENDING);
        for (N n : graph.successors((java.lang.Object) node)) {
            if (canTraverseWithoutReusingEdge(graph, n, previousNode) && subgraphHasCycle(graph, visitedNodes, n, node)) {
                return true;
            }
        }
        visitedNodes.put(node, com.google.common.graph.Graphs.NodeVisitState.COMPLETE);
        return false;
    }

    private static boolean canTraverseWithoutReusingEdge(com.google.common.graph.Graph<?> graph, java.lang.Object nextNode, @javax.annotation.CheckForNull java.lang.Object previousNode) {
        return graph.isDirected() || !com.google.common.base.Objects.equal(previousNode, nextNode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N> com.google.common.graph.Graph<N> transitiveClosure(com.google.common.graph.Graph<N> graph) {
        com.google.common.graph.StandardMutableGraph standardMutableGraphBuild = com.google.common.graph.GraphBuilder.from(graph).allowsSelfLoops(true).build();
        if (graph.isDirected()) {
            for (N n : graph.nodes()) {
                java.util.Iterator it = reachableNodes(graph, n).iterator();
                while (it.hasNext()) {
                    standardMutableGraphBuild.putEdge(n, it.next());
                }
            }
        } else {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (N n2 : graph.nodes()) {
                if (!hashSet.contains(n2)) {
                    java.util.Set setReachableNodes = reachableNodes(graph, n2);
                    hashSet.addAll(setReachableNodes);
                    int i = 1;
                    for (java.lang.Object obj : setReachableNodes) {
                        int i2 = i + 1;
                        java.util.Iterator it2 = com.google.common.collect.Iterables.limit(setReachableNodes, i).iterator();
                        while (it2.hasNext()) {
                            standardMutableGraphBuild.putEdge(obj, it2.next());
                        }
                        i = i2;
                    }
                }
            }
        }
        return standardMutableGraphBuild;
    }

    public static <N> java.util.Set<N> reachableNodes(com.google.common.graph.Graph<N> graph, N node) {
        com.google.common.base.Preconditions.checkArgument(graph.nodes().contains(node), "Node %s is not an element of this graph.", node);
        return com.google.common.collect.ImmutableSet.copyOf(com.google.common.graph.Traverser.forGraph(graph).breadthFirst(node));
    }

    public static <N> com.google.common.graph.Graph<N> transpose(com.google.common.graph.Graph<N> graph) {
        if (!graph.isDirected()) {
            return graph;
        }
        if (!(graph instanceof com.google.common.graph.Graphs.TransposedGraph)) {
            return new com.google.common.graph.Graphs.TransposedGraph(graph);
        }
        return ((com.google.common.graph.Graphs.TransposedGraph) graph).graph;
    }

    public static <N, V> com.google.common.graph.ValueGraph<N, V> transpose(com.google.common.graph.ValueGraph<N, V> graph) {
        if (!graph.isDirected()) {
            return graph;
        }
        if (!(graph instanceof com.google.common.graph.Graphs.TransposedValueGraph)) {
            return new com.google.common.graph.Graphs.TransposedValueGraph(graph);
        }
        return ((com.google.common.graph.Graphs.TransposedValueGraph) graph).graph;
    }

    public static <N, E> com.google.common.graph.Network<N, E> transpose(com.google.common.graph.Network<N, E> network) {
        if (!network.isDirected()) {
            return network;
        }
        if (!(network instanceof com.google.common.graph.Graphs.TransposedNetwork)) {
            return new com.google.common.graph.Graphs.TransposedNetwork(network);
        }
        return ((com.google.common.graph.Graphs.TransposedNetwork) network).network;
    }

    static <N> com.google.common.graph.EndpointPair<N> transpose(com.google.common.graph.EndpointPair<N> endpoints) {
        return endpoints.isOrdered() ? com.google.common.graph.EndpointPair.ordered(endpoints.target(), endpoints.source()) : endpoints;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class TransposedGraph<N> extends com.google.common.graph.ForwardingGraph<N> {
        private final com.google.common.graph.Graph<N> graph;

        TransposedGraph(com.google.common.graph.Graph<N> graph) {
            this.graph = graph;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.graph.ForwardingGraph
        public com.google.common.graph.Graph<N> delegate() {
            return this.graph;
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public java.util.Set<N> predecessors(N node) {
            return delegate().successors((java.lang.Object) node);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public java.util.Set<N> successors(N node) {
            return delegate().predecessors((java.lang.Object) node);
        }

        /* JADX INFO: renamed from: com.google.common.graph.Graphs$TransposedGraph$1, reason: invalid class name */
        class AnonymousClass1 extends com.google.common.graph.IncidentEdgeSet<N> {
            AnonymousClass1(com.google.common.graph.BaseGraph graph, java.lang.Object node) {
                super(graph, node);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<com.google.common.graph.EndpointPair<N>> iterator() {
                return com.google.common.collect.Iterators.transform(com.google.common.graph.Graphs.TransposedGraph.this.delegate().incidentEdges(this.node).iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.Graphs$TransposedGraph$1$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return this.f$0.m800x5749e417((com.google.common.graph.EndpointPair) obj);
                    }
                });
            }

            /* JADX INFO: renamed from: lambda$iterator$0$com-google-common-graph-Graphs$TransposedGraph$1, reason: not valid java name */
            /* synthetic */ com.google.common.graph.EndpointPair m800x5749e417(com.google.common.graph.EndpointPair endpointPair) {
                return com.google.common.graph.EndpointPair.of((com.google.common.graph.Graph<?>) com.google.common.graph.Graphs.TransposedGraph.this.delegate(), endpointPair.nodeV(), endpointPair.nodeU());
            }
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N node) {
            return new com.google.common.graph.Graphs.TransposedGraph.AnonymousClass1(this, node);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int inDegree(N node) {
            return delegate().outDegree(node);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int outDegree(N node) {
            return delegate().inDegree(node);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(N nodeU, N nodeV) {
            return delegate().hasEdgeConnecting(nodeV, nodeU);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpoints) {
            return delegate().hasEdgeConnecting(com.google.common.graph.Graphs.transpose(endpoints));
        }
    }

    private static class TransposedValueGraph<N, V> extends com.google.common.graph.ForwardingValueGraph<N, V> {
        private final com.google.common.graph.ValueGraph<N, V> graph;

        TransposedValueGraph(com.google.common.graph.ValueGraph<N, V> graph) {
            this.graph = graph;
        }

        @Override // com.google.common.graph.ForwardingValueGraph
        com.google.common.graph.ValueGraph<N, V> delegate() {
            return this.graph;
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public java.util.Set<N> predecessors(N node) {
            return delegate().successors((java.lang.Object) node);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public java.util.Set<N> successors(N node) {
            return delegate().predecessors((java.lang.Object) node);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int inDegree(N node) {
            return delegate().outDegree(node);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int outDegree(N node) {
            return delegate().inDegree(node);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(N nodeU, N nodeV) {
            return delegate().hasEdgeConnecting(nodeV, nodeU);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpoints) {
            return delegate().hasEdgeConnecting(com.google.common.graph.Graphs.transpose(endpoints));
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.ValueGraph
        @javax.annotation.CheckForNull
        public V edgeValueOrDefault(N nodeU, N nodeV, @javax.annotation.CheckForNull V defaultValue) {
            return delegate().edgeValueOrDefault(nodeV, nodeU, defaultValue);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.ValueGraph
        @javax.annotation.CheckForNull
        public V edgeValueOrDefault(com.google.common.graph.EndpointPair<N> endpoints, @javax.annotation.CheckForNull V defaultValue) {
            return delegate().edgeValueOrDefault(com.google.common.graph.Graphs.transpose(endpoints), defaultValue);
        }
    }

    private static class TransposedNetwork<N, E> extends com.google.common.graph.ForwardingNetwork<N, E> {
        private final com.google.common.graph.Network<N, E> network;

        TransposedNetwork(com.google.common.graph.Network<N, E> network) {
            this.network = network;
        }

        @Override // com.google.common.graph.ForwardingNetwork
        com.google.common.graph.Network<N, E> delegate() {
            return this.network;
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public java.util.Set<N> predecessors(N node) {
            return delegate().successors((java.lang.Object) node);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public java.util.Set<N> successors(N node) {
            return delegate().predecessors((java.lang.Object) node);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public int inDegree(N node) {
            return delegate().outDegree(node);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public int outDegree(N node) {
            return delegate().inDegree(node);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public java.util.Set<E> inEdges(N node) {
            return delegate().outEdges(node);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public java.util.Set<E> outEdges(N node) {
            return delegate().inEdges(node);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public com.google.common.graph.EndpointPair<N> incidentNodes(E edge) {
            com.google.common.graph.EndpointPair<N> endpointPairIncidentNodes = delegate().incidentNodes(edge);
            return com.google.common.graph.EndpointPair.of((com.google.common.graph.Network<?, ?>) this.network, (java.lang.Object) endpointPairIncidentNodes.nodeV(), (java.lang.Object) endpointPairIncidentNodes.nodeU());
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public java.util.Set<E> edgesConnecting(N nodeU, N nodeV) {
            return delegate().edgesConnecting(nodeV, nodeU);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public java.util.Set<E> edgesConnecting(com.google.common.graph.EndpointPair<N> endpoints) {
            return delegate().edgesConnecting(com.google.common.graph.Graphs.transpose(endpoints));
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        @javax.annotation.CheckForNull
        public E edgeConnectingOrNull(N nodeU, N nodeV) {
            return delegate().edgeConnectingOrNull(nodeV, nodeU);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        @javax.annotation.CheckForNull
        public E edgeConnectingOrNull(com.google.common.graph.EndpointPair<N> endpoints) {
            return delegate().edgeConnectingOrNull(com.google.common.graph.Graphs.transpose(endpoints));
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public boolean hasEdgeConnecting(N nodeU, N nodeV) {
            return delegate().hasEdgeConnecting(nodeV, nodeU);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpoints) {
            return delegate().hasEdgeConnecting(com.google.common.graph.Graphs.transpose(endpoints));
        }
    }

    public static <N> com.google.common.graph.MutableGraph<N> inducedSubgraph(com.google.common.graph.Graph<N> graph, java.lang.Iterable<? extends N> iterable) {
        com.google.common.graph.StandardMutableGraph standardMutableGraph;
        if (iterable instanceof java.util.Collection) {
            standardMutableGraph = (com.google.common.graph.MutableGraph<N>) com.google.common.graph.GraphBuilder.from(graph).expectedNodeCount(((java.util.Collection) iterable).size()).build();
        } else {
            standardMutableGraph = (com.google.common.graph.MutableGraph<N>) com.google.common.graph.GraphBuilder.from(graph).build();
        }
        java.util.Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            standardMutableGraph.addNode(it.next());
        }
        for (N n : standardMutableGraph.nodes()) {
            for (N n2 : graph.successors((java.lang.Object) n)) {
                if (standardMutableGraph.nodes().contains(n2)) {
                    standardMutableGraph.putEdge(n, n2);
                }
            }
        }
        return standardMutableGraph;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N, V> com.google.common.graph.MutableValueGraph<N, V> inducedSubgraph(com.google.common.graph.ValueGraph<N, V> valueGraph, java.lang.Iterable<? extends N> iterable) {
        com.google.common.graph.MutableValueGraph mutableValueGraph;
        if (iterable instanceof java.util.Collection) {
            mutableValueGraph = (com.google.common.graph.MutableValueGraph<N, V>) com.google.common.graph.ValueGraphBuilder.from(valueGraph).expectedNodeCount(((java.util.Collection) iterable).size()).build();
        } else {
            mutableValueGraph = (com.google.common.graph.MutableValueGraph<N, V>) com.google.common.graph.ValueGraphBuilder.from(valueGraph).build();
        }
        java.util.Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            mutableValueGraph.addNode(it.next());
        }
        for (N n : mutableValueGraph.nodes()) {
            for (N n2 : valueGraph.successors((java.lang.Object) n)) {
                if (mutableValueGraph.nodes().contains(n2)) {
                    mutableValueGraph.putEdgeValue(n, n2, java.util.Objects.requireNonNull(valueGraph.edgeValueOrDefault(n, n2, null)));
                }
            }
        }
        return (com.google.common.graph.MutableValueGraph<N, V>) mutableValueGraph;
    }

    public static <N, E> com.google.common.graph.MutableNetwork<N, E> inducedSubgraph(com.google.common.graph.Network<N, E> network, java.lang.Iterable<? extends N> iterable) {
        com.google.common.graph.StandardMutableNetwork standardMutableNetwork;
        if (iterable instanceof java.util.Collection) {
            standardMutableNetwork = (com.google.common.graph.MutableNetwork<N, E>) com.google.common.graph.NetworkBuilder.from(network).expectedNodeCount(((java.util.Collection) iterable).size()).build();
        } else {
            standardMutableNetwork = (com.google.common.graph.MutableNetwork<N, E>) com.google.common.graph.NetworkBuilder.from(network).build();
        }
        java.util.Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            standardMutableNetwork.addNode(it.next());
        }
        for (E e : standardMutableNetwork.nodes()) {
            for (E e2 : network.outEdges(e)) {
                N nAdjacentNode = network.incidentNodes(e2).adjacentNode(e);
                if (standardMutableNetwork.nodes().contains(nAdjacentNode)) {
                    standardMutableNetwork.addEdge(e, nAdjacentNode, e2);
                }
            }
        }
        return standardMutableNetwork;
    }

    public static <N> com.google.common.graph.MutableGraph<N> copyOf(com.google.common.graph.Graph<N> graph) {
        com.google.common.graph.MutableGraph<N> mutableGraph = (com.google.common.graph.MutableGraph<N>) com.google.common.graph.GraphBuilder.from(graph).expectedNodeCount(graph.nodes().size()).build();
        java.util.Iterator<N> it = graph.nodes().iterator();
        while (it.hasNext()) {
            mutableGraph.addNode(it.next());
        }
        for (com.google.common.graph.EndpointPair<N> endpointPair : graph.edges()) {
            mutableGraph.putEdge(endpointPair.nodeU(), endpointPair.nodeV());
        }
        return mutableGraph;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N, V> com.google.common.graph.MutableValueGraph<N, V> copyOf(com.google.common.graph.ValueGraph<N, V> valueGraph) {
        com.google.common.graph.StandardMutableValueGraph standardMutableValueGraph = (com.google.common.graph.MutableValueGraph<N, V>) com.google.common.graph.ValueGraphBuilder.from(valueGraph).expectedNodeCount(valueGraph.nodes().size()).build();
        java.util.Iterator<N> it = valueGraph.nodes().iterator();
        while (it.hasNext()) {
            standardMutableValueGraph.addNode(it.next());
        }
        for (com.google.common.graph.EndpointPair<N> endpointPair : valueGraph.edges()) {
            standardMutableValueGraph.putEdgeValue(endpointPair.nodeU(), endpointPair.nodeV(), java.util.Objects.requireNonNull(valueGraph.edgeValueOrDefault(endpointPair.nodeU(), endpointPair.nodeV(), null)));
        }
        return standardMutableValueGraph;
    }

    public static <N, E> com.google.common.graph.MutableNetwork<N, E> copyOf(com.google.common.graph.Network<N, E> network) {
        com.google.common.graph.MutableNetwork<N, E> mutableNetwork = (com.google.common.graph.MutableNetwork<N, E>) com.google.common.graph.NetworkBuilder.from(network).expectedNodeCount(network.nodes().size()).expectedEdgeCount(network.edges().size()).build();
        java.util.Iterator<N> it = network.nodes().iterator();
        while (it.hasNext()) {
            mutableNetwork.addNode(it.next());
        }
        for (E e : network.edges()) {
            com.google.common.graph.EndpointPair<N> endpointPairIncidentNodes = network.incidentNodes(e);
            mutableNetwork.addEdge(endpointPairIncidentNodes.nodeU(), endpointPairIncidentNodes.nodeV(), e);
        }
        return mutableNetwork;
    }

    static int checkNonNegative(int value) {
        com.google.common.base.Preconditions.checkArgument(value >= 0, "Not true that %s is non-negative.", value);
        return value;
    }

    static long checkNonNegative(long value) {
        com.google.common.base.Preconditions.checkArgument(value >= 0, "Not true that %s is non-negative.", value);
        return value;
    }

    static int checkPositive(int value) {
        com.google.common.base.Preconditions.checkArgument(value > 0, "Not true that %s is positive.", value);
        return value;
    }

    static long checkPositive(long value) {
        com.google.common.base.Preconditions.checkArgument(value > 0, "Not true that %s is positive.", value);
        return value;
    }
}
