package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class TryWithResourcesJavac11Filter implements org.jacoco.core.internal.analysis.filter.IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        if (methodNode.tryCatchBlocks.isEmpty()) {
            return;
        }
        org.jacoco.core.internal.analysis.filter.TryWithResourcesJavac11Filter.Matcher matcher = new org.jacoco.core.internal.analysis.filter.TryWithResourcesJavac11Filter.Matcher();
        for (org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode : methodNode.tryCatchBlocks) {
            if ("java/lang/Throwable".equals(tryCatchBlockNode.type)) {
                matcher.match(tryCatchBlockNode.handler, iFilterOutput, true);
                matcher.match(tryCatchBlockNode.handler, iFilterOutput, false);
            }
        }
    }

    private class Matcher extends org.jacoco.core.internal.analysis.filter.AbstractMatcher {
        private java.lang.String expectedOwner;
        private boolean withNullCheck;

        private Matcher() {
        }

        void match(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput, boolean z) {
            this.withNullCheck = z;
            this.vars.clear();
            this.expectedOwner = null;
            this.cursor = abstractInsnNode.getPrevious();
            nextIsVar(58, "primaryExc");
            nextIsJavacClose();
            nextIs(org.objectweb.asm.Opcodes.GOTO);
            nextIsVar(58, "t");
            nextIsVar(25, "primaryExc");
            nextIsVar(25, "t");
            nextIsInvoke(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V");
            nextIsVar(25, "primaryExc");
            nextIs(org.objectweb.asm.Opcodes.ATHROW);
            if (this.cursor == null) {
                return;
            }
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = this.cursor;
            org.objectweb.asm.tree.AbstractInsnNode previous = abstractInsnNode.getPrevious();
            this.cursor = abstractInsnNode.getPrevious();
            while (!nextIsJavacClose()) {
                previous = previous.getPrevious();
                this.cursor = previous;
                if (this.cursor == null) {
                    return;
                }
            }
            org.objectweb.asm.tree.AbstractInsnNode next = previous.getNext();
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode3 = this.cursor;
            next();
            if (this.cursor.getOpcode() != 167) {
                this.cursor = abstractInsnNode3;
            }
            iFilterOutput.ignore(next, this.cursor);
            iFilterOutput.ignore(abstractInsnNode, abstractInsnNode2);
        }

        private boolean nextIsJavacClose() {
            if (this.withNullCheck) {
                nextIsVar(25, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                nextIs(org.objectweb.asm.Opcodes.IFNULL);
            }
            nextIsClose();
            return this.cursor != null;
        }

        private void nextIsClose() {
            nextIsVar(25, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
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
            java.lang.String str = methodInsnNode.owner;
            java.lang.String str2 = this.expectedOwner;
            if (str2 == null) {
                this.expectedOwner = str;
            } else {
                if (str2.equals(str)) {
                    return;
                }
                this.cursor = null;
            }
        }
    }
}
