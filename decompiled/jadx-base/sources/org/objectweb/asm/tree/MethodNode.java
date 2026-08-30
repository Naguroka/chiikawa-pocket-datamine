package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class MethodNode extends org.objectweb.asm.MethodVisitor {
    public int access;
    public java.lang.Object annotationDefault;
    public java.util.List<org.objectweb.asm.Attribute> attrs;
    public java.lang.String desc;
    public java.util.List<java.lang.String> exceptions;
    public org.objectweb.asm.tree.InsnList instructions;
    public int invisibleAnnotableParameterCount;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode> invisibleAnnotations;
    public java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> invisibleLocalVariableAnnotations;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode>[] invisibleParameterAnnotations;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> invisibleTypeAnnotations;
    public java.util.List<org.objectweb.asm.tree.LocalVariableNode> localVariables;
    public int maxLocals;
    public int maxStack;
    public java.lang.String name;
    public java.util.List<org.objectweb.asm.tree.ParameterNode> parameters;
    public java.lang.String signature;
    public java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> tryCatchBlocks;
    public int visibleAnnotableParameterCount;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode> visibleAnnotations;
    public java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> visibleLocalVariableAnnotations;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode>[] visibleParameterAnnotations;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> visibleTypeAnnotations;
    private boolean visited;

    @Override // org.objectweb.asm.MethodVisitor
    public void visitCode() {
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitEnd() {
    }

    public MethodNode() {
        this(589824);
        if (getClass() != org.objectweb.asm.tree.MethodNode.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    public MethodNode(int i) {
        super(i);
        this.instructions = new org.objectweb.asm.tree.InsnList();
    }

    public MethodNode(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        this(589824, i, str, str2, str3, strArr);
        if (getClass() != org.objectweb.asm.tree.MethodNode.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    public MethodNode(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        super(i);
        this.access = i2;
        this.name = str;
        this.desc = str2;
        this.signature = str3;
        this.exceptions = org.objectweb.asm.tree.Util.asArrayList(strArr);
        if ((i2 & 1024) == 0) {
            this.localVariables = new java.util.ArrayList(5);
        }
        this.tryCatchBlocks = new java.util.ArrayList();
        this.instructions = new org.objectweb.asm.tree.InsnList();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitParameter(java.lang.String str, int i) {
        if (this.parameters == null) {
            this.parameters = new java.util.ArrayList(5);
        }
        this.parameters.add(new org.objectweb.asm.tree.ParameterNode(str, i));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotationDefault() {
        return new org.objectweb.asm.tree.AnnotationNode(new java.util.ArrayList<java.lang.Object>(0) { // from class: org.objectweb.asm.tree.MethodNode.1
            @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public boolean add(java.lang.Object obj) {
                org.objectweb.asm.tree.MethodNode.this.annotationDefault = obj;
                return super.add(obj);
            }
        });
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, boolean z) {
        org.objectweb.asm.tree.AnnotationNode annotationNode = new org.objectweb.asm.tree.AnnotationNode(str);
        if (z) {
            this.visibleAnnotations = org.objectweb.asm.tree.Util.add(this.visibleAnnotations, annotationNode);
        } else {
            this.invisibleAnnotations = org.objectweb.asm.tree.Util.add(this.invisibleAnnotations, annotationNode);
        }
        return annotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode = new org.objectweb.asm.tree.TypeAnnotationNode(i, typePath, str);
        if (z) {
            this.visibleTypeAnnotations = org.objectweb.asm.tree.Util.add(this.visibleTypeAnnotations, typeAnnotationNode);
        } else {
            this.invisibleTypeAnnotations = org.objectweb.asm.tree.Util.add(this.invisibleTypeAnnotations, typeAnnotationNode);
        }
        return typeAnnotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitAnnotableParameterCount(int i, boolean z) {
        if (z) {
            this.visibleAnnotableParameterCount = i;
        } else {
            this.invisibleAnnotableParameterCount = i;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitParameterAnnotation(int i, java.lang.String str, boolean z) {
        org.objectweb.asm.tree.AnnotationNode annotationNode = new org.objectweb.asm.tree.AnnotationNode(str);
        if (z) {
            if (this.visibleParameterAnnotations == null) {
                this.visibleParameterAnnotations = new java.util.List[org.objectweb.asm.Type.getArgumentTypes(this.desc).length];
            }
            java.util.List<org.objectweb.asm.tree.AnnotationNode>[] listArr = this.visibleParameterAnnotations;
            listArr[i] = org.objectweb.asm.tree.Util.add(listArr[i], annotationNode);
        } else {
            if (this.invisibleParameterAnnotations == null) {
                this.invisibleParameterAnnotations = new java.util.List[org.objectweb.asm.Type.getArgumentTypes(this.desc).length];
            }
            java.util.List<org.objectweb.asm.tree.AnnotationNode>[] listArr2 = this.invisibleParameterAnnotations;
            listArr2[i] = org.objectweb.asm.tree.Util.add(listArr2[i], annotationNode);
        }
        return annotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitAttribute(org.objectweb.asm.Attribute attribute) {
        this.attrs = org.objectweb.asm.tree.Util.add(this.attrs, attribute);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i, int i2, java.lang.Object[] objArr, int i3, java.lang.Object[] objArr2) {
        this.instructions.add(new org.objectweb.asm.tree.FrameNode(i, i2, objArr == null ? null : getLabelNodes(objArr), i3, objArr2 == null ? null : getLabelNodes(objArr2)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        this.instructions.add(new org.objectweb.asm.tree.InsnNode(i));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        this.instructions.add(new org.objectweb.asm.tree.IntInsnNode(i, i2));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        this.instructions.add(new org.objectweb.asm.tree.VarInsnNode(i, i2));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, java.lang.String str) {
        this.instructions.add(new org.objectweb.asm.tree.TypeInsnNode(i, str));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.instructions.add(new org.objectweb.asm.tree.FieldInsnNode(i, str, str2, str3));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        if (this.api < 327680 && (i & 256) == 0) {
            super.visitMethodInsn(i, str, str2, str3, z);
        } else {
            this.instructions.add(new org.objectweb.asm.tree.MethodInsnNode(i & (-257), str, str2, str3, z));
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String str, java.lang.String str2, org.objectweb.asm.Handle handle, java.lang.Object... objArr) {
        this.instructions.add(new org.objectweb.asm.tree.InvokeDynamicInsnNode(str, str2, handle, objArr));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, org.objectweb.asm.Label label) {
        this.instructions.add(new org.objectweb.asm.tree.JumpInsnNode(i, getLabelNode(label)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(org.objectweb.asm.Label label) {
        this.instructions.add(getLabelNode(label));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object obj) {
        this.instructions.add(new org.objectweb.asm.tree.LdcInsnNode(obj));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        this.instructions.add(new org.objectweb.asm.tree.IincInsnNode(i, i2));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, org.objectweb.asm.Label label, org.objectweb.asm.Label... labelArr) {
        this.instructions.add(new org.objectweb.asm.tree.TableSwitchInsnNode(i, i2, getLabelNode(label), getLabelNodes(labelArr)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(org.objectweb.asm.Label label, int[] iArr, org.objectweb.asm.Label[] labelArr) {
        this.instructions.add(new org.objectweb.asm.tree.LookupSwitchInsnNode(getLabelNode(label), iArr, getLabelNodes(labelArr)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String str, int i) {
        this.instructions.add(new org.objectweb.asm.tree.MultiANewArrayInsnNode(str, i));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitInsnAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        org.objectweb.asm.tree.AbstractInsnNode last = this.instructions.getLast();
        while (last.getOpcode() == -1) {
            last = last.getPrevious();
        }
        org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode = new org.objectweb.asm.tree.TypeAnnotationNode(i, typePath, str);
        if (z) {
            last.visibleTypeAnnotations = org.objectweb.asm.tree.Util.add(last.visibleTypeAnnotations, typeAnnotationNode);
        } else {
            last.invisibleTypeAnnotations = org.objectweb.asm.tree.Util.add(last.invisibleTypeAnnotations, typeAnnotationNode);
        }
        return typeAnnotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(org.objectweb.asm.Label label, org.objectweb.asm.Label label2, org.objectweb.asm.Label label3, java.lang.String str) {
        this.tryCatchBlocks = org.objectweb.asm.tree.Util.add(this.tryCatchBlocks, new org.objectweb.asm.tree.TryCatchBlockNode(getLabelNode(label), getLabelNode(label2), getLabelNode(label3), str));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitTryCatchAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode = this.tryCatchBlocks.get((16776960 & i) >> 8);
        org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode = new org.objectweb.asm.tree.TypeAnnotationNode(i, typePath, str);
        if (z) {
            tryCatchBlockNode.visibleTypeAnnotations = org.objectweb.asm.tree.Util.add(tryCatchBlockNode.visibleTypeAnnotations, typeAnnotationNode);
        } else {
            tryCatchBlockNode.invisibleTypeAnnotations = org.objectweb.asm.tree.Util.add(tryCatchBlockNode.invisibleTypeAnnotations, typeAnnotationNode);
        }
        return typeAnnotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(java.lang.String str, java.lang.String str2, java.lang.String str3, org.objectweb.asm.Label label, org.objectweb.asm.Label label2, int i) {
        this.localVariables = org.objectweb.asm.tree.Util.add(this.localVariables, new org.objectweb.asm.tree.LocalVariableNode(str, str2, str3, getLabelNode(label), getLabelNode(label2), i));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitLocalVariableAnnotation(int i, org.objectweb.asm.TypePath typePath, org.objectweb.asm.Label[] labelArr, org.objectweb.asm.Label[] labelArr2, int[] iArr, java.lang.String str, boolean z) {
        org.objectweb.asm.tree.LocalVariableAnnotationNode localVariableAnnotationNode = new org.objectweb.asm.tree.LocalVariableAnnotationNode(i, typePath, getLabelNodes(labelArr), getLabelNodes(labelArr2), iArr, str);
        if (z) {
            this.visibleLocalVariableAnnotations = org.objectweb.asm.tree.Util.add(this.visibleLocalVariableAnnotations, localVariableAnnotationNode);
        } else {
            this.invisibleLocalVariableAnnotations = org.objectweb.asm.tree.Util.add(this.invisibleLocalVariableAnnotations, localVariableAnnotationNode);
        }
        return localVariableAnnotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int i, org.objectweb.asm.Label label) {
        this.instructions.add(new org.objectweb.asm.tree.LineNumberNode(i, getLabelNode(label)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i, int i2) {
        this.maxStack = i;
        this.maxLocals = i2;
    }

    protected org.objectweb.asm.tree.LabelNode getLabelNode(org.objectweb.asm.Label label) {
        if (!(label.info instanceof org.objectweb.asm.tree.LabelNode)) {
            label.info = new org.objectweb.asm.tree.LabelNode();
        }
        return (org.objectweb.asm.tree.LabelNode) label.info;
    }

    private org.objectweb.asm.tree.LabelNode[] getLabelNodes(org.objectweb.asm.Label[] labelArr) {
        org.objectweb.asm.tree.LabelNode[] labelNodeArr = new org.objectweb.asm.tree.LabelNode[labelArr.length];
        int length = labelArr.length;
        for (int i = 0; i < length; i++) {
            labelNodeArr[i] = getLabelNode(labelArr[i]);
        }
        return labelNodeArr;
    }

    private java.lang.Object[] getLabelNodes(java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            java.lang.Object labelNode = objArr[i];
            if (labelNode instanceof org.objectweb.asm.Label) {
                labelNode = getLabelNode((org.objectweb.asm.Label) labelNode);
            }
            objArr2[i] = labelNode;
        }
        return objArr2;
    }

    public void check(int i) {
        if (i == 262144) {
            java.util.List<org.objectweb.asm.tree.ParameterNode> list = this.parameters;
            if (list != null && !list.isEmpty()) {
                throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
            }
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list2 = this.visibleTypeAnnotations;
            if (list2 != null && !list2.isEmpty()) {
                throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
            }
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list3 = this.invisibleTypeAnnotations;
            if (list3 != null && !list3.isEmpty()) {
                throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
            }
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> list4 = this.tryCatchBlocks;
            if (list4 != null) {
                for (int size = list4.size() - 1; size >= 0; size--) {
                    org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode = this.tryCatchBlocks.get(size);
                    if (tryCatchBlockNode.visibleTypeAnnotations != null && !tryCatchBlockNode.visibleTypeAnnotations.isEmpty()) {
                        throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
                    }
                    if (tryCatchBlockNode.invisibleTypeAnnotations != null && !tryCatchBlockNode.invisibleTypeAnnotations.isEmpty()) {
                        throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
                    }
                }
            }
            for (int size2 = this.instructions.size() - 1; size2 >= 0; size2--) {
                org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.instructions.get(size2);
                if (abstractInsnNode.visibleTypeAnnotations != null && !abstractInsnNode.visibleTypeAnnotations.isEmpty()) {
                    throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
                }
                if (abstractInsnNode.invisibleTypeAnnotations != null && !abstractInsnNode.invisibleTypeAnnotations.isEmpty()) {
                    throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
                }
                if (abstractInsnNode instanceof org.objectweb.asm.tree.MethodInsnNode) {
                    if (((org.objectweb.asm.tree.MethodInsnNode) abstractInsnNode).itf != (abstractInsnNode.opcode == 185)) {
                        throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
                    }
                } else if (abstractInsnNode instanceof org.objectweb.asm.tree.LdcInsnNode) {
                    java.lang.Object obj = ((org.objectweb.asm.tree.LdcInsnNode) abstractInsnNode).cst;
                    if ((obj instanceof org.objectweb.asm.Handle) || ((obj instanceof org.objectweb.asm.Type) && ((org.objectweb.asm.Type) obj).getSort() == 11)) {
                        throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
                    }
                } else {
                    continue;
                }
            }
            java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> list5 = this.visibleLocalVariableAnnotations;
            if (list5 != null && !list5.isEmpty()) {
                throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
            }
            java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> list6 = this.invisibleLocalVariableAnnotations;
            if (list6 != null && !list6.isEmpty()) {
                throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
            }
        }
        if (i < 458752) {
            for (int size3 = this.instructions.size() - 1; size3 >= 0; size3--) {
                org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = this.instructions.get(size3);
                if ((abstractInsnNode2 instanceof org.objectweb.asm.tree.LdcInsnNode) && (((org.objectweb.asm.tree.LdcInsnNode) abstractInsnNode2).cst instanceof org.objectweb.asm.ConstantDynamic)) {
                    throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
                }
            }
        }
    }

    public void accept(org.objectweb.asm.ClassVisitor classVisitor) {
        java.util.List<java.lang.String> list = this.exceptions;
        org.objectweb.asm.MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(this.access, this.name, this.desc, this.signature, list == null ? null : (java.lang.String[]) list.toArray(new java.lang.String[0]));
        if (methodVisitorVisitMethod != null) {
            accept(methodVisitorVisitMethod);
        }
    }

    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        java.util.List<org.objectweb.asm.tree.ParameterNode> list = this.parameters;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.parameters.get(i).accept(methodVisitor);
            }
        }
        if (this.annotationDefault != null) {
            org.objectweb.asm.AnnotationVisitor annotationVisitorVisitAnnotationDefault = methodVisitor.visitAnnotationDefault();
            org.objectweb.asm.tree.AnnotationNode.accept(annotationVisitorVisitAnnotationDefault, null, this.annotationDefault);
            if (annotationVisitorVisitAnnotationDefault != null) {
                annotationVisitorVisitAnnotationDefault.visitEnd();
            }
        }
        java.util.List<org.objectweb.asm.tree.AnnotationNode> list2 = this.visibleAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                org.objectweb.asm.tree.AnnotationNode annotationNode = this.visibleAnnotations.get(i2);
                annotationNode.accept(methodVisitor.visitAnnotation(annotationNode.desc, true));
            }
        }
        java.util.List<org.objectweb.asm.tree.AnnotationNode> list3 = this.invisibleAnnotations;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                org.objectweb.asm.tree.AnnotationNode annotationNode2 = this.invisibleAnnotations.get(i3);
                annotationNode2.accept(methodVisitor.visitAnnotation(annotationNode2.desc, false));
            }
        }
        java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list4 = this.visibleTypeAnnotations;
        if (list4 != null) {
            int size4 = list4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i4);
                typeAnnotationNode.accept(methodVisitor.visitTypeAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list5 = this.invisibleTypeAnnotations;
        if (list5 != null) {
            int size5 = list5.size();
            for (int i5 = 0; i5 < size5; i5++) {
                org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i5);
                typeAnnotationNode2.accept(methodVisitor.visitTypeAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
        int i6 = this.visibleAnnotableParameterCount;
        if (i6 > 0) {
            methodVisitor.visitAnnotableParameterCount(i6, true);
        }
        java.util.List<org.objectweb.asm.tree.AnnotationNode>[] listArr = this.visibleParameterAnnotations;
        if (listArr != null) {
            int length = listArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                java.util.List<org.objectweb.asm.tree.AnnotationNode> list6 = this.visibleParameterAnnotations[i7];
                if (list6 != null) {
                    int size6 = list6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        org.objectweb.asm.tree.AnnotationNode annotationNode3 = list6.get(i8);
                        annotationNode3.accept(methodVisitor.visitParameterAnnotation(i7, annotationNode3.desc, true));
                    }
                }
            }
        }
        int i9 = this.invisibleAnnotableParameterCount;
        if (i9 > 0) {
            methodVisitor.visitAnnotableParameterCount(i9, false);
        }
        java.util.List<org.objectweb.asm.tree.AnnotationNode>[] listArr2 = this.invisibleParameterAnnotations;
        if (listArr2 != null) {
            int length2 = listArr2.length;
            for (int i10 = 0; i10 < length2; i10++) {
                java.util.List<org.objectweb.asm.tree.AnnotationNode> list7 = this.invisibleParameterAnnotations[i10];
                if (list7 != null) {
                    int size7 = list7.size();
                    for (int i11 = 0; i11 < size7; i11++) {
                        org.objectweb.asm.tree.AnnotationNode annotationNode4 = list7.get(i11);
                        annotationNode4.accept(methodVisitor.visitParameterAnnotation(i10, annotationNode4.desc, false));
                    }
                }
            }
        }
        if (this.visited) {
            this.instructions.resetLabels();
        }
        java.util.List<org.objectweb.asm.Attribute> list8 = this.attrs;
        if (list8 != null) {
            int size8 = list8.size();
            for (int i12 = 0; i12 < size8; i12++) {
                methodVisitor.visitAttribute(this.attrs.get(i12));
            }
        }
        if (this.instructions.size() > 0) {
            methodVisitor.visitCode();
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> list9 = this.tryCatchBlocks;
            if (list9 != null) {
                int size9 = list9.size();
                for (int i13 = 0; i13 < size9; i13++) {
                    this.tryCatchBlocks.get(i13).updateIndex(i13);
                    this.tryCatchBlocks.get(i13).accept(methodVisitor);
                }
            }
            this.instructions.accept(methodVisitor);
            java.util.List<org.objectweb.asm.tree.LocalVariableNode> list10 = this.localVariables;
            if (list10 != null) {
                int size10 = list10.size();
                for (int i14 = 0; i14 < size10; i14++) {
                    this.localVariables.get(i14).accept(methodVisitor);
                }
            }
            java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> list11 = this.visibleLocalVariableAnnotations;
            if (list11 != null) {
                int size11 = list11.size();
                for (int i15 = 0; i15 < size11; i15++) {
                    this.visibleLocalVariableAnnotations.get(i15).accept(methodVisitor, true);
                }
            }
            java.util.List<org.objectweb.asm.tree.LocalVariableAnnotationNode> list12 = this.invisibleLocalVariableAnnotations;
            if (list12 != null) {
                int size12 = list12.size();
                for (int i16 = 0; i16 < size12; i16++) {
                    this.invisibleLocalVariableAnnotations.get(i16).accept(methodVisitor, false);
                }
            }
            methodVisitor.visitMaxs(this.maxStack, this.maxLocals);
            this.visited = true;
        }
        methodVisitor.visitEnd();
    }
}
