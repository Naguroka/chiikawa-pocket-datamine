package androidx.media3.exoplayer.video.spherical;

/* JADX INFO: loaded from: classes.dex */
final class TouchTracker extends android.view.GestureDetector.SimpleOnGestureListener implements android.view.View.OnTouchListener, androidx.media3.exoplayer.video.spherical.OrientationListener.Listener {
    static final float MAX_PITCH_DEGREES = 45.0f;
    private final android.view.GestureDetector gestureDetector;
    private final androidx.media3.exoplayer.video.spherical.TouchTracker.Listener listener;
    private final float pxPerDegrees;
    private final android.graphics.PointF previousTouchPointPx = new android.graphics.PointF();
    private final android.graphics.PointF accumulatedTouchOffsetDegrees = new android.graphics.PointF();
    private volatile float roll = 3.1415927f;

    public interface Listener {
        void onScrollChange(android.graphics.PointF pointF);

        default boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
            return false;
        }
    }

    public TouchTracker(android.content.Context context, androidx.media3.exoplayer.video.spherical.TouchTracker.Listener listener, float f) {
        this.listener = listener;
        this.pxPerDegrees = f;
        this.gestureDetector = new android.view.GestureDetector(context, this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        return this.gestureDetector.onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        this.previousTouchPointPx.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.previousTouchPointPx.x) / this.pxPerDegrees;
        float y = (motionEvent2.getY() - this.previousTouchPointPx.y) / this.pxPerDegrees;
        this.previousTouchPointPx.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.roll;
        float fCos = (float) java.lang.Math.cos(d);
        float fSin = (float) java.lang.Math.sin(d);
        this.accumulatedTouchOffsetDegrees.x -= (fCos * x) - (fSin * y);
        this.accumulatedTouchOffsetDegrees.y += (fSin * x) + (fCos * y);
        android.graphics.PointF pointF = this.accumulatedTouchOffsetDegrees;
        pointF.y = java.lang.Math.max(-45.0f, java.lang.Math.min(MAX_PITCH_DEGREES, pointF.y));
        this.listener.onScrollChange(this.accumulatedTouchOffsetDegrees);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return this.listener.onSingleTapUp(motionEvent);
    }

    @Override // androidx.media3.exoplayer.video.spherical.OrientationListener.Listener
    public void onOrientationChange(float[] fArr, float f) {
        this.roll = -f;
    }
}
