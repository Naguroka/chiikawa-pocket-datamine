package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public class NavigationMenu extends androidx.appcompat.view.menu.MenuBuilder {
    public NavigationMenu(android.content.Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = (androidx.appcompat.view.menu.MenuItemImpl) addInternal(i, i2, i3, charSequence);
        com.google.android.material.internal.NavigationSubMenu navigationSubMenu = new com.google.android.material.internal.NavigationSubMenu(getContext(), this, menuItemImpl);
        menuItemImpl.setSubMenu(navigationSubMenu);
        return navigationSubMenu;
    }
}
