package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class FrameNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public java.util.List<java.lang.Object> local;
    public java.util.List<java.lang.Object> stack;
    public int type;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 14;
    }

    private FrameNode() {
        super(-1);
    }

    public FrameNode(int i, int i2, java.lang.Object[] objArr, int i3, java.lang.Object[] objArr2) {
        super(-1);
        this.type = i;
        if (i == -1 || i == 0) {
            this.local = org.objectweb.asm.tree.Util.asArrayList(i2, objArr);
            this.stack = org.objectweb.asm.tree.Util.asArrayList(i3, objArr2);
            return;
        }
        if (i == 1) {
            this.local = org.objectweb.asm.tree.Util.asArrayList(i2, objArr);
            return;
        }
        if (i == 2) {
            this.local = org.objectweb.asm.tree.Util.asArrayList(i2);
        } else if (i != 3) {
            if (i == 4) {
                this.stack = org.objectweb.asm.tree.Util.asArrayList(1, objArr2);
                return;
            }
            throw new java.lang.IllegalArgumentException();
        }
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        int i = this.type;
        if (i == -1 || i == 0) {
            methodVisitor.visitFrame(i, this.local.size(), asArray(this.local), this.stack.size(), asArray(this.stack));
            return;
        }
        if (i == 1) {
            methodVisitor.visitFrame(i, this.local.size(), asArray(this.local), 0, null);
            return;
        }
        if (i == 2) {
            methodVisitor.visitFrame(i, this.local.size(), null, 0, null);
        } else if (i == 3) {
            methodVisitor.visitFrame(i, 0, null, 0, null);
        } else {
            if (i == 4) {
                methodVisitor.visitFrame(i, 0, null, 1, asArray(this.stack));
                return;
            }
            throw new java.lang.IllegalArgumentException();
        }
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        org.objectweb.asm.tree.FrameNode frameNode = new org.objectweb.asm.tree.FrameNode();
        frameNode.type = this.type;
        if (this.local != null) {
            frameNode.local = new java.util.ArrayList();
            int size = this.local.size();
            for (int i = 0; i < size; i++) {
                java.lang.Object obj = this.local.get(i);
                if (obj instanceof org.objectweb.asm.tree.LabelNode) {
                    obj = map.get(obj);
                }
                frameNode.local.add(obj);
            }
        }
        if (this.stack != null) {
            frameNode.stack = new java.util.ArrayList();
            int size2 = this.stack.size();
            for (int i2 = 0; i2 < size2; i2++) {
                java.lang.Object obj2 = this.stack.get(i2);
                if (obj2 instanceof org.objectweb.asm.tree.LabelNode) {
                    obj2 = map.get(obj2);
                }
                frameNode.stack.add(obj2);
            }
        }
        return frameNode;
    }

    private static java.lang.Object[] asArray(java.util.List<java.lang.Object> list) {
        int size = list.size();
        java.lang.Object[] objArr = new java.lang.Object[size];
        for (int i = 0; i < size; i++) {
            java.lang.Object label = list.get(i);
            if (label instanceof org.objectweb.asm.tree.LabelNode) {
                label = ((org.objectweb.asm.tree.LabelNode) label).getLabel();
            }
            objArr[i] = label;
        }
        return objArr;
    }
}
