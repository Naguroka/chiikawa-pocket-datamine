package com.iab.omid.library.applovin.internal;

/* JADX INFO: loaded from: classes5.dex */
public class d implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2356a;
    protected boolean b;
    private com.iab.omid.library.applovin.internal.d.a c;

    public interface a {
        void a(boolean z);
    }

    public void a(android.content.Context context) {
        if (context instanceof android.app.Application) {
            ((android.app.Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    android.app.ActivityManager.RunningAppProcessInfo b() {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    protected void b(boolean z) {
    }

    public boolean c() {
        return this.b;
    }

    protected boolean d() {
        return false;
    }

    public void e() {
        this.f2356a = true;
        boolean zA = a();
        this.b = zA;
        b(zA);
    }

    public void f() {
        this.f2356a = false;
        this.c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        a(a());
    }

    public void a(com.iab.omid.library.applovin.internal.d.a aVar) {
        this.c = aVar;
    }

    private void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            if (this.f2356a) {
                b(z);
                com.iab.omid.library.applovin.internal.d.a aVar = this.c;
                if (aVar != null) {
                    aVar.a(z);
                }
            }
        }
    }

    private boolean a() {
        return b().importance == 100 || d();
    }
}
