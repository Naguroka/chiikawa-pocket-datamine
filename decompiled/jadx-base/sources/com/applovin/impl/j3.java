package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j3 extends com.applovin.impl.adview.AppLovinWebViewBase {
    private static java.lang.Boolean b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f906a;

    public j3(android.content.Context context) {
        super(context);
        this.f906a = new java.util.concurrent.atomic.AtomicReference();
        if (b == null) {
            try {
                android.webkit.WebView.class.getDeclaredMethod("onTouchEvent", android.view.MotionEvent.class);
                b = java.lang.Boolean.TRUE;
            } catch (java.lang.NoSuchMethodException unused) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                b = java.lang.Boolean.FALSE;
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        this.f906a.set(android.view.MotionEvent.obtain(motionEvent));
        if (b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean a() {
        return this.f906a.get() != null;
    }

    public android.view.MotionEvent getLastClickEvent() {
        return (android.view.MotionEvent) this.f906a.get();
    }

    public android.view.MotionEvent getAndClearLastClickEvent() {
        return (android.view.MotionEvent) this.f906a.getAndSet(null);
    }
}
