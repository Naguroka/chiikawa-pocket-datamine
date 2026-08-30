package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.AbsActionBarView {
    private android.view.View mClose;
    private android.view.View mCloseButton;
    private int mCloseItemLayout;
    private android.view.View mCustomView;
    private java.lang.CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private android.widget.TextView mSubtitleView;
    private java.lang.CharSequence mTitle;
    private android.widget.LinearLayout mTitleLayout;
    private boolean mTitleOptional;
    private int mTitleStyleRes;
    private android.widget.TextView mTitleView;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void animateToVisibility(int i) {
        super.animateToVisibility(i);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean canShowOverflowMenu() {
        return super.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void dismissPopupMenus() {
        super.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean isOverflowMenuShowPending() {
        return super.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean isOverflowReserved() {
        return super.isOverflowReserved();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void postShowOverflowMenu() {
        super.postShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ androidx.core.view.ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i, long j) {
        return super.setupAnimatorToVisibility(i, j);
    }

    public ActionBarContextView(android.content.Context context) {
        this(context, null);
    }

    public ActionBarContextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.actionModeStyle);
    }

    public ActionBarContextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.ActionMode, i, 0);
        androidx.core.view.ViewCompat.setBackground(this, tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActionMode_background));
        this.mTitleStyleRes = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionMode_titleTextStyle, 0);
        this.mSubtitleStyleRes = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionMode_subtitleTextStyle, 0);
        this.mContentHeight = tintTypedArrayObtainStyledAttributes.getLayoutDimension(androidx.appcompat.R.styleable.ActionMode_height, 0);
        this.mCloseItemLayout = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionMode_closeItemLayout, androidx.appcompat.R.layout.abc_action_mode_close_item_material);
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.hideOverflowMenu();
            this.mActionMenuPresenter.hideSubMenus();
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int i) {
        this.mContentHeight = i;
    }

    public void setCustomView(android.view.View view) {
        android.widget.LinearLayout linearLayout;
        android.view.View view2 = this.mCustomView;
        if (view2 != null) {
            removeView(view2);
        }
        this.mCustomView = view;
        if (view != null && (linearLayout = this.mTitleLayout) != null) {
            removeView(linearLayout);
            this.mTitleLayout = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.mTitle = charSequence;
        initTitle();
        androidx.core.view.ViewCompat.setAccessibilityPaneTitle(this, charSequence);
    }

    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.mSubtitle = charSequence;
        initTitle();
    }

    public java.lang.CharSequence getTitle() {
        return this.mTitle;
    }

    public java.lang.CharSequence getSubtitle() {
        return this.mSubtitle;
    }

    private void initTitle() {
        if (this.mTitleLayout == null) {
            android.view.LayoutInflater.from(getContext()).inflate(androidx.appcompat.R.layout.abc_action_bar_title_item, this);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) getChildAt(getChildCount() - 1);
            this.mTitleLayout = linearLayout;
            this.mTitleView = (android.widget.TextView) linearLayout.findViewById(androidx.appcompat.R.id.action_bar_title);
            this.mSubtitleView = (android.widget.TextView) this.mTitleLayout.findViewById(androidx.appcompat.R.id.action_bar_subtitle);
            if (this.mTitleStyleRes != 0) {
                this.mTitleView.setTextAppearance(getContext(), this.mTitleStyleRes);
            }
            if (this.mSubtitleStyleRes != 0) {
                this.mSubtitleView.setTextAppearance(getContext(), this.mSubtitleStyleRes);
            }
        }
        this.mTitleView.setText(this.mTitle);
        this.mSubtitleView.setText(this.mSubtitle);
        boolean z = !android.text.TextUtils.isEmpty(this.mTitle);
        boolean z2 = !android.text.TextUtils.isEmpty(this.mSubtitle);
        int i = 0;
        this.mSubtitleView.setVisibility(z2 ? 0 : 8);
        android.widget.LinearLayout linearLayout2 = this.mTitleLayout;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.mTitleLayout.getParent() == null) {
            addView(this.mTitleLayout);
        }
    }

    public void initForMode(final androidx.appcompat.view.ActionMode actionMode) {
        android.view.View view = this.mClose;
        if (view == null) {
            android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(this.mCloseItemLayout, (android.view.ViewGroup) this, false);
            this.mClose = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.mClose);
        }
        android.view.View viewFindViewById = this.mClose.findViewById(androidx.appcompat.R.id.action_mode_close_button);
        this.mCloseButton = viewFindViewById;
        viewFindViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.appcompat.widget.ActionBarContextView.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                actionMode.finish();
            }
        });
        androidx.appcompat.view.menu.MenuBuilder menuBuilder = (androidx.appcompat.view.menu.MenuBuilder) actionMode.getMenu();
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.dismissPopupMenus();
        }
        this.mActionMenuPresenter = new androidx.appcompat.widget.ActionMenuPresenter(getContext());
        this.mActionMenuPresenter.setReserveOverflow(true);
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-2, -1);
        menuBuilder.addMenuPresenter(this.mActionMenuPresenter, this.mPopupContext);
        this.mMenuView = (androidx.appcompat.widget.ActionMenuView) this.mActionMenuPresenter.getMenuView(this);
        androidx.core.view.ViewCompat.setBackground(this.mMenuView, null);
        addView(this.mMenuView, layoutParams);
    }

    public void closeMode() {
        if (this.mClose == null) {
            killMode();
        }
    }

    public void killMode() {
        removeAllViews();
        this.mCustomView = null;
        this.mMenuView = null;
        this.mActionMenuPresenter = null;
        android.view.View view = this.mCloseButton;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean showOverflowMenu() {
        if (this.mActionMenuPresenter != null) {
            return this.mActionMenuPresenter.showOverflowMenu();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean hideOverflowMenu() {
        if (this.mActionMenuPresenter != null) {
            return this.mActionMenuPresenter.hideOverflowMenu();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean isOverflowMenuShowing() {
        if (this.mActionMenuPresenter != null) {
            return this.mActionMenuPresenter.isOverflowMenuShowing();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (android.view.View.MeasureSpec.getMode(i) != 1073741824) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (android.view.View.MeasureSpec.getMode(i2) == 0) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = this.mContentHeight > 0 ? this.mContentHeight : android.view.View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        android.view.View view = this.mClose;
        if (view != null) {
            int iMeasureChildView = measureChildView(view, paddingLeft, iMakeMeasureSpec, 0);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.mClose.getLayoutParams();
            paddingLeft = iMeasureChildView - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        if (this.mMenuView != null && this.mMenuView.getParent() == this) {
            paddingLeft = measureChildView(this.mMenuView, paddingLeft, iMakeMeasureSpec, 0);
        }
        android.widget.LinearLayout linearLayout = this.mTitleLayout;
        if (linearLayout != null && this.mCustomView == null) {
            if (this.mTitleOptional) {
                this.mTitleLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.mTitleLayout.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.mTitleLayout.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = measureChildView(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        android.view.View view2 = this.mCustomView;
        if (view2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (layoutParams.width >= 0) {
                paddingLeft = java.lang.Math.min(layoutParams.width, paddingLeft);
            }
            int i4 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            if (layoutParams.height >= 0) {
                iMin = java.lang.Math.min(layoutParams.height, iMin);
            }
            this.mCustomView.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), android.view.View.MeasureSpec.makeMeasureSpec(iMin, i4));
        }
        if (this.mContentHeight <= 0) {
            int childCount = getChildCount();
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                int measuredHeight = getChildAt(i6).getMeasuredHeight() + paddingTop;
                if (measuredHeight > i5) {
                    i5 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i5);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zIsLayoutRtl = androidx.appcompat.widget.ViewUtils.isLayoutRtl(this);
        int paddingRight = zIsLayoutRtl ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        android.view.View view = this.mClose;
        if (view != null && view.getVisibility() != 8) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.mClose.getLayoutParams();
            int i5 = zIsLayoutRtl ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zIsLayoutRtl ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int next = next(paddingRight, i5, zIsLayoutRtl);
            paddingRight = next(next + positionChild(this.mClose, next, paddingTop, paddingTop2, zIsLayoutRtl), i6, zIsLayoutRtl);
        }
        int iPositionChild = paddingRight;
        android.widget.LinearLayout linearLayout = this.mTitleLayout;
        if (linearLayout != null && this.mCustomView == null && linearLayout.getVisibility() != 8) {
            iPositionChild += positionChild(this.mTitleLayout, iPositionChild, paddingTop, paddingTop2, zIsLayoutRtl);
        }
        int i7 = iPositionChild;
        android.view.View view2 = this.mCustomView;
        if (view2 != null) {
            positionChild(view2, i7, paddingTop, paddingTop2, zIsLayoutRtl);
        }
        int paddingLeft = zIsLayoutRtl ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.mMenuView != null) {
            positionChild(this.mMenuView, paddingLeft, paddingTop, paddingTop2, !zIsLayoutRtl);
        }
    }

    public void setTitleOptional(boolean z) {
        if (z != this.mTitleOptional) {
            requestLayout();
        }
        this.mTitleOptional = z;
    }

    public boolean isTitleOptional() {
        return this.mTitleOptional;
    }
}
