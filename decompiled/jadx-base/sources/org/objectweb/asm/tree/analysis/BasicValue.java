package org.objectweb.asm.tree.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class BasicValue implements org.objectweb.asm.tree.analysis.Value {
    private final org.objectweb.asm.Type type;
    public static final org.objectweb.asm.tree.analysis.BasicValue UNINITIALIZED_VALUE = new org.objectweb.asm.tree.analysis.BasicValue(null);
    public static final org.objectweb.asm.tree.analysis.BasicValue INT_VALUE = new org.objectweb.asm.tree.analysis.BasicValue(org.objectweb.asm.Type.INT_TYPE);
    public static final org.objectweb.asm.tree.analysis.BasicValue FLOAT_VALUE = new org.objectweb.asm.tree.analysis.BasicValue(org.objectweb.asm.Type.FLOAT_TYPE);
    public static final org.objectweb.asm.tree.analysis.BasicValue LONG_VALUE = new org.objectweb.asm.tree.analysis.BasicValue(org.objectweb.asm.Type.LONG_TYPE);
    public static final org.objectweb.asm.tree.analysis.BasicValue DOUBLE_VALUE = new org.objectweb.asm.tree.analysis.BasicValue(org.objectweb.asm.Type.DOUBLE_TYPE);
    public static final org.objectweb.asm.tree.analysis.BasicValue REFERENCE_VALUE = new org.objectweb.asm.tree.analysis.BasicValue(org.objectweb.asm.Type.getObjectType("java/lang/Object"));
    public static final org.objectweb.asm.tree.analysis.BasicValue RETURNADDRESS_VALUE = new org.objectweb.asm.tree.analysis.BasicValue(org.objectweb.asm.Type.VOID_TYPE);

    public BasicValue(org.objectweb.asm.Type type) {
        this.type = type;
    }

    public org.objectweb.asm.Type getType() {
        return this.type;
    }

    @Override // org.objectweb.asm.tree.analysis.Value
    public int getSize() {
        return (this.type == org.objectweb.asm.Type.LONG_TYPE || this.type == org.objectweb.asm.Type.DOUBLE_TYPE) ? 2 : 1;
    }

    public boolean isReference() {
        org.objectweb.asm.Type type = this.type;
        return type != null && (type.getSort() == 10 || this.type.getSort() == 9);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.objectweb.asm.tree.analysis.BasicValue)) {
            return false;
        }
        org.objectweb.asm.Type type = this.type;
        if (type == null) {
            return ((org.objectweb.asm.tree.analysis.BasicValue) obj).type == null;
        }
        return type.equals(((org.objectweb.asm.tree.analysis.BasicValue) obj).type);
    }

    public int hashCode() {
        org.objectweb.asm.Type type = this.type;
        if (type == null) {
            return 0;
        }
        return type.hashCode();
    }

    public java.lang.String toString() {
        if (this == UNINITIALIZED_VALUE) {
            return ".";
        }
        if (this == RETURNADDRESS_VALUE) {
            return androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
        }
        return this == REFERENCE_VALUE ? "R" : this.type.getDescriptor();
    }
}
