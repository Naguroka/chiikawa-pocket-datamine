package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class Ja {
    private static java.util.Map<java.lang.String, java.lang.reflect.Method> IL = new java.util.HashMap();
    private static final java.util.HashMap<java.lang.Class<?>, java.lang.Class<?>> bX;
    public static final java.lang.Class<?>[] bg;

    static {
        java.util.HashMap<java.lang.Class<?>, java.lang.Class<?>> map = new java.util.HashMap<>();
        bX = map;
        map.put(java.lang.Boolean.TYPE, java.lang.Boolean.class);
        map.put(java.lang.Byte.TYPE, java.lang.Byte.class);
        map.put(java.lang.Character.TYPE, java.lang.Character.class);
        map.put(java.lang.Short.TYPE, java.lang.Short.class);
        map.put(java.lang.Integer.TYPE, java.lang.Integer.class);
        map.put(java.lang.Long.TYPE, java.lang.Long.class);
        map.put(java.lang.Double.TYPE, java.lang.Double.class);
        map.put(java.lang.Float.TYPE, java.lang.Float.class);
        map.put(java.lang.Void.TYPE, java.lang.Void.class);
        bg = new java.lang.Class[0];
    }

    public static int bg(android.content.Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private static java.lang.String IL(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>... clsArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(cls.toString()).append("#").append(str).append("#").append(cls.getClassLoader() != null ? java.lang.Integer.valueOf(cls.getClassLoader().hashCode()) : "");
        if (clsArr != null && clsArr.length > 0) {
            for (java.lang.Class<?> cls2 : clsArr) {
                sb.append(cls2.toString()).append("#");
            }
        } else {
            sb.append(java.lang.Void.class.toString());
        }
        return sb.toString();
    }

    public static java.lang.reflect.Method bg(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>... clsArr) {
        java.lang.reflect.Method declaredMethod;
        java.lang.String strIL = IL(cls, str, clsArr);
        synchronized (IL) {
            declaredMethod = IL.get(strIL);
        }
        if (declaredMethod != null) {
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            return declaredMethod;
        }
        while (cls != null) {
            try {
                declaredMethod = cls.getDeclaredMethod(str, clsArr);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            if (declaredMethod == null) {
                try {
                    for (java.lang.reflect.Method method : cls.getDeclaredMethods()) {
                        if (method != null && android.text.TextUtils.equals(method.getName(), str)) {
                            java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                            if (clsArr != null && parameterTypes != null && clsArr.length == parameterTypes.length) {
                                boolean z = true;
                                for (int i = 0; i < clsArr.length; i++) {
                                    if (!bg(clsArr[i], parameterTypes[i])) {
                                        z = false;
                                    }
                                }
                                if (z) {
                                    declaredMethod = method;
                                }
                            }
                        }
                    }
                } catch (java.lang.Throwable unused2) {
                }
            }
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                synchronized (IL) {
                    IL.put(strIL, declaredMethod);
                }
                return declaredMethod;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public static boolean bg(java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (cls.isPrimitive() && !cls2.isPrimitive()) {
            cls = bX.get(cls);
        }
        if (cls2.isPrimitive() && !cls.isPrimitive()) {
            cls2 = bX.get(cls2);
        }
        return cls2.isAssignableFrom(cls);
    }

    public static java.lang.Object bg(java.lang.Object obj, java.lang.String str, java.lang.Object... objArr) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        return bg(obj, str, objArr, bg(objArr));
    }

    public static java.lang.Object bg(java.lang.Object obj, java.lang.String str, java.lang.Object[] objArr, java.lang.Class<?>[] clsArr) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Method methodBg = bg(obj.getClass(), str, clsArr);
        if (methodBg != null) {
            return methodBg.invoke(obj, objArr);
        }
        throw new java.lang.NoSuchMethodException(str);
    }

    public static java.lang.Class<?>[] bg(java.lang.Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            java.lang.Class<?>[] clsArr = new java.lang.Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                java.lang.Object obj = objArr[i];
                clsArr[i] = obj == null ? null : obj.getClass();
            }
            return clsArr;
        }
        return bg;
    }

    public static int bg(android.content.Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
