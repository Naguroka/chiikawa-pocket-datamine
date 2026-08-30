package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class EnumEmptyConstructorFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    private static final java.lang.String CONSTRUCTOR_DESC = "(Ljava/lang/String;I)V";
    private static final java.lang.String CONSTRUCTOR_NAME = "<init>";
    private static final java.lang.String ENUM_TYPE = "java/lang/Enum";

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        if (ENUM_TYPE.equals(iFilterContext.getSuperClassName()) && CONSTRUCTOR_NAME.equals(methodNode.name) && CONSTRUCTOR_DESC.equals(methodNode.desc) && new org.jacoco.core.internal.analysis.filter.EnumEmptyConstructorFilter.Matcher().match(methodNode)) {
            iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
        }
    }

    private static class Matcher extends org.jacoco.core.internal.analysis.filter.AbstractMatcher {
        private Matcher() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean match(org.objectweb.asm.tree.MethodNode methodNode) {
            firstIsALoad0(methodNode);
            nextIs(25);
            nextIs(21);
            nextIsInvoke(org.objectweb.asm.Opcodes.INVOKESPECIAL, org.jacoco.core.internal.analysis.filter.EnumEmptyConstructorFilter.ENUM_TYPE, org.jacoco.core.internal.analysis.filter.EnumEmptyConstructorFilter.CONSTRUCTOR_NAME, org.jacoco.core.internal.analysis.filter.EnumEmptyConstructorFilter.CONSTRUCTOR_DESC);
            nextIs(org.objectweb.asm.Opcodes.RETURN);
            return this.cursor != null;
        }
    }
}
