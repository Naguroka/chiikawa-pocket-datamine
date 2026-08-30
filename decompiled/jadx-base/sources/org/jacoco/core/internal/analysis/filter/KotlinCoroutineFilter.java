package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class KotlinCoroutineFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    static boolean isImplementationOfSuspendFunction(org.objectweb.asm.tree.MethodNode methodNode) {
        if (methodNode.name.startsWith("access$")) {
            return false;
        }
        org.objectweb.asm.Type methodType = org.objectweb.asm.Type.getMethodType(methodNode.desc);
        int length = methodType.getArgumentTypes().length - 1;
        return length >= 0 && "kotlin.coroutines.Continuation".equals(methodType.getArgumentTypes()[length].getClassName());
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        if (org.jacoco.core.internal.analysis.filter.KotlinGeneratedFilter.isKotlinClass(iFilterContext)) {
            new org.jacoco.core.internal.analysis.filter.KotlinCoroutineFilter.Matcher().match(methodNode, iFilterOutput);
            new org.jacoco.core.internal.analysis.filter.KotlinCoroutineFilter.Matcher().matchOptimizedTailCall(methodNode, iFilterOutput);
        }
    }

    private static class Matcher extends org.jacoco.core.internal.analysis.filter.AbstractMatcher {
        private Matcher() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void matchOptimizedTailCall(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
            for (org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode : methodNode.instructions) {
                this.cursor = abstractInsnNode;
                nextIs(89);
                nextIsInvoke(org.objectweb.asm.Opcodes.INVOKESTATIC, "kotlin/coroutines/intrinsics/IntrinsicsKt", "getCOROUTINE_SUSPENDED", "()Ljava/lang/Object;");
                nextIs(org.objectweb.asm.Opcodes.IF_ACMPNE);
                nextIs(org.objectweb.asm.Opcodes.ARETURN);
                nextIs(87);
                if (this.cursor != null) {
                    iFilterOutput.ignore(abstractInsnNode.getNext(), this.cursor);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void match(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
            this.cursor = skipNonOpcodes(methodNode.instructions.getFirst());
            if (this.cursor == null || this.cursor.getOpcode() != 184) {
                this.cursor = null;
            } else {
                org.objectweb.asm.tree.MethodInsnNode methodInsnNode = (org.objectweb.asm.tree.MethodInsnNode) this.cursor;
                if (!"kotlin/coroutines/intrinsics/IntrinsicsKt".equals(methodInsnNode.owner) || !"getCOROUTINE_SUSPENDED".equals(methodInsnNode.name) || !"()Ljava/lang/Object;".equals(methodInsnNode.desc)) {
                    this.cursor = null;
                }
            }
            if (this.cursor == null) {
                this.cursor = skipNonOpcodes(methodNode.instructions.getFirst());
                nextIsCreateStateInstance();
                nextIsInvoke(org.objectweb.asm.Opcodes.INVOKESTATIC, "kotlin/coroutines/intrinsics/IntrinsicsKt", "getCOROUTINE_SUSPENDED", "()Ljava/lang/Object;");
            }
            nextIsVar(58, "COROUTINE_SUSPENDED");
            nextIsVar(25, "this");
            nextIs(org.objectweb.asm.Opcodes.GETFIELD);
            nextIs(org.objectweb.asm.Opcodes.TABLESWITCH);
            if (this.cursor == null) {
                return;
            }
            org.objectweb.asm.tree.TableSwitchInsnNode tableSwitchInsnNode = (org.objectweb.asm.tree.TableSwitchInsnNode) this.cursor;
            java.util.ArrayList arrayList = new java.util.ArrayList(tableSwitchInsnNode.labels.size() * 2);
            nextIs(25);
            nextIsThrowOnFailure();
            if (this.cursor == null) {
                return;
            }
            arrayList.add(methodNode.instructions.getFirst());
            arrayList.add(this.cursor);
            int i = 1;
            for (org.objectweb.asm.tree.AbstractInsnNode next = this.cursor; next != null && i < tableSwitchInsnNode.labels.size(); next = next.getNext()) {
                this.cursor = next;
                nextIsVar(25, "COROUTINE_SUSPENDED");
                nextIs(org.objectweb.asm.Opcodes.IF_ACMPNE);
                if (this.cursor != null) {
                    org.objectweb.asm.tree.AbstractInsnNode abstractInsnNodeSkipNonOpcodes = skipNonOpcodes(((org.objectweb.asm.tree.JumpInsnNode) this.cursor).label);
                    nextIsVar(25, "COROUTINE_SUSPENDED");
                    nextIs(org.objectweb.asm.Opcodes.ARETURN);
                    if (this.cursor != null && skipNonOpcodes(this.cursor.getNext()) == skipNonOpcodes(tableSwitchInsnNode.labels.get(i))) {
                        for (org.objectweb.asm.tree.AbstractInsnNode next2 = next; next2 != null; next2 = next2.getNext()) {
                            this.cursor = next2;
                            nextIs(25);
                            nextIsThrowOnFailure();
                            nextIs(25);
                            if (this.cursor != null && skipNonOpcodes(this.cursor.getNext()) == abstractInsnNodeSkipNonOpcodes) {
                                arrayList.add(next);
                                arrayList.add(this.cursor);
                                i++;
                                break;
                            }
                        }
                    }
                }
            }
            this.cursor = tableSwitchInsnNode.dflt;
            nextIsType(org.objectweb.asm.Opcodes.NEW, "java/lang/IllegalStateException");
            nextIs(89);
            nextIs(18);
            if (this.cursor != null && ((org.objectweb.asm.tree.LdcInsnNode) this.cursor).cst.equals("call to 'resume' before 'invoke' with coroutine")) {
                nextIsInvoke(org.objectweb.asm.Opcodes.INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V");
                nextIs(org.objectweb.asm.Opcodes.ATHROW);
                if (this.cursor == null) {
                    return;
                }
                iFilterOutput.ignore(tableSwitchInsnNode.dflt, this.cursor);
                for (int i2 = 0; i2 < arrayList.size(); i2 += 2) {
                    iFilterOutput.ignore((org.objectweb.asm.tree.AbstractInsnNode) arrayList.get(i2), (org.objectweb.asm.tree.AbstractInsnNode) arrayList.get(i2 + 1));
                }
            }
        }

        private void nextIsThrowOnFailure() {
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.cursor;
            nextIsInvoke(org.objectweb.asm.Opcodes.INVOKESTATIC, "kotlin/ResultKt", "throwOnFailure", "(Ljava/lang/Object;)V");
            if (this.cursor == null) {
                this.cursor = abstractInsnNode;
                nextIs(89);
                nextIsType(org.objectweb.asm.Opcodes.INSTANCEOF, "kotlin/Result$Failure");
                nextIs(153);
                nextIsType(192, "kotlin/Result$Failure");
                nextIs(org.objectweb.asm.Opcodes.GETFIELD);
                nextIs(org.objectweb.asm.Opcodes.ATHROW);
                nextIs(87);
            }
        }

        private void nextIsCreateStateInstance() {
            nextIs(org.objectweb.asm.Opcodes.INSTANCEOF);
            nextIs(153);
            if (this.cursor == null) {
                return;
            }
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNodeSkipNonOpcodes = skipNonOpcodes(((org.objectweb.asm.tree.JumpInsnNode) this.cursor).label);
            nextIs(25);
            nextIs(192);
            nextIs(58);
            nextIs(25);
            nextIs(org.objectweb.asm.Opcodes.GETFIELD);
            nextIs(18);
            nextIs(126);
            nextIs(153);
            if (this.cursor == null || skipNonOpcodes(((org.objectweb.asm.tree.JumpInsnNode) this.cursor).label) != abstractInsnNodeSkipNonOpcodes) {
                return;
            }
            nextIs(25);
            nextIs(89);
            nextIs(org.objectweb.asm.Opcodes.GETFIELD);
            nextIs(18);
            nextIs(100);
            nextIs(org.objectweb.asm.Opcodes.PUTFIELD);
            nextIs(org.objectweb.asm.Opcodes.GOTO);
            if (this.cursor == null) {
                return;
            }
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNodeSkipNonOpcodes2 = skipNonOpcodes(((org.objectweb.asm.tree.JumpInsnNode) this.cursor).label);
            if (skipNonOpcodes(this.cursor.getNext()) != abstractInsnNodeSkipNonOpcodes) {
                return;
            }
            this.cursor = abstractInsnNodeSkipNonOpcodes2;
            nextIs(org.objectweb.asm.Opcodes.GETFIELD);
            nextIs(58);
        }
    }
}
