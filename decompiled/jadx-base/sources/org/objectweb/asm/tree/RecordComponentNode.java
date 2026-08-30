package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class RecordComponentNode extends org.objectweb.asm.RecordComponentVisitor {
    public java.util.List<org.objectweb.asm.Attribute> attrs;
    public java.lang.String descriptor;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode> invisibleAnnotations;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> invisibleTypeAnnotations;
    public java.lang.String name;
    public java.lang.String signature;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode> visibleAnnotations;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> visibleTypeAnnotations;

    @Override // org.objectweb.asm.RecordComponentVisitor
    public void visitEnd() {
    }

    public RecordComponentNode(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(589824, str, str2, str3);
        if (getClass() != org.objectweb.asm.tree.RecordComponentNode.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    public RecordComponentNode(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(i);
        this.name = str;
        this.descriptor = str2;
        this.signature = str3;
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, boolean z) {
        org.objectweb.asm.tree.AnnotationNode annotationNode = new org.objectweb.asm.tree.AnnotationNode(str);
        if (z) {
            this.visibleAnnotations = org.objectweb.asm.tree.Util.add(this.visibleAnnotations, annotationNode);
        } else {
            this.invisibleAnnotations = org.objectweb.asm.tree.Util.add(this.invisibleAnnotations, annotationNode);
        }
        return annotationNode;
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode = new org.objectweb.asm.tree.TypeAnnotationNode(i, typePath, str);
        if (z) {
            this.visibleTypeAnnotations = org.objectweb.asm.tree.Util.add(this.visibleTypeAnnotations, typeAnnotationNode);
        } else {
            this.invisibleTypeAnnotations = org.objectweb.asm.tree.Util.add(this.invisibleTypeAnnotations, typeAnnotationNode);
        }
        return typeAnnotationNode;
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public void visitAttribute(org.objectweb.asm.Attribute attribute) {
        this.attrs = org.objectweb.asm.tree.Util.add(this.attrs, attribute);
    }

    public void check(int i) {
        if (i < 524288) {
            throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
        }
    }

    public void accept(org.objectweb.asm.ClassVisitor classVisitor) {
        org.objectweb.asm.RecordComponentVisitor recordComponentVisitorVisitRecordComponent = classVisitor.visitRecordComponent(this.name, this.descriptor, this.signature);
        if (recordComponentVisitorVisitRecordComponent == null) {
            return;
        }
        java.util.List<org.objectweb.asm.tree.AnnotationNode> list = this.visibleAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                org.objectweb.asm.tree.AnnotationNode annotationNode = this.visibleAnnotations.get(i);
                annotationNode.accept(recordComponentVisitorVisitRecordComponent.visitAnnotation(annotationNode.desc, true));
            }
        }
        java.util.List<org.objectweb.asm.tree.AnnotationNode> list2 = this.invisibleAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                org.objectweb.asm.tree.AnnotationNode annotationNode2 = this.invisibleAnnotations.get(i2);
                annotationNode2.accept(recordComponentVisitorVisitRecordComponent.visitAnnotation(annotationNode2.desc, false));
            }
        }
        java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list3 = this.visibleTypeAnnotations;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i3);
                typeAnnotationNode.accept(recordComponentVisitorVisitRecordComponent.visitTypeAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list4 = this.invisibleTypeAnnotations;
        if (list4 != null) {
            int size4 = list4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i4);
                typeAnnotationNode2.accept(recordComponentVisitorVisitRecordComponent.visitTypeAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
        java.util.List<org.objectweb.asm.Attribute> list5 = this.attrs;
        if (list5 != null) {
            int size5 = list5.size();
            for (int i5 = 0; i5 < size5; i5++) {
                recordComponentVisitorVisitRecordComponent.visitAttribute(this.attrs.get(i5));
            }
        }
        recordComponentVisitorVisitRecordComponent.visitEnd();
    }
}
