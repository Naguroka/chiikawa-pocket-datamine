package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MethodVisitor {
    private static final java.lang.String REQUIRES_ASM5 = "This feature requires ASM5";
    protected final int api;
    protected org.objectweb.asm.MethodVisitor mv;

    public MethodVisitor(int i) {
        this(i, null);
    }

    public MethodVisitor(int i, org.objectweb.asm.MethodVisitor methodVisitor) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new java.lang.IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            org.objectweb.asm.Constants.checkAsmExperimental(this);
        }
        this.api = i;
        this.mv = methodVisitor;
    }

    public void visitParameter(java.lang.String str, int i) {
        if (this.api < 327680) {
            throw new java.lang.UnsupportedOperationException(REQUIRES_ASM5);
        }
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitParameter(str, i);
        }
    }

    public org.objectweb.asm.AnnotationVisitor visitAnnotationDefault() {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitAnnotationDefault();
        }
        return null;
    }

    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, boolean z) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitAnnotation(str, z);
        }
        return null;
    }

    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        if (this.api < 327680) {
            throw new java.lang.UnsupportedOperationException(REQUIRES_ASM5);
        }
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitTypeAnnotation(i, typePath, str, z);
        }
        return null;
    }

    public void visitAnnotableParameterCount(int i, boolean z) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitAnnotableParameterCount(i, z);
        }
    }

    public org.objectweb.asm.AnnotationVisitor visitParameterAnnotation(int i, java.lang.String str, boolean z) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitParameterAnnotation(i, str, z);
        }
        return null;
    }

    public void visitAttribute(org.objectweb.asm.Attribute attribute) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitAttribute(attribute);
        }
    }

    public void visitCode() {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitCode();
        }
    }

    public void visitFrame(int i, int i2, java.lang.Object[] objArr, int i3, java.lang.Object[] objArr2) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitFrame(i, i2, objArr, i3, objArr2);
        }
    }

    public void visitInsn(int i) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitInsn(i);
        }
    }

    public void visitIntInsn(int i, int i2) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitIntInsn(i, i2);
        }
    }

    public void visitVarInsn(int i, int i2) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitVarInsn(i, i2);
        }
    }

    public void visitTypeInsn(int i, java.lang.String str) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitTypeInsn(i, str);
        }
    }

    public void visitFieldInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitFieldInsn(i, str, str2, str3);
        }
    }

    @java.lang.Deprecated
    public void visitMethodInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        visitMethodInsn(i | (this.api < 327680 ? 256 : 0), str, str2, str3, i == 185);
    }

    public void visitMethodInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        if (this.api < 327680 && (i & 256) == 0) {
            if (z != (i == 185)) {
                throw new java.lang.UnsupportedOperationException("INVOKESPECIAL/STATIC on interfaces requires ASM5");
            }
            visitMethodInsn(i, str, str2, str3);
        } else {
            org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
            if (methodVisitor != null) {
                methodVisitor.visitMethodInsn(i & (-257), str, str2, str3, z);
            }
        }
    }

    public void visitInvokeDynamicInsn(java.lang.String str, java.lang.String str2, org.objectweb.asm.Handle handle, java.lang.Object... objArr) {
        if (this.api < 327680) {
            throw new java.lang.UnsupportedOperationException(REQUIRES_ASM5);
        }
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitInvokeDynamicInsn(str, str2, handle, objArr);
        }
    }

    public void visitJumpInsn(int i, org.objectweb.asm.Label label) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitJumpInsn(i, label);
        }
    }

    public void visitLabel(org.objectweb.asm.Label label) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitLabel(label);
        }
    }

    public void visitLdcInsn(java.lang.Object obj) {
        if (this.api < 327680 && ((obj instanceof org.objectweb.asm.Handle) || ((obj instanceof org.objectweb.asm.Type) && ((org.objectweb.asm.Type) obj).getSort() == 11))) {
            throw new java.lang.UnsupportedOperationException(REQUIRES_ASM5);
        }
        if (this.api < 458752 && (obj instanceof org.objectweb.asm.ConstantDynamic)) {
            throw new java.lang.UnsupportedOperationException("This feature requires ASM7");
        }
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitLdcInsn(obj);
        }
    }

    public void visitIincInsn(int i, int i2) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitIincInsn(i, i2);
        }
    }

    public void visitTableSwitchInsn(int i, int i2, org.objectweb.asm.Label label, org.objectweb.asm.Label... labelArr) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitTableSwitchInsn(i, i2, label, labelArr);
        }
    }

    public void visitLookupSwitchInsn(org.objectweb.asm.Label label, int[] iArr, org.objectweb.asm.Label[] labelArr) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitLookupSwitchInsn(label, iArr, labelArr);
        }
    }

    public void visitMultiANewArrayInsn(java.lang.String str, int i) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitMultiANewArrayInsn(str, i);
        }
    }

    public org.objectweb.asm.AnnotationVisitor visitInsnAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        if (this.api < 327680) {
            throw new java.lang.UnsupportedOperationException(REQUIRES_ASM5);
        }
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitInsnAnnotation(i, typePath, str, z);
        }
        return null;
    }

    public void visitTryCatchBlock(org.objectweb.asm.Label label, org.objectweb.asm.Label label2, org.objectweb.asm.Label label3, java.lang.String str) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitTryCatchBlock(label, label2, label3, str);
        }
    }

    public org.objectweb.asm.AnnotationVisitor visitTryCatchAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        if (this.api < 327680) {
            throw new java.lang.UnsupportedOperationException(REQUIRES_ASM5);
        }
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitTryCatchAnnotation(i, typePath, str, z);
        }
        return null;
    }

    public void visitLocalVariable(java.lang.String str, java.lang.String str2, java.lang.String str3, org.objectweb.asm.Label label, org.objectweb.asm.Label label2, int i) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitLocalVariable(str, str2, str3, label, label2, i);
        }
    }

    public org.objectweb.asm.AnnotationVisitor visitLocalVariableAnnotation(int i, org.objectweb.asm.TypePath typePath, org.objectweb.asm.Label[] labelArr, org.objectweb.asm.Label[] labelArr2, int[] iArr, java.lang.String str, boolean z) {
        if (this.api < 327680) {
            throw new java.lang.UnsupportedOperationException(REQUIRES_ASM5);
        }
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitLocalVariableAnnotation(i, typePath, labelArr, labelArr2, iArr, str, z);
        }
        return null;
    }

    public void visitLineNumber(int i, org.objectweb.asm.Label label) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitLineNumber(i, label);
        }
    }

    public void visitMaxs(int i, int i2) {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitMaxs(i, i2);
        }
    }

    public void visitEnd() {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitEnd();
        }
    }
}
