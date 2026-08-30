package androidx.appcompat.view;

/* JADX INFO: loaded from: classes.dex */
public class StandaloneActionMode extends androidx.appcompat.view.ActionMode implements androidx.appcompat.view.menu.MenuBuilder.Callback {
    private androidx.appcompat.view.ActionMode.Callback mCallback;
    private android.content.Context mContext;
    private androidx.appcompat.widget.ActionBarContextView mContextView;
    private java.lang.ref.WeakReference<android.view.View> mCustomView;
    private boolean mFinished;
    private boolean mFocusable;
    private androidx.appcompat.view.menu.MenuBuilder mMenu;

    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
    }

    public void onCloseSubMenu(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
    }

    public StandaloneActionMode(android.content.Context context, androidx.appcompat.widget.ActionBarContextView actionBarContextView, androidx.appcompat.view.ActionMode.Callback callback, boolean z) {
        this.mContext = context;
        this.mContextView = actionBarContextView;
        this.mCallback = callback;
        androidx.appcompat.view.menu.MenuBuilder defaultShowAsAction = new androidx.appcompat.view.menu.MenuBuilder(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.mMenu = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.mFocusable = z;
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitle(java.lang.CharSequence charSequence) {
        this.mContextView.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.mContextView.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitle(int i) {
        setTitle(this.mContext.getString(i));
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setSubtitle(int i) {
        setSubtitle(this.mContext.getString(i));
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        super.setTitleOptionalHint(z);
        this.mContextView.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.ActionMode
    public boolean isTitleOptional() {
        return this.mContextView.isTitleOptional();
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setCustomView(android.view.View view) {
        this.mContextView.setCustomView(view);
        this.mCustomView = view != null ? new java.lang.ref.WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public void invalidate() {
        this.mCallback.onPrepareActionMode(this, this.mMenu);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void finish() {
        if (this.mFinished) {
            return;
        }
        this.mFinished = true;
        this.mCallback.onDestroyActionMode(this);
    }

    @Override // androidx.appcompat.view.ActionMode
    public android.view.Menu getMenu() {
        return this.mMenu;
    }

    @Override // androidx.appcompat.view.ActionMode
    public java.lang.CharSequence getTitle() {
        return this.mContextView.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public java.lang.CharSequence getSubtitle() {
        return this.mContextView.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public android.view.View getCustomView() {
        java.lang.ref.WeakReference<android.view.View> weakReference = this.mCustomView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public android.view.MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.SupportMenuInflater(this.mContextView.getContext());
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
        return this.mCallback.onActionItemClicked(this, menuItem);
    }

    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return true;
        }
        new androidx.appcompat.view.menu.MenuPopupHelper(this.mContextView.getContext(), subMenuBuilder).show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        invalidate();
        this.mContextView.showOverflowMenu();
    }

    @Override // androidx.appcompat.view.ActionMode
    public boolean isUiFocusable() {
        return this.mFocusable;
    }
}
