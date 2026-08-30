package org.jacoco.core.internal.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class MethodAnalyzer extends org.jacoco.core.internal.flow.MethodProbesVisitor {
    private final org.jacoco.core.internal.analysis.InstructionsBuilder builder;
    private org.objectweb.asm.tree.AbstractInsnNode currentNode;

    MethodAnalyzer(org.jacoco.core.internal.analysis.InstructionsBuilder instructionsBuilder) {
        this.builder = instructionsBuilder;
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void accept(org.objectweb.asm.tree.MethodNode methodNode, org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitCode();
        java.util.Iterator<org.objectweb.asm.tree.TryCatchBlockNode> it = methodNode.tryCatchBlocks.iterator();
        while (it.hasNext()) {
            it.next().accept(methodVisitor);
        }
        for (org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode : methodNode.instructions) {
            this.currentNode = abstractInsnNode;
            abstractInsnNode.accept(methodVisitor);
        }
        methodVisitor.visitEnd();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(org.objectweb.asm.Label label) {
        this.builder.addLabel(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int i, org.objectweb.asm.Label label) {
        this.builder.setCurrentLine(i);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, java.lang.String str) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String str, java.lang.String str2, org.objectweb.asm.Handle handle, java.lang.Object... objArr) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, org.objectweb.asm.Label label) {
        this.builder.addInstruction(this.currentNode);
        this.builder.addJump(label, 1);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object obj) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        this.builder.addInstruction(this.currentNode);
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
        this.builder.addInstruction(this.currentNode);
        org.jacoco.core.internal.flow.LabelInfo.resetDone(labelArr);
        this.builder.addJump(label, 0);
        org.jacoco.core.internal.flow.LabelInfo.setDone(label);
        int i = 0;
        for (org.objectweb.asm.Label label2 : labelArr) {
            if (!org.jacoco.core.internal.flow.LabelInfo.isDone(label2)) {
                i++;
                this.builder.addJump(label2, i);
                org.jacoco.core.internal.flow.LabelInfo.setDone(label2);
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String str, int i) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitProbe(int i) {
        this.builder.addProbe(i, 0);
        this.builder.noSuccessor();
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitJumpInsnWithProbe(int i, org.objectweb.asm.Label label, int i2, org.jacoco.core.internal.flow.IFrame iFrame) {
        this.builder.addInstruction(this.currentNode);
        this.builder.addProbe(i2, 1);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitInsnWithProbe(int i, int i2) {
        this.builder.addInstruction(this.currentNode);
        this.builder.addProbe(i2, 0);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitTableSwitchInsnWithProbes(int i, int i2, org.objectweb.asm.Label label, org.objectweb.asm.Label[] labelArr, org.jacoco.core.internal.flow.IFrame iFrame) {
        visitSwitchInsnWithProbes(label, labelArr);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitLookupSwitchInsnWithProbes(org.objectweb.asm.Label label, int[] iArr, org.objectweb.asm.Label[] labelArr, org.jacoco.core.internal.flow.IFrame iFrame) {
        visitSwitchInsnWithProbes(label, labelArr);
    }

    private void visitSwitchInsnWithProbes(org.objectweb.asm.Label label, org.objectweb.asm.Label[] labelArr) {
        this.builder.addInstruction(this.currentNode);
        org.jacoco.core.internal.flow.LabelInfo.resetDone(label);
        org.jacoco.core.internal.flow.LabelInfo.resetDone(labelArr);
        visitSwitchTarget(label, 0);
        int i = 0;
        for (org.objectweb.asm.Label label2 : labelArr) {
            i++;
            visitSwitchTarget(label2, i);
        }
    }

    private void visitSwitchTarget(org.objectweb.asm.Label label, int i) {
        int probeId = org.jacoco.core.internal.flow.LabelInfo.getProbeId(label);
        if (org.jacoco.core.internal.flow.LabelInfo.isDone(label)) {
            return;
        }
        if (probeId == -1) {
            this.builder.addJump(label, i);
        } else {
            this.builder.addProbe(probeId, i);
        }
        org.jacoco.core.internal.flow.LabelInfo.setDone(label);
    }
}
