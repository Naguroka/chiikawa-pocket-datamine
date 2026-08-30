package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
final class AnnotationWriter extends org.objectweb.asm.AnnotationVisitor {
    private final org.objectweb.asm.ByteVector annotation;
    private org.objectweb.asm.AnnotationWriter nextAnnotation;
    private int numElementValuePairs;
    private final int numElementValuePairsOffset;
    private final org.objectweb.asm.AnnotationWriter previousAnnotation;
    private final org.objectweb.asm.SymbolTable symbolTable;
    private final boolean useNamedValues;

    AnnotationWriter(org.objectweb.asm.SymbolTable symbolTable, boolean z, org.objectweb.asm.ByteVector byteVector, org.objectweb.asm.AnnotationWriter annotationWriter) {
        super(589824);
        this.symbolTable = symbolTable;
        this.useNamedValues = z;
        this.annotation = byteVector;
        this.numElementValuePairsOffset = byteVector.length == 0 ? -1 : byteVector.length - 2;
        this.previousAnnotation = annotationWriter;
        if (annotationWriter != null) {
            annotationWriter.nextAnnotation = this;
        }
    }

    static org.objectweb.asm.AnnotationWriter create(org.objectweb.asm.SymbolTable symbolTable, java.lang.String str, org.objectweb.asm.AnnotationWriter annotationWriter) {
        org.objectweb.asm.ByteVector byteVector = new org.objectweb.asm.ByteVector();
        byteVector.putShort(symbolTable.addConstantUtf8(str)).putShort(0);
        return new org.objectweb.asm.AnnotationWriter(symbolTable, true, byteVector, annotationWriter);
    }

