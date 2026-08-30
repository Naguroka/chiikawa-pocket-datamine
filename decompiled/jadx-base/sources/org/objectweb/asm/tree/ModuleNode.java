package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class ModuleNode extends org.objectweb.asm.ModuleVisitor {
    public int access;
    public java.util.List<org.objectweb.asm.tree.ModuleExportNode> exports;
    public java.lang.String mainClass;
    public java.lang.String name;
    public java.util.List<org.objectweb.asm.tree.ModuleOpenNode> opens;
    public java.util.List<java.lang.String> packages;
    public java.util.List<org.objectweb.asm.tree.ModuleProvideNode> provides;
    public java.util.List<org.objectweb.asm.tree.ModuleRequireNode> requires;
    public java.util.List<java.lang.String> uses;
    public java.lang.String version;

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitEnd() {
    }

    public ModuleNode(java.lang.String str, int i, java.lang.String str2) {
        super(589824);
        if (getClass() != org.objectweb.asm.tree.ModuleNode.class) {
            throw new java.lang.IllegalStateException();
        }
        this.name = str;
        this.access = i;
        this.version = str2;
    }

    public ModuleNode(int i, java.lang.String str, int i2, java.lang.String str2, java.util.List<org.objectweb.asm.tree.ModuleRequireNode> list, java.util.List<org.objectweb.asm.tree.ModuleExportNode> list2, java.util.List<org.objectweb.asm.tree.ModuleOpenNode> list3, java.util.List<java.lang.String> list4, java.util.List<org.objectweb.asm.tree.ModuleProvideNode> list5) {
        super(i);
        this.name = str;
        this.access = i2;
        this.version = str2;
        this.requires = list;
        this.exports = list2;
        this.opens = list3;
        this.uses = list4;
        this.provides = list5;
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitMainClass(java.lang.String str) {
        this.mainClass = str;
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitPackage(java.lang.String str) {
        if (this.packages == null) {
            this.packages = new java.util.ArrayList(5);
        }
        this.packages.add(str);
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitRequire(java.lang.String str, int i, java.lang.String str2) {
        if (this.requires == null) {
            this.requires = new java.util.ArrayList(5);
        }
        this.requires.add(new org.objectweb.asm.tree.ModuleRequireNode(str, i, str2));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitExport(java.lang.String str, int i, java.lang.String... strArr) {
        if (this.exports == null) {
            this.exports = new java.util.ArrayList(5);
        }
        this.exports.add(new org.objectweb.asm.tree.ModuleExportNode(str, i, org.objectweb.asm.tree.Util.asArrayList(strArr)));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitOpen(java.lang.String str, int i, java.lang.String... strArr) {
        if (this.opens == null) {
            this.opens = new java.util.ArrayList(5);
        }
        this.opens.add(new org.objectweb.asm.tree.ModuleOpenNode(str, i, org.objectweb.asm.tree.Util.asArrayList(strArr)));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitUse(java.lang.String str) {
        if (this.uses == null) {
            this.uses = new java.util.ArrayList(5);
        }
        this.uses.add(str);
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitProvide(java.lang.String str, java.lang.String... strArr) {
        if (this.provides == null) {
            this.provides = new java.util.ArrayList(5);
        }
        this.provides.add(new org.objectweb.asm.tree.ModuleProvideNode(str, org.objectweb.asm.tree.Util.asArrayList(strArr)));
    }

    public void accept(org.objectweb.asm.ClassVisitor classVisitor) {
        org.objectweb.asm.ModuleVisitor moduleVisitorVisitModule = classVisitor.visitModule(this.name, this.access, this.version);
        if (moduleVisitorVisitModule == null) {
            return;
        }
        java.lang.String str = this.mainClass;
        if (str != null) {
            moduleVisitorVisitModule.visitMainClass(str);
        }
        java.util.List<java.lang.String> list = this.packages;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                moduleVisitorVisitModule.visitPackage(this.packages.get(i));
            }
        }
        java.util.List<org.objectweb.asm.tree.ModuleRequireNode> list2 = this.requires;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.requires.get(i2).accept(moduleVisitorVisitModule);
            }
        }
        java.util.List<org.objectweb.asm.tree.ModuleExportNode> list3 = this.exports;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                this.exports.get(i3).accept(moduleVisitorVisitModule);
            }
        }
        java.util.List<org.objectweb.asm.tree.ModuleOpenNode> list4 = this.opens;
        if (list4 != null) {
            int size4 = list4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                this.opens.get(i4).accept(moduleVisitorVisitModule);
            }
        }
        java.util.List<java.lang.String> list5 = this.uses;
        if (list5 != null) {
            int size5 = list5.size();
            for (int i5 = 0; i5 < size5; i5++) {
                moduleVisitorVisitModule.visitUse(this.uses.get(i5));
            }
        }
        java.util.List<org.objectweb.asm.tree.ModuleProvideNode> list6 = this.provides;
        if (list6 != null) {
            int size6 = list6.size();
            for (int i6 = 0; i6 < size6; i6++) {
                this.provides.get(i6).accept(moduleVisitorVisitModule);
            }
        }
    }
}
