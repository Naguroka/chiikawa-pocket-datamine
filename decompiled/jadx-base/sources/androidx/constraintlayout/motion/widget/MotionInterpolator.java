package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class MotionInterpolator implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public abstract float getInterpolation(float v);

    public abstract float getVelocity();
}
