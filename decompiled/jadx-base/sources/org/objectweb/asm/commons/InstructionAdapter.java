package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class InstructionAdapter extends org.objectweb.asm.MethodVisitor {
    public static final org.objectweb.asm.Type OBJECT_TYPE = org.objectweb.asm.Type.getType("Ljava/lang/Object;");

    public InstructionAdapter(org.objectweb.asm.MethodVisitor methodVisitor) {
        this(589824, methodVisitor);
        if (getClass() != org.objectweb.asm.commons.InstructionAdapter.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    protected InstructionAdapter(int i, org.objectweb.asm.MethodVisitor methodVisitor) {
        super(i, methodVisitor);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        if (i == 190) {
            arraylength();
            return;
        }
        if (i == 191) {
            athrow();
            return;
        }
        if (i == 194) {
            monitorenter();
            return;
        }
        if (i != 195) {
            switch (i) {
                case 0:
                    nop();
                    return;
                case 1:
                    aconst(null);
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    iconst(i - 3);
                    return;
                case 9:
                case 10:
                    lconst(i - 9);
                    return;
                case 11:
                case 12:
                case 13:
                    fconst(i - 11);
                    return;
                case 14:
                case 15:
                    dconst(i - 14);
                    return;
                default:
                    switch (i) {
                        case 46:
                            aload(org.objectweb.asm.Type.INT_TYPE);
                            return;
                        case 47:
                            aload(org.objectweb.asm.Type.LONG_TYPE);
                            return;
                        case 48:
                            aload(org.objectweb.asm.Type.FLOAT_TYPE);
                            return;
                        case 49:
                            aload(org.objectweb.asm.Type.DOUBLE_TYPE);
                            return;
                        case 50:
                            aload(OBJECT_TYPE);
                            return;
                        case 51:
                            aload(org.objectweb.asm.Type.BYTE_TYPE);
                            return;
                        case 52:
                            aload(org.objectweb.asm.Type.CHAR_TYPE);
                            return;
                        case 53:
                            aload(org.objectweb.asm.Type.SHORT_TYPE);
                            return;
                        default:
                            switch (i) {
                                case 79:
                                    astore(org.objectweb.asm.Type.INT_TYPE);
                                    return;
                                case 80:
                                    astore(org.objectweb.asm.Type.LONG_TYPE);
                                    return;
                                case 81:
                                    astore(org.objectweb.asm.Type.FLOAT_TYPE);
                                    return;
                                case 82:
                                    astore(org.objectweb.asm.Type.DOUBLE_TYPE);
                                    return;
                                case 83:
                                    astore(OBJECT_TYPE);
                                    return;
                                case 84:
                                    astore(org.objectweb.asm.Type.BYTE_TYPE);
                                    return;
                                case 85:
                                    astore(org.objectweb.asm.Type.CHAR_TYPE);
                                    return;
                                case 86:
                                    astore(org.objectweb.asm.Type.SHORT_TYPE);
                                    return;
                                case 87:
                                    pop();
                                    return;
                                case 88:
                                    pop2();
                                    return;
                                case 89:
                                    dup();
                                    return;
                                case 90:
                                    dupX1();
                                    return;
                                case 91:
                                    dupX2();
                                    return;
                                case 92:
                                    dup2();
                                    return;
                                case 93:
                                    dup2X1();
                                    return;
                                case 94:
                                    dup2X2();
                                    return;
                                case 95:
                                    swap();
                                    return;
                                case 96:
                                    add(org.objectweb.asm.Type.INT_TYPE);
                                    return;
                                case 97:
                                    add(org.objectweb.asm.Type.LONG_TYPE);
                                    return;
                                case 98:
                                    add(org.objectweb.asm.Type.FLOAT_TYPE);
                                    return;
                                case 99:
                                    add(org.objectweb.asm.Type.DOUBLE_TYPE);
                                    return;
                                case 100:
                                    sub(org.objectweb.asm.Type.INT_TYPE);
                                    return;
                                case 101:
                                    sub(org.objectweb.asm.Type.LONG_TYPE);
                                    return;
                                case 102:
                                    sub(org.objectweb.asm.Type.FLOAT_TYPE);
                                    return;
                                case 103:
                                    sub(org.objectweb.asm.Type.DOUBLE_TYPE);
                                    return;
                                case 104:
                                    mul(org.objectweb.asm.Type.INT_TYPE);
                                    return;
                                case 105:
                                    mul(org.objectweb.asm.Type.LONG_TYPE);
                                    return;
                                case 106:
                                    mul(org.objectweb.asm.Type.FLOAT_TYPE);
                                    return;
                                case 107:
                                    mul(org.objectweb.asm.Type.DOUBLE_TYPE);
                                    return;
                                case 108:
                                    div(org.objectweb.asm.Type.INT_TYPE);
                                    return;
                                case 109:
                                    div(org.objectweb.asm.Type.LONG_TYPE);
                                    return;
                                case 110:
                                    div(org.objectweb.asm.Type.FLOAT_TYPE);
                                    return;
                                case 111:
                                    div(org.objectweb.asm.Type.DOUBLE_TYPE);
                                    return;
                                case 112:
                                    rem(org.objectweb.asm.Type.INT_TYPE);
                                    return;
                                case 113:
                                    rem(org.objectweb.asm.Type.LONG_TYPE);
                                    return;
                                case 114:
                                    rem(org.objectweb.asm.Type.FLOAT_TYPE);
                                    return;
                                case 115:
                                    rem(org.objectweb.asm.Type.DOUBLE_TYPE);
                                    return;
                                case 116:
                                    neg(org.objectweb.asm.Type.INT_TYPE);
                                    return;
                                case 117:
                                    neg(org.objectweb.asm.Type.LONG_TYPE);
                                    return;
                                case 118:
                                    neg(org.objectweb.asm.Type.FLOAT_TYPE);
                                    return;
                                case 119:
                                    neg(org.objectweb.asm.Type.DOUBLE_TYPE);
                                    return;
                                case 120:
                                    shl(org.objectweb.asm.Type.INT_TYPE);
                                    return;
                                case 121:
                                    shl(org.objectweb.asm.Type.LONG_TYPE);
                                    return;
                                case 122:
                                    shr(org.objectweb.asm.Type.INT_TYPE);
                                    return;
                                case 123:
                                    shr(org.objectweb.asm.Type.LONG_TYPE);
                                    return;
                                case 124:
                                    ushr(org.objectweb.asm.Type.INT_TYPE);
                                    return;
                                case 125:
                                    ushr(org.objectweb.asm.Type.LONG_TYPE);
                                    return;
                                case 126:
                                    and(org.objectweb.asm.Type.INT_TYPE);
                                    return;
                                case 127:
                                    and(org.objectweb.asm.Type.LONG_TYPE);
                                    return;
                                case 128:
                                    or(org.objectweb.asm.Type.INT_TYPE);
                                    return;
                                case 129:
                                    or(org.objectweb.asm.Type.LONG_TYPE);
                                    return;
                                case 130:
                                    xor(org.objectweb.asm.Type.INT_TYPE);
                                    return;
                                case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                                    xor(org.objectweb.asm.Type.LONG_TYPE);
                                    return;
                                default:
                                    switch (i) {
                                        case org.objectweb.asm.Opcodes.I2L /* 133 */:
                                            cast(org.objectweb.asm.Type.INT_TYPE, org.objectweb.asm.Type.LONG_TYPE);
                                            return;
                                        case 134:
                                            cast(org.objectweb.asm.Type.INT_TYPE, org.objectweb.asm.Type.FLOAT_TYPE);
                                            return;
                                        case 135:
                                            cast(org.objectweb.asm.Type.INT_TYPE, org.objectweb.asm.Type.DOUBLE_TYPE);
                                            return;
                                        case 136:
                                            cast(org.objectweb.asm.Type.LONG_TYPE, org.objectweb.asm.Type.INT_TYPE);
                                            return;
                                        case org.objectweb.asm.Opcodes.L2F /* 137 */:
                                            cast(org.objectweb.asm.Type.LONG_TYPE, org.objectweb.asm.Type.FLOAT_TYPE);
                                            return;
                                        case 138:
                                            cast(org.objectweb.asm.Type.LONG_TYPE, org.objectweb.asm.Type.DOUBLE_TYPE);
                                            return;
                                        case 139:
                                            cast(org.objectweb.asm.Type.FLOAT_TYPE, org.objectweb.asm.Type.INT_TYPE);
                                            return;
                                        case 140:
                                            cast(org.objectweb.asm.Type.FLOAT_TYPE, org.objectweb.asm.Type.LONG_TYPE);
                                            return;
                                        case 141:
                                            cast(org.objectweb.asm.Type.FLOAT_TYPE, org.objectweb.asm.Type.DOUBLE_TYPE);
                                            return;
                                        case org.objectweb.asm.Opcodes.D2I /* 142 */:
                                            cast(org.objectweb.asm.Type.DOUBLE_TYPE, org.objectweb.asm.Type.INT_TYPE);
                                            return;
                                        case org.objectweb.asm.Opcodes.D2L /* 143 */:
                                            cast(org.objectweb.asm.Type.DOUBLE_TYPE, org.objectweb.asm.Type.LONG_TYPE);
                                            return;
                                        case org.objectweb.asm.Opcodes.D2F /* 144 */:
                                            cast(org.objectweb.asm.Type.DOUBLE_TYPE, org.objectweb.asm.Type.FLOAT_TYPE);
                                            return;
                                        case org.objectweb.asm.Opcodes.I2B /* 145 */:
                                            cast(org.objectweb.asm.Type.INT_TYPE, org.objectweb.asm.Type.BYTE_TYPE);
                                            return;
                                        case org.objectweb.asm.Opcodes.I2C /* 146 */:
                                            cast(org.objectweb.asm.Type.INT_TYPE, org.objectweb.asm.Type.CHAR_TYPE);
                                            return;
                                        case org.objectweb.asm.Opcodes.I2S /* 147 */:
                                            cast(org.objectweb.asm.Type.INT_TYPE, org.objectweb.asm.Type.SHORT_TYPE);
                                            return;
                                        case org.objectweb.asm.Opcodes.LCMP /* 148 */:
                                            lcmp();
                                            return;
                                        case org.objectweb.asm.Opcodes.FCMPL /* 149 */:
                                            cmpl(org.objectweb.asm.Type.FLOAT_TYPE);
                                            return;
                                        case 150:
                                            cmpg(org.objectweb.asm.Type.FLOAT_TYPE);
                                            return;
                                        case org.objectweb.asm.Opcodes.DCMPL /* 151 */:
                                            cmpl(org.objectweb.asm.Type.DOUBLE_TYPE);
                                            return;
                                        case org.objectweb.asm.Opcodes.DCMPG /* 152 */:
                                            cmpg(org.objectweb.asm.Type.DOUBLE_TYPE);
                                            return;
                                        default:
                                            switch (i) {
                                                case 172:
                                                    areturn(org.objectweb.asm.Type.INT_TYPE);
                                                    return;
                                                case org.objectweb.asm.Opcodes.LRETURN /* 173 */:
                                                    areturn(org.objectweb.asm.Type.LONG_TYPE);
                                                    return;
                                                case org.objectweb.asm.Opcodes.FRETURN /* 174 */:
                                                    areturn(org.objectweb.asm.Type.FLOAT_TYPE);
                                                    return;
                                                case org.objectweb.asm.Opcodes.DRETURN /* 175 */:
                                                    areturn(org.objectweb.asm.Type.DOUBLE_TYPE);
                                                    return;
                                                case org.objectweb.asm.Opcodes.ARETURN /* 176 */:
                                                    areturn(OBJECT_TYPE);
                                                    return;
                                                case org.objectweb.asm.Opcodes.RETURN /* 177 */:
                                                    areturn(org.objectweb.asm.Type.VOID_TYPE);
                                                    return;
                                                default:
                                                    throw new java.lang.IllegalArgumentException();
                                            }
                                    }
                            }
                    }
            }
        }
        monitorexit();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        if (i == 16) {
            iconst(i2);
            return;
        }
        if (i == 17) {
            iconst(i2);
            return;
        }
        if (i == 188) {
            switch (i2) {
                case 4:
                    newarray(org.objectweb.asm.Type.BOOLEAN_TYPE);
                    return;
                case 5:
                    newarray(org.objectweb.asm.Type.CHAR_TYPE);
                    return;
                case 6:
                    newarray(org.objectweb.asm.Type.FLOAT_TYPE);
                    return;
                case 7:
                    newarray(org.objectweb.asm.Type.DOUBLE_TYPE);
                    return;
                case 8:
                    newarray(org.objectweb.asm.Type.BYTE_TYPE);
                    return;
                case 9:
                    newarray(org.objectweb.asm.Type.SHORT_TYPE);
                    return;
                case 10:
                    newarray(org.objectweb.asm.Type.INT_TYPE);
                    return;
                case 11:
                    newarray(org.objectweb.asm.Type.LONG_TYPE);
                    return;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        if (i != 169) {
            switch (i) {
                case 21:
                    load(i2, org.objectweb.asm.Type.INT_TYPE);
                    return;
                case 22:
                    load(i2, org.objectweb.asm.Type.LONG_TYPE);
                    return;
                case 23:
                    load(i2, org.objectweb.asm.Type.FLOAT_TYPE);
                    return;
                case 24:
                    load(i2, org.objectweb.asm.Type.DOUBLE_TYPE);
                    return;
                case 25:
                    load(i2, OBJECT_TYPE);
                    return;
                default:
                    switch (i) {
                        case 54:
                            store(i2, org.objectweb.asm.Type.INT_TYPE);
                            return;
                        case 55:
                            store(i2, org.objectweb.asm.Type.LONG_TYPE);
                            return;
                        case 56:
                            store(i2, org.objectweb.asm.Type.FLOAT_TYPE);
                            return;
                        case 57:
                            store(i2, org.objectweb.asm.Type.DOUBLE_TYPE);
                            return;
                        case 58:
                            store(i2, OBJECT_TYPE);
                            return;
                        default:
                            throw new java.lang.IllegalArgumentException();
                    }
            }
        }
        ret(i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, java.lang.String str) {
        org.objectweb.asm.Type objectType = org.objectweb.asm.Type.getObjectType(str);
        if (i == 187) {
            anew(objectType);
            return;
        }
        if (i == 189) {
            newarray(objectType);
        } else if (i == 192) {
            checkcast(objectType);
        } else {
            if (i == 193) {
                instanceOf(objectType);
                return;
            }
            throw new java.lang.IllegalArgumentException();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        switch (i) {
            case org.objectweb.asm.Opcodes.GETSTATIC /* 178 */:
                getstatic(str, str2, str3);
                return;
            case org.objectweb.asm.Opcodes.PUTSTATIC /* 179 */:
                putstatic(str, str2, str3);
                return;
            case org.objectweb.asm.Opcodes.GETFIELD /* 180 */:
                getfield(str, str2, str3);
                return;
            case org.objectweb.asm.Opcodes.PUTFIELD /* 181 */:
                putfield(str, str2, str3);
                return;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        if (this.api < 327680 && (i & 256) == 0) {
            super.visitMethodInsn(i, str, str2, str3, z);
            return;
        }
        switch (i & (-257)) {
            case org.objectweb.asm.Opcodes.INVOKEVIRTUAL /* 182 */:
                invokevirtual(str, str2, str3, z);
                return;
            case org.objectweb.asm.Opcodes.INVOKESPECIAL /* 183 */:
                invokespecial(str, str2, str3, z);
                return;
            case org.objectweb.asm.Opcodes.INVOKESTATIC /* 184 */:
                invokestatic(str, str2, str3, z);
                return;
            case org.objectweb.asm.Opcodes.INVOKEINTERFACE /* 185 */:
                invokeinterface(str, str2, str3);
                return;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String str, java.lang.String str2, org.objectweb.asm.Handle handle, java.lang.Object... objArr) {
        invokedynamic(str, str2, handle, objArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, org.objectweb.asm.Label label) {
        if (i == 198) {
            ifnull(label);
            return;
        }
        if (i != 199) {
            switch (i) {
                case 153:
                    ifeq(label);
                    return;
                case 154:
                    ifne(label);
                    return;
                case 155:
                    iflt(label);
                    return;
                case 156:
                    ifge(label);
                    return;
                case 157:
                    ifgt(label);
                    return;
                case 158:
                    ifle(label);
                    return;
                case org.objectweb.asm.Opcodes.IF_ICMPEQ /* 159 */:
                    ificmpeq(label);
                    return;
                case org.objectweb.asm.Opcodes.IF_ICMPNE /* 160 */:
                    ificmpne(label);
                    return;
                case org.objectweb.asm.Opcodes.IF_ICMPLT /* 161 */:
                    ificmplt(label);
                    return;
                case org.objectweb.asm.Opcodes.IF_ICMPGE /* 162 */:
                    ificmpge(label);
                    return;
                case org.objectweb.asm.Opcodes.IF_ICMPGT /* 163 */:
                    ificmpgt(label);
                    return;
                case org.objectweb.asm.Opcodes.IF_ICMPLE /* 164 */:
                    ificmple(label);
                    return;
                case org.objectweb.asm.Opcodes.IF_ACMPEQ /* 165 */:
                    ifacmpeq(label);
                    return;
                case org.objectweb.asm.Opcodes.IF_ACMPNE /* 166 */:
                    ifacmpne(label);
                    return;
                case org.objectweb.asm.Opcodes.GOTO /* 167 */:
                    goTo(label);
                    return;
                case org.objectweb.asm.Opcodes.JSR /* 168 */:
                    jsr(label);
                    return;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        ifnonnull(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(org.objectweb.asm.Label label) {
        mark(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object obj) {
        if (this.api < 327680 && ((obj instanceof org.objectweb.asm.Handle) || ((obj instanceof org.objectweb.asm.Type) && ((org.objectweb.asm.Type) obj).getSort() == 11))) {
            throw new java.lang.UnsupportedOperationException("This feature requires ASM5");
        }
        if (this.api < 458752 && (obj instanceof org.objectweb.asm.ConstantDynamic)) {
            throw new java.lang.UnsupportedOperationException("This feature requires ASM7");
        }
        if (obj instanceof java.lang.Integer) {
            iconst(((java.lang.Integer) obj).intValue());
            return;
        }
        if (obj instanceof java.lang.Byte) {
            iconst(((java.lang.Byte) obj).intValue());
            return;
        }
        if (obj instanceof java.lang.Character) {
            iconst(((java.lang.Character) obj).charValue());
            return;
        }
        if (obj instanceof java.lang.Short) {
            iconst(((java.lang.Short) obj).intValue());
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            iconst(((java.lang.Boolean) obj).booleanValue() ? 1 : 0);
            return;
        }
        if (obj instanceof java.lang.Float) {
            fconst(((java.lang.Float) obj).floatValue());
            return;
        }
        if (obj instanceof java.lang.Long) {
            lconst(((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Double) {
            dconst(((java.lang.Double) obj).doubleValue());
            return;
        }
        if (obj instanceof java.lang.String) {
            aconst(obj);
            return;
        }
        if (obj instanceof org.objectweb.asm.Type) {
            tconst((org.objectweb.asm.Type) obj);
        } else if (obj instanceof org.objectweb.asm.Handle) {
            hconst((org.objectweb.asm.Handle) obj);
        } else {
            if (obj instanceof org.objectweb.asm.ConstantDynamic) {
                cconst((org.objectweb.asm.ConstantDynamic) obj);
                return;
            }
            throw new java.lang.IllegalArgumentException();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        iinc(i, i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, org.objectweb.asm.Label label, org.objectweb.asm.Label... labelArr) {
        tableswitch(i, i2, label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(org.objectweb.asm.Label label, int[] iArr, org.objectweb.asm.Label[] labelArr) {
        lookupswitch(label, iArr, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String str, int i) {
        multianewarray(str, i);
    }

    public void nop() {
        this.mv.visitInsn(0);
    }

    public void aconst(java.lang.Object obj) {
        if (obj == null) {
            this.mv.visitInsn(1);
        } else {
            this.mv.visitLdcInsn(obj);
        }
    }

    public void iconst(int i) {
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

    public void lconst(long j) {
        if (j == 0 || j == 1) {
            this.mv.visitInsn(((int) j) + 9);
        } else {
            this.mv.visitLdcInsn(java.lang.Long.valueOf(j));
        }
    }

    public void fconst(float f) {
        int iFloatToIntBits = java.lang.Float.floatToIntBits(f);
        if (iFloatToIntBits == 0 || iFloatToIntBits == 1065353216 || iFloatToIntBits == 1073741824) {
            this.mv.visitInsn(((int) f) + 11);
        } else {
            this.mv.visitLdcInsn(java.lang.Float.valueOf(f));
        }
    }

    public void dconst(double d) {
        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(d);
        if (jDoubleToLongBits == 0 || jDoubleToLongBits == 4607182418800017408L) {
            this.mv.visitInsn(((int) d) + 14);
        } else {
            this.mv.visitLdcInsn(java.lang.Double.valueOf(d));
        }
    }

    public void tconst(org.objectweb.asm.Type type) {
        this.mv.visitLdcInsn(type);
    }

    public void hconst(org.objectweb.asm.Handle handle) {
        this.mv.visitLdcInsn(handle);
    }

    public void cconst(org.objectweb.asm.ConstantDynamic constantDynamic) {
        this.mv.visitLdcInsn(constantDynamic);
    }

    public void load(int i, org.objectweb.asm.Type type) {
        this.mv.visitVarInsn(type.getOpcode(21), i);
    }

    public void aload(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(46));
    }

    public void store(int i, org.objectweb.asm.Type type) {
        this.mv.visitVarInsn(type.getOpcode(54), i);
    }

    public void astore(org.objectweb.asm.Type type) {
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

    public void add(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(96));
    }

    public void sub(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(100));
    }

    public void mul(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(104));
    }

    public void div(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(108));
    }

    public void rem(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(112));
    }

    public void neg(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(116));
    }

    public void shl(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(120));
    }

    public void shr(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(122));
    }

    public void ushr(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(124));
    }

    public void and(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(126));
    }

    public void or(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(128));
    }

    public void xor(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(130));
    }

    public void iinc(int i, int i2) {
        this.mv.visitIincInsn(i, i2);
    }

    public void cast(org.objectweb.asm.Type type, org.objectweb.asm.Type type2) {
        cast(this.mv, type, type2);
    }

    static void cast(org.objectweb.asm.MethodVisitor methodVisitor, org.objectweb.asm.Type type, org.objectweb.asm.Type type2) {
        if (type != type2) {
            if (type == org.objectweb.asm.Type.DOUBLE_TYPE) {
                if (type2 == org.objectweb.asm.Type.FLOAT_TYPE) {
                    methodVisitor.visitInsn(org.objectweb.asm.Opcodes.D2F);
                    return;
                } else if (type2 == org.objectweb.asm.Type.LONG_TYPE) {
                    methodVisitor.visitInsn(org.objectweb.asm.Opcodes.D2L);
                    return;
                } else {
                    methodVisitor.visitInsn(org.objectweb.asm.Opcodes.D2I);
                    cast(methodVisitor, org.objectweb.asm.Type.INT_TYPE, type2);
                    return;
                }
            }
            if (type == org.objectweb.asm.Type.FLOAT_TYPE) {
                if (type2 == org.objectweb.asm.Type.DOUBLE_TYPE) {
                    methodVisitor.visitInsn(141);
                    return;
                } else if (type2 == org.objectweb.asm.Type.LONG_TYPE) {
                    methodVisitor.visitInsn(140);
                    return;
                } else {
                    methodVisitor.visitInsn(139);
                    cast(methodVisitor, org.objectweb.asm.Type.INT_TYPE, type2);
                    return;
                }
            }
            if (type == org.objectweb.asm.Type.LONG_TYPE) {
                if (type2 == org.objectweb.asm.Type.DOUBLE_TYPE) {
                    methodVisitor.visitInsn(138);
                    return;
                } else if (type2 == org.objectweb.asm.Type.FLOAT_TYPE) {
                    methodVisitor.visitInsn(org.objectweb.asm.Opcodes.L2F);
                    return;
                } else {
                    methodVisitor.visitInsn(136);
                    cast(methodVisitor, org.objectweb.asm.Type.INT_TYPE, type2);
                    return;
                }
            }
            if (type2 == org.objectweb.asm.Type.BYTE_TYPE) {
                methodVisitor.visitInsn(org.objectweb.asm.Opcodes.I2B);
                return;
            }
            if (type2 == org.objectweb.asm.Type.CHAR_TYPE) {
                methodVisitor.visitInsn(org.objectweb.asm.Opcodes.I2C);
                return;
            }
            if (type2 == org.objectweb.asm.Type.DOUBLE_TYPE) {
                methodVisitor.visitInsn(135);
                return;
            }
            if (type2 == org.objectweb.asm.Type.FLOAT_TYPE) {
                methodVisitor.visitInsn(134);
            } else if (type2 == org.objectweb.asm.Type.LONG_TYPE) {
                methodVisitor.visitInsn(org.objectweb.asm.Opcodes.I2L);
            } else if (type2 == org.objectweb.asm.Type.SHORT_TYPE) {
                methodVisitor.visitInsn(org.objectweb.asm.Opcodes.I2S);
            }
        }
    }

    public void lcmp() {
        this.mv.visitInsn(org.objectweb.asm.Opcodes.LCMP);
    }

    public void cmpl(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type == org.objectweb.asm.Type.FLOAT_TYPE ? org.objectweb.asm.Opcodes.FCMPL : org.objectweb.asm.Opcodes.DCMPL);
    }

    public void cmpg(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type == org.objectweb.asm.Type.FLOAT_TYPE ? 150 : org.objectweb.asm.Opcodes.DCMPG);
    }

    public void ifeq(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(153, label);
    }

    public void ifne(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(154, label);
    }

    public void iflt(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(155, label);
    }

    public void ifge(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(156, label);
    }

    public void ifgt(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(157, label);
    }

    public void ifle(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(158, label);
    }

    public void ificmpeq(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.IF_ICMPEQ, label);
    }

    public void ificmpne(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.IF_ICMPNE, label);
    }

    public void ificmplt(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.IF_ICMPLT, label);
    }

    public void ificmpge(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.IF_ICMPGE, label);
    }

    public void ificmpgt(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.IF_ICMPGT, label);
    }

    public void ificmple(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.IF_ICMPLE, label);
    }

    public void ifacmpeq(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.IF_ACMPEQ, label);
    }

    public void ifacmpne(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.IF_ACMPNE, label);
    }

    public void goTo(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.GOTO, label);
    }

    public void jsr(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.JSR, label);
    }

    public void ret(int i) {
        this.mv.visitVarInsn(org.objectweb.asm.Opcodes.RET, i);
    }

    public void tableswitch(int i, int i2, org.objectweb.asm.Label label, org.objectweb.asm.Label... labelArr) {
        this.mv.visitTableSwitchInsn(i, i2, label, labelArr);
    }

    public void lookupswitch(org.objectweb.asm.Label label, int[] iArr, org.objectweb.asm.Label[] labelArr) {
        this.mv.visitLookupSwitchInsn(label, iArr, labelArr);
    }

    public void areturn(org.objectweb.asm.Type type) {
        this.mv.visitInsn(type.getOpcode(172));
    }

    public void getstatic(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.mv.visitFieldInsn(org.objectweb.asm.Opcodes.GETSTATIC, str, str2, str3);
    }

    public void putstatic(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.mv.visitFieldInsn(org.objectweb.asm.Opcodes.PUTSTATIC, str, str2, str3);
    }

    public void getfield(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.mv.visitFieldInsn(org.objectweb.asm.Opcodes.GETFIELD, str, str2, str3);
    }

    public void putfield(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.mv.visitFieldInsn(org.objectweb.asm.Opcodes.PUTFIELD, str, str2, str3);
    }

    @java.lang.Deprecated
    public void invokevirtual(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (this.api >= 327680) {
            invokevirtual(str, str2, str3, false);
        } else {
            this.mv.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, str, str2, str3);
        }
    }

    public void invokevirtual(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        if (this.api >= 327680) {
            this.mv.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, str, str2, str3, z);
        } else {
            if (z) {
                throw new java.lang.UnsupportedOperationException("INVOKEVIRTUAL on interfaces require ASM 5");
            }
            invokevirtual(str, str2, str3);
        }
    }

    @java.lang.Deprecated
    public void invokespecial(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (this.api >= 327680) {
            invokespecial(str, str2, str3, false);
        } else {
            this.mv.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKESPECIAL, str, str2, str3, false);
        }
    }

    public void invokespecial(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        if (this.api >= 327680) {
            this.mv.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKESPECIAL, str, str2, str3, z);
        } else {
            if (z) {
                throw new java.lang.UnsupportedOperationException("INVOKESPECIAL on interfaces require ASM 5");
            }
            invokespecial(str, str2, str3);
        }
    }

    @java.lang.Deprecated
    public void invokestatic(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (this.api >= 327680) {
            invokestatic(str, str2, str3, false);
        } else {
            this.mv.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKESTATIC, str, str2, str3, false);
        }
    }

    public void invokestatic(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        if (this.api >= 327680) {
            this.mv.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKESTATIC, str, str2, str3, z);
        } else {
            if (z) {
                throw new java.lang.UnsupportedOperationException("INVOKESTATIC on interfaces require ASM 5");
            }
            invokestatic(str, str2, str3);
        }
    }

    public void invokeinterface(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.mv.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKEINTERFACE, str, str2, str3, true);
    }

    public void invokedynamic(java.lang.String str, java.lang.String str2, org.objectweb.asm.Handle handle, java.lang.Object[] objArr) {
        this.mv.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    public void anew(org.objectweb.asm.Type type) {
        this.mv.visitTypeInsn(org.objectweb.asm.Opcodes.NEW, type.getInternalName());
    }

    public void newarray(org.objectweb.asm.Type type) {
        newarray(this.mv, type);
    }

    static void newarray(org.objectweb.asm.MethodVisitor methodVisitor, org.objectweb.asm.Type type) {
        int i;
        switch (type.getSort()) {
            case 1:
                i = 4;
                break;
            case 2:
                i = 5;
                break;
            case 3:
                i = 8;
                break;
            case 4:
                i = 9;
                break;
            case 5:
                i = 10;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 11;
                break;
            case 8:
                i = 7;
                break;
            default:
                methodVisitor.visitTypeInsn(189, type.getInternalName());
                return;
        }
        methodVisitor.visitIntInsn(188, i);
    }

    public void arraylength() {
        this.mv.visitInsn(org.objectweb.asm.Opcodes.ARRAYLENGTH);
    }

    public void athrow() {
        this.mv.visitInsn(org.objectweb.asm.Opcodes.ATHROW);
    }

    public void checkcast(org.objectweb.asm.Type type) {
        this.mv.visitTypeInsn(192, type.getInternalName());
    }

    public void instanceOf(org.objectweb.asm.Type type) {
        this.mv.visitTypeInsn(org.objectweb.asm.Opcodes.INSTANCEOF, type.getInternalName());
    }

    public void monitorenter() {
        this.mv.visitInsn(org.objectweb.asm.Opcodes.MONITORENTER);
    }

    public void monitorexit() {
        this.mv.visitInsn(org.objectweb.asm.Opcodes.MONITOREXIT);
    }

    public void multianewarray(java.lang.String str, int i) {
        this.mv.visitMultiANewArrayInsn(str, i);
    }

    public void ifnull(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.IFNULL, label);
    }

    public void ifnonnull(org.objectweb.asm.Label label) {
        this.mv.visitJumpInsn(org.objectweb.asm.Opcodes.IFNONNULL, label);
    }

    public void mark(org.objectweb.asm.Label label) {
        this.mv.visitLabel(label);
    }
}
