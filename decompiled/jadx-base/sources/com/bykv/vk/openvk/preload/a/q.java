package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: TypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q<T> {
    public abstract T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException;

    public abstract void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws java.io.IOException;

    public final com.bykv.vk.openvk.preload.a.q<T> a() {
        return new com.bykv.vk.openvk.preload.a.q<T>() { // from class: com.bykv.vk.openvk.preload.a.q.1
            @Override // com.bykv.vk.openvk.preload.a.q
            public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws java.io.IOException {
                if (t == null) {
                    cVar.h();
                } else {
                    com.bykv.vk.openvk.preload.a.q.this.a(cVar, t);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.q
            public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.j();
                    return null;
                }
                return (T) com.bykv.vk.openvk.preload.a.q.this.a(aVar);
            }
        };
    }
}
