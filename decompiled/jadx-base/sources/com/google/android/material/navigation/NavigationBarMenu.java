package com.google.android.material.navigation;

/* JADX INFO: loaded from: classes5.dex */
public final class NavigationBarMenu extends androidx.appcompat.view.menu.MenuBuilder {
    private final int maxItemCount;
    private final java.lang.Class<?> viewClass;

    public NavigationBarMenu(android.content.Context context, java.lang.Class<?> cls, int i) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i;
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        throw new java.lang.UnsupportedOperationException(this.viewClass.getSimpleName() + " does not support submenus");
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    protected android.view.MenuItem addInternal(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        if (size() + 1 > this.maxItemCount) {
            java.lang.String simpleName = this.viewClass.getSimpleName();
            throw new java.lang.IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.maxItemCount + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
        }
        stopDispatchingItemsChanged();
        android.view.MenuItem menuItemAddInternal = super.addInternal(i, i2, i3, charSequence);
        if (menuItemAddInternal instanceof androidx.appcompat.view.menu.MenuItemImpl) {
            ((androidx.appcompat.view.menu.MenuItemImpl) menuItemAddInternal).setExclusiveCheckable(true);
        }
        startDispatchingItemsChanged();
        return menuItemAddInternal;
    }
}
