package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public final class ModuleHashesAttribute extends org.objectweb.asm.Attribute {
    public java.lang.String algorithm;
    public java.util.List<byte[]> hashes;
    public java.util.List<java.lang.String> modules;

    public ModuleHashesAttribute(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<byte[]> list2) {
        super("ModuleHashes");
        this.algorithm = str;
        this.modules = list;
        this.hashes = list2;
    }

    public ModuleHashesAttribute() {
        this(null, null, null);
    }

    @Override // org.objectweb.asm.Attribute
    protected org.objectweb.asm.Attribute read(org.objectweb.asm.ClassReader classReader, int i, int i2, char[] cArr, int i3, org.objectweb.asm.Label[] labelArr) {
        java.lang.String utf8 = classReader.readUTF8(i, cArr);
        int i4 = i + 2;
        int unsignedShort = classReader.readUnsignedShort(i4);
        int i5 = i4 + 2;
        java.util.ArrayList arrayList = new java.util.ArrayList(unsignedShort);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(unsignedShort);
        for (int i6 = 0; i6 < unsignedShort; i6++) {
            java.lang.String module = classReader.readModule(i5, cArr);
            int i7 = i5 + 2;
            arrayList.add(module);
            int unsignedShort2 = classReader.readUnsignedShort(i7);
            i5 = i7 + 2;
            byte[] bArr = new byte[unsignedShort2];
            for (int i8 = 0; i8 < unsignedShort2; i8++) {
                bArr[i8] = (byte) classReader.readByte(i5);
                i5++;
            }
            arrayList2.add(bArr);
        }
        return new org.objectweb.asm.commons.ModuleHashesAttribute(utf8, arrayList, arrayList2);
    }

    @Override // org.objectweb.asm.Attribute
    protected org.objectweb.asm.ByteVector write(org.objectweb.asm.ClassWriter classWriter, byte[] bArr, int i, int i2, int i3) {
        org.objectweb.asm.ByteVector byteVector = new org.objectweb.asm.ByteVector();
        byteVector.putShort(classWriter.newUTF8(this.algorithm));
        java.util.List<java.lang.String> list = this.modules;
        if (list == null) {
            byteVector.putShort(0);
        } else {
            int size = list.size();
            byteVector.putShort(size);
            for (int i4 = 0; i4 < size; i4++) {
                java.lang.String str = this.modules.get(i4);
                byte[] bArr2 = this.hashes.get(i4);
                byteVector.putShort(classWriter.newModule(str)).putShort(bArr2.length).putByteArray(bArr2, 0, bArr2.length);
            }
        }
        return byteVector;
    }
}
