package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class MultiANewArrayInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public java.lang.String desc;
    public int dims;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 13;
    }

    public MultiANewArrayInsnNode(java.lang.String str, int i) {
        super(org.objectweb.asm.Opcodes.MULTIANEWARRAY);
        this.desc = str;
        this.dims = i;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitMultiANewArrayInsn(this.desc, this.dims);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        return new org.objectweb.asm.tree.MultiANewArrayInsnNode(this.desc, this.dims).cloneAnnotations(this);
    }
}
