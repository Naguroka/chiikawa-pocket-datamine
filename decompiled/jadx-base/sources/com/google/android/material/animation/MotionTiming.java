package com.google.android.material.animation;

/* JADX INFO: loaded from: classes5.dex */
public class MotionTiming {
    private long delay;
    private long duration;
    private android.animation.TimeInterpolator interpolator;
    private int repeatCount;
    private int repeatMode;

    public MotionTiming(long j, long j2) {
        this.interpolator = null;
        this.repeatCount = 0;
        this.repeatMode = 1;
        this.delay = j;
        this.duration = j2;
    }

    public MotionTiming(long j, long j2, android.animation.TimeInterpolator timeInterpolator) {
        this.repeatCount = 0;
        this.repeatMode = 1;
        this.delay = j;
        this.duration = j2;
        this.interpolator = timeInterpolator;
    }

    public void apply(android.animation.Animator animator) {
        animator.setStartDelay(getDelay());
        animator.setDuration(getDuration());
        animator.setInterpolator(getInterpolator());
        if (animator instanceof android.animation.ValueAnimator) {
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) animator;
            valueAnimator.setRepeatCount(getRepeatCount());
            valueAnimator.setRepeatMode(getRepeatMode());
        }
    }

    public long getDelay() {
        return this.delay;
    }

    public long getDuration() {
        return this.duration;
    }

    public android.animation.TimeInterpolator getInterpolator() {
        android.animation.TimeInterpolator timeInterpolator = this.interpolator;
        return timeInterpolator != null ? timeInterpolator : com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public int getRepeatMode() {
        return this.repeatMode;
    }

    static com.google.android.material.animation.MotionTiming createFromAnimator(android.animation.ValueAnimator valueAnimator) {
        com.google.android.material.animation.MotionTiming motionTiming = new com.google.android.material.animation.MotionTiming(valueAnimator.getStartDelay(), valueAnimator.getDuration(), getInterpolatorCompat(valueAnimator));
        motionTiming.repeatCount = valueAnimator.getRepeatCount();
        motionTiming.repeatMode = valueAnimator.getRepeatMode();
        return motionTiming;
    }

    private static android.animation.TimeInterpolator getInterpolatorCompat(android.animation.ValueAnimator valueAnimator) {
        android.animation.TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof android.view.animation.AccelerateDecelerateInterpolator) || interpolator == null) {
            return com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        }
        if (interpolator instanceof android.view.animation.AccelerateInterpolator) {
            return com.google.android.material.animation.AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
        }
        return interpolator instanceof android.view.animation.DecelerateInterpolator ? com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR : interpolator;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.material.animation.MotionTiming)) {
            return false;
        }
        com.google.android.material.animation.MotionTiming motionTiming = (com.google.android.material.animation.MotionTiming) obj;
        if (getDelay() == motionTiming.getDelay() && getDuration() == motionTiming.getDuration() && getRepeatCount() == motionTiming.getRepeatCount() && getRepeatMode() == motionTiming.getRepeatMode()) {
            return getInterpolator().getClass().equals(motionTiming.getInterpolator().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (getDelay() ^ (getDelay() >>> 32))) * 31) + ((int) (getDuration() ^ (getDuration() >>> 32)))) * 31) + getInterpolator().getClass().hashCode()) * 31) + getRepeatCount()) * 31) + getRepeatMode();
    }

    public java.lang.String toString() {
        return "\n" + getClass().getName() + '{' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " delay: " + getDelay() + " duration: " + getDuration() + " interpolator: " + getInterpolator().getClass() + " repeatCount: " + getRepeatCount() + " repeatMode: " + getRepeatMode() + "}\n";
    }
}
