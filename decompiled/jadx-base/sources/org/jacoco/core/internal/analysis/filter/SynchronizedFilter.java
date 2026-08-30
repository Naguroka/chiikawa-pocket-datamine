package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class SynchronizedFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNodeMatch;
        for (org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode : methodNode.tryCatchBlocks) {
            if (tryCatchBlockNode.type == null && tryCatchBlockNode.start != tryCatchBlockNode.handler && (abstractInsnNodeMatch = new org.jacoco.core.internal.analysis.filter.SynchronizedFilter.Matcher(tryCatchBlockNode.handler).match()) != null) {
                iFilterOutput.ignore(tryCatchBlockNode.handler, abstractInsnNodeMatch);
            }
        }
    }

    private static class Matcher extends org.jacoco.core.internal.analysis.filter.AbstractMatcher {
        private final org.objectweb.asm.tree.AbstractInsnNode start;

        private Matcher(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
            this.start = abstractInsnNode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public org.objectweb.asm.tree.AbstractInsnNode match() {
            if (nextIsEcj() || nextIsJavac()) {
                return this.cursor;
            }
            return null;
        }

        private boolean nextIsJavac() {
            this.cursor = this.start;
            nextIsVar(58, "t");
            nextIs(25);
            nextIs(org.objectweb.asm.Opcodes.MONITOREXIT);
            nextIsVar(25, "t");
            nextIs(org.objectweb.asm.Opcodes.ATHROW);
            return this.cursor != null;
        }

        private boolean nextIsEcj() {
            this.cursor = this.start;
            nextIs(25);
            nextIs(org.objectweb.asm.Opcodes.MONITOREXIT);
            nextIs(org.objectweb.asm.Opcodes.ATHROW);
            return this.cursor != null;
        }
    }
}
