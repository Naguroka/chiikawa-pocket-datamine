package org.jacoco.core.internal.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class ClassAnalyzer extends org.jacoco.core.internal.flow.ClassProbesVisitor implements org.jacoco.core.internal.analysis.filter.IFilterContext {
    private final org.jacoco.core.internal.analysis.ClassCoverageImpl coverage;
    private final boolean[] probes;
    private java.lang.String sourceDebugExtension;
    private final org.jacoco.core.internal.analysis.StringPool stringPool;
    private final java.util.Set<java.lang.String> classAnnotations = new java.util.HashSet();
    private final java.util.Set<java.lang.String> classAttributes = new java.util.HashSet();
    private final org.jacoco.core.internal.analysis.filter.IFilter filter = org.jacoco.core.internal.analysis.filter.Filters.all();

    @Override // org.jacoco.core.internal.flow.ClassProbesVisitor
    public void visitTotalProbeCount(int i) {
    }

    public ClassAnalyzer(org.jacoco.core.internal.analysis.ClassCoverageImpl classCoverageImpl, boolean[] zArr, org.jacoco.core.internal.analysis.StringPool stringPool) {
        this.coverage = classCoverageImpl;
        this.probes = zArr;
        this.stringPool = stringPool;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        this.coverage.setSignature(this.stringPool.get(str2));
        this.coverage.setSuperName(this.stringPool.get(str3));
        this.coverage.setInterfaces(this.stringPool.get(strArr));
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, boolean z) {
        this.classAnnotations.add(str);
        return super.visitAnnotation(str, z);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitAttribute(org.objectweb.asm.Attribute attribute) {
        this.classAttributes.add(attribute.type);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitSource(java.lang.String str, java.lang.String str2) {
        this.coverage.setSourceFileName(this.stringPool.get(str));
        this.sourceDebugExtension = str2;
    }

    @Override // org.jacoco.core.internal.flow.ClassProbesVisitor, org.objectweb.asm.ClassVisitor
    public org.jacoco.core.internal.flow.MethodProbesVisitor visitMethod(int i, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, java.lang.String[] strArr) {
        org.jacoco.core.internal.instr.InstrSupport.assertNotInstrumented(str, this.coverage.getName());
        final org.jacoco.core.internal.analysis.InstructionsBuilder instructionsBuilder = new org.jacoco.core.internal.analysis.InstructionsBuilder(this.probes);
        return new org.jacoco.core.internal.analysis.MethodAnalyzer(instructionsBuilder) { // from class: org.jacoco.core.internal.analysis.ClassAnalyzer.1
            @Override // org.jacoco.core.internal.analysis.MethodAnalyzer, org.jacoco.core.internal.flow.MethodProbesVisitor
            public void accept(org.objectweb.asm.tree.MethodNode methodNode, org.objectweb.asm.MethodVisitor methodVisitor) {
                super.accept(methodNode, methodVisitor);
                org.jacoco.core.internal.analysis.ClassAnalyzer classAnalyzer = org.jacoco.core.internal.analysis.ClassAnalyzer.this;
                classAnalyzer.addMethodCoverage(classAnalyzer.stringPool.get(str), org.jacoco.core.internal.analysis.ClassAnalyzer.this.stringPool.get(str2), org.jacoco.core.internal.analysis.ClassAnalyzer.this.stringPool.get(str3), instructionsBuilder, methodNode);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethodCoverage(java.lang.String str, java.lang.String str2, java.lang.String str3, org.jacoco.core.internal.analysis.InstructionsBuilder instructionsBuilder, org.objectweb.asm.tree.MethodNode methodNode) {
        org.jacoco.core.internal.analysis.MethodCoverageCalculator methodCoverageCalculator = new org.jacoco.core.internal.analysis.MethodCoverageCalculator(instructionsBuilder.getInstructions());
        this.filter.filter(methodNode, this, methodCoverageCalculator);
        org.jacoco.core.internal.analysis.MethodCoverageImpl methodCoverageImpl = new org.jacoco.core.internal.analysis.MethodCoverageImpl(str, str2, str3);
        methodCoverageCalculator.calculate(methodCoverageImpl);
        if (methodCoverageImpl.containsCode()) {
            this.coverage.addMethod(methodCoverageImpl);
        }
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.FieldVisitor visitField(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        org.jacoco.core.internal.instr.InstrSupport.assertNotInstrumented(str, this.coverage.getName());
        return super.visitField(i, str, str2, str3, obj);
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterContext
    public java.lang.String getClassName() {
        return this.coverage.getName();
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterContext
    public java.lang.String getSuperClassName() {
        return this.coverage.getSuperName();
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterContext
    public java.util.Set<java.lang.String> getClassAnnotations() {
        return this.classAnnotations;
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterContext
    public java.util.Set<java.lang.String> getClassAttributes() {
        return this.classAttributes;
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterContext
    public java.lang.String getSourceFileName() {
        return this.coverage.getSourceFileName();
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterContext
    public java.lang.String getSourceDebugExtension() {
        return this.sourceDebugExtension;
    }
}
