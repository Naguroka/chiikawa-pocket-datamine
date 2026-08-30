package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.reflect.Method f3806a;
    private static java.lang.reflect.Method b;
    private static java.lang.reflect.Method c;

    static {
        try {
            f3806a = java.lang.Class.class.getDeclaredMethod("forName", java.lang.String.class);
            b = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, java.lang.Class[].class);
            c = java.lang.Class.class.getDeclaredMethod("getDeclaredField", java.lang.String.class);
        } catch (java.lang.NoSuchMethodException | java.lang.NullPointerException unused) {
        }
    }

    public static java.lang.Object a(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.Object obj2) {
        try {
            java.lang.reflect.Field fieldA = a(cls, str);
            if (fieldA == null) {
                return obj2;
            }
            fieldA.setAccessible(true);
            return fieldA.get(obj);
        } catch (java.lang.Throwable unused) {
            return obj2;
        }
    }

    public static java.lang.reflect.Field a(java.lang.Class cls, java.lang.String str) {
        if (!a()) {
            return null;
        }
        try {
            java.lang.reflect.Field field = (java.lang.reflect.Field) c.invoke(cls, str);
            try {
                field.setAccessible(true);
            } catch (java.lang.Throwable unused) {
            }
            return field;
        } catch (java.lang.Throwable unused2) {
            return null;
        }
    }

    public static java.lang.reflect.Method a(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr) {
        if (!a()) {
            return null;
        }
        try {
            java.lang.reflect.Method method = (java.lang.reflect.Method) b.invoke(cls, str, clsArr);
            try {
                method.setAccessible(true);
            } catch (java.lang.Throwable unused) {
            }
            return method;
        } catch (java.lang.Throwable unused2) {
            return null;
        }
    }

    public static java.lang.Object a(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object... objArr) {
        try {
            java.lang.reflect.Method methodA = a(cls, str, clsArr);
            if (methodA != null) {
                return methodA.invoke(obj, objArr);
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    private static boolean a() {
        return (f3806a == null || b == null || c == null) ? false : true;
    }
}
