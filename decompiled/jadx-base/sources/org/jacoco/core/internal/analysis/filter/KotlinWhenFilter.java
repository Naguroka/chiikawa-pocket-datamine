package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class KotlinWhenFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    private static final java.lang.String EXCEPTION = "kotlin/NoWhenBranchMatchedException";

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        org.jacoco.core.internal.analysis.filter.KotlinWhenFilter.Matcher matcher = new org.jacoco.core.internal.analysis.filter.KotlinWhenFilter.Matcher();
        java.util.Iterator<org.objectweb.asm.tree.AbstractInsnNode> it = methodNode.instructions.iterator();
        while (it.hasNext()) {
            matcher.match(it.next(), iFilterOutput);
        }
    }

    private static class Matcher extends org.jacoco.core.internal.analysis.filter.AbstractMatcher {
        private Matcher() {
        }

        void match(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
            if (abstractInsnNode.getType() != 8) {
                return;
            }
            this.cursor = abstractInsnNode;
            nextIsType(org.objectweb.asm.Opcodes.NEW, org.jacoco.core.internal.analysis.filter.KotlinWhenFilter.EXCEPTION);
            nextIs(89);
            nextIsInvoke(org.objectweb.asm.Opcodes.INVOKESPECIAL, org.jacoco.core.internal.analysis.filter.KotlinWhenFilter.EXCEPTION, "<init>", "()V");
            nextIs(org.objectweb.asm.Opcodes.ATHROW);
            for (org.objectweb.asm.tree.AbstractInsnNode previous = this.cursor; previous != null; previous = previous.getPrevious()) {
                if (previous.getOpcode() != 153 || ((org.objectweb.asm.tree.JumpInsnNode) previous).label != abstractInsnNode) {
                    if (org.jacoco.core.internal.analysis.filter.KotlinWhenFilter.getDefaultLabel(previous) == abstractInsnNode) {
                        org.jacoco.core.internal.analysis.filter.KotlinWhenFilter.ignoreDefaultBranch(previous, iFilterOutput);
                        iFilterOutput.ignore(abstractInsnNode, this.cursor);
                        return;
                    }
                } else {
                    iFilterOutput.ignore(previous, previous);
                    iFilterOutput.ignore(abstractInsnNode, this.cursor);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.objectweb.asm.tree.LabelNode getDefaultLabel(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 170) {
            return ((org.objectweb.asm.tree.TableSwitchInsnNode) abstractInsnNode).dflt;
        }
        if (opcode != 171) {
            return null;
        }
        return ((org.objectweb.asm.tree.LookupSwitchInsnNode) abstractInsnNode).dflt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ignoreDefaultBranch(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        java.util.List<org.objectweb.asm.tree.LabelNode> list;
        if (abstractInsnNode.getOpcode() == 171) {
            list = ((org.objectweb.asm.tree.LookupSwitchInsnNode) abstractInsnNode).labels;
        } else {
            list = ((org.objectweb.asm.tree.TableSwitchInsnNode) abstractInsnNode).labels;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<org.objectweb.asm.tree.LabelNode> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(org.jacoco.core.internal.analysis.filter.AbstractMatcher.skipNonOpcodes(it.next()));
        }
        iFilterOutput.replaceBranches(abstractInsnNode, hashSet);
    }
}
