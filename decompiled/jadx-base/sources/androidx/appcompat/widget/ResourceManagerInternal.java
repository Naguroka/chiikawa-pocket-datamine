package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class ResourceManagerInternal {
    private static final boolean DEBUG = false;
    private static androidx.appcompat.widget.ResourceManagerInternal INSTANCE = null;
    private static final java.lang.String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final java.lang.String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final java.lang.String TAG = "ResourceManagerInternal";
    private androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate> mDelegates;
    private final java.util.WeakHashMap<android.content.Context, androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState>>> mDrawableCaches = new java.util.WeakHashMap<>(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks mHooks;
    private androidx.collection.SparseArrayCompat<java.lang.String> mKnownDrawableIdTags;
    private java.util.WeakHashMap<android.content.Context, androidx.collection.SparseArrayCompat<android.content.res.ColorStateList>> mTintLists;
    private android.util.TypedValue mTypedValue;
    private static final android.graphics.PorterDuff.Mode DEFAULT_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
    private static final androidx.appcompat.widget.ResourceManagerInternal.ColorFilterLruCache COLOR_FILTER_CACHE = new androidx.appcompat.widget.ResourceManagerInternal.ColorFilterLruCache(6);

    private interface InflateDelegate {
        android.graphics.drawable.Drawable createFromXmlInner(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme);
    }

    public interface ResourceManagerHooks {
        android.graphics.drawable.Drawable createDrawableFor(androidx.appcompat.widget.ResourceManagerInternal resourceManagerInternal, android.content.Context context, int i);

        android.content.res.ColorStateList getTintListForDrawableRes(android.content.Context context, int i);

        android.graphics.PorterDuff.Mode getTintModeForDrawableRes(int i);

        boolean tintDrawable(android.content.Context context, int i, android.graphics.drawable.Drawable drawable);

        boolean tintDrawableUsingColorFilter(android.content.Context context, int i, android.graphics.drawable.Drawable drawable);
    }

    private static void installDefaultInflateDelegates(androidx.appcompat.widget.ResourceManagerInternal resourceManagerInternal) {
    }

    public static synchronized androidx.appcompat.widget.ResourceManagerInternal get() {
        if (INSTANCE == null) {
            androidx.appcompat.widget.ResourceManagerInternal resourceManagerInternal = new androidx.appcompat.widget.ResourceManagerInternal();
            INSTANCE = resourceManagerInternal;
            installDefaultInflateDelegates(resourceManagerInternal);
        }
        return INSTANCE;
    }

    public synchronized void setHooks(androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks) {
        this.mHooks = resourceManagerHooks;
    }

    public synchronized android.graphics.drawable.Drawable getDrawable(android.content.Context context, int i) {
        return getDrawable(context, i, false);
    }

    synchronized android.graphics.drawable.Drawable getDrawable(android.content.Context context, int i, boolean z) {
        android.graphics.drawable.Drawable drawableLoadDrawableFromDelegates;
        checkVectorDrawableSetup(context);
        drawableLoadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (drawableLoadDrawableFromDelegates == null) {
            drawableLoadDrawableFromDelegates = createDrawableIfNeeded(context, i);
        }
        if (drawableLoadDrawableFromDelegates == null) {
            drawableLoadDrawableFromDelegates = androidx.core.content.ContextCompat.getDrawable(context, i);
        }
        if (drawableLoadDrawableFromDelegates != null) {
            drawableLoadDrawableFromDelegates = tintDrawable(context, i, z, drawableLoadDrawableFromDelegates);
        }
        if (drawableLoadDrawableFromDelegates != null) {
            androidx.appcompat.widget.DrawableUtils.fixDrawable(drawableLoadDrawableFromDelegates);
        }
        return drawableLoadDrawableFromDelegates;
    }

    public synchronized void onConfigurationChanged(android.content.Context context) {
        androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    private static long createCacheKey(android.util.TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private android.graphics.drawable.Drawable createDrawableIfNeeded(android.content.Context context, int i) {
        if (this.mTypedValue == null) {
            this.mTypedValue = new android.util.TypedValue();
        }
        android.util.TypedValue typedValue = this.mTypedValue;
        context.getResources().getValue(i, typedValue, true);
        long jCreateCacheKey = createCacheKey(typedValue);
        android.graphics.drawable.Drawable cachedDrawable = getCachedDrawable(context, jCreateCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks = this.mHooks;
        android.graphics.drawable.Drawable drawableCreateDrawableFor = resourceManagerHooks == null ? null : resourceManagerHooks.createDrawableFor(this, context, i);
        if (drawableCreateDrawableFor != null) {
            drawableCreateDrawableFor.setChangingConfigurations(typedValue.changingConfigurations);
            addDrawableToCache(context, jCreateCacheKey, drawableCreateDrawableFor);
        }
        return drawableCreateDrawableFor;
    }

    private android.graphics.drawable.Drawable tintDrawable(android.content.Context context, int i, boolean z, android.graphics.drawable.Drawable drawable) {
        android.content.res.ColorStateList tintList = getTintList(context, i);
        if (tintList != null) {
            if (androidx.appcompat.widget.DrawableUtils.canSafelyMutateDrawable(drawable)) {
                drawable = drawable.mutate();
            }
            android.graphics.drawable.Drawable drawableWrap = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable);
            androidx.core.graphics.drawable.DrawableCompat.setTintList(drawableWrap, tintList);
            android.graphics.PorterDuff.Mode tintMode = getTintMode(i);
            if (tintMode == null) {
                return drawableWrap;
            }
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(drawableWrap, tintMode);
            return drawableWrap;
        }
        androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks = this.mHooks;
        if ((resourceManagerHooks == null || !resourceManagerHooks.tintDrawable(context, i, drawable)) && !tintDrawableUsingColorFilter(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    private android.graphics.drawable.Drawable loadDrawableFromDelegates(android.content.Context context, int i) {
        int next;
        androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate> simpleArrayMap = this.mDelegates;
        if (simpleArrayMap == null || simpleArrayMap.isEmpty()) {
            return null;
        }
        androidx.collection.SparseArrayCompat<java.lang.String> sparseArrayCompat = this.mKnownDrawableIdTags;
        if (sparseArrayCompat != null) {
            java.lang.String str = sparseArrayCompat.get(i);
            if (SKIP_DRAWABLE_TAG.equals(str) || (str != null && this.mDelegates.get(str) == null)) {
                return null;
            }
        } else {
            this.mKnownDrawableIdTags = new androidx.collection.SparseArrayCompat<>();
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new android.util.TypedValue();
        }
        android.util.TypedValue typedValue = this.mTypedValue;
        android.content.res.Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long jCreateCacheKey = createCacheKey(typedValue);
        android.graphics.drawable.Drawable cachedDrawable = getCachedDrawable(context, jCreateCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                android.content.res.XmlResourceParser xml = resources.getXml(i);
                android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
                }
                java.lang.String name = xml.getName();
                this.mKnownDrawableIdTags.append(i, name);
                androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate inflateDelegate = this.mDelegates.get(name);
                if (inflateDelegate != null) {
                    cachedDrawable = inflateDelegate.createFromXmlInner(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (cachedDrawable != null) {
                    cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                    addDrawableToCache(context, jCreateCacheKey, cachedDrawable);
                }
            } catch (java.lang.Exception e) {
                android.util.Log.e(TAG, "Exception while inflating drawable", e);
            }
        }
        if (cachedDrawable == null) {
            this.mKnownDrawableIdTags.append(i, SKIP_DRAWABLE_TAG);
        }
        return cachedDrawable;
    }

    private synchronized android.graphics.drawable.Drawable getCachedDrawable(android.content.Context context, long j) {
        androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
        if (longSparseArray == null) {
            return null;
        }
        java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState> weakReference = longSparseArray.get(j);
        if (weakReference != null) {
            android.graphics.drawable.Drawable.ConstantState constantState = weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            longSparseArray.remove(j);
        }
        return null;
    }

    private synchronized boolean addDrawableToCache(android.content.Context context, long j, android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
        if (longSparseArray == null) {
            longSparseArray = new androidx.collection.LongSparseArray<>();
            this.mDrawableCaches.put(context, longSparseArray);
        }
        longSparseArray.put(j, new java.lang.ref.WeakReference<>(constantState));
        return true;
    }

    synchronized android.graphics.drawable.Drawable onDrawableLoadedFromResources(android.content.Context context, androidx.appcompat.widget.VectorEnabledTintResources vectorEnabledTintResources, int i) {
        android.graphics.drawable.Drawable drawableLoadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (drawableLoadDrawableFromDelegates == null) {
            drawableLoadDrawableFromDelegates = vectorEnabledTintResources.getDrawableCanonical(i);
        }
        if (drawableLoadDrawableFromDelegates == null) {
            return null;
        }
        return tintDrawable(context, i, false, drawableLoadDrawableFromDelegates);
    }

    boolean tintDrawableUsingColorFilter(android.content.Context context, int i, android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks = this.mHooks;
        return resourceManagerHooks != null && resourceManagerHooks.tintDrawableUsingColorFilter(context, i, drawable);
    }

    private void addDelegate(java.lang.String str, androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate inflateDelegate) {
        if (this.mDelegates == null) {
            this.mDelegates = new androidx.collection.SimpleArrayMap<>();
        }
        this.mDelegates.put(str, inflateDelegate);
    }

    android.graphics.PorterDuff.Mode getTintMode(int i) {
        androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks = this.mHooks;
        if (resourceManagerHooks == null) {
            return null;
        }
        return resourceManagerHooks.getTintModeForDrawableRes(i);
    }

    synchronized android.content.res.ColorStateList getTintList(android.content.Context context, int i) {
        android.content.res.ColorStateList tintListFromCache;
        tintListFromCache = getTintListFromCache(context, i);
        if (tintListFromCache == null) {
            androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks = this.mHooks;
            tintListFromCache = resourceManagerHooks == null ? null : resourceManagerHooks.getTintListForDrawableRes(context, i);
            if (tintListFromCache != null) {
                addTintListToCache(context, i, tintListFromCache);
            }
        }
        return tintListFromCache;
    }

    private android.content.res.ColorStateList getTintListFromCache(android.content.Context context, int i) {
        androidx.collection.SparseArrayCompat<android.content.res.ColorStateList> sparseArrayCompat;
        java.util.WeakHashMap<android.content.Context, androidx.collection.SparseArrayCompat<android.content.res.ColorStateList>> weakHashMap = this.mTintLists;
        if (weakHashMap == null || (sparseArrayCompat = weakHashMap.get(context)) == null) {
            return null;
        }
        return sparseArrayCompat.get(i);
    }

    private void addTintListToCache(android.content.Context context, int i, android.content.res.ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new java.util.WeakHashMap<>();
        }
        androidx.collection.SparseArrayCompat<android.content.res.ColorStateList> sparseArrayCompat = this.mTintLists.get(context);
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new androidx.collection.SparseArrayCompat<>();
            this.mTintLists.put(context, sparseArrayCompat);
        }
        sparseArrayCompat.append(i, colorStateList);
    }

    private static class ColorFilterLruCache extends androidx.collection.LruCache<java.lang.Integer, android.graphics.PorterDuffColorFilter> {
        public ColorFilterLruCache(int i) {
            super(i);
        }

        android.graphics.PorterDuffColorFilter get(int i, android.graphics.PorterDuff.Mode mode) {
            return get(java.lang.Integer.valueOf(generateCacheKey(i, mode)));
        }

        android.graphics.PorterDuffColorFilter put(int i, android.graphics.PorterDuff.Mode mode, android.graphics.PorterDuffColorFilter porterDuffColorFilter) {
            return put(java.lang.Integer.valueOf(generateCacheKey(i, mode)), porterDuffColorFilter);
        }

        private static int generateCacheKey(int i, android.graphics.PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    static void tintDrawable(android.graphics.drawable.Drawable drawable, androidx.appcompat.widget.TintInfo tintInfo, int[] iArr) {
        int[] state = drawable.getState();
        if (androidx.appcompat.widget.DrawableUtils.canSafelyMutateDrawable(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                android.util.Log.d(TAG, "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof android.graphics.drawable.LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        if (tintInfo.mHasTintList || tintInfo.mHasTintMode) {
            drawable.setColorFilter(createTintFilter(tintInfo.mHasTintList ? tintInfo.mTintList : null, tintInfo.mHasTintMode ? tintInfo.mTintMode : DEFAULT_MODE, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    private static android.graphics.PorterDuffColorFilter createTintFilter(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized android.graphics.PorterDuffColorFilter getPorterDuffColorFilter(int i, android.graphics.PorterDuff.Mode mode) {
        android.graphics.PorterDuffColorFilter porterDuffColorFilter;
        androidx.appcompat.widget.ResourceManagerInternal.ColorFilterLruCache colorFilterLruCache = COLOR_FILTER_CACHE;
        porterDuffColorFilter = colorFilterLruCache.get(i, mode);
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new android.graphics.PorterDuffColorFilter(i, mode);
            colorFilterLruCache.put(i, mode, porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    private void checkVectorDrawableSetup(android.content.Context context) {
        if (this.mHasCheckedVectorDrawableSetup) {
            return;
        }
        this.mHasCheckedVectorDrawableSetup = true;
        android.graphics.drawable.Drawable drawable = getDrawable(context, androidx.appcompat.resources.R.drawable.abc_vector_test);
        if (drawable == null || !isVectorDrawable(drawable)) {
            this.mHasCheckedVectorDrawableSetup = false;
            throw new java.lang.IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static boolean isVectorDrawable(android.graphics.drawable.Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat) || PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName());
    }

    private static class VdcInflateDelegate implements androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate {
        VdcInflateDelegate() {
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public android.graphics.drawable.Drawable createFromXmlInner(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (java.lang.Exception e) {
                android.util.Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    private static class AvdcInflateDelegate implements androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate {
        AvdcInflateDelegate() {
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public android.graphics.drawable.Drawable createFromXmlInner(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.createFromXmlInner(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (java.lang.Exception e) {
                android.util.Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    static class AsldcInflateDelegate implements androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate {
        AsldcInflateDelegate() {
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public android.graphics.drawable.Drawable createFromXmlInner(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
            try {
                return androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.createFromXmlInner(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (java.lang.Exception e) {
                android.util.Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    static class DrawableDelegate implements androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate {
        DrawableDelegate() {
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public android.graphics.drawable.Drawable createFromXmlInner(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
            java.lang.String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) androidx.appcompat.widget.ResourceManagerInternal.DrawableDelegate.class.getClassLoader().loadClass(classAttribute).asSubclass(android.graphics.drawable.Drawable.class).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                    androidx.appcompat.resources.Compatibility.Api21Impl.inflate(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (java.lang.Exception e) {
                    android.util.Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }
}
