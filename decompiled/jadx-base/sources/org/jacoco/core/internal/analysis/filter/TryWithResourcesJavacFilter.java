package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class TryWithResourcesJavacFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        if (methodNode.tryCatchBlocks.isEmpty()) {
            return;
        }
        org.jacoco.core.internal.analysis.filter.TryWithResourcesJavacFilter.Matcher matcher = new org.jacoco.core.internal.analysis.filter.TryWithResourcesJavacFilter.Matcher(iFilterOutput);
        for (org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode : methodNode.tryCatchBlocks) {
            if ("java/lang/Throwable".equals(tryCatchBlockNode.type)) {
                for (org.jacoco.core.internal.analysis.filter.TryWithResourcesJavacFilter.Matcher.JavacPattern javacPattern : org.jacoco.core.internal.analysis.filter.TryWithResourcesJavacFilter.Matcher.JavacPattern.values()) {
                    matcher.start(tryCatchBlockNode.handler);
                    if (matcher.matchJavac(javacPattern)) {
                        break;
                    }
                }
            }
        }
    }

    static class Matcher extends org.jacoco.core.internal.analysis.filter.AbstractMatcher {
        private java.lang.String expectedOwner;
        private final org.jacoco.core.internal.analysis.filter.IFilterOutput output;
        private org.objectweb.asm.tree.AbstractInsnNode start;

        private enum JavacPattern {
            OPTIMAL,
            FULL,
            OMITTED_NULL_CHECK,
            METHOD
        }

        Matcher(org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
            this.output = iFilterOutput;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void start(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
            this.start = abstractInsnNode;
            this.cursor = abstractInsnNode.getPrevious();
            this.vars.clear();
            this.expectedOwner = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean matchJavac(org.jacoco.core.internal.analysis.filter.TryWithResourcesJavacFilter.Matcher.JavacPattern javacPattern) {
            nextIsVar(58, "t1");
            nextIsVar(25, "t1");
            nextIsVar(58, "primaryExc");
            nextIsVar(25, "t1");
            nextIs(org.objectweb.asm.Opcodes.ATHROW);
            nextIsVar(58, "t2");
            nextIsJavacClose(javacPattern, "e");
            nextIsVar(25, "t2");
            nextIs(org.objectweb.asm.Opcodes.ATHROW);
            if (this.cursor == null) {
                return false;
            }
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.cursor;
            org.objectweb.asm.tree.AbstractInsnNode previous = this.start.getPrevious();
            this.cursor = previous;
            while (!nextIsJavacClose(javacPattern, com.json.zb.q)) {
                previous = previous.getPrevious();
                this.cursor = previous;
                if (this.cursor == null) {
                    return false;
                }
            }
            org.objectweb.asm.tree.AbstractInsnNode next = previous.getNext();
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = this.cursor;
            next();
            if (this.cursor.getOpcode() != 167) {
                this.cursor = abstractInsnNode2;
            }
            this.output.ignore(next, this.cursor);
            this.output.ignore(this.start, abstractInsnNode);
            return true;
        }

        private boolean nextIsJavacClose(org.jacoco.core.internal.analysis.filter.TryWithResourcesJavacFilter.Matcher.JavacPattern javacPattern, java.lang.String str) {
            int i = org.jacoco.core.internal.analysis.filter.TryWithResourcesJavacFilter.AnonymousClass1.$SwitchMap$org$jacoco$core$internal$analysis$filter$TryWithResourcesJavacFilter$Matcher$JavacPattern[javacPattern.ordinal()];
            if (i == 1 || i == 2) {
                nextIsVar(25, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                nextIs(org.objectweb.asm.Opcodes.IFNULL);
            }
            int i2 = org.jacoco.core.internal.analysis.filter.TryWithResourcesJavacFilter.AnonymousClass1.$SwitchMap$org$jacoco$core$internal$analysis$filter$TryWithResourcesJavacFilter$Matcher$JavacPattern[javacPattern.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new java.lang.AssertionError();
                        }
                    }
                }
                nextIsVar(25, "primaryExc");
                nextIs(org.objectweb.asm.Opcodes.IFNULL);
                nextIsClose();
                nextIs(org.objectweb.asm.Opcodes.GOTO);
                nextIsVar(58, str + "t");
                nextIsVar(25, "primaryExc");
                nextIsVar(25, str + "t");
                nextIsInvoke(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V");
                nextIs(org.objectweb.asm.Opcodes.GOTO);
                nextIsClose();
                return this.cursor != null;
            }
            nextIsVar(25, "primaryExc");
            nextIsVar(25, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            nextIs(org.objectweb.asm.Opcodes.INVOKESTATIC);
            if (this.cursor != null) {
                org.objectweb.asm.tree.MethodInsnNode methodInsnNode = (org.objectweb.asm.tree.MethodInsnNode) this.cursor;
                if ("$closeResource".equals(methodInsnNode.name) && "(Ljava/lang/Throwable;Ljava/lang/AutoCloseable;)V".equals(methodInsnNode.desc)) {
                    return true;
                }
                this.cursor = null;
            }
            return false;
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

    /* JADX INFO: renamed from: org.jacoco.core.internal.analysis.filter.TryWithResourcesJavacFilter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jacoco$core$internal$analysis$filter$TryWithResourcesJavacFilter$Matcher$JavacPattern;

        static {
            int[] iArr = new int[org.jacoco.core.internal.analysis.filter.TryWithResourcesJavacFilter.Matcher.JavacPattern.values().length];
            $SwitchMap$org$jacoco$core$internal$analysis$filter$TryWithResourcesJavacFilter$Matcher$JavacPattern = iArr;
            try {
                iArr[org.jacoco.core.internal.analysis.filter.TryWithResourcesJavacFilter.Matcher.JavacPattern.METHOD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jacoco$core$internal$analysis$filter$TryWithResourcesJavacFilter$Matcher$JavacPattern[org.jacoco.core.internal.analysis.filter.TryWithResourcesJavacFilter.Matcher.JavacPattern.FULL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jacoco$core$internal$analysis$filter$TryWithResourcesJavacFilter$Matcher$JavacPattern[org.jacoco.core.internal.analysis.filter.TryWithResourcesJavacFilter.Matcher.JavacPattern.OPTIMAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jacoco$core$internal$analysis$filter$TryWithResourcesJavacFilter$Matcher$JavacPattern[org.jacoco.core.internal.analysis.filter.TryWithResourcesJavacFilter.Matcher.JavacPattern.OMITTED_NULL_CHECK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }
}
