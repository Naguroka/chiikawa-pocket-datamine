package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class ModuleOpenNode {
    public int access;
    public java.util.List<java.lang.String> modules;
    public java.lang.String packaze;

    public ModuleOpenNode(java.lang.String str, int i, java.util.List<java.lang.String> list) {
        this.packaze = str;
        this.access = i;
        this.modules = list;
    }

    public void accept(org.objectweb.asm.ModuleVisitor moduleVisitor) {
        java.lang.String str = this.packaze;
        int i = this.access;
        java.util.List<java.lang.String> list = this.modules;
        moduleVisitor.visitOpen(str, i, list == null ? null : (java.lang.String[]) list.toArray(new java.lang.String[0]));
    }
}
