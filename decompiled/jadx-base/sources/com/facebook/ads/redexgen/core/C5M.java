package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C5M {
    public static <T> T A00(T impl, java.lang.Class<T> clazz) {
        java.lang.ClassLoader classLoader = impl.getClass().getClassLoader();
        return clazz.cast(java.lang.reflect.Proxy.newProxyInstance(classLoader, new java.lang.Class[]{clazz}, new com.facebook.ads.redexgen.core.C5L(impl, classLoader)));
    }
}
