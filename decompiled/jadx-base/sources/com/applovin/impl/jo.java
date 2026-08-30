package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class jo extends android.view.GestureDetector.SimpleOnGestureListener implements android.view.View.OnTouchListener, com.applovin.impl.wg.a {
    private final com.applovin.impl.jo.a c;
    private final float d;
    private final android.view.GestureDetector e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.graphics.PointF f930a = new android.graphics.PointF();
    private final android.graphics.PointF b = new android.graphics.PointF();
    private volatile float f = 3.1415927f;

    public interface a {
        void a(android.graphics.PointF pointF);

        boolean onSingleTapUp(android.view.MotionEvent motionEvent);
    }

    public jo(android.content.Context context, com.applovin.impl.jo.a aVar, float f) {
        this.c = aVar;
        this.d = f;
        this.e = new android.view.GestureDetector(context, this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        return this.e.onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        this.f930a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f930a.x) / this.d;
        float y = motionEvent2.getY();
        android.graphics.PointF pointF = this.f930a;
        float f3 = (y - pointF.y) / this.d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f;
        float fCos = (float) java.lang.Math.cos(d);
        float fSin = (float) java.lang.Math.sin(d);
        android.graphics.PointF pointF2 = this.b;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = pointF2.y + (fSin * x) + (fCos * f3);
        pointF2.y = f4;
        pointF2.y = java.lang.Math.max(-45.0f, java.lang.Math.min(45.0f, f4));
        this.c.a(this.b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return this.c.onSingleTapUp(motionEvent);
    }

    @Override // com.applovin.impl.wg.a
    public void a(float[] fArr, float f) {
        this.f = -f;
    }
}
