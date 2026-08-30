package com.bykv.vk.openvk.preload.a.b.a;

/* JADX INFO: compiled from: JsonAdapterAnnotationTypeAdapterFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements com.bykv.vk.openvk.preload.a.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b f1624a;

    public d(com.bykv.vk.openvk.preload.a.b.b bVar) {
        this.f1624a = bVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.r
    public final <T> com.bykv.vk.openvk.preload.a.q<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        com.bykv.vk.openvk.preload.a.a.a aVar2 = (com.bykv.vk.openvk.preload.a.a.a) aVar.a().getAnnotation(com.bykv.vk.openvk.preload.a.a.a.class);
        if (aVar2 == null) {
            return null;
        }
        return (com.bykv.vk.openvk.preload.a.q<T>) a(this.f1624a, dVar, aVar, aVar2);
    }

    static com.bykv.vk.openvk.preload.a.q<?> a(com.bykv.vk.openvk.preload.a.b.b bVar, com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<?> aVar, com.bykv.vk.openvk.preload.a.a.a aVar2) {
        com.bykv.vk.openvk.preload.a.q<?> kVar;
        java.lang.Object objA = bVar.a(com.bykv.vk.openvk.preload.a.c.a.a((java.lang.Class) aVar2.a())).a();
        if (objA instanceof com.bykv.vk.openvk.preload.a.q) {
            kVar = (com.bykv.vk.openvk.preload.a.q) objA;
        } else if (objA instanceof com.bykv.vk.openvk.preload.a.r) {
            kVar = ((com.bykv.vk.openvk.preload.a.r) objA).a(dVar, aVar);
        } else {
            boolean z = objA instanceof com.bykv.vk.openvk.preload.a.n;
            if (z || (objA instanceof com.bykv.vk.openvk.preload.a.g)) {
                kVar = new com.bykv.vk.openvk.preload.a.b.a.k<>(z ? (com.bykv.vk.openvk.preload.a.n) objA : null, objA instanceof com.bykv.vk.openvk.preload.a.g ? (com.bykv.vk.openvk.preload.a.g) objA : null, dVar, aVar);
            } else {
                throw new java.lang.IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        return (kVar == null || !aVar2.b()) ? kVar : kVar.a();
    }
}
