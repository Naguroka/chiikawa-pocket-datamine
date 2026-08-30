package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
public abstract class FieldVisitor {
    protected final int api;
    protected org.objectweb.asm.FieldVisitor fv;

    public FieldVisitor(int i) {
        this(i, null);
    }

    public FieldVisitor(int i, org.objectweb.asm.FieldVisitor fieldVisitor) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new java.lang.IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            org.objectweb.asm.Constants.checkAsmExperimental(this);
        }
        this.api = i;
        this.fv = fieldVisitor;
    }

    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, boolean z) {
        org.objectweb.asm.FieldVisitor fieldVisitor = this.fv;
        if (fieldVisitor != null) {
            return fieldVisitor.visitAnnotation(str, z);
        }
        return null;
    }

    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        if (this.api < 327680) {
            throw new java.lang.UnsupportedOperationException("This feature requires ASM5");
        }
        org.objectweb.asm.FieldVisitor fieldVisitor = this.fv;
        if (fieldVisitor != null) {
            return fieldVisitor.visitTypeAnnotation(i, typePath, str, z);
        }
        return null;
    }

    public void visitAttribute(org.objectweb.asm.Attribute attribute) {
        org.objectweb.asm.FieldVisitor fieldVisitor = this.fv;
        if (fieldVisitor != null) {
            fieldVisitor.visitAttribute(attribute);
        }
    }

    public void visitEnd() {
        org.objectweb.asm.FieldVisitor fieldVisitor = this.fv;
        if (fieldVisitor != null) {
            fieldVisitor.visitEnd();
        }
    }
}
