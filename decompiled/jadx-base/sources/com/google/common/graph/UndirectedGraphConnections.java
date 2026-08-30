package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class UndirectedGraphConnections<N, V> implements com.google.common.graph.GraphConnections<N, V> {
    private final java.util.Map<N, V> adjacentNodeValues;

    private UndirectedGraphConnections(java.util.Map<N, V> adjacentNodeValues) {
        this.adjacentNodeValues = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(adjacentNodeValues);
    }

    /* JADX INFO: renamed from: com.google.common.graph.UndirectedGraphConnections$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type;

        static {
            int[] iArr = new int[com.google.common.graph.ElementOrder.Type.values().length];
            $SwitchMap$com$google$common$graph$ElementOrder$Type = iArr;
            try {
                iArr[com.google.common.graph.ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$graph$ElementOrder$Type[com.google.common.graph.ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    static <N, V> com.google.common.graph.UndirectedGraphConnections<N, V> of(com.google.common.graph.ElementOrder<N> incidentEdgeOrder) {
        int i = com.google.common.graph.UndirectedGraphConnections.AnonymousClass1.$SwitchMap$com$google$common$graph$ElementOrder$Type[incidentEdgeOrder.type().ordinal()];
        if (i == 1) {
            return new com.google.common.graph.UndirectedGraphConnections<>(new java.util.HashMap(2, 1.0f));
        }
        if (i == 2) {
            return new com.google.common.graph.UndirectedGraphConnections<>(new java.util.LinkedHashMap(2, 1.0f));
        }
        throw new java.lang.AssertionError(incidentEdgeOrder.type());
    }

    static <N, V> com.google.common.graph.UndirectedGraphConnections<N, V> ofImmutable(java.util.Map<N, V> adjacentNodeValues) {
        return new com.google.common.graph.UndirectedGraphConnections<>(com.google.common.collect.ImmutableMap.copyOf((java.util.Map) adjacentNodeValues));
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> adjacentNodes() {
        return java.util.Collections.unmodifiableSet(this.adjacentNodeValues.keySet());
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> predecessors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> successors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Iterator<com.google.common.graph.EndpointPair<N>> incidentEdgeIterator(final N thisNode) {
        return com.google.common.collect.Iterators.transform(this.adjacentNodeValues.keySet().iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.UndirectedGraphConnections$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.common.graph.EndpointPair.unordered(thisNode, obj);
            }
        });
    }

    @Override // com.google.common.graph.GraphConnections
    @javax.annotation.CheckForNull
    public V value(N node) {
        return this.adjacentNodeValues.get(node);
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N node) {
        removeSuccessor(node);
    }

    @Override // com.google.common.graph.GraphConnections
    @javax.annotation.CheckForNull
    public V removeSuccessor(N node) {
        return this.adjacentNodeValues.remove(node);
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N node, V value) {
        addSuccessor(node, value);
    }

    @Override // com.google.common.graph.GraphConnections
    @javax.annotation.CheckForNull
    public V addSuccessor(N node, V value) {
        return this.adjacentNodeValues.put(node, value);
    }
}
