package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class TryCatchBlockNode {
    public org.objectweb.asm.tree.LabelNode end;
    public org.objectweb.asm.tree.LabelNode handler;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> invisibleTypeAnnotations;
    public org.objectweb.asm.tree.LabelNode start;
    public java.lang.String type;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> visibleTypeAnnotations;

    public TryCatchBlockNode(org.objectweb.asm.tree.LabelNode labelNode, org.objectweb.asm.tree.LabelNode labelNode2, org.objectweb.asm.tree.LabelNode labelNode3, java.lang.String str) {
        this.start = labelNode;
        this.end = labelNode2;
        this.handler = labelNode3;
        this.type = str;
    }

    public void updateIndex(int i) {
        int i2 = (i << 8) | 1107296256;
        java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list = this.visibleTypeAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.visibleTypeAnnotations.get(i3).typeRef = i2;
            }
        }
        java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list2 = this.invisibleTypeAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                this.invisibleTypeAnnotations.get(i4).typeRef = i2;
            }
        }
    }

    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        org.objectweb.asm.Label label = this.start.getLabel();
        org.objectweb.asm.Label label2 = this.end.getLabel();
        org.objectweb.asm.tree.LabelNode labelNode = this.handler;
        methodVisitor.visitTryCatchBlock(label, label2, labelNode == null ? null : labelNode.getLabel(), this.type);
        java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list = this.visibleTypeAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i);
                typeAnnotationNode.accept(methodVisitor.visitTryCatchAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list2 = this.invisibleTypeAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i2);
                typeAnnotationNode2.accept(methodVisitor.visitTryCatchAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
    }
}
