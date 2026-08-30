package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
final class RecordComponentWriter extends org.objectweb.asm.RecordComponentVisitor {
    private final int descriptorIndex;
    private org.objectweb.asm.Attribute firstAttribute;
    private org.objectweb.asm.AnnotationWriter lastRuntimeInvisibleAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeVisibleAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeVisibleTypeAnnotation;
    private final int nameIndex;
    private int signatureIndex;
    private final org.objectweb.asm.SymbolTable symbolTable;

    @Override // org.objectweb.asm.RecordComponentVisitor
    public void visitEnd() {
    }

    RecordComponentWriter(org.objectweb.asm.SymbolTable symbolTable, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(589824);
        this.symbolTable = symbolTable;
        this.nameIndex = symbolTable.addConstantUtf8(str);
        this.descriptorIndex = symbolTable.addConstantUtf8(str2);
        if (str3 != null) {
            this.signatureIndex = symbolTable.addConstantUtf8(str3);
        }
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
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

    @Override // org.objectweb.asm.RecordComponentVisitor
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

    @Override // org.objectweb.asm.RecordComponentVisitor
    public void visitAttribute(org.objectweb.asm.Attribute attribute) {
        attribute.nextAttribute = this.firstAttribute;
        this.firstAttribute = attribute;
    }

    int computeRecordComponentInfoSize() {
        int iComputeAttributesSize = org.objectweb.asm.Attribute.computeAttributesSize(this.symbolTable, 0, this.signatureIndex) + 6 + org.objectweb.asm.AnnotationWriter.computeAnnotationsSize(this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation);
        org.objectweb.asm.Attribute attribute = this.firstAttribute;
        return attribute != null ? iComputeAttributesSize + attribute.computeAttributesSize(this.symbolTable) : iComputeAttributesSize;
    }

    void putRecordComponentInfo(org.objectweb.asm.ByteVector byteVector) {
        byteVector.putShort(this.nameIndex).putShort(this.descriptorIndex);
        int attributeCount = this.signatureIndex != 0 ? 1 : 0;
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
        org.objectweb.asm.Attribute.putAttributes(this.symbolTable, 0, this.signatureIndex, byteVector);
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
