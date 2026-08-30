package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class TintContextWrapper extends android.content.ContextWrapper {
    private static final java.lang.Object CACHE_LOCK = new java.lang.Object();
    private static java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> sCache;
    private final android.content.res.Resources mResources;
    private final android.content.res.Resources.Theme mTheme;

    public static android.content.Context wrap(android.content.Context context) {
        if (!shouldWrap(context)) {
            return context;
        }
        synchronized (CACHE_LOCK) {
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> arrayList = sCache;
            if (arrayList == null) {
                sCache = new java.util.ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper> weakReference = sCache.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        sCache.remove(size);
                    }
                }
                for (int size2 = sCache.size() - 1; size2 >= 0; size2--) {
                    java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper> weakReference2 = sCache.get(size2);
                    androidx.appcompat.widget.TintContextWrapper tintContextWrapper = weakReference2 != null ? weakReference2.get() : null;
                    if (tintContextWrapper != null && tintContextWrapper.getBaseContext() == context) {
                        return tintContextWrapper;
                    }
                }
            }
            androidx.appcompat.widget.TintContextWrapper tintContextWrapper2 = new androidx.appcompat.widget.TintContextWrapper(context);
            sCache.add(new java.lang.ref.WeakReference<>(tintContextWrapper2));
            return tintContextWrapper2;
        }
    }

    private static boolean shouldWrap(android.content.Context context) {
        return ((context instanceof androidx.appcompat.widget.TintContextWrapper) || (context.getResources() instanceof androidx.appcompat.widget.TintResources) || (context.getResources() instanceof androidx.appcompat.widget.VectorEnabledTintResources) || !androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed()) ? false : true;
    }

    private TintContextWrapper(android.content.Context context) {
        super(context);
        if (androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed()) {
            androidx.appcompat.widget.VectorEnabledTintResources vectorEnabledTintResources = new androidx.appcompat.widget.VectorEnabledTintResources(this, context.getResources());
            this.mResources = vectorEnabledTintResources;
            android.content.res.Resources.Theme themeNewTheme = vectorEnabledTintResources.newTheme();
            this.mTheme = themeNewTheme;
            themeNewTheme.setTo(context.getTheme());
            return;
        }
        this.mResources = new androidx.appcompat.widget.TintResources(this, context.getResources());
        this.mTheme = null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
        android.content.res.Resources.Theme theme = this.mTheme;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        android.content.res.Resources.Theme theme = this.mTheme;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return this.mResources;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
        return this.mResources.getAssets();
    }
}
