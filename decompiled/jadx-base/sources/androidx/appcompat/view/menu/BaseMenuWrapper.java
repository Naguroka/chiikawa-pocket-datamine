package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
abstract class BaseMenuWrapper {
    final android.content.Context mContext;
    private androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> mMenuItems;
    private androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> mSubMenus;

    BaseMenuWrapper(android.content.Context context) {
        this.mContext = context;
    }

    final android.view.MenuItem getMenuItemWrapper(android.view.MenuItem menuItem) {
        if (!(menuItem instanceof androidx.core.internal.view.SupportMenuItem)) {
            return menuItem;
        }
        androidx.core.internal.view.SupportMenuItem supportMenuItem = (androidx.core.internal.view.SupportMenuItem) menuItem;
        if (this.mMenuItems == null) {
            this.mMenuItems = new androidx.collection.SimpleArrayMap<>();
        }
        android.view.MenuItem menuItem2 = this.mMenuItems.get(supportMenuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        androidx.appcompat.view.menu.MenuItemWrapperICS menuItemWrapperICS = new androidx.appcompat.view.menu.MenuItemWrapperICS(this.mContext, supportMenuItem);
        this.mMenuItems.put(supportMenuItem, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    final android.view.SubMenu getSubMenuWrapper(android.view.SubMenu subMenu) {
        if (!(subMenu instanceof androidx.core.internal.view.SupportSubMenu)) {
            return subMenu;
        }
        androidx.core.internal.view.SupportSubMenu supportSubMenu = (androidx.core.internal.view.SupportSubMenu) subMenu;
        if (this.mSubMenus == null) {
            this.mSubMenus = new androidx.collection.SimpleArrayMap<>();
        }
        android.view.SubMenu subMenu2 = this.mSubMenus.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        androidx.appcompat.view.menu.SubMenuWrapperICS subMenuWrapperICS = new androidx.appcompat.view.menu.SubMenuWrapperICS(this.mContext, supportSubMenu);
        this.mSubMenus.put(supportSubMenu, subMenuWrapperICS);
        return subMenuWrapperICS;
    }

    final void internalClear() {
        androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> simpleArrayMap = this.mMenuItems;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> simpleArrayMap2 = this.mSubMenus;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
    }

    final void internalRemoveGroup(int i) {
        if (this.mMenuItems == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.mMenuItems.size()) {
            if (this.mMenuItems.keyAt(i2).getGroupId() == i) {
                this.mMenuItems.removeAt(i2);
                i2--;
            }
            i2++;
        }
    }

    final void internalRemoveItem(int i) {
        if (this.mMenuItems == null) {
            return;
        }
        for (int i2 = 0; i2 < this.mMenuItems.size(); i2++) {
            if (this.mMenuItems.keyAt(i2).getItemId() == i) {
                this.mMenuItems.removeAt(i2);
                return;
            }
        }
    }
}
