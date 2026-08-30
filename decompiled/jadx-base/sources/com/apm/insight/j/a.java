package com.apm.insight.j;

/* JADX INFO: compiled from: BaseTask.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.os.Handler f413a;
    private final long b = 0;
    private final long c;

    a(android.os.Handler handler, long j) {
        this.f413a = handler;
        this.c = j;
    }

    final void a() {
        this.f413a.post(this);
    }

    final void a(long j) {
        if (j > 0) {
            this.f413a.postDelayed(this, j);
        } else {
            this.f413a.post(this);
        }
    }

    final long b() {
        return this.c;
    }
}
