package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
class TypefaceCompatApi24Impl extends androidx.core.graphics.TypefaceCompatBaseImpl {
    private static final java.lang.String ADD_FONT_WEIGHT_STYLE_METHOD = "addFontWeightStyle";
    private static final java.lang.String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final java.lang.String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final java.lang.String TAG = "TypefaceCompatApi24Impl";
    private static final java.lang.reflect.Method sAddFontWeightStyle;
    private static final java.lang.reflect.Method sCreateFromFamiliesWithDefault;
    private static final java.lang.Class<?> sFontFamily;
    private static final java.lang.reflect.Constructor<?> sFontFamilyCtor;

    TypefaceCompatApi24Impl() {
    }

    static {
        java.lang.Class<?> cls;
        java.lang.reflect.Method method;
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method method2;
        try {
            cls = java.lang.Class.forName(FONT_FAMILY_CLASS);
            constructor = cls.getConstructor(new java.lang.Class[0]);
            method2 = cls.getMethod(ADD_FONT_WEIGHT_STYLE_METHOD, java.nio.ByteBuffer.class, java.lang.Integer.TYPE, java.util.List.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            method = android.graphics.Typeface.class.getMethod(CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD, java.lang.reflect.Array.newInstance(cls, 1).getClass());
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e) {
            android.util.Log.e(TAG, e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        sFontFamilyCtor = constructor;
        sFontFamily = cls;
        sAddFontWeightStyle = method2;
        sCreateFromFamiliesWithDefault = method;
    }

    public static boolean isUsable() {
        java.lang.reflect.Method method = sAddFontWeightStyle;
        if (method == null) {
            android.util.Log.w(TAG, "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static java.lang.Object newFamily() {
        try {
            return sFontFamilyCtor.newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean addFontWeightStyle(java.lang.Object obj, java.nio.ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((java.lang.Boolean) sAddFontWeightStyle.invoke(obj, byteBuffer, java.lang.Integer.valueOf(i), null, java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    private static android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object obj) {
        try {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(sFontFamily, 1);
            java.lang.reflect.Array.set(objNewInstance, 0, obj);
            return (android.graphics.Typeface) sCreateFromFamiliesWithDefault.invoke(null, objNewInstance);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        java.lang.Object objNewFamily = newFamily();
        if (objNewFamily == null) {
            return null;
        }
        androidx.collection.SimpleArrayMap simpleArrayMap = new androidx.collection.SimpleArrayMap();
        for (androidx.core.provider.FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
            android.net.Uri uri = fontInfo.getUri();
            java.nio.ByteBuffer byteBufferMmap = (java.nio.ByteBuffer) simpleArrayMap.get(uri);
            if (byteBufferMmap == null) {
                byteBufferMmap = androidx.core.graphics.TypefaceCompatUtil.mmap(context, cancellationSignal, uri);
                simpleArrayMap.put(uri, byteBufferMmap);
            }
            if (byteBufferMmap == null || !addFontWeightStyle(objNewFamily, byteBufferMmap, fontInfo.getTtcIndex(), fontInfo.getWeight(), fontInfo.isItalic())) {
                return null;
            }
        }
        android.graphics.Typeface typefaceCreateFromFamiliesWithDefault = createFromFamiliesWithDefault(objNewFamily);
        if (typefaceCreateFromFamiliesWithDefault == null) {
            return null;
        }
        return android.graphics.Typeface.create(typefaceCreateFromFamiliesWithDefault, i);
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, android.content.res.Resources resources, int i) {
        java.lang.Object objNewFamily = newFamily();
        if (objNewFamily == null) {
            return null;
        }
        for (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
            java.nio.ByteBuffer byteBufferCopyToDirectBuffer = androidx.core.graphics.TypefaceCompatUtil.copyToDirectBuffer(context, resources, fontFileResourceEntry.getResourceId());
            if (byteBufferCopyToDirectBuffer == null || !addFontWeightStyle(objNewFamily, byteBufferCopyToDirectBuffer, fontFileResourceEntry.getTtcIndex(), fontFileResourceEntry.getWeight(), fontFileResourceEntry.isItalic())) {
                return null;
            }
        }
        return createFromFamiliesWithDefault(objNewFamily);
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    android.graphics.Typeface createWeightStyle(android.content.Context context, android.graphics.Typeface typeface, int i, boolean z) {
        android.graphics.Typeface typefaceCreateWeightStyle;
        try {
            typefaceCreateWeightStyle = androidx.core.graphics.WeightTypefaceApi21.createWeightStyle(typeface, i, z);
        } catch (java.lang.RuntimeException unused) {
            typefaceCreateWeightStyle = null;
        }
        return typefaceCreateWeightStyle == null ? super.createWeightStyle(context, typeface, i, z) : typefaceCreateWeightStyle;
    }
}
