package org.jacoco.core.internal.instr;

/* JADX INFO: loaded from: classes6.dex */
class DuplicateFrameEliminator extends org.objectweb.asm.MethodVisitor {
    private boolean instruction;

    public DuplicateFrameEliminator(org.objectweb.asm.MethodVisitor methodVisitor) {
        super(589824, methodVisitor);
        this.instruction = true;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i, int i2, java.lang.Object[] objArr, int i3, java.lang.Object[] objArr2) {
        if (this.instruction) {
            this.instruction = false;
            this.mv.visitFrame(i, i2, objArr, i3, objArr2);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        this.instruction = true;
        this.mv.visitInsn(i);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        this.instruction = true;
        this.mv.visitIntInsn(i, i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        this.instruction = true;
        this.mv.visitVarInsn(i, i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, java.lang.String str) {
        this.instruction = true;
        this.mv.visitTypeInsn(i, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.instruction = true;
        this.mv.visitFieldInsn(i, str, str2, str3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        this.instruction = true;
        this.mv.visitMethodInsn(i, str, str2, str3, z);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String str, java.lang.String str2, org.objectweb.asm.Handle handle, java.lang.Object... objArr) {
        this.instruction = true;
        this.mv.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, org.objectweb.asm.Label label) {
        this.instruction = true;
        this.mv.visitJumpInsn(i, label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object obj) {
        this.instruction = true;
        this.mv.visitLdcInsn(obj);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        this.instruction = true;
        this.mv.visitIincInsn(i, i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, org.objectweb.asm.Label label, org.objectweb.asm.Label... labelArr) {
        this.instruction = true;
        this.mv.visitTableSwitchInsn(i, i2, label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(org.objectweb.asm.Label label, int[] iArr, org.objectweb.asm.Label[] labelArr) {
        this.instruction = true;
        this.mv.visitLookupSwitchInsn(label, iArr, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String str, int i) {
        this.instruction = true;
        this.mv.visitMultiANewArrayInsn(str, i);
    }
}
