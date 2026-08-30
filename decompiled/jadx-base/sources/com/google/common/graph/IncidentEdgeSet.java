package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
abstract class IncidentEdgeSet<N> extends java.util.AbstractSet<com.google.common.graph.EndpointPair<N>> {
    final com.google.common.graph.BaseGraph<N> graph;
    final N node;

    IncidentEdgeSet(com.google.common.graph.BaseGraph<N> graph, N node) {
        this.graph = graph;
        this.node = node;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        if (this.graph.isDirected()) {
            return (this.graph.inDegree(this.node) + this.graph.outDegree(this.node)) - (this.graph.successors((java.lang.Object) this.node).contains(this.node) ? 1 : 0);
        }
        return this.graph.adjacentNodes(this.node).size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof com.google.common.graph.EndpointPair)) {
            return false;
        }
        com.google.common.graph.EndpointPair endpointPair = (com.google.common.graph.EndpointPair) obj;
        if (this.graph.isDirected()) {
            if (!endpointPair.isOrdered()) {
                return false;
            }
            java.lang.Object objSource = endpointPair.source();
            java.lang.Object objTarget = endpointPair.target();
            return (this.node.equals(objSource) && this.graph.successors((java.lang.Object) this.node).contains(objTarget)) || (this.node.equals(objTarget) && this.graph.predecessors((java.lang.Object) this.node).contains(objSource));
        }
        if (endpointPair.isOrdered()) {
            return false;
        }
        java.util.Set<N> setAdjacentNodes = this.graph.adjacentNodes(this.node);
        java.lang.Object objNodeU = endpointPair.nodeU();
        java.lang.Object objNodeV = endpointPair.nodeV();
        return (this.node.equals(objNodeV) && setAdjacentNodes.contains(objNodeU)) || (this.node.equals(objNodeU) && setAdjacentNodes.contains(objNodeV));
    }
}
