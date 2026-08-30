package com.bytedance.adsdk.ugeno.core;

/* JADX INFO: loaded from: classes3.dex */
public class iR {
    private com.bytedance.adsdk.ugeno.core.bg IL;
    private android.animation.AnimatorSet bX = new android.animation.AnimatorSet();
    android.graphics.Paint bg;
    private android.view.View eqN;
    private java.lang.String iR;
    private int ldr;
    private int zx;

    public iR(android.view.View view, com.bytedance.adsdk.ugeno.core.bg bgVar) {
        this.eqN = view;
        this.IL = bgVar;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.bg = paint;
        paint.setAntiAlias(true);
    }

    public void bg() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<com.bytedance.adsdk.ugeno.core.bg.C0088bg> listBX = this.IL.bX();
        if (listBX == null || listBX.size() <= 0) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.core.bg.C0088bg c0088bg : listBX) {
            if (c0088bg != null) {
                android.animation.ObjectAnimator objectAnimator = new android.animation.ObjectAnimator();
                objectAnimator.setDuration(c0088bg.bg());
                if (android.text.TextUtils.equals(c0088bg.zx(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (android.text.TextUtils.equals(c0088bg.zx(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0088bg.zx());
                }
                objectAnimator.setStartDelay(c0088bg.eqN());
                objectAnimator.setTarget(this.eqN);
                if (android.text.TextUtils.equals(c0088bg.zx(), androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    objectAnimator.setIntValues((int) c0088bg.ldr(), (int) c0088bg.iR());
                    android.util.Log.d("UGenAnimation", "playAnimation: from = " + c0088bg.ldr() + "; to=" + c0088bg.iR());
                } else {
                    objectAnimator.setFloatValues(c0088bg.ldr(), c0088bg.iR());
                }
                int iIL = (int) this.IL.IL();
                if (iIL != 0) {
                    objectAnimator.setRepeatCount(iIL);
                } else {
                    objectAnimator.setRepeatCount((int) c0088bg.IL());
                }
                if (android.text.TextUtils.equals(c0088bg.zx(), androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    objectAnimator.setEvaluator(new android.animation.ArgbEvaluator());
                }
                java.lang.String strLdr = this.IL.ldr();
                if (android.text.TextUtils.isEmpty(strLdr)) {
                    strLdr = c0088bg.bX();
                }
                if (android.text.TextUtils.equals(strLdr, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (c0088bg.Kg() != null && c0088bg.Kg().length > 0) {
                    objectAnimator.setFloatValues(c0088bg.Kg());
                }
                if (android.text.TextUtils.equals(c0088bg.zx(), "rotationX")) {
                    this.eqN.post(new java.lang.Runnable() { // from class: com.bytedance.adsdk.ugeno.core.iR.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.adsdk.ugeno.core.iR.this.eqN.setPivotX(com.bytedance.adsdk.ugeno.core.iR.this.eqN.getWidth() / 2.0f);
                            com.bytedance.adsdk.ugeno.core.iR.this.eqN.setPivotY(com.bytedance.adsdk.ugeno.core.iR.this.eqN.getHeight());
                        }
                    });
                }
                if (android.text.TextUtils.equals(c0088bg.zx(), "ripple")) {
                    this.iR = c0088bg.eo();
                }
                java.lang.String strWR = c0088bg.WR();
                strWR.hashCode();
                switch (strWR) {
                    case "accelerate":
                        objectAnimator.setInterpolator(new android.view.animation.AccelerateInterpolator());
                        break;
                    case "decelerate":
                        objectAnimator.setInterpolator(new android.view.animation.DecelerateInterpolator());
                        break;
                    case "linear":
                    case "standard":
                        objectAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
                        break;
                    case "accelerateDecelerate":
                        objectAnimator.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        if (this.IL.eqN() != 0) {
            this.bX.setDuration(this.IL.eqN());
        }
        this.bX.setStartDelay(this.IL.zx());
        if (android.text.TextUtils.equals(this.IL.bg(), "sequentially")) {
            this.bX.playSequentially(arrayList);
        } else {
            this.bX.playTogether(arrayList);
        }
        this.bX.start();
    }

    public void IL() {
        android.animation.AnimatorSet animatorSet = this.bX;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void bg(android.graphics.Canvas canvas, com.bytedance.adsdk.ugeno.core.IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || android.text.TextUtils.isEmpty(this.iR)) {
                return;
            }
            this.bg.setColor(com.bytedance.adsdk.ugeno.iR.bg.bg(this.iR));
            this.bg.setAlpha(90);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.eqN.getParent();
            viewGroup.setClipChildren(true);
            int i = this.zx;
            int i2 = this.ldr;
            canvas.drawCircle(i, i2, java.lang.Math.min(i, i2) * 2 * iAnimation.getRipple(), this.bg);
        } catch (java.lang.Throwable th) {
            android.util.Log.d("UGenAnimation", "ripple animation error " + th.getMessage());
        }
    }

    public void bg(int i, int i2) {
        this.zx = i / 2;
        this.ldr = i2 / 2;
    }
}
