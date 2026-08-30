package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class AnnotationGeneratedFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        java.util.Iterator<java.lang.String> it = iFilterContext.getClassAnnotations().iterator();
        while (it.hasNext()) {
            if (matches(it.next())) {
                iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
                return;
            }
        }
        if (presentIn(methodNode.invisibleAnnotations) || presentIn(methodNode.visibleAnnotations)) {
            iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
        }
    }

    private static boolean matches(java.lang.String str) {
        return str.substring(java.lang.Math.max(str.lastIndexOf(47), str.lastIndexOf(36)) + 1).contains("Generated");
    }

    private static boolean presentIn(java.util.List<org.objectweb.asm.tree.AnnotationNode> list) {
        if (list == null) {
            return false;
        }
        java.util.Iterator<org.objectweb.asm.tree.AnnotationNode> it = list.iterator();
        while (it.hasNext()) {
            if (matches(it.next().desc)) {
                return true;
            }
        }
        return false;
    }
}
