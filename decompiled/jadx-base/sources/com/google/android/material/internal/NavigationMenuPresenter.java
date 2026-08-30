package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public class NavigationMenuPresenter implements androidx.appcompat.view.menu.MenuPresenter {
    public static final int NO_TEXT_APPEARANCE_SET = 0;
    private static final java.lang.String STATE_ADAPTER = "android:menu:adapter";
    private static final java.lang.String STATE_HEADER = "android:menu:header";
    private static final java.lang.String STATE_HIERARCHY = "android:menu:list";
    com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter adapter;
    private androidx.appcompat.view.menu.MenuPresenter.Callback callback;
    int dividerInsetEnd;
    int dividerInsetStart;
    boolean hasCustomItemIconSize;
    android.widget.LinearLayout headerLayout;
    android.content.res.ColorStateList iconTintList;
    private int id;
    android.graphics.drawable.Drawable itemBackground;
    android.graphics.drawable.RippleDrawable itemForeground;
    int itemHorizontalPadding;
    int itemIconPadding;
    int itemIconSize;
    private int itemMaxLines;
    int itemVerticalPadding;
    android.view.LayoutInflater layoutInflater;
    androidx.appcompat.view.menu.MenuBuilder menu;
    private com.google.android.material.internal.NavigationMenuView menuView;
    int paddingSeparator;
    private int paddingTopDefault;
    android.content.res.ColorStateList subheaderColor;
    int subheaderInsetEnd;
    int subheaderInsetStart;
    android.content.res.ColorStateList textColor;
    int subheaderTextAppearance = 0;
    int textAppearance = 0;
    boolean isBehindStatusBar = true;
    private int overScrollMode = -1;
    final android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.google.android.material.internal.NavigationMenuPresenter.1
        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            boolean z = true;
            com.google.android.material.internal.NavigationMenuPresenter.this.setUpdateSuspended(true);
            androidx.appcompat.view.menu.MenuItemImpl itemData = ((com.google.android.material.internal.NavigationMenuItemView) view).getItemData();
            boolean zPerformItemAction = com.google.android.material.internal.NavigationMenuPresenter.this.menu.performItemAction(itemData, com.google.android.material.internal.NavigationMenuPresenter.this, 0);
            if (itemData != null && itemData.isCheckable() && zPerformItemAction) {
                com.google.android.material.internal.NavigationMenuPresenter.this.adapter.setCheckedItem(itemData);
            } else {
                z = false;
            }
            com.google.android.material.internal.NavigationMenuPresenter.this.setUpdateSuspended(false);
            if (z) {
                com.google.android.material.internal.NavigationMenuPresenter.this.updateMenuView(false);
            }
        }
    };

    private interface NavigationMenuItem {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        this.layoutInflater = android.view.LayoutInflater.from(context);
        this.menu = menuBuilder;
        this.paddingSeparator = context.getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup viewGroup) {
        if (this.menuView == null) {
            com.google.android.material.internal.NavigationMenuView navigationMenuView = (com.google.android.material.internal.NavigationMenuView) this.layoutInflater.inflate(com.google.android.material.R.layout.design_navigation_menu, viewGroup, false);
            this.menuView = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuViewAccessibilityDelegate(this.menuView));
            if (this.adapter == null) {
                this.adapter = new com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter();
            }
            int i = this.overScrollMode;
            if (i != -1) {
                this.menuView.setOverScrollMode(i);
            }
            this.headerLayout = (android.widget.LinearLayout) this.layoutInflater.inflate(com.google.android.material.R.layout.design_navigation_item_header, (android.view.ViewGroup) this.menuView, false);
            this.menuView.setAdapter(this.adapter);
        }
        return this.menuView;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.update();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
        this.callback = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.callback;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (this.menuView != null) {
            android.util.SparseArray<? extends android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
            this.menuView.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            bundle.putBundle(STATE_ADAPTER, navigationMenuAdapter.createInstanceState());
        }
        if (this.headerLayout != null) {
            android.util.SparseArray<? extends android.os.Parcelable> sparseArray2 = new android.util.SparseArray<>();
            this.headerLayout.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(STATE_HEADER, sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            android.util.SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.menuView.restoreHierarchyState(sparseParcelableArray);
            }
            android.os.Bundle bundle2 = bundle.getBundle(STATE_ADAPTER);
            if (bundle2 != null) {
                this.adapter.restoreInstanceState(bundle2);
            }
            android.util.SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray(STATE_HEADER);
            if (sparseParcelableArray2 != null) {
                this.headerLayout.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public void setCheckedItem(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        this.adapter.setCheckedItem(menuItemImpl);
    }

    public androidx.appcompat.view.menu.MenuItemImpl getCheckedItem() {
        return this.adapter.getCheckedItem();
    }

    public android.view.View inflateHeaderView(int i) {
        android.view.View viewInflate = this.layoutInflater.inflate(i, (android.view.ViewGroup) this.headerLayout, false);
        addHeaderView(viewInflate);
        return viewInflate;
    }

    public void addHeaderView(android.view.View view) {
        this.headerLayout.addView(view);
        com.google.android.material.internal.NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void removeHeaderView(android.view.View view) {
        this.headerLayout.removeView(view);
        if (this.headerLayout.getChildCount() == 0) {
            com.google.android.material.internal.NavigationMenuView navigationMenuView = this.menuView;
            navigationMenuView.setPadding(0, this.paddingTopDefault, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public int getHeaderCount() {
        return this.headerLayout.getChildCount();
    }

    public android.view.View getHeaderView(int i) {
        return this.headerLayout.getChildAt(i);
    }

    public void setSubheaderColor(android.content.res.ColorStateList colorStateList) {
        this.subheaderColor = colorStateList;
        updateMenuView(false);
    }

    public void setSubheaderTextAppearance(int i) {
        this.subheaderTextAppearance = i;
        updateMenuView(false);
    }

    public android.content.res.ColorStateList getItemTintList() {
        return this.iconTintList;
    }

    public void setItemIconTintList(android.content.res.ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        updateMenuView(false);
    }

    public android.content.res.ColorStateList getItemTextColor() {
        return this.textColor;
    }

    public void setItemTextColor(android.content.res.ColorStateList colorStateList) {
        this.textColor = colorStateList;
        updateMenuView(false);
    }

    public void setItemTextAppearance(int i) {
        this.textAppearance = i;
        updateMenuView(false);
    }

    public android.graphics.drawable.Drawable getItemBackground() {
        return this.itemBackground;
    }

    public void setItemBackground(android.graphics.drawable.Drawable drawable) {
        this.itemBackground = drawable;
        updateMenuView(false);
    }

    public void setItemForeground(android.graphics.drawable.RippleDrawable rippleDrawable) {
        this.itemForeground = rippleDrawable;
        updateMenuView(false);
    }

    public int getItemHorizontalPadding() {
        return this.itemHorizontalPadding;
    }

    public void setItemHorizontalPadding(int i) {
        this.itemHorizontalPadding = i;
        updateMenuView(false);
    }

    public int getItemVerticalPadding() {
        return this.itemVerticalPadding;
    }

    public void setItemVerticalPadding(int i) {
        this.itemVerticalPadding = i;
        updateMenuView(false);
    }

    public int getDividerInsetStart() {
        return this.dividerInsetStart;
    }

    public void setDividerInsetStart(int i) {
        this.dividerInsetStart = i;
        updateMenuView(false);
    }

    public int getDividerInsetEnd() {
        return this.dividerInsetEnd;
    }

    public void setDividerInsetEnd(int i) {
        this.dividerInsetEnd = i;
        updateMenuView(false);
    }

    public int getSubheaderInsetStart() {
        return this.subheaderInsetStart;
    }

    public void setSubheaderInsetStart(int i) {
        this.subheaderInsetStart = i;
        updateMenuView(false);
    }

    public int getSubheaderInsetEnd() {
        return this.subheaderInsetEnd;
    }

    public void setSubheaderInsetEnd(int i) {
        this.subheaderInsetEnd = i;
        updateMenuView(false);
    }

    public int getItemIconPadding() {
        return this.itemIconPadding;
    }

    public void setItemIconPadding(int i) {
        this.itemIconPadding = i;
        updateMenuView(false);
    }

    public void setItemMaxLines(int i) {
        this.itemMaxLines = i;
        updateMenuView(false);
    }

    public int getItemMaxLines() {
        return this.itemMaxLines;
    }

    public void setItemIconSize(int i) {
        if (this.itemIconSize != i) {
            this.itemIconSize = i;
            this.hasCustomItemIconSize = true;
            updateMenuView(false);
        }
    }

    public void setUpdateSuspended(boolean z) {
        com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.setUpdateSuspended(z);
        }
    }

    public void setBehindStatusBar(boolean z) {
        if (this.isBehindStatusBar != z) {
            this.isBehindStatusBar = z;
            updateTopPadding();
        }
    }

    public boolean isBehindStatusBar() {
        return this.isBehindStatusBar;
    }

    private void updateTopPadding() {
        int i = (this.headerLayout.getChildCount() == 0 && this.isBehindStatusBar) ? this.paddingTopDefault : 0;
        com.google.android.material.internal.NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    public void dispatchApplyWindowInsets(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        if (this.paddingTopDefault != systemWindowInsetTop) {
            this.paddingTopDefault = systemWindowInsetTop;
            updateTopPadding();
        }
        com.google.android.material.internal.NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, windowInsetsCompat.getSystemWindowInsetBottom());
        androidx.core.view.ViewCompat.dispatchApplyWindowInsets(this.headerLayout, windowInsetsCompat);
    }

    public void setOverScrollMode(int i) {
        this.overScrollMode = i;
        com.google.android.material.internal.NavigationMenuView navigationMenuView = this.menuView;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    private static abstract class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public ViewHolder(android.view.View view) {
            super(view);
        }
    }

    private static class NormalViewHolder extends com.google.android.material.internal.NavigationMenuPresenter.ViewHolder {
        public NormalViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.view.View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(com.google.android.material.R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    private static class SubheaderViewHolder extends com.google.android.material.internal.NavigationMenuPresenter.ViewHolder {
        public SubheaderViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            super(layoutInflater.inflate(com.google.android.material.R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    private static class SeparatorViewHolder extends com.google.android.material.internal.NavigationMenuPresenter.ViewHolder {
        public SeparatorViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            super(layoutInflater.inflate(com.google.android.material.R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    private static class HeaderViewHolder extends com.google.android.material.internal.NavigationMenuPresenter.ViewHolder {
        public HeaderViewHolder(android.view.View view) {
            super(view);
        }
    }

    private class NavigationMenuAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.android.material.internal.NavigationMenuPresenter.ViewHolder> {
        private static final java.lang.String STATE_ACTION_VIEWS = "android:menu:action_views";
        private static final java.lang.String STATE_CHECKED_ITEM = "android:menu:checked";
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private androidx.appcompat.view.menu.MenuItemImpl checkedItem;
        private final java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuItem> items = new java.util.ArrayList<>();
        private boolean updateSuspended;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        NavigationMenuAdapter() {
            prepareMenuItems();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.items.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuItem navigationMenuItem = this.items.get(i);
            if (navigationMenuItem instanceof com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuSeparatorItem) {
                return 2;
            }
            if (navigationMenuItem instanceof com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuHeaderItem) {
                return 3;
            }
            if (navigationMenuItem instanceof com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) {
                return ((com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) navigationMenuItem).getMenuItem().hasSubMenu() ? 1 : 0;
            }
            throw new java.lang.RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public com.google.android.material.internal.NavigationMenuPresenter.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new com.google.android.material.internal.NavigationMenuPresenter.NormalViewHolder(com.google.android.material.internal.NavigationMenuPresenter.this.layoutInflater, viewGroup, com.google.android.material.internal.NavigationMenuPresenter.this.onClickListener);
            }
            if (i == 1) {
                return new com.google.android.material.internal.NavigationMenuPresenter.SubheaderViewHolder(com.google.android.material.internal.NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i == 2) {
                return new com.google.android.material.internal.NavigationMenuPresenter.SeparatorViewHolder(com.google.android.material.internal.NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new com.google.android.material.internal.NavigationMenuPresenter.HeaderViewHolder(com.google.android.material.internal.NavigationMenuPresenter.this.headerLayout);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(com.google.android.material.internal.NavigationMenuPresenter.ViewHolder viewHolder, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType == 2) {
                        com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuSeparatorItem navigationMenuSeparatorItem = (com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuSeparatorItem) this.items.get(i);
                        viewHolder.itemView.setPadding(com.google.android.material.internal.NavigationMenuPresenter.this.dividerInsetStart, navigationMenuSeparatorItem.getPaddingTop(), com.google.android.material.internal.NavigationMenuPresenter.this.dividerInsetEnd, navigationMenuSeparatorItem.getPaddingBottom());
                        return;
                    } else {
                        if (itemViewType != 3) {
                            return;
                        }
                        setAccessibilityDelegate(viewHolder.itemView, i, true);
                        return;
                    }
                }
                android.widget.TextView textView = (android.widget.TextView) viewHolder.itemView;
                textView.setText(((com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) this.items.get(i)).getMenuItem().getTitle());
                if (com.google.android.material.internal.NavigationMenuPresenter.this.subheaderTextAppearance != 0) {
                    androidx.core.widget.TextViewCompat.setTextAppearance(textView, com.google.android.material.internal.NavigationMenuPresenter.this.subheaderTextAppearance);
                }
                textView.setPadding(com.google.android.material.internal.NavigationMenuPresenter.this.subheaderInsetStart, textView.getPaddingTop(), com.google.android.material.internal.NavigationMenuPresenter.this.subheaderInsetEnd, textView.getPaddingBottom());
                if (com.google.android.material.internal.NavigationMenuPresenter.this.subheaderColor != null) {
                    textView.setTextColor(com.google.android.material.internal.NavigationMenuPresenter.this.subheaderColor);
                }
                setAccessibilityDelegate(textView, i, true);
                return;
            }
            com.google.android.material.internal.NavigationMenuItemView navigationMenuItemView = (com.google.android.material.internal.NavigationMenuItemView) viewHolder.itemView;
            navigationMenuItemView.setIconTintList(com.google.android.material.internal.NavigationMenuPresenter.this.iconTintList);
            if (com.google.android.material.internal.NavigationMenuPresenter.this.textAppearance != 0) {
                navigationMenuItemView.setTextAppearance(com.google.android.material.internal.NavigationMenuPresenter.this.textAppearance);
            }
            if (com.google.android.material.internal.NavigationMenuPresenter.this.textColor != null) {
                navigationMenuItemView.setTextColor(com.google.android.material.internal.NavigationMenuPresenter.this.textColor);
            }
            androidx.core.view.ViewCompat.setBackground(navigationMenuItemView, com.google.android.material.internal.NavigationMenuPresenter.this.itemBackground != null ? com.google.android.material.internal.NavigationMenuPresenter.this.itemBackground.getConstantState().newDrawable() : null);
            if (com.google.android.material.internal.NavigationMenuPresenter.this.itemForeground != null) {
                navigationMenuItemView.setForeground(com.google.android.material.internal.NavigationMenuPresenter.this.itemForeground.getConstantState().newDrawable());
            }
            com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem navigationMenuTextItem = (com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) this.items.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(navigationMenuTextItem.needsEmptyIcon);
            navigationMenuItemView.setPadding(com.google.android.material.internal.NavigationMenuPresenter.this.itemHorizontalPadding, com.google.android.material.internal.NavigationMenuPresenter.this.itemVerticalPadding, com.google.android.material.internal.NavigationMenuPresenter.this.itemHorizontalPadding, com.google.android.material.internal.NavigationMenuPresenter.this.itemVerticalPadding);
            navigationMenuItemView.setIconPadding(com.google.android.material.internal.NavigationMenuPresenter.this.itemIconPadding);
            if (com.google.android.material.internal.NavigationMenuPresenter.this.hasCustomItemIconSize) {
                navigationMenuItemView.setIconSize(com.google.android.material.internal.NavigationMenuPresenter.this.itemIconSize);
            }
            navigationMenuItemView.setMaxLines(com.google.android.material.internal.NavigationMenuPresenter.this.itemMaxLines);
            navigationMenuItemView.initialize(navigationMenuTextItem.getMenuItem(), 0);
            setAccessibilityDelegate(navigationMenuItemView, i, false);
        }

        private void setAccessibilityDelegate(android.view.View view, final int i, final boolean z) {
            androidx.core.view.ViewCompat.setAccessibilityDelegate(view, new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter.1
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(android.view.View view2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setCollectionItemInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter.this.adjustItemPositionForA11yDelegate(i), 1, 1, 1, z, view2.isSelected()));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int adjustItemPositionForA11yDelegate(int i) {
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                if (com.google.android.material.internal.NavigationMenuPresenter.this.adapter.getItemViewType(i3) == 2) {
                    i2--;
                }
            }
            return com.google.android.material.internal.NavigationMenuPresenter.this.headerLayout.getChildCount() == 0 ? i2 - 1 : i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(com.google.android.material.internal.NavigationMenuPresenter.ViewHolder viewHolder) {
            if (viewHolder instanceof com.google.android.material.internal.NavigationMenuPresenter.NormalViewHolder) {
                ((com.google.android.material.internal.NavigationMenuItemView) viewHolder.itemView).recycle();
            }
        }

        public void update() {
            prepareMenuItems();
            notifyDataSetChanged();
        }

        private void prepareMenuItems() {
            if (this.updateSuspended) {
                return;
            }
            boolean z = true;
            this.updateSuspended = true;
            this.items.clear();
            this.items.add(new com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuHeaderItem());
            int size = com.google.android.material.internal.NavigationMenuPresenter.this.menu.getVisibleItems().size();
            int i = -1;
            int i2 = 0;
            boolean z2 = false;
            int size2 = 0;
            while (i2 < size) {
                androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = com.google.android.material.internal.NavigationMenuPresenter.this.menu.getVisibleItems().get(i2);
                if (menuItemImpl.isChecked()) {
                    setCheckedItem(menuItemImpl);
                }
                if (menuItemImpl.isCheckable()) {
                    menuItemImpl.setExclusiveCheckable(false);
                }
                if (menuItemImpl.hasSubMenu()) {
                    android.view.SubMenu subMenu = menuItemImpl.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i2 != 0) {
                            this.items.add(new com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuSeparatorItem(com.google.android.material.internal.NavigationMenuPresenter.this.paddingSeparator, 0));
                        }
                        this.items.add(new com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem(menuItemImpl));
                        int size3 = this.items.size();
                        int size4 = subMenu.size();
                        int i3 = 0;
                        boolean z3 = false;
                        while (i3 < size4) {
                            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl2 = (androidx.appcompat.view.menu.MenuItemImpl) subMenu.getItem(i3);
                            if (menuItemImpl2.isVisible()) {
                                if (!z3 && menuItemImpl2.getIcon() != null) {
                                    z3 = z;
                                }
                                if (menuItemImpl2.isCheckable()) {
                                    menuItemImpl2.setExclusiveCheckable(false);
                                }
                                if (menuItemImpl.isChecked()) {
                                    setCheckedItem(menuItemImpl);
                                }
                                this.items.add(new com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem(menuItemImpl2));
                            }
                            i3++;
                            z = true;
                        }
                        if (z3) {
                            appendTransparentIconIfMissing(size3, this.items.size());
                        }
                    }
                } else {
                    int groupId = menuItemImpl.getGroupId();
                    if (groupId != i) {
                        size2 = this.items.size();
                        z2 = menuItemImpl.getIcon() != null;
                        if (i2 != 0) {
                            size2++;
                            this.items.add(new com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuSeparatorItem(com.google.android.material.internal.NavigationMenuPresenter.this.paddingSeparator, com.google.android.material.internal.NavigationMenuPresenter.this.paddingSeparator));
                        }
                    } else if (!z2 && menuItemImpl.getIcon() != null) {
                        appendTransparentIconIfMissing(size2, this.items.size());
                        z2 = true;
                    }
                    com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem navigationMenuTextItem = new com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem(menuItemImpl);
                    navigationMenuTextItem.needsEmptyIcon = z2;
                    this.items.add(navigationMenuTextItem);
                    i = groupId;
                }
                i2++;
                z = true;
            }
            this.updateSuspended = false;
        }

        private void appendTransparentIconIfMissing(int i, int i2) {
            while (i < i2) {
                ((com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) this.items.get(i)).needsEmptyIcon = true;
                i++;
            }
        }

        public void setCheckedItem(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
            if (this.checkedItem == menuItemImpl || !menuItemImpl.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl2 = this.checkedItem;
            if (menuItemImpl2 != null) {
                menuItemImpl2.setChecked(false);
            }
            this.checkedItem = menuItemImpl;
            menuItemImpl.setChecked(true);
        }

        public androidx.appcompat.view.menu.MenuItemImpl getCheckedItem() {
            return this.checkedItem;
        }

        public android.os.Bundle createInstanceState() {
            android.os.Bundle bundle = new android.os.Bundle();
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.checkedItem;
            if (menuItemImpl != null) {
                bundle.putInt(STATE_CHECKED_ITEM, menuItemImpl.getItemId());
            }
            android.util.SparseArray<? extends android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
            int size = this.items.size();
            for (int i = 0; i < size; i++) {
                com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuItem navigationMenuItem = this.items.get(i);
                if (navigationMenuItem instanceof com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) {
                    androidx.appcompat.view.menu.MenuItemImpl menuItem = ((com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) navigationMenuItem).getMenuItem();
                    android.view.View actionView = menuItem != null ? menuItem.getActionView() : null;
                    if (actionView != null) {
                        com.google.android.material.internal.ParcelableSparseArray parcelableSparseArray = new com.google.android.material.internal.ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItem.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(STATE_ACTION_VIEWS, sparseArray);
            return bundle;
        }

        public void restoreInstanceState(android.os.Bundle bundle) {
            androidx.appcompat.view.menu.MenuItemImpl menuItem;
            android.view.View actionView;
            com.google.android.material.internal.ParcelableSparseArray parcelableSparseArray;
            androidx.appcompat.view.menu.MenuItemImpl menuItem2;
            int i = bundle.getInt(STATE_CHECKED_ITEM, 0);
            if (i != 0) {
                this.updateSuspended = true;
                int size = this.items.size();
                for (int i2 = 0; i2 < size; i2++) {
                    com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuItem navigationMenuItem = this.items.get(i2);
                    if ((navigationMenuItem instanceof com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) && (menuItem2 = ((com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) navigationMenuItem).getMenuItem()) != null && menuItem2.getItemId() == i) {
                        setCheckedItem(menuItem2);
                        break;
                    }
                }
                this.updateSuspended = false;
                prepareMenuItems();
            }
            android.util.SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(STATE_ACTION_VIEWS);
            if (sparseParcelableArray != null) {
                int size2 = this.items.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuItem navigationMenuItem2 = this.items.get(i3);
                    if ((navigationMenuItem2 instanceof com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) && (menuItem = ((com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) navigationMenuItem2).getMenuItem()) != null && (actionView = menuItem.getActionView()) != null && (parcelableSparseArray = (com.google.android.material.internal.ParcelableSparseArray) sparseParcelableArray.get(menuItem.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void setUpdateSuspended(boolean z) {
            this.updateSuspended = z;
        }

        int getRowCount() {
            int i = com.google.android.material.internal.NavigationMenuPresenter.this.headerLayout.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < com.google.android.material.internal.NavigationMenuPresenter.this.adapter.getItemCount(); i2++) {
                int itemViewType = com.google.android.material.internal.NavigationMenuPresenter.this.adapter.getItemViewType(i2);
                if (itemViewType == 0 || itemViewType == 1) {
                    i++;
                }
            }
            return i;
        }
    }

    private static class NavigationMenuTextItem implements com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuItem {
        private final androidx.appcompat.view.menu.MenuItemImpl menuItem;
        boolean needsEmptyIcon;

        NavigationMenuTextItem(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
            this.menuItem = menuItemImpl;
        }

        public androidx.appcompat.view.menu.MenuItemImpl getMenuItem() {
            return this.menuItem;
        }
    }

    private static class NavigationMenuSeparatorItem implements com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuItem {
        private final int paddingBottom;
        private final int paddingTop;

        public NavigationMenuSeparatorItem(int i, int i2) {
            this.paddingTop = i;
            this.paddingBottom = i2;
        }

        public int getPaddingTop() {
            return this.paddingTop;
        }

        public int getPaddingBottom() {
            return this.paddingBottom;
        }
    }

    private static class NavigationMenuHeaderItem implements com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuItem {
        NavigationMenuHeaderItem() {
        }
    }

    private class NavigationMenuViewAccessibilityDelegate extends androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate {
        NavigationMenuViewAccessibilityDelegate(androidx.recyclerview.widget.RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(com.google.android.material.internal.NavigationMenuPresenter.this.adapter.getRowCount(), 1, false));
        }
    }
}
