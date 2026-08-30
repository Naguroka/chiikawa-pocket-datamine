package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class WindowDecorActionBar extends androidx.appcompat.app.ActionBar implements androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback {
    private static final long FADE_IN_DURATION_MS = 200;
    private static final long FADE_OUT_DURATION_MS = 100;
    private static final int INVALID_POSITION = -1;
    private static final java.lang.String TAG = "WindowDecorActionBar";
    private static final android.view.animation.Interpolator sHideInterpolator = new android.view.animation.AccelerateInterpolator();
    private static final android.view.animation.Interpolator sShowInterpolator = new android.view.animation.DecelerateInterpolator();
    androidx.appcompat.app.WindowDecorActionBar.ActionModeImpl mActionMode;
    private android.app.Activity mActivity;
    androidx.appcompat.widget.ActionBarContainer mContainerView;
    android.view.View mContentView;
    android.content.Context mContext;
    androidx.appcompat.widget.ActionBarContextView mContextView;
    androidx.appcompat.view.ViewPropertyAnimatorCompatSet mCurrentShowAnim;
    androidx.appcompat.widget.DecorToolbar mDecorToolbar;
    androidx.appcompat.view.ActionMode mDeferredDestroyActionMode;
    androidx.appcompat.view.ActionMode.Callback mDeferredModeDestroyCallback;
    private boolean mDisplayHomeAsUpSet;
    private boolean mHasEmbeddedTabs;
    boolean mHiddenByApp;
    boolean mHiddenBySystem;
    boolean mHideOnContentScroll;
    private boolean mLastMenuVisibility;
    androidx.appcompat.widget.ActionBarOverlayLayout mOverlayLayout;
    private androidx.appcompat.app.WindowDecorActionBar.TabImpl mSelectedTab;
    private boolean mShowHideAnimationEnabled;
    private boolean mShowingForMode;
    androidx.appcompat.widget.ScrollingTabContainerView mTabScrollView;
    private android.content.Context mThemedContext;
    private java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar.TabImpl> mTabs = new java.util.ArrayList<>();
    private int mSavedTabPosition = -1;
    private java.util.ArrayList<androidx.appcompat.app.ActionBar.OnMenuVisibilityListener> mMenuVisibilityListeners = new java.util.ArrayList<>();
    private int mCurWindowVisibility = 0;
    boolean mContentAnimations = true;
    private boolean mNowShowing = true;
    final androidx.core.view.ViewPropertyAnimatorListener mHideListener = new androidx.core.view.ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.WindowDecorActionBar.1
        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(android.view.View view) {
            if (androidx.appcompat.app.WindowDecorActionBar.this.mContentAnimations && androidx.appcompat.app.WindowDecorActionBar.this.mContentView != null) {
                androidx.appcompat.app.WindowDecorActionBar.this.mContentView.setTranslationY(0.0f);
                androidx.appcompat.app.WindowDecorActionBar.this.mContainerView.setTranslationY(0.0f);
            }
            androidx.appcompat.app.WindowDecorActionBar.this.mContainerView.setVisibility(8);
            androidx.appcompat.app.WindowDecorActionBar.this.mContainerView.setTransitioning(false);
            androidx.appcompat.app.WindowDecorActionBar.this.mCurrentShowAnim = null;
            androidx.appcompat.app.WindowDecorActionBar.this.completeDeferredDestroyActionMode();
            if (androidx.appcompat.app.WindowDecorActionBar.this.mOverlayLayout != null) {
                androidx.core.view.ViewCompat.requestApplyInsets(androidx.appcompat.app.WindowDecorActionBar.this.mOverlayLayout);
            }
        }
    };
    final androidx.core.view.ViewPropertyAnimatorListener mShowListener = new androidx.core.view.ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.WindowDecorActionBar.2
        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(android.view.View view) {
            androidx.appcompat.app.WindowDecorActionBar.this.mCurrentShowAnim = null;
            androidx.appcompat.app.WindowDecorActionBar.this.mContainerView.requestLayout();
        }
    };
    final androidx.core.view.ViewPropertyAnimatorUpdateListener mUpdateListener = new androidx.core.view.ViewPropertyAnimatorUpdateListener() { // from class: androidx.appcompat.app.WindowDecorActionBar.3
        @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
        public void onAnimationUpdate(android.view.View view) {
            ((android.view.View) androidx.appcompat.app.WindowDecorActionBar.this.mContainerView.getParent()).invalidate();
        }
    };

    static boolean checkShowingFlags(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStopped() {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSplitBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
    }

    public WindowDecorActionBar(android.app.Activity activity, boolean z) {
        this.mActivity = activity;
        android.view.View decorView = activity.getWindow().getDecorView();
        init(decorView);
        if (z) {
            return;
        }
        this.mContentView = decorView.findViewById(android.R.id.content);
    }

    public WindowDecorActionBar(android.app.Dialog dialog) {
        init(dialog.getWindow().getDecorView());
    }

    public WindowDecorActionBar(android.view.View view) {
        init(view);
    }

    private void init(android.view.View view) {
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) view.findViewById(androidx.appcompat.R.id.decor_content_parent);
        this.mOverlayLayout = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.mDecorToolbar = getDecorToolbar(view.findViewById(androidx.appcompat.R.id.action_bar));
        this.mContextView = (androidx.appcompat.widget.ActionBarContextView) view.findViewById(androidx.appcompat.R.id.action_context_bar);
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = (androidx.appcompat.widget.ActionBarContainer) view.findViewById(androidx.appcompat.R.id.action_bar_container);
        this.mContainerView = actionBarContainer;
        androidx.appcompat.widget.DecorToolbar decorToolbar = this.mDecorToolbar;
        if (decorToolbar == null || this.mContextView == null || actionBarContainer == null) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.mContext = decorToolbar.getContext();
        boolean z = (this.mDecorToolbar.getDisplayOptions() & 4) != 0;
        if (z) {
            this.mDisplayHomeAsUpSet = true;
        }
        androidx.appcompat.view.ActionBarPolicy actionBarPolicy = androidx.appcompat.view.ActionBarPolicy.get(this.mContext);
        setHomeButtonEnabled(actionBarPolicy.enableHomeButtonByDefault() || z);
        setHasEmbeddedTabs(actionBarPolicy.hasEmbeddedTabs());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(null, androidx.appcompat.R.styleable.ActionBar, androidx.appcompat.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.ActionBar_hideOnContentScroll, false)) {
            setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private androidx.appcompat.widget.DecorToolbar getDecorToolbar(android.view.View view) {
        if (view instanceof androidx.appcompat.widget.DecorToolbar) {
            return (androidx.appcompat.widget.DecorToolbar) view;
        }
        if (view instanceof androidx.appcompat.widget.Toolbar) {
            return ((androidx.appcompat.widget.Toolbar) view).getWrapper();
        }
        throw new java.lang.IllegalStateException("Can't make a decor toolbar out of " + (view != 0 ? view.getClass().getSimpleName() : "null"));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setElevation(float f) {
        androidx.core.view.ViewCompat.setElevation(this.mContainerView, f);
    }

    @Override // androidx.appcompat.app.ActionBar
    public float getElevation() {
        return androidx.core.view.ViewCompat.getElevation(this.mContainerView);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        setHasEmbeddedTabs(androidx.appcompat.view.ActionBarPolicy.get(this.mContext).hasEmbeddedTabs());
    }

    private void setHasEmbeddedTabs(boolean z) {
        this.mHasEmbeddedTabs = z;
        if (!z) {
            this.mDecorToolbar.setEmbeddedTabView(null);
            this.mContainerView.setTabContainer(this.mTabScrollView);
        } else {
            this.mContainerView.setTabContainer(null);
            this.mDecorToolbar.setEmbeddedTabView(this.mTabScrollView);
        }
        boolean z2 = getNavigationMode() == 2;
        androidx.appcompat.widget.ScrollingTabContainerView scrollingTabContainerView = this.mTabScrollView;
        if (scrollingTabContainerView != null) {
            if (z2) {
                scrollingTabContainerView.setVisibility(0);
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.mOverlayLayout;
                if (actionBarOverlayLayout != null) {
                    androidx.core.view.ViewCompat.requestApplyInsets(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.mDecorToolbar.setCollapsible(!this.mHasEmbeddedTabs && z2);
        this.mOverlayLayout.setHasNonEmbeddedTabs(!this.mHasEmbeddedTabs && z2);
    }

    private void ensureTabsExist() {
        if (this.mTabScrollView != null) {
            return;
        }
        androidx.appcompat.widget.ScrollingTabContainerView scrollingTabContainerView = new androidx.appcompat.widget.ScrollingTabContainerView(this.mContext);
        if (this.mHasEmbeddedTabs) {
            scrollingTabContainerView.setVisibility(0);
            this.mDecorToolbar.setEmbeddedTabView(scrollingTabContainerView);
        } else {
            if (getNavigationMode() == 2) {
                scrollingTabContainerView.setVisibility(0);
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.mOverlayLayout;
                if (actionBarOverlayLayout != null) {
                    androidx.core.view.ViewCompat.requestApplyInsets(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
            this.mContainerView.setTabContainer(scrollingTabContainerView);
        }
        this.mTabScrollView = scrollingTabContainerView;
    }

    void completeDeferredDestroyActionMode() {
        androidx.appcompat.view.ActionMode.Callback callback = this.mDeferredModeDestroyCallback;
        if (callback != null) {
            callback.onDestroyActionMode(this.mDeferredDestroyActionMode);
            this.mDeferredDestroyActionMode = null;
            this.mDeferredModeDestroyCallback = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onWindowVisibilityChanged(int i) {
        this.mCurWindowVisibility = i;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setShowHideAnimationEnabled(boolean z) {
        androidx.appcompat.view.ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet;
        this.mShowHideAnimationEnabled = z;
        if (z || (viewPropertyAnimatorCompatSet = this.mCurrentShowAnim) == null) {
            return;
        }
        viewPropertyAnimatorCompatSet.cancel();
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

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(int i) {
        setCustomView(android.view.LayoutInflater.from(getThemedContext()).inflate(i, this.mDecorToolbar.getViewGroup(), false));
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
    public void setHomeButtonEnabled(boolean z) {
        this.mDecorToolbar.setHomeButtonEnabled(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(int i) {
        setTitle(this.mContext.getString(i));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(int i) {
        setSubtitle(this.mContext.getString(i));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSelectedNavigationItem(int i) {
        int navigationMode = this.mDecorToolbar.getNavigationMode();
        if (navigationMode == 1) {
            this.mDecorToolbar.setDropdownSelectedPosition(i);
        } else {
            if (navigationMode == 2) {
                selectTab(this.mTabs.get(i));
                return;
            }
            throw new java.lang.IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeAllTabs() {
        cleanupTabs();
    }

    private void cleanupTabs() {
        if (this.mSelectedTab != null) {
            selectTab(null);
        }
        this.mTabs.clear();
        androidx.appcompat.widget.ScrollingTabContainerView scrollingTabContainerView = this.mTabScrollView;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.removeAllTabs();
        }
        this.mSavedTabPosition = -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(java.lang.CharSequence charSequence) {
        this.mDecorToolbar.setTitle(charSequence);
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
    public void setDisplayOptions(int i) {
        if ((i & 4) != 0) {
            this.mDisplayHomeAsUpSet = true;
        }
        this.mDecorToolbar.setDisplayOptions(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int i, int i2) {
        int displayOptions = this.mDecorToolbar.getDisplayOptions();
        if ((i2 & 4) != 0) {
            this.mDisplayHomeAsUpSet = true;
        }
        this.mDecorToolbar.setDisplayOptions((i & i2) | ((~i2) & displayOptions));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        this.mContainerView.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setStackedBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        this.mContainerView.setStackedBackground(drawable);
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
    public int getNavigationMode() {
        return this.mDecorToolbar.getNavigationMode();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getDisplayOptions() {
        return this.mDecorToolbar.getDisplayOptions();
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.view.ActionMode startActionMode(androidx.appcompat.view.ActionMode.Callback callback) {
        androidx.appcompat.app.WindowDecorActionBar.ActionModeImpl actionModeImpl = this.mActionMode;
        if (actionModeImpl != null) {
            actionModeImpl.finish();
        }
        this.mOverlayLayout.setHideOnContentScrollEnabled(false);
        this.mContextView.killMode();
        androidx.appcompat.app.WindowDecorActionBar.ActionModeImpl actionModeImpl2 = new androidx.appcompat.app.WindowDecorActionBar.ActionModeImpl(this.mContextView.getContext(), callback);
        if (!actionModeImpl2.dispatchOnCreate()) {
            return null;
        }
        this.mActionMode = actionModeImpl2;
        actionModeImpl2.invalidate();
        this.mContextView.initForMode(actionModeImpl2);
        animateToMode(true);
        return actionModeImpl2;
    }

    private void configureTab(androidx.appcompat.app.ActionBar.Tab tab, int i) {
        androidx.appcompat.app.WindowDecorActionBar.TabImpl tabImpl = (androidx.appcompat.app.WindowDecorActionBar.TabImpl) tab;
        if (tabImpl.getCallback() == null) {
            throw new java.lang.IllegalStateException("Action Bar Tab must have a Callback");
        }
        tabImpl.setPosition(i);
        this.mTabs.add(i, tabImpl);
        int size = this.mTabs.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.mTabs.get(i).setPosition(i);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab tab) {
        addTab(tab, this.mTabs.isEmpty());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab tab, int i) {
        addTab(tab, i, this.mTabs.isEmpty());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab tab, boolean z) {
        ensureTabsExist();
        this.mTabScrollView.addTab(tab, z);
        configureTab(tab, this.mTabs.size());
        if (z) {
            selectTab(tab);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab tab, int i, boolean z) {
        ensureTabsExist();
        this.mTabScrollView.addTab(tab, i, z);
        configureTab(tab, i);
        if (z) {
            selectTab(tab);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.app.ActionBar.Tab newTab() {
        return new androidx.appcompat.app.WindowDecorActionBar.TabImpl();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTab(androidx.appcompat.app.ActionBar.Tab tab) {
        removeTabAt(tab.getPosition());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTabAt(int i) {
        if (this.mTabScrollView == null) {
            return;
        }
        androidx.appcompat.app.WindowDecorActionBar.TabImpl tabImpl = this.mSelectedTab;
        int position = tabImpl != null ? tabImpl.getPosition() : this.mSavedTabPosition;
        this.mTabScrollView.removeTabAt(i);
        androidx.appcompat.app.WindowDecorActionBar.TabImpl tabImplRemove = this.mTabs.remove(i);
        if (tabImplRemove != null) {
            tabImplRemove.setPosition(-1);
        }
        int size = this.mTabs.size();
        for (int i2 = i; i2 < size; i2++) {
            this.mTabs.get(i2).setPosition(i2);
        }
        if (position == i) {
            selectTab(this.mTabs.isEmpty() ? null : this.mTabs.get(java.lang.Math.max(0, i - 1)));
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void selectTab(androidx.appcompat.app.ActionBar.Tab tab) {
        if (getNavigationMode() != 2) {
            this.mSavedTabPosition = tab != null ? tab.getPosition() : -1;
            return;
        }
        androidx.fragment.app.FragmentTransaction fragmentTransactionDisallowAddToBackStack = (!(this.mActivity instanceof androidx.fragment.app.FragmentActivity) || this.mDecorToolbar.getViewGroup().isInEditMode()) ? null : ((androidx.fragment.app.FragmentActivity) this.mActivity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
        androidx.appcompat.app.WindowDecorActionBar.TabImpl tabImpl = this.mSelectedTab;
        if (tabImpl != tab) {
            this.mTabScrollView.setTabSelected(tab != null ? tab.getPosition() : -1);
            androidx.appcompat.app.WindowDecorActionBar.TabImpl tabImpl2 = this.mSelectedTab;
            if (tabImpl2 != null) {
                tabImpl2.getCallback().onTabUnselected(this.mSelectedTab, fragmentTransactionDisallowAddToBackStack);
            }
            androidx.appcompat.app.WindowDecorActionBar.TabImpl tabImpl3 = (androidx.appcompat.app.WindowDecorActionBar.TabImpl) tab;
            this.mSelectedTab = tabImpl3;
            if (tabImpl3 != null) {
                tabImpl3.getCallback().onTabSelected(this.mSelectedTab, fragmentTransactionDisallowAddToBackStack);
            }
        } else if (tabImpl != null) {
            tabImpl.getCallback().onTabReselected(this.mSelectedTab, fragmentTransactionDisallowAddToBackStack);
            this.mTabScrollView.animateToTab(tab.getPosition());
        }
        if (fragmentTransactionDisallowAddToBackStack == null || fragmentTransactionDisallowAddToBackStack.isEmpty()) {
            return;
        }
        fragmentTransactionDisallowAddToBackStack.commit();
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.app.ActionBar.Tab getSelectedTab() {
        return this.mSelectedTab;
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHeight() {
        return this.mContainerView.getHeight();
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void enableContentAnimations(boolean z) {
        this.mContentAnimations = z;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void show() {
        if (this.mHiddenByApp) {
            this.mHiddenByApp = false;
            updateVisibility(false);
        }
    }

    private void showForActionMode() {
        if (this.mShowingForMode) {
            return;
        }
        this.mShowingForMode = true;
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.mOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        updateVisibility(false);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void showForSystem() {
        if (this.mHiddenBySystem) {
            this.mHiddenBySystem = false;
            updateVisibility(true);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void hide() {
        if (this.mHiddenByApp) {
            return;
        }
        this.mHiddenByApp = true;
        updateVisibility(false);
    }

    private void hideForActionMode() {
        if (this.mShowingForMode) {
            this.mShowingForMode = false;
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.mOverlayLayout;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            updateVisibility(false);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void hideForSystem() {
        if (this.mHiddenBySystem) {
            return;
        }
        this.mHiddenBySystem = true;
        updateVisibility(true);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHideOnContentScrollEnabled(boolean z) {
        if (z && !this.mOverlayLayout.isInOverlayMode()) {
            throw new java.lang.IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.mHideOnContentScroll = z;
        this.mOverlayLayout.setHideOnContentScrollEnabled(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isHideOnContentScrollEnabled() {
        return this.mOverlayLayout.isHideOnContentScrollEnabled();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHideOffset() {
        return this.mOverlayLayout.getActionBarHideOffset();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHideOffset(int i) {
        if (i != 0 && !this.mOverlayLayout.isInOverlayMode()) {
            throw new java.lang.IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.mOverlayLayout.setActionBarHideOffset(i);
    }

    private void updateVisibility(boolean z) {
        if (checkShowingFlags(this.mHiddenByApp, this.mHiddenBySystem, this.mShowingForMode)) {
            if (this.mNowShowing) {
                return;
            }
            this.mNowShowing = true;
            doShow(z);
            return;
        }
        if (this.mNowShowing) {
            this.mNowShowing = false;
            doHide(z);
        }
    }

    public void doShow(boolean z) {
        android.view.View view;
        android.view.View view2;
        androidx.appcompat.view.ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.mCurrentShowAnim;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.cancel();
        }
        this.mContainerView.setVisibility(0);
        if (this.mCurWindowVisibility == 0 && (this.mShowHideAnimationEnabled || z)) {
            this.mContainerView.setTranslationY(0.0f);
            float f = -this.mContainerView.getHeight();
            if (z) {
                int[] iArr = {0, 0};
                this.mContainerView.getLocationInWindow(iArr);
                f -= iArr[1];
            }
            this.mContainerView.setTranslationY(f);
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new androidx.appcompat.view.ViewPropertyAnimatorCompatSet();
            androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompatTranslationY = androidx.core.view.ViewCompat.animate(this.mContainerView).translationY(0.0f);
            viewPropertyAnimatorCompatTranslationY.setUpdateListener(this.mUpdateListener);
            viewPropertyAnimatorCompatSet2.play(viewPropertyAnimatorCompatTranslationY);
            if (this.mContentAnimations && (view2 = this.mContentView) != null) {
                view2.setTranslationY(f);
                viewPropertyAnimatorCompatSet2.play(androidx.core.view.ViewCompat.animate(this.mContentView).translationY(0.0f));
            }
            viewPropertyAnimatorCompatSet2.setInterpolator(sShowInterpolator);
            viewPropertyAnimatorCompatSet2.setDuration(250L);
            viewPropertyAnimatorCompatSet2.setListener(this.mShowListener);
            this.mCurrentShowAnim = viewPropertyAnimatorCompatSet2;
            viewPropertyAnimatorCompatSet2.start();
        } else {
            this.mContainerView.setAlpha(1.0f);
            this.mContainerView.setTranslationY(0.0f);
            if (this.mContentAnimations && (view = this.mContentView) != null) {
                view.setTranslationY(0.0f);
            }
            this.mShowListener.onAnimationEnd(null);
        }
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.mOverlayLayout;
        if (actionBarOverlayLayout != null) {
            androidx.core.view.ViewCompat.requestApplyInsets(actionBarOverlayLayout);
        }
    }

    public void doHide(boolean z) {
        android.view.View view;
        androidx.appcompat.view.ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.mCurrentShowAnim;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.cancel();
        }
        if (this.mCurWindowVisibility == 0 && (this.mShowHideAnimationEnabled || z)) {
            this.mContainerView.setAlpha(1.0f);
            this.mContainerView.setTransitioning(true);
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new androidx.appcompat.view.ViewPropertyAnimatorCompatSet();
            float f = -this.mContainerView.getHeight();
            if (z) {
                int[] iArr = {0, 0};
                this.mContainerView.getLocationInWindow(iArr);
                f -= iArr[1];
            }
            androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompatTranslationY = androidx.core.view.ViewCompat.animate(this.mContainerView).translationY(f);
            viewPropertyAnimatorCompatTranslationY.setUpdateListener(this.mUpdateListener);
            viewPropertyAnimatorCompatSet2.play(viewPropertyAnimatorCompatTranslationY);
            if (this.mContentAnimations && (view = this.mContentView) != null) {
                viewPropertyAnimatorCompatSet2.play(androidx.core.view.ViewCompat.animate(view).translationY(f));
            }
            viewPropertyAnimatorCompatSet2.setInterpolator(sHideInterpolator);
            viewPropertyAnimatorCompatSet2.setDuration(250L);
            viewPropertyAnimatorCompatSet2.setListener(this.mHideListener);
            this.mCurrentShowAnim = viewPropertyAnimatorCompatSet2;
            viewPropertyAnimatorCompatSet2.start();
            return;
        }
        this.mHideListener.onAnimationEnd(null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isShowing() {
        int height = getHeight();
        return this.mNowShowing && (height == 0 || getHideOffset() < height);
    }

    public void animateToMode(boolean z) {
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat;
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2;
        if (z) {
            showForActionMode();
        } else {
            hideForActionMode();
        }
        if (!shouldAnimateContextView()) {
            if (z) {
                this.mDecorToolbar.setVisibility(4);
                this.mContextView.setVisibility(0);
                return;
            } else {
                this.mDecorToolbar.setVisibility(0);
                this.mContextView.setVisibility(8);
                return;
            }
        }
        if (z) {
            viewPropertyAnimatorCompat2 = this.mDecorToolbar.setupAnimatorToVisibility(4, 100L);
            viewPropertyAnimatorCompat = this.mContextView.setupAnimatorToVisibility(0, FADE_IN_DURATION_MS);
        } else {
            viewPropertyAnimatorCompat = this.mDecorToolbar.setupAnimatorToVisibility(0, FADE_IN_DURATION_MS);
            viewPropertyAnimatorCompat2 = this.mContextView.setupAnimatorToVisibility(8, 100L);
        }
        androidx.appcompat.view.ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = new androidx.appcompat.view.ViewPropertyAnimatorCompatSet();
        viewPropertyAnimatorCompatSet.playSequentially(viewPropertyAnimatorCompat2, viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompatSet.start();
    }

    private boolean shouldAnimateContextView() {
        return androidx.core.view.ViewCompat.isLaidOut(this.mContainerView);
    }

    @Override // androidx.appcompat.app.ActionBar
    public android.content.Context getThemedContext() {
        if (this.mThemedContext == null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.mContext.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.mThemedContext = new android.view.ContextThemeWrapper(this.mContext, i);
            } else {
                this.mThemedContext = this.mContext;
            }
        }
        return this.mThemedContext;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isTitleTruncated() {
        androidx.appcompat.widget.DecorToolbar decorToolbar = this.mDecorToolbar;
        return decorToolbar != null && decorToolbar.isTitleTruncated();
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

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStarted() {
        androidx.appcompat.view.ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.mCurrentShowAnim;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.cancel();
            this.mCurrentShowAnim = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean collapseActionView() {
        androidx.appcompat.widget.DecorToolbar decorToolbar = this.mDecorToolbar;
        if (decorToolbar == null || !decorToolbar.hasExpandedActionView()) {
            return false;
        }
        this.mDecorToolbar.collapseActionView();
        return true;
    }

    public class ActionModeImpl extends androidx.appcompat.view.ActionMode implements androidx.appcompat.view.menu.MenuBuilder.Callback {
        private final android.content.Context mActionModeContext;
        private androidx.appcompat.view.ActionMode.Callback mCallback;
        private java.lang.ref.WeakReference<android.view.View> mCustomView;
        private final androidx.appcompat.view.menu.MenuBuilder mMenu;

        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        }

        public void onCloseSubMenu(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        }

        public ActionModeImpl(android.content.Context context, androidx.appcompat.view.ActionMode.Callback callback) {
            this.mActionModeContext = context;
            this.mCallback = callback;
            androidx.appcompat.view.menu.MenuBuilder defaultShowAsAction = new androidx.appcompat.view.menu.MenuBuilder(context).setDefaultShowAsAction(1);
            this.mMenu = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        @Override // androidx.appcompat.view.ActionMode
        public android.view.MenuInflater getMenuInflater() {
            return new androidx.appcompat.view.SupportMenuInflater(this.mActionModeContext);
        }

        @Override // androidx.appcompat.view.ActionMode
        public android.view.Menu getMenu() {
            return this.mMenu;
        }

        @Override // androidx.appcompat.view.ActionMode
        public void finish() {
            if (androidx.appcompat.app.WindowDecorActionBar.this.mActionMode != this) {
                return;
            }
            if (!androidx.appcompat.app.WindowDecorActionBar.checkShowingFlags(androidx.appcompat.app.WindowDecorActionBar.this.mHiddenByApp, androidx.appcompat.app.WindowDecorActionBar.this.mHiddenBySystem, false)) {
                androidx.appcompat.app.WindowDecorActionBar.this.mDeferredDestroyActionMode = this;
                androidx.appcompat.app.WindowDecorActionBar.this.mDeferredModeDestroyCallback = this.mCallback;
            } else {
                this.mCallback.onDestroyActionMode(this);
            }
            this.mCallback = null;
            androidx.appcompat.app.WindowDecorActionBar.this.animateToMode(false);
            androidx.appcompat.app.WindowDecorActionBar.this.mContextView.closeMode();
            androidx.appcompat.app.WindowDecorActionBar.this.mOverlayLayout.setHideOnContentScrollEnabled(androidx.appcompat.app.WindowDecorActionBar.this.mHideOnContentScroll);
            androidx.appcompat.app.WindowDecorActionBar.this.mActionMode = null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public void invalidate() {
            if (androidx.appcompat.app.WindowDecorActionBar.this.mActionMode != this) {
                return;
            }
            this.mMenu.stopDispatchingItemsChanged();
            try {
                this.mCallback.onPrepareActionMode(this, this.mMenu);
            } finally {
                this.mMenu.startDispatchingItemsChanged();
            }
        }

        public boolean dispatchOnCreate() {
            this.mMenu.stopDispatchingItemsChanged();
            try {
                return this.mCallback.onCreateActionMode(this, this.mMenu);
            } finally {
                this.mMenu.startDispatchingItemsChanged();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setCustomView(android.view.View view) {
            androidx.appcompat.app.WindowDecorActionBar.this.mContextView.setCustomView(view);
            this.mCustomView = new java.lang.ref.WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setSubtitle(java.lang.CharSequence charSequence) {
            androidx.appcompat.app.WindowDecorActionBar.this.mContextView.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitle(java.lang.CharSequence charSequence) {
            androidx.appcompat.app.WindowDecorActionBar.this.mContextView.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitle(int i) {
            setTitle(androidx.appcompat.app.WindowDecorActionBar.this.mContext.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setSubtitle(int i) {
            setSubtitle(androidx.appcompat.app.WindowDecorActionBar.this.mContext.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.ActionMode
        public java.lang.CharSequence getTitle() {
            return androidx.appcompat.app.WindowDecorActionBar.this.mContextView.getTitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public java.lang.CharSequence getSubtitle() {
            return androidx.appcompat.app.WindowDecorActionBar.this.mContextView.getSubtitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitleOptionalHint(boolean z) {
            super.setTitleOptionalHint(z);
            androidx.appcompat.app.WindowDecorActionBar.this.mContextView.setTitleOptional(z);
        }

        @Override // androidx.appcompat.view.ActionMode
        public boolean isTitleOptional() {
            return androidx.appcompat.app.WindowDecorActionBar.this.mContextView.isTitleOptional();
        }

        @Override // androidx.appcompat.view.ActionMode
        public android.view.View getCustomView() {
            java.lang.ref.WeakReference<android.view.View> weakReference = this.mCustomView;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
            androidx.appcompat.view.ActionMode.Callback callback = this.mCallback;
            if (callback != null) {
                return callback.onActionItemClicked(this, menuItem);
            }
            return false;
        }

        public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
            if (this.mCallback == null) {
                return false;
            }
            if (!subMenuBuilder.hasVisibleItems()) {
                return true;
            }
            new androidx.appcompat.view.menu.MenuPopupHelper(androidx.appcompat.app.WindowDecorActionBar.this.getThemedContext(), subMenuBuilder).show();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            if (this.mCallback == null) {
                return;
            }
            invalidate();
            androidx.appcompat.app.WindowDecorActionBar.this.mContextView.showOverflowMenu();
        }
    }

    public class TabImpl extends androidx.appcompat.app.ActionBar.Tab {
        private androidx.appcompat.app.ActionBar.TabListener mCallback;
        private java.lang.CharSequence mContentDesc;
        private android.view.View mCustomView;
        private android.graphics.drawable.Drawable mIcon;
        private int mPosition = -1;
        private java.lang.Object mTag;
        private java.lang.CharSequence mText;

        public TabImpl() {
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public java.lang.Object getTag() {
            return this.mTag;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setTag(java.lang.Object obj) {
            this.mTag = obj;
            return this;
        }

        public androidx.appcompat.app.ActionBar.TabListener getCallback() {
            return this.mCallback;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setTabListener(androidx.appcompat.app.ActionBar.TabListener tabListener) {
            this.mCallback = tabListener;
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public android.view.View getCustomView() {
            return this.mCustomView;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setCustomView(android.view.View view) {
            this.mCustomView = view;
            if (this.mPosition >= 0) {
                androidx.appcompat.app.WindowDecorActionBar.this.mTabScrollView.updateTab(this.mPosition);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setCustomView(int i) {
            return setCustomView(android.view.LayoutInflater.from(androidx.appcompat.app.WindowDecorActionBar.this.getThemedContext()).inflate(i, (android.view.ViewGroup) null));
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public android.graphics.drawable.Drawable getIcon() {
            return this.mIcon;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public int getPosition() {
            return this.mPosition;
        }

        public void setPosition(int i) {
            this.mPosition = i;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public java.lang.CharSequence getText() {
            return this.mText;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setIcon(android.graphics.drawable.Drawable drawable) {
            this.mIcon = drawable;
            if (this.mPosition >= 0) {
                androidx.appcompat.app.WindowDecorActionBar.this.mTabScrollView.updateTab(this.mPosition);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setIcon(int i) {
            return setIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(androidx.appcompat.app.WindowDecorActionBar.this.mContext, i));
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setText(java.lang.CharSequence charSequence) {
            this.mText = charSequence;
            if (this.mPosition >= 0) {
                androidx.appcompat.app.WindowDecorActionBar.this.mTabScrollView.updateTab(this.mPosition);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setText(int i) {
            return setText(androidx.appcompat.app.WindowDecorActionBar.this.mContext.getResources().getText(i));
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public void select() {
            androidx.appcompat.app.WindowDecorActionBar.this.selectTab(this);
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setContentDescription(int i) {
            return setContentDescription(androidx.appcompat.app.WindowDecorActionBar.this.mContext.getResources().getText(i));
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setContentDescription(java.lang.CharSequence charSequence) {
            this.mContentDesc = charSequence;
            if (this.mPosition >= 0) {
                androidx.appcompat.app.WindowDecorActionBar.this.mTabScrollView.updateTab(this.mPosition);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public java.lang.CharSequence getContentDescription() {
            return this.mContentDesc;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(android.view.View view) {
        this.mDecorToolbar.setCustomView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(android.view.View view, androidx.appcompat.app.ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.mDecorToolbar.setCustomView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setListNavigationCallbacks(android.widget.SpinnerAdapter spinnerAdapter, androidx.appcompat.app.ActionBar.OnNavigationListener onNavigationListener) {
        this.mDecorToolbar.setDropdownParams(spinnerAdapter, new androidx.appcompat.app.NavItemSelectedListener(onNavigationListener));
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getSelectedNavigationIndex() {
        androidx.appcompat.app.WindowDecorActionBar.TabImpl tabImpl;
        int navigationMode = this.mDecorToolbar.getNavigationMode();
        if (navigationMode == 1) {
            return this.mDecorToolbar.getDropdownSelectedPosition();
        }
        if (navigationMode == 2 && (tabImpl = this.mSelectedTab) != null) {
            return tabImpl.getPosition();
        }
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationItemCount() {
        int navigationMode = this.mDecorToolbar.getNavigationMode();
        if (navigationMode == 1) {
            return this.mDecorToolbar.getDropdownItemCount();
        }
        if (navigationMode != 2) {
            return 0;
        }
        return this.mTabs.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getTabCount() {
        return this.mTabs.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setNavigationMode(int i) {
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout;
        int navigationMode = this.mDecorToolbar.getNavigationMode();
        if (navigationMode == 2) {
            this.mSavedTabPosition = getSelectedNavigationIndex();
            selectTab(null);
            this.mTabScrollView.setVisibility(8);
        }
        if (navigationMode != i && !this.mHasEmbeddedTabs && (actionBarOverlayLayout = this.mOverlayLayout) != null) {
            androidx.core.view.ViewCompat.requestApplyInsets(actionBarOverlayLayout);
        }
        this.mDecorToolbar.setNavigationMode(i);
        boolean z = false;
        if (i == 2) {
            ensureTabsExist();
            this.mTabScrollView.setVisibility(0);
            int i2 = this.mSavedTabPosition;
            if (i2 != -1) {
                setSelectedNavigationItem(i2);
                this.mSavedTabPosition = -1;
            }
        }
        this.mDecorToolbar.setCollapsible(i == 2 && !this.mHasEmbeddedTabs);
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout2 = this.mOverlayLayout;
        if (i == 2 && !this.mHasEmbeddedTabs) {
            z = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.app.ActionBar.Tab getTabAt(int i) {
        return this.mTabs.get(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(int i) {
        this.mDecorToolbar.setIcon(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.mDecorToolbar.setIcon(drawable);
    }

    public boolean hasIcon() {
        return this.mDecorToolbar.hasIcon();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(int i) {
        this.mDecorToolbar.setLogo(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(android.graphics.drawable.Drawable drawable) {
        this.mDecorToolbar.setLogo(drawable);
    }

    public boolean hasLogo() {
        return this.mDecorToolbar.hasLogo();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
        if (this.mDisplayHomeAsUpSet) {
            return;
        }
        setDisplayHomeAsUpEnabled(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean onKeyShortcut(int i, android.view.KeyEvent keyEvent) {
        android.view.Menu menu;
        androidx.appcompat.app.WindowDecorActionBar.ActionModeImpl actionModeImpl = this.mActionMode;
        if (actionModeImpl == null || (menu = actionModeImpl.getMenu()) == null) {
            return false;
        }
        menu.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menu.performShortcut(i, keyEvent, 0);
    }
}
