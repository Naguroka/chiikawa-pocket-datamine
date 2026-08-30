package com.bykv.vk.openvk.preload.a.b.a;

/* JADX INFO: compiled from: ArrayTypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a<E> extends com.bykv.vk.openvk.preload.a.q<java.lang.Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.bykv.vk.openvk.preload.a.r f1619a = new com.bykv.vk.openvk.preload.a.r() { // from class: com.bykv.vk.openvk.preload.a.b.a.a.1
        @Override // com.bykv.vk.openvk.preload.a.r
        public final <T> com.bykv.vk.openvk.preload.a.q<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
            java.lang.reflect.Type typeB = aVar.b();
            if (!(typeB instanceof java.lang.reflect.GenericArrayType) && (!(typeB instanceof java.lang.Class) || !((java.lang.Class) typeB).isArray())) {
                return null;
            }
            java.lang.reflect.Type typeD = com.bykv.vk.openvk.preload.a.b.a.d(typeB);
            return new com.bykv.vk.openvk.preload.a.b.a.a(dVar, dVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(typeD)), com.bykv.vk.openvk.preload.a.b.a.b(typeD));
        }
    };
    private final java.lang.Class<E> b;
    private final com.bykv.vk.openvk.preload.a.q<E> c;

    public a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.q<E> qVar, java.lang.Class<E> cls) {
        this.c = new com.bykv.vk.openvk.preload.a.b.a.l(dVar, qVar, cls);
        this.b = cls;
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final java.lang.Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
        if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
            aVar.j();
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        aVar.a();
        while (aVar.e()) {
            arrayList.add(this.c.a(aVar));
        }
        aVar.b();
        int size = arrayList.size();
        java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.b, size);
        for (int i = 0; i < size; i++) {
            java.lang.reflect.Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            cVar.h();
            return;
        }
        cVar.d();
        int length = java.lang.reflect.Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.a(cVar, (E) java.lang.reflect.Array.get(obj, i));
        }
        cVar.e();
    }
}
