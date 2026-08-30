package org.jacoco.core.internal.flow;

/* JADX INFO: loaded from: classes6.dex */
public final class LabelFlowAnalyzer extends org.objectweb.asm.MethodVisitor {
    boolean first;
    org.objectweb.asm.Label lineStart;
    boolean successor;

    public static void markLabels(org.objectweb.asm.tree.MethodNode methodNode) {
        org.jacoco.core.internal.flow.LabelFlowAnalyzer labelFlowAnalyzer = new org.jacoco.core.internal.flow.LabelFlowAnalyzer();
        int size = methodNode.tryCatchBlocks.size();
        while (true) {
            size--;
            if (size >= 0) {
                methodNode.tryCatchBlocks.get(size).accept(labelFlowAnalyzer);
            } else {
                methodNode.instructions.accept(labelFlowAnalyzer);
                return;
            }
        }
    }

    public LabelFlowAnalyzer() {
        super(589824);
        this.successor = false;
        this.first = true;
        this.lineStart = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(org.objectweb.asm.Label label, org.objectweb.asm.Label label2, org.objectweb.asm.Label label3, java.lang.String str) {
        org.jacoco.core.internal.flow.LabelInfo.setTarget(label);
        org.jacoco.core.internal.flow.LabelInfo.setTarget(label3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, org.objectweb.asm.Label label) {
        org.jacoco.core.internal.flow.LabelInfo.setTarget(label);
        if (i == 168) {
            throw new java.lang.AssertionError("Subroutines not supported.");
        }
        this.successor = i != 167;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(org.objectweb.asm.Label label) {
        if (this.first) {
            org.jacoco.core.internal.flow.LabelInfo.setTarget(label);
        }
        if (this.successor) {
            org.jacoco.core.internal.flow.LabelInfo.setSuccessor(label);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int i, org.objectweb.asm.Label label) {
        this.lineStart = label;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, org.objectweb.asm.Label label, org.objectweb.asm.Label... labelArr) {
        visitSwitchInsn(label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(org.objectweb.asm.Label label, int[] iArr, org.objectweb.asm.Label[] labelArr) {
        visitSwitchInsn(label, labelArr);
    }

    private void visitSwitchInsn(org.objectweb.asm.Label label, org.objectweb.asm.Label[] labelArr) {
        org.jacoco.core.internal.flow.LabelInfo.resetDone(label);
        org.jacoco.core.internal.flow.LabelInfo.resetDone(labelArr);
        setTargetIfNotDone(label);
        for (org.objectweb.asm.Label label2 : labelArr) {
            setTargetIfNotDone(label2);
        }
        this.successor = false;
        this.first = false;
    }

    private static void setTargetIfNotDone(org.objectweb.asm.Label label) {
        if (org.jacoco.core.internal.flow.LabelInfo.isDone(label)) {
            return;
        }
        org.jacoco.core.internal.flow.LabelInfo.setTarget(label);
        org.jacoco.core.internal.flow.LabelInfo.setDone(label);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        if (i == 169) {
            throw new java.lang.AssertionError("Subroutines not supported.");
        }
        if (i != 191) {
            switch (i) {
                case 172:
                case org.objectweb.asm.Opcodes.LRETURN /* 173 */:
                case org.objectweb.asm.Opcodes.FRETURN /* 174 */:
                case org.objectweb.asm.Opcodes.DRETURN /* 175 */:
                case org.objectweb.asm.Opcodes.ARETURN /* 176 */:
                case org.objectweb.asm.Opcodes.RETURN /* 177 */:
                    this.successor = false;
                    break;
                default:
                    this.successor = true;
                    break;
            }
        } else {
            this.successor = false;
        }
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, java.lang.String str) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        this.successor = true;
        this.first = false;
        markMethodInvocationLine();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String str, java.lang.String str2, org.objectweb.asm.Handle handle, java.lang.Object... objArr) {
        this.successor = true;
        this.first = false;
        markMethodInvocationLine();
    }

    private void markMethodInvocationLine() {
        org.objectweb.asm.Label label = this.lineStart;
        if (label != null) {
            org.jacoco.core.internal.flow.LabelInfo.setMethodInvocationLine(label);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object obj) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String str, int i) {
        this.successor = true;
        this.first = false;
    }
}
