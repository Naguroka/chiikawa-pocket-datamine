package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class TypeInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public java.lang.String desc;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 3;
    }

    public TypeInsnNode(int i, java.lang.String str) {
        super(i);
        this.desc = str;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitTypeInsn(this.opcode, this.desc);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        return new org.objectweb.asm.tree.TypeInsnNode(this.opcode, this.desc).cloneAnnotations(this);
    }
}
