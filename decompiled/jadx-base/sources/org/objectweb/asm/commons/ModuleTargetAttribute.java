package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public final class ModuleTargetAttribute extends org.objectweb.asm.Attribute {
    public java.lang.String platform;

    public ModuleTargetAttribute(java.lang.String str) {
        super("ModuleTarget");
        this.platform = str;
    }

    public ModuleTargetAttribute() {
        this(null);
    }

    @Override // org.objectweb.asm.Attribute
    protected org.objectweb.asm.Attribute read(org.objectweb.asm.ClassReader classReader, int i, int i2, char[] cArr, int i3, org.objectweb.asm.Label[] labelArr) {
        return new org.objectweb.asm.commons.ModuleTargetAttribute(classReader.readUTF8(i, cArr));
    }

    @Override // org.objectweb.asm.Attribute
    protected org.objectweb.asm.ByteVector write(org.objectweb.asm.ClassWriter classWriter, byte[] bArr, int i, int i2, int i3) {
        org.objectweb.asm.ByteVector byteVector = new org.objectweb.asm.ByteVector();
        java.lang.String str = this.platform;
        byteVector.putShort(str == null ? 0 : classWriter.newUTF8(str));
        return byteVector;
    }
}
