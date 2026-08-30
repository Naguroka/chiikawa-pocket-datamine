package org.jacoco.core.internal.instr;

/* JADX INFO: loaded from: classes6.dex */
class NoneProbeArrayStrategy implements org.jacoco.core.internal.instr.IProbeArrayStrategy {
    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public void addMembers(org.objectweb.asm.ClassVisitor classVisitor, int i) {
    }

    NoneProbeArrayStrategy() {
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public int storeInstance(org.objectweb.asm.MethodVisitor methodVisitor, boolean z, int i) {
        throw new java.lang.UnsupportedOperationException();
    }
}
