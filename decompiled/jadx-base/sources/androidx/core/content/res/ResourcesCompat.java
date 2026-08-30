package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public final class ResourcesCompat {
    public static final int ID_NULL = 0;
    private static final java.lang.String TAG = "ResourcesCompat";
    private static final java.lang.ThreadLocal<android.util.TypedValue> sTempTypedValue = new java.lang.ThreadLocal<>();
    private static final java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry>> sColorStateCaches = new java.util.WeakHashMap<>(0);
    private static final java.lang.Object sColorStateCacheLock = new java.lang.Object();

    public static void clearCachesForTheme(android.content.res.Resources.Theme theme) {
        synchronized (sColorStateCacheLock) {
            java.util.Iterator<androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey> it = sColorStateCaches.keySet().iterator();
            while (it.hasNext()) {
                androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey next = it.next();
                if (next != null && theme.equals(next.mTheme)) {
                    it.remove();
                }
            }
        }
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        return androidx.core.content.res.ResourcesCompat.Api21Impl.getDrawable(resources, i, theme);
    }

    public static android.graphics.drawable.Drawable getDrawableForDensity(android.content.res.Resources resources, int i, int i2, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        return androidx.core.content.res.ResourcesCompat.Api21Impl.getDrawableForDensity(resources, i, i2, theme);
    }

    public static int getColor(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        return androidx.core.content.res.ResourcesCompat.Api23Impl.getColor(resources, i, theme);
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey colorStateListCacheKey = new androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey(resources, theme);
        android.content.res.ColorStateList cachedColorStateList = getCachedColorStateList(colorStateListCacheKey, i);
        if (cachedColorStateList != null) {
            return cachedColorStateList;
        }
        android.content.res.ColorStateList colorStateListInflateColorStateList = inflateColorStateList(resources, i, theme);
        if (colorStateListInflateColorStateList != null) {
            addColorStateListToCache(colorStateListCacheKey, i, colorStateListInflateColorStateList, theme);
            return colorStateListInflateColorStateList;
        }
        return androidx.core.content.res.ResourcesCompat.Api23Impl.getColorStateList(resources, i, theme);
    }

    private static android.content.res.ColorStateList inflateColorStateList(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
        if (isColorInt(resources, i)) {
            return null;
        }
        try {
            return androidx.core.content.res.ColorStateListInflaterCompat.createFromXml(resources, resources.getXml(i), theme);
        } catch (java.lang.Exception e) {
            android.util.Log.w(TAG, "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    private static android.content.res.ColorStateList getCachedColorStateList(androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey colorStateListCacheKey, int i) {
        androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry colorStateListCacheEntry;
        synchronized (sColorStateCacheLock) {
            android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry> sparseArray = sColorStateCaches.get(colorStateListCacheKey);
            if (sparseArray != null && sparseArray.size() > 0 && (colorStateListCacheEntry = sparseArray.get(i)) != null) {
                if (colorStateListCacheEntry.mConfiguration.equals(colorStateListCacheKey.mResources.getConfiguration()) && ((colorStateListCacheKey.mTheme == null && colorStateListCacheEntry.mThemeHash == 0) || (colorStateListCacheKey.mTheme != null && colorStateListCacheEntry.mThemeHash == colorStateListCacheKey.mTheme.hashCode()))) {
                    return colorStateListCacheEntry.mValue;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    private static void addColorStateListToCache(androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey colorStateListCacheKey, int i, android.content.res.ColorStateList colorStateList, android.content.res.Resources.Theme theme) {
        synchronized (sColorStateCacheLock) {
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry>> weakHashMap = sColorStateCaches;
            android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry> sparseArray = weakHashMap.get(colorStateListCacheKey);
            if (sparseArray == null) {
                sparseArray = new android.util.SparseArray<>();
                weakHashMap.put(colorStateListCacheKey, sparseArray);
            }
            sparseArray.append(i, new androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry(colorStateList, colorStateListCacheKey.mResources.getConfiguration(), theme));
        }
    }

    private static boolean isColorInt(android.content.res.Resources resources, int i) {
        android.util.TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        return typedValue.type >= 28 && typedValue.type <= 31;
    }

    private static android.util.TypedValue getTypedValue() {
        java.lang.ThreadLocal<android.util.TypedValue> threadLocal = sTempTypedValue;
        android.util.TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static final class ColorStateListCacheKey {
        final android.content.res.Resources mResources;
        final android.content.res.Resources.Theme mTheme;

        ColorStateListCacheKey(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
            this.mResources = resources;
            this.mTheme = theme;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey colorStateListCacheKey = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey) obj;
            return this.mResources.equals(colorStateListCacheKey.mResources) && androidx.core.util.ObjectsCompat.equals(this.mTheme, colorStateListCacheKey.mTheme);
        }

        public int hashCode() {
            return androidx.core.util.ObjectsCompat.hash(this.mResources, this.mTheme);
        }
    }

    private static class ColorStateListCacheEntry {
        final android.content.res.Configuration mConfiguration;
        final int mThemeHash;
        final android.content.res.ColorStateList mValue;

        ColorStateListCacheEntry(android.content.res.ColorStateList colorStateList, android.content.res.Configuration configuration, android.content.res.Resources.Theme theme) {
            this.mValue = colorStateList;
            this.mConfiguration = configuration;
            this.mThemeHash = theme == null ? 0 : theme.hashCode();
        }
    }

    public static float getFloat(android.content.res.Resources resources, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.content.res.ResourcesCompat.Api29Impl.getFloat(resources, i);
        }
        android.util.TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new android.content.res.Resources.NotFoundException("Resource ID #0x" + java.lang.Integer.toHexString(i) + " type #0x" + java.lang.Integer.toHexString(typedValue.type) + " is not valid");
    }

    public static android.graphics.Typeface getFont(android.content.Context context, int i) throws android.content.res.Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new android.util.TypedValue(), 0, null, null, false, false);
    }

    public static android.graphics.Typeface getCachedFont(android.content.Context context, int i) throws android.content.res.Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new android.util.TypedValue(), 0, null, null, false, true);
    }

    public static abstract class FontCallback {
        /* JADX INFO: renamed from: onFontRetrievalFailed, reason: merged with bridge method [inline-methods] */
        public abstract void m21xb24343b7(int i);

        /* JADX INFO: renamed from: onFontRetrieved, reason: merged with bridge method [inline-methods] */
        public abstract void m22x46c88379(android.graphics.Typeface typeface);

        public final void callbackSuccessAsync(final android.graphics.Typeface typeface, android.os.Handler handler) {
            getHandler(handler).post(new java.lang.Runnable() { // from class: androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m22x46c88379(typeface);
                }
            });
        }

        public final void callbackFailAsync(final int i, android.os.Handler handler) {
            getHandler(handler).post(new java.lang.Runnable() { // from class: androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m21xb24343b7(i);
                }
            });
        }

        public static android.os.Handler getHandler(android.os.Handler handler) {
            return handler == null ? new android.os.Handler(android.os.Looper.getMainLooper()) : handler;
        }
    }

    public static void getFont(android.content.Context context, int i, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler) throws android.content.res.Resources.NotFoundException {
        androidx.core.util.Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
        } else {
            loadFont(context, i, new android.util.TypedValue(), 0, fontCallback, handler, false, false);
        }
    }

    public static android.graphics.Typeface getFont(android.content.Context context, int i, android.util.TypedValue typedValue, int i2, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback) throws android.content.res.Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, typedValue, i2, fontCallback, null, true, false);
    }

    private static android.graphics.Typeface loadFont(android.content.Context context, int i, android.util.TypedValue typedValue, int i2, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler, boolean z, boolean z2) {
        android.content.res.Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        android.graphics.Typeface typefaceLoadFont = loadFont(context, resources, typedValue, i, i2, fontCallback, handler, z, z2);
        if (typefaceLoadFont == null && fontCallback == null && !z2) {
            throw new android.content.res.Resources.NotFoundException("Font resource ID #0x" + java.lang.Integer.toHexString(i) + " could not be retrieved.");
        }
        return typefaceLoadFont;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    private static android.graphics.Typeface loadFont(android.content.Context context, android.content.res.Resources resources, android.util.TypedValue typedValue, int i, int i2, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler, boolean z, boolean z2) {
        if (typedValue.string == null) {
            throw new android.content.res.Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + java.lang.Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        java.lang.String string = typedValue.string.toString();
        if (!string.startsWith("res/")) {
            if (fontCallback != null) {
                fontCallback.callbackFailAsync(-3, handler);
            }
            return null;
        }
        android.graphics.Typeface typefaceFindFromCache = androidx.core.graphics.TypefaceCompat.findFromCache(resources, i, string, typedValue.assetCookie, i2);
        if (typefaceFindFromCache != null) {
            if (fontCallback != null) {
                fontCallback.callbackSuccessAsync(typefaceFindFromCache, handler);
            }
            return typefaceFindFromCache;
        }
        if (z2) {
            return null;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry = androidx.core.content.res.FontResourcesParserCompat.parse(resources.getXml(i), resources);
                if (familyResourceEntry == null) {
                    android.util.Log.e(TAG, "Failed to find font-family tag");
                    if (fontCallback != null) {
                        fontCallback.callbackFailAsync(-3, handler);
                    }
                    return null;
                }
                return androidx.core.graphics.TypefaceCompat.createFromResourcesFamilyXml(context, familyResourceEntry, resources, i, string, typedValue.assetCookie, i2, fontCallback, handler, z);
            }
            android.graphics.Typeface typefaceCreateFromResourcesFontFile = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(context, resources, i, string, typedValue.assetCookie, i2);
            if (fontCallback != null) {
                if (typefaceCreateFromResourcesFontFile != null) {
                    fontCallback.callbackSuccessAsync(typefaceCreateFromResourcesFontFile, handler);
                } else {
                    fontCallback.callbackFailAsync(-3, handler);
                }
            }
            return typefaceCreateFromResourcesFontFile;
        } catch (java.io.IOException e) {
            android.util.Log.e(TAG, "Failed to read xml resource " + string, e);
            if (fontCallback != null) {
                fontCallback.callbackFailAsync(-3, handler);
            }
            return null;
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            android.util.Log.e(TAG, "Failed to parse xml resource " + string, e2);
            if (fontCallback != null) {
                fontCallback.callbackFailAsync(-3, handler);
            }
            return null;
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static float getFloat(android.content.res.Resources resources, int i) {
            return resources.getFloat(i);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static android.content.res.ColorStateList getColorStateList(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }

        static int getColor(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
            return resources.getColor(i, theme);
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static android.graphics.drawable.Drawable getDrawable(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        static android.graphics.drawable.Drawable getDrawableForDensity(android.content.res.Resources resources, int i, int i2, android.content.res.Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    static class Api15Impl {
        private Api15Impl() {
        }

        static android.graphics.drawable.Drawable getDrawableForDensity(android.content.res.Resources resources, int i, int i2) {
            return resources.getDrawableForDensity(i, i2);
        }
    }

    private ResourcesCompat() {
    }

    public static final class ThemeCompat {
        private ThemeCompat() {
        }

        public static void rebase(android.content.res.Resources.Theme theme) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                androidx.core.content.res.ResourcesCompat.ThemeCompat.Api29Impl.rebase(theme);
            } else {
                androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.rebase(theme);
            }
        }

        static class Api29Impl {
            private Api29Impl() {
            }

            static void rebase(android.content.res.Resources.Theme theme) {
                theme.rebase();
            }
        }

        static class Api23Impl {
            private static java.lang.reflect.Method sRebaseMethod;
            private static boolean sRebaseMethodFetched;
            private static final java.lang.Object sRebaseMethodLock = new java.lang.Object();

            private Api23Impl() {
            }

            /* JADX WARN: Code duplicated, block: B:30:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            static void rebase(android.content.res.Resources.Theme theme) {
                java.lang.reflect.Method method;
                synchronized (sRebaseMethodLock) {
                    if (!sRebaseMethodFetched) {
                        try {
                            java.lang.reflect.Method declaredMethod = android.content.res.Resources.Theme.class.getDeclaredMethod("rebase", new java.lang.Class[0]);
                            sRebaseMethod = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (java.lang.NoSuchMethodException e) {
                            android.util.Log.i(androidx.core.content.res.ResourcesCompat.TAG, "Failed to retrieve rebase() method", e);
                        }
                        sRebaseMethodFetched = true;
                        method = sRebaseMethod;
                        if (method != null) {
                            try {
                                method.invoke(theme, new java.lang.Object[0]);
                            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
                                android.util.Log.i(androidx.core.content.res.ResourcesCompat.TAG, "Failed to invoke rebase() method via reflection", e2);
                                sRebaseMethod = null;
                            }
                        }
                    } else {
                        method = sRebaseMethod;
                        if (method != null) {
                            method.invoke(theme, new java.lang.Object[0]);
                        }
                    }
                    throw th;
                }
            }
        }
    }
}
