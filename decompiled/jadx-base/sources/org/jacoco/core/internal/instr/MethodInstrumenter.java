package org.jacoco.core.internal.instr;

/* JADX INFO: loaded from: classes6.dex */
class MethodInstrumenter extends org.jacoco.core.internal.flow.MethodProbesVisitor {
    private final org.jacoco.core.internal.instr.IProbeInserter probeInserter;

    public MethodInstrumenter(org.objectweb.asm.MethodVisitor methodVisitor, org.jacoco.core.internal.instr.IProbeInserter iProbeInserter) {
        super(methodVisitor);
        this.probeInserter = iProbeInserter;
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitProbe(int i) {
        this.probeInserter.insertProbe(i);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitInsnWithProbe(int i, int i2) {
        this.probeInserter.insertProbe(i2);
        this.mv.visitInsn(i);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitJumpInsnWithProbe(int i, org.objectweb.asm.Label label, int i2, org.jacoco.core.internal.flow.IFrame iFrame) {
        if (i == 167) {
            this.probeInserter.insertProbe(i2);
            this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.GOTO, label);
            return;
        }
        org.objectweb.asm.Label label2 = new org.objectweb.asm.Label();
        this.mv.visitJumpInsn(getInverted(i), label2);
        this.probeInserter.insertProbe(i2);
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.GOTO, label);
        this.mv.visitLabel(label2);
        iFrame.accept(this.mv);
    }

    private int getInverted(int i) {
        if (i == 198) {
            return org.objectweb.asm.Opcodes.IFNONNULL;
        }
        if (i == 199) {
            return org.objectweb.asm.Opcodes.IFNULL;
        }
        switch (i) {
            case 153:
                return 154;
            case 154:
                return 153;
            case 155:
                return 156;
            case 156:
                return 155;
            case 157:
                return 158;
            case 158:
                return 157;
            case org.objectweb.asm.Opcodes.IF_ICMPEQ /* 159 */:
                return org.objectweb.asm.Opcodes.IF_ICMPNE;
            case org.objectweb.asm.Opcodes.IF_ICMPNE /* 160 */:
                return org.objectweb.asm.Opcodes.IF_ICMPEQ;
            case org.objectweb.asm.Opcodes.IF_ICMPLT /* 161 */:
                return org.objectweb.asm.Opcodes.IF_ICMPGE;
            case org.objectweb.asm.Opcodes.IF_ICMPGE /* 162 */:
                return org.objectweb.asm.Opcodes.IF_ICMPLT;
            case org.objectweb.asm.Opcodes.IF_ICMPGT /* 163 */:
                return org.objectweb.asm.Opcodes.IF_ICMPLE;
            case org.objectweb.asm.Opcodes.IF_ICMPLE /* 164 */:
                return org.objectweb.asm.Opcodes.IF_ICMPGT;
            case org.objectweb.asm.Opcodes.IF_ACMPEQ /* 165 */:
                return org.objectweb.asm.Opcodes.IF_ACMPNE;
            case org.objectweb.asm.Opcodes.IF_ACMPNE /* 166 */:
                return org.objectweb.asm.Opcodes.IF_ACMPEQ;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitTableSwitchInsnWithProbes(int i, int i2, org.objectweb.asm.Label label, org.objectweb.asm.Label[] labelArr, org.jacoco.core.internal.flow.IFrame iFrame) {
        org.jacoco.core.internal.flow.LabelInfo.resetDone(label);
        org.jacoco.core.internal.flow.LabelInfo.resetDone(labelArr);
        this.mv.visitTableSwitchInsn(i, i2, createIntermediate(label), createIntermediates(labelArr));
        insertIntermediateProbes(label, labelArr, iFrame);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitLookupSwitchInsnWithProbes(org.objectweb.asm.Label label, int[] iArr, org.objectweb.asm.Label[] labelArr, org.jacoco.core.internal.flow.IFrame iFrame) {
        org.jacoco.core.internal.flow.LabelInfo.resetDone(label);
        org.jacoco.core.internal.flow.LabelInfo.resetDone(labelArr);
        this.mv.visitLookupSwitchInsn(createIntermediate(label), iArr, createIntermediates(labelArr));
        insertIntermediateProbes(label, labelArr, iFrame);
    }

    private org.objectweb.asm.Label[] createIntermediates(org.objectweb.asm.Label[] labelArr) {
        org.objectweb.asm.Label[] labelArr2 = new org.objectweb.asm.Label[labelArr.length];
        for (int i = 0; i < labelArr.length; i++) {
            labelArr2[i] = createIntermediate(labelArr[i]);
        }
        return labelArr2;
    }

    private org.objectweb.asm.Label createIntermediate(org.objectweb.asm.Label label) {
        if (org.jacoco.core.internal.flow.LabelInfo.getProbeId(label) == -1) {
            return label;
        }
        if (org.jacoco.core.internal.flow.LabelInfo.isDone(label)) {
            return org.jacoco.core.internal.flow.LabelInfo.getIntermediateLabel(label);
        }
        org.objectweb.asm.Label label2 = new org.objectweb.asm.Label();
        org.jacoco.core.internal.flow.LabelInfo.setIntermediateLabel(label, label2);
        org.jacoco.core.internal.flow.LabelInfo.setDone(label);
        return label2;
    }

    private void insertIntermediateProbe(org.objectweb.asm.Label label, org.jacoco.core.internal.flow.IFrame iFrame) {
        int probeId = org.jacoco.core.internal.flow.LabelInfo.getProbeId(label);
        if (probeId == -1 || org.jacoco.core.internal.flow.LabelInfo.isDone(label)) {
            return;
        }
        this.mv.visitLabel(org.jacoco.core.internal.flow.LabelInfo.getIntermediateLabel(label));
        iFrame.accept(this.mv);
        this.probeInserter.insertProbe(probeId);
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.GOTO, label);
        org.jacoco.core.internal.flow.LabelInfo.setDone(label);
    }

    private void insertIntermediateProbes(org.objectweb.asm.Label label, org.objectweb.asm.Label[] labelArr, org.jacoco.core.internal.flow.IFrame iFrame) {
        org.jacoco.core.internal.flow.LabelInfo.resetDone(label);
        org.jacoco.core.internal.flow.LabelInfo.resetDone(labelArr);
        insertIntermediateProbe(label, iFrame);
        for (org.objectweb.asm.Label label2 : labelArr) {
            insertIntermediateProbe(label2, iFrame);
        }
    }
}
