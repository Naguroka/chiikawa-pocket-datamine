package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class IincInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public int incr;
    public int var;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 10;
    }

    public IincInsnNode(int i, int i2) {
        super(org.objectweb.asm.Opcodes.IINC);
        this.var = i;
        this.incr = i2;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitIincInsn(this.var, this.incr);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        return new org.objectweb.asm.tree.IincInsnNode(this.var, this.incr).cloneAnnotations(this);
    }
}
