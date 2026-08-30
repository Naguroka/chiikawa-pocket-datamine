package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
final class StandardMenuPopup extends androidx.appcompat.view.menu.MenuPopup implements android.widget.PopupWindow.OnDismissListener, android.widget.AdapterView.OnItemClickListener, androidx.appcompat.view.menu.MenuPresenter, android.view.View.OnKeyListener {
    private static final int ITEM_LAYOUT = androidx.appcompat.R.layout.abc_popup_menu_item_layout;
    private final androidx.appcompat.view.menu.MenuAdapter mAdapter;
    private android.view.View mAnchorView;
    private int mContentWidth;
    private final android.content.Context mContext;
    private boolean mHasContentWidth;
    private final androidx.appcompat.view.menu.MenuBuilder mMenu;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    final androidx.appcompat.widget.MenuPopupWindow mPopup;
    private final int mPopupMaxWidth;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private androidx.appcompat.view.menu.MenuPresenter.Callback mPresenterCallback;
    private boolean mShowTitle;
    android.view.View mShownAnchorView;
    android.view.ViewTreeObserver mTreeObserver;
    private boolean mWasDismissed;
    final android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!androidx.appcompat.view.menu.StandardMenuPopup.this.isShowing() || androidx.appcompat.view.menu.StandardMenuPopup.this.mPopup.isModal()) {
                return;
            }
            android.view.View view = androidx.appcompat.view.menu.StandardMenuPopup.this.mShownAnchorView;
            if (view == null || !view.isShown()) {
                androidx.appcompat.view.menu.StandardMenuPopup.this.dismiss();
            } else {
                androidx.appcompat.view.menu.StandardMenuPopup.this.mPopup.show();
            }
        }
    };
    private final android.view.View.OnAttachStateChangeListener mAttachStateChangeListener = new android.view.View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            if (androidx.appcompat.view.menu.StandardMenuPopup.this.mTreeObserver != null) {
                if (!androidx.appcompat.view.menu.StandardMenuPopup.this.mTreeObserver.isAlive()) {
                    androidx.appcompat.view.menu.StandardMenuPopup.this.mTreeObserver = view.getViewTreeObserver();
                }
                androidx.appcompat.view.menu.StandardMenuPopup.this.mTreeObserver.removeGlobalOnLayoutListener(androidx.appcompat.view.menu.StandardMenuPopup.this.mGlobalLayoutListener);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private int mDropDownGravity = 0;

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void addMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
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

    public StandardMenuPopup(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.View view, int i, int i2, boolean z) {
        this.mContext = context;
        this.mMenu = menuBuilder;
        this.mOverflowOnly = z;
        this.mAdapter = new androidx.appcompat.view.menu.MenuAdapter(menuBuilder, android.view.LayoutInflater.from(context), z, ITEM_LAYOUT);
        this.mPopupStyleAttr = i;
        this.mPopupStyleRes = i2;
        android.content.res.Resources resources = context.getResources();
        this.mPopupMaxWidth = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(androidx.appcompat.R.dimen.abc_config_prefDialogWidth));
        this.mAnchorView = view;
        this.mPopup = new androidx.appcompat.widget.MenuPopupWindow(context, null, i, i2);
        menuBuilder.addMenuPresenter(this, context);
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setForceShowIcon(boolean z) {
        this.mAdapter.setForceShowIcon(z);
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setGravity(int i) {
        this.mDropDownGravity = i;
    }

    private boolean tryShow() {
        android.view.View view;
        if (isShowing()) {
            return true;
        }
        if (this.mWasDismissed || (view = this.mAnchorView) == null) {
            return false;
        }
        this.mShownAnchorView = view;
        this.mPopup.setOnDismissListener(this);
        this.mPopup.setOnItemClickListener(this);
        this.mPopup.setModal(true);
        android.view.View view2 = this.mShownAnchorView;
        boolean z = this.mTreeObserver == null;
        android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.mTreeObserver = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.mGlobalLayoutListener);
        }
        view2.addOnAttachStateChangeListener(this.mAttachStateChangeListener);
        this.mPopup.setAnchorView(view2);
        this.mPopup.setDropDownGravity(this.mDropDownGravity);
        if (!this.mHasContentWidth) {
            this.mContentWidth = measureIndividualMenuWidth(this.mAdapter, null, this.mContext, this.mPopupMaxWidth);
            this.mHasContentWidth = true;
        }
        this.mPopup.setContentWidth(this.mContentWidth);
        this.mPopup.setInputMethodMode(2);
        this.mPopup.setEpicenterBounds(getEpicenterBounds());
        this.mPopup.show();
        android.widget.ListView listView = this.mPopup.getListView();
        listView.setOnKeyListener(this);
        if (this.mShowTitle && this.mMenu.getHeaderTitle() != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.LayoutInflater.from(this.mContext).inflate(androidx.appcompat.R.layout.abc_popup_menu_header_item_layout, (android.view.ViewGroup) listView, false);
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
            if (textView != null) {
                textView.setText(this.mMenu.getHeaderTitle());
            }
            frameLayout.setEnabled(false);
            listView.addHeaderView(frameLayout, null, false);
        }
        this.mPopup.setAdapter(this.mAdapter);
        this.mPopup.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        if (!tryShow()) {
            throw new java.lang.IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        if (isShowing()) {
            this.mPopup.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
        return !this.mWasDismissed && this.mPopup.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.mWasDismissed = true;
        this.mMenu.close();
        android.view.ViewTreeObserver viewTreeObserver = this.mTreeObserver;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.mTreeObserver = this.mShownAnchorView.getViewTreeObserver();
            }
            this.mTreeObserver.removeGlobalOnLayoutListener(this.mGlobalLayoutListener);
            this.mTreeObserver = null;
        }
        this.mShownAnchorView.removeOnAttachStateChangeListener(this.mAttachStateChangeListener);
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.mOnDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        this.mHasContentWidth = false;
        androidx.appcompat.view.menu.MenuAdapter menuAdapter = this.mAdapter;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
        this.mPresenterCallback = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        if (subMenuBuilder.hasVisibleItems()) {
            androidx.appcompat.view.menu.MenuPopupHelper menuPopupHelper = new androidx.appcompat.view.menu.MenuPopupHelper(this.mContext, subMenuBuilder, this.mShownAnchorView, this.mOverflowOnly, this.mPopupStyleAttr, this.mPopupStyleRes);
            menuPopupHelper.setPresenterCallback(this.mPresenterCallback);
            menuPopupHelper.setForceShowIcon(androidx.appcompat.view.menu.MenuPopup.shouldPreserveIconSpacing(subMenuBuilder));
            menuPopupHelper.setOnDismissListener(this.mOnDismissListener);
            this.mOnDismissListener = null;
            this.mMenu.close(false);
            int horizontalOffset = this.mPopup.getHorizontalOffset();
            int verticalOffset = this.mPopup.getVerticalOffset();
            if ((android.view.Gravity.getAbsoluteGravity(this.mDropDownGravity, androidx.core.view.ViewCompat.getLayoutDirection(this.mAnchorView)) & 7) == 5) {
                horizontalOffset += this.mAnchorView.getWidth();
            }
            if (menuPopupHelper.tryShow(horizontalOffset, verticalOffset)) {
                androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.mPresenterCallback;
                if (callback == null) {
                    return true;
                }
                callback.onOpenSubMenu(subMenuBuilder);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder != this.mMenu) {
            return;
        }
        dismiss();
        androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.mPresenterCallback;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setAnchorView(android.view.View view) {
        this.mAnchorView = view;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public android.widget.ListView getListView() {
        return this.mPopup.getListView();
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setHorizontalOffset(int i) {
        this.mPopup.setHorizontalOffset(i);
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setVerticalOffset(int i) {
        this.mPopup.setVerticalOffset(i);
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setShowTitle(boolean z) {
        this.mShowTitle = z;
    }
}
