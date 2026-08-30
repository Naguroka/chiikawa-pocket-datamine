package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
abstract class AbstractDirectedNetworkConnections<N, E> implements com.google.common.graph.NetworkConnections<N, E> {
    final java.util.Map<E, N> inEdgeMap;
    final java.util.Map<E, N> outEdgeMap;
    private int selfLoopCount;

    AbstractDirectedNetworkConnections(java.util.Map<E, N> inEdgeMap, java.util.Map<E, N> outEdgeMap, int selfLoopCount) {
        this.inEdgeMap = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(inEdgeMap);
        this.outEdgeMap = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(outEdgeMap);
        this.selfLoopCount = com.google.common.graph.Graphs.checkNonNegative(selfLoopCount);
        com.google.common.base.Preconditions.checkState(selfLoopCount <= inEdgeMap.size() && selfLoopCount <= outEdgeMap.size());
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> adjacentNodes() {
        return com.google.common.collect.Sets.union(predecessors(), successors());
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> incidentEdges() {
        return new java.util.AbstractSet<E>() { // from class: com.google.common.graph.AbstractDirectedNetworkConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<E> iterator() {
                java.lang.Iterable iterableUnion;
                if (com.google.common.graph.AbstractDirectedNetworkConnections.this.selfLoopCount == 0) {
                    iterableUnion = com.google.common.collect.Iterables.concat(com.google.common.graph.AbstractDirectedNetworkConnections.this.inEdgeMap.keySet(), com.google.common.graph.AbstractDirectedNetworkConnections.this.outEdgeMap.keySet());
                } else {
                    iterableUnion = com.google.common.collect.Sets.union(com.google.common.graph.AbstractDirectedNetworkConnections.this.inEdgeMap.keySet(), com.google.common.graph.AbstractDirectedNetworkConnections.this.outEdgeMap.keySet());
                }
                return com.google.common.collect.Iterators.unmodifiableIterator(iterableUnion.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.math.IntMath.saturatedAdd(com.google.common.graph.AbstractDirectedNetworkConnections.this.inEdgeMap.size(), com.google.common.graph.AbstractDirectedNetworkConnections.this.outEdgeMap.size() - com.google.common.graph.AbstractDirectedNetworkConnections.this.selfLoopCount);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
                return com.google.common.graph.AbstractDirectedNetworkConnections.this.inEdgeMap.containsKey(obj) || com.google.common.graph.AbstractDirectedNetworkConnections.this.outEdgeMap.containsKey(obj);
            }
        };
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> inEdges() {
        return java.util.Collections.unmodifiableSet(this.inEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> outEdges() {
        return java.util.Collections.unmodifiableSet(this.outEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e) {
        return (N) java.util.Objects.requireNonNull(this.outEdgeMap.get(e));
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e, boolean z) {
        if (z) {
            int i = this.selfLoopCount - 1;
            this.selfLoopCount = i;
            com.google.common.graph.Graphs.checkNonNegative(i);
        }
        return (N) java.util.Objects.requireNonNull(this.inEdgeMap.remove(e));
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e) {
        return (N) java.util.Objects.requireNonNull(this.outEdgeMap.remove(e));
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E edge, N node, boolean isSelfLoop) {
        com.google.common.base.Preconditions.checkNotNull(edge);
        com.google.common.base.Preconditions.checkNotNull(node);
        if (isSelfLoop) {
            int i = this.selfLoopCount + 1;
            this.selfLoopCount = i;
            com.google.common.graph.Graphs.checkPositive(i);
        }
        com.google.common.base.Preconditions.checkState(this.inEdgeMap.put(edge, node) == null);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E edge, N node) {
        com.google.common.base.Preconditions.checkNotNull(edge);
        com.google.common.base.Preconditions.checkNotNull(node);
        com.google.common.base.Preconditions.checkState(this.outEdgeMap.put(edge, node) == null);
    }
}
