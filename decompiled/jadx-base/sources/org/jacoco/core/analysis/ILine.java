package org.jacoco.core.analysis;

/* JADX INFO: loaded from: classes6.dex */
public interface ILine {
    org.jacoco.core.analysis.ICounter getBranchCounter();

    org.jacoco.core.analysis.ICounter getInstructionCounter();

    int getStatus();
}
