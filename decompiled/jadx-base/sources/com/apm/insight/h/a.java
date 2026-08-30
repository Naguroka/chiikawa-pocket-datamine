package com.apm.insight.h;

/* JADX INFO: compiled from: JavaCalls.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> f406a;

    /* JADX INFO: renamed from: com.apm.insight.h.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JavaCalls.java */
    public static class C0018a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Class<? extends T> f407a;
        public final T b;
    }

    static {
        java.util.HashMap map = new java.util.HashMap();
        f406a = map;
        map.put(java.lang.Boolean.class, java.lang.Boolean.TYPE);
        map.put(java.lang.Byte.class, java.lang.Byte.TYPE);
        map.put(java.lang.Character.class, java.lang.Character.TYPE);
        map.put(java.lang.Short.class, java.lang.Short.TYPE);
        map.put(java.lang.Integer.class, java.lang.Integer.TYPE);
        map.put(java.lang.Float.class, java.lang.Float.TYPE);
        map.put(java.lang.Long.class, java.lang.Long.TYPE);
        map.put(java.lang.Double.class, java.lang.Double.TYPE);
        java.lang.Class cls = java.lang.Boolean.TYPE;
        map.put(cls, cls);
        java.lang.Class cls2 = java.lang.Byte.TYPE;
        map.put(cls2, cls2);
        java.lang.Class cls3 = java.lang.Character.TYPE;
        map.put(cls3, cls3);
        java.lang.Class cls4 = java.lang.Short.TYPE;
        map.put(cls4, cls4);
        java.lang.Class cls5 = java.lang.Integer.TYPE;
        map.put(cls5, cls5);
        java.lang.Class cls6 = java.lang.Float.TYPE;
        map.put(cls6, cls6);
        java.lang.Class cls7 = java.lang.Long.TYPE;
        map.put(cls7, cls7);
        java.lang.Class cls8 = java.lang.Double.TYPE;
        map.put(cls8, cls8);
    }

    public static <T> T a(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.reflect.Method method;
        boolean z;
        java.lang.Class<?> cls;
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName(str);
            java.lang.Class<?>[] clsArr = new java.lang.Class[4];
            for (int i = 0; i < 4; i++) {
                java.lang.Object obj = objArr[i];
                if (obj != null && (obj instanceof com.apm.insight.h.a.C0018a)) {
                    cls = ((com.apm.insight.h.a.C0018a) obj).f407a;
                } else {
                    cls = obj == null ? null : obj.getClass();
                }
                clsArr[i] = cls;
            }
            while (true) {
                java.lang.reflect.Method[] declaredMethods = cls2.getDeclaredMethods();
                int length = declaredMethods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        method = null;
                        break;
                    }
                    method = declaredMethods[i2];
                    if (method.getName().equals(str2)) {
                        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes == null || parameterTypes.length != 4) {
                            z = false;
                            break;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= parameterTypes.length) {
                                z = true;
                                break;
                            }
                            if (!parameterTypes[i3].isAssignableFrom(clsArr[i3])) {
                                java.util.Map<java.lang.Class<?>, java.lang.Class<?>> map = f406a;
                                if (map.containsKey(parameterTypes[i3]) && map.get(parameterTypes[i3]).equals(map.get(clsArr[i3]))) {
                                }
                                z = false;
                                break;
                            }
                            i3++;
                        }
                        if (z) {
                            break;
                        }
                    }
                    i2++;
                }
                if (method == null) {
                    if (cls2.getSuperclass() != null) {
                        cls2 = cls2.getSuperclass();
                    } else {
                        throw new java.lang.NoSuchMethodException();
                    }
                } else {
                    method.setAccessible(true);
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    for (int i4 = 0; i4 < 4; i4++) {
                        java.lang.Object obj2 = objArr[i4];
                        if (obj2 != null && (obj2 instanceof com.apm.insight.h.a.C0018a)) {
                            objArr2[i4] = ((com.apm.insight.h.a.C0018a) obj2).b;
                        } else {
                            objArr2[i4] = obj2;
                        }
                    }
                    return (T) method.invoke(null, objArr2);
                }
            }
        } catch (java.lang.Exception e) {
            android.util.Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str, e);
            return null;
        }
    }
}
