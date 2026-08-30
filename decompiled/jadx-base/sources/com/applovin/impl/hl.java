package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class hl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.WeakHashMap f855a = new java.util.WeakHashMap();
    private final java.lang.Object b = new java.lang.Object();
    private final android.os.Handler c = new android.os.Handler();
    private boolean d = false;
    private final java.lang.ref.WeakReference e;
    private final android.view.ViewTreeObserver.OnPreDrawListener f;
    private com.applovin.impl.hl.a g;

    public interface a {
        void a(int i, int i2);
    }

    public hl(android.view.View view) {
        this.e = new java.lang.ref.WeakReference(view);
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener = new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.hl$$ExternalSyntheticLambda1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    return this.f$0.b();
                }
            };
            this.f = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
            return;
        }
        this.f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    public void a() {
        android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.g = null;
        android.view.View view = (android.view.View) this.e.get();
        if (view != null) {
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.e.clear();
        }
    }

    private void d() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.postDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.hl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.b) {
            this.d = false;
            int iMin = -1;
            int iMax = -1;
            for (java.util.Map.Entry entry : this.f855a.entrySet()) {
                if (a((android.view.View) entry.getKey())) {
                    java.lang.Integer num = (java.lang.Integer) entry.getValue();
                    if (iMin == -1 && iMax == -1) {
                        iMin = num.intValue();
                        iMax = num.intValue();
                    } else {
                        iMin = java.lang.Math.min(iMin, ((java.lang.Integer) entry.getValue()).intValue());
                        iMax = java.lang.Math.max(iMax, ((java.lang.Integer) entry.getValue()).intValue());
                    }
                }
            }
            com.applovin.impl.hl.a aVar = this.g;
            if (aVar != null) {
                aVar.a(iMin, iMax);
            }
        }
    }

    public void b(android.view.View view) {
        synchronized (this.b) {
            this.f855a.remove(view);
        }
    }

    private boolean a(android.view.View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    public void a(com.applovin.impl.hl.a aVar) {
        this.g = aVar;
    }

    public void a(android.view.View view, int i) {
        synchronized (this.b) {
            this.f855a.put(view, java.lang.Integer.valueOf(i));
            d();
        }
    }
}
