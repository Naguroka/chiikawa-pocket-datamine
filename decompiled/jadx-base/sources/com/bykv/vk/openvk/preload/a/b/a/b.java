package com.bykv.vk.openvk.preload.a.b.a;

/* JADX INFO: compiled from: CollectionTypeAdapterFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements com.bykv.vk.openvk.preload.a.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b f1621a;

    public b(com.bykv.vk.openvk.preload.a.b.b bVar) {
        this.f1621a = bVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.r
    public final <T> com.bykv.vk.openvk.preload.a.q<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        java.lang.reflect.Type typeB = aVar.b();
        java.lang.Class<? super T> clsA = aVar.a();
        if (!java.util.Collection.class.isAssignableFrom(clsA)) {
            return null;
        }
        java.lang.reflect.Type typeA = com.bykv.vk.openvk.preload.a.b.a.a(typeB, (java.lang.Class<?>) clsA);
        return new com.bykv.vk.openvk.preload.a.b.a.b.a(dVar, typeA, dVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(typeA)), this.f1621a.a(aVar));
    }

    /* JADX INFO: compiled from: CollectionTypeAdapterFactory.java */
    static final class a<E> extends com.bykv.vk.openvk.preload.a.q<java.util.Collection<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bykv.vk.openvk.preload.a.q<E> f1622a;
        private final com.bykv.vk.openvk.preload.a.b.h<? extends java.util.Collection<E>> b;

        @Override // com.bykv.vk.openvk.preload.a.q
        public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, java.lang.Object obj) throws java.io.IOException {
            java.util.Collection collection = (java.util.Collection) obj;
            if (collection == null) {
                cVar.h();
                return;
            }
            cVar.d();
            java.util.Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f1622a.a(cVar, it.next());
            }
            cVar.e();
        }

        public a(com.bykv.vk.openvk.preload.a.d dVar, java.lang.reflect.Type type, com.bykv.vk.openvk.preload.a.q<E> qVar, com.bykv.vk.openvk.preload.a.b.h<? extends java.util.Collection<E>> hVar) {
            this.f1622a = new com.bykv.vk.openvk.preload.a.b.a.l(dVar, qVar, type);
            this.b = hVar;
        }

        @Override // com.bykv.vk.openvk.preload.a.q
        public final /* synthetic */ java.lang.Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
            if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.j();
                return null;
            }
            java.util.Collection<E> collectionA = this.b.a();
            aVar.a();
            while (aVar.e()) {
                collectionA.add(this.f1622a.a(aVar));
            }
            aVar.b();
            return collectionA;
        }
    }
}
