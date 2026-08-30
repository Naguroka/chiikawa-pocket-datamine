package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map f2332a = new java.util.HashMap();
    private final android.content.Context b;
    private final com.google.android.play.integrity.internal.s c;
    private final java.lang.String d;
    private boolean h;
    private final android.content.Intent i;
    private final com.google.android.play.integrity.internal.z j;
    private android.content.ServiceConnection n;
    private android.os.IInterface o;
    private final java.util.List e = new java.util.ArrayList();
    private final java.util.Set f = new java.util.HashSet();
    private final java.lang.Object g = new java.lang.Object();
    private final android.os.IBinder.DeathRecipient l = new android.os.IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.u
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.google.android.play.integrity.internal.ae.k(this.f2340a);
        }
    };
    private final java.util.concurrent.atomic.AtomicInteger m = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.lang.ref.WeakReference k = new java.lang.ref.WeakReference(null);

    public ae(android.content.Context context, com.google.android.play.integrity.internal.s sVar, java.lang.String str, android.content.Intent intent, com.google.android.play.integrity.internal.z zVar, com.google.android.play.integrity.internal.y yVar) {
        this.b = context;
        this.c = sVar;
        this.d = str;
        this.i = intent;
        this.j = zVar;
    }

    public static /* synthetic */ void k(com.google.android.play.integrity.internal.ae aeVar) {
        aeVar.c.d("reportBinderDeath", new java.lang.Object[0]);
        com.google.android.play.integrity.internal.y yVar = (com.google.android.play.integrity.internal.y) aeVar.k.get();
        if (yVar != null) {
            aeVar.c.d("calling onBinderDied", new java.lang.Object[0]);
            yVar.a();
        } else {
            aeVar.c.d("%s : Binder has died.", aeVar.d);
            java.util.Iterator it = aeVar.e.iterator();
            while (it.hasNext()) {
                ((com.google.android.play.integrity.internal.t) it.next()).a(aeVar.w());
            }
            aeVar.e.clear();
        }
        synchronized (aeVar.g) {
            aeVar.x();
        }
    }

    static /* bridge */ /* synthetic */ void o(final com.google.android.play.integrity.internal.ae aeVar, final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        aeVar.f.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.play.integrity.internal.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                this.f2341a.u(taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void r(com.google.android.play.integrity.internal.ae aeVar) {
        aeVar.c.d("linkToDeath", new java.lang.Object[0]);
        try {
            aeVar.o.asBinder().linkToDeath(aeVar.l, 0);
        } catch (android.os.RemoteException e) {
            aeVar.c.c(e, "linkToDeath failed", new java.lang.Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void s(com.google.android.play.integrity.internal.ae aeVar) {
        aeVar.c.d("unlinkToDeath", new java.lang.Object[0]);
        aeVar.o.asBinder().unlinkToDeath(aeVar.l, 0);
    }

    private final android.os.RemoteException w() {
        return new android.os.RemoteException(java.lang.String.valueOf(this.d).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        java.util.Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.tasks.TaskCompletionSource) it.next()).trySetException(w());
        }
        this.f.clear();
    }

    public final android.os.Handler c() {
        android.os.Handler handler;
        java.util.Map map = f2332a;
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
        return this.o;
    }

    public final void t(com.google.android.play.integrity.internal.t tVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        c().post(new com.google.android.play.integrity.internal.w(this, tVar.c(), taskCompletionSource, tVar));
    }

    final /* synthetic */ void u(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.tasks.Task task) {
        synchronized (this.g) {
            this.f.remove(taskCompletionSource);
        }
    }

    public final void v(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        synchronized (this.g) {
            this.f.remove(taskCompletionSource);
        }
        c().post(new com.google.android.play.integrity.internal.x(this));
    }

    static /* bridge */ /* synthetic */ void q(com.google.android.play.integrity.internal.ae aeVar, com.google.android.play.integrity.internal.t tVar) {
        if (aeVar.o != null || aeVar.h) {
            if (!aeVar.h) {
                tVar.run();
                return;
            } else {
                aeVar.c.d("Waiting to bind to the service.", new java.lang.Object[0]);
                aeVar.e.add(tVar);
                return;
            }
        }
        aeVar.c.d("Initiate binding to the service.", new java.lang.Object[0]);
        aeVar.e.add(tVar);
        com.google.android.play.integrity.internal.ad adVar = new com.google.android.play.integrity.internal.ad(aeVar, null);
        aeVar.n = adVar;
        aeVar.h = true;
        if (aeVar.b.bindService(aeVar.i, adVar, 1)) {
            return;
        }
        aeVar.c.d("Failed to bind to the service.", new java.lang.Object[0]);
        aeVar.h = false;
        java.util.Iterator it = aeVar.e.iterator();
        while (it.hasNext()) {
            ((com.google.android.play.integrity.internal.t) it.next()).a(new com.google.android.play.integrity.internal.af());
        }
        aeVar.e.clear();
    }
}
