package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class KotlinWhenStringFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        org.jacoco.core.internal.analysis.filter.KotlinWhenStringFilter.Matcher matcher = new org.jacoco.core.internal.analysis.filter.KotlinWhenStringFilter.Matcher();
        java.util.Iterator<org.objectweb.asm.tree.AbstractInsnNode> it = methodNode.instructions.iterator();
        while (it.hasNext()) {
            matcher.match(it.next(), iFilterOutput);
        }
    }

    private static class Matcher extends org.jacoco.core.internal.analysis.filter.AbstractMatcher {
        private Matcher() {
        }

        public void match(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
            org.objectweb.asm.tree.LabelNode labelNode;
            int size;
            org.objectweb.asm.tree.JumpInsnNode jumpInsnNode;
            if (25 != abstractInsnNode.getOpcode()) {
                return;
            }
            this.cursor = abstractInsnNode;
            nextIsInvoke(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I");
            nextIsSwitch();
            if (this.cursor == null) {
                return;
            }
            this.vars.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, (org.objectweb.asm.tree.VarInsnNode) abstractInsnNode);
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = this.cursor;
            if (abstractInsnNode2.getOpcode() == 171) {
                org.objectweb.asm.tree.LookupSwitchInsnNode lookupSwitchInsnNode = (org.objectweb.asm.tree.LookupSwitchInsnNode) this.cursor;
                labelNode = lookupSwitchInsnNode.dflt;
                size = lookupSwitchInsnNode.labels.size();
            } else {
                org.objectweb.asm.tree.TableSwitchInsnNode tableSwitchInsnNode = (org.objectweb.asm.tree.TableSwitchInsnNode) this.cursor;
                labelNode = tableSwitchInsnNode.dflt;
                size = tableSwitchInsnNode.labels.size();
            }
            if (size == 0) {
                return;
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.add(skipNonOpcodes(labelNode));
            for (int i = 1; i <= size; i++) {
                do {
                    nextIsVar(25, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                    nextIs(18);
                    nextIsInvoke(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z");
                    nextIs(153);
                    jumpInsnNode = (org.objectweb.asm.tree.JumpInsnNode) this.cursor;
                    next();
                    if (this.cursor == null) {
                        return;
                    }
                    if (this.cursor.getOpcode() == 167) {
                        hashSet.add(skipNonOpcodes(((org.objectweb.asm.tree.JumpInsnNode) this.cursor).label));
                    } else {
                        if (i == size && jumpInsnNode.label == labelNode) {
                            hashSet.add(this.cursor);
                            this.cursor = jumpInsnNode;
                            break;
                        }
                        return;
                    }
                } while (jumpInsnNode.label != labelNode);
            }
            iFilterOutput.ignore(abstractInsnNode2.getNext(), this.cursor);
            iFilterOutput.replaceBranches(abstractInsnNode2, hashSet);
        }
    }
}
