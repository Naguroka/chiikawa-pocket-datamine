package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class yq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.l5 f3594a;
    private com.json.zq b;
    private java.util.Timer c = null;

    class a extends java.util.TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.json.yq.this.b.b();
        }
    }

    class b extends java.util.TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.json.yq.this.b.b();
        }
    }

    public yq(com.json.l5 l5Var, com.json.zq zqVar) {
        this.f3594a = l5Var;
        this.b = zqVar;
    }

    private void d() {
        java.util.Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
            this.c = null;
        }
    }

    public synchronized void a() {
        d();
        java.util.Timer timer = new java.util.Timer();
        this.c = timer;
        timer.schedule(new com.ironsource.yq.b(), this.f3594a.b());
    }

    public void b() {
        synchronized (this) {
            d();
        }
        this.b.b();
    }

    public synchronized void c() {
        d();
        java.util.Timer timer = new java.util.Timer();
        this.c = timer;
        timer.schedule(new com.ironsource.yq.a(), this.f3594a.j());
    }
}
