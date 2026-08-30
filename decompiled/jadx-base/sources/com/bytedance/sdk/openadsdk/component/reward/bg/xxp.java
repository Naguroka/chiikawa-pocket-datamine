package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class xxp {
    private final com.bytedance.sdk.openadsdk.core.model.tuV IL;
    private final android.content.Context bX;
    com.bytedance.sdk.openadsdk.core.widget.WR bg;
    private final int eqN;
    private android.animation.AnimatorSet iR;
    private com.bytedance.sdk.openadsdk.core.widget.Kg ldr;
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg zx;

    public xxp(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.bX = bgVar.Dxa;
        this.IL = bgVar.IL;
        this.eqN = bgVar.GvG;
        this.zx = bgVar;
    }

    public void bg() {
        try {
            if (com.bytedance.sdk.openadsdk.core.model.rri.bX(this.IL)) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.widget.Kg kg = new com.bytedance.sdk.openadsdk.core.widget.Kg(this.bX);
            this.ldr = kg;
            this.bg = kg.getLoadingProgressBar();
            com.bytedance.sdk.openadsdk.core.zx.Kg downloadButton = this.ldr.getDownloadButton();
            if (downloadButton != null) {
                downloadButton.setOnClickListener(this.zx.DDQ.zx());
            }
            this.ldr.bg(this.IL, this.eqN);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void IL() {
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(1, 80);
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.xxp.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                int iIntValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
                if (com.bytedance.sdk.openadsdk.component.reward.bg.xxp.this.bg != null) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.xxp.this.bg.setProgress(iIntValue);
                }
            }
        });
        android.animation.ValueAnimator valueAnimatorOfInt2 = android.animation.ValueAnimator.ofInt(81, 99);
        valueAnimatorOfInt2.setDuration(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        valueAnimatorOfInt2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.xxp.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                int iIntValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
                if (com.bytedance.sdk.openadsdk.component.reward.bg.xxp.this.bg != null) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.xxp.this.bg.setProgress(iIntValue);
                }
            }
        });
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.iR = animatorSet;
        animatorSet.play(valueAnimatorOfInt).before(valueAnimatorOfInt2);
        this.iR.start();
    }

    public void bX() {
        android.animation.AnimatorSet animatorSet = this.iR;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public android.view.View eqN() {
        return this.ldr;
    }
}
