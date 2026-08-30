package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
final class Edge {
    static final int EXCEPTION = Integer.MAX_VALUE;
    static final int JUMP = 0;
    final int info;
    org.objectweb.asm.Edge nextEdge;
    final org.objectweb.asm.Label successor;

    Edge(int i, org.objectweb.asm.Label label, org.objectweb.asm.Edge edge) {
        this.info = i;
        this.successor = label;
        this.nextEdge = edge;
    }
}
