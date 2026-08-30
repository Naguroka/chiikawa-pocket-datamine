package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
interface NetworkConnections<N, E> {
    void addInEdge(E edge, N node, boolean isSelfLoop);

    void addOutEdge(E edge, N node);

    N adjacentNode(E edge);

    java.util.Set<N> adjacentNodes();

    java.util.Set<E> edgesConnecting(N node);

    java.util.Set<E> inEdges();

    java.util.Set<E> incidentEdges();

    java.util.Set<E> outEdges();

    java.util.Set<N> predecessors();

    @javax.annotation.CheckForNull
    N removeInEdge(E edge, boolean isSelfLoop);

    N removeOutEdge(E edge);

    java.util.Set<N> successors();
}
