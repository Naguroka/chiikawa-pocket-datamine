package org.jacoco.core.analysis;

/* JADX INFO: loaded from: classes6.dex */
public interface ICoverageNode {

    public enum CounterEntity {
        INSTRUCTION,
        BRANCH,
        LINE,
        COMPLEXITY,
        METHOD,
        CLASS
    }

    public enum ElementType {
        METHOD,
        CLASS,
        SOURCEFILE,
        PACKAGE,
        BUNDLE,
        GROUP
    }

    boolean containsCode();

    org.jacoco.core.analysis.ICounter getBranchCounter();

    org.jacoco.core.analysis.ICounter getClassCounter();

    org.jacoco.core.analysis.ICounter getComplexityCounter();

    org.jacoco.core.analysis.ICounter getCounter(org.jacoco.core.analysis.ICoverageNode.CounterEntity counterEntity);

    org.jacoco.core.analysis.ICoverageNode.ElementType getElementType();

    org.jacoco.core.analysis.ICounter getInstructionCounter();

    org.jacoco.core.analysis.ICounter getLineCounter();

    org.jacoco.core.analysis.ICounter getMethodCounter();

    java.lang.String getName();

    org.jacoco.core.analysis.ICoverageNode getPlainCopy();
}
