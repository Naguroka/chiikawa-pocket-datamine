package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
final class WeightTypefaceApi26 {
    private static final java.lang.String NATIVE_CREATE_FROM_TYPEFACE_WITH_EXACT_STYLE_METHOD = "nativeCreateFromTypefaceWithExactStyle";
    private static final java.lang.String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final java.lang.String TAG = "WeightTypeface";
    private static final java.lang.reflect.Constructor<android.graphics.Typeface> sConstructor;
    private static final java.lang.reflect.Method sNativeCreateFromTypefaceWithExactStyle;
    private static final java.lang.reflect.Field sNativeInstance;
    private static final java.lang.Object sWeightCacheLock;
    private static final androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> sWeightTypefaceCache;

    static {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Method declaredMethod;
        java.lang.reflect.Constructor<android.graphics.Typeface> declaredConstructor;
        try {
            declaredField = android.graphics.Typeface.class.getDeclaredField(NATIVE_INSTANCE_FIELD);
            declaredMethod = android.graphics.Typeface.class.getDeclaredMethod(NATIVE_CREATE_FROM_TYPEFACE_WITH_EXACT_STYLE_METHOD, java.lang.Long.TYPE, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredConstructor = android.graphics.Typeface.class.getDeclaredConstructor(java.lang.Long.TYPE);
            declaredConstructor.setAccessible(true);
        } catch (java.lang.NoSuchFieldException | java.lang.NoSuchMethodException e) {
            android.util.Log.e(TAG, e.getClass().getName(), e);
            declaredField = null;
            declaredMethod = null;
            declaredConstructor = null;
        }
        sNativeInstance = declaredField;
        sNativeCreateFromTypefaceWithExactStyle = declaredMethod;
        sConstructor = declaredConstructor;
        sWeightTypefaceCache = new androidx.collection.LongSparseArray<>(3);
        sWeightCacheLock = new java.lang.Object();
    }

    private static boolean isPrivateApiAvailable() {
        return sNativeInstance != null;
    }

    static android.graphics.Typeface createWeightStyle(android.graphics.Typeface typeface, int i, boolean z) {
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
            android.graphics.Typeface typefaceCreate = create(nativeCreateFromTypefaceWithExactStyle(nativeInstance, i, z));
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
            return ((java.lang.Long) sNativeCreateFromTypefaceWithExactStyle.invoke(null, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z))).longValue();
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

    private WeightTypefaceApi26() {
    }
}
