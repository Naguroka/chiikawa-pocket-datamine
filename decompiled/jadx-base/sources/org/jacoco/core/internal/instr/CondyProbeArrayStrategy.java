package org.jacoco.core.internal.instr;

/* JADX INFO: loaded from: classes6.dex */
public class CondyProbeArrayStrategy implements org.jacoco.core.internal.instr.IProbeArrayStrategy {
    public static final java.lang.String B_DESC = "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;)[Z";
    private final org.jacoco.core.runtime.IExecutionDataAccessorGenerator accessorGenerator;
    private final long classId;
    private final java.lang.String className;
    private final boolean isInterface;

    CondyProbeArrayStrategy(java.lang.String str, boolean z, long j, org.jacoco.core.runtime.IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        this.className = str;
        this.isInterface = z;
        this.classId = j;
        this.accessorGenerator = iExecutionDataAccessorGenerator;
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public int storeInstance(org.objectweb.asm.MethodVisitor methodVisitor, boolean z, int i) {
        methodVisitor.visitLdcInsn(new org.objectweb.asm.ConstantDynamic(org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_NAME, "Ljava/lang/Object;", new org.objectweb.asm.Handle(6, this.className, org.jacoco.core.internal.instr.InstrSupport.INITMETHOD_NAME, B_DESC, this.isInterface), new java.lang.Object[0]));
        methodVisitor.visitTypeInsn(192, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC);
        methodVisitor.visitVarInsn(58, i);
        return 1;
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public void addMembers(org.objectweb.asm.ClassVisitor classVisitor, int i) {
        org.objectweb.asm.MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(org.jacoco.core.internal.instr.InstrSupport.INITMETHOD_ACC, org.jacoco.core.internal.instr.InstrSupport.INITMETHOD_NAME, B_DESC, null, null);
        int iGenerateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, i, methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitInsn(org.objectweb.asm.Opcodes.ARETURN);
        methodVisitorVisitMethod.visitMaxs(iGenerateDataAccessor, 3);
        methodVisitorVisitMethod.visitEnd();
    }
}
