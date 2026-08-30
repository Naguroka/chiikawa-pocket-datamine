package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AnnotationVisitor {
    protected final int api;
    protected org.objectweb.asm.AnnotationVisitor av;

    public AnnotationVisitor(int i) {
        this(i, null);
    }

    public AnnotationVisitor(int i, org.objectweb.asm.AnnotationVisitor annotationVisitor) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new java.lang.IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            org.objectweb.asm.Constants.checkAsmExperimental(this);
        }
        this.api = i;
        this.av = annotationVisitor;
    }

    public void visit(java.lang.String str, java.lang.Object obj) {
        org.objectweb.asm.AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            annotationVisitor.visit(str, obj);
        }
    }

    public void visitEnum(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.objectweb.asm.AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            annotationVisitor.visitEnum(str, str2, str3);
        }
    }

    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, java.lang.String str2) {
        org.objectweb.asm.AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            return annotationVisitor.visitAnnotation(str, str2);
        }
        return null;
    }

    public org.objectweb.asm.AnnotationVisitor visitArray(java.lang.String str) {
        org.objectweb.asm.AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            return annotationVisitor.visitArray(str);
        }
        return null;
    }

    public void visitEnd() {
        org.objectweb.asm.AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
    }
}
