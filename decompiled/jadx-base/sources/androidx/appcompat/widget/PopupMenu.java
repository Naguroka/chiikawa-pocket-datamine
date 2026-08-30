package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class PopupMenu {
    private final android.view.View mAnchor;
    private final android.content.Context mContext;
    private android.view.View.OnTouchListener mDragListener;
    private final androidx.appcompat.view.menu.MenuBuilder mMenu;
    androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener mMenuItemClickListener;
    androidx.appcompat.widget.PopupMenu.OnDismissListener mOnDismissListener;
    final androidx.appcompat.view.menu.MenuPopupHelper mPopup;

    public interface OnDismissListener {
        void onDismiss(androidx.appcompat.widget.PopupMenu popupMenu);
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(android.view.MenuItem menuItem);
    }

    public PopupMenu(android.content.Context context, android.view.View view) {
        this(context, view, 0);
    }

    public PopupMenu(android.content.Context context, android.view.View view, int i) {
        this(context, view, i, androidx.appcompat.R.attr.popupMenuStyle, 0);
    }

    public PopupMenu(android.content.Context context, android.view.View view, int i, int i2, int i3) {
        this.mContext = context;
        this.mAnchor = view;
        androidx.appcompat.view.menu.MenuBuilder menuBuilder = new androidx.appcompat.view.menu.MenuBuilder(context);
        this.mMenu = menuBuilder;
        menuBuilder.setCallback(new androidx.appcompat.view.menu.MenuBuilder.Callback() { // from class: androidx.appcompat.widget.PopupMenu.1
            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder menuBuilder2) {
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder2, android.view.MenuItem menuItem) {
                if (androidx.appcompat.widget.PopupMenu.this.mMenuItemClickListener != null) {
                    return androidx.appcompat.widget.PopupMenu.this.mMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }
        });
        androidx.appcompat.view.menu.MenuPopupHelper menuPopupHelper = new androidx.appcompat.view.menu.MenuPopupHelper(context, menuBuilder, view, false, i2, i3);
        this.mPopup = menuPopupHelper;
        menuPopupHelper.setGravity(i);
        menuPopupHelper.setOnDismissListener(new android.widget.PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.PopupMenu.2
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                if (androidx.appcompat.widget.PopupMenu.this.mOnDismissListener != null) {
                    androidx.appcompat.widget.PopupMenu.this.mOnDismissListener.onDismiss(androidx.appcompat.widget.PopupMenu.this);
                }
            }
        });
    }

    public void setGravity(int i) {
        this.mPopup.setGravity(i);
    }

    public int getGravity() {
        return this.mPopup.getGravity();
    }

    public android.view.View.OnTouchListener getDragToOpenListener() {
        if (this.mDragListener == null) {
            this.mDragListener = new androidx.appcompat.widget.ForwardingListener(this.mAnchor) { // from class: androidx.appcompat.widget.PopupMenu.3
                @Override // androidx.appcompat.widget.ForwardingListener
                protected boolean onForwardingStarted() {
                    androidx.appcompat.widget.PopupMenu.this.show();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                protected boolean onForwardingStopped() {
                    androidx.appcompat.widget.PopupMenu.this.dismiss();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
                    return androidx.appcompat.widget.PopupMenu.this.mPopup.getPopup();
                }
            };
        }
        return this.mDragListener;
    }

    public android.view.Menu getMenu() {
        return this.mMenu;
    }

    public android.view.MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.SupportMenuInflater(this.mContext);
    }

    public void inflate(int i) {
        getMenuInflater().inflate(i, this.mMenu);
    }

    public void show() {
        this.mPopup.show();
    }

    public void dismiss() {
        this.mPopup.dismiss();
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener onMenuItemClickListener) {
        this.mMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOnDismissListener(androidx.appcompat.widget.PopupMenu.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setForceShowIcon(boolean z) {
        this.mPopup.setForceShowIcon(z);
    }

    android.widget.ListView getMenuListView() {
        if (this.mPopup.isShowing()) {
            return this.mPopup.getListView();
        }
        return null;
    }
}
