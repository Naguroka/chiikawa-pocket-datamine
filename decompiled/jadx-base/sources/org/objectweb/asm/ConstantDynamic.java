package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
public final class ConstantDynamic {
    private final org.objectweb.asm.Handle bootstrapMethod;
    private final java.lang.Object[] bootstrapMethodArguments;
    private final java.lang.String descriptor;
    private final java.lang.String name;

    public ConstantDynamic(java.lang.String str, java.lang.String str2, org.objectweb.asm.Handle handle, java.lang.Object... objArr) {
        this.name = str;
        this.descriptor = str2;
        this.bootstrapMethod = handle;
        this.bootstrapMethodArguments = objArr;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getDescriptor() {
        return this.descriptor;
    }

    public org.objectweb.asm.Handle getBootstrapMethod() {
        return this.bootstrapMethod;
    }

    public int getBootstrapMethodArgumentCount() {
        return this.bootstrapMethodArguments.length;
    }

    public java.lang.Object getBootstrapMethodArgument(int i) {
        return this.bootstrapMethodArguments[i];
    }

    java.lang.Object[] getBootstrapMethodArgumentsUnsafe() {
        return this.bootstrapMethodArguments;
    }

    public int getSize() {
        char cCharAt = this.descriptor.charAt(0);
        return (cCharAt == 'J' || cCharAt == 'D') ? 2 : 1;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.objectweb.asm.ConstantDynamic)) {
            return false;
        }
        org.objectweb.asm.ConstantDynamic constantDynamic = (org.objectweb.asm.ConstantDynamic) obj;
        return this.name.equals(constantDynamic.name) && this.descriptor.equals(constantDynamic.descriptor) && this.bootstrapMethod.equals(constantDynamic.bootstrapMethod) && java.util.Arrays.equals(this.bootstrapMethodArguments, constantDynamic.bootstrapMethodArguments);
    }

    public int hashCode() {
        return ((this.name.hashCode() ^ java.lang.Integer.rotateLeft(this.descriptor.hashCode(), 8)) ^ java.lang.Integer.rotateLeft(this.bootstrapMethod.hashCode(), 16)) ^ java.lang.Integer.rotateLeft(java.util.Arrays.hashCode(this.bootstrapMethodArguments), 24);
    }

    public java.lang.String toString() {
        return this.name + " : " + this.descriptor + ' ' + this.bootstrapMethod + ' ' + java.util.Arrays.toString(this.bootstrapMethodArguments);
    }
}
