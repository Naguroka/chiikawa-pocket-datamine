package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class MenuItemWrapperICS extends androidx.appcompat.view.menu.BaseMenuWrapper implements android.view.MenuItem {
    static final java.lang.String LOG_TAG = "MenuItemWrapper";
    private java.lang.reflect.Method mSetExclusiveCheckableMethod;
    private final androidx.core.internal.view.SupportMenuItem mWrappedObject;

    public MenuItemWrapperICS(android.content.Context context, androidx.core.internal.view.SupportMenuItem supportMenuItem) {
        super(context);
        if (supportMenuItem == null) {
            throw new java.lang.IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.mWrappedObject = supportMenuItem;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.mWrappedObject.getItemId();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.mWrappedObject.getGroupId();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.mWrappedObject.getOrder();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.mWrappedObject.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int i) {
        this.mWrappedObject.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
        return this.mWrappedObject.getTitle();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.mWrappedObject.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
        return this.mWrappedObject.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.mWrappedObject.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int i) {
        this.mWrappedObject.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
        return this.mWrappedObject.getIcon();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent intent) {
        this.mWrappedObject.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
        return this.mWrappedObject.getIntent();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c, char c2) {
        this.mWrappedObject.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.mWrappedObject.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c) {
        this.mWrappedObject.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c, int i) {
        this.mWrappedObject.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.mWrappedObject.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.mWrappedObject.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c) {
        this.mWrappedObject.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c, int i) {
        this.mWrappedObject.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.mWrappedObject.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.mWrappedObject.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean z) {
        this.mWrappedObject.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.mWrappedObject.isCheckable();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean z) {
        this.mWrappedObject.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.mWrappedObject.isChecked();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean z) {
        return this.mWrappedObject.setVisible(z);
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.mWrappedObject.isVisible();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean z) {
        this.mWrappedObject.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.mWrappedObject.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.mWrappedObject.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
        return getSubMenuWrapper(this.mWrappedObject.getSubMenu());
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mWrappedObject.setOnMenuItemClickListener(onMenuItemClickListener != null ? new androidx.appcompat.view.menu.MenuItemWrapperICS.OnMenuItemClickListenerWrapper(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.mWrappedObject.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.mWrappedObject.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShowAsActionFlags(int i) {
        this.mWrappedObject.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(android.view.View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new androidx.appcompat.view.menu.MenuItemWrapperICS.CollapsibleActionViewWrapper(view);
        }
        this.mWrappedObject.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(int i) {
        this.mWrappedObject.setActionView(i);
        android.view.View actionView = this.mWrappedObject.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            this.mWrappedObject.setActionView(new androidx.appcompat.view.menu.MenuItemWrapperICS.CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.View getActionView() {
        android.view.View actionView = this.mWrappedObject.getActionView();
        return actionView instanceof androidx.appcompat.view.menu.MenuItemWrapperICS.CollapsibleActionViewWrapper ? ((androidx.appcompat.view.menu.MenuItemWrapperICS.CollapsibleActionViewWrapper) actionView).getWrappedView() : actionView;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        androidx.appcompat.view.menu.MenuItemWrapperICS.ActionProviderWrapperJB actionProviderWrapperJB = new androidx.appcompat.view.menu.MenuItemWrapperICS.ActionProviderWrapperJB(this.mContext, actionProvider);
        androidx.core.internal.view.SupportMenuItem supportMenuItem = this.mWrappedObject;
        if (actionProvider == null) {
            actionProviderWrapperJB = null;
        }
        supportMenuItem.setSupportActionProvider(actionProviderWrapperJB);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        androidx.core.view.ActionProvider supportActionProvider = this.mWrappedObject.getSupportActionProvider();
        if (supportActionProvider instanceof androidx.appcompat.view.menu.MenuItemWrapperICS.ActionProviderWrapper) {
            return ((androidx.appcompat.view.menu.MenuItemWrapperICS.ActionProviderWrapper) supportActionProvider).mInner;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.mWrappedObject.expandActionView();
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.mWrappedObject.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.mWrappedObject.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.mWrappedObject.setOnActionExpandListener(onActionExpandListener != null ? new androidx.appcompat.view.menu.MenuItemWrapperICS.OnActionExpandListenerWrapper(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        this.mWrappedObject.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
        return this.mWrappedObject.getContentDescription();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        this.mWrappedObject.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
        return this.mWrappedObject.getTooltipText();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.mWrappedObject.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
        return this.mWrappedObject.getIconTintList();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.mWrappedObject.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.mWrappedObject.getIconTintMode();
    }

    public void setExclusiveCheckable(boolean z) {
        try {
            if (this.mSetExclusiveCheckableMethod == null) {
                this.mSetExclusiveCheckableMethod = this.mWrappedObject.getClass().getDeclaredMethod("setExclusiveCheckable", java.lang.Boolean.TYPE);
            }
            this.mSetExclusiveCheckableMethod.invoke(this.mWrappedObject, java.lang.Boolean.valueOf(z));
        } catch (java.lang.Exception e) {
            android.util.Log.w(LOG_TAG, "Error while calling setExclusiveCheckable", e);
        }
    }

    private class OnMenuItemClickListenerWrapper implements android.view.MenuItem.OnMenuItemClickListener {
        private final android.view.MenuItem.OnMenuItemClickListener mObject;

        OnMenuItemClickListenerWrapper(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.mObject = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem menuItem) {
            return this.mObject.onMenuItemClick(androidx.appcompat.view.menu.MenuItemWrapperICS.this.getMenuItemWrapper(menuItem));
        }
    }

    private class OnActionExpandListenerWrapper implements android.view.MenuItem.OnActionExpandListener {
        private final android.view.MenuItem.OnActionExpandListener mObject;

        OnActionExpandListenerWrapper(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
            this.mObject = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(android.view.MenuItem menuItem) {
            return this.mObject.onMenuItemActionExpand(androidx.appcompat.view.menu.MenuItemWrapperICS.this.getMenuItemWrapper(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(android.view.MenuItem menuItem) {
            return this.mObject.onMenuItemActionCollapse(androidx.appcompat.view.menu.MenuItemWrapperICS.this.getMenuItemWrapper(menuItem));
        }
    }

    private class ActionProviderWrapper extends androidx.core.view.ActionProvider {
        final android.view.ActionProvider mInner;

        ActionProviderWrapper(android.content.Context context, android.view.ActionProvider actionProvider) {
            super(context);
            this.mInner = actionProvider;
        }

        @Override // androidx.core.view.ActionProvider
        public android.view.View onCreateActionView() {
            return this.mInner.onCreateActionView();
        }

        @Override // androidx.core.view.ActionProvider
        public boolean onPerformDefaultAction() {
            return this.mInner.onPerformDefaultAction();
        }

        @Override // androidx.core.view.ActionProvider
        public boolean hasSubMenu() {
            return this.mInner.hasSubMenu();
        }

        @Override // androidx.core.view.ActionProvider
        public void onPrepareSubMenu(android.view.SubMenu subMenu) {
            this.mInner.onPrepareSubMenu(androidx.appcompat.view.menu.MenuItemWrapperICS.this.getSubMenuWrapper(subMenu));
        }
    }

    private class ActionProviderWrapperJB extends androidx.appcompat.view.menu.MenuItemWrapperICS.ActionProviderWrapper implements android.view.ActionProvider.VisibilityListener {
        private androidx.core.view.ActionProvider.VisibilityListener mListener;

        ActionProviderWrapperJB(android.content.Context context, android.view.ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.ActionProvider
        public android.view.View onCreateActionView(android.view.MenuItem menuItem) {
            return this.mInner.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.ActionProvider
        public boolean overridesItemVisibility() {
            return this.mInner.overridesItemVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        public boolean isVisible() {
            return this.mInner.isVisible();
        }

        @Override // androidx.core.view.ActionProvider
        public void refreshVisibility() {
            this.mInner.refreshVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        public void setVisibilityListener(androidx.core.view.ActionProvider.VisibilityListener visibilityListener) {
            this.mListener = visibilityListener;
            this.mInner.setVisibilityListener(visibilityListener != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            androidx.core.view.ActionProvider.VisibilityListener visibilityListener = this.mListener;
            if (visibilityListener != null) {
                visibilityListener.onActionProviderVisibilityChanged(z);
            }
        }
    }

    static class CollapsibleActionViewWrapper extends android.widget.FrameLayout implements androidx.appcompat.view.CollapsibleActionView {
        final android.view.CollapsibleActionView mWrappedView;

        /* JADX WARN: Multi-variable type inference failed */
        CollapsibleActionViewWrapper(android.view.View view) {
            super(view.getContext());
            this.mWrappedView = (android.view.CollapsibleActionView) view;
            addView(view);
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public void onActionViewExpanded() {
            this.mWrappedView.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public void onActionViewCollapsed() {
            this.mWrappedView.onActionViewCollapsed();
        }

        android.view.View getWrappedView() {
            return (android.view.View) this.mWrappedView;
        }
    }
}
