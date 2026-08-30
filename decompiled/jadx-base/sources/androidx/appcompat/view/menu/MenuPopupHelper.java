package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class MenuPopupHelper implements androidx.appcompat.view.menu.MenuHelper {
    private static final int TOUCH_EPICENTER_SIZE_DP = 48;
    private android.view.View mAnchorView;
    private final android.content.Context mContext;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    private final android.widget.PopupWindow.OnDismissListener mInternalOnDismissListener;
    private final androidx.appcompat.view.menu.MenuBuilder mMenu;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private androidx.appcompat.view.menu.MenuPopup mPopup;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private androidx.appcompat.view.menu.MenuPresenter.Callback mPresenterCallback;

    public MenuPopupHelper(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        this(context, menuBuilder, null, false, androidx.appcompat.R.attr.popupMenuStyle, 0);
    }

    public MenuPopupHelper(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.View view) {
        this(context, menuBuilder, view, false, androidx.appcompat.R.attr.popupMenuStyle, 0);
    }

    public MenuPopupHelper(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.View view, boolean z, int i) {
        this(context, menuBuilder, view, z, i, 0);
    }

    public MenuPopupHelper(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.View view, boolean z, int i, int i2) {
        this.mDropDownGravity = androidx.core.view.GravityCompat.START;
        this.mInternalOnDismissListener = new android.widget.PopupWindow.OnDismissListener() { // from class: androidx.appcompat.view.menu.MenuPopupHelper.1
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                androidx.appcompat.view.menu.MenuPopupHelper.this.onDismiss();
            }
        };
        this.mContext = context;
        this.mMenu = menuBuilder;
        this.mAnchorView = view;
        this.mOverflowOnly = z;
        this.mPopupStyleAttr = i;
        this.mPopupStyleRes = i2;
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setAnchorView(android.view.View view) {
        this.mAnchorView = view;
    }

    public void setForceShowIcon(boolean z) {
        this.mForceShowIcon = z;
        androidx.appcompat.view.menu.MenuPopup menuPopup = this.mPopup;
        if (menuPopup != null) {
            menuPopup.setForceShowIcon(z);
        }
    }

    public void setGravity(int i) {
        this.mDropDownGravity = i;
    }

    public int getGravity() {
        return this.mDropDownGravity;
    }

    public void show() {
        if (!tryShow()) {
            throw new java.lang.IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void show(int i, int i2) {
        if (!tryShow(i, i2)) {
            throw new java.lang.IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public androidx.appcompat.view.menu.MenuPopup getPopup() {
        if (this.mPopup == null) {
            this.mPopup = createPopup();
        }
        return this.mPopup;
    }

    public boolean tryShow() {
        if (isShowing()) {
            return true;
        }
        if (this.mAnchorView == null) {
            return false;
        }
        showPopup(0, 0, false, false);
        return true;
    }

    public boolean tryShow(int i, int i2) {
        if (isShowing()) {
            return true;
        }
        if (this.mAnchorView == null) {
            return false;
        }
        showPopup(i, i2, true, true);
        return true;
    }

    private androidx.appcompat.view.menu.MenuPopup createPopup() {
        androidx.appcompat.view.menu.MenuPopup standardMenuPopup;
        android.view.Display defaultDisplay = ((android.view.WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        androidx.appcompat.view.menu.MenuPopupHelper.Api17Impl.getRealSize(defaultDisplay, point);
        if (java.lang.Math.min(point.x, point.y) >= this.mContext.getResources().getDimensionPixelSize(androidx.appcompat.R.dimen.abc_cascading_menus_min_smallest_width)) {
            standardMenuPopup = new androidx.appcompat.view.menu.CascadingMenuPopup(this.mContext, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
        } else {
            standardMenuPopup = new androidx.appcompat.view.menu.StandardMenuPopup(this.mContext, this.mMenu, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
        }
        standardMenuPopup.addMenu(this.mMenu);
        standardMenuPopup.setOnDismissListener(this.mInternalOnDismissListener);
        standardMenuPopup.setAnchorView(this.mAnchorView);
        standardMenuPopup.setCallback(this.mPresenterCallback);
        standardMenuPopup.setForceShowIcon(this.mForceShowIcon);
        standardMenuPopup.setGravity(this.mDropDownGravity);
        return standardMenuPopup;
    }

    private void showPopup(int i, int i2, boolean z, boolean z2) {
        androidx.appcompat.view.menu.MenuPopup popup = getPopup();
        popup.setShowTitle(z2);
        if (z) {
            if ((androidx.core.view.GravityCompat.getAbsoluteGravity(this.mDropDownGravity, androidx.core.view.ViewCompat.getLayoutDirection(this.mAnchorView)) & 7) == 5) {
                i -= this.mAnchorView.getWidth();
            }
            popup.setHorizontalOffset(i);
            popup.setVerticalOffset(i2);
            int i3 = (int) ((this.mContext.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            popup.setEpicenterBounds(new android.graphics.Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        popup.show();
    }

    @Override // androidx.appcompat.view.menu.MenuHelper
    public void dismiss() {
        if (isShowing()) {
            this.mPopup.dismiss();
        }
    }

    protected void onDismiss() {
        this.mPopup = null;
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.mOnDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean isShowing() {
        androidx.appcompat.view.menu.MenuPopup menuPopup = this.mPopup;
        return menuPopup != null && menuPopup.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuHelper
    public void setPresenterCallback(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
        this.mPresenterCallback = callback;
        androidx.appcompat.view.menu.MenuPopup menuPopup = this.mPopup;
        if (menuPopup != null) {
            menuPopup.setCallback(callback);
        }
    }

    public android.widget.ListView getListView() {
        return getPopup().getListView();
    }

    static class Api17Impl {
        private Api17Impl() {
        }

        static void getRealSize(android.view.Display display, android.graphics.Point point) {
            display.getRealSize(point);
        }
    }
}
