package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class SignatureRemapper extends org.objectweb.asm.signature.SignatureVisitor {
    private java.util.ArrayList<java.lang.String> classNames;
    private final org.objectweb.asm.commons.Remapper remapper;
    private final org.objectweb.asm.signature.SignatureVisitor signatureVisitor;

    public SignatureRemapper(org.objectweb.asm.signature.SignatureVisitor signatureVisitor, org.objectweb.asm.commons.Remapper remapper) {
        this(589824, signatureVisitor, remapper);
    }

    protected SignatureRemapper(int i, org.objectweb.asm.signature.SignatureVisitor signatureVisitor, org.objectweb.asm.commons.Remapper remapper) {
        super(i);
        this.classNames = new java.util.ArrayList<>();
        this.signatureVisitor = signatureVisitor;
        this.remapper = remapper;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitClassType(java.lang.String str) {
        this.classNames.add(str);
        this.signatureVisitor.visitClassType(this.remapper.mapType(str));
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitInnerClassType(java.lang.String str) {
        int iLastIndexOf;
        java.util.ArrayList<java.lang.String> arrayList = this.classNames;
        java.lang.String strRemove = arrayList.remove(arrayList.size() - 1);
        java.lang.String str2 = strRemove + kotlin.text.Typography.dollar + str;
        this.classNames.add(str2);
        java.lang.String str3 = this.remapper.mapType(strRemove) + kotlin.text.Typography.dollar;
        java.lang.String strMapType = this.remapper.mapType(str2);
        if (strMapType.startsWith(str3)) {
            iLastIndexOf = str3.length();
        } else {
            iLastIndexOf = strMapType.lastIndexOf(36) + 1;
        }
        this.signatureVisitor.visitInnerClassType(strMapType.substring(iLastIndexOf));
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitFormalTypeParameter(java.lang.String str) {
        this.signatureVisitor.visitFormalTypeParameter(str);
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeVariable(java.lang.String str) {
        this.signatureVisitor.visitTypeVariable(str);
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitArrayType() {
        this.signatureVisitor.visitArrayType();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitBaseType(char c) {
        this.signatureVisitor.visitBaseType(c);
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitClassBound() {
        this.signatureVisitor.visitClassBound();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitExceptionType() {
        this.signatureVisitor.visitExceptionType();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitInterface() {
        this.signatureVisitor.visitInterface();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitInterfaceBound() {
        this.signatureVisitor.visitInterfaceBound();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitParameterType() {
        this.signatureVisitor.visitParameterType();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitReturnType() {
        this.signatureVisitor.visitReturnType();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitSuperclass() {
        this.signatureVisitor.visitSuperclass();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeArgument() {
        this.signatureVisitor.visitTypeArgument();
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitTypeArgument(char c) {
        this.signatureVisitor.visitTypeArgument(c);
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitEnd() {
        this.signatureVisitor.visitEnd();
        java.util.ArrayList<java.lang.String> arrayList = this.classNames;
        arrayList.remove(arrayList.size() - 1);
    }
}
