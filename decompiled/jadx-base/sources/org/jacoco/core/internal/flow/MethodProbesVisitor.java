package org.jacoco.core.internal.flow;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MethodProbesVisitor extends org.objectweb.asm.MethodVisitor {
    public void visitInsnWithProbe(int i, int i2) {
    }

    public void visitJumpInsnWithProbe(int i, org.objectweb.asm.Label label, int i2, org.jacoco.core.internal.flow.IFrame iFrame) {
    }

    public void visitLookupSwitchInsnWithProbes(org.objectweb.asm.Label label, int[] iArr, org.objectweb.asm.Label[] labelArr, org.jacoco.core.internal.flow.IFrame iFrame) {
    }

    public void visitProbe(int i) {
    }

    public void visitTableSwitchInsnWithProbes(int i, int i2, org.objectweb.asm.Label label, org.objectweb.asm.Label[] labelArr, org.jacoco.core.internal.flow.IFrame iFrame) {
    }

    public MethodProbesVisitor() {
        this(null);
    }

    public MethodProbesVisitor(org.objectweb.asm.MethodVisitor methodVisitor) {
        super(589824, methodVisitor);
    }

    public void accept(org.objectweb.asm.tree.MethodNode methodNode, org.objectweb.asm.MethodVisitor methodVisitor) {
        methodNode.accept(methodVisitor);
    }
}
