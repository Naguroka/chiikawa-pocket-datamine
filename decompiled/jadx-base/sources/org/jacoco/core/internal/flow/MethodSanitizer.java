package org.jacoco.core.internal.flow;

/* JADX INFO: loaded from: classes6.dex */
class MethodSanitizer extends org.objectweb.asm.commons.JSRInlinerAdapter {
    MethodSanitizer(org.objectweb.asm.MethodVisitor methodVisitor, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        super(589824, methodVisitor, i, str, str2, str3, strArr);
    }

    @Override // org.objectweb.asm.tree.MethodNode, org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(java.lang.String str, java.lang.String str2, java.lang.String str3, org.objectweb.asm.Label label, org.objectweb.asm.Label label2, int i) {
        if (label.info == null || label2.info == null) {
            return;
        }
        super.visitLocalVariable(str, str2, str3, label, label2, i);
    }

    @Override // org.objectweb.asm.tree.MethodNode, org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int i, org.objectweb.asm.Label label) {
        if (label.info != null) {
            super.visitLineNumber(i, label);
        }
    }
}
