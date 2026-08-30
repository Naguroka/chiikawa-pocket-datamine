package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr {
    private int Fy;
    android.animation.ObjectAnimator IL;
    private java.lang.Runnable LZ;
    android.animation.ObjectAnimator bg;

    /* JADX INFO: Access modifiers changed from: private */
    public void bg() {
        final android.view.View childAt = getChildAt(this.Fy);
        final android.view.View childAt2 = getChildAt((this.Fy + 1) % getChildCount());
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(childAt, "translationY", 0.0f, (-(this.Kg + getChildAt(this.Fy).getHeight())) / 2);
        this.bg = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        this.bg.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.eqN.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                childAt.setVisibility(8);
            }
        });
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(childAt2, "translationY", (this.Kg + childAt2.getHeight()) / 2, 0.0f);
        this.IL = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setInterpolator(new android.view.animation.LinearInterpolator());
        this.IL.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.eqN.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                childAt2.setVisibility(0);
            }
        });
        this.bg.setDuration(500L);
        this.IL.setDuration(500L);
        this.bg.start();
        this.IL.start();
        int i = this.Fy + 1;
        this.Fy = i;
        this.Fy = i % getChildCount();
        postDelayed(this.LZ, 2000L);
    }

    public eqN(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        this.Fy = 0;
        this.LZ = new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.eqN.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.eqN.this.bg();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < getChildCount(); i++) {
            android.view.View childAt = getChildAt(i);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.Kg - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.LZ, 2500L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZQc
    public void IL() {
        removeCallbacks(this.LZ);
        android.animation.ObjectAnimator objectAnimator = this.bg;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.bg.cancel();
        }
        android.animation.ObjectAnimator objectAnimator2 = this.IL;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.IL.cancel();
        }
        super.IL();
    }
}
