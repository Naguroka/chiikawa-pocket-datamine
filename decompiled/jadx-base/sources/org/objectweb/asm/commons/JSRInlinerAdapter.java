package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class JSRInlinerAdapter extends org.objectweb.asm.tree.MethodNode implements org.objectweb.asm.Opcodes {
    private final java.util.BitSet mainSubroutineInsns;
    final java.util.BitSet sharedSubroutineInsns;
    private final java.util.Map<org.objectweb.asm.tree.LabelNode, java.util.BitSet> subroutinesInsns;

    public JSRInlinerAdapter(org.objectweb.asm.MethodVisitor methodVisitor, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        this(589824, methodVisitor, i, str, str2, str3, strArr);
        if (getClass() != org.objectweb.asm.commons.JSRInlinerAdapter.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    protected JSRInlinerAdapter(int i, org.objectweb.asm.MethodVisitor methodVisitor, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        super(i, i2, str, str2, str3, strArr);
        this.mainSubroutineInsns = new java.util.BitSet();
        this.subroutinesInsns = new java.util.HashMap();
        this.sharedSubroutineInsns = new java.util.BitSet();
        this.mv = methodVisitor;
    }

    @Override // org.objectweb.asm.tree.MethodNode, org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, org.objectweb.asm.Label label) {
        super.visitJumpInsn(i, label);
        org.objectweb.asm.tree.LabelNode labelNode = ((org.objectweb.asm.tree.JumpInsnNode) this.instructions.getLast()).label;
        if (i != 168 || this.subroutinesInsns.containsKey(labelNode)) {
            return;
        }
        this.subroutinesInsns.put(labelNode, new java.util.BitSet());
    }

    @Override // org.objectweb.asm.tree.MethodNode, org.objectweb.asm.MethodVisitor
    public void visitEnd() {
        if (!this.subroutinesInsns.isEmpty()) {
            findSubroutinesInsns();
            emitCode();
        }
        if (this.mv != null) {
            accept(this.mv);
        }
    }

    private void findSubroutinesInsns() {
        java.util.BitSet bitSet = new java.util.BitSet();
        findSubroutineInsns(0, this.mainSubroutineInsns, bitSet);
        for (java.util.Map.Entry<org.objectweb.asm.tree.LabelNode, java.util.BitSet> entry : this.subroutinesInsns.entrySet()) {
            org.objectweb.asm.tree.LabelNode key = entry.getKey();
            findSubroutineInsns(this.instructions.indexOf(key), entry.getValue(), bitSet);
        }
    }

    private void findSubroutineInsns(int i, java.util.BitSet bitSet, java.util.BitSet bitSet2) {
        boolean z;
        findReachableInsns(i, bitSet, bitSet2);
        do {
            z = false;
            for (org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode : this.tryCatchBlocks) {
                int iIndexOf = this.instructions.indexOf(tryCatchBlockNode.handler);
                if (!bitSet.get(iIndexOf)) {
                    int iIndexOf2 = this.instructions.indexOf(tryCatchBlockNode.start);
                    int iIndexOf3 = this.instructions.indexOf(tryCatchBlockNode.end);
                    int iNextSetBit = bitSet.nextSetBit(iIndexOf2);
                    if (iNextSetBit >= iIndexOf2 && iNextSetBit < iIndexOf3) {
                        findReachableInsns(iIndexOf, bitSet, bitSet2);
                        z = true;
                    }
                }
            }
        } while (z);
    }

    private void findReachableInsns(int i, java.util.BitSet bitSet, java.util.BitSet bitSet2) {
        while (i < this.instructions.size() && !bitSet.get(i)) {
            bitSet.set(i);
            if (bitSet2.get(i)) {
                this.sharedSubroutineInsns.set(i);
            }
            bitSet2.set(i);
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.instructions.get(i);
            if (abstractInsnNode.getType() == 7 && abstractInsnNode.getOpcode() != 168) {
                findReachableInsns(this.instructions.indexOf(((org.objectweb.asm.tree.JumpInsnNode) abstractInsnNode).label), bitSet, bitSet2);
            } else if (abstractInsnNode.getType() == 11) {
                org.objectweb.asm.tree.TableSwitchInsnNode tableSwitchInsnNode = (org.objectweb.asm.tree.TableSwitchInsnNode) abstractInsnNode;
                findReachableInsns(this.instructions.indexOf(tableSwitchInsnNode.dflt), bitSet, bitSet2);
                java.util.Iterator<org.objectweb.asm.tree.LabelNode> it = tableSwitchInsnNode.labels.iterator();
                while (it.hasNext()) {
                    findReachableInsns(this.instructions.indexOf(it.next()), bitSet, bitSet2);
                }
            } else if (abstractInsnNode.getType() == 12) {
                org.objectweb.asm.tree.LookupSwitchInsnNode lookupSwitchInsnNode = (org.objectweb.asm.tree.LookupSwitchInsnNode) abstractInsnNode;
                findReachableInsns(this.instructions.indexOf(lookupSwitchInsnNode.dflt), bitSet, bitSet2);
                java.util.Iterator<org.objectweb.asm.tree.LabelNode> it2 = lookupSwitchInsnNode.labels.iterator();
                while (it2.hasNext()) {
                    findReachableInsns(this.instructions.indexOf(it2.next()), bitSet, bitSet2);
                }
            }
            int opcode = this.instructions.get(i).getOpcode();
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
                        return;
                    default:
                        i++;
                        break;
                }
            } else {
                return;
            }
        }
    }

    private void emitCode() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation(null, this.mainSubroutineInsns));
        org.objectweb.asm.tree.InsnList insnList = new org.objectweb.asm.tree.InsnList();
        java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> arrayList = new java.util.ArrayList<>();
        java.util.List<org.objectweb.asm.tree.LocalVariableNode> arrayList2 = new java.util.ArrayList<>();
        while (!linkedList.isEmpty()) {
            emitInstantiation((org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation) linkedList.removeFirst(), linkedList, insnList, arrayList, arrayList2);
        }
        this.instructions = insnList;
        this.tryCatchBlocks = arrayList;
        this.localVariables = arrayList2;
    }

    private void emitInstantiation(org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation instantiation, java.util.List<org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation> list, org.objectweb.asm.tree.InsnList insnList, java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> list2, java.util.List<org.objectweb.asm.tree.LocalVariableNode> list3) {
        org.objectweb.asm.tree.LabelNode labelNode = null;
        for (int i = 0; i < this.instructions.size(); i++) {
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.instructions.get(i);
            if (abstractInsnNode.getType() == 8) {
                org.objectweb.asm.tree.LabelNode clonedLabel = instantiation.getClonedLabel((org.objectweb.asm.tree.LabelNode) abstractInsnNode);
                if (clonedLabel != labelNode) {
                    insnList.add(clonedLabel);
                    labelNode = clonedLabel;
                }
            } else if (instantiation.findOwner(i) != instantiation) {
                continue;
            } else if (abstractInsnNode.getOpcode() == 169) {
                org.objectweb.asm.tree.LabelNode labelNode2 = null;
                for (org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation instantiation2 = instantiation; instantiation2 != null; instantiation2 = instantiation2.parent) {
                    if (instantiation2.subroutineInsns.get(i)) {
                        labelNode2 = instantiation2.returnLabel;
                    }
                }
                if (labelNode2 == null) {
                    throw new java.lang.IllegalArgumentException("Instruction #" + i + " is a RET not owned by any subroutine");
                }
                insnList.add(new org.objectweb.asm.tree.JumpInsnNode(org.objectweb.asm.Opcodes.GOTO, labelNode2));
            } else if (abstractInsnNode.getOpcode() == 168) {
                org.objectweb.asm.tree.LabelNode labelNode3 = ((org.objectweb.asm.tree.JumpInsnNode) abstractInsnNode).label;
                org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation instantiation3 = new org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation(instantiation, this.subroutinesInsns.get(labelNode3));
                org.objectweb.asm.tree.LabelNode clonedLabelForJumpInsn = instantiation3.getClonedLabelForJumpInsn(labelNode3);
                insnList.add(new org.objectweb.asm.tree.InsnNode(1));
                insnList.add(new org.objectweb.asm.tree.JumpInsnNode(org.objectweb.asm.Opcodes.GOTO, clonedLabelForJumpInsn));
                insnList.add(instantiation3.returnLabel);
                list.add(instantiation3);
            } else {
                insnList.add(abstractInsnNode.clone(instantiation));
            }
        }
        for (org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode : this.tryCatchBlocks) {
            org.objectweb.asm.tree.LabelNode clonedLabel2 = instantiation.getClonedLabel(tryCatchBlockNode.start);
            org.objectweb.asm.tree.LabelNode clonedLabel3 = instantiation.getClonedLabel(tryCatchBlockNode.end);
            if (clonedLabel2 != clonedLabel3) {
                org.objectweb.asm.tree.LabelNode clonedLabelForJumpInsn2 = instantiation.getClonedLabelForJumpInsn(tryCatchBlockNode.handler);
                if (clonedLabel2 == null || clonedLabel3 == null || clonedLabelForJumpInsn2 == null) {
                    throw new java.lang.AssertionError("Internal error!");
                }
                list2.add(new org.objectweb.asm.tree.TryCatchBlockNode(clonedLabel2, clonedLabel3, clonedLabelForJumpInsn2, tryCatchBlockNode.type));
            }
        }
        for (org.objectweb.asm.tree.LocalVariableNode localVariableNode : this.localVariables) {
            org.objectweb.asm.tree.LabelNode clonedLabel4 = instantiation.getClonedLabel(localVariableNode.start);
            org.objectweb.asm.tree.LabelNode clonedLabel5 = instantiation.getClonedLabel(localVariableNode.end);
            if (clonedLabel4 != clonedLabel5) {
                list3.add(new org.objectweb.asm.tree.LocalVariableNode(localVariableNode.name, localVariableNode.desc, localVariableNode.signature, clonedLabel4, clonedLabel5, localVariableNode.index));
            }
        }
    }

    private class Instantiation extends java.util.AbstractMap<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> {
        final java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> clonedLabels;
        final org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation parent;
        final org.objectweb.asm.tree.LabelNode returnLabel;
        final java.util.BitSet subroutineInsns;

        Instantiation(org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation instantiation, java.util.BitSet bitSet) {
            for (org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation instantiation2 = instantiation; instantiation2 != null; instantiation2 = instantiation2.parent) {
                if (instantiation2.subroutineInsns == bitSet) {
                    throw new java.lang.IllegalArgumentException("Recursive invocation of " + bitSet);
                }
            }
            this.parent = instantiation;
            this.subroutineInsns = bitSet;
            this.returnLabel = instantiation == null ? null : new org.objectweb.asm.tree.LabelNode();
            this.clonedLabels = new java.util.HashMap();
            org.objectweb.asm.tree.LabelNode labelNode = null;
            for (int i = 0; i < org.objectweb.asm.commons.JSRInlinerAdapter.this.instructions.size(); i++) {
                org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = org.objectweb.asm.commons.JSRInlinerAdapter.this.instructions.get(i);
                if (abstractInsnNode.getType() == 8) {
                    org.objectweb.asm.tree.LabelNode labelNode2 = (org.objectweb.asm.tree.LabelNode) abstractInsnNode;
                    labelNode = labelNode == null ? new org.objectweb.asm.tree.LabelNode() : labelNode;
                    this.clonedLabels.put(labelNode2, labelNode);
                } else if (findOwner(i) == this) {
                    labelNode = null;
                }
            }
        }

        org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation findOwner(int i) {
            if (!this.subroutineInsns.get(i)) {
                return null;
            }
            if (!org.objectweb.asm.commons.JSRInlinerAdapter.this.sharedSubroutineInsns.get(i)) {
                return this;
            }
            org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation instantiation = this;
            for (org.objectweb.asm.commons.JSRInlinerAdapter.Instantiation instantiation2 = this.parent; instantiation2 != null; instantiation2 = instantiation2.parent) {
                if (instantiation2.subroutineInsns.get(i)) {
                    instantiation = instantiation2;
                }
            }
            return instantiation;
        }

        org.objectweb.asm.tree.LabelNode getClonedLabelForJumpInsn(org.objectweb.asm.tree.LabelNode labelNode) {
            return findOwner(org.objectweb.asm.commons.JSRInlinerAdapter.this.instructions.indexOf(labelNode)).clonedLabels.get(labelNode);
        }

        org.objectweb.asm.tree.LabelNode getClonedLabel(org.objectweb.asm.tree.LabelNode labelNode) {
            return this.clonedLabels.get(labelNode);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode>> entrySet() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public org.objectweb.asm.tree.LabelNode get(java.lang.Object obj) {
            return getClonedLabelForJumpInsn((org.objectweb.asm.tree.LabelNode) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}
