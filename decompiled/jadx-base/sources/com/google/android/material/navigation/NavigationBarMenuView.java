package com.google.android.material.navigation;

/* JADX INFO: loaded from: classes5.dex */
public abstract class NavigationBarMenuView extends android.view.ViewGroup implements androidx.appcompat.view.menu.MenuView {
    private static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int ITEM_POOL_SIZE = 5;
    private static final int NO_PADDING = -1;
    private final android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> badgeDrawables;
    private com.google.android.material.navigation.NavigationBarItemView[] buttons;
    private android.content.res.ColorStateList itemActiveIndicatorColor;
    private boolean itemActiveIndicatorEnabled;
    private int itemActiveIndicatorHeight;
    private int itemActiveIndicatorMarginHorizontal;
    private boolean itemActiveIndicatorResizeable;
    private com.google.android.material.shape.ShapeAppearanceModel itemActiveIndicatorShapeAppearance;
    private int itemActiveIndicatorWidth;
    private android.graphics.drawable.Drawable itemBackground;
    private int itemBackgroundRes;
    private int itemIconSize;
    private android.content.res.ColorStateList itemIconTint;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private final androidx.core.util.Pools.Pool<com.google.android.material.navigation.NavigationBarItemView> itemPool;
    private android.content.res.ColorStateList itemRippleColor;
    private int itemTextAppearanceActive;
    private int itemTextAppearanceInactive;
    private final android.content.res.ColorStateList itemTextColorDefault;
    private android.content.res.ColorStateList itemTextColorFromUser;
    private int labelVisibilityMode;
    private androidx.appcompat.view.menu.MenuBuilder menu;
    private final android.view.View.OnClickListener onClickListener;
    private final android.util.SparseArray<android.view.View.OnTouchListener> onTouchListeners;
    private com.google.android.material.navigation.NavigationBarPresenter presenter;
    private int selectedItemId;
    private int selectedItemPosition;
    private final androidx.transition.TransitionSet set;

    private boolean isValidId(int i) {
        return i != -1;
    }

