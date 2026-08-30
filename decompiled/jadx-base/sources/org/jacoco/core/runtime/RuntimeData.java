package org.jacoco.core.runtime;

/* JADX INFO: loaded from: classes6.dex */
public class RuntimeData {
    protected final org.jacoco.core.data.ExecutionDataStore store = new org.jacoco.core.data.ExecutionDataStore();
    private java.lang.String sessionId = "<none>";
    private long startTimeStamp = java.lang.System.currentTimeMillis();

    public void setSessionId(java.lang.String str) {
        this.sessionId = str;
    }

    public java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final void collect(org.jacoco.core.data.IExecutionDataVisitor iExecutionDataVisitor, org.jacoco.core.data.ISessionInfoVisitor iSessionInfoVisitor, boolean z) {
        synchronized (this.store) {
            iSessionInfoVisitor.visitSessionInfo(new org.jacoco.core.data.SessionInfo(this.sessionId, this.startTimeStamp, java.lang.System.currentTimeMillis()));
            this.store.accept(iExecutionDataVisitor);
            if (z) {
                reset();
            }
        }
    }

    public final void reset() {
        synchronized (this.store) {
            this.store.reset();
            this.startTimeStamp = java.lang.System.currentTimeMillis();
        }
    }

    public org.jacoco.core.data.ExecutionData getExecutionData(java.lang.Long l, java.lang.String str, int i) {
        org.jacoco.core.data.ExecutionData executionData;
        synchronized (this.store) {
            executionData = this.store.get(l, str, i);
        }
        return executionData;
    }

    public void getProbes(java.lang.Object[] objArr) {
        objArr[0] = getExecutionData((java.lang.Long) objArr[0], (java.lang.String) objArr[1], ((java.lang.Integer) objArr[2]).intValue()).getProbes();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof java.lang.Object[]) {
            getProbes((java.lang.Object[]) obj);
        }
        return super.equals(obj);
    }

    public static void generateArgumentArray(long j, java.lang.String str, int i, org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitInsn(6);
        methodVisitor.visitTypeInsn(189, "java/lang/Object");
        methodVisitor.visitInsn(89);
        methodVisitor.visitInsn(3);
        methodVisitor.visitLdcInsn(java.lang.Long.valueOf(j));
        methodVisitor.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
        methodVisitor.visitInsn(83);
        methodVisitor.visitInsn(89);
        methodVisitor.visitInsn(4);
        methodVisitor.visitLdcInsn(str);
        methodVisitor.visitInsn(83);
        methodVisitor.visitInsn(89);
        methodVisitor.visitInsn(5);
        org.jacoco.core.internal.instr.InstrSupport.push(methodVisitor, i);
        methodVisitor.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
        methodVisitor.visitInsn(83);
    }

    public static void generateAccessCall(long j, java.lang.String str, int i, org.objectweb.asm.MethodVisitor methodVisitor) {
        generateArgumentArray(j, str, i, methodVisitor);
        methodVisitor.visitInsn(90);
        methodVisitor.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
        methodVisitor.visitInsn(87);
        methodVisitor.visitInsn(3);
        methodVisitor.visitInsn(50);
        methodVisitor.visitTypeInsn(192, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC);
    }
}
