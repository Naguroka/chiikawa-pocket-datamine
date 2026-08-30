package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class ObjectArrays {
    private ObjectArrays() {
    }

    public static <T> T[] newArray(java.lang.Class<T> cls, int i) {
        return (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, i));
    }

    public static <T> T[] newArray(T[] tArr, int i) {
        return (T[]) com.google.common.collect.Platform.newArray(tArr, i);
    }

    public static <T> T[] concat(T[] tArr, T[] tArr2, java.lang.Class<T> cls) {
        T[] tArr3 = (T[]) newArray(cls, tArr.length + tArr2.length);
        java.lang.System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        java.lang.System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static <T> T[] concat(@com.google.common.collect.ParametricNullness T t, T[] tArr) {
        T[] tArr2 = (T[]) newArray(tArr, tArr.length + 1);
        tArr2[0] = t;
        java.lang.System.arraycopy(tArr, 0, tArr2, 1, tArr.length);
        return tArr2;
    }

    public static <T> T[] concat(T[] tArr, @com.google.common.collect.ParametricNullness T t) {
        T[] tArr2 = (T[]) java.util.Arrays.copyOf(tArr, tArr.length + 1);
        tArr2[tArr.length] = t;
        return tArr2;
    }

    static <T> T[] toArrayImpl(java.util.Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) newArray(tArr, size);
        }
        fillArray(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    static <T> T[] toArrayImpl(java.lang.Object[] objArr, int i, int i2, T[] tArr) {
        com.google.common.base.Preconditions.checkPositionIndexes(i, i + i2, objArr.length);
        if (tArr.length < i2) {
            tArr = (T[]) newArray(tArr, i2);
        } else if (tArr.length > i2) {
            tArr[i2] = null;
        }
        java.lang.System.arraycopy(objArr, i, tArr, 0, i2);
        return tArr;
    }

    static java.lang.Object[] toArrayImpl(java.util.Collection<?> c) {
        return fillArray(c, new java.lang.Object[c.size()]);
    }

    static java.lang.Object[] copyAsObjectArray(java.lang.Object[] elements, int offset, int length) {
        com.google.common.base.Preconditions.checkPositionIndexes(offset, offset + length, elements.length);
        if (length == 0) {
            return new java.lang.Object[0];
        }
        java.lang.Object[] objArr = new java.lang.Object[length];
        java.lang.System.arraycopy(elements, offset, objArr, 0, length);
        return objArr;
    }

    private static java.lang.Object[] fillArray(java.lang.Iterable<?> elements, java.lang.Object[] array) {
        java.util.Iterator<?> it = elements.iterator();
        int i = 0;
        while (it.hasNext()) {
            array[i] = it.next();
            i++;
        }
        return array;
    }

    static void swap(java.lang.Object[] array, int i, int j) {
        java.lang.Object obj = array[i];
        array[i] = array[j];
        array[j] = obj;
    }

    static java.lang.Object[] checkElementsNotNull(java.lang.Object... array) {
        checkElementsNotNull(array, array.length);
        return array;
    }

    static java.lang.Object[] checkElementsNotNull(java.lang.Object[] array, int length) {
        for (int i = 0; i < length; i++) {
            checkElementNotNull(array[i], i);
        }
        return array;
    }

    static java.lang.Object checkElementNotNull(@javax.annotation.CheckForNull java.lang.Object element, int index) {
        if (element != null) {
            return element;
        }
        throw new java.lang.NullPointerException("at index " + index);
    }
}
