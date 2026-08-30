package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public final class ModuleResolutionAttribute extends org.objectweb.asm.Attribute {
    public static final int RESOLUTION_DO_NOT_RESOLVE_BY_DEFAULT = 1;
    public static final int RESOLUTION_WARN_DEPRECATED = 2;
    public static final int RESOLUTION_WARN_DEPRECATED_FOR_REMOVAL = 4;
    public static final int RESOLUTION_WARN_INCUBATING = 8;
    public int resolution;

    public ModuleResolutionAttribute(int i) {
        super("ModuleResolution");
        this.resolution = i;
    }

    public ModuleResolutionAttribute() {
        this(0);
    }

    @Override // org.objectweb.asm.Attribute
    protected org.objectweb.asm.Attribute read(org.objectweb.asm.ClassReader classReader, int i, int i2, char[] cArr, int i3, org.objectweb.asm.Label[] labelArr) {
        return new org.objectweb.asm.commons.ModuleResolutionAttribute(classReader.readUnsignedShort(i));
    }

    @Override // org.objectweb.asm.Attribute
    protected org.objectweb.asm.ByteVector write(org.objectweb.asm.ClassWriter classWriter, byte[] bArr, int i, int i2, int i3) {
        org.objectweb.asm.ByteVector byteVector = new org.objectweb.asm.ByteVector();
        byteVector.putShort(this.resolution);
        return byteVector;
    }
}
