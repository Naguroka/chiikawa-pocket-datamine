package com.json.lifecycle;

/* JADX INFO: loaded from: classes5.dex */
public class b implements android.app.Application.ActivityLifecycleCallbacks {
    private static final com.json.lifecycle.b m = new com.json.lifecycle.b();
    private static java.util.concurrent.atomic.AtomicBoolean n = new java.util.concurrent.atomic.AtomicBoolean(false);
    static final long o = 700;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2890a = 0;
    private int b = 0;
    private boolean c = true;
    private boolean d = true;
    private com.json.jk e = com.json.jk.NONE;
    private final java.util.List<com.json.ik> f = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.lang.Runnable g = new java.lang.Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.f();
        }
    };
    private final java.lang.Runnable h = new java.lang.Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.g();
        }
    };
    private final java.lang.Runnable i = new java.lang.Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda2
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.h();
        }
    };
    private final java.lang.Runnable j = new java.lang.Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda3
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.i();
        }
    };
    private final java.lang.Runnable k = new java.lang.Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda4
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.j();
        }
    };
    private final com.json.lifecycle.a.InterfaceC0237a l = new com.ironsource.lifecycle.b.a();

    class a implements com.json.lifecycle.a.InterfaceC0237a {
        a() {
        }

        @Override // com.json.lifecycle.a.InterfaceC0237a
        public void a(android.app.Activity activity) {
            com.json.lifecycle.b.this.c(activity);
        }

        @Override // com.json.lifecycle.a.InterfaceC0237a
        public void b(android.app.Activity activity) {
        }

        @Override // com.json.lifecycle.a.InterfaceC0237a
        public void onResume(android.app.Activity activity) {
            com.json.lifecycle.b.this.b(activity);
        }
    }

    private void a() {
        if (this.b == 0) {
            this.c = true;
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.h);
            this.e = com.json.jk.PAUSED;
        }
    }

    private void b() {
        if (this.f2890a == 0 && this.c) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.i);
            this.d = true;
            this.e = com.json.jk.STOPPED;
        }
    }

    public static com.json.lifecycle.b d() {
        return m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        java.util.Iterator<com.json.ik> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        java.util.Iterator<com.json.ik> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        java.util.Iterator<com.json.ik> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        java.util.Iterator<com.json.ik> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    void a(android.app.Activity activity) {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.g, 700L);
        }
    }

    void a(android.content.Context context) {
        android.app.Application application;
        if (!n.compareAndSet(false, true) || (application = (android.app.Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    public void a(com.json.ik ikVar) {
        if (!com.json.lifecycle.IronsourceLifecycleProvider.a() || ikVar == null || this.f.contains(ikVar)) {
            return;
        }
        this.f.add(ikVar);
    }

    void b(android.app.Activity activity) {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (!this.c) {
                com.json.environment.thread.IronSourceThreadManager.INSTANCE.removeUiThreadTask(this.g);
                return;
            }
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.j);
            this.c = false;
            this.e = com.json.jk.RESUMED;
        }
    }

    public void b(com.json.ik ikVar) {
        if (this.f.contains(ikVar)) {
            this.f.remove(ikVar);
        }
    }

    public com.json.jk c() {
        return this.e;
    }

    void c(android.app.Activity activity) {
        int i = this.f2890a + 1;
        this.f2890a = i;
        if (i == 1 && this.d) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.k);
            this.d = false;
            this.e = com.json.jk.STARTED;
        }
    }

    void d(android.app.Activity activity) {
        this.f2890a--;
        b();
    }

    public boolean e() {
        return this.e == com.json.jk.STOPPED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        com.json.lifecycle.a.b(activity);
        com.json.lifecycle.a aVarA = com.json.lifecycle.a.a(activity);
        if (aVarA != null) {
            aVarA.d(this.l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        d(activity);
    }
}
