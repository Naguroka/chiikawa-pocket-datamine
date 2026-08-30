package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class q implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f1168a = java.util.Collections.synchronizedList(new java.util.ArrayList());
    private java.lang.ref.WeakReference b;
    private java.lang.ref.WeakReference c;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = new java.util.ArrayList(this.f1168a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.p) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        java.util.Iterator it = new java.util.ArrayList(this.f1168a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.p) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = new java.util.ArrayList(this.f1168a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.p) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        java.util.Iterator it = new java.util.ArrayList(this.f1168a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.p) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        java.util.Iterator it = new java.util.ArrayList(this.f1168a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.p) it.next()).onActivityStopped(activity);
        }
    }

    public q(android.content.Context context) {
        this.b = new java.lang.ref.WeakReference(null);
        this.c = new java.lang.ref.WeakReference(null);
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            this.b = new java.lang.ref.WeakReference(activity);
            if (activity.hasWindowFocus()) {
                this.c = this.b;
            }
        }
        ((android.app.Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public android.app.Activity b() {
        return (android.app.Activity) this.b.get();
    }

    public android.app.Activity a() {
        return (android.app.Activity) this.c.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(activity);
        this.b = weakReference;
        this.c = weakReference;
        java.util.Iterator it = new java.util.ArrayList(this.f1168a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.p) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        this.c = new java.lang.ref.WeakReference(null);
        java.util.Iterator it = new java.util.ArrayList(this.f1168a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.p) it.next()).onActivityPaused(activity);
        }
    }

    public void a(com.applovin.impl.p pVar) {
        this.f1168a.add(pVar);
    }

    public void b(com.applovin.impl.p pVar) {
        this.f1168a.remove(pVar);
    }
}
