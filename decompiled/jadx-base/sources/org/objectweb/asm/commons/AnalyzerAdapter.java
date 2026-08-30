package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class AnalyzerAdapter extends org.objectweb.asm.MethodVisitor {
    private java.util.List<org.objectweb.asm.Label> labels;
    public java.util.List<java.lang.Object> locals;
    private int maxLocals;
    private int maxStack;
    private java.lang.String owner;
    public java.util.List<java.lang.Object> stack;
    public java.util.Map<java.lang.Object, java.lang.Object> uninitializedTypes;

    public AnalyzerAdapter(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, org.objectweb.asm.MethodVisitor methodVisitor) {
        this(589824, str, i, str2, str3, methodVisitor);
        if (getClass() != org.objectweb.asm.commons.AnalyzerAdapter.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    protected AnalyzerAdapter(int i, java.lang.String str, int i2, java.lang.String str2, java.lang.String str3, org.objectweb.asm.MethodVisitor methodVisitor) {
        super(i, methodVisitor);
        this.owner = str;
        this.locals = new java.util.ArrayList();
        this.stack = new java.util.ArrayList();
        this.uninitializedTypes = new java.util.HashMap();
        if ((i2 & 8) == 0) {
            if ("<init>".equals(str2)) {
                this.locals.add(org.objectweb.asm.Opcodes.UNINITIALIZED_THIS);
            } else {
                this.locals.add(str);
            }
        }
        for (org.objectweb.asm.Type type : org.objectweb.asm.Type.getArgumentTypes(str3)) {
            switch (type.getSort()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    this.locals.add(org.objectweb.asm.Opcodes.INTEGER);
                    break;
                case 6:
                    this.locals.add(org.objectweb.asm.Opcodes.FLOAT);
                    break;
                case 7:
                    this.locals.add(org.objectweb.asm.Opcodes.LONG);
                    this.locals.add(org.objectweb.asm.Opcodes.TOP);
                    break;
                case 8:
                    this.locals.add(org.objectweb.asm.Opcodes.DOUBLE);
                    this.locals.add(org.objectweb.asm.Opcodes.TOP);
                    break;
                case 9:
                    this.locals.add(type.getDescriptor());
                    break;
                case 10:
                    this.locals.add(type.getInternalName());
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }
        this.maxLocals = this.locals.size();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i, int i2, java.lang.Object[] objArr, int i3, java.lang.Object[] objArr2) {
        if (i != -1) {
            throw new java.lang.IllegalArgumentException("AnalyzerAdapter only accepts expanded frames (see ClassReader.EXPAND_FRAMES)");
        }
        super.visitFrame(i, i2, objArr, i3, objArr2);
        java.util.List<java.lang.Object> list = this.locals;
        if (list != null) {
            list.clear();
            this.stack.clear();
        } else {
            this.locals = new java.util.ArrayList();
            this.stack = new java.util.ArrayList();
        }
        visitFrameTypes(i2, objArr, this.locals);
        visitFrameTypes(i3, objArr2, this.stack);
        this.maxLocals = java.lang.Math.max(this.maxLocals, this.locals.size());
        this.maxStack = java.lang.Math.max(this.maxStack, this.stack.size());
    }

    private static void visitFrameTypes(int i, java.lang.Object[] objArr, java.util.List<java.lang.Object> list) {
        for (int i2 = 0; i2 < i; i2++) {
            java.lang.Object obj = objArr[i2];
            list.add(obj);
            if (obj == org.objectweb.asm.Opcodes.LONG || obj == org.objectweb.asm.Opcodes.DOUBLE) {
                list.add(org.objectweb.asm.Opcodes.TOP);
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        super.visitInsn(i);
        execute(i, 0, null);
        if ((i < 172 || i > 177) && i != 191) {
            return;
        }
        this.locals = null;
        this.stack = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        super.visitIntInsn(i, i2);
        execute(i, i2, null);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        super.visitVarInsn(i, i2);
        this.maxLocals = java.lang.Math.max(this.maxLocals, (i == 22 || i == 24 || i == 55 || i == 57 ? 2 : 1) + i2);
        execute(i, i2, null);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, java.lang.String str) {
        if (i == 187) {
            if (this.labels == null) {
                org.objectweb.asm.Label label = new org.objectweb.asm.Label();
                java.util.ArrayList arrayList = new java.util.ArrayList(3);
                this.labels = arrayList;
                arrayList.add(label);
                if (this.mv != null) {
                    this.mv.visitLabel(label);
                }
            }
            java.util.Iterator<org.objectweb.asm.Label> it = this.labels.iterator();
            while (it.hasNext()) {
                this.uninitializedTypes.put(it.next(), str);
            }
        }
        super.visitTypeInsn(i, str);
        execute(i, 0, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super.visitFieldInsn(i, str, str2, str3);
        execute(i, 0, str3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        java.lang.Object obj;
        if (this.api < 327680 && (i & 256) == 0) {
            super.visitMethodInsn(i, str, str2, str3, z);
            return;
        }
        super.visitMethodInsn(i, str, str2, str3, z);
        int i2 = i & (-257);
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        pop(str3);
        if (i2 != 184) {
            java.lang.Object objPop = pop();
            if (i2 == 183 && str2.equals("<init>")) {
                if (objPop == org.objectweb.asm.Opcodes.UNINITIALIZED_THIS) {
                    obj = this.owner;
                } else {
                    obj = this.uninitializedTypes.get(objPop);
                }
                for (int i3 = 0; i3 < this.locals.size(); i3++) {
                    if (this.locals.get(i3) == objPop) {
                        this.locals.set(i3, obj);
                    }
                }
                for (int i4 = 0; i4 < this.stack.size(); i4++) {
                    if (this.stack.get(i4) == objPop) {
                        this.stack.set(i4, obj);
                    }
                }
            }
        }
        pushDescriptor(str3);
        this.labels = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String str, java.lang.String str2, org.objectweb.asm.Handle handle, java.lang.Object... objArr) {
        super.visitInvokeDynamicInsn(str, str2, handle, objArr);
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        pop(str2);
        pushDescriptor(str2);
        this.labels = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, org.objectweb.asm.Label label) {
        super.visitJumpInsn(i, label);
        execute(i, 0, null);
        if (i == 167) {
            this.locals = null;
            this.stack = null;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(org.objectweb.asm.Label label) {
        super.visitLabel(label);
        if (this.labels == null) {
            this.labels = new java.util.ArrayList(3);
        }
        this.labels.add(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object obj) {
        super.visitLdcInsn(obj);
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        if (obj instanceof java.lang.Integer) {
            push(org.objectweb.asm.Opcodes.INTEGER);
        } else if (obj instanceof java.lang.Long) {
            push(org.objectweb.asm.Opcodes.LONG);
            push(org.objectweb.asm.Opcodes.TOP);
        } else if (obj instanceof java.lang.Float) {
            push(org.objectweb.asm.Opcodes.FLOAT);
        } else if (obj instanceof java.lang.Double) {
            push(org.objectweb.asm.Opcodes.DOUBLE);
            push(org.objectweb.asm.Opcodes.TOP);
        } else if (obj instanceof java.lang.String) {
            push("java/lang/String");
        } else if (obj instanceof org.objectweb.asm.Type) {
            int sort = ((org.objectweb.asm.Type) obj).getSort();
            if (sort == 10 || sort == 9) {
                push("java/lang/Class");
            } else if (sort == 11) {
                push("java/lang/invoke/MethodType");
            } else {
                throw new java.lang.IllegalArgumentException();
            }
        } else if (obj instanceof org.objectweb.asm.Handle) {
            push("java/lang/invoke/MethodHandle");
        } else if (obj instanceof org.objectweb.asm.ConstantDynamic) {
            pushDescriptor(((org.objectweb.asm.ConstantDynamic) obj).getDescriptor());
        } else {
            throw new java.lang.IllegalArgumentException();
        }
        this.labels = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        super.visitIincInsn(i, i2);
        this.maxLocals = java.lang.Math.max(this.maxLocals, i + 1);
        execute(org.objectweb.asm.Opcodes.IINC, i, null);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, org.objectweb.asm.Label label, org.objectweb.asm.Label... labelArr) {
        super.visitTableSwitchInsn(i, i2, label, labelArr);
        execute(org.objectweb.asm.Opcodes.TABLESWITCH, 0, null);
        this.locals = null;
        this.stack = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(org.objectweb.asm.Label label, int[] iArr, org.objectweb.asm.Label[] labelArr) {
        super.visitLookupSwitchInsn(label, iArr, labelArr);
        execute(org.objectweb.asm.Opcodes.LOOKUPSWITCH, 0, null);
        this.locals = null;
        this.stack = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String str, int i) {
        super.visitMultiANewArrayInsn(str, i);
        execute(org.objectweb.asm.Opcodes.MULTIANEWARRAY, i, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(java.lang.String str, java.lang.String str2, java.lang.String str3, org.objectweb.asm.Label label, org.objectweb.asm.Label label2, int i) {
        char cCharAt = str2.charAt(0);
        this.maxLocals = java.lang.Math.max(this.maxLocals, ((cCharAt == 'J' || cCharAt == 'D') ? 2 : 1) + i);
        super.visitLocalVariable(str, str2, str3, label, label2, i);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i, int i2) {
        if (this.mv != null) {
            this.maxStack = java.lang.Math.max(this.maxStack, i);
            this.maxLocals = java.lang.Math.max(this.maxLocals, i2);
            this.mv.visitMaxs(this.maxStack, this.maxLocals);
        }
    }

    private java.lang.Object get(int i) {
        this.maxLocals = java.lang.Math.max(this.maxLocals, i + 1);
        return i < this.locals.size() ? this.locals.get(i) : org.objectweb.asm.Opcodes.TOP;
    }

    private void set(int i, java.lang.Object obj) {
        this.maxLocals = java.lang.Math.max(this.maxLocals, i + 1);
        while (i >= this.locals.size()) {
            this.locals.add(org.objectweb.asm.Opcodes.TOP);
        }
        this.locals.set(i, obj);
    }

    private void push(java.lang.Object obj) {
        this.stack.add(obj);
        this.maxStack = java.lang.Math.max(this.maxStack, this.stack.size());
    }

    private void pushDescriptor(java.lang.String str) {
        if (str.charAt(0) == '(') {
            str = org.objectweb.asm.Type.getReturnType(str).getDescriptor();
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            push(org.objectweb.asm.Opcodes.FLOAT);
            return;
        }
        if (cCharAt != 'L') {
            if (cCharAt != 'S') {
                if (cCharAt == 'V') {
                    return;
                }
                if (cCharAt != 'I') {
                    if (cCharAt == 'J') {
                        push(org.objectweb.asm.Opcodes.LONG);
                        push(org.objectweb.asm.Opcodes.TOP);
                        return;
                    } else if (cCharAt != 'Z') {
                        if (cCharAt != '[') {
                            switch (cCharAt) {
                                case 'B':
                                case 'C':
                                    break;
                                case 'D':
                                    push(org.objectweb.asm.Opcodes.DOUBLE);
                                    push(org.objectweb.asm.Opcodes.TOP);
                                    return;
                                default:
                                    throw new java.lang.AssertionError();
                            }
                        } else {
                            push(str);
                            return;
                        }
                    }
                }
            }
            push(org.objectweb.asm.Opcodes.INTEGER);
            return;
        }
        push(str.substring(1, str.length() - 1));
    }

    private java.lang.Object pop() {
        java.util.List<java.lang.Object> list = this.stack;
        return list.remove(list.size() - 1);
    }

    private void pop(int i) {
        int size = this.stack.size();
        int i2 = size - i;
        for (int i3 = size - 1; i3 >= i2; i3--) {
            this.stack.remove(i3);
        }
    }

    private void pop(java.lang.String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt != '(') {
            if (cCharAt == 'J' || cCharAt == 'D') {
                pop(2);
                return;
            } else {
                pop(1);
                return;
            }
        }
        int size = 0;
        for (org.objectweb.asm.Type type : org.objectweb.asm.Type.getArgumentTypes(str)) {
            size += type.getSize();
        }
        pop(size);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:57:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0278  */
    /* JADX WARN: Code duplicated, block: B:83:0x0286  */
    /* JADX WARN: Code duplicated, block: B:84:0x028f  */
    /* JADX WARN: Code duplicated, block: B:85:0x029d  */
    private void execute(int i, int i2, java.lang.String str) {
        int i3;
        java.lang.Object obj;
        int i4;
        java.lang.Object obj2;
        if (i == 168 || i == 169) {
            throw new java.lang.IllegalArgumentException("JSR/RET are not supported");
        }
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        switch (i) {
            case 0:
                break;
            case 1:
                push(org.objectweb.asm.Opcodes.NULL);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
                push(org.objectweb.asm.Opcodes.INTEGER);
                break;
            case 9:
            case 10:
                push(org.objectweb.asm.Opcodes.LONG);
                push(org.objectweb.asm.Opcodes.TOP);
                break;
            case 11:
            case 12:
            case 13:
                push(org.objectweb.asm.Opcodes.FLOAT);
                break;
            case 14:
            case 15:
                push(org.objectweb.asm.Opcodes.DOUBLE);
                push(org.objectweb.asm.Opcodes.TOP);
                break;
            default:
                switch (i) {
                    case 21:
                    case 23:
                    case 25:
                        push(get(i2));
                        break;
                    case 22:
                    case 24:
                        push(get(i2));
                        push(org.objectweb.asm.Opcodes.TOP);
                        break;
                    default:
                        switch (i) {
                            case 46:
                            case 51:
                            case 52:
                            case 53:
                                pop(2);
                                push(org.objectweb.asm.Opcodes.INTEGER);
                                break;
                            case 47:
                                pop(2);
                                push(org.objectweb.asm.Opcodes.LONG);
                                push(org.objectweb.asm.Opcodes.TOP);
                                break;
                            case 48:
                                pop(2);
                                push(org.objectweb.asm.Opcodes.FLOAT);
                                break;
                            case 49:
                                pop(2);
                                push(org.objectweb.asm.Opcodes.DOUBLE);
                                push(org.objectweb.asm.Opcodes.TOP);
                                break;
                            case 50:
                                pop(1);
                                java.lang.Object objPop = pop();
                                if (objPop instanceof java.lang.String) {
                                    pushDescriptor(((java.lang.String) objPop).substring(1));
                                } else if (objPop == org.objectweb.asm.Opcodes.NULL) {
                                    push(objPop);
                                } else {
                                    push("java/lang/Object");
                                }
                                break;
                            case 54:
                            case 56:
                            case 58:
                                set(i2, pop());
                                if (i2 > 0 && ((obj = get((i3 = i2 - 1))) == org.objectweb.asm.Opcodes.LONG || obj == org.objectweb.asm.Opcodes.DOUBLE)) {
                                    set(i3, org.objectweb.asm.Opcodes.TOP);
                                }
                                break;
                            case 55:
                            case 57:
                                pop(1);
                                set(i2, pop());
                                set(i2 + 1, org.objectweb.asm.Opcodes.TOP);
                                if (i2 > 0 && ((obj2 = get((i4 = i2 - 1))) == org.objectweb.asm.Opcodes.LONG || obj2 == org.objectweb.asm.Opcodes.DOUBLE)) {
                                    set(i4, org.objectweb.asm.Opcodes.TOP);
                                }
                                break;
                            default:
                                switch (i) {
                                    case 79:
                                    case 81:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                        pop(3);
                                        break;
                                    case 80:
                                    case 82:
                                        pop(4);
                                        break;
                                    case 87:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                        pop(1);
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
                                        pop(2);
                                        break;
                                    case 89:
                                        java.lang.Object objPop2 = pop();
                                        push(objPop2);
                                        push(objPop2);
                                        break;
                                    case 90:
                                        java.lang.Object objPop3 = pop();
                                        java.lang.Object objPop4 = pop();
                                        push(objPop3);
                                        push(objPop4);
                                        push(objPop3);
                                        break;
                                    case 91:
                                        java.lang.Object objPop5 = pop();
                                        java.lang.Object objPop6 = pop();
                                        java.lang.Object objPop7 = pop();
                                        push(objPop5);
                                        push(objPop7);
                                        push(objPop6);
                                        push(objPop5);
                                        break;
                                    case 92:
                                        java.lang.Object objPop8 = pop();
                                        java.lang.Object objPop9 = pop();
                                        push(objPop9);
                                        push(objPop8);
                                        push(objPop9);
                                        push(objPop8);
                                        break;
                                    case 93:
                                        java.lang.Object objPop10 = pop();
                                        java.lang.Object objPop11 = pop();
                                        java.lang.Object objPop12 = pop();
                                        push(objPop11);
                                        push(objPop10);
                                        push(objPop12);
                                        push(objPop11);
                                        push(objPop10);
                                        break;
                                    case 94:
                                        java.lang.Object objPop13 = pop();
                                        java.lang.Object objPop14 = pop();
                                        java.lang.Object objPop15 = pop();
                                        java.lang.Object objPop16 = pop();
                                        push(objPop14);
                                        push(objPop13);
                                        push(objPop16);
                                        push(objPop15);
                                        push(objPop14);
                                        push(objPop13);
                                        break;
                                    case 95:
                                        java.lang.Object objPop17 = pop();
                                        java.lang.Object objPop18 = pop();
                                        push(objPop17);
                                        push(objPop18);
                                        break;
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
                                        push(org.objectweb.asm.Opcodes.INTEGER);
                                        break;
                                    case 97:
                                    case 101:
                                    case 105:
                                    case 109:
                                    case 113:
                                    case 127:
                                    case 129:
                                    case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                                        pop(4);
                                        push(org.objectweb.asm.Opcodes.LONG);
                                        push(org.objectweb.asm.Opcodes.TOP);
                                        break;
                                    case 98:
                                    case 102:
                                    case 106:
                                    case 110:
                                    case 114:
                                    case org.objectweb.asm.Opcodes.L2F /* 137 */:
                                    case org.objectweb.asm.Opcodes.D2F /* 144 */:
                                        pop(2);
                                        push(org.objectweb.asm.Opcodes.FLOAT);
                                        break;
                                    case 99:
                                    case 103:
                                    case 107:
                                    case 111:
                                    case 115:
                                        pop(4);
                                        push(org.objectweb.asm.Opcodes.DOUBLE);
                                        push(org.objectweb.asm.Opcodes.TOP);
                                        break;
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case org.objectweb.asm.Opcodes.I2B /* 145 */:
                                    case org.objectweb.asm.Opcodes.I2C /* 146 */:
                                    case org.objectweb.asm.Opcodes.I2S /* 147 */:
                                    case org.objectweb.asm.Opcodes.GOTO /* 167 */:
                                        break;
                                    case 121:
                                    case 123:
                                    case 125:
                                        pop(3);
                                        push(org.objectweb.asm.Opcodes.LONG);
                                        push(org.objectweb.asm.Opcodes.TOP);
                                        break;
                                    case org.objectweb.asm.Opcodes.IINC /* 132 */:
                                        set(i2, org.objectweb.asm.Opcodes.INTEGER);
                                        break;
                                    case org.objectweb.asm.Opcodes.I2L /* 133 */:
                                    case 140:
                                        pop(1);
                                        push(org.objectweb.asm.Opcodes.LONG);
                                        push(org.objectweb.asm.Opcodes.TOP);
                                        break;
                                    case 134:
                                        pop(1);
                                        push(org.objectweb.asm.Opcodes.FLOAT);
                                        break;
                                    case 135:
                                    case 141:
                                        pop(1);
                                        push(org.objectweb.asm.Opcodes.DOUBLE);
                                        push(org.objectweb.asm.Opcodes.TOP);
                                        break;
                                    case 138:
                                        pop(2);
                                        push(org.objectweb.asm.Opcodes.DOUBLE);
                                        push(org.objectweb.asm.Opcodes.TOP);
                                        break;
                                    case 139:
                                        pop(1);
                                        push(org.objectweb.asm.Opcodes.INTEGER);
                                        break;
                                    case org.objectweb.asm.Opcodes.D2L /* 143 */:
                                        pop(2);
                                        push(org.objectweb.asm.Opcodes.LONG);
                                        push(org.objectweb.asm.Opcodes.TOP);
                                        break;
                                    case org.objectweb.asm.Opcodes.LCMP /* 148 */:
                                    case org.objectweb.asm.Opcodes.DCMPL /* 151 */:
                                    case org.objectweb.asm.Opcodes.DCMPG /* 152 */:
                                        pop(4);
                                        push(org.objectweb.asm.Opcodes.INTEGER);
                                        break;
                                    default:
                                        switch (i) {
                                            case org.objectweb.asm.Opcodes.TABLESWITCH /* 170 */:
                                            case org.objectweb.asm.Opcodes.LOOKUPSWITCH /* 171 */:
                                            case 172:
                                            case org.objectweb.asm.Opcodes.FRETURN /* 174 */:
                                            case org.objectweb.asm.Opcodes.ARETURN /* 176 */:
                                                pop(1);
                                                break;
                                            case org.objectweb.asm.Opcodes.LRETURN /* 173 */:
                                            case org.objectweb.asm.Opcodes.DRETURN /* 175 */:
                                                pop(2);
                                                break;
                                            case org.objectweb.asm.Opcodes.RETURN /* 177 */:
                                                break;
                                            case org.objectweb.asm.Opcodes.GETSTATIC /* 178 */:
                                                pushDescriptor(str);
                                                break;
                                            case org.objectweb.asm.Opcodes.PUTSTATIC /* 179 */:
                                                pop(str);
                                                break;
                                            case org.objectweb.asm.Opcodes.GETFIELD /* 180 */:
                                                pop(1);
                                                pushDescriptor(str);
                                                break;
                                            case org.objectweb.asm.Opcodes.PUTFIELD /* 181 */:
                                                pop(str);
                                                pop();
                                                break;
                                            default:
                                                switch (i) {
                                                    case org.objectweb.asm.Opcodes.NEW /* 187 */:
                                                        push(this.labels.get(0));
                                                        break;
                                                    case 188:
                                                        pop();
                                                        switch (i2) {
                                                            case 4:
                                                                pushDescriptor(org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC);
                                                                break;
                                                            case 5:
                                                                pushDescriptor("[C");
                                                                break;
                                                            case 6:
                                                                pushDescriptor("[F");
                                                                break;
                                                            case 7:
                                                                pushDescriptor("[D");
                                                                break;
                                                            case 8:
                                                                pushDescriptor("[B");
                                                                break;
                                                            case 9:
                                                                pushDescriptor("[S");
                                                                break;
                                                            case 10:
                                                                pushDescriptor("[I");
                                                                break;
                                                            case 11:
                                                                pushDescriptor("[J");
                                                                break;
                                                            default:
                                                                throw new java.lang.IllegalArgumentException("Invalid array type " + i2);
                                                        }
                                                        break;
                                                    case 189:
                                                        pop();
                                                        pushDescriptor(com.ironsource.y8.i.d + org.objectweb.asm.Type.getObjectType(str));
                                                        break;
                                                    case org.objectweb.asm.Opcodes.ARRAYLENGTH /* 190 */:
                                                    case org.objectweb.asm.Opcodes.INSTANCEOF /* 193 */:
                                                        pop(1);
                                                        push(org.objectweb.asm.Opcodes.INTEGER);
                                                        break;
                                                    case org.objectweb.asm.Opcodes.ATHROW /* 191 */:
                                                    case org.objectweb.asm.Opcodes.MONITORENTER /* 194 */:
                                                    case org.objectweb.asm.Opcodes.MONITOREXIT /* 195 */:
                                                        pop(1);
                                                        break;
                                                    case 192:
                                                        pop();
                                                        pushDescriptor(org.objectweb.asm.Type.getObjectType(str).getDescriptor());
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case org.objectweb.asm.Opcodes.MULTIANEWARRAY /* 197 */:
                                                                pop(i2);
                                                                pushDescriptor(str);
                                                                break;
                                                            case org.objectweb.asm.Opcodes.IFNULL /* 198 */:
                                                            case org.objectweb.asm.Opcodes.IFNONNULL /* 199 */:
                                                                pop(1);
                                                                break;
                                                            default:
                                                                throw new java.lang.IllegalArgumentException("Invalid opcode " + i);
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
        this.labels = null;
    }
}
