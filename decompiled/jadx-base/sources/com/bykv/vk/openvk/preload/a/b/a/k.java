package com.bykv.vk.openvk.preload.a.b.a;

/* JADX INFO: compiled from: TreeTypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k<T> extends com.bykv.vk.openvk.preload.a.q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.n<T> f1634a;
    private final com.bykv.vk.openvk.preload.a.g<T> b;
    private com.bykv.vk.openvk.preload.a.d c;
    private final com.bykv.vk.openvk.preload.a.c.a<T> d;
    private com.bykv.vk.openvk.preload.a.q<T> g;
    private final com.bykv.vk.openvk.preload.a.b.a.k<T>.a f = new com.bykv.vk.openvk.preload.a.b.a.k.a(this, 0);
    private final com.bykv.vk.openvk.preload.a.r e = null;

    public k(com.bykv.vk.openvk.preload.a.n<T> nVar, com.bykv.vk.openvk.preload.a.g<T> gVar, com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        this.f1634a = nVar;
        this.b = gVar;
        this.c = dVar;
        this.d = aVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
        if (this.b == null) {
            return b().a(aVar);
        }
        if (com.bykv.vk.openvk.preload.falconx.a.a.a(aVar) instanceof com.bykv.vk.openvk.preload.a.j) {
            return null;
        }
        return this.b.a();
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws java.io.IOException {
        com.bykv.vk.openvk.preload.a.n<T> nVar = this.f1634a;
        if (nVar == null) {
            b().a(cVar, t);
        } else if (t == null) {
            cVar.h();
        } else {
            com.bykv.vk.openvk.preload.falconx.a.a.a(nVar.a(), cVar);
        }
    }

    private com.bykv.vk.openvk.preload.a.q<T> b() {
        com.bykv.vk.openvk.preload.a.q<T> qVar = this.g;
        if (qVar != null) {
            return qVar;
        }
        com.bykv.vk.openvk.preload.a.q<T> qVarA = this.c.a((com.bykv.vk.openvk.preload.a.r) null, this.d);
        this.g = qVarA;
        return qVarA;
    }

    /* JADX INFO: compiled from: TreeTypeAdapter.java */
    final class a {
        private a() {
        }

        /* synthetic */ a(com.bykv.vk.openvk.preload.a.b.a.k kVar, byte b) {
            this();
        }
    }
}
