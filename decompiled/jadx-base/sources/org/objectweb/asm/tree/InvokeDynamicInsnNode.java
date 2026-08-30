package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class InvokeDynamicInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public org.objectweb.asm.Handle bsm;
    public java.lang.Object[] bsmArgs;
    public java.lang.String desc;
    public java.lang.String name;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 6;
    }

    public InvokeDynamicInsnNode(java.lang.String str, java.lang.String str2, org.objectweb.asm.Handle handle, java.lang.Object... objArr) {
        super(org.objectweb.asm.Opcodes.INVOKEDYNAMIC);
        this.name = str;
        this.desc = str2;
        this.bsm = handle;
        this.bsmArgs = objArr;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitInvokeDynamicInsn(this.name, this.desc, this.bsm, this.bsmArgs);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        return new org.objectweb.asm.tree.InvokeDynamicInsnNode(this.name, this.desc, this.bsm, this.bsmArgs).cloneAnnotations(this);
    }
}
