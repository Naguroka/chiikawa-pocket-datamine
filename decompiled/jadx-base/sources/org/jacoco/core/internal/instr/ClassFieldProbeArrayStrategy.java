package org.jacoco.core.internal.instr;

/* JADX INFO: loaded from: classes6.dex */
class ClassFieldProbeArrayStrategy implements org.jacoco.core.internal.instr.IProbeArrayStrategy {
    private final org.jacoco.core.runtime.IExecutionDataAccessorGenerator accessorGenerator;
    private final long classId;
    private final java.lang.String className;
    private final boolean withFrames;
    private static final java.lang.Object[] FRAME_STACK_ARRZ = {org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC};
    private static final java.lang.Object[] FRAME_LOCALS_EMPTY = new java.lang.Object[0];

    ClassFieldProbeArrayStrategy(java.lang.String str, long j, boolean z, org.jacoco.core.runtime.IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        this.className = str;
        this.classId = j;
        this.withFrames = z;
        this.accessorGenerator = iExecutionDataAccessorGenerator;
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public int storeInstance(org.objectweb.asm.MethodVisitor methodVisitor, boolean z, int i) {
        methodVisitor.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKESTATIC, this.className, org.jacoco.core.internal.instr.InstrSupport.INITMETHOD_NAME, org.jacoco.core.internal.instr.InstrSupport.INITMETHOD_DESC, false);
        methodVisitor.visitVarInsn(58, i);
        return 1;
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public void addMembers(org.objectweb.asm.ClassVisitor classVisitor, int i) {
        createDataField(classVisitor);
        createInitMethod(classVisitor, i);
    }

    private void createDataField(org.objectweb.asm.ClassVisitor classVisitor) {
        classVisitor.visitField(org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_ACC, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_NAME, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC, null, null);
    }

    private void createInitMethod(org.objectweb.asm.ClassVisitor classVisitor, int i) {
        org.objectweb.asm.MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(org.jacoco.core.internal.instr.InstrSupport.INITMETHOD_ACC, org.jacoco.core.internal.instr.InstrSupport.INITMETHOD_NAME, org.jacoco.core.internal.instr.InstrSupport.INITMETHOD_DESC, null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitFieldInsn(org.objectweb.asm.Opcodes.GETSTATIC, this.className, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_NAME, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC);
        methodVisitorVisitMethod.visitInsn(89);
        org.objectweb.asm.Label label = new org.objectweb.asm.Label();
        methodVisitorVisitMethod.visitJumpInsn(org.objectweb.asm.Opcodes.IFNONNULL, label);
        methodVisitorVisitMethod.visitInsn(87);
        int iGenInitializeDataField = genInitializeDataField(methodVisitorVisitMethod, i);
        if (this.withFrames) {
            methodVisitorVisitMethod.visitFrame(-1, 0, FRAME_LOCALS_EMPTY, 1, FRAME_STACK_ARRZ);
        }
        methodVisitorVisitMethod.visitLabel(label);
        methodVisitorVisitMethod.visitInsn(org.objectweb.asm.Opcodes.ARETURN);
        methodVisitorVisitMethod.visitMaxs(java.lang.Math.max(iGenInitializeDataField, 2), 0);
        methodVisitorVisitMethod.visitEnd();
    }

    private int genInitializeDataField(org.objectweb.asm.MethodVisitor methodVisitor, int i) {
        int iGenerateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, i, methodVisitor);
        methodVisitor.visitInsn(89);
        methodVisitor.visitFieldInsn(org.objectweb.asm.Opcodes.PUTSTATIC, this.className, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_NAME, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC);
        return java.lang.Math.max(iGenerateDataAccessor, 2);
    }
}
