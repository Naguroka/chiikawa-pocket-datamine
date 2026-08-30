package com.google.android.material.navigation;

/* JADX INFO: loaded from: classes5.dex */
public abstract class NavigationBarView extends android.widget.FrameLayout {
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    private static final int MENU_PRESENTER_ID = 1;
    private final com.google.android.material.navigation.NavigationBarMenu menu;
    private android.view.MenuInflater menuInflater;
    private final com.google.android.material.navigation.NavigationBarMenuView menuView;
    private final com.google.android.material.navigation.NavigationBarPresenter presenter;
    private com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener reselectedListener;
    private com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener selectedListener;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
        void onNavigationItemReselected(android.view.MenuItem menuItem);
    }

    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(android.view.MenuItem menuItem);
    }

    protected abstract com.google.android.material.navigation.NavigationBarMenuView createNavigationBarMenuView(android.content.Context context);

    public abstract int getMaxItemCount();

    public NavigationBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        com.google.android.material.navigation.NavigationBarPresenter navigationBarPresenter = new com.google.android.material.navigation.NavigationBarPresenter();
        this.presenter = navigationBarPresenter;
        android.content.Context context2 = getContext();
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainTintedStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.NavigationBarView, i, i2, com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceInactive, com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceActive);
        com.google.android.material.navigation.NavigationBarMenu navigationBarMenu = new com.google.android.material.navigation.NavigationBarMenu(context2, getClass(), getMaxItemCount());
        this.menu = navigationBarMenu;
        com.google.android.material.navigation.NavigationBarMenuView navigationBarMenuViewCreateNavigationBarMenuView = createNavigationBarMenuView(context2);
        this.menuView = navigationBarMenuViewCreateNavigationBarMenuView;
        navigationBarPresenter.setMenuView(navigationBarMenuViewCreateNavigationBarMenuView);
        navigationBarPresenter.setId(1);
        navigationBarMenuViewCreateNavigationBarMenuView.setPresenter(navigationBarPresenter);
        navigationBarMenu.addMenuPresenter(navigationBarPresenter);
        navigationBarPresenter.initForMenu(getContext(), navigationBarMenu);
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationBarView_itemIconTint)) {
            navigationBarMenuViewCreateNavigationBarMenuView.setIconTintList(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.NavigationBarView_itemIconTint));
        } else {
            navigationBarMenuViewCreateNavigationBarMenuView.setIconTintList(navigationBarMenuViewCreateNavigationBarMenuView.createDefaultColorStateList(android.R.attr.textColorSecondary));
        }
        setItemIconSize(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceInactive, 0));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceActive, 0));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationBarView_itemTextColor)) {
            setItemTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.NavigationBarView_itemTextColor));
        }
        if (getBackground() == null || (getBackground() instanceof android.graphics.drawable.ColorDrawable)) {
            androidx.core.view.ViewCompat.setBackground(this, createMaterialShapeDrawableBackground(context2));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationBarView_itemPaddingTop)) {
            setItemPaddingTop(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationBarView_itemPaddingTop, 0));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationBarView_itemPaddingBottom)) {
            setItemPaddingBottom(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationBarView_itemPaddingBottom, 0));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationBarView_elevation)) {
            setElevation(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationBarView_elevation, 0));
        }
        androidx.core.graphics.drawable.DrawableCompat.setTintList(getBackground().mutate(), com.google.android.material.resources.MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, com.google.android.material.R.styleable.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(tintTypedArrayObtainTintedStyledAttributes.getInteger(com.google.android.material.R.styleable.NavigationBarView_labelVisibilityMode, -1));
        int resourceId = tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.NavigationBarView_itemBackground, 0);
        if (resourceId != 0) {
            navigationBarMenuViewCreateNavigationBarMenuView.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(com.google.android.material.resources.MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, com.google.android.material.R.styleable.NavigationBarView_itemRippleColor));
        }
        int resourceId2 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, com.google.android.material.R.styleable.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(com.google.android.material.resources.MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(com.google.android.material.shape.ShapeAppearanceModel.builder(context2, typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0).build());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationBarView_menu)) {
            inflateMenu(tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.NavigationBarView_menu, 0));
        }
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        addView(navigationBarMenuViewCreateNavigationBarMenuView);
        navigationBarMenu.setCallback(new androidx.appcompat.view.menu.MenuBuilder.Callback() { // from class: com.google.android.material.navigation.NavigationBarView.1
            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
                if (com.google.android.material.navigation.NavigationBarView.this.reselectedListener == null || menuItem.getItemId() != com.google.android.material.navigation.NavigationBarView.this.getSelectedItemId()) {
                    return (com.google.android.material.navigation.NavigationBarView.this.selectedListener == null || com.google.android.material.navigation.NavigationBarView.this.selectedListener.onNavigationItemSelected(menuItem)) ? false : true;
                }
                com.google.android.material.navigation.NavigationBarView.this.reselectedListener.onNavigationItemReselected(menuItem);
                return true;
            }
        });
    }

    private com.google.android.material.shape.MaterialShapeDrawable createMaterialShapeDrawableBackground(android.content.Context context) {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable();
        android.graphics.drawable.Drawable background = getBackground();
        if (background instanceof android.graphics.drawable.ColorDrawable) {
            materialShapeDrawable.setFillColor(android.content.res.ColorStateList.valueOf(((android.graphics.drawable.ColorDrawable) background).getColor()));
        }
        materialShapeDrawable.initializeElevationOverlay(context);
        return materialShapeDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.shape.MaterialShapeUtils.setElevation(this, f);
    }

    public void setOnItemSelectedListener(com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener onItemSelectedListener) {
        this.selectedListener = onItemSelectedListener;
    }

    public void setOnItemReselectedListener(com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener onItemReselectedListener) {
        this.reselectedListener = onItemReselectedListener;
    }

    public android.view.Menu getMenu() {
        return this.menu;
    }

    public androidx.appcompat.view.menu.MenuView getMenuView() {
        return this.menuView;
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(true);
    }

    public android.content.res.ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    public void setItemIconTintList(android.content.res.ColorStateList colorStateList) {
        this.menuView.setIconTintList(colorStateList);
    }

    public void setItemIconSize(int i) {
        this.menuView.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    public android.content.res.ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public void setItemTextColor(android.content.res.ColorStateList colorStateList) {
        this.menuView.setItemTextColor(colorStateList);
    }

    @java.lang.Deprecated
    public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    public void setItemBackgroundResource(int i) {
        this.menuView.setItemBackgroundRes(i);
    }

    public android.graphics.drawable.Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    public void setItemBackground(android.graphics.drawable.Drawable drawable) {
        this.menuView.setItemBackground(drawable);
    }

    public android.content.res.ColorStateList getItemRippleColor() {
        return this.menuView.getItemRippleColor();
    }

    public void setItemRippleColor(android.content.res.ColorStateList colorStateList) {
        this.menuView.setItemRippleColor(colorStateList);
    }

    public int getItemPaddingTop() {
        return this.menuView.getItemPaddingTop();
    }

    public void setItemPaddingTop(int i) {
        this.menuView.setItemPaddingTop(i);
    }

    public int getItemPaddingBottom() {
        return this.menuView.getItemPaddingBottom();
    }

    public void setItemPaddingBottom(int i) {
        this.menuView.setItemPaddingBottom(i);
    }

    public boolean isItemActiveIndicatorEnabled() {
        return this.menuView.getItemActiveIndicatorEnabled();
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.menuView.setItemActiveIndicatorEnabled(z);
    }

    public int getItemActiveIndicatorWidth() {
        return this.menuView.getItemActiveIndicatorWidth();
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.menuView.setItemActiveIndicatorWidth(i);
    }

    public int getItemActiveIndicatorHeight() {
        return this.menuView.getItemActiveIndicatorHeight();
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.menuView.setItemActiveIndicatorHeight(i);
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.menuView.getItemActiveIndicatorMarginHorizontal();
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.menuView.setItemActiveIndicatorMarginHorizontal(i);
    }

    public com.google.android.material.shape.ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.menuView.getItemActiveIndicatorShapeAppearance();
    }

    public void setItemActiveIndicatorShapeAppearance(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        this.menuView.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel);
    }

    public android.content.res.ColorStateList getItemActiveIndicatorColor() {
        return this.menuView.getItemActiveIndicatorColor();
    }

    public void setItemActiveIndicatorColor(android.content.res.ColorStateList colorStateList) {
        this.menuView.setItemActiveIndicatorColor(colorStateList);
    }

    public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void setSelectedItemId(int i) {
        android.view.MenuItem menuItemFindItem = this.menu.findItem(i);
        if (menuItemFindItem == null || this.menu.performItemAction(menuItemFindItem, this.presenter, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.menuView.getLabelVisibilityMode() != i) {
            this.menuView.setLabelVisibilityMode(i);
            this.presenter.updateMenuView(false);
        }
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    public void setItemTextAppearanceInactive(int i) {
        this.menuView.setItemTextAppearanceInactive(i);
    }

    public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    public void setItemTextAppearanceActive(int i) {
        this.menuView.setItemTextAppearanceActive(i);
    }

    public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    public void setItemOnTouchListener(int i, android.view.View.OnTouchListener onTouchListener) {
        this.menuView.setItemOnTouchListener(i, onTouchListener);
    }

    public com.google.android.material.badge.BadgeDrawable getBadge(int i) {
        return this.menuView.getBadge(i);
    }

    public com.google.android.material.badge.BadgeDrawable getOrCreateBadge(int i) {
        return this.menuView.getOrCreateBadge(i);
    }

    public void removeBadge(int i) {
        this.menuView.removeBadge(i);
    }

    private android.view.MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new androidx.appcompat.view.SupportMenuInflater(getContext());
        }
        return this.menuInflater;
    }

    public com.google.android.material.navigation.NavigationBarPresenter getPresenter() {
        return this.presenter;
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.navigation.NavigationBarView.SavedState savedState = new com.google.android.material.navigation.NavigationBarView.SavedState(super.onSaveInstanceState());
        savedState.menuPresenterState = new android.os.Bundle();
        this.menu.savePresenterStates(savedState.menuPresenterState);
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.navigation.NavigationBarView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.navigation.NavigationBarView.SavedState savedState = (com.google.android.material.navigation.NavigationBarView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuPresenterState);
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.navigation.NavigationBarView.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.google.android.material.navigation.NavigationBarView.SavedState>() { // from class: com.google.android.material.navigation.NavigationBarView.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.navigation.NavigationBarView.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.navigation.NavigationBarView.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.navigation.NavigationBarView.SavedState createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.navigation.NavigationBarView.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.navigation.NavigationBarView.SavedState[] newArray(int i) {
                return new com.google.android.material.navigation.NavigationBarView.SavedState[i];
            }
        };
        android.os.Bundle menuPresenterState;

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuPresenterState);
        }

        private void readFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }
    }
}
