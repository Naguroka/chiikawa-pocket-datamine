package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
public class ClassWriter extends org.objectweb.asm.ClassVisitor {
    public static final int COMPUTE_FRAMES = 2;
    public static final int COMPUTE_MAXS = 1;
    private int accessFlags;
    private int compute;
    private org.objectweb.asm.ByteVector debugExtension;
    private int enclosingClassIndex;
    private int enclosingMethodIndex;
    private org.objectweb.asm.Attribute firstAttribute;
    private org.objectweb.asm.FieldWriter firstField;
    private org.objectweb.asm.MethodWriter firstMethod;
    private org.objectweb.asm.RecordComponentWriter firstRecordComponent;
    private org.objectweb.asm.ByteVector innerClasses;
    private int interfaceCount;
    private int[] interfaces;
    private org.objectweb.asm.FieldWriter lastField;
    private org.objectweb.asm.MethodWriter lastMethod;
    private org.objectweb.asm.RecordComponentWriter lastRecordComponent;
    private org.objectweb.asm.AnnotationWriter lastRuntimeInvisibleAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeVisibleAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeVisibleTypeAnnotation;
    private org.objectweb.asm.ModuleWriter moduleWriter;
    private int nestHostClassIndex;
    private org.objectweb.asm.ByteVector nestMemberClasses;
    private int numberOfInnerClasses;
    private int numberOfNestMemberClasses;
    private int numberOfPermittedSubclasses;
    private org.objectweb.asm.ByteVector permittedSubclasses;
    private int signatureIndex;
    private int sourceFileIndex;
    private int superClass;
    private final org.objectweb.asm.SymbolTable symbolTable;
    private int thisClass;
    private int version;

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitEnd() {
    }

    public ClassWriter(int i) {
        this(null, i);
    }

