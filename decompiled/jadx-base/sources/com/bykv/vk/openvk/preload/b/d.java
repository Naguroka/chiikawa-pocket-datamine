package com.bykv.vk.openvk.preload.b;

/* JADX INFO: compiled from: Interceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d<IN, OUT> {
    private static java.util.concurrent.atomic.AtomicLong d = new java.util.concurrent.atomic.AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.bykv.vk.openvk.preload.b.d f1699a;
    IN b;
    OUT c;
    private com.bykv.vk.openvk.preload.b.b.a e;
    private com.bykv.vk.openvk.preload.b.b f;
    private long g;

    public abstract java.lang.Object a(com.bykv.vk.openvk.preload.b.b<OUT> bVar, IN in) throws java.lang.Throwable;

    protected void a(java.lang.Object... objArr) {
    }

    final void a(com.bykv.vk.openvk.preload.b.b bVar, com.bykv.vk.openvk.preload.b.d dVar, IN in, com.bykv.vk.openvk.preload.b.b.a aVar, java.lang.Object[] objArr) {
        this.f = new com.bykv.vk.openvk.preload.b.c(bVar);
        this.f1699a = dVar;
        this.b = in;
        this.e = aVar;
        if (dVar != null) {
            this.g = dVar.g;
        } else {
            long andIncrement = d.getAndIncrement();
            this.g = andIncrement;
            if (andIncrement < 0) {
                throw new java.lang.RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }

    public final long b() {
        return this.g;
    }

    final void c() {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f, this);
    }

    final void d() {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f, this);
    }

    final void e() {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f, this);
    }

    final void b(java.lang.Throwable th) {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f, this, th);
    }

    final void c(java.lang.Throwable th) {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f, this, th);
    }

    protected final void d(java.lang.Throwable th) {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f, this, th);
    }

    public final OUT f() {
        return this.c;
    }
}
