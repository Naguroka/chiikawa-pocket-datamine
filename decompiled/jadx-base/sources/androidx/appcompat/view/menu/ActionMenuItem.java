package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItem implements androidx.core.internal.view.SupportMenuItem {
    private static final int CHECKABLE = 1;
    private static final int CHECKED = 2;
    private static final int ENABLED = 16;
    private static final int EXCLUSIVE = 4;
    private static final int HIDDEN = 8;
    private android.view.MenuItem.OnMenuItemClickListener mClickListener;
    private java.lang.CharSequence mContentDescription;
    private android.content.Context mContext;
    private final int mGroup;
    private android.graphics.drawable.Drawable mIconDrawable;
    private final int mId;
    private android.content.Intent mIntent;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private java.lang.CharSequence mTitle;
    private java.lang.CharSequence mTitleCondensed;
    private java.lang.CharSequence mTooltipText;
    private int mShortcutNumericModifiers = 4096;
    private int mShortcutAlphabeticModifiers = 4096;
    private android.content.res.ColorStateList mIconTintList = null;
    private android.graphics.PorterDuff.Mode mIconTintMode = null;
    private boolean mHasIconTint = false;
    private boolean mHasIconTintMode = false;
    private int mFlags = 16;

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public androidx.core.view.ActionProvider getSupportActionProvider() {
        return null;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresActionButton() {
        return true;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresOverflow() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    public ActionMenuItem(android.content.Context context, int i, int i2, int i3, int i4, java.lang.CharSequence charSequence) {
        this.mContext = context;
        this.mId = i2;
        this.mGroup = i;
        this.mOrdering = i4;
        this.mTitle = charSequence;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.mShortcutAlphabeticChar;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.mShortcutAlphabeticModifiers;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.mGroup;
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
        return this.mIconDrawable;
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
        return this.mIntent;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.mId;
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
    public int getOrder() {
        return this.mOrdering;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
        return this.mTitle;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.mTitleCondensed;
        return charSequence != null ? charSequence : this.mTitle;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.mFlags & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.mFlags & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.mFlags & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.mFlags & 8) == 0;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c) {
        this.mShortcutAlphabeticChar = java.lang.Character.toLowerCase(c);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c, int i) {
        this.mShortcutAlphabeticChar = java.lang.Character.toLowerCase(c);
        this.mShortcutAlphabeticModifiers = android.view.KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean z) {
        this.mFlags = (z ? 1 : 0) | (this.mFlags & (-2));
        return this;
    }

    public androidx.appcompat.view.menu.ActionMenuItem setExclusiveCheckable(boolean z) {
        this.mFlags = (z ? 4 : 0) | (this.mFlags & (-5));
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean z) {
        this.mFlags = (z ? 2 : 0) | (this.mFlags & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean z) {
        this.mFlags = (z ? 16 : 0) | (this.mFlags & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.mIconDrawable = drawable;
        applyIconTint();
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int i) {
        this.mIconDrawable = androidx.core.content.ContextCompat.getDrawable(this.mContext, i);
        applyIconTint();
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent intent) {
        this.mIntent = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c) {
        this.mShortcutNumericChar = c;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c, int i) {
        this.mShortcutNumericChar = c;
        this.mShortcutNumericModifiers = android.view.KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mClickListener = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c, char c2) {
        this.mShortcutNumericChar = c;
        this.mShortcutAlphabeticChar = java.lang.Character.toLowerCase(c2);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.mShortcutNumericChar = c;
        this.mShortcutNumericModifiers = android.view.KeyEvent.normalizeMetaState(i);
        this.mShortcutAlphabeticChar = java.lang.Character.toLowerCase(c2);
        this.mShortcutAlphabeticModifiers = android.view.KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.mTitle = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int i) {
        this.mTitle = this.mContext.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.mTitleCondensed = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean z) {
        this.mFlags = (this.mFlags & 8) | (z ? 0 : 8);
        return this;
    }

    public boolean invoke() {
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.mClickListener;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        android.content.Intent intent = this.mIntent;
        if (intent == null) {
            return false;
        }
        this.mContext.startActivity(intent);
        return true;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setActionView(android.view.View view) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setActionView(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public androidx.core.internal.view.SupportMenuItem setSupportActionProvider(androidx.core.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setContentDescription(java.lang.CharSequence charSequence) {
        this.mContentDescription = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
        return this.mContentDescription;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setTooltipText(java.lang.CharSequence charSequence) {
        this.mTooltipText = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
        return this.mTooltipText;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.mIconTintList = colorStateList;
        this.mHasIconTint = true;
        applyIconTint();
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
        applyIconTint();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.mIconTintMode;
    }

    private void applyIconTint() {
        android.graphics.drawable.Drawable drawable = this.mIconDrawable;
        if (drawable != null) {
            if (this.mHasIconTint || this.mHasIconTintMode) {
                android.graphics.drawable.Drawable drawableWrap = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable);
                this.mIconDrawable = drawableWrap;
                android.graphics.drawable.Drawable drawableMutate = drawableWrap.mutate();
                this.mIconDrawable = drawableMutate;
                if (this.mHasIconTint) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(drawableMutate, this.mIconTintList);
                }
                if (this.mHasIconTintMode) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintMode(this.mIconDrawable, this.mIconTintMode);
                }
            }
        }
    }
}
