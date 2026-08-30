package org.jacoco.core.analysis;

/* JADX INFO: loaded from: classes6.dex */
public interface IClassCoverage extends org.jacoco.core.analysis.ISourceNode {
    long getId();

    java.lang.String[] getInterfaceNames();

    java.util.Collection<org.jacoco.core.analysis.IMethodCoverage> getMethods();

    java.lang.String getPackageName();

    java.lang.String getSignature();

    java.lang.String getSourceFileName();

    java.lang.String getSuperName();

    boolean isNoMatch();
}
