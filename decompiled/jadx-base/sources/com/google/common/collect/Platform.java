package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class Platform {
    static int reduceExponentIfGwt(int exponent) {
        return exponent;
    }

    static int reduceIterationsIfGwt(int iterations) {
        return iterations;
    }

    static <K, V> java.util.Map<K, V> newHashMapWithExpectedSize(int expectedSize) {
        return com.google.common.collect.CompactHashMap.createWithExpectedSize(expectedSize);
    }

    static <K, V> java.util.Map<K, V> newLinkedHashMapWithExpectedSize(int expectedSize) {
        return com.google.common.collect.CompactLinkedHashMap.createWithExpectedSize(expectedSize);
    }

    static <E> java.util.Set<E> newHashSetWithExpectedSize(int expectedSize) {
        return com.google.common.collect.CompactHashSet.createWithExpectedSize(expectedSize);
    }

    static <E> java.util.Set<E> newLinkedHashSetWithExpectedSize(int expectedSize) {
        return com.google.common.collect.CompactLinkedHashSet.createWithExpectedSize(expectedSize);
    }

    static <K, V> java.util.Map<K, V> preservesInsertionOrderOnPutsMap() {
        return com.google.common.collect.CompactHashMap.create();
    }

    static <E> java.util.Set<E> preservesInsertionOrderOnAddsSet() {
        return com.google.common.collect.CompactHashSet.create();
    }

    static <T> T[] newArray(T[] tArr, int i) {
        if (tArr.length != 0) {
            tArr = (T[]) java.util.Arrays.copyOf(tArr, 0);
        }
        return (T[]) java.util.Arrays.copyOf(tArr, i);
    }

    static <T> T[] copy(java.lang.Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) java.util.Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    static com.google.common.collect.MapMaker tryWeakKeys(com.google.common.collect.MapMaker mapMaker) {
        return mapMaker.weakKeys();
    }

    static <E extends java.lang.Enum<E>> java.lang.Class<E> getDeclaringClassOrObjectForJ2cl(E e) {
        return e.getDeclaringClass();
    }

    private Platform() {
    }
}
