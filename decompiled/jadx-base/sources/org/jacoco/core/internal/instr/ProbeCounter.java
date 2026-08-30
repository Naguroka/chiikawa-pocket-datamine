package org.jacoco.core.internal.instr;

/* JADX INFO: loaded from: classes6.dex */
class ProbeCounter extends org.jacoco.core.internal.flow.ClassProbesVisitor {
    private int count = 0;
    private boolean methods = false;

    ProbeCounter() {
    }

    @Override // org.jacoco.core.internal.flow.ClassProbesVisitor, org.objectweb.asm.ClassVisitor
    public org.jacoco.core.internal.flow.MethodProbesVisitor visitMethod(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        if ("<clinit>".equals(str) || (i & 1024) != 0) {
            return null;
        }
        this.methods = true;
        return null;
    }

    @Override // org.jacoco.core.internal.flow.ClassProbesVisitor
    public void visitTotalProbeCount(int i) {
        this.count = i;
    }

    int getCount() {
        return this.count;
    }

    boolean hasMethods() {
        return this.methods;
    }
}
