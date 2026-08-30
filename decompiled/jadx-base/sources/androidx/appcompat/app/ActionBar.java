package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActionBar {
    public static final int DISPLAY_HOME_AS_UP = 4;
    public static final int DISPLAY_SHOW_CUSTOM = 16;
    public static final int DISPLAY_SHOW_HOME = 2;
    public static final int DISPLAY_SHOW_TITLE = 8;
    public static final int DISPLAY_USE_LOGO = 1;

    @java.lang.Deprecated
    public static final int NAVIGATION_MODE_LIST = 1;

    @java.lang.Deprecated
    public static final int NAVIGATION_MODE_STANDARD = 0;

    @java.lang.Deprecated
    public static final int NAVIGATION_MODE_TABS = 2;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DisplayOptions {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NavigationMode {
    }

    public interface OnMenuVisibilityListener {
        void onMenuVisibilityChanged(boolean z);
    }

    @java.lang.Deprecated
    public interface OnNavigationListener {
        boolean onNavigationItemSelected(int i, long j);
    }

    @java.lang.Deprecated
    public static abstract class Tab {
        public static final int INVALID_POSITION = -1;

        public abstract java.lang.CharSequence getContentDescription();

        public abstract android.view.View getCustomView();

        public abstract android.graphics.drawable.Drawable getIcon();

        public abstract int getPosition();

        public abstract java.lang.Object getTag();

        public abstract java.lang.CharSequence getText();

        public abstract void select();

        public abstract androidx.appcompat.app.ActionBar.Tab setContentDescription(int i);

        public abstract androidx.appcompat.app.ActionBar.Tab setContentDescription(java.lang.CharSequence charSequence);

        public abstract androidx.appcompat.app.ActionBar.Tab setCustomView(int i);

        public abstract androidx.appcompat.app.ActionBar.Tab setCustomView(android.view.View view);

        public abstract androidx.appcompat.app.ActionBar.Tab setIcon(int i);

        public abstract androidx.appcompat.app.ActionBar.Tab setIcon(android.graphics.drawable.Drawable drawable);

        public abstract androidx.appcompat.app.ActionBar.Tab setTabListener(androidx.appcompat.app.ActionBar.TabListener tabListener);

        public abstract androidx.appcompat.app.ActionBar.Tab setTag(java.lang.Object obj);

        public abstract androidx.appcompat.app.ActionBar.Tab setText(int i);

        public abstract androidx.appcompat.app.ActionBar.Tab setText(java.lang.CharSequence charSequence);
    }

    @java.lang.Deprecated
    public interface TabListener {
        void onTabReselected(androidx.appcompat.app.ActionBar.Tab tab, androidx.fragment.app.FragmentTransaction fragmentTransaction);

        void onTabSelected(androidx.appcompat.app.ActionBar.Tab tab, androidx.fragment.app.FragmentTransaction fragmentTransaction);

        void onTabUnselected(androidx.appcompat.app.ActionBar.Tab tab, androidx.fragment.app.FragmentTransaction fragmentTransaction);
    }

    public abstract void addOnMenuVisibilityListener(androidx.appcompat.app.ActionBar.OnMenuVisibilityListener onMenuVisibilityListener);

    @java.lang.Deprecated
    public abstract void addTab(androidx.appcompat.app.ActionBar.Tab tab);

    @java.lang.Deprecated
    public abstract void addTab(androidx.appcompat.app.ActionBar.Tab tab, int i);

    @java.lang.Deprecated
    public abstract void addTab(androidx.appcompat.app.ActionBar.Tab tab, int i, boolean z);

    @java.lang.Deprecated
    public abstract void addTab(androidx.appcompat.app.ActionBar.Tab tab, boolean z);

    public boolean closeOptionsMenu() {
        return false;
    }

    public boolean collapseActionView() {
        return false;
    }

    public void dispatchMenuVisibilityChanged(boolean z) {
    }

    public abstract android.view.View getCustomView();

    public abstract int getDisplayOptions();

    public float getElevation() {
        return 0.0f;
    }

    public abstract int getHeight();

    public int getHideOffset() {
        return 0;
    }

    @java.lang.Deprecated
    public abstract int getNavigationItemCount();

    @java.lang.Deprecated
    public abstract int getNavigationMode();

    @java.lang.Deprecated
    public abstract int getSelectedNavigationIndex();

    @java.lang.Deprecated
    public abstract androidx.appcompat.app.ActionBar.Tab getSelectedTab();

    public abstract java.lang.CharSequence getSubtitle();

    @java.lang.Deprecated
    public abstract androidx.appcompat.app.ActionBar.Tab getTabAt(int i);

    @java.lang.Deprecated
    public abstract int getTabCount();

    public android.content.Context getThemedContext() {
        return null;
    }

    public abstract java.lang.CharSequence getTitle();

    public abstract void hide();

    public boolean invalidateOptionsMenu() {
        return false;
    }

    public boolean isHideOnContentScrollEnabled() {
        return false;
    }

    public abstract boolean isShowing();

    public boolean isTitleTruncated() {
        return false;
    }

    @java.lang.Deprecated
    public abstract androidx.appcompat.app.ActionBar.Tab newTab();

    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    void onDestroy() {
    }

    public boolean onKeyShortcut(int i, android.view.KeyEvent keyEvent) {
        return false;
    }

    public boolean onMenuKeyEvent(android.view.KeyEvent keyEvent) {
        return false;
    }

    public boolean openOptionsMenu() {
        return false;
    }

    @java.lang.Deprecated
    public abstract void removeAllTabs();

    public abstract void removeOnMenuVisibilityListener(androidx.appcompat.app.ActionBar.OnMenuVisibilityListener onMenuVisibilityListener);

    @java.lang.Deprecated
    public abstract void removeTab(androidx.appcompat.app.ActionBar.Tab tab);

    @java.lang.Deprecated
    public abstract void removeTabAt(int i);

    boolean requestFocus() {
        return false;
    }

    @java.lang.Deprecated
    public abstract void selectTab(androidx.appcompat.app.ActionBar.Tab tab);

    public abstract void setBackgroundDrawable(android.graphics.drawable.Drawable drawable);

    public abstract void setCustomView(int i);

    public abstract void setCustomView(android.view.View view);

    public abstract void setCustomView(android.view.View view, androidx.appcompat.app.ActionBar.LayoutParams layoutParams);

    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    public abstract void setDisplayHomeAsUpEnabled(boolean z);

    public abstract void setDisplayOptions(int i);

    public abstract void setDisplayOptions(int i, int i2);

    public abstract void setDisplayShowCustomEnabled(boolean z);

    public abstract void setDisplayShowHomeEnabled(boolean z);

    public abstract void setDisplayShowTitleEnabled(boolean z);

    public abstract void setDisplayUseLogoEnabled(boolean z);

    public void setHomeActionContentDescription(int i) {
    }

    public void setHomeActionContentDescription(java.lang.CharSequence charSequence) {
    }

    public void setHomeAsUpIndicator(int i) {
    }

    public void setHomeAsUpIndicator(android.graphics.drawable.Drawable drawable) {
    }

    public void setHomeButtonEnabled(boolean z) {
    }

    public abstract void setIcon(int i);

    public abstract void setIcon(android.graphics.drawable.Drawable drawable);

    @java.lang.Deprecated
    public abstract void setListNavigationCallbacks(android.widget.SpinnerAdapter spinnerAdapter, androidx.appcompat.app.ActionBar.OnNavigationListener onNavigationListener);

    public abstract void setLogo(int i);

    public abstract void setLogo(android.graphics.drawable.Drawable drawable);

    @java.lang.Deprecated
    public abstract void setNavigationMode(int i);

    @java.lang.Deprecated
    public abstract void setSelectedNavigationItem(int i);

    public void setShowHideAnimationEnabled(boolean z) {
    }

    public void setSplitBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
    }

    public void setStackedBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
    }

    public abstract void setSubtitle(int i);

    public abstract void setSubtitle(java.lang.CharSequence charSequence);

    public abstract void setTitle(int i);

    public abstract void setTitle(java.lang.CharSequence charSequence);

    public void setWindowTitle(java.lang.CharSequence charSequence) {
    }

    public abstract void show();

    public androidx.appcompat.view.ActionMode startActionMode(androidx.appcompat.view.ActionMode.Callback callback) {
        return null;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z) {
            throw new java.lang.UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    public void setHideOffset(int i) {
        if (i != 0) {
            throw new java.lang.UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    public void setElevation(float f) {
        if (f != 0.0f) {
            throw new java.lang.UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public int gravity;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.ActionBarLayout);
            this.gravity = typedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.ActionBarLayout_android_layout_gravity, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = 8388627;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.gravity = i3;
        }

        public LayoutParams(int i) {
            this(-2, -1, i);
        }

        public LayoutParams(androidx.appcompat.app.ActionBar.LayoutParams layoutParams) {
            super((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            this.gravity = 0;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }
    }
}
