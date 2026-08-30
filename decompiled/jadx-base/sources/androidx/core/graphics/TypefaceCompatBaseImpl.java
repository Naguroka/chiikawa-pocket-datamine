package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
class TypefaceCompatBaseImpl {
    private static final int INVALID_KEY = 0;
    private static final java.lang.String TAG = "TypefaceCompatBaseImpl";
    private java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry> mFontFamilies = new java.util.concurrent.ConcurrentHashMap<>();

    private interface StyleExtractor<T> {
        int getWeight(T t);

        boolean isItalic(T t);
    }

    TypefaceCompatBaseImpl() {
    }

    private static <T> T findBestFont(T[] tArr, int i, androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor<T> styleExtractor) {
        return (T) findBestFont(tArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, styleExtractor);
    }

    private static <T> T findBestFont(T[] tArr, int i, boolean z, androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor<T> styleExtractor) {
        T t = null;
        int i2 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (java.lang.Math.abs(styleExtractor.getWeight(t2) - i) * 2) + (styleExtractor.isItalic(t2) == z ? 0 : 1);
            if (t == null || i2 > iAbs) {
                t = t2;
                i2 = iAbs;
            }
        }
        return t;
    }

    private static long getUniqueKey(android.graphics.Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            java.lang.reflect.Field declaredField = android.graphics.Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((java.lang.Number) declaredField.get(typeface)).longValue();
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.e(TAG, "Could not retrieve font from family.", e);
            return 0L;
        } catch (java.lang.NoSuchFieldException e2) {
            android.util.Log.e(TAG, "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    protected androidx.core.provider.FontsContractCompat.FontInfo findBestInfo(androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        return (androidx.core.provider.FontsContractCompat.FontInfo) findBestFont(fontInfoArr, i, new androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor<androidx.core.provider.FontsContractCompat.FontInfo>() { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.1
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public int getWeight(androidx.core.provider.FontsContractCompat.FontInfo fontInfo) {
                return fontInfo.getWeight();
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public boolean isItalic(androidx.core.provider.FontsContractCompat.FontInfo fontInfo) {
                return fontInfo.isItalic();
            }
        });
    }

    protected android.graphics.Typeface createFromInputStream(android.content.Context context, java.io.InputStream inputStream) {
        java.io.File tempFile = androidx.core.graphics.TypefaceCompatUtil.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (androidx.core.graphics.TypefaceCompatUtil.copyToFile(tempFile, inputStream)) {
                return android.graphics.Typeface.createFromFile(tempFile.getPath());
            }
            return null;
        } catch (java.lang.RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    public android.graphics.Typeface createFromFontInfo(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) throws java.lang.Throwable {
        java.io.InputStream inputStreamOpenInputStream;
        java.io.InputStream inputStream = null;
        if (fontInfoArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(findBestInfo(fontInfoArr, i).getUri());
            try {
                android.graphics.Typeface typefaceCreateFromInputStream = createFromInputStream(context, inputStreamOpenInputStream);
                androidx.core.graphics.TypefaceCompatUtil.closeQuietly(inputStreamOpenInputStream);
                return typefaceCreateFromInputStream;
            } catch (java.io.IOException unused) {
                androidx.core.graphics.TypefaceCompatUtil.closeQuietly(inputStreamOpenInputStream);
                return null;
            } catch (java.lang.Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                androidx.core.graphics.TypefaceCompatUtil.closeQuietly(inputStream);
                throw th;
            }
        } catch (java.io.IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry findBestEntry(androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, int i) {
        return (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry) findBestFont(fontFamilyFilesResourceEntry.getEntries(), i, new androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor<androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry>() { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.2
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public int getWeight(androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.getWeight();
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public boolean isItalic(androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.isItalic();
            }
        });
    }

    private androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry findBestEntry(androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, int i, boolean z) {
        return (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry) findBestFont(fontFamilyFilesResourceEntry.getEntries(), i, z, new androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor<androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry>() { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.3
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public int getWeight(androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.getWeight();
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public boolean isItalic(androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.isItalic();
            }
        });
    }

    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, android.content.res.Resources resources, int i) {
        androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntryFindBestEntry = findBestEntry(fontFamilyFilesResourceEntry, i);
        if (fontFileResourceEntryFindBestEntry == null) {
            return null;
        }
        android.graphics.Typeface typefaceCreateFromResourcesFontFile = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(context, resources, fontFileResourceEntryFindBestEntry.getResourceId(), fontFileResourceEntryFindBestEntry.getFileName(), 0, i);
        addFontFamily(typefaceCreateFromResourcesFontFile, fontFamilyFilesResourceEntry);
        return typefaceCreateFromResourcesFontFile;
    }

    android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, android.content.res.Resources resources, int i, boolean z) {
        androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntryFindBestEntry = findBestEntry(fontFamilyFilesResourceEntry, i, z);
        if (fontFileResourceEntryFindBestEntry == null) {
            return null;
        }
        android.graphics.Typeface typefaceCreateFromResourcesFontFile = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(context, resources, fontFileResourceEntryFindBestEntry.getResourceId(), fontFileResourceEntryFindBestEntry.getFileName(), 0, 0);
        addFontFamily(typefaceCreateFromResourcesFontFile, fontFamilyFilesResourceEntry);
        return typefaceCreateFromResourcesFontFile;
    }

    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        java.io.File tempFile = androidx.core.graphics.TypefaceCompatUtil.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (androidx.core.graphics.TypefaceCompatUtil.copyToFile(tempFile, resources, i)) {
                return android.graphics.Typeface.createFromFile(tempFile.getPath());
            }
            return null;
        } catch (java.lang.RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    android.graphics.Typeface createWeightStyle(android.content.Context context, android.graphics.Typeface typeface, int i, boolean z) {
        android.graphics.Typeface typefaceCreateWeightStyle;
        try {
            typefaceCreateWeightStyle = androidx.core.graphics.WeightTypefaceApi14.createWeightStyle(this, context, typeface, i, z);
        } catch (java.lang.RuntimeException unused) {
            typefaceCreateWeightStyle = null;
        }
        return typefaceCreateWeightStyle == null ? typeface : typefaceCreateWeightStyle;
    }

    androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry getFontFamily(android.graphics.Typeface typeface) {
        long uniqueKey = getUniqueKey(typeface);
        if (uniqueKey == 0) {
            return null;
        }
        return this.mFontFamilies.get(java.lang.Long.valueOf(uniqueKey));
    }

    private void addFontFamily(android.graphics.Typeface typeface, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry) {
        long uniqueKey = getUniqueKey(typeface);
        if (uniqueKey != 0) {
            this.mFontFamilies.put(java.lang.Long.valueOf(uniqueKey), fontFamilyFilesResourceEntry);
        }
    }
}
