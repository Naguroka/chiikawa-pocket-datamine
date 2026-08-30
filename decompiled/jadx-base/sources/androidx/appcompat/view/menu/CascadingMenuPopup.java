package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
final class CascadingMenuPopup extends androidx.appcompat.view.menu.MenuPopup implements androidx.appcompat.view.menu.MenuPresenter, android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {
    static final int HORIZ_POSITION_LEFT = 0;
    static final int HORIZ_POSITION_RIGHT = 1;
    private static final int ITEM_LAYOUT = androidx.appcompat.R.layout.abc_cascading_menu_item_layout;
    static final int SUBMENU_TIMEOUT_MS = 200;
    private android.view.View mAnchorView;
    private final android.content.Context mContext;
    private boolean mHasXOffset;
    private boolean mHasYOffset;
    private final int mMenuMaxWidth;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private androidx.appcompat.view.menu.MenuPresenter.Callback mPresenterCallback;
    boolean mShouldCloseImmediately;
    private boolean mShowTitle;
    android.view.View mShownAnchorView;
    final android.os.Handler mSubMenuHoverHandler;
    android.view.ViewTreeObserver mTreeObserver;
    private int mXOffset;
    private int mYOffset;
    private final java.util.List<androidx.appcompat.view.menu.MenuBuilder> mPendingMenus = new java.util.ArrayList();
    final java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo> mShowingMenus = new java.util.ArrayList();
    final android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!androidx.appcompat.view.menu.CascadingMenuPopup.this.isShowing() || androidx.appcompat.view.menu.CascadingMenuPopup.this.mShowingMenus.size() <= 0 || androidx.appcompat.view.menu.CascadingMenuPopup.this.mShowingMenus.get(0).window.isModal()) {
                return;
            }
            android.view.View view = androidx.appcompat.view.menu.CascadingMenuPopup.this.mShownAnchorView;
            if (view == null || !view.isShown()) {
                androidx.appcompat.view.menu.CascadingMenuPopup.this.dismiss();
                return;
            }
            java.util.Iterator<androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo> it = androidx.appcompat.view.menu.CascadingMenuPopup.this.mShowingMenus.iterator();
            while (it.hasNext()) {
                it.next().window.show();
            }
        }
    };
    private final android.view.View.OnAttachStateChangeListener mAttachStateChangeListener = new android.view.View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            if (androidx.appcompat.view.menu.CascadingMenuPopup.this.mTreeObserver != null) {
                if (!androidx.appcompat.view.menu.CascadingMenuPopup.this.mTreeObserver.isAlive()) {
                    androidx.appcompat.view.menu.CascadingMenuPopup.this.mTreeObserver = view.getViewTreeObserver();
                }
                androidx.appcompat.view.menu.CascadingMenuPopup.this.mTreeObserver.removeGlobalOnLayoutListener(androidx.appcompat.view.menu.CascadingMenuPopup.this.mGlobalLayoutListener);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private final androidx.appcompat.widget.MenuItemHoverListener mMenuItemHoverListener = new androidx.appcompat.widget.MenuItemHoverListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3
        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverExit(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
            androidx.appcompat.view.menu.CascadingMenuPopup.this.mSubMenuHoverHandler.removeCallbacksAndMessages(menuBuilder);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverEnter(final androidx.appcompat.view.menu.MenuBuilder menuBuilder, final android.view.MenuItem menuItem) {
            androidx.appcompat.view.menu.CascadingMenuPopup.this.mSubMenuHoverHandler.removeCallbacksAndMessages(null);
            int size = androidx.appcompat.view.menu.CascadingMenuPopup.this.mShowingMenus.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (menuBuilder == androidx.appcompat.view.menu.CascadingMenuPopup.this.mShowingMenus.get(i).menu) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            final androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo cascadingMenuInfo = i2 < androidx.appcompat.view.menu.CascadingMenuPopup.this.mShowingMenus.size() ? androidx.appcompat.view.menu.CascadingMenuPopup.this.mShowingMenus.get(i2) : null;
            androidx.appcompat.view.menu.CascadingMenuPopup.this.mSubMenuHoverHandler.postAtTime(new java.lang.Runnable() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3.1
                @Override // java.lang.Runnable
                public void run() {
                    if (cascadingMenuInfo != null) {
                        androidx.appcompat.view.menu.CascadingMenuPopup.this.mShouldCloseImmediately = true;
                        cascadingMenuInfo.menu.close(false);
                        androidx.appcompat.view.menu.CascadingMenuPopup.this.mShouldCloseImmediately = false;
                    }
                    if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                        menuBuilder.performItemAction(menuItem, 4);
                    }
                }
            }, menuBuilder, android.os.SystemClock.uptimeMillis() + 200);
        }
    };
    private int mRawDropDownGravity = 0;
    private int mDropDownGravity = 0;
    private boolean mForceShowIcon = false;
    private int mLastPosition = getInitialMenuPosition();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    protected boolean closeMenuOnSubMenuOpened() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public android.os.Parcelable onSaveInstanceState() {
        return null;
    }

    public CascadingMenuPopup(android.content.Context context, android.view.View view, int i, int i2, boolean z) {
        this.mContext = context;
        this.mAnchorView = view;
        this.mPopupStyleAttr = i;
        this.mPopupStyleRes = i2;
        this.mOverflowOnly = z;
        android.content.res.Resources resources = context.getResources();
        this.mMenuMaxWidth = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(androidx.appcompat.R.dimen.abc_config_prefDialogWidth));
        this.mSubMenuHoverHandler = new android.os.Handler();
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setForceShowIcon(boolean z) {
        this.mForceShowIcon = z;
    }

    private androidx.appcompat.widget.MenuPopupWindow createPopupWindow() {
        androidx.appcompat.widget.MenuPopupWindow menuPopupWindow = new androidx.appcompat.widget.MenuPopupWindow(this.mContext, null, this.mPopupStyleAttr, this.mPopupStyleRes);
        menuPopupWindow.setHoverListener(this.mMenuItemHoverListener);
        menuPopupWindow.setOnItemClickListener(this);
        menuPopupWindow.setOnDismissListener(this);
        menuPopupWindow.setAnchorView(this.mAnchorView);
        menuPopupWindow.setDropDownGravity(this.mDropDownGravity);
        menuPopupWindow.setModal(true);
        menuPopupWindow.setInputMethodMode(2);
        return menuPopupWindow;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        if (isShowing()) {
            return;
        }
        java.util.Iterator<androidx.appcompat.view.menu.MenuBuilder> it = this.mPendingMenus.iterator();
        while (it.hasNext()) {
            showMenu(it.next());
        }
        this.mPendingMenus.clear();
        android.view.View view = this.mAnchorView;
        this.mShownAnchorView = view;
        if (view != null) {
            boolean z = this.mTreeObserver == null;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.mTreeObserver = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.mGlobalLayoutListener);
            }
            this.mShownAnchorView.addOnAttachStateChangeListener(this.mAttachStateChangeListener);
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        int size = this.mShowingMenus.size();
        if (size > 0) {
            androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo[] cascadingMenuInfoArr = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo[]) this.mShowingMenus.toArray(new androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo[size]);
            for (int i = size - 1; i >= 0; i--) {
                androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo cascadingMenuInfo = cascadingMenuInfoArr[i];
                if (cascadingMenuInfo.window.isShowing()) {
                    cascadingMenuInfo.window.dismiss();
                }
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    private int getInitialMenuPosition() {
        return androidx.core.view.ViewCompat.getLayoutDirection(this.mAnchorView) == 1 ? 0 : 1;
    }

    private int getNextMenuPosition(int i) {
        java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo> list = this.mShowingMenus;
        android.widget.ListView listView = list.get(list.size() - 1).getListView();
        int[] iArr = new int[2];
        listView.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        this.mShownAnchorView.getWindowVisibleDisplayFrame(rect);
        if (this.mLastPosition == 1) {
            return (iArr[0] + listView.getWidth()) + i > rect.right ? 0 : 1;
        }
        return iArr[0] - i < 0 ? 1 : 0;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void addMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        menuBuilder.addMenuPresenter(this, this.mContext);
        if (isShowing()) {
            showMenu(menuBuilder);
        } else {
            this.mPendingMenus.add(menuBuilder);
        }
    }

    private void showMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo cascadingMenuInfo;
        android.view.View viewFindParentViewForSubmenu;
        int i;
        int i2;
        int i3;
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this.mContext);
        androidx.appcompat.view.menu.MenuAdapter menuAdapter = new androidx.appcompat.view.menu.MenuAdapter(menuBuilder, layoutInflaterFrom, this.mOverflowOnly, ITEM_LAYOUT);
        if (!isShowing() && this.mForceShowIcon) {
            menuAdapter.setForceShowIcon(true);
        } else if (isShowing()) {
            menuAdapter.setForceShowIcon(androidx.appcompat.view.menu.MenuPopup.shouldPreserveIconSpacing(menuBuilder));
        }
        int iMeasureIndividualMenuWidth = measureIndividualMenuWidth(menuAdapter, null, this.mContext, this.mMenuMaxWidth);
        androidx.appcompat.widget.MenuPopupWindow menuPopupWindowCreatePopupWindow = createPopupWindow();
        menuPopupWindowCreatePopupWindow.setAdapter(menuAdapter);
        menuPopupWindowCreatePopupWindow.setContentWidth(iMeasureIndividualMenuWidth);
        menuPopupWindowCreatePopupWindow.setDropDownGravity(this.mDropDownGravity);
        if (this.mShowingMenus.size() > 0) {
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo> list = this.mShowingMenus;
            cascadingMenuInfo = list.get(list.size() - 1);
            viewFindParentViewForSubmenu = findParentViewForSubmenu(cascadingMenuInfo, menuBuilder);
        } else {
            cascadingMenuInfo = null;
            viewFindParentViewForSubmenu = null;
        }
        if (viewFindParentViewForSubmenu != null) {
            menuPopupWindowCreatePopupWindow.setTouchModal(false);
            menuPopupWindowCreatePopupWindow.setEnterTransition(null);
            int nextMenuPosition = getNextMenuPosition(iMeasureIndividualMenuWidth);
            boolean z = nextMenuPosition == 1;
            this.mLastPosition = nextMenuPosition;
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                menuPopupWindowCreatePopupWindow.setAnchorView(viewFindParentViewForSubmenu);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.mAnchorView.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewFindParentViewForSubmenu.getLocationOnScreen(iArr2);
                if ((this.mDropDownGravity & 7) == 5) {
                    iArr[0] = iArr[0] + this.mAnchorView.getWidth();
                    iArr2[0] = iArr2[0] + viewFindParentViewForSubmenu.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.mDropDownGravity & 5) == 5) {
                if (z) {
                    i3 = i + iMeasureIndividualMenuWidth;
                } else {
                    iMeasureIndividualMenuWidth = viewFindParentViewForSubmenu.getWidth();
                    i3 = i - iMeasureIndividualMenuWidth;
                }
            } else if (z) {
                iMeasureIndividualMenuWidth = viewFindParentViewForSubmenu.getWidth();
                i3 = i + iMeasureIndividualMenuWidth;
            } else {
                i3 = i - iMeasureIndividualMenuWidth;
            }
            menuPopupWindowCreatePopupWindow.setHorizontalOffset(i3);
            menuPopupWindowCreatePopupWindow.setOverlapAnchor(true);
            menuPopupWindowCreatePopupWindow.setVerticalOffset(i2);
        } else {
            if (this.mHasXOffset) {
                menuPopupWindowCreatePopupWindow.setHorizontalOffset(this.mXOffset);
            }
            if (this.mHasYOffset) {
                menuPopupWindowCreatePopupWindow.setVerticalOffset(this.mYOffset);
            }
            menuPopupWindowCreatePopupWindow.setEpicenterBounds(getEpicenterBounds());
        }
        this.mShowingMenus.add(new androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo(menuPopupWindowCreatePopupWindow, menuBuilder, this.mLastPosition));
        menuPopupWindowCreatePopupWindow.show();
        android.widget.ListView listView = menuPopupWindowCreatePopupWindow.getListView();
        listView.setOnKeyListener(this);
        if (cascadingMenuInfo == null && this.mShowTitle && menuBuilder.getHeaderTitle() != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) layoutInflaterFrom.inflate(androidx.appcompat.R.layout.abc_popup_menu_header_item_layout, (android.view.ViewGroup) listView, false);
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuBuilder.getHeaderTitle());
            listView.addHeaderView(frameLayout, null, false);
            menuPopupWindowCreatePopupWindow.show();
        }
    }

    private android.view.MenuItem findMenuItemForSubmenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuBuilder menuBuilder2) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = menuBuilder.getItem(i);
            if (item.hasSubMenu() && menuBuilder2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private android.view.View findParentViewForSubmenu(androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo cascadingMenuInfo, androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        androidx.appcompat.view.menu.MenuAdapter menuAdapter;
        int headersCount;
        int firstVisiblePosition;
        android.view.MenuItem menuItemFindMenuItemForSubmenu = findMenuItemForSubmenu(cascadingMenuInfo.menu, menuBuilder);
        if (menuItemFindMenuItemForSubmenu == null) {
            return null;
        }
        android.widget.ListView listView = cascadingMenuInfo.getListView();
        android.widget.ListAdapter adapter = listView.getAdapter();
        int i = 0;
        if (adapter instanceof android.widget.HeaderViewListAdapter) {
            android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            menuAdapter = (androidx.appcompat.view.menu.MenuAdapter) headerViewListAdapter.getWrappedAdapter();
        } else {
            menuAdapter = (androidx.appcompat.view.menu.MenuAdapter) adapter;
            headersCount = 0;
        }
        int count = menuAdapter.getCount();
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            if (menuItemFindMenuItemForSubmenu == menuAdapter.getItem(i)) {
                break;
            }
            i++;
        }
        if (i != -1 && (firstVisiblePosition = (i + headersCount) - listView.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listView.getChildCount()) {
            return listView.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
        return this.mShowingMenus.size() > 0 && this.mShowingMenus.get(0).window.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo cascadingMenuInfo;
        int size = this.mShowingMenus.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                cascadingMenuInfo = null;
                break;
            }
            cascadingMenuInfo = this.mShowingMenus.get(i);
            if (!cascadingMenuInfo.window.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (cascadingMenuInfo != null) {
            cascadingMenuInfo.menu.close(false);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        java.util.Iterator<androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo> it = this.mShowingMenus.iterator();
        while (it.hasNext()) {
            toMenuAdapter(it.next().getListView().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
        this.mPresenterCallback = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        for (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo cascadingMenuInfo : this.mShowingMenus) {
            if (subMenuBuilder == cascadingMenuInfo.menu) {
                cascadingMenuInfo.getListView().requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        addMenu(subMenuBuilder);
        androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.mPresenterCallback;
        if (callback != null) {
            callback.onOpenSubMenu(subMenuBuilder);
        }
        return true;
    }

    private int findIndexOfAddedMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        int size = this.mShowingMenus.size();
        for (int i = 0; i < size; i++) {
            if (menuBuilder == this.mShowingMenus.get(i).menu) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        int iFindIndexOfAddedMenu = findIndexOfAddedMenu(menuBuilder);
        if (iFindIndexOfAddedMenu < 0) {
            return;
        }
        int i = iFindIndexOfAddedMenu + 1;
        if (i < this.mShowingMenus.size()) {
            this.mShowingMenus.get(i).menu.close(false);
        }
        androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo cascadingMenuInfoRemove = this.mShowingMenus.remove(iFindIndexOfAddedMenu);
        cascadingMenuInfoRemove.menu.removeMenuPresenter(this);
        if (this.mShouldCloseImmediately) {
            cascadingMenuInfoRemove.window.setExitTransition(null);
            cascadingMenuInfoRemove.window.setAnimationStyle(0);
        }
        cascadingMenuInfoRemove.window.dismiss();
        int size = this.mShowingMenus.size();
        if (size > 0) {
            this.mLastPosition = this.mShowingMenus.get(size - 1).position;
        } else {
            this.mLastPosition = getInitialMenuPosition();
        }
        if (size != 0) {
            if (z) {
                this.mShowingMenus.get(0).menu.close(false);
                return;
            }
            return;
        }
        dismiss();
        androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.mPresenterCallback;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, true);
        }
        android.view.ViewTreeObserver viewTreeObserver = this.mTreeObserver;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.mTreeObserver.removeGlobalOnLayoutListener(this.mGlobalLayoutListener);
            }
            this.mTreeObserver = null;
        }
        this.mShownAnchorView.removeOnAttachStateChangeListener(this.mAttachStateChangeListener);
        this.mOnDismissListener.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setGravity(int i) {
        if (this.mRawDropDownGravity != i) {
            this.mRawDropDownGravity = i;
            this.mDropDownGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(i, androidx.core.view.ViewCompat.getLayoutDirection(this.mAnchorView));
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setAnchorView(android.view.View view) {
        if (this.mAnchorView != view) {
            this.mAnchorView = view;
            this.mDropDownGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(this.mRawDropDownGravity, androidx.core.view.ViewCompat.getLayoutDirection(view));
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public android.widget.ListView getListView() {
        if (this.mShowingMenus.isEmpty()) {
            return null;
        }
        java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo> list = this.mShowingMenus;
        return list.get(list.size() - 1).getListView();
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setHorizontalOffset(int i) {
        this.mHasXOffset = true;
        this.mXOffset = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setVerticalOffset(int i) {
        this.mHasYOffset = true;
        this.mYOffset = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setShowTitle(boolean z) {
        this.mShowTitle = z;
    }

    private static class CascadingMenuInfo {
        public final androidx.appcompat.view.menu.MenuBuilder menu;
        public final int position;
        public final androidx.appcompat.widget.MenuPopupWindow window;

        public CascadingMenuInfo(androidx.appcompat.widget.MenuPopupWindow menuPopupWindow, androidx.appcompat.view.menu.MenuBuilder menuBuilder, int i) {
            this.window = menuPopupWindow;
            this.menu = menuBuilder;
            this.position = i;
        }

        public android.widget.ListView getListView() {
            return this.window.getListView();
        }
    }
}
