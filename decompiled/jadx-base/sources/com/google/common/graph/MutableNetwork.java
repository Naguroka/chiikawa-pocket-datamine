package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
public interface MutableNetwork<N, E> extends com.google.common.graph.Network<N, E> {
    boolean addEdge(com.google.common.graph.EndpointPair<N> endpoints, E edge);

    boolean addEdge(N nodeU, N nodeV, E edge);

    boolean addNode(N node);

    boolean removeEdge(E edge);

    boolean removeNode(N node);
}
