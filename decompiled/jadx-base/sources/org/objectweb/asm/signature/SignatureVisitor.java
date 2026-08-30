package org.objectweb.asm.signature;

/* JADX INFO: loaded from: classes6.dex */
public abstract class SignatureVisitor {
    public static final char EXTENDS = '+';
    public static final char INSTANCEOF = '=';
    public static final char SUPER = '-';
    protected final int api;

    public org.objectweb.asm.signature.SignatureVisitor visitArrayType() {
        return this;
    }

    public void visitBaseType(char c) {
    }

    public org.objectweb.asm.signature.SignatureVisitor visitClassBound() {
        return this;
    }

    public void visitClassType(java.lang.String str) {
    }

    public void visitEnd() {
    }

    public org.objectweb.asm.signature.SignatureVisitor visitExceptionType() {
        return this;
    }

    public void visitFormalTypeParameter(java.lang.String str) {
    }

    public void visitInnerClassType(java.lang.String str) {
    }

    public org.objectweb.asm.signature.SignatureVisitor visitInterface() {
        return this;
    }

    public org.objectweb.asm.signature.SignatureVisitor visitInterfaceBound() {
        return this;
    }

    public org.objectweb.asm.signature.SignatureVisitor visitParameterType() {
        return this;
    }

    public org.objectweb.asm.signature.SignatureVisitor visitReturnType() {
        return this;
    }

    public org.objectweb.asm.signature.SignatureVisitor visitSuperclass() {
        return this;
    }

    public org.objectweb.asm.signature.SignatureVisitor visitTypeArgument(char c) {
        return this;
    }

    public void visitTypeArgument() {
    }

    public void visitTypeVariable(java.lang.String str) {
    }

    public SignatureVisitor(int i) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new java.lang.IllegalArgumentException("Unsupported api " + i);
        }
        this.api = i;
    }
}
