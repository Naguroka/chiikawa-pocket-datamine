package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class ActionMenuPresenter extends androidx.appcompat.view.menu.BaseMenuPresenter implements androidx.core.view.ActionProvider.SubUiVisibilityListener {
    private static final java.lang.String TAG = "ActionMenuPresenter";
    private final android.util.SparseBooleanArray mActionButtonGroups;
    androidx.appcompat.widget.ActionMenuPresenter.ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private boolean mExpandedActionViewsExclusive;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    int mOpenSubMenuId;
    androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton mOverflowButton;
    androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup mOverflowPopup;
    private android.graphics.drawable.Drawable mPendingOverflowIcon;
    private boolean mPendingOverflowIconSet;
    private androidx.appcompat.widget.ActionMenuPresenter.ActionMenuPopupCallback mPopupCallback;
    final androidx.appcompat.widget.ActionMenuPresenter.PopupPresenterCallback mPopupPresenterCallback;
    androidx.appcompat.widget.ActionMenuPresenter.OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;

    public ActionMenuPresenter(android.content.Context context) {
        super(context, androidx.appcompat.R.layout.abc_action_menu_layout, androidx.appcompat.R.layout.abc_action_menu_item_layout);
        this.mActionButtonGroups = new android.util.SparseBooleanArray();
        this.mPopupPresenterCallback = new androidx.appcompat.widget.ActionMenuPresenter.PopupPresenterCallback();
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        super.initForMenu(context, menuBuilder);
        android.content.res.Resources resources = context.getResources();
        androidx.appcompat.view.ActionBarPolicy actionBarPolicy = androidx.appcompat.view.ActionBarPolicy.get(context);
        if (!this.mReserveOverflowSet) {
            this.mReserveOverflow = actionBarPolicy.showsOverflowMenuButton();
        }
        if (!this.mWidthLimitSet) {
            this.mWidthLimit = actionBarPolicy.getEmbeddedMenuWidthLimit();
        }
        if (!this.mMaxItemsSet) {
            this.mMaxItems = actionBarPolicy.getMaxActionButtons();
        }
        int measuredWidth = this.mWidthLimit;
        if (this.mReserveOverflow) {
            if (this.mOverflowButton == null) {
                androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton overflowMenuButton = new androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton(this.mSystemContext);
                this.mOverflowButton = overflowMenuButton;
                if (this.mPendingOverflowIconSet) {
                    overflowMenuButton.setImageDrawable(this.mPendingOverflowIcon);
                    this.mPendingOverflowIcon = null;
                    this.mPendingOverflowIconSet = false;
                }
                int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                this.mOverflowButton.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.mOverflowButton.getMeasuredWidth();
        } else {
            this.mOverflowButton = null;
        }
        this.mActionItemWidthLimit = measuredWidth;
        this.mMinCellSize = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        if (!this.mMaxItemsSet) {
            this.mMaxItems = androidx.appcompat.view.ActionBarPolicy.get(this.mContext).getMaxActionButtons();
        }
        if (this.mMenu != null) {
            this.mMenu.onItemsChanged(true);
        }
    }

    public void setWidthLimit(int i, boolean z) {
        this.mWidthLimit = i;
        this.mStrictWidthLimit = z;
        this.mWidthLimitSet = true;
    }

    public void setReserveOverflow(boolean z) {
        this.mReserveOverflow = z;
        this.mReserveOverflowSet = true;
    }

    public void setItemLimit(int i) {
        this.mMaxItems = i;
        this.mMaxItemsSet = true;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.mExpandedActionViewsExclusive = z;
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton overflowMenuButton = this.mOverflowButton;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
        } else {
            this.mPendingOverflowIconSet = true;
            this.mPendingOverflowIcon = drawable;
        }
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
        androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton overflowMenuButton = this.mOverflowButton;
        if (overflowMenuButton != null) {
            return overflowMenuButton.getDrawable();
        }
        if (this.mPendingOverflowIconSet) {
            return this.mPendingOverflowIcon;
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup viewGroup) {
        androidx.appcompat.view.menu.MenuView menuView = this.mMenuView;
        androidx.appcompat.view.menu.MenuView menuView2 = super.getMenuView(viewGroup);
        if (menuView != menuView2) {
            ((androidx.appcompat.widget.ActionMenuView) menuView2).setPresenter(this);
        }
        return menuView2;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public android.view.View getItemView(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.hasCollapsibleActionView()) {
            actionView = super.getItemView(menuItemImpl, view, viewGroup);
        }
        actionView.setVisibility(menuItemImpl.isActionViewExpanded() ? 8 : 0);
        androidx.appcompat.widget.ActionMenuView actionMenuView = (androidx.appcompat.widget.ActionMenuView) viewGroup;
        android.view.ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public void bindItemView(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl, androidx.appcompat.view.menu.MenuView.ItemView itemView) {
        itemView.initialize(menuItemImpl, 0);
        androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = (androidx.appcompat.view.menu.ActionMenuItemView) itemView;
        actionMenuItemView.setItemInvoker((androidx.appcompat.widget.ActionMenuView) this.mMenuView);
        if (this.mPopupCallback == null) {
            this.mPopupCallback = new androidx.appcompat.widget.ActionMenuPresenter.ActionMenuPopupCallback();
        }
        actionMenuItemView.setPopupCallback(this.mPopupCallback);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean shouldIncludeItem(int i, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return menuItemImpl.isActionButton();
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        super.updateMenuView(z);
        ((android.view.View) this.mMenuView).requestLayout();
        boolean z2 = false;
        if (this.mMenu != null) {
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> actionItems = this.mMenu.getActionItems();
            int size = actionItems.size();
            for (int i = 0; i < size; i++) {
                androidx.core.view.ActionProvider supportActionProvider = actionItems.get(i).getSupportActionProvider();
                if (supportActionProvider != null) {
                    supportActionProvider.setSubUiVisibilityListener(this);
                }
            }
        }
        java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> nonActionItems = this.mMenu != null ? this.mMenu.getNonActionItems() : null;
        if (this.mReserveOverflow && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z2 = !nonActionItems.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.mOverflowButton == null) {
                this.mOverflowButton = new androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton(this.mSystemContext);
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.mOverflowButton.getParent();
            if (viewGroup != this.mMenuView) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.mOverflowButton);
                }
                androidx.appcompat.widget.ActionMenuView actionMenuView = (androidx.appcompat.widget.ActionMenuView) this.mMenuView;
                actionMenuView.addView(this.mOverflowButton, actionMenuView.generateOverflowButtonLayoutParams());
            }
        } else {
            androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton overflowMenuButton = this.mOverflowButton;
            if (overflowMenuButton != null && overflowMenuButton.getParent() == this.mMenuView) {
                ((android.view.ViewGroup) this.mMenuView).removeView(this.mOverflowButton);
            }
        }
        ((androidx.appcompat.widget.ActionMenuView) this.mMenuView).setOverflowReserved(this.mReserveOverflow);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean filterLeftoverView(android.view.ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.mOverflowButton) {
            return false;
        }
        return super.filterLeftoverView(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        boolean z = false;
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
        while (subMenuBuilder2.getParentMenu() != this.mMenu) {
            subMenuBuilder2 = (androidx.appcompat.view.menu.SubMenuBuilder) subMenuBuilder2.getParentMenu();
        }
        android.view.View viewFindViewForItem = findViewForItem(subMenuBuilder2.getItem());
        if (viewFindViewForItem == null) {
            return false;
        }
        this.mOpenSubMenuId = subMenuBuilder.getItem().getItemId();
        int size = subMenuBuilder.size();
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = subMenuBuilder.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        androidx.appcompat.widget.ActionMenuPresenter.ActionButtonSubmenu actionButtonSubmenu = new androidx.appcompat.widget.ActionMenuPresenter.ActionButtonSubmenu(this.mContext, subMenuBuilder, viewFindViewForItem);
        this.mActionButtonPopup = actionButtonSubmenu;
        actionButtonSubmenu.setForceShowIcon(z);
        this.mActionButtonPopup.show();
        super.onSubMenuSelected(subMenuBuilder);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private android.view.View findViewForItem(android.view.MenuItem menuItem) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.mMenuView;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof androidx.appcompat.view.menu.MenuView.ItemView) && ((androidx.appcompat.view.menu.MenuView.ItemView) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean showOverflowMenu() {
        if (!this.mReserveOverflow || isOverflowMenuShowing() || this.mMenu == null || this.mMenuView == null || this.mPostedOpenRunnable != null || this.mMenu.getNonActionItems().isEmpty()) {
            return false;
        }
        this.mPostedOpenRunnable = new androidx.appcompat.widget.ActionMenuPresenter.OpenOverflowRunnable(new androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup(this.mContext, this.mMenu, this.mOverflowButton, true));
        ((android.view.View) this.mMenuView).post(this.mPostedOpenRunnable);
        return true;
    }

    public boolean hideOverflowMenu() {
        if (this.mPostedOpenRunnable != null && this.mMenuView != null) {
            ((android.view.View) this.mMenuView).removeCallbacks(this.mPostedOpenRunnable);
            this.mPostedOpenRunnable = null;
            return true;
        }
        androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup overflowPopup = this.mOverflowPopup;
        if (overflowPopup == null) {
            return false;
        }
        overflowPopup.dismiss();
        return true;
    }

    public boolean dismissPopupMenus() {
        return hideOverflowMenu() | hideSubMenus();
    }

    public boolean hideSubMenus() {
        androidx.appcompat.widget.ActionMenuPresenter.ActionButtonSubmenu actionButtonSubmenu = this.mActionButtonPopup;
        if (actionButtonSubmenu == null) {
            return false;
        }
        actionButtonSubmenu.dismiss();
        return true;
    }

    public boolean isOverflowMenuShowing() {
        androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup overflowPopup = this.mOverflowPopup;
        return overflowPopup != null && overflowPopup.isShowing();
    }

    public boolean isOverflowMenuShowPending() {
        return this.mPostedOpenRunnable != null || isOverflowMenuShowing();
    }

    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.ActionMenuPresenter] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.MenuItemImpl] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> visibleItems;
        int size;
        int i;
        int iMeasureChildForCells;
        ?? r0;
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this;
        android.view.View view = null;
        ?? r3 = 0;
        if (actionMenuPresenter.mMenu != null) {
            visibleItems = actionMenuPresenter.mMenu.getVisibleItems();
            size = visibleItems.size();
        } else {
            visibleItems = null;
            size = 0;
        }
        int i2 = actionMenuPresenter.mMaxItems;
        int i3 = actionMenuPresenter.mActionItemWidthLimit;
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) actionMenuPresenter.mMenuView;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = visibleItems.get(i6);
            if (menuItemImpl.requiresActionButton()) {
                i4++;
            } else if (menuItemImpl.requestsActionButton()) {
                i5++;
            } else {
                z = true;
            }
            if (actionMenuPresenter.mExpandedActionViewsExclusive && menuItemImpl.isActionViewExpanded()) {
                i2 = 0;
            }
        }
        if (actionMenuPresenter.mReserveOverflow && (z || i5 + i4 > i2)) {
            i2--;
        }
        int i7 = i2 - i4;
        android.util.SparseBooleanArray sparseBooleanArray = actionMenuPresenter.mActionButtonGroups;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.mStrictWidthLimit) {
            int i8 = actionMenuPresenter.mMinCellSize;
            iMeasureChildForCells = i3 / i8;
            i = i8 + ((i3 % i8) / iMeasureChildForCells);
        } else {
            i = 0;
            iMeasureChildForCells = 0;
        }
        int i9 = 0;
        int i10 = 0;
        ?? r1 = actionMenuPresenter;
        while (i9 < size) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl2 = visibleItems.get(i9);
            if (menuItemImpl2.requiresActionButton()) {
                android.view.View itemView = r1.getItemView(menuItemImpl2, view, viewGroup);
                if (r1.mStrictWidthLimit) {
                    iMeasureChildForCells -= androidx.appcompat.widget.ActionMenuView.measureChildForCells(itemView, i, iMeasureChildForCells, iMakeMeasureSpec, r3);
                } else {
                    itemView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = itemView.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                int groupId = menuItemImpl2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                menuItemImpl2.setIsActionButton(true);
                r0 = r3;
            } else if (menuItemImpl2.requestsActionButton()) {
                int groupId2 = menuItemImpl2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i7 > 0 || z2) && i3 > 0 && (!r1.mStrictWidthLimit || iMeasureChildForCells > 0);
                boolean z4 = z3;
                if (z3) {
                    android.view.View itemView2 = r1.getItemView(menuItemImpl2, null, viewGroup);
                    if (r1.mStrictWidthLimit) {
                        int iMeasureChildForCells2 = androidx.appcompat.widget.ActionMenuView.measureChildForCells(itemView2, i, iMeasureChildForCells, iMakeMeasureSpec, 0);
                        iMeasureChildForCells -= iMeasureChildForCells2;
                        if (iMeasureChildForCells2 == 0) {
                            z4 = false;
                        }
                    } else {
                        itemView2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = itemView2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z3 = z5 & (!r1.mStrictWidthLimit ? i3 + i10 <= 0 : i3 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i11 = 0; i11 < i9; i11++) {
                        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl3 = visibleItems.get(i11);
                        if (menuItemImpl3.getGroupId() == groupId2) {
                            if (menuItemImpl3.isActionButton()) {
                                i7++;
                            }
                            menuItemImpl3.setIsActionButton(false);
                        }
                    }
                }
                if (z3) {
                    i7--;
                }
                menuItemImpl2.setIsActionButton(z3);
                r0 = 0;
            } else {
                r0 = r3;
                menuItemImpl2.setIsActionButton(r0);
            }
            i9++;
            r3 = r0;
            size = size;
            view = null;
            r1 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        dismissPopupMenus();
        super.onCloseMenu(menuBuilder, z);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public android.os.Parcelable onSaveInstanceState() {
        androidx.appcompat.widget.ActionMenuPresenter.SavedState savedState = new androidx.appcompat.widget.ActionMenuPresenter.SavedState();
        savedState.openSubMenuId = this.mOpenSubMenuId;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.MenuItem menuItemFindItem;
        if (parcelable instanceof androidx.appcompat.widget.ActionMenuPresenter.SavedState) {
            androidx.appcompat.widget.ActionMenuPresenter.SavedState savedState = (androidx.appcompat.widget.ActionMenuPresenter.SavedState) parcelable;
            if (savedState.openSubMenuId <= 0 || (menuItemFindItem = this.mMenu.findItem(savedState.openSubMenuId)) == null) {
                return;
            }
            onSubMenuSelected((androidx.appcompat.view.menu.SubMenuBuilder) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.core.view.ActionProvider.SubUiVisibilityListener
    public void onSubUiVisibilityChanged(boolean z) {
        if (z) {
            super.onSubMenuSelected(null);
        } else if (this.mMenu != null) {
            this.mMenu.close(false);
        }
    }

    public void setMenuView(androidx.appcompat.widget.ActionMenuView actionMenuView) {
        this.mMenuView = actionMenuView;
        actionMenuView.initialize(this.mMenu);
    }

    private static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.ActionMenuPresenter.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.appcompat.widget.ActionMenuPresenter.SavedState>() { // from class: androidx.appcompat.widget.ActionMenuPresenter.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.ActionMenuPresenter.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.appcompat.widget.ActionMenuPresenter.SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.ActionMenuPresenter.SavedState[] newArray(int i) {
                return new androidx.appcompat.widget.ActionMenuPresenter.SavedState[i];
            }
        };
        public int openSubMenuId;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(android.os.Parcel parcel) {
            this.openSubMenuId = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.openSubMenuId);
        }
    }

    private class OverflowMenuButton extends androidx.appcompat.widget.AppCompatImageView implements androidx.appcompat.widget.ActionMenuView.ActionMenuChildView {
        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerAfter() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerBefore() {
            return false;
        }

        public OverflowMenuButton(android.content.Context context) {
            super(context, null, androidx.appcompat.R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            androidx.appcompat.widget.TooltipCompat.setTooltipText(this, getContentDescription());
            setOnTouchListener(new androidx.appcompat.widget.ForwardingListener(this) { // from class: androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton.1
                @Override // androidx.appcompat.widget.ForwardingListener
                public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
                    if (androidx.appcompat.widget.ActionMenuPresenter.this.mOverflowPopup == null) {
                        return null;
                    }
                    return androidx.appcompat.widget.ActionMenuPresenter.this.mOverflowPopup.getPopup();
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public boolean onForwardingStarted() {
                    androidx.appcompat.widget.ActionMenuPresenter.this.showOverflowMenu();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public boolean onForwardingStopped() {
                    if (androidx.appcompat.widget.ActionMenuPresenter.this.mPostedOpenRunnable != null) {
                        return false;
                    }
                    androidx.appcompat.widget.ActionMenuPresenter.this.hideOverflowMenu();
                    return true;
                }
            });
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            androidx.appcompat.widget.ActionMenuPresenter.this.showOverflowMenu();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            android.graphics.drawable.Drawable drawable = getDrawable();
            android.graphics.drawable.Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = java.lang.Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    private class OverflowPopup extends androidx.appcompat.view.menu.MenuPopupHelper {
        public OverflowPopup(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.View view, boolean z) {
            super(context, menuBuilder, view, z, androidx.appcompat.R.attr.actionOverflowMenuStyle);
            setGravity(androidx.core.view.GravityCompat.END);
            setPresenterCallback(androidx.appcompat.widget.ActionMenuPresenter.this.mPopupPresenterCallback);
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        protected void onDismiss() {
            if (androidx.appcompat.widget.ActionMenuPresenter.this.mMenu != null) {
                androidx.appcompat.widget.ActionMenuPresenter.this.mMenu.close();
            }
            androidx.appcompat.widget.ActionMenuPresenter.this.mOverflowPopup = null;
            super.onDismiss();
        }
    }

    private class ActionButtonSubmenu extends androidx.appcompat.view.menu.MenuPopupHelper {
        public ActionButtonSubmenu(android.content.Context context, androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder, android.view.View view) {
            super(context, subMenuBuilder, view, false, androidx.appcompat.R.attr.actionOverflowMenuStyle);
            if (!((androidx.appcompat.view.menu.MenuItemImpl) subMenuBuilder.getItem()).isActionButton()) {
                setAnchorView(androidx.appcompat.widget.ActionMenuPresenter.this.mOverflowButton == null ? (android.view.View) androidx.appcompat.widget.ActionMenuPresenter.this.mMenuView : androidx.appcompat.widget.ActionMenuPresenter.this.mOverflowButton);
            }
            setPresenterCallback(androidx.appcompat.widget.ActionMenuPresenter.this.mPopupPresenterCallback);
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        protected void onDismiss() {
            androidx.appcompat.widget.ActionMenuPresenter.this.mActionButtonPopup = null;
            androidx.appcompat.widget.ActionMenuPresenter.this.mOpenSubMenuId = 0;
            super.onDismiss();
        }
    }

    private class PopupPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        PopupPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            if (menuBuilder == androidx.appcompat.widget.ActionMenuPresenter.this.mMenu) {
                return false;
            }
            androidx.appcompat.widget.ActionMenuPresenter.this.mOpenSubMenuId = ((androidx.appcompat.view.menu.SubMenuBuilder) menuBuilder).getItem().getItemId();
            androidx.appcompat.view.menu.MenuPresenter.Callback callback = androidx.appcompat.widget.ActionMenuPresenter.this.getCallback();
            if (callback != null) {
                return callback.onOpenSubMenu(menuBuilder);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
            if (menuBuilder instanceof androidx.appcompat.view.menu.SubMenuBuilder) {
                menuBuilder.getRootMenu().close(false);
            }
            androidx.appcompat.view.menu.MenuPresenter.Callback callback = androidx.appcompat.widget.ActionMenuPresenter.this.getCallback();
            if (callback != null) {
                callback.onCloseMenu(menuBuilder, z);
            }
        }
    }

    private class OpenOverflowRunnable implements java.lang.Runnable {
        private androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup mPopup;

        public OpenOverflowRunnable(androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup overflowPopup) {
            this.mPopup = overflowPopup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (androidx.appcompat.widget.ActionMenuPresenter.this.mMenu != null) {
                androidx.appcompat.widget.ActionMenuPresenter.this.mMenu.changeMenuMode();
            }
            android.view.View view = (android.view.View) androidx.appcompat.widget.ActionMenuPresenter.this.mMenuView;
            if (view != null && view.getWindowToken() != null && this.mPopup.tryShow()) {
                androidx.appcompat.widget.ActionMenuPresenter.this.mOverflowPopup = this.mPopup;
            }
            androidx.appcompat.widget.ActionMenuPresenter.this.mPostedOpenRunnable = null;
        }
    }

    private class ActionMenuPopupCallback extends androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback {
        ActionMenuPopupCallback() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback
        public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
            if (androidx.appcompat.widget.ActionMenuPresenter.this.mActionButtonPopup != null) {
                return androidx.appcompat.widget.ActionMenuPresenter.this.mActionButtonPopup.getPopup();
            }
            return null;
        }
    }
}
