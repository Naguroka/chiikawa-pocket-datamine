package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public interface MenuView {

    public interface ItemView {
        androidx.appcompat.view.menu.MenuItemImpl getItemData();

        void initialize(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl, int i);

        boolean prefersCondensedTitle();

        void setCheckable(boolean z);

        void setChecked(boolean z);

        void setEnabled(boolean z);

        void setIcon(android.graphics.drawable.Drawable drawable);

        void setShortcut(boolean z, char c);

        void setTitle(java.lang.CharSequence charSequence);

        boolean showsIcon();
    }

    int getWindowAnimations();

    void initialize(androidx.appcompat.view.menu.MenuBuilder menuBuilder);
}
