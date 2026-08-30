package org.jacoco.core.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class CoverageNodeImpl implements org.jacoco.core.analysis.ICoverageNode {
    private final org.jacoco.core.analysis.ICoverageNode.ElementType elementType;
    private final java.lang.String name;
    protected org.jacoco.core.internal.analysis.CounterImpl branchCounter = org.jacoco.core.internal.analysis.CounterImpl.COUNTER_0_0;
    protected org.jacoco.core.internal.analysis.CounterImpl instructionCounter = org.jacoco.core.internal.analysis.CounterImpl.COUNTER_0_0;
    protected org.jacoco.core.internal.analysis.CounterImpl complexityCounter = org.jacoco.core.internal.analysis.CounterImpl.COUNTER_0_0;
    protected org.jacoco.core.internal.analysis.CounterImpl methodCounter = org.jacoco.core.internal.analysis.CounterImpl.COUNTER_0_0;
    protected org.jacoco.core.internal.analysis.CounterImpl classCounter = org.jacoco.core.internal.analysis.CounterImpl.COUNTER_0_0;
    protected org.jacoco.core.internal.analysis.CounterImpl lineCounter = org.jacoco.core.internal.analysis.CounterImpl.COUNTER_0_0;

    public CoverageNodeImpl(org.jacoco.core.analysis.ICoverageNode.ElementType elementType, java.lang.String str) {
        this.elementType = elementType;
        this.name = str;
    }

    public void increment(org.jacoco.core.analysis.ICoverageNode iCoverageNode) {
        this.instructionCounter = this.instructionCounter.increment(iCoverageNode.getInstructionCounter());
        this.branchCounter = this.branchCounter.increment(iCoverageNode.getBranchCounter());
        this.lineCounter = this.lineCounter.increment(iCoverageNode.getLineCounter());
        this.complexityCounter = this.complexityCounter.increment(iCoverageNode.getComplexityCounter());
        this.methodCounter = this.methodCounter.increment(iCoverageNode.getMethodCounter());
        this.classCounter = this.classCounter.increment(iCoverageNode.getClassCounter());
    }

    public void increment(java.util.Collection<? extends org.jacoco.core.analysis.ICoverageNode> collection) {
        java.util.Iterator<? extends org.jacoco.core.analysis.ICoverageNode> it = collection.iterator();
        while (it.hasNext()) {
            increment(it.next());
        }
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public org.jacoco.core.analysis.ICoverageNode.ElementType getElementType() {
        return this.elementType;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public java.lang.String getName() {
        return this.name;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public org.jacoco.core.analysis.ICounter getInstructionCounter() {
        return this.instructionCounter;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public org.jacoco.core.analysis.ICounter getBranchCounter() {
        return this.branchCounter;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public org.jacoco.core.analysis.ICounter getLineCounter() {
        return this.lineCounter;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public org.jacoco.core.analysis.ICounter getComplexityCounter() {
        return this.complexityCounter;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public org.jacoco.core.analysis.ICounter getMethodCounter() {
        return this.methodCounter;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public org.jacoco.core.analysis.ICounter getClassCounter() {
        return this.classCounter;
    }

    /* JADX INFO: renamed from: org.jacoco.core.analysis.CoverageNodeImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jacoco$core$analysis$ICoverageNode$CounterEntity;

        static {
            int[] iArr = new int[org.jacoco.core.analysis.ICoverageNode.CounterEntity.values().length];
            $SwitchMap$org$jacoco$core$analysis$ICoverageNode$CounterEntity = iArr;
            try {
                iArr[org.jacoco.core.analysis.ICoverageNode.CounterEntity.INSTRUCTION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICoverageNode$CounterEntity[org.jacoco.core.analysis.ICoverageNode.CounterEntity.BRANCH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICoverageNode$CounterEntity[org.jacoco.core.analysis.ICoverageNode.CounterEntity.LINE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICoverageNode$CounterEntity[org.jacoco.core.analysis.ICoverageNode.CounterEntity.COMPLEXITY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICoverageNode$CounterEntity[org.jacoco.core.analysis.ICoverageNode.CounterEntity.METHOD.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICoverageNode$CounterEntity[org.jacoco.core.analysis.ICoverageNode.CounterEntity.CLASS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public org.jacoco.core.analysis.ICounter getCounter(org.jacoco.core.analysis.ICoverageNode.CounterEntity counterEntity) {
        switch (org.jacoco.core.analysis.CoverageNodeImpl.AnonymousClass1.$SwitchMap$org$jacoco$core$analysis$ICoverageNode$CounterEntity[counterEntity.ordinal()]) {
            case 1:
                return getInstructionCounter();
            case 2:
                return getBranchCounter();
            case 3:
                return getLineCounter();
            case 4:
                return getComplexityCounter();
            case 5:
                return getMethodCounter();
            case 6:
                return getClassCounter();
            default:
                throw new java.lang.AssertionError(counterEntity);
        }
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public boolean containsCode() {
        return getInstructionCounter().getTotalCount() != 0;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public org.jacoco.core.analysis.ICoverageNode getPlainCopy() {
        org.jacoco.core.analysis.CoverageNodeImpl coverageNodeImpl = new org.jacoco.core.analysis.CoverageNodeImpl(this.elementType, this.name);
        coverageNodeImpl.instructionCounter = org.jacoco.core.internal.analysis.CounterImpl.getInstance(this.instructionCounter);
        coverageNodeImpl.branchCounter = org.jacoco.core.internal.analysis.CounterImpl.getInstance(this.branchCounter);
        coverageNodeImpl.lineCounter = org.jacoco.core.internal.analysis.CounterImpl.getInstance(this.lineCounter);
        coverageNodeImpl.complexityCounter = org.jacoco.core.internal.analysis.CounterImpl.getInstance(this.complexityCounter);
        coverageNodeImpl.methodCounter = org.jacoco.core.internal.analysis.CounterImpl.getInstance(this.methodCounter);
        coverageNodeImpl.classCounter = org.jacoco.core.internal.analysis.CounterImpl.getInstance(this.classCounter);
        return coverageNodeImpl;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.name).append(" [").append(this.elementType).append(com.ironsource.y8.i.e);
        return sb.toString();
    }
}
