package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class TryWithResourcesEcjFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        if (methodNode.tryCatchBlocks.isEmpty()) {
            return;
        }
        org.jacoco.core.internal.analysis.filter.TryWithResourcesEcjFilter.Matcher matcher = new org.jacoco.core.internal.analysis.filter.TryWithResourcesEcjFilter.Matcher(iFilterOutput);
        for (org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode : methodNode.tryCatchBlocks) {
            if (tryCatchBlockNode.type == null) {
                matcher.start(tryCatchBlockNode.handler);
                if (!matcher.matchEcj()) {
                    matcher.start(tryCatchBlockNode.handler);
                    matcher.matchEcjNoFlowOut();
                }
            }
        }
    }

    static class Matcher extends org.jacoco.core.internal.analysis.filter.AbstractMatcher {
        private final org.jacoco.core.internal.analysis.filter.IFilterOutput output;
        private org.objectweb.asm.tree.AbstractInsnNode start;
        private final java.util.Map<java.lang.String, java.lang.String> owners = new java.util.HashMap();
        private final java.util.Map<java.lang.String, org.objectweb.asm.tree.LabelNode> labels = new java.util.HashMap();

        Matcher(org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
            this.output = iFilterOutput;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void start(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
            this.start = abstractInsnNode;
            this.cursor = abstractInsnNode.getPrevious();
            this.vars.clear();
            this.labels.clear();
            this.owners.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean matchEcj() {
            nextIsVar(58, "primaryExc");
            nextIsEcjCloseAndThrow("r0");
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.cursor;
            java.lang.String str = "r1";
            int i = 1;
            while (nextIsEcjClose(str)) {
                nextIsJump(org.objectweb.asm.Opcodes.GOTO, str + ".end");
                nextIsEcjSuppress(str);
                nextIsEcjCloseAndThrow(str);
                i++;
                str = com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ + i;
                abstractInsnNode = this.cursor;
            }
            this.cursor = abstractInsnNode;
            nextIsEcjSuppress("last");
            nextIsVar(25, "primaryExc");
            nextIs(org.objectweb.asm.Opcodes.ATHROW);
            if (this.cursor == null) {
                return false;
            }
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = this.cursor;
            org.objectweb.asm.tree.AbstractInsnNode previous = this.start.getPrevious();
            this.cursor = previous;
            while (!nextIsEcjClose("r0")) {
                previous = previous.getPrevious();
                this.cursor = previous;
                if (this.cursor == null) {
                    return false;
                }
            }
            org.objectweb.asm.tree.AbstractInsnNode next = previous.getNext();
            next();
            if (this.cursor == null || this.cursor.getOpcode() != 167) {
                return false;
            }
            this.output.ignore(next, this.cursor);
            this.output.ignore(this.start, abstractInsnNode2);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean matchEcjNoFlowOut() {
            nextIsVar(58, "primaryExc");
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.cursor;
            int i = 0;
            java.lang.String str = "r0";
            while (nextIsEcjCloseAndThrow(str) && nextIsEcjSuppress(str)) {
                i++;
                str = com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ + i;
                abstractInsnNode = this.cursor;
            }
            this.cursor = abstractInsnNode;
            nextIsVar(25, "primaryExc");
            nextIs(org.objectweb.asm.Opcodes.ATHROW);
            if (this.cursor == null) {
                return false;
            }
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = this.cursor;
            org.objectweb.asm.tree.AbstractInsnNode previous = this.start.getPrevious();
            this.cursor = previous;
            while (!nextIsEcjClose("r0")) {
                previous = previous.getPrevious();
                this.cursor = previous;
                if (this.cursor == null) {
                    return false;
                }
            }
            org.objectweb.asm.tree.AbstractInsnNode next = previous.getNext();
            for (int i2 = 1; i2 < i; i2++) {
                if (!nextIsEcjClose(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ + i2)) {
                    return false;
                }
            }
            this.output.ignore(next, this.cursor);
            this.output.ignore(this.start, abstractInsnNode2);
            return true;
        }

        private boolean nextIsEcjClose(java.lang.String str) {
            nextIsVar(25, str);
            nextIsJump(org.objectweb.asm.Opcodes.IFNULL, str + ".end");
            nextIsClose(str);
            return this.cursor != null;
        }

        private boolean nextIsEcjCloseAndThrow(java.lang.String str) {
            nextIsVar(25, str);
            nextIsJump(org.objectweb.asm.Opcodes.IFNULL, str);
            nextIsClose(str);
            nextIsLabel(str);
            nextIsVar(25, "primaryExc");
            nextIs(org.objectweb.asm.Opcodes.ATHROW);
            return this.cursor != null;
        }

        private boolean nextIsEcjSuppress(java.lang.String str) {
            java.lang.String str2 = str + ".t";
            java.lang.String str3 = str + ".suppressStart";
            java.lang.String str4 = str + ".suppressEnd";
            nextIsVar(58, str2);
            nextIsVar(25, "primaryExc");
            nextIsJump(org.objectweb.asm.Opcodes.IFNONNULL, str3);
            nextIsVar(25, str2);
            nextIsVar(58, "primaryExc");
            nextIsJump(org.objectweb.asm.Opcodes.GOTO, str4);
            nextIsLabel(str3);
            nextIsVar(25, "primaryExc");
            nextIsVar(25, str2);
            nextIsJump(org.objectweb.asm.Opcodes.IF_ACMPEQ, str4);
            nextIsVar(25, "primaryExc");
            nextIsVar(25, str2);
            nextIsInvoke(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V");
            nextIsLabel(str4);
            return this.cursor != null;
        }

        private void nextIsClose(java.lang.String str) {
            nextIsVar(25, str);
            next();
            if (this.cursor == null) {
                return;
            }
            if (this.cursor.getOpcode() != 185 && this.cursor.getOpcode() != 182) {
                this.cursor = null;
                return;
            }
            org.objectweb.asm.tree.MethodInsnNode methodInsnNode = (org.objectweb.asm.tree.MethodInsnNode) this.cursor;
            if (!"close".equals(methodInsnNode.name) || !"()V".equals(methodInsnNode.desc)) {
                this.cursor = null;
                return;
            }
            java.lang.String str2 = methodInsnNode.owner;
            java.lang.String str3 = this.owners.get(str);
            if (str3 == null) {
                this.owners.put(str, str2);
            } else {
                if (str3.equals(str2)) {
                    return;
                }
                this.cursor = null;
            }
        }

        private void nextIsJump(int i, java.lang.String str) {
            nextIs(i);
            if (this.cursor == null) {
                return;
            }
            org.objectweb.asm.tree.LabelNode labelNode = ((org.objectweb.asm.tree.JumpInsnNode) this.cursor).label;
            org.objectweb.asm.tree.LabelNode labelNode2 = this.labels.get(str);
            if (labelNode2 == null) {
                this.labels.put(str, labelNode);
            } else if (labelNode2 != labelNode) {
                this.cursor = null;
            }
        }

        private void nextIsLabel(java.lang.String str) {
            if (this.cursor == null) {
                return;
            }
            this.cursor = this.cursor.getNext();
            if (this.cursor.getType() != 8) {
                this.cursor = null;
                return;
            }
            if (this.labels.get(str) != ((org.objectweb.asm.tree.LabelNode) this.cursor)) {
                this.cursor = null;
            }
        }
    }
}
