package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: JsonArray.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends com.bykv.vk.openvk.preload.a.h implements java.lang.Iterable<com.bykv.vk.openvk.preload.a.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List<com.bykv.vk.openvk.preload.a.h> f1690a = new java.util.ArrayList();

    public final void a(com.bykv.vk.openvk.preload.a.h hVar) {
        if (hVar == null) {
            hVar = com.bykv.vk.openvk.preload.a.j.f1691a;
        }
        this.f1690a.add(hVar);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<com.bykv.vk.openvk.preload.a.h> iterator() {
        return this.f1690a.iterator();
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final java.lang.Number a() {
        if (this.f1690a.size() == 1) {
            return this.f1690a.get(0).a();
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final java.lang.String b() {
        if (this.f1690a.size() == 1) {
            return this.f1690a.get(0).b();
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final double c() {
        if (this.f1690a.size() == 1) {
            return this.f1690a.get(0).c();
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final long d() {
        if (this.f1690a.size() == 1) {
            return this.f1690a.get(0).d();
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final int e() {
        if (this.f1690a.size() == 1) {
            return this.f1690a.get(0).e();
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final boolean f() {
        if (this.f1690a.size() == 1) {
            return this.f1690a.get(0).f();
        }
        throw new java.lang.IllegalStateException();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.bykv.vk.openvk.preload.a.f) && ((com.bykv.vk.openvk.preload.a.f) obj).f1690a.equals(this.f1690a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f1690a.hashCode();
    }
}
