package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
class Frame {
    static final int APPEND_FRAME = 252;
    private static final int ARRAY_OF = 67108864;
    private static final int BOOLEAN = 4194313;
    private static final int BYTE = 4194314;
    private static final int CHAR = 4194315;
    static final int CHOP_FRAME = 248;
    private static final int CONSTANT_KIND = 4194304;
    private static final int DIM_MASK = -67108864;
    private static final int DIM_SHIFT = 26;
    private static final int DIM_SIZE = 6;
    private static final int DOUBLE = 4194307;
    private static final int ELEMENT_OF = -67108864;
    private static final int FLAGS_SHIFT = 20;
    private static final int FLAGS_SIZE = 2;
    private static final int FLOAT = 4194306;
    static final int FULL_FRAME = 255;
    private static final int INTEGER = 4194305;
    private static final int ITEM_ASM_BOOLEAN = 9;
    private static final int ITEM_ASM_BYTE = 10;
    private static final int ITEM_ASM_CHAR = 11;
    private static final int ITEM_ASM_SHORT = 12;
    static final int ITEM_DOUBLE = 3;
    static final int ITEM_FLOAT = 2;
    static final int ITEM_INTEGER = 1;
    static final int ITEM_LONG = 4;
    static final int ITEM_NULL = 5;
    static final int ITEM_OBJECT = 7;
    static final int ITEM_TOP = 0;
    static final int ITEM_UNINITIALIZED = 8;
    static final int ITEM_UNINITIALIZED_THIS = 6;
    private static final int KIND_MASK = 62914560;
    private static final int KIND_SHIFT = 22;
    private static final int KIND_SIZE = 4;
    private static final int LOCAL_KIND = 16777216;
    private static final int LONG = 4194308;
    private static final int NULL = 4194309;
    private static final int REFERENCE_KIND = 8388608;
    static final int RESERVED = 128;
    static final int SAME_FRAME = 0;
    static final int SAME_FRAME_EXTENDED = 251;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME = 64;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED = 247;
    private static final int SHORT = 4194316;
    private static final int STACK_KIND = 20971520;
    private static final int TOP = 4194304;
    private static final int TOP_IF_LONG_OR_DOUBLE_FLAG = 1048576;
    private static final int UNINITIALIZED_KIND = 12582912;
    private static final int UNINITIALIZED_THIS = 4194310;
    private static final int VALUE_MASK = 1048575;
    private static final int VALUE_SIZE = 20;
    private int initializationCount;
    private int[] initializations;
    private int[] inputLocals;
    private int[] inputStack;
    private int[] outputLocals;
    private int[] outputStack;
    private short outputStackStart;
    private short outputStackTop;
    org.objectweb.asm.Label owner;

    Frame(org.objectweb.asm.Label label) {
        this.owner = label;
    }

    final void copyFrom(org.objectweb.asm.Frame frame) {
        this.inputLocals = frame.inputLocals;
        this.inputStack = frame.inputStack;
        this.outputStackStart = (short) 0;
        this.outputLocals = frame.outputLocals;
        this.outputStack = frame.outputStack;
        this.outputStackTop = frame.outputStackTop;
        this.initializationCount = frame.initializationCount;
        this.initializations = frame.initializations;
    }

