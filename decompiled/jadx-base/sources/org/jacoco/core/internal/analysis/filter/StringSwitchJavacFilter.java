package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class StringSwitchJavacFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        java.util.Iterator<org.objectweb.asm.tree.AbstractInsnNode> it = methodNode.instructions.iterator();
        while (it.hasNext()) {
            filter(it.next(), iFilterOutput);
        }
    }

    private void filter(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        org.objectweb.asm.tree.LabelNode labelNode;
        if (abstractInsnNode.getOpcode() == 171) {
            labelNode = ((org.objectweb.asm.tree.LookupSwitchInsnNode) abstractInsnNode).dflt;
        } else if (abstractInsnNode.getOpcode() != 170) {
            return;
        } else {
            labelNode = ((org.objectweb.asm.tree.TableSwitchInsnNode) abstractInsnNode).dflt;
        }
        if (new org.jacoco.core.internal.analysis.filter.StringSwitchJavacFilter.Matcher().match(abstractInsnNode, labelNode)) {
            iFilterOutput.ignore(abstractInsnNode, labelNode);
        }
    }

    private static class Matcher extends org.jacoco.core.internal.analysis.filter.AbstractMatcher {
        private Matcher() {
        }

        boolean match(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2) {
            this.cursor = abstractInsnNode;
            for (int i = 0; this.cursor != null && i < 4; i++) {
                this.cursor = this.cursor.getPrevious();
            }
            if (this.cursor != null && this.cursor.getOpcode() == 2) {
                nextIsVar(54, "c");
                nextIsVar(25, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                nextIsInvoke(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I");
                next();
                do {
                    nextIsVar(25, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                    nextIs(18);
                    nextIsInvoke(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z");
                    nextIs(153);
                    next();
                    nextIsVar(54, "c");
                    if (this.cursor == null) {
                        return false;
                    }
                    if (this.cursor.getNext() != abstractInsnNode2) {
                        nextIs(org.objectweb.asm.Opcodes.GOTO);
                        if (this.cursor == null) {
                            return false;
                        }
                    } else {
                        nextIsVar(21, "c");
                        nextIsSwitch();
                        return this.cursor != null;
                    }
                } while (((org.objectweb.asm.tree.JumpInsnNode) this.cursor).label == abstractInsnNode2);
            }
            return false;
        }
    }
}
