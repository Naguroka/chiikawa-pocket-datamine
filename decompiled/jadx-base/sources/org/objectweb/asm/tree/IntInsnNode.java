package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class IntInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public int operand;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 1;
    }

    public IntInsnNode(int i, int i2) {
        super(i);
        this.operand = i2;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitIntInsn(this.opcode, this.operand);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        return new org.objectweb.asm.tree.IntInsnNode(this.opcode, this.operand).cloneAnnotations(this);
    }
}
