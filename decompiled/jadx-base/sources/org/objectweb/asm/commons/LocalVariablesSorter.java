package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class LocalVariablesSorter extends org.objectweb.asm.MethodVisitor {
    private static final org.objectweb.asm.Type OBJECT_TYPE = org.objectweb.asm.Type.getObjectType("java/lang/Object");
    protected final int firstLocal;
    protected int nextLocal;
    private java.lang.Object[] remappedLocalTypes;
    private int[] remappedVariableIndices;

    protected void setLocalType(int i, org.objectweb.asm.Type type) {
    }

    protected void updateNewLocals(java.lang.Object[] objArr) {
    }

    public LocalVariablesSorter(int i, java.lang.String str, org.objectweb.asm.MethodVisitor methodVisitor) {
        this(589824, i, str, methodVisitor);
        if (getClass() != org.objectweb.asm.commons.LocalVariablesSorter.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    protected LocalVariablesSorter(int i, int i2, java.lang.String str, org.objectweb.asm.MethodVisitor methodVisitor) {
        super(i, methodVisitor);
        this.remappedVariableIndices = new int[40];
        this.remappedLocalTypes = new java.lang.Object[20];
        int i3 = i2 & 8;
        this.nextLocal = i3 == 0 ? 1 : 0;
        for (org.objectweb.asm.Type type : org.objectweb.asm.Type.getArgumentTypes(str)) {
            this.nextLocal += type.getSize();
        }
        this.firstLocal = this.nextLocal;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        org.objectweb.asm.Type type;
        if (i != 169) {
            switch (i) {
                case 21:
                    type = org.objectweb.asm.Type.INT_TYPE;
                    break;
                case 22:
                    type = org.objectweb.asm.Type.LONG_TYPE;
                    break;
                case 23:
                    type = org.objectweb.asm.Type.FLOAT_TYPE;
                    break;
                case 24:
                    type = org.objectweb.asm.Type.DOUBLE_TYPE;
                    break;
                case 25:
                    type = OBJECT_TYPE;
                    break;
                default:
                    switch (i) {
                        case 54:
                            type = org.objectweb.asm.Type.INT_TYPE;
                            break;
                        case 55:
                            type = org.objectweb.asm.Type.LONG_TYPE;
                            break;
                        case 56:
                            type = org.objectweb.asm.Type.FLOAT_TYPE;
                            break;
                        case 57:
                            type = org.objectweb.asm.Type.DOUBLE_TYPE;
                            break;
                        case 58:
                            type = OBJECT_TYPE;
                            break;
                        default:
                            throw new java.lang.IllegalArgumentException("Invalid opcode " + i);
                    }
                    break;
            }
        } else {
            type = OBJECT_TYPE;
        }
        super.visitVarInsn(i, remap(i2, type));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        super.visitIincInsn(remap(i, org.objectweb.asm.Type.INT_TYPE), i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i, int i2) {
        super.visitMaxs(i, this.nextLocal);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(java.lang.String str, java.lang.String str2, java.lang.String str3, org.objectweb.asm.Label label, org.objectweb.asm.Label label2, int i) {
        super.visitLocalVariable(str, str2, str3, label, label2, remap(i, org.objectweb.asm.Type.getType(str2)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitLocalVariableAnnotation(int i, org.objectweb.asm.TypePath typePath, org.objectweb.asm.Label[] labelArr, org.objectweb.asm.Label[] labelArr2, int[] iArr, java.lang.String str, boolean z) {
        org.objectweb.asm.Type type = org.objectweb.asm.Type.getType(str);
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = remap(iArr[i2], type);
        }
        return super.visitLocalVariableAnnotation(i, typePath, labelArr, labelArr2, iArr2, str, z);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i, int i2, java.lang.Object[] objArr, int i3, java.lang.Object[] objArr2) {
        java.lang.Object obj;
        if (i != -1) {
            throw new java.lang.IllegalArgumentException("LocalVariablesSorter only accepts expanded frames (see ClassReader.EXPAND_FRAMES)");
        }
        java.lang.Object[] objArr3 = this.remappedLocalTypes;
        int length = objArr3.length;
        java.lang.Object[] objArr4 = new java.lang.Object[length];
        int i4 = 0;
        java.lang.System.arraycopy(objArr3, 0, objArr4, 0, length);
        updateNewLocals(this.remappedLocalTypes);
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = 2;
            if (i5 >= i2) {
                break;
            }
            java.lang.Object obj2 = objArr[i5];
            if (obj2 != org.objectweb.asm.Opcodes.TOP) {
                org.objectweb.asm.Type objectType = OBJECT_TYPE;
                if (obj2 == org.objectweb.asm.Opcodes.INTEGER) {
                    objectType = org.objectweb.asm.Type.INT_TYPE;
                } else if (obj2 == org.objectweb.asm.Opcodes.FLOAT) {
                    objectType = org.objectweb.asm.Type.FLOAT_TYPE;
                } else if (obj2 == org.objectweb.asm.Opcodes.LONG) {
                    objectType = org.objectweb.asm.Type.LONG_TYPE;
                } else if (obj2 == org.objectweb.asm.Opcodes.DOUBLE) {
                    objectType = org.objectweb.asm.Type.DOUBLE_TYPE;
                } else if (obj2 instanceof java.lang.String) {
                    objectType = org.objectweb.asm.Type.getObjectType((java.lang.String) obj2);
                }
                setFrameLocal(remap(i6, objectType), obj2);
            }
            if (obj2 != org.objectweb.asm.Opcodes.LONG && obj2 != org.objectweb.asm.Opcodes.DOUBLE) {
                i7 = 1;
            }
            i6 += i7;
            i5++;
        }
        int i8 = 0;
        while (true) {
            int i9 = i8;
            while (true) {
                java.lang.Object[] objArr5 = this.remappedLocalTypes;
                if (i4 < objArr5.length) {
                    obj = objArr5[i4];
                    i4 += (obj == org.objectweb.asm.Opcodes.LONG || obj == org.objectweb.asm.Opcodes.DOUBLE) ? 2 : 1;
                    if (obj == null || obj == org.objectweb.asm.Opcodes.TOP) {
                        this.remappedLocalTypes[i8] = org.objectweb.asm.Opcodes.TOP;
                        i8++;
                    }
                } else {
                    super.visitFrame(i, i9, objArr5, i3, objArr2);
                    this.remappedLocalTypes = objArr4;
                    return;
                }
            }
            this.remappedLocalTypes[i8] = obj;
            i8++;
        }
    }

    public int newLocal(org.objectweb.asm.Type type) {
        java.lang.Object descriptor;
        switch (type.getSort()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                descriptor = org.objectweb.asm.Opcodes.INTEGER;
                break;
            case 6:
                descriptor = org.objectweb.asm.Opcodes.FLOAT;
                break;
            case 7:
                descriptor = org.objectweb.asm.Opcodes.LONG;
                break;
            case 8:
                descriptor = org.objectweb.asm.Opcodes.DOUBLE;
                break;
            case 9:
                descriptor = type.getDescriptor();
                break;
            case 10:
                descriptor = type.getInternalName();
                break;
            default:
                throw new java.lang.AssertionError();
        }
        int iNewLocalMapping = newLocalMapping(type);
        setLocalType(iNewLocalMapping, type);
        setFrameLocal(iNewLocalMapping, descriptor);
        return iNewLocalMapping;
    }

    private void setFrameLocal(int i, java.lang.Object obj) {
        int length = this.remappedLocalTypes.length;
        if (i >= length) {
            java.lang.Object[] objArr = new java.lang.Object[java.lang.Math.max(length * 2, i + 1)];
            java.lang.System.arraycopy(this.remappedLocalTypes, 0, objArr, 0, length);
            this.remappedLocalTypes = objArr;
        }
        this.remappedLocalTypes[i] = obj;
    }

    private int remap(int i, org.objectweb.asm.Type type) {
        if (type.getSize() + i <= this.firstLocal) {
            return i;
        }
        int size = ((i * 2) + type.getSize()) - 1;
        int length = this.remappedVariableIndices.length;
        if (size >= length) {
            int[] iArr = new int[java.lang.Math.max(length * 2, size + 1)];
            java.lang.System.arraycopy(this.remappedVariableIndices, 0, iArr, 0, length);
            this.remappedVariableIndices = iArr;
        }
        int i2 = this.remappedVariableIndices[size];
        if (i2 != 0) {
            return i2 - 1;
        }
        int iNewLocalMapping = newLocalMapping(type);
        setLocalType(iNewLocalMapping, type);
        this.remappedVariableIndices[size] = iNewLocalMapping + 1;
        return iNewLocalMapping;
    }

    protected int newLocalMapping(org.objectweb.asm.Type type) {
        int i = this.nextLocal;
        this.nextLocal = type.getSize() + i;
        return i;
    }
}
