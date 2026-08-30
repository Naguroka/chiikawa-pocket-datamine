package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class ToolbarActionBar extends androidx.appcompat.app.ActionBar {
    final androidx.appcompat.widget.DecorToolbar mDecorToolbar;
    private boolean mLastMenuVisibility;
    final androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback mMenuCallback;
    private boolean mMenuCallbackSet;
    private final androidx.appcompat.widget.Toolbar.OnMenuItemClickListener mMenuClicker;
    boolean mToolbarMenuPrepared;
    final android.view.Window.Callback mWindowCallback;
    private java.util.ArrayList<androidx.appcompat.app.ActionBar.OnMenuVisibilityListener> mMenuVisibilityListeners = new java.util.ArrayList<>();
    private final java.lang.Runnable mMenuInvalidator = new java.lang.Runnable() { // from class: androidx.appcompat.app.ToolbarActionBar.1
        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.app.ToolbarActionBar.this.populateOptionsMenu();
        }
    };

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationItemCount() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationMode() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getSelectedNavigationIndex() {
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getTabCount() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeButtonEnabled(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setShowHideAnimationEnabled(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSplitBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setStackedBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
    }

    ToolbarActionBar(androidx.appcompat.widget.Toolbar toolbar, java.lang.CharSequence charSequence, android.view.Window.Callback callback) {
        androidx.appcompat.widget.Toolbar.OnMenuItemClickListener onMenuItemClickListener = new androidx.appcompat.widget.Toolbar.OnMenuItemClickListener() { // from class: androidx.appcompat.app.ToolbarActionBar.2
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                return androidx.appcompat.app.ToolbarActionBar.this.mWindowCallback.onMenuItemSelected(0, menuItem);
            }
        };
        this.mMenuClicker = onMenuItemClickListener;
        androidx.core.util.Preconditions.checkNotNull(toolbar);
        androidx.appcompat.widget.ToolbarWidgetWrapper toolbarWidgetWrapper = new androidx.appcompat.widget.ToolbarWidgetWrapper(toolbar, false);
        this.mDecorToolbar = toolbarWidgetWrapper;
        this.mWindowCallback = (android.view.Window.Callback) androidx.core.util.Preconditions.checkNotNull(callback);
        toolbarWidgetWrapper.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(onMenuItemClickListener);
        toolbarWidgetWrapper.setWindowTitle(charSequence);
        this.mMenuCallback = new androidx.appcompat.app.ToolbarActionBar.ToolbarMenuCallback();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(android.view.View view) {
        setCustomView(view, new androidx.appcompat.app.ActionBar.LayoutParams(-2, -2));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(android.view.View view, androidx.appcompat.app.ActionBar.LayoutParams layoutParams) {
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        this.mDecorToolbar.setCustomView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(int i) {
        setCustomView(android.view.LayoutInflater.from(this.mDecorToolbar.getContext()).inflate(i, this.mDecorToolbar.getViewGroup(), false));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(int i) {
        this.mDecorToolbar.setIcon(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.mDecorToolbar.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(int i) {
        this.mDecorToolbar.setLogo(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(android.graphics.drawable.Drawable drawable) {
        this.mDecorToolbar.setLogo(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setElevation(float f) {
        androidx.core.view.ViewCompat.setElevation(this.mDecorToolbar.getViewGroup(), f);
    }

    @Override // androidx.appcompat.app.ActionBar
    public float getElevation() {
        return androidx.core.view.ViewCompat.getElevation(this.mDecorToolbar.getViewGroup());
    }

    @Override // androidx.appcompat.app.ActionBar
    public android.content.Context getThemedContext() {
        return this.mDecorToolbar.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isTitleTruncated() {
        return super.isTitleTruncated();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(android.graphics.drawable.Drawable drawable) {
        this.mDecorToolbar.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(int i) {
        this.mDecorToolbar.setNavigationIcon(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(java.lang.CharSequence charSequence) {
        this.mDecorToolbar.setNavigationContentDescription(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(int i) {
        this.mDecorToolbar.setNavigationContentDescription(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setListNavigationCallbacks(android.widget.SpinnerAdapter spinnerAdapter, androidx.appcompat.app.ActionBar.OnNavigationListener onNavigationListener) {
        this.mDecorToolbar.setDropdownParams(spinnerAdapter, new androidx.appcompat.app.NavItemSelectedListener(onNavigationListener));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSelectedNavigationItem(int i) {
        if (this.mDecorToolbar.getNavigationMode() == 1) {
            this.mDecorToolbar.setDropdownSelectedPosition(i);
            return;
        }
        throw new java.lang.IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(java.lang.CharSequence charSequence) {
        this.mDecorToolbar.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(int i) {
        androidx.appcompat.widget.DecorToolbar decorToolbar = this.mDecorToolbar;
        decorToolbar.setTitle(i != 0 ? decorToolbar.getContext().getText(i) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setWindowTitle(java.lang.CharSequence charSequence) {
        this.mDecorToolbar.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean requestFocus() {
        android.view.ViewGroup viewGroup = this.mDecorToolbar.getViewGroup();
        if (viewGroup == null || viewGroup.hasFocus()) {
            return false;
        }
        viewGroup.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.mDecorToolbar.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(int i) {
        androidx.appcompat.widget.DecorToolbar decorToolbar = this.mDecorToolbar;
        decorToolbar.setSubtitle(i != 0 ? decorToolbar.getContext().getText(i) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int i) {
        setDisplayOptions(i, -1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int i, int i2) {
        this.mDecorToolbar.setDisplayOptions((i & i2) | ((~i2) & this.mDecorToolbar.getDisplayOptions()));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayUseLogoEnabled(boolean z) {
        setDisplayOptions(z ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowHomeEnabled(boolean z) {
        setDisplayOptions(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayHomeAsUpEnabled(boolean z) {
        setDisplayOptions(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowTitleEnabled(boolean z) {
        setDisplayOptions(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowCustomEnabled(boolean z) {
        setDisplayOptions(z ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        this.mDecorToolbar.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public android.view.View getCustomView() {
        return this.mDecorToolbar.getCustomView();
    }

    @Override // androidx.appcompat.app.ActionBar
    public java.lang.CharSequence getTitle() {
        return this.mDecorToolbar.getTitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public java.lang.CharSequence getSubtitle() {
        return this.mDecorToolbar.getSubtitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setNavigationMode(int i) {
        if (i == 2) {
            throw new java.lang.IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.mDecorToolbar.setNavigationMode(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getDisplayOptions() {
        return this.mDecorToolbar.getDisplayOptions();
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.app.ActionBar.Tab newTab() {
        throw new java.lang.UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab tab) {
        throw new java.lang.UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab tab, boolean z) {
        throw new java.lang.UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab tab, int i) {
        throw new java.lang.UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab tab, int i, boolean z) {
        throw new java.lang.UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTab(androidx.appcompat.app.ActionBar.Tab tab) {
        throw new java.lang.UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTabAt(int i) {
        throw new java.lang.UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeAllTabs() {
        throw new java.lang.UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void selectTab(androidx.appcompat.app.ActionBar.Tab tab) {
        throw new java.lang.UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.app.ActionBar.Tab getSelectedTab() {
        throw new java.lang.UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.app.ActionBar.Tab getTabAt(int i) {
        throw new java.lang.UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHeight() {
        return this.mDecorToolbar.getHeight();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void show() {
        this.mDecorToolbar.setVisibility(0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void hide() {
        this.mDecorToolbar.setVisibility(8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isShowing() {
        return this.mDecorToolbar.getVisibility() == 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean openOptionsMenu() {
        return this.mDecorToolbar.showOverflowMenu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean closeOptionsMenu() {
        return this.mDecorToolbar.hideOverflowMenu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean invalidateOptionsMenu() {
        this.mDecorToolbar.getViewGroup().removeCallbacks(this.mMenuInvalidator);
        androidx.core.view.ViewCompat.postOnAnimation(this.mDecorToolbar.getViewGroup(), this.mMenuInvalidator);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean collapseActionView() {
        if (!this.mDecorToolbar.hasExpandedActionView()) {
            return false;
        }
        this.mDecorToolbar.collapseActionView();
        return true;
    }

    void populateOptionsMenu() {
        android.view.Menu menu = getMenu();
        androidx.appcompat.view.menu.MenuBuilder menuBuilder = menu instanceof androidx.appcompat.view.menu.MenuBuilder ? (androidx.appcompat.view.menu.MenuBuilder) menu : null;
        if (menuBuilder != null) {
            menuBuilder.stopDispatchingItemsChanged();
        }
        try {
            menu.clear();
            if (!this.mWindowCallback.onCreatePanelMenu(0, menu) || !this.mWindowCallback.onPreparePanel(0, null, menu)) {
                menu.clear();
            }
        } finally {
            if (menuBuilder != null) {
                menuBuilder.startDispatchingItemsChanged();
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean onMenuKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            openOptionsMenu();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean onKeyShortcut(int i, android.view.KeyEvent keyEvent) {
        android.view.Menu menu = getMenu();
        if (menu == null) {
            return false;
        }
        menu.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menu.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    void onDestroy() {
        this.mDecorToolbar.getViewGroup().removeCallbacks(this.mMenuInvalidator);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addOnMenuVisibilityListener(androidx.appcompat.app.ActionBar.OnMenuVisibilityListener onMenuVisibilityListener) {
        this.mMenuVisibilityListeners.add(onMenuVisibilityListener);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeOnMenuVisibilityListener(androidx.appcompat.app.ActionBar.OnMenuVisibilityListener onMenuVisibilityListener) {
        this.mMenuVisibilityListeners.remove(onMenuVisibilityListener);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void dispatchMenuVisibilityChanged(boolean z) {
        if (z == this.mLastMenuVisibility) {
            return;
        }
        this.mLastMenuVisibility = z;
        int size = this.mMenuVisibilityListeners.size();
        for (int i = 0; i < size; i++) {
            this.mMenuVisibilityListeners.get(i).onMenuVisibilityChanged(z);
        }
    }

    private class ToolbarMenuCallback implements androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback {
        ToolbarMenuCallback() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback
        public boolean onPreparePanel(int i) {
            if (i != 0 || androidx.appcompat.app.ToolbarActionBar.this.mToolbarMenuPrepared) {
                return false;
            }
            androidx.appcompat.app.ToolbarActionBar.this.mDecorToolbar.setMenuPrepared();
            androidx.appcompat.app.ToolbarActionBar.this.mToolbarMenuPrepared = true;
            return false;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback
        public android.view.View onCreatePanelView(int i) {
            if (i == 0) {
                return new android.view.View(androidx.appcompat.app.ToolbarActionBar.this.mDecorToolbar.getContext());
            }
            return null;
        }
    }

    private android.view.Menu getMenu() {
        if (!this.mMenuCallbackSet) {
            this.mDecorToolbar.setMenuCallbacks(new androidx.appcompat.app.ToolbarActionBar.ActionMenuPresenterCallback(), new androidx.appcompat.app.ToolbarActionBar.MenuBuilderCallback());
            this.mMenuCallbackSet = true;
        }
        return this.mDecorToolbar.getMenu();
    }

    private final class ActionMenuPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        private boolean mClosingActionMenu;

        ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            androidx.appcompat.app.ToolbarActionBar.this.mWindowCallback.onMenuOpened(108, menuBuilder);
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
            if (this.mClosingActionMenu) {
                return;
            }
            this.mClosingActionMenu = true;
            androidx.appcompat.app.ToolbarActionBar.this.mDecorToolbar.dismissPopupMenus();
            androidx.appcompat.app.ToolbarActionBar.this.mWindowCallback.onPanelClosed(108, menuBuilder);
            this.mClosingActionMenu = false;
        }
    }

    private final class MenuBuilderCallback implements androidx.appcompat.view.menu.MenuBuilder.Callback {
        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
            return false;
        }

        MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            if (androidx.appcompat.app.ToolbarActionBar.this.mDecorToolbar.isOverflowMenuShowing()) {
                androidx.appcompat.app.ToolbarActionBar.this.mWindowCallback.onPanelClosed(108, menuBuilder);
            } else if (androidx.appcompat.app.ToolbarActionBar.this.mWindowCallback.onPreparePanel(0, null, menuBuilder)) {
                androidx.appcompat.app.ToolbarActionBar.this.mWindowCallback.onMenuOpened(108, menuBuilder);
            }
        }
    }
}
