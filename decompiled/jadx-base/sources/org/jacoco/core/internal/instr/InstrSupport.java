package org.jacoco.core.internal.instr;

/* JADX INFO: loaded from: classes6.dex */
public final class InstrSupport {
    public static final int ASM_API_VERSION = 589824;
    static final int CLINIT_ACC = 4104;
    static final java.lang.String CLINIT_DESC = "()V";
    static final java.lang.String CLINIT_NAME = "<clinit>";
    public static final int DATAFIELD_ACC = 4234;
    public static final java.lang.String DATAFIELD_DESC = "[Z";
    public static final int DATAFIELD_INTF_ACC = 4121;
    public static final java.lang.String DATAFIELD_NAME = "$jacocoData";
    public static final int INITMETHOD_ACC = 4106;
    public static final java.lang.String INITMETHOD_DESC = "()[Z";
    public static final java.lang.String INITMETHOD_NAME = "$jacocoInit";

    public static boolean needsFrames(int i) {
        return (i & 65535) >= 50;
    }

    private InstrSupport() {
    }

    public static int getMajorVersion(byte[] bArr) {
        return (bArr[7] & 255) | ((bArr[6] & 255) << 8);
    }

    public static void setMajorVersion(int i, byte[] bArr) {
        bArr[6] = (byte) (i >>> 8);
        bArr[7] = (byte) i;
    }

    public static int getMajorVersion(org.objectweb.asm.ClassReader classReader) {
        return classReader.readUnsignedShort((classReader.getItem(1) - 1) - 4);
    }

    public static void assertNotInstrumented(java.lang.String str, java.lang.String str2) throws java.lang.IllegalStateException {
        if (str.equals(DATAFIELD_NAME) || str.equals(INITMETHOD_NAME)) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Cannot process instrumented class %s. Please supply original non-instrumented classes.", str2));
        }
    }

    public static void push(org.objectweb.asm.MethodVisitor methodVisitor, int i) {
        if (i >= -1 && i <= 5) {
            methodVisitor.visitInsn(i + 3);
            return;
        }
        if (i >= -128 && i <= 127) {
            methodVisitor.visitIntInsn(16, i);
        } else if (i >= -32768 && i <= 32767) {
            methodVisitor.visitIntInsn(17, i);
        } else {
            methodVisitor.visitLdcInsn(java.lang.Integer.valueOf(i));
        }
    }

    public static org.objectweb.asm.ClassReader classReaderFor(byte[] bArr) {
        int majorVersion = getMajorVersion(bArr);
        if (majorVersion == 63) {
            setMajorVersion(62, bArr);
        }
        org.objectweb.asm.ClassReader classReader = new org.objectweb.asm.ClassReader(bArr);
        setMajorVersion(majorVersion, bArr);
        return classReader;
    }
}
