package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
class SubMenuWrapperICS extends androidx.appcompat.view.menu.MenuWrapperICS implements android.view.SubMenu {
    private final androidx.core.internal.view.SupportSubMenu mSubMenu;

    SubMenuWrapperICS(android.content.Context context, androidx.core.internal.view.SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
        this.mSubMenu = supportSubMenu;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(int i) {
        this.mSubMenu.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(java.lang.CharSequence charSequence) {
        this.mSubMenu.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(int i) {
        this.mSubMenu.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable drawable) {
        this.mSubMenu.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderView(android.view.View view) {
        this.mSubMenu.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.mSubMenu.clearHeader();
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(int i) {
        this.mSubMenu.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(android.graphics.drawable.Drawable drawable) {
        this.mSubMenu.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.MenuItem getItem() {
        return getMenuItemWrapper(this.mSubMenu.getItem());
    }
}
