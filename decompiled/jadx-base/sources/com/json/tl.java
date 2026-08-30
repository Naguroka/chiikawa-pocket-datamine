package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class tl implements com.json.ik {
    private java.util.Timer b;
    private long e;
    private java.lang.Runnable f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f3440a = "INTERNAL";
    private boolean c = false;
    private java.lang.Long d = null;

    class a extends java.util.TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.json.tl.this.f.run();
        }
    }

    public tl(long j, java.lang.Runnable runnable, boolean z) {
        this.e = j;
        this.f = runnable;
        if (z) {
            g();
        }
    }

    private synchronized void f() {
        java.util.Timer timer = this.b;
        if (timer != null) {
            timer.cancel();
            this.b = null;
        }
    }

    private synchronized void h() {
        if (this.b == null) {
            java.util.Timer timer = new java.util.Timer();
            this.b = timer;
            timer.schedule(new com.ironsource.tl.a(), this.e);
            java.util.Calendar.getInstance().setTimeInMillis(this.d.longValue());
        }
    }

    @Override // com.json.ik
    public void a() {
    }

    @Override // com.json.ik
    public void b() {
        if (this.b != null) {
            f();
        }
    }

    @Override // com.json.ik
    public void c() {
        java.lang.Long l;
        if (this.b == null && (l = this.d) != null) {
            long jLongValue = l.longValue() - java.lang.System.currentTimeMillis();
            this.e = jLongValue;
            if (jLongValue > 0) {
                h();
            } else {
                e();
                this.f.run();
            }
        }
    }

    @Override // com.json.ik
    public void d() {
    }

    public void e() {
        f();
        this.c = false;
        this.d = null;
        com.json.lifecycle.b.d().b(this);
    }

    public void g() {
        if (this.c) {
            return;
        }
        this.c = true;
        com.json.lifecycle.b.d().a(this);
        this.d = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + this.e);
        if (com.json.lifecycle.b.d().e()) {
            return;
        }
        h();
    }
}
