package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class DirectedGraphConnections<N, V> implements com.google.common.graph.GraphConnections<N, V> {
    private static final java.lang.Object PRED = new java.lang.Object();
    private final java.util.Map<N, java.lang.Object> adjacentNodeValues;

    @javax.annotation.CheckForNull
    private final java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> orderedNodeConnections;
    private int predecessorCount;
    private int successorCount;

    private static final class PredAndSucc {
        private final java.lang.Object successorValue;

        PredAndSucc(java.lang.Object successorValue) {
            this.successorValue = successorValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class NodeConnection<N> {
        final N node;

        NodeConnection(N n) {
            this.node = (N) com.google.common.base.Preconditions.checkNotNull(n);
        }

        static final class Pred<N> extends com.google.common.graph.DirectedGraphConnections.NodeConnection<N> {
            Pred(N node) {
                super(node);
            }

            public boolean equals(@javax.annotation.CheckForNull java.lang.Object that) {
                if (that instanceof com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred) {
                    return this.node.equals(((com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred) that).node);
                }
                return false;
            }

            public int hashCode() {
                return com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred.class.hashCode() + this.node.hashCode();
            }
        }

        static final class Succ<N> extends com.google.common.graph.DirectedGraphConnections.NodeConnection<N> {
            Succ(N node) {
                super(node);
            }

            public boolean equals(@javax.annotation.CheckForNull java.lang.Object that) {
                if (that instanceof com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ) {
                    return this.node.equals(((com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ) that).node);
                }
                return false;
            }

            public int hashCode() {
                return com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ.class.hashCode() + this.node.hashCode();
            }
        }
    }

    private DirectedGraphConnections(java.util.Map<N, java.lang.Object> adjacentNodeValues, @javax.annotation.CheckForNull java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> orderedNodeConnections, int predecessorCount, int successorCount) {
        this.adjacentNodeValues = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(adjacentNodeValues);
        this.orderedNodeConnections = orderedNodeConnections;
        this.predecessorCount = com.google.common.graph.Graphs.checkNonNegative(predecessorCount);
        this.successorCount = com.google.common.graph.Graphs.checkNonNegative(successorCount);
        com.google.common.base.Preconditions.checkState(predecessorCount <= adjacentNodeValues.size() && successorCount <= adjacentNodeValues.size());
    }

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
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

    static <N, V> com.google.common.graph.DirectedGraphConnections<N, V> of(com.google.common.graph.ElementOrder<N> incidentEdgeOrder) {
        java.util.ArrayList arrayList;
        int i = com.google.common.graph.DirectedGraphConnections.AnonymousClass5.$SwitchMap$com$google$common$graph$ElementOrder$Type[incidentEdgeOrder.type().ordinal()];
        if (i == 1) {
            arrayList = null;
        } else if (i == 2) {
            arrayList = new java.util.ArrayList();
        } else {
            throw new java.lang.AssertionError(incidentEdgeOrder.type());
        }
        return new com.google.common.graph.DirectedGraphConnections<>(new java.util.HashMap(4, 1.0f), arrayList, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <N, V> com.google.common.graph.DirectedGraphConnections<N, V> ofImmutable(N thisNode, java.lang.Iterable<com.google.common.graph.EndpointPair<N>> incidentEdges, com.google.common.base.Function<N, V> successorNodeToValueFn) {
        com.google.common.base.Preconditions.checkNotNull(thisNode);
        com.google.common.base.Preconditions.checkNotNull(successorNodeToValueFn);
        java.util.HashMap map = new java.util.HashMap();
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        int i = 0;
        int i2 = 0;
        for (com.google.common.graph.EndpointPair<N> endpointPair : incidentEdges) {
            if (endpointPair.nodeU().equals(thisNode) && endpointPair.nodeV().equals(thisNode)) {
                map.put(thisNode, new com.google.common.graph.DirectedGraphConnections.PredAndSucc(successorNodeToValueFn.apply(thisNode)));
                builder.add(new com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred(thisNode));
                builder.add(new com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ(thisNode));
                i++;
            } else if (endpointPair.nodeV().equals(thisNode)) {
                N nNodeU = endpointPair.nodeU();
                java.lang.Object objPut = map.put(nNodeU, PRED);
                if (objPut != null) {
                    map.put(nNodeU, new com.google.common.graph.DirectedGraphConnections.PredAndSucc(objPut));
                }
                builder.add(new com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred(nNodeU));
                i++;
            } else {
                com.google.common.base.Preconditions.checkArgument(endpointPair.nodeU().equals(thisNode));
                N nNodeV = endpointPair.nodeV();
                V vApply = successorNodeToValueFn.apply(nNodeV);
                java.lang.Object objPut2 = map.put(nNodeV, vApply);
                if (objPut2 != null) {
                    com.google.common.base.Preconditions.checkArgument(objPut2 == PRED);
                    map.put(nNodeV, new com.google.common.graph.DirectedGraphConnections.PredAndSucc(vApply));
                }
                builder.add(new com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ(nNodeV));
            }
            i2++;
        }
        return new com.google.common.graph.DirectedGraphConnections<>(map, builder.build(), i, i2);
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> adjacentNodes() {
        if (this.orderedNodeConnections == null) {
            return java.util.Collections.unmodifiableSet(this.adjacentNodeValues.keySet());
        }
        return new java.util.AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<N> iterator() {
                final java.util.Iterator it = com.google.common.graph.DirectedGraphConnections.this.orderedNodeConnections.iterator();
                final java.util.HashSet hashSet = new java.util.HashSet();
                return new com.google.common.collect.AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.1.1
                    @Override // com.google.common.collect.AbstractIterator
                    @javax.annotation.CheckForNull
                    protected N computeNext() {
                        while (it.hasNext()) {
                            com.google.common.graph.DirectedGraphConnections.NodeConnection nodeConnection = (com.google.common.graph.DirectedGraphConnections.NodeConnection) it.next();
                            if (hashSet.add(nodeConnection.node)) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.graph.DirectedGraphConnections.this.adjacentNodeValues.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
                return com.google.common.graph.DirectedGraphConnections.this.adjacentNodeValues.containsKey(obj);
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> predecessors() {
        return new java.util.AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<N> iterator() {
                if (com.google.common.graph.DirectedGraphConnections.this.orderedNodeConnections == null) {
                    final java.util.Iterator it = com.google.common.graph.DirectedGraphConnections.this.adjacentNodeValues.entrySet().iterator();
                    return new com.google.common.collect.AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.1
                        @Override // com.google.common.collect.AbstractIterator
                        @javax.annotation.CheckForNull
                        protected N computeNext() {
                            while (it.hasNext()) {
                                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                                if (com.google.common.graph.DirectedGraphConnections.isPredecessor(entry.getValue())) {
                                    return (N) entry.getKey();
                                }
                            }
                            return endOfData();
                        }
                    };
                }
                final java.util.Iterator it2 = com.google.common.graph.DirectedGraphConnections.this.orderedNodeConnections.iterator();
                return new com.google.common.collect.AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.2
                    @Override // com.google.common.collect.AbstractIterator
                    @javax.annotation.CheckForNull
                    protected N computeNext() {
                        while (it2.hasNext()) {
                            com.google.common.graph.DirectedGraphConnections.NodeConnection nodeConnection = (com.google.common.graph.DirectedGraphConnections.NodeConnection) it2.next();
                            if (nodeConnection instanceof com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.graph.DirectedGraphConnections.this.predecessorCount;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
                return com.google.common.graph.DirectedGraphConnections.isPredecessor(com.google.common.graph.DirectedGraphConnections.this.adjacentNodeValues.get(obj));
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> successors() {
        return new java.util.AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.3
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<N> iterator() {
                if (com.google.common.graph.DirectedGraphConnections.this.orderedNodeConnections == null) {
                    final java.util.Iterator it = com.google.common.graph.DirectedGraphConnections.this.adjacentNodeValues.entrySet().iterator();
                    return new com.google.common.collect.AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.1
                        @Override // com.google.common.collect.AbstractIterator
                        @javax.annotation.CheckForNull
                        protected N computeNext() {
                            while (it.hasNext()) {
                                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                                if (com.google.common.graph.DirectedGraphConnections.isSuccessor(entry.getValue())) {
                                    return (N) entry.getKey();
                                }
                            }
                            return endOfData();
                        }
                    };
                }
                final java.util.Iterator it2 = com.google.common.graph.DirectedGraphConnections.this.orderedNodeConnections.iterator();
                return new com.google.common.collect.AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.2
                    @Override // com.google.common.collect.AbstractIterator
                    @javax.annotation.CheckForNull
                    protected N computeNext() {
                        while (it2.hasNext()) {
                            com.google.common.graph.DirectedGraphConnections.NodeConnection nodeConnection = (com.google.common.graph.DirectedGraphConnections.NodeConnection) it2.next();
                            if (nodeConnection instanceof com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.graph.DirectedGraphConnections.this.successorCount;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
                return com.google.common.graph.DirectedGraphConnections.isSuccessor(com.google.common.graph.DirectedGraphConnections.this.adjacentNodeValues.get(obj));
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Iterator<com.google.common.graph.EndpointPair<N>> incidentEdgeIterator(final N thisNode) {
        final java.util.Iterator itTransform;
        com.google.common.base.Preconditions.checkNotNull(thisNode);
        java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> list = this.orderedNodeConnections;
        if (list == null) {
            itTransform = com.google.common.collect.Iterators.concat(com.google.common.collect.Iterators.transform(predecessors().iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.DirectedGraphConnections$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.graph.EndpointPair.ordered(obj, thisNode);
                }
            }), com.google.common.collect.Iterators.transform(successors().iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.DirectedGraphConnections$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.graph.EndpointPair.ordered(thisNode, obj);
                }
            }));
        } else {
            itTransform = com.google.common.collect.Iterators.transform(list.iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.DirectedGraphConnections$$ExternalSyntheticLambda2
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.graph.DirectedGraphConnections.lambda$incidentEdgeIterator$2(thisNode, (com.google.common.graph.DirectedGraphConnections.NodeConnection) obj);
                }
            });
        }
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        return new com.google.common.collect.AbstractIterator<com.google.common.graph.EndpointPair<N>>(this) { // from class: com.google.common.graph.DirectedGraphConnections.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @javax.annotation.CheckForNull
            public com.google.common.graph.EndpointPair<N> computeNext() {
                while (itTransform.hasNext()) {
                    com.google.common.graph.EndpointPair<N> endpointPair = (com.google.common.graph.EndpointPair) itTransform.next();
                    if (!endpointPair.nodeU().equals(endpointPair.nodeV()) || !atomicBoolean.getAndSet(true)) {
                        return endpointPair;
                    }
                }
                return endOfData();
            }
        };
    }

    static /* synthetic */ com.google.common.graph.EndpointPair lambda$incidentEdgeIterator$2(java.lang.Object obj, com.google.common.graph.DirectedGraphConnections.NodeConnection nodeConnection) {
        if (nodeConnection instanceof com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ) {
            return com.google.common.graph.EndpointPair.ordered(obj, nodeConnection.node);
        }
        return com.google.common.graph.EndpointPair.ordered(nodeConnection.node, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.GraphConnections
    @javax.annotation.CheckForNull
    public V value(N n) {
        com.google.common.base.Preconditions.checkNotNull(n);
        V v = (V) this.adjacentNodeValues.get(n);
        if (v == PRED) {
            return null;
        }
        return v instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc ? (V) ((com.google.common.graph.DirectedGraphConnections.PredAndSucc) v).successorValue : v;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N node) {
        boolean z;
        java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> list;
        com.google.common.base.Preconditions.checkNotNull(node);
        java.lang.Object obj = this.adjacentNodeValues.get(node);
        if (obj == PRED) {
            this.adjacentNodeValues.remove(node);
        } else {
            if (obj instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc) {
                this.adjacentNodeValues.put(node, ((com.google.common.graph.DirectedGraphConnections.PredAndSucc) obj).successorValue);
            } else {
                z = false;
            }
            if (z) {
                int i = this.predecessorCount - 1;
                this.predecessorCount = i;
                com.google.common.graph.Graphs.checkNonNegative(i);
                list = this.orderedNodeConnections;
                if (list != null) {
                    list.remove(new com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred(node));
                }
            }
        }
        z = true;
        if (z) {
            int i2 = this.predecessorCount - 1;
            this.predecessorCount = i2;
            com.google.common.graph.Graphs.checkNonNegative(i2);
            list = this.orderedNodeConnections;
            if (list != null) {
                list.remove(new com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred(node));
            }
        }
    }

    @Override // com.google.common.graph.GraphConnections
    @javax.annotation.CheckForNull
    public V removeSuccessor(java.lang.Object obj) {
        java.lang.Object obj2;
        com.google.common.base.Preconditions.checkNotNull(obj);
        java.lang.Object obj3 = this.adjacentNodeValues.get(obj);
        if (obj3 == null || obj3 == (obj2 = PRED)) {
            obj3 = null;
        } else if (obj3 instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc) {
            this.adjacentNodeValues.put(obj, obj2);
            obj3 = ((com.google.common.graph.DirectedGraphConnections.PredAndSucc) obj3).successorValue;
        } else {
            this.adjacentNodeValues.remove(obj);
        }
        if (obj3 != null) {
            int i = this.successorCount - 1;
            this.successorCount = i;
            com.google.common.graph.Graphs.checkNonNegative(i);
            java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> list = this.orderedNodeConnections;
            if (list != null) {
                list.remove(new com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ(obj));
            }
        }
        if (obj3 == null) {
            return null;
        }
        return (V) obj3;
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N node, V unused) {
        boolean z;
        java.util.Map<N, java.lang.Object> map = this.adjacentNodeValues;
        java.lang.Object obj = PRED;
        java.lang.Object objPut = map.put(node, obj);
        if (objPut == null) {
            z = true;
        } else {
            z = false;
            if (objPut instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc) {
                this.adjacentNodeValues.put(node, objPut);
            } else if (objPut != obj) {
                this.adjacentNodeValues.put(node, new com.google.common.graph.DirectedGraphConnections.PredAndSucc(objPut));
                z = true;
            }
        }
        if (z) {
            int i = this.predecessorCount + 1;
            this.predecessorCount = i;
            com.google.common.graph.Graphs.checkPositive(i);
            java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> list = this.orderedNodeConnections;
            if (list != null) {
                list.add(new com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred(node));
            }
        }
    }

    @Override // com.google.common.graph.GraphConnections
    @javax.annotation.CheckForNull
    public V addSuccessor(N n, V v) {
        java.lang.Object objPut = this.adjacentNodeValues.put(n, v);
        if (objPut == null) {
            objPut = null;
        } else if (objPut instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc) {
            this.adjacentNodeValues.put(n, new com.google.common.graph.DirectedGraphConnections.PredAndSucc(v));
            objPut = ((com.google.common.graph.DirectedGraphConnections.PredAndSucc) objPut).successorValue;
        } else if (objPut == PRED) {
            this.adjacentNodeValues.put(n, new com.google.common.graph.DirectedGraphConnections.PredAndSucc(v));
            objPut = null;
        }
        if (objPut == null) {
            int i = this.successorCount + 1;
            this.successorCount = i;
            com.google.common.graph.Graphs.checkPositive(i);
            java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> list = this.orderedNodeConnections;
            if (list != null) {
                list.add(new com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ(n));
            }
        }
        if (objPut == null) {
            return null;
        }
        return (V) objPut;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isPredecessor(@javax.annotation.CheckForNull java.lang.Object value) {
        return value == PRED || (value instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isSuccessor(@javax.annotation.CheckForNull java.lang.Object value) {
        return (value == PRED || value == null) ? false : true;
    }
}
