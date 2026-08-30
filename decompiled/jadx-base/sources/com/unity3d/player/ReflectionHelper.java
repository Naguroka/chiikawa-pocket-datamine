package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class ReflectionHelper {
    protected static boolean LOG = false;
    protected static final boolean LOGV = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.unity3d.player.M[] f3891a = new com.unity3d.player.M[4096];
    private static long b = 0;
    private static long c = 0;
    private static boolean d = false;

    /* JADX WARN: Code duplicated, block: B:29:0x0049  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    private static float a(java.lang.Class cls, java.lang.Class[] clsArr, java.lang.Class[] clsArr2) {
        float f;
        float f2;
        float f3 = 0.1f;
        if (clsArr2.length == 0) {
            return 0.1f;
        }
        int i = 0;
        if ((clsArr == null ? 0 : clsArr.length) + 1 != clsArr2.length) {
            return 0.0f;
        }
        if (clsArr != null) {
            int length = clsArr.length;
            int i2 = 0;
            f = 1.0f;
            while (i < length) {
                java.lang.Class cls2 = clsArr[i];
                int i3 = i2 + 1;
                java.lang.Class cls3 = clsArr2[i2];
                if (cls2.equals(cls3)) {
                    f2 = 1.0f;
                } else if (cls2.isPrimitive() || cls3.isPrimitive()) {
                    f2 = 0.0f;
                } else {
                    try {
                        if (cls2.asSubclass(cls3) != null) {
                            f2 = 0.5f;
                        } else {
                            try {
                                if (cls3.asSubclass(cls2) != null) {
                                    f2 = 0.1f;
                                } else {
                                    f2 = 0.0f;
                                }
                            } catch (java.lang.ClassCastException unused) {
                            }
                        }
                    } catch (java.lang.ClassCastException unused2) {
                    }
                }
                f *= f2;
                i++;
                i2 = i3;
            }
        } else {
            f = 1.0f;
        }
        java.lang.Class cls4 = clsArr2[clsArr2.length - 1];
        if (cls.equals(cls4)) {
            f3 = 1.0f;
        } else if (cls.isPrimitive() || cls4.isPrimitive()) {
            f3 = 0.0f;
        } else {
            try {
                if (cls.asSubclass(cls4) != null) {
                    f3 = 0.5f;
                } else {
                    try {
                        if (cls4.asSubclass(cls) == null) {
                            f3 = 0.0f;
                        }
                    } catch (java.lang.ClassCastException unused3) {
                    }
                }
            } catch (java.lang.ClassCastException unused4) {
            }
        }
        return f * f3;
    }

    private static java.lang.Class a(java.lang.String str, int[] iArr) {
        while (iArr[0] < str.length()) {
            int i = iArr[0];
            iArr[0] = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != '(' && cCharAt != ')') {
                if (cCharAt == 'L') {
                    int iIndexOf = str.indexOf(59, iArr[0]);
                    if (iIndexOf == -1) {
                        return null;
                    }
                    java.lang.String strSubstring = str.substring(iArr[0], iIndexOf);
                    iArr[0] = iIndexOf + 1;
                    try {
                        return java.lang.Class.forName(strSubstring.replace('/', '.'));
                    } catch (java.lang.ClassNotFoundException unused) {
                        return null;
                    }
                }
                if (cCharAt == 'Z') {
                    return java.lang.Boolean.TYPE;
                }
                if (cCharAt == 'I') {
                    return java.lang.Integer.TYPE;
                }
                if (cCharAt == 'F') {
                    return java.lang.Float.TYPE;
                }
                if (cCharAt == 'V') {
                    return java.lang.Void.TYPE;
                }
                if (cCharAt == 'B') {
                    return java.lang.Byte.TYPE;
                }
                if (cCharAt == 'C') {
                    return java.lang.Character.TYPE;
                }
                if (cCharAt == 'S') {
                    return java.lang.Short.TYPE;
                }
                if (cCharAt == 'J') {
                    return java.lang.Long.TYPE;
                }
                if (cCharAt == 'D') {
                    return java.lang.Double.TYPE;
                }
                if (cCharAt == '[') {
                    return java.lang.reflect.Array.newInstance((java.lang.Class<?>) a(str, iArr), 0).getClass();
                }
                com.unity3d.player.AbstractC1749z.Log(5, "! parseType; " + cCharAt + " is not known!");
                return null;
            }
        }
        return null;
    }

    private static synchronized boolean a(com.unity3d.player.M m) {
        com.unity3d.player.M m2 = f3891a[m.d & 4095];
        if (!m.equals(m2)) {
            return false;
        }
        m.e = m2.e;
        return true;
    }

    private static java.lang.Class[] a(java.lang.String str) {
        java.lang.Class clsA;
        int i = 0;
        int[] iArr = {0};
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (iArr[0] < str.length() && (clsA = a(str, iArr)) != null) {
            arrayList.add(clsA);
        }
        java.lang.Class[] clsArr = new java.lang.Class[arrayList.size()];
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            clsArr[i] = (java.lang.Class) it.next();
            i++;
        }
        return clsArr;
    }

    protected static synchronized boolean beginProxyCall(long j) {
        if (j != b) {
            return false;
        }
        c++;
        return true;
    }

    protected static java.lang.Object createInvocationError(long j, boolean z) {
        return new com.unity3d.player.N(j, z);
    }

    protected static synchronized void endProxyCall() {
        long j = c - 1;
        c = j;
        if (0 == j && d) {
            com.unity3d.player.ReflectionHelper.class.notifyAll();
        }
    }

    protected static synchronized void endUnityLaunch() {
        try {
            b++;
            d = true;
            while (c > 0) {
                com.unity3d.player.ReflectionHelper.class.wait();
            }
        } catch (java.lang.InterruptedException unused) {
            com.unity3d.player.AbstractC1749z.Log(6, "Interrupted while waiting for all proxies to exit.");
        }
        d = false;
    }

    protected static java.lang.reflect.Constructor getConstructorID(java.lang.Class cls, java.lang.String str) {
        java.lang.reflect.Constructor<?> constructor;
        com.unity3d.player.M m = new com.unity3d.player.M(cls, "", str);
        if (a(m)) {
            constructor = (java.lang.reflect.Constructor) m.e;
        } else {
            java.lang.Class[] clsArrA = a(str);
            java.lang.reflect.Constructor<?> constructor2 = null;
            float f = 0.0f;
            for (java.lang.reflect.Constructor<?> constructor3 : cls.getConstructors()) {
                float fA = a(java.lang.Void.TYPE, constructor3.getParameterTypes(), clsArrA);
                if (fA > f) {
                    if (fA == 1.0f) {
                        constructor2 = constructor3;
                        break;
                    }
                    constructor2 = constructor3;
                    f = fA;
                }
            }
            synchronized (com.unity3d.player.ReflectionHelper.class) {
                m.e = constructor2;
                f3891a[m.d & 4095] = m;
            }
            constructor = constructor2;
        }
        if (constructor != null) {
            return constructor;
        }
        throw new java.lang.NoSuchMethodError("<init>" + str + " in class " + cls.getName());
    }

    protected static java.lang.reflect.Field getFieldID(java.lang.Class cls, java.lang.String str, java.lang.String str2, boolean z) {
        java.lang.reflect.Field field;
        java.lang.Class superclass = cls;
        com.unity3d.player.M m = new com.unity3d.player.M(superclass, str, str2);
        if (a(m)) {
            field = (java.lang.reflect.Field) m.e;
        } else {
            java.lang.Class[] clsArrA = a(str2);
            float f = 0.0f;
            java.lang.reflect.Field field2 = null;
            while (superclass != null) {
                for (java.lang.reflect.Field field3 : superclass.getDeclaredFields()) {
                    if (z == java.lang.reflect.Modifier.isStatic(field3.getModifiers()) && field3.getName().compareTo(str) == 0) {
                        float fA = a(field3.getType(), null, clsArrA);
                        if (fA > f) {
                            field2 = field3;
                            if (fA == 1.0f) {
                                f = fA;
                                break;
                            }
                            f = fA;
                        } else {
                            continue;
                        }
                    }
                }
                if (f == 1.0f || superclass.isPrimitive() || superclass.isInterface() || superclass.equals(java.lang.Object.class) || superclass.equals(java.lang.Void.TYPE)) {
                    break;
                }
                superclass = superclass.getSuperclass();
            }
            synchronized (com.unity3d.player.ReflectionHelper.class) {
                m.e = field2;
                f3891a[m.d & 4095] = m;
            }
            field = field2;
        }
        if (field != null) {
            return field;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = z ? "static" : "non-static";
        objArr[1] = str;
        objArr[2] = str2;
        objArr[3] = superclass.getName();
        throw new java.lang.NoSuchFieldError(java.lang.String.format("no %s field with name='%s' signature='%s' in class L%s;", objArr));
    }

    protected static java.lang.String getFieldSignature(java.lang.reflect.Field field) {
        java.lang.Class<?> type = field.getType();
        if (!type.isPrimitive()) {
            return type.isArray() ? type.getName().replace('.', '/') : "L" + type.getName().replace('.', '/') + ";";
        }
        java.lang.String name = type.getName();
        if (androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN.equals(name)) {
            return "Z";
        }
        if ("byte".equals(name)) {
            return "B";
        }
        if ("char".equals(name)) {
            return "C";
        }
        if ("double".equals(name)) {
            return "D";
        }
        if (androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT.equals(name)) {
            return "F";
        }
        if ("int".equals(name)) {
            return "I";
        }
        if (com.adjust.sdk.Constants.LONG.equals(name)) {
            return "J";
        }
        return "short".equals(name) ? androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH : name;
    }

    protected static java.lang.reflect.Method getMethodID(java.lang.Class cls, java.lang.String str, java.lang.String str2, boolean z) {
        java.lang.reflect.Method method;
        com.unity3d.player.M m = new com.unity3d.player.M(cls, str, str2);
        if (a(m)) {
            method = (java.lang.reflect.Method) m.e;
        } else {
            java.lang.Class[] clsArrA = a(str2);
            java.lang.reflect.Method method2 = null;
            float f = 0.0f;
            while (cls != null) {
                for (java.lang.reflect.Method method3 : cls.getDeclaredMethods()) {
                    if (z == java.lang.reflect.Modifier.isStatic(method3.getModifiers()) && method3.getName().compareTo(str) == 0) {
                        float fA = a(method3.getReturnType(), method3.getParameterTypes(), clsArrA);
                        if (fA <= f) {
                            continue;
                        } else {
                            if (fA == 1.0f) {
                                method2 = method3;
                                f = fA;
                                break;
                            }
                            method2 = method3;
                            f = fA;
                        }
                    }
                }
                if (f == 1.0f || cls.isPrimitive() || cls.isInterface() || cls.equals(java.lang.Object.class) || cls.equals(java.lang.Void.TYPE)) {
                    break;
                }
                cls = cls.getSuperclass();
            }
            synchronized (com.unity3d.player.ReflectionHelper.class) {
                m.e = method2;
                f3891a[m.d & 4095] = m;
            }
            method = method2;
        }
        if (method != null) {
            return method;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = z ? "static" : "non-static";
        objArr[1] = str;
        objArr[2] = str2;
        objArr[3] = cls.getName();
        throw new java.lang.NoSuchMethodError(java.lang.String.format("no %s method with name='%s' signature='%s' in class L%s;", objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyFinalize(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native java.lang.Object nativeProxyInvoke(long j, java.lang.String str, java.lang.Object[] objArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyJNIFreeGCHandle(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyLogJNIInvokeException(long j);

    protected static java.lang.Object newProxyInstance(com.unity3d.player.UnityPlayer unityPlayer, long j, java.lang.Class cls) {
        return newProxyInstance(unityPlayer, j, new java.lang.Class[]{cls});
    }

    protected static java.lang.Object newProxyInstance(com.unity3d.player.UnityPlayer unityPlayer, long j, java.lang.Class[] clsArr) {
        return java.lang.reflect.Proxy.newProxyInstance(com.unity3d.player.ReflectionHelper.class.getClassLoader(), clsArr, new com.unity3d.player.L(unityPlayer, j));
    }
}
