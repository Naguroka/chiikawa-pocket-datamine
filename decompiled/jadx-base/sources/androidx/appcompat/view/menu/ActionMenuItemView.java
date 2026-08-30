package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends androidx.appcompat.widget.AppCompatTextView implements androidx.appcompat.view.menu.MenuView.ItemView, android.view.View.OnClickListener, androidx.appcompat.widget.ActionMenuView.ActionMenuChildView {
    private static final int MAX_ICON_SIZE = 32;
    private static final java.lang.String TAG = "ActionMenuItemView";
    private boolean mAllowTextWithIcon;
    private boolean mExpandedFormat;
    private androidx.appcompat.widget.ForwardingListener mForwardingListener;
    private android.graphics.drawable.Drawable mIcon;
    androidx.appcompat.view.menu.MenuItemImpl mItemData;
    androidx.appcompat.view.menu.MenuBuilder.ItemInvoker mItemInvoker;
    private int mMaxIconSize;
    private int mMinWidth;
    androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback mPopupCallback;
    private int mSavedPaddingLeft;
    private java.lang.CharSequence mTitle;

    public static abstract class PopupCallback {
        public abstract androidx.appcompat.view.menu.ShowableListMenu getPopup();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z, char c) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    public ActionMenuItemView(android.content.Context context) {
        this(context, null);
    }

    public ActionMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.content.res.Resources resources = context.getResources();
        this.mAllowTextWithIcon = shouldAllowTextWithIcon();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.ActionMenuItemView, i, 0);
        this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.mMaxIconSize = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.mSavedPaddingLeft = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mAllowTextWithIcon = shouldAllowTextWithIcon();
        updateTextButtonVisibility();
    }

    @Override // android.widget.TextView, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return android.widget.Button.class.getName();
    }

    private boolean shouldAllowTextWithIcon() {
        android.content.res.Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.mSavedPaddingLeft = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public androidx.appcompat.view.menu.MenuItemImpl getItemData() {
        return this.mItemData;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl, int i) {
        this.mItemData = menuItemImpl;
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitleForItemView(this));
        setId(menuItemImpl.getItemId());
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setEnabled(menuItemImpl.isEnabled());
        if (menuItemImpl.hasSubMenu() && this.mForwardingListener == null) {
            this.mForwardingListener = new androidx.appcompat.view.menu.ActionMenuItemView.ActionMenuItemForwardingListener();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        androidx.appcompat.widget.ForwardingListener forwardingListener;
        if (this.mItemData.hasSubMenu() && (forwardingListener = this.mForwardingListener) != null && forwardingListener.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        androidx.appcompat.view.menu.MenuBuilder.ItemInvoker itemInvoker = this.mItemInvoker;
        if (itemInvoker != null) {
            itemInvoker.invokeItem(this.mItemData);
        }
    }

    public void setItemInvoker(androidx.appcompat.view.menu.MenuBuilder.ItemInvoker itemInvoker) {
        this.mItemInvoker = itemInvoker;
    }

    public void setPopupCallback(androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback popupCallback) {
        this.mPopupCallback = popupCallback;
    }

    public void setExpandedFormat(boolean z) {
        if (this.mExpandedFormat != z) {
            this.mExpandedFormat = z;
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.mItemData;
            if (menuItemImpl != null) {
                menuItemImpl.actionFormatChanged();
            }
        }
    }

    private void updateTextButtonVisibility() {
        boolean z = true;
        boolean z2 = !android.text.TextUtils.isEmpty(this.mTitle);
        if (this.mIcon != null && (!this.mItemData.showsTextAsAction() || (!this.mAllowTextWithIcon && !this.mExpandedFormat))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.mTitle : null);
        java.lang.CharSequence contentDescription = this.mItemData.getContentDescription();
        if (android.text.TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.mItemData.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        java.lang.CharSequence tooltipText = this.mItemData.getTooltipText();
        if (android.text.TextUtils.isEmpty(tooltipText)) {
            androidx.appcompat.widget.TooltipCompat.setTooltipText(this, z3 ? null : this.mItemData.getTitle());
        } else {
            androidx.appcompat.widget.TooltipCompat.setTooltipText(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.mIcon = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.mMaxIconSize;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        updateTextButtonVisibility();
    }

    public boolean hasText() {
        return !android.text.TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(java.lang.CharSequence charSequence) {
        this.mTitle = charSequence;
        updateTextButtonVisibility();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerBefore() {
        return hasText() && this.mItemData.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerAfter() {
        return hasText();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        int iMin;
        int i3;
        boolean zHasText = hasText();
        if (zHasText && (i3 = this.mSavedPaddingLeft) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            iMin = java.lang.Math.min(size, this.mMinWidth);
        } else {
            iMin = this.mMinWidth;
        }
        if (mode != 1073741824 && this.mMinWidth > 0 && measuredWidth < iMin) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zHasText || this.mIcon == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.mIcon.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    private class ActionMenuItemForwardingListener extends androidx.appcompat.widget.ForwardingListener {
        public ActionMenuItemForwardingListener() {
            super(androidx.appcompat.view.menu.ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
            if (androidx.appcompat.view.menu.ActionMenuItemView.this.mPopupCallback != null) {
                return androidx.appcompat.view.menu.ActionMenuItemView.this.mPopupCallback.getPopup();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        protected boolean onForwardingStarted() {
            androidx.appcompat.view.menu.ShowableListMenu popup;
            return androidx.appcompat.view.menu.ActionMenuItemView.this.mItemInvoker != null && androidx.appcompat.view.menu.ActionMenuItemView.this.mItemInvoker.invokeItem(androidx.appcompat.view.menu.ActionMenuItemView.this.mItemData) && (popup = getPopup()) != null && popup.isShowing();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
