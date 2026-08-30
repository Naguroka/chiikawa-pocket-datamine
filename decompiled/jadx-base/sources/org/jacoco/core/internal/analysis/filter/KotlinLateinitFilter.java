package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public class KotlinLateinitFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        org.jacoco.core.internal.analysis.filter.KotlinLateinitFilter.Matcher matcher = new org.jacoco.core.internal.analysis.filter.KotlinLateinitFilter.Matcher();
        java.util.Iterator<org.objectweb.asm.tree.AbstractInsnNode> it = methodNode.instructions.iterator();
        while (it.hasNext()) {
            matcher.match(it.next(), iFilterOutput);
        }
    }

    private static class Matcher extends org.jacoco.core.internal.analysis.filter.AbstractMatcher {
        private Matcher() {
        }

        public void match(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
            if (199 != abstractInsnNode.getOpcode()) {
                return;
            }
            this.cursor = abstractInsnNode;
            nextIs(18);
            nextIsInvoke(org.objectweb.asm.Opcodes.INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "throwUninitializedPropertyAccessException", "(Ljava/lang/String;)V");
            if (this.cursor != null && skipNonOpcodes(this.cursor.getNext()) != skipNonOpcodes(((org.objectweb.asm.tree.JumpInsnNode) abstractInsnNode).label)) {
                nextIs(1);
                nextIs(org.objectweb.asm.Opcodes.ATHROW);
            }
            if (this.cursor != null) {
                iFilterOutput.ignore(abstractInsnNode, this.cursor);
            }
        }
    }
}
