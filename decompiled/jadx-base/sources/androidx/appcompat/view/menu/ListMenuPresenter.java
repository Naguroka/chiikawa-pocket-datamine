package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuPresenter implements androidx.appcompat.view.menu.MenuPresenter, android.widget.AdapterView.OnItemClickListener {
    private static final java.lang.String TAG = "ListMenuPresenter";
    public static final java.lang.String VIEWS_TAG = "android:menu:list";
    androidx.appcompat.view.menu.ListMenuPresenter.MenuAdapter mAdapter;
    private androidx.appcompat.view.menu.MenuPresenter.Callback mCallback;
    android.content.Context mContext;
    private int mId;
    android.view.LayoutInflater mInflater;
    int mItemIndexOffset;
    int mItemLayoutRes;
    androidx.appcompat.view.menu.MenuBuilder mMenu;
    androidx.appcompat.view.menu.ExpandedMenuView mMenuView;
    int mThemeRes;

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    public ListMenuPresenter(android.content.Context context, int i) {
        this(i, 0);
        this.mContext = context;
        this.mInflater = android.view.LayoutInflater.from(context);
    }

    public ListMenuPresenter(int i, int i2) {
        this.mItemLayoutRes = i;
        this.mThemeRes = i2;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        if (this.mThemeRes != 0) {
            android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(context, this.mThemeRes);
            this.mContext = contextThemeWrapper;
            this.mInflater = android.view.LayoutInflater.from(contextThemeWrapper);
        } else if (this.mContext != null) {
            this.mContext = context;
            if (this.mInflater == null) {
                this.mInflater = android.view.LayoutInflater.from(context);
            }
        }
        this.mMenu = menuBuilder;
        androidx.appcompat.view.menu.ListMenuPresenter.MenuAdapter menuAdapter = this.mAdapter;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup viewGroup) {
        if (this.mMenuView == null) {
            this.mMenuView = (androidx.appcompat.view.menu.ExpandedMenuView) this.mInflater.inflate(androidx.appcompat.R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.mAdapter == null) {
                this.mAdapter = new androidx.appcompat.view.menu.ListMenuPresenter.MenuAdapter();
            }
            this.mMenuView.setAdapter((android.widget.ListAdapter) this.mAdapter);
            this.mMenuView.setOnItemClickListener(this);
        }
        return this.mMenuView;
    }

    public android.widget.ListAdapter getAdapter() {
        if (this.mAdapter == null) {
            this.mAdapter = new androidx.appcompat.view.menu.ListMenuPresenter.MenuAdapter();
        }
        return this.mAdapter;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        androidx.appcompat.view.menu.ListMenuPresenter.MenuAdapter menuAdapter = this.mAdapter;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
        this.mCallback = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        new androidx.appcompat.view.menu.MenuDialogHelper(subMenuBuilder).show(null);
        androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.mCallback;
        if (callback == null) {
            return true;
        }
        callback.onOpenSubMenu(subMenuBuilder);
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.mCallback;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    int getItemIndexOffset() {
        return this.mItemIndexOffset;
    }

    public void setItemIndexOffset(int i) {
        this.mItemIndexOffset = i;
        if (this.mMenuView != null) {
            updateMenuView(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long j) {
        this.mMenu.performItemAction(this.mAdapter.getItem(i), this, 0);
    }

    public void saveHierarchyState(android.os.Bundle bundle) {
        android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        androidx.appcompat.view.menu.ExpandedMenuView expandedMenuView = this.mMenuView;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(VIEWS_TAG, sparseArray);
    }

    public void restoreHierarchyState(android.os.Bundle bundle) {
        android.util.SparseArray<android.os.Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(VIEWS_TAG);
        if (sparseParcelableArray != null) {
            this.mMenuView.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void setId(int i) {
        this.mId = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.mId;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public android.os.Parcelable onSaveInstanceState() {
        if (this.mMenuView == null) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        saveHierarchyState(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        restoreHierarchyState((android.os.Bundle) parcelable);
    }

    private class MenuAdapter extends android.widget.BaseAdapter {
        private int mExpandedIndex = -1;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public MenuAdapter() {
            findExpandedIndex();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = androidx.appcompat.view.menu.ListMenuPresenter.this.mMenu.getNonActionItems().size() - androidx.appcompat.view.menu.ListMenuPresenter.this.mItemIndexOffset;
            return this.mExpandedIndex < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public androidx.appcompat.view.menu.MenuItemImpl getItem(int i) {
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> nonActionItems = androidx.appcompat.view.menu.ListMenuPresenter.this.mMenu.getNonActionItems();
            int i2 = i + androidx.appcompat.view.menu.ListMenuPresenter.this.mItemIndexOffset;
            int i3 = this.mExpandedIndex;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return nonActionItems.get(i2);
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
            if (view == null) {
                view = androidx.appcompat.view.menu.ListMenuPresenter.this.mInflater.inflate(androidx.appcompat.view.menu.ListMenuPresenter.this.mItemLayoutRes, viewGroup, false);
            }
            ((androidx.appcompat.view.menu.MenuView.ItemView) view).initialize(getItem(i), 0);
            return view;
        }

        void findExpandedIndex() {
            androidx.appcompat.view.menu.MenuItemImpl expandedItem = androidx.appcompat.view.menu.ListMenuPresenter.this.mMenu.getExpandedItem();
            if (expandedItem != null) {
                java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> nonActionItems = androidx.appcompat.view.menu.ListMenuPresenter.this.mMenu.getNonActionItems();
                int size = nonActionItems.size();
                for (int i = 0; i < size; i++) {
                    if (nonActionItems.get(i) == expandedItem) {
                        this.mExpandedIndex = i;
                        return;
                    }
                }
            }
            this.mExpandedIndex = -1;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            findExpandedIndex();
            super.notifyDataSetChanged();
        }
    }
}
