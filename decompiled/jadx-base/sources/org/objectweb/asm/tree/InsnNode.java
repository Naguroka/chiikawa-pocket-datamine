package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class InsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 0;
    }

    public InsnNode(int i) {
        super(i);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitInsn(this.opcode);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        return new org.objectweb.asm.tree.InsnNode(this.opcode).cloneAnnotations(this);
    }
}
