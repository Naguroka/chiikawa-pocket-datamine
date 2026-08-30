package org.objectweb.asm.tree.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class Analyzer<V extends org.objectweb.asm.tree.analysis.Value> implements org.objectweb.asm.Opcodes {
    private org.objectweb.asm.tree.analysis.Frame<V>[] frames;
    private java.util.List<org.objectweb.asm.tree.TryCatchBlockNode>[] handlers;
    private boolean[] inInstructionsToProcess;
    private org.objectweb.asm.tree.InsnList insnList;
    private int insnListSize;
    private int[] instructionsToProcess;
    private final org.objectweb.asm.tree.analysis.Interpreter<V> interpreter;
    private int numInstructionsToProcess;
    private org.objectweb.asm.tree.analysis.Subroutine[] subroutines;

    protected void init(java.lang.String str, org.objectweb.asm.tree.MethodNode methodNode) throws org.objectweb.asm.tree.analysis.AnalyzerException {
    }

    protected void newControlFlowEdge(int i, int i2) {
    }

    protected boolean newControlFlowExceptionEdge(int i, int i2) {
        return true;
    }

    public Analyzer(org.objectweb.asm.tree.analysis.Interpreter<V> interpreter) {
        this.interpreter = interpreter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v6, types: [org.objectweb.asm.tree.analysis.Subroutine] */
    /* JADX WARN: Type inference failed for: r19v0, types: [org.objectweb.asm.tree.analysis.Analyzer, org.objectweb.asm.tree.analysis.Analyzer<V extends org.objectweb.asm.tree.analysis.Value>] */
    /* JADX WARN: Type inference failed for: r1v18, types: [org.objectweb.asm.tree.analysis.Subroutine] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [org.objectweb.asm.tree.analysis.Subroutine] */
    /* JADX WARN: Type inference failed for: r6v3, types: [org.objectweb.asm.tree.analysis.Subroutine] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public org.objectweb.asm.tree.analysis.Frame<V>[] analyze(java.lang.String str, org.objectweb.asm.tree.MethodNode methodNode) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode;
        ?? r1;
        org.objectweb.asm.Type objectType;
        ?? r11;
        ?? r12;
        boolean z = false;
        if ((methodNode.access & 1280) != 0) {
            org.objectweb.asm.tree.analysis.Frame<V>[] frameArr = new org.objectweb.asm.tree.analysis.Frame[0];
            this.frames = frameArr;
            return frameArr;
        }
        org.objectweb.asm.tree.InsnList insnList = methodNode.instructions;
        this.insnList = insnList;
        int size = insnList.size();
        this.insnListSize = size;
        this.handlers = new java.util.List[size];
        this.frames = new org.objectweb.asm.tree.analysis.Frame[size];
        this.subroutines = new org.objectweb.asm.tree.analysis.Subroutine[size];
        this.inInstructionsToProcess = new boolean[size];
        this.instructionsToProcess = new int[size];
        this.numInstructionsToProcess = 0;
        for (int i = 0; i < methodNode.tryCatchBlocks.size(); i++) {
            org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode = methodNode.tryCatchBlocks.get(i);
            int iIndexOf = this.insnList.indexOf(tryCatchBlockNode.end);
            for (int iIndexOf2 = this.insnList.indexOf(tryCatchBlockNode.start); iIndexOf2 < iIndexOf; iIndexOf2++) {
                java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> arrayList = this.handlers[iIndexOf2];
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList<>();
                    this.handlers[iIndexOf2] = arrayList;
                }
                arrayList.add(tryCatchBlockNode);
            }
        }
        org.objectweb.asm.tree.LabelNode labelNode = null;
        org.objectweb.asm.tree.analysis.Subroutine subroutine = new org.objectweb.asm.tree.analysis.Subroutine(null, methodNode.maxLocals, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        findSubroutine(0, subroutine, arrayList2);
        java.util.HashMap map = new java.util.HashMap();
        while (!arrayList2.isEmpty()) {
            org.objectweb.asm.tree.JumpInsnNode jumpInsnNode = (org.objectweb.asm.tree.JumpInsnNode) arrayList2.remove(0);
            org.objectweb.asm.tree.analysis.Subroutine subroutine2 = (org.objectweb.asm.tree.analysis.Subroutine) map.get(jumpInsnNode.label);
            if (subroutine2 == null) {
                org.objectweb.asm.tree.analysis.Subroutine subroutine3 = new org.objectweb.asm.tree.analysis.Subroutine(jumpInsnNode.label, methodNode.maxLocals, jumpInsnNode);
                map.put(jumpInsnNode.label, subroutine3);
                findSubroutine(this.insnList.indexOf(jumpInsnNode.label), subroutine3, arrayList2);
            } else {
                subroutine2.callers.add(jumpInsnNode);
            }
        }
        for (int i2 = 0; i2 < this.insnListSize; i2++) {
            org.objectweb.asm.tree.analysis.Subroutine subroutine4 = this.subroutines[i2];
            if (subroutine4 != null && subroutine4.start == null) {
                this.subroutines[i2] = null;
            }
        }
        org.objectweb.asm.tree.analysis.Frame frameComputeInitialFrame = computeInitialFrame(str, methodNode);
        merge(0, frameComputeInitialFrame, null);
        init(str, methodNode);
        while (true) {
            int i3 = this.numInstructionsToProcess;
            if (i3 > 0) {
                int[] iArr = this.instructionsToProcess;
                int i4 = i3 - 1;
                this.numInstructionsToProcess = i4;
                int i5 = iArr[i4];
                org.objectweb.asm.tree.analysis.Frame<V> frame = this.frames[i5];
                org.objectweb.asm.tree.analysis.Subroutine subroutine5 = this.subroutines[i5];
                this.inInstructionsToProcess[i5] = z;
                try {
                    try {
                        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = methodNode.instructions.get(i5);
                        try {
                            int opcode = abstractInsnNode2.getOpcode();
                            int type = abstractInsnNode2.getType();
                            if (type == 8 || type == 15 || type == 14) {
                                int i6 = i5 + 1;
                                merge(i6, frame, subroutine5);
                                newControlFlowEdge(i5, i6);
                                r1 = subroutine5;
                            } else {
                                frameComputeInitialFrame.init(frame).execute(abstractInsnNode2, this.interpreter);
                                ?? subroutine6 = subroutine5 == null ? labelNode : new org.objectweb.asm.tree.analysis.Subroutine(subroutine5);
                                if (abstractInsnNode2 instanceof org.objectweb.asm.tree.JumpInsnNode) {
                                    org.objectweb.asm.tree.JumpInsnNode jumpInsnNode2 = (org.objectweb.asm.tree.JumpInsnNode) abstractInsnNode2;
                                    if (opcode != 167 && opcode != 168) {
                                        frameComputeInitialFrame.initJumpTarget(opcode, labelNode);
                                        int i7 = i5 + 1;
                                        merge(i7, frameComputeInitialFrame, subroutine6);
                                        newControlFlowEdge(i5, i7);
                                    }
                                    int iIndexOf3 = this.insnList.indexOf(jumpInsnNode2.label);
                                    frameComputeInitialFrame.initJumpTarget(opcode, jumpInsnNode2.label);
                                    if (opcode == 168) {
                                        merge(iIndexOf3, frameComputeInitialFrame, new org.objectweb.asm.tree.analysis.Subroutine(jumpInsnNode2.label, methodNode.maxLocals, jumpInsnNode2));
                                    } else {
                                        merge(iIndexOf3, frameComputeInitialFrame, subroutine6);
                                    }
                                    newControlFlowEdge(i5, iIndexOf3);
                                } else if (abstractInsnNode2 instanceof org.objectweb.asm.tree.LookupSwitchInsnNode) {
                                    org.objectweb.asm.tree.LookupSwitchInsnNode lookupSwitchInsnNode = (org.objectweb.asm.tree.LookupSwitchInsnNode) abstractInsnNode2;
                                    int iIndexOf4 = this.insnList.indexOf(lookupSwitchInsnNode.dflt);
                                    frameComputeInitialFrame.initJumpTarget(opcode, lookupSwitchInsnNode.dflt);
                                    merge(iIndexOf4, frameComputeInitialFrame, subroutine6);
                                    newControlFlowEdge(i5, iIndexOf4);
                                    for (?? r3 = z; r3 < lookupSwitchInsnNode.labels.size(); r3++) {
                                        org.objectweb.asm.tree.LabelNode labelNode2 = lookupSwitchInsnNode.labels.get(r3);
                                        int iIndexOf5 = this.insnList.indexOf(labelNode2);
                                        frameComputeInitialFrame.initJumpTarget(opcode, labelNode2);
                                        merge(iIndexOf5, frameComputeInitialFrame, subroutine6);
                                        newControlFlowEdge(i5, iIndexOf5);
                                    }
                                } else if (abstractInsnNode2 instanceof org.objectweb.asm.tree.TableSwitchInsnNode) {
                                    org.objectweb.asm.tree.TableSwitchInsnNode tableSwitchInsnNode = (org.objectweb.asm.tree.TableSwitchInsnNode) abstractInsnNode2;
                                    int iIndexOf6 = this.insnList.indexOf(tableSwitchInsnNode.dflt);
                                    frameComputeInitialFrame.initJumpTarget(opcode, tableSwitchInsnNode.dflt);
                                    merge(iIndexOf6, frameComputeInitialFrame, subroutine6);
                                    newControlFlowEdge(i5, iIndexOf6);
                                    for (?? r4 = z; r4 < tableSwitchInsnNode.labels.size(); r4++) {
                                        org.objectweb.asm.tree.LabelNode labelNode3 = tableSwitchInsnNode.labels.get(r4);
                                        frameComputeInitialFrame.initJumpTarget(opcode, labelNode3);
                                        int iIndexOf7 = this.insnList.indexOf(labelNode3);
                                        merge(iIndexOf7, frameComputeInitialFrame, subroutine6);
                                        newControlFlowEdge(i5, iIndexOf7);
                                    }
                                } else {
                                    if (opcode != 169) {
                                        r11 = subroutine6;
                                        if (opcode != 191 && (opcode < 172 || opcode > 177)) {
                                            if (r11 != 0) {
                                                if (abstractInsnNode2 instanceof org.objectweb.asm.tree.VarInsnNode) {
                                                    int i8 = ((org.objectweb.asm.tree.VarInsnNode) abstractInsnNode2).var;
                                                    r11.localsUsed[i8] = true;
                                                    if (opcode == 22 || opcode == 24 || opcode == 55 || opcode == 57) {
                                                        r11.localsUsed[i8 + 1] = true;
                                                    }
                                                } else if (abstractInsnNode2 instanceof org.objectweb.asm.tree.IincInsnNode) {
                                                    r11.localsUsed[((org.objectweb.asm.tree.IincInsnNode) abstractInsnNode2).var] = true;
                                                }
                                            }
                                            int i9 = i5 + 1;
                                            merge(i9, frameComputeInitialFrame, r11);
                                            newControlFlowEdge(i5, i9);
                                            r12 = r11;
                                        }
                                    } else {
                                        if (subroutine6 == 0) {
                                            throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode2, "RET instruction outside of a subroutine");
                                        }
                                        subroutine6 = subroutine6;
                                        for (?? r5 = z; r5 < subroutine6.callers.size(); r5++) {
                                            int iIndexOf8 = this.insnList.indexOf(subroutine6.callers.get(r5));
                                            org.objectweb.asm.tree.analysis.Frame<V> frame2 = this.frames[iIndexOf8];
                                            if (frame2 != null) {
                                                int i10 = iIndexOf8 + 1;
                                                merge(i10, frame2, frameComputeInitialFrame, this.subroutines[iIndexOf8], subroutine6.localsUsed);
                                                newControlFlowEdge(i5, i10);
                                            }
                                            subroutine6 = subroutine6;
                                        }
                                    }
                                    r12 = r11;
                                    r12 = r11;
                                    r12 = r11;
                                    r1 = r12;
                                }
                                r12 = subroutine6;
                                r12 = r11;
                                r12 = r11;
                                r12 = r11;
                                r1 = r12;
                            }
                            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> list = this.handlers[i5];
                            if (list != null) {
                                for (org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode2 : list) {
                                    if (tryCatchBlockNode2.type == null) {
                                        objectType = org.objectweb.asm.Type.getObjectType("java/lang/Throwable");
                                    } else {
                                        objectType = org.objectweb.asm.Type.getObjectType(tryCatchBlockNode2.type);
                                    }
                                    if (newControlFlowExceptionEdge(i5, tryCatchBlockNode2)) {
                                        org.objectweb.asm.tree.analysis.Frame<V> frameNewFrame = newFrame(frame);
                                        frameNewFrame.clearStack();
                                        frameNewFrame.push(this.interpreter.newExceptionValue(tryCatchBlockNode2, frameNewFrame, objectType));
                                        merge(this.insnList.indexOf(tryCatchBlockNode2.handler), frameNewFrame, r1);
                                    }
                                }
                            }
                            z = false;
                            labelNode = null;
                        } catch (java.lang.RuntimeException e) {
                            e = e;
                            abstractInsnNode = abstractInsnNode2;
                            throw new org.objectweb.asm.tree.analysis.AnalyzerException(abstractInsnNode, "Error at instruction " + i5 + ": " + e.getMessage(), e);
                        }
                    } catch (org.objectweb.asm.tree.analysis.AnalyzerException e2) {
                        throw new org.objectweb.asm.tree.analysis.AnalyzerException(e2.node, "Error at instruction " + i5 + ": " + e2.getMessage(), e2);
                    }
                } catch (java.lang.RuntimeException e3) {
                    e = e3;
                    abstractInsnNode = null;
                }
            } else {
                return this.frames;
            }
        }
    }

    public org.objectweb.asm.tree.analysis.Frame<V>[] analyzeAndComputeMaxs(java.lang.String str, org.objectweb.asm.tree.MethodNode methodNode) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        methodNode.maxLocals = computeMaxLocals(methodNode);
        methodNode.maxStack = -1;
        analyze(str, methodNode);
        methodNode.maxStack = computeMaxStack(this.frames);
        return this.frames;
    }

    private static int computeMaxLocals(org.objectweb.asm.tree.MethodNode methodNode) {
        int argumentsAndReturnSizes = org.objectweb.asm.Type.getArgumentsAndReturnSizes(methodNode.desc) >> 2;
        java.util.Iterator<org.objectweb.asm.tree.AbstractInsnNode> it = methodNode.instructions.iterator();
        while (it.hasNext()) {
            org.objectweb.asm.tree.AbstractInsnNode next = it.next();
            if (next instanceof org.objectweb.asm.tree.VarInsnNode) {
                argumentsAndReturnSizes = java.lang.Math.max(argumentsAndReturnSizes, ((org.objectweb.asm.tree.VarInsnNode) next).var + ((next.getOpcode() == 22 || next.getOpcode() == 24 || next.getOpcode() == 55 || next.getOpcode() == 57) ? 2 : 1));
            } else if (next instanceof org.objectweb.asm.tree.IincInsnNode) {
                argumentsAndReturnSizes = java.lang.Math.max(argumentsAndReturnSizes, ((org.objectweb.asm.tree.IincInsnNode) next).var + 1);
            }
        }
        return argumentsAndReturnSizes;
    }

    private static int computeMaxStack(org.objectweb.asm.tree.analysis.Frame<?>[] frameArr) {
        int iMax = 0;
        for (org.objectweb.asm.tree.analysis.Frame<?> frame : frameArr) {
            if (frame != null) {
                int size = 0;
                for (int i = 0; i < frame.getStackSize(); i++) {
                    size += frame.getStack(i).getSize();
                }
                iMax = java.lang.Math.max(iMax, size);
            }
        }
        return iMax;
    }

    private void findSubroutine(int i, org.objectweb.asm.tree.analysis.Subroutine subroutine, java.util.List<org.objectweb.asm.tree.AbstractInsnNode> list) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Integer.valueOf(i));
        while (!arrayList.isEmpty()) {
            int iIntValue = ((java.lang.Integer) arrayList.remove(arrayList.size() - 1)).intValue();
            if (iIntValue < 0 || iIntValue >= this.insnListSize) {
                throw new org.objectweb.asm.tree.analysis.AnalyzerException(null, "Execution can fall off the end of the code");
            }
            org.objectweb.asm.tree.analysis.Subroutine[] subroutineArr = this.subroutines;
            if (subroutineArr[iIntValue] == null) {
                subroutineArr[iIntValue] = new org.objectweb.asm.tree.analysis.Subroutine(subroutine);
                org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.insnList.get(iIntValue);
                if (abstractInsnNode instanceof org.objectweb.asm.tree.JumpInsnNode) {
                    if (abstractInsnNode.getOpcode() == 168) {
                        list.add(abstractInsnNode);
                    } else {
                        arrayList.add(java.lang.Integer.valueOf(this.insnList.indexOf(((org.objectweb.asm.tree.JumpInsnNode) abstractInsnNode).label)));
                    }
                } else if (abstractInsnNode instanceof org.objectweb.asm.tree.TableSwitchInsnNode) {
                    org.objectweb.asm.tree.TableSwitchInsnNode tableSwitchInsnNode = (org.objectweb.asm.tree.TableSwitchInsnNode) abstractInsnNode;
                    findSubroutine(this.insnList.indexOf(tableSwitchInsnNode.dflt), subroutine, list);
                    for (int size = tableSwitchInsnNode.labels.size() - 1; size >= 0; size--) {
                        arrayList.add(java.lang.Integer.valueOf(this.insnList.indexOf(tableSwitchInsnNode.labels.get(size))));
                    }
                } else if (abstractInsnNode instanceof org.objectweb.asm.tree.LookupSwitchInsnNode) {
                    org.objectweb.asm.tree.LookupSwitchInsnNode lookupSwitchInsnNode = (org.objectweb.asm.tree.LookupSwitchInsnNode) abstractInsnNode;
                    findSubroutine(this.insnList.indexOf(lookupSwitchInsnNode.dflt), subroutine, list);
                    for (int size2 = lookupSwitchInsnNode.labels.size() - 1; size2 >= 0; size2--) {
                        arrayList.add(java.lang.Integer.valueOf(this.insnList.indexOf(lookupSwitchInsnNode.labels.get(size2))));
                    }
                }
                java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> list2 = this.handlers[iIntValue];
                if (list2 != null) {
                    java.util.Iterator<org.objectweb.asm.tree.TryCatchBlockNode> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.Integer.valueOf(this.insnList.indexOf(it.next().handler)));
                    }
                }
                int opcode = abstractInsnNode.getOpcode();
                if (opcode != 167 && opcode != 191) {
                    switch (opcode) {
                        case org.objectweb.asm.Opcodes.RET /* 169 */:
                        case org.objectweb.asm.Opcodes.TABLESWITCH /* 170 */:
                        case org.objectweb.asm.Opcodes.LOOKUPSWITCH /* 171 */:
                        case 172:
                        case org.objectweb.asm.Opcodes.LRETURN /* 173 */:
                        case org.objectweb.asm.Opcodes.FRETURN /* 174 */:
                        case org.objectweb.asm.Opcodes.DRETURN /* 175 */:
                        case org.objectweb.asm.Opcodes.ARETURN /* 176 */:
                        case org.objectweb.asm.Opcodes.RETURN /* 177 */:
                            break;
                        default:
                            arrayList.add(java.lang.Integer.valueOf(iIntValue + 1));
                            break;
                    }
                }
            }
        }
    }

    private org.objectweb.asm.tree.analysis.Frame<V> computeInitialFrame(java.lang.String str, org.objectweb.asm.tree.MethodNode methodNode) {
        org.objectweb.asm.tree.analysis.Frame<V> frameNewFrame = newFrame(methodNode.maxLocals, methodNode.maxStack);
        int i = 1;
        boolean z = (methodNode.access & 8) == 0;
        if (z) {
            frameNewFrame.setLocal(0, this.interpreter.newParameterValue(z, 0, org.objectweb.asm.Type.getObjectType(str)));
        } else {
            i = 0;
        }
        for (org.objectweb.asm.Type type : org.objectweb.asm.Type.getArgumentTypes(methodNode.desc)) {
            frameNewFrame.setLocal(i, this.interpreter.newParameterValue(z, i, type));
            i++;
            if (type.getSize() == 2) {
                frameNewFrame.setLocal(i, this.interpreter.newEmptyValue(i));
                i++;
            }
        }
        while (i < methodNode.maxLocals) {
            frameNewFrame.setLocal(i, this.interpreter.newEmptyValue(i));
            i++;
        }
        frameNewFrame.setReturn(this.interpreter.newReturnTypeValue(org.objectweb.asm.Type.getReturnType(methodNode.desc)));
        return frameNewFrame;
    }

    public org.objectweb.asm.tree.analysis.Frame<V>[] getFrames() {
        return this.frames;
    }

    public java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> getHandlers(int i) {
        return this.handlers[i];
    }

    protected org.objectweb.asm.tree.analysis.Frame<V> newFrame(int i, int i2) {
        return new org.objectweb.asm.tree.analysis.Frame<>(i, i2);
    }

    protected org.objectweb.asm.tree.analysis.Frame<V> newFrame(org.objectweb.asm.tree.analysis.Frame<? extends V> frame) {
        return new org.objectweb.asm.tree.analysis.Frame<>(frame);
    }

    protected boolean newControlFlowExceptionEdge(int i, org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode) {
        return newControlFlowExceptionEdge(i, this.insnList.indexOf(tryCatchBlockNode.handler));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void merge(int i, org.objectweb.asm.tree.analysis.Frame<V> frame, org.objectweb.asm.tree.analysis.Subroutine subroutine) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        boolean zMerge;
        org.objectweb.asm.tree.analysis.Frame<V>[] frameArr = this.frames;
        org.objectweb.asm.tree.analysis.Frame<V> frame2 = frameArr[i];
        if (frame2 == null) {
            frameArr[i] = newFrame(frame);
            zMerge = true;
        } else {
            zMerge = frame2.merge(frame, this.interpreter);
        }
        org.objectweb.asm.tree.analysis.Subroutine[] subroutineArr = this.subroutines;
        org.objectweb.asm.tree.analysis.Subroutine subroutine2 = subroutineArr[i];
        if (subroutine2 == null) {
            if (subroutine != null) {
                subroutineArr[i] = new org.objectweb.asm.tree.analysis.Subroutine(subroutine);
                zMerge = true;
            }
        } else if (subroutine != null) {
            zMerge |= subroutine2.merge(subroutine);
        }
        if (zMerge) {
            boolean[] zArr = this.inInstructionsToProcess;
            if (zArr[i]) {
                return;
            }
            zArr[i] = true;
            int[] iArr = this.instructionsToProcess;
            int i2 = this.numInstructionsToProcess;
            this.numInstructionsToProcess = i2 + 1;
            iArr[i2] = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void merge(int i, org.objectweb.asm.tree.analysis.Frame<V> frame, org.objectweb.asm.tree.analysis.Frame<V> frame2, org.objectweb.asm.tree.analysis.Subroutine subroutine, boolean[] zArr) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        boolean zMerge;
        frame2.merge(frame, zArr);
        org.objectweb.asm.tree.analysis.Frame<V>[] frameArr = this.frames;
        org.objectweb.asm.tree.analysis.Frame<V> frame3 = frameArr[i];
        if (frame3 == null) {
            frameArr[i] = newFrame(frame2);
            zMerge = true;
        } else {
            zMerge = frame3.merge(frame2, this.interpreter);
        }
        org.objectweb.asm.tree.analysis.Subroutine subroutine2 = this.subroutines[i];
        if (subroutine2 != null && subroutine != null) {
            zMerge |= subroutine2.merge(subroutine);
        }
        if (zMerge) {
            boolean[] zArr2 = this.inInstructionsToProcess;
            if (zArr2[i]) {
                return;
            }
            zArr2[i] = true;
            int[] iArr = this.instructionsToProcess;
            int i2 = this.numInstructionsToProcess;
            this.numInstructionsToProcess = i2 + 1;
            iArr[i2] = i;
        }
    }
}
