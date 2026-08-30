package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class ClassRemapper extends org.objectweb.asm.ClassVisitor {
    protected java.lang.String className;
    protected final org.objectweb.asm.commons.Remapper remapper;

    public ClassRemapper(org.objectweb.asm.ClassVisitor classVisitor, org.objectweb.asm.commons.Remapper remapper) {
        this(589824, classVisitor, remapper);
    }

    protected ClassRemapper(int i, org.objectweb.asm.ClassVisitor classVisitor, org.objectweb.asm.commons.Remapper remapper) {
        super(i, classVisitor);
        this.remapper = remapper;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        this.className = str;
        super.visit(i, i2, this.remapper.mapType(str), this.remapper.mapSignature(str2, false), this.remapper.mapType(str3), strArr == null ? null : this.remapper.mapTypes(strArr));
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.ModuleVisitor visitModule(java.lang.String str, int i, java.lang.String str2) {
        org.objectweb.asm.ModuleVisitor moduleVisitorVisitModule = super.visitModule(this.remapper.mapModuleName(str), i, str2);
        if (moduleVisitorVisitModule == null) {
            return null;
        }
        return createModuleRemapper(moduleVisitorVisitModule);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, boolean z) {
        org.objectweb.asm.AnnotationVisitor annotationVisitorVisitAnnotation = super.visitAnnotation(this.remapper.mapDesc(str), z);
        if (annotationVisitorVisitAnnotation == null) {
            return null;
        }
        return createAnnotationRemapper(str, annotationVisitorVisitAnnotation);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        org.objectweb.asm.AnnotationVisitor annotationVisitorVisitTypeAnnotation = super.visitTypeAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        if (annotationVisitorVisitTypeAnnotation == null) {
            return null;
        }
        return createAnnotationRemapper(str, annotationVisitorVisitTypeAnnotation);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitAttribute(org.objectweb.asm.Attribute attribute) {
        if (attribute instanceof org.objectweb.asm.commons.ModuleHashesAttribute) {
            java.util.List<java.lang.String> list = ((org.objectweb.asm.commons.ModuleHashesAttribute) attribute).modules;
            for (int i = 0; i < list.size(); i++) {
                list.set(i, this.remapper.mapModuleName(list.get(i)));
            }
        }
        super.visitAttribute(attribute);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.RecordComponentVisitor visitRecordComponent(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.objectweb.asm.RecordComponentVisitor recordComponentVisitorVisitRecordComponent = super.visitRecordComponent(this.remapper.mapRecordComponentName(this.className, str, str2), this.remapper.mapDesc(str2), this.remapper.mapSignature(str3, true));
        if (recordComponentVisitorVisitRecordComponent == null) {
            return null;
        }
        return createRecordComponentRemapper(recordComponentVisitorVisitRecordComponent);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.FieldVisitor visitField(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        org.objectweb.asm.FieldVisitor fieldVisitorVisitField = super.visitField(i, this.remapper.mapFieldName(this.className, str, str2), this.remapper.mapDesc(str2), this.remapper.mapSignature(str3, true), obj == null ? null : this.remapper.mapValue(obj));
        if (fieldVisitorVisitField == null) {
            return null;
        }
        return createFieldRemapper(fieldVisitorVisitField);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.MethodVisitor visitMethod(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        org.objectweb.asm.MethodVisitor methodVisitorVisitMethod = super.visitMethod(i, this.remapper.mapMethodName(this.className, str, str2), this.remapper.mapMethodDesc(str2), this.remapper.mapSignature(str3, false), strArr == null ? null : this.remapper.mapTypes(strArr));
        if (methodVisitorVisitMethod == null) {
            return null;
        }
        return createMethodRemapper(methodVisitorVisitMethod);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitInnerClass(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        super.visitInnerClass(this.remapper.mapType(str), str2 == null ? null : this.remapper.mapType(str2), str3 != null ? this.remapper.mapInnerClassName(str, str2, str3) : null, i);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitOuterClass(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super.visitOuterClass(this.remapper.mapType(str), str2 == null ? null : this.remapper.mapMethodName(str, str2, str3), str3 != null ? this.remapper.mapMethodDesc(str3) : null);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitNestHost(java.lang.String str) {
        super.visitNestHost(this.remapper.mapType(str));
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitNestMember(java.lang.String str) {
        super.visitNestMember(this.remapper.mapType(str));
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitPermittedSubclass(java.lang.String str) {
        super.visitPermittedSubclass(this.remapper.mapType(str));
    }

    protected org.objectweb.asm.FieldVisitor createFieldRemapper(org.objectweb.asm.FieldVisitor fieldVisitor) {
        return new org.objectweb.asm.commons.FieldRemapper(this.api, fieldVisitor, this.remapper);
    }

    protected org.objectweb.asm.MethodVisitor createMethodRemapper(org.objectweb.asm.MethodVisitor methodVisitor) {
        return new org.objectweb.asm.commons.MethodRemapper(this.api, methodVisitor, this.remapper);
    }

    @java.lang.Deprecated
    protected org.objectweb.asm.AnnotationVisitor createAnnotationRemapper(org.objectweb.asm.AnnotationVisitor annotationVisitor) {
        return new org.objectweb.asm.commons.AnnotationRemapper(this.api, null, annotationVisitor, this.remapper);
    }

    protected org.objectweb.asm.AnnotationVisitor createAnnotationRemapper(java.lang.String str, org.objectweb.asm.AnnotationVisitor annotationVisitor) {
        return new org.objectweb.asm.commons.AnnotationRemapper(this.api, str, annotationVisitor, this.remapper).orDeprecatedValue(createAnnotationRemapper(annotationVisitor));
    }

    protected org.objectweb.asm.ModuleVisitor createModuleRemapper(org.objectweb.asm.ModuleVisitor moduleVisitor) {
        return new org.objectweb.asm.commons.ModuleRemapper(this.api, moduleVisitor, this.remapper);
    }

    protected org.objectweb.asm.RecordComponentVisitor createRecordComponentRemapper(org.objectweb.asm.RecordComponentVisitor recordComponentVisitor) {
        return new org.objectweb.asm.commons.RecordComponentRemapper(this.api, recordComponentVisitor, this.remapper);
    }
}
