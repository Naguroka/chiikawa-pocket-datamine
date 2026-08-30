package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public class NavigationMenuItemView extends com.google.android.material.internal.ForegroundLinearLayout implements androidx.appcompat.view.menu.MenuView.ItemView {
    private static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};
    private final androidx.core.view.AccessibilityDelegateCompat accessibilityDelegate;
    private android.widget.FrameLayout actionArea;
    boolean checkable;
    private android.graphics.drawable.Drawable emptyDrawable;
    private boolean hasIconTintList;
    private int iconSize;
    private android.content.res.ColorStateList iconTintList;
    private androidx.appcompat.view.menu.MenuItemImpl itemData;
    private boolean needsEmptyIcon;
    private final android.widget.CheckedTextView textView;

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z, char c) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(android.content.Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat = new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCheckable(com.google.android.material.internal.NavigationMenuItemView.this.checkable);
            }
        };
        this.accessibilityDelegate = accessibilityDelegateCompat;
        setOrientation(0);
        android.view.LayoutInflater.from(context).inflate(com.google.android.material.R.layout.design_navigation_menu_item, (android.view.ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_navigation_icon_size));
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) findViewById(com.google.android.material.R.id.design_menu_item_text);
        this.textView = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        androidx.core.view.ViewCompat.setAccessibilityDelegate(checkedTextView, accessibilityDelegateCompat);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl, int i) {
        this.itemData = menuItemImpl;
        if (menuItemImpl.getItemId() > 0) {
            setId(menuItemImpl.getItemId());
        }
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            androidx.core.view.ViewCompat.setBackground(this, createDefaultBackground());
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.getTitle());
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.getContentDescription());
        androidx.appcompat.widget.TooltipCompat.setTooltipText(this, menuItemImpl.getTooltipText());
        adjustAppearance();
    }

    private boolean shouldExpandActionArea() {
        return this.itemData.getTitle() == null && this.itemData.getIcon() == null && this.itemData.getActionView() != null;
    }

    private void adjustAppearance() {
        if (shouldExpandActionArea()) {
            this.textView.setVisibility(8);
            android.widget.FrameLayout frameLayout = this.actionArea;
            if (frameLayout != null) {
                androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                this.actionArea.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.textView.setVisibility(0);
        android.widget.FrameLayout frameLayout2 = this.actionArea;
        if (frameLayout2 != null) {
            androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams2.width = -2;
            this.actionArea.setLayoutParams(layoutParams2);
        }
    }

    public void recycle() {
        android.widget.FrameLayout frameLayout = this.actionArea;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.textView.setCompoundDrawables(null, null, null, null);
    }

    private void setActionView(android.view.View view) {
        if (view != null) {
            if (this.actionArea == null) {
                this.actionArea = (android.widget.FrameLayout) ((android.view.ViewStub) findViewById(com.google.android.material.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.actionArea.removeAllViews();
            this.actionArea.addView(view);
        }
    }

    private android.graphics.drawable.StateListDrawable createDefaultBackground() {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorControlHighlight, typedValue, true)) {
            return null;
        }
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(CHECKED_STATE_SET, new android.graphics.drawable.ColorDrawable(typedValue.data));
        stateListDrawable.addState(EMPTY_STATE_SET, new android.graphics.drawable.ColorDrawable(0));
        return stateListDrawable;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public androidx.appcompat.view.menu.MenuItemImpl getItemData() {
        return this.itemData;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(java.lang.CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.checkable != z) {
            this.checkable = z;
            this.accessibilityDelegate.sendAccessibilityEvent(this.textView, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z) {
        refreshDrawableState();
        this.textView.setChecked(z);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            if (this.hasIconTintList) {
                android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
                androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, this.iconTintList);
            }
            int i = this.iconSize;
            drawable.setBounds(0, 0, i, i);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                android.graphics.drawable.Drawable drawable2 = androidx.core.content.res.ResourcesCompat.getDrawable(getResources(), com.google.android.material.R.drawable.navigation_empty_icon, getContext().getTheme());
                this.emptyDrawable = drawable2;
                if (drawable2 != null) {
                    int i2 = this.iconSize;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.emptyDrawable;
        }
        androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(this.textView, drawable, null, null, null);
    }

    public void setIconSize(int i) {
        this.iconSize = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.itemData.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    void setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        this.hasIconTintList = colorStateList != null;
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null) {
            setIcon(menuItemImpl.getIcon());
        }
    }

    public void setTextAppearance(int i) {
        androidx.core.widget.TextViewCompat.setTextAppearance(this.textView, i);
    }

    public void setTextColor(android.content.res.ColorStateList colorStateList) {
        this.textView.setTextColor(colorStateList);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.needsEmptyIcon = z;
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIconPadding(int i) {
        this.textView.setCompoundDrawablePadding(i);
    }

    public void setMaxLines(int i) {
        this.textView.setMaxLines(i);
    }
}
