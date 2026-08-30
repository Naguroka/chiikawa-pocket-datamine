package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
public interface ValueGraph<N, V> extends com.google.common.graph.BaseGraph<N> {
    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    java.util.Set<N> adjacentNodes(N node);

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    boolean allowsSelfLoops();

    com.google.common.graph.Graph<N> asGraph();

    @Override // com.google.common.graph.BaseGraph
    int degree(N node);

    @javax.annotation.CheckForNull
    V edgeValueOrDefault(com.google.common.graph.EndpointPair<N> endpoints, @javax.annotation.CheckForNull V defaultValue);

    @javax.annotation.CheckForNull
    V edgeValueOrDefault(N nodeU, N nodeV, @javax.annotation.CheckForNull V defaultValue);

    @Override // com.google.common.graph.BaseGraph
    java.util.Set<com.google.common.graph.EndpointPair<N>> edges();

    boolean equals(@javax.annotation.CheckForNull java.lang.Object object);

    @Override // com.google.common.graph.BaseGraph
    boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpoints);

    @Override // com.google.common.graph.BaseGraph
    boolean hasEdgeConnecting(N nodeU, N nodeV);

    int hashCode();

    @Override // com.google.common.graph.BaseGraph
    int inDegree(N node);

    @Override // com.google.common.graph.BaseGraph
    com.google.common.graph.ElementOrder<N> incidentEdgeOrder();

    @Override // com.google.common.graph.BaseGraph
    java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N node);

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    boolean isDirected();

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    com.google.common.graph.ElementOrder<N> nodeOrder();

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    java.util.Set<N> nodes();

    @Override // com.google.common.graph.BaseGraph
    int outDegree(N node);

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    java.util.Set<N> predecessors(N node);

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    java.util.Set<N> successors(N node);
}
