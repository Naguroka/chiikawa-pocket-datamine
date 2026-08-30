package org.objectweb.asm.signature;

/* JADX INFO: loaded from: classes6.dex */
public class SignatureWriter extends org.objectweb.asm.signature.SignatureVisitor {
    private int argumentStack;
    private boolean hasFormals;
    private boolean hasParameters;
    private final java.lang.StringBuilder stringBuilder;

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitClassBound() {
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitInterface() {
        return this;
    }

    public SignatureWriter() {
        super(589824);
        this.stringBuilder = new java.lang.StringBuilder();
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitFormalTypeParameter(java.lang.String str) {
        if (!this.hasFormals) {
            this.hasFormals = true;
            this.stringBuilder.append(kotlin.text.Typography.less);
        }
        this.stringBuilder.append(str);
        this.stringBuilder.append(':');
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitInterfaceBound() {
        this.stringBuilder.append(':');
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitSuperclass() {
        endFormals();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitParameterType() {
        endFormals();
        if (!this.hasParameters) {
            this.hasParameters = true;
            this.stringBuilder.append('(');
        }
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitReturnType() {
        endFormals();
        if (!this.hasParameters) {
            this.stringBuilder.append('(');
        }
        this.stringBuilder.append(')');
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitExceptionType() {
        this.stringBuilder.append('^');
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitBaseType(char c) {
        this.stringBuilder.append(c);
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeVariable(java.lang.String str) {
        this.stringBuilder.append('T');
        this.stringBuilder.append(str);
        this.stringBuilder.append(';');
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitArrayType() {
        this.stringBuilder.append('[');
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitClassType(java.lang.String str) {
        this.stringBuilder.append('L');
        this.stringBuilder.append(str);
        this.argumentStack *= 2;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitInnerClassType(java.lang.String str) {
        endArguments();
        this.stringBuilder.append('.');
        this.stringBuilder.append(str);
        this.argumentStack *= 2;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeArgument() {
        int i = this.argumentStack;
        if (i % 2 == 0) {
            this.argumentStack = i | 1;
            this.stringBuilder.append(kotlin.text.Typography.less);
        }
        this.stringBuilder.append('*');
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitTypeArgument(char c) {
        int i = this.argumentStack;
        if (i % 2 == 0) {
            this.argumentStack = i | 1;
            this.stringBuilder.append(kotlin.text.Typography.less);
        }
        if (c != '=') {
            this.stringBuilder.append(c);
        }
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitEnd() {
        endArguments();
        this.stringBuilder.append(';');
    }

    public java.lang.String toString() {
        return this.stringBuilder.toString();
    }

    private void endFormals() {
        if (this.hasFormals) {
            this.hasFormals = false;
            this.stringBuilder.append(kotlin.text.Typography.greater);
        }
    }

    private void endArguments() {
        if (this.argumentStack % 2 == 1) {
            this.stringBuilder.append(kotlin.text.Typography.greater);
        }
        this.argumentStack /= 2;
    }
}
