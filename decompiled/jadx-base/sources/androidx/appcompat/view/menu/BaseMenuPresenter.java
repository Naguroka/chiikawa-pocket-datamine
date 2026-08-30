package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMenuPresenter implements androidx.appcompat.view.menu.MenuPresenter {
    private androidx.appcompat.view.menu.MenuPresenter.Callback mCallback;
    protected android.content.Context mContext;
    private int mId;
    protected android.view.LayoutInflater mInflater;
    private int mItemLayoutRes;
    protected androidx.appcompat.view.menu.MenuBuilder mMenu;
    private int mMenuLayoutRes;
    protected androidx.appcompat.view.menu.MenuView mMenuView;
    protected android.content.Context mSystemContext;
    protected android.view.LayoutInflater mSystemInflater;

    public abstract void bindItemView(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl, androidx.appcompat.view.menu.MenuView.ItemView itemView);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    public boolean shouldIncludeItem(int i, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return true;
    }

    public BaseMenuPresenter(android.content.Context context, int i, int i2) {
        this.mSystemContext = context;
        this.mSystemInflater = android.view.LayoutInflater.from(context);
        this.mMenuLayoutRes = i;
        this.mItemLayoutRes = i2;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        this.mContext = context;
        this.mInflater = android.view.LayoutInflater.from(context);
        this.mMenu = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup viewGroup) {
        if (this.mMenuView == null) {
            androidx.appcompat.view.menu.MenuView menuView = (androidx.appcompat.view.menu.MenuView) this.mSystemInflater.inflate(this.mMenuLayoutRes, viewGroup, false);
            this.mMenuView = menuView;
            menuView.initialize(this.mMenu);
            updateMenuView(true);
        }
        return this.mMenuView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.mMenuView;
        if (viewGroup == null) {
            return;
        }
        androidx.appcompat.view.menu.MenuBuilder menuBuilder = this.mMenu;
        int i = 0;
        if (menuBuilder != null) {
            menuBuilder.flagActionItems();
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> visibleItems = this.mMenu.getVisibleItems();
            int size = visibleItems.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = visibleItems.get(i3);
                if (shouldIncludeItem(i2, menuItemImpl)) {
                    android.view.View childAt = viewGroup.getChildAt(i2);
                    androidx.appcompat.view.menu.MenuItemImpl itemData = childAt instanceof androidx.appcompat.view.menu.MenuView.ItemView ? ((androidx.appcompat.view.menu.MenuView.ItemView) childAt).getItemData() : null;
                    android.view.View itemView = getItemView(menuItemImpl, childAt, viewGroup);
                    if (menuItemImpl != itemData) {
                        itemView.setPressed(false);
                        itemView.jumpDrawablesToCurrentState();
                    }
                    if (itemView != childAt) {
                        addItemView(itemView, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!filterLeftoverView(viewGroup, i)) {
                i++;
            }
        }
    }

    protected void addItemView(android.view.View view, int i) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((android.view.ViewGroup) this.mMenuView).addView(view, i);
    }

    protected boolean filterLeftoverView(android.view.ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
        this.mCallback = callback;
    }

    public androidx.appcompat.view.menu.MenuPresenter.Callback getCallback() {
        return this.mCallback;
    }

    public androidx.appcompat.view.menu.MenuView.ItemView createItemView(android.view.ViewGroup viewGroup) {
        return (androidx.appcompat.view.menu.MenuView.ItemView) this.mSystemInflater.inflate(this.mItemLayoutRes, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public android.view.View getItemView(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl, android.view.View view, android.view.ViewGroup viewGroup) {
        androidx.appcompat.view.menu.MenuView.ItemView itemViewCreateItemView;
        if (view instanceof androidx.appcompat.view.menu.MenuView.ItemView) {
            itemViewCreateItemView = (androidx.appcompat.view.menu.MenuView.ItemView) view;
        } else {
            itemViewCreateItemView = createItemView(viewGroup);
        }
        bindItemView(menuItemImpl, itemViewCreateItemView);
        return (android.view.View) itemViewCreateItemView;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.mCallback;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.mCallback;
        androidx.appcompat.view.menu.MenuBuilder menuBuilder = subMenuBuilder;
        if (callback == null) {
            return false;
        }
        if (subMenuBuilder == null) {
            menuBuilder = this.mMenu;
        }
        return callback.onOpenSubMenu(menuBuilder);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.mId;
    }

    public void setId(int i) {
        this.mId = i;
    }
}
