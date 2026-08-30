package org.jacoco.core.internal.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class PackageCoverageImpl extends org.jacoco.core.analysis.CoverageNodeImpl implements org.jacoco.core.analysis.IPackageCoverage {
    private final java.util.Collection<org.jacoco.core.analysis.IClassCoverage> classes;
    private final java.util.Collection<org.jacoco.core.analysis.ISourceFileCoverage> sourceFiles;

    public PackageCoverageImpl(java.lang.String str, java.util.Collection<org.jacoco.core.analysis.IClassCoverage> collection, java.util.Collection<org.jacoco.core.analysis.ISourceFileCoverage> collection2) {
        super(org.jacoco.core.analysis.ICoverageNode.ElementType.PACKAGE, str);
        this.classes = collection;
        this.sourceFiles = collection2;
        increment(collection2);
        for (org.jacoco.core.analysis.IClassCoverage iClassCoverage : collection) {
            if (iClassCoverage.getSourceFileName() == null) {
                increment(iClassCoverage);
            }
        }
    }

    @Override // org.jacoco.core.analysis.IPackageCoverage
    public java.util.Collection<org.jacoco.core.analysis.IClassCoverage> getClasses() {
        return this.classes;
    }

    @Override // org.jacoco.core.analysis.IPackageCoverage
    public java.util.Collection<org.jacoco.core.analysis.ISourceFileCoverage> getSourceFiles() {
        return this.sourceFiles;
    }
}
