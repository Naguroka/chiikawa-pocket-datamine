package androidx.appcompat.view.menu;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class MenuPopup implements androidx.appcompat.view.menu.ShowableListMenu, androidx.appcompat.view.menu.MenuPresenter, android.widget.AdapterView.OnItemClickListener {
    private android.graphics.Rect mEpicenterBounds;

    public abstract void addMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder);

    protected boolean closeMenuOnSubMenuOpened() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
    }

    public abstract void setAnchorView(android.view.View view);

    public abstract void setForceShowIcon(boolean z);

    public abstract void setGravity(int i);

    public abstract void setHorizontalOffset(int i);

    public abstract void setOnDismissListener(android.widget.PopupWindow.OnDismissListener onDismissListener);

    public abstract void setShowTitle(boolean z);

    public abstract void setVerticalOffset(int i);

    MenuPopup() {
    }

    public void setEpicenterBounds(android.graphics.Rect rect) {
        this.mEpicenterBounds = rect;
    }

    public android.graphics.Rect getEpicenterBounds() {
        return this.mEpicenterBounds;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup viewGroup) {
        throw new java.lang.UnsupportedOperationException("MenuPopups manage their own views");
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long j) {
        android.widget.ListAdapter listAdapter = (android.widget.ListAdapter) adapterView.getAdapter();
        toMenuAdapter(listAdapter).mAdapterMenu.performItemAction((android.view.MenuItem) listAdapter.getItem(i), this, closeMenuOnSubMenuOpened() ? 0 : 4);
    }

    protected static int measureIndividualMenuWidth(android.widget.ListAdapter listAdapter, android.view.ViewGroup viewGroup, android.content.Context context, int i) {
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        android.view.View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new android.widget.FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    protected static androidx.appcompat.view.menu.MenuAdapter toMenuAdapter(android.widget.ListAdapter listAdapter) {
        if (listAdapter instanceof android.widget.HeaderViewListAdapter) {
            return (androidx.appcompat.view.menu.MenuAdapter) ((android.widget.HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (androidx.appcompat.view.menu.MenuAdapter) listAdapter;
    }

    protected static boolean shouldPreserveIconSpacing(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = menuBuilder.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}
