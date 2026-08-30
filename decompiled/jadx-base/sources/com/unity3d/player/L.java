package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class L implements java.lang.reflect.InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Runnable f3876a;
    private com.unity3d.player.UnityPlayer b;
    private long c;
    final /* synthetic */ long d;

    L(com.unity3d.player.UnityPlayer unityPlayer, long j) {
        this.d = j;
        long j2 = com.unity3d.player.ReflectionHelper.b;
        this.f3876a = new com.unity3d.player.O(j2, j);
        this.b = unityPlayer;
        this.c = j2;
    }

    private static java.lang.Object a(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr, com.unity3d.player.N n) {
        if (objArr == null) {
            try {
                try {
                    objArr = new java.lang.Object[0];
                } catch (java.lang.NoClassDefFoundError unused) {
                    com.unity3d.player.AbstractC1749z.Log(6, java.lang.String.format("Java interface default methods are only supported since Android Oreo", new java.lang.Object[0]));
                    com.unity3d.player.ReflectionHelper.nativeProxyLogJNIInvokeException(n.f3880a);
                    n.f3880a = 0L;
                    return null;
                }
            } catch (java.lang.Throwable th) {
                long j = n.f3880a;
                if (j != 0) {
                    com.unity3d.player.ReflectionHelper.nativeProxyJNIFreeGCHandle(j);
                }
                throw th;
            }
        }
        java.lang.Class<?> declaringClass = method.getDeclaringClass();
        java.lang.reflect.Constructor declaredConstructor = java.lang.invoke.MethodHandles.Lookup.class.getDeclaredConstructor(java.lang.Class.class, java.lang.Integer.TYPE);
        declaredConstructor.setAccessible(true);
        java.lang.Object objInvokeWithArguments = ((java.lang.invoke.MethodHandles.Lookup) declaredConstructor.newInstance(declaringClass, 2)).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
        long j2 = n.f3880a;
        if (j2 != 0) {
            com.unity3d.player.ReflectionHelper.nativeProxyJNIFreeGCHandle(j2);
        }
        return objInvokeWithArguments;
    }

    protected void finalize() throws java.lang.Throwable {
        this.b.queueGLThreadEvent(this.f3876a);
        super.finalize();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        if (!com.unity3d.player.ReflectionHelper.beginProxyCall(this.c)) {
            com.unity3d.player.AbstractC1749z.Log(6, "Scripting proxy object was destroyed, because Unity player was unloaded.");
            return null;
        }
        try {
            java.lang.Object objNativeProxyInvoke = com.unity3d.player.ReflectionHelper.nativeProxyInvoke(this.d, method.getName(), objArr);
            if (!(objNativeProxyInvoke instanceof com.unity3d.player.N)) {
                return objNativeProxyInvoke;
            }
            com.unity3d.player.N n = (com.unity3d.player.N) objNativeProxyInvoke;
            if (n.b && (method.getModifiers() & 1024) == 0) {
                return a(obj, method, objArr, n);
            }
            com.unity3d.player.ReflectionHelper.nativeProxyLogJNIInvokeException(n.f3880a);
            return null;
        } finally {
            com.unity3d.player.ReflectionHelper.endProxyCall();
        }
    }
}
