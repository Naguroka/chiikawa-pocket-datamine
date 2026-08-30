package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinTouchToClickListener implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f593a;
    private final int b;
    private final int c;
    private final com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState d;
    private long e;
    private android.graphics.PointF f;
    private boolean g;
    private final android.content.Context h;
    private final com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener i;

    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    public interface OnClickListener {
        void onClick(android.view.View view, android.view.MotionEvent motionEvent);
    }

    private void a(android.view.View view, android.view.MotionEvent motionEvent) {
        this.i.onClick(view, motionEvent);
        this.g = true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.g && this.d == com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.g && this.d == com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.d == com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.DISABLED) {
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.e;
                float fA = a(this.f, new android.graphics.PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.g) {
                    long j = this.f593a;
                    if ((j < 0 || jElapsedRealtime < j) && ((i = this.b) < 0 || fA < i)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.d != com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN) {
            this.e = android.os.SystemClock.elapsedRealtime();
            this.f = new android.graphics.PointF(motionEvent.getX(), motionEvent.getY());
            this.g = false;
        } else if (a(motionEvent)) {
            a(view, motionEvent);
        }
        return true;
    }

    private float a(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        return a((float) java.lang.Math.sqrt((f * f) + (f2 * f2)));
    }

    private float a(float f) {
        return f / this.h.getResources().getDisplayMetrics().density;
    }

    private boolean a(android.view.MotionEvent motionEvent) {
        if (this.c <= 0) {
            return true;
        }
        android.graphics.Point pointB = com.applovin.impl.z3.b(this.h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i = this.c;
        float f = i;
        return rawX >= f && rawY >= f && rawX <= ((float) (pointB.x - i)) && rawY <= ((float) (pointB.y - i));
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.j jVar, com.applovin.impl.sj sjVar, android.content.Context context, com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener onClickListener) {
        this.f593a = ((java.lang.Long) jVar.a(com.applovin.impl.sj.h0)).longValue();
        this.b = ((java.lang.Integer) jVar.a(com.applovin.impl.sj.i0)).intValue();
        this.c = com.applovin.sdk.AppLovinSdkUtils.dpToPx(context, ((java.lang.Integer) jVar.a(com.applovin.impl.sj.n0)).intValue());
        this.d = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.values()[((java.lang.Integer) jVar.a(sjVar)).intValue()];
        this.h = context;
        this.i = onClickListener;
    }
}
