package com.bytedance.adsdk.IL.ldr;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg extends android.animation.ValueAnimator {
    private final java.util.Set<android.animation.ValueAnimator.AnimatorUpdateListener> bg = new java.util.concurrent.CopyOnWriteArraySet();
    private final java.util.Set<android.animation.Animator.AnimatorListener> IL = new java.util.concurrent.CopyOnWriteArraySet();
    private final java.util.Set<android.animation.Animator.AnimatorPauseListener> bX = new java.util.concurrent.CopyOnWriteArraySet();

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new java.lang.UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new java.lang.UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public android.animation.ValueAnimator setDuration(long j) {
        throw new java.lang.UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(android.animation.TimeInterpolator timeInterpolator) {
        throw new java.lang.UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.bg.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.bg.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.bg.clear();
    }

    @Override // android.animation.Animator
    public void addListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.IL.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.IL.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.IL.clear();
    }

    void bg(boolean z) {
        for (android.animation.Animator.AnimatorListener animatorListener : this.IL) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void addPauseListener(android.animation.Animator.AnimatorPauseListener animatorPauseListener) {
        this.bX.add(animatorPauseListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(android.animation.Animator.AnimatorPauseListener animatorPauseListener) {
        this.bX.remove(animatorPauseListener);
    }

    void bg() {
        java.util.Iterator<android.animation.Animator.AnimatorListener> it = this.IL.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void IL(boolean z) {
        for (android.animation.Animator.AnimatorListener animatorListener : this.IL) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    void IL() {
        java.util.Iterator<android.animation.Animator.AnimatorListener> it = this.IL.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    void bX() {
        java.util.Iterator<android.animation.ValueAnimator.AnimatorUpdateListener> it = this.bg.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    void eqN() {
        java.util.Iterator<android.animation.Animator.AnimatorPauseListener> it = this.bX.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    void zx() {
        java.util.Iterator<android.animation.Animator.AnimatorPauseListener> it = this.bX.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }
}
