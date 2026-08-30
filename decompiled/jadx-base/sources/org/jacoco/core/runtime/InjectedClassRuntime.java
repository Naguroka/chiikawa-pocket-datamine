package org.jacoco.core.runtime;

/* JADX INFO: loaded from: classes6.dex */
public class InjectedClassRuntime extends org.jacoco.core.runtime.AbstractRuntime {
    private static final java.lang.String FIELD_NAME = "data";
    private static final java.lang.String FIELD_TYPE = "Ljava/lang/Object;";
    private final java.lang.String injectedClassName;
    private final java.lang.Class<?> locator;

    @Override // org.jacoco.core.runtime.IRuntime
    public void shutdown() {
    }

    public InjectedClassRuntime(java.lang.Class<?> cls, java.lang.String str) {
        this.locator = cls;
        this.injectedClassName = cls.getPackage().getName().replace('.', '/') + '/' + str;
    }

    @Override // org.jacoco.core.runtime.AbstractRuntime, org.jacoco.core.runtime.IRuntime
    public void startup(org.jacoco.core.runtime.RuntimeData runtimeData) throws java.lang.Exception {
        super.startup(runtimeData);
        org.jacoco.core.runtime.InjectedClassRuntime.Lookup.privateLookupIn(this.locator, org.jacoco.core.runtime.InjectedClassRuntime.Lookup.lookup()).defineClass(createClass(this.injectedClassName)).getField("data").set(null, runtimeData);
    }

    @Override // org.jacoco.core.runtime.IExecutionDataAccessorGenerator
    public int generateDataAccessor(long j, java.lang.String str, int i, org.objectweb.asm.MethodVisitor methodVisitor) {
        methodVisitor.visitFieldInsn(org.objectweb.asm.Opcodes.GETSTATIC, this.injectedClassName, "data", FIELD_TYPE);
        org.jacoco.core.runtime.RuntimeData.generateAccessCall(j, str, i, methodVisitor);
        return 6;
    }

    private static byte[] createClass(java.lang.String str) {
        org.objectweb.asm.ClassWriter classWriter = new org.objectweb.asm.ClassWriter(0);
        classWriter.visit(53, androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN, str.replace('.', '/'), null, "java/lang/Object", null);
        classWriter.visitField(9, "data", FIELD_TYPE, null, null);
        classWriter.visitEnd();
        return classWriter.toByteArray();
    }

    private static class Lookup {
        private final java.lang.Object instance;

        private Lookup(java.lang.Object obj) {
            this.instance = obj;
        }

        static org.jacoco.core.runtime.InjectedClassRuntime.Lookup lookup() throws java.lang.Exception {
            return new org.jacoco.core.runtime.InjectedClassRuntime.Lookup(java.lang.Class.forName("java.lang.invoke.MethodHandles").getMethod("lookup", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]));
        }

        static org.jacoco.core.runtime.InjectedClassRuntime.Lookup privateLookupIn(java.lang.Class<?> cls, org.jacoco.core.runtime.InjectedClassRuntime.Lookup lookup) throws java.lang.Exception {
            return new org.jacoco.core.runtime.InjectedClassRuntime.Lookup(java.lang.Class.forName("java.lang.invoke.MethodHandles").getMethod("privateLookupIn", java.lang.Class.class, java.lang.Class.forName("java.lang.invoke.MethodHandles$Lookup")).invoke(null, cls, lookup.instance));
        }

        java.lang.Class<?> defineClass(byte[] bArr) throws java.lang.Exception {
            return (java.lang.Class) java.lang.Class.forName("java.lang.invoke.MethodHandles$Lookup").getMethod("defineClass", byte[].class).invoke(this.instance, bArr);
        }
    }
}
