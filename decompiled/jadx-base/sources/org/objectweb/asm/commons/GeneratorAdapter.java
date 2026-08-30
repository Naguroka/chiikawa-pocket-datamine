package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class GeneratorAdapter extends org.objectweb.asm.commons.LocalVariablesSorter {
    public static final int ADD = 96;
    public static final int AND = 126;
    private static final java.lang.String CLASS_DESCRIPTOR = "Ljava/lang/Class;";
    public static final int DIV = 108;
    public static final int EQ = 153;
    public static final int GE = 156;
    public static final int GT = 157;
    public static final int LE = 158;
    public static final int LT = 155;
    public static final int MUL = 104;
    public static final int NE = 154;
    public static final int NEG = 116;
    public static final int OR = 128;
    public static final int REM = 112;
    public static final int SHL = 120;
    public static final int SHR = 122;
    public static final int SUB = 100;
    public static final int USHR = 124;
    public static final int XOR = 130;
    private final int access;
    private final org.objectweb.asm.Type[] argumentTypes;
    private final java.util.List<org.objectweb.asm.Type> localTypes;
    private final java.lang.String name;
    private final org.objectweb.asm.Type returnType;
    private static final org.objectweb.asm.Type BYTE_TYPE = org.objectweb.asm.Type.getObjectType("java/lang/Byte");
    private static final org.objectweb.asm.Type BOOLEAN_TYPE = org.objectweb.asm.Type.getObjectType("java/lang/Boolean");
    private static final org.objectweb.asm.Type SHORT_TYPE = org.objectweb.asm.Type.getObjectType("java/lang/Short");
    private static final org.objectweb.asm.Type CHARACTER_TYPE = org.objectweb.asm.Type.getObjectType("java/lang/Character");
    private static final org.objectweb.asm.Type INTEGER_TYPE = org.objectweb.asm.Type.getObjectType("java/lang/Integer");
    private static final org.objectweb.asm.Type FLOAT_TYPE = org.objectweb.asm.Type.getObjectType("java/lang/Float");
    private static final org.objectweb.asm.Type LONG_TYPE = org.objectweb.asm.Type.getObjectType("java/lang/Long");
    private static final org.objectweb.asm.Type DOUBLE_TYPE = org.objectweb.asm.Type.getObjectType("java/lang/Double");
    private static final org.objectweb.asm.Type NUMBER_TYPE = org.objectweb.asm.Type.getObjectType("java/lang/Number");
    private static final org.objectweb.asm.Type OBJECT_TYPE = org.objectweb.asm.Type.getObjectType("java/lang/Object");
    private static final org.objectweb.asm.commons.Method BOOLEAN_VALUE = org.objectweb.asm.commons.Method.getMethod("boolean booleanValue()");
    private static final org.objectweb.asm.commons.Method CHAR_VALUE = org.objectweb.asm.commons.Method.getMethod("char charValue()");
    private static final org.objectweb.asm.commons.Method INT_VALUE = org.objectweb.asm.commons.Method.getMethod("int intValue()");
    private static final org.objectweb.asm.commons.Method FLOAT_VALUE = org.objectweb.asm.commons.Method.getMethod("float floatValue()");
    private static final org.objectweb.asm.commons.Method LONG_VALUE = org.objectweb.asm.commons.Method.getMethod("long longValue()");
    private static final org.objectweb.asm.commons.Method DOUBLE_VALUE = org.objectweb.asm.commons.Method.getMethod("double doubleValue()");

    public GeneratorAdapter(org.objectweb.asm.MethodVisitor methodVisitor, int i, java.lang.String str, java.lang.String str2) {
        this(589824, methodVisitor, i, str, str2);
        if (getClass() != org.objectweb.asm.commons.GeneratorAdapter.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    protected GeneratorAdapter(int i, org.objectweb.asm.MethodVisitor methodVisitor, int i2, java.lang.String str, java.lang.String str2) {
        super(i, i2, str2, methodVisitor);
        this.localTypes = new java.util.ArrayList();
        this.access = i2;
        this.name = str;
        this.returnType = org.objectweb.asm.Type.getReturnType(str2);
        this.argumentTypes = org.objectweb.asm.Type.getArgumentTypes(str2);
    }

    public GeneratorAdapter(int i, org.objectweb.asm.commons.Method method, org.objectweb.asm.MethodVisitor methodVisitor) {
        this(methodVisitor, i, method.getName(), method.getDescriptor());
    }

    public GeneratorAdapter(int i, org.objectweb.asm.commons.Method method, java.lang.String str, org.objectweb.asm.Type[] typeArr, org.objectweb.asm.ClassVisitor classVisitor) {
        this(i, method, classVisitor.visitMethod(i, method.getName(), method.getDescriptor(), str, typeArr == null ? null : getInternalNames(typeArr)));
    }

    private static java.lang.String[] getInternalNames(org.objectweb.asm.Type[] typeArr) {
        int length = typeArr.length;
        java.lang.String[] strArr = new java.lang.String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = typeArr[i].getInternalName();
        }
        return strArr;
    }

    public int getAccess() {
        return this.access;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public org.objectweb.asm.Type getReturnType() {
        return this.returnType;
    }

    public org.objectweb.asm.Type[] getArgumentTypes() {
        return (org.objectweb.asm.Type[]) this.argumentTypes.clone();
    }

    public void push(boolean z) {
        push(z ? 1 : 0);
    }

    public void push(int i) {
        if (i >= -1 && i <= 5) {
            this.mv.visitInsn(i + 3);
            return;
        }
        if (i >= -128 && i <= 127) {
            this.mv.visitIntInsn(16, i);
        } else if (i >= -32768 && i <= 32767) {
            this.mv.visitIntInsn(17, i);
        } else {
            this.mv.visitLdcInsn(java.lang.Integer.valueOf(i));
        }
    }

    public void push(long j) {
        if (j == 0 || j == 1) {
            this.mv.visitInsn(((int) j) + 9);
        } else {
            this.mv.visitLdcInsn(java.lang.Long.valueOf(j));
        }
    }

    public void push(float f) {
        int iFloatToIntBits = java.lang.Float.floatToIntBits(f);
        if (iFloatToIntBits == 0 || iFloatToIntBits == 1065353216 || iFloatToIntBits == 1073741824) {
            this.mv.visitInsn(((int) f) + 11);
        } else {
            this.mv.visitLdcInsn(java.lang.Float.valueOf(f));
        }
    }

    public void push(double d) {
        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(d);
        if (jDoubleToLongBits == 0 || jDoubleToLongBits == 4607182418800017408L) {
            this.mv.visitInsn(((int) d) + 14);
        } else {
            this.mv.visitLdcInsn(java.lang.Double.valueOf(d));
        }
    }

    public void push(java.lang.String str) {
        if (str == null) {
            this.mv.visitInsn(1);
        } else {
            this.mv.visitLdcInsn(str);
        }
    }

    public void push(org.objectweb.asm.Type type) {
        if (type == null) {
            this.mv.visitInsn(1);
            return;
        }
        switch (type.getSort()) {
            case 1:
                this.mv.visitFieldInsn(org.objectweb.asm.Opcodes.GETSTATIC, "java/lang/Boolean", "TYPE", CLASS_DESCRIPTOR);
                break;
            case 2:
                this.mv.visitFieldInsn(org.objectweb.asm.Opcodes.GETSTATIC, "java/lang/Character", "TYPE", CLASS_DESCRIPTOR);
                break;
            case 3:
                this.mv.visitFieldInsn(org.objectweb.asm.Opcodes.GETSTATIC, "java/lang/Byte", "TYPE", CLASS_DESCRIPTOR);
                break;
            case 4:
                this.mv.visitFieldInsn(org.objectweb.asm.Opcodes.GETSTATIC, "java/lang/Short", "TYPE", CLASS_DESCRIPTOR);
                break;
            case 5:
                this.mv.visitFieldInsn(org.objectweb.asm.Opcodes.GETSTATIC, "java/lang/Integer", "TYPE", CLASS_DESCRIPTOR);
                break;
            case 6:
                this.mv.visitFieldInsn(org.objectweb.asm.Opcodes.GETSTATIC, "java/lang/Float", "TYPE", CLASS_DESCRIPTOR);
                break;
            case 7:
                this.mv.visitFieldInsn(org.objectweb.asm.Opcodes.GETSTATIC, "java/lang/Long", "TYPE", CLASS_DESCRIPTOR);
                break;
            case 8:
                this.mv.visitFieldInsn(org.objectweb.asm.Opcodes.GETSTATIC, "java/lang/Double", "TYPE", CLASS_DESCRIPTOR);
                break;
            default:
                this.mv.visitLdcInsn(type);
                break;
        }
    }

    public void push(org.objectweb.asm.Handle handle) {
        if (handle == null) {
            this.mv.visitInsn(1);
        } else {
            this.mv.visitLdcInsn(handle);
        }
    }

    public void push(org.objectweb.asm.ConstantDynamic constantDynamic) {
        if (constantDynamic == null) {
            this.mv.visitInsn(1);
        } else {
            this.mv.visitLdcInsn(constantDynamic);
        }
    }

    private int getArgIndex(int i) {
        int size = (this.access & 8) == 0 ? 1 : 0;
        for (int i2 = 0; i2 < i; i2++) {
            size += this.argumentTypes[i2].getSize();
        }
        return size;
    }

    private void loadInsn(org.objectweb.asm.Type type, int i) {
        this.mv.visitVarInsn(type.getOpcode(21), i);
    }

    private void storeInsn(org.objectweb.asm.Type type, int i) {
        this.mv.visitVarInsn(type.getOpcode(54), i);
    }

    public void loadThis() {
        if ((this.access & 8) != 0) {
            throw new java.lang.IllegalStateException("no 'this' pointer within static method");
        }
        this.mv.visitVarInsn(25, 0);
    }

    public void loadArg(int i) {
        loadInsn(this.argumentTypes[i], getArgIndex(i));
    }

    public void loadArgs(int i, int i2) {
        int argIndex = getArgIndex(i);
        for (int i3 = 0; i3 < i2; i3++) {
            org.objectweb.asm.Type type = this.argumentTypes[i + i3];
            loadInsn(type, argIndex);
            argIndex += type.getSize();
        }
    }

    public void loadArgs() {
        loadArgs(0, this.argumentTypes.length);
    }

    public void loadArgArray() {
        push(this.argumentTypes.length);
        newArray(OBJECT_TYPE);
        for (int i = 0; i < this.argumentTypes.length; i++) {
            dup();
            push(i);
            loadArg(i);
            box(this.argumentTypes[i]);
            arrayStore(OBJECT_TYPE);
        }
    }

    public void storeArg(int i) {
        storeInsn(this.argumentTypes[i], getArgIndex(i));
    }

    public org.objectweb.asm.Type getLocalType(int i) {
        return this.localTypes.get(i - this.firstLocal);
    }

    @Override // org.objectweb.asm.commons.LocalVariablesSorter
    protected void setLocalType(int i, org.objectweb.asm.Type type) {
        int i2 = i - this.firstLocal;
        while (this.localTypes.size() < i2 + 1) {
            this.localTypes.add(null);
        }
        this.localTypes.set(i2, type);
    }

    public void loadLocal(int i) {
        loadInsn(getLocalType(i), i);
    }

    public void loadLocal(int i, org.objectweb.asm.Type type) {
        setLocalType(i, type);
        loadInsn(type, i);
    }

    public void storeLocal(int i) {
        storeInsn(getLocalType(i), i);
    }

    public void storeLocal(int i, org.objectweb.asm.Type type) {
        setLocalType(i, type);
        storeInsn(type, i);
    }

    public void arrayLoad(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(46));
    }

    public void arrayStore(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(79));
    }

    public void pop() {
        this.mv.visitInsn(87);
    }

    public void pop2() {
        this.mv.visitInsn(88);
    }

    public void dup() {
        this.mv.visitInsn(89);
    }

    public void dup2() {
        this.mv.visitInsn(92);
    }

    public void dupX1() {
        this.mv.visitInsn(90);
    }

    public void dupX2() {
        this.mv.visitInsn(91);
    }

    public void dup2X1() {
        this.mv.visitInsn(93);
    }

    public void dup2X2() {
        this.mv.visitInsn(94);
    }

    public void swap() {
        this.mv.visitInsn(95);
    }

    public void swap(org.objectweb.asm.Type type, org.objectweb.asm.Type type2) {
        if (type2.getSize() == 1) {
            if (type.getSize() == 1) {
                swap();
                return;
            } else {
                dupX2();
                pop();
                return;
            }
        }
        if (type.getSize() == 1) {
            dup2X1();
            pop2();
        } else {
            dup2X2();
            pop2();
        }
    }

    public void math(int i, org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(i));
    }

    public void not() {
        this.mv.visitInsn(4);
        this.mv.visitInsn(130);
    }

    public void iinc(int i, int i2) {
        this.mv.visitIincInsn(i, i2);
    }

    public void cast(org.objectweb.asm.Type type, org.objectweb.asm.Type type2) {
        if (type != type2) {
            if (type.getSort() < 1 || type.getSort() > 8 || type2.getSort() < 1 || type2.getSort() > 8) {
                throw new java.lang.IllegalArgumentException("Cannot cast from " + type + " to " + type2);
            }
            org.objectweb.asm.commons.InstructionAdapter.cast(this.mv, type, type2);
        }
    }

    private static org.objectweb.asm.Type getBoxedType(org.objectweb.asm.Type type) {
        switch (type.getSort()) {
            case 1:
                return BOOLEAN_TYPE;
            case 2:
                return CHARACTER_TYPE;
            case 3:
                return BYTE_TYPE;
            case 4:
                return SHORT_TYPE;
            case 5:
                return INTEGER_TYPE;
            case 6:
                return FLOAT_TYPE;
            case 7:
                return LONG_TYPE;
            case 8:
                return DOUBLE_TYPE;
            default:
                return type;
        }
    }

    public void box(org.objectweb.asm.Type type) {
        if (type.getSort() == 10 || type.getSort() == 9) {
            return;
        }
        if (type == org.objectweb.asm.Type.VOID_TYPE) {
            push((java.lang.String) null);
            return;
        }
        org.objectweb.asm.Type boxedType = getBoxedType(type);
        newInstance(boxedType);
        if (type.getSize() == 2) {
            dupX2();
            dupX2();
            pop();
        } else {
            dupX1();
            swap();
        }
        invokeConstructor(boxedType, new org.objectweb.asm.commons.Method("<init>", org.objectweb.asm.Type.VOID_TYPE, new org.objectweb.asm.Type[]{type}));
    }

    public void valueOf(org.objectweb.asm.Type type) {
        if (type.getSort() == 10 || type.getSort() == 9) {
            return;
        }
        if (type == org.objectweb.asm.Type.VOID_TYPE) {
            push((java.lang.String) null);
        } else {
            org.objectweb.asm.Type boxedType = getBoxedType(type);
            invokeStatic(boxedType, new org.objectweb.asm.commons.Method("valueOf", boxedType, new org.objectweb.asm.Type[]{type}));
        }
    }

    public void unbox(org.objectweb.asm.Type type) {
        org.objectweb.asm.commons.Method method;
        org.objectweb.asm.Type type2 = NUMBER_TYPE;
        switch (type.getSort()) {
            case 0:
                return;
            case 1:
                type2 = BOOLEAN_TYPE;
                method = BOOLEAN_VALUE;
                break;
            case 2:
                type2 = CHARACTER_TYPE;
                method = CHAR_VALUE;
                break;
            case 3:
            case 4:
            case 5:
                method = INT_VALUE;
                break;
            case 6:
                method = FLOAT_VALUE;
                break;
            case 7:
                method = LONG_VALUE;
                break;
            case 8:
                method = DOUBLE_VALUE;
                break;
            default:
                method = null;
                break;
        }
        if (method == null) {
            checkCast(type);
        } else {
            checkCast(type2);
            invokeVirtual(type2, method);
        }
    }

    public org.objectweb.asm.Label newLabel() {
        return new org.objectweb.asm.Label();
    }

    public void mark(org.objectweb.asm.Label label) {
        this.mv.visitLabel(label);
    }

    public org.objectweb.asm.Label mark() {
        org.objectweb.asm.Label label = new org.objectweb.asm.Label();
        this.mv.visitLabel(label);
        return label;
    }

    public void ifCmp(org.objectweb.asm.Type type, int i, org.objectweb.asm.Label label) {
        int i2;
        switch (type.getSort()) {
            case 6:
                this.mv.visitInsn((i == 156 || i == 157) ? org.objectweb.asm.Opcodes.FCMPL : 150);
                break;
            case 7:
                this.mv.visitInsn(org.objectweb.asm.Opcodes.LCMP);
                break;
            case 8:
                this.mv.visitInsn((i == 156 || i == 157) ? org.objectweb.asm.Opcodes.DCMPL : org.objectweb.asm.Opcodes.DCMPG);
                break;
            case 9:
            case 10:
                if (i == 153) {
                    this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.IF_ACMPEQ, label);
                    return;
                } else {
                    if (i == 154) {
                        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.IF_ACMPNE, label);
                        return;
                    }
                    throw new java.lang.IllegalArgumentException("Bad comparison for type " + type);
                }
            default:
                switch (i) {
                    case 153:
                        i2 = org.objectweb.asm.Opcodes.IF_ICMPEQ;
                        break;
                    case 154:
                        i2 = org.objectweb.asm.Opcodes.IF_ICMPNE;
                        break;
                    case 155:
                        i2 = org.objectweb.asm.Opcodes.IF_ICMPLT;
                        break;
                    case 156:
                        i2 = org.objectweb.asm.Opcodes.IF_ICMPGE;
                        break;
                    case 157:
                        i2 = org.objectweb.asm.Opcodes.IF_ICMPGT;
                        break;
                    case 158:
                        i2 = org.objectweb.asm.Opcodes.IF_ICMPLE;
                        break;
                    default:
                        throw new java.lang.IllegalArgumentException("Bad comparison mode " + i);
                }
                this.mv.visitJumpInsn(i2, label);
                return;
        }
        this.mv.visitJumpInsn(i, label);
    }

    public void ifICmp(int i, org.objectweb.asm.Label label) {
        ifCmp(org.objectweb.asm.Type.INT_TYPE, i, label);
    }

    public void ifZCmp(int i, org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(i, label);
    }

    public void ifNull(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.IFNULL, label);
    }

    public void ifNonNull(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.IFNONNULL, label);
    }

    public void goTo(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.GOTO, label);
    }

    public void ret(int i) {
        this.mv.visitVarInsn(org.objectweb.asm.Opcodes.RET, i);
    }

    public void tableSwitch(int[] iArr, org.objectweb.asm.commons.TableSwitchGenerator tableSwitchGenerator) {
        tableSwitch(iArr, tableSwitchGenerator, (iArr.length == 0 ? 0.0f : ((float) iArr.length) / ((float) ((iArr[iArr.length - 1] - iArr[0]) + 1))) >= 0.5f);
    }

    public void tableSwitch(int[] iArr, org.objectweb.asm.commons.TableSwitchGenerator tableSwitchGenerator, boolean z) {
        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i] < iArr[i - 1]) {
                throw new java.lang.IllegalArgumentException("keys must be sorted in ascending order");
            }
        }
        org.objectweb.asm.Label labelNewLabel = newLabel();
        org.objectweb.asm.Label labelNewLabel2 = newLabel();
        if (iArr.length > 0) {
            int length = iArr.length;
            int i2 = 0;
            if (z) {
                int i3 = iArr[0];
                int i4 = iArr[length - 1];
                int i5 = (i4 - i3) + 1;
                org.objectweb.asm.Label[] labelArr = new org.objectweb.asm.Label[i5];
                java.util.Arrays.fill(labelArr, labelNewLabel);
                for (int i6 : iArr) {
                    labelArr[i6 - i3] = newLabel();
                }
                this.mv.visitTableSwitchInsn(i3, i4, labelNewLabel, labelArr);
                while (i2 < i5) {
                    org.objectweb.asm.Label label = labelArr[i2];
                    if (label != labelNewLabel) {
                        mark(label);
                        tableSwitchGenerator.generateCase(i2 + i3, labelNewLabel2);
                    }
                    i2++;
                }
            } else {
                org.objectweb.asm.Label[] labelArr2 = new org.objectweb.asm.Label[length];
                for (int i7 = 0; i7 < length; i7++) {
                    labelArr2[i7] = newLabel();
                }
                this.mv.visitLookupSwitchInsn(labelNewLabel, iArr, labelArr2);
                while (i2 < length) {
                    mark(labelArr2[i2]);
                    tableSwitchGenerator.generateCase(iArr[i2], labelNewLabel2);
                    i2++;
                }
            }
        }
        mark(labelNewLabel);
        tableSwitchGenerator.generateDefault();
        mark(labelNewLabel2);
    }

    public void returnValue() {
        this.mv.visitInsn(this.returnType.getOpcode(172));
    }

    private void fieldInsn(int i, org.objectweb.asm.Type type, java.lang.String str, org.objectweb.asm.Type type2) {
        this.mv.visitFieldInsn(i, type.getInternalName(), str, type2.getDescriptor());
    }

    public void getStatic(org.objectweb.asm.Type type, java.lang.String str, org.objectweb.asm.Type type2) {
        fieldInsn(org.objectweb.asm.Opcodes.GETSTATIC, type, str, type2);
    }

    public void putStatic(org.objectweb.asm.Type type, java.lang.String str, org.objectweb.asm.Type type2) {
        fieldInsn(org.objectweb.asm.Opcodes.PUTSTATIC, type, str, type2);
    }

    public void getField(org.objectweb.asm.Type type, java.lang.String str, org.objectweb.asm.Type type2) {
        fieldInsn(org.objectweb.asm.Opcodes.GETFIELD, type, str, type2);
    }

    public void putField(org.objectweb.asm.Type type, java.lang.String str, org.objectweb.asm.Type type2) {
        fieldInsn(org.objectweb.asm.Opcodes.PUTFIELD, type, str, type2);
    }

    private void invokeInsn(int i, org.objectweb.asm.Type type, org.objectweb.asm.commons.Method method, boolean z) {
        this.mv.visitMethodInsn(i, type.getSort() == 9 ? type.getDescriptor() : type.getInternalName(), method.getName(), method.getDescriptor(), z);
    }

    public void invokeVirtual(org.objectweb.asm.Type type, org.objectweb.asm.commons.Method method) {
        invokeInsn(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, type, method, false);
    }

    public void invokeConstructor(org.objectweb.asm.Type type, org.objectweb.asm.commons.Method method) {
        invokeInsn(org.objectweb.asm.Opcodes.INVOKESPECIAL, type, method, false);
    }

    public void invokeStatic(org.objectweb.asm.Type type, org.objectweb.asm.commons.Method method) {
        invokeInsn(org.objectweb.asm.Opcodes.INVOKESTATIC, type, method, false);
    }

    public void invokeInterface(org.objectweb.asm.Type type, org.objectweb.asm.commons.Method method) {
        invokeInsn(org.objectweb.asm.Opcodes.INVOKEINTERFACE, type, method, true);
    }

    public void invokeDynamic(java.lang.String str, java.lang.String str2, org.objectweb.asm.Handle handle, java.lang.Object... objArr) {
        this.mv.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    private void typeInsn(int i, org.objectweb.asm.Type type) {
        this.mv.visitTypeInsn(i, type.getInternalName());
    }

    public void newInstance(org.objectweb.asm.Type type) {
        typeInsn(org.objectweb.asm.Opcodes.NEW, type);
    }

    public void newArray(org.objectweb.asm.Type type) {
        org.objectweb.asm.commons.InstructionAdapter.newarray(this.mv, type);
    }

    public void arrayLength() {
        this.mv.visitInsn(org.objectweb.asm.Opcodes.ARRAYLENGTH);
    }

    public void throwException() {
        this.mv.visitInsn(org.objectweb.asm.Opcodes.ATHROW);
    }

    public void throwException(org.objectweb.asm.Type type, java.lang.String str) {
        newInstance(type);
        dup();
        push(str);
        invokeConstructor(type, org.objectweb.asm.commons.Method.getMethod("void <init> (String)"));
        throwException();
    }

    public void checkCast(org.objectweb.asm.Type type) {
        if (type.equals(OBJECT_TYPE)) {
            return;
        }
        typeInsn(192, type);
    }

    public void instanceOf(org.objectweb.asm.Type type) {
        typeInsn(org.objectweb.asm.Opcodes.INSTANCEOF, type);
    }

    public void monitorEnter() {
        this.mv.visitInsn(org.objectweb.asm.Opcodes.MONITORENTER);
    }

    public void monitorExit() {
        this.mv.visitInsn(org.objectweb.asm.Opcodes.MONITOREXIT);
    }

    public void endMethod() {
        if ((this.access & 1024) == 0) {
            this.mv.visitMaxs(0, 0);
        }
        this.mv.visitEnd();
    }

    public void catchException(org.objectweb.asm.Label label, org.objectweb.asm.Label label2, org.objectweb.asm.Type type) {
        org.objectweb.asm.Label label3 = new org.objectweb.asm.Label();
        if (type == null) {
            this.mv.visitTryCatchBlock(label, label2, label3, null);
        } else {
            this.mv.visitTryCatchBlock(label, label2, label3, type.getInternalName());
        }
        mark(label3);
    }
}
