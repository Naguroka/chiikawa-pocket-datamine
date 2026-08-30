package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class bX extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr {
    private int Fy;
    android.animation.ObjectAnimator IL;
    private boolean LZ;
    android.animation.ObjectAnimator bg;
    private java.lang.Runnable tC;

    public bX(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        this.Fy = 0;
        this.LZ = false;
        this.tC = new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bX.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bX.this.bg();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg() {
        final android.view.View childAt;
        final android.view.View childAt2 = getChildAt(this.Fy);
        if (childAt2 == null) {
            return;
        }
        int i = this.Fy;
        if (i == 0) {
            this.LZ = false;
        }
        if (i + 1 >= getChildCount() || ((android.view.ViewGroup) getChildAt(this.Fy + 1)).getChildCount() <= 0) {
            this.LZ = true;
            childAt = getChildAt(this.Fy - 1);
            this.bg = android.animation.ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (this.iR + getChildAt(this.Fy).getWidth()) / 2);
        } else {
            childAt = getChildAt(this.Fy + 1);
            this.bg = android.animation.ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (-(this.iR + getChildAt(this.Fy).getWidth())) / 2);
        }
        if (childAt == null) {
            return;
        }
        this.bg.setInterpolator(new android.view.animation.LinearInterpolator());
        this.bg.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bX.2
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
                childAt2.setVisibility(8);
            }
        });
        if (this.LZ) {
            this.IL = android.animation.ObjectAnimator.ofFloat(childAt, "translationX", (-(this.iR + childAt.getWidth())) / 2, 0.0f);
        } else {
            this.IL = android.animation.ObjectAnimator.ofFloat(childAt, "translationX", (this.iR + childAt.getWidth()) / 2, 0.0f);
        }
        this.IL.setInterpolator(new android.view.animation.LinearInterpolator());
        this.IL.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bX.3
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
                childAt.setVisibility(0);
            }
        });
        this.bg.setDuration(500L);
        this.IL.setDuration(500L);
        this.bg.start();
        this.IL.start();
        if (this.LZ) {
            this.Fy--;
        } else {
            this.Fy++;
        }
        postDelayed(this.tC, 2000L);
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
        postDelayed(this.tC, 2500L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZQc
    public void IL() {
        removeCallbacks(this.tC);
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
