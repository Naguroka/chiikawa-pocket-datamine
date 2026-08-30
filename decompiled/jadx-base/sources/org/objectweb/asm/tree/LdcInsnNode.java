package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class LdcInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public java.lang.Object cst;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 9;
    }

    public LdcInsnNode(java.lang.Object obj) {
        super(18);
        this.cst = obj;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitLdcInsn(this.cst);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        return new org.objectweb.asm.tree.LdcInsnNode(this.cst).cloneAnnotations(this);
    }
}
