package com.google.android.material.navigation;

/* JADX INFO: loaded from: classes5.dex */
public class NavigationBarPresenter implements androidx.appcompat.view.menu.MenuPresenter {
    private int id;
    private androidx.appcompat.view.menu.MenuBuilder menu;
    private com.google.android.material.navigation.NavigationBarMenuView menuView;
    private boolean updateSuspended = false;

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

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
    }

    public void setMenuView(com.google.android.material.navigation.NavigationBarMenuView navigationBarMenuView) {
        this.menuView = navigationBarMenuView;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        this.menu = menuBuilder;
        this.menuView.initialize(menuBuilder);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup viewGroup) {
        return this.menuView;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        if (this.updateSuspended) {
            return;
        }
        if (z) {
            this.menuView.buildMenuView();
        } else {
            this.menuView.updateMenuView();
        }
    }

    public void setId(int i) {
        this.id = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.id;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.navigation.NavigationBarPresenter.SavedState savedState = new com.google.android.material.navigation.NavigationBarPresenter.SavedState();
        savedState.selectedItemId = this.menuView.getSelectedItemId();
        savedState.badgeSavedStates = com.google.android.material.badge.BadgeUtils.createParcelableBadgeStates(this.menuView.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof com.google.android.material.navigation.NavigationBarPresenter.SavedState) {
            com.google.android.material.navigation.NavigationBarPresenter.SavedState savedState = (com.google.android.material.navigation.NavigationBarPresenter.SavedState) parcelable;
            this.menuView.tryRestoreSelectedItemId(savedState.selectedItemId);
            this.menuView.restoreBadgeDrawables(com.google.android.material.badge.BadgeUtils.createBadgeDrawablesFromSavedStates(this.menuView.getContext(), savedState.badgeSavedStates));
        }
    }

    public void setUpdateSuspended(boolean z) {
        this.updateSuspended = z;
    }

    static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.google.android.material.navigation.NavigationBarPresenter.SavedState> CREATOR = new android.os.Parcelable.Creator<com.google.android.material.navigation.NavigationBarPresenter.SavedState>() { // from class: com.google.android.material.navigation.NavigationBarPresenter.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.material.navigation.NavigationBarPresenter.SavedState createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.navigation.NavigationBarPresenter.SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.material.navigation.NavigationBarPresenter.SavedState[] newArray(int i) {
                return new com.google.android.material.navigation.NavigationBarPresenter.SavedState[i];
            }
        };
        com.google.android.material.internal.ParcelableSparseArray badgeSavedStates;
        int selectedItemId;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(android.os.Parcel parcel) {
            this.selectedItemId = parcel.readInt();
            this.badgeSavedStates = (com.google.android.material.internal.ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.selectedItemId);
            parcel.writeParcelable(this.badgeSavedStates, 0);
        }
    }
}
