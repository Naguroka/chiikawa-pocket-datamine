package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
public interface MutableGraph<N> extends com.google.common.graph.Graph<N> {
    boolean addNode(N node);

    boolean putEdge(com.google.common.graph.EndpointPair<N> endpoints);

    boolean putEdge(N nodeU, N nodeV);

    boolean removeEdge(com.google.common.graph.EndpointPair<N> endpoints);

    boolean removeEdge(N nodeU, N nodeV);

    boolean removeNode(N node);
}
