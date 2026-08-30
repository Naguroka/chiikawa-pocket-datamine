package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
abstract class AbsActionBarView extends android.view.ViewGroup {
    private static final int FADE_DURATION = 200;
    protected androidx.appcompat.widget.ActionMenuPresenter mActionMenuPresenter;
    protected int mContentHeight;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    protected androidx.appcompat.widget.ActionMenuView mMenuView;
    protected final android.content.Context mPopupContext;
    protected final androidx.appcompat.widget.AbsActionBarView.VisibilityAnimListener mVisAnimListener;
    protected androidx.core.view.ViewPropertyAnimatorCompat mVisibilityAnim;

    protected static int next(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    AbsActionBarView(android.content.Context context) {
        this(context, null);
    }

    AbsActionBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    AbsActionBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mVisAnimListener = new androidx.appcompat.widget.AbsActionBarView.VisibilityAnimListener();
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.mPopupContext = new android.view.ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.mPopupContext = context;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, androidx.appcompat.R.styleable.ActionBar, androidx.appcompat.R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(androidx.appcompat.R.styleable.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.onConfigurationChanged(configuration);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
        requestLayout();
    }

    public int getContentHeight() {
        return this.mContentHeight;
    }

    public int getAnimatedVisibility() {
        if (this.mVisibilityAnim != null) {
            return this.mVisAnimListener.mFinalVisibility;
        }
        return getVisibility();
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i, long j) {
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mVisibilityAnim;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha = androidx.core.view.ViewCompat.animate(this).alpha(1.0f);
            viewPropertyAnimatorCompatAlpha.setDuration(j);
            viewPropertyAnimatorCompatAlpha.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimatorCompatAlpha, i));
            return viewPropertyAnimatorCompatAlpha;
        }
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha2 = androidx.core.view.ViewCompat.animate(this).alpha(0.0f);
        viewPropertyAnimatorCompatAlpha2.setDuration(j);
        viewPropertyAnimatorCompatAlpha2.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimatorCompatAlpha2, i));
        return viewPropertyAnimatorCompatAlpha2;
    }

    public void animateToVisibility(int i) {
        setupAnimatorToVisibility(i, 200L).start();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mVisibilityAnim;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.cancel();
            }
            super.setVisibility(i);
        }
    }

    public boolean showOverflowMenu() {
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.showOverflowMenu();
        }
        return false;
    }

    public void postShowOverflowMenu() {
        post(new java.lang.Runnable() { // from class: androidx.appcompat.widget.AbsActionBarView.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.appcompat.widget.AbsActionBarView.this.showOverflowMenu();
            }
        });
    }

    public boolean hideOverflowMenu() {
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.hideOverflowMenu();
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.isOverflowMenuShowing();
        }
        return false;
    }

    public boolean isOverflowMenuShowPending() {
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.isOverflowMenuShowPending();
        }
        return false;
    }

    public boolean isOverflowReserved() {
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowReserved();
    }

    public boolean canShowOverflowMenu() {
        return isOverflowReserved() && getVisibility() == 0;
    }

    public void dismissPopupMenus() {
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.dismissPopupMenus();
        }
    }

    protected int measureChildView(android.view.View view, int i, int i2, int i3) {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return java.lang.Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    protected int positionChild(android.view.View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    protected class VisibilityAnimListener implements androidx.core.view.ViewPropertyAnimatorListener {
        private boolean mCanceled = false;
        int mFinalVisibility;

        protected VisibilityAnimListener() {
        }

        public androidx.appcompat.widget.AbsActionBarView.VisibilityAnimListener withFinalVisibility(androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, int i) {
            androidx.appcompat.widget.AbsActionBarView.this.mVisibilityAnim = viewPropertyAnimatorCompat;
            this.mFinalVisibility = i;
            return this;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(android.view.View view) {
            androidx.appcompat.widget.AbsActionBarView.super.setVisibility(0);
            this.mCanceled = false;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(android.view.View view) {
            if (this.mCanceled) {
                return;
            }
            androidx.appcompat.widget.AbsActionBarView.this.mVisibilityAnim = null;
            androidx.appcompat.widget.AbsActionBarView.super.setVisibility(this.mFinalVisibility);
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationCancel(android.view.View view) {
            this.mCanceled = true;
        }
    }
}
