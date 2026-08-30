package androidx.appcompat.view;

/* JADX INFO: loaded from: classes.dex */
public class SupportActionModeWrapper extends android.view.ActionMode {
    final android.content.Context mContext;
    final androidx.appcompat.view.ActionMode mWrappedObject;

    public SupportActionModeWrapper(android.content.Context context, androidx.appcompat.view.ActionMode actionMode) {
        this.mContext = context;
        this.mWrappedObject = actionMode;
    }

    @Override // android.view.ActionMode
    public java.lang.Object getTag() {
        return this.mWrappedObject.getTag();
    }

    @Override // android.view.ActionMode
    public void setTag(java.lang.Object obj) {
        this.mWrappedObject.setTag(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(java.lang.CharSequence charSequence) {
        this.mWrappedObject.setTitle(charSequence);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.mWrappedObject.setSubtitle(charSequence);
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.mWrappedObject.invalidate();
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.mWrappedObject.finish();
    }

    @Override // android.view.ActionMode
    public android.view.Menu getMenu() {
        return new androidx.appcompat.view.menu.MenuWrapperICS(this.mContext, (androidx.core.internal.view.SupportMenu) this.mWrappedObject.getMenu());
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getTitle() {
        return this.mWrappedObject.getTitle();
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.mWrappedObject.setTitle(i);
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getSubtitle() {
        return this.mWrappedObject.getSubtitle();
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.mWrappedObject.setSubtitle(i);
    }

    @Override // android.view.ActionMode
    public android.view.View getCustomView() {
        return this.mWrappedObject.getCustomView();
    }

    @Override // android.view.ActionMode
    public void setCustomView(android.view.View view) {
        this.mWrappedObject.setCustomView(view);
    }

    @Override // android.view.ActionMode
    public android.view.MenuInflater getMenuInflater() {
        return this.mWrappedObject.getMenuInflater();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.mWrappedObject.getTitleOptionalHint();
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.mWrappedObject.setTitleOptionalHint(z);
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.mWrappedObject.isTitleOptional();
    }

    public static class CallbackWrapper implements androidx.appcompat.view.ActionMode.Callback {
        final android.content.Context mContext;
        final android.view.ActionMode.Callback mWrappedCallback;
        final java.util.ArrayList<androidx.appcompat.view.SupportActionModeWrapper> mActionModes = new java.util.ArrayList<>();
        final androidx.collection.SimpleArrayMap<android.view.Menu, android.view.Menu> mMenus = new androidx.collection.SimpleArrayMap<>();

        public CallbackWrapper(android.content.Context context, android.view.ActionMode.Callback callback) {
            this.mContext = context;
            this.mWrappedCallback = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onCreateActionMode(androidx.appcompat.view.ActionMode actionMode, android.view.Menu menu) {
            return this.mWrappedCallback.onCreateActionMode(getActionModeWrapper(actionMode), getMenuWrapper(menu));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onPrepareActionMode(androidx.appcompat.view.ActionMode actionMode, android.view.Menu menu) {
            return this.mWrappedCallback.onPrepareActionMode(getActionModeWrapper(actionMode), getMenuWrapper(menu));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onActionItemClicked(androidx.appcompat.view.ActionMode actionMode, android.view.MenuItem menuItem) {
            return this.mWrappedCallback.onActionItemClicked(getActionModeWrapper(actionMode), new androidx.appcompat.view.menu.MenuItemWrapperICS(this.mContext, (androidx.core.internal.view.SupportMenuItem) menuItem));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void onDestroyActionMode(androidx.appcompat.view.ActionMode actionMode) {
            this.mWrappedCallback.onDestroyActionMode(getActionModeWrapper(actionMode));
        }

        private android.view.Menu getMenuWrapper(android.view.Menu menu) {
            android.view.Menu menu2 = this.mMenus.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            androidx.appcompat.view.menu.MenuWrapperICS menuWrapperICS = new androidx.appcompat.view.menu.MenuWrapperICS(this.mContext, (androidx.core.internal.view.SupportMenu) menu);
            this.mMenus.put(menu, menuWrapperICS);
            return menuWrapperICS;
        }

        public android.view.ActionMode getActionModeWrapper(androidx.appcompat.view.ActionMode actionMode) {
            int size = this.mActionModes.size();
            for (int i = 0; i < size; i++) {
                androidx.appcompat.view.SupportActionModeWrapper supportActionModeWrapper = this.mActionModes.get(i);
                if (supportActionModeWrapper != null && supportActionModeWrapper.mWrappedObject == actionMode) {
                    return supportActionModeWrapper;
                }
            }
            androidx.appcompat.view.SupportActionModeWrapper supportActionModeWrapper2 = new androidx.appcompat.view.SupportActionModeWrapper(this.mContext, actionMode);
            this.mActionModes.add(supportActionModeWrapper2);
            return supportActionModeWrapper2;
        }
    }
}
