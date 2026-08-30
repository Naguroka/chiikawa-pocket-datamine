package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.reflect.Method f1082a;

    public static android.os.IBinder a(android.os.Bundle bundle, java.lang.String str) {
        return com.applovin.impl.xp.f1515a >= 18 ? bundle.getBinder(str) : b(bundle, str);
    }

    private static android.os.IBinder b(android.os.Bundle bundle, java.lang.String str) {
        java.lang.reflect.Method method = f1082a;
        if (method == null) {
            try {
                java.lang.reflect.Method method2 = android.os.Bundle.class.getMethod("getIBinder", java.lang.String.class);
                f1082a = method2;
                method2.setAccessible(true);
                method = f1082a;
            } catch (java.lang.NoSuchMethodException e) {
                com.applovin.impl.oc.b("BundleUtil", "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (android.os.IBinder) method.invoke(bundle, str);
        } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e2) {
            com.applovin.impl.oc.b("BundleUtil", "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }
}
