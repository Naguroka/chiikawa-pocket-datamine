package org.jacoco.core.runtime;

/* JADX INFO: loaded from: classes6.dex */
public class ModifiedSystemClassRuntime extends org.jacoco.core.runtime.AbstractRuntime {
    private static final java.lang.String ACCESS_FIELD_TYPE = "Ljava/lang/Object;";
    private final java.lang.String accessFieldName;
    private final java.lang.Class<?> systemClass;
    private final java.lang.String systemClassName;

    @Override // org.jacoco.core.runtime.IRuntime
    public void shutdown() {
    }

    public ModifiedSystemClassRuntime(java.lang.Class<?> cls, java.lang.String str) {
        this.systemClass = cls;
        this.systemClassName = cls.getName().replace('.', '/');
        this.accessFieldName = str;
    }

    @Override // org.jacoco.core.runtime.AbstractRuntime, org.jacoco.core.runtime.IRuntime
    public void startup(org.jacoco.core.runtime.RuntimeData runtimeData) throws java.lang.Exception {
        super.startup(runtimeData);
        this.systemClass.getField(this.accessFieldName).set(null, runtimeData);
    }

    @Override // org.jacoco.core.runtime.IExecutionDataAccessorGenerator
    public int generateDataAccessor(long j, java.lang.String str, int i, org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitFieldInsn(org.objectweb.asm.Opcodes.GETSTATIC, this.systemClassName, this.accessFieldName, ACCESS_FIELD_TYPE);
        org.jacoco.core.runtime.RuntimeData.generateAccessCall(j, str, i, methodVisitor);
        return 6;
    }

    public static org.jacoco.core.runtime.IRuntime createFor(java.lang.instrument.Instrumentation instrumentation, java.lang.String str) throws java.lang.ClassNotFoundException {
        return createFor(instrumentation, str, "$jacocoAccess");
    }

    public static org.jacoco.core.runtime.IRuntime createFor(java.lang.instrument.Instrumentation instrumentation, final java.lang.String str, final java.lang.String str2) throws java.lang.ClassNotFoundException {
        java.lang.instrument.ClassFileTransformer classFileTransformer = new java.lang.instrument.ClassFileTransformer() { // from class: org.jacoco.core.runtime.ModifiedSystemClassRuntime.1
            public byte[] transform(java.lang.ClassLoader classLoader, java.lang.String str3, java.lang.Class<?> cls, java.security.ProtectionDomain protectionDomain, byte[] bArr) throws java.lang.instrument.IllegalClassFormatException {
                if (str3.equals(str)) {
                    return org.jacoco.core.runtime.ModifiedSystemClassRuntime.instrument(bArr, str2);
                }
                return null;
            }
        };
        instrumentation.addTransformer(classFileTransformer);
        java.lang.Class<?> cls = java.lang.Class.forName(str.replace('/', '.'));
        instrumentation.removeTransformer(classFileTransformer);
        try {
            cls.getField(str2);
            return new org.jacoco.core.runtime.ModifiedSystemClassRuntime(cls, str2);
        } catch (java.lang.NoSuchFieldException e) {
            throw new java.lang.RuntimeException(java.lang.String.format("Class %s could not be instrumented.", str), e);
        }
    }

    public static byte[] instrument(byte[] bArr, final java.lang.String str) {
        org.objectweb.asm.ClassReader classReaderClassReaderFor = org.jacoco.core.internal.instr.InstrSupport.classReaderFor(bArr);
        org.objectweb.asm.ClassWriter classWriter = new org.objectweb.asm.ClassWriter(classReaderClassReaderFor, 0);
        classReaderClassReaderFor.accept(new org.objectweb.asm.ClassVisitor(589824, classWriter) { // from class: org.jacoco.core.runtime.ModifiedSystemClassRuntime.2
            @Override // org.objectweb.asm.ClassVisitor
            public void visitEnd() {
                org.jacoco.core.runtime.ModifiedSystemClassRuntime.createDataField(this.cv, str);
                super.visitEnd();
            }
        }, 8);
        return classWriter.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void createDataField(org.objectweb.asm.ClassVisitor classVisitor, java.lang.String str) {
        classVisitor.visitField(4233, str, ACCESS_FIELD_TYPE, null, null);
    }
}
