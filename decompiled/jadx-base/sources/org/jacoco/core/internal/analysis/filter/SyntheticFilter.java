package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class SyntheticFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    private static boolean isScalaClass(org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext) {
        return iFilterContext.getClassAttributes().contains("ScalaSig") || iFilterContext.getClassAttributes().contains("Scala");
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        if ((methodNode.access & 4096) == 0 || methodNode.name.startsWith("lambda$")) {
            return;
        }
        if (isScalaClass(iFilterContext) && methodNode.name.startsWith("$anonfun$")) {
            return;
        }
        if (org.jacoco.core.internal.analysis.filter.KotlinGeneratedFilter.isKotlinClass(iFilterContext) && (org.jacoco.core.internal.analysis.filter.KotlinDefaultArgumentsFilter.isDefaultArgumentsMethod(methodNode) || org.jacoco.core.internal.analysis.filter.KotlinDefaultArgumentsFilter.isDefaultArgumentsConstructor(methodNode) || org.jacoco.core.internal.analysis.filter.KotlinCoroutineFilter.isImplementationOfSuspendFunction(methodNode))) {
            return;
        }
        iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
    }
}
