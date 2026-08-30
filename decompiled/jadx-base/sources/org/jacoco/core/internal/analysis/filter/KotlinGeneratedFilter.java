package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public class KotlinGeneratedFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    static final java.lang.String KOTLIN_METADATA_DESC = "Lkotlin/Metadata;";

    static boolean isKotlinClass(org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext) {
        return iFilterContext.getClassAnnotations().contains(KOTLIN_METADATA_DESC);
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        if (iFilterContext.getSourceFileName() == null || !isKotlinClass(iFilterContext) || hasLineNumber(methodNode)) {
            return;
        }
        iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
    }

    private boolean hasLineNumber(org.objectweb.asm.tree.MethodNode methodNode) {
        java.util.Iterator<org.objectweb.asm.tree.AbstractInsnNode> it = methodNode.instructions.iterator();
        while (it.hasNext()) {
            if (15 == it.next().getType()) {
                return true;
            }
        }
        return false;
    }
}
