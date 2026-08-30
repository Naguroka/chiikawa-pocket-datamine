package org.jacoco.core.internal.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class ClassCoverageImpl extends org.jacoco.core.internal.analysis.SourceNodeImpl implements org.jacoco.core.analysis.IClassCoverage {
    private final long id;
    private java.lang.String[] interfaces;
    private final java.util.Collection<org.jacoco.core.analysis.IMethodCoverage> methods;
    private final boolean noMatch;
    private java.lang.String signature;
    private java.lang.String sourceFileName;
    private java.lang.String superName;

    public ClassCoverageImpl(java.lang.String str, long j, boolean z) {
        super(org.jacoco.core.analysis.ICoverageNode.ElementType.CLASS, str);
        this.id = j;
        this.noMatch = z;
        this.methods = new java.util.ArrayList();
    }

    public void addMethod(org.jacoco.core.analysis.IMethodCoverage iMethodCoverage) {
        this.methods.add(iMethodCoverage);
        increment((org.jacoco.core.analysis.ISourceNode) iMethodCoverage);
        if (this.methodCounter.getCoveredCount() > 0) {
            this.classCounter = org.jacoco.core.internal.analysis.CounterImpl.COUNTER_0_1;
        } else {
            this.classCounter = org.jacoco.core.internal.analysis.CounterImpl.COUNTER_1_0;
        }
    }

    public void setSignature(java.lang.String str) {
        this.signature = str;
    }

    public void setSuperName(java.lang.String str) {
        this.superName = str;
    }

    public void setInterfaces(java.lang.String[] strArr) {
        this.interfaces = strArr;
    }

    public void setSourceFileName(java.lang.String str) {
        this.sourceFileName = str;
    }

    @Override // org.jacoco.core.analysis.IClassCoverage
    public long getId() {
        return this.id;
    }

    @Override // org.jacoco.core.analysis.IClassCoverage
    public boolean isNoMatch() {
        return this.noMatch;
    }

    @Override // org.jacoco.core.analysis.IClassCoverage
    public java.lang.String getSignature() {
        return this.signature;
    }

    @Override // org.jacoco.core.analysis.IClassCoverage
    public java.lang.String getSuperName() {
        return this.superName;
    }

    @Override // org.jacoco.core.analysis.IClassCoverage
    public java.lang.String[] getInterfaceNames() {
        return this.interfaces;
    }

    @Override // org.jacoco.core.analysis.IClassCoverage
    public java.lang.String getPackageName() {
        int iLastIndexOf = getName().lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : getName().substring(0, iLastIndexOf);
    }

    @Override // org.jacoco.core.analysis.IClassCoverage
    public java.lang.String getSourceFileName() {
        return this.sourceFileName;
    }

    @Override // org.jacoco.core.analysis.IClassCoverage
    public java.util.Collection<org.jacoco.core.analysis.IMethodCoverage> getMethods() {
        return this.methods;
    }
}
