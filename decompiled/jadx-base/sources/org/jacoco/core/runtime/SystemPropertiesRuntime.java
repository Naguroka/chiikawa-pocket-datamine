package org.jacoco.core.runtime;

/* JADX INFO: loaded from: classes6.dex */
public class SystemPropertiesRuntime extends org.jacoco.core.runtime.AbstractRuntime {
    private static final java.lang.String KEYPREFIX = "jacoco-";
    private final java.lang.String key = KEYPREFIX + java.lang.Integer.toHexString(hashCode());

    @Override // org.jacoco.core.runtime.IExecutionDataAccessorGenerator
    public int generateDataAccessor(long j, java.lang.String str, int i, org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKESTATIC, "java/lang/System", "getProperties", "()Ljava/util/Properties;", false);
        methodVisitor.visitLdcInsn(this.key);
        methodVisitor.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, "java/util/Properties", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
        org.jacoco.core.runtime.RuntimeData.generateAccessCall(j, str, i, methodVisitor);
        return 6;
    }

    @Override // org.jacoco.core.runtime.AbstractRuntime, org.jacoco.core.runtime.IRuntime
    public void startup(org.jacoco.core.runtime.RuntimeData runtimeData) throws java.lang.Exception {
        super.startup(runtimeData);
        java.lang.System.getProperties().put(this.key, runtimeData);
    }

    @Override // org.jacoco.core.runtime.IRuntime
    public void shutdown() {
        java.lang.System.getProperties().remove(this.key);
    }
}
