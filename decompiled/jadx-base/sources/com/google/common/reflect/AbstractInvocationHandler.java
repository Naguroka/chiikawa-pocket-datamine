package com.google.common.reflect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.reflect.ElementTypesAreNonnullByDefault
public abstract class AbstractInvocationHandler implements java.lang.reflect.InvocationHandler {
    private static final java.lang.Object[] NO_ARGS = new java.lang.Object[0];

    @javax.annotation.CheckForNull
    protected abstract java.lang.Object handleInvocation(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args) throws java.lang.Throwable;

    @Override // java.lang.reflect.InvocationHandler
    @javax.annotation.CheckForNull
    public final java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, @javax.annotation.CheckForNull java.lang.Object[] args) throws java.lang.Throwable {
        if (args == null) {
            args = NO_ARGS;
        }
        if (args.length == 0 && method.getName().equals("hashCode")) {
            return java.lang.Integer.valueOf(hashCode());
        }
        if (args.length == 1 && method.getName().equals("equals") && method.getParameterTypes()[0] == java.lang.Object.class) {
            java.lang.Object obj = args[0];
            if (obj == null) {
                return false;
            }
            if (proxy == obj) {
                return true;
            }
            return java.lang.Boolean.valueOf(isProxyOfSameInterfaces(obj, proxy.getClass()) && equals(java.lang.reflect.Proxy.getInvocationHandler(obj)));
        }
        if (args.length == 0 && method.getName().equals("toString")) {
            return toString();
        }
        return handleInvocation(proxy, method, args);
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public java.lang.String toString() {
        return super.toString();
    }

    private static boolean isProxyOfSameInterfaces(java.lang.Object arg, java.lang.Class<?> proxyClass) {
        return proxyClass.isInstance(arg) || (java.lang.reflect.Proxy.isProxyClass(arg.getClass()) && java.util.Arrays.equals(arg.getClass().getInterfaces(), proxyClass.getInterfaces()));
    }
}
