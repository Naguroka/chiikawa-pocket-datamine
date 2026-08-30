package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.l3 f664a;
    private boolean b;

    public c4() {
        this(com.applovin.impl.l3.f976a);
    }

    public synchronized boolean e() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public synchronized boolean c() {
        boolean z;
        z = this.b;
        this.b = false;
        return z;
    }

    public synchronized void a() {
        while (!this.b) {
            wait();
        }
    }

    public c4(com.applovin.impl.l3 l3Var) {
        this.f664a = l3Var;
    }

    public synchronized void b() {
        boolean z = false;
        while (!this.b) {
            try {
                wait();
            } catch (java.lang.InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean d() {
        return this.b;
    }
}
