package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
public final class ClassTooLargeException extends java.lang.IndexOutOfBoundsException {
    private static final long serialVersionUID = 160715609518896765L;
    private final java.lang.String className;
    private final int constantPoolCount;

    public ClassTooLargeException(java.lang.String str, int i) {
        super("Class too large: " + str);
        this.className = str;
        this.constantPoolCount = i;
    }

    public java.lang.String getClassName() {
        return this.className;
    }

    public int getConstantPoolCount() {
        return this.constantPoolCount;
    }
}
