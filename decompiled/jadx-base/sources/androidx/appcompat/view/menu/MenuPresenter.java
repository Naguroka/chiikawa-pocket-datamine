package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public interface MenuPresenter {

    public interface Callback {
        void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z);

        boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder);
    }

    boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl);

    boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl);

    boolean flagActionItems();

    int getId();

    androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup viewGroup);

    void initForMenu(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder);

    void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z);

    void onRestoreInstanceState(android.os.Parcelable parcelable);

    android.os.Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder);

    void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback callback);

    void updateMenuView(boolean z);
}
