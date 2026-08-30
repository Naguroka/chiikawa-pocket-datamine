package org.jacoco.core.internal.instr;

/* JADX INFO: loaded from: classes6.dex */
public class ClassInstrumenter extends org.jacoco.core.internal.flow.ClassProbesVisitor {
    private java.lang.String className;
    private final org.jacoco.core.internal.instr.IProbeArrayStrategy probeArrayStrategy;

    public ClassInstrumenter(org.jacoco.core.internal.instr.IProbeArrayStrategy iProbeArrayStrategy, org.objectweb.asm.ClassVisitor classVisitor) {
        super(classVisitor);
        this.probeArrayStrategy = iProbeArrayStrategy;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        this.className = str;
        super.visit(i, i2, str, str2, str3, strArr);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.FieldVisitor visitField(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        org.jacoco.core.internal.instr.InstrSupport.assertNotInstrumented(str, this.className);
        return super.visitField(i, str, str2, str3, obj);
    }

    @Override // org.jacoco.core.internal.flow.ClassProbesVisitor, org.objectweb.asm.ClassVisitor
    public org.jacoco.core.internal.flow.MethodProbesVisitor visitMethod(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        org.jacoco.core.internal.instr.InstrSupport.assertNotInstrumented(str, this.className);
        org.objectweb.asm.MethodVisitor methodVisitorVisitMethod = this.cv.visitMethod(i, str, str2, str3, strArr);
        if (methodVisitorVisitMethod == null) {
            return null;
        }
        org.jacoco.core.internal.instr.ProbeInserter probeInserter = new org.jacoco.core.internal.instr.ProbeInserter(i, str, str2, new org.jacoco.core.internal.instr.DuplicateFrameEliminator(methodVisitorVisitMethod), this.probeArrayStrategy);
        return new org.jacoco.core.internal.instr.MethodInstrumenter(probeInserter, probeInserter);
    }

    @Override // org.jacoco.core.internal.flow.ClassProbesVisitor
    public void visitTotalProbeCount(int i) {
        this.probeArrayStrategy.addMembers(this.cv, i);
    }
}
