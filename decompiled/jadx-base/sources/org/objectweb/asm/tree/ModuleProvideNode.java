package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class ModuleProvideNode {
    public java.util.List<java.lang.String> providers;
    public java.lang.String service;

    public ModuleProvideNode(java.lang.String str, java.util.List<java.lang.String> list) {
        this.service = str;
        this.providers = list;
    }

    public void accept(org.objectweb.asm.ModuleVisitor moduleVisitor) {
        moduleVisitor.visitProvide(this.service, (java.lang.String[]) this.providers.toArray(new java.lang.String[0]));
    }
}
