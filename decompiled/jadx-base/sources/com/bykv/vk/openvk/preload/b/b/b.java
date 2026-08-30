package com.bykv.vk.openvk.preload.b.b;

/* JADX INFO: compiled from: EventListenerWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends com.bykv.vk.openvk.preload.b.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.List<com.bykv.vk.openvk.preload.b.b.a> f1697a;

    public b(com.bykv.vk.openvk.preload.b.b.a... aVarArr) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        this.f1697a = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(java.util.Arrays.asList(aVarArr));
    }

    public final void a(com.bykv.vk.openvk.preload.b.b.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f1697a.add(aVar);
    }

    @Override // com.bykv.vk.openvk.preload.b.b.a
    public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar, com.bykv.vk.openvk.preload.b.d dVar) {
        for (com.bykv.vk.openvk.preload.b.b.a aVar : this.f1697a) {
            if (aVar != null) {
                aVar.a(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.b.a
    public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar, com.bykv.vk.openvk.preload.b.d dVar) {
        for (com.bykv.vk.openvk.preload.b.b.a aVar : this.f1697a) {
            if (aVar != null) {
                aVar.b(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.b.a
    public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar, com.bykv.vk.openvk.preload.b.d dVar) {
        for (com.bykv.vk.openvk.preload.b.b.a aVar : this.f1697a) {
            if (aVar != null) {
                aVar.c(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.b.a
    public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
        for (com.bykv.vk.openvk.preload.b.b.a aVar : this.f1697a) {
            if (aVar != null) {
                aVar.a(bVar, dVar, th);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.b.a
    public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
        for (com.bykv.vk.openvk.preload.b.b.a aVar : this.f1697a) {
            if (aVar != null) {
                aVar.c(bVar, dVar, th);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.b.a
    public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
        for (com.bykv.vk.openvk.preload.b.b.a aVar : this.f1697a) {
            if (aVar != null) {
                aVar.b(bVar, dVar, th);
            }
        }
    }
}
