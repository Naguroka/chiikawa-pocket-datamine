package com.bykv.vk.openvk.preload.a.b.a;

/* JADX INFO: compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
final class l<T> extends com.bykv.vk.openvk.preload.a.q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.d f1636a;
    private final com.bykv.vk.openvk.preload.a.q<T> b;
    private final java.lang.reflect.Type c;

    l(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.q<T> qVar, java.lang.reflect.Type type) {
        this.f1636a = dVar;
        this.b = qVar;
        this.c = type;
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
        return this.b.a(aVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws java.io.IOException {
        com.bykv.vk.openvk.preload.a.q<T> qVarA = this.b;
        java.lang.reflect.Type type = this.c;
        if (t != null && (type == java.lang.Object.class || (type instanceof java.lang.reflect.TypeVariable) || (type instanceof java.lang.Class))) {
            type = t.getClass();
        }
        if (type != this.c) {
            qVarA = this.f1636a.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type));
            if (qVarA instanceof com.bykv.vk.openvk.preload.a.b.a.h.a) {
                com.bykv.vk.openvk.preload.a.q<T> qVar = this.b;
                if (!(qVar instanceof com.bykv.vk.openvk.preload.a.b.a.h.a)) {
                    qVarA = qVar;
                }
            }
        }
        qVarA.a(cVar, t);
    }
}
