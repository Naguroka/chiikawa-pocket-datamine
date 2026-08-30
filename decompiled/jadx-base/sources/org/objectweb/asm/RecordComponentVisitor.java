package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RecordComponentVisitor {
    protected final int api;
    org.objectweb.asm.RecordComponentVisitor delegate;

    public RecordComponentVisitor(int i) {
        this(i, null);
    }

    public RecordComponentVisitor(int i, org.objectweb.asm.RecordComponentVisitor recordComponentVisitor) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new java.lang.IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            org.objectweb.asm.Constants.checkAsmExperimental(this);
        }
        this.api = i;
        this.delegate = recordComponentVisitor;
    }

    public org.objectweb.asm.RecordComponentVisitor getDelegate() {
        return this.delegate;
    }

    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String str, boolean z) {
        org.objectweb.asm.RecordComponentVisitor recordComponentVisitor = this.delegate;
        if (recordComponentVisitor != null) {
            return recordComponentVisitor.visitAnnotation(str, z);
        }
        return null;
    }

    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int i, org.objectweb.asm.TypePath typePath, java.lang.String str, boolean z) {
        org.objectweb.asm.RecordComponentVisitor recordComponentVisitor = this.delegate;
        if (recordComponentVisitor != null) {
            return recordComponentVisitor.visitTypeAnnotation(i, typePath, str, z);
        }
        return null;
    }

    public void visitAttribute(org.objectweb.asm.Attribute attribute) {
        org.objectweb.asm.RecordComponentVisitor recordComponentVisitor = this.delegate;
        if (recordComponentVisitor != null) {
            recordComponentVisitor.visitAttribute(attribute);
        }
    }

    public void visitEnd() {
        org.objectweb.asm.RecordComponentVisitor recordComponentVisitor = this.delegate;
        if (recordComponentVisitor != null) {
            recordComponentVisitor.visitEnd();
        }
    }
}
