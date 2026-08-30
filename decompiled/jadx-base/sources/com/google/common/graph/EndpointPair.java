package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable(containerOf = {"N"})
@com.google.common.graph.ElementTypesAreNonnullByDefault
public abstract class EndpointPair<N> implements java.lang.Iterable<N> {
    private final N nodeU;
    private final N nodeV;

    public abstract boolean equals(@javax.annotation.CheckForNull java.lang.Object obj);

    public abstract int hashCode();

    public abstract boolean isOrdered();

    public abstract N source();

    public abstract N target();

    private EndpointPair(N n, N n2) {
        this.nodeU = (N) com.google.common.base.Preconditions.checkNotNull(n);
        this.nodeV = (N) com.google.common.base.Preconditions.checkNotNull(n2);
    }

    public static <N> com.google.common.graph.EndpointPair<N> ordered(N source, N target) {
        return new com.google.common.graph.EndpointPair.Ordered(source, target);
    }

    public static <N> com.google.common.graph.EndpointPair<N> unordered(N nodeU, N nodeV) {
        return new com.google.common.graph.EndpointPair.Unordered(nodeV, nodeU);
    }

    static <N> com.google.common.graph.EndpointPair<N> of(com.google.common.graph.Graph<?> graph, N nodeU, N nodeV) {
        return graph.isDirected() ? ordered(nodeU, nodeV) : unordered(nodeU, nodeV);
    }

    static <N> com.google.common.graph.EndpointPair<N> of(com.google.common.graph.Network<?, ?> network, N nodeU, N nodeV) {
        return network.isDirected() ? ordered(nodeU, nodeV) : unordered(nodeU, nodeV);
    }

    public final N nodeU() {
        return this.nodeU;
    }

    public final N nodeV() {
        return this.nodeV;
    }

    public final N adjacentNode(N node) {
        if (node.equals(this.nodeU)) {
            return this.nodeV;
        }
        if (node.equals(this.nodeV)) {
            return this.nodeU;
        }
        throw new java.lang.IllegalArgumentException("EndpointPair " + this + " does not contain node " + node);
    }

    @Override // java.lang.Iterable
    public final com.google.common.collect.UnmodifiableIterator<N> iterator() {
        return com.google.common.collect.Iterators.forArray(this.nodeU, this.nodeV);
    }

    private static final class Ordered<N> extends com.google.common.graph.EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
            return true;
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return super.iterator();
        }

        private Ordered(N source, N target) {
            super(source, target);
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
            return nodeU();
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
            return nodeV();
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.google.common.graph.EndpointPair)) {
                return false;
            }
            com.google.common.graph.EndpointPair endpointPair = (com.google.common.graph.EndpointPair) obj;
            if (isOrdered() != endpointPair.isOrdered()) {
                return false;
            }
            return source().equals(endpointPair.source()) && target().equals(endpointPair.target());
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
            return com.google.common.base.Objects.hashCode(source(), target());
        }

        public java.lang.String toString() {
            return "<" + source() + " -> " + target() + ">";
        }
    }

    private static final class Unordered<N> extends com.google.common.graph.EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
            return false;
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return super.iterator();
        }

        private Unordered(N nodeU, N nodeV) {
            super(nodeU, nodeV);
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
            throw new java.lang.UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
            throw new java.lang.UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.google.common.graph.EndpointPair)) {
                return false;
            }
            com.google.common.graph.EndpointPair endpointPair = (com.google.common.graph.EndpointPair) obj;
            if (isOrdered() != endpointPair.isOrdered()) {
                return false;
            }
            if (nodeU().equals(endpointPair.nodeU())) {
                return nodeV().equals(endpointPair.nodeV());
            }
            return nodeU().equals(endpointPair.nodeV()) && nodeV().equals(endpointPair.nodeU());
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
            return nodeU().hashCode() + nodeV().hashCode();
        }

        public java.lang.String toString() {
            return com.ironsource.y8.i.d + nodeU() + ", " + nodeV() + com.ironsource.y8.i.e;
        }
    }
}
