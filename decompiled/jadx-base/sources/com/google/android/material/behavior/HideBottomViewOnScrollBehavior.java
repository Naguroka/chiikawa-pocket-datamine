package com.google.android.material.behavior;

/* JADX INFO: loaded from: classes5.dex */
public class HideBottomViewOnScrollBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {
    protected static final int ENTER_ANIMATION_DURATION = 225;
    protected static final int EXIT_ANIMATION_DURATION = 175;
    public static final int STATE_SCROLLED_DOWN = 1;
    public static final int STATE_SCROLLED_UP = 2;
    private int additionalHiddenOffsetY;
    private android.view.ViewPropertyAnimator currentAnimator;
    private int currentState;
    private int height;
    private final java.util.LinkedHashSet<com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener> onScrollStateChangedListeners;

    public interface OnScrollStateChangedListener {
        void onStateChanged(android.view.View view, int i);
    }

    public @interface ScrollState {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, android.view.View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
        this.onScrollStateChangedListeners = new java.util.LinkedHashSet<>();
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }

    public HideBottomViewOnScrollBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onScrollStateChangedListeners = new java.util.LinkedHashSet<>();
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i) {
        this.height = v.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    public void setAdditionalHiddenOffsetY(V v, int i) {
        this.additionalHiddenOffsetY = i;
        if (this.currentState == 1) {
            v.setTranslationY(this.height + i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            slideDown(v);
        } else if (i2 < 0) {
            slideUp(v);
        }
    }

    public boolean isScrolledUp() {
        return this.currentState == 2;
    }

    public void slideUp(V v) {
        slideUp(v, true);
    }

    public void slideUp(V v, boolean z) {
        if (isScrolledUp()) {
            return;
        }
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        updateCurrentState(v, 2);
        if (z) {
            animateChildTo(v, 0, 225L, com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        } else {
            v.setTranslationY(0);
        }
    }

    public boolean isScrolledDown() {
        return this.currentState == 1;
    }

    public void slideDown(V v) {
        slideDown(v, true);
    }

    public void slideDown(V v, boolean z) {
        if (isScrolledDown()) {
            return;
        }
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        updateCurrentState(v, 1);
        int i = this.height + this.additionalHiddenOffsetY;
        if (z) {
            animateChildTo(v, i, 175L, com.google.android.material.animation.AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        } else {
            v.setTranslationY(i);
        }
    }

    private void updateCurrentState(V v, int i) {
        this.currentState = i;
        java.util.Iterator<com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener> it = this.onScrollStateChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v, this.currentState);
        }
    }

    private void animateChildTo(V v, int i, long j, android.animation.TimeInterpolator timeInterpolator) {
        this.currentAnimator = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.behavior.HideBottomViewOnScrollBehavior.this.currentAnimator = null;
            }
        });
    }

    public void addOnScrollStateChangedListener(com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.add(onScrollStateChangedListener);
    }

    public void removeOnScrollStateChangedListener(com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.remove(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        this.onScrollStateChangedListeners.clear();
    }
}
