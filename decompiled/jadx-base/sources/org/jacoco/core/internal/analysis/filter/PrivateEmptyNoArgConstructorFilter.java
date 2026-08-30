package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class PrivateEmptyNoArgConstructorFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    private static final java.lang.String CONSTRUCTOR_DESC = "()V";
    private static final java.lang.String CONSTRUCTOR_NAME = "<init>";

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        if ((methodNode.access & 2) != 0 && CONSTRUCTOR_NAME.equals(methodNode.name) && CONSTRUCTOR_DESC.equals(methodNode.desc) && new org.jacoco.core.internal.analysis.filter.PrivateEmptyNoArgConstructorFilter.Matcher().match(methodNode, iFilterContext.getSuperClassName())) {
            iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
        }
    }

    private static class Matcher extends org.jacoco.core.internal.analysis.filter.AbstractMatcher {
        private Matcher() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean match(org.objectweb.asm.tree.MethodNode methodNode, java.lang.String str) {
            firstIsALoad0(methodNode);
            nextIsInvoke(org.objectweb.asm.Opcodes.INVOKESPECIAL, str, org.jacoco.core.internal.analysis.filter.PrivateEmptyNoArgConstructorFilter.CONSTRUCTOR_NAME, org.jacoco.core.internal.analysis.filter.PrivateEmptyNoArgConstructorFilter.CONSTRUCTOR_DESC);
            nextIs(org.objectweb.asm.Opcodes.RETURN);
            return this.cursor != null;
        }
    }
}
