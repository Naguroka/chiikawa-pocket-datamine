package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
class TypefaceCompatApi21Impl extends androidx.core.graphics.TypefaceCompatBaseImpl {
    private static final java.lang.String ADD_FONT_WEIGHT_STYLE_METHOD = "addFontWeightStyle";
    private static final java.lang.String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final java.lang.String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final java.lang.String TAG = "TypefaceCompatApi21Impl";
    private static java.lang.reflect.Method sAddFontWeightStyle = null;
    private static java.lang.reflect.Method sCreateFromFamiliesWithDefault = null;
    private static java.lang.Class<?> sFontFamily = null;
    private static java.lang.reflect.Constructor<?> sFontFamilyCtor = null;
    private static boolean sHasInitBeenCalled = false;

    TypefaceCompatApi21Impl() {
    }

    private static void init() {
        java.lang.Class<?> cls;
        java.lang.reflect.Method method;
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method method2;
        if (sHasInitBeenCalled) {
            return;
        }
        sHasInitBeenCalled = true;
        try {
            cls = java.lang.Class.forName(FONT_FAMILY_CLASS);
            constructor = cls.getConstructor(new java.lang.Class[0]);
            method2 = cls.getMethod(ADD_FONT_WEIGHT_STYLE_METHOD, java.lang.String.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
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

    private java.io.File getFile(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        try {
            java.lang.String str = android.system.Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (android.system.OsConstants.S_ISREG(android.system.Os.stat(str).st_mode)) {
                return new java.io.File(str);
            }
        } catch (android.system.ErrnoException unused) {
        }
        return null;
    }

    private static java.lang.Object newFamily() {
        init();
        try {
            return sFontFamilyCtor.newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object obj) {
        init();
        try {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(sFontFamily, 1);
            java.lang.reflect.Array.set(objNewInstance, 0, obj);
            return (android.graphics.Typeface) sCreateFromFamiliesWithDefault.invoke(null, objNewInstance);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static boolean addFontWeightStyle(java.lang.Object obj, java.lang.String str, int i, boolean z) {
        init();
        try {
            return ((java.lang.Boolean) sAddFontWeightStyle.invoke(obj, str, java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        if (fontInfoArr.length < 1) {
            return null;
        }
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
                java.io.File file = getFile(parcelFileDescriptorOpenFileDescriptor);
                if (file != null && file.canRead()) {
                    android.graphics.Typeface typefaceCreateFromFile = android.graphics.Typeface.createFromFile(file);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return typefaceCreateFromFile;
                }
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    android.graphics.Typeface typefaceCreateFromInputStream = super.createFromInputStream(context, fileInputStream);
                    fileInputStream.close();
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return typefaceCreateFromInputStream;
                } catch (java.lang.Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, android.content.res.Resources resources, int i) {
        java.lang.Object objNewFamily = newFamily();
        for (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
            java.io.File tempFile = androidx.core.graphics.TypefaceCompatUtil.getTempFile(context);
            if (tempFile == null) {
                return null;
            }
            try {
                if (!androidx.core.graphics.TypefaceCompatUtil.copyToFile(tempFile, resources, fontFileResourceEntry.getResourceId())) {
                    return null;
                }
                if (!addFontWeightStyle(objNewFamily, tempFile.getPath(), fontFileResourceEntry.getWeight(), fontFileResourceEntry.isItalic())) {
                    return null;
                }
                tempFile.delete();
            } catch (java.lang.RuntimeException unused) {
                return null;
            } finally {
                tempFile.delete();
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
