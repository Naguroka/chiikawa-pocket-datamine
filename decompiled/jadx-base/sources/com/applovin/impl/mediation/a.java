package com.applovin.impl.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class a extends com.applovin.impl.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.q f1037a;
    private final com.applovin.impl.sdk.n b;
    private final java.lang.String c = com.applovin.impl.yp.l(com.applovin.impl.sdk.j.m());
    private com.applovin.impl.mediation.a.InterfaceC0039a d;
    private com.applovin.impl.he e;
    private boolean f;
    private int g;
    private boolean h;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0039a {
        void b(com.applovin.impl.he heVar);
    }

    a(com.applovin.impl.sdk.j jVar) {
        this.b = jVar.I();
        this.f1037a = jVar.e();
    }

    public void a(boolean z) {
        this.f = z;
    }

    @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (!activity.getClass().getName().equals(this.c) || (!this.e.t0() && !this.f)) {
            if (!this.h) {
                this.h = true;
            }
            this.g++;
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.g);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
        }
        if (this.d != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AdActivityObserver", "Invoking callback...");
            }
            this.d.b(this.e);
        }
        a();
    }

    @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if (this.h) {
            this.g--;
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.g);
            }
            if (this.g <= 0) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.a("AdActivityObserver", "Last ad Activity destroyed");
                }
                if (this.d != null) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.b.a("AdActivityObserver", "Invoking callback...");
                    }
                    this.d.b(this.e);
                }
                a();
            }
        }
    }

    public void a(com.applovin.impl.he heVar, com.applovin.impl.mediation.a.InterfaceC0039a interfaceC0039a) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AdActivityObserver", "Starting for ad " + heVar.getAdUnitId() + "...");
        }
        a();
        this.d = interfaceC0039a;
        this.e = heVar;
        this.f1037a.a(this);
    }

    public void a() {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AdActivityObserver", "Cancelling...");
        }
        this.f1037a.b(this);
        this.d = null;
        this.e = null;
        this.g = 0;
        this.h = false;
    }
}
