package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
final class ModuleWriter extends org.objectweb.asm.ModuleVisitor {
    private final org.objectweb.asm.ByteVector exports;
    private int exportsCount;
    private int mainClassIndex;
    private final int moduleFlags;
    private final int moduleNameIndex;
    private final int moduleVersionIndex;
    private final org.objectweb.asm.ByteVector opens;
    private int opensCount;
    private int packageCount;
    private final org.objectweb.asm.ByteVector packageIndex;
    private final org.objectweb.asm.ByteVector provides;
    private int providesCount;
    private final org.objectweb.asm.ByteVector requires;
    private int requiresCount;
    private final org.objectweb.asm.SymbolTable symbolTable;
    private int usesCount;
    private final org.objectweb.asm.ByteVector usesIndex;

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitEnd() {
    }

    ModuleWriter(org.objectweb.asm.SymbolTable symbolTable, int i, int i2, int i3) {
        super(589824);
        this.symbolTable = symbolTable;
        this.moduleNameIndex = i;
        this.moduleFlags = i2;
        this.moduleVersionIndex = i3;
        this.requires = new org.objectweb.asm.ByteVector();
        this.exports = new org.objectweb.asm.ByteVector();
        this.opens = new org.objectweb.asm.ByteVector();
        this.usesIndex = new org.objectweb.asm.ByteVector();
        this.provides = new org.objectweb.asm.ByteVector();
        this.packageIndex = new org.objectweb.asm.ByteVector();
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitMainClass(java.lang.String str) {
        this.mainClassIndex = this.symbolTable.addConstantClass(str).index;
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitPackage(java.lang.String str) {
        this.packageIndex.putShort(this.symbolTable.addConstantPackage(str).index);
        this.packageCount++;
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitRequire(java.lang.String str, int i, java.lang.String str2) {
        this.requires.putShort(this.symbolTable.addConstantModule(str).index).putShort(i).putShort(str2 == null ? 0 : this.symbolTable.addConstantUtf8(str2));
        this.requiresCount++;
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitExport(java.lang.String str, int i, java.lang.String... strArr) {
        this.exports.putShort(this.symbolTable.addConstantPackage(str).index).putShort(i);
        if (strArr == null) {
            this.exports.putShort(0);
        } else {
            this.exports.putShort(strArr.length);
            for (java.lang.String str2 : strArr) {
                this.exports.putShort(this.symbolTable.addConstantModule(str2).index);
            }
        }
        this.exportsCount++;
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitOpen(java.lang.String str, int i, java.lang.String... strArr) {
        this.opens.putShort(this.symbolTable.addConstantPackage(str).index).putShort(i);
        if (strArr == null) {
            this.opens.putShort(0);
        } else {
            this.opens.putShort(strArr.length);
            for (java.lang.String str2 : strArr) {
                this.opens.putShort(this.symbolTable.addConstantModule(str2).index);
            }
        }
        this.opensCount++;
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitUse(java.lang.String str) {
        this.usesIndex.putShort(this.symbolTable.addConstantClass(str).index);
        this.usesCount++;
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitProvide(java.lang.String str, java.lang.String... strArr) {
        this.provides.putShort(this.symbolTable.addConstantClass(str).index);
        this.provides.putShort(strArr.length);
        for (java.lang.String str2 : strArr) {
            this.provides.putShort(this.symbolTable.addConstantClass(str2).index);
        }
        this.providesCount++;
    }

    int getAttributeCount() {
        return (this.packageCount > 0 ? 1 : 0) + 1 + (this.mainClassIndex > 0 ? 1 : 0);
    }

    int computeAttributesSize() {
        this.symbolTable.addConstantUtf8("Module");
        int i = this.requires.length + 22 + this.exports.length + this.opens.length + this.usesIndex.length + this.provides.length;
        if (this.packageCount > 0) {
            this.symbolTable.addConstantUtf8("ModulePackages");
            i += this.packageIndex.length + 8;
        }
        if (this.mainClassIndex <= 0) {
            return i;
        }
        this.symbolTable.addConstantUtf8("ModuleMainClass");
        return i + 8;
    }

    void putAttributes(org.objectweb.asm.ByteVector byteVector) {
        byteVector.putShort(this.symbolTable.addConstantUtf8("Module")).putInt(this.requires.length + 16 + this.exports.length + this.opens.length + this.usesIndex.length + this.provides.length).putShort(this.moduleNameIndex).putShort(this.moduleFlags).putShort(this.moduleVersionIndex).putShort(this.requiresCount).putByteArray(this.requires.data, 0, this.requires.length).putShort(this.exportsCount).putByteArray(this.exports.data, 0, this.exports.length).putShort(this.opensCount).putByteArray(this.opens.data, 0, this.opens.length).putShort(this.usesCount).putByteArray(this.usesIndex.data, 0, this.usesIndex.length).putShort(this.providesCount).putByteArray(this.provides.data, 0, this.provides.length);
        if (this.packageCount > 0) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("ModulePackages")).putInt(this.packageIndex.length + 2).putShort(this.packageCount).putByteArray(this.packageIndex.data, 0, this.packageIndex.length);
        }
        if (this.mainClassIndex > 0) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("ModuleMainClass")).putInt(2).putShort(this.mainClassIndex);
        }
    }
}
