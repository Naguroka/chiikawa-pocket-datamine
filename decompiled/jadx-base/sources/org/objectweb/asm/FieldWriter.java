package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
final class FieldWriter extends org.objectweb.asm.FieldVisitor {
    private final int accessFlags;
    private int constantValueIndex;
    private final int descriptorIndex;
    private org.objectweb.asm.Attribute firstAttribute;
    private org.objectweb.asm.AnnotationWriter lastRuntimeInvisibleAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeVisibleAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeVisibleTypeAnnotation;
    private final int nameIndex;
    private int signatureIndex;
    private final org.objectweb.asm.SymbolTable symbolTable;

    @Override // org.objectweb.asm.FieldVisitor
    public void visitEnd() {
    }

    FieldWriter(org.objectweb.asm.SymbolTable symbolTable, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        super(589824);
        this.symbolTable = symbolTable;
        this.accessFlags = i;
        this.nameIndex = symbolTable.addConstantUtf8(str);
        this.descriptorIndex = symbolTable.addConstantUtf8(str2);
        if (str3 != null) {
            this.signatureIndex = symbolTable.addConstantUtf8(str3);
        }
        if (obj != null) {
            this.constantValueIndex = symbolTable.addConstant(obj).index;
        }
    }

    @Override // org.objectweb.asm.FieldVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, boolean z) {
        if (z) {
            org.objectweb.asm.AnnotationWriter annotationWriterCreate = org.objectweb.asm.AnnotationWriter.create(this.symbolTable, str, this.lastRuntimeVisibleAnnotation);
            this.lastRuntimeVisibleAnnotation = annotationWriterCreate;
            return annotationWriterCreate;
        }
        org.objectweb.asm.AnnotationWriter annotationWriterCreate2 = org.objectweb.asm.AnnotationWriter.create(this.symbolTable, str, this.lastRuntimeInvisibleAnnotation);
        this.lastRuntimeInvisibleAnnotation = annotationWriterCreate2;
        return annotationWriterCreate2;
    }

    @Override // org.objectweb.asm.FieldVisitor
    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        if (z) {
            org.objectweb.asm.AnnotationWriter annotationWriterCreate = org.objectweb.asm.AnnotationWriter.create(this.symbolTable, i, typePath, str, this.lastRuntimeVisibleTypeAnnotation);
            this.lastRuntimeVisibleTypeAnnotation = annotationWriterCreate;
            return annotationWriterCreate;
        }
        org.objectweb.asm.AnnotationWriter annotationWriterCreate2 = org.objectweb.asm.AnnotationWriter.create(this.symbolTable, i, typePath, str, this.lastRuntimeInvisibleTypeAnnotation);
        this.lastRuntimeInvisibleTypeAnnotation = annotationWriterCreate2;
        return annotationWriterCreate2;
    }

    @Override // org.objectweb.asm.FieldVisitor
    public void visitAttribute(org.objectweb.asm.Attribute attribute) {
        attribute.nextAttribute = this.firstAttribute;
        this.firstAttribute = attribute;
    }

    int computeFieldInfoSize() {
        int i;
        if (this.constantValueIndex != 0) {
            this.symbolTable.addConstantUtf8("ConstantValue");
            i = 16;
        } else {
            i = 8;
        }
        int iComputeAttributesSize = i + org.objectweb.asm.Attribute.computeAttributesSize(this.symbolTable, this.accessFlags, this.signatureIndex) + org.objectweb.asm.AnnotationWriter.computeAnnotationsSize(this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation);
        org.objectweb.asm.Attribute attribute = this.firstAttribute;
        return attribute != null ? iComputeAttributesSize + attribute.computeAttributesSize(this.symbolTable) : iComputeAttributesSize;
    }

    void putFieldInfo(org.objectweb.asm.ByteVector byteVector) {
        boolean z = this.symbolTable.getMajorVersion() < 49;
        byteVector.putShort((~(z ? 4096 : 0)) & this.accessFlags).putShort(this.nameIndex).putShort(this.descriptorIndex);
        int attributeCount = this.constantValueIndex != 0 ? 1 : 0;
        int i = this.accessFlags;
        if ((i & 4096) != 0 && z) {
            attributeCount++;
        }
        if (this.signatureIndex != 0) {
            attributeCount++;
        }
        if ((131072 & i) != 0) {
            attributeCount++;
        }
        if (this.lastRuntimeVisibleAnnotation != null) {
            attributeCount++;
        }
        if (this.lastRuntimeInvisibleAnnotation != null) {
            attributeCount++;
        }
        if (this.lastRuntimeVisibleTypeAnnotation != null) {
            attributeCount++;
        }
        if (this.lastRuntimeInvisibleTypeAnnotation != null) {
            attributeCount++;
        }
        org.objectweb.asm.Attribute attribute = this.firstAttribute;
        if (attribute != null) {
            attributeCount += attribute.getAttributeCount();
        }
        byteVector.putShort(attributeCount);
        if (this.constantValueIndex != 0) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("ConstantValue")).putInt(2).putShort(this.constantValueIndex);
        }
        org.objectweb.asm.Attribute.putAttributes(this.symbolTable, this.accessFlags, this.signatureIndex, byteVector);
        org.objectweb.asm.AnnotationWriter.putAnnotations(this.symbolTable, this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation, byteVector);
        org.objectweb.asm.Attribute attribute2 = this.firstAttribute;
        if (attribute2 != null) {
            attribute2.putAttributes(this.symbolTable, byteVector);
        }
    }

    final void collectAttributePrototypes(org.objectweb.asm.Attribute.Set set) {
        set.addAttributes(this.firstAttribute);
    }
}
