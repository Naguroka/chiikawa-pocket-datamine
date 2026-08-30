package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class MenuBuilder implements androidx.core.internal.view.SupportMenu {
    private static final java.lang.String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final java.lang.String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final java.lang.String PRESENTER_KEY = "android:menu:presenters";
    private static final java.lang.String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private androidx.appcompat.view.menu.MenuBuilder.Callback mCallback;
    private final android.content.Context mContext;
    private android.view.ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private androidx.appcompat.view.menu.MenuItemImpl mExpandedItem;
    android.graphics.drawable.Drawable mHeaderIcon;
    java.lang.CharSequence mHeaderTitle;
    android.view.View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final android.content.res.Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> mTempShortcutItemList = new java.util.ArrayList<>();
    private java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> mPresenters = new java.util.concurrent.CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> mItems = new java.util.ArrayList<>();
    private java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> mVisibleItems = new java.util.ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> mActionItems = new java.util.ArrayList<>();
    private java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> mNonActionItems = new java.util.ArrayList<>();
    private boolean mIsActionItemsStale = true;

    public interface Callback {
        boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem);

        void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder menuBuilder);
    }

    public interface ItemInvoker {
        boolean invokeItem(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl);
    }

    protected java.lang.String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public androidx.appcompat.view.menu.MenuBuilder getRootMenu() {
        return this;
    }

    public MenuBuilder(android.content.Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        setShortcutsVisibleInner(true);
    }

    public androidx.appcompat.view.menu.MenuBuilder setDefaultShowAsAction(int i) {
        this.mDefaultShowAsAction = i;
        return this;
    }

    public void addMenuPresenter(androidx.appcompat.view.menu.MenuPresenter menuPresenter) {
        addMenuPresenter(menuPresenter, this.mContext);
    }

    public void addMenuPresenter(androidx.appcompat.view.menu.MenuPresenter menuPresenter, android.content.Context context) {
        this.mPresenters.add(new java.lang.ref.WeakReference<>(menuPresenter));
        menuPresenter.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    public void removeMenuPresenter(androidx.appcompat.view.menu.MenuPresenter menuPresenter) {
        for (java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter> weakReference : this.mPresenters) {
            androidx.appcompat.view.menu.MenuPresenter menuPresenter2 = weakReference.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                this.mPresenters.remove(weakReference);
            }
        }
    }

    private void dispatchPresenterUpdate(boolean z) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        for (java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter> weakReference : this.mPresenters) {
            androidx.appcompat.view.menu.MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(weakReference);
            } else {
                menuPresenter.updateMenuView(z);
            }
        }
        startDispatchingItemsChanged();
    }

    private boolean dispatchSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder, androidx.appcompat.view.menu.MenuPresenter menuPresenter) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean zOnSubMenuSelected = menuPresenter != null ? menuPresenter.onSubMenuSelected(subMenuBuilder) : false;
        for (java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter> weakReference : this.mPresenters) {
            androidx.appcompat.view.menu.MenuPresenter menuPresenter2 = weakReference.get();
            if (menuPresenter2 == null) {
                this.mPresenters.remove(weakReference);
            } else if (!zOnSubMenuSelected) {
                zOnSubMenuSelected = menuPresenter2.onSubMenuSelected(subMenuBuilder);
            }
        }
        return zOnSubMenuSelected;
    }

    private void dispatchSaveInstanceState(android.os.Bundle bundle) {
        android.os.Parcelable parcelableOnSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        android.util.SparseArray<? extends android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        for (java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter> weakReference : this.mPresenters) {
            androidx.appcompat.view.menu.MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id = menuPresenter.getId();
                if (id > 0 && (parcelableOnSaveInstanceState = menuPresenter.onSaveInstanceState()) != null) {
                    sparseArray.put(id, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    private void dispatchRestoreInstanceState(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        android.util.SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray == null || this.mPresenters.isEmpty()) {
            return;
        }
        for (java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter> weakReference : this.mPresenters) {
            androidx.appcompat.view.menu.MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id = menuPresenter.getId();
                if (id > 0 && (parcelable = (android.os.Parcelable) sparseParcelableArray.get(id)) != null) {
                    menuPresenter.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    public void savePresenterStates(android.os.Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void restorePresenterStates(android.os.Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveActionViewStates(android.os.Bundle bundle) {
        int size = size();
        android.util.SparseArray<? extends android.os.Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = getItem(i);
            android.view.View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new android.util.SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((androidx.appcompat.view.menu.SubMenuBuilder) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void restoreActionViewStates(android.os.Bundle bundle) {
        android.view.MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        android.util.SparseArray<android.os.Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = getItem(i);
            android.view.View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((androidx.appcompat.view.menu.SubMenuBuilder) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i2 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void setCallback(androidx.appcompat.view.menu.MenuBuilder.Callback callback) {
        this.mCallback = callback;
    }

    protected android.view.MenuItem addInternal(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        int ordering = getOrdering(i3);
        androidx.appcompat.view.menu.MenuItemImpl menuItemImplCreateNewMenuItem = createNewMenuItem(i, i2, i3, ordering, charSequence, this.mDefaultShowAsAction);
        android.view.ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            menuItemImplCreateNewMenuItem.setMenuInfo(contextMenuInfo);
        }
        java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> arrayList = this.mItems;
        arrayList.add(findInsertIndex(arrayList, ordering), menuItemImplCreateNewMenuItem);
        onItemsChanged(true);
        return menuItemImplCreateNewMenuItem;
    }

    private androidx.appcompat.view.menu.MenuItemImpl createNewMenuItem(int i, int i2, int i3, int i4, java.lang.CharSequence charSequence, int i5) {
        return new androidx.appcompat.view.menu.MenuItemImpl(this, i, i2, i3, i4, charSequence, i5);
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i) {
        return addInternal(0, 0, 0, this.mResources.getString(i));
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        return addInternal(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i, int i2, int i3, int i4) {
        return addInternal(i, i2, i3, this.mResources.getString(i4));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = (androidx.appcompat.view.menu.MenuItemImpl) addInternal(i, i2, i3, charSequence);
        androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder = new androidx.appcompat.view.menu.SubMenuBuilder(this.mContext, this, menuItemImpl);
        menuItemImpl.setSubMenu(subMenuBuilder);
        return subMenuBuilder;
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.mResources.getString(i4));
    }

    @Override // androidx.core.internal.view.SupportMenu, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mGroupDividerEnabled = z;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i4, android.view.MenuItem[] menuItemArr) {
        android.content.pm.PackageManager packageManager = this.mContext.getPackageManager();
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            android.content.pm.ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i5);
            android.content.Intent intent2 = new android.content.Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new android.content.ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            android.view.MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        removeItemAtInt(findItemIndex(i), true);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int iFindGroupIndex = findGroupIndex(i);
        if (iFindGroupIndex >= 0) {
            int size = this.mItems.size() - iFindGroupIndex;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.mItems.get(iFindGroupIndex).getGroupId() != i) {
                    break;
                }
                removeItemAtInt(iFindGroupIndex, false);
                i2 = i3;
            }
            onItemsChanged(true);
        }
    }

    private void removeItemAtInt(int i, boolean z) {
        if (i < 0 || i >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i);
        if (z) {
            onItemsChanged(true);
        }
    }

    public void removeItemAt(int i) {
        removeItemAtInt(i, true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    @Override // android.view.Menu
    public void clear() {
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.mExpandedItem;
        if (menuItemImpl != null) {
            collapseItemActionView(menuItemImpl);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    void setExclusiveItemChecked(android.view.MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i = 0; i < size; i++) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.mItems.get(i);
            if (menuItemImpl.getGroupId() == groupId && menuItemImpl.isExclusiveCheckable() && menuItemImpl.isCheckable()) {
                menuItemImpl.setCheckedInt(menuItemImpl == menuItem);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.mItems.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.setExclusiveCheckable(z2);
                menuItemImpl.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.mItems.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.mItems.get(i2);
            if (menuItemImpl.getGroupId() == i && menuItemImpl.setVisibleInt(z)) {
                z2 = true;
            }
        }
        if (z2) {
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.mItems.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.mItems.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int i) {
        android.view.MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.mItems.get(i2);
            if (menuItemImpl.getItemId() == i) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (menuItemFindItem = menuItemImpl.getSubMenu().findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.mItems.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public int findGroupIndex(int i) {
        return findGroupIndex(i, 0);
    }

    public int findGroupIndex(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.mItems.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int i) {
        return this.mItems.get(i);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, android.view.KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mQwertyMode = z;
        onItemsChanged(false);
    }

    private static int getOrdering(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new java.lang.IllegalArgumentException("order does not contain a valid category.");
    }

    boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    public void setShortcutsVisible(boolean z) {
        if (this.mShortcutsVisible == z) {
            return;
        }
        setShortcutsVisibleInner(z);
        onItemsChanged(false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    private void setShortcutsVisibleInner(boolean z) {
        boolean z2;
        if (z) {
            z2 = this.mResources.getConfiguration().keyboard != 1 && androidx.core.view.ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(android.view.ViewConfiguration.get(this.mContext), this.mContext);
        }
        this.mShortcutsVisible = z2;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    android.content.res.Resources getResources() {
        return this.mResources;
    }

    public android.content.Context getContext() {
        return this.mContext;
    }

    boolean dispatchMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
        androidx.appcompat.view.menu.MenuBuilder.Callback callback = this.mCallback;
        return callback != null && callback.onMenuItemSelected(menuBuilder, menuItem);
    }

    public void changeMenuMode() {
        androidx.appcompat.view.menu.MenuBuilder.Callback callback = this.mCallback;
        if (callback != null) {
            callback.onMenuModeChange(this);
        }
    }

    private static int findInsertIndex(java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).getOrdering() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, android.view.KeyEvent keyEvent, int i2) {
        androidx.appcompat.view.menu.MenuItemImpl menuItemImplFindItemWithShortcutForKey = findItemWithShortcutForKey(i, keyEvent);
        boolean zPerformItemAction = menuItemImplFindItemWithShortcutForKey != null ? performItemAction(menuItemImplFindItemWithShortcutForKey, i2) : false;
        if ((i2 & 2) != 0) {
            close(true);
        }
        return zPerformItemAction;
    }

    void findItemsWithShortcutForKey(java.util.List<androidx.appcompat.view.menu.MenuItemImpl> list, int i, android.view.KeyEvent keyEvent) {
        boolean zIsQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.mItems.size();
            for (int i2 = 0; i2 < size; i2++) {
                androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.mItems.get(i2);
                if (menuItemImpl.hasSubMenu()) {
                    ((androidx.appcompat.view.menu.MenuBuilder) menuItemImpl.getSubMenu()).findItemsWithShortcutForKey(list, i, keyEvent);
                }
                char alphabeticShortcut = zIsQwertyMode ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
                if (((modifiers & androidx.core.internal.view.SupportMenu.SUPPORTED_MODIFIERS_MASK) == ((zIsQwertyMode ? menuItemImpl.getAlphabeticModifiers() : menuItemImpl.getNumericModifiers()) & androidx.core.internal.view.SupportMenu.SUPPORTED_MODIFIERS_MASK)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (zIsQwertyMode && alphabeticShortcut == '\b' && i == 67)) && menuItemImpl.isEnabled())) {
                    list.add(menuItemImpl);
                }
            }
        }
    }

    androidx.appcompat.view.menu.MenuItemImpl findItemWithShortcutForKey(int i, android.view.KeyEvent keyEvent) {
        char numericShortcut;
        java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zIsQwertyMode = isQwertyMode();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = arrayList.get(i2);
            if (zIsQwertyMode) {
                numericShortcut = menuItemImpl.getAlphabeticShortcut();
            } else {
                numericShortcut = menuItemImpl.getNumericShortcut();
            }
            if ((numericShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((numericShortcut == keyData.meta[2] && (metaState & 2) != 0) || (zIsQwertyMode && numericShortcut == '\b' && i == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return performItemAction(findItem(i), i2);
    }

    public boolean performItemAction(android.view.MenuItem menuItem, int i) {
        return performItemAction(menuItem, null, i);
    }

    public boolean performItemAction(android.view.MenuItem menuItem, androidx.appcompat.view.menu.MenuPresenter menuPresenter, int i) {
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = (androidx.appcompat.view.menu.MenuItemImpl) menuItem;
        if (menuItemImpl == null || !menuItemImpl.isEnabled()) {
            return false;
        }
        boolean zInvoke = menuItemImpl.invoke();
        androidx.core.view.ActionProvider supportActionProvider = menuItemImpl.getSupportActionProvider();
        boolean z = supportActionProvider != null && supportActionProvider.hasSubMenu();
        if (menuItemImpl.hasCollapsibleActionView()) {
            zInvoke |= menuItemImpl.expandActionView();
            if (zInvoke) {
                close(true);
            }
        } else if (menuItemImpl.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                close(false);
            }
            if (!menuItemImpl.hasSubMenu()) {
                menuItemImpl.setSubMenu(new androidx.appcompat.view.menu.SubMenuBuilder(getContext(), this, menuItemImpl));
            }
            androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder = (androidx.appcompat.view.menu.SubMenuBuilder) menuItemImpl.getSubMenu();
            if (z) {
                supportActionProvider.onPrepareSubMenu(subMenuBuilder);
            }
            zInvoke |= dispatchSubMenuSelected(subMenuBuilder, menuPresenter);
            if (!zInvoke) {
                close(true);
            }
        } else if ((i & 1) == 0) {
            close(true);
        }
        return zInvoke;
    }

    public final void close(boolean z) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        for (java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter> weakReference : this.mPresenters) {
            androidx.appcompat.view.menu.MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(weakReference);
            } else {
                menuPresenter.onCloseMenu(this, z);
            }
        }
        this.mIsClosing = false;
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }

    public void onItemsChanged(boolean z) {
        if (!this.mPreventDispatchingItemsChanged) {
            if (z) {
                this.mIsVisibleItemsStale = true;
                this.mIsActionItemsStale = true;
            }
            dispatchPresenterUpdate(z);
            return;
        }
        this.mItemsChangedWhileDispatchPrevented = true;
        if (z) {
            this.mStructureChangedWhileDispatchPrevented = true;
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    void onItemVisibleChanged(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    void onItemActionRequestChanged(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i = 0; i < size; i++) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.mItems.get(i);
            if (menuItemImpl.isVisible()) {
                this.mVisibleItems.add(menuItemImpl);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    public void flagActionItems() {
        java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            boolean zFlagActionItems = false;
            for (java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter> weakReference : this.mPresenters) {
                androidx.appcompat.view.menu.MenuPresenter menuPresenter = weakReference.get();
                if (menuPresenter == null) {
                    this.mPresenters.remove(weakReference);
                } else {
                    zFlagActionItems |= menuPresenter.flagActionItems();
                }
            }
            if (zFlagActionItems) {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i = 0; i < size; i++) {
                    androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = visibleItems.get(i);
                    if (menuItemImpl.isActionButton()) {
                        this.mActionItems.add(menuItemImpl);
                    } else {
                        this.mNonActionItems.add(menuItemImpl);
                    }
                }
            } else {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    private void setHeaderInternal(int i, java.lang.CharSequence charSequence, int i2, android.graphics.drawable.Drawable drawable, android.view.View view) {
        android.content.res.Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i > 0) {
                this.mHeaderTitle = resources.getText(i);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i2 > 0) {
                this.mHeaderIcon = androidx.core.content.ContextCompat.getDrawable(getContext(), i2);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    protected androidx.appcompat.view.menu.MenuBuilder setHeaderTitleInt(java.lang.CharSequence charSequence) {
        setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }

    protected androidx.appcompat.view.menu.MenuBuilder setHeaderTitleInt(int i) {
        setHeaderInternal(i, null, 0, null, null);
        return this;
    }

    protected androidx.appcompat.view.menu.MenuBuilder setHeaderIconInt(android.graphics.drawable.Drawable drawable) {
        setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }

    protected androidx.appcompat.view.menu.MenuBuilder setHeaderIconInt(int i) {
        setHeaderInternal(0, null, i, null, null);
        return this;
    }

    protected androidx.appcompat.view.menu.MenuBuilder setHeaderViewInt(android.view.View view) {
        setHeaderInternal(0, null, 0, null, view);
        return this;
    }

    public java.lang.CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public android.graphics.drawable.Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public android.view.View getHeaderView() {
        return this.mHeaderView;
    }

    public void setCurrentMenuInfo(android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public void setOptionalIconsVisible(boolean z) {
        this.mOptionalIconsVisible = z;
    }

    boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public boolean expandItemActionView(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        boolean zExpandItemActionView = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        for (java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter> weakReference : this.mPresenters) {
            androidx.appcompat.view.menu.MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(weakReference);
            } else {
                zExpandItemActionView = menuPresenter.expandItemActionView(this, menuItemImpl);
                if (zExpandItemActionView) {
                    break;
                }
            }
        }
        startDispatchingItemsChanged();
        if (zExpandItemActionView) {
            this.mExpandedItem = menuItemImpl;
        }
        return zExpandItemActionView;
    }

    public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        boolean zCollapseItemActionView = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == menuItemImpl) {
            stopDispatchingItemsChanged();
            for (java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter> weakReference : this.mPresenters) {
                androidx.appcompat.view.menu.MenuPresenter menuPresenter = weakReference.get();
                if (menuPresenter == null) {
                    this.mPresenters.remove(weakReference);
                } else {
                    zCollapseItemActionView = menuPresenter.collapseItemActionView(this, menuItemImpl);
                    if (zCollapseItemActionView) {
                        break;
                    }
                }
            }
            startDispatchingItemsChanged();
            if (zCollapseItemActionView) {
                this.mExpandedItem = null;
            }
        }
        return zCollapseItemActionView;
    }

    public androidx.appcompat.view.menu.MenuItemImpl getExpandedItem() {
        return this.mExpandedItem;
    }

    public void setOverrideVisibleItems(boolean z) {
        this.mOverrideVisibleItems = z;
    }
}
