package com.bytedance.sdk.component.adexpress.dynamic.animation.bg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eqN implements com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZQc {
    com.bytedance.sdk.component.adexpress.dynamic.eqN.bg IL;
    public android.view.View bX;
    private java.util.Set<java.util.concurrent.ScheduledFuture<?>> eqN = new java.util.HashSet();
    public java.util.List<android.animation.ObjectAnimator> bg = bg();

    abstract java.util.List<android.animation.ObjectAnimator> bg();

    public eqN(android.view.View view, com.bytedance.sdk.component.adexpress.dynamic.eqN.bg bgVar) {
        this.bX = view;
        this.IL = bgVar;
    }

    public void bX() {
        java.util.List<android.animation.ObjectAnimator> list = this.bg;
        if (list == null) {
            return;
        }
        for (final android.animation.ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.IL.xxp() > 0.0d) {
                objectAnimator.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(android.animation.Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(android.animation.Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(android.animation.Animator animator) {
                        objectAnimator.pause();
                        com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN.bg bgVar = com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN.this.new bg(objectAnimator);
                        java.util.concurrent.ScheduledFuture<?> scheduledFutureBg = com.bytedance.sdk.component.adexpress.eqN.eqN.bg(bgVar, (long) (com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN.this.IL.xxp() * 1000.0d), java.util.concurrent.TimeUnit.MILLISECONDS);
                        bgVar.bg(scheduledFutureBg);
                        com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN.this.eqN.add(scheduledFutureBg);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZQc
    public void IL() {
        java.util.List<android.animation.ObjectAnimator> list = this.bg;
        if (list == null) {
            return;
        }
        for (android.animation.ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        java.util.Iterator<java.util.concurrent.ScheduledFuture<?>> it = this.eqN.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    android.animation.ObjectAnimator bg(final android.animation.ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.IL.yDt() * 1000.0d));
        if (this.IL.Lq() > 0) {
            objectAnimator.setRepeatCount(this.IL.Lq() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!com.adjust.sdk.Constants.NORMAL.equals(this.IL.vb())) {
            if ("alternate".equals(this.IL.vb()) || "alternate-reverse".equals(this.IL.vb())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.IL.Ta())) {
            objectAnimator.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.IL.vb())) {
            objectAnimator.setInterpolator(new android.view.animation.AccelerateInterpolator());
        } else if ("ease-out".equals(this.IL.vb())) {
            objectAnimator.setInterpolator(new android.view.animation.DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN.this.bX.setVisibility(0);
                    if (com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN.this.bX.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr) {
                        ((android.view.View) com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN.this.bX.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }

    public class bg implements java.lang.Runnable {
        java.util.concurrent.ScheduledFuture<?> IL;
        android.animation.ObjectAnimator bg;

        bg(android.animation.ObjectAnimator objectAnimator) {
            this.bg = objectAnimator;
        }

        public void bg(java.util.concurrent.ScheduledFuture<?> scheduledFuture) {
            this.IL = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX() != null) {
                com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX().bX().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN.bg.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN.bg.this.bg.resume();
                    }
                });
                if (this.IL != null) {
                    com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN.this.eqN.remove(this.IL);
                }
            }
        }
    }
}
