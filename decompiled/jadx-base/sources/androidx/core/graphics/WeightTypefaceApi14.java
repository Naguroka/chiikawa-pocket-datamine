package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
final class WeightTypefaceApi14 {
    private static final java.lang.String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final java.lang.String TAG = "WeightTypeface";
    private static final java.lang.reflect.Field sNativeInstance;
    private static final java.lang.Object sWeightCacheLock;
    private static final androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> sWeightTypefaceCache;

    static {
        java.lang.reflect.Field declaredField;
        try {
            declaredField = android.graphics.Typeface.class.getDeclaredField(NATIVE_INSTANCE_FIELD);
            declaredField.setAccessible(true);
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, e.getClass().getName(), e);
            declaredField = null;
        }
        sNativeInstance = declaredField;
        sWeightTypefaceCache = new androidx.collection.LongSparseArray<>(3);
        sWeightCacheLock = new java.lang.Object();
    }

    private static boolean isPrivateApiAvailable() {
        return sNativeInstance != null;
    }

    static android.graphics.Typeface createWeightStyle(androidx.core.graphics.TypefaceCompatBaseImpl typefaceCompatBaseImpl, android.content.Context context, android.graphics.Typeface typeface, int i, boolean z) {
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
            android.graphics.Typeface bestFontFromFamily = getBestFontFromFamily(typefaceCompatBaseImpl, context, typeface, i, z);
            if (bestFontFromFamily == null) {
                bestFontFromFamily = platformTypefaceCreate(typeface, i, z);
            }
            sparseArray.put(i2 == true ? 1 : 0, bestFontFromFamily);
            return bestFontFromFamily;
        }
    }

    private static android.graphics.Typeface platformTypefaceCreate(android.graphics.Typeface typeface, int i, boolean z) {
        int i2 = 1;
        boolean z2 = i >= 600;
        if (!z2 && !z) {
            i2 = 0;
        } else if (!z2) {
            i2 = 2;
        } else if (z) {
            i2 = 3;
        }
        return android.graphics.Typeface.create(typeface, i2);
    }

    private static android.graphics.Typeface getBestFontFromFamily(androidx.core.graphics.TypefaceCompatBaseImpl typefaceCompatBaseImpl, android.content.Context context, android.graphics.Typeface typeface, int i, boolean z) {
        androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamily = typefaceCompatBaseImpl.getFontFamily(typeface);
        if (fontFamily == null) {
            return null;
        }
        return typefaceCompatBaseImpl.createFromFontFamilyFilesResourceEntry(context, fontFamily, context.getResources(), i, z);
    }

    private static long getNativeInstance(android.graphics.Typeface typeface) {
        try {
            return ((java.lang.Number) sNativeInstance.get(typeface)).longValue();
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private WeightTypefaceApi14() {
    }
}
