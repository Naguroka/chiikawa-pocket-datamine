package org.jacoco.core.internal.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class MethodCoverageImpl extends org.jacoco.core.internal.analysis.SourceNodeImpl implements org.jacoco.core.analysis.IMethodCoverage {
    private final java.lang.String desc;
    private final java.lang.String signature;

    public MethodCoverageImpl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(org.jacoco.core.analysis.ICoverageNode.ElementType.METHOD, str);
        this.desc = str2;
        this.signature = str3;
    }

    @Override // org.jacoco.core.internal.analysis.SourceNodeImpl
    public void increment(org.jacoco.core.analysis.ICounter iCounter, org.jacoco.core.analysis.ICounter iCounter2, int i) {
        super.increment(iCounter, iCounter2, i);
        if (iCounter2.getTotalCount() > 1) {
            int iMax = java.lang.Math.max(0, iCounter2.getCoveredCount() - 1);
            this.complexityCounter = this.complexityCounter.increment(java.lang.Math.max(0, (iCounter2.getTotalCount() - iMax) - 1), iMax);
        }
    }

    public void incrementMethodCounter() {
        org.jacoco.core.internal.analysis.CounterImpl counterImpl = this.instructionCounter.getCoveredCount() == 0 ? org.jacoco.core.internal.analysis.CounterImpl.COUNTER_1_0 : org.jacoco.core.internal.analysis.CounterImpl.COUNTER_0_1;
        this.methodCounter = this.methodCounter.increment(counterImpl);
        this.complexityCounter = this.complexityCounter.increment(counterImpl);
    }

    @Override // org.jacoco.core.analysis.IMethodCoverage
    public java.lang.String getDesc() {
        return this.desc;
    }

    @Override // org.jacoco.core.analysis.IMethodCoverage
    public java.lang.String getSignature() {
        return this.signature;
    }
}
