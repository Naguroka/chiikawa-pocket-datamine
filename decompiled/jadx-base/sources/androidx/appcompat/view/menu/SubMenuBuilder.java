package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class SubMenuBuilder extends androidx.appcompat.view.menu.MenuBuilder implements android.view.SubMenu {
    private androidx.appcompat.view.menu.MenuItemImpl mItem;
    private androidx.appcompat.view.menu.MenuBuilder mParentMenu;

    public SubMenuBuilder(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        super(context);
        this.mParentMenu = menuBuilder;
        this.mItem = menuItemImpl;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mParentMenu.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public void setShortcutsVisible(boolean z) {
        this.mParentMenu.setShortcutsVisible(z);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    public android.view.Menu getParentMenu() {
        return this.mParentMenu;
    }

    @Override // android.view.SubMenu
    public android.view.MenuItem getItem() {
        return this.mItem;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public void setCallback(androidx.appcompat.view.menu.MenuBuilder.Callback callback) {
        this.mParentMenu.setCallback(callback);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public androidx.appcompat.view.menu.MenuBuilder getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    boolean dispatchMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
        return super.dispatchMenuItemSelected(menuBuilder, menuItem) || this.mParentMenu.dispatchMenuItemSelected(menuBuilder, menuItem);
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(android.graphics.drawable.Drawable drawable) {
        this.mItem.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(int i) {
        this.mItem.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable drawable) {
        return (android.view.SubMenu) super.setHeaderIconInt(drawable);
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(int i) {
        return (android.view.SubMenu) super.setHeaderIconInt(i);
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(java.lang.CharSequence charSequence) {
        return (android.view.SubMenu) super.setHeaderTitleInt(charSequence);
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(int i) {
        return (android.view.SubMenu) super.setHeaderTitleInt(i);
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderView(android.view.View view) {
        return (android.view.SubMenu) super.setHeaderViewInt(view);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean expandItemActionView(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return this.mParentMenu.expandItemActionView(menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return this.mParentMenu.collapseItemActionView(menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public java.lang.String getActionViewStatesKey() {
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.mItem;
        int itemId = menuItemImpl != null ? menuItemImpl.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + ":" + itemId;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, androidx.core.internal.view.SupportMenu, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mParentMenu.setGroupDividerEnabled(z);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }
}
