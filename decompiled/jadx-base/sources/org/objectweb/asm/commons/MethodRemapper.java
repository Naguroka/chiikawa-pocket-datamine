package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class MethodRemapper extends org.objectweb.asm.MethodVisitor {
    protected final org.objectweb.asm.commons.Remapper remapper;

    public MethodRemapper(org.objectweb.asm.MethodVisitor methodVisitor, org.objectweb.asm.commons.Remapper remapper) {
        this(589824, methodVisitor, remapper);
    }

    protected MethodRemapper(int i, org.objectweb.asm.MethodVisitor methodVisitor, org.objectweb.asm.commons.Remapper remapper) {
        super(i, methodVisitor);
        this.remapper = remapper;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotationDefault() {
        org.objectweb.asm.AnnotationVisitor annotationVisitorVisitAnnotationDefault = super.visitAnnotationDefault();
        return annotationVisitorVisitAnnotationDefault == null ? annotationVisitorVisitAnnotationDefault : createAnnotationRemapper(null, annotationVisitorVisitAnnotationDefault);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, boolean z) {
        org.objectweb.asm.AnnotationVisitor annotationVisitorVisitAnnotation = super.visitAnnotation(this.remapper.mapDesc(str), z);
        return annotationVisitorVisitAnnotation == null ? annotationVisitorVisitAnnotation : createAnnotationRemapper(str, annotationVisitorVisitAnnotation);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        org.objectweb.asm.AnnotationVisitor annotationVisitorVisitTypeAnnotation = super.visitTypeAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        return annotationVisitorVisitTypeAnnotation == null ? annotationVisitorVisitTypeAnnotation : createAnnotationRemapper(str, annotationVisitorVisitTypeAnnotation);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitParameterAnnotation(int i, java.lang.String str, boolean z) {
        org.objectweb.asm.AnnotationVisitor annotationVisitorVisitParameterAnnotation = super.visitParameterAnnotation(i, this.remapper.mapDesc(str), z);
        return annotationVisitorVisitParameterAnnotation == null ? annotationVisitorVisitParameterAnnotation : createAnnotationRemapper(str, annotationVisitorVisitParameterAnnotation);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i, int i2, java.lang.Object[] objArr, int i3, java.lang.Object[] objArr2) {
        super.visitFrame(i, i2, remapFrameTypes(i2, objArr), i3, remapFrameTypes(i3, objArr2));
    }

    private java.lang.Object[] remapFrameTypes(int i, java.lang.Object[] objArr) {
        if (objArr == null) {
            return objArr;
        }
        java.lang.Object[] objArr2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] instanceof java.lang.String) {
                if (objArr2 == null) {
                    objArr2 = new java.lang.Object[i];
                    java.lang.System.arraycopy(objArr, 0, objArr2, 0, i);
                }
                objArr2[i2] = this.remapper.mapType((java.lang.String) objArr[i2]);
            }
        }
        return objArr2 == null ? objArr : objArr2;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super.visitFieldInsn(i, this.remapper.mapType(str), this.remapper.mapFieldName(str, str2, str3), this.remapper.mapDesc(str3));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        if (this.api < 327680 && (i & 256) == 0) {
            super.visitMethodInsn(i, str, str2, str3, z);
        } else {
            super.visitMethodInsn(i, this.remapper.mapType(str), this.remapper.mapMethodName(str, str2, str3), this.remapper.mapMethodDesc(str3), z);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String str, java.lang.String str2, org.objectweb.asm.Handle handle, java.lang.Object... objArr) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            objArr2[i] = this.remapper.mapValue(objArr[i]);
        }
        super.visitInvokeDynamicInsn(this.remapper.mapInvokeDynamicMethodName(str, str2), this.remapper.mapMethodDesc(str2), (org.objectweb.asm.Handle) this.remapper.mapValue(handle), objArr2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, java.lang.String str) {
        super.visitTypeInsn(i, this.remapper.mapType(str));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object obj) {
        super.visitLdcInsn(this.remapper.mapValue(obj));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String str, int i) {
        super.visitMultiANewArrayInsn(this.remapper.mapDesc(str), i);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitInsnAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        org.objectweb.asm.AnnotationVisitor annotationVisitorVisitInsnAnnotation = super.visitInsnAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        return annotationVisitorVisitInsnAnnotation == null ? annotationVisitorVisitInsnAnnotation : createAnnotationRemapper(str, annotationVisitorVisitInsnAnnotation);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(org.objectweb.asm.Label label, org.objectweb.asm.Label label2, org.objectweb.asm.Label label3, java.lang.String str) {
        super.visitTryCatchBlock(label, label2, label3, str == null ? null : this.remapper.mapType(str));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitTryCatchAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        org.objectweb.asm.AnnotationVisitor annotationVisitorVisitTryCatchAnnotation = super.visitTryCatchAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        return annotationVisitorVisitTryCatchAnnotation == null ? annotationVisitorVisitTryCatchAnnotation : createAnnotationRemapper(str, annotationVisitorVisitTryCatchAnnotation);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(java.lang.String str, java.lang.String str2, java.lang.String str3, org.objectweb.asm.Label label, org.objectweb.asm.Label label2, int i) {
        super.visitLocalVariable(str, this.remapper.mapDesc(str2), this.remapper.mapSignature(str3, true), label, label2, i);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitLocalVariableAnnotation(int i, org.objectweb.asm.TypePath typePath, org.objectweb.asm.Label[] labelArr, org.objectweb.asm.Label[] labelArr2, int[] iArr, java.lang.String str, boolean z) {
        org.objectweb.asm.AnnotationVisitor annotationVisitorVisitLocalVariableAnnotation = super.visitLocalVariableAnnotation(i, typePath, labelArr, labelArr2, iArr, this.remapper.mapDesc(str), z);
        return annotationVisitorVisitLocalVariableAnnotation == null ? annotationVisitorVisitLocalVariableAnnotation : createAnnotationRemapper(str, annotationVisitorVisitLocalVariableAnnotation);
    }

    @java.lang.Deprecated
    protected org.objectweb.asm.AnnotationVisitor createAnnotationRemapper(org.objectweb.asm.AnnotationVisitor annotationVisitor) {
        return new org.objectweb.asm.commons.AnnotationRemapper(this.api, null, annotationVisitor, this.remapper);
    }

    protected org.objectweb.asm.AnnotationVisitor createAnnotationRemapper(java.lang.String str, org.objectweb.asm.AnnotationVisitor annotationVisitor) {
        return new org.objectweb.asm.commons.AnnotationRemapper(this.api, str, annotationVisitor, this.remapper).orDeprecatedValue(createAnnotationRemapper(annotationVisitor));
    }
}
