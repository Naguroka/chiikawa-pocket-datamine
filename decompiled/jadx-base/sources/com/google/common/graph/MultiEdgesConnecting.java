package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
abstract class MultiEdgesConnecting<E> extends java.util.AbstractSet<E> {
    private final java.util.Map<E, ?> outEdgeToNode;
    private final java.lang.Object targetNode;

    MultiEdgesConnecting(java.util.Map<E, ?> outEdgeToNode, java.lang.Object targetNode) {
        this.outEdgeToNode = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(outEdgeToNode);
        this.targetNode = com.google.common.base.Preconditions.checkNotNull(targetNode);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
        final java.util.Iterator<java.util.Map.Entry<E, ?>> it = this.outEdgeToNode.entrySet().iterator();
        return new com.google.common.collect.AbstractIterator<E>() { // from class: com.google.common.graph.MultiEdgesConnecting.1
            @Override // com.google.common.collect.AbstractIterator
            @javax.annotation.CheckForNull
            protected E computeNext() {
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (com.google.common.graph.MultiEdgesConnecting.this.targetNode.equals(entry.getValue())) {
                        return (E) entry.getKey();
                    }
                }
                return endOfData();
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object edge) {
        return this.targetNode.equals(this.outEdgeToNode.get(edge));
    }
}
