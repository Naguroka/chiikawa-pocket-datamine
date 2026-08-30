package com.bykv.vk.openvk.preload.b;

/* JADX INFO: compiled from: Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c<IN> implements com.bykv.vk.openvk.preload.b.b<IN> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.b.b<IN> f1698a;

    static <IN> com.bykv.vk.openvk.preload.b.b<IN> a(java.util.List<com.bykv.vk.openvk.preload.b.h> list, com.bykv.vk.openvk.preload.b.e eVar, com.bykv.vk.openvk.preload.b.d dVar) {
        if (list == null) {
            throw new java.lang.IllegalArgumentException("interceptors == null !");
        }
        if (eVar == null) {
            eVar = new com.bykv.vk.openvk.preload.b.e.a();
        }
        return new com.bykv.vk.openvk.preload.b.i(java.util.Collections.unmodifiableList(new java.util.ArrayList(list)), 0, eVar, dVar);
    }

    public static <IN> com.bykv.vk.openvk.preload.b.b<IN> a(java.util.List<com.bykv.vk.openvk.preload.b.h> list) {
        return a(list, null, null);
    }

    public c(com.bykv.vk.openvk.preload.b.b<IN> bVar) {
        this.f1698a = bVar;
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final java.lang.Object a(IN in) throws java.lang.Exception {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final <I> I a(java.lang.Class<? extends com.bykv.vk.openvk.preload.b.d<I, ?>> cls) {
        return (I) this.f1698a.a((java.lang.Class) cls);
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final <O> O b(java.lang.Class<? extends com.bykv.vk.openvk.preload.b.d<?, O>> cls) {
        return (O) this.f1698a.b(cls);
    }
}
