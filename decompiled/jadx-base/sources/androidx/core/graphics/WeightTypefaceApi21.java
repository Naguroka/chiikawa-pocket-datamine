package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
final class WeightTypefaceApi21 {
    private static final java.lang.String NATIVE_CREATE_FROM_TYPEFACE_METHOD = "nativeCreateFromTypeface";
    private static final java.lang.String NATIVE_CREATE_WEIGHT_ALIAS_METHOD = "nativeCreateWeightAlias";
    private static final java.lang.String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final java.lang.String TAG = "WeightTypeface";
    private static final java.lang.reflect.Constructor<android.graphics.Typeface> sConstructor;
    private static final java.lang.reflect.Method sNativeCreateFromTypeface;
    private static final java.lang.reflect.Method sNativeCreateWeightAlias;
    private static final java.lang.reflect.Field sNativeInstance;
    private static final java.lang.Object sWeightCacheLock;
    private static final androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> sWeightTypefaceCache;

    static {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Method declaredMethod;
        java.lang.reflect.Method declaredMethod2;
        java.lang.reflect.Constructor<android.graphics.Typeface> declaredConstructor;
        try {
            declaredField = android.graphics.Typeface.class.getDeclaredField(NATIVE_INSTANCE_FIELD);
            declaredMethod = android.graphics.Typeface.class.getDeclaredMethod(NATIVE_CREATE_FROM_TYPEFACE_METHOD, java.lang.Long.TYPE, java.lang.Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod2 = android.graphics.Typeface.class.getDeclaredMethod(NATIVE_CREATE_WEIGHT_ALIAS_METHOD, java.lang.Long.TYPE, java.lang.Integer.TYPE);
            declaredMethod2.setAccessible(true);
            declaredConstructor = android.graphics.Typeface.class.getDeclaredConstructor(java.lang.Long.TYPE);
            declaredConstructor.setAccessible(true);
        } catch (java.lang.NoSuchFieldException | java.lang.NoSuchMethodException e) {
            android.util.Log.e(TAG, e.getClass().getName(), e);
            declaredField = null;
            declaredMethod = null;
            declaredMethod2 = null;
            declaredConstructor = null;
        }
        sNativeInstance = declaredField;
        sNativeCreateFromTypeface = declaredMethod;
        sNativeCreateWeightAlias = declaredMethod2;
        sConstructor = declaredConstructor;
        sWeightTypefaceCache = new androidx.collection.LongSparseArray<>(3);
        sWeightCacheLock = new java.lang.Object();
    }

    private static boolean isPrivateApiAvailable() {
        return sNativeInstance != null;
    }

    static android.graphics.Typeface createWeightStyle(android.graphics.Typeface typeface, int i, boolean z) {
        android.graphics.Typeface typefaceCreate;
        if (!isPrivateApiAvailable()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (sWeightCacheLock) {
            long nativeInstance = getNativeInstance(typeface);
            androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> longSparseArray = sWeightTypefaceCache;
            android.util.SparseArray<android.graphics.Typeface> sparseArray = longSparseArray.get(nativeInstance);
            if (sparseArray == null) {
                sparseArray = new android.util.SparseArray<>(4);
                longSparseArray.put(nativeInstance, sparseArray);
            } else {
                android.graphics.Typeface typeface2 = sparseArray.get(i2 == true ? 1 : 0);
                if (typeface2 != null) {
                    return typeface2;
                }
            }
            if (z == typeface.isItalic()) {
                typefaceCreate = create(nativeCreateWeightAlias(nativeInstance, i));
            } else {
                typefaceCreate = create(nativeCreateFromTypefaceWithExactStyle(nativeInstance, i, z));
            }
            sparseArray.put(i2 == true ? 1 : 0, typefaceCreate);
            return typefaceCreate;
        }
    }

    private static long getNativeInstance(android.graphics.Typeface typeface) {
        try {
            return sNativeInstance.getLong(typeface);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static long nativeCreateFromTypefaceWithExactStyle(long j, int i, boolean z) {
        try {
            return ((java.lang.Long) sNativeCreateWeightAlias.invoke(null, java.lang.Long.valueOf(((java.lang.Long) sNativeCreateFromTypeface.invoke(null, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(z ? 2 : 0))).longValue()), java.lang.Integer.valueOf(i))).longValue();
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    private static long nativeCreateWeightAlias(long j, int i) {
        try {
            return ((java.lang.Long) sNativeCreateWeightAlias.invoke(null, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i))).longValue();
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    private static android.graphics.Typeface create(long j) {
        try {
            return sConstructor.newInstance(java.lang.Long.valueOf(j));
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private WeightTypefaceApi21() {
    }
}
