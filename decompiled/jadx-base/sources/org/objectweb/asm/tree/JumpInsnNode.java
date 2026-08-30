package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class JumpInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public org.objectweb.asm.tree.LabelNode label;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 7;
    }

    public JumpInsnNode(int i, org.objectweb.asm.tree.LabelNode labelNode) {
        super(i);
        this.label = labelNode;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitJumpInsn(this.opcode, this.label.getLabel());
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        return new org.objectweb.asm.tree.JumpInsnNode(this.opcode, clone(this.label, map)).cloneAnnotations(this);
    }
}
