package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class AnnotationNode extends org.objectweb.asm.AnnotationVisitor {
    public java.lang.String desc;
    public java.util.List<java.lang.Object> values;

    public void check(int i) {
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnd() {
    }

    public AnnotationNode(java.lang.String str) {
        this(589824, str);
        if (getClass() != org.objectweb.asm.tree.AnnotationNode.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    public AnnotationNode(int i, java.lang.String str) {
        super(i);
        this.desc = str;
    }

    AnnotationNode(java.util.List<java.lang.Object> list) {
        super(589824);
        this.values = list;
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visit(java.lang.String str, java.lang.Object obj) {
        if (this.values == null) {
            this.values = new java.util.ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(str);
        }
        if (obj instanceof byte[]) {
            this.values.add(org.objectweb.asm.tree.Util.asArrayList((byte[]) obj));
            return;
        }
        if (obj instanceof boolean[]) {
            this.values.add(org.objectweb.asm.tree.Util.asArrayList((boolean[]) obj));
            return;
        }
        if (obj instanceof short[]) {
            this.values.add(org.objectweb.asm.tree.Util.asArrayList((short[]) obj));
            return;
        }
        if (obj instanceof char[]) {
            this.values.add(org.objectweb.asm.tree.Util.asArrayList((char[]) obj));
            return;
        }
        if (obj instanceof int[]) {
            this.values.add(org.objectweb.asm.tree.Util.asArrayList((int[]) obj));
            return;
        }
        if (obj instanceof long[]) {
            this.values.add(org.objectweb.asm.tree.Util.asArrayList((long[]) obj));
            return;
        }
        if (obj instanceof float[]) {
            this.values.add(org.objectweb.asm.tree.Util.asArrayList((float[]) obj));
        } else if (obj instanceof double[]) {
            this.values.add(org.objectweb.asm.tree.Util.asArrayList((double[]) obj));
        } else {
            this.values.add(obj);
        }
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnum(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (this.values == null) {
            this.values = new java.util.ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(str);
        }
        this.values.add(new java.lang.String[]{str2, str3});
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, java.lang.String str2) {
        if (this.values == null) {
            this.values = new java.util.ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(str);
        }
        org.objectweb.asm.tree.AnnotationNode annotationNode = new org.objectweb.asm.tree.AnnotationNode(str2);
        this.values.add(annotationNode);
        return annotationNode;
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public org.objectweb.asm.AnnotationVisitor visitArray(java.lang.String str) {
        if (this.values == null) {
            this.values = new java.util.ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(str);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.values.add(arrayList);
        return new org.objectweb.asm.tree.AnnotationNode(arrayList);
    }

    public void accept(org.objectweb.asm.AnnotationVisitor annotationVisitor) {
        if (annotationVisitor != null) {
            java.util.List<java.lang.Object> list = this.values;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i += 2) {
                    accept(annotationVisitor, (java.lang.String) this.values.get(i), this.values.get(i + 1));
                }
            }
            annotationVisitor.visitEnd();
        }
    }

    static void accept(org.objectweb.asm.AnnotationVisitor annotationVisitor, java.lang.String str, java.lang.Object obj) {
        if (annotationVisitor != null) {
            if (obj instanceof java.lang.String[]) {
                java.lang.String[] strArr = (java.lang.String[]) obj;
                annotationVisitor.visitEnum(str, strArr[0], strArr[1]);
                return;
            }
            if (obj instanceof org.objectweb.asm.tree.AnnotationNode) {
                org.objectweb.asm.tree.AnnotationNode annotationNode = (org.objectweb.asm.tree.AnnotationNode) obj;
                annotationNode.accept(annotationVisitor.visitAnnotation(str, annotationNode.desc));
                return;
            }
            if (obj instanceof java.util.List) {
                org.objectweb.asm.AnnotationVisitor annotationVisitorVisitArray = annotationVisitor.visitArray(str);
                if (annotationVisitorVisitArray != null) {
                    java.util.List list = (java.util.List) obj;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        accept(annotationVisitorVisitArray, null, list.get(i));
                    }
                    annotationVisitorVisitArray.visitEnd();
                    return;
                }
                return;
            }
            annotationVisitor.visit(str, obj);
        }
    }
}
