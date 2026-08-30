package org.jacoco.core.internal.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class SourceNodeImpl extends org.jacoco.core.analysis.CoverageNodeImpl implements org.jacoco.core.analysis.ISourceNode {
    private org.jacoco.core.internal.analysis.LineImpl[] lines;
    private int offset;

    public SourceNodeImpl(org.jacoco.core.analysis.ICoverageNode.ElementType elementType, java.lang.String str) {
        super(elementType, str);
        this.lines = null;
        this.offset = -1;
    }

    public void ensureCapacity(int i, int i2) {
        if (i == -1 || i2 == -1) {
            return;
        }
        if (this.lines == null) {
            this.offset = i;
            this.lines = new org.jacoco.core.internal.analysis.LineImpl[(i2 - i) + 1];
            return;
        }
        int iMin = java.lang.Math.min(getFirstLine(), i);
        int iMax = (java.lang.Math.max(getLastLine(), i2) - iMin) + 1;
        org.jacoco.core.internal.analysis.LineImpl[] lineImplArr = this.lines;
        if (iMax > lineImplArr.length) {
            org.jacoco.core.internal.analysis.LineImpl[] lineImplArr2 = new org.jacoco.core.internal.analysis.LineImpl[iMax];
            java.lang.System.arraycopy(lineImplArr, 0, lineImplArr2, this.offset - iMin, lineImplArr.length);
            this.offset = iMin;
            this.lines = lineImplArr2;
        }
    }

    public void increment(org.jacoco.core.analysis.ISourceNode iSourceNode) {
        this.instructionCounter = this.instructionCounter.increment(iSourceNode.getInstructionCounter());
        this.branchCounter = this.branchCounter.increment(iSourceNode.getBranchCounter());
        this.complexityCounter = this.complexityCounter.increment(iSourceNode.getComplexityCounter());
        this.methodCounter = this.methodCounter.increment(iSourceNode.getMethodCounter());
        this.classCounter = this.classCounter.increment(iSourceNode.getClassCounter());
        int firstLine = iSourceNode.getFirstLine();
        if (firstLine != -1) {
            int lastLine = iSourceNode.getLastLine();
            ensureCapacity(firstLine, lastLine);
            while (firstLine <= lastLine) {
                org.jacoco.core.analysis.ILine line = iSourceNode.getLine(firstLine);
                incrementLine(line.getInstructionCounter(), line.getBranchCounter(), firstLine);
                firstLine++;
            }
        }
    }

    public void increment(org.jacoco.core.analysis.ICounter iCounter, org.jacoco.core.analysis.ICounter iCounter2, int i) {
        if (i != -1) {
            incrementLine(iCounter, iCounter2, i);
        }
        this.instructionCounter = this.instructionCounter.increment(iCounter);
        this.branchCounter = this.branchCounter.increment(iCounter2);
    }

    private void incrementLine(org.jacoco.core.analysis.ICounter iCounter, org.jacoco.core.analysis.ICounter iCounter2, int i) {
        ensureCapacity(i, i);
        org.jacoco.core.internal.analysis.LineImpl line = getLine(i);
        int totalCount = line.getInstructionCounter().getTotalCount();
        int coveredCount = line.getInstructionCounter().getCoveredCount();
        this.lines[i - this.offset] = line.increment(iCounter, iCounter2);
        if (iCounter.getTotalCount() > 0) {
            if (iCounter.getCoveredCount() == 0) {
                if (totalCount == 0) {
                    this.lineCounter = this.lineCounter.increment(org.jacoco.core.internal.analysis.CounterImpl.COUNTER_1_0);
                }
            } else if (totalCount == 0) {
                this.lineCounter = this.lineCounter.increment(org.jacoco.core.internal.analysis.CounterImpl.COUNTER_0_1);
            } else if (coveredCount == 0) {
                this.lineCounter = this.lineCounter.increment(-1, 1);
            }
        }
    }

    @Override // org.jacoco.core.analysis.ISourceNode
    public int getFirstLine() {
        return this.offset;
    }

    @Override // org.jacoco.core.analysis.ISourceNode
    public int getLastLine() {
        org.jacoco.core.internal.analysis.LineImpl[] lineImplArr = this.lines;
        if (lineImplArr == null) {
            return -1;
        }
        return (this.offset + lineImplArr.length) - 1;
    }

    @Override // org.jacoco.core.analysis.ISourceNode
    public org.jacoco.core.internal.analysis.LineImpl getLine(int i) {
        if (this.lines == null || i < getFirstLine() || i > getLastLine()) {
            return org.jacoco.core.internal.analysis.LineImpl.EMPTY;
        }
        org.jacoco.core.internal.analysis.LineImpl lineImpl = this.lines[i - this.offset];
        return lineImpl == null ? org.jacoco.core.internal.analysis.LineImpl.EMPTY : lineImpl;
    }
}
