package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarDrawerToggle implements androidx.drawerlayout.widget.DrawerLayout.DrawerListener {
    private final androidx.appcompat.app.ActionBarDrawerToggle.Delegate mActivityImpl;
    private final int mCloseDrawerContentDescRes;
    boolean mDrawerIndicatorEnabled;
    private final androidx.drawerlayout.widget.DrawerLayout mDrawerLayout;
    private boolean mDrawerSlideAnimationEnabled;
    private boolean mHasCustomUpIndicator;
    private android.graphics.drawable.Drawable mHomeAsUpIndicator;
    private final int mOpenDrawerContentDescRes;
    private androidx.appcompat.graphics.drawable.DrawerArrowDrawable mSlider;
    android.view.View.OnClickListener mToolbarNavigationClickListener;
    private boolean mWarnedForDisplayHomeAsUp;

    public interface Delegate {
        android.content.Context getActionBarThemedContext();

        android.graphics.drawable.Drawable getThemeUpIndicator();

        boolean isNavigationVisible();

        void setActionBarDescription(int i);

        void setActionBarUpIndicator(android.graphics.drawable.Drawable drawable, int i);
    }

    public interface DelegateProvider {
        androidx.appcompat.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerStateChanged(int i) {
    }

    public ActionBarDrawerToggle(android.app.Activity activity, androidx.drawerlayout.widget.DrawerLayout drawerLayout, int i, int i2) {
        this(activity, null, drawerLayout, null, i, i2);
    }

    public ActionBarDrawerToggle(android.app.Activity activity, androidx.drawerlayout.widget.DrawerLayout drawerLayout, androidx.appcompat.widget.Toolbar toolbar, int i, int i2) {
        this(activity, toolbar, drawerLayout, null, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    ActionBarDrawerToggle(android.app.Activity activity, androidx.appcompat.widget.Toolbar toolbar, androidx.drawerlayout.widget.DrawerLayout drawerLayout, androidx.appcompat.graphics.drawable.DrawerArrowDrawable drawerArrowDrawable, int i, int i2) {
        this.mDrawerSlideAnimationEnabled = true;
        this.mDrawerIndicatorEnabled = true;
        this.mWarnedForDisplayHomeAsUp = false;
        if (toolbar != null) {
            this.mActivityImpl = new androidx.appcompat.app.ActionBarDrawerToggle.ToolbarCompatDelegate(toolbar);
            toolbar.setNavigationOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.appcompat.app.ActionBarDrawerToggle.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    if (androidx.appcompat.app.ActionBarDrawerToggle.this.mDrawerIndicatorEnabled) {
                        androidx.appcompat.app.ActionBarDrawerToggle.this.toggle();
                    } else if (androidx.appcompat.app.ActionBarDrawerToggle.this.mToolbarNavigationClickListener != null) {
                        androidx.appcompat.app.ActionBarDrawerToggle.this.mToolbarNavigationClickListener.onClick(view);
                    }
                }
            });
        } else if (activity instanceof androidx.appcompat.app.ActionBarDrawerToggle.DelegateProvider) {
            this.mActivityImpl = ((androidx.appcompat.app.ActionBarDrawerToggle.DelegateProvider) activity).getDrawerToggleDelegate();
        } else {
            this.mActivityImpl = new androidx.appcompat.app.ActionBarDrawerToggle.FrameworkActionBarDelegate(activity);
        }
        this.mDrawerLayout = drawerLayout;
        this.mOpenDrawerContentDescRes = i;
        this.mCloseDrawerContentDescRes = i2;
        if (drawerArrowDrawable == null) {
            this.mSlider = new androidx.appcompat.graphics.drawable.DrawerArrowDrawable(this.mActivityImpl.getActionBarThemedContext());
        } else {
            this.mSlider = drawerArrowDrawable;
        }
        this.mHomeAsUpIndicator = getThemeUpIndicator();
    }

    public void syncState() {
        if (this.mDrawerLayout.isDrawerOpen(androidx.core.view.GravityCompat.START)) {
            setPosition(1.0f);
        } else {
            setPosition(0.0f);
        }
        if (this.mDrawerIndicatorEnabled) {
            setActionBarUpIndicator(this.mSlider, this.mDrawerLayout.isDrawerOpen(androidx.core.view.GravityCompat.START) ? this.mCloseDrawerContentDescRes : this.mOpenDrawerContentDescRes);
        }
    }

    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        if (!this.mHasCustomUpIndicator) {
            this.mHomeAsUpIndicator = getThemeUpIndicator();
        }
        syncState();
    }

    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.mDrawerIndicatorEnabled) {
            return false;
        }
        toggle();
        return true;
    }

    void toggle() {
        int drawerLockMode = this.mDrawerLayout.getDrawerLockMode(androidx.core.view.GravityCompat.START);
        if (this.mDrawerLayout.isDrawerVisible(androidx.core.view.GravityCompat.START) && drawerLockMode != 2) {
            this.mDrawerLayout.closeDrawer(androidx.core.view.GravityCompat.START);
        } else if (drawerLockMode != 1) {
            this.mDrawerLayout.openDrawer(androidx.core.view.GravityCompat.START);
        }
    }

    public void setHomeAsUpIndicator(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            this.mHomeAsUpIndicator = getThemeUpIndicator();
            this.mHasCustomUpIndicator = false;
        } else {
            this.mHomeAsUpIndicator = drawable;
            this.mHasCustomUpIndicator = true;
        }
        if (this.mDrawerIndicatorEnabled) {
            return;
        }
        setActionBarUpIndicator(this.mHomeAsUpIndicator, 0);
    }

    public void setHomeAsUpIndicator(int i) {
        setHomeAsUpIndicator(i != 0 ? this.mDrawerLayout.getResources().getDrawable(i) : null);
    }

    public boolean isDrawerIndicatorEnabled() {
        return this.mDrawerIndicatorEnabled;
    }

    public void setDrawerIndicatorEnabled(boolean z) {
        if (z != this.mDrawerIndicatorEnabled) {
            if (z) {
                setActionBarUpIndicator(this.mSlider, this.mDrawerLayout.isDrawerOpen(androidx.core.view.GravityCompat.START) ? this.mCloseDrawerContentDescRes : this.mOpenDrawerContentDescRes);
            } else {
                setActionBarUpIndicator(this.mHomeAsUpIndicator, 0);
            }
            this.mDrawerIndicatorEnabled = z;
        }
    }

    public androidx.appcompat.graphics.drawable.DrawerArrowDrawable getDrawerArrowDrawable() {
        return this.mSlider;
    }

    public void setDrawerArrowDrawable(androidx.appcompat.graphics.drawable.DrawerArrowDrawable drawerArrowDrawable) {
        this.mSlider = drawerArrowDrawable;
        syncState();
    }

    public void setDrawerSlideAnimationEnabled(boolean z) {
        this.mDrawerSlideAnimationEnabled = z;
        if (z) {
            return;
        }
        setPosition(0.0f);
    }

    public boolean isDrawerSlideAnimationEnabled() {
        return this.mDrawerSlideAnimationEnabled;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerSlide(android.view.View view, float f) {
        if (this.mDrawerSlideAnimationEnabled) {
            setPosition(java.lang.Math.min(1.0f, java.lang.Math.max(0.0f, f)));
        } else {
            setPosition(0.0f);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerOpened(android.view.View view) {
        setPosition(1.0f);
        if (this.mDrawerIndicatorEnabled) {
            setActionBarDescription(this.mCloseDrawerContentDescRes);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerClosed(android.view.View view) {
        setPosition(0.0f);
        if (this.mDrawerIndicatorEnabled) {
            setActionBarDescription(this.mOpenDrawerContentDescRes);
        }
    }

    public android.view.View.OnClickListener getToolbarNavigationClickListener() {
        return this.mToolbarNavigationClickListener;
    }

    public void setToolbarNavigationClickListener(android.view.View.OnClickListener onClickListener) {
        this.mToolbarNavigationClickListener = onClickListener;
    }

    void setActionBarUpIndicator(android.graphics.drawable.Drawable drawable, int i) {
        if (!this.mWarnedForDisplayHomeAsUp && !this.mActivityImpl.isNavigationVisible()) {
            android.util.Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.mWarnedForDisplayHomeAsUp = true;
        }
        this.mActivityImpl.setActionBarUpIndicator(drawable, i);
    }

    void setActionBarDescription(int i) {
        this.mActivityImpl.setActionBarDescription(i);
    }

    android.graphics.drawable.Drawable getThemeUpIndicator() {
        return this.mActivityImpl.getThemeUpIndicator();
    }

    private void setPosition(float f) {
        if (f == 1.0f) {
            this.mSlider.setVerticalMirror(true);
        } else if (f == 0.0f) {
            this.mSlider.setVerticalMirror(false);
        }
        this.mSlider.setProgress(f);
    }

    private static class FrameworkActionBarDelegate implements androidx.appcompat.app.ActionBarDrawerToggle.Delegate {
        private final android.app.Activity mActivity;
        private androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.SetIndicatorInfo mSetIndicatorInfo;

        FrameworkActionBarDelegate(android.app.Activity activity) {
            this.mActivity = activity;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.graphics.drawable.Drawable getThemeUpIndicator() {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getActionBarThemedContext().obtainStyledAttributes(null, new int[]{android.R.attr.homeAsUpIndicator}, android.R.attr.actionBarStyle, 0);
            android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.content.Context getActionBarThemedContext() {
            android.app.ActionBar actionBar = this.mActivity.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.mActivity;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            android.app.ActionBar actionBar = this.mActivity.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(android.graphics.drawable.Drawable drawable, int i) {
            android.app.ActionBar actionBar = this.mActivity.getActionBar();
            if (actionBar != null) {
                androidx.appcompat.app.ActionBarDrawerToggle.FrameworkActionBarDelegate.Api18Impl.setHomeAsUpIndicator(actionBar, drawable);
                androidx.appcompat.app.ActionBarDrawerToggle.FrameworkActionBarDelegate.Api18Impl.setHomeActionContentDescription(actionBar, i);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            android.app.ActionBar actionBar = this.mActivity.getActionBar();
            if (actionBar != null) {
                androidx.appcompat.app.ActionBarDrawerToggle.FrameworkActionBarDelegate.Api18Impl.setHomeActionContentDescription(actionBar, i);
            }
        }

        static class Api18Impl {
            private Api18Impl() {
            }

            static void setHomeActionContentDescription(android.app.ActionBar actionBar, int i) {
                actionBar.setHomeActionContentDescription(i);
            }

            static void setHomeAsUpIndicator(android.app.ActionBar actionBar, android.graphics.drawable.Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }
    }

    static class ToolbarCompatDelegate implements androidx.appcompat.app.ActionBarDrawerToggle.Delegate {
        final java.lang.CharSequence mDefaultContentDescription;
        final android.graphics.drawable.Drawable mDefaultUpIndicator;
        final androidx.appcompat.widget.Toolbar mToolbar;

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            return true;
        }

        ToolbarCompatDelegate(androidx.appcompat.widget.Toolbar toolbar) {
            this.mToolbar = toolbar;
            this.mDefaultUpIndicator = toolbar.getNavigationIcon();
            this.mDefaultContentDescription = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(android.graphics.drawable.Drawable drawable, int i) {
            this.mToolbar.setNavigationIcon(drawable);
            setActionBarDescription(i);
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            if (i == 0) {
                this.mToolbar.setNavigationContentDescription(this.mDefaultContentDescription);
            } else {
                this.mToolbar.setNavigationContentDescription(i);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.graphics.drawable.Drawable getThemeUpIndicator() {
            return this.mDefaultUpIndicator;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.content.Context getActionBarThemedContext() {
            return this.mToolbar.getContext();
        }
    }
}
