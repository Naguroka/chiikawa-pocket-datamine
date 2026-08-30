package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class MenuItemImpl implements androidx.core.internal.view.SupportMenuItem {
    private static final int CHECKABLE = 1;
    private static final int CHECKED = 2;
    private static final int ENABLED = 16;
    private static final int EXCLUSIVE = 4;
    private static final int HIDDEN = 8;
    private static final int IS_ACTION = 32;
    static final int NO_ICON = 0;
    private static final int SHOW_AS_ACTION_MASK = 3;
    private static final java.lang.String TAG = "MenuItemImpl";
    private androidx.core.view.ActionProvider mActionProvider;
    private android.view.View mActionView;
    private final int mCategoryOrder;
    private android.view.MenuItem.OnMenuItemClickListener mClickListener;
    private java.lang.CharSequence mContentDescription;
    private final int mGroup;
    private android.graphics.drawable.Drawable mIconDrawable;
    private final int mId;
    private android.content.Intent mIntent;
    private java.lang.Runnable mItemCallback;
    androidx.appcompat.view.menu.MenuBuilder mMenu;
    private android.view.ContextMenu.ContextMenuInfo mMenuInfo;
    private android.view.MenuItem.OnActionExpandListener mOnActionExpandListener;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private int mShowAsAction;
    private androidx.appcompat.view.menu.SubMenuBuilder mSubMenu;
    private java.lang.CharSequence mTitle;
    private java.lang.CharSequence mTitleCondensed;
    private java.lang.CharSequence mTooltipText;
    private int mShortcutNumericModifiers = 4096;
    private int mShortcutAlphabeticModifiers = 4096;
    private int mIconResId = 0;
    private android.content.res.ColorStateList mIconTintList = null;
    private android.graphics.PorterDuff.Mode mIconTintMode = null;
    private boolean mHasIconTint = false;
    private boolean mHasIconTintMode = false;
    private boolean mNeedToApplyIconTint = false;
    private int mFlags = 16;
    private boolean mIsActionViewExpanded = false;

    MenuItemImpl(androidx.appcompat.view.menu.MenuBuilder menuBuilder, int i, int i2, int i3, int i4, java.lang.CharSequence charSequence, int i5) {
        this.mMenu = menuBuilder;
        this.mId = i2;
        this.mGroup = i;
        this.mCategoryOrder = i3;
        this.mOrdering = i4;
        this.mTitle = charSequence;
        this.mShowAsAction = i5;
    }

    public boolean invoke() {
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.mClickListener;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        androidx.appcompat.view.menu.MenuBuilder menuBuilder = this.mMenu;
        if (menuBuilder.dispatchMenuItemSelected(menuBuilder, this)) {
            return true;
        }
        java.lang.Runnable runnable = this.mItemCallback;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.mIntent != null) {
            try {
                this.mMenu.getContext().startActivity(this.mIntent);
                return true;
            } catch (android.content.ActivityNotFoundException e) {
                android.util.Log.e(TAG, "Can't find activity to handle intent; ignoring", e);
            }
        }
        androidx.core.view.ActionProvider actionProvider = this.mActionProvider;
        return actionProvider != null && actionProvider.onPerformDefaultAction();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.mFlags & 16) != 0;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean z) {
        if (z) {
            this.mFlags |= 16;
        } else {
            this.mFlags &= -17;
        }
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.mGroup;
    }

    @Override // android.view.MenuItem
    @android.view.ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.mId;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.mCategoryOrder;
    }

    public int getOrdering() {
        return this.mOrdering;
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
        return this.mIntent;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent intent) {
        this.mIntent = intent;
        return this;
    }

    java.lang.Runnable getCallback() {
        return this.mItemCallback;
    }

    public android.view.MenuItem setCallback(java.lang.Runnable runnable) {
        this.mItemCallback = runnable;
        return this;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.mShortcutAlphabeticChar;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c) {
        if (this.mShortcutAlphabeticChar == c) {
            return this;
        }
        this.mShortcutAlphabeticChar = java.lang.Character.toLowerCase(c);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.mShortcutAlphabeticChar == c && this.mShortcutAlphabeticModifiers == i) {
            return this;
        }
        this.mShortcutAlphabeticChar = java.lang.Character.toLowerCase(c);
        this.mShortcutAlphabeticModifiers = android.view.KeyEvent.normalizeMetaState(i);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.mShortcutAlphabeticModifiers;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.mShortcutNumericChar;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getNumericModifiers() {
        return this.mShortcutNumericModifiers;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c) {
        if (this.mShortcutNumericChar == c) {
            return this;
        }
        this.mShortcutNumericChar = c;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c, int i) {
        if (this.mShortcutNumericChar == c && this.mShortcutNumericModifiers == i) {
            return this;
        }
        this.mShortcutNumericChar = c;
        this.mShortcutNumericModifiers = android.view.KeyEvent.normalizeMetaState(i);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c, char c2) {
        this.mShortcutNumericChar = c;
        this.mShortcutAlphabeticChar = java.lang.Character.toLowerCase(c2);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.mShortcutNumericChar = c;
        this.mShortcutNumericModifiers = android.view.KeyEvent.normalizeMetaState(i);
        this.mShortcutAlphabeticChar = java.lang.Character.toLowerCase(c2);
        this.mShortcutAlphabeticModifiers = android.view.KeyEvent.normalizeMetaState(i2);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    char getShortcut() {
        return this.mMenu.isQwertyMode() ? this.mShortcutAlphabeticChar : this.mShortcutNumericChar;
    }

    java.lang.String getShortcutLabel() {
        char shortcut = getShortcut();
        if (shortcut == 0) {
            return "";
        }
        android.content.res.Resources resources = this.mMenu.getContext().getResources();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (android.view.ViewConfiguration.get(this.mMenu.getContext()).hasPermanentMenuKey()) {
            sb.append(resources.getString(androidx.appcompat.R.string.abc_prepend_shortcut_label));
        }
        int i = this.mMenu.isQwertyMode() ? this.mShortcutAlphabeticModifiers : this.mShortcutNumericModifiers;
        appendModifier(sb, i, 65536, resources.getString(androidx.appcompat.R.string.abc_menu_meta_shortcut_label));
        appendModifier(sb, i, 4096, resources.getString(androidx.appcompat.R.string.abc_menu_ctrl_shortcut_label));
        appendModifier(sb, i, 2, resources.getString(androidx.appcompat.R.string.abc_menu_alt_shortcut_label));
        appendModifier(sb, i, 1, resources.getString(androidx.appcompat.R.string.abc_menu_shift_shortcut_label));
        appendModifier(sb, i, 4, resources.getString(androidx.appcompat.R.string.abc_menu_sym_shortcut_label));
        appendModifier(sb, i, 8, resources.getString(androidx.appcompat.R.string.abc_menu_function_shortcut_label));
        if (shortcut == '\b') {
            sb.append(resources.getString(androidx.appcompat.R.string.abc_menu_delete_shortcut_label));
        } else if (shortcut == '\n') {
            sb.append(resources.getString(androidx.appcompat.R.string.abc_menu_enter_shortcut_label));
        } else if (shortcut == ' ') {
            sb.append(resources.getString(androidx.appcompat.R.string.abc_menu_space_shortcut_label));
        } else {
            sb.append(shortcut);
        }
        return sb.toString();
    }

    private static void appendModifier(java.lang.StringBuilder sb, int i, int i2, java.lang.String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    boolean shouldShowShortcut() {
        return this.mMenu.isShortcutsVisible() && getShortcut() != 0;
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
        return this.mSubMenu;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.mSubMenu != null;
    }

    public void setSubMenu(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        this.mSubMenu = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(getTitle());
    }

    @Override // android.view.MenuItem
    @android.view.ViewDebug.CapturedViewProperty
    public java.lang.CharSequence getTitle() {
        return this.mTitle;
    }

    java.lang.CharSequence getTitleForItemView(androidx.appcompat.view.menu.MenuView.ItemView itemView) {
        if (itemView != null && itemView.prefersCondensedTitle()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.mTitle = charSequence;
        this.mMenu.onItemsChanged(false);
        androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder = this.mSubMenu;
        if (subMenuBuilder != null) {
            subMenuBuilder.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int i) {
        return setTitle(this.mMenu.getContext().getString(i));
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.mTitleCondensed;
        return charSequence != null ? charSequence : this.mTitle;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.mTitleCondensed = charSequence;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
        android.graphics.drawable.Drawable drawable = this.mIconDrawable;
        if (drawable != null) {
            return applyIconTintIfNecessary(drawable);
        }
        if (this.mIconResId == 0) {
            return null;
        }
        android.graphics.drawable.Drawable drawable2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(this.mMenu.getContext(), this.mIconResId);
        this.mIconResId = 0;
        this.mIconDrawable = drawable2;
        return applyIconTintIfNecessary(drawable2);
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.mIconResId = 0;
        this.mIconDrawable = drawable;
        this.mNeedToApplyIconTint = true;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int i) {
        this.mIconDrawable = null;
        this.mIconResId = i;
        this.mNeedToApplyIconTint = true;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.mIconTintList = colorStateList;
        this.mHasIconTint = true;
        this.mNeedToApplyIconTint = true;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
        return this.mIconTintList;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.mIconTintMode = mode;
        this.mHasIconTintMode = true;
        this.mNeedToApplyIconTint = true;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.mIconTintMode;
    }

    private android.graphics.drawable.Drawable applyIconTintIfNecessary(android.graphics.drawable.Drawable drawable) {
        if (drawable != null && this.mNeedToApplyIconTint && (this.mHasIconTint || this.mHasIconTintMode)) {
            drawable = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
            if (this.mHasIconTint) {
                androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, this.mIconTintList);
            }
            if (this.mHasIconTintMode) {
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(drawable, this.mIconTintMode);
            }
            this.mNeedToApplyIconTint = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.mFlags & 1) == 1;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean z) {
        int i = this.mFlags;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.mFlags = i2;
        if (i != i2) {
            this.mMenu.onItemsChanged(false);
        }
        return this;
    }

    public void setExclusiveCheckable(boolean z) {
        this.mFlags = (z ? 4 : 0) | (this.mFlags & (-5));
    }

    public boolean isExclusiveCheckable() {
        return (this.mFlags & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.mFlags & 2) == 2;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean z) {
        if ((this.mFlags & 4) != 0) {
            this.mMenu.setExclusiveItemChecked(this);
        } else {
            setCheckedInt(z);
        }
        return this;
    }

    void setCheckedInt(boolean z) {
        int i = this.mFlags;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.mFlags = i2;
        if (i != i2) {
            this.mMenu.onItemsChanged(false);
        }
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.ActionProvider actionProvider = this.mActionProvider;
        if (actionProvider == null || !actionProvider.overridesItemVisibility()) {
            return (this.mFlags & 8) == 0;
        }
        return (this.mFlags & 8) == 0 && this.mActionProvider.isVisible();
    }

    boolean setVisibleInt(boolean z) {
        int i = this.mFlags;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.mFlags = i2;
        return i != i2;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean z) {
        if (setVisibleInt(z)) {
            this.mMenu.onItemVisibleChanged(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mClickListener = onMenuItemClickListener;
        return this;
    }

    public java.lang.String toString() {
        java.lang.CharSequence charSequence = this.mTitle;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    void setMenuInfo(android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mMenuInfo = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.mMenuInfo;
    }

    public void actionFormatChanged() {
        this.mMenu.onItemActionRequestChanged(this);
    }

    public boolean shouldShowIcon() {
        return this.mMenu.getOptionalIconsVisible();
    }

    public boolean isActionButton() {
        return (this.mFlags & 32) == 32;
    }

    public boolean requestsActionButton() {
        return (this.mShowAsAction & 1) == 1;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresActionButton() {
        return (this.mShowAsAction & 2) == 2;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresOverflow() {
        return (requiresActionButton() || requestsActionButton()) ? false : true;
    }

    public void setIsActionButton(boolean z) {
        if (z) {
            this.mFlags |= 32;
        } else {
            this.mFlags &= -33;
        }
    }

    public boolean showsTextAsAction() {
        return (this.mShowAsAction & 4) == 4;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new java.lang.IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.mShowAsAction = i;
        this.mMenu.onItemActionRequestChanged(this);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setActionView(android.view.View view) {
        int i;
        this.mActionView = view;
        this.mActionProvider = null;
        if (view != null && view.getId() == -1 && (i = this.mId) > 0) {
            view.setId(i);
        }
        this.mMenu.onItemActionRequestChanged(this);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setActionView(int i) {
        android.content.Context context = this.mMenu.getContext();
        setActionView(android.view.LayoutInflater.from(context).inflate(i, (android.view.ViewGroup) new android.widget.LinearLayout(context), false));
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.View getActionView() {
        android.view.View view = this.mActionView;
        if (view != null) {
            return view;
        }
        androidx.core.view.ActionProvider actionProvider = this.mActionProvider;
        if (actionProvider == null) {
            return null;
        }
        android.view.View viewOnCreateActionView = actionProvider.onCreateActionView(this);
        this.mActionView = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public androidx.core.view.ActionProvider getSupportActionProvider() {
        return this.mActionProvider;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public androidx.core.internal.view.SupportMenuItem setSupportActionProvider(androidx.core.view.ActionProvider actionProvider) {
        androidx.core.view.ActionProvider actionProvider2 = this.mActionProvider;
        if (actionProvider2 != null) {
            actionProvider2.reset();
        }
        this.mActionView = null;
        this.mActionProvider = actionProvider;
        this.mMenu.onItemsChanged(true);
        androidx.core.view.ActionProvider actionProvider3 = this.mActionProvider;
        if (actionProvider3 != null) {
            actionProvider3.setVisibilityListener(new androidx.core.view.ActionProvider.VisibilityListener() { // from class: androidx.appcompat.view.menu.MenuItemImpl.1
                @Override // androidx.core.view.ActionProvider.VisibilityListener
                public void onActionProviderVisibilityChanged(boolean z) {
                    androidx.appcompat.view.menu.MenuItemImpl.this.mMenu.onItemVisibleChanged(androidx.appcompat.view.menu.MenuItemImpl.this);
                }
            });
        }
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
        if (!hasCollapsibleActionView()) {
            return false;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.mOnActionExpandListener;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.mMenu.expandItemActionView(this);
        }
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.mShowAsAction & 8) == 0) {
            return false;
        }
        if (this.mActionView == null) {
            return true;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.mOnActionExpandListener;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.mMenu.collapseItemActionView(this);
        }
        return false;
    }

    public boolean hasCollapsibleActionView() {
        androidx.core.view.ActionProvider actionProvider;
        if ((this.mShowAsAction & 8) == 0) {
            return false;
        }
        if (this.mActionView == null && (actionProvider = this.mActionProvider) != null) {
            this.mActionView = actionProvider.onCreateActionView(this);
        }
        return this.mActionView != null;
    }

    public void setActionViewExpanded(boolean z) {
        this.mIsActionViewExpanded = z;
        this.mMenu.onItemsChanged(false);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.mIsActionViewExpanded;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.mOnActionExpandListener = onActionExpandListener;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setContentDescription(java.lang.CharSequence charSequence) {
        this.mContentDescription = charSequence;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
        return this.mContentDescription;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setTooltipText(java.lang.CharSequence charSequence) {
        this.mTooltipText = charSequence;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
        return this.mTooltipText;
    }
}
