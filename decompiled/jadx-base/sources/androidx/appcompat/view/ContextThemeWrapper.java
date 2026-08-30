package androidx.appcompat.view;

/* JADX INFO: loaded from: classes.dex */
public class ContextThemeWrapper extends android.content.ContextWrapper {
    private static android.content.res.Configuration sEmptyConfig;
    private android.view.LayoutInflater mInflater;
    private android.content.res.Configuration mOverrideConfiguration;
    private android.content.res.Resources mResources;
    private android.content.res.Resources.Theme mTheme;
    private int mThemeResource;

    public ContextThemeWrapper() {
        super(null);
    }

    public ContextThemeWrapper(android.content.Context context, int i) {
        super(context);
        this.mThemeResource = i;
    }

    public ContextThemeWrapper(android.content.Context context, android.content.res.Resources.Theme theme) {
        super(context);
        this.mTheme = theme;
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    public void applyOverrideConfiguration(android.content.res.Configuration configuration) {
        if (this.mResources != null) {
            throw new java.lang.IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.mOverrideConfiguration != null) {
            throw new java.lang.IllegalStateException("Override configuration has already been set");
        }
        this.mOverrideConfiguration = new android.content.res.Configuration(configuration);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return getResourcesInternal();
    }

    private android.content.res.Resources getResourcesInternal() {
        if (this.mResources == null) {
            if (this.mOverrideConfiguration == null || (android.os.Build.VERSION.SDK_INT >= 26 && isEmptyConfiguration(this.mOverrideConfiguration))) {
                this.mResources = super.getResources();
            } else {
                this.mResources = androidx.appcompat.view.ContextThemeWrapper.Api17Impl.createConfigurationContext(this, this.mOverrideConfiguration).getResources();
            }
        }
        return this.mResources;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.mThemeResource != i) {
            this.mThemeResource = i;
            initializeTheme();
        }
    }

    public int getThemeResId() {
        return this.mThemeResource;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
        android.content.res.Resources.Theme theme = this.mTheme;
        if (theme != null) {
            return theme;
        }
        if (this.mThemeResource == 0) {
            this.mThemeResource = androidx.appcompat.R.style.Theme_AppCompat_Light;
        }
        initializeTheme();
        return this.mTheme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if ("layout_inflater".equals(str)) {
            if (this.mInflater == null) {
                this.mInflater = android.view.LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.mInflater;
        }
        return getBaseContext().getSystemService(str);
    }

    protected void onApplyThemeResource(android.content.res.Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    private void initializeTheme() {
        boolean z = this.mTheme == null;
        if (z) {
            this.mTheme = getResources().newTheme();
            android.content.res.Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.mTheme.setTo(theme);
            }
        }
        onApplyThemeResource(this.mTheme, this.mThemeResource, z);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
        return getResources().getAssets();
    }

    private static boolean isEmptyConfiguration(android.content.res.Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (sEmptyConfig == null) {
            android.content.res.Configuration configuration2 = new android.content.res.Configuration();
            configuration2.fontScale = 0.0f;
            sEmptyConfig = configuration2;
        }
        return configuration.equals(sEmptyConfig);
    }

    static class Api17Impl {
        private Api17Impl() {
        }

        static android.content.Context createConfigurationContext(androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper, android.content.res.Configuration configuration) {
            return contextThemeWrapper.createConfigurationContext(configuration);
        }
    }
}
