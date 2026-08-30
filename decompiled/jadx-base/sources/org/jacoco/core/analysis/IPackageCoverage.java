package org.jacoco.core.analysis;

/* JADX INFO: loaded from: classes6.dex */
public interface IPackageCoverage extends org.jacoco.core.analysis.ICoverageNode {
    java.util.Collection<org.jacoco.core.analysis.IClassCoverage> getClasses();

    java.util.Collection<org.jacoco.core.analysis.ISourceFileCoverage> getSourceFiles();
}
