package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
public class Attribute {
    private byte[] content;
    org.objectweb.asm.Attribute nextAttribute;
    public final java.lang.String type;

    protected org.objectweb.asm.Label[] getLabels() {
        return new org.objectweb.asm.Label[0];
    }

    public boolean isCodeAttribute() {
        return false;
    }

    public boolean isUnknown() {
        return true;
    }

    protected Attribute(java.lang.String str) {
        this.type = str;
    }

    protected org.objectweb.asm.Attribute read(org.objectweb.asm.ClassReader classReader, int i, int i2, char[] cArr, int i3, org.objectweb.asm.Label[] labelArr) {
        org.objectweb.asm.Attribute attribute = new org.objectweb.asm.Attribute(this.type);
        attribute.content = new byte[i2];
        java.lang.System.arraycopy(classReader.classFileBuffer, i, attribute.content, 0, i2);
        return attribute;
    }

    protected org.objectweb.asm.ByteVector write(org.objectweb.asm.ClassWriter classWriter, byte[] bArr, int i, int i2, int i3) {
        return new org.objectweb.asm.ByteVector(this.content);
    }

    final int getAttributeCount() {
        int i = 0;
        for (org.objectweb.asm.Attribute attribute = this; attribute != null; attribute = attribute.nextAttribute) {
            i++;
        }
        return i;
    }

    final int computeAttributesSize(org.objectweb.asm.SymbolTable symbolTable) {
        return computeAttributesSize(symbolTable, null, 0, -1, -1);
    }

    final int computeAttributesSize(org.objectweb.asm.SymbolTable symbolTable, byte[] bArr, int i, int i2, int i3) {
        org.objectweb.asm.ClassWriter classWriter = symbolTable.classWriter;
        int i4 = 0;
        for (org.objectweb.asm.Attribute attribute = this; attribute != null; attribute = attribute.nextAttribute) {
            symbolTable.addConstantUtf8(attribute.type);
            i4 += attribute.write(classWriter, bArr, i, i2, i3).length + 6;
        }
        return i4;
    }

    static int computeAttributesSize(org.objectweb.asm.SymbolTable symbolTable, int i, int i2) {
        int i3;
        if ((i & 4096) == 0 || symbolTable.getMajorVersion() >= 49) {
            i3 = 0;
        } else {
            symbolTable.addConstantUtf8("Synthetic");
            i3 = 6;
        }
        if (i2 != 0) {
            symbolTable.addConstantUtf8("Signature");
            i3 += 8;
        }
        if ((i & 131072) == 0) {
            return i3;
        }
        symbolTable.addConstantUtf8("Deprecated");
        return i3 + 6;
    }

    final void putAttributes(org.objectweb.asm.SymbolTable symbolTable, org.objectweb.asm.ByteVector byteVector) {
        putAttributes(symbolTable, null, 0, -1, -1, byteVector);
    }

    final void putAttributes(org.objectweb.asm.SymbolTable symbolTable, byte[] bArr, int i, int i2, int i3, org.objectweb.asm.ByteVector byteVector) {
        org.objectweb.asm.ClassWriter classWriter = symbolTable.classWriter;
        for (org.objectweb.asm.Attribute attribute = this; attribute != null; attribute = attribute.nextAttribute) {
            org.objectweb.asm.ByteVector byteVectorWrite = attribute.write(classWriter, bArr, i, i2, i3);
            byteVector.putShort(symbolTable.addConstantUtf8(attribute.type)).putInt(byteVectorWrite.length);
            byteVector.putByteArray(byteVectorWrite.data, 0, byteVectorWrite.length);
        }
    }

    static void putAttributes(org.objectweb.asm.SymbolTable symbolTable, int i, int i2, org.objectweb.asm.ByteVector byteVector) {
        if ((i & 4096) != 0 && symbolTable.getMajorVersion() < 49) {
            byteVector.putShort(symbolTable.addConstantUtf8("Synthetic")).putInt(0);
        }
        if (i2 != 0) {
            byteVector.putShort(symbolTable.addConstantUtf8("Signature")).putInt(2).putShort(i2);
        }
        if ((i & 131072) != 0) {
            byteVector.putShort(symbolTable.addConstantUtf8("Deprecated")).putInt(0);
        }
    }

    static final class Set {
        private static final int SIZE_INCREMENT = 6;
        private org.objectweb.asm.Attribute[] data = new org.objectweb.asm.Attribute[6];
        private int size;

        Set() {
        }

        void addAttributes(org.objectweb.asm.Attribute attribute) {
            while (attribute != null) {
                if (!contains(attribute)) {
                    add(attribute);
                }
                attribute = attribute.nextAttribute;
            }
        }

        org.objectweb.asm.Attribute[] toArray() {
            int i = this.size;
            org.objectweb.asm.Attribute[] attributeArr = new org.objectweb.asm.Attribute[i];
            java.lang.System.arraycopy(this.data, 0, attributeArr, 0, i);
            return attributeArr;
        }

        private boolean contains(org.objectweb.asm.Attribute attribute) {
            for (int i = 0; i < this.size; i++) {
                if (this.data[i].type.equals(attribute.type)) {
                    return true;
                }
            }
            return false;
        }

        private void add(org.objectweb.asm.Attribute attribute) {
            int i = this.size;
            org.objectweb.asm.Attribute[] attributeArr = this.data;
            if (i >= attributeArr.length) {
                org.objectweb.asm.Attribute[] attributeArr2 = new org.objectweb.asm.Attribute[attributeArr.length + 6];
                java.lang.System.arraycopy(attributeArr, 0, attributeArr2, 0, i);
                this.data = attributeArr2;
            }
            org.objectweb.asm.Attribute[] attributeArr3 = this.data;
            int i2 = this.size;
            this.size = i2 + 1;
            attributeArr3[i2] = attribute;
        }
    }
}