    static int getAbstractTypeFromApiFormat(org.objectweb.asm.SymbolTable symbolTable, java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue() | 4194304;
        }
        if (obj instanceof java.lang.String) {
            return getAbstractTypeFromDescriptor(symbolTable, org.objectweb.asm.Type.getObjectType((java.lang.String) obj).getDescriptor(), 0);
        }
        return symbolTable.addUninitializedType("", ((org.objectweb.asm.Label) obj).bytecodeOffset) | UNINITIALIZED_KIND;
    }

    static int getAbstractTypeFromInternalName(org.objectweb.asm.SymbolTable symbolTable, java.lang.String str) {
        return symbolTable.addType(str) | 8388608;
    }

    private static int getAbstractTypeFromDescriptor(org.objectweb.asm.SymbolTable symbolTable, java.lang.String str, int i) {
        char cCharAt = str.charAt(i);
        int iAddType = FLOAT;
        if (cCharAt == 'F') {
            return FLOAT;
        }
        if (cCharAt == 'L') {
            return symbolTable.addType(str.substring(i + 1, str.length() - 1)) | 8388608;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return 0;
            }
            if (cCharAt != 'I') {
                if (cCharAt == 'J') {
                    return LONG;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        int i2 = i + 1;
                        while (str.charAt(i2) == '[') {
                            i2++;
                        }
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 != 'F') {
                            if (cCharAt2 == 'L') {
                                iAddType = symbolTable.addType(str.substring(i2 + 1, str.length() - 1)) | 8388608;
                            } else if (cCharAt2 == 'S') {
                                iAddType = SHORT;
                            } else if (cCharAt2 == 'Z') {
                                iAddType = BOOLEAN;
                            } else if (cCharAt2 == 'I') {
                                iAddType = INTEGER;
                            } else if (cCharAt2 != 'J') {
                                switch (cCharAt2) {
                                    case 'B':
                                        iAddType = BYTE;
                                        break;
                                    case 'C':
                                        iAddType = CHAR;
                                        break;
                                    case 'D':
                                        iAddType = DOUBLE;
                                        break;
                                    default:
                                        throw new java.lang.IllegalArgumentException();
                                }
                            } else {
                                iAddType = LONG;
                            }
                        }
                        return ((i2 - i) << 26) | iAddType;
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return DOUBLE;
                        default:
                            throw new java.lang.IllegalArgumentException();
                    }
                }
            }
        }
        return INTEGER;
    }

    final void setInputFrameFromDescriptor(org.objectweb.asm.SymbolTable symbolTable, int i, java.lang.String str, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.inputLocals = iArr;
        this.inputStack = new int[0];
        if ((i & 8) == 0) {
            i3 = 1;
            if ((i & 262144) == 0) {
                iArr[0] = symbolTable.addType(symbolTable.getClassName()) | 8388608;
            } else {
                iArr[0] = UNINITIALIZED_THIS;
            }
        } else {
            i3 = 0;
        }
        for (org.objectweb.asm.Type type : org.objectweb.asm.Type.getArgumentTypes(str)) {
            int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, type.getDescriptor(), 0);
            int[] iArr2 = this.inputLocals;
            int i4 = i3 + 1;
            iArr2[i3] = abstractTypeFromDescriptor;
            if (abstractTypeFromDescriptor == LONG || abstractTypeFromDescriptor == DOUBLE) {
                i3 = i4 + 1;
                iArr2[i4] = 4194304;
            } else {
                i3 = i4;
            }
        }
        while (i3 < i2) {
            this.inputLocals[i3] = 4194304;
            i3++;
        }
    }

    final void setInputFrameFromApiFormat(org.objectweb.asm.SymbolTable symbolTable, int i, java.lang.Object[] objArr, int i2, java.lang.Object[] objArr2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            this.inputLocals[i3] = getAbstractTypeFromApiFormat(symbolTable, objArr[i4]);
            if (objArr[i4] == org.objectweb.asm.Opcodes.LONG || objArr[i4] == org.objectweb.asm.Opcodes.DOUBLE) {
                this.inputLocals[i5] = 4194304;
                i3 = i5 + 1;
            } else {
                i3 = i5;
            }
        }
        while (true) {
            int[] iArr = this.inputLocals;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = 4194304;
            i3++;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            if (objArr2[i7] == org.objectweb.asm.Opcodes.LONG || objArr2[i7] == org.objectweb.asm.Opcodes.DOUBLE) {
                i6++;
            }
        }
        this.inputStack = new int[i6 + i2];
        int i8 = 0;
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i8 + 1;
            this.inputStack[i8] = getAbstractTypeFromApiFormat(symbolTable, objArr2[i9]);
            if (objArr2[i9] == org.objectweb.asm.Opcodes.LONG || objArr2[i9] == org.objectweb.asm.Opcodes.DOUBLE) {
                this.inputStack[i10] = 4194304;
                i8 = i10 + 1;
            } else {
                i8 = i10;
            }
        }
        this.outputStackTop = (short) 0;
        this.initializationCount = 0;
    }

    final int getInputStackSize() {
        return this.inputStack.length;
    }

    private int getLocal(int i) {
        int[] iArr = this.outputLocals;
        if (iArr == null || i >= iArr.length) {
            return i | 16777216;
        }
        int i2 = iArr[i];
        if (i2 != 0) {
            return i2;
        }
        int i3 = i | 16777216;
        iArr[i] = i3;
        return i3;
    }

    private void setLocal(int i, int i2) {
        if (this.outputLocals == null) {
            this.outputLocals = new int[10];
        }
        int length = this.outputLocals.length;
        if (i >= length) {
            int[] iArr = new int[java.lang.Math.max(i + 1, length * 2)];
            java.lang.System.arraycopy(this.outputLocals, 0, iArr, 0, length);
            this.outputLocals = iArr;
        }
        this.outputLocals[i] = i2;
    }

    private void push(int i) {
        if (this.outputStack == null) {
            this.outputStack = new int[10];
        }
        int length = this.outputStack.length;
        short s = this.outputStackTop;
        if (s >= length) {
            int[] iArr = new int[java.lang.Math.max(s + 1, length * 2)];
            java.lang.System.arraycopy(this.outputStack, 0, iArr, 0, length);
            this.outputStack = iArr;
        }
        int[] iArr2 = this.outputStack;
        short s2 = this.outputStackTop;
        short s3 = (short) (s2 + 1);
        this.outputStackTop = s3;
        iArr2[s2] = i;
        short s4 = (short) (this.outputStackStart + s3);
        if (s4 > this.owner.outputStackMax) {
            this.owner.outputStackMax = s4;
        }
    }

    private void push(org.objectweb.asm.SymbolTable symbolTable, java.lang.String str) {
        int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, str, str.charAt(0) == '(' ? org.objectweb.asm.Type.getReturnTypeOffset(str) : 0);
        if (abstractTypeFromDescriptor != 0) {
            push(abstractTypeFromDescriptor);
            if (abstractTypeFromDescriptor == LONG || abstractTypeFromDescriptor == DOUBLE) {
                push(4194304);
            }
        }
    }

    private int pop() {
        short s = this.outputStackTop;
        if (s > 0) {
            int[] iArr = this.outputStack;
            short s2 = (short) (s - 1);
            this.outputStackTop = s2;
            return iArr[s2];
        }
        short s3 = (short) (this.outputStackStart - 1);
        this.outputStackStart = s3;
        return (-s3) | STACK_KIND;
    }

    private void pop(int i) {
        short s = this.outputStackTop;
        if (s >= i) {
            this.outputStackTop = (short) (s - i);
        } else {
            this.outputStackStart = (short) (this.outputStackStart - (i - s));
            this.outputStackTop = (short) 0;
        }
    }

    private void pop(java.lang.String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            pop((org.objectweb.asm.Type.getArgumentsAndReturnSizes(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            pop(2);
        } else {
            pop(1);
        }
    }

    private void addInitializedType(int i) {
        if (this.initializations == null) {
            this.initializations = new int[2];
        }
        int length = this.initializations.length;
        int i2 = this.initializationCount;
        if (i2 >= length) {
            int[] iArr = new int[java.lang.Math.max(i2 + 1, length * 2)];
            java.lang.System.arraycopy(this.initializations, 0, iArr, 0, length);
            this.initializations = iArr;
        }
        int[] iArr2 = this.initializations;
        int i3 = this.initializationCount;
        this.initializationCount = i3 + 1;
        iArr2[i3] = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:23:0x0051 A[LOOP:0: B:7:0x000d->B:23:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0037 A[SYNTHETIC] */
    private int getInitializedType(org.objectweb.asm.SymbolTable symbolTable, int i) {
        int i2;
        int iAddType;
        if (i == UNINITIALIZED_THIS || ((-4194304) & i) == UNINITIALIZED_KIND) {
            for (int i3 = 0; i3 < this.initializationCount; i3++) {
                int i4 = this.initializations[i3];
                int i5 = (-67108864) & i4;
                int i6 = KIND_MASK & i4;
                int i7 = i4 & VALUE_MASK;
                if (i6 == 16777216) {
                    i2 = this.inputLocals[i7];
                } else {
                    if (i6 == STACK_KIND) {
                        int[] iArr = this.inputStack;
                        i2 = iArr[iArr.length - i7];
                    }
                    if (i == i4) {
                        if (i == UNINITIALIZED_THIS) {
                            iAddType = symbolTable.addType(symbolTable.getClassName());
                        } else {
                            iAddType = symbolTable.addType(symbolTable.getType(i & VALUE_MASK).value);
                        }
                        return iAddType | 8388608;
                    }
                }
                i4 = i2 + i5;
                if (i == i4) {
                    if (i == UNINITIALIZED_THIS) {
                        iAddType = symbolTable.addType(symbolTable.getClassName());
                    } else {
                        iAddType = symbolTable.addType(symbolTable.getType(i & VALUE_MASK).value);
                    }
                    return iAddType | 8388608;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0344  */
    /* JADX WARN: Code duplicated, block: B:120:0x034b  */
    /* JADX WARN: Code duplicated, block: B:121:0x034f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0356  */
    /* JADX WARN: Code duplicated, block: B:50:0x0147  */
    /* JADX WARN: Code duplicated, block: B:52:0x0152  */
    /* JADX WARN: Code duplicated, block: B:59:0x018e  */
    /* JADX WARN: Code duplicated, block: B:61:0x019c  */
    void execute(int i, int i2, org.objectweb.asm.Symbol symbol, org.objectweb.asm.SymbolTable symbolTable) {
        switch (i) {
            case 0:
                return;
            case 1:
                push(NULL);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
                push(INTEGER);
                return;
            case 9:
            case 10:
                push(LONG);
                push(4194304);
                return;
            case 11:
            case 12:
            case 13:
                push(FLOAT);
                return;
            case 14:
            case 15:
                push(DOUBLE);
                push(4194304);
                return;
            case 18:
                int i3 = symbol.tag;
                switch (i3) {
                    case 3:
                        push(INTEGER);
                        return;
                    case 4:
                        push(FLOAT);
                        return;
                    case 5:
                        push(LONG);
                        push(4194304);
                        return;
                    case 6:
                        push(DOUBLE);
                        push(4194304);
                        return;
                    case 7:
                        push(symbolTable.addType("java/lang/Class") | 8388608);
                        return;
                    case 8:
                        push(symbolTable.addType("java/lang/String") | 8388608);
                        return;
                    default:
                        switch (i3) {
                            case 15:
                                push(symbolTable.addType("java/lang/invoke/MethodHandle") | 8388608);
                                return;
                            case 16:
                                push(symbolTable.addType("java/lang/invoke/MethodType") | 8388608);
                                return;
                            case 17:
                                push(symbolTable, symbol.value);
                                return;
                            default:
                                throw new java.lang.AssertionError();
                        }
                }
            default:
                switch (i) {
                    case 21:
                        push(INTEGER);
                        return;
                    case 22:
                        push(LONG);
                        push(4194304);
                        return;
                    case 23:
                        push(FLOAT);
                        return;
                    case 24:
                        push(DOUBLE);
                        push(4194304);
                        return;
                    case 25:
                        push(getLocal(i2));
                        return;
                    default:
                        switch (i) {
                            case 46:
                            case 51:
                            case 52:
                            case 53:
                                pop(2);
                                push(INTEGER);
                                return;
                            case 47:
                                pop(2);
                                push(LONG);
                                push(4194304);
                                return;
                            case 48:
                                pop(2);
                                push(FLOAT);
                                return;
                            case 49:
                                pop(2);
                                push(DOUBLE);
                                push(4194304);
                                return;
                            case 50:
                                pop(1);
                                int iPop = pop();
                                if (iPop != NULL) {
                                    iPop -= 67108864;
                                }
                                push(iPop);
                                return;
                            case 54:
                            case 56:
                            case 58:
                                setLocal(i2, pop());
                                if (i2 > 0) {
                                    int i4 = i2 - 1;
                                    int local = getLocal(i4);
                                    if (local == LONG || local == DOUBLE) {
                                        setLocal(i4, 4194304);
                                        return;
                                    }
                                    int i5 = local & KIND_MASK;
                                    if (i5 == 16777216 || i5 == STACK_KIND) {
                                        setLocal(i4, local | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 55:
                            case 57:
                                pop(1);
                                setLocal(i2, pop());
                                setLocal(i2 + 1, 4194304);
                                if (i2 > 0) {
                                    int i6 = i2 - 1;
                                    int local2 = getLocal(i6);
                                    if (local2 == LONG || local2 == DOUBLE) {
                                        setLocal(i6, 4194304);
                                        return;
                                    }
                                    int i7 = local2 & KIND_MASK;
                                    if (i7 == 16777216 || i7 == STACK_KIND) {
                                        setLocal(i6, local2 | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                switch (i) {
                                    case 79:
                                    case 81:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                        pop(3);
                                        return;
                                    case 80:
                                    case 82:
                                        pop(4);
                                        return;
                                    case 87:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case org.objectweb.asm.Opcodes.TABLESWITCH /* 170 */:
                                    case org.objectweb.asm.Opcodes.LOOKUPSWITCH /* 171 */:
                                    case 172:
                                    case org.objectweb.asm.Opcodes.FRETURN /* 174 */:
                                    case org.objectweb.asm.Opcodes.ARETURN /* 176 */:
                                    case org.objectweb.asm.Opcodes.ATHROW /* 191 */:
                                    case org.objectweb.asm.Opcodes.MONITORENTER /* 194 */:
                                    case org.objectweb.asm.Opcodes.MONITOREXIT /* 195 */:
                                        break;
                                    case 88:
                                    case org.objectweb.asm.Opcodes.IF_ICMPEQ /* 159 */:
                                    case org.objectweb.asm.Opcodes.IF_ICMPNE /* 160 */:
                                    case org.objectweb.asm.Opcodes.IF_ICMPLT /* 161 */:
                                    case org.objectweb.asm.Opcodes.IF_ICMPGE /* 162 */:
                                    case org.objectweb.asm.Opcodes.IF_ICMPGT /* 163 */:
                                    case org.objectweb.asm.Opcodes.IF_ICMPLE /* 164 */:
                                    case org.objectweb.asm.Opcodes.IF_ACMPEQ /* 165 */:
                                    case org.objectweb.asm.Opcodes.IF_ACMPNE /* 166 */:
                                    case org.objectweb.asm.Opcodes.LRETURN /* 173 */:
                                    case org.objectweb.asm.Opcodes.DRETURN /* 175 */:
                                        pop(2);
                                        return;
                                    case 89:
                                        int iPop2 = pop();
                                        push(iPop2);
                                        push(iPop2);
                                        return;
                                    case 90:
                                        int iPop3 = pop();
                                        int iPop4 = pop();
                                        push(iPop3);
                                        push(iPop4);
                                        push(iPop3);
                                        return;
                                    case 91:
                                        int iPop5 = pop();
                                        int iPop6 = pop();
                                        int iPop7 = pop();
                                        push(iPop5);
                                        push(iPop7);
                                        push(iPop6);
                                        push(iPop5);
                                        return;
                                    case 92:
                                        int iPop8 = pop();
                                        int iPop9 = pop();
                                        push(iPop9);
                                        push(iPop8);
                                        push(iPop9);
                                        push(iPop8);
                                        return;
                                    case 93:
                                        int iPop10 = pop();
                                        int iPop11 = pop();
                                        int iPop12 = pop();
                                        push(iPop11);
                                        push(iPop10);
                                        push(iPop12);
                                        push(iPop11);
                                        push(iPop10);
                                        return;
                                    case 94:
                                        int iPop13 = pop();
                                        int iPop14 = pop();
                                        int iPop15 = pop();
                                        int iPop16 = pop();
                                        push(iPop14);
                                        push(iPop13);
                                        push(iPop16);
                                        push(iPop15);
                                        push(iPop14);
                                        push(iPop13);
                                        return;
                                    case 95:
                                        int iPop17 = pop();
                                        int iPop18 = pop();
                                        push(iPop17);
                                        push(iPop18);
                                        return;
                                    case 96:
                                    case 100:
                                    case 104:
                                    case 108:
                                    case 112:
                                    case 120:
                                    case 122:
                                    case 124:
                                    case 126:
                                    case 128:
                                    case 130:
                                    case 136:
                                    case org.objectweb.asm.Opcodes.D2I /* 142 */:
                                    case org.objectweb.asm.Opcodes.FCMPL /* 149 */:
                                    case 150:
                                        pop(2);
                                        push(INTEGER);
                                        return;
                                    case 97:
                                    case 101:
                                    case 105:
                                    case 109:
                                    case 113:
                                    case 127:
                                    case 129:
                                    case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                                        pop(4);
                                        push(LONG);
                                        push(4194304);
                                        return;
                                    case 98:
                                    case 102:
                                    case 106:
                                    case 110:
                                    case 114:
                                    case org.objectweb.asm.Opcodes.L2F /* 137 */:
                                    case org.objectweb.asm.Opcodes.D2F /* 144 */:
                                        pop(2);
                                        push(FLOAT);
                                        return;
                                    case 99:
                                    case 103:
                                    case 107:
                                    case 111:
                                    case 115:
                                        pop(4);
                                        push(DOUBLE);
                                        push(4194304);
                                        return;
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case org.objectweb.asm.Opcodes.I2B /* 145 */:
                                    case org.objectweb.asm.Opcodes.I2C /* 146 */:
                                    case org.objectweb.asm.Opcodes.I2S /* 147 */:
                                    case org.objectweb.asm.Opcodes.GOTO /* 167 */:
                                    case org.objectweb.asm.Opcodes.RETURN /* 177 */:
                                        return;
                                    case 121:
                                    case 123:
                                    case 125:
                                        pop(3);
                                        push(LONG);
                                        push(4194304);
                                        return;
                                    case org.objectweb.asm.Opcodes.IINC /* 132 */:
                                        setLocal(i2, INTEGER);
                                        return;
                                    case org.objectweb.asm.Opcodes.I2L /* 133 */:
                                    case 140:
                                        pop(1);
                                        push(LONG);
                                        push(4194304);
                                        return;
                                    case 134:
                                        pop(1);
                                        push(FLOAT);
                                        return;
                                    case 135:
                                    case 141:
                                        pop(1);
                                        push(DOUBLE);
                                        push(4194304);
                                        return;
                                    case 138:
                                        pop(2);
                                        push(DOUBLE);
                                        push(4194304);
                                        return;
                                    case 139:
                                    case org.objectweb.asm.Opcodes.ARRAYLENGTH /* 190 */:
                                    case org.objectweb.asm.Opcodes.INSTANCEOF /* 193 */:
                                        pop(1);
                                        push(INTEGER);
                                        return;
                                    case org.objectweb.asm.Opcodes.D2L /* 143 */:
                                        pop(2);
                                        push(LONG);
                                        push(4194304);
                                        return;
                                    case org.objectweb.asm.Opcodes.LCMP /* 148 */:
                                    case org.objectweb.asm.Opcodes.DCMPL /* 151 */:
                                    case org.objectweb.asm.Opcodes.DCMPG /* 152 */:
                                        pop(4);
                                        push(INTEGER);
                                        return;
                                    case org.objectweb.asm.Opcodes.JSR /* 168 */:
                                    case org.objectweb.asm.Opcodes.RET /* 169 */:
                                        throw new java.lang.IllegalArgumentException("JSR/RET are not supported with computeFrames option");
                                    case org.objectweb.asm.Opcodes.GETSTATIC /* 178 */:
                                        push(symbolTable, symbol.value);
                                        return;
                                    case org.objectweb.asm.Opcodes.PUTSTATIC /* 179 */:
                                        pop(symbol.value);
                                        return;
                                    case org.objectweb.asm.Opcodes.GETFIELD /* 180 */:
                                        pop(1);
                                        push(symbolTable, symbol.value);
                                        return;
                                    case org.objectweb.asm.Opcodes.PUTFIELD /* 181 */:
                                        pop(symbol.value);
                                        pop();
                                        return;
                                    case org.objectweb.asm.Opcodes.INVOKEVIRTUAL /* 182 */:
                                    case org.objectweb.asm.Opcodes.INVOKESPECIAL /* 183 */:
                                    case org.objectweb.asm.Opcodes.INVOKESTATIC /* 184 */:
                                    case org.objectweb.asm.Opcodes.INVOKEINTERFACE /* 185 */:
                                        pop(symbol.value);
                                        if (i != 184) {
                                            int iPop19 = pop();
                                            if (i == 183 && symbol.name.charAt(0) == '<') {
                                                addInitializedType(iPop19);
                                            }
                                        }
                                        push(symbolTable, symbol.value);
                                        return;
                                    case org.objectweb.asm.Opcodes.INVOKEDYNAMIC /* 186 */:
                                        pop(symbol.value);
                                        push(symbolTable, symbol.value);
                                        return;
                                    case org.objectweb.asm.Opcodes.NEW /* 187 */:
                                        push(symbolTable.addUninitializedType(symbol.value, i2) | UNINITIALIZED_KIND);
                                        return;
                                    case 188:
                                        pop();
                                        switch (i2) {
                                            case 4:
                                                push(71303177);
                                                return;
                                            case 5:
                                                push(71303179);
                                                return;
                                            case 6:
                                                push(71303170);
                                                return;
                                            case 7:
                                                push(71303171);
                                                return;
                                            case 8:
                                                push(71303178);
                                                return;
                                            case 9:
                                                push(71303180);
                                                return;
                                            case 10:
                                                push(71303169);
                                                return;
                                            case 11:
                                                push(71303172);
                                                return;
                                            default:
                                                throw new java.lang.IllegalArgumentException();
                                        }
                                    case 189:
                                        java.lang.String str = symbol.value;
                                        pop();
                                        if (str.charAt(0) == '[') {
                                            push(symbolTable, com.ironsource.y8.i.d + str);
                                            return;
                                        } else {
                                            push(symbolTable.addType(str) | 75497472);
                                            return;
                                        }
                                    case 192:
                                        java.lang.String str2 = symbol.value;
                                        pop();
                                        if (str2.charAt(0) == '[') {
                                            push(symbolTable, str2);
                                            return;
                                        } else {
                                            push(symbolTable.addType(str2) | 8388608);
                                            return;
                                        }
                                    default:
                                        switch (i) {
                                            case org.objectweb.asm.Opcodes.MULTIANEWARRAY /* 197 */:
                                                pop(i2);
                                                push(symbolTable, symbol.value);
                                                return;
                                            case org.objectweb.asm.Opcodes.IFNULL /* 198 */:
                                            case org.objectweb.asm.Opcodes.IFNONNULL /* 199 */:
                                                break;
                                            default:
                                                throw new java.lang.IllegalArgumentException();
                                        }
                                        break;
                                }
                                pop(1);
                                return;
                        }
                }
        }
    }

    private int getConcreteOutputType(int i, int i2) {
        int i3 = (-67108864) & i;
        int i4 = KIND_MASK & i;
        if (i4 == 16777216) {
            int i5 = i3 + this.inputLocals[i & VALUE_MASK];
            if ((i & 1048576) == 0 || !(i5 == LONG || i5 == DOUBLE)) {
                return i5;
            }
            return 4194304;
        }
        if (i4 != STACK_KIND) {
            return i;
        }
        int i6 = i3 + this.inputStack[i2 - (i & VALUE_MASK)];
        if ((i & 1048576) == 0 || !(i6 == LONG || i6 == DOUBLE)) {
            return i6;
        }
        return 4194304;
    }

    final boolean merge(org.objectweb.asm.SymbolTable symbolTable, org.objectweb.asm.Frame frame, int i) {
        boolean zMerge;
        int initializedType;
        int i2;
        int length = this.inputLocals.length;
        int length2 = this.inputStack.length;
        boolean zMerge2 = true;
        if (frame.inputLocals == null) {
            frame.inputLocals = new int[length];
            zMerge = true;
        } else {
            zMerge = false;
        }
        int i3 = 0;
        while (i3 < length) {
            int[] iArr = this.outputLocals;
            if (iArr == null || i3 >= iArr.length || (i2 = iArr[i3]) == 0) {
                initializedType = this.inputLocals[i3];
            } else {
                initializedType = getConcreteOutputType(i2, length2);
            }
            if (this.initializations != null) {
                initializedType = getInitializedType(symbolTable, initializedType);
            }
            zMerge |= merge(symbolTable, initializedType, frame.inputLocals, i3);
            i3++;
        }
        if (i > 0) {
            for (int i4 = 0; i4 < length; i4++) {
                zMerge |= merge(symbolTable, this.inputLocals[i4], frame.inputLocals, i4);
            }
            if (frame.inputStack == null) {
                frame.inputStack = new int[1];
            } else {
                zMerge2 = zMerge;
            }
            return merge(symbolTable, i, frame.inputStack, 0) | zMerge2;
        }
        int length3 = this.inputStack.length + this.outputStackStart;
        if (frame.inputStack == null) {
            frame.inputStack = new int[this.outputStackTop + length3];
        } else {
            zMerge2 = zMerge;
        }
        for (int i5 = 0; i5 < length3; i5++) {
            int initializedType2 = this.inputStack[i5];
            if (this.initializations != null) {
                initializedType2 = getInitializedType(symbolTable, initializedType2);
            }
            zMerge2 |= merge(symbolTable, initializedType2, frame.inputStack, i5);
        }
        for (int i6 = 0; i6 < this.outputStackTop; i6++) {
            int concreteOutputType = getConcreteOutputType(this.outputStack[i6], length2);
            if (this.initializations != null) {
                concreteOutputType = getInitializedType(symbolTable, concreteOutputType);
            }
            zMerge2 |= merge(symbolTable, concreteOutputType, frame.inputStack, length3 + i6);
        }
        return zMerge2;
    }

    private static boolean merge(org.objectweb.asm.SymbolTable symbolTable, int i, int[] iArr, int i2) {
        int iMin;
        int iAddType;
        int i3 = iArr[i2];
        if (i3 == i) {
            return false;
        }
        if ((67108863 & i) == NULL) {
            if (i3 == NULL) {
                return false;
            }
            i = NULL;
        }
        if (i3 == 0) {
            iArr[i2] = i;
            return true;
        }
        int i4 = i3 & (-67108864);
        int iAddMergedType = 4194304;
        if (i4 != 0 || (i3 & KIND_MASK) == 8388608) {
            if (i == NULL) {
                return false;
            }
            if ((i & (-4194304)) != ((-4194304) & i3)) {
                int i5 = i & (-67108864);
                if (i5 != 0 || (i & KIND_MASK) == 8388608) {
                    if (i5 != 0 && (i & KIND_MASK) != 8388608) {
                        i5 -= 67108864;
                    }
                    if (i4 != 0 && (i3 & KIND_MASK) != 8388608) {
                        i4 -= 67108864;
                    }
                    iMin = java.lang.Math.min(i5, i4) | 8388608;
                    iAddType = symbolTable.addType("java/lang/Object");
                    iAddMergedType = iMin | iAddType;
                }
            } else if ((i3 & KIND_MASK) == 8388608) {
                iAddMergedType = (i & (-67108864)) | 8388608 | symbolTable.addMergedType(i & VALUE_MASK, VALUE_MASK & i3);
            } else {
                iMin = ((i & (-67108864)) - 67108864) | 8388608;
                iAddType = symbolTable.addType("java/lang/Object");
                iAddMergedType = iMin | iAddType;
            }
        } else if (i3 == NULL) {
            if ((i & (-67108864)) == 0 && (i & KIND_MASK) != 8388608) {
                i = 4194304;
            }
            iAddMergedType = i;
        }
        if (iAddMergedType == i3) {
            return false;
        }
        iArr[i2] = iAddMergedType;
        return true;
    }

    final void accept(org.objectweb.asm.MethodWriter methodWriter) {
        int[] iArr = this.inputLocals;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 2;
            if (i2 >= iArr.length) {
                break;
            }
            int i6 = iArr[i2];
            if (i6 != LONG && i6 != DOUBLE) {
                i5 = 1;
            }
            i2 += i5;
            if (i6 == 4194304) {
                i4++;
            } else {
                i3 += i4 + 1;
                i4 = 0;
            }
        }
        int[] iArr2 = this.inputStack;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == LONG || i9 == DOUBLE) ? 2 : 1;
            i8++;
        }
        int iVisitFrameStart = methodWriter.visitFrameStart(this.owner.bytecodeOffset, i3, i8);
        int i10 = 0;
        while (true) {
            int i11 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i12 = iArr[i10];
            i10 += (i12 == LONG || i12 == DOUBLE) ? 2 : 1;
            methodWriter.visitAbstractType(iVisitFrameStart, i12);
            i3 = i11;
            iVisitFrameStart++;
        }
        while (true) {
            int i13 = i8 - 1;
            if (i8 > 0) {
                int i14 = iArr2[i];
                i += (i14 == LONG || i14 == DOUBLE) ? 2 : 1;
                methodWriter.visitAbstractType(iVisitFrameStart, i14);
                iVisitFrameStart++;
                i8 = i13;
            } else {
                methodWriter.visitFrameEnd();
                return;
            }
        }
    }

    static void putAbstractType(org.objectweb.asm.SymbolTable symbolTable, int i, org.objectweb.asm.ByteVector byteVector) {
        int i2 = ((-67108864) & i) >> 26;
        if (i2 == 0) {
            int i3 = i & VALUE_MASK;
            int i4 = i & KIND_MASK;
            if (i4 == 4194304) {
                byteVector.putByte(i3);
                return;
            } else if (i4 == 8388608) {
                byteVector.putByte(7).putShort(symbolTable.addConstantClass(symbolTable.getType(i3).value).index);
                return;
            } else {
                if (i4 == UNINITIALIZED_KIND) {
                    byteVector.putByte(8).putShort((int) symbolTable.getType(i3).data);
                    return;
                }
                throw new java.lang.AssertionError();
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            sb.append('[');
            i2 = i5;
        }
        if ((i & KIND_MASK) == 8388608) {
            sb.append('L').append(symbolTable.getType(i & VALUE_MASK).value).append(';');
        } else {
            int i6 = i & VALUE_MASK;
            if (i6 == 1) {
                sb.append('I');
            } else if (i6 == 2) {
                sb.append('F');
            } else if (i6 == 3) {
                sb.append('D');
            } else if (i6 != 4) {
                switch (i6) {
                    case 9:
                        sb.append('Z');
                        break;
                    case 10:
                        sb.append('B');
                        break;
                    case 11:
                        sb.append('C');
                        break;
                    case 12:
                        sb.append('S');
                        break;
                    default:
                        throw new java.lang.AssertionError();
                }
            } else {
                sb.append('J');
            }
        }
        byteVector.putByte(7).putShort(symbolTable.addConstantClass(sb.toString()).index);
    }
}
