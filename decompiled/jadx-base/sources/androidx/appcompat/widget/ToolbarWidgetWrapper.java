package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ToolbarWidgetWrapper implements androidx.appcompat.widget.DecorToolbar {
    private static final int AFFECTS_LOGO_MASK = 3;
    private static final long DEFAULT_FADE_DURATION_MS = 200;
    private static final java.lang.String TAG = "ToolbarWidgetWrapper";
    private androidx.appcompat.widget.ActionMenuPresenter mActionMenuPresenter;
    private android.view.View mCustomView;
    private int mDefaultNavigationContentDescription;
    private android.graphics.drawable.Drawable mDefaultNavigationIcon;
    private int mDisplayOpts;
    private java.lang.CharSequence mHomeDescription;
    private android.graphics.drawable.Drawable mIcon;
    private android.graphics.drawable.Drawable mLogo;
    boolean mMenuPrepared;
    private android.graphics.drawable.Drawable mNavIcon;
    private int mNavigationMode;
    private android.widget.Spinner mSpinner;
    private java.lang.CharSequence mSubtitle;
    private android.view.View mTabView;
    java.lang.CharSequence mTitle;
    private boolean mTitleSet;
    androidx.appcompat.widget.Toolbar mToolbar;
    android.view.Window.Callback mWindowCallback;

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setHomeButtonEnabled(boolean z) {
    }

    public ToolbarWidgetWrapper(androidx.appcompat.widget.Toolbar toolbar, boolean z) {
        this(toolbar, z, androidx.appcompat.R.string.abc_action_bar_up_description, androidx.appcompat.R.drawable.abc_ic_ab_back_material);
    }

    public ToolbarWidgetWrapper(androidx.appcompat.widget.Toolbar toolbar, boolean z, int i, int i2) {
        android.graphics.drawable.Drawable drawable;
        this.mNavigationMode = 0;
        this.mDefaultNavigationContentDescription = 0;
        this.mToolbar = toolbar;
        this.mTitle = toolbar.getTitle();
        this.mSubtitle = toolbar.getSubtitle();
        this.mTitleSet = this.mTitle != null;
        this.mNavIcon = toolbar.getNavigationIcon();
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(toolbar.getContext(), null, androidx.appcompat.R.styleable.ActionBar, androidx.appcompat.R.attr.actionBarStyle, 0);
        this.mDefaultNavigationIcon = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActionBar_homeAsUpIndicator);
        if (z) {
            java.lang.CharSequence text = tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.ActionBar_title);
            if (!android.text.TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            java.lang.CharSequence text2 = tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.ActionBar_subtitle);
            if (!android.text.TextUtils.isEmpty(text2)) {
                setSubtitle(text2);
            }
            android.graphics.drawable.Drawable drawable2 = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActionBar_logo);
            if (drawable2 != null) {
                setLogo(drawable2);
            }
            android.graphics.drawable.Drawable drawable3 = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActionBar_icon);
            if (drawable3 != null) {
                setIcon(drawable3);
            }
            if (this.mNavIcon == null && (drawable = this.mDefaultNavigationIcon) != null) {
                setNavigationIcon(drawable);
            }
            setDisplayOptions(tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.ActionBar_displayOptions, 0));
            int resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                setCustomView(android.view.LayoutInflater.from(this.mToolbar.getContext()).inflate(resourceId, (android.view.ViewGroup) this.mToolbar, false));
                setDisplayOptions(this.mDisplayOpts | 16);
            }
            int layoutDimension = tintTypedArrayObtainStyledAttributes.getLayoutDimension(androidx.appcompat.R.styleable.ActionBar_height, 0);
            if (layoutDimension > 0) {
                android.view.ViewGroup.LayoutParams layoutParams = this.mToolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.mToolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset2 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.ActionBar_contentInsetEnd, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                this.mToolbar.setContentInsetsRelative(java.lang.Math.max(dimensionPixelOffset, 0), java.lang.Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionBar_titleTextStyle, 0);
            if (resourceId2 != 0) {
                androidx.appcompat.widget.Toolbar toolbar2 = this.mToolbar;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), resourceId2);
            }
            int resourceId3 = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionBar_subtitleTextStyle, 0);
            if (resourceId3 != 0) {
                androidx.appcompat.widget.Toolbar toolbar3 = this.mToolbar;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), resourceId3);
            }
            int resourceId4 = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionBar_popupTheme, 0);
            if (resourceId4 != 0) {
                this.mToolbar.setPopupTheme(resourceId4);
            }
        } else {
            this.mDisplayOpts = detectDisplayOptions();
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        setDefaultNavigationContentDescription(i);
        this.mHomeDescription = this.mToolbar.getNavigationContentDescription();
        this.mToolbar.setNavigationOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.appcompat.widget.ToolbarWidgetWrapper.1
            final androidx.appcompat.view.menu.ActionMenuItem mNavItem;

            {
                this.mNavItem = new androidx.appcompat.view.menu.ActionMenuItem(androidx.appcompat.widget.ToolbarWidgetWrapper.this.mToolbar.getContext(), 0, android.R.id.home, 0, 0, androidx.appcompat.widget.ToolbarWidgetWrapper.this.mTitle);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (androidx.appcompat.widget.ToolbarWidgetWrapper.this.mWindowCallback == null || !androidx.appcompat.widget.ToolbarWidgetWrapper.this.mMenuPrepared) {
                    return;
                }
                androidx.appcompat.widget.ToolbarWidgetWrapper.this.mWindowCallback.onMenuItemSelected(0, this.mNavItem);
            }
        });
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDefaultNavigationContentDescription(int i) {
        if (i == this.mDefaultNavigationContentDescription) {
            return;
        }
        this.mDefaultNavigationContentDescription = i;
        if (android.text.TextUtils.isEmpty(this.mToolbar.getNavigationContentDescription())) {
            setNavigationContentDescription(this.mDefaultNavigationContentDescription);
        }
    }

    private int detectDisplayOptions() {
        if (this.mToolbar.getNavigationIcon() == null) {
            return 11;
        }
        this.mDefaultNavigationIcon = this.mToolbar.getNavigationIcon();
        return 15;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public android.view.ViewGroup getViewGroup() {
        return this.mToolbar;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public android.content.Context getContext() {
        return this.mToolbar.getContext();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasExpandedActionView() {
        return this.mToolbar.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void collapseActionView() {
        this.mToolbar.collapseActionView();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowCallback(android.view.Window.Callback callback) {
        this.mWindowCallback = callback;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowTitle(java.lang.CharSequence charSequence) {
        if (this.mTitleSet) {
            return;
        }
        setTitleInt(charSequence);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public java.lang.CharSequence getTitle() {
        return this.mToolbar.getTitle();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setTitle(java.lang.CharSequence charSequence) {
        this.mTitleSet = true;
        setTitleInt(charSequence);
    }

    private void setTitleInt(java.lang.CharSequence charSequence) {
        this.mTitle = charSequence;
        if ((this.mDisplayOpts & 8) != 0) {
            this.mToolbar.setTitle(charSequence);
            if (this.mTitleSet) {
                androidx.core.view.ViewCompat.setAccessibilityPaneTitle(this.mToolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public java.lang.CharSequence getSubtitle() {
        return this.mToolbar.getSubtitle();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.mSubtitle = charSequence;
        if ((this.mDisplayOpts & 8) != 0) {
            this.mToolbar.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void initProgress() {
        android.util.Log.i(TAG, "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void initIndeterminateProgress() {
        android.util.Log.i(TAG, "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasIcon() {
        return this.mIcon != null;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasLogo() {
        return this.mLogo != null;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(int i) {
        setIcon(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.mIcon = drawable;
        updateToolbarLogo();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setLogo(int i) {
        setLogo(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setLogo(android.graphics.drawable.Drawable drawable) {
        this.mLogo = drawable;
        updateToolbarLogo();
    }

    private void updateToolbarLogo() {
        android.graphics.drawable.Drawable drawable;
        int i = this.mDisplayOpts;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.mLogo) == null) {
            drawable = this.mIcon;
        }
        this.mToolbar.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean canShowOverflowMenu() {
        return this.mToolbar.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isOverflowMenuShowing() {
        return this.mToolbar.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isOverflowMenuShowPending() {
        return this.mToolbar.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean showOverflowMenu() {
        return this.mToolbar.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hideOverflowMenu() {
        return this.mToolbar.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenuPrepared() {
        this.mMenuPrepared = true;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenu(android.view.Menu menu, androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
        if (this.mActionMenuPresenter == null) {
            androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = new androidx.appcompat.widget.ActionMenuPresenter(this.mToolbar.getContext());
            this.mActionMenuPresenter = actionMenuPresenter;
            actionMenuPresenter.setId(androidx.appcompat.R.id.action_menu_presenter);
        }
        this.mActionMenuPresenter.setCallback(callback);
        this.mToolbar.setMenu((androidx.appcompat.view.menu.MenuBuilder) menu, this.mActionMenuPresenter);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void dismissPopupMenus() {
        this.mToolbar.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDisplayOptions() {
        return this.mDisplayOpts;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDisplayOptions(int i) {
        android.view.View view;
        int i2 = this.mDisplayOpts ^ i;
        this.mDisplayOpts = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    updateHomeAccessibility();
                }
                updateNavigationIcon();
            }
            if ((i2 & 3) != 0) {
                updateToolbarLogo();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.mToolbar.setTitle(this.mTitle);
                    this.mToolbar.setSubtitle(this.mSubtitle);
                } else {
                    this.mToolbar.setTitle((java.lang.CharSequence) null);
                    this.mToolbar.setSubtitle((java.lang.CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.mCustomView) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.mToolbar.addView(view);
            } else {
                this.mToolbar.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setEmbeddedTabView(androidx.appcompat.widget.ScrollingTabContainerView scrollingTabContainerView) {
        android.view.View view = this.mTabView;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            androidx.appcompat.widget.Toolbar toolbar = this.mToolbar;
            if (parent == toolbar) {
                toolbar.removeView(this.mTabView);
            }
        }
        this.mTabView = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.mNavigationMode != 2) {
            return;
        }
        this.mToolbar.addView(scrollingTabContainerView, 0);
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mTabView.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 8388691;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasEmbeddedTabs() {
        return this.mTabView != null;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isTitleTruncated() {
        return this.mToolbar.isTitleTruncated();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setCollapsible(boolean z) {
        this.mToolbar.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getNavigationMode() {
        return this.mNavigationMode;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationMode(int i) {
        android.view.View view;
        int i2 = this.mNavigationMode;
        if (i != i2) {
            if (i2 == 1) {
                android.widget.Spinner spinner = this.mSpinner;
                if (spinner != null) {
                    android.view.ViewParent parent = spinner.getParent();
                    androidx.appcompat.widget.Toolbar toolbar = this.mToolbar;
                    if (parent == toolbar) {
                        toolbar.removeView(this.mSpinner);
                    }
                }
            } else if (i2 == 2 && (view = this.mTabView) != null) {
                android.view.ViewParent parent2 = view.getParent();
                androidx.appcompat.widget.Toolbar toolbar2 = this.mToolbar;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(this.mTabView);
                }
            }
            this.mNavigationMode = i;
            if (i != 0) {
                if (i == 1) {
                    ensureSpinner();
                    this.mToolbar.addView(this.mSpinner, 0);
                } else {
                    if (i == 2) {
                        android.view.View view2 = this.mTabView;
                        if (view2 != null) {
                            this.mToolbar.addView(view2, 0);
                            androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mTabView.getLayoutParams();
                            layoutParams.width = -2;
                            layoutParams.height = -2;
                            layoutParams.gravity = 8388691;
                            return;
                        }
                        return;
                    }
                    throw new java.lang.IllegalArgumentException("Invalid navigation mode " + i);
                }
            }
        }
    }

    private void ensureSpinner() {
        if (this.mSpinner == null) {
            this.mSpinner = new androidx.appcompat.widget.AppCompatSpinner(getContext(), null, androidx.appcompat.R.attr.actionDropDownStyle);
            this.mSpinner.setLayoutParams(new androidx.appcompat.widget.Toolbar.LayoutParams(-2, -2, 8388627));
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDropdownParams(android.widget.SpinnerAdapter spinnerAdapter, android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        ensureSpinner();
        this.mSpinner.setAdapter(spinnerAdapter);
        this.mSpinner.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDropdownSelectedPosition(int i) {
        android.widget.Spinner spinner = this.mSpinner;
        if (spinner == null) {
            throw new java.lang.IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        spinner.setSelection(i);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDropdownSelectedPosition() {
        android.widget.Spinner spinner = this.mSpinner;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDropdownItemCount() {
        android.widget.Spinner spinner = this.mSpinner;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setCustomView(android.view.View view) {
        android.view.View view2 = this.mCustomView;
        if (view2 != null && (this.mDisplayOpts & 16) != 0) {
            this.mToolbar.removeView(view2);
        }
        this.mCustomView = view;
        if (view == null || (this.mDisplayOpts & 16) == 0) {
            return;
        }
        this.mToolbar.addView(view);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public android.view.View getCustomView() {
        return this.mCustomView;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void animateToVisibility(int i) {
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = setupAnimatorToVisibility(i, DEFAULT_FADE_DURATION_MS);
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.start();
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public androidx.core.view.ViewPropertyAnimatorCompat setupAnimatorToVisibility(final int i, long j) {
        return androidx.core.view.ViewCompat.animate(this.mToolbar).alpha(i == 0 ? 1.0f : 0.0f).setDuration(j).setListener(new androidx.core.view.ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.widget.ToolbarWidgetWrapper.2
            private boolean mCanceled = false;

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void onAnimationStart(android.view.View view) {
                androidx.appcompat.widget.ToolbarWidgetWrapper.this.mToolbar.setVisibility(0);
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void onAnimationEnd(android.view.View view) {
                if (this.mCanceled) {
                    return;
                }
                androidx.appcompat.widget.ToolbarWidgetWrapper.this.mToolbar.setVisibility(i);
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void onAnimationCancel(android.view.View view) {
                this.mCanceled = true;
            }
        });
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationIcon(android.graphics.drawable.Drawable drawable) {
        this.mNavIcon = drawable;
        updateNavigationIcon();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationIcon(int i) {
        setNavigationIcon(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDefaultNavigationIcon(android.graphics.drawable.Drawable drawable) {
        if (this.mDefaultNavigationIcon != drawable) {
            this.mDefaultNavigationIcon = drawable;
            updateNavigationIcon();
        }
    }

    private void updateNavigationIcon() {
        if ((this.mDisplayOpts & 4) != 0) {
            androidx.appcompat.widget.Toolbar toolbar = this.mToolbar;
            android.graphics.drawable.Drawable drawable = this.mNavIcon;
            if (drawable == null) {
                drawable = this.mDefaultNavigationIcon;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.mToolbar.setNavigationIcon((android.graphics.drawable.Drawable) null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationContentDescription(java.lang.CharSequence charSequence) {
        this.mHomeDescription = charSequence;
        updateHomeAccessibility();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i == 0 ? null : getContext().getString(i));
    }

    private void updateHomeAccessibility() {
        if ((this.mDisplayOpts & 4) != 0) {
            if (android.text.TextUtils.isEmpty(this.mHomeDescription)) {
                this.mToolbar.setNavigationContentDescription(this.mDefaultNavigationContentDescription);
            } else {
                this.mToolbar.setNavigationContentDescription(this.mHomeDescription);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void saveHierarchyState(android.util.SparseArray<android.os.Parcelable> sparseArray) {
        this.mToolbar.saveHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void restoreHierarchyState(android.util.SparseArray<android.os.Parcelable> sparseArray) {
        this.mToolbar.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        androidx.core.view.ViewCompat.setBackground(this.mToolbar, drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getHeight() {
        return this.mToolbar.getHeight();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setVisibility(int i) {
        this.mToolbar.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getVisibility() {
        return this.mToolbar.getVisibility();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenuCallbacks(androidx.appcompat.view.menu.MenuPresenter.Callback callback, androidx.appcompat.view.menu.MenuBuilder.Callback callback2) {
        this.mToolbar.setMenuCallbacks(callback, callback2);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public android.view.Menu getMenu() {
        return this.mToolbar.getMenu();
    }
}
