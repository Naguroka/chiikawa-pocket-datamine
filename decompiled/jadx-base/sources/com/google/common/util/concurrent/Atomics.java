package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public final class Atomics {
    private Atomics() {
    }

    public static <V> java.util.concurrent.atomic.AtomicReference<V> newReference() {
        return new java.util.concurrent.atomic.AtomicReference<>();
    }

    public static <V> java.util.concurrent.atomic.AtomicReference<V> newReference(@com.google.common.util.concurrent.ParametricNullness V initialValue) {
        return new java.util.concurrent.atomic.AtomicReference<>(initialValue);
    }

    public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> newReferenceArray(int length) {
        return new java.util.concurrent.atomic.AtomicReferenceArray<>(length);
    }

    public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> newReferenceArray(E[] array) {
        return new java.util.concurrent.atomic.AtomicReferenceArray<>(array);
    }
}
