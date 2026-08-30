package com.bykv.vk.openvk.preload.a.b.a;

/* JADX INFO: compiled from: MapTypeAdapterFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements com.bykv.vk.openvk.preload.a.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b f1625a;
    private boolean b = false;

    public f(com.bykv.vk.openvk.preload.a.b.b bVar) {
        this.f1625a = bVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.r
    public final <T> com.bykv.vk.openvk.preload.a.q<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        com.bykv.vk.openvk.preload.a.q<java.lang.Boolean> qVarA;
        java.lang.reflect.Type typeB = aVar.b();
        if (!java.util.Map.class.isAssignableFrom(aVar.a())) {
            return null;
        }
        java.lang.reflect.Type[] typeArrB = com.bykv.vk.openvk.preload.a.b.a.b(typeB, com.bykv.vk.openvk.preload.a.b.a.b(typeB));
        java.lang.reflect.Type type = typeArrB[0];
        if (type == java.lang.Boolean.TYPE || type == java.lang.Boolean.class) {
            qVarA = com.bykv.vk.openvk.preload.a.b.a.m.c;
        } else {
            qVarA = dVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type));
        }
        com.bykv.vk.openvk.preload.a.q<T> qVarA2 = dVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(typeArrB[1]));
        com.bykv.vk.openvk.preload.a.b.h<T> hVarA = this.f1625a.a(aVar);
        return new com.bykv.vk.openvk.preload.a.b.a.f.a(dVar, typeArrB[0], qVarA, typeArrB[1], qVarA2, hVarA);
    }

    /* JADX INFO: compiled from: MapTypeAdapterFactory.java */
    final class a<K, V> extends com.bykv.vk.openvk.preload.a.q<java.util.Map<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bykv.vk.openvk.preload.a.q<K> f1626a;
        private final com.bykv.vk.openvk.preload.a.q<V> b;
        private final com.bykv.vk.openvk.preload.a.b.h<? extends java.util.Map<K, V>> c;

        @Override // com.bykv.vk.openvk.preload.a.q
        public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, java.lang.Object obj) throws java.io.IOException {
            java.util.Map map = (java.util.Map) obj;
            if (map == null) {
                cVar.h();
                return;
            }
            cVar.f();
            for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                cVar.a(java.lang.String.valueOf(entry.getKey()));
                this.b.a(cVar, entry.getValue());
            }
            cVar.g();
        }

        public a(com.bykv.vk.openvk.preload.a.d dVar, java.lang.reflect.Type type, com.bykv.vk.openvk.preload.a.q<K> qVar, java.lang.reflect.Type type2, com.bykv.vk.openvk.preload.a.q<V> qVar2, com.bykv.vk.openvk.preload.a.b.h<? extends java.util.Map<K, V>> hVar) {
            this.f1626a = new com.bykv.vk.openvk.preload.a.b.a.l(dVar, qVar, type);
            this.b = new com.bykv.vk.openvk.preload.a.b.a.l(dVar, qVar2, type2);
            this.c = hVar;
        }

        @Override // com.bykv.vk.openvk.preload.a.q
        public final /* synthetic */ java.lang.Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
            com.bykv.vk.openvk.preload.a.d.b bVarF = aVar.f();
            if (bVarF == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.j();
                return null;
            }
            java.util.Map<K, V> mapA = this.c.a();
            if (bVarF == com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.e()) {
                    aVar.a();
                    K kA = this.f1626a.a(aVar);
                    if (mapA.put(kA, this.b.a(aVar)) != null) {
                        throw new com.bykv.vk.openvk.preload.a.o("duplicate key: ".concat(java.lang.String.valueOf(kA)));
                    }
                    aVar.b();
                }
                aVar.b();
            } else {
                aVar.c();
                while (aVar.e()) {
                    com.bykv.vk.openvk.preload.a.b.e.f1667a.a(aVar);
                    K kA2 = this.f1626a.a(aVar);
                    if (mapA.put(kA2, this.b.a(aVar)) != null) {
                        throw new com.bykv.vk.openvk.preload.a.o("duplicate key: ".concat(java.lang.String.valueOf(kA2)));
                    }
                }
                aVar.d();
            }
            return mapA;
        }
    }
}
