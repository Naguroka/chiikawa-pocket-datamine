package org.objectweb.asm.tree.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class BasicInterpreter extends org.objectweb.asm.tree.analysis.Interpreter<org.objectweb.asm.tree.analysis.BasicValue> implements org.objectweb.asm.Opcodes {
    public static final org.objectweb.asm.Type NULL_TYPE = org.objectweb.asm.Type.getObjectType("null");

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue copyOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue basicValue) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        return basicValue;
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public void returnOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue basicValue, org.objectweb.asm.tree.analysis.BasicValue basicValue2) throws org.objectweb.asm.tree.analysis.AnalyzerException {
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue ternaryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue basicValue, org.objectweb.asm.tree.analysis.BasicValue basicValue2, org.objectweb.asm.tree.analysis.BasicValue basicValue3) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        return null;
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value naryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, java.util.List list) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        return naryOperation(abstractInsnNode, (java.util.List<? extends org.objectweb.asm.tree.analysis.BasicValue>) list);
    }

    public BasicInterpreter() {
        super(589824);
        if (getClass() != org.objectweb.asm.tree.analysis.BasicInterpreter.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    protected BasicInterpreter(int i) {
        super(i);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue newValue(org.objectweb.asm.Type type) {
        if (type == null) {
            return org.objectweb.asm.tree.analysis.BasicValue.UNINITIALIZED_VALUE;
        }
        switch (type.getSort()) {
            case 0:
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
            case 6:
                return org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
            case 7:
                return org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
            case 8:
                return org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
            case 9:
            case 10:
                return org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE;
            default:
                throw new java.lang.AssertionError();
        }
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue newOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 168) {
            return org.objectweb.asm.tree.analysis.BasicValue.RETURNADDRESS_VALUE;
        }
        if (opcode == 178) {
            return newValue(org.objectweb.asm.Type.getType(((org.objectweb.asm.tree.FieldInsnNode) abstractInsnNode).desc));
        }
        if (opcode != 187) {
            switch (opcode) {
                case 1:
                    return newValue(NULL_TYPE);
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                case 9:
                case 10:
                    return org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                case 11:
                case 12:
                case 13:
                    return org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
                case 14:
                case 15:
                    return org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
                case 16:
                case 17:
                    return org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                case 18:
                    java.lang.Object obj = ((org.objectweb.asm.tree.LdcInsnNode) abstractInsnNode).cst;
                    if (obj instanceof java.lang.Integer) {
                        return org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                    }
                    if (obj instanceof java.lang.Float) {
                        return org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
                    }
                    if (obj instanceof java.lang.Long) {
                        return org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                    }
                    if (obj instanceof java.lang.Double) {
                        return org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
                    }
                    if (obj instanceof java.lang.String) {
                        return newValue(org.objectweb.asm.Type.getObjectType("java/lang/String"));
                    }
                    if (obj instanceof org.objectweb.asm.Type) {
                        int sort = ((org.objectweb.asm.Type) obj).getSort();
                        if (sort == 10 || sort == 9) {
                            return newValue(org.objectweb.asm.Type.getObjectType("java/lang/Class"));
                        }
                        if (sort == 11) {
                            return newValue(org.objectweb.asm.Type.getObjectType("java/lang/invoke/MethodType"));
                        }
                        throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, "Illegal LDC value " + obj);
                    }
                    if (obj instanceof org.objectweb.asm.Handle) {
                        return newValue(org.objectweb.asm.Type.getObjectType("java/lang/invoke/MethodHandle"));
                    }
                    if (obj instanceof org.objectweb.asm.ConstantDynamic) {
                        return newValue(org.objectweb.asm.Type.getType(((org.objectweb.asm.ConstantDynamic) obj).getDescriptor()));
                    }
                    throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, "Illegal LDC value " + obj);
                default:
                    throw new java.lang.AssertionError();
            }
        }
        return newValue(org.objectweb.asm.Type.getObjectType(((org.objectweb.asm.tree.TypeInsnNode) abstractInsnNode).desc));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue unaryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue basicValue) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode != 179) {
            if (opcode == 180) {
                return newValue(org.objectweb.asm.Type.getType(((org.objectweb.asm.tree.FieldInsnNode) abstractInsnNode).desc));
            }
            if (opcode != 198 && opcode != 199) {
                switch (opcode) {
                    case 116:
                        return org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                    case 117:
                        return org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                    case 118:
                        return org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
                    case 119:
                        return org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
                    default:
                        switch (opcode) {
                            case org.objectweb.asm.Opcodes.IINC /* 132 */:
                            case 136:
                            case 139:
                            case org.objectweb.asm.Opcodes.D2I /* 142 */:
                            case org.objectweb.asm.Opcodes.I2B /* 145 */:
                            case org.objectweb.asm.Opcodes.I2C /* 146 */:
                            case org.objectweb.asm.Opcodes.I2S /* 147 */:
                                return org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                            case org.objectweb.asm.Opcodes.I2L /* 133 */:
                            case 140:
                            case org.objectweb.asm.Opcodes.D2L /* 143 */:
                                return org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                            case 134:
                            case org.objectweb.asm.Opcodes.L2F /* 137 */:
                            case org.objectweb.asm.Opcodes.D2F /* 144 */:
                                return org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
                            case 135:
                            case 138:
                            case 141:
                                return org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
                            default:
                                switch (opcode) {
                                    default:
                                        switch (opcode) {
                                            case org.objectweb.asm.Opcodes.TABLESWITCH /* 170 */:
                                            case org.objectweb.asm.Opcodes.LOOKUPSWITCH /* 171 */:
                                            case 172:
                                            case org.objectweb.asm.Opcodes.LRETURN /* 173 */:
                                            case org.objectweb.asm.Opcodes.FRETURN /* 174 */:
                                            case org.objectweb.asm.Opcodes.DRETURN /* 175 */:
                                            case org.objectweb.asm.Opcodes.ARETURN /* 176 */:
                                                break;
                                            default:
                                                switch (opcode) {
                                                    case 188:
                                                        switch (((org.objectweb.asm.tree.IntInsnNode) abstractInsnNode).operand) {
                                                            case 4:
                                                                return newValue(org.objectweb.asm.Type.getType(org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC));
                                                            case 5:
                                                                return newValue(org.objectweb.asm.Type.getType("[C"));
                                                            case 6:
                                                                return newValue(org.objectweb.asm.Type.getType("[F"));
                                                            case 7:
                                                                return newValue(org.objectweb.asm.Type.getType("[D"));
                                                            case 8:
                                                                return newValue(org.objectweb.asm.Type.getType("[B"));
                                                            case 9:
                                                                return newValue(org.objectweb.asm.Type.getType("[S"));
                                                            case 10:
                                                                return newValue(org.objectweb.asm.Type.getType("[I"));
                                                            case 11:
                                                                return newValue(org.objectweb.asm.Type.getType("[J"));
                                                            default:
                                                                throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, "Invalid array type");
                                                        }
                                                    case 189:
                                                        return newValue(org.objectweb.asm.Type.getType(com.ironsource.y8.i.d + org.objectweb.asm.Type.getObjectType(((org.objectweb.asm.tree.TypeInsnNode) abstractInsnNode).desc)));
                                                    case org.objectweb.asm.Opcodes.ARRAYLENGTH /* 190 */:
                                                        return org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                                                    case org.objectweb.asm.Opcodes.ATHROW /* 191 */:
                                                        return null;
                                                    case 192:
                                                        return newValue(org.objectweb.asm.Type.getObjectType(((org.objectweb.asm.tree.TypeInsnNode) abstractInsnNode).desc));
                                                    case org.objectweb.asm.Opcodes.INSTANCEOF /* 193 */:
                                                        return org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                                                    case org.objectweb.asm.Opcodes.MONITORENTER /* 194 */:
                                                    case org.objectweb.asm.Opcodes.MONITOREXIT /* 195 */:
                                                        break;
                                                    default:
                                                        throw new java.lang.AssertionError();
                                                }
                                                break;
                                        }
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x0029  */
    /* JADX WARN: Code duplicated, block: B:21:0x002c  */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue binaryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue basicValue, org.objectweb.asm.tree.analysis.BasicValue basicValue2) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 181) {
            return null;
        }
        switch (opcode) {
            case 46:
            case 51:
            case 52:
            case 53:
                return org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
            case 47:
                return org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
            case 48:
                return org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
            case 49:
                return org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
            case 50:
                return org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE;
            default:
                switch (opcode) {
                    case 96:
                    case 100:
                    case 104:
                    case 108:
                    case 112:
                        return org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                    case 97:
                    case 101:
                    case 105:
                    case 109:
                    case 113:
                        return org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                    case 98:
                    case 102:
                    case 106:
                    case 110:
                    case 114:
                        return org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
                    case 99:
                    case 103:
                    case 107:
                    case 111:
                    case 115:
                        return org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
                    default:
                        switch (opcode) {
                            case 120:
                            case 122:
                            case 124:
                            case 126:
                            case 128:
                            case 130:
                                return org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                            case 121:
                            case 123:
                            case 125:
                            case 127:
                            case 129:
                            case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                                return org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                            default:
                                switch (opcode) {
                                    case org.objectweb.asm.Opcodes.LCMP /* 148 */:
                                    case org.objectweb.asm.Opcodes.FCMPL /* 149 */:
                                    case 150:
                                    case org.objectweb.asm.Opcodes.DCMPL /* 151 */:
                                    case org.objectweb.asm.Opcodes.DCMPG /* 152 */:
                                        return org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                                    default:
                                        switch (opcode) {
                                            case org.objectweb.asm.Opcodes.IF_ICMPEQ /* 159 */:
                                            case org.objectweb.asm.Opcodes.IF_ICMPNE /* 160 */:
                                            case org.objectweb.asm.Opcodes.IF_ICMPLT /* 161 */:
                                            case org.objectweb.asm.Opcodes.IF_ICMPGE /* 162 */:
                                            case org.objectweb.asm.Opcodes.IF_ICMPGT /* 163 */:
                                            case org.objectweb.asm.Opcodes.IF_ICMPLE /* 164 */:
                                            case org.objectweb.asm.Opcodes.IF_ACMPEQ /* 165 */:
                                            case org.objectweb.asm.Opcodes.IF_ACMPNE /* 166 */:
                                                return null;
                                            default:
                                                throw new java.lang.AssertionError();
                                        }
                                }
                        }
                }
        }
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue naryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, java.util.List<? extends org.objectweb.asm.tree.analysis.BasicValue> list) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 197) {
            return newValue(org.objectweb.asm.Type.getType(((org.objectweb.asm.tree.MultiANewArrayInsnNode) abstractInsnNode).desc));
        }
        if (opcode == 186) {
            return newValue(org.objectweb.asm.Type.getReturnType(((org.objectweb.asm.tree.InvokeDynamicInsnNode) abstractInsnNode).desc));
        }
        return newValue(org.objectweb.asm.Type.getReturnType(((org.objectweb.asm.tree.MethodInsnNode) abstractInsnNode).desc));
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue merge(org.objectweb.asm.tree.analysis.BasicValue basicValue, org.objectweb.asm.tree.analysis.BasicValue basicValue2) {
        return !basicValue.equals(basicValue2) ? org.objectweb.asm.tree.analysis.BasicValue.UNINITIALIZED_VALUE : basicValue;
    }
}
