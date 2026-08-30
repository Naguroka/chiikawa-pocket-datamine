package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class KotlinUnsafeCastOperatorFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        if (org.jacoco.core.internal.analysis.filter.KotlinGeneratedFilter.isKotlinClass(iFilterContext)) {
            org.jacoco.core.internal.analysis.filter.KotlinUnsafeCastOperatorFilter.Matcher matcher = new org.jacoco.core.internal.analysis.filter.KotlinUnsafeCastOperatorFilter.Matcher();
            for (org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode : methodNode.instructions) {
                matcher.match("kotlin/TypeCastException", abstractInsnNode, iFilterOutput);
                matcher.match("java/lang/NullPointerException", abstractInsnNode, iFilterOutput);
            }
        }
    }

    private static class Matcher extends org.jacoco.core.internal.analysis.filter.AbstractMatcher {
        private Matcher() {
        }

        public void match(java.lang.String str, org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
            if (199 != abstractInsnNode.getOpcode()) {
                return;
            }
            this.cursor = abstractInsnNode;
            org.objectweb.asm.tree.JumpInsnNode jumpInsnNode = (org.objectweb.asm.tree.JumpInsnNode) this.cursor;
            org.objectweb.asm.tree.AbstractInsnNode next = this.cursor.getNext();
            if (next != null && next.getOpcode() == 87) {
                next();
            }
            nextIsType(org.objectweb.asm.Opcodes.NEW, str);
            nextIs(89);
            nextIs(18);
            if (this.cursor == null) {
                return;
            }
            org.objectweb.asm.tree.LdcInsnNode ldcInsnNode = (org.objectweb.asm.tree.LdcInsnNode) this.cursor;
            if ((ldcInsnNode.cst instanceof java.lang.String) && ((java.lang.String) ldcInsnNode.cst).startsWith("null cannot be cast to non-null type")) {
                nextIsInvoke(org.objectweb.asm.Opcodes.INVOKESPECIAL, str, "<init>", "(Ljava/lang/String;)V");
                nextIs(org.objectweb.asm.Opcodes.ATHROW);
                if (this.cursor != null && this.cursor.getNext() == jumpInsnNode.label) {
                    iFilterOutput.ignore(abstractInsnNode, this.cursor);
                }
            }
        }
    }
}
