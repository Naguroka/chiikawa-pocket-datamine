package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
public final class MethodTooLargeException extends java.lang.IndexOutOfBoundsException {
    private static final long serialVersionUID = 6807380416709738314L;
    private final java.lang.String className;
    private final int codeSize;
    private final java.lang.String descriptor;
    private final java.lang.String methodName;

    public MethodTooLargeException(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        super("Method too large: " + str + "." + str2 + " " + str3);
        this.className = str;
        this.methodName = str2;
        this.descriptor = str3;
        this.codeSize = i;
    }

    public java.lang.String getClassName() {
        return this.className;
    }

    public java.lang.String getMethodName() {
        return this.methodName;
    }

    public java.lang.String getDescriptor() {
        return this.descriptor;
    }

    public int getCodeSize() {
        return this.codeSize;
    }
}
