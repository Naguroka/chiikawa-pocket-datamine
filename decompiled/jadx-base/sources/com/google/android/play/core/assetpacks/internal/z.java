package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map f2257a = new java.util.HashMap();
    private final android.content.Context b;
    private final com.google.android.play.core.assetpacks.internal.o c;
    private final java.lang.String d;
    private boolean h;
    private final android.content.Intent i;
    private android.content.ServiceConnection m;
    private android.os.IInterface n;
    private final com.google.android.play.core.assetpacks.z o;
    private final java.util.List e = new java.util.ArrayList();
    private final java.util.Set f = new java.util.HashSet();
    private final java.lang.Object g = new java.lang.Object();
    private final android.os.IBinder.DeathRecipient k = new android.os.IBinder.DeathRecipient() { // from class: com.google.android.play.core.assetpacks.internal.r
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.google.android.play.core.assetpacks.internal.z.j(this.f2251a);
        }
    };
    private final java.util.concurrent.atomic.AtomicInteger l = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.lang.ref.WeakReference j = new java.lang.ref.WeakReference(null);

    public z(android.content.Context context, com.google.android.play.core.assetpacks.internal.o oVar, java.lang.String str, android.content.Intent intent, com.google.android.play.core.assetpacks.z zVar, com.google.android.play.core.assetpacks.internal.u uVar) {
        this.b = context;
        this.c = oVar;
        this.d = str;
        this.i = intent;
        this.o = zVar;
    }

    public static /* synthetic */ void j(com.google.android.play.core.assetpacks.internal.z zVar) {
        zVar.c.d("reportBinderDeath", new java.lang.Object[0]);
        com.google.android.play.core.assetpacks.internal.u uVar = (com.google.android.play.core.assetpacks.internal.u) zVar.j.get();
        if (uVar != null) {
            zVar.c.d("calling onBinderDied", new java.lang.Object[0]);
            uVar.a();
        } else {
            zVar.c.d("%s : Binder has died.", zVar.d);
            java.util.Iterator it = zVar.e.iterator();
            while (it.hasNext()) {
                ((com.google.android.play.core.assetpacks.internal.p) it.next()).c(zVar.v());
            }
            zVar.e.clear();
        }
        synchronized (zVar.g) {
            zVar.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(final com.google.android.play.core.assetpacks.internal.z zVar, final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        zVar.f.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.play.core.assetpacks.internal.q
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                this.f2250a.t(taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void q(com.google.android.play.core.assetpacks.internal.z zVar) {
        zVar.c.d("linkToDeath", new java.lang.Object[0]);
        try {
            zVar.n.asBinder().linkToDeath(zVar.k, 0);
        } catch (android.os.RemoteException e) {
            zVar.c.c(e, "linkToDeath failed", new java.lang.Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(com.google.android.play.core.assetpacks.internal.z zVar) {
        zVar.c.d("unlinkToDeath", new java.lang.Object[0]);
        zVar.n.asBinder().unlinkToDeath(zVar.k, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        java.util.Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.tasks.TaskCompletionSource) it.next()).trySetException(v());
        }
        this.f.clear();
    }

    public final android.os.Handler c() {
        android.os.Handler handler;
        java.util.Map map = f2257a;
        synchronized (map) {
            if (!map.containsKey(this.d)) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread(this.d, 10);
                handlerThread.start();
                map.put(this.d, new android.os.Handler(handlerThread.getLooper()));
            }
            handler = (android.os.Handler) map.get(this.d);
        }
        return handler;
    }

    public final android.os.IInterface e() {
        return this.n;
    }

    public final void s(com.google.android.play.core.assetpacks.internal.p pVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        c().post(new com.google.android.play.core.assetpacks.internal.s(this, pVar.b(), taskCompletionSource, pVar));
    }

    final /* synthetic */ void t(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.tasks.Task task) {
        synchronized (this.g) {
            this.f.remove(taskCompletionSource);
        }
    }

    public final void u(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        synchronized (this.g) {
            this.f.remove(taskCompletionSource);
        }
        c().post(new com.google.android.play.core.assetpacks.internal.t(this));
    }

    private final android.os.RemoteException v() {
        return new android.os.RemoteException(java.lang.String.valueOf(this.d).concat(" : Binder has died."));
    }

    static /* bridge */ /* synthetic */ void p(com.google.android.play.core.assetpacks.internal.z zVar, com.google.android.play.core.assetpacks.internal.p pVar) {
        if (zVar.n != null || zVar.h) {
            if (!zVar.h) {
                pVar.run();
                return;
            } else {
                zVar.c.d("Waiting to bind to the service.", new java.lang.Object[0]);
                zVar.e.add(pVar);
                return;
            }
        }
        zVar.c.d("Initiate binding to the service.", new java.lang.Object[0]);
        zVar.e.add(pVar);
        com.google.android.play.core.assetpacks.internal.y yVar = new com.google.android.play.core.assetpacks.internal.y(zVar, null);
        zVar.m = yVar;
        zVar.h = true;
        if (zVar.b.bindService(zVar.i, yVar, 1)) {
            return;
        }
        zVar.c.d("Failed to bind to the service.", new java.lang.Object[0]);
        zVar.h = false;
        java.util.Iterator it = zVar.e.iterator();
        while (it.hasNext()) {
            ((com.google.android.play.core.assetpacks.internal.p) it.next()).c(new com.google.android.play.core.assetpacks.internal.aa());
        }
        zVar.e.clear();
    }
}
