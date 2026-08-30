package org.objectweb.asm.tree.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class SourceInterpreter extends org.objectweb.asm.tree.analysis.Interpreter<org.objectweb.asm.tree.analysis.SourceValue> implements org.objectweb.asm.Opcodes {
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public void returnOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.analysis.SourceValue sourceValue, org.objectweb.asm.tree.analysis.SourceValue sourceValue2) {
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value naryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, java.util.List list) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        return naryOperation(abstractInsnNode, (java.util.List<? extends org.objectweb.asm.tree.analysis.SourceValue>) list);
    }

    public SourceInterpreter() {
        super(589824);
        if (getClass() != org.objectweb.asm.tree.analysis.SourceInterpreter.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    protected SourceInterpreter(int i) {
        super(i);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.SourceValue newValue(org.objectweb.asm.Type type) {
        if (type == org.objectweb.asm.Type.VOID_TYPE) {
            return null;
        }
        return new org.objectweb.asm.tree.analysis.SourceValue(type == null ? 1 : type.getSize());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.SourceValue newOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
        int opcode = abstractInsnNode.getOpcode();
        int size = 2;
        if (opcode != 9 && opcode != 10 && opcode != 14 && opcode != 15) {
            if (opcode == 18) {
                java.lang.Object obj = ((org.objectweb.asm.tree.LdcInsnNode) abstractInsnNode).cst;
                if (!(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Double)) {
                    size = 1;
                }
            } else if (opcode != 178) {
                size = 1;
            } else {
                size = org.objectweb.asm.Type.getType(((org.objectweb.asm.tree.FieldInsnNode) abstractInsnNode).desc).getSize();
            }
        }
        return new org.objectweb.asm.tree.analysis.SourceValue(size, abstractInsnNode);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.SourceValue copyOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.analysis.SourceValue sourceValue) {
        return new org.objectweb.asm.tree.analysis.SourceValue(sourceValue.getSize(), abstractInsnNode);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.SourceValue unaryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.analysis.SourceValue sourceValue) {
        int size;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 117 || opcode == 119 || opcode == 133 || opcode == 135 || opcode == 138 || opcode == 143) {
            size = 2;
        } else if (opcode == 180) {
            size = org.objectweb.asm.Type.getType(((org.objectweb.asm.tree.FieldInsnNode) abstractInsnNode).desc).getSize();
        } else if (opcode == 140 || opcode == 141) {
            size = 2;
        } else {
            size = 1;
        }
        return new org.objectweb.asm.tree.analysis.SourceValue(size, abstractInsnNode);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.SourceValue binaryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.analysis.SourceValue sourceValue, org.objectweb.asm.tree.analysis.SourceValue sourceValue2) {
        int i;
        switch (abstractInsnNode.getOpcode()) {
            case 47:
            case 49:
            case 97:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 109:
            case 111:
            case 113:
            case 115:
            case 121:
            case 123:
            case 125:
            case 127:
            case 129:
            case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                i = 2;
                break;
            default:
                i = 1;
                break;
        }
        return new org.objectweb.asm.tree.analysis.SourceValue(i, abstractInsnNode);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.SourceValue ternaryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.analysis.SourceValue sourceValue, org.objectweb.asm.tree.analysis.SourceValue sourceValue2, org.objectweb.asm.tree.analysis.SourceValue sourceValue3) {
        return new org.objectweb.asm.tree.analysis.SourceValue(1, abstractInsnNode);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.SourceValue naryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, java.util.List<? extends org.objectweb.asm.tree.analysis.SourceValue> list) {
        int size;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 197) {
            size = 1;
        } else if (opcode == 186) {
            size = org.objectweb.asm.Type.getReturnType(((org.objectweb.asm.tree.InvokeDynamicInsnNode) abstractInsnNode).desc).getSize();
        } else {
            size = org.objectweb.asm.Type.getReturnType(((org.objectweb.asm.tree.MethodInsnNode) abstractInsnNode).desc).getSize();
        }
        return new org.objectweb.asm.tree.analysis.SourceValue(size, abstractInsnNode);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.SourceValue merge(org.objectweb.asm.tree.analysis.SourceValue sourceValue, org.objectweb.asm.tree.analysis.SourceValue sourceValue2) {
        if ((sourceValue.insns instanceof org.objectweb.asm.tree.analysis.SmallSet) && (sourceValue2.insns instanceof org.objectweb.asm.tree.analysis.SmallSet)) {
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> setUnion = ((org.objectweb.asm.tree.analysis.SmallSet) sourceValue.insns).union((org.objectweb.asm.tree.analysis.SmallSet) sourceValue2.insns);
            return (setUnion == sourceValue.insns && sourceValue.size == sourceValue2.size) ? sourceValue : new org.objectweb.asm.tree.analysis.SourceValue(java.lang.Math.min(sourceValue.size, sourceValue2.size), setUnion);
        }
        if (sourceValue.size == sourceValue2.size && containsAll(sourceValue.insns, sourceValue2.insns)) {
            return sourceValue;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(sourceValue.insns);
        hashSet.addAll(sourceValue2.insns);
        return new org.objectweb.asm.tree.analysis.SourceValue(java.lang.Math.min(sourceValue.size, sourceValue2.size), hashSet);
    }

    private static <E> boolean containsAll(java.util.Set<E> set, java.util.Set<E> set2) {
        if (set.size() < set2.size()) {
            return false;
        }
        return set.containsAll(set2);
    }
}
