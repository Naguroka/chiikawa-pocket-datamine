package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class KotlinDefaultArgumentsFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    static boolean isDefaultArgumentsMethod(org.objectweb.asm.tree.MethodNode methodNode) {
        return methodNode.name.endsWith("$default");
    }

    static boolean isDefaultArgumentsConstructor(org.objectweb.asm.tree.MethodNode methodNode) {
        if (!"<init>".equals(methodNode.name)) {
            return false;
        }
        org.objectweb.asm.Type[] argumentTypes = org.objectweb.asm.Type.getMethodType(methodNode.desc).getArgumentTypes();
        if (argumentTypes.length < 2) {
            return false;
        }
        return "kotlin.jvm.internal.DefaultConstructorMarker".equals(argumentTypes[argumentTypes.length - 1].getClassName());
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        if ((methodNode.access & 4096) != 0 && org.jacoco.core.internal.analysis.filter.KotlinGeneratedFilter.isKotlinClass(iFilterContext)) {
            if (isDefaultArgumentsMethod(methodNode)) {
                new org.jacoco.core.internal.analysis.filter.KotlinDefaultArgumentsFilter.Matcher().match(methodNode, iFilterOutput, false);
            } else if (isDefaultArgumentsConstructor(methodNode)) {
                new org.jacoco.core.internal.analysis.filter.KotlinDefaultArgumentsFilter.Matcher().match(methodNode, iFilterOutput, true);
            }
        }
    }

    private static class Matcher extends org.jacoco.core.internal.analysis.filter.AbstractMatcher {
        private Matcher() {
        }

        public void match(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput, boolean z) {
            this.cursor = skipNonOpcodes(methodNode.instructions.getFirst());
            nextIs(org.objectweb.asm.Opcodes.IFNULL);
            nextIsType(org.objectweb.asm.Opcodes.NEW, "java/lang/UnsupportedOperationException");
            nextIs(89);
            nextIs(18);
            if (this.cursor == null || !(((org.objectweb.asm.tree.LdcInsnNode) this.cursor).cst instanceof java.lang.String) || !((java.lang.String) ((org.objectweb.asm.tree.LdcInsnNode) this.cursor).cst).startsWith("Super calls with default arguments not supported in this target")) {
                this.cursor = null;
            }
            nextIsInvoke(org.objectweb.asm.Opcodes.INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V");
            nextIs(org.objectweb.asm.Opcodes.ATHROW);
            if (this.cursor != null) {
                iFilterOutput.ignore(methodNode.instructions.getFirst(), this.cursor);
                next();
            } else {
                this.cursor = skipNonOpcodes(methodNode.instructions.getFirst());
            }
            java.util.HashSet<org.objectweb.asm.tree.AbstractInsnNode> hashSet = new java.util.HashSet();
            int iMaskVar = maskVar(methodNode.desc, z);
            while (this.cursor.getOpcode() == 21 && ((org.objectweb.asm.tree.VarInsnNode) this.cursor).var == iMaskVar) {
                next();
                nextIs(126);
                nextIs(153);
                if (this.cursor == null) {
                    return;
                }
                hashSet.add(this.cursor);
                this.cursor = ((org.objectweb.asm.tree.JumpInsnNode) this.cursor).label;
                skipNonOpcodes();
            }
            for (org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode : hashSet) {
                iFilterOutput.ignore(abstractInsnNode, abstractInsnNode);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static int maskVar(java.lang.String str, boolean z) {
            org.objectweb.asm.Type[] argumentTypes = org.objectweb.asm.Type.getMethodType(str).getArgumentTypes();
            int length = argumentTypes.length - 2;
            int i = 0;
            int i2 = z;
            while (i < length) {
                int size = i2 + argumentTypes[i].getSize();
                i++;
                i2 = size;
            }
            return i2;
        }
    }
}
