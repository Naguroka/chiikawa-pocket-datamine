package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class sl {
    private static final java.lang.String g = "sl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.lifecycle.b f3412a;
    private final java.lang.Runnable b;
    private final com.json.uu c;
    private java.util.Timer e;
    private final java.lang.Object d = new java.lang.Object();
    private final com.json.ik f = new com.ironsource.sl.a();

    class a implements com.json.ik {
        a() {
        }

        @Override // com.json.ik
        public void a() {
        }

        @Override // com.json.ik
        public void b() {
            com.json.sl.this.c.c(java.lang.System.currentTimeMillis());
            com.json.sl.this.c();
        }

        @Override // com.json.ik
        public void c() {
            com.json.sl.this.c.b(java.lang.System.currentTimeMillis());
            com.json.sl slVar = com.json.sl.this;
            slVar.b(slVar.c.a());
        }

        @Override // com.json.ik
        public void d() {
        }
    }

    class b extends java.util.TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.json.sl.this.f3412a.b(com.json.sl.this.f);
            com.json.sl.this.c.b();
            com.json.sl.this.b.run();
        }
    }

    public sl(java.lang.Runnable runnable, com.json.lifecycle.b bVar, com.json.uu uuVar) {
        this.b = runnable;
        this.f3412a = bVar;
        this.c = uuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        synchronized (this.d) {
            c();
            java.util.Timer timer = new java.util.Timer();
            this.e = timer;
            timer.schedule(new com.ironsource.sl.b(), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.d) {
            java.util.Timer timer = this.e;
            if (timer != null) {
                timer.cancel();
                this.e = null;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void a(long j) {
        if (j < 0) {
            android.util.Log.d(g, "cannot start timer with delay < 0");
            return;
        }
        this.f3412a.a(this.f);
        this.c.a(j);
        if (this.f3412a.e()) {
            this.c.c(java.lang.System.currentTimeMillis());
        } else {
            b(j);
        }
    }

    public void b() {
        c();
        this.f3412a.b(this.f);
        this.c.b();
    }
}
