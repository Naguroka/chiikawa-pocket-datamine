package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
final class KotlinDefaultMethodsFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    KotlinDefaultMethodsFilter() {
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        if (org.jacoco.core.internal.analysis.filter.KotlinGeneratedFilter.isKotlinClass(iFilterContext)) {
            new org.jacoco.core.internal.analysis.filter.KotlinDefaultMethodsFilter.Matcher().match(methodNode, iFilterOutput);
        }
    }

    private static class Matcher extends org.jacoco.core.internal.analysis.filter.AbstractMatcher {
        private Matcher() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void match(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
            firstIsALoad0(methodNode);
            nextIs(org.objectweb.asm.Opcodes.INVOKESTATIC);
            if (this.cursor == null || !((org.objectweb.asm.tree.MethodInsnNode) this.cursor).owner.endsWith("$DefaultImpls")) {
                return;
            }
            iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
        }
    }
}
