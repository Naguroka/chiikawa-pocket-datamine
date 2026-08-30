package com.google.common.reflect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.reflect.ElementTypesAreNonnullByDefault
abstract class TypeCapture<T> {
    TypeCapture() {
    }

    final java.lang.reflect.Type capture() {
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        com.google.common.base.Preconditions.checkArgument(genericSuperclass instanceof java.lang.reflect.ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
