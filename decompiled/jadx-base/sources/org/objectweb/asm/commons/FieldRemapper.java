package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class FieldRemapper extends org.objectweb.asm.FieldVisitor {
    protected final org.objectweb.asm.commons.Remapper remapper;

    public FieldRemapper(org.objectweb.asm.FieldVisitor fieldVisitor, org.objectweb.asm.commons.Remapper remapper) {
        this(589824, fieldVisitor, remapper);
    }

    protected FieldRemapper(int i, org.objectweb.asm.FieldVisitor fieldVisitor, org.objectweb.asm.commons.Remapper remapper) {
        super(i, fieldVisitor);
        this.remapper = remapper;
    }

    @Override // org.objectweb.asm.FieldVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, boolean z) {
        org.objectweb.asm.AnnotationVisitor annotationVisitorVisitAnnotation = super.visitAnnotation(this.remapper.mapDesc(str), z);
        if (annotationVisitorVisitAnnotation == null) {
            return null;
        }
        return createAnnotationRemapper(str, annotationVisitorVisitAnnotation);
    }

    @Override // org.objectweb.asm.FieldVisitor
    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        org.objectweb.asm.AnnotationVisitor annotationVisitorVisitTypeAnnotation = super.visitTypeAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        if (annotationVisitorVisitTypeAnnotation == null) {
            return null;
        }
        return createAnnotationRemapper(str, annotationVisitorVisitTypeAnnotation);
    }

    @java.lang.Deprecated
    protected org.objectweb.asm.AnnotationVisitor createAnnotationRemapper(org.objectweb.asm.AnnotationVisitor annotationVisitor) {
        return new org.objectweb.asm.commons.AnnotationRemapper(this.api, null, annotationVisitor, this.remapper);
    }

    protected org.objectweb.asm.AnnotationVisitor createAnnotationRemapper(java.lang.String str, org.objectweb.asm.AnnotationVisitor annotationVisitor) {
        return new org.objectweb.asm.commons.AnnotationRemapper(this.api, str, annotationVisitor, this.remapper).orDeprecatedValue(createAnnotationRemapper(annotationVisitor));
    }
}
