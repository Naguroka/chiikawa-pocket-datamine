package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class MenuPopupWindow extends androidx.appcompat.widget.ListPopupWindow implements androidx.appcompat.widget.MenuItemHoverListener {
    private static final java.lang.String TAG = "MenuPopupWindow";
    private static java.lang.reflect.Method sSetTouchModalMethod;
    private androidx.appcompat.widget.MenuItemHoverListener mHoverListener;

    static {
        try {
            if (android.os.Build.VERSION.SDK_INT <= 28) {
                sSetTouchModalMethod = android.widget.PopupWindow.class.getDeclaredMethod("setTouchModal", java.lang.Boolean.TYPE);
            }
        } catch (java.lang.NoSuchMethodException unused) {
            android.util.Log.i(TAG, "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public MenuPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    androidx.appcompat.widget.DropDownListView createDropDownListView(android.content.Context context, boolean z) {
        androidx.appcompat.widget.MenuPopupWindow.MenuDropDownListView menuDropDownListView = new androidx.appcompat.widget.MenuPopupWindow.MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    public void setEnterTransition(java.lang.Object obj) {
        androidx.appcompat.widget.MenuPopupWindow.Api23Impl.setEnterTransition(this.mPopup, (android.transition.Transition) obj);
    }

    public void setExitTransition(java.lang.Object obj) {
        androidx.appcompat.widget.MenuPopupWindow.Api23Impl.setExitTransition(this.mPopup, (android.transition.Transition) obj);
    }

    public void setHoverListener(androidx.appcompat.widget.MenuItemHoverListener menuItemHoverListener) {
        this.mHoverListener = menuItemHoverListener;
    }

    public void setTouchModal(boolean z) {
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method = sSetTouchModalMethod;
            if (method != null) {
                try {
                    method.invoke(this.mPopup, java.lang.Boolean.valueOf(z));
                    return;
                } catch (java.lang.Exception unused) {
                    android.util.Log.i(TAG, "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        androidx.appcompat.widget.MenuPopupWindow.Api29Impl.setTouchModal(this.mPopup, z);
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverEnter(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
        androidx.appcompat.widget.MenuItemHoverListener menuItemHoverListener = this.mHoverListener;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.onItemHoverEnter(menuBuilder, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverExit(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
        androidx.appcompat.widget.MenuItemHoverListener menuItemHoverListener = this.mHoverListener;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.onItemHoverExit(menuBuilder, menuItem);
        }
    }

    public static class MenuDropDownListView extends androidx.appcompat.widget.DropDownListView {
        final int mAdvanceKey;
        private androidx.appcompat.widget.MenuItemHoverListener mHoverListener;
        private android.view.MenuItem mHoveredMenuItem;
        final int mRetreatKey;

        @Override // androidx.appcompat.widget.DropDownListView, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ int lookForSelectablePosition(int i, boolean z) {
            return super.lookForSelectablePosition(i, z);
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ int measureHeightOfChildrenCompat(int i, int i2, int i3, int i4, int i5) {
            return super.measureHeightOfChildrenCompat(i, i2, i3, i4, i5);
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ boolean onForwardedEvent(android.view.MotionEvent motionEvent, int i) {
            return super.onForwardedEvent(motionEvent, i);
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable drawable) {
            super.setSelector(drawable);
        }

        public MenuDropDownListView(android.content.Context context, boolean z) {
            super(context, z);
            if (1 == androidx.appcompat.widget.MenuPopupWindow.MenuDropDownListView.Api17Impl.getLayoutDirection(context.getResources().getConfiguration())) {
                this.mAdvanceKey = 21;
                this.mRetreatKey = 22;
            } else {
                this.mAdvanceKey = 22;
                this.mRetreatKey = 21;
            }
        }

        public void setHoverListener(androidx.appcompat.widget.MenuItemHoverListener menuItemHoverListener) {
            this.mHoverListener = menuItemHoverListener;
        }

        public void clearSelection() {
            setSelection(-1);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
            androidx.appcompat.view.menu.MenuAdapter menuAdapter;
            androidx.appcompat.view.menu.ListMenuItemView listMenuItemView = (androidx.appcompat.view.menu.ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.mAdvanceKey) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView != null && i == this.mRetreatKey) {
                setSelection(-1);
                android.widget.ListAdapter adapter = getAdapter();
                if (adapter instanceof android.widget.HeaderViewListAdapter) {
                    menuAdapter = (androidx.appcompat.view.menu.MenuAdapter) ((android.widget.HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    menuAdapter = (androidx.appcompat.view.menu.MenuAdapter) adapter;
                }
                menuAdapter.getAdapterMenu().close(false);
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
            androidx.appcompat.view.menu.MenuAdapter menuAdapter;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.mHoverListener != null) {
                android.widget.ListAdapter adapter = getAdapter();
                if (adapter instanceof android.widget.HeaderViewListAdapter) {
                    android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    menuAdapter = (androidx.appcompat.view.menu.MenuAdapter) headerViewListAdapter.getWrappedAdapter();
                } else {
                    menuAdapter = (androidx.appcompat.view.menu.MenuAdapter) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.MenuItemImpl item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= menuAdapter.getCount()) ? null : menuAdapter.getItem(i);
                android.view.MenuItem menuItem = this.mHoveredMenuItem;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.MenuBuilder adapterMenu = menuAdapter.getAdapterMenu();
                    if (menuItem != null) {
                        this.mHoverListener.onItemHoverExit(adapterMenu, menuItem);
                    }
                    this.mHoveredMenuItem = item;
                    if (item != null) {
                        this.mHoverListener.onItemHoverEnter(adapterMenu, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        static class Api17Impl {
            private Api17Impl() {
            }

            static int getLayoutDirection(android.content.res.Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static void setEnterTransition(android.widget.PopupWindow popupWindow, android.transition.Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void setExitTransition(android.widget.PopupWindow popupWindow, android.transition.Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void setTouchModal(android.widget.PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }
}
