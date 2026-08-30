package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class LabelNode extends org.objectweb.asm.tree.AbstractInsnNode {
    private org.objectweb.asm.Label value;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 8;
    }

    public LabelNode() {
        super(-1);
    }

    public LabelNode(org.objectweb.asm.Label label) {
        super(-1);
        this.value = label;
    }

    public org.objectweb.asm.Label getLabel() {
        if (this.value == null) {
            this.value = new org.objectweb.asm.Label();
        }
        return this.value;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitLabel(getLabel());
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        return map.get(this);
    }

    public void resetLabel() {
        this.value = null;
    }
}
