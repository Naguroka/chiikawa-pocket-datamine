package org.jacoco.core.internal.instr;

/* JADX INFO: loaded from: classes6.dex */
class InterfaceFieldProbeArrayStrategy implements org.jacoco.core.internal.instr.IProbeArrayStrategy {
    private final org.jacoco.core.runtime.IExecutionDataAccessorGenerator accessorGenerator;
    private final long classId;
    private final java.lang.String className;
    private final int probeCount;
    private boolean seenClinit = false;
    private static final java.lang.Object[] FRAME_STACK_ARRZ = {org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC};
    private static final java.lang.Object[] FRAME_LOCALS_EMPTY = new java.lang.Object[0];

    InterfaceFieldProbeArrayStrategy(java.lang.String str, long j, int i, org.jacoco.core.runtime.IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        this.className = str;
        this.classId = j;
        this.probeCount = i;
        this.accessorGenerator = iExecutionDataAccessorGenerator;
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public int storeInstance(org.objectweb.asm.MethodVisitor methodVisitor, boolean z, int i) {
        if (z) {
            int iGenerateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, this.probeCount, methodVisitor);
            methodVisitor.visitInsn(89);
            methodVisitor.visitFieldInsn(org.objectweb.asm.Opcodes.PUTSTATIC, this.className, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_NAME, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC);
            methodVisitor.visitVarInsn(58, i);
            this.seenClinit = true;
            return java.lang.Math.max(iGenerateDataAccessor, 2);
        }
        methodVisitor.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKESTATIC, this.className, org.jacoco.core.internal.instr.InstrSupport.INITMETHOD_NAME, org.jacoco.core.internal.instr.InstrSupport.INITMETHOD_DESC, true);
        methodVisitor.visitVarInsn(58, i);
        return 1;
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public void addMembers(org.objectweb.asm.ClassVisitor classVisitor, int i) {
        createDataField(classVisitor);
        createInitMethod(classVisitor, i);
        if (this.seenClinit) {
            return;
        }
        createClinitMethod(classVisitor, i);
    }

    private void createDataField(org.objectweb.asm.ClassVisitor classVisitor) {
        classVisitor.visitField(org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_INTF_ACC, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_NAME, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC, null, null);
    }

    private void createInitMethod(org.objectweb.asm.ClassVisitor classVisitor, int i) {
        org.objectweb.asm.MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(org.jacoco.core.internal.instr.InstrSupport.INITMETHOD_ACC, org.jacoco.core.internal.instr.InstrSupport.INITMETHOD_NAME, org.jacoco.core.internal.instr.InstrSupport.INITMETHOD_DESC, null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitFieldInsn(org.objectweb.asm.Opcodes.GETSTATIC, this.className, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_NAME, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC);
        methodVisitorVisitMethod.visitInsn(89);
        org.objectweb.asm.Label label = new org.objectweb.asm.Label();
        methodVisitorVisitMethod.visitJumpInsn(org.objectweb.asm.Opcodes.IFNONNULL, label);
        methodVisitorVisitMethod.visitInsn(87);
        int iGenerateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, i, methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitFrame(-1, 0, FRAME_LOCALS_EMPTY, 1, FRAME_STACK_ARRZ);
        methodVisitorVisitMethod.visitLabel(label);
        methodVisitorVisitMethod.visitInsn(org.objectweb.asm.Opcodes.ARETURN);
        methodVisitorVisitMethod.visitMaxs(java.lang.Math.max(iGenerateDataAccessor, 2), 0);
        methodVisitorVisitMethod.visitEnd();
    }

    private void createClinitMethod(org.objectweb.asm.ClassVisitor classVisitor, int i) {
        org.objectweb.asm.MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(4104, "<clinit>", "()V", null, null);
        methodVisitorVisitMethod.visitCode();
        int iGenerateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, i, methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitFieldInsn(org.objectweb.asm.Opcodes.PUTSTATIC, this.className, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_NAME, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC);
        methodVisitorVisitMethod.visitInsn(org.objectweb.asm.Opcodes.RETURN);
        methodVisitorVisitMethod.visitMaxs(iGenerateDataAccessor, 0);
        methodVisitorVisitMethod.visitEnd();
    }
}
