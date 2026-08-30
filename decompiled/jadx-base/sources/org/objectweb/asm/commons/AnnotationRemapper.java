package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class AnnotationRemapper extends org.objectweb.asm.AnnotationVisitor {
    protected final java.lang.String descriptor;
    protected final org.objectweb.asm.commons.Remapper remapper;

    @java.lang.Deprecated
    public AnnotationRemapper(org.objectweb.asm.AnnotationVisitor annotationVisitor, org.objectweb.asm.commons.Remapper remapper) {
        this((java.lang.String) null, annotationVisitor, remapper);
    }

    public AnnotationRemapper(java.lang.String str, org.objectweb.asm.AnnotationVisitor annotationVisitor, org.objectweb.asm.commons.Remapper remapper) {
        this(589824, str, annotationVisitor, remapper);
    }

    @java.lang.Deprecated
    protected AnnotationRemapper(int i, org.objectweb.asm.AnnotationVisitor annotationVisitor, org.objectweb.asm.commons.Remapper remapper) {
        this(i, null, annotationVisitor, remapper);
    }

    protected AnnotationRemapper(int i, java.lang.String str, org.objectweb.asm.AnnotationVisitor annotationVisitor, org.objectweb.asm.commons.Remapper remapper) {
        super(i, annotationVisitor);
        this.descriptor = str;
        this.remapper = remapper;
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visit(java.lang.String str, java.lang.Object obj) {
        super.visit(mapAnnotationAttributeName(str), this.remapper.mapValue(obj));
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnum(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super.visitEnum(mapAnnotationAttributeName(str), this.remapper.mapDesc(str2), str3);
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, java.lang.String str2) {
        org.objectweb.asm.AnnotationVisitor annotationVisitorVisitAnnotation = super.visitAnnotation(mapAnnotationAttributeName(str), this.remapper.mapDesc(str2));
        if (annotationVisitorVisitAnnotation == null) {
            return null;
        }
        return annotationVisitorVisitAnnotation == this.av ? this : createAnnotationRemapper(str2, annotationVisitorVisitAnnotation);
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public org.objectweb.asm.AnnotationVisitor visitArray(java.lang.String str) {
        org.objectweb.asm.AnnotationVisitor annotationVisitorVisitArray = super.visitArray(mapAnnotationAttributeName(str));
        if (annotationVisitorVisitArray == null) {
            return null;
        }
        return annotationVisitorVisitArray == this.av ? this : createAnnotationRemapper(null, annotationVisitorVisitArray);
    }

    @java.lang.Deprecated
    protected org.objectweb.asm.AnnotationVisitor createAnnotationRemapper(org.objectweb.asm.AnnotationVisitor annotationVisitor) {
        return new org.objectweb.asm.commons.AnnotationRemapper(this.api, null, annotationVisitor, this.remapper);
    }

    protected org.objectweb.asm.AnnotationVisitor createAnnotationRemapper(java.lang.String str, org.objectweb.asm.AnnotationVisitor annotationVisitor) {
        return new org.objectweb.asm.commons.AnnotationRemapper(this.api, str, annotationVisitor, this.remapper).orDeprecatedValue(createAnnotationRemapper(annotationVisitor));
    }

    final org.objectweb.asm.AnnotationVisitor orDeprecatedValue(org.objectweb.asm.AnnotationVisitor annotationVisitor) {
        if (annotationVisitor.getClass() == getClass()) {
            org.objectweb.asm.commons.AnnotationRemapper annotationRemapper = (org.objectweb.asm.commons.AnnotationRemapper) annotationVisitor;
            if (annotationRemapper.api == this.api && annotationRemapper.av == this.av && annotationRemapper.remapper == this.remapper) {
                return this;
            }
        }
        return annotationVisitor;
    }

    private java.lang.String mapAnnotationAttributeName(java.lang.String str) {
        java.lang.String str2 = this.descriptor;
        return str2 == null ? str : this.remapper.mapAnnotationAttributeName(str2, str);
    }
}