    protected abstract com.google.android.material.navigation.NavigationBarItemView createNavigationBarItemView(android.content.Context context);

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    protected boolean isShifting(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    public NavigationBarMenuView(android.content.Context context) {
        super(context);
        this.itemPool = new androidx.core.util.Pools.SynchronizedPool(5);
        this.onTouchListeners = new android.util.SparseArray<>(5);
        this.selectedItemId = 0;
        this.selectedItemPosition = 0;
        this.badgeDrawables = new android.util.SparseArray<>(5);
        this.itemPaddingTop = -1;
        this.itemPaddingBottom = -1;
        this.itemActiveIndicatorResizeable = false;
        this.itemTextColorDefault = createDefaultColorStateList(android.R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.set = null;
        } else {
            androidx.transition.AutoTransition autoTransition = new androidx.transition.AutoTransition();
            this.set = autoTransition;
            autoTransition.setOrdering(0);
            autoTransition.setDuration(com.google.android.material.motion.MotionUtils.resolveThemeDuration(getContext(), com.google.android.material.R.attr.motionDurationLong1, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
            autoTransition.setInterpolator(com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(getContext(), com.google.android.material.R.attr.motionEasingStandard, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            autoTransition.addTransition(new com.google.android.material.internal.TextScale());
        }
        this.onClickListener = new android.view.View.OnClickListener() { // from class: com.google.android.material.navigation.NavigationBarMenuView.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                androidx.appcompat.view.menu.MenuItemImpl itemData = ((com.google.android.material.navigation.NavigationBarItemView) view).getItemData();
                if (com.google.android.material.navigation.NavigationBarMenuView.this.menu.performItemAction(itemData, com.google.android.material.navigation.NavigationBarMenuView.this.presenter, 0)) {
                    return;
                }
                itemData.setChecked(true);
            }
        };
        androidx.core.view.ViewCompat.setImportantForAccessibility(this, 1);
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        this.menu = menuBuilder;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.menu.getVisibleItems().size(), false, 1));
    }

    public void setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.itemIconTint = colorStateList;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public android.content.res.ColorStateList getIconTintList() {
        return this.itemIconTint;
    }

    public void setItemIconSize(int i) {
        this.itemIconSize = i;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i);
            }
        }
    }

    public int getItemIconSize() {
        return this.itemIconSize;
    }

    public void setItemTextColor(android.content.res.ColorStateList colorStateList) {
        this.itemTextColorFromUser = colorStateList;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public android.content.res.ColorStateList getItemTextColor() {
        return this.itemTextColorFromUser;
    }

    public void setItemTextAppearanceInactive(int i) {
        this.itemTextAppearanceInactive = i;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i);
                android.content.res.ColorStateList colorStateList = this.itemTextColorFromUser;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public int getItemTextAppearanceInactive() {
        return this.itemTextAppearanceInactive;
    }

    public void setItemTextAppearanceActive(int i) {
        this.itemTextAppearanceActive = i;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i);
                android.content.res.ColorStateList colorStateList = this.itemTextColorFromUser;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public int getItemTextAppearanceActive() {
        return this.itemTextAppearanceActive;
    }

    public void setItemBackgroundRes(int i) {
        this.itemBackgroundRes = i;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i);
            }
        }
    }

    public int getItemPaddingTop() {
        return this.itemPaddingTop;
    }

    public void setItemPaddingTop(int i) {
        this.itemPaddingTop = i;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i);
            }
        }
    }

    public int getItemPaddingBottom() {
        return this.itemPaddingBottom;
    }

    public void setItemPaddingBottom(int i) {
        this.itemPaddingBottom = i;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i);
            }
        }
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.itemActiveIndicatorEnabled;
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.itemActiveIndicatorEnabled = z;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z);
            }
        }
    }

    public int getItemActiveIndicatorWidth() {
        return this.itemActiveIndicatorWidth;
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.itemActiveIndicatorWidth = i;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i);
            }
        }
    }

    public int getItemActiveIndicatorHeight() {
        return this.itemActiveIndicatorHeight;
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.itemActiveIndicatorHeight = i;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i);
            }
        }
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.itemActiveIndicatorMarginHorizontal;
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.itemActiveIndicatorMarginHorizontal = i;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public com.google.android.material.shape.ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.itemActiveIndicatorShapeAppearance;
    }

    public void setItemActiveIndicatorShapeAppearance(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        this.itemActiveIndicatorShapeAppearance = shapeAppearanceModel;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
            }
        }
    }

    protected boolean isItemActiveIndicatorResizeable() {
        return this.itemActiveIndicatorResizeable;
    }

    protected void setItemActiveIndicatorResizeable(boolean z) {
        this.itemActiveIndicatorResizeable = z;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z);
            }
        }
    }

    public android.content.res.ColorStateList getItemActiveIndicatorColor() {
        return this.itemActiveIndicatorColor;
    }

    public void setItemActiveIndicatorColor(android.content.res.ColorStateList colorStateList) {
        this.itemActiveIndicatorColor = colorStateList;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
            }
        }
    }

    private android.graphics.drawable.Drawable createItemActiveIndicatorDrawable() {
        if (this.itemActiveIndicatorShapeAppearance == null || this.itemActiveIndicatorColor == null) {
            return null;
        }
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable(this.itemActiveIndicatorShapeAppearance);
        materialShapeDrawable.setFillColor(this.itemActiveIndicatorColor);
        return materialShapeDrawable;
    }

    @java.lang.Deprecated
    public int getItemBackgroundRes() {
        return this.itemBackgroundRes;
    }

    public void setItemBackground(android.graphics.drawable.Drawable drawable) {
        this.itemBackground = drawable;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemRippleColor(android.content.res.ColorStateList colorStateList) {
        this.itemRippleColor = colorStateList;
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemRippleColor(colorStateList);
            }
        }
    }

    public android.content.res.ColorStateList getItemRippleColor() {
        return this.itemRippleColor;
    }

    public android.graphics.drawable.Drawable getItemBackground() {
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null && navigationBarItemViewArr.length > 0) {
            return navigationBarItemViewArr[0].getBackground();
        }
        return this.itemBackground;
    }

    public void setLabelVisibilityMode(int i) {
        this.labelVisibilityMode = i;
    }

    public int getLabelVisibilityMode() {
        return this.labelVisibilityMode;
    }

    public void setItemOnTouchListener(int i, android.view.View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.onTouchListeners.remove(i);
        } else {
            this.onTouchListeners.put(i, onTouchListener);
        }
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView.getItemData().getItemId() == i) {
                    navigationBarItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public android.content.res.ColorStateList createDefaultColorStateList(int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        android.content.res.ColorStateList colorStateList = androidx.appcompat.content.res.AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new android.content.res.ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    public void setPresenter(com.google.android.material.navigation.NavigationBarPresenter navigationBarPresenter) {
        this.presenter = navigationBarPresenter;
    }

    public void buildMenuView() {
        removeAllViews();
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.itemPool.release(navigationBarItemView);
                    navigationBarItemView.clear();
                }
            }
        }
        if (this.menu.size() == 0) {
            this.selectedItemId = 0;
            this.selectedItemPosition = 0;
            this.buttons = null;
            return;
        }
        removeUnusedBadges();
        this.buttons = new com.google.android.material.navigation.NavigationBarItemView[this.menu.size()];
        boolean zIsShifting = isShifting(this.labelVisibilityMode, this.menu.getVisibleItems().size());
        for (int i = 0; i < this.menu.size(); i++) {
            this.presenter.setUpdateSuspended(true);
            this.menu.getItem(i).setCheckable(true);
            this.presenter.setUpdateSuspended(false);
            com.google.android.material.navigation.NavigationBarItemView newItem = getNewItem();
            this.buttons[i] = newItem;
            newItem.setIconTintList(this.itemIconTint);
            newItem.setIconSize(this.itemIconSize);
            newItem.setTextColor(this.itemTextColorDefault);
            newItem.setTextAppearanceInactive(this.itemTextAppearanceInactive);
            newItem.setTextAppearanceActive(this.itemTextAppearanceActive);
            newItem.setTextColor(this.itemTextColorFromUser);
            int i2 = this.itemPaddingTop;
            if (i2 != -1) {
                newItem.setItemPaddingTop(i2);
            }
            int i3 = this.itemPaddingBottom;
            if (i3 != -1) {
                newItem.setItemPaddingBottom(i3);
            }
            newItem.setActiveIndicatorWidth(this.itemActiveIndicatorWidth);
            newItem.setActiveIndicatorHeight(this.itemActiveIndicatorHeight);
            newItem.setActiveIndicatorMarginHorizontal(this.itemActiveIndicatorMarginHorizontal);
            newItem.setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
            newItem.setActiveIndicatorResizeable(this.itemActiveIndicatorResizeable);
            newItem.setActiveIndicatorEnabled(this.itemActiveIndicatorEnabled);
            android.graphics.drawable.Drawable drawable = this.itemBackground;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.itemBackgroundRes);
            }
            newItem.setItemRippleColor(this.itemRippleColor);
            newItem.setShifting(zIsShifting);
            newItem.setLabelVisibilityMode(this.labelVisibilityMode);
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = (androidx.appcompat.view.menu.MenuItemImpl) this.menu.getItem(i);
            newItem.initialize(menuItemImpl, 0);
            newItem.setItemPosition(i);
            int itemId = menuItemImpl.getItemId();
            newItem.setOnTouchListener(this.onTouchListeners.get(itemId));
            newItem.setOnClickListener(this.onClickListener);
            int i4 = this.selectedItemId;
            if (i4 != 0 && itemId == i4) {
                this.selectedItemPosition = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = java.lang.Math.min(this.menu.size() - 1, this.selectedItemPosition);
        this.selectedItemPosition = iMin;
        this.menu.getItem(iMin).setChecked(true);
    }

    public void updateMenuView() {
        androidx.transition.TransitionSet transitionSet;
        androidx.appcompat.view.menu.MenuBuilder menuBuilder = this.menu;
        if (menuBuilder == null || this.buttons == null) {
            return;
        }
        int size = menuBuilder.size();
        if (size != this.buttons.length) {
            buildMenuView();
            return;
        }
        int i = this.selectedItemId;
        for (int i2 = 0; i2 < size; i2++) {
            android.view.MenuItem item = this.menu.getItem(i2);
            if (item.isChecked()) {
                this.selectedItemId = item.getItemId();
                this.selectedItemPosition = i2;
            }
        }
        if (i != this.selectedItemId && (transitionSet = this.set) != null) {
            androidx.transition.TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        boolean zIsShifting = isShifting(this.labelVisibilityMode, this.menu.getVisibleItems().size());
        for (int i3 = 0; i3 < size; i3++) {
            this.presenter.setUpdateSuspended(true);
            this.buttons[i3].setLabelVisibilityMode(this.labelVisibilityMode);
            this.buttons[i3].setShifting(zIsShifting);
            this.buttons[i3].initialize((androidx.appcompat.view.menu.MenuItemImpl) this.menu.getItem(i3), 0);
            this.presenter.setUpdateSuspended(false);
        }
    }

    private com.google.android.material.navigation.NavigationBarItemView getNewItem() {
        com.google.android.material.navigation.NavigationBarItemView navigationBarItemViewAcquire = this.itemPool.acquire();
        return navigationBarItemViewAcquire == null ? createNavigationBarItemView(getContext()) : navigationBarItemViewAcquire;
    }

    public int getSelectedItemId() {
        return this.selectedItemId;
    }

    void tryRestoreSelectedItemId(int i) {
        int size = this.menu.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.view.MenuItem item = this.menu.getItem(i2);
            if (i == item.getItemId()) {
                this.selectedItemId = i;
                this.selectedItemPosition = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> getBadgeDrawables() {
        return this.badgeDrawables;
    }

    void restoreBadgeDrawables(android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            if (this.badgeDrawables.indexOfKey(iKeyAt) < 0) {
                this.badgeDrawables.append(iKeyAt, sparseArray.get(iKeyAt));
            }
        }
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setBadge(this.badgeDrawables.get(navigationBarItemView.getId()));
            }
        }
    }

    public com.google.android.material.badge.BadgeDrawable getBadge(int i) {
        return this.badgeDrawables.get(i);
    }

    com.google.android.material.badge.BadgeDrawable getOrCreateBadge(int i) {
        validateMenuItemId(i);
        com.google.android.material.badge.BadgeDrawable badgeDrawableCreate = this.badgeDrawables.get(i);
        if (badgeDrawableCreate == null) {
            badgeDrawableCreate = com.google.android.material.badge.BadgeDrawable.create(getContext());
            this.badgeDrawables.put(i, badgeDrawableCreate);
        }
        com.google.android.material.navigation.NavigationBarItemView navigationBarItemViewFindItemView = findItemView(i);
        if (navigationBarItemViewFindItemView != null) {
            navigationBarItemViewFindItemView.setBadge(badgeDrawableCreate);
        }
        return badgeDrawableCreate;
    }

    void removeBadge(int i) {
        validateMenuItemId(i);
        com.google.android.material.badge.BadgeDrawable badgeDrawable = this.badgeDrawables.get(i);
        com.google.android.material.navigation.NavigationBarItemView navigationBarItemViewFindItemView = findItemView(i);
        if (navigationBarItemViewFindItemView != null) {
            navigationBarItemViewFindItemView.removeBadge();
        }
        if (badgeDrawable != null) {
            this.badgeDrawables.remove(i);
        }
    }

    private void setBadgeIfNeeded(com.google.android.material.navigation.NavigationBarItemView navigationBarItemView) {
        com.google.android.material.badge.BadgeDrawable badgeDrawable;
        int id = navigationBarItemView.getId();
        if (isValidId(id) && (badgeDrawable = this.badgeDrawables.get(id)) != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
    }

    private void removeUnusedBadges() {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i = 0; i < this.menu.size(); i++) {
            hashSet.add(java.lang.Integer.valueOf(this.menu.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.badgeDrawables.size(); i2++) {
            int iKeyAt = this.badgeDrawables.keyAt(i2);
            if (!hashSet.contains(java.lang.Integer.valueOf(iKeyAt))) {
                this.badgeDrawables.delete(iKeyAt);
            }
        }
    }

    public com.google.android.material.navigation.NavigationBarItemView findItemView(int i) {
        validateMenuItemId(i);
        com.google.android.material.navigation.NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr == null) {
            return null;
        }
        for (com.google.android.material.navigation.NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
            if (navigationBarItemView.getId() == i) {
                return navigationBarItemView;
            }
        }
        return null;
    }

    protected int getSelectedItemPosition() {
        return this.selectedItemPosition;
    }

    protected androidx.appcompat.view.menu.MenuBuilder getMenu() {
        return this.menu;
    }

    private void validateMenuItemId(int i) {
        if (!isValidId(i)) {
            throw new java.lang.IllegalArgumentException(i + " is not a valid view id");
        }
    }
}
