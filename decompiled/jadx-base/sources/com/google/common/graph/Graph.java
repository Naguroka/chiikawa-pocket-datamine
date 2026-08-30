package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use GraphBuilder to create a real instance")
@com.google.common.graph.ElementTypesAreNonnullByDefault
public interface Graph<N> extends com.google.common.graph.BaseGraph<N> {
    java.util.Set<N> adjacentNodes(N node);

    boolean allowsSelfLoops();

    @Override // com.google.common.graph.BaseGraph
    int degree(N node);

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

    boolean isDirected();

    com.google.common.graph.ElementOrder<N> nodeOrder();

    java.util.Set<N> nodes();

    @Override // com.google.common.graph.BaseGraph
    int outDegree(N node);

    @Override // 
    java.util.Set<N> predecessors(N node);

    @Override // 
    java.util.Set<N> successors(N node);
}
