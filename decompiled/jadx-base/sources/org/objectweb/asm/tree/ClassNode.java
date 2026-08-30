package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class ClassNode extends org.objectweb.asm.ClassVisitor {
    public int access;
    public java.util.List<org.objectweb.asm.Attribute> attrs;
    public java.util.List<org.objectweb.asm.tree.FieldNode> fields;
    public java.util.List<org.objectweb.asm.tree.InnerClassNode> innerClasses;
    public java.util.List<java.lang.String> interfaces;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode> invisibleAnnotations;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> invisibleTypeAnnotations;
    public java.util.List<org.objectweb.asm.tree.MethodNode> methods;
    public org.objectweb.asm.tree.ModuleNode module;
    public java.lang.String name;
    public java.lang.String nestHostClass;
    public java.util.List<java.lang.String> nestMembers;
    public java.lang.String outerClass;
    public java.lang.String outerMethod;
    public java.lang.String outerMethodDesc;
    public java.util.List<java.lang.String> permittedSubclasses;
    public java.util.List<org.objectweb.asm.tree.RecordComponentNode> recordComponents;
    public java.lang.String signature;
    public java.lang.String sourceDebug;
    public java.lang.String sourceFile;
    public java.lang.String superName;
    public int version;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode> visibleAnnotations;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> visibleTypeAnnotations;

    @Override // org.objectweb.asm.ClassVisitor
    public void visitEnd() {
    }

    public ClassNode() {
        this(589824);
        if (getClass() != org.objectweb.asm.tree.ClassNode.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    public ClassNode(int i) {
        super(i);
        this.interfaces = new java.util.ArrayList();
        this.innerClasses = new java.util.ArrayList();
        this.fields = new java.util.ArrayList();
        this.methods = new java.util.ArrayList();
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        this.version = i;
        this.access = i2;
        this.name = str;
        this.signature = str2;
        this.superName = str3;
        this.interfaces = org.objectweb.asm.tree.Util.asArrayList(strArr);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitSource(java.lang.String str, java.lang.String str2) {
        this.sourceFile = str;
        this.sourceDebug = str2;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.ModuleVisitor visitModule(java.lang.String str, int i, java.lang.String str2) {
        org.objectweb.asm.tree.ModuleNode moduleNode = new org.objectweb.asm.tree.ModuleNode(str, i, str2);
        this.module = moduleNode;
        return moduleNode;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitNestHost(java.lang.String str) {
        this.nestHostClass = str;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitOuterClass(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.outerClass = str;
        this.outerMethod = str2;
        this.outerMethodDesc = str3;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, boolean z) {
        org.objectweb.asm.tree.AnnotationNode annotationNode = new org.objectweb.asm.tree.AnnotationNode(str);
        if (z) {
            this.visibleAnnotations = org.objectweb.asm.tree.Util.add(this.visibleAnnotations, annotationNode);
        } else {
            this.invisibleAnnotations = org.objectweb.asm.tree.Util.add(this.invisibleAnnotations, annotationNode);
        }
        return annotationNode;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode = new org.objectweb.asm.tree.TypeAnnotationNode(i, typePath, str);
        if (z) {
            this.visibleTypeAnnotations = org.objectweb.asm.tree.Util.add(this.visibleTypeAnnotations, typeAnnotationNode);
        } else {
            this.invisibleTypeAnnotations = org.objectweb.asm.tree.Util.add(this.invisibleTypeAnnotations, typeAnnotationNode);
        }
        return typeAnnotationNode;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitAttribute(org.objectweb.asm.Attribute attribute) {
        this.attrs = org.objectweb.asm.tree.Util.add(this.attrs, attribute);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitNestMember(java.lang.String str) {
        this.nestMembers = org.objectweb.asm.tree.Util.add(this.nestMembers, str);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitPermittedSubclass(java.lang.String str) {
        this.permittedSubclasses = org.objectweb.asm.tree.Util.add(this.permittedSubclasses, str);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitInnerClass(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        this.innerClasses.add(new org.objectweb.asm.tree.InnerClassNode(str, str2, str3, i));
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.RecordComponentVisitor visitRecordComponent(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.objectweb.asm.tree.RecordComponentNode recordComponentNode = new org.objectweb.asm.tree.RecordComponentNode(str, str2, str3);
        this.recordComponents = org.objectweb.asm.tree.Util.add(this.recordComponents, recordComponentNode);
        return recordComponentNode;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.FieldVisitor visitField(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        org.objectweb.asm.tree.FieldNode fieldNode = new org.objectweb.asm.tree.FieldNode(i, str, str2, str3, obj);
        this.fields.add(fieldNode);
        return fieldNode;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.MethodVisitor visitMethod(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        org.objectweb.asm.tree.MethodNode methodNode = new org.objectweb.asm.tree.MethodNode(i, str, str2, str3, strArr);
        this.methods.add(methodNode);
        return methodNode;
    }

    public void check(int i) {
        if (i < 589824 && this.permittedSubclasses != null) {
            throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
        }
        if (i < 524288 && ((this.access & 65536) != 0 || this.recordComponents != null)) {
            throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
        }
        if (i < 458752 && (this.nestHostClass != null || this.nestMembers != null)) {
            throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
        }
        if (i < 393216 && this.module != null) {
            throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
        }
        if (i < 327680) {
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list = this.visibleTypeAnnotations;
            if (list != null && !list.isEmpty()) {
                throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
            }
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list2 = this.invisibleTypeAnnotations;
            if (list2 != null && !list2.isEmpty()) {
                throw new org.objectweb.asm.tree.UnsupportedClassVersionException();
            }
        }
        java.util.List<org.objectweb.asm.tree.AnnotationNode> list3 = this.visibleAnnotations;
        if (list3 != null) {
            for (int size = list3.size() - 1; size >= 0; size--) {
                this.visibleAnnotations.get(size).check(i);
            }
        }
        java.util.List<org.objectweb.asm.tree.AnnotationNode> list4 = this.invisibleAnnotations;
        if (list4 != null) {
            for (int size2 = list4.size() - 1; size2 >= 0; size2--) {
                this.invisibleAnnotations.get(size2).check(i);
            }
        }
        java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list5 = this.visibleTypeAnnotations;
        if (list5 != null) {
            for (int size3 = list5.size() - 1; size3 >= 0; size3--) {
                this.visibleTypeAnnotations.get(size3).check(i);
            }
        }
        java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list6 = this.invisibleTypeAnnotations;
        if (list6 != null) {
            for (int size4 = list6.size() - 1; size4 >= 0; size4--) {
                this.invisibleTypeAnnotations.get(size4).check(i);
            }
        }
        java.util.List<org.objectweb.asm.tree.RecordComponentNode> list7 = this.recordComponents;
        if (list7 != null) {
            for (int size5 = list7.size() - 1; size5 >= 0; size5--) {
                this.recordComponents.get(size5).check(i);
            }
        }
        for (int size6 = this.fields.size() - 1; size6 >= 0; size6--) {
            this.fields.get(size6).check(i);
        }
        for (int size7 = this.methods.size() - 1; size7 >= 0; size7--) {
            this.methods.get(size7).check(i);
        }
    }

    public void accept(org.objectweb.asm.ClassVisitor classVisitor) {
        java.lang.String[] strArr = new java.lang.String[this.interfaces.size()];
        this.interfaces.toArray(strArr);
        classVisitor.visit(this.version, this.access, this.name, this.signature, this.superName, strArr);
        java.lang.String str = this.sourceFile;
        if (str != null || this.sourceDebug != null) {
            classVisitor.visitSource(str, this.sourceDebug);
        }
        org.objectweb.asm.tree.ModuleNode moduleNode = this.module;
        if (moduleNode != null) {
            moduleNode.accept(classVisitor);
        }
        java.lang.String str2 = this.nestHostClass;
        if (str2 != null) {
            classVisitor.visitNestHost(str2);
        }
        java.lang.String str3 = this.outerClass;
        if (str3 != null) {
            classVisitor.visitOuterClass(str3, this.outerMethod, this.outerMethodDesc);
        }
        java.util.List<org.objectweb.asm.tree.AnnotationNode> list = this.visibleAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                org.objectweb.asm.tree.AnnotationNode annotationNode = this.visibleAnnotations.get(i);
                annotationNode.accept(classVisitor.visitAnnotation(annotationNode.desc, true));
            }
        }
        java.util.List<org.objectweb.asm.tree.AnnotationNode> list2 = this.invisibleAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                org.objectweb.asm.tree.AnnotationNode annotationNode2 = this.invisibleAnnotations.get(i2);
                annotationNode2.accept(classVisitor.visitAnnotation(annotationNode2.desc, false));
            }
        }
        java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list3 = this.visibleTypeAnnotations;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i3);
                typeAnnotationNode.accept(classVisitor.visitTypeAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> list4 = this.invisibleTypeAnnotations;
        if (list4 != null) {
            int size4 = list4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                org.objectweb.asm.tree.TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i4);
                typeAnnotationNode2.accept(classVisitor.visitTypeAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
        java.util.List<org.objectweb.asm.Attribute> list5 = this.attrs;
        if (list5 != null) {
            int size5 = list5.size();
            for (int i5 = 0; i5 < size5; i5++) {
                classVisitor.visitAttribute(this.attrs.get(i5));
            }
        }
        java.util.List<java.lang.String> list6 = this.nestMembers;
        if (list6 != null) {
            int size6 = list6.size();
            for (int i6 = 0; i6 < size6; i6++) {
                classVisitor.visitNestMember(this.nestMembers.get(i6));
            }
        }
        java.util.List<java.lang.String> list7 = this.permittedSubclasses;
        if (list7 != null) {
            int size7 = list7.size();
            for (int i7 = 0; i7 < size7; i7++) {
                classVisitor.visitPermittedSubclass(this.permittedSubclasses.get(i7));
            }
        }
        int size8 = this.innerClasses.size();
        for (int i8 = 0; i8 < size8; i8++) {
            this.innerClasses.get(i8).accept(classVisitor);
        }
        java.util.List<org.objectweb.asm.tree.RecordComponentNode> list8 = this.recordComponents;
        if (list8 != null) {
            int size9 = list8.size();
            for (int i9 = 0; i9 < size9; i9++) {
                this.recordComponents.get(i9).accept(classVisitor);
            }
        }
        int size10 = this.fields.size();
        for (int i10 = 0; i10 < size10; i10++) {
            this.fields.get(i10).accept(classVisitor);
        }
        int size11 = this.methods.size();
        for (int i11 = 0; i11 < size11; i11++) {
            this.methods.get(i11).accept(classVisitor);
        }
        classVisitor.visitEnd();
    }
}
