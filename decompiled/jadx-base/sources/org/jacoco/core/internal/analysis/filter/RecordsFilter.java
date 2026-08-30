package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class RecordsFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        if ("java/lang/Record".equals(iFilterContext.getSuperClassName())) {
            org.jacoco.core.internal.analysis.filter.RecordsFilter.Matcher matcher = new org.jacoco.core.internal.analysis.filter.RecordsFilter.Matcher();
            if (matcher.isEquals(methodNode) || matcher.isHashCode(methodNode) || matcher.isToString(methodNode)) {
                iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
            }
        }
    }

    private static class Matcher extends org.jacoco.core.internal.analysis.filter.AbstractMatcher {
        private Matcher() {
        }

        boolean isToString(org.objectweb.asm.tree.MethodNode methodNode) {
            if (!"toString".equals(methodNode.name) || !"()Ljava/lang/String;".equals(methodNode.desc)) {
                return false;
            }
            firstIsALoad0(methodNode);
            nextIsInvokeDynamic("toString");
            nextIs(org.objectweb.asm.Opcodes.ARETURN);
            return this.cursor != null;
        }

        boolean isHashCode(org.objectweb.asm.tree.MethodNode methodNode) {
            if (!"hashCode".equals(methodNode.name) || !"()I".equals(methodNode.desc)) {
                return false;
            }
            firstIsALoad0(methodNode);
            nextIsInvokeDynamic("hashCode");
            nextIs(172);
            return this.cursor != null;
        }

        boolean isEquals(org.objectweb.asm.tree.MethodNode methodNode) {
            if (!"equals".equals(methodNode.name) || !"(Ljava/lang/Object;)Z".equals(methodNode.desc)) {
                return false;
            }
            firstIsALoad0(methodNode);
            nextIs(25);
            nextIsInvokeDynamic("equals");
            nextIs(172);
            return this.cursor != null;
        }

        private void nextIsInvokeDynamic(java.lang.String str) {
            nextIs(org.objectweb.asm.Opcodes.INVOKEDYNAMIC);
            if (this.cursor == null) {
                return;
            }
            org.objectweb.asm.tree.InvokeDynamicInsnNode invokeDynamicInsnNode = (org.objectweb.asm.tree.InvokeDynamicInsnNode) this.cursor;
            org.objectweb.asm.Handle handle = invokeDynamicInsnNode.bsm;
            if (str.equals(invokeDynamicInsnNode.name) && "java/lang/runtime/ObjectMethods".equals(handle.getOwner()) && "bootstrap".equals(handle.getName())) {
                return;
            }
            this.cursor = null;
        }
    }
}
