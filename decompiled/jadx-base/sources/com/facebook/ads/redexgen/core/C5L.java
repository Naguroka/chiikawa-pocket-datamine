package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5L, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C5L<T> implements java.lang.reflect.InvocationHandler {
    public static byte[] A02;
    public java.lang.ClassLoader A00;
    public T A01;

    static {
        A03();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 102);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{49, 32, 57};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5L != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    public C5L(T impl, java.lang.ClassLoader classLoader) {
        this.A01 = impl;
        this.A00 = classLoader;
    }

    public static java.lang.Object A00(final java.lang.ClassLoader classLoader, java.lang.reflect.Method method) {
        java.lang.Class<?> returnType = method.getReturnType();
        java.lang.Object result = java.lang.Void.TYPE;
        if (returnType.equals(result)) {
            return null;
        }
        if (returnType.isPrimitive()) {
            java.lang.Object result2 = java.lang.reflect.Array.newInstance(method.getReturnType(), 1);
            return java.lang.reflect.Array.get(result2, 0);
        }
        if (returnType.equals(java.lang.String.class)) {
            return A02(0, 0, 70);
        }
        if (!returnType.isInterface()) {
            return null;
        }
        return java.lang.reflect.Proxy.newProxyInstance(classLoader, new java.lang.Class[]{returnType}, new java.lang.reflect.InvocationHandler() { // from class: com.facebook.ads.redexgen.X.5K
            @Override // java.lang.reflect.InvocationHandler
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method2, java.lang.Object[] objArr) {
                return com.facebook.ads.redexgen.core.C5L.A00(classLoader, method2);
            }
        });
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5L != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    public final T A04() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5L != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        try {
            return method.invoke(this.A01, objArr);
        } catch (java.lang.Throwable t) {
            if (t instanceof java.lang.reflect.InvocationTargetException) {
                java.lang.Throwable targetException = ((java.lang.reflect.InvocationTargetException) t).getTargetException();
                if (targetException instanceof com.facebook.ads.redexgen.core.AnonymousClass21) {
                    throw new java.lang.IllegalStateException(targetException.getMessage());
                }
            }
            java.lang.Object objA00 = A00(this.A00, method);
            com.facebook.ads.redexgen.core.C1198Zr c1198ZrA00 = com.facebook.ads.redexgen.core.AbstractC04997i.A00();
            if (c1198ZrA00 != null) {
                c1198ZrA00.A07().AA0(A02(0, 3, 54), com.facebook.ads.redexgen.core.C8E.A0O, new com.facebook.ads.redexgen.core.C8F(t));
                return objA00;
            }
            return objA00;
        }
    }
}
