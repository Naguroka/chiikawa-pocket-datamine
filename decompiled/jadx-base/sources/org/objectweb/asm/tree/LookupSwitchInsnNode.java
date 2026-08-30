package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class LookupSwitchInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public org.objectweb.asm.tree.LabelNode dflt;
    public java.util.List<java.lang.Integer> keys;
    public java.util.List<org.objectweb.asm.tree.LabelNode> labels;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 12;
    }

    public LookupSwitchInsnNode(org.objectweb.asm.tree.LabelNode labelNode, int[] iArr, org.objectweb.asm.tree.LabelNode[] labelNodeArr) {
        super(org.objectweb.asm.Opcodes.LOOKUPSWITCH);
        this.dflt = labelNode;
        this.keys = org.objectweb.asm.tree.Util.asArrayList(iArr);
        this.labels = org.objectweb.asm.tree.Util.asArrayList(labelNodeArr);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        int size = this.keys.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.keys.get(i).intValue();
        }
        int size2 = this.labels.size();
        org.objectweb.asm.Label[] labelArr = new org.objectweb.asm.Label[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            labelArr[i2] = this.labels.get(i2).getLabel();
        }
        methodVisitor.visitLookupSwitchInsn(this.dflt.getLabel(), iArr, labelArr);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        org.objectweb.asm.tree.LookupSwitchInsnNode lookupSwitchInsnNode = new org.objectweb.asm.tree.LookupSwitchInsnNode(clone(this.dflt, map), null, clone(this.labels, map));
        lookupSwitchInsnNode.keys.addAll(this.keys);
        return lookupSwitchInsnNode.cloneAnnotations(this);
    }
}
