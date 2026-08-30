package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class ModuleRemapper extends org.objectweb.asm.ModuleVisitor {
    protected final org.objectweb.asm.commons.Remapper remapper;

    public ModuleRemapper(org.objectweb.asm.ModuleVisitor moduleVisitor, org.objectweb.asm.commons.Remapper remapper) {
        this(589824, moduleVisitor, remapper);
    }

    protected ModuleRemapper(int i, org.objectweb.asm.ModuleVisitor moduleVisitor, org.objectweb.asm.commons.Remapper remapper) {
        super(i, moduleVisitor);
        this.remapper = remapper;
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitMainClass(java.lang.String str) {
        super.visitMainClass(this.remapper.mapType(str));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitPackage(java.lang.String str) {
        super.visitPackage(this.remapper.mapPackageName(str));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitRequire(java.lang.String str, int i, java.lang.String str2) {
        super.visitRequire(this.remapper.mapModuleName(str), i, str2);
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitExport(java.lang.String str, int i, java.lang.String... strArr) {
        java.lang.String[] strArr2;
        if (strArr != null) {
            strArr2 = new java.lang.String[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr2[i2] = this.remapper.mapModuleName(strArr[i2]);
            }
        } else {
            strArr2 = null;
        }
        super.visitExport(this.remapper.mapPackageName(str), i, strArr2);
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitOpen(java.lang.String str, int i, java.lang.String... strArr) {
        java.lang.String[] strArr2;
        if (strArr != null) {
            strArr2 = new java.lang.String[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr2[i2] = this.remapper.mapModuleName(strArr[i2]);
            }
        } else {
            strArr2 = null;
        }
        super.visitOpen(this.remapper.mapPackageName(str), i, strArr2);
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitUse(java.lang.String str) {
        super.visitUse(this.remapper.mapType(str));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitProvide(java.lang.String str, java.lang.String... strArr) {
        java.lang.String[] strArr2 = new java.lang.String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = this.remapper.mapType(strArr[i]);
        }
        super.visitProvide(this.remapper.mapType(str), strArr2);
    }
}
