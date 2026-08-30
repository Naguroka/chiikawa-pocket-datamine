package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class StaticInitMerger extends org.objectweb.asm.ClassVisitor {
    private org.objectweb.asm.MethodVisitor mergedClinitVisitor;
    private int numClinitMethods;
    private java.lang.String owner;
    private final java.lang.String renamedClinitMethodPrefix;

    public StaticInitMerger(java.lang.String str, org.objectweb.asm.ClassVisitor classVisitor) {
        this(589824, str, classVisitor);
    }

    protected StaticInitMerger(int i, java.lang.String str, org.objectweb.asm.ClassVisitor classVisitor) {
        super(i, classVisitor);
        this.renamedClinitMethodPrefix = str;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        super.visit(i, i2, str, str2, str3, strArr);
        this.owner = str;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.MethodVisitor visitMethod(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        if ("<clinit>".equals(str)) {
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(this.renamedClinitMethodPrefix);
            int i2 = this.numClinitMethods;
            this.numClinitMethods = i2 + 1;
            java.lang.String string = sbAppend.append(i2).toString();
            org.objectweb.asm.MethodVisitor methodVisitorVisitMethod = super.visitMethod(10, string, str2, str3, strArr);
            if (this.mergedClinitVisitor == null) {
                this.mergedClinitVisitor = super.visitMethod(10, str, str2, null, null);
            }
            this.mergedClinitVisitor.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKESTATIC, this.owner, string, str2, false);
            return methodVisitorVisitMethod;
        }
        return super.visitMethod(i, str, str2, str3, strArr);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitEnd() {
        org.objectweb.asm.MethodVisitor methodVisitor = this.mergedClinitVisitor;
        if (methodVisitor != null) {
            methodVisitor.visitInsn(org.objectweb.asm.Opcodes.RETURN);
            this.mergedClinitVisitor.visitMaxs(0, 0);
        }
        super.visitEnd();
    }
}
