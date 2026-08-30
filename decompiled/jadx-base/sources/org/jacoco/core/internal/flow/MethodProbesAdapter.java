package org.jacoco.core.internal.flow;

/* JADX INFO: loaded from: classes6.dex */
public final class MethodProbesAdapter extends org.objectweb.asm.MethodVisitor {
    private org.objectweb.asm.commons.AnalyzerAdapter analyzer;
    private final org.jacoco.core.internal.flow.IProbeIdGenerator idGenerator;
    private final org.jacoco.core.internal.flow.MethodProbesVisitor probesVisitor;
    private final java.util.Map<org.objectweb.asm.Label, org.objectweb.asm.Label> tryCatchProbeLabels;

    private int jumpPopCount(int i) {
        if (i == 167) {
            return 0;
        }
        if (i == 198 || i == 199) {
            return 1;
        }
        switch (i) {
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
                return 1;
            default:
                return 2;
        }
    }

    public MethodProbesAdapter(org.jacoco.core.internal.flow.MethodProbesVisitor methodProbesVisitor, org.jacoco.core.internal.flow.IProbeIdGenerator iProbeIdGenerator) {
        super(589824, methodProbesVisitor);
        this.probesVisitor = methodProbesVisitor;
        this.idGenerator = iProbeIdGenerator;
        this.tryCatchProbeLabels = new java.util.HashMap();
    }

    public void setAnalyzer(org.objectweb.asm.commons.AnalyzerAdapter analyzerAdapter) {
        this.analyzer = analyzerAdapter;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(org.objectweb.asm.Label label, org.objectweb.asm.Label label2, org.objectweb.asm.Label label3, java.lang.String str) {
        this.probesVisitor.visitTryCatchBlock(getTryCatchLabel(label), getTryCatchLabel(label2), label3, str);
    }

    private org.objectweb.asm.Label getTryCatchLabel(org.objectweb.asm.Label label) {
        if (this.tryCatchProbeLabels.containsKey(label)) {
            return this.tryCatchProbeLabels.get(label);
        }
        if (!org.jacoco.core.internal.flow.LabelInfo.needsProbe(label)) {
            return label;
        }
        org.objectweb.asm.Label label2 = new org.objectweb.asm.Label();
        org.jacoco.core.internal.flow.LabelInfo.setSuccessor(label2);
        this.tryCatchProbeLabels.put(label, label2);
        return label2;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(org.objectweb.asm.Label label) {
        if (org.jacoco.core.internal.flow.LabelInfo.needsProbe(label)) {
            if (this.tryCatchProbeLabels.containsKey(label)) {
                this.probesVisitor.visitLabel(this.tryCatchProbeLabels.get(label));
            }
            this.probesVisitor.visitProbe(this.idGenerator.nextId());
        }
        this.probesVisitor.visitLabel(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        if (i != 191) {
            switch (i) {
                case 172:
                case org.objectweb.asm.Opcodes.LRETURN /* 173 */:
                case org.objectweb.asm.Opcodes.FRETURN /* 174 */:
                case org.objectweb.asm.Opcodes.DRETURN /* 175 */:
                case org.objectweb.asm.Opcodes.ARETURN /* 176 */:
                case org.objectweb.asm.Opcodes.RETURN /* 177 */:
                    break;
                default:
                    this.probesVisitor.visitInsn(i);
                    break;
            }
        }
        this.probesVisitor.visitInsnWithProbe(i, this.idGenerator.nextId());
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, org.objectweb.asm.Label label) {
        if (org.jacoco.core.internal.flow.LabelInfo.isMultiTarget(label)) {
            this.probesVisitor.visitJumpInsnWithProbe(i, label, this.idGenerator.nextId(), frame(jumpPopCount(i)));
        } else {
            this.probesVisitor.visitJumpInsn(i, label);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(org.objectweb.asm.Label label, int[] iArr, org.objectweb.asm.Label[] labelArr) {
        if (markLabels(label, labelArr)) {
            this.probesVisitor.visitLookupSwitchInsnWithProbes(label, iArr, labelArr, frame(1));
        } else {
            this.probesVisitor.visitLookupSwitchInsn(label, iArr, labelArr);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, org.objectweb.asm.Label label, org.objectweb.asm.Label... labelArr) {
        if (markLabels(label, labelArr)) {
            this.probesVisitor.visitTableSwitchInsnWithProbes(i, i2, label, labelArr, frame(1));
        } else {
            this.probesVisitor.visitTableSwitchInsn(i, i2, label, labelArr);
        }
    }

    private boolean markLabels(org.objectweb.asm.Label label, org.objectweb.asm.Label[] labelArr) {
        boolean z;
        org.jacoco.core.internal.flow.LabelInfo.resetDone(labelArr);
        if (org.jacoco.core.internal.flow.LabelInfo.isMultiTarget(label)) {
            org.jacoco.core.internal.flow.LabelInfo.setProbeId(label, this.idGenerator.nextId());
            z = true;
        } else {
            z = false;
        }
        org.jacoco.core.internal.flow.LabelInfo.setDone(label);
        for (org.objectweb.asm.Label label2 : labelArr) {
            if (org.jacoco.core.internal.flow.LabelInfo.isMultiTarget(label2) && !org.jacoco.core.internal.flow.LabelInfo.isDone(label2)) {
                org.jacoco.core.internal.flow.LabelInfo.setProbeId(label2, this.idGenerator.nextId());
                z = true;
            }
            org.jacoco.core.internal.flow.LabelInfo.setDone(label2);
        }
        return z;
    }

    private org.jacoco.core.internal.flow.IFrame frame(int i) {
        return org.jacoco.core.internal.flow.FrameSnapshot.create(this.analyzer, i);
    }
}
