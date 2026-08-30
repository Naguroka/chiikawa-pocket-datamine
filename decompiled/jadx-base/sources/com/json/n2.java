package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.l2 f3054a;
    private final com.json.bm b;
    private final com.json.sl c = c();
    private java.util.Timer d;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.n2.this.b.b();
        }
    }

    class b extends java.util.TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.json.n2.this.b.b();
        }
    }

    public n2(com.json.l2 l2Var, com.json.bm bmVar) {
        this.f3054a = l2Var;
        this.b = bmVar;
    }

    private synchronized void b(long j) {
        j();
        java.util.Timer timer = new java.util.Timer();
        this.d = timer;
        timer.schedule(new com.ironsource.n2.b(), j);
    }

    private com.json.sl c() {
        return new com.json.sl(new com.ironsource.n2.a(), com.json.lifecycle.b.d(), new com.json.uu());
    }

    private synchronized void j() {
        java.util.Timer timer = this.d;
        if (timer != null) {
            timer.cancel();
            this.d = null;
        }
    }

    public void a() {
        if (this.f3054a.a() == com.ironsource.l2.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
            i();
        }
    }

    protected void a(long j) {
        com.json.sl slVar = this.c;
        if (slVar != null) {
            slVar.a(j);
        }
    }

    protected com.json.l2 b() {
        return this.f3054a;
    }

    protected boolean d() {
        return this.f3054a.c() > 0;
    }

    public void e() {
        if (this.f3054a.e()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
            b(this.f3054a.c());
        }
    }

    public void f() {
        if (this.f3054a.a() == com.ironsource.l2.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
            b(this.f3054a.d());
        }
    }

    public void g() {
        if (this.f3054a.e()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void h() {
        if (this.f3054a.a() != com.ironsource.l2.a.AUTOMATIC_LOAD_WHILE_SHOW || this.f3054a.d() < 0) {
            return;
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        b(this.f3054a.d());
    }

    protected void i() {
        com.json.sl slVar = this.c;
        if (slVar != null) {
            slVar.b();
        }
    }

    public void k() {
        if (this.f3054a.a() != com.ironsource.l2.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.f3054a.b() <= 0) {
            return;
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        a(this.f3054a.b());
    }
}
