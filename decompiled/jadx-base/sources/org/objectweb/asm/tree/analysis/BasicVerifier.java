package org.objectweb.asm.tree.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class BasicVerifier extends org.objectweb.asm.tree.analysis.BasicInterpreter {
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value naryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, java.util.List list) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        return naryOperation(abstractInsnNode, (java.util.List<? extends org.objectweb.asm.tree.analysis.BasicValue>) list);
    }

    public BasicVerifier() {
        super(589824);
        if (getClass() != org.objectweb.asm.tree.analysis.BasicVerifier.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    protected BasicVerifier(int i) {
        super(i);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue copyOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue basicValue) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        org.objectweb.asm.tree.analysis.BasicValue basicValue2;
        int opcode = abstractInsnNode.getOpcode();
        switch (opcode) {
            case 21:
                basicValue2 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                if (basicValue2.equals(basicValue)) {
                    return basicValue;
                }
                throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, null, basicValue2, basicValue);
            case 22:
                basicValue2 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                if (basicValue2.equals(basicValue)) {
                    return basicValue;
                }
                throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, null, basicValue2, basicValue);
            case 23:
                basicValue2 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
                if (basicValue2.equals(basicValue)) {
                    return basicValue;
                }
                throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, null, basicValue2, basicValue);
            case 24:
                basicValue2 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
                if (basicValue2.equals(basicValue)) {
                    return basicValue;
                }
                throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, null, basicValue2, basicValue);
            case 25:
                if (basicValue.isReference()) {
                    return basicValue;
                }
                throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, null, "an object reference", basicValue);
            default:
                switch (opcode) {
                    case 54:
                        basicValue2 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                        break;
                    case 55:
                        basicValue2 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                        break;
                    case 56:
                        basicValue2 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
                        break;
                    case 57:
                        basicValue2 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
                        break;
                    case 58:
                        if (basicValue.isReference() || org.objectweb.asm.tree.analysis.BasicValue.RETURNADDRESS_VALUE.equals(basicValue)) {
                            return basicValue;
                        }
                        throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, null, "an object reference or a return address", basicValue);
                    default:
                        return basicValue;
                }
                if (basicValue2.equals(basicValue)) {
                    return basicValue;
                }
                throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, null, basicValue2, basicValue);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue unaryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue basicValue) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        org.objectweb.asm.tree.analysis.BasicValue basicValueNewValue;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 179) {
            basicValueNewValue = newValue(org.objectweb.asm.Type.getType(((org.objectweb.asm.tree.FieldInsnNode) abstractInsnNode).desc));
        } else if (opcode == 180) {
            basicValueNewValue = newValue(org.objectweb.asm.Type.getObjectType(((org.objectweb.asm.tree.FieldInsnNode) abstractInsnNode).owner));
        } else {
            if (opcode != 198 && opcode != 199) {
                switch (opcode) {
                    case 116:
                        basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                        break;
                    case 117:
                        basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                        break;
                    case 118:
                        basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
                        break;
                    case 119:
                        basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
                        break;
                    default:
                        switch (opcode) {
                            case org.objectweb.asm.Opcodes.IINC /* 132 */:
                            case org.objectweb.asm.Opcodes.I2L /* 133 */:
                            case 134:
                            case 135:
                            case org.objectweb.asm.Opcodes.I2B /* 145 */:
                            case org.objectweb.asm.Opcodes.I2C /* 146 */:
                            case org.objectweb.asm.Opcodes.I2S /* 147 */:
                                basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                                break;
                            case 136:
                            case org.objectweb.asm.Opcodes.L2F /* 137 */:
                            case 138:
                                basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                                break;
                            case 139:
                            case 140:
                            case 141:
                                basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
                                break;
                            case org.objectweb.asm.Opcodes.D2I /* 142 */:
                            case org.objectweb.asm.Opcodes.D2L /* 143 */:
                            case org.objectweb.asm.Opcodes.D2F /* 144 */:
                                basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
                                break;
                            default:
                                switch (opcode) {
                                    default:
                                        switch (opcode) {
                                            case org.objectweb.asm.Opcodes.TABLESWITCH /* 170 */:
                                            case org.objectweb.asm.Opcodes.LOOKUPSWITCH /* 171 */:
                                            case 172:
                                                break;
                                            case org.objectweb.asm.Opcodes.LRETURN /* 173 */:
                                                basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                                                break;
                                            case org.objectweb.asm.Opcodes.FRETURN /* 174 */:
                                                basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
                                                break;
                                            case org.objectweb.asm.Opcodes.DRETURN /* 175 */:
                                                basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
                                                break;
                                            case org.objectweb.asm.Opcodes.ARETURN /* 176 */:
                                                break;
                                            default:
                                                switch (opcode) {
                                                    case 188:
                                                    case 189:
                                                        break;
                                                    case org.objectweb.asm.Opcodes.ARRAYLENGTH /* 190 */:
                                                        if (!isArrayValue(basicValue)) {
                                                            throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, null, "an array reference", basicValue);
                                                        }
                                                        return super.unaryOperation(abstractInsnNode, basicValue);
                                                    case org.objectweb.asm.Opcodes.ATHROW /* 191 */:
                                                    case 192:
                                                    case org.objectweb.asm.Opcodes.INSTANCEOF /* 193 */:
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
                                        basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            if (!basicValue.isReference()) {
                throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, null, "an object reference", basicValue);
            }
            return super.unaryOperation(abstractInsnNode, basicValue);
        }
        if (!isSubTypeOf(basicValue, basicValueNewValue)) {
            throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, null, basicValueNewValue, basicValue);
        }
        return super.unaryOperation(abstractInsnNode, basicValue);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue binaryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue basicValue, org.objectweb.asm.tree.analysis.BasicValue basicValue2) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        org.objectweb.asm.tree.analysis.BasicValue basicValueNewValue;
        org.objectweb.asm.tree.analysis.BasicValue basicValueNewValue2;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode != 181) {
            switch (opcode) {
                case 46:
                    basicValueNewValue2 = newValue(org.objectweb.asm.Type.getType("[I"));
                    basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                    break;
                case 47:
                    basicValueNewValue2 = newValue(org.objectweb.asm.Type.getType("[J"));
                    basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                    break;
                case 48:
                    basicValueNewValue2 = newValue(org.objectweb.asm.Type.getType("[F"));
                    basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                    break;
                case 49:
                    basicValueNewValue2 = newValue(org.objectweb.asm.Type.getType("[D"));
                    basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                    break;
                case 50:
                    basicValueNewValue2 = newValue(org.objectweb.asm.Type.getType("[Ljava/lang/Object;"));
                    basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                    break;
                case 51:
                    if (isSubTypeOf(basicValue, newValue(org.objectweb.asm.Type.getType(org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC)))) {
                        basicValueNewValue2 = newValue(org.objectweb.asm.Type.getType(org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC));
                    } else {
                        basicValueNewValue2 = newValue(org.objectweb.asm.Type.getType("[B"));
                    }
                    basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                    break;
                case 52:
                    basicValueNewValue2 = newValue(org.objectweb.asm.Type.getType("[C"));
                    basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                    break;
                case 53:
                    basicValueNewValue2 = newValue(org.objectweb.asm.Type.getType("[S"));
                    basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                    break;
                default:
                    switch (opcode) {
                        case 96:
                        case 100:
                        case 104:
                        case 108:
                        case 112:
                            basicValueNewValue2 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                            basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                            break;
                        case 97:
                        case 101:
                        case 105:
                        case 109:
                        case 113:
                            basicValueNewValue2 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                            basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                            break;
                        case 98:
                        case 102:
                        case 106:
                        case 110:
                        case 114:
                            basicValueNewValue2 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
                            basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
                            break;
                        case 99:
                        case 103:
                        case 107:
                        case 111:
                        case 115:
                            basicValueNewValue2 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
                            basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
                            break;
                        default:
                            switch (opcode) {
                                case 120:
                                case 122:
                                case 124:
                                case 126:
                                case 128:
                                case 130:
                                    basicValueNewValue2 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                                    basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                                    break;
                                case 121:
                                case 123:
                                case 125:
                                    basicValueNewValue2 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                                    basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                                    break;
                                case 127:
                                case 129:
                                case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                                    basicValueNewValue2 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                                    basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                                    break;
                                default:
                                    switch (opcode) {
                                        case org.objectweb.asm.Opcodes.LCMP /* 148 */:
                                            basicValueNewValue2 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                                            basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                                            break;
                                        case org.objectweb.asm.Opcodes.FCMPL /* 149 */:
                                        case 150:
                                            basicValueNewValue2 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
                                            basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
                                            break;
                                        case org.objectweb.asm.Opcodes.DCMPL /* 151 */:
                                        case org.objectweb.asm.Opcodes.DCMPG /* 152 */:
                                            basicValueNewValue2 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
                                            basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
                                            break;
                                        default:
                                            switch (opcode) {
                                                case org.objectweb.asm.Opcodes.IF_ICMPEQ /* 159 */:
                                                case org.objectweb.asm.Opcodes.IF_ICMPNE /* 160 */:
                                                case org.objectweb.asm.Opcodes.IF_ICMPLT /* 161 */:
                                                case org.objectweb.asm.Opcodes.IF_ICMPGE /* 162 */:
                                                case org.objectweb.asm.Opcodes.IF_ICMPGT /* 163 */:
                                                case org.objectweb.asm.Opcodes.IF_ICMPLE /* 164 */:
                                                    basicValueNewValue2 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                                                    basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                                                    break;
                                                case org.objectweb.asm.Opcodes.IF_ACMPEQ /* 165 */:
                                                case org.objectweb.asm.Opcodes.IF_ACMPNE /* 166 */:
                                                    basicValueNewValue2 = org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE;
                                                    basicValueNewValue = org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE;
                                                    break;
                                                default:
                                                    throw new java.lang.AssertionError();
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            org.objectweb.asm.tree.FieldInsnNode fieldInsnNode = (org.objectweb.asm.tree.FieldInsnNode) abstractInsnNode;
            org.objectweb.asm.tree.analysis.BasicValue basicValueNewValue3 = newValue(org.objectweb.asm.Type.getObjectType(fieldInsnNode.owner));
            basicValueNewValue = newValue(org.objectweb.asm.Type.getType(fieldInsnNode.desc));
            basicValueNewValue2 = basicValueNewValue3;
        }
        if (!isSubTypeOf(basicValue, basicValueNewValue2)) {
            throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, "First argument", basicValueNewValue2, basicValue);
        }
        if (!isSubTypeOf(basicValue2, basicValueNewValue)) {
            throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, "Second argument", basicValueNewValue, basicValue2);
        }
        if (abstractInsnNode.getOpcode() == 50) {
            return getElementValue(basicValue);
        }
        return super.binaryOperation(abstractInsnNode, basicValue, basicValue2);
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue ternaryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue basicValue, org.objectweb.asm.tree.analysis.BasicValue basicValue2, org.objectweb.asm.tree.analysis.BasicValue basicValue3) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        org.objectweb.asm.tree.analysis.BasicValue basicValueNewValue;
        org.objectweb.asm.tree.analysis.BasicValue basicValue4;
        switch (abstractInsnNode.getOpcode()) {
            case 79:
                basicValueNewValue = newValue(org.objectweb.asm.Type.getType("[I"));
                basicValue4 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                break;
            case 80:
                basicValueNewValue = newValue(org.objectweb.asm.Type.getType("[J"));
                basicValue4 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE;
                break;
            case 81:
                basicValueNewValue = newValue(org.objectweb.asm.Type.getType("[F"));
                basicValue4 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE;
                break;
            case 82:
                basicValueNewValue = newValue(org.objectweb.asm.Type.getType("[D"));
                basicValue4 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE;
                break;
            case 83:
                basicValue4 = org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE;
                basicValueNewValue = basicValue;
                break;
            case 84:
                if (isSubTypeOf(basicValue, newValue(org.objectweb.asm.Type.getType(org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC)))) {
                    basicValueNewValue = newValue(org.objectweb.asm.Type.getType(org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC));
                } else {
                    basicValueNewValue = newValue(org.objectweb.asm.Type.getType("[B"));
                }
                basicValue4 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                break;
            case 85:
                basicValueNewValue = newValue(org.objectweb.asm.Type.getType("[C"));
                basicValue4 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                break;
            case 86:
                basicValueNewValue = newValue(org.objectweb.asm.Type.getType("[S"));
                basicValue4 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE;
                break;
            default:
                throw new java.lang.AssertionError();
        }
        if (!isSubTypeOf(basicValue, basicValueNewValue)) {
            throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, "First argument", "a " + basicValueNewValue + " array reference", basicValue);
        }
        if (!org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE.equals(basicValue2)) {
            throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, "Second argument", org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE, basicValue2);
        }
        if (isSubTypeOf(basicValue3, basicValue4)) {
            return null;
        }
        throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, "Third argument", basicValue4, basicValue3);
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue naryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, java.util.List<? extends org.objectweb.asm.tree.analysis.BasicValue> list) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        int i;
        java.lang.String str;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 197) {
            for (org.objectweb.asm.tree.analysis.BasicValue basicValue : list) {
                if (!org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE.equals(basicValue)) {
                    throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, null, org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE, basicValue);
                }
            }
        } else {
            int i2 = 0;
            if (opcode == 184 || opcode == 186) {
                i = 0;
            } else {
                org.objectweb.asm.Type objectType = org.objectweb.asm.Type.getObjectType(((org.objectweb.asm.tree.MethodInsnNode) abstractInsnNode).owner);
                if (!isSubTypeOf(list.get(0), newValue(objectType))) {
                    throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, "Method owner", newValue(objectType), list.get(0));
                }
                i = 1;
            }
            if (opcode == 186) {
                str = ((org.objectweb.asm.tree.InvokeDynamicInsnNode) abstractInsnNode).desc;
            } else {
                str = ((org.objectweb.asm.tree.MethodInsnNode) abstractInsnNode).desc;
            }
            org.objectweb.asm.Type[] argumentTypes = org.objectweb.asm.Type.getArgumentTypes(str);
            while (i < list.size()) {
                int i3 = i2 + 1;
                org.objectweb.asm.tree.analysis.BasicValue basicValueNewValue = newValue(argumentTypes[i2]);
                int i4 = i + 1;
                org.objectweb.asm.tree.analysis.BasicValue basicValue2 = list.get(i);
                if (!isSubTypeOf(basicValue2, basicValueNewValue)) {
                    throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, "Argument " + i3, basicValueNewValue, basicValue2);
                }
                i2 = i3;
                i = i4;
            }
        }
        return super.naryOperation(abstractInsnNode, list);
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public void returnOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue basicValue, org.objectweb.asm.tree.analysis.BasicValue basicValue2) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        if (!isSubTypeOf(basicValue, basicValue2)) {
            throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, "Incompatible return type", basicValue2, basicValue);
        }
    }

    protected boolean isArrayValue(org.objectweb.asm.tree.analysis.BasicValue basicValue) {
        return basicValue.isReference();
    }

    protected org.objectweb.asm.tree.analysis.BasicValue getElementValue(org.objectweb.asm.tree.analysis.BasicValue basicValue) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        return org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE;
    }

    protected boolean isSubTypeOf(org.objectweb.asm.tree.analysis.BasicValue basicValue, org.objectweb.asm.tree.analysis.BasicValue basicValue2) {
        return basicValue.equals(basicValue2);
    }
}
