package org.jacoco.core.analysis;

/* JADX INFO: loaded from: classes6.dex */
public interface ISourceNode extends org.jacoco.core.analysis.ICoverageNode {
    public static final int UNKNOWN_LINE = -1;

    int getFirstLine();

    int getLastLine();

    org.jacoco.core.analysis.ILine getLine(int i);
}
