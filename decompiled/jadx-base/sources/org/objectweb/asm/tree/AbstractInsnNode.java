package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractInsnNode {
    public static final int FIELD_INSN = 4;
    public static final int FRAME = 14;
    public static final int IINC_INSN = 10;
    public static final int INSN = 0;
    public static final int INT_INSN = 1;
    public static final int INVOKE_DYNAMIC_INSN = 6;
    public static final int JUMP_INSN = 7;
    public static final int LABEL = 8;
    public static final int LDC_INSN = 9;
    public static final int LINE = 15;
    public static final int LOOKUPSWITCH_INSN = 12;
    public static final int METHOD_INSN = 5;
    public static final int MULTIANEWARRAY_INSN = 13;
    public static final int TABLESWITCH_INSN = 11;
    public static final int TYPE_INSN = 3;
    public static final int VAR_INSN = 2;
    int index = -1;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> invisibleTypeAnnotations;
    org.objectweb.asm.tree.AbstractInsnNode nextInsn;
    protected int opcode;
    org.objectweb.asm.tree.AbstractInsnNode previousInsn;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> visibleTypeAnnotations;

    public abstract void accept(org.objectweb.asm.MethodVisitor methodVisitor);

    public abstract org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map);

    public abstract int getType();

    protected AbstractInsnNode(int i) {
        this.opcode = i;
    }

    public int getOpcode() {
        return this.opcode;
    }

    public org.objectweb.asm.tree.AbstractInsnNode getPrevious() {
        return this.previousInsn;
    }

    public org.objectweb.asm.tree.AbstractInsnNode getNext() {
        return this.nextInsn;
    }

    protected final void acceptAnnotations(org.objectweb.asm.MethodVisitor methodVisitor) {
        java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list = this.visibleTypeAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i);
                typeAnnotationNode.accept(methodVisitor.visitInsnAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list2 = this.invisibleTypeAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i2);
                typeAnnotationNode2.accept(methodVisitor.visitInsnAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
    }

    static org.objectweb.asm.tree.LabelNode clone(org.objectweb.asm.tree.LabelNode labelNode, java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        return map.get(labelNode);
    }

    static org.objectweb.asm.tree.LabelNode[] clone(java.util.List<org.objectweb.asm.tree.LabelNode> list, java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> map) {
        int size = list.size();
        org.objectweb.asm.tree.LabelNode[] labelNodeArr = new org.objectweb.asm.tree.LabelNode[size];
        for (int i = 0; i < size; i++) {
            labelNodeArr[i] = map.get(list.get(i));
        }
        return labelNodeArr;
    }

    protected final org.objectweb.asm.tree.AbstractInsnNode cloneAnnotations(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
        if (abstractInsnNode.visibleTypeAnnotations != null) {
            this.visibleTypeAnnotations = new java.util.ArrayList();
            int size = abstractInsnNode.visibleTypeAnnotations.size();
            for (int i = 0; i < size; i++) {
                org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode = abstractInsnNode.visibleTypeAnnotations.get(i);
                org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode2 = new org.objectweb.asm.tree.TypeAnnotationNode(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc);
                typeAnnotationNode.accept(typeAnnotationNode2);
                this.visibleTypeAnnotations.add(typeAnnotationNode2);
            }
        }
        if (abstractInsnNode.invisibleTypeAnnotations != null) {
            this.invisibleTypeAnnotations = new java.util.ArrayList();
            int size2 = abstractInsnNode.invisibleTypeAnnotations.size();
            for (int i2 = 0; i2 < size2; i2++) {
                org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode3 = abstractInsnNode.invisibleTypeAnnotations.get(i2);
                org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode4 = new org.objectweb.asm.tree.TypeAnnotationNode(typeAnnotationNode3.typeRef, typeAnnotationNode3.typePath, typeAnnotationNode3.desc);
                typeAnnotationNode3.accept(typeAnnotationNode4);
                this.invisibleTypeAnnotations.add(typeAnnotationNode4);
            }
        }
        return this;
    }
}
