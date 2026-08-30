package org.jacoco.core.internal.instr;

/* JADX INFO: loaded from: classes6.dex */
class LocalProbeArrayStrategy implements org.jacoco.core.internal.instr.IProbeArrayStrategy {
    private final org.jacoco.core.runtime.IExecutionDataAccessorGenerator accessorGenerator;
    private final long classId;
    private final java.lang.String className;
    private final int probeCount;

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public void addMembers(org.objectweb.asm.ClassVisitor classVisitor, int i) {
    }

    LocalProbeArrayStrategy(java.lang.String str, long j, int i, org.jacoco.core.runtime.IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        this.className = str;
        this.classId = j;
        this.probeCount = i;
        this.accessorGenerator = iExecutionDataAccessorGenerator;
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public int storeInstance(org.objectweb.asm.MethodVisitor methodVisitor, boolean z, int i) {
        int iGenerateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, this.probeCount, methodVisitor);
        methodVisitor.visitVarInsn(58, i);
        return iGenerateDataAccessor;
    }
}
