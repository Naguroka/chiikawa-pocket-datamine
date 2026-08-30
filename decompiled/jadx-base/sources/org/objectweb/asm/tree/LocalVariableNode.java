package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class LocalVariableNode {
    public java.lang.String desc;
    public org.objectweb.asm.tree.LabelNode end;
    public int index;
    public java.lang.String name;
    public java.lang.String signature;
    public org.objectweb.asm.tree.LabelNode start;

    public LocalVariableNode(java.lang.String str, java.lang.String str2, java.lang.String str3, org.objectweb.asm.tree.LabelNode labelNode, org.objectweb.asm.tree.LabelNode labelNode2, int i) {
        this.name = str;
        this.desc = str2;
        this.signature = str3;
        this.start = labelNode;
        this.end = labelNode2;
        this.index = i;
    }

    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitLocalVariable(this.name, this.desc, this.signature, this.start.getLabel(), this.end.getLabel(), this.index);
    }
}
