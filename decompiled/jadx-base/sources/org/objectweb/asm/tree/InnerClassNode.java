package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class InnerClassNode {
    public int access;
    public java.lang.String innerName;
    public java.lang.String name;
    public java.lang.String outerName;

    public InnerClassNode(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        this.name = str;
        this.outerName = str2;
        this.innerName = str3;
        this.access = i;
    }

    public void accept(org.objectweb.asm.ClassVisitor classVisitor) {
        classVisitor.visitInnerClass(this.name, this.outerName, this.innerName, this.access);
    }
}
