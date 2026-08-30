package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes5.dex */
abstract class HeaderScrollingViewBehavior extends com.google.android.material.appbar.ViewOffsetBehavior<android.view.View> {
    private int overlayTop;
    final android.graphics.Rect tempRect1;
    final android.graphics.Rect tempRect2;
    private int verticalLayoutGap;

    private static int resolveGravity(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    abstract android.view.View findFirstDependency(java.util.List<android.view.View> list);

    float getOverlapRatioForOffset(android.view.View view) {
        return 1.0f;
    }

    protected boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public HeaderScrollingViewBehavior() {
        this.tempRect1 = new android.graphics.Rect();
        this.tempRect2 = new android.graphics.Rect();
        this.verticalLayoutGap = 0;
    }

    public HeaderScrollingViewBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempRect1 = new android.graphics.Rect();
        this.tempRect2 = new android.graphics.Rect();
        this.verticalLayoutGap = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3, int i4) {
        android.view.View viewFindFirstDependency;
        androidx.core.view.WindowInsetsCompat lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (viewFindFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = android.view.View.MeasureSpec.getSize(i3);
        if (size > 0) {
            if (androidx.core.view.ViewCompat.getFitsSystemWindows(viewFindFirstDependency) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.getSystemWindowInsetTop() + lastWindowInsets.getSystemWindowInsetBottom();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int scrollRange = size + getScrollRange(viewFindFirstDependency);
        int measuredHeight = viewFindFirstDependency.getMeasuredHeight();
        if (shouldHeaderOverlapScrollingChild()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            scrollRange -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i, i2, android.view.View.MeasureSpec.makeMeasureSpec(scrollRange, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    protected void layoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        android.view.View viewFindFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
        if (viewFindFirstDependency != null) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
            android.graphics.Rect rect = this.tempRect1;
            rect.set(coordinatorLayout.getPaddingLeft() + layoutParams.leftMargin, viewFindFirstDependency.getBottom() + layoutParams.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - layoutParams.rightMargin, ((coordinatorLayout.getHeight() + viewFindFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - layoutParams.bottomMargin);
            androidx.core.view.WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && androidx.core.view.ViewCompat.getFitsSystemWindows(coordinatorLayout) && !androidx.core.view.ViewCompat.getFitsSystemWindows(view)) {
                rect.left += lastWindowInsets.getSystemWindowInsetLeft();
                rect.right -= lastWindowInsets.getSystemWindowInsetRight();
            }
            android.graphics.Rect rect2 = this.tempRect2;
            androidx.core.view.GravityCompat.apply(resolveGravity(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(viewFindFirstDependency);
            view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            this.verticalLayoutGap = rect2.top - viewFindFirstDependency.getBottom();
            return;
        }
        super.layoutChild(coordinatorLayout, view, i);
        this.verticalLayoutGap = 0;
    }

    final int getOverlapPixelsForOffset(android.view.View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i = this.overlayTop;
        return androidx.core.math.MathUtils.clamp((int) (overlapRatioForOffset * i), 0, i);
    }

    int getScrollRange(android.view.View view) {
        return view.getMeasuredHeight();
    }

    final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    public final void setOverlayTop(int i) {
        this.overlayTop = i;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }
}
