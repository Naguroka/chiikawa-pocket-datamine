package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> f3802a;

    public static class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Class<? extends T> f3803a;
        public final T b;
    }

    static {
        java.util.HashMap map = new java.util.HashMap();
        f3802a = map;
        java.lang.Class cls = java.lang.Boolean.TYPE;
        map.put(java.lang.Boolean.class, cls);
        map.put(java.lang.Byte.class, java.lang.Byte.TYPE);
        map.put(java.lang.Character.class, java.lang.Character.TYPE);
        map.put(java.lang.Short.class, java.lang.Short.TYPE);
        java.lang.Class cls2 = java.lang.Integer.TYPE;
        map.put(java.lang.Integer.class, cls2);
        java.lang.Class cls3 = java.lang.Float.TYPE;
        map.put(java.lang.Float.class, cls3);
        java.lang.Class cls4 = java.lang.Long.TYPE;
        map.put(java.lang.Long.class, cls4);
        map.put(java.lang.Double.class, java.lang.Double.TYPE);
        map.put(cls, cls);
        java.lang.Class cls5 = java.lang.Byte.TYPE;
        map.put(cls5, cls5);
        java.lang.Class cls6 = java.lang.Character.TYPE;
        map.put(cls6, cls6);
        java.lang.Class cls7 = java.lang.Short.TYPE;
        map.put(cls7, cls7);
        map.put(cls2, cls2);
        map.put(cls3, cls3);
        map.put(cls4, cls4);
        java.lang.Class cls8 = java.lang.Double.TYPE;
        map.put(cls8, cls8);
    }

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        try {
            a(java.lang.Class.forName(str), str2, objArr);
        } catch (java.lang.Exception unused) {
        }
    }

    private static java.lang.Object[] b(java.lang.Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            java.lang.Object obj = objArr[i];
            if (obj == null || !(obj instanceof com.pgl.ssdk.q0.a)) {
                objArr2[i] = obj;
            } else {
                objArr2[i] = ((com.pgl.ssdk.q0.a) obj).b;
            }
        }
        return objArr2;
    }

    private static java.lang.reflect.Method a(java.lang.Class<?> cls, java.lang.String str, java.lang.Class... clsArr) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        java.lang.reflect.Method methodA = a(cls.getDeclaredMethods(), str, (java.lang.Class<?>[]) clsArr);
        if (methodA == null) {
            if (cls.getSuperclass() != null) {
                return a((java.lang.Class<?>) cls.getSuperclass(), str, clsArr);
            }
            throw new java.lang.NoSuchMethodException();
        }
        methodA.setAccessible(true);
        return methodA;
    }

    private static java.lang.reflect.Method a(java.lang.reflect.Method[] methodArr, java.lang.String str, java.lang.Class<?>[] clsArr) {
        if (str != null) {
            for (java.lang.reflect.Method method : methodArr) {
                if (method.getName().equals(str) && a(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new java.lang.NullPointerException("Method name must not be null.");
    }

    private static boolean a(java.lang.Class<?>[] clsArr, java.lang.Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!clsArr[i].isAssignableFrom(clsArr2[i])) {
                java.util.Map<java.lang.Class<?>, java.lang.Class<?>> map = f3802a;
                if (!map.containsKey(clsArr[i]) || !map.get(clsArr[i]).equals(map.get(clsArr2[i]))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void a(java.lang.Class<?> cls, java.lang.String str, java.lang.Object... objArr) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        a(cls, str, (java.lang.Class[]) a(objArr)).invoke(null, b(objArr));
    }

    private static java.lang.Class<?>[] a(java.lang.Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        java.lang.Class<?>[] clsArr = new java.lang.Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            java.lang.Object obj = objArr[i];
            if (obj != null && (obj instanceof com.pgl.ssdk.q0.a)) {
                clsArr[i] = ((com.pgl.ssdk.q0.a) obj).f3803a;
            } else {
                clsArr[i] = obj == null ? null : obj.getClass();
            }
        }
        return clsArr;
    }
}
