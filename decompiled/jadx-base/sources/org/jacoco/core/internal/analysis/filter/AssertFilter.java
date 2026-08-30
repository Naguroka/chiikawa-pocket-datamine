package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
final class AssertFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    AssertFilter() {
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        org.jacoco.core.internal.analysis.filter.AssertFilter.Matcher matcher = new org.jacoco.core.internal.analysis.filter.AssertFilter.Matcher();
        if ("<clinit>".equals(methodNode.name)) {
            java.util.Iterator<org.objectweb.asm.tree.AbstractInsnNode> it = methodNode.instructions.iterator();
            while (it.hasNext()) {
                matcher.matchSet(iFilterContext.getClassName(), it.next(), iFilterOutput);
            }
        }
        java.util.Iterator<org.objectweb.asm.tree.AbstractInsnNode> it2 = methodNode.instructions.iterator();
        while (it2.hasNext()) {
            matcher.matchGet(iFilterContext.getClassName(), it2.next(), iFilterOutput);
        }
    }

    private static class Matcher extends org.jacoco.core.internal.analysis.filter.AbstractMatcher {
        private Matcher() {
        }

        public void matchSet(java.lang.String str, org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
            this.cursor = abstractInsnNode;
            nextIsInvoke(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, "java/lang/Class", "desiredAssertionStatus", "()Z");
            nextIs(154);
            nextIs(4);
            nextIs(org.objectweb.asm.Opcodes.GOTO);
            nextIs(3);
            nextIsField(org.objectweb.asm.Opcodes.PUTSTATIC, str, "$assertionsDisabled", "Z");
            if (this.cursor != null) {
                iFilterOutput.ignore(abstractInsnNode, this.cursor);
            }
        }

        public void matchGet(java.lang.String str, org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
            this.cursor = abstractInsnNode;
            nextIsField(org.objectweb.asm.Opcodes.GETSTATIC, str, "$assertionsDisabled", "Z");
            nextIs(154);
            if (this.cursor != null) {
                iFilterOutput.ignore(this.cursor, this.cursor);
            }
        }
    }
}
