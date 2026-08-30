package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class MenuWrapperICS extends androidx.appcompat.view.menu.BaseMenuWrapper implements android.view.Menu {
    private final androidx.core.internal.view.SupportMenu mWrappedObject;

    public MenuWrapperICS(android.content.Context context, androidx.core.internal.view.SupportMenu supportMenu) {
        super(context);
        if (supportMenu == null) {
            throw new java.lang.IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.mWrappedObject = supportMenu;
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return getMenuItemWrapper(this.mWrappedObject.add(charSequence));
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i) {
        return getMenuItemWrapper(this.mWrappedObject.add(i));
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        return getMenuItemWrapper(this.mWrappedObject.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i, int i2, int i3, int i4) {
        return getMenuItemWrapper(this.mWrappedObject.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return getSubMenuWrapper(this.mWrappedObject.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i) {
        return getSubMenuWrapper(this.mWrappedObject.addSubMenu(i));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        return getSubMenuWrapper(this.mWrappedObject.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return getSubMenuWrapper(this.mWrappedObject.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i4, android.view.MenuItem[] menuItemArr) {
        android.view.MenuItem[] menuItemArr2 = menuItemArr != null ? new android.view.MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.mWrappedObject.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = getMenuItemWrapper(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        internalRemoveItem(i);
        this.mWrappedObject.removeItem(i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        internalRemoveGroup(i);
        this.mWrappedObject.removeGroup(i);
    }

    @Override // android.view.Menu
    public void clear() {
        internalClear();
        this.mWrappedObject.clear();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.mWrappedObject.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.mWrappedObject.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.mWrappedObject.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.mWrappedObject.hasVisibleItems();
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int i) {
        return getMenuItemWrapper(this.mWrappedObject.findItem(i));
    }

    @Override // android.view.Menu
    public int size() {
        return this.mWrappedObject.size();
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int i) {
        return getMenuItemWrapper(this.mWrappedObject.getItem(i));
    }

    @Override // android.view.Menu
    public void close() {
        this.mWrappedObject.close();
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, android.view.KeyEvent keyEvent, int i2) {
        return this.mWrappedObject.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, android.view.KeyEvent keyEvent) {
        return this.mWrappedObject.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.mWrappedObject.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mWrappedObject.setQwertyMode(z);
    }
}
