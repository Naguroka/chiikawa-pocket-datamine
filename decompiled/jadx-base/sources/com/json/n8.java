package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.ironsource.n8.a f3072a = com.ironsource.n8.a.NOT_READY;
    private java.util.ArrayList b = new java.util.ArrayList();
    private java.lang.String c;

    enum a {
        NOT_READY,
        READY
    }

    public n8(java.lang.String str) {
        this.c = str;
    }

    public synchronized void a() {
        java.lang.Object[] array = this.b.toArray();
        for (int i = 0; i < array.length; i++) {
            ((java.lang.Runnable) array[i]).run();
            array[i] = null;
        }
        this.b.clear();
    }

    public synchronized void a(java.lang.Runnable runnable) {
        if (this.f3072a != com.ironsource.n8.a.READY) {
            this.b.add(runnable);
        } else {
            runnable.run();
        }
    }

    public synchronized void b() {
        this.f3072a = com.ironsource.n8.a.NOT_READY;
    }

    public synchronized void c() {
        this.f3072a = com.ironsource.n8.a.READY;
    }
}
