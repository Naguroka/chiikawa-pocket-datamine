package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ClassVisitor {
    protected final int api;
    protected org.objectweb.asm.ClassVisitor cv;

    public ClassVisitor(int i) {
        this(i, null);
    }

    public ClassVisitor(int i, org.objectweb.asm.ClassVisitor classVisitor) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new java.lang.IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            org.objectweb.asm.Constants.checkAsmExperimental(this);
        }
        this.api = i;
        this.cv = classVisitor;
    }

    public void visit(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        if (this.api < 524288 && (65536 & i2) != 0) {
            throw new java.lang.UnsupportedOperationException("Records requires ASM8");
        }
        org.objectweb.asm.ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visit(i, i2, str, str2, str3, strArr);
        }
    }

    public void visitSource(java.lang.String str, java.lang.String str2) {
        org.objectweb.asm.ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitSource(str, str2);
        }
    }

    public org.objectweb.asm.ModuleVisitor visitModule(java.lang.String str, int i, java.lang.String str2) {
        if (this.api < 393216) {
            throw new java.lang.UnsupportedOperationException("Module requires ASM6");
        }
        org.objectweb.asm.ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            return classVisitor.visitModule(str, i, str2);
        }
        return null;
    }

    public void visitNestHost(java.lang.String str) {
        if (this.api < 458752) {
            throw new java.lang.UnsupportedOperationException("NestHost requires ASM7");
        }
        org.objectweb.asm.ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitNestHost(str);
        }
    }

    public void visitOuterClass(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.objectweb.asm.ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitOuterClass(str, str2, str3);
        }
    }

    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, boolean z) {
        org.objectweb.asm.ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            return classVisitor.visitAnnotation(str, z);
        }
        return null;
    }

    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        if (this.api < 327680) {
            throw new java.lang.UnsupportedOperationException("TypeAnnotation requires ASM5");
        }
        org.objectweb.asm.ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            return classVisitor.visitTypeAnnotation(i, typePath, str, z);
        }
        return null;
    }

    public void visitAttribute(org.objectweb.asm.Attribute attribute) {
        org.objectweb.asm.ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitAttribute(attribute);
        }
    }

    public void visitNestMember(java.lang.String str) {
        if (this.api < 458752) {
            throw new java.lang.UnsupportedOperationException("NestMember requires ASM7");
        }
        org.objectweb.asm.ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitNestMember(str);
        }
    }

    public void visitPermittedSubclass(java.lang.String str) {
        if (this.api < 589824) {
            throw new java.lang.UnsupportedOperationException("PermittedSubclasses requires ASM9");
        }
        org.objectweb.asm.ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitPermittedSubclass(str);
        }
    }

    public void visitInnerClass(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        org.objectweb.asm.ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitInnerClass(str, str2, str3, i);
        }
    }

    public org.objectweb.asm.RecordComponentVisitor visitRecordComponent(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (this.api < 524288) {
            throw new java.lang.UnsupportedOperationException("Record requires ASM8");
        }
        org.objectweb.asm.ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            return classVisitor.visitRecordComponent(str, str2, str3);
        }
        return null;
    }

    public org.objectweb.asm.FieldVisitor visitField(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        org.objectweb.asm.ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            return classVisitor.visitField(i, str, str2, str3, obj);
        }
        return null;
    }

    public org.objectweb.asm.MethodVisitor visitMethod(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        org.objectweb.asm.ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            return classVisitor.visitMethod(i, str, str2, str3, strArr);
        }
        return null;
    }

    public void visitEnd() {
        org.objectweb.asm.ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitEnd();
        }
    }
}
