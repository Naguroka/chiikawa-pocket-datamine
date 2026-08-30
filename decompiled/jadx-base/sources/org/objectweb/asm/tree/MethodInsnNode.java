package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class MethodInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public java.lang.String desc;
    public boolean itf;
    public java.lang.String name;
    public java.lang.String owner;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 5;
    }

    public MethodInsnNode(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(i, str, str2, str3, i == 185);
    }

    public MethodInsnNode(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        super(i);
        this.owner = str;
        this.name = str2;
        this.desc = str3;
        this.itf = z;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitMethodInsn(this.opcode, this.owner, this.name, this.desc, this.itf);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        return new org.objectweb.asm.tree.MethodInsnNode(this.opcode, this.owner, this.name, this.desc, this.itf).cloneAnnotations(this);
    }
}
