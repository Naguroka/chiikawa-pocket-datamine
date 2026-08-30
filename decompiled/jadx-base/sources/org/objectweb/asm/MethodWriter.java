package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
final class MethodWriter extends org.objectweb.asm.MethodVisitor {
    static final int COMPUTE_ALL_FRAMES = 4;
    static final int COMPUTE_INSERTED_FRAMES = 3;
    static final int COMPUTE_MAX_STACK_AND_LOCAL = 1;
    static final int COMPUTE_MAX_STACK_AND_LOCAL_FROM_FRAMES = 2;
    static final int COMPUTE_NOTHING = 0;
    private static final int NA = 0;
    private static final int[] STACK_SIZE_DELTA = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};
    private final int accessFlags;
    private final org.objectweb.asm.ByteVector code;
    private final int compute;
    private org.objectweb.asm.Label currentBasicBlock;
    private int[] currentFrame;
    private int currentLocals;
    private org.objectweb.asm.ByteVector defaultValue;
    private final java.lang.String descriptor;
    private final int descriptorIndex;
    private final int[] exceptionIndexTable;
    private org.objectweb.asm.Attribute firstAttribute;
    private org.objectweb.asm.Label firstBasicBlock;
    private org.objectweb.asm.Attribute firstCodeAttribute;
    private org.objectweb.asm.Handler firstHandler;
    private boolean hasAsmInstructions;
    private boolean hasSubroutines;
    private int invisibleAnnotableParameterCount;
    private org.objectweb.asm.Label lastBasicBlock;
    private int lastBytecodeOffset;
    private org.objectweb.asm.AnnotationWriter lastCodeRuntimeInvisibleTypeAnnotation;
    private org.objectweb.asm.AnnotationWriter lastCodeRuntimeVisibleTypeAnnotation;
    private org.objectweb.asm.Handler lastHandler;
    private org.objectweb.asm.AnnotationWriter lastRuntimeInvisibleAnnotation;
    private org.objectweb.asm.AnnotationWriter[] lastRuntimeInvisibleParameterAnnotations;
    private org.objectweb.asm.AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeVisibleAnnotation;
    private org.objectweb.asm.AnnotationWriter[] lastRuntimeVisibleParameterAnnotations;
    private org.objectweb.asm.AnnotationWriter lastRuntimeVisibleTypeAnnotation;
    private org.objectweb.asm.ByteVector lineNumberTable;
    private int lineNumberTableLength;
    private org.objectweb.asm.ByteVector localVariableTable;
    private int localVariableTableLength;
    private org.objectweb.asm.ByteVector localVariableTypeTable;
    private int localVariableTypeTableLength;
    private int maxLocals;
    private int maxRelativeStackSize;
    private int maxStack;
    private final java.lang.String name;
    private final int nameIndex;
    private final int numberOfExceptions;
    private org.objectweb.asm.ByteVector parameters;
    private int parametersCount;
    private int[] previousFrame;
    private int previousFrameOffset;
    private int relativeStackSize;
    private final int signatureIndex;
    private int sourceLength;
    private int sourceOffset;
    private org.objectweb.asm.ByteVector stackMapTableEntries;
    private int stackMapTableNumberOfEntries;
    private final org.objectweb.asm.SymbolTable symbolTable;
    private int visibleAnnotableParameterCount;

    @Override // org.objectweb.asm.MethodVisitor
    public void visitCode() {
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitEnd() {
    }

    MethodWriter(org.objectweb.asm.SymbolTable symbolTable, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr, int i2) {
        super(589824);
        this.code = new org.objectweb.asm.ByteVector();
        this.symbolTable = symbolTable;
        this.accessFlags = "<init>".equals(str) ? 262144 | i : i;
        this.nameIndex = symbolTable.addConstantUtf8(str);
        this.name = str;
        this.descriptorIndex = symbolTable.addConstantUtf8(str2);
        this.descriptor = str2;
        this.signatureIndex = str3 == null ? 0 : symbolTable.addConstantUtf8(str3);
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.numberOfExceptions = length;
            this.exceptionIndexTable = new int[length];
            for (int i3 = 0; i3 < this.numberOfExceptions; i3++) {
                this.exceptionIndexTable[i3] = symbolTable.addConstantClass(strArr[i3]).index;
            }
        } else {
            this.numberOfExceptions = 0;
            this.exceptionIndexTable = null;
        }
        this.compute = i2;
        if (i2 != 0) {
            int argumentsAndReturnSizes = org.objectweb.asm.Type.getArgumentsAndReturnSizes(str2) >> 2;
            argumentsAndReturnSizes = (i & 8) != 0 ? argumentsAndReturnSizes - 1 : argumentsAndReturnSizes;
            this.maxLocals = argumentsAndReturnSizes;
            this.currentLocals = argumentsAndReturnSizes;
            org.objectweb.asm.Label label = new org.objectweb.asm.Label();
            this.firstBasicBlock = label;
            visitLabel(label);
        }
    }

    boolean hasFrames() {
        return this.stackMapTableNumberOfEntries > 0;
    }

    boolean hasAsmInstructions() {
        return this.hasAsmInstructions;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitParameter(java.lang.String str, int i) {
        if (this.parameters == null) {
            this.parameters = new org.objectweb.asm.ByteVector();
        }
        this.parametersCount++;
        this.parameters.putShort(str == null ? 0 : this.symbolTable.addConstantUtf8(str)).putShort(i);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotationDefault() {
        this.defaultValue = new org.objectweb.asm.ByteVector();
        return new org.objectweb.asm.AnnotationWriter(this.symbolTable, false, this.defaultValue, null);
    }

    @Override // org.objectweb.asm.MethodVisitor
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

    @Override // org.objectweb.asm.MethodVisitor
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

    @Override // org.objectweb.asm.MethodVisitor
    public void visitAnnotableParameterCount(int i, boolean z) {
        if (z) {
            this.visibleAnnotableParameterCount = i;
        } else {
            this.invisibleAnnotableParameterCount = i;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitParameterAnnotation(int i, java.lang.String str, boolean z) {
        if (z) {
            if (this.lastRuntimeVisibleParameterAnnotations == null) {
                this.lastRuntimeVisibleParameterAnnotations = new org.objectweb.asm.AnnotationWriter[org.objectweb.asm.Type.getArgumentTypes(this.descriptor).length];
            }
            org.objectweb.asm.AnnotationWriter[] annotationWriterArr = this.lastRuntimeVisibleParameterAnnotations;
            org.objectweb.asm.AnnotationWriter annotationWriterCreate = org.objectweb.asm.AnnotationWriter.create(this.symbolTable, str, annotationWriterArr[i]);
            annotationWriterArr[i] = annotationWriterCreate;
            return annotationWriterCreate;
        }
        if (this.lastRuntimeInvisibleParameterAnnotations == null) {
            this.lastRuntimeInvisibleParameterAnnotations = new org.objectweb.asm.AnnotationWriter[org.objectweb.asm.Type.getArgumentTypes(this.descriptor).length];
        }
        org.objectweb.asm.AnnotationWriter[] annotationWriterArr2 = this.lastRuntimeInvisibleParameterAnnotations;
        org.objectweb.asm.AnnotationWriter annotationWriterCreate2 = org.objectweb.asm.AnnotationWriter.create(this.symbolTable, str, annotationWriterArr2[i]);
        annotationWriterArr2[i] = annotationWriterCreate2;
        return annotationWriterCreate2;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitAttribute(org.objectweb.asm.Attribute attribute) {
        if (attribute.isCodeAttribute()) {
            attribute.nextAttribute = this.firstCodeAttribute;
            this.firstCodeAttribute = attribute;
        } else {
            attribute.nextAttribute = this.firstAttribute;
            this.firstAttribute = attribute;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i, int i2, java.lang.Object[] objArr, int i3, java.lang.Object[] objArr2) {
        int i4;
        int i5 = this.compute;
        if (i5 == 4) {
            return;
        }
        if (i5 == 3) {
            if (this.currentBasicBlock.frame == null) {
                this.currentBasicBlock.frame = new org.objectweb.asm.CurrentFrame(this.currentBasicBlock);
                this.currentBasicBlock.frame.setInputFrameFromDescriptor(this.symbolTable, this.accessFlags, this.descriptor, i2);
                this.currentBasicBlock.frame.accept(this);
            } else {
                if (i == -1) {
                    this.currentBasicBlock.frame.setInputFrameFromApiFormat(this.symbolTable, i2, objArr, i3, objArr2);
                }
                this.currentBasicBlock.frame.accept(this);
            }
        } else if (i == -1) {
            if (this.previousFrame == null) {
                int argumentsAndReturnSizes = org.objectweb.asm.Type.getArgumentsAndReturnSizes(this.descriptor) >> 2;
                org.objectweb.asm.Frame frame = new org.objectweb.asm.Frame(new org.objectweb.asm.Label());
                frame.setInputFrameFromDescriptor(this.symbolTable, this.accessFlags, this.descriptor, argumentsAndReturnSizes);
                frame.accept(this);
            }
            this.currentLocals = i2;
            int iVisitFrameStart = visitFrameStart(this.code.length, i2, i3);
            int i6 = 0;
            while (i6 < i2) {
                this.currentFrame[iVisitFrameStart] = org.objectweb.asm.Frame.getAbstractTypeFromApiFormat(this.symbolTable, objArr[i6]);
                i6++;
                iVisitFrameStart++;
            }
            int i7 = 0;
            while (i7 < i3) {
                this.currentFrame[iVisitFrameStart] = org.objectweb.asm.Frame.getAbstractTypeFromApiFormat(this.symbolTable, objArr2[i7]);
                i7++;
                iVisitFrameStart++;
            }
            visitFrameEnd();
        } else {
            if (this.symbolTable.getMajorVersion() < 50) {
                throw new java.lang.IllegalArgumentException("Class versions V1_5 or less must use F_NEW frames.");
            }
            if (this.stackMapTableEntries == null) {
                this.stackMapTableEntries = new org.objectweb.asm.ByteVector();
                i4 = this.code.length;
            } else {
                i4 = (this.code.length - this.previousFrameOffset) - 1;
                if (i4 < 0) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException();
                    }
                    return;
                }
            }
            if (i == 0) {
                this.currentLocals = i2;
                this.stackMapTableEntries.putByte(255).putShort(i4).putShort(i2);
                for (int i8 = 0; i8 < i2; i8++) {
                    putFrameType(objArr[i8]);
                }
                this.stackMapTableEntries.putShort(i3);
                for (int i9 = 0; i9 < i3; i9++) {
                    putFrameType(objArr2[i9]);
                }
            } else if (i == 1) {
                this.currentLocals += i2;
                this.stackMapTableEntries.putByte(i2 + 251).putShort(i4);
                for (int i10 = 0; i10 < i2; i10++) {
                    putFrameType(objArr[i10]);
                }
            } else if (i == 2) {
                this.currentLocals -= i2;
                this.stackMapTableEntries.putByte(251 - i2).putShort(i4);
            } else if (i != 3) {
                if (i == 4) {
                    if (i4 < 64) {
                        this.stackMapTableEntries.putByte(i4 + 64);
                    } else {
                        this.stackMapTableEntries.putByte(247).putShort(i4);
                    }
                    putFrameType(objArr2[0]);
                } else {
                    throw new java.lang.IllegalArgumentException();
                }
            } else if (i4 < 64) {
                this.stackMapTableEntries.putByte(i4);
            } else {
                this.stackMapTableEntries.putByte(251).putShort(i4);
            }
            this.previousFrameOffset = this.code.length;
            this.stackMapTableNumberOfEntries++;
        }
        if (this.compute == 2) {
            this.relativeStackSize = i3;
            for (int i11 = 0; i11 < i3; i11++) {
                if (objArr2[i11] == org.objectweb.asm.Opcodes.LONG || objArr2[i11] == org.objectweb.asm.Opcodes.DOUBLE) {
                    this.relativeStackSize++;
                }
            }
            int i12 = this.relativeStackSize;
            if (i12 > this.maxRelativeStackSize) {
                this.maxRelativeStackSize = i12;
            }
        }
        this.maxStack = java.lang.Math.max(this.maxStack, i3);
        this.maxLocals = java.lang.Math.max(this.maxLocals, this.currentLocals);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        this.lastBytecodeOffset = this.code.length;
        this.code.putByte(i);
        org.objectweb.asm.Label label = this.currentBasicBlock;
        if (label != null) {
            int i2 = this.compute;
            if (i2 == 4 || i2 == 3) {
                label.frame.execute(i, 0, null, null);
            } else {
                int i3 = this.relativeStackSize + STACK_SIZE_DELTA[i];
                if (i3 > this.maxRelativeStackSize) {
                    this.maxRelativeStackSize = i3;
                }
                this.relativeStackSize = i3;
            }
            if ((i < 172 || i > 177) && i != 191) {
                return;
            }
            endCurrentBasicBlockWithNoSuccessor();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        this.lastBytecodeOffset = this.code.length;
        if (i == 17) {
            this.code.put12(i, i2);
        } else {
            this.code.put11(i, i2);
        }
        org.objectweb.asm.Label label = this.currentBasicBlock;
        if (label != null) {
            int i3 = this.compute;
            if (i3 == 4 || i3 == 3) {
                label.frame.execute(i, i2, null, null);
            } else if (i != 188) {
                int i4 = this.relativeStackSize + 1;
                if (i4 > this.maxRelativeStackSize) {
                    this.maxRelativeStackSize = i4;
                }
                this.relativeStackSize = i4;
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        this.lastBytecodeOffset = this.code.length;
        if (i2 < 4 && i != 169) {
            this.code.putByte((i < 54 ? ((i - 21) << 2) + 26 : ((i - 54) << 2) + 59) + i2);
        } else if (i2 >= 256) {
            this.code.putByte(196).put12(i, i2);
        } else {
            this.code.put11(i, i2);
        }
        org.objectweb.asm.Label label = this.currentBasicBlock;
        if (label != null) {
            int i3 = this.compute;
            if (i3 == 4 || i3 == 3) {
                label.frame.execute(i, i2, null, null);
            } else if (i == 169) {
                label.flags = (short) (label.flags | 64);
                this.currentBasicBlock.outputStackSize = (short) this.relativeStackSize;
                endCurrentBasicBlockWithNoSuccessor();
            } else {
                int i4 = this.relativeStackSize + STACK_SIZE_DELTA[i];
                if (i4 > this.maxRelativeStackSize) {
                    this.maxRelativeStackSize = i4;
                }
                this.relativeStackSize = i4;
            }
        }
        int i5 = this.compute;
        if (i5 != 0) {
            int i6 = (i == 22 || i == 24 || i == 55 || i == 57) ? i2 + 2 : i2 + 1;
            if (i6 > this.maxLocals) {
                this.maxLocals = i6;
            }
        }
        if (i < 54 || i5 != 4 || this.firstHandler == null) {
            return;
        }
        visitLabel(new org.objectweb.asm.Label());
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, java.lang.String str) {
        this.lastBytecodeOffset = this.code.length;
        org.objectweb.asm.Symbol symbolAddConstantClass = this.symbolTable.addConstantClass(str);
        this.code.put12(i, symbolAddConstantClass.index);
        org.objectweb.asm.Label label = this.currentBasicBlock;
        if (label != null) {
            int i2 = this.compute;
            if (i2 == 4 || i2 == 3) {
                label.frame.execute(i, this.lastBytecodeOffset, symbolAddConstantClass, this.symbolTable);
            } else if (i == 187) {
                int i3 = this.relativeStackSize + 1;
                if (i3 > this.maxRelativeStackSize) {
                    this.maxRelativeStackSize = i3;
                }
                this.relativeStackSize = i3;
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i2;
        int i3;
        this.lastBytecodeOffset = this.code.length;
        org.objectweb.asm.Symbol symbolAddConstantFieldref = this.symbolTable.addConstantFieldref(str, str2, str3);
        this.code.put12(i, symbolAddConstantFieldref.index);
        org.objectweb.asm.Label label = this.currentBasicBlock;
        if (label != null) {
            int i4 = this.compute;
            if (i4 == 4 || i4 == 3) {
                label.frame.execute(i, 0, symbolAddConstantFieldref, this.symbolTable);
                return;
            }
            char cCharAt = str3.charAt(0);
            int i5 = -2;
            switch (i) {
                case org.objectweb.asm.Opcodes.GETSTATIC /* 178 */:
                    i2 = this.relativeStackSize + ((cCharAt == 'D' || cCharAt == 'J') ? 2 : 1);
                    break;
                case org.objectweb.asm.Opcodes.PUTSTATIC /* 179 */:
                    i3 = this.relativeStackSize;
                    if (cCharAt != 'D' && cCharAt != 'J') {
                        i5 = -1;
                    }
                    i2 = i3 + i5;
                    break;
                case org.objectweb.asm.Opcodes.GETFIELD /* 180 */:
                    i2 = this.relativeStackSize + ((cCharAt == 'D' || cCharAt == 'J') ? 1 : 0);
                    break;
                default:
                    i3 = this.relativeStackSize;
                    if (cCharAt == 'D' || cCharAt == 'J') {
                        i5 = -3;
                    }
                    i2 = i3 + i5;
                    break;
            }
            if (i2 > this.maxRelativeStackSize) {
                this.maxRelativeStackSize = i2;
            }
            this.relativeStackSize = i2;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        int i2;
        this.lastBytecodeOffset = this.code.length;
        org.objectweb.asm.Symbol symbolAddConstantMethodref = this.symbolTable.addConstantMethodref(str, str2, str3, z);
        if (i == 185) {
            this.code.put12(org.objectweb.asm.Opcodes.INVOKEINTERFACE, symbolAddConstantMethodref.index).put11(symbolAddConstantMethodref.getArgumentsAndReturnSizes() >> 2, 0);
        } else {
            this.code.put12(i, symbolAddConstantMethodref.index);
        }
        org.objectweb.asm.Label label = this.currentBasicBlock;
        if (label != null) {
            int i3 = this.compute;
            if (i3 == 4 || i3 == 3) {
                label.frame.execute(i, 0, symbolAddConstantMethodref, this.symbolTable);
                return;
            }
            int argumentsAndReturnSizes = symbolAddConstantMethodref.getArgumentsAndReturnSizes();
            int i4 = (argumentsAndReturnSizes & 3) - (argumentsAndReturnSizes >> 2);
            if (i == 184) {
                i2 = this.relativeStackSize + i4 + 1;
            } else {
                i2 = this.relativeStackSize + i4;
            }
            if (i2 > this.maxRelativeStackSize) {
                this.maxRelativeStackSize = i2;
            }
            this.relativeStackSize = i2;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String str, java.lang.String str2, org.objectweb.asm.Handle handle, java.lang.Object... objArr) {
        this.lastBytecodeOffset = this.code.length;
        org.objectweb.asm.Symbol symbolAddConstantInvokeDynamic = this.symbolTable.addConstantInvokeDynamic(str, str2, handle, objArr);
        this.code.put12(org.objectweb.asm.Opcodes.INVOKEDYNAMIC, symbolAddConstantInvokeDynamic.index);
        this.code.putShort(0);
        org.objectweb.asm.Label label = this.currentBasicBlock;
        if (label != null) {
            int i = this.compute;
            if (i == 4 || i == 3) {
                label.frame.execute(org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 0, symbolAddConstantInvokeDynamic, this.symbolTable);
                return;
            }
            int argumentsAndReturnSizes = symbolAddConstantInvokeDynamic.getArgumentsAndReturnSizes();
            int i2 = this.relativeStackSize + ((argumentsAndReturnSizes & 3) - (argumentsAndReturnSizes >> 2)) + 1;
            if (i2 > this.maxRelativeStackSize) {
                this.maxRelativeStackSize = i2;
            }
            this.relativeStackSize = i2;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, org.objectweb.asm.Label label) {
        boolean z;
        this.lastBytecodeOffset = this.code.length;
        int i2 = i >= 200 ? i - 33 : i;
        if ((label.flags & 4) == 0 || label.bytecodeOffset - this.code.length >= -32768) {
            if (i2 != i) {
                this.code.putByte(i);
                org.objectweb.asm.ByteVector byteVector = this.code;
                label.put(byteVector, byteVector.length - 1, true);
            } else {
                this.code.putByte(i2);
                org.objectweb.asm.ByteVector byteVector2 = this.code;
                label.put(byteVector2, byteVector2.length - 1, false);
            }
            z = false;
        } else {
            if (i2 == 167) {
                this.code.putByte(200);
            } else {
                if (i2 == 168) {
                    this.code.putByte(com.ironsource.g3.c.b.INSTANCE_LOAD);
                } else {
                    this.code.putByte(i2 >= 198 ? i2 ^ 1 : ((i2 + 1) ^ 1) - 1);
                    this.code.putShort(8);
                    this.code.putByte(220);
                    this.hasAsmInstructions = true;
                    z = true;
                }
                org.objectweb.asm.ByteVector byteVector3 = this.code;
                label.put(byteVector3, byteVector3.length - 1, true);
            }
            z = false;
            org.objectweb.asm.ByteVector byteVector4 = this.code;
            label.put(byteVector4, byteVector4.length - 1, true);
        }
        org.objectweb.asm.Label label2 = this.currentBasicBlock;
        if (label2 != null) {
            int i3 = this.compute;
            org.objectweb.asm.Label label3 = null;
            if (i3 == 4) {
                label2.frame.execute(i2, 0, null, null);
                org.objectweb.asm.Label canonicalInstance = label.getCanonicalInstance();
                canonicalInstance.flags = (short) (canonicalInstance.flags | 2);
                addSuccessorToCurrentBasicBlock(0, label);
                if (i2 != 167) {
                    label3 = new org.objectweb.asm.Label();
                }
            } else if (i3 == 3) {
                label2.frame.execute(i2, 0, null, null);
            } else if (i3 == 2) {
                this.relativeStackSize += STACK_SIZE_DELTA[i2];
            } else if (i2 == 168) {
                if ((label.flags & 32) == 0) {
                    label.flags = (short) (label.flags | 32);
                    this.hasSubroutines = true;
                }
                org.objectweb.asm.Label label4 = this.currentBasicBlock;
                label4.flags = (short) (label4.flags | 16);
                addSuccessorToCurrentBasicBlock(this.relativeStackSize + 1, label);
                label3 = new org.objectweb.asm.Label();
            } else {
                int i4 = this.relativeStackSize + STACK_SIZE_DELTA[i2];
                this.relativeStackSize = i4;
                addSuccessorToCurrentBasicBlock(i4, label);
            }
            if (label3 != null) {
                if (z) {
                    label3.flags = (short) (label3.flags | 2);
                }
                visitLabel(label3);
            }
            if (i2 == 167) {
                endCurrentBasicBlockWithNoSuccessor();
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(org.objectweb.asm.Label label) {
        this.hasAsmInstructions |= label.resolve(this.code.data, this.code.length);
        if ((label.flags & 1) != 0) {
            return;
        }
        int i = this.compute;
        if (i == 4) {
            if (this.currentBasicBlock != null) {
                if (label.bytecodeOffset == this.currentBasicBlock.bytecodeOffset) {
                    org.objectweb.asm.Label label2 = this.currentBasicBlock;
                    label2.flags = (short) (label2.flags | (label.flags & 2));
                    label.frame = this.currentBasicBlock.frame;
                    return;
                }
                addSuccessorToCurrentBasicBlock(0, label);
            }
            if (this.lastBasicBlock != null) {
                if (label.bytecodeOffset == this.lastBasicBlock.bytecodeOffset) {
                    org.objectweb.asm.Label label3 = this.lastBasicBlock;
                    label3.flags = (short) (label3.flags | (label.flags & 2));
                    label.frame = this.lastBasicBlock.frame;
                    this.currentBasicBlock = this.lastBasicBlock;
                    return;
                }
                this.lastBasicBlock.nextBasicBlock = label;
            }
            this.lastBasicBlock = label;
            this.currentBasicBlock = label;
            label.frame = new org.objectweb.asm.Frame(label);
            return;
        }
        if (i == 3) {
            org.objectweb.asm.Label label4 = this.currentBasicBlock;
            if (label4 == null) {
                this.currentBasicBlock = label;
                return;
            } else {
                label4.frame.owner = label;
                return;
            }
        }
        if (i == 1) {
            org.objectweb.asm.Label label5 = this.currentBasicBlock;
            if (label5 != null) {
                label5.outputStackMax = (short) this.maxRelativeStackSize;
                addSuccessorToCurrentBasicBlock(this.relativeStackSize, label);
            }
            this.currentBasicBlock = label;
            this.relativeStackSize = 0;
            this.maxRelativeStackSize = 0;
            org.objectweb.asm.Label label6 = this.lastBasicBlock;
            if (label6 != null) {
                label6.nextBasicBlock = label;
            }
            this.lastBasicBlock = label;
            return;
        }
        if (i == 2 && this.currentBasicBlock == null) {
            this.currentBasicBlock = label;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object obj) {
        char cCharAt;
        this.lastBytecodeOffset = this.code.length;
        org.objectweb.asm.Symbol symbolAddConstant = this.symbolTable.addConstant(obj);
        int i = symbolAddConstant.index;
        boolean z = symbolAddConstant.tag == 5 || symbolAddConstant.tag == 6 || (symbolAddConstant.tag == 17 && ((cCharAt = symbolAddConstant.value.charAt(0)) == 'J' || cCharAt == 'D'));
        if (z) {
            this.code.put12(20, i);
        } else if (i >= 256) {
            this.code.put12(19, i);
        } else {
            this.code.put11(18, i);
        }
        org.objectweb.asm.Label label = this.currentBasicBlock;
        if (label != null) {
            int i2 = this.compute;
            if (i2 == 4 || i2 == 3) {
                label.frame.execute(18, 0, symbolAddConstant, this.symbolTable);
                return;
            }
            int i3 = this.relativeStackSize + (z ? 2 : 1);
            if (i3 > this.maxRelativeStackSize) {
                this.maxRelativeStackSize = i3;
            }
            this.relativeStackSize = i3;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        int i3;
        int i4;
        this.lastBytecodeOffset = this.code.length;
        if (i > 255 || i2 > 127 || i2 < -128) {
            this.code.putByte(196).put12(org.objectweb.asm.Opcodes.IINC, i).putShort(i2);
        } else {
            this.code.putByte(org.objectweb.asm.Opcodes.IINC).put11(i, i2);
        }
        org.objectweb.asm.Label label = this.currentBasicBlock;
        if (label != null && ((i4 = this.compute) == 4 || i4 == 3)) {
            label.frame.execute(org.objectweb.asm.Opcodes.IINC, i, null, null);
        }
        if (this.compute == 0 || (i3 = i + 1) <= this.maxLocals) {
            return;
        }
        this.maxLocals = i3;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, org.objectweb.asm.Label label, org.objectweb.asm.Label... labelArr) {
        this.lastBytecodeOffset = this.code.length;
        this.code.putByte(org.objectweb.asm.Opcodes.TABLESWITCH).putByteArray(null, 0, (4 - (this.code.length % 4)) % 4);
        label.put(this.code, this.lastBytecodeOffset, true);
        this.code.putInt(i).putInt(i2);
        for (org.objectweb.asm.Label label2 : labelArr) {
            label2.put(this.code, this.lastBytecodeOffset, true);
        }
        visitSwitchInsn(label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(org.objectweb.asm.Label label, int[] iArr, org.objectweb.asm.Label[] labelArr) {
        this.lastBytecodeOffset = this.code.length;
        this.code.putByte(org.objectweb.asm.Opcodes.LOOKUPSWITCH).putByteArray(null, 0, (4 - (this.code.length % 4)) % 4);
        label.put(this.code, this.lastBytecodeOffset, true);
        this.code.putInt(labelArr.length);
        for (int i = 0; i < labelArr.length; i++) {
            this.code.putInt(iArr[i]);
            labelArr[i].put(this.code, this.lastBytecodeOffset, true);
        }
        visitSwitchInsn(label, labelArr);
    }

    private void visitSwitchInsn(org.objectweb.asm.Label label, org.objectweb.asm.Label[] labelArr) {
        org.objectweb.asm.Label label2 = this.currentBasicBlock;
        if (label2 != null) {
            int i = this.compute;
            if (i == 4) {
                label2.frame.execute(org.objectweb.asm.Opcodes.LOOKUPSWITCH, 0, null, null);
                addSuccessorToCurrentBasicBlock(0, label);
                org.objectweb.asm.Label canonicalInstance = label.getCanonicalInstance();
                canonicalInstance.flags = (short) (canonicalInstance.flags | 2);
                for (org.objectweb.asm.Label label3 : labelArr) {
                    addSuccessorToCurrentBasicBlock(0, label3);
                    org.objectweb.asm.Label canonicalInstance2 = label3.getCanonicalInstance();
                    canonicalInstance2.flags = (short) (canonicalInstance2.flags | 2);
                }
            } else if (i == 1) {
                int i2 = this.relativeStackSize - 1;
                this.relativeStackSize = i2;
                addSuccessorToCurrentBasicBlock(i2, label);
                for (org.objectweb.asm.Label label4 : labelArr) {
                    addSuccessorToCurrentBasicBlock(this.relativeStackSize, label4);
                }
            }
            endCurrentBasicBlockWithNoSuccessor();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String str, int i) {
        this.lastBytecodeOffset = this.code.length;
        org.objectweb.asm.Symbol symbolAddConstantClass = this.symbolTable.addConstantClass(str);
        this.code.put12(org.objectweb.asm.Opcodes.MULTIANEWARRAY, symbolAddConstantClass.index).putByte(i);
        org.objectweb.asm.Label label = this.currentBasicBlock;
        if (label != null) {
            int i2 = this.compute;
            if (i2 == 4 || i2 == 3) {
                label.frame.execute(org.objectweb.asm.Opcodes.MULTIANEWARRAY, i, symbolAddConstantClass, this.symbolTable);
            } else {
                this.relativeStackSize += 1 - i;
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitInsnAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        if (z) {
            org.objectweb.asm.AnnotationWriter annotationWriterCreate = org.objectweb.asm.AnnotationWriter.create(this.symbolTable, (i & (-16776961)) | (this.lastBytecodeOffset << 8), typePath, str, this.lastCodeRuntimeVisibleTypeAnnotation);
            this.lastCodeRuntimeVisibleTypeAnnotation = annotationWriterCreate;
            return annotationWriterCreate;
        }
        org.objectweb.asm.AnnotationWriter annotationWriterCreate2 = org.objectweb.asm.AnnotationWriter.create(this.symbolTable, (i & (-16776961)) | (this.lastBytecodeOffset << 8), typePath, str, this.lastCodeRuntimeInvisibleTypeAnnotation);
        this.lastCodeRuntimeInvisibleTypeAnnotation = annotationWriterCreate2;
        return annotationWriterCreate2;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(org.objectweb.asm.Label label, org.objectweb.asm.Label label2, org.objectweb.asm.Label label3, java.lang.String str) {
        org.objectweb.asm.Handler handler = new org.objectweb.asm.Handler(label, label2, label3, str != null ? this.symbolTable.addConstantClass(str).index : 0, str);
        if (this.firstHandler == null) {
            this.firstHandler = handler;
        } else {
            this.lastHandler.nextHandler = handler;
        }
        this.lastHandler = handler;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitTryCatchAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        if (z) {
            org.objectweb.asm.AnnotationWriter annotationWriterCreate = org.objectweb.asm.AnnotationWriter.create(this.symbolTable, i, typePath, str, this.lastCodeRuntimeVisibleTypeAnnotation);
            this.lastCodeRuntimeVisibleTypeAnnotation = annotationWriterCreate;
            return annotationWriterCreate;
        }
        org.objectweb.asm.AnnotationWriter annotationWriterCreate2 = org.objectweb.asm.AnnotationWriter.create(this.symbolTable, i, typePath, str, this.lastCodeRuntimeInvisibleTypeAnnotation);
        this.lastCodeRuntimeInvisibleTypeAnnotation = annotationWriterCreate2;
        return annotationWriterCreate2;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(java.lang.String str, java.lang.String str2, java.lang.String str3, org.objectweb.asm.Label label, org.objectweb.asm.Label label2, int i) {
        if (str3 != null) {
            if (this.localVariableTypeTable == null) {
                this.localVariableTypeTable = new org.objectweb.asm.ByteVector();
            }
            this.localVariableTypeTableLength++;
            this.localVariableTypeTable.putShort(label.bytecodeOffset).putShort(label2.bytecodeOffset - label.bytecodeOffset).putShort(this.symbolTable.addConstantUtf8(str)).putShort(this.symbolTable.addConstantUtf8(str3)).putShort(i);
        }
        if (this.localVariableTable == null) {
            this.localVariableTable = new org.objectweb.asm.ByteVector();
        }
        this.localVariableTableLength++;
        this.localVariableTable.putShort(label.bytecodeOffset).putShort(label2.bytecodeOffset - label.bytecodeOffset).putShort(this.symbolTable.addConstantUtf8(str)).putShort(this.symbolTable.addConstantUtf8(str2)).putShort(i);
        if (this.compute != 0) {
            char cCharAt = str2.charAt(0);
            int i2 = i + ((cCharAt == 'J' || cCharAt == 'D') ? 2 : 1);
            if (i2 > this.maxLocals) {
                this.maxLocals = i2;
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitLocalVariableAnnotation(int i, org.objectweb.asm.TypePath typePath, org.objectweb.asm.Label[] labelArr, org.objectweb.asm.Label[] labelArr2, int[] iArr, java.lang.String str, boolean z) {
        org.objectweb.asm.ByteVector byteVector = new org.objectweb.asm.ByteVector();
        byteVector.putByte(i >>> 24).putShort(labelArr.length);
        for (int i2 = 0; i2 < labelArr.length; i2++) {
            byteVector.putShort(labelArr[i2].bytecodeOffset).putShort(labelArr2[i2].bytecodeOffset - labelArr[i2].bytecodeOffset).putShort(iArr[i2]);
        }
        org.objectweb.asm.TypePath.put(typePath, byteVector);
        byteVector.putShort(this.symbolTable.addConstantUtf8(str)).putShort(0);
        if (z) {
            org.objectweb.asm.AnnotationWriter annotationWriter = new org.objectweb.asm.AnnotationWriter(this.symbolTable, true, byteVector, this.lastCodeRuntimeVisibleTypeAnnotation);
            this.lastCodeRuntimeVisibleTypeAnnotation = annotationWriter;
            return annotationWriter;
        }
        org.objectweb.asm.AnnotationWriter annotationWriter2 = new org.objectweb.asm.AnnotationWriter(this.symbolTable, true, byteVector, this.lastCodeRuntimeInvisibleTypeAnnotation);
        this.lastCodeRuntimeInvisibleTypeAnnotation = annotationWriter2;
        return annotationWriter2;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int i, org.objectweb.asm.Label label) {
        if (this.lineNumberTable == null) {
            this.lineNumberTable = new org.objectweb.asm.ByteVector();
        }
        this.lineNumberTableLength++;
        this.lineNumberTable.putShort(label.bytecodeOffset);
        this.lineNumberTable.putShort(i);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i, int i2) {
        int i3 = this.compute;
        if (i3 == 4) {
            computeAllFrames();
            return;
        }
        if (i3 == 1) {
            computeMaxStackAndLocal();
        } else if (i3 == 2) {
            this.maxStack = this.maxRelativeStackSize;
        } else {
            this.maxStack = i;
            this.maxLocals = i2;
        }
    }

    private void computeAllFrames() {
        org.objectweb.asm.Handler handler = this.firstHandler;
        while (true) {
            if (handler == null) {
                break;
            }
            int abstractTypeFromInternalName = org.objectweb.asm.Frame.getAbstractTypeFromInternalName(this.symbolTable, handler.catchTypeDescriptor != null ? handler.catchTypeDescriptor : "java/lang/Throwable");
            org.objectweb.asm.Label canonicalInstance = handler.handlerPc.getCanonicalInstance();
            canonicalInstance.flags = (short) (canonicalInstance.flags | 2);
            org.objectweb.asm.Label canonicalInstance2 = handler.endPc.getCanonicalInstance();
            for (org.objectweb.asm.Label canonicalInstance3 = handler.startPc.getCanonicalInstance(); canonicalInstance3 != canonicalInstance2; canonicalInstance3 = canonicalInstance3.nextBasicBlock) {
                canonicalInstance3.outgoingEdges = new org.objectweb.asm.Edge(abstractTypeFromInternalName, canonicalInstance, canonicalInstance3.outgoingEdges);
            }
            handler = handler.nextHandler;
        }
        org.objectweb.asm.Frame frame = this.firstBasicBlock.frame;
        frame.setInputFrameFromDescriptor(this.symbolTable, this.accessFlags, this.descriptor, this.maxLocals);
        frame.accept(this);
        org.objectweb.asm.Label label = this.firstBasicBlock;
        label.nextListElement = org.objectweb.asm.Label.EMPTY_LIST;
        int iMax = 0;
        while (label != org.objectweb.asm.Label.EMPTY_LIST) {
            org.objectweb.asm.Label label2 = label.nextListElement;
            label.nextListElement = null;
            label.flags = (short) (label.flags | 8);
            int inputStackSize = label.frame.getInputStackSize() + label.outputStackMax;
            if (inputStackSize > iMax) {
                iMax = inputStackSize;
            }
            for (org.objectweb.asm.Edge edge = label.outgoingEdges; edge != null; edge = edge.nextEdge) {
                org.objectweb.asm.Label canonicalInstance4 = edge.successor.getCanonicalInstance();
                if (label.frame.merge(this.symbolTable, canonicalInstance4.frame, edge.info) && canonicalInstance4.nextListElement == null) {
                    canonicalInstance4.nextListElement = label2;
                    label2 = canonicalInstance4;
                }
            }
            label = label2;
        }
        for (org.objectweb.asm.Label label3 = this.firstBasicBlock; label3 != null; label3 = label3.nextBasicBlock) {
            if ((label3.flags & 10) == 10) {
                label3.frame.accept(this);
            }
            if ((label3.flags & 8) == 0) {
                org.objectweb.asm.Label label4 = label3.nextBasicBlock;
                int i = label3.bytecodeOffset;
                int i2 = (label4 == null ? this.code.length : label4.bytecodeOffset) - 1;
                if (i2 >= i) {
                    for (int i3 = i; i3 < i2; i3++) {
                        this.code.data[i3] = 0;
                    }
                    this.code.data[i2] = -65;
                    this.currentFrame[visitFrameStart(i, 0, 1)] = org.objectweb.asm.Frame.getAbstractTypeFromInternalName(this.symbolTable, "java/lang/Throwable");
                    visitFrameEnd();
                    this.firstHandler = org.objectweb.asm.Handler.removeRange(this.firstHandler, label3, label4);
                    iMax = java.lang.Math.max(iMax, 1);
                }
            }
        }
        this.maxStack = iMax;
    }

    private void computeMaxStackAndLocal() {
        for (org.objectweb.asm.Handler handler = this.firstHandler; handler != null; handler = handler.nextHandler) {
            org.objectweb.asm.Label label = handler.handlerPc;
            org.objectweb.asm.Label label2 = handler.endPc;
            for (org.objectweb.asm.Label label3 = handler.startPc; label3 != label2; label3 = label3.nextBasicBlock) {
                if ((label3.flags & 16) == 0) {
                    label3.outgoingEdges = new org.objectweb.asm.Edge(Integer.MAX_VALUE, label, label3.outgoingEdges);
                } else {
                    label3.outgoingEdges.nextEdge.nextEdge = new org.objectweb.asm.Edge(Integer.MAX_VALUE, label, label3.outgoingEdges.nextEdge.nextEdge);
                }
            }
        }
        if (this.hasSubroutines) {
            this.firstBasicBlock.markSubroutine((short) 1);
            short s = 1;
            for (short s2 = 1; s2 <= s; s2 = (short) (s2 + 1)) {
                for (org.objectweb.asm.Label label4 = this.firstBasicBlock; label4 != null; label4 = label4.nextBasicBlock) {
                    if ((label4.flags & 16) != 0 && label4.subroutineId == s2) {
                        org.objectweb.asm.Label label5 = label4.outgoingEdges.nextEdge.successor;
                        if (label5.subroutineId == 0) {
                            s = (short) (s + 1);
                            label5.markSubroutine(s);
                        }
                    }
                }
            }
            for (org.objectweb.asm.Label label6 = this.firstBasicBlock; label6 != null; label6 = label6.nextBasicBlock) {
                if ((label6.flags & 16) != 0) {
                    label6.outgoingEdges.nextEdge.successor.addSubroutineRetSuccessors(label6);
                }
            }
        }
        org.objectweb.asm.Label label7 = this.firstBasicBlock;
        label7.nextListElement = org.objectweb.asm.Label.EMPTY_LIST;
        int i = this.maxStack;
        while (label7 != org.objectweb.asm.Label.EMPTY_LIST) {
            org.objectweb.asm.Label label8 = label7.nextListElement;
            short s3 = label7.inputStackSize;
            int i2 = label7.outputStackMax + s3;
            if (i2 > i) {
                i = i2;
            }
            org.objectweb.asm.Edge edge = label7.outgoingEdges;
            if ((label7.flags & 16) != 0) {
                edge = edge.nextEdge;
            }
            label7 = label8;
            while (edge != null) {
                org.objectweb.asm.Label label9 = edge.successor;
                if (label9.nextListElement == null) {
                    label9.inputStackSize = (short) (edge.info == Integer.MAX_VALUE ? 1 : edge.info + s3);
                    label9.nextListElement = label7;
                    label7 = label9;
                }
                edge = edge.nextEdge;
            }
        }
        this.maxStack = i;
    }

    private void addSuccessorToCurrentBasicBlock(int i, org.objectweb.asm.Label label) {
        this.currentBasicBlock.outgoingEdges = new org.objectweb.asm.Edge(i, label, this.currentBasicBlock.outgoingEdges);
    }

    private void endCurrentBasicBlockWithNoSuccessor() {
        int i = this.compute;
        if (i != 4) {
            if (i == 1) {
                this.currentBasicBlock.outputStackMax = (short) this.maxRelativeStackSize;
                this.currentBasicBlock = null;
                return;
            }
            return;
        }
        org.objectweb.asm.Label label = new org.objectweb.asm.Label();
        label.frame = new org.objectweb.asm.Frame(label);
        label.resolve(this.code.data, this.code.length);
        this.lastBasicBlock.nextBasicBlock = label;
        this.lastBasicBlock = label;
        this.currentBasicBlock = null;
    }

    int visitFrameStart(int i, int i2, int i3) {
        int i4 = i2 + 3 + i3;
        int[] iArr = this.currentFrame;
        if (iArr == null || iArr.length < i4) {
            this.currentFrame = new int[i4];
        }
        int[] iArr2 = this.currentFrame;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
        return 3;
    }

    void visitAbstractType(int i, int i2) {
        this.currentFrame[i] = i2;
    }

    void visitFrameEnd() {
        if (this.previousFrame != null) {
            if (this.stackMapTableEntries == null) {
                this.stackMapTableEntries = new org.objectweb.asm.ByteVector();
            }
            putFrame();
            this.stackMapTableNumberOfEntries++;
        }
        this.previousFrame = this.currentFrame;
        this.currentFrame = null;
    }

    private void putFrame() {
        int i;
        char c;
        int[] iArr = this.currentFrame;
        int i2 = iArr[1];
        int i3 = iArr[2];
        if (this.symbolTable.getMajorVersion() < 50) {
            this.stackMapTableEntries.putShort(this.currentFrame[0]).putShort(i2);
            int i4 = i2 + 3;
            putAbstractTypes(3, i4);
            this.stackMapTableEntries.putShort(i3);
            putAbstractTypes(i4, i3 + i4);
            return;
        }
        if (this.stackMapTableNumberOfEntries == 0) {
            i = this.currentFrame[0];
        } else {
            i = (this.currentFrame[0] - this.previousFrame[0]) - 1;
        }
        int i5 = this.previousFrame[1];
        int i6 = i2 - i5;
        if (i3 == 0) {
            switch (i6) {
                case -3:
                case -2:
                case -1:
                    c = 248;
                    break;
                case 0:
                    c = i < 64 ? (char) 0 : (char) 251;
                    break;
                case 1:
                case 2:
                case 3:
                    c = 252;
                    break;
                default:
                    c = 255;
                    break;
            }
        } else if (i6 == 0 && i3 == 1) {
            c = i < 63 ? '@' : (char) 247;
        } else {
            c = 255;
        }
        if (c != 255) {
            int i7 = 3;
            for (int i8 = 0; i8 < i5 && i8 < i2; i8++) {
                if (this.currentFrame[i7] != this.previousFrame[i7]) {
                    c = 255;
                } else {
                    i7++;
                }
            }
        }
        if (c == 0) {
            this.stackMapTableEntries.putByte(i);
            return;
        }
        if (c == '@') {
            this.stackMapTableEntries.putByte(i + 64);
            putAbstractTypes(i2 + 3, i2 + 4);
            return;
        }
        if (c == 247) {
            this.stackMapTableEntries.putByte(247).putShort(i);
            putAbstractTypes(i2 + 3, i2 + 4);
            return;
        }
        if (c == 248) {
            this.stackMapTableEntries.putByte(i6 + 251).putShort(i);
            return;
        }
        if (c == 251) {
            this.stackMapTableEntries.putByte(251).putShort(i);
            return;
        }
        if (c == 252) {
            this.stackMapTableEntries.putByte(i6 + 251).putShort(i);
            putAbstractTypes(i5 + 3, i2 + 3);
            return;
        }
        this.stackMapTableEntries.putByte(255).putShort(i).putShort(i2);
        int i9 = i2 + 3;
        putAbstractTypes(3, i9);
        this.stackMapTableEntries.putShort(i3);
        putAbstractTypes(i9, i3 + i9);
    }

    private void putAbstractTypes(int i, int i2) {
        while (i < i2) {
            org.objectweb.asm.Frame.putAbstractType(this.symbolTable, this.currentFrame[i], this.stackMapTableEntries);
            i++;
        }
    }

    private void putFrameType(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            this.stackMapTableEntries.putByte(((java.lang.Integer) obj).intValue());
        } else if (obj instanceof java.lang.String) {
            this.stackMapTableEntries.putByte(7).putShort(this.symbolTable.addConstantClass((java.lang.String) obj).index);
        } else {
            this.stackMapTableEntries.putByte(8).putShort(((org.objectweb.asm.Label) obj).bytecodeOffset);
        }
    }

    boolean canCopyMethodAttributes(org.objectweb.asm.ClassReader classReader, boolean z, boolean z2, int i, int i2, int i3) {
        if (classReader == this.symbolTable.getSource() && i == this.descriptorIndex && i2 == this.signatureIndex) {
            if (z2 == ((this.accessFlags & 131072) != 0)) {
                if (z != (this.symbolTable.getMajorVersion() < 49 && (this.accessFlags & 4096) != 0)) {
                    return false;
                }
                if (i3 == 0) {
                    if (this.numberOfExceptions != 0) {
                        return false;
                    }
                } else if (classReader.readUnsignedShort(i3) == this.numberOfExceptions) {
                    int i4 = i3 + 2;
                    for (int i5 = 0; i5 < this.numberOfExceptions; i5++) {
                        if (classReader.readUnsignedShort(i4) != this.exceptionIndexTable[i5]) {
                            return false;
                        }
                        i4 += 2;
                    }
                }
                return true;
            }
        }
        return false;
    }

    void setMethodAttributesSource(int i, int i2) {
        this.sourceOffset = i + 6;
        this.sourceLength = i2 - 6;
    }

    int computeMethodInfoSize() {
        int exceptionTableSize;
        if (this.sourceOffset != 0) {
            return this.sourceLength + 6;
        }
        if (this.code.length <= 0) {
            exceptionTableSize = 8;
        } else {
            if (this.code.length > 65535) {
                throw new org.objectweb.asm.MethodTooLargeException(this.symbolTable.getClassName(), this.name, this.descriptor, this.code.length);
            }
            this.symbolTable.addConstantUtf8("Code");
            exceptionTableSize = this.code.length + 16 + org.objectweb.asm.Handler.getExceptionTableSize(this.firstHandler) + 8;
            if (this.stackMapTableEntries != null) {
                this.symbolTable.addConstantUtf8(this.symbolTable.getMajorVersion() >= 50 ? "StackMapTable" : "StackMap");
                exceptionTableSize += this.stackMapTableEntries.length + 8;
            }
            if (this.lineNumberTable != null) {
                this.symbolTable.addConstantUtf8("LineNumberTable");
                exceptionTableSize += this.lineNumberTable.length + 8;
            }
            if (this.localVariableTable != null) {
                this.symbolTable.addConstantUtf8("LocalVariableTable");
                exceptionTableSize += this.localVariableTable.length + 8;
            }
            if (this.localVariableTypeTable != null) {
                this.symbolTable.addConstantUtf8("LocalVariableTypeTable");
                exceptionTableSize += this.localVariableTypeTable.length + 8;
            }
            org.objectweb.asm.AnnotationWriter annotationWriter = this.lastCodeRuntimeVisibleTypeAnnotation;
            if (annotationWriter != null) {
                exceptionTableSize += annotationWriter.computeAnnotationsSize("RuntimeVisibleTypeAnnotations");
            }
            org.objectweb.asm.AnnotationWriter annotationWriter2 = this.lastCodeRuntimeInvisibleTypeAnnotation;
            if (annotationWriter2 != null) {
                exceptionTableSize += annotationWriter2.computeAnnotationsSize("RuntimeInvisibleTypeAnnotations");
            }
            org.objectweb.asm.Attribute attribute = this.firstCodeAttribute;
            if (attribute != null) {
                exceptionTableSize += attribute.computeAttributesSize(this.symbolTable, this.code.data, this.code.length, this.maxStack, this.maxLocals);
            }
        }
        if (this.numberOfExceptions > 0) {
            this.symbolTable.addConstantUtf8("Exceptions");
            exceptionTableSize += (this.numberOfExceptions * 2) + 8;
        }
        int iComputeAttributesSize = exceptionTableSize + org.objectweb.asm.Attribute.computeAttributesSize(this.symbolTable, this.accessFlags, this.signatureIndex) + org.objectweb.asm.AnnotationWriter.computeAnnotationsSize(this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation);
        org.objectweb.asm.AnnotationWriter[] annotationWriterArr = this.lastRuntimeVisibleParameterAnnotations;
        if (annotationWriterArr != null) {
            int length = this.visibleAnnotableParameterCount;
            if (length == 0) {
                length = annotationWriterArr.length;
            }
            iComputeAttributesSize += org.objectweb.asm.AnnotationWriter.computeParameterAnnotationsSize("RuntimeVisibleParameterAnnotations", annotationWriterArr, length);
        }
        org.objectweb.asm.AnnotationWriter[] annotationWriterArr2 = this.lastRuntimeInvisibleParameterAnnotations;
        if (annotationWriterArr2 != null) {
            int length2 = this.invisibleAnnotableParameterCount;
            if (length2 == 0) {
                length2 = annotationWriterArr2.length;
            }
            iComputeAttributesSize += org.objectweb.asm.AnnotationWriter.computeParameterAnnotationsSize("RuntimeInvisibleParameterAnnotations", annotationWriterArr2, length2);
        }
        if (this.defaultValue != null) {
            this.symbolTable.addConstantUtf8("AnnotationDefault");
            iComputeAttributesSize += this.defaultValue.length + 6;
        }
        if (this.parameters != null) {
            this.symbolTable.addConstantUtf8("MethodParameters");
            iComputeAttributesSize += this.parameters.length + 7;
        }
        org.objectweb.asm.Attribute attribute2 = this.firstAttribute;
        return attribute2 != null ? iComputeAttributesSize + attribute2.computeAttributesSize(this.symbolTable) : iComputeAttributesSize;
    }

    void putMethodInfo(org.objectweb.asm.ByteVector byteVector) {
        int attributeCount;
        boolean z = this.symbolTable.getMajorVersion() < 49;
        byteVector.putShort((~(z ? 4096 : 0)) & this.accessFlags).putShort(this.nameIndex).putShort(this.descriptorIndex);
        if (this.sourceOffset != 0) {
            byteVector.putByteArray(this.symbolTable.getSource().classFileBuffer, this.sourceOffset, this.sourceLength);
            return;
        }
        int attributeCount2 = this.code.length > 0 ? 1 : 0;
        if (this.numberOfExceptions > 0) {
            attributeCount2++;
        }
        int i = this.accessFlags;
        if ((i & 4096) != 0 && z) {
            attributeCount2++;
        }
        if (this.signatureIndex != 0) {
            attributeCount2++;
        }
        if ((131072 & i) != 0) {
            attributeCount2++;
        }
        if (this.lastRuntimeVisibleAnnotation != null) {
            attributeCount2++;
        }
        if (this.lastRuntimeInvisibleAnnotation != null) {
            attributeCount2++;
        }
        if (this.lastRuntimeVisibleParameterAnnotations != null) {
            attributeCount2++;
        }
        if (this.lastRuntimeInvisibleParameterAnnotations != null) {
            attributeCount2++;
        }
        if (this.lastRuntimeVisibleTypeAnnotation != null) {
            attributeCount2++;
        }
        if (this.lastRuntimeInvisibleTypeAnnotation != null) {
            attributeCount2++;
        }
        if (this.defaultValue != null) {
            attributeCount2++;
        }
        if (this.parameters != null) {
            attributeCount2++;
        }
        org.objectweb.asm.Attribute attribute = this.firstAttribute;
        if (attribute != null) {
            attributeCount2 += attribute.getAttributeCount();
        }
        byteVector.putShort(attributeCount2);
        if (this.code.length > 0) {
            int exceptionTableSize = this.code.length + 10 + org.objectweb.asm.Handler.getExceptionTableSize(this.firstHandler);
            org.objectweb.asm.ByteVector byteVector2 = this.stackMapTableEntries;
            if (byteVector2 != null) {
                exceptionTableSize += byteVector2.length + 8;
                attributeCount = 1;
            } else {
                attributeCount = 0;
            }
            org.objectweb.asm.ByteVector byteVector3 = this.lineNumberTable;
            if (byteVector3 != null) {
                exceptionTableSize += byteVector3.length + 8;
                attributeCount++;
            }
            org.objectweb.asm.ByteVector byteVector4 = this.localVariableTable;
            if (byteVector4 != null) {
                exceptionTableSize += byteVector4.length + 8;
                attributeCount++;
            }
            org.objectweb.asm.ByteVector byteVector5 = this.localVariableTypeTable;
            if (byteVector5 != null) {
                exceptionTableSize += byteVector5.length + 8;
                attributeCount++;
            }
            org.objectweb.asm.AnnotationWriter annotationWriter = this.lastCodeRuntimeVisibleTypeAnnotation;
            if (annotationWriter != null) {
                exceptionTableSize += annotationWriter.computeAnnotationsSize("RuntimeVisibleTypeAnnotations");
                attributeCount++;
            }
            org.objectweb.asm.AnnotationWriter annotationWriter2 = this.lastCodeRuntimeInvisibleTypeAnnotation;
            if (annotationWriter2 != null) {
                exceptionTableSize += annotationWriter2.computeAnnotationsSize("RuntimeInvisibleTypeAnnotations");
                attributeCount++;
            }
            org.objectweb.asm.Attribute attribute2 = this.firstCodeAttribute;
            if (attribute2 != null) {
                exceptionTableSize += attribute2.computeAttributesSize(this.symbolTable, this.code.data, this.code.length, this.maxStack, this.maxLocals);
                attributeCount += this.firstCodeAttribute.getAttributeCount();
            }
            byteVector.putShort(this.symbolTable.addConstantUtf8("Code")).putInt(exceptionTableSize).putShort(this.maxStack).putShort(this.maxLocals).putInt(this.code.length).putByteArray(this.code.data, 0, this.code.length);
            org.objectweb.asm.Handler.putExceptionTable(this.firstHandler, byteVector);
            byteVector.putShort(attributeCount);
            if (this.stackMapTableEntries != null) {
                byteVector.putShort(this.symbolTable.addConstantUtf8(this.symbolTable.getMajorVersion() >= 50 ? "StackMapTable" : "StackMap")).putInt(this.stackMapTableEntries.length + 2).putShort(this.stackMapTableNumberOfEntries).putByteArray(this.stackMapTableEntries.data, 0, this.stackMapTableEntries.length);
            }
            if (this.lineNumberTable != null) {
                byteVector.putShort(this.symbolTable.addConstantUtf8("LineNumberTable")).putInt(this.lineNumberTable.length + 2).putShort(this.lineNumberTableLength).putByteArray(this.lineNumberTable.data, 0, this.lineNumberTable.length);
            }
            if (this.localVariableTable != null) {
                byteVector.putShort(this.symbolTable.addConstantUtf8("LocalVariableTable")).putInt(this.localVariableTable.length + 2).putShort(this.localVariableTableLength).putByteArray(this.localVariableTable.data, 0, this.localVariableTable.length);
            }
            if (this.localVariableTypeTable != null) {
                byteVector.putShort(this.symbolTable.addConstantUtf8("LocalVariableTypeTable")).putInt(this.localVariableTypeTable.length + 2).putShort(this.localVariableTypeTableLength).putByteArray(this.localVariableTypeTable.data, 0, this.localVariableTypeTable.length);
            }
            org.objectweb.asm.AnnotationWriter annotationWriter3 = this.lastCodeRuntimeVisibleTypeAnnotation;
            if (annotationWriter3 != null) {
                annotationWriter3.putAnnotations(this.symbolTable.addConstantUtf8("RuntimeVisibleTypeAnnotations"), byteVector);
            }
            org.objectweb.asm.AnnotationWriter annotationWriter4 = this.lastCodeRuntimeInvisibleTypeAnnotation;
            if (annotationWriter4 != null) {
                annotationWriter4.putAnnotations(this.symbolTable.addConstantUtf8("RuntimeInvisibleTypeAnnotations"), byteVector);
            }
            org.objectweb.asm.Attribute attribute3 = this.firstCodeAttribute;
            if (attribute3 != null) {
                attribute3.putAttributes(this.symbolTable, this.code.data, this.code.length, this.maxStack, this.maxLocals, byteVector);
            }
        }
        if (this.numberOfExceptions > 0) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("Exceptions")).putInt((this.numberOfExceptions * 2) + 2).putShort(this.numberOfExceptions);
            for (int i2 : this.exceptionIndexTable) {
                byteVector.putShort(i2);
            }
        }
        org.objectweb.asm.Attribute.putAttributes(this.symbolTable, this.accessFlags, this.signatureIndex, byteVector);
        org.objectweb.asm.AnnotationWriter.putAnnotations(this.symbolTable, this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation, byteVector);
        if (this.lastRuntimeVisibleParameterAnnotations != null) {
            int iAddConstantUtf8 = this.symbolTable.addConstantUtf8("RuntimeVisibleParameterAnnotations");
            org.objectweb.asm.AnnotationWriter[] annotationWriterArr = this.lastRuntimeVisibleParameterAnnotations;
            int length = this.visibleAnnotableParameterCount;
            if (length == 0) {
                length = annotationWriterArr.length;
            }
            org.objectweb.asm.AnnotationWriter.putParameterAnnotations(iAddConstantUtf8, annotationWriterArr, length, byteVector);
        }
        if (this.lastRuntimeInvisibleParameterAnnotations != null) {
            int iAddConstantUtf9 = this.symbolTable.addConstantUtf8("RuntimeInvisibleParameterAnnotations");
            org.objectweb.asm.AnnotationWriter[] annotationWriterArr2 = this.lastRuntimeInvisibleParameterAnnotations;
            int length2 = this.invisibleAnnotableParameterCount;
            if (length2 == 0) {
                length2 = annotationWriterArr2.length;
            }
            org.objectweb.asm.AnnotationWriter.putParameterAnnotations(iAddConstantUtf9, annotationWriterArr2, length2, byteVector);
        }
        if (this.defaultValue != null) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("AnnotationDefault")).putInt(this.defaultValue.length).putByteArray(this.defaultValue.data, 0, this.defaultValue.length);
        }
        if (this.parameters != null) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("MethodParameters")).putInt(this.parameters.length + 1).putByte(this.parametersCount).putByteArray(this.parameters.data, 0, this.parameters.length);
        }
        org.objectweb.asm.Attribute attribute4 = this.firstAttribute;
        if (attribute4 != null) {
            attribute4.putAttributes(this.symbolTable, byteVector);
        }
    }

    final void collectAttributePrototypes(org.objectweb.asm.Attribute.Set set) {
        set.addAttributes(this.firstAttribute);
        set.addAttributes(this.firstCodeAttribute);
    }
}
