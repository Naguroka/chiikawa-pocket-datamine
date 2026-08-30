package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class ParameterNode {
    public int access;
    public java.lang.String name;

    public ParameterNode(java.lang.String str, int i) {
        this.name = str;
        this.access = i;
    }

    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitParameter(this.name, this.access);
    }
}
