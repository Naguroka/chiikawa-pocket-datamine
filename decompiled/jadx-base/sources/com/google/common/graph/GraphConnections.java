package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
interface GraphConnections<N, V> {
    void addPredecessor(N node, V value);

    @javax.annotation.CheckForNull
    V addSuccessor(N node, V value);

    java.util.Set<N> adjacentNodes();

    java.util.Iterator<com.google.common.graph.EndpointPair<N>> incidentEdgeIterator(N thisNode);

    java.util.Set<N> predecessors();

    void removePredecessor(N node);

    @javax.annotation.CheckForNull
    V removeSuccessor(N node);

    java.util.Set<N> successors();

    @javax.annotation.CheckForNull
    V value(N node);
}
