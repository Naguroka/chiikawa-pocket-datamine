package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.google.android.play.core.assetpacks.internal.o f2247a;
    private final android.content.IntentFilter c;
    private final android.content.Context d;
    protected final java.util.Set b = new java.util.HashSet();
    private com.google.android.play.core.assetpacks.internal.m e = null;
    private volatile boolean f = false;

    protected n(com.google.android.play.core.assetpacks.internal.o oVar, android.content.IntentFilter intentFilter, android.content.Context context) {
        this.f2247a = oVar;
        this.c = intentFilter;
        this.d = com.google.android.play.core.assetpacks.internal.ag.a(context);
    }

    private final void a() {
        com.google.android.play.core.assetpacks.internal.m mVar;
        if ((this.f || !this.b.isEmpty()) && this.e == null) {
            this.e = new com.google.android.play.core.assetpacks.internal.m(this, null);
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                this.d.registerReceiver(this.e, this.c, 2);
            } else {
                this.d.registerReceiver(this.e, this.c);
            }
        }
        if (this.f || !this.b.isEmpty() || (mVar = this.e) == null) {
            return;
        }
        this.d.unregisterReceiver(mVar);
        this.e = null;
    }

    protected abstract void c(android.content.Context context, android.content.Intent intent);

    public final synchronized void e() {
        this.f2247a.d("clearListeners", new java.lang.Object[0]);
        this.b.clear();
        a();
    }

    public final synchronized void f(com.google.android.play.core.listener.StateUpdatedListener stateUpdatedListener) {
        this.f2247a.d("registerListener", new java.lang.Object[0]);
        com.google.android.play.core.assetpacks.internal.aj.a(stateUpdatedListener, "Registered Play Core listener should not be null.");
        this.b.add(stateUpdatedListener);
        a();
    }

    public final synchronized void g(boolean z) {
        this.f = z;
        a();
    }

    public final synchronized void h(com.google.android.play.core.listener.StateUpdatedListener stateUpdatedListener) {
        this.f2247a.d("unregisterListener", new java.lang.Object[0]);
        com.google.android.play.core.assetpacks.internal.aj.a(stateUpdatedListener, "Unregistered Play Core listener should not be null.");
        this.b.remove(stateUpdatedListener);
        a();
    }

    public final synchronized void i(java.lang.Object obj) {
        java.util.Iterator it = new java.util.HashSet(this.b).iterator();
        while (it.hasNext()) {
            ((com.google.android.play.core.listener.StateUpdatedListener) it.next()).onStateUpdate(obj);
        }
    }

    public final synchronized boolean j() {
        return this.e != null;
    }
}
