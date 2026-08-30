package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock
@com.google.common.graph.ElementTypesAreNonnullByDefault
public final class GraphBuilder<N> extends com.google.common.graph.AbstractGraphBuilder<N> {
    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N> com.google.common.graph.GraphBuilder<N1> cast() {
        return this;
    }

    private GraphBuilder(boolean directed) {
        super(directed);
    }

    public static com.google.common.graph.GraphBuilder<java.lang.Object> directed() {
        return new com.google.common.graph.GraphBuilder<>(true);
    }

    public static com.google.common.graph.GraphBuilder<java.lang.Object> undirected() {
        return new com.google.common.graph.GraphBuilder<>(false);
    }

    public static <N> com.google.common.graph.GraphBuilder<N> from(com.google.common.graph.Graph<N> graph) {
        return new com.google.common.graph.GraphBuilder(graph.isDirected()).allowsSelfLoops(graph.allowsSelfLoops()).nodeOrder(graph.nodeOrder()).incidentEdgeOrder(graph.incidentEdgeOrder());
    }

    public <N1 extends N> com.google.common.graph.ImmutableGraph.Builder<N1> immutable() {
        return new com.google.common.graph.ImmutableGraph.Builder<>(cast());
    }

    public com.google.common.graph.GraphBuilder<N> allowsSelfLoops(boolean allowsSelfLoops) {
        this.allowsSelfLoops = allowsSelfLoops;
        return this;
    }

    public com.google.common.graph.GraphBuilder<N> expectedNodeCount(int expectedNodeCount) {
        this.expectedNodeCount = com.google.common.base.Optional.of(java.lang.Integer.valueOf(com.google.common.graph.Graphs.checkNonNegative(expectedNodeCount)));
        return this;
    }

    public <N1 extends N> com.google.common.graph.GraphBuilder<N1> nodeOrder(com.google.common.graph.ElementOrder<N1> nodeOrder) {
        com.google.common.graph.GraphBuilder<N1> graphBuilderCast = cast();
        graphBuilderCast.nodeOrder = (com.google.common.graph.ElementOrder) com.google.common.base.Preconditions.checkNotNull(nodeOrder);
        return graphBuilderCast;
    }

    public <N1 extends N> com.google.common.graph.GraphBuilder<N1> incidentEdgeOrder(com.google.common.graph.ElementOrder<N1> incidentEdgeOrder) {
        com.google.common.base.Preconditions.checkArgument(incidentEdgeOrder.type() == com.google.common.graph.ElementOrder.Type.UNORDERED || incidentEdgeOrder.type() == com.google.common.graph.ElementOrder.Type.STABLE, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", incidentEdgeOrder);
        com.google.common.graph.GraphBuilder<N1> graphBuilderCast = cast();
        graphBuilderCast.incidentEdgeOrder = (com.google.common.graph.ElementOrder) com.google.common.base.Preconditions.checkNotNull(incidentEdgeOrder);
        return graphBuilderCast;
    }

    public <N1 extends N> com.google.common.graph.MutableGraph<N1> build() {
        return new com.google.common.graph.StandardMutableGraph(this);
    }

    com.google.common.graph.GraphBuilder<N> copy() {
        com.google.common.graph.GraphBuilder<N> graphBuilder = new com.google.common.graph.GraphBuilder<>(this.directed);
        graphBuilder.allowsSelfLoops = this.allowsSelfLoops;
        graphBuilder.nodeOrder = this.nodeOrder;
        graphBuilder.expectedNodeCount = this.expectedNodeCount;
        graphBuilder.incidentEdgeOrder = this.incidentEdgeOrder;
        return graphBuilder;
    }
}
