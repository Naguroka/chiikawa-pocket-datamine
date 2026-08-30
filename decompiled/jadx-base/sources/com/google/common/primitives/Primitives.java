package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
public final class Primitives {
    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> PRIMITIVE_TO_WRAPPER_TYPE;
    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> WRAPPER_TO_PRIMITIVE_TYPE;

    private Primitives() {
    }

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(16);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(16);
        add(linkedHashMap, linkedHashMap2, java.lang.Boolean.TYPE, java.lang.Boolean.class);
        add(linkedHashMap, linkedHashMap2, java.lang.Byte.TYPE, java.lang.Byte.class);
        add(linkedHashMap, linkedHashMap2, java.lang.Character.TYPE, java.lang.Character.class);
        add(linkedHashMap, linkedHashMap2, java.lang.Double.TYPE, java.lang.Double.class);
        add(linkedHashMap, linkedHashMap2, java.lang.Float.TYPE, java.lang.Float.class);
        add(linkedHashMap, linkedHashMap2, java.lang.Integer.TYPE, java.lang.Integer.class);
        add(linkedHashMap, linkedHashMap2, java.lang.Long.TYPE, java.lang.Long.class);
        add(linkedHashMap, linkedHashMap2, java.lang.Short.TYPE, java.lang.Short.class);
        add(linkedHashMap, linkedHashMap2, java.lang.Void.TYPE, java.lang.Void.class);
        PRIMITIVE_TO_WRAPPER_TYPE = java.util.Collections.unmodifiableMap(linkedHashMap);
        WRAPPER_TO_PRIMITIVE_TYPE = java.util.Collections.unmodifiableMap(linkedHashMap2);
    }

    private static void add(java.util.Map<java.lang.Class<?>, java.lang.Class<?>> forward, java.util.Map<java.lang.Class<?>, java.lang.Class<?>> backward, java.lang.Class<?> key, java.lang.Class<?> value) {
        forward.put(key, value);
        backward.put(value, key);
    }

    public static java.util.Set<java.lang.Class<?>> allPrimitiveTypes() {
        return PRIMITIVE_TO_WRAPPER_TYPE.keySet();
    }

    public static java.util.Set<java.lang.Class<?>> allWrapperTypes() {
        return WRAPPER_TO_PRIMITIVE_TYPE.keySet();
    }

    public static boolean isWrapperType(java.lang.Class<?> type) {
        return WRAPPER_TO_PRIMITIVE_TYPE.containsKey(com.google.common.base.Preconditions.checkNotNull(type));
    }

    public static <T> java.lang.Class<T> wrap(java.lang.Class<T> type) {
        com.google.common.base.Preconditions.checkNotNull(type);
        java.lang.Class<T> cls = (java.lang.Class) PRIMITIVE_TO_WRAPPER_TYPE.get(type);
        return cls == null ? type : cls;
    }

    public static <T> java.lang.Class<T> unwrap(java.lang.Class<T> type) {
        com.google.common.base.Preconditions.checkNotNull(type);
        java.lang.Class<T> cls = (java.lang.Class) WRAPPER_TO_PRIMITIVE_TYPE.get(type);
        return cls == null ? type : cls;
    }
}
