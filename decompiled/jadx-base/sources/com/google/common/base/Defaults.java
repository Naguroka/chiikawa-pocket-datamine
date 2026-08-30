package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Defaults {
    private static final java.lang.Double DOUBLE_DEFAULT = java.lang.Double.valueOf(0.0d);
    private static final java.lang.Float FLOAT_DEFAULT = java.lang.Float.valueOf(0.0f);

    private Defaults() {
    }

    @javax.annotation.CheckForNull
    public static <T> T defaultValue(java.lang.Class<T> cls) {
        com.google.common.base.Preconditions.checkNotNull(cls);
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls == java.lang.Boolean.TYPE) {
            return (T) java.lang.Boolean.FALSE;
        }
        if (cls == java.lang.Character.TYPE) {
            return (T) (char) 0;
        }
        if (cls == java.lang.Byte.TYPE) {
            return (T) (byte) 0;
        }
        if (cls == java.lang.Short.TYPE) {
            return (T) (short) 0;
        }
        if (cls == java.lang.Integer.TYPE) {
            return (T) 0;
        }
        if (cls == java.lang.Long.TYPE) {
            return (T) 0L;
        }
        if (cls == java.lang.Float.TYPE) {
            return (T) FLOAT_DEFAULT;
        }
        if (cls == java.lang.Double.TYPE) {
            return (T) DOUBLE_DEFAULT;
        }
        return null;
    }
}
