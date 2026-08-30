package com.applovin.adview;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinFullscreenAdViewObserver implements androidx.lifecycle.LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f507a;
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(true);
    private com.applovin.impl.o9 c;
    private com.applovin.impl.sb d;

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        com.applovin.impl.sb sbVar = this.d;
        if (sbVar != null) {
            sbVar.a();
            this.d = null;
        }
        com.applovin.impl.o9 o9Var = this.c;
        if (o9Var != null) {
            o9Var.f();
            this.c.t();
            this.c = null;
        }
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        com.applovin.impl.o9 o9Var = this.c;
        if (o9Var != null) {
            o9Var.u();
            this.c.x();
        }
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME)
    public void onResume() {
        com.applovin.impl.o9 o9Var;
        if (this.b.getAndSet(false) || (o9Var = this.c) == null) {
            return;
        }
        o9Var.v();
        this.c.a(0L);
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP)
    public void onStop() {
        com.applovin.impl.o9 o9Var = this.c;
        if (o9Var != null) {
            o9Var.w();
        }
    }

    public AppLovinFullscreenAdViewObserver(androidx.lifecycle.Lifecycle lifecycle, com.applovin.impl.sb sbVar, com.applovin.impl.sdk.j jVar) {
        this.d = sbVar;
        this.f507a = jVar;
        lifecycle.addObserver(this);
    }

    public void setPresenter(com.applovin.impl.o9 o9Var) {
        this.c = o9Var;
    }
}
