package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class CodeSizeEvaluator extends org.objectweb.asm.MethodVisitor implements org.objectweb.asm.Opcodes {
    private int maxSize;
    private int minSize;

    public CodeSizeEvaluator(org.objectweb.asm.MethodVisitor methodVisitor) {
        this(589824, methodVisitor);
    }

    protected CodeSizeEvaluator(int i, org.objectweb.asm.MethodVisitor methodVisitor) {
        super(i, methodVisitor);
    }

    public int getMinSize() {
        return this.minSize;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        this.minSize++;
        this.maxSize++;
        super.visitInsn(i);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        if (i == 17) {
            this.minSize += 3;
            this.maxSize += 3;
        } else {
            this.minSize += 2;
            this.maxSize += 2;
        }
        super.visitIntInsn(i, i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        if (i2 < 4 && i != 169) {
            this.minSize++;
            this.maxSize++;
        } else if (i2 >= 256) {
            this.minSize += 4;
            this.maxSize += 4;
        } else {
            this.minSize += 2;
            this.maxSize += 2;
        }
        super.visitVarInsn(i, i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, java.lang.String str) {
        this.minSize += 3;
        this.maxSize += 3;
        super.visitTypeInsn(i, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.minSize += 3;
        this.maxSize += 3;
        super.visitFieldInsn(i, str, str2, str3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        if (this.api < 327680 && (i & 256) == 0) {
            super.visitMethodInsn(i, str, str2, str3, z);
            return;
        }
        if ((i & (-257)) == 185) {
            this.minSize += 5;
            this.maxSize += 5;
        } else {
            this.minSize += 3;
            this.maxSize += 3;
        }
        super.visitMethodInsn(i, str, str2, str3, z);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String str, java.lang.String str2, org.objectweb.asm.Handle handle, java.lang.Object... objArr) {
        this.minSize += 5;
        this.maxSize += 5;
        super.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, org.objectweb.asm.Label label) {
        this.minSize += 3;
        if (i == 167 || i == 168) {
            this.maxSize += 5;
        } else {
            this.maxSize += 8;
        }
        super.visitJumpInsn(i, label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object obj) {
        if ((obj instanceof java.lang.Long) || (obj instanceof java.lang.Double) || ((obj instanceof org.objectweb.asm.ConstantDynamic) && ((org.objectweb.asm.ConstantDynamic) obj).getSize() == 2)) {
            this.minSize += 3;
            this.maxSize += 3;
        } else {
            this.minSize += 2;
            this.maxSize += 3;
        }
        super.visitLdcInsn(obj);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        if (i > 255 || i2 > 127 || i2 < -128) {
            this.minSize += 6;
            this.maxSize += 6;
        } else {
            this.minSize += 3;
            this.maxSize += 3;
        }
        super.visitIincInsn(i, i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, org.objectweb.asm.Label label, org.objectweb.asm.Label... labelArr) {
        this.minSize += (labelArr.length * 4) + 13;
        this.maxSize += (labelArr.length * 4) + 16;
        super.visitTableSwitchInsn(i, i2, label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(org.objectweb.asm.Label label, int[] iArr, org.objectweb.asm.Label[] labelArr) {
        this.minSize += (iArr.length * 8) + 9;
        this.maxSize += (iArr.length * 8) + 12;
        super.visitLookupSwitchInsn(label, iArr, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String str, int i) {
        this.minSize += 4;
        this.maxSize += 4;
        super.visitMultiANewArrayInsn(str, i);
    }
}
