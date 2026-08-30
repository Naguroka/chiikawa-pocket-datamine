package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class MenuAdapter extends android.widget.BaseAdapter {
    androidx.appcompat.view.menu.MenuBuilder mAdapterMenu;
    private int mExpandedIndex = -1;
    private boolean mForceShowIcon;
    private final android.view.LayoutInflater mInflater;
    private final int mItemLayoutRes;
    private final boolean mOverflowOnly;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public MenuAdapter(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.LayoutInflater layoutInflater, boolean z, int i) {
        this.mOverflowOnly = z;
        this.mInflater = layoutInflater;
        this.mAdapterMenu = menuBuilder;
        this.mItemLayoutRes = i;
        findExpandedIndex();
    }

    public boolean getForceShowIcon() {
        return this.mForceShowIcon;
    }

    public void setForceShowIcon(boolean z) {
        this.mForceShowIcon = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> nonActionItems = this.mOverflowOnly ? this.mAdapterMenu.getNonActionItems() : this.mAdapterMenu.getVisibleItems();
        if (this.mExpandedIndex < 0) {
            return nonActionItems.size();
        }
        return nonActionItems.size() - 1;
    }

    public androidx.appcompat.view.menu.MenuBuilder getAdapterMenu() {
        return this.mAdapterMenu;
    }

    @Override // android.widget.Adapter
    public androidx.appcompat.view.menu.MenuItemImpl getItem(int i) {
        java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> nonActionItems = this.mOverflowOnly ? this.mAdapterMenu.getNonActionItems() : this.mAdapterMenu.getVisibleItems();
        int i2 = this.mExpandedIndex;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return nonActionItems.get(i);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = this.mInflater.inflate(this.mItemLayoutRes, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        androidx.appcompat.view.menu.ListMenuItemView listMenuItemView = (androidx.appcompat.view.menu.ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.mAdapterMenu.isGroupDividerEnabled() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        androidx.appcompat.view.menu.MenuView.ItemView itemView = (androidx.appcompat.view.menu.MenuView.ItemView) view;
        if (this.mForceShowIcon) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.initialize(getItem(i), 0);
        return view;
    }

    void findExpandedIndex() {
        androidx.appcompat.view.menu.MenuItemImpl expandedItem = this.mAdapterMenu.getExpandedItem();
        if (expandedItem != null) {
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> nonActionItems = this.mAdapterMenu.getNonActionItems();
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
