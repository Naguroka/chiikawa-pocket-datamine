package org.jacoco.core.internal.flow;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ClassProbesVisitor extends org.objectweb.asm.ClassVisitor {
    @Override // org.objectweb.asm.ClassVisitor
    public abstract org.jacoco.core.internal.flow.MethodProbesVisitor visitMethod(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr);

    public abstract void visitTotalProbeCount(int i);

    public ClassProbesVisitor() {
        this(null);
    }

    public ClassProbesVisitor(org.objectweb.asm.ClassVisitor classVisitor) {
        super(589824, classVisitor);
    }
}
