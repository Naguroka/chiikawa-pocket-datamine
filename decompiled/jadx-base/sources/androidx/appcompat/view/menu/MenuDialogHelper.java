package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
class MenuDialogHelper implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, androidx.appcompat.view.menu.MenuPresenter.Callback {
    private androidx.appcompat.app.AlertDialog mDialog;
    private androidx.appcompat.view.menu.MenuBuilder mMenu;
    androidx.appcompat.view.menu.ListMenuPresenter mPresenter;
    private androidx.appcompat.view.menu.MenuPresenter.Callback mPresenterCallback;

    public MenuDialogHelper(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    public void show(android.os.IBinder iBinder) {
        androidx.appcompat.view.menu.MenuBuilder menuBuilder = this.mMenu;
        androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(menuBuilder.getContext());
        androidx.appcompat.view.menu.ListMenuPresenter listMenuPresenter = new androidx.appcompat.view.menu.ListMenuPresenter(builder.getContext(), androidx.appcompat.R.layout.abc_list_menu_item_layout);
        this.mPresenter = listMenuPresenter;
        listMenuPresenter.setCallback(this);
        this.mMenu.addMenuPresenter(this.mPresenter);
        builder.setAdapter(this.mPresenter.getAdapter(), this);
        android.view.View headerView = menuBuilder.getHeaderView();
        if (headerView != null) {
            builder.setCustomTitle(headerView);
        } else {
            builder.setIcon(menuBuilder.getHeaderIcon()).setTitle(menuBuilder.getHeaderTitle());
        }
        builder.setOnKeyListener(this);
        androidx.appcompat.app.AlertDialog alertDialogCreate = builder.create();
        this.mDialog = alertDialogCreate;
        alertDialogCreate.setOnDismissListener(this);
        android.view.WindowManager.LayoutParams attributes = this.mDialog.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.mDialog.show();
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
        android.view.Window window;
        android.view.View decorView;
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        android.view.View decorView2;
        android.view.KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                android.view.Window window2 = this.mDialog.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.mDialog.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.mMenu.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.mMenu.performShortcut(i, keyEvent, 0);
    }

    public void setPresenterCallback(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
        this.mPresenterCallback = callback;
    }

    public void dismiss() {
        androidx.appcompat.app.AlertDialog alertDialog = this.mDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.mPresenter.onCloseMenu(this.mMenu, true);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        if (z || menuBuilder == this.mMenu) {
            dismiss();
        }
        androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.mPresenterCallback;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.mPresenterCallback;
        if (callback != null) {
            return callback.onOpenSubMenu(menuBuilder);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.mMenu.performItemAction((androidx.appcompat.view.menu.MenuItemImpl) this.mPresenter.getAdapter().getItem(i), 0);
    }
}
