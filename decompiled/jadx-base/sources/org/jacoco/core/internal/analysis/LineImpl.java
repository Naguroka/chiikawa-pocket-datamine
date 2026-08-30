package org.jacoco.core.internal.analysis;

/* JADX INFO: loaded from: classes6.dex */
public abstract class LineImpl implements org.jacoco.core.analysis.ILine {
    public static final org.jacoco.core.internal.analysis.LineImpl EMPTY;
    private static final org.jacoco.core.internal.analysis.LineImpl[][][][] SINGLETONS = new org.jacoco.core.internal.analysis.LineImpl[9][][][];
    private static final int SINGLETON_BRA_LIMIT = 4;
    private static final int SINGLETON_INS_LIMIT = 8;
    protected org.jacoco.core.internal.analysis.CounterImpl branches;
    protected org.jacoco.core.internal.analysis.CounterImpl instructions;

    public abstract org.jacoco.core.internal.analysis.LineImpl increment(org.jacoco.core.analysis.ICounter iCounter, org.jacoco.core.analysis.ICounter iCounter2);

    static {
        for (int i = 0; i <= 8; i++) {
            SINGLETONS[i] = new org.jacoco.core.internal.analysis.LineImpl[9][][];
            for (int i2 = 0; i2 <= 8; i2++) {
                SINGLETONS[i][i2] = new org.jacoco.core.internal.analysis.LineImpl[5][];
                for (int i3 = 0; i3 <= 4; i3++) {
                    SINGLETONS[i][i2][i3] = new org.jacoco.core.internal.analysis.LineImpl[5];
                    for (int i4 = 0; i4 <= 4; i4++) {
                        SINGLETONS[i][i2][i3][i4] = new org.jacoco.core.internal.analysis.LineImpl.Fix(i, i2, i3, i4);
                    }
                }
            }
        }
        EMPTY = SINGLETONS[0][0][0][0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.jacoco.core.internal.analysis.LineImpl getInstance(org.jacoco.core.internal.analysis.CounterImpl counterImpl, org.jacoco.core.internal.analysis.CounterImpl counterImpl2) {
        int missedCount = counterImpl.getMissedCount();
        int coveredCount = counterImpl.getCoveredCount();
        int missedCount2 = counterImpl2.getMissedCount();
        int coveredCount2 = counterImpl2.getCoveredCount();
        if (missedCount <= 8 && coveredCount <= 8 && missedCount2 <= 4 && coveredCount2 <= 4) {
            return SINGLETONS[missedCount][coveredCount][missedCount2][coveredCount2];
        }
        return new org.jacoco.core.internal.analysis.LineImpl.Var(counterImpl, counterImpl2);
    }

    private static final class Var extends org.jacoco.core.internal.analysis.LineImpl {
        Var(org.jacoco.core.internal.analysis.CounterImpl counterImpl, org.jacoco.core.internal.analysis.CounterImpl counterImpl2) {
            super(counterImpl, counterImpl2);
        }

        @Override // org.jacoco.core.internal.analysis.LineImpl
        public org.jacoco.core.internal.analysis.LineImpl increment(org.jacoco.core.analysis.ICounter iCounter, org.jacoco.core.analysis.ICounter iCounter2) {
            this.instructions = this.instructions.increment(iCounter);
            this.branches = this.branches.increment(iCounter2);
            return this;
        }
    }

    private static final class Fix extends org.jacoco.core.internal.analysis.LineImpl {
        public Fix(int i, int i2, int i3, int i4) {
            super(org.jacoco.core.internal.analysis.CounterImpl.getInstance(i, i2), org.jacoco.core.internal.analysis.CounterImpl.getInstance(i3, i4));
        }

        @Override // org.jacoco.core.internal.analysis.LineImpl
        public org.jacoco.core.internal.analysis.LineImpl increment(org.jacoco.core.analysis.ICounter iCounter, org.jacoco.core.analysis.ICounter iCounter2) {
            return org.jacoco.core.internal.analysis.LineImpl.getInstance(this.instructions.increment(iCounter), this.branches.increment(iCounter2));
        }
    }

    private LineImpl(org.jacoco.core.internal.analysis.CounterImpl counterImpl, org.jacoco.core.internal.analysis.CounterImpl counterImpl2) {
        this.instructions = counterImpl;
        this.branches = counterImpl2;
    }

    @Override // org.jacoco.core.analysis.ILine
    public int getStatus() {
        return this.instructions.getStatus() | this.branches.getStatus();
    }

    @Override // org.jacoco.core.analysis.ILine
    public org.jacoco.core.analysis.ICounter getInstructionCounter() {
        return this.instructions;
    }

    @Override // org.jacoco.core.analysis.ILine
    public org.jacoco.core.analysis.ICounter getBranchCounter() {
        return this.branches;
    }

    public int hashCode() {
        return (this.instructions.hashCode() * 23) ^ this.branches.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.jacoco.core.analysis.ILine)) {
            return false;
        }
        org.jacoco.core.analysis.ILine iLine = (org.jacoco.core.analysis.ILine) obj;
        return this.instructions.equals(iLine.getInstructionCounter()) && this.branches.equals(iLine.getBranchCounter());
    }
}
