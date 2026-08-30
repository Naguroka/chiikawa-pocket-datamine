package org.jacoco.core.internal.flow;

/* JADX INFO: loaded from: classes6.dex */
public class ClassProbesAdapter extends org.objectweb.asm.ClassVisitor implements org.jacoco.core.internal.flow.IProbeIdGenerator {
    private static final org.jacoco.core.internal.flow.MethodProbesVisitor EMPTY_METHOD_PROBES_VISITOR = new org.jacoco.core.internal.flow.MethodProbesVisitor() { // from class: org.jacoco.core.internal.flow.ClassProbesAdapter.1
    };
    private int counter;
    private final org.jacoco.core.internal.flow.ClassProbesVisitor cv;
    private java.lang.String name;
    private final boolean trackFrames;

    public ClassProbesAdapter(org.jacoco.core.internal.flow.ClassProbesVisitor classProbesVisitor, boolean z) {
        super(589824, classProbesVisitor);
        this.counter = 0;
        this.cv = classProbesVisitor;
        this.trackFrames = z;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        this.name = str;
        super.visit(i, i2, str, str2, str3, strArr);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.MethodVisitor visitMethod(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        org.jacoco.core.internal.flow.MethodProbesVisitor methodProbesVisitorVisitMethod = this.cv.visitMethod(i, str, str2, str3, strArr);
        if (methodProbesVisitorVisitMethod == null) {
            methodProbesVisitorVisitMethod = EMPTY_METHOD_PROBES_VISITOR;
        }
        final org.jacoco.core.internal.flow.MethodProbesVisitor methodProbesVisitor = methodProbesVisitorVisitMethod;
        return new org.jacoco.core.internal.flow.MethodSanitizer(null, i, str, str2, str3, strArr) { // from class: org.jacoco.core.internal.flow.ClassProbesAdapter.2
            @Override // org.objectweb.asm.commons.JSRInlinerAdapter, org.objectweb.asm.tree.MethodNode, org.objectweb.asm.MethodVisitor
            public void visitEnd() {
                super.visitEnd();
                org.jacoco.core.internal.flow.LabelFlowAnalyzer.markLabels(this);
                org.jacoco.core.internal.flow.MethodProbesAdapter methodProbesAdapter = new org.jacoco.core.internal.flow.MethodProbesAdapter(methodProbesVisitor, org.jacoco.core.internal.flow.ClassProbesAdapter.this);
                if (org.jacoco.core.internal.flow.ClassProbesAdapter.this.trackFrames) {
                    org.objectweb.asm.commons.AnalyzerAdapter analyzerAdapter = new org.objectweb.asm.commons.AnalyzerAdapter(org.jacoco.core.internal.flow.ClassProbesAdapter.this.name, this.access, this.name, this.desc, methodProbesAdapter);
                    methodProbesAdapter.setAnalyzer(analyzerAdapter);
                    methodProbesVisitor.accept(this, analyzerAdapter);
                    return;
                }
                methodProbesVisitor.accept(this, methodProbesAdapter);
            }
        };
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitEnd() {
        this.cv.visitTotalProbeCount(this.counter);
        super.visitEnd();
    }

    @Override // org.jacoco.core.internal.flow.IProbeIdGenerator
    public int nextId() {
        int i = this.counter;
        this.counter = i + 1;
        return i;
    }
}
