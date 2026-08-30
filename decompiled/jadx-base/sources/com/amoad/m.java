package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class m implements java.lang.Runnable {
    private java.lang.String c;
    private android.content.Context d;
    private java.lang.ref.SoftReference<com.amoad.ab> f;
    private com.amoad.ab g;
    private com.amoad.s.c h;
    private boolean i;
    private int j;
    private com.amoad.m.a k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ExecutorService f319a = java.util.concurrent.Executors.newSingleThreadExecutor();
    private final java.util.List<java.lang.ref.WeakReference<com.amoad.AMoAdView>> b = new java.util.ArrayList();
    private final com.amoad.h e = new com.amoad.h();
    private android.content.BroadcastReceiver l = new android.content.BroadcastReceiver() { // from class: com.amoad.m.1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(android.content.Context context, android.content.Intent intent) {
            if (!"android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    com.amoad.m.this.i = true;
                }
            } else {
                com.amoad.m.this.i = false;
                if (com.amoad.m.this.d() && com.amoad.m.this.i()) {
                    com.amoad.m.this.a();
                }
            }
        }
    };

    interface a {
        void a(java.lang.String str);
    }

    public m(android.content.Context context, java.lang.String str, int i, com.amoad.m.a aVar) {
        this.d = context;
        this.c = str;
        this.j = i;
        this.k = aVar;
    }

    private synchronized void a(boolean z) {
        java.util.Iterator<java.lang.ref.WeakReference<com.amoad.AMoAdView>> it = this.b.iterator();
        while (it.hasNext()) {
            final com.amoad.AMoAdView aMoAdView = it.next().get();
            if (aMoAdView != null && (aMoAdView.isShown() || z)) {
                final com.amoad.s.c cVar = this.h;
                if (aMoAdView.b != cVar && aMoAdView.f147a != null) {
                    com.amoad.Logger.d("AMoAdView", "onResponse()" + cVar.hashCode());
                    aMoAdView.c.removeCallbacksAndMessages(null);
                    com.amoad.bc.a(aMoAdView.c, new java.lang.Runnable() { // from class: com.amoad.AMoAdView.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (com.amoad.AMoAdView.this.f147a == null) {
                                return;
                            }
                            com.amoad.s.c cVar2 = cVar;
                            if (cVar2 instanceof com.amoad.ab) {
                                if (((com.amoad.ab) cVar2).n) {
                                    com.amoad.AMoAdView.this.f147a.didFailToReceiveAdWithError();
                                    return;
                                } else {
                                    com.amoad.AMoAdView.this.f147a.didReceiveAd();
                                    return;
                                }
                            }
                            if (cVar2 instanceof com.amoad.s.a) {
                                com.amoad.AMoAdView.this.f147a.didReceiveEmptyAd();
                            } else if (cVar2 instanceof com.amoad.s.b) {
                                com.amoad.AMoAdView.this.f147a.didFailToReceiveAdWithError();
                            }
                        }
                    });
                }
                com.amoad.ab abVar = this.g;
                if (abVar != null) {
                    aMoAdView.a(abVar, !z);
                }
            }
        }
    }

    private synchronized void b() {
        com.amoad.bc.c(this);
    }

    private void c() {
        this.d.unregisterReceiver(this.l);
    }

    private synchronized boolean c(com.amoad.AMoAdView aMoAdView) {
        java.util.Iterator<java.lang.ref.WeakReference<com.amoad.AMoAdView>> it = this.b.iterator();
        while (it.hasNext()) {
            if (aMoAdView.equals(it.next().get())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean d() {
        java.util.Iterator<java.lang.ref.WeakReference<com.amoad.AMoAdView>> it = this.b.iterator();
        while (it.hasNext()) {
            com.amoad.AMoAdView aMoAdView = it.next().get();
            if (aMoAdView != null && aMoAdView.isShown()) {
                return true;
            }
        }
        return false;
    }

    private synchronized boolean e() {
        java.util.Iterator<java.lang.ref.WeakReference<com.amoad.AMoAdView>> it = this.b.iterator();
        while (it.hasNext()) {
            com.amoad.AMoAdView aMoAdView = it.next().get();
            if (aMoAdView != null && aMoAdView.a()) {
                return true;
            }
        }
        return false;
    }

    private synchronized void f() {
        java.util.Iterator<java.lang.ref.WeakReference<com.amoad.AMoAdView>> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
    }

    private void g() {
        boolean z = true;
        while (true) {
            android.content.Context context = this.d;
            java.lang.String str = this.e.f309a;
            com.amoad.c cVarB = com.amoad.p.b(context);
            com.amoad.aa aaVar = new com.amoad.aa(context, this.c, cVarB.b, cVarB.f299a, cVarB.c, str);
            aaVar.f340a = this.j;
            aaVar.b = this.j;
            java.lang.String strA = aaVar.a();
            com.amoad.AMoAdLogger.getInstance().i(java.text.MessageFormat.format("request ad sending(url={0})", strA));
            com.amoad.s.c cVarA = com.amoad.s.a(aaVar);
            long j = 10000;
            if (cVarA instanceof com.amoad.ab) {
                com.amoad.AMoAdLogger.getInstance().i(java.text.MessageFormat.format("request ad sending...success(url={0})", strA));
                com.amoad.ab abVar = (com.amoad.ab) cVarA;
                long j2 = abVar.f * 1000;
                if (j2 == 0 || abVar.f == 99999) {
                    j = 0;
                } else if (j2 >= 0) {
                    j = 4000;
                    if (4000 <= j2) {
                        j = 300000;
                        if (300000 >= j2) {
                            j = j2;
                        }
                    }
                }
                this.e.f309a = abVar.e;
                if (!abVar.n) {
                    this.g = abVar;
                }
            } else {
                com.amoad.AMoAdLogger.getInstance().i(java.text.MessageFormat.format("request ad sending...failure(url={0})", strA));
            }
            this.h = cVarA;
            a(z);
            if (j <= 0 || !e()) {
                return;
            }
            this.f = new java.lang.ref.SoftReference<>(this.g);
            h();
            if (!d() || this.i) {
                b();
            }
            com.amoad.bc.a(j);
            f();
            this.g = null;
            this.h = null;
            z = false;
        }
    }

    private synchronized void h() {
        while (!i()) {
            com.amoad.Logger.d("AdLoader", "wait until playback complete...");
            com.amoad.bc.b((java.lang.Object) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        com.amoad.ab abVar = this.g;
        return abVar == null || abVar.t;
    }

    public final synchronized void a() {
        com.amoad.bc.a((java.lang.Object) this);
    }

    public final synchronized void a(final com.amoad.AMoAdView aMoAdView) {
        final com.amoad.ab abVar;
        if (!c(aMoAdView)) {
            this.b.add(0, new java.lang.ref.WeakReference<>(aMoAdView));
        }
        java.lang.ref.SoftReference<com.amoad.ab> softReference = this.f;
        if (softReference != null && (abVar = softReference.get()) != null && !this.f319a.isShutdown()) {
            com.amoad.bc.a(this.f319a, new java.lang.Runnable() { // from class: com.amoad.m.2
                @Override // java.lang.Runnable
                public final void run() {
                    aMoAdView.a(abVar, false);
                }
            });
        }
    }

    public final synchronized void b(com.amoad.AMoAdView aMoAdView) {
        java.util.Iterator<java.lang.ref.WeakReference<com.amoad.AMoAdView>> it = this.b.iterator();
        while (it.hasNext()) {
            if (aMoAdView.equals(it.next().get())) {
                it.remove();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        this.d.registerReceiver(this.l, intentFilter);
        try {
            g();
            synchronized (this) {
                this.f319a.shutdown();
            }
            c();
            com.amoad.m.a aVar = this.k;
            if (aVar != null) {
                aVar.a(this.c);
            }
        } catch (java.lang.Throwable th) {
            try {
                com.amoad.Logger.e("AdLoader", th);
            } finally {
                synchronized (this) {
                    this.f319a.shutdown();
                    c();
                    com.amoad.m.a aVar2 = this.k;
                    if (aVar2 != null) {
                        aVar2.a(this.c);
                    }
                }
            }
        }
    }
}
