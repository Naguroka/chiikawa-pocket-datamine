package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
public final class NetworkBuilder<N, E> extends com.google.common.graph.AbstractGraphBuilder<N> {
    boolean allowsParallelEdges;
    com.google.common.graph.ElementOrder<? super E> edgeOrder;
    com.google.common.base.Optional<java.lang.Integer> expectedEdgeCount;

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N, E1 extends E> com.google.common.graph.NetworkBuilder<N1, E1> cast() {
        return this;
    }

    private NetworkBuilder(boolean directed) {
        super(directed);
        this.allowsParallelEdges = false;
        this.edgeOrder = com.google.common.graph.ElementOrder.insertion();
        this.expectedEdgeCount = com.google.common.base.Optional.absent();
    }

    public static com.google.common.graph.NetworkBuilder<java.lang.Object, java.lang.Object> directed() {
        return new com.google.common.graph.NetworkBuilder<>(true);
    }

    public static com.google.common.graph.NetworkBuilder<java.lang.Object, java.lang.Object> undirected() {
        return new com.google.common.graph.NetworkBuilder<>(false);
    }

    public static <N, E> com.google.common.graph.NetworkBuilder<N, E> from(com.google.common.graph.Network<N, E> network) {
        return new com.google.common.graph.NetworkBuilder(network.isDirected()).allowsParallelEdges(network.allowsParallelEdges()).allowsSelfLoops(network.allowsSelfLoops()).nodeOrder(network.nodeOrder()).edgeOrder(network.edgeOrder());
    }

    public <N1 extends N, E1 extends E> com.google.common.graph.ImmutableNetwork.Builder<N1, E1> immutable() {
        return new com.google.common.graph.ImmutableNetwork.Builder<>(cast());
    }

    public com.google.common.graph.NetworkBuilder<N, E> allowsParallelEdges(boolean allowsParallelEdges) {
        this.allowsParallelEdges = allowsParallelEdges;
        return this;
    }

    public com.google.common.graph.NetworkBuilder<N, E> allowsSelfLoops(boolean allowsSelfLoops) {
        this.allowsSelfLoops = allowsSelfLoops;
        return this;
    }

    public com.google.common.graph.NetworkBuilder<N, E> expectedNodeCount(int expectedNodeCount) {
        this.expectedNodeCount = com.google.common.base.Optional.of(java.lang.Integer.valueOf(com.google.common.graph.Graphs.checkNonNegative(expectedNodeCount)));
        return this;
    }

    public com.google.common.graph.NetworkBuilder<N, E> expectedEdgeCount(int expectedEdgeCount) {
        this.expectedEdgeCount = com.google.common.base.Optional.of(java.lang.Integer.valueOf(com.google.common.graph.Graphs.checkNonNegative(expectedEdgeCount)));
        return this;
    }

    public <N1 extends N> com.google.common.graph.NetworkBuilder<N1, E> nodeOrder(com.google.common.graph.ElementOrder<N1> elementOrder) {
        com.google.common.graph.NetworkBuilder<N1, E> networkBuilder = (com.google.common.graph.NetworkBuilder<N1, E>) cast();
        networkBuilder.nodeOrder = (com.google.common.graph.ElementOrder) com.google.common.base.Preconditions.checkNotNull(elementOrder);
        return networkBuilder;
    }

    public <E1 extends E> com.google.common.graph.NetworkBuilder<N, E1> edgeOrder(com.google.common.graph.ElementOrder<E1> elementOrder) {
        com.google.common.graph.NetworkBuilder<N, E1> networkBuilder = (com.google.common.graph.NetworkBuilder<N, E1>) cast();
        networkBuilder.edgeOrder = (com.google.common.graph.ElementOrder) com.google.common.base.Preconditions.checkNotNull(elementOrder);
        return networkBuilder;
    }

    public <N1 extends N, E1 extends E> com.google.common.graph.MutableNetwork<N1, E1> build() {
        return new com.google.common.graph.StandardMutableNetwork(this);
    }
}
