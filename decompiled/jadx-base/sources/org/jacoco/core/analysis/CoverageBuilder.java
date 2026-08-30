package org.jacoco.core.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class CoverageBuilder implements org.jacoco.core.analysis.ICoverageVisitor {
    private final java.util.Map<java.lang.String, org.jacoco.core.analysis.IClassCoverage> classes = new java.util.HashMap();
    private final java.util.Map<java.lang.String, org.jacoco.core.analysis.ISourceFileCoverage> sourcefiles = new java.util.HashMap();

    public java.util.Collection<org.jacoco.core.analysis.IClassCoverage> getClasses() {
        return java.util.Collections.unmodifiableCollection(this.classes.values());
    }

    public java.util.Collection<org.jacoco.core.analysis.ISourceFileCoverage> getSourceFiles() {
        return java.util.Collections.unmodifiableCollection(this.sourcefiles.values());
    }

    public org.jacoco.core.analysis.IBundleCoverage getBundle(java.lang.String str) {
        return new org.jacoco.core.internal.analysis.BundleCoverageImpl(str, this.classes.values(), this.sourcefiles.values());
    }

    public java.util.Collection<org.jacoco.core.analysis.IClassCoverage> getNoMatchClasses() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (org.jacoco.core.analysis.IClassCoverage iClassCoverage : this.classes.values()) {
            if (iClassCoverage.isNoMatch()) {
                arrayList.add(iClassCoverage);
            }
        }
        return arrayList;
    }

    @Override // org.jacoco.core.analysis.ICoverageVisitor
    public void visitCoverage(org.jacoco.core.analysis.IClassCoverage iClassCoverage) {
        java.lang.String name = iClassCoverage.getName();
        org.jacoco.core.analysis.IClassCoverage iClassCoveragePut = this.classes.put(name, iClassCoverage);
        if (iClassCoveragePut != null) {
            if (iClassCoveragePut.getId() != iClassCoverage.getId()) {
                throw new java.lang.IllegalStateException("Can't add different class with same name: " + name);
            }
        } else {
            java.lang.String sourceFileName = iClassCoverage.getSourceFileName();
            if (sourceFileName != null) {
                getSourceFile(sourceFileName, iClassCoverage.getPackageName()).increment((org.jacoco.core.analysis.ISourceNode) iClassCoverage);
            }
        }
    }

    private org.jacoco.core.internal.analysis.SourceFileCoverageImpl getSourceFile(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = str2 + '/' + str;
        org.jacoco.core.internal.analysis.SourceFileCoverageImpl sourceFileCoverageImpl = (org.jacoco.core.internal.analysis.SourceFileCoverageImpl) this.sourcefiles.get(str3);
        if (sourceFileCoverageImpl != null) {
            return sourceFileCoverageImpl;
        }
        org.jacoco.core.internal.analysis.SourceFileCoverageImpl sourceFileCoverageImpl2 = new org.jacoco.core.internal.analysis.SourceFileCoverageImpl(str, str2);
        this.sourcefiles.put(str3, sourceFileCoverageImpl2);
        return sourceFileCoverageImpl2;
    }
}
