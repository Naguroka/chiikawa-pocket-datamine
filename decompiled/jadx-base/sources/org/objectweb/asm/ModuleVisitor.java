package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ModuleVisitor {
    protected final int api;
    protected org.objectweb.asm.ModuleVisitor mv;

    public ModuleVisitor(int i) {
        this(i, null);
    }

    public ModuleVisitor(int i, org.objectweb.asm.ModuleVisitor moduleVisitor) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new java.lang.IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            org.objectweb.asm.Constants.checkAsmExperimental(this);
        }
        this.api = i;
        this.mv = moduleVisitor;
    }

    public void visitMainClass(java.lang.String str) {
        org.objectweb.asm.ModuleVisitor moduleVisitor = this.mv;
        if (moduleVisitor != null) {
            moduleVisitor.visitMainClass(str);
        }
    }

    public void visitPackage(java.lang.String str) {
        org.objectweb.asm.ModuleVisitor moduleVisitor = this.mv;
        if (moduleVisitor != null) {
            moduleVisitor.visitPackage(str);
        }
    }

    public void visitRequire(java.lang.String str, int i, java.lang.String str2) {
        org.objectweb.asm.ModuleVisitor moduleVisitor = this.mv;
        if (moduleVisitor != null) {
            moduleVisitor.visitRequire(str, i, str2);
        }
    }

    public void visitExport(java.lang.String str, int i, java.lang.String... strArr) {
        org.objectweb.asm.ModuleVisitor moduleVisitor = this.mv;
        if (moduleVisitor != null) {
            moduleVisitor.visitExport(str, i, strArr);
        }
    }

    public void visitOpen(java.lang.String str, int i, java.lang.String... strArr) {
        org.objectweb.asm.ModuleVisitor moduleVisitor = this.mv;
        if (moduleVisitor != null) {
            moduleVisitor.visitOpen(str, i, strArr);
        }
    }

    public void visitUse(java.lang.String str) {
        org.objectweb.asm.ModuleVisitor moduleVisitor = this.mv;
        if (moduleVisitor != null) {
            moduleVisitor.visitUse(str);
        }
    }

    public void visitProvide(java.lang.String str, java.lang.String... strArr) {
        org.objectweb.asm.ModuleVisitor moduleVisitor = this.mv;
        if (moduleVisitor != null) {
            moduleVisitor.visitProvide(str, strArr);
        }
    }

    public void visitEnd() {
        org.objectweb.asm.ModuleVisitor moduleVisitor = this.mv;
        if (moduleVisitor != null) {
            moduleVisitor.visitEnd();
        }
    }
}
