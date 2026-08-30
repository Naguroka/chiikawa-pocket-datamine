package org.jacoco.core.internal.instr;

/* JADX INFO: loaded from: classes6.dex */
class ProbeInserter extends org.objectweb.asm.MethodVisitor implements org.jacoco.core.internal.instr.IProbeInserter {
    private int accessorStackSize;
    private final org.jacoco.core.internal.instr.IProbeArrayStrategy arrayStrategy;
    private final org.objectweb.asm.Label beginLabel;
    private final boolean clinit;
    private final int variable;

    ProbeInserter(int i, java.lang.String str, java.lang.String str2, org.objectweb.asm.MethodVisitor methodVisitor, org.jacoco.core.internal.instr.IProbeArrayStrategy iProbeArrayStrategy) {
        super(589824, methodVisitor);
        this.clinit = "<clinit>".equals(str);
        this.arrayStrategy = iProbeArrayStrategy;
        int size = (i & 8) == 0 ? 1 : 0;
        for (org.objectweb.asm.Type type : org.objectweb.asm.Type.getArgumentTypes(str2)) {
            size += type.getSize();
        }
        this.variable = size;
        this.beginLabel = new org.objectweb.asm.Label();
    }

    @Override // org.jacoco.core.internal.instr.IProbeInserter
    public void insertProbe(int i) {
        this.mv.visitVarInsn(25, this.variable);
        org.jacoco.core.internal.instr.InstrSupport.push(this.mv, i);
        this.mv.visitInsn(4);
        this.mv.visitInsn(84);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitCode() {
        this.mv.visitLabel(this.beginLabel);
        this.accessorStackSize = this.arrayStrategy.storeInstance(this.mv, this.clinit, this.variable);
        this.mv.visitCode();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public final void visitVarInsn(int i, int i2) {
        this.mv.visitVarInsn(i, map(i2));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public final void visitIincInsn(int i, int i2) {
        this.mv.visitIincInsn(map(i), i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public final void visitLocalVariable(java.lang.String str, java.lang.String str2, java.lang.String str3, org.objectweb.asm.Label label, org.objectweb.asm.Label label2, int i) {
        if (i < this.variable) {
            this.mv.visitLocalVariable(str, str2, str3, this.beginLabel, label2, i);
        } else {
            this.mv.visitLocalVariable(str, str2, str3, label, label2, map(i));
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitLocalVariableAnnotation(int i, org.objectweb.asm.TypePath typePath, org.objectweb.asm.Label[] labelArr, org.objectweb.asm.Label[] labelArr2, int[] iArr, java.lang.String str, boolean z) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = map(iArr[i2]);
        }
        return this.mv.visitLocalVariableAnnotation(i, typePath, labelArr, labelArr2, iArr2, str, z);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i, int i2) {
        this.mv.visitMaxs(java.lang.Math.max(i + 3, this.accessorStackSize), i2 + 1);
    }

    private int map(int i) {
        return i < this.variable ? i : i + 1;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public final void visitFrame(int i, int i2, java.lang.Object[] objArr, int i3, java.lang.Object[] objArr2) {
        int i4;
        if (i != -1) {
            throw new java.lang.IllegalArgumentException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
        }
        java.lang.Object[] objArr3 = new java.lang.Object[java.lang.Math.max(i2, this.variable) + 1];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i5 < i2 || i6 <= this.variable) {
                if (i6 == this.variable) {
                    i4 = i7 + 1;
                    objArr3[i7] = org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC;
                } else if (i5 < i2) {
                    int i8 = i5 + 1;
                    java.lang.Object obj = objArr[i5];
                    int i9 = i7 + 1;
                    objArr3[i7] = obj;
                    i6++;
                    if (obj == org.objectweb.asm.Opcodes.LONG || obj == org.objectweb.asm.Opcodes.DOUBLE) {
                        i6++;
                    }
                    i5 = i8;
                    i7 = i9;
                } else {
                    i4 = i7 + 1;
                    objArr3[i7] = org.objectweb.asm.Opcodes.TOP;
                }
                i6++;
                i7 = i4;
            } else {
                this.mv.visitFrame(i, i7, objArr3, i3, objArr2);
                return;
            }
        }
    }
}
