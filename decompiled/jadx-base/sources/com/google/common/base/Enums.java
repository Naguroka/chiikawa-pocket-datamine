package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Enums {
    private static final java.util.Map<java.lang.Class<? extends java.lang.Enum<?>>, java.util.Map<java.lang.String, java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>> enumConstantCache = new java.util.WeakHashMap();

    private Enums() {
    }

    public static java.lang.reflect.Field getField(java.lang.Enum<?> enumValue) {
        try {
            return enumValue.getDeclaringClass().getDeclaredField(enumValue.name());
        } catch (java.lang.NoSuchFieldException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static <T extends java.lang.Enum<T>> com.google.common.base.Optional<T> getIfPresent(java.lang.Class<T> enumClass, java.lang.String value) {
        com.google.common.base.Preconditions.checkNotNull(enumClass);
        com.google.common.base.Preconditions.checkNotNull(value);
        return com.google.common.base.Platform.getEnumIfPresent(enumClass, value);
    }

    private static <T extends java.lang.Enum<T>> java.util.Map<java.lang.String, java.lang.ref.WeakReference<? extends java.lang.Enum<?>>> populateCache(java.lang.Class<T> enumClass) {
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.Enum r2 : java.util.EnumSet.allOf(enumClass)) {
            map.put(r2.name(), new java.lang.ref.WeakReference(r2));
        }
        enumConstantCache.put(enumClass, map);
        return map;
    }

    static <T extends java.lang.Enum<T>> java.util.Map<java.lang.String, java.lang.ref.WeakReference<? extends java.lang.Enum<?>>> getEnumConstants(java.lang.Class<T> enumClass) {
        java.util.Map<java.lang.String, java.lang.ref.WeakReference<? extends java.lang.Enum<?>>> mapPopulateCache;
        java.util.Map<java.lang.Class<? extends java.lang.Enum<?>>, java.util.Map<java.lang.String, java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>> map = enumConstantCache;
        synchronized (map) {
            mapPopulateCache = map.get(enumClass);
            if (mapPopulateCache == null) {
                mapPopulateCache = populateCache(enumClass);
            }
        }
        return mapPopulateCache;
    }

    public static <T extends java.lang.Enum<T>> com.google.common.base.Converter<java.lang.String, T> stringConverter(java.lang.Class<T> enumClass) {
        return new com.google.common.base.Enums.StringConverter(enumClass);
    }

    private static final class StringConverter<T extends java.lang.Enum<T>> extends com.google.common.base.Converter<java.lang.String, T> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.Class<T> enumClass;

        StringConverter(java.lang.Class<T> enumClass) {
            this.enumClass = (java.lang.Class) com.google.common.base.Preconditions.checkNotNull(enumClass);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public T doForward(java.lang.String str) {
            return (T) java.lang.Enum.valueOf(this.enumClass, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public java.lang.String doBackward(T enumValue) {
            return enumValue.name();
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object instanceof com.google.common.base.Enums.StringConverter) {
                return this.enumClass.equals(((com.google.common.base.Enums.StringConverter) object).enumClass);
            }
            return false;
        }

        public int hashCode() {
            return this.enumClass.hashCode();
        }

        public java.lang.String toString() {
            return "Enums.stringConverter(" + this.enumClass.getName() + ".class)";
        }
    }
}
