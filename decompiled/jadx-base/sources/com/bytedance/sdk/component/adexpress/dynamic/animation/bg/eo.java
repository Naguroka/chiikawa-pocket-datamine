package com.bytedance.sdk.component.adexpress.dynamic.animation.bg;

/* JADX INFO: loaded from: classes3.dex */
public class eo extends com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN {
    private com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eo.bg eqN;
    private float ldr;
    private float zx;

    public eo(android.view.View view, com.bytedance.sdk.component.adexpress.dynamic.eqN.bg bgVar) {
        super(view, bgVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN
    java.util.List<android.animation.ObjectAnimator> bg() {
        int i;
        java.lang.String str;
        if ((this.bX instanceof android.widget.ImageView) && (this.bX.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx)) {
            this.bX = (android.view.View) this.bX.getParent();
        }
        this.bX.setAlpha(0.0f);
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.bX, "alpha", 0.0f, 1.0f).setDuration((int) (this.IL.eo() * 1000.0d));
        this.eqN = new com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eo.bg(this.bX);
        final int i2 = this.bX.getLayoutParams().height;
        this.zx = i2;
        this.ldr = this.bX.getLayoutParams().width;
        if (androidx.media3.extractor.text.ttml.TtmlNode.LEFT.equals(this.IL.bg()) || androidx.media3.extractor.text.ttml.TtmlNode.RIGHT.equals(this.IL.bg())) {
            i = (int) this.ldr;
            str = "width";
        } else {
            str = "height";
            i = i2;
        }
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofInt(this.eqN, str, 0, i).setDuration((int) (this.IL.eo() * 1000.0d));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bg(duration));
        arrayList.add(bg(duration2));
        ((android.animation.ObjectAnimator) arrayList.get(0)).addListener(new android.animation.Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eo.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eo.this.eqN.bg(i2);
            }
        });
        return arrayList;
    }

    private class bg {
        private android.view.View IL;

        public bg(android.view.View view) {
            this.IL = view;
        }

        public void bg(int i) {
            if ("top".equals(com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eo.this.IL.bg())) {
                if (com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eo.this.bX instanceof android.view.ViewGroup) {
                    for (int i2 = 0; i2 < ((android.view.ViewGroup) com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eo.this.bX).getChildCount(); i2++) {
                        ((android.view.ViewGroup) com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eo.this.bX).getChildAt(i2).setTranslationY(i - com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eo.this.zx);
                    }
                }
                com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eo.this.bX.setTranslationY(com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eo.this.zx - i);
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams = this.IL.getLayoutParams();
            layoutParams.height = i;
            this.IL.setLayoutParams(layoutParams);
            this.IL.requestLayout();
        }
    }
}
