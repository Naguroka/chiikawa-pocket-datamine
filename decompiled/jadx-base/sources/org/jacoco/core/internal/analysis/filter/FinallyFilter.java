package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class FinallyFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        for (org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode : methodNode.tryCatchBlocks) {
            if (tryCatchBlockNode.type == null) {
                filter(iFilterOutput, methodNode.tryCatchBlocks, tryCatchBlockNode);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    private static void filter(org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput, java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> list, org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode) {
        org.objectweb.asm.tree.AbstractInsnNode next = next(tryCatchBlockNode.handler);
        int size = size(next);
        if (size <= 0) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode2 : list) {
            if (tryCatchBlockNode2.handler == tryCatchBlockNode.handler) {
                for (org.objectweb.asm.tree.AbstractInsnNode next2 = tryCatchBlockNode2.start; next2 != tryCatchBlockNode2.end; next2 = next2.getNext()) {
                    hashSet.add(next2);
                }
            }
        }
        for (org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode3 : list) {
            if (tryCatchBlockNode3.handler == tryCatchBlockNode.handler) {
                org.objectweb.asm.tree.AbstractInsnNode next3 = tryCatchBlockNode3.start;
                boolean z = false;
                z = false;
                while (next3 != tryCatchBlockNode3.end) {
                    int type = next3.getType();
                    if (type == 7) {
                        org.objectweb.asm.tree.AbstractInsnNode next4 = next(((org.objectweb.asm.tree.JumpInsnNode) next3).label);
                        if (!hashSet.contains(next4)) {
                            merge(iFilterOutput, size, next, next4);
                        }
                        if (next3.getOpcode() != 167) {
                            z = true;
                        }
                    } else if (type != 8 && type != 14 && type != 15) {
                        int opcode = next3.getOpcode();
                        if (opcode != 191) {
                            switch (opcode) {
                                case 172:
                                case org.objectweb.asm.Opcodes.LRETURN /* 173 */:
                                case org.objectweb.asm.Opcodes.FRETURN /* 174 */:
                                case org.objectweb.asm.Opcodes.DRETURN /* 175 */:
                                case org.objectweb.asm.Opcodes.ARETURN /* 176 */:
                                case org.objectweb.asm.Opcodes.RETURN /* 177 */:
                                    break;
                                default:
                                    z = true;
                                    break;
                            }
                        }
                    }
                    next3 = next3.getNext();
                }
                org.objectweb.asm.tree.AbstractInsnNode next5 = next(next3);
                if (z && !hashSet.contains(next5)) {
                    merge(iFilterOutput, size, next, next5);
                }
            }
            if (tryCatchBlockNode3 != tryCatchBlockNode && tryCatchBlockNode3.start == tryCatchBlockNode.start && tryCatchBlockNode3.end == tryCatchBlockNode.end) {
                org.objectweb.asm.tree.AbstractInsnNode next6 = next(next(tryCatchBlockNode3.handler));
                if (!hashSet.contains(next6)) {
                    merge(iFilterOutput, size, next, next6);
                }
            }
        }
    }

    private static void merge(org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput, int i, org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2) {
        if (isSame(i, abstractInsnNode, abstractInsnNode2)) {
            iFilterOutput.ignore(abstractInsnNode, abstractInsnNode);
            org.objectweb.asm.tree.AbstractInsnNode next = next(abstractInsnNode);
            for (int i2 = 0; i2 < i; i2++) {
                iFilterOutput.merge(next, abstractInsnNode2);
                next = next(next);
                abstractInsnNode2 = next(abstractInsnNode2);
            }
            iFilterOutput.ignore(next, next(next));
            if (abstractInsnNode2 == null || abstractInsnNode2.getOpcode() != 167) {
                return;
            }
            iFilterOutput.ignore(abstractInsnNode2, abstractInsnNode2);
        }
    }

    private static boolean isSame(int i, org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2) {
        org.objectweb.asm.tree.AbstractInsnNode next = next(abstractInsnNode);
        for (int i2 = 0; i2 < i; i2++) {
            if (abstractInsnNode2 == null || next.getOpcode() != abstractInsnNode2.getOpcode()) {
                return false;
            }
            next = next(next);
            abstractInsnNode2 = next(abstractInsnNode2);
        }
        return true;
    }

    private static int size(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
        if (58 != abstractInsnNode.getOpcode()) {
            return 0;
        }
        int i = ((org.objectweb.asm.tree.VarInsnNode) abstractInsnNode).var;
        int i2 = -1;
        while (true) {
            i2++;
            abstractInsnNode = next(abstractInsnNode);
            if (abstractInsnNode == null) {
                return 0;
            }
            if (25 == abstractInsnNode.getOpcode() && i == ((org.objectweb.asm.tree.VarInsnNode) abstractInsnNode).var) {
                if (191 != next(abstractInsnNode).getOpcode()) {
                    return 0;
                }
                return i2;
            }
        }
    }

    private static org.objectweb.asm.tree.AbstractInsnNode next(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
        while (true) {
            abstractInsnNode = abstractInsnNode.getNext();
            if (abstractInsnNode == null || (14 != abstractInsnNode.getType() && 8 != abstractInsnNode.getType() && 15 != abstractInsnNode.getType())) {
                break;
            }
        }
        return abstractInsnNode;
    }
}
