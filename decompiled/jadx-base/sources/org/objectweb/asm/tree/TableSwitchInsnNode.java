package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class TableSwitchInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public org.objectweb.asm.tree.LabelNode dflt;
    public java.util.List<org.objectweb.asm.tree.LabelNode> labels;
    public int max;
    public int min;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 11;
    }

    public TableSwitchInsnNode(int i, int i2, org.objectweb.asm.tree.LabelNode labelNode, org.objectweb.asm.tree.LabelNode... labelNodeArr) {
        super(org.objectweb.asm.Opcodes.TABLESWITCH);
        this.min = i;
        this.max = i2;
        this.dflt = labelNode;
        this.labels = org.objectweb.asm.tree.Util.asArrayList(labelNodeArr);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        int size = this.labels.size();
        org.objectweb.asm.Label[] labelArr = new org.objectweb.asm.Label[size];
        for (int i = 0; i < size; i++) {
            labelArr[i] = this.labels.get(i).getLabel();
        }
        methodVisitor.visitTableSwitchInsn(this.min, this.max, this.dflt.getLabel(), labelArr);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        return new org.objectweb.asm.tree.TableSwitchInsnNode(this.min, this.max, clone(this.dflt, map), clone(this.labels, map)).cloneAnnotations(this);
    }
}
