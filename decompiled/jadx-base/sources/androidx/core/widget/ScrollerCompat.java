package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class ScrollerCompat {
    android.widget.OverScroller mScroller;

    @java.lang.Deprecated
    public static androidx.core.widget.ScrollerCompat create(android.content.Context context) {
        return create(context, null);
    }

    @java.lang.Deprecated
    public static androidx.core.widget.ScrollerCompat create(android.content.Context context, android.view.animation.Interpolator interpolator) {
        return new androidx.core.widget.ScrollerCompat(context, interpolator);
    }

    ScrollerCompat(android.content.Context context, android.view.animation.Interpolator interpolator) {
        this.mScroller = interpolator != null ? new android.widget.OverScroller(context, interpolator) : new android.widget.OverScroller(context);
    }

    @java.lang.Deprecated
    public boolean isFinished() {
        return this.mScroller.isFinished();
    }

    @java.lang.Deprecated
    public int getCurrX() {
        return this.mScroller.getCurrX();
    }

    @java.lang.Deprecated
    public int getCurrY() {
        return this.mScroller.getCurrY();
    }

    @java.lang.Deprecated
    public int getFinalX() {
        return this.mScroller.getFinalX();
    }

    @java.lang.Deprecated
    public int getFinalY() {
        return this.mScroller.getFinalY();
    }

    @java.lang.Deprecated
    public float getCurrVelocity() {
        return this.mScroller.getCurrVelocity();
    }

    @java.lang.Deprecated
    public boolean computeScrollOffset() {
        return this.mScroller.computeScrollOffset();
    }

    @java.lang.Deprecated
    public void startScroll(int i, int i2, int i3, int i4) {
        this.mScroller.startScroll(i, i2, i3, i4);
    }

    @java.lang.Deprecated
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.mScroller.startScroll(i, i2, i3, i4, i5);
    }

    @java.lang.Deprecated
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.mScroller.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @java.lang.Deprecated
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.mScroller.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    @java.lang.Deprecated
    public boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.mScroller.springBack(i, i2, i3, i4, i5, i6);
    }

    @java.lang.Deprecated
    public void abortAnimation() {
        this.mScroller.abortAnimation();
    }

    @java.lang.Deprecated
    public void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.mScroller.notifyHorizontalEdgeReached(i, i2, i3);
    }

    @java.lang.Deprecated
    public void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.mScroller.notifyVerticalEdgeReached(i, i2, i3);
    }

    @java.lang.Deprecated
    public boolean isOverScrolled() {
        return this.mScroller.isOverScrolled();
    }
}
