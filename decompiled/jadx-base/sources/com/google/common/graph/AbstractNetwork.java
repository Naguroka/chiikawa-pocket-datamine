package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
public abstract class AbstractNetwork<N, E> implements com.google.common.graph.Network<N, E> {

    /* JADX INFO: renamed from: com.google.common.graph.AbstractNetwork$1, reason: invalid class name */
    class AnonymousClass1 extends com.google.common.graph.AbstractGraph<N> {
        AnonymousClass1() {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public java.util.Set<N> nodes() {
            return com.google.common.graph.AbstractNetwork.this.nodes();
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public java.util.Set<com.google.common.graph.EndpointPair<N>> edges() {
            if (com.google.common.graph.AbstractNetwork.this.allowsParallelEdges()) {
                return super.edges();
            }
            return new com.google.common.graph.AbstractNetwork.AnonymousClass1.C01961();
        }

        /* JADX INFO: renamed from: com.google.common.graph.AbstractNetwork$1$1, reason: invalid class name and collision with other inner class name */
        class C01961 extends java.util.AbstractSet<com.google.common.graph.EndpointPair<N>> {
            C01961() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<com.google.common.graph.EndpointPair<N>> iterator() {
                return com.google.common.collect.Iterators.transform(com.google.common.graph.AbstractNetwork.this.edges().iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.AbstractNetwork$1$1$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return this.f$0.m799lambda$iterator$0$comgooglecommongraphAbstractNetwork$1$1(obj);
                    }
                });
            }

            /* JADX INFO: renamed from: lambda$iterator$0$com-google-common-graph-AbstractNetwork$1$1, reason: not valid java name */
            /* synthetic */ com.google.common.graph.EndpointPair m799lambda$iterator$0$comgooglecommongraphAbstractNetwork$1$1(java.lang.Object obj) {
                return com.google.common.graph.AbstractNetwork.this.incidentNodes(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.graph.AbstractNetwork.this.edges().size();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
                if (!(obj instanceof com.google.common.graph.EndpointPair)) {
                    return false;
                }
                com.google.common.graph.EndpointPair<?> endpointPair = (com.google.common.graph.EndpointPair) obj;
                return com.google.common.graph.AbstractNetwork.AnonymousClass1.this.isOrderingCompatible(endpointPair) && com.google.common.graph.AbstractNetwork.AnonymousClass1.this.nodes().contains(endpointPair.nodeU()) && com.google.common.graph.AbstractNetwork.AnonymousClass1.this.successors(endpointPair.nodeU()).contains(endpointPair.nodeV());
            }
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public com.google.common.graph.ElementOrder<N> nodeOrder() {
            return com.google.common.graph.AbstractNetwork.this.nodeOrder();
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
            return com.google.common.graph.ElementOrder.unordered();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean isDirected() {
            return com.google.common.graph.AbstractNetwork.this.isDirected();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean allowsSelfLoops() {
            return com.google.common.graph.AbstractNetwork.this.allowsSelfLoops();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public java.util.Set<N> adjacentNodes(N node) {
            return com.google.common.graph.AbstractNetwork.this.adjacentNodes(node);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public java.util.Set<N> predecessors(N node) {
            return com.google.common.graph.AbstractNetwork.this.predecessors((java.lang.Object) node);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public java.util.Set<N> successors(N node) {
            return com.google.common.graph.AbstractNetwork.this.successors((java.lang.Object) node);
        }
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.Graph<N> asGraph() {
        return new com.google.common.graph.AbstractNetwork.AnonymousClass1();
    }

    @Override // com.google.common.graph.Network
    public int degree(N node) {
        if (isDirected()) {
            return com.google.common.math.IntMath.saturatedAdd(inEdges(node).size(), outEdges(node).size());
        }
        return com.google.common.math.IntMath.saturatedAdd(incidentEdges(node).size(), edgesConnecting(node, node).size());
    }

    @Override // com.google.common.graph.Network
    public int inDegree(N node) {
        return isDirected() ? inEdges(node).size() : degree(node);
    }

    @Override // com.google.common.graph.Network
    public int outDegree(N node) {
        return isDirected() ? outEdges(node).size() : degree(node);
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> adjacentEdges(E edge) {
        com.google.common.graph.EndpointPair<N> endpointPairIncidentNodes = incidentNodes(edge);
        return com.google.common.collect.Sets.difference(com.google.common.collect.Sets.union(incidentEdges(endpointPairIncidentNodes.nodeU()), incidentEdges(endpointPairIncidentNodes.nodeV())), com.google.common.collect.ImmutableSet.of((java.lang.Object) edge));
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> edgesConnecting(N nodeU, N nodeV) {
        java.util.Set<E> setOutEdges = outEdges(nodeU);
        java.util.Set<E> setInEdges = inEdges(nodeV);
        if (setOutEdges.size() <= setInEdges.size()) {
            return java.util.Collections.unmodifiableSet(com.google.common.collect.Sets.filter(setOutEdges, connectedPredicate(nodeU, nodeV)));
        }
        return java.util.Collections.unmodifiableSet(com.google.common.collect.Sets.filter(setInEdges, connectedPredicate(nodeV, nodeU)));
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> edgesConnecting(com.google.common.graph.EndpointPair<N> endpoints) {
        validateEndpoints(endpoints);
        return edgesConnecting(endpoints.nodeU(), endpoints.nodeV());
    }

    private com.google.common.base.Predicate<E> connectedPredicate(final N nodePresent, final N nodeToCheck) {
        return new com.google.common.base.Predicate<E>() { // from class: com.google.common.graph.AbstractNetwork.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.base.Predicate
            public boolean apply(E e) {
                return com.google.common.graph.AbstractNetwork.this.incidentNodes(e).adjacentNode(nodePresent).equals(nodeToCheck);
            }
        };
    }

    @Override // com.google.common.graph.Network
    @javax.annotation.CheckForNull
    public E edgeConnectingOrNull(N nodeU, N nodeV) {
        java.util.Set<E> setEdgesConnecting = edgesConnecting(nodeU, nodeV);
        int size = setEdgesConnecting.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return setEdgesConnecting.iterator().next();
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.", nodeU, nodeV));
    }

    @Override // com.google.common.graph.Network
    @javax.annotation.CheckForNull
    public E edgeConnectingOrNull(com.google.common.graph.EndpointPair<N> endpoints) {
        validateEndpoints(endpoints);
        return edgeConnectingOrNull(endpoints.nodeU(), endpoints.nodeV());
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(N nodeU, N nodeV) {
        com.google.common.base.Preconditions.checkNotNull(nodeU);
        com.google.common.base.Preconditions.checkNotNull(nodeV);
        return nodes().contains(nodeU) && successors((java.lang.Object) nodeU).contains(nodeV);
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpoints) {
        com.google.common.base.Preconditions.checkNotNull(endpoints);
        if (isOrderingCompatible(endpoints)) {
            return hasEdgeConnecting(endpoints.nodeU(), endpoints.nodeV());
        }
        return false;
    }

    protected final void validateEndpoints(com.google.common.graph.EndpointPair<?> endpoints) {
        com.google.common.base.Preconditions.checkNotNull(endpoints);
        com.google.common.base.Preconditions.checkArgument(isOrderingCompatible(endpoints), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    protected final boolean isOrderingCompatible(com.google.common.graph.EndpointPair<?> endpoints) {
        return endpoints.isOrdered() == isDirected();
    }

    @Override // com.google.common.graph.Network
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.common.graph.Network)) {
            return false;
        }
        com.google.common.graph.Network network = (com.google.common.graph.Network) obj;
        return isDirected() == network.isDirected() && nodes().equals(network.nodes()) && edgeIncidentNodesMap(this).equals(edgeIncidentNodesMap(network));
    }

    @Override // com.google.common.graph.Network
    public final int hashCode() {
        return edgeIncidentNodesMap(this).hashCode();
    }

    public java.lang.String toString() {
        return "isDirected: " + isDirected() + ", allowsParallelEdges: " + allowsParallelEdges() + ", allowsSelfLoops: " + allowsSelfLoops() + ", nodes: " + nodes() + ", edges: " + edgeIncidentNodesMap(this);
    }

    private static <N, E> java.util.Map<E, com.google.common.graph.EndpointPair<N>> edgeIncidentNodesMap(final com.google.common.graph.Network<N, E> network) {
        java.util.Set<E> setEdges = network.edges();
        java.util.Objects.requireNonNull(network);
        return com.google.common.collect.Maps.asMap(setEdges, new com.google.common.base.Function() { // from class: com.google.common.graph.AbstractNetwork$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return network.incidentNodes(obj);
            }
        });
    }
}
