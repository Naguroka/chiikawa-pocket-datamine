package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class VarInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public int var;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 2;
    }

    public VarInsnNode(int i, int i2) {
        super(i);
        this.var = i2;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitVarInsn(this.opcode, this.var);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        return new org.objectweb.asm.tree.VarInsnNode(this.opcode, this.var).cloneAnnotations(this);
    }
}
