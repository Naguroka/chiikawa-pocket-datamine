package bitter.jnibridge;

/* JADX INFO: loaded from: classes3.dex */
final class a implements java.lang.reflect.InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Object[] f7a = new java.lang.Object[0];
    private long b;
    private java.lang.reflect.Constructor c;

    public a(long j) {
        this.b = j;
        try {
            java.lang.reflect.Constructor declaredConstructor = java.lang.invoke.MethodHandles.Lookup.class.getDeclaredConstructor(java.lang.Class.class, java.lang.Integer.TYPE);
            this.c = declaredConstructor;
            declaredConstructor.setAccessible(true);
        } catch (java.lang.NoClassDefFoundError | java.lang.NoSuchMethodException unused) {
            this.c = null;
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        synchronized (this.f7a) {
            long j = this.b;
            if (j == 0) {
                return null;
            }
            try {
                return bitter.jnibridge.JNIBridge.invoke(j, method.getDeclaringClass(), method, objArr);
            } catch (java.lang.NoSuchMethodError e) {
                if (this.c == null) {
                    java.lang.System.err.println("JNIBridge error: Java interface default methods are only supported since Android Oreo");
                    throw e;
                }
                if ((method.getModifiers() & 1024) != 0) {
                    throw e;
                }
                if (objArr == null) {
                    objArr = new java.lang.Object[0];
                }
                java.lang.Class<?> declaringClass = method.getDeclaringClass();
                return ((java.lang.invoke.MethodHandles.Lookup) this.c.newInstance(declaringClass, 2)).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
            }
        }
    }
}
