package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends android.widget.ListView implements androidx.appcompat.view.menu.MenuBuilder.ItemInvoker, androidx.appcompat.view.menu.MenuView, android.widget.AdapterView.OnItemClickListener {
    private static final int[] TINT_ATTRS = {android.R.attr.background, android.R.attr.divider};
    private int mAnimations;
    private androidx.appcompat.view.menu.MenuBuilder mMenu;

    public ExpandedMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.listViewStyle);
    }

    public ExpandedMenuView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, TINT_ATTRS, i, 0);
        if (tintTypedArrayObtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(1)) {
            setDivider(tintTypedArrayObtainStyledAttributes.getDrawable(1));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    public boolean invokeItem(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        invokeItem((androidx.appcompat.view.menu.MenuItemImpl) getAdapter().getItem(i));
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return this.mAnimations;
    }
}
