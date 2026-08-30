package org.jacoco.core.internal.analysis;

/* JADX INFO: loaded from: classes6.dex */
class InstructionsBuilder {
    private final boolean[] probes;
    private int currentLine = -1;
    private org.jacoco.core.internal.analysis.Instruction currentInsn = null;
    private final java.util.Map<org.objectweb.asm.tree.AbstractInsnNode, org.jacoco.core.internal.analysis.Instruction> instructions = new java.util.HashMap();
    private final java.util.List<org.objectweb.asm.Label> currentLabel = new java.util.ArrayList(2);
    private final java.util.List<org.jacoco.core.internal.analysis.InstructionsBuilder.Jump> jumps = new java.util.ArrayList();

    InstructionsBuilder(boolean[] zArr) {
        this.probes = zArr;
    }

    void setCurrentLine(int i) {
        this.currentLine = i;
    }

    void addLabel(org.objectweb.asm.Label label) {
        this.currentLabel.add(label);
        if (org.jacoco.core.internal.flow.LabelInfo.isSuccessor(label)) {
            return;
        }
        noSuccessor();
    }

    void addInstruction(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
        org.jacoco.core.internal.analysis.Instruction instruction = new org.jacoco.core.internal.analysis.Instruction(this.currentLine);
        int size = this.currentLabel.size();
        if (size > 0) {
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    org.jacoco.core.internal.flow.LabelInfo.setInstruction(this.currentLabel.get(size), instruction);
                }
            }
            this.currentLabel.clear();
        }
        org.jacoco.core.internal.analysis.Instruction instruction2 = this.currentInsn;
        if (instruction2 != null) {
            instruction2.addBranch(instruction, 0);
        }
        this.currentInsn = instruction;
        this.instructions.put(abstractInsnNode, instruction);
    }

    void noSuccessor() {
        this.currentInsn = null;
    }

    void addJump(org.objectweb.asm.Label label, int i) {
        this.jumps.add(new org.jacoco.core.internal.analysis.InstructionsBuilder.Jump(this.currentInsn, label, i));
    }

    void addProbe(int i, int i2) {
        boolean[] zArr = this.probes;
        this.currentInsn.addBranch(zArr != null && zArr[i], i2);
    }

    java.util.Map<org.objectweb.asm.tree.AbstractInsnNode, org.jacoco.core.internal.analysis.Instruction> getInstructions() {
        java.util.Iterator<org.jacoco.core.internal.analysis.InstructionsBuilder.Jump> it = this.jumps.iterator();
        while (it.hasNext()) {
            it.next().wire();
        }
        return this.instructions;
    }

    private static class Jump {
        private final int branch;
        private final org.jacoco.core.internal.analysis.Instruction source;
        private final org.objectweb.asm.Label target;

        Jump(org.jacoco.core.internal.analysis.Instruction instruction, org.objectweb.asm.Label label, int i) {
            this.source = instruction;
            this.target = label;
            this.branch = i;
        }

        void wire() {
            this.source.addBranch(org.jacoco.core.internal.flow.LabelInfo.getInstruction(this.target), this.branch);
        }
    }
}
