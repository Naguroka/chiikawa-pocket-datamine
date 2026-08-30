package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
final class BridgeFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    BridgeFilter() {
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        if ((methodNode.access & 64) == 0) {
            return;
        }
        iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
    }
}
