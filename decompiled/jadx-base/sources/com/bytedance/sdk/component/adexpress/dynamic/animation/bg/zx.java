package com.bytedance.sdk.component.adexpress.dynamic.animation.bg;

/* JADX INFO: loaded from: classes3.dex */
public class zx extends com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN {
    public zx(android.view.View view, com.bytedance.sdk.component.adexpress.dynamic.eqN.bg bgVar) {
        super(view, bgVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN
    java.util.List<android.animation.ObjectAnimator> bg() {
        byte b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        switch (this.IL.LZ()) {
            case "both":
                b = 0;
                break;
            case "none":
                b = 3;
                break;
            case "forwards":
                b = 1;
                break;
            case "backwards":
                b = 2;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            bg(arrayList);
        } else if (b == 1) {
            eqN(arrayList);
        } else if (b == 2) {
            IL(arrayList);
        } else {
            bX(arrayList);
        }
        return arrayList;
    }

    private void bg(java.util.List<android.animation.ObjectAnimator> list) {
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.bX, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.IL.Fy())).setDuration(((int) (this.IL.eo() * 1000.0d)) / 2);
        duration.setInterpolator(new android.view.animation.LinearInterpolator());
        duration.setRepeatMode(2);
        this.IL.ldr(this.IL.Lq() * 2);
        list.add(bg(duration));
    }

    private void IL(java.util.List<android.animation.ObjectAnimator> list) {
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.bX, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.IL.Fy())).setDuration((int) (this.IL.eo() * 1000.0d));
        duration.setInterpolator(new android.view.animation.BounceInterpolator());
        duration.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.zx.1
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
                com.bytedance.sdk.component.adexpress.dynamic.animation.bg.zx.this.bX.setTranslationY(0.0f);
            }
        });
        list.add(bg(duration));
    }

    private void bX(java.util.List<android.animation.ObjectAnimator> list) {
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.bX, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.IL.Fy())).setDuration((int) (this.IL.eo() * 1000.0d));
        duration.setInterpolator(new android.view.animation.BounceInterpolator());
        duration.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.zx.2
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
                com.bytedance.sdk.component.adexpress.dynamic.animation.bg.zx.this.bX.setTranslationY(0.0f);
            }
        });
        list.add(bg(duration));
    }

    private void eqN(java.util.List<android.animation.ObjectAnimator> list) {
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.bX, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.IL.Fy())).setDuration((int) (this.IL.eo() * 1000.0d));
        duration.setInterpolator(new android.view.animation.BounceInterpolator());
        list.add(bg(duration));
    }
}
