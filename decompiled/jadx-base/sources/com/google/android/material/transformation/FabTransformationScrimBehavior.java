package com.google.android.material.transformation;

/* JADX INFO: loaded from: classes5.dex */
@java.lang.Deprecated
public class FabTransformationScrimBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {
    public static final long COLLAPSE_DELAY = 0;
    public static final long COLLAPSE_DURATION = 150;
    public static final long EXPAND_DELAY = 75;
    public static final long EXPAND_DURATION = 150;
    private final com.google.android.material.animation.MotionTiming collapseTiming;
    private final com.google.android.material.animation.MotionTiming expandTiming;

    public FabTransformationScrimBehavior() {
        this.expandTiming = new com.google.android.material.animation.MotionTiming(75L, 150L);
        this.collapseTiming = new com.google.android.material.animation.MotionTiming(0L, 150L);
    }

    public FabTransformationScrimBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.expandTiming = new com.google.android.material.animation.MotionTiming(75L, 150L);
        this.collapseTiming = new com.google.android.material.animation.MotionTiming(0L, 150L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        return view2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        return super.onTouchEvent(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected android.animation.AnimatorSet onCreateExpandedStateChangeAnimation(android.view.View view, final android.view.View view2, final boolean z, boolean z2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        createScrimAnimation(view2, z, z2, arrayList, new java.util.ArrayList());
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        com.google.android.material.animation.AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationScrimBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                if (z) {
                    view2.setVisibility(0);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (z) {
                    return;
                }
                view2.setVisibility(4);
            }
        });
        return animatorSet;
    }

    private void createScrimAnimation(android.view.View view, boolean z, boolean z2, java.util.List<android.animation.Animator> list, java.util.List<android.animation.Animator.AnimatorListener> list2) {
        android.animation.ObjectAnimator objectAnimatorOfFloat;
        com.google.android.material.animation.MotionTiming motionTiming = z ? this.expandTiming : this.collapseTiming;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 0.0f);
        }
        motionTiming.apply(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }
}