    static org.objectweb.asm.AnnotationWriter create(org.objectweb.asm.SymbolTable symbolTable, int i, org.objectweb.asm.TypePath typePath, java.lang.String str, org.objectweb.asm.AnnotationWriter annotationWriter) {
        org.objectweb.asm.ByteVector byteVector = new org.objectweb.asm.ByteVector();
        org.objectweb.asm.TypeReference.putTarget(i, byteVector);
        org.objectweb.asm.TypePath.put(typePath, byteVector);
        byteVector.putShort(symbolTable.addConstantUtf8(str)).putShort(0);
        return new org.objectweb.asm.AnnotationWriter(symbolTable, true, byteVector, annotationWriter);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // org.objectweb.asm.AnnotationVisitor
    public void visit(java.lang.String str, java.lang.Object obj) {
        this.numElementValuePairs++;
        if (this.useNamedValues) {
            this.annotation.putShort(this.symbolTable.addConstantUtf8(str));
        }
        if (obj instanceof java.lang.String) {
            this.annotation.put12(115, this.symbolTable.addConstantUtf8((java.lang.String) obj));
            return;
        }
        if (obj instanceof java.lang.Byte) {
            this.annotation.put12(66, this.symbolTable.addConstantInteger(((java.lang.Byte) obj).byteValue()).index);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            this.annotation.put12(90, this.symbolTable.addConstantInteger(((java.lang.Boolean) obj).booleanValue() ? 1 : 0).index);
            return;
        }
        if (obj instanceof java.lang.Character) {
            this.annotation.put12(67, this.symbolTable.addConstantInteger(((java.lang.Character) obj).charValue()).index);
            return;
        }
        if (obj instanceof java.lang.Short) {
            this.annotation.put12(83, this.symbolTable.addConstantInteger(((java.lang.Short) obj).shortValue()).index);
            return;
        }
        if (obj instanceof org.objectweb.asm.Type) {
            this.annotation.put12(99, this.symbolTable.addConstantUtf8(((org.objectweb.asm.Type) obj).getDescriptor()));
            return;
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            this.annotation.put12(91, bArr.length);
            int length = bArr.length;
            while (i < length) {
                this.annotation.put12(66, this.symbolTable.addConstantInteger(bArr[i]).index);
                i++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            this.annotation.put12(91, zArr.length);
            int length2 = zArr.length;
            while (i < length2) {
                this.annotation.put12(90, this.symbolTable.addConstantInteger(zArr[i] ? 1 : 0).index);
                i++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            this.annotation.put12(91, sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                this.annotation.put12(83, this.symbolTable.addConstantInteger(sArr[i]).index);
                i++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            this.annotation.put12(91, cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                this.annotation.put12(67, this.symbolTable.addConstantInteger(cArr[i]).index);
                i++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            this.annotation.put12(91, iArr.length);
            int length5 = iArr.length;
            while (i < length5) {
                this.annotation.put12(73, this.symbolTable.addConstantInteger(iArr[i]).index);
                i++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            this.annotation.put12(91, jArr.length);
            int length6 = jArr.length;
            while (i < length6) {
                this.annotation.put12(74, this.symbolTable.addConstantLong(jArr[i]).index);
                i++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            this.annotation.put12(91, fArr.length);
            int length7 = fArr.length;
            while (i < length7) {
                this.annotation.put12(70, this.symbolTable.addConstantFloat(fArr[i]).index);
                i++;
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            this.annotation.put12(91, dArr.length);
            int length8 = dArr.length;
            while (i < length8) {
                this.annotation.put12(68, this.symbolTable.addConstantDouble(dArr[i]).index);
                i++;
            }
            return;
        }
        org.objectweb.asm.Symbol symbolAddConstant = this.symbolTable.addConstant(obj);
        this.annotation.put12(".s.IFJDCS".charAt(symbolAddConstant.tag), symbolAddConstant.index);
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnum(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.numElementValuePairs++;
        if (this.useNamedValues) {
            this.annotation.putShort(this.symbolTable.addConstantUtf8(str));
        }
        this.annotation.put12(101, this.symbolTable.addConstantUtf8(str2)).putShort(this.symbolTable.addConstantUtf8(str3));
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, java.lang.String str2) {
        this.numElementValuePairs++;
        if (this.useNamedValues) {
            this.annotation.putShort(this.symbolTable.addConstantUtf8(str));
        }
        this.annotation.put12(64, this.symbolTable.addConstantUtf8(str2)).putShort(0);
        return new org.objectweb.asm.AnnotationWriter(this.symbolTable, true, this.annotation, null);
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public org.objectweb.asm.AnnotationVisitor visitArray(java.lang.String str) {
        this.numElementValuePairs++;
        if (this.useNamedValues) {
            this.annotation.putShort(this.symbolTable.addConstantUtf8(str));
        }
        this.annotation.put12(91, 0);
        return new org.objectweb.asm.AnnotationWriter(this.symbolTable, false, this.annotation, null);
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnd() {
        if (this.numElementValuePairsOffset != -1) {
            byte[] bArr = this.annotation.data;
            int i = this.numElementValuePairsOffset;
            int i2 = this.numElementValuePairs;
            bArr[i] = (byte) (i2 >>> 8);
            bArr[i + 1] = (byte) i2;
        }
    }

    int computeAnnotationsSize(java.lang.String str) {
        if (str != null) {
            this.symbolTable.addConstantUtf8(str);
        }
        int i = 8;
        for (org.objectweb.asm.AnnotationWriter annotationWriter = this; annotationWriter != null; annotationWriter = annotationWriter.previousAnnotation) {
            i += annotationWriter.annotation.length;
        }
        return i;
    }

    static int computeAnnotationsSize(org.objectweb.asm.AnnotationWriter annotationWriter, org.objectweb.asm.AnnotationWriter annotationWriter2, org.objectweb.asm.AnnotationWriter annotationWriter3, org.objectweb.asm.AnnotationWriter annotationWriter4) {
        int iComputeAnnotationsSize = annotationWriter != null ? 0 + annotationWriter.computeAnnotationsSize("RuntimeVisibleAnnotations") : 0;
        if (annotationWriter2 != null) {
            iComputeAnnotationsSize += annotationWriter2.computeAnnotationsSize("RuntimeInvisibleAnnotations");
        }
        if (annotationWriter3 != null) {
            iComputeAnnotationsSize += annotationWriter3.computeAnnotationsSize("RuntimeVisibleTypeAnnotations");
        }
        return annotationWriter4 != null ? iComputeAnnotationsSize + annotationWriter4.computeAnnotationsSize("RuntimeInvisibleTypeAnnotations") : iComputeAnnotationsSize;
    }

    void putAnnotations(int i, org.objectweb.asm.ByteVector byteVector) {
        int i2 = 2;
        int i3 = 0;
        org.objectweb.asm.AnnotationWriter annotationWriter = null;
        for (org.objectweb.asm.AnnotationWriter annotationWriter2 = this; annotationWriter2 != null; annotationWriter2 = annotationWriter2.previousAnnotation) {
            annotationWriter2.visitEnd();
            i2 += annotationWriter2.annotation.length;
            i3++;
            annotationWriter = annotationWriter2;
        }
        byteVector.putShort(i);
        byteVector.putInt(i2);
        byteVector.putShort(i3);
        while (annotationWriter != null) {
            byteVector.putByteArray(annotationWriter.annotation.data, 0, annotationWriter.annotation.length);
            annotationWriter = annotationWriter.nextAnnotation;
        }
    }

    static void putAnnotations(org.objectweb.asm.SymbolTable symbolTable, org.objectweb.asm.AnnotationWriter annotationWriter, org.objectweb.asm.AnnotationWriter annotationWriter2, org.objectweb.asm.AnnotationWriter annotationWriter3, org.objectweb.asm.AnnotationWriter annotationWriter4, org.objectweb.asm.ByteVector byteVector) {
        if (annotationWriter != null) {
            annotationWriter.putAnnotations(symbolTable.addConstantUtf8("RuntimeVisibleAnnotations"), byteVector);
        }
        if (annotationWriter2 != null) {
            annotationWriter2.putAnnotations(symbolTable.addConstantUtf8("RuntimeInvisibleAnnotations"), byteVector);
        }
        if (annotationWriter3 != null) {
            annotationWriter3.putAnnotations(symbolTable.addConstantUtf8("RuntimeVisibleTypeAnnotations"), byteVector);
        }
        if (annotationWriter4 != null) {
            annotationWriter4.putAnnotations(symbolTable.addConstantUtf8("RuntimeInvisibleTypeAnnotations"), byteVector);
        }
    }

    static int computeParameterAnnotationsSize(java.lang.String str, org.objectweb.asm.AnnotationWriter[] annotationWriterArr, int i) {
        int iComputeAnnotationsSize = (i * 2) + 7;
        for (int i2 = 0; i2 < i; i2++) {
            org.objectweb.asm.AnnotationWriter annotationWriter = annotationWriterArr[i2];
            iComputeAnnotationsSize += annotationWriter == null ? 0 : annotationWriter.computeAnnotationsSize(str) - 8;
        }
        return iComputeAnnotationsSize;
    }

    static void putParameterAnnotations(int i, org.objectweb.asm.AnnotationWriter[] annotationWriterArr, int i2, org.objectweb.asm.ByteVector byteVector) {
        int iComputeAnnotationsSize = (i2 * 2) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            org.objectweb.asm.AnnotationWriter annotationWriter = annotationWriterArr[i3];
            iComputeAnnotationsSize += annotationWriter == null ? 0 : annotationWriter.computeAnnotationsSize(null) - 8;
        }
        byteVector.putShort(i);
        byteVector.putInt(iComputeAnnotationsSize);
        byteVector.putByte(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = 0;
            org.objectweb.asm.AnnotationWriter annotationWriter2 = null;
            for (org.objectweb.asm.AnnotationWriter annotationWriter3 = annotationWriterArr[i4]; annotationWriter3 != null; annotationWriter3 = annotationWriter3.previousAnnotation) {
                annotationWriter3.visitEnd();
                i5++;
                annotationWriter2 = annotationWriter3;
            }
            byteVector.putShort(i5);
            while (annotationWriter2 != null) {
                byteVector.putByteArray(annotationWriter2.annotation.data, 0, annotationWriter2.annotation.length);
                annotationWriter2 = annotationWriter2.nextAnnotation;
            }
        }
    }
}
