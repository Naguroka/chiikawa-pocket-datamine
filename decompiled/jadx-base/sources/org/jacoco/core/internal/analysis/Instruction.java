package org.jacoco.core.internal.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class Instruction {
    private int branches = 0;
    private final java.util.BitSet coveredBranches = new java.util.BitSet();
    private final int line;
    private org.jacoco.core.internal.analysis.Instruction predecessor;
    private int predecessorBranch;

    public Instruction(int i) {
        this.line = i;
    }

    public void addBranch(org.jacoco.core.internal.analysis.Instruction instruction, int i) {
        this.branches++;
        instruction.predecessor = this;
        instruction.predecessorBranch = i;
        if (instruction.coveredBranches.isEmpty()) {
            return;
        }
        propagateExecutedBranch(this, i);
    }

    public void addBranch(boolean z, int i) {
        this.branches++;
        if (z) {
            propagateExecutedBranch(this, i);
        }
    }

    private static void propagateExecutedBranch(org.jacoco.core.internal.analysis.Instruction instruction, int i) {
        while (instruction != null) {
            if (!instruction.coveredBranches.isEmpty()) {
                instruction.coveredBranches.set(i);
                return;
            } else {
                instruction.coveredBranches.set(i);
                i = instruction.predecessorBranch;
                instruction = instruction.predecessor;
            }
        }
    }

    public int getLine() {
        return this.line;
    }

    public org.jacoco.core.internal.analysis.Instruction merge(org.jacoco.core.internal.analysis.Instruction instruction) {
        org.jacoco.core.internal.analysis.Instruction instruction2 = new org.jacoco.core.internal.analysis.Instruction(this.line);
        instruction2.branches = this.branches;
        instruction2.coveredBranches.or(this.coveredBranches);
        instruction2.coveredBranches.or(instruction.coveredBranches);
        return instruction2;
    }

    public org.jacoco.core.internal.analysis.Instruction replaceBranches(java.util.Collection<org.jacoco.core.internal.analysis.Instruction> collection) {
        org.jacoco.core.internal.analysis.Instruction instruction = new org.jacoco.core.internal.analysis.Instruction(this.line);
        instruction.branches = collection.size();
        java.util.Iterator<org.jacoco.core.internal.analysis.Instruction> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!it.next().coveredBranches.isEmpty()) {
                instruction.coveredBranches.set(i);
                i++;
            }
        }
        return instruction;
    }

    public org.jacoco.core.analysis.ICounter getInstructionCounter() {
        return this.coveredBranches.isEmpty() ? org.jacoco.core.internal.analysis.CounterImpl.COUNTER_1_0 : org.jacoco.core.internal.analysis.CounterImpl.COUNTER_0_1;
    }

    public org.jacoco.core.analysis.ICounter getBranchCounter() {
        if (this.branches < 2) {
            return org.jacoco.core.internal.analysis.CounterImpl.COUNTER_0_0;
        }
        int iCardinality = this.coveredBranches.cardinality();
        return org.jacoco.core.internal.analysis.CounterImpl.getInstance(this.branches - iCardinality, iCardinality);
    }
}
