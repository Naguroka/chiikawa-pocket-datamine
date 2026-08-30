package org.jacoco.core.internal.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class SourceFileCoverageImpl extends org.jacoco.core.internal.analysis.SourceNodeImpl implements org.jacoco.core.analysis.ISourceFileCoverage {
    private final java.lang.String packagename;

    public SourceFileCoverageImpl(java.lang.String str, java.lang.String str2) {
        super(org.jacoco.core.analysis.ICoverageNode.ElementType.SOURCEFILE, str);
        this.packagename = str2;
    }

    @Override // org.jacoco.core.analysis.ISourceFileCoverage
    public java.lang.String getPackageName() {
        return this.packagename;
    }
}
