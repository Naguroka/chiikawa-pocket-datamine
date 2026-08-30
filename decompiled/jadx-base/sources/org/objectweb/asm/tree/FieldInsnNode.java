package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class FieldInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public java.lang.String desc;
    public java.lang.String name;
    public java.lang.String owner;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 4;
    }

    public FieldInsnNode(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(i);
        this.owner = str;
        this.name = str2;
        this.desc = str3;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitFieldInsn(this.opcode, this.owner, this.name, this.desc);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        return new org.objectweb.asm.tree.FieldInsnNode(this.opcode, this.owner, this.name, this.desc).cloneAnnotations(this);
    }
}
