package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompatApi26Impl extends androidx.core.graphics.TypefaceCompatApi21Impl {
    private static final java.lang.String ABORT_CREATION_METHOD = "abortCreation";
    private static final java.lang.String ADD_FONT_FROM_ASSET_MANAGER_METHOD = "addFontFromAssetManager";
    private static final java.lang.String ADD_FONT_FROM_BUFFER_METHOD = "addFontFromBuffer";
    private static final java.lang.String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final java.lang.String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final java.lang.String FREEZE_METHOD = "freeze";
    private static final int RESOLVE_BY_FONT_TABLE = -1;
    private static final java.lang.String TAG = "TypefaceCompatApi26Impl";
    protected final java.lang.reflect.Method mAbortCreation;
    protected final java.lang.reflect.Method mAddFontFromAssetManager;
    protected final java.lang.reflect.Method mAddFontFromBuffer;
    protected final java.lang.reflect.Method mCreateFromFamiliesWithDefault;
    protected final java.lang.Class<?> mFontFamily;
    protected final java.lang.reflect.Constructor<?> mFontFamilyCtor;
    protected final java.lang.reflect.Method mFreeze;

    public TypefaceCompatApi26Impl() {
        java.lang.Class<?> clsObtainFontFamily;
        java.lang.reflect.Constructor<?> constructorObtainFontFamilyCtor;
        java.lang.reflect.Method methodObtainAddFontFromAssetManagerMethod;
        java.lang.reflect.Method methodObtainAddFontFromBufferMethod;
        java.lang.reflect.Method methodObtainFreezeMethod;
        java.lang.reflect.Method methodObtainAbortCreationMethod;
        java.lang.reflect.Method methodObtainCreateFromFamiliesWithDefaultMethod;
        try {
            clsObtainFontFamily = obtainFontFamily();
            constructorObtainFontFamilyCtor = obtainFontFamilyCtor(clsObtainFontFamily);
            methodObtainAddFontFromAssetManagerMethod = obtainAddFontFromAssetManagerMethod(clsObtainFontFamily);
            methodObtainAddFontFromBufferMethod = obtainAddFontFromBufferMethod(clsObtainFontFamily);
            methodObtainFreezeMethod = obtainFreezeMethod(clsObtainFontFamily);
            methodObtainAbortCreationMethod = obtainAbortCreationMethod(clsObtainFontFamily);
            methodObtainCreateFromFamiliesWithDefaultMethod = obtainCreateFromFamiliesWithDefaultMethod(clsObtainFontFamily);
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e) {
            android.util.Log.e(TAG, "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            clsObtainFontFamily = null;
            constructorObtainFontFamilyCtor = null;
            methodObtainAddFontFromAssetManagerMethod = null;
            methodObtainAddFontFromBufferMethod = null;
            methodObtainFreezeMethod = null;
            methodObtainAbortCreationMethod = null;
            methodObtainCreateFromFamiliesWithDefaultMethod = null;
        }
        this.mFontFamily = clsObtainFontFamily;
        this.mFontFamilyCtor = constructorObtainFontFamilyCtor;
        this.mAddFontFromAssetManager = methodObtainAddFontFromAssetManagerMethod;
        this.mAddFontFromBuffer = methodObtainAddFontFromBufferMethod;
        this.mFreeze = methodObtainFreezeMethod;
        this.mAbortCreation = methodObtainAbortCreationMethod;
        this.mCreateFromFamiliesWithDefault = methodObtainCreateFromFamiliesWithDefaultMethod;
    }

    private boolean isFontFamilyPrivateAPIAvailable() {
        if (this.mAddFontFromAssetManager == null) {
            android.util.Log.w(TAG, "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.mAddFontFromAssetManager != null;
    }

    private java.lang.Object newFamily() {
        try {
            return this.mFontFamilyCtor.newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private boolean addFontFromAssetManager(android.content.Context context, java.lang.Object obj, java.lang.String str, int i, int i2, int i3, android.graphics.fonts.FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((java.lang.Boolean) this.mAddFontFromAssetManager.invoke(obj, context.getAssets(), str, 0, false, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    private boolean addFontFromBuffer(java.lang.Object obj, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((java.lang.Boolean) this.mAddFontFromBuffer.invoke(obj, byteBuffer, java.lang.Integer.valueOf(i), null, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    protected android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object obj) {
        try {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(this.mFontFamily, 1);
            java.lang.reflect.Array.set(objNewInstance, 0, obj);
            return (android.graphics.Typeface) this.mCreateFromFamiliesWithDefault.invoke(null, objNewInstance, -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private boolean freeze(java.lang.Object obj) {
        try {
            return ((java.lang.Boolean) this.mFreeze.invoke(obj, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    private void abortCreation(java.lang.Object obj) {
        try {
            this.mAbortCreation.invoke(obj, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, android.content.res.Resources resources, int i) {
        if (!isFontFamilyPrivateAPIAvailable()) {
            return super.createFromFontFamilyFilesResourceEntry(context, fontFamilyFilesResourceEntry, resources, i);
        }
        java.lang.Object objNewFamily = newFamily();
        if (objNewFamily == null) {
            return null;
        }
        for (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
            if (!addFontFromAssetManager(context, objNewFamily, fontFileResourceEntry.getFileName(), fontFileResourceEntry.getTtcIndex(), fontFileResourceEntry.getWeight(), fontFileResourceEntry.isItalic() ? 1 : 0, android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(fontFileResourceEntry.getVariationSettings()))) {
                abortCreation(objNewFamily);
                return null;
            }
        }
        if (freeze(objNewFamily)) {
            return createFromFamiliesWithDefault(objNewFamily);
        }
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        android.graphics.Typeface typefaceCreateFromFamiliesWithDefault;
        if (fontInfoArr.length < 1) {
            return null;
        }
        if (!isFontFamilyPrivateAPIAvailable()) {
            androidx.core.provider.FontsContractCompat.FontInfo fontInfoFindBestInfo = findBestInfo(fontInfoArr, i);
            try {
                android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(fontInfoFindBestInfo.getUri(), com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    android.graphics.Typeface typefaceBuild = new android.graphics.Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(fontInfoFindBestInfo.getWeight()).setItalic(fontInfoFindBestInfo.isItalic()).build();
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return typefaceBuild;
                } catch (java.lang.Throwable th) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (java.io.IOException unused) {
                return null;
            }
        }
        java.util.Map<android.net.Uri, java.nio.ByteBuffer> fontInfoIntoByteBuffer = androidx.core.graphics.TypefaceCompatUtil.readFontInfoIntoByteBuffer(context, fontInfoArr, cancellationSignal);
        java.lang.Object objNewFamily = newFamily();
        if (objNewFamily == null) {
            return null;
        }
        boolean z = false;
        for (androidx.core.provider.FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
            java.nio.ByteBuffer byteBuffer = fontInfoIntoByteBuffer.get(fontInfo.getUri());
            if (byteBuffer != null) {
                if (!addFontFromBuffer(objNewFamily, byteBuffer, fontInfo.getTtcIndex(), fontInfo.getWeight(), fontInfo.isItalic() ? 1 : 0)) {
                    abortCreation(objNewFamily);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            abortCreation(objNewFamily);
            return null;
        }
        if (freeze(objNewFamily) && (typefaceCreateFromFamiliesWithDefault = createFromFamiliesWithDefault(objNewFamily)) != null) {
            return android.graphics.Typeface.create(typefaceCreateFromFamiliesWithDefault, i);
        }
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        if (!isFontFamilyPrivateAPIAvailable()) {
            return super.createFromResourcesFontFile(context, resources, i, str, i2);
        }
        java.lang.Object objNewFamily = newFamily();
        if (objNewFamily == null) {
            return null;
        }
        if (!addFontFromAssetManager(context, objNewFamily, str, 0, -1, -1, null)) {
            abortCreation(objNewFamily);
            return null;
        }
        if (freeze(objNewFamily)) {
            return createFromFamiliesWithDefault(objNewFamily);
        }
        return null;
    }

    protected java.lang.Class<?> obtainFontFamily() throws java.lang.ClassNotFoundException {
        return java.lang.Class.forName(FONT_FAMILY_CLASS);
    }

    protected java.lang.reflect.Constructor<?> obtainFontFamilyCtor(java.lang.Class<?> cls) throws java.lang.NoSuchMethodException {
        return cls.getConstructor(new java.lang.Class[0]);
    }

    protected java.lang.reflect.Method obtainAddFontFromAssetManagerMethod(java.lang.Class<?> cls) throws java.lang.NoSuchMethodException {
        return cls.getMethod(ADD_FONT_FROM_ASSET_MANAGER_METHOD, android.content.res.AssetManager.class, java.lang.String.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, android.graphics.fonts.FontVariationAxis[].class);
    }

    protected java.lang.reflect.Method obtainAddFontFromBufferMethod(java.lang.Class<?> cls) throws java.lang.NoSuchMethodException {
        return cls.getMethod(ADD_FONT_FROM_BUFFER_METHOD, java.nio.ByteBuffer.class, java.lang.Integer.TYPE, android.graphics.fonts.FontVariationAxis[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
    }

    protected java.lang.reflect.Method obtainFreezeMethod(java.lang.Class<?> cls) throws java.lang.NoSuchMethodException {
        return cls.getMethod(FREEZE_METHOD, new java.lang.Class[0]);
    }

    protected java.lang.reflect.Method obtainAbortCreationMethod(java.lang.Class<?> cls) throws java.lang.NoSuchMethodException {
        return cls.getMethod(ABORT_CREATION_METHOD, new java.lang.Class[0]);
    }

    protected java.lang.reflect.Method obtainCreateFromFamiliesWithDefaultMethod(java.lang.Class<?> cls) throws java.lang.NoSuchMethodException {
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod(CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD, java.lang.reflect.Array.newInstance(cls, 1).getClass(), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    android.graphics.Typeface createWeightStyle(android.content.Context context, android.graphics.Typeface typeface, int i, boolean z) {
        android.graphics.Typeface typefaceCreateWeightStyle;
        try {
            typefaceCreateWeightStyle = androidx.core.graphics.WeightTypefaceApi26.createWeightStyle(typeface, i, z);
        } catch (java.lang.RuntimeException unused) {
            typefaceCreateWeightStyle = null;
        }
        return typefaceCreateWeightStyle == null ? super.createWeightStyle(context, typeface, i, z) : typefaceCreateWeightStyle;
    }
}
