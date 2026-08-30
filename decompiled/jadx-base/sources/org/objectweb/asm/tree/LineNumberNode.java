package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class LineNumberNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public int line;
    public org.objectweb.asm.tree.LabelNode start;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 15;
    }

    public LineNumberNode(int i, org.objectweb.asm.tree.LabelNode labelNode) {
        super(-1);
        this.line = i;
        this.start = labelNode;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitLineNumber(this.line, this.start.getLabel());
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        return new org.objectweb.asm.tree.LineNumberNode(this.line, clone(this.start, map));
    }
}