    public ClassWriter(org.objectweb.asm.ClassReader classReader, int i) {
        super(589824);
        this.symbolTable = classReader == null ? new org.objectweb.asm.SymbolTable(this) : new org.objectweb.asm.SymbolTable(this, classReader);
        if ((i & 2) != 0) {
            this.compute = 4;
        } else if ((i & 1) != 0) {
            this.compute = 1;
        } else {
            this.compute = 0;
        }
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visit(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        this.version = i;
        this.accessFlags = i2;
        int i3 = i & 65535;
        this.thisClass = this.symbolTable.setMajorVersionAndClassName(i3, str);
        if (str2 != null) {
            this.signatureIndex = this.symbolTable.addConstantUtf8(str2);
        }
        this.superClass = str3 == null ? 0 : this.symbolTable.addConstantClass(str3).index;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.interfaceCount = length;
            this.interfaces = new int[length];
            for (int i4 = 0; i4 < this.interfaceCount; i4++) {
                this.interfaces[i4] = this.symbolTable.addConstantClass(strArr[i4]).index;
            }
        }
        if (this.compute != 1 || i3 < 51) {
            return;
        }
        this.compute = 2;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitSource(java.lang.String str, java.lang.String str2) {
        if (str != null) {
            this.sourceFileIndex = this.symbolTable.addConstantUtf8(str);
        }
        if (str2 != null) {
            this.debugExtension = new org.objectweb.asm.ByteVector().encodeUtf8(str2, 0, Integer.MAX_VALUE);
        }
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.ModuleVisitor visitModule(java.lang.String str, int i, java.lang.String str2) {
        org.objectweb.asm.SymbolTable symbolTable = this.symbolTable;
        org.objectweb.asm.ModuleWriter moduleWriter = new org.objectweb.asm.ModuleWriter(symbolTable, symbolTable.addConstantModule(str).index, i, str2 == null ? 0 : this.symbolTable.addConstantUtf8(str2));
        this.moduleWriter = moduleWriter;
        return moduleWriter;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitNestHost(java.lang.String str) {
        this.nestHostClassIndex = this.symbolTable.addConstantClass(str).index;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitOuterClass(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.enclosingClassIndex = this.symbolTable.addConstantClass(str).index;
        if (str2 == null || str3 == null) {
            return;
        }
        this.enclosingMethodIndex = this.symbolTable.addConstantNameAndType(str2, str3);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, boolean z) {
        if (z) {
            org.objectweb.asm.AnnotationWriter annotationWriterCreate = org.objectweb.asm.AnnotationWriter.create(this.symbolTable, str, this.lastRuntimeVisibleAnnotation);
            this.lastRuntimeVisibleAnnotation = annotationWriterCreate;
            return annotationWriterCreate;
        }
        org.objectweb.asm.AnnotationWriter annotationWriterCreate2 = org.objectweb.asm.AnnotationWriter.create(this.symbolTable, str, this.lastRuntimeInvisibleAnnotation);
        this.lastRuntimeInvisibleAnnotation = annotationWriterCreate2;
        return annotationWriterCreate2;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        if (z) {
            org.objectweb.asm.AnnotationWriter annotationWriterCreate = org.objectweb.asm.AnnotationWriter.create(this.symbolTable, i, typePath, str, this.lastRuntimeVisibleTypeAnnotation);
            this.lastRuntimeVisibleTypeAnnotation = annotationWriterCreate;
            return annotationWriterCreate;
        }
        org.objectweb.asm.AnnotationWriter annotationWriterCreate2 = org.objectweb.asm.AnnotationWriter.create(this.symbolTable, i, typePath, str, this.lastRuntimeInvisibleTypeAnnotation);
        this.lastRuntimeInvisibleTypeAnnotation = annotationWriterCreate2;
        return annotationWriterCreate2;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitAttribute(org.objectweb.asm.Attribute attribute) {
        attribute.nextAttribute = this.firstAttribute;
        this.firstAttribute = attribute;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitNestMember(java.lang.String str) {
        if (this.nestMemberClasses == null) {
            this.nestMemberClasses = new org.objectweb.asm.ByteVector();
        }
        this.numberOfNestMemberClasses++;
        this.nestMemberClasses.putShort(this.symbolTable.addConstantClass(str).index);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitPermittedSubclass(java.lang.String str) {
        if (this.permittedSubclasses == null) {
            this.permittedSubclasses = new org.objectweb.asm.ByteVector();
        }
        this.numberOfPermittedSubclasses++;
        this.permittedSubclasses.putShort(this.symbolTable.addConstantClass(str).index);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitInnerClass(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        if (this.innerClasses == null) {
            this.innerClasses = new org.objectweb.asm.ByteVector();
        }
        org.objectweb.asm.Symbol symbolAddConstantClass = this.symbolTable.addConstantClass(str);
        if (symbolAddConstantClass.info == 0) {
            this.numberOfInnerClasses++;
            this.innerClasses.putShort(symbolAddConstantClass.index);
            this.innerClasses.putShort(str2 == null ? 0 : this.symbolTable.addConstantClass(str2).index);
            this.innerClasses.putShort(str3 != null ? this.symbolTable.addConstantUtf8(str3) : 0);
            this.innerClasses.putShort(i);
            symbolAddConstantClass.info = this.numberOfInnerClasses;
        }
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.RecordComponentVisitor visitRecordComponent(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.objectweb.asm.RecordComponentWriter recordComponentWriter = new org.objectweb.asm.RecordComponentWriter(this.symbolTable, str, str2, str3);
        if (this.firstRecordComponent == null) {
            this.firstRecordComponent = recordComponentWriter;
        } else {
            this.lastRecordComponent.delegate = recordComponentWriter;
        }
        this.lastRecordComponent = recordComponentWriter;
        return recordComponentWriter;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.FieldVisitor visitField(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        org.objectweb.asm.FieldWriter fieldWriter = new org.objectweb.asm.FieldWriter(this.symbolTable, i, str, str2, str3, obj);
        if (this.firstField == null) {
            this.firstField = fieldWriter;
        } else {
            this.lastField.fv = fieldWriter;
        }
        this.lastField = fieldWriter;
        return fieldWriter;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.MethodVisitor visitMethod(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        org.objectweb.asm.MethodWriter methodWriter = new org.objectweb.asm.MethodWriter(this.symbolTable, i, str, str2, str3, strArr, this.compute);
        if (this.firstMethod == null) {
            this.firstMethod = methodWriter;
        } else {
            this.lastMethod.mv = methodWriter;
        }
        this.lastMethod = methodWriter;
        return methodWriter;
    }

    public byte[] toByteArray() {
        int attributeCount;
        int iComputeRecordComponentInfoSize;
        int i;
        int i2;
        int i3;
        int iComputeAttributesSize = (this.interfaceCount * 2) + 24;
        int i4 = 0;
        for (org.objectweb.asm.FieldWriter fieldWriter = this.firstField; fieldWriter != null; fieldWriter = (org.objectweb.asm.FieldWriter) fieldWriter.fv) {
            i4++;
            iComputeAttributesSize += fieldWriter.computeFieldInfoSize();
        }
        int i5 = 0;
        for (org.objectweb.asm.MethodWriter methodWriter = this.firstMethod; methodWriter != null; methodWriter = (org.objectweb.asm.MethodWriter) methodWriter.mv) {
            i5++;
            iComputeAttributesSize += methodWriter.computeMethodInfoSize();
        }
        org.objectweb.asm.ByteVector byteVector = this.innerClasses;
        if (byteVector != null) {
            iComputeAttributesSize += byteVector.length + 8;
            this.symbolTable.addConstantUtf8("InnerClasses");
            attributeCount = 1;
        } else {
            attributeCount = 0;
        }
        if (this.enclosingClassIndex != 0) {
            attributeCount++;
            iComputeAttributesSize += 10;
            this.symbolTable.addConstantUtf8("EnclosingMethod");
        }
        if ((this.accessFlags & 4096) != 0 && (this.version & 65535) < 49) {
            attributeCount++;
            iComputeAttributesSize += 6;
            this.symbolTable.addConstantUtf8("Synthetic");
        }
        if (this.signatureIndex != 0) {
            attributeCount++;
            iComputeAttributesSize += 8;
            this.symbolTable.addConstantUtf8("Signature");
        }
        if (this.sourceFileIndex != 0) {
            attributeCount++;
            iComputeAttributesSize += 8;
            this.symbolTable.addConstantUtf8("SourceFile");
        }
        org.objectweb.asm.ByteVector byteVector2 = this.debugExtension;
        if (byteVector2 != null) {
            attributeCount++;
            iComputeAttributesSize += byteVector2.length + 6;
            this.symbolTable.addConstantUtf8("SourceDebugExtension");
        }
        if ((this.accessFlags & 131072) != 0) {
            attributeCount++;
            iComputeAttributesSize += 6;
            this.symbolTable.addConstantUtf8("Deprecated");
        }
        org.objectweb.asm.AnnotationWriter annotationWriter = this.lastRuntimeVisibleAnnotation;
        if (annotationWriter != null) {
            attributeCount++;
            iComputeAttributesSize += annotationWriter.computeAnnotationsSize("RuntimeVisibleAnnotations");
        }
        org.objectweb.asm.AnnotationWriter annotationWriter2 = this.lastRuntimeInvisibleAnnotation;
        if (annotationWriter2 != null) {
            attributeCount++;
            iComputeAttributesSize += annotationWriter2.computeAnnotationsSize("RuntimeInvisibleAnnotations");
        }
        org.objectweb.asm.AnnotationWriter annotationWriter3 = this.lastRuntimeVisibleTypeAnnotation;
        if (annotationWriter3 != null) {
            attributeCount++;
            iComputeAttributesSize += annotationWriter3.computeAnnotationsSize("RuntimeVisibleTypeAnnotations");
        }
        org.objectweb.asm.AnnotationWriter annotationWriter4 = this.lastRuntimeInvisibleTypeAnnotation;
        if (annotationWriter4 != null) {
            attributeCount++;
            iComputeAttributesSize += annotationWriter4.computeAnnotationsSize("RuntimeInvisibleTypeAnnotations");
        }
        if (this.symbolTable.computeBootstrapMethodsSize() > 0) {
            attributeCount++;
            iComputeAttributesSize += this.symbolTable.computeBootstrapMethodsSize();
        }
        org.objectweb.asm.ModuleWriter moduleWriter = this.moduleWriter;
        if (moduleWriter != null) {
            attributeCount += moduleWriter.getAttributeCount();
            iComputeAttributesSize += this.moduleWriter.computeAttributesSize();
        }
        if (this.nestHostClassIndex != 0) {
            attributeCount++;
            iComputeAttributesSize += 8;
            this.symbolTable.addConstantUtf8("NestHost");
        }
        org.objectweb.asm.ByteVector byteVector3 = this.nestMemberClasses;
        if (byteVector3 != null) {
            attributeCount++;
            iComputeAttributesSize += byteVector3.length + 8;
            this.symbolTable.addConstantUtf8("NestMembers");
        }
        org.objectweb.asm.ByteVector byteVector4 = this.permittedSubclasses;
        if (byteVector4 != null) {
            attributeCount++;
            iComputeAttributesSize += byteVector4.length + 8;
            this.symbolTable.addConstantUtf8("PermittedSubclasses");
        }
        if ((this.accessFlags & 65536) == 0 && this.firstRecordComponent == null) {
            iComputeRecordComponentInfoSize = 0;
            i = 0;
        } else {
            iComputeRecordComponentInfoSize = 0;
            i = 0;
            for (org.objectweb.asm.RecordComponentWriter recordComponentWriter = this.firstRecordComponent; recordComponentWriter != null; recordComponentWriter = (org.objectweb.asm.RecordComponentWriter) recordComponentWriter.delegate) {
                i++;
                iComputeRecordComponentInfoSize += recordComponentWriter.computeRecordComponentInfoSize();
            }
            attributeCount++;
            iComputeAttributesSize += iComputeRecordComponentInfoSize + 8;
            this.symbolTable.addConstantUtf8("Record");
        }
        org.objectweb.asm.Attribute attribute = this.firstAttribute;
        if (attribute != null) {
            int attributeCount2 = attributeCount + attribute.getAttributeCount();
            iComputeAttributesSize += this.firstAttribute.computeAttributesSize(this.symbolTable);
            attributeCount = attributeCount2;
        }
        int constantPoolLength = iComputeAttributesSize + this.symbolTable.getConstantPoolLength();
        int constantPoolCount = this.symbolTable.getConstantPoolCount();
        if (constantPoolCount > 65535) {
            throw new org.objectweb.asm.ClassTooLargeException(this.symbolTable.getClassName(), constantPoolCount);
        }
        org.objectweb.asm.ByteVector byteVector5 = new org.objectweb.asm.ByteVector(constantPoolLength);
        byteVector5.putInt(org.jacoco.core.internal.ContentTypeDetector.CLASSFILE).putInt(this.version);
        this.symbolTable.putConstantPool(byteVector5);
        byteVector5.putShort((~((this.version & 65535) < 49 ? 4096 : 0)) & this.accessFlags).putShort(this.thisClass).putShort(this.superClass);
        byteVector5.putShort(this.interfaceCount);
        for (int i6 = 0; i6 < this.interfaceCount; i6++) {
            byteVector5.putShort(this.interfaces[i6]);
        }
        byteVector5.putShort(i4);
        for (org.objectweb.asm.FieldWriter fieldWriter2 = this.firstField; fieldWriter2 != null; fieldWriter2 = (org.objectweb.asm.FieldWriter) fieldWriter2.fv) {
            fieldWriter2.putFieldInfo(byteVector5);
        }
        byteVector5.putShort(i5);
        boolean zHasFrames = false;
        boolean zHasAsmInstructions = false;
        for (org.objectweb.asm.MethodWriter methodWriter2 = this.firstMethod; methodWriter2 != null; methodWriter2 = (org.objectweb.asm.MethodWriter) methodWriter2.mv) {
            zHasFrames |= methodWriter2.hasFrames();
            zHasAsmInstructions |= methodWriter2.hasAsmInstructions();
            methodWriter2.putMethodInfo(byteVector5);
        }
        byteVector5.putShort(attributeCount);
        if (this.innerClasses != null) {
            byteVector5.putShort(this.symbolTable.addConstantUtf8("InnerClasses")).putInt(this.innerClasses.length + 2).putShort(this.numberOfInnerClasses).putByteArray(this.innerClasses.data, 0, this.innerClasses.length);
        }
        if (this.enclosingClassIndex != 0) {
            byteVector5.putShort(this.symbolTable.addConstantUtf8("EnclosingMethod")).putInt(4).putShort(this.enclosingClassIndex).putShort(this.enclosingMethodIndex);
        }
        if ((this.accessFlags & 4096) != 0 && (this.version & 65535) < 49) {
            byteVector5.putShort(this.symbolTable.addConstantUtf8("Synthetic")).putInt(0);
        }
        if (this.signatureIndex != 0) {
            i2 = 2;
            byteVector5.putShort(this.symbolTable.addConstantUtf8("Signature")).putInt(2).putShort(this.signatureIndex);
        } else {
            i2 = 2;
        }
        if (this.sourceFileIndex != 0) {
            byteVector5.putShort(this.symbolTable.addConstantUtf8("SourceFile")).putInt(i2).putShort(this.sourceFileIndex);
        }
        org.objectweb.asm.ByteVector byteVector6 = this.debugExtension;
        if (byteVector6 != null) {
            int i7 = byteVector6.length;
            i3 = 0;
            byteVector5.putShort(this.symbolTable.addConstantUtf8("SourceDebugExtension")).putInt(i7).putByteArray(this.debugExtension.data, 0, i7);
        } else {
            i3 = 0;
        }
        if ((this.accessFlags & 131072) != 0) {
            byteVector5.putShort(this.symbolTable.addConstantUtf8("Deprecated")).putInt(i3);
        }
        org.objectweb.asm.AnnotationWriter.putAnnotations(this.symbolTable, this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation, byteVector5);
        this.symbolTable.putBootstrapMethods(byteVector5);
        org.objectweb.asm.ModuleWriter moduleWriter2 = this.moduleWriter;
        if (moduleWriter2 != null) {
            moduleWriter2.putAttributes(byteVector5);
        }
        if (this.nestHostClassIndex != 0) {
            byteVector5.putShort(this.symbolTable.addConstantUtf8("NestHost")).putInt(2).putShort(this.nestHostClassIndex);
        }
        if (this.nestMemberClasses != null) {
            byteVector5.putShort(this.symbolTable.addConstantUtf8("NestMembers")).putInt(this.nestMemberClasses.length + 2).putShort(this.numberOfNestMemberClasses).putByteArray(this.nestMemberClasses.data, 0, this.nestMemberClasses.length);
        }
        if (this.permittedSubclasses != null) {
            byteVector5.putShort(this.symbolTable.addConstantUtf8("PermittedSubclasses")).putInt(this.permittedSubclasses.length + 2).putShort(this.numberOfPermittedSubclasses).putByteArray(this.permittedSubclasses.data, 0, this.permittedSubclasses.length);
        }
        if ((this.accessFlags & 65536) != 0 || this.firstRecordComponent != null) {
            byteVector5.putShort(this.symbolTable.addConstantUtf8("Record")).putInt(iComputeRecordComponentInfoSize + 2).putShort(i);
            for (org.objectweb.asm.RecordComponentWriter recordComponentWriter2 = this.firstRecordComponent; recordComponentWriter2 != null; recordComponentWriter2 = (org.objectweb.asm.RecordComponentWriter) recordComponentWriter2.delegate) {
                recordComponentWriter2.putRecordComponentInfo(byteVector5);
            }
        }
        org.objectweb.asm.Attribute attribute2 = this.firstAttribute;
        if (attribute2 != null) {
            attribute2.putAttributes(this.symbolTable, byteVector5);
        }
        if (zHasAsmInstructions) {
            return replaceAsmInstructions(byteVector5.data, zHasFrames);
        }
        return byteVector5.data;
    }

    private byte[] replaceAsmInstructions(byte[] bArr, boolean z) {
        org.objectweb.asm.Attribute[] attributePrototypes = getAttributePrototypes();
        this.firstField = null;
        this.lastField = null;
        this.firstMethod = null;
        this.lastMethod = null;
        this.lastRuntimeVisibleAnnotation = null;
        this.lastRuntimeInvisibleAnnotation = null;
        this.lastRuntimeVisibleTypeAnnotation = null;
        this.lastRuntimeInvisibleTypeAnnotation = null;
        this.moduleWriter = null;
        this.nestHostClassIndex = 0;
        this.numberOfNestMemberClasses = 0;
        this.nestMemberClasses = null;
        this.numberOfPermittedSubclasses = 0;
        this.permittedSubclasses = null;
        this.firstRecordComponent = null;
        this.lastRecordComponent = null;
        this.firstAttribute = null;
        this.compute = z ? 3 : 0;
        new org.objectweb.asm.ClassReader(bArr, 0, false).accept(this, attributePrototypes, (z ? 8 : 0) | 256);
        return toByteArray();
    }

    private org.objectweb.asm.Attribute[] getAttributePrototypes() {
        org.objectweb.asm.Attribute.Set set = new org.objectweb.asm.Attribute.Set();
        set.addAttributes(this.firstAttribute);
        for (org.objectweb.asm.FieldWriter fieldWriter = this.firstField; fieldWriter != null; fieldWriter = (org.objectweb.asm.FieldWriter) fieldWriter.fv) {
            fieldWriter.collectAttributePrototypes(set);
        }
        for (org.objectweb.asm.MethodWriter methodWriter = this.firstMethod; methodWriter != null; methodWriter = (org.objectweb.asm.MethodWriter) methodWriter.mv) {
            methodWriter.collectAttributePrototypes(set);
        }
        for (org.objectweb.asm.RecordComponentWriter recordComponentWriter = this.firstRecordComponent; recordComponentWriter != null; recordComponentWriter = (org.objectweb.asm.RecordComponentWriter) recordComponentWriter.delegate) {
            recordComponentWriter.collectAttributePrototypes(set);
        }
        return set.toArray();
    }

    public int newConst(java.lang.Object obj) {
        return this.symbolTable.addConstant(obj).index;
    }

    public int newUTF8(java.lang.String str) {
        return this.symbolTable.addConstantUtf8(str);
    }

    public int newClass(java.lang.String str) {
        return this.symbolTable.addConstantClass(str).index;
    }

    public int newMethodType(java.lang.String str) {
        return this.symbolTable.addConstantMethodType(str).index;
    }

    public int newModule(java.lang.String str) {
        return this.symbolTable.addConstantModule(str).index;
    }

    public int newPackage(java.lang.String str) {
        return this.symbolTable.addConstantPackage(str).index;
    }

    @java.lang.Deprecated
    public int newHandle(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return newHandle(i, str, str2, str3, i == 9);
    }

    public int newHandle(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        return this.symbolTable.addConstantMethodHandle(i, str, str2, str3, z).index;
    }

    public int newConstantDynamic(java.lang.String str, java.lang.String str2, org.objectweb.asm.Handle handle, java.lang.Object... objArr) {
        return this.symbolTable.addConstantDynamic(str, str2, handle, objArr).index;
    }

    public int newInvokeDynamic(java.lang.String str, java.lang.String str2, org.objectweb.asm.Handle handle, java.lang.Object... objArr) {
        return this.symbolTable.addConstantInvokeDynamic(str, str2, handle, objArr).index;
    }

    public int newField(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.symbolTable.addConstantFieldref(str, str2, str3).index;
    }

    public int newMethod(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        return this.symbolTable.addConstantMethodref(str, str2, str3, z).index;
    }

    public int newNameType(java.lang.String str, java.lang.String str2) {
        return this.symbolTable.addConstantNameAndType(str, str2);
    }

    protected java.lang.String getCommonSuperClass(java.lang.String str, java.lang.String str2) {
        java.lang.ClassLoader classLoader = getClassLoader();
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str.replace('/', '.'), false, classLoader);
            try {
                java.lang.Class<?> cls2 = java.lang.Class.forName(str2.replace('/', '.'), false, classLoader);
                if (cls.isAssignableFrom(cls2)) {
                    return str;
                }
                if (cls2.isAssignableFrom(cls)) {
                    return str2;
                }
                if (cls.isInterface() || cls2.isInterface()) {
                    return "java/lang/Object";
                }
                do {
                    cls = cls.getSuperclass();
                } while (!cls.isAssignableFrom(cls2));
                return cls.getName().replace('.', '/');
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.TypeNotPresentException(str2, e);
            }
        } catch (java.lang.ClassNotFoundException e2) {
            throw new java.lang.TypeNotPresentException(str, e2);
        }
    }

    protected java.lang.ClassLoader getClassLoader() {
        return getClass().getClassLoader();
    }
}
