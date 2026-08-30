package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public class NavigationSubMenu extends androidx.appcompat.view.menu.SubMenuBuilder {
    public NavigationSubMenu(android.content.Context context, com.google.android.material.internal.NavigationMenu navigationMenu, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        super(context, navigationMenu, menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        ((androidx.appcompat.view.menu.MenuBuilder) getParentMenu()).onItemsChanged(z);
    }
}
