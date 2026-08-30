package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class ModuleRequireNode {
    public int access;
    public java.lang.String module;
    public java.lang.String version;

    public ModuleRequireNode(java.lang.String str, int i, java.lang.String str2) {
        this.module = str;
        this.access = i;
        this.version = str2;
    }

    public void accept(org.objectweb.asm.ModuleVisitor moduleVisitor) {
        moduleVisitor.visitRequire(this.module, this.access, this.version);
    }
}
