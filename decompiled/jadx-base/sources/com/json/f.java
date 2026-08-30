package com.json;

/* JADX INFO: loaded from: classes5.dex */
public abstract class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Object f2637a = new java.lang.Object();
    private java.util.Timer b;
    protected long c;
    protected T d;

    class a extends java.util.TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.json.f.this.b();
        }
    }

    public f() {
    }

    public f(long j) {
        this.c = j;
    }

    protected void a(T t) {
        if (a() || t == null) {
            return;
        }
        this.d = t;
        c();
        synchronized (this.f2637a) {
            java.util.Timer timer = new java.util.Timer();
            this.b = timer;
            timer.schedule(new com.ironsource.f.a(), this.c);
        }
    }

    protected boolean a() {
        return this.c <= 0;
    }

    protected abstract void b();

    protected void c() {
        synchronized (this.f2637a) {
            java.util.Timer timer = this.b;
            if (timer != null) {
                timer.cancel();
                this.b = null;
            }
        }
    }

    public void d() {
        this.d = null;
    }
}
