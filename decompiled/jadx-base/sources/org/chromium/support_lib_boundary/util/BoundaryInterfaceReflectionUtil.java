package org.chromium.support_lib_boundary.util;

/* JADX INFO: loaded from: classes6.dex */
public class BoundaryInterfaceReflectionUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static boolean instanceOfInOwnClassLoader(java.lang.Object obj, java.lang.String str) {
        try {
            return java.lang.Class.forName(str, false, obj.getClass().getClassLoader()).isInstance(obj);
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public static java.lang.reflect.Method dupeMethod(java.lang.reflect.Method method, java.lang.ClassLoader classLoader) throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        return java.lang.Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    public static <T> T castToSuppLibClass(java.lang.Class<T> cls, java.lang.reflect.InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(java.lang.reflect.Proxy.newProxyInstance(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.class.getClassLoader(), new java.lang.Class[]{cls}, invocationHandler));
    }

    public static java.lang.reflect.InvocationHandler createInvocationHandlerFor(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return new org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.InvocationHandlerWithDelegateGetter(obj);
    }

    public static java.lang.reflect.InvocationHandler[] createInvocationHandlersForArray(java.lang.Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        java.lang.reflect.InvocationHandler[] invocationHandlerArr = new java.lang.reflect.InvocationHandler[length];
        for (int i = 0; i < length; i++) {
            invocationHandlerArr[i] = createInvocationHandlerFor(objArr[i]);
        }
        return invocationHandlerArr;
    }

    public static java.lang.Object getDelegateFromInvocationHandler(java.lang.reflect.InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.InvocationHandlerWithDelegateGetter) invocationHandler).getDelegate();
    }

    private static class InvocationHandlerWithDelegateGetter implements java.lang.reflect.InvocationHandler {
        private final java.lang.Object mDelegate;

        public InvocationHandlerWithDelegateGetter(java.lang.Object obj) {
            this.mDelegate = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
            try {
                return org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.dupeMethod(method, this.mDelegate.getClass().getClassLoader()).invoke(this.mDelegate, objArr);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getTargetException();
            } catch (java.lang.ReflectiveOperationException e2) {
                throw new java.lang.RuntimeException("Reflection failed for method " + method, e2);
            }
        }

        public java.lang.Object getDelegate() {
            return this.mDelegate;
        }
    }

    private static boolean isDebuggable() {
        return "eng".equals(android.os.Build.TYPE) || "userdebug".equals(android.os.Build.TYPE);
    }

    public static boolean containsFeature(java.util.Collection<java.lang.String> collection, java.lang.String str) {
        return collection.contains(str) || (isDebuggable() && collection.contains(new java.lang.StringBuilder().append(str).append(org.chromium.support_lib_boundary.util.Features.DEV_SUFFIX).toString()));
    }

    public static boolean containsFeature(java.lang.String[] strArr, java.lang.String str) {
        return containsFeature(java.util.Arrays.asList(strArr), str);
    }
}
