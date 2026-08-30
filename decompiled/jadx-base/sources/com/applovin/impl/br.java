package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class br {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f660a;
    private final java.lang.Runnable e;
    private final android.view.ViewTreeObserver.OnPreDrawListener f;
    private final java.lang.ref.WeakReference g;
    private final long h;
    private int k;
    private float l;
    private float m;
    private long n;
    private final java.lang.Object b = new java.lang.Object();
    private final android.graphics.Rect c = new android.graphics.Rect();
    private java.lang.ref.WeakReference i = new java.lang.ref.WeakReference(null);
    private java.lang.ref.WeakReference j = new java.lang.ref.WeakReference(null);
    private long o = Long.MIN_VALUE;
    private final android.os.Handler d = new android.os.Handler(android.os.Looper.getMainLooper());

    public interface a {
        void onLogVisibilityImpression();
    }

    public br(final android.view.View view, com.applovin.impl.sdk.j jVar, com.applovin.impl.br.a aVar) {
        this.f660a = jVar.I();
        this.h = ((java.lang.Long) jVar.a(com.applovin.impl.sj.G1)).longValue();
        this.g = new java.lang.ref.WeakReference(view);
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(aVar);
        this.e = new java.lang.Runnable() { // from class: com.applovin.impl.br$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(weakReference);
            }
        };
        this.f = new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.br$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f$0.a(view);
            }
        };
    }

    private void c(android.view.View view) {
        android.view.View viewB = com.applovin.impl.zq.b((android.view.View) this.g.get());
        if (viewB == null) {
            viewB = com.applovin.impl.zq.b(view);
        }
        if (viewB == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f660a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = viewB.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f660a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
            }
        } else {
            this.i = new java.lang.ref.WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f);
        }
    }

    private boolean b(android.view.View view, android.view.View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.c)) {
            return false;
        }
        long jPxToDp = com.applovin.sdk.AppLovinSdkUtils.pxToDp(view2.getContext(), this.c.width()) * com.applovin.sdk.AppLovinSdkUtils.pxToDp(view2.getContext(), this.c.height());
        if (jPxToDp < this.k) {
            return false;
        }
        if ((jPxToDp / (com.applovin.sdk.AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()) * com.applovin.sdk.AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()))) * 100.0f < this.l) {
            return false;
        }
        return (((float) ((long) (this.c.width() * this.c.height()))) / ((float) ((long) (view2.getWidth() * view2.getHeight())))) * 100.0f >= this.m;
    }

    private boolean a(android.view.View view, android.view.View view2) {
        if (!b(view, view2)) {
            return false;
        }
        if (this.o == Long.MIN_VALUE) {
            this.o = android.os.SystemClock.uptimeMillis();
        }
        return android.os.SystemClock.uptimeMillis() - this.o >= this.n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.ref.WeakReference weakReference) {
        android.view.View view = (android.view.View) this.g.get();
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        android.view.View view2 = (android.view.View) this.j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (a(viewGroup, view2)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f660a.a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
            }
            b();
            com.applovin.impl.br.a aVar = (com.applovin.impl.br.a) weakReference.get();
            if (aVar != null) {
                aVar.onLogVisibilityImpression();
                return;
            }
            return;
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(android.view.View view) {
        a();
        b(view);
        return true;
    }

    private void b(android.view.View view) {
        android.view.ViewTreeObserver viewTreeObserver = (android.view.ViewTreeObserver) this.i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f);
        } else if (view != null) {
            android.view.ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f);
            } else if (com.applovin.impl.sdk.n.a()) {
                this.f660a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.n.a()) {
            this.f660a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.i.clear();
    }

    private void a() {
        this.d.postDelayed(this.e, this.h);
    }

    public void b() {
        synchronized (this.b) {
            this.d.removeMessages(0);
            b((android.view.View) this.g.get());
            this.o = Long.MIN_VALUE;
            this.j.clear();
        }
    }

    public void a(int i, float f, float f2, long j, android.view.View view) {
        synchronized (this.b) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f660a.a("VisibilityTracker", "Tracking visibility for " + view);
            }
            b();
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(view);
            this.j = weakReference;
            this.k = i;
            this.l = f;
            this.m = f2;
            this.n = j;
            c((android.view.View) weakReference.get());
        }
    }

    public void a(com.applovin.impl.me meVar) {
        android.view.View viewO0;
        if (meVar instanceof com.applovin.impl.ge) {
            viewO0 = meVar.y();
        } else if (!(meVar instanceof com.applovin.impl.ie)) {
            return;
        } else {
            viewO0 = ((com.applovin.impl.ie) meVar).o0();
        }
        a(meVar.g0(), meVar.i0(), meVar.j0(), meVar.k0(), viewO0);
    }
}
