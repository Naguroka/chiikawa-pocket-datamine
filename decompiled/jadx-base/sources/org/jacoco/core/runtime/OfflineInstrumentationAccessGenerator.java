package org.jacoco.core.runtime;

/* JADX INFO: loaded from: classes6.dex */
public class OfflineInstrumentationAccessGenerator implements org.jacoco.core.runtime.IExecutionDataAccessorGenerator {
    private final java.lang.String runtimeClassName;

    public OfflineInstrumentationAccessGenerator() {
        this(org.jacoco.core.JaCoCo.RUNTIMEPACKAGE.replace('.', '/') + "/Offline");
    }

    OfflineInstrumentationAccessGenerator(java.lang.String str) {
        this.runtimeClassName = str;
    }

    @Override // org.jacoco.core.runtime.IExecutionDataAccessorGenerator
    public int generateDataAccessor(long j, java.lang.String str, int i, org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitLdcInsn(java.lang.Long.valueOf(j));
        methodVisitor.visitLdcInsn(str);
        org.jacoco.core.internal.instr.InstrSupport.push(methodVisitor, i);
        methodVisitor.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKESTATIC, this.runtimeClassName, "getProbes", "(JLjava/lang/String;I)[Z", false);
        return 4;
    }
}
