package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class LocalVariableAnnotationNode extends org.objectweb.asm.tree.TypeAnnotationNode {
    public java.util.List<org.objectweb.asm.tree.LabelNode> end;
    public java.util.List<java.lang.Integer> index;
    public java.util.List<org.objectweb.asm.tree.LabelNode> start;

    public LocalVariableAnnotationNode(int i, org.objectweb.asm.TypePath typePath, org.objectweb.asm.tree.LabelNode[] labelNodeArr, org.objectweb.asm.tree.LabelNode[] labelNodeArr2, int[] iArr, java.lang.String str) {
        this(589824, i, typePath, labelNodeArr, labelNodeArr2, iArr, str);
    }

    public LocalVariableAnnotationNode(int i, int i2, org.objectweb.asm.TypePath typePath, org.objectweb.asm.tree.LabelNode[] labelNodeArr, org.objectweb.asm.tree.LabelNode[] labelNodeArr2, int[] iArr, java.lang.String str) {
        super(i, i2, typePath, str);
        this.start = org.objectweb.asm.tree.Util.asArrayList(labelNodeArr);
        this.end = org.objectweb.asm.tree.Util.asArrayList(labelNodeArr2);
        this.index = org.objectweb.asm.tree.Util.asArrayList(iArr);
    }

    public void accept(org.objectweb.asm.MethodVisitor methodVisitor, boolean z) {
        int size = this.start.size();
        org.objectweb.asm.Label[] labelArr = new org.objectweb.asm.Label[size];
        org.objectweb.asm.Label[] labelArr2 = new org.objectweb.asm.Label[this.end.size()];
        int[] iArr = new int[this.index.size()];
        for (int i = 0; i < size; i++) {
            labelArr[i] = this.start.get(i).getLabel();
            labelArr2[i] = this.end.get(i).getLabel();
            iArr[i] = this.index.get(i).intValue();
        }
        accept(methodVisitor.visitLocalVariableAnnotation(this.typeRef, this.typePath, labelArr, labelArr2, iArr, this.desc, z));
    }
}
